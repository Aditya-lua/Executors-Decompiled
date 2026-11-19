/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aebccc
 */

undefined8 OSSL_STORE_LOADER_get0_engine(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

