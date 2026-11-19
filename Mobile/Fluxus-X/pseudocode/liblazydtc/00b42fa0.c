/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b42fa0
 */

undefined8 FUN_00b42fa0(undefined8 *param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  char *pcVar4;
  uint uVar5;
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
    lVar2 = OSSL_PARAM_locate_const(param_2,"kdf-type");
    if (lVar2 != 0) {
      local_88 = local_80;
      uVar3 = OSSL_PARAM_get_utf8_string(lVar2,&local_88,0x50);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      uVar5 = (uint)local_80[0];
      if (local_80[0] != 0) {
        iVar1 = strcmp((char *)local_80,"X942KDF-ASN1");
        if (iVar1 != 0) {
          return 0;
        }
        uVar5 = 1;
      }
      *(uint *)((long)param_1 + 0x1c) = uVar5;
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
      CRYPTO_free((void *)param_1[5]);
      param_1[5] = 0;
      param_1[6] = 0;
      if ((*(long *)(lVar2 + 0x10) != 0) && (*(long *)(lVar2 + 0x18) != 0)) {
        uVar3 = OSSL_PARAM_get_octet_string(lVar2,local_d8,0,&local_e0);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        param_1[5] = local_d8[0];
        param_1[6] = local_e0;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002d7e5c);
    if (lVar2 != 0) {
      uVar3 = OSSL_PARAM_get_uint(lVar2,local_d8);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      *(byte *)(param_1 + 3) = *(byte *)(param_1 + 3) & 0xfe | (int)local_d8[0] != 0;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"cekalg");
    if (lVar2 != 0) {
      local_88 = local_80;
      CRYPTO_free((void *)param_1[8]);
      param_1[8] = 0;
      if ((*(long *)(lVar2 + 0x10) != 0) && (*(long *)(lVar2 + 0x18) != 0)) {
        uVar3 = OSSL_PARAM_get_utf8_string(lVar2,&local_88,0x50);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        pcVar4 = CRYPTO_strdup((char *)local_80,"providers/implementations/exchange/dh_exch.c",0x194
                              );
        param_1[8] = pcVar4;
        if (pcVar4 == (char *)0x0) {
          return 0;
        }
      }
    }
  }
  return 1;
}

