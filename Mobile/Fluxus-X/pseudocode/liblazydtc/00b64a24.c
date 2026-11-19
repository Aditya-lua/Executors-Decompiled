/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64a24
 */

ulong ossl_DER_w_RSASSA_PSS_params(undefined8 param_1,undefined4 param_2,long param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  undefined *puVar7;
  undefined1 *puVar8;
  undefined8 uVar9;
  
  if (param_3 == 0) {
    return 0;
  }
  iVar1 = ossl_rsa_pss_params_30_is_unrestricted(param_3);
  if (iVar1 != 0) {
    return 0;
  }
  iVar1 = ossl_rsa_pss_params_30_hashalg(param_3);
  iVar2 = ossl_rsa_pss_params_30_saltlen(param_3);
  iVar3 = ossl_rsa_pss_params_30_trailerfield(param_3);
  if (iVar2 < 0) {
    ERR_new();
    ERR_set_debug("providers/common/der/der_rsa_key.c",0x135,"ossl_DER_w_RSASSA_PSS_params");
    uVar9 = 0x96;
LAB_00b64b34:
    ERR_set_error(4,uVar9,0);
    return 0;
  }
  if (iVar3 != 1) {
    ERR_new();
    ERR_set_debug("providers/common/der/der_rsa_key.c",0x139,"ossl_DER_w_RSASSA_PSS_params");
    uVar9 = 0x8b;
    goto LAB_00b64b34;
  }
  iVar3 = ossl_rsa_pss_params_30_hashalg(0);
  iVar4 = ossl_rsa_pss_params_30_saltlen(0);
  iVar5 = ossl_rsa_pss_params_30_trailerfield(0);
  if (0x445 < iVar1) {
    if (iVar1 == 0x446) {
      puVar8 = ossl_der_aid_sha512_224Identifier;
    }
    else {
      if (iVar1 != 0x447) {
        return 0;
      }
      puVar8 = ossl_der_aid_sha512_256Identifier;
    }
    goto LAB_00b64bc4;
  }
  switch(iVar1) {
  case 0x2a0:
    puVar8 = ossl_der_aid_sha256Identifier;
    break;
  case 0x2a1:
    puVar8 = ossl_der_aid_sha384Identifier;
    break;
  case 0x2a2:
    puVar8 = ossl_der_aid_sha512Identifier;
    break;
  case 0x2a3:
    puVar8 = ossl_der_aid_sha224Identifier;
    break;
  default:
    if (iVar1 != 0x40) {
      return 0;
    }
    puVar8 = ossl_der_aid_sha1Identifier;
    uVar9 = 0xb;
    goto LAB_00b64bc8;
  }
LAB_00b64bc4:
  uVar9 = 0xf;
LAB_00b64bc8:
  uVar6 = ossl_DER_w_begin_sequence(param_1,param_2);
  if ((int)uVar6 == 0) {
    return uVar6;
  }
  if ((iVar5 != 1) && (uVar6 = ossl_DER_w_uint32(param_1,3,1), (int)uVar6 == 0)) {
    return uVar6;
  }
  if ((iVar2 != iVar4) && (uVar6 = ossl_DER_w_uint32(param_1,2,iVar2), (int)uVar6 == 0)) {
    return uVar6;
  }
  iVar2 = ossl_rsa_pss_params_30_maskgenalg(param_3);
  if (iVar2 != 0x38f) {
    return 0;
  }
  iVar2 = ossl_rsa_pss_params_30_maskgenhashalg(param_3);
  if (0x445 < iVar2) {
    if (iVar2 == 0x446) {
      puVar7 = &DAT_0077c755;
    }
    else {
      if (iVar2 != 0x447) {
        return 0;
      }
      puVar7 = &DAT_0077c771;
    }
    goto switchD_00b64c58_caseD_2a3;
  }
  puVar7 = &DAT_0077c6e5;
  switch(iVar2) {
  case 0x2a0:
    puVar7 = &DAT_0077c701;
    break;
  case 0x2a1:
    puVar7 = &DAT_0077c71d;
    break;
  case 0x2a2:
    puVar7 = &DAT_0077c739;
    break;
  case 0x2a3:
    break;
  default:
    if (iVar2 != 0x40) {
      return 0;
    }
    goto LAB_00b64ccc;
  }
switchD_00b64c58_caseD_2a3:
  uVar6 = ossl_DER_w_precompiled(param_1,1,puVar7,0x1c);
  if ((int)uVar6 != 0) {
LAB_00b64ccc:
    if ((iVar1 == iVar3) ||
       (uVar6 = ossl_DER_w_precompiled(param_1,0,puVar8,uVar9), (int)uVar6 != 0)) {
      iVar1 = ossl_DER_w_end_sequence(param_1,param_2);
      uVar6 = (ulong)(iVar1 != 0);
    }
  }
  return uVar6;
}

