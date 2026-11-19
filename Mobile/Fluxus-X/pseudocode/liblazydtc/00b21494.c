/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b21494
 */

undefined8 FUN_00b21494(undefined8 *param_1,long param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  char *__s1;
  undefined8 local_180;
  ulong local_178;
  undefined1 *local_170;
  undefined1 auStack_164 [256];
  undefined1 auStack_64 [52];
  
  memset(auStack_164,0,0x100);
  local_170 = (undefined1 *)0x0;
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  if (param_2 == 0) {
    return 1;
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,"digest");
  if (lVar3 != 0) {
    local_170 = auStack_64;
    uVar4 = OSSL_PARAM_get_utf8_string(lVar3,&local_170,0x32);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"digest-props");
    if (lVar3 != 0) {
      local_170 = auStack_164;
      uVar4 = OSSL_PARAM_get_utf8_string(lVar3,&local_170,0x100);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    EVP_MD_free(param_1[3]);
    lVar3 = EVP_MD_fetch(*param_1,auStack_64,auStack_164);
    param_1[3] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,"pad-mode");
  if (lVar3 == 0) goto LAB_00b21660;
  local_178 = local_178 & 0xffffffff00000000;
  if (*(int *)(lVar3 + 8) == 4) {
    __s1 = *(char **)(lVar3 + 0x10);
    if (__s1 == (char *)0x0) {
      return 0;
    }
    iVar1 = strcmp(__s1,"pkcs1");
    if (iVar1 == 0) {
      iVar1 = 1;
LAB_00b21618:
      local_178 = CONCAT44(local_178._4_4_,iVar1);
      goto joined_r0x00b21620;
    }
    iVar1 = strcmp(__s1,"none");
    if (iVar1 == 0) {
      iVar1 = 3;
      goto LAB_00b21618;
    }
    iVar1 = strcmp(__s1,"oaep");
    if ((iVar1 == 0) || (iVar1 = strcmp(__s1,"oeap"), iVar1 == 0)) {
      iVar1 = 4;
      goto LAB_00b21618;
    }
    iVar2 = strcmp(__s1,"x931");
    iVar1 = 0;
    if (iVar2 == 0) {
      iVar1 = 5;
      goto LAB_00b21618;
    }
  }
  else {
    if (*(int *)(lVar3 + 8) != 1) {
      return 0;
    }
    iVar1 = OSSL_PARAM_get_int(lVar3,&local_178);
    if (iVar1 == 0) {
      return 0;
    }
    iVar1 = (int)local_178;
joined_r0x00b21620:
    if (iVar1 == 6) {
      return 0;
    }
    if (iVar1 == 4) {
      if (param_1[3] == 0) {
        lVar3 = EVP_MD_fetch(*param_1,&DAT_002d142e,auStack_164);
        param_1[3] = lVar3;
        if (lVar3 == 0) {
          return 0;
        }
        iVar1 = (int)local_178;
      }
      else {
        iVar1 = 4;
      }
    }
  }
  *(int *)(param_1 + 2) = iVar1;
LAB_00b21660:
  lVar3 = OSSL_PARAM_locate_const(param_2,"mgf1-digest");
  if (lVar3 != 0) {
    local_170 = auStack_64;
    uVar4 = OSSL_PARAM_get_utf8_string(lVar3,&local_170,0x32);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"mgf1-properties");
    if (lVar3 == 0) {
      local_170 = (undefined1 *)0x0;
    }
    else {
      local_170 = auStack_164;
      uVar4 = OSSL_PARAM_get_utf8_string(lVar3,&local_170,0x100);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    EVP_MD_free(param_1[4]);
    lVar3 = EVP_MD_fetch(*param_1,auStack_64,local_170);
    param_1[4] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,"oaep-label");
  if (lVar3 != 0) {
    local_178 = 0;
    uVar4 = OSSL_PARAM_get_octet_string(lVar3,&local_178,0,&local_180);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    CRYPTO_free((void *)param_1[5]);
    param_1[5] = local_178;
    param_1[6] = local_180;
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,"tls-client-version");
  if (lVar3 != 0) {
    uVar4 = OSSL_PARAM_get_uint(lVar3,&local_178);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    *(int *)(param_1 + 7) = (int)local_178;
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,"tls-negotiated-version");
  if (lVar3 != 0) {
    uVar4 = OSSL_PARAM_get_uint(lVar3,&local_178);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    *(int *)((long)param_1 + 0x3c) = (int)local_178;
  }
  return 1;
}

