/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d568
 */

undefined8 EVP_PKEY_set1_engine(int *param_1,ENGINE *param_2)

{
  int iVar1;
  EVP_PKEY_METHOD *pEVar2;
  undefined8 uVar3;
  
  if (param_2 == (ENGINE *)0x0) {
LAB_00a6d59c:
    ENGINE_finish(*(ENGINE **)(param_1 + 6));
    uVar3 = 1;
    *(ENGINE **)(param_1 + 6) = param_2;
  }
  else {
    iVar1 = ENGINE_init(param_2);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/p_lib.c",0x2b7,"EVP_PKEY_set1_engine");
      uVar3 = 0x80026;
    }
    else {
      pEVar2 = ENGINE_get_pkey_meth(param_2,*param_1);
      if (pEVar2 != (EVP_PKEY_METHOD *)0x0) goto LAB_00a6d59c;
      iVar1 = ENGINE_finish(param_2);
      ERR_new(iVar1);
      ERR_set_debug("crypto/evp/p_lib.c",700,"EVP_PKEY_set1_engine");
      uVar3 = 0x9c;
    }
    ERR_set_error(6,uVar3,0);
    uVar3 = 0;
  }
  return uVar3;
}

