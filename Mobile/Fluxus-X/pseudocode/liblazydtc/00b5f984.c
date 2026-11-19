/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5f984
 */

undefined8 FUN_00b5f984(long param_1,long param_2)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  char *pcVar8;
  char *pcVar9;
  undefined1 *local_2d8;
  undefined1 auStack_2d0 [256];
  undefined8 *local_1d0;
  undefined8 local_1c8;
  undefined8 uStack_1c0;
  undefined8 local_1b8;
  undefined8 uStack_1b0;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined2 local_198;
  undefined1 *local_190;
  undefined1 auStack_188 [256];
  undefined8 *local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined2 local_50;
  uint local_48;
  int local_44;
  
  local_50 = 0;
  uStack_68 = 0;
  local_70 = 0;
  uStack_58 = 0;
  uStack_60 = 0;
  uStack_78 = 0;
  local_80 = 0;
  local_88 = (undefined8 *)0x0;
  memset(auStack_188,0,0x100);
  uStack_1a0 = 0;
  local_1a8 = 0;
  uStack_1b0 = 0;
  local_1b8 = 0;
  local_190 = (undefined1 *)0x0;
  local_198 = 0;
  uStack_1c0 = 0;
  local_1c8 = 0;
  local_1d0 = (undefined8 *)0x0;
  memset(auStack_2d0,0,0x100);
  local_2d8 = (undefined1 *)0x0;
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == 0) {
    return 1;
  }
  local_44 = *(int *)(param_1 + 0x68);
  local_48 = *(uint *)(param_1 + 0xb0);
  lVar5 = OSSL_PARAM_locate_const(param_2,"digest");
  if (lVar5 != 0) {
    lVar6 = OSSL_PARAM_locate_const(param_2,"properties");
    local_88 = &local_80;
    uVar7 = OSSL_PARAM_get_utf8_string(lVar5,&local_88,0x32);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
    if (lVar6 != 0) {
      local_190 = auStack_188;
      uVar7 = OSSL_PARAM_get_utf8_string(lVar6,&local_190,0x100);
      if ((int)uVar7 == 0) {
        return uVar7;
      }
    }
  }
  lVar5 = OSSL_PARAM_locate_const(param_2,"pad-mode");
  if (lVar5 == 0) goto LAB_00b5fc08;
  if (*(int *)(lVar5 + 8) == 4) {
    pcVar8 = *(char **)(lVar5 + 0x10);
    if (pcVar8 == (char *)0x0) {
      return 0;
    }
    iVar2 = strcmp(pcVar8,"pkcs1");
    if (iVar2 == 0) {
      local_44 = 1;
    }
    else {
      iVar2 = strcmp(pcVar8,"none");
      if (iVar2 == 0) {
        local_44 = 3;
      }
      else {
        iVar2 = strcmp(pcVar8,"x931");
        if (iVar2 == 0) {
          local_44 = 5;
        }
        else {
          iVar2 = strcmp(pcVar8,"pss");
          if (iVar2 == 0) {
            local_44 = 6;
          }
        }
      }
    }
  }
  else {
    if (*(int *)(lVar5 + 8) != 1) {
      return 0;
    }
    uVar7 = OSSL_PARAM_get_int(lVar5,&local_44);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
  }
  pcVar9 = "OAEP padding not allowed for signing / verifying";
  pcVar8 = "PKCS#1 padding not allowed with RSA-PSS";
  switch(local_44) {
  case 1:
    break;
  default:
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x4df,"rsa_set_ctx_params");
    uVar7 = 0xa5;
    goto LAB_00b5fec4;
  case 3:
    pcVar8 = "No padding not allowed with RSA-PSS";
    break;
  case 4:
    goto switchD_00b5fb7c_caseD_4;
  case 5:
    pcVar8 = "X.931 padding not allowed with RSA-PSS";
    break;
  case 6:
    if ((*(byte *)(param_1 + 0x18) & 0x30) != 0) goto LAB_00b5fc08;
    pcVar9 = "PSS padding only allowed for sign and verify operations";
    goto switchD_00b5fb7c_caseD_4;
  }
  pcVar9 = pcVar8;
  iVar2 = RSA_test_flags(*(undefined8 *)(param_1 + 0x10),0xf000);
  if (iVar2 != 0) {
switchD_00b5fb7c_caseD_4:
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x4e1,"rsa_set_ctx_params");
    uVar7 = 0xa5;
    goto LAB_00b5fec8;
  }
