/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080e0f0
 */

void FUN_0080e0f0(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x5e) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x5e) = 0;
    *(byte *)(param_1 + 0xb) = (byte)param_1[0xb] ^ 0x57;
    *param_1 = *param_1 ^ 0xbfa18dc56965d557;
    param_1[1] = param_1[1] ^ 0xbfa18dc56965d557;
    param_1[2] = param_1[2] ^ 0xbfa18dc56965d557;
    param_1[3] = param_1[3] ^ 0xbfa18dc56965d557;
    param_1[4] = param_1[4] ^ 0xbfa18dc56965d557;
    param_1[5] = param_1[5] ^ 0xbfa18dc56965d557;
    *(byte *)((long)param_1 + 0x59) = *(byte *)((long)param_1 + 0x59) ^ 0xd5;
    *(byte *)((long)param_1 + 0x5a) = *(byte *)((long)param_1 + 0x5a) ^ 0x65;
    param_1[6] = param_1[6] ^ 0xbfa18dc56965d557;
    param_1[7] = param_1[7] ^ 0xbfa18dc56965d557;
    *(byte *)((long)param_1 + 0x5b) = *(byte *)((long)param_1 + 0x5b) ^ 0x69;
    *(byte *)((long)param_1 + 0x5c) = *(byte *)((long)param_1 + 0x5c) ^ 0xc5;
    param_1[8] = param_1[8] ^ 0xbfa18dc56965d557;
    param_1[9] = param_1[9] ^ 0xbfa18dc56965d557;
    param_1[10] = param_1[10] ^ 0xbfa18dc56965d557;
    *(byte *)((long)param_1 + 0x5d) = *(byte *)((long)param_1 + 0x5d) ^ 0x8d;
  }
  return;
}

