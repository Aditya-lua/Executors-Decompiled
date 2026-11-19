/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082eb80
 */

void FUN_0082eb80(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x14) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x14) = 0;
    param_1[1] = param_1[1] ^ 0xbfe78f8f8debe1ed;
    *param_1 = *param_1 ^ 0xbfe78f8f8debe1ed;
    *(uint *)(param_1 + 2) = (uint)param_1[2] ^ 0x8debe1ed;
  }
  return;
}

