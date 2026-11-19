/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a764fc
 */

void EVP_PKEY_CTX_set_signature_md(long param_1,undefined8 param_2)

{
  FUN_00a76514(param_1,param_2,*(long *)(param_1 + 0x30) == 0,0x1f0,1);
  return;
}

