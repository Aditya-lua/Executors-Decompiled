/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afd108
 */

undefined8 FUN_00afd108(long param_1)

{
  X509_NAME_free(*(X509_NAME **)(param_1 + 0x10));
  return 1;
}

