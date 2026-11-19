/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824d38
 */

void FUN_00824d38(uint *param_1)

{
  if (*(char *)((long)param_1 + 5) == '\x01') {
    *(undefined1 *)((long)param_1 + 5) = 0;
    *(byte *)(param_1 + 1) = (byte)param_1[1] ^ 0xf3;
    *param_1 = *param_1 ^ 0x8d9b893b;
  }
  return;
}

