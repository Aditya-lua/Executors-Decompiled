/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4dbb8
 */

void FUN_00a4dbb8(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = OSSL_DECODER_up_ref();
  if ((iVar1 == 0) || (iVar1 = OPENSSL_sk_push(param_2,param_1), iVar1 != 0)) {
    return;
  }
  OSSL_DECODER_free(param_1);
  return;
}

