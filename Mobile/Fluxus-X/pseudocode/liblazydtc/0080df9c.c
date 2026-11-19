/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080df9c
 */

void FUN_0080df9c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x5d) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x5d) = 0;
    *param_1 = *param_1 ^ 0x99af93576193d1d9;
    param_1[1] = param_1[1] ^ 0x99af93576193d1d9;
    param_1[2] = param_1[2] ^ 0x99af93576193d1d9;
    param_1[3] = param_1[3] ^ 0x99af93576193d1d9;
    *(byte *)(param_1 + 0xb) = (byte)param_1[0xb] ^ 0xd9;
    param_1[4] = param_1[4] ^ 0x99af93576193d1d9;
    param_1[5] = param_1[5] ^ 0x99af93576193d1d9;
    *(byte *)((long)param_1 + 0x59) = *(byte *)((long)param_1 + 0x59) ^ 0xd1;
    param_1[6] = param_1[6] ^ 0x99af93576193d1d9;
    param_1[7] = param_1[7] ^ 0x99af93576193d1d9;
    *(byte *)((long)param_1 + 0x5a) = *(byte *)((long)param_1 + 0x5a) ^ 0x93;
    *(byte *)((long)param_1 + 0x5b) = *(byte *)((long)param_1 + 0x5b) ^ 0x61;
    param_1[8] = param_1[8] ^ 0x99af93576193d1d9;
    param_1[9] = param_1[9] ^ 0x99af93576193d1d9;
    param_1[10] = param_1[10] ^ 0x99af93576193d1d9;
    *(byte *)((long)param_1 + 0x5c) = *(byte *)((long)param_1 + 0x5c) ^ 0x57;
  }
  return;
}

