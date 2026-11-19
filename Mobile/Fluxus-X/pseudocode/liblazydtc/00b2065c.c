/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2065c
 */

ulong ossl_prov_digest_load_from_params(long *param_1,long param_2,undefined8 param_3)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  EVP_MD *pEVar4;
  undefined8 uVar5;
  undefined8 local_38;
  
  if (param_2 == 0) {
    return 1;
  }
  uVar1 = FUN_00b2049c(param_2,&local_38,param_1 + 2);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"digest");
  if (lVar2 == 0) {
    return 1;
  }
  if (*(int *)(lVar2 + 8) != 4) {
    return 0;
  }
  ERR_set_mark();
  uVar5 = *(undefined8 *)(lVar2 + 0x10);
  EVP_MD_free(param_1[1]);
  lVar3 = EVP_MD_fetch(param_3,uVar5,local_38);
  *param_1 = lVar3;
  param_1[1] = lVar3;
  if (lVar3 == 0) {
    pEVar4 = EVP_get_digestbyname(*(char **)(lVar2 + 0x10));
    if ((pEVar4 == (EVP_MD *)0x0) || (*(int *)&pEVar4->init == 1)) {
      if (*param_1 == 0) {
        ERR_clear_last_mark();
        goto LAB_00b20730;
      }
    }
    else {
      *param_1 = (long)pEVar4;
    }
  }
  ERR_pop_to_mark();
LAB_00b20730:
  return (ulong)(*param_1 != 0);
}

