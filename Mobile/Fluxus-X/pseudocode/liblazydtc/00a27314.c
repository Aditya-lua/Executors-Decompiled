/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a27314
 */

undefined8 ossl_ec_key_otherparams_fromdata(EC_KEY *param_1,undefined8 param_2)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  undefined8 uVar5;
  long local_28;
  
  if (param_1 == (EC_KEY *)0x0) {
    return 0;
  }
  lVar4 = OSSL_PARAM_locate_const(param_2,"use-cofactor-flag");
  if (lVar4 != 0) {
    iVar2 = OSSL_PARAM_get_int(lVar4,&local_28);
    if (iVar2 == 0) {
      return 0;
    }
    uVar1 = (point_conversion_form_t)local_28;
    EC_KEY_get0_group(param_1);
    if (1 < uVar1) {
      return 0;
    }
    lVar4 = EC_GROUP_get0_cofactor();
    if (lVar4 == 0) {
      return 0;
    }
    iVar2 = BN_is_one();
    if (iVar2 == 0) {
      if (uVar1 == 0) {
        EC_KEY_clear_flags(param_1,0x1000);
      }
      else if (uVar1 == 1) {
        EC_KEY_set_flags(param_1,0x1000);
      }
    }
  }
  lVar4 = OSSL_PARAM_locate_const(param_2,"include-public");
  if (lVar4 != 0) {
    local_28 = CONCAT44(local_28._4_4_,1);
    uVar5 = OSSL_PARAM_get_int(lVar4,&local_28);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
    iVar2 = (point_conversion_form_t)local_28;
    uVar3 = EC_KEY_get_enc_flags(param_1);
    uVar1 = uVar3 | 2;
    if (iVar2 != 0) {
      uVar1 = uVar3 & 0xfffffffd;
    }
    EC_KEY_set_enc_flags(param_1,uVar1);
  }
  local_28 = CONCAT44(local_28._4_4_,0xffffffff);
  lVar4 = OSSL_PARAM_locate_const(param_2,"point-format");
  if (lVar4 != 0) {
    iVar2 = ossl_ec_pt_format_param2id(lVar4,&local_28);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_backend.c",0x20e,"ec_key_point_format_fromdata");
      ERR_set_error(0x10,0x68,0);
      return 0;
    }
    EC_KEY_set_conv_form(param_1,(point_conversion_form_t)local_28);
  }
  lVar4 = OSSL_PARAM_locate_const(param_2,"group-check");
  if (lVar4 == 0) {
    return 1;
  }
  local_28 = 0;
  if (*(int *)(lVar4 + 8) == 6) {
    iVar2 = OSSL_PARAM_get_utf8_ptr(lVar4,&local_28);
    if (iVar2 == 0) {
      return 0;
    }
  }
  else {
    if (*(int *)(lVar4 + 8) != 4) {
      return 0;
    }
    local_28 = *(long *)(lVar4 + 0x10);
    if (local_28 == 0) {
      return 0;
    }
  }
  lVar4 = local_28;
  iVar2 = 0;
  if (local_28 != 0) {
    iVar2 = OPENSSL_strcasecmp(local_28,"default");
    if (iVar2 == 0) {
      lVar4 = 0;
    }
    else {
      iVar2 = OPENSSL_strcasecmp(lVar4,"named");
      if (iVar2 == 0) {
        lVar4 = 1;
      }
      else {
        iVar2 = OPENSSL_strcasecmp(lVar4,"named-nist");
        if (iVar2 != 0) {
          return 0;
        }
        lVar4 = 2;
      }
    }
    iVar2 = (&DAT_00c5b3d8)[lVar4 * 4];
  }
  EC_KEY_clear_flags(param_1,0x6000);
  EC_KEY_set_flags(param_1,iVar2);
  return 1;
}

