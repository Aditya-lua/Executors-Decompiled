/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad20bc
 */

undefined8 RSA_get0_engine(long param_1)

{
  return *(undefined8 *)(param_1 + 0x20);
}

