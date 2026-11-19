/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02e80
 */

void BN_with_flags(undefined8 *param_1,undefined8 *param_2,uint param_3)

{
  *param_1 = *param_2;
  param_1[1] = param_2[1];
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_2 + 2);
  *(uint *)((long)param_1 + 0x14) =
       *(uint *)((long)param_1 + 0x14) & 1 | param_3 | *(uint *)((long)param_2 + 0x14) & 0xfffffffc
       | 2;
  return;
}

