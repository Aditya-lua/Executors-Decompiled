/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b29c74
 */

void FUN_00b29c74(undefined8 param_1)

{
  int iVar1;
  undefined8 in_x5;
  
  iVar1 = ossl_cipher_generic_dinit();
  if (iVar1 == 0) {
    return;
  }
  FUN_00b29d70(param_1,in_x5);
  return;
}

