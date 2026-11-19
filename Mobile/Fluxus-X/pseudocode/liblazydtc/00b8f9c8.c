/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f9c8
 */

undefined8 psa_crypto_driver_pake_get_user_len(long param_1,long *param_2)

{
  if (*(long *)(param_1 + 0x18) == 0) {
    return 0xffffff77;
  }
  *param_2 = *(long *)(param_1 + 0x18);
  return 0;
}

