/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b203c8
 */

ulong ossl_prov_cipher_load_from_params(long *param_1,long param_2,undefined8 param_3)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  EVP_CIPHER *pEVar4;
  undefined8 local_28;
  
  if (param_2 == 0) {
    return 1;
  }
  uVar1 = FUN_00b2049c(param_2,&local_28,param_1 + 2);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"cipher");
  if (lVar2 == 0) {
    return 1;
  }
  if (*(int *)(lVar2 + 8) != 4) {
    return 0;
  }
  EVP_CIPHER_free(param_1[1]);
  ERR_set_mark();
  lVar3 = EVP_CIPHER_fetch(param_3,*(undefined8 *)(lVar2 + 0x10),local_28);
  *param_1 = lVar3;
  param_1[1] = lVar3;
  if (lVar3 == 0) {
    pEVar4 = EVP_get_cipherbyname(*(char **)(lVar2 + 0x10));
    if ((pEVar4 == (EVP_CIPHER *)0x0) || (*(int *)&pEVar4->init == 1)) {
      if (*param_1 == 0) {
        ERR_clear_last_mark();
        goto LAB_00b2048c;
      }
    }
    else {
      *param_1 = (long)pEVar4;
    }
  }
  ERR_pop_to_mark();
LAB_00b2048c:
  return (ulong)(*param_1 != 0);
}

