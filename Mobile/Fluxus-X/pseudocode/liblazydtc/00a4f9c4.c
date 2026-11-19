/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4f9c4
 */

void FUN_00a4f9c4(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = EVP_KEYMGMT_up_ref();
  if ((iVar1 == 0) || (iVar1 = OPENSSL_sk_push(param_2,param_1), 0 < iVar1)) {
    return;
  }
  EVP_KEYMGMT_free(param_1);
  return;
}

