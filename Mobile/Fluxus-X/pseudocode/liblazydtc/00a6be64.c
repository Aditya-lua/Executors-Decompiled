/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6be64
 */

void EVP_PKEY_get_ex_data(long param_1,int param_2)

{
  CRYPTO_get_ex_data((CRYPTO_EX_DATA *)(param_1 + 0x50),param_2);
  return;
}

