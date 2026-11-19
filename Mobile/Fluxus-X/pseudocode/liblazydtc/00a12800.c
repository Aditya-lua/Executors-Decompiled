/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12800
 */

undefined8 CTLOG_get0_public_key(long param_1)

{
  return *(undefined8 *)(param_1 + 0x38);
}

