/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59098
 */

undefined8 ossl_prov_drbg_uninstantiate(long param_1)

{
  *(undefined4 *)(param_1 + 0xf0) = 0;
  return 1;
}

