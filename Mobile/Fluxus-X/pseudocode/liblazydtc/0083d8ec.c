/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083d8ec
 */

void FUN_0083d8ec(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x16) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x16) = 0;
    *(byte *)((long)param_1 + 0x14) = *(byte *)((long)param_1 + 0x14) ^ 0xed;
    *(byte *)((long)param_1 + 0x15) = *(byte *)((long)param_1 + 0x15) ^ 0x23;
    param_1[1] = param_1[1] ^ 0xcf2923edf709f331;
    *param_1 = *param_1 ^ 0xcf2923edf709f331;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0xf709f331;
  }
  return;
}

