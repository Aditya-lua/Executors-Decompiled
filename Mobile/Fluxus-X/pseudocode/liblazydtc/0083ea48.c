/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083ea48
 */

void FUN_0083ea48(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x1c) == '\x01') {
    *(byte *)(param_1 + 3) = (byte)param_1[3] ^ 0xa7;
    *(byte *)((long)param_1 + 0x19) = *(byte *)((long)param_1 + 0x19) ^ 0x75;
    *(undefined1 *)((long)param_1 + 0x1c) = 0;
    *(byte *)((long)param_1 + 0x1a) = *(byte *)((long)param_1 + 0x1a) ^ 0xb1;
    *param_1 = *param_1 ^ 0x459135750db175a7;
    param_1[1] = param_1[1] ^ 0x459135750db175a7;
    param_1[2] = param_1[2] ^ 0x459135750db175a7;
    *(byte *)((long)param_1 + 0x1b) = *(byte *)((long)param_1 + 0x1b) ^ 0xd;
  }
  return;
}

