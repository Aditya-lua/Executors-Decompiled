/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1465c
 */

undefined8 X509_VERIFY_PARAM_get0_peername(long param_1)

{
  return *(undefined8 *)(param_1 + 0x48);
}

