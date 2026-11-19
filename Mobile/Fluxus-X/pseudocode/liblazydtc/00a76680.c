/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a76680
 */

void EVP_PKEY_CTX_set_tls1_prf_md(long param_1,undefined8 param_2)

{
  FUN_00a76514(param_1,param_2,*(long *)(param_1 + 0x30) == 0,0x800,0x1000);
  return;
}

