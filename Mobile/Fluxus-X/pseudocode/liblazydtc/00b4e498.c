/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e498
 */

undefined8 FUN_00b4e498(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  BIGNUM *pBVar4;
  undefined8 uVar5;
  long *plVar6;
  
  lVar2 = OSSL_PARAM_locate_const(param_2,"use-cofactor-flag");
  if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_get_int(lVar2,param_1 + 0x7c), iVar1 != 0)) {
    lVar2 = OSSL_PARAM_locate_const(param_2,"group");
    if (lVar2 != 0) {
      uVar5 = 0;
      if (*(int *)(lVar2 + 8) != 4) goto LAB_00b4e894;
      CRYPTO_free(*(void **)(param_1 + 8));
      pcVar3 = CRYPTO_strdup(*(char **)(lVar2 + 0x10),"providers/implementations/keymgmt/ec_kmgmt.c"
                             ,0x455);
      *(char **)(param_1 + 8) = pcVar3;
      if (pcVar3 == (char *)0x0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"field-type");
    if (lVar2 != 0) {
      uVar5 = 0;
      if (*(int *)(lVar2 + 8) != 4) goto LAB_00b4e894;
      CRYPTO_free(*(void **)(param_1 + 0x28));
      pcVar3 = CRYPTO_strdup(*(char **)(lVar2 + 0x10),"providers/implementations/keymgmt/ec_kmgmt.c"
                             ,0x456);
      *(char **)(param_1 + 0x28) = pcVar3;
      if (pcVar3 == (char *)0x0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"encoding");
    if (lVar2 != 0) {
      uVar5 = 0;
      if (*(int *)(lVar2 + 8) != 4) goto LAB_00b4e894;
      CRYPTO_free(*(void **)(param_1 + 0x10));
      pcVar3 = CRYPTO_strdup(*(char **)(lVar2 + 0x10),"providers/implementations/keymgmt/ec_kmgmt.c"
                             ,0x457);
      *(char **)(param_1 + 0x10) = pcVar3;
      if (pcVar3 == (char *)0x0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"point-format");
    if (lVar2 != 0) {
      uVar5 = 0;
      if (*(int *)(lVar2 + 8) != 4) goto LAB_00b4e894;
      CRYPTO_free(*(void **)(param_1 + 0x18));
      pcVar3 = CRYPTO_strdup(*(char **)(lVar2 + 0x10),"providers/implementations/keymgmt/ec_kmgmt.c"
                             ,0x458);
      *(char **)(param_1 + 0x18) = pcVar3;
      if (pcVar3 == (char *)0x0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"group-check");
    if (lVar2 != 0) {
      uVar5 = 0;
      if (*(int *)(lVar2 + 8) != 4) goto LAB_00b4e894;
      CRYPTO_free(*(void **)(param_1 + 0x20));
      pcVar3 = CRYPTO_strdup(*(char **)(lVar2 + 0x10),"providers/implementations/keymgmt/ec_kmgmt.c"
                             ,0x459);
      *(char **)(param_1 + 0x20) = pcVar3;
      if (pcVar3 == (char *)0x0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002a38e7);
    if (lVar2 != 0) {
      plVar6 = (long *)(param_1 + 0x30);
      if (*plVar6 == 0) {
        pBVar4 = BN_new();
        *plVar6 = (long)pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00b4e890;
      }
      iVar1 = OSSL_PARAM_get_BN(lVar2,plVar6);
      if (iVar1 == 0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002a374f);
    if (lVar2 != 0) {
      plVar6 = (long *)(param_1 + 0x38);
      if (*plVar6 == 0) {
        pBVar4 = BN_new();
        *plVar6 = (long)pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00b4e890;
      }
      iVar1 = OSSL_PARAM_get_BN(lVar2,plVar6);
      if (iVar1 == 0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002adabd);
    if (lVar2 != 0) {
      plVar6 = (long *)(param_1 + 0x40);
      if (*plVar6 == 0) {
        pBVar4 = BN_new();
        *plVar6 = (long)pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00b4e890;
      }
      iVar1 = OSSL_PARAM_get_BN(lVar2,plVar6);
      if (iVar1 == 0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"order");
    if (lVar2 != 0) {
      plVar6 = (long *)(param_1 + 0x48);
      if (*plVar6 == 0) {
        pBVar4 = BN_new();
        *plVar6 = (long)pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00b4e890;
      }
      iVar1 = OSSL_PARAM_get_BN(lVar2,plVar6);
      if (iVar1 == 0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"cofactor");
    if (lVar2 != 0) {
      plVar6 = (long *)(param_1 + 0x50);
      if (*plVar6 == 0) {
        pBVar4 = BN_new();
        *plVar6 = (long)pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00b4e890;
      }
      iVar1 = OSSL_PARAM_get_BN(lVar2,plVar6);
      if (iVar1 == 0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002bb864);
    if (lVar2 != 0) {
      uVar5 = 0;
      if (*(int *)(lVar2 + 8) != 5) goto LAB_00b4e894;
      CRYPTO_free(*(void **)(param_1 + 0x60));
      uVar5 = *(undefined8 *)(lVar2 + 0x18);
      *(undefined8 *)(param_1 + 0x70) = uVar5;
      lVar2 = CRYPTO_memdup(*(undefined8 *)(lVar2 + 0x10),uVar5,
                            "providers/implementations/keymgmt/ec_kmgmt.c",0x461);
      *(long *)(param_1 + 0x60) = lVar2;
      if (lVar2 == 0) goto LAB_00b4e890;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"generator");
    if (lVar2 != 0) {
      uVar5 = 0;
      if (*(int *)(lVar2 + 8) != 5) goto LAB_00b4e894;
      CRYPTO_free(*(void **)(param_1 + 0x58));
      uVar5 = *(undefined8 *)(lVar2 + 0x18);
      *(undefined8 *)(param_1 + 0x68) = uVar5;
      lVar2 = CRYPTO_memdup(*(undefined8 *)(lVar2 + 0x10),uVar5,
                            "providers/implementations/keymgmt/ec_kmgmt.c",0x463);
      *(long *)(param_1 + 0x58) = lVar2;
      if (lVar2 == 0) goto LAB_00b4e890;
    }
    uVar5 = 1;
  }
  else {
LAB_00b4e890:
    uVar5 = 0;
  }
LAB_00b4e894:
  EC_GROUP_free((EC_GROUP *)0x0);
  return uVar5;
}

