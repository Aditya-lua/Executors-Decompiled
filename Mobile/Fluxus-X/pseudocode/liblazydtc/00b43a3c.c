/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b43a3c
 */

undefined8 FUN_00b43a3c(undefined8 *param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  uint uVar4;
  undefined8 local_e0;
  undefined8 local_d8 [10];
  byte *local_88;
  byte local_80 [80];
  
  memset(local_80,0,0x50);
  local_88 = (byte *)0x0;
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  if (param_2 != 0) {
    lVar2 = OSSL_PARAM_locate_const(param_2,"ecdh-cofactor-mode");
    if (lVar2 != 0) {
      iVar1 = OSSL_PARAM_get_int(lVar2,local_d8);
      if (iVar1 == 0) {
        return 0;
      }
      if (2 < (int)local_d8[0] + 1U) {
        return 0;
      }
      *(int *)(param_1 + 3) = (int)local_d8[0];
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"kdf-type");
    if (lVar2 != 0) {
      local_88 = local_80;
      uVar3 = OSSL_PARAM_get_utf8_string(lVar2,&local_88,0x50);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      uVar4 = (uint)local_80[0];
      if (local_80[0] != 0) {
        iVar1 = strcmp((char *)local_80,"X963KDF");
        if (iVar1 != 0) {
          return 0;
        }
        uVar4 = 1;
      }
      *(uint *)((long)param_1 + 0x1c) = uVar4;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"kdf-digest");
    if (lVar2 != 0) {
      memset(local_d8,0,0x50);
      local_88 = local_80;
      uVar3 = OSSL_PARAM_get_utf8_string(lVar2,&local_88,0x50);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      local_88 = (byte *)local_d8;
      lVar2 = OSSL_PARAM_locate_const(param_2,"kdf-digest-props");
      if ((lVar2 != 0) &&
         (uVar3 = OSSL_PARAM_get_utf8_string(lVar2,&local_88,0x50), (int)uVar3 == 0)) {
        return uVar3;
      }
      EVP_MD_free(param_1[4]);
      uVar3 = EVP_MD_fetch(*param_1,local_80,local_d8);
      param_1[4] = uVar3;
      iVar1 = ossl_digest_is_allowed(*param_1,uVar3);
      if (iVar1 == 0) {
        EVP_MD_free(param_1[4]);
        param_1[4] = 0;
        return 0;
      }
      if (param_1[4] == 0) {
        return 0;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"kdf-outlen");
    if (lVar2 != 0) {
      uVar3 = OSSL_PARAM_get_size_t(lVar2,local_d8);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      param_1[7] = local_d8[0];
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"kdf-ukm");
    if (lVar2 != 0) {
      local_d8[0] = 0;
      uVar3 = OSSL_PARAM_get_octet_string(lVar2,local_d8,0,&local_e0);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      CRYPTO_free((void *)param_1[5]);
      param_1[5] = local_d8[0];
      param_1[6] = local_e0;
    }
  }
  return 1;
}

