/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b146c4
 */

undefined8 X509_VERIFY_PARAM_get0_email(long param_1)

{
  return *(undefined8 *)(param_1 + 0x50);
}

