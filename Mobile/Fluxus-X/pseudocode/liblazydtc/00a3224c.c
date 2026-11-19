/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3224c
 */

void EC_KEY_get_ex_data(long param_1,int param_2)

{
  CRYPTO_get_ex_data((CRYPTO_EX_DATA *)(param_1 + 0x40),param_2);
  return;
}

