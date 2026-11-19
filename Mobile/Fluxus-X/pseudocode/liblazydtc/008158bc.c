/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008158bc
 */

void FUN_008158bc(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x11) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x11) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0x99;
    param_1[1] = param_1[1] ^ 0xc77f77236bad4799;
    *param_1 = *param_1 ^ 0xc77f77236bad4799;
  }
  return;
}

