/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02e3c
 */

void X509_set_proxy_pathlen(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0xe0) = param_2;
  return;
}

