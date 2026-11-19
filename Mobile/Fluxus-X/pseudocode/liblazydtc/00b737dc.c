/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b737dc
 */

undefined8 mbedtls_ctr_drbg_set_nonce_len(long param_1,ulong param_2)

{
  if (*(long *)(param_1 + 0x148) != 0) {
    return 0xffffffcc;
  }
  if (param_2 < 0x181) {
    *(int *)(param_1 + 0x10) = (int)param_2;
    return 0;
  }
  return 0xffffffc8;
}

