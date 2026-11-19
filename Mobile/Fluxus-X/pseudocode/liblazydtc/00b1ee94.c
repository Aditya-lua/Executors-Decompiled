/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ee94
 */

void X509_get0_signature(long *param_1,long *param_2,long param_3)

{
  if (param_1 != (long *)0x0) {
    *param_1 = param_3 + 0x98;
  }
  if (param_2 != (long *)0x0) {
    *param_2 = param_3 + 0x88;
  }
  return;
}

