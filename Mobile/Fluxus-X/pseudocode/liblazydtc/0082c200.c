/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082c200
 */

void FUN_0082c200(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x15) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x15) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0xa1;
    param_1[1] = param_1[1] ^ 0xc169d3a1093b4331;
    *param_1 = *param_1 ^ 0xc169d3a1093b4331;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x93b4331;
  }
  return;
}

