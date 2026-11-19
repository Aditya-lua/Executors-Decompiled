/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8fac0
 */

undefined8 psa_crypto_driver_pake_get_cipher_suite(long param_1,undefined8 *param_2)

{
  if (*(int *)(param_1 + 0x48) == 0) {
    return 0xffffff77;
  }
  *(undefined4 *)(param_2 + 1) = *(undefined4 *)(param_1 + 0x50);
  *param_2 = *(undefined8 *)(param_1 + 0x48);
  return 0;
}