LAB_00b5fc08:
  lVar5 = OSSL_PARAM_locate_const(param_2,"saltlen");
  if (lVar5 == 0) {
LAB_00b5fe2c:
    lVar5 = OSSL_PARAM_locate_const(param_2,"mgf1-digest");
    if (lVar5 == 0) {
LAB_00b5fed8:
      *(int *)(param_1 + 0x68) = local_44;
      *(uint *)(param_1 + 0xb0) = local_48;
      if (((local_44 == 6) && (*(long *)(param_1 + 0x20) == 0)) && (local_88 == (undefined8 *)0x0))
      {
        local_88 = (undefined8 *)&DAT_002d142e;
      }
      if ((local_1d0 != (undefined8 *)0x0) &&
         (uVar7 = FUN_00b602e8(param_1,local_1d0,local_2d8), (int)uVar7 == 0)) {
        return uVar7;
      }
      if (local_88 == (undefined8 *)0x0) {
        uVar7 = FUN_00b60684(param_1,0,0,*(undefined4 *)(param_1 + 0x30));
        iVar2 = (int)uVar7;
      }
      else {
        uVar7 = FUN_00b60444(param_1,local_88,local_190);
        iVar2 = (int)uVar7;
      }
      if (iVar2 == 0) {
        return uVar7;
      }
      return 1;
    }
    lVar6 = OSSL_PARAM_locate_const(param_2,"mgf1-properties");
    local_1d0 = &local_1c8;
    uVar7 = OSSL_PARAM_get_utf8_string(lVar5,&local_1d0,0x32);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
    if (lVar6 != 0) {
      local_2d8 = auStack_2d0;
      uVar7 = OSSL_PARAM_get_utf8_string(lVar6,&local_2d8,0x100);
      if ((int)uVar7 == 0) {
        return uVar7;
      }
    }
    if (local_44 == 6) goto LAB_00b5fed8;
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x541,"rsa_set_ctx_params");
    uVar7 = 0xa7;
  }
  else {
    if (local_44 != 6) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x4eb,"rsa_set_ctx_params");
      pcVar9 = "PSS saltlen can only be specified if PSS padding has been specified first";
      uVar7 = 0x88;
      goto LAB_00b5fec8;
    }
    if (*(int *)(lVar5 + 8) == 4) {
      pcVar8 = *(char **)(lVar5 + 0x10);
      iVar2 = strcmp(pcVar8,"digest");
      if (iVar2 == 0) {
        local_48 = 0xffffffff;
      }
      else {
        iVar2 = strcmp(pcVar8,"max");
        if (iVar2 == 0) {
          local_48 = 0xfffffffd;
        }
        else {
          iVar2 = strcmp(pcVar8,"auto");
          if (iVar2 != 0) {
            local_48 = atoi(pcVar8);
            goto joined_r0x00b5fce4;
          }
          local_48 = 0xfffffffe;
        }
      }
LAB_00b5fd34:
      iVar2 = *(int *)(param_1 + 0xb4);
      if (iVar2 != -1) {
        if (local_48 == 0xffffffff) {
          iVar3 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
          if (iVar3 < iVar2) {
            ERR_new();
            ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x519,"rsa_set_ctx_params"
                         );
            uVar1 = *(undefined4 *)(param_1 + 0xb4);
            uVar4 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
            pcVar8 = "Should be more than %d, but would be set to match digest size (%d)";
LAB_00b5fe20:
            ERR_set_error(0x39,0xac,pcVar8,uVar1,uVar4);
            return 0;
          }
        }
        else if (local_48 == 0xfffffffe) {
          if (*(int *)(param_1 + 0x18) == 0x20) {
            ERR_new();
            ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x512,"rsa_set_ctx_params"
                         );
            pcVar9 = "Cannot use autodetected salt length";
            uVar7 = 0x70;
            goto LAB_00b5fec8;
          }
        }
        else if ((-1 < (int)local_48) && ((int)local_48 < iVar2)) {
          ERR_new();
          ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x524,"rsa_set_ctx_params");
          uVar1 = *(undefined4 *)(param_1 + 0xb4);
          pcVar8 = "Should be more than %d, but would be set to %d";
          uVar4 = local_48;
          goto LAB_00b5fe20;
        }
      }
      goto LAB_00b5fe2c;
    }
    if (*(int *)(lVar5 + 8) != 1) {
      return 0;
    }
    uVar7 = OSSL_PARAM_get_int(lVar5,&local_48);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
joined_r0x00b5fce4:
    if (-4 < (int)local_48) goto LAB_00b5fd34;
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x50a,"rsa_set_ctx_params");
    uVar7 = 0x70;
  }
LAB_00b5fec4:
  pcVar9 = (char *)0x0;
LAB_00b5fec8:
  ERR_set_error(0x39,uVar7,pcVar9);
  return 0;
}

