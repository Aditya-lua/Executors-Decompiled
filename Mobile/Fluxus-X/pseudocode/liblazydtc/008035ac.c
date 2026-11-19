/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008035ac
 */

void FUN_008035ac(ulong *param_1)

{
  if (*(char *)((long)param_1 + 0x13) == '\x01') {
    *(undefined1 *)((long)param_1 + 0x13) = 0;
    *(byte *)(param_1 + 2) = (byte)param_1[2] ^ 0xb1;
    *(byte *)((long)param_1 + 0x11) = *(byte *)((long)param_1 + 0x11) ^ 0x9d;
    *(byte *)((long)param_1 + 0x12) = *(byte *)((long)param_1 + 0x12) ^ 0x7b;
    param_1[1] = param_1[1] ^ 0xcf8ffb89377b9db1;
    *param_1 = *param_1 ^ 0xcf8ffb89377b9db1;
  }
  return;
}

