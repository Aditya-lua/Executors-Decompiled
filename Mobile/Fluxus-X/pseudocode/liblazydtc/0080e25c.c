/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080e25c
 */

void FUN_0080e25c(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x7a) == '\x01') {
    *(byte *)(param_1 + 0xf) = (byte)param_1[0xf] ^ 0xf;
    *param_1 = *param_1 ^ 0x29ff8fad7d41310f;
    param_1[1] = param_1[1] ^ 0x29ff8fad7d41310f;
    param_1[2] = param_1[2] ^ 0x29ff8fad7d41310f;
    param_1[3] = param_1[3] ^ 0x29ff8fad7d41310f;
    *(byte *)((long)param_1 + 0x79) = *(byte *)((long)param_1 + 0x79) ^ 0x31;
    param_1[4] = param_1[4] ^ 0x29ff8fad7d41310f;
    param_1[5] = param_1[5] ^ 0x29ff8fad7d41310f;
    *(undefined1 *)((long)param_1 + 0x7a) = 0;
    param_1[6] = param_1[6] ^ 0x29ff8fad7d41310f;
    param_1[7] = param_1[7] ^ 0x29ff8fad7d41310f;
    param_1[8] = param_1[8] ^ 0x29ff8fad7d41310f;
    param_1[9] = param_1[9] ^ 0x29ff8fad7d41310f;
    param_1[10] = param_1[10] ^ 0x29ff8fad7d41310f;
    param_1[0xb] = param_1[0xb] ^ 0x29ff8fad7d41310f;
    param_1[0xc] = param_1[0xc] ^ 0x29ff8fad7d41310f;
    param_1[0xd] = param_1[0xd] ^ 0x29ff8fad7d41310f;
    param_1[0xe] = param_1[0xe] ^ 0x29ff8fad7d41310f;
  }
  return;
}

