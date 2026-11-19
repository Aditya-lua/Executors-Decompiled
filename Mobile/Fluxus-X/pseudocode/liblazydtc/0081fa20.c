/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081fa20
 */

void FUN_0081fa20(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0xd11bf34b25d5a973;
    *param_1 = *param_1 ^ 0xd11bf34b25d5a973;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x25d5a973;
  }
  return;
}

