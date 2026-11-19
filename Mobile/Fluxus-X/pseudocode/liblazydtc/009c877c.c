/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c877c
 */

undefined4
SSL_set_srp_server_param
          (long param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4,BIGNUM *param_5,
          char *param_6)

{
  BIGNUM *pBVar1;
  char *pcVar2;
  undefined4 uVar3;
  
  if (param_2 != (BIGNUM *)0x0) {
    if (*(BIGNUM **)(param_1 + 0xbf8) == (BIGNUM *)0x0) {
      pBVar1 = BN_dup(param_2);
      *(BIGNUM **)(param_1 + 0xbf8) = pBVar1;
    }
    else {
      pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0xbf8),param_2);
      if (pBVar1 == (BIGNUM *)0x0) {
        BN_free(*(BIGNUM **)(param_1 + 0xbf8));
        *(undefined8 *)(param_1 + 0xbf8) = 0;
      }
    }
  }
  if (param_3 != (BIGNUM *)0x0) {
    if (*(BIGNUM **)(param_1 + 0xc00) == (BIGNUM *)0x0) {
      pBVar1 = BN_dup(param_3);
      *(BIGNUM **)(param_1 + 0xc00) = pBVar1;
    }
    else {
      pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0xc00),param_3);
      if (pBVar1 == (BIGNUM *)0x0) {
        BN_free(*(BIGNUM **)(param_1 + 0xc00));
        *(undefined8 *)(param_1 + 0xc00) = 0;
      }
    }
  }
  if (param_4 != (BIGNUM *)0x0) {
    if (*(BIGNUM **)(param_1 + 0xc08) == (BIGNUM *)0x0) {
      pBVar1 = BN_dup(param_4);
      *(BIGNUM **)(param_1 + 0xc08) = pBVar1;
    }
    else {
      pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0xc08),param_4);
      if (pBVar1 == (BIGNUM *)0x0) {
        BN_free(*(BIGNUM **)(param_1 + 0xc08));
        *(undefined8 *)(param_1 + 0xc08) = 0;
      }
    }
  }
  if (param_5 != (BIGNUM *)0x0) {
    if (*(BIGNUM **)(param_1 + 0xc30) == (BIGNUM *)0x0) {
      pBVar1 = BN_dup(param_5);
      *(BIGNUM **)(param_1 + 0xc30) = pBVar1;
    }
    else {
      pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0xc30),param_5);
      if (pBVar1 == (BIGNUM *)0x0) {
        BN_free(*(BIGNUM **)(param_1 + 0xc30));
        *(undefined8 *)(param_1 + 0xc30) = 0;
      }
    }
  }
  if (param_6 != (char *)0x0) {
    if (*(void **)(param_1 + 0xc38) != (void *)0x0) {
      CRYPTO_free(*(void **)(param_1 + 0xc38));
    }
    pcVar2 = CRYPTO_strdup(param_6,"ssl/tls_srp.c",0x122);
    *(char **)(param_1 + 0xc38) = pcVar2;
    if (pcVar2 == (char *)0x0) {
      return 0xffffffff;
    }
  }
  if (((*(long *)(param_1 + 0xbf8) == 0) || (*(long *)(param_1 + 0xc00) == 0)) ||
     (*(long *)(param_1 + 0xc08) == 0)) {
    return 0xffffffff;
  }
  uVar3 = 1;
  if (*(long *)(param_1 + 0xc30) == 0) {
    uVar3 = 0xffffffff;
  }
  return uVar3;
}

