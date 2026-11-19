/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f94c
 */

undefined8 psa_crypto_driver_pake_get_password_len(long param_1,long *param_2)

{
  if (*(long *)(param_1 + 8) == 0) {
    return 0xffffff77;
  }
  *param_2 = *(long *)(param_1 + 8);
  return 0;
}

