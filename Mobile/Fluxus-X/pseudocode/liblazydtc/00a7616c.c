/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7616c
 */

undefined8 evp_pkey_ctx_set_params_strict(long param_1,long *param_2)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  
  if ((param_1 == 0) || (param_2 == (long *)0x0)) {
    return 0;
  }
  if (*(long *)(param_1 + 0x20) != 0) {
    uVar1 = EVP_PKEY_CTX_settable_params(param_1);
    lVar2 = *param_2;
    plVar3 = param_2;
    while (lVar2 != 0) {
      plVar3 = plVar3 + 5;
      lVar2 = OSSL_PARAM_locate_const(uVar1);
      if (lVar2 == 0) {
        return 0xfffffffe;
      }
      lVar2 = *plVar3;
    }
  }
  uVar1 = EVP_PKEY_CTX_set_params(param_1,param_2);
  return uVar1;
}

