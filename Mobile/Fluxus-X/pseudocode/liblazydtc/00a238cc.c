/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a238cc
 */

void FUN_00a238cc(long param_1)

{
  EC_KEY_get0_group(*(EC_KEY **)(param_1 + 0x20));
  EC_GROUP_order_bits();
  return;
}

