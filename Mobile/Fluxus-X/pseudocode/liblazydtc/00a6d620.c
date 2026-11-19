/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d620
 */

undefined8 EVP_PKEY_get0_engine(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}

