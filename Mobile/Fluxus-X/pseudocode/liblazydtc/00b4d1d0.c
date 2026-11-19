/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4d1d0
 */

undefined8 FUN_00b4d1d0(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  char *pcVar4;
  undefined8 uVar5;
  long *plVar6;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 != 0) {
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002cecd9);
    if (lVar2 != 0) {
      if (*(int *)(lVar2 + 8) != 4) {
LAB_00b4d25c:
        ERR_new();
        ERR_set_debug("providers/implementations/keymgmt/dsa_kmgmt.c",0x1dc,"dsa_gen_set_params");
        ERR_set_error(0x39,0x80106,0);
        return 0;
      }
      uVar5 = *(undefined8 *)(lVar2 + 0x10);
      iVar1 = OPENSSL_strcasecmp("default",uVar5);
      if (iVar1 == 0) {
        lVar2 = 0;
      }
      else {
        iVar1 = OPENSSL_strcasecmp("fips186_4",uVar5);
        if (iVar1 == 0) {
          lVar2 = 1;
        }
        else {
          iVar1 = OPENSSL_strcasecmp("fips186_2",uVar5);
          if (iVar1 != 0) {
            *(undefined4 *)(param_1 + 0x3c) = 0xffffffff;
            goto LAB_00b4d25c;
          }
          lVar2 = 2;
        }
      }
      *(undefined4 *)(param_1 + 0x3c) = (&DAT_00c9e900)[lVar2 * 4];
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"gindex");
    if ((lVar2 != 0) && (uVar5 = OSSL_PARAM_get_int(lVar2,param_1 + 0x38), (int)uVar5 == 0)) {
      return uVar5;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"pcounter");
    if ((lVar2 != 0) && (uVar5 = OSSL_PARAM_get_int(lVar2,param_1 + 0x40), (int)uVar5 == 0)) {
      return uVar5;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"hindex");
    if ((lVar2 != 0) && (uVar5 = OSSL_PARAM_get_int(lVar2,param_1 + 0x44), (int)uVar5 == 0)) {
      return uVar5;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002bb864);
    if (lVar2 != 0) {
      if (*(int *)(lVar2 + 8) != 5) {
        return 0;
      }
      lVar3 = *(long *)(lVar2 + 0x10);
      lVar2 = *(long *)(lVar2 + 0x18);
      plVar6 = (long *)(param_1 + 0x28);
      CRYPTO_clear_free(*plVar6,*(undefined8 *)(param_1 + 0x30),
                        "providers/implementations/keymgmt/dsa_kmgmt.c",0x1c1);
      *plVar6 = 0;
      *(undefined8 *)(param_1 + 0x30) = 0;
      if ((lVar3 != 0) && (lVar2 != 0)) {
        lVar3 = CRYPTO_memdup(lVar3,lVar2,"providers/implementations/keymgmt/dsa_kmgmt.c",0x1c5);
        *plVar6 = lVar3;
        if (lVar3 == 0) {
          return 0;
        }
        *(long *)(param_1 + 0x30) = lVar2;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"pbits");
    if ((lVar2 != 0) && (uVar5 = OSSL_PARAM_get_size_t(lVar2,param_1 + 0x18), (int)uVar5 == 0)) {
      return uVar5;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"qbits");
    if ((lVar2 != 0) && (uVar5 = OSSL_PARAM_get_size_t(lVar2,param_1 + 0x20), (int)uVar5 == 0)) {
      return uVar5;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"digest");
    if (lVar2 != 0) {
      if (*(int *)(lVar2 + 8) != 4) {
        return 0;
      }
      CRYPTO_free(*(void **)(param_1 + 0x48));
      pcVar4 = CRYPTO_strdup(*(char **)(lVar2 + 0x10),
                             "providers/implementations/keymgmt/dsa_kmgmt.c",0x1fc);
      *(char **)(param_1 + 0x48) = pcVar4;
      if (pcVar4 == (char *)0x0) {
        return 0;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"properties");
    if (lVar2 != 0) {
      if (*(int *)(lVar2 + 8) != 4) {
        return 0;
      }
      CRYPTO_free(*(void **)(param_1 + 0x50));
      pcVar4 = CRYPTO_strdup(*(char **)(lVar2 + 0x10),
                             "providers/implementations/keymgmt/dsa_kmgmt.c",0x205);
      *(char **)(param_1 + 0x50) = pcVar4;
      if (pcVar4 == (char *)0x0) {
        return 0;
      }
    }
  }
  return 1;
}

