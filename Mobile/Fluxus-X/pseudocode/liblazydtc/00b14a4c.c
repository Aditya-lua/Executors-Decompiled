/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14a4c
 */

undefined8 X509_CRL_get_issuer(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

