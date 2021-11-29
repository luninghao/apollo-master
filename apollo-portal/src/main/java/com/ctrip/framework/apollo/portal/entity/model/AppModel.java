/*
 * Copyright 2021 Apollo Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.ctrip.framework.apollo.portal.entity.model;


import com.ctrip.framework.apollo.common.utils.InputValidator;
import java.util.Set;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 负责接受来自Portal界面的复杂请求对象。例如，AppModel 一方面带有创建 App 对象需要的属性，另外也带有需要授权管理员的编号集合 admins ，即存在跨模块的情况。
 */
public class AppModel {

  @NotBlank(message = "name cannot be blank")
  private String name;

  @NotBlank(message = "appId cannot be blank")
  @Pattern(
      regexp = InputValidator.CLUSTER_NAMESPACE_VALIDATOR,
      message = "Invalid AppId format: " + InputValidator.INVALID_CLUSTER_NAMESPACE_MESSAGE
  )
  private String appId;

  @NotBlank(message = "orgId cannot be blank")
  private String orgId;

  @NotBlank(message = "orgName cannot be blank")
  private String orgName;

  @NotBlank(message = "ownerName cannot be blank")
  private String ownerName;

  private Set<String> admins;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public Set<String> getAdmins() {
    return admins;
  }

  public void setAdmins(Set<String> admins) {
    this.admins = admins;
  }
}
