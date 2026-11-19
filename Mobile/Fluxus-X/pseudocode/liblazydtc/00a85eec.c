/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a85eec
 */

undefined8 FUN_00a85eec(void)

{
  EVP_MD_meth_free(DAT_00d22090);
  DAT_00d22090 = 0;
  EVP_CIPHER_meth_free(DAT_00d22098);
  DAT_00d22098 = 0;
  EVP_CIPHER_meth_free(DAT_00d220a0);
  DAT_00d220a0 = 0;
  return 1;
}

