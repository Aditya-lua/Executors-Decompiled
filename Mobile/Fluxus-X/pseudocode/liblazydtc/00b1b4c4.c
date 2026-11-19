/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b4c4
 */

undefined8 X509_CRL_get_meth_data(long param_1)

{
  return *(undefined8 *)(param_1 + 0xd8);
}

