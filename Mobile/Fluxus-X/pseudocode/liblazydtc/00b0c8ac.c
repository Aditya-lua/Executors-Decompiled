/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c8ac
 */

undefined8 X509_get0_extensions(long param_1)

{
  return *(undefined8 *)(param_1 + 0x68);
}

