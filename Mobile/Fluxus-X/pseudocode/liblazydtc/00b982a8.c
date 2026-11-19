/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b982a8
 */

void mbedtls_psa_aead_decrypt_setup(long param_1)

{
  int iVar1;
  
  iVar1 = FUN_00b97e00();
  if (iVar1 == 0) {
    *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) & 0xfe;
  }
  return;
}

