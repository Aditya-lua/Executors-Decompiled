/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4c84c
 */

void ossl_curve448_scalar_encode(undefined1 *param_1,undefined8 *param_2)

{
  *param_1 = (char)*param_2;
  param_1[1] = (char)((ulong)*param_2 >> 8);
  param_1[2] = (char)((ulong)*param_2 >> 0x10);
  param_1[3] = (char)((ulong)*param_2 >> 0x18);
  param_1[4] = (char)*(undefined4 *)((long)param_2 + 4);
  param_1[5] = (char)((ulong)*param_2 >> 0x28);
  param_1[6] = (char)*(undefined2 *)((long)param_2 + 6);
  param_1[7] = *(undefined1 *)((long)param_2 + 7);
  param_1[8] = (char)param_2[1];
  param_1[9] = (char)((ulong)param_2[1] >> 8);
  param_1[10] = (char)((ulong)param_2[1] >> 0x10);
  param_1[0xb] = (char)((ulong)param_2[1] >> 0x18);
  param_1[0xc] = (char)*(undefined4 *)((long)param_2 + 0xc);
  param_1[0xd] = (char)((ulong)param_2[1] >> 0x28);
  param_1[0xe] = (char)*(undefined2 *)((long)param_2 + 0xe);
  param_1[0xf] = *(undefined1 *)((long)param_2 + 0xf);
  param_1[0x10] = (char)param_2[2];
  param_1[0x11] = (char)((ulong)param_2[2] >> 8);
  param_1[0x12] = (char)((ulong)param_2[2] >> 0x10);
  param_1[0x13] = (char)((ulong)param_2[2] >> 0x18);
  param_1[0x14] = (char)*(undefined4 *)((long)param_2 + 0x14);
  param_1[0x15] = (char)((ulong)param_2[2] >> 0x28);
  param_1[0x16] = (char)*(undefined2 *)((long)param_2 + 0x16);
  param_1[0x17] = *(undefined1 *)((long)param_2 + 0x17);
  param_1[0x18] = (char)param_2[3];
  param_1[0x19] = (char)((ulong)param_2[3] >> 8);
  param_1[0x1a] = (char)((ulong)param_2[3] >> 0x10);
  param_1[0x1b] = (char)((ulong)param_2[3] >> 0x18);
  param_1[0x1c] = (char)*(undefined4 *)((long)param_2 + 0x1c);
  param_1[0x1d] = (char)((ulong)param_2[3] >> 0x28);
  param_1[0x1e] = (char)*(undefined2 *)((long)param_2 + 0x1e);
  param_1[0x1f] = *(undefined1 *)((long)param_2 + 0x1f);
  param_1[0x20] = (char)param_2[4];
  param_1[0x21] = (char)((ulong)param_2[4] >> 8);
  param_1[0x22] = (char)((ulong)param_2[4] >> 0x10);
  param_1[0x23] = (char)((ulong)param_2[4] >> 0x18);
  param_1[0x24] = (char)*(undefined4 *)((long)param_2 + 0x24);
  param_1[0x25] = (char)((ulong)param_2[4] >> 0x28);
  param_1[0x26] = (char)*(undefined2 *)((long)param_2 + 0x26);
  param_1[0x27] = *(undefined1 *)((long)param_2 + 0x27);
  param_1[0x28] = (char)param_2[5];
  param_1[0x29] = (char)((ulong)param_2[5] >> 8);
  param_1[0x2a] = (char)((ulong)param_2[5] >> 0x10);
  param_1[0x2b] = (char)((ulong)param_2[5] >> 0x18);
  param_1[0x2c] = (char)*(undefined4 *)((long)param_2 + 0x2c);
  param_1[0x2d] = (char)((ulong)param_2[5] >> 0x28);
  param_1[0x2e] = (char)*(undefined2 *)((long)param_2 + 0x2e);
  param_1[0x2f] = *(undefined1 *)((long)param_2 + 0x2f);
  param_1[0x30] = (char)param_2[6];
  param_1[0x31] = (char)((ulong)param_2[6] >> 8);
  param_1[0x32] = (char)((ulong)param_2[6] >> 0x10);
  param_1[0x33] = (char)((ulong)param_2[6] >> 0x18);
  param_1[0x34] = (char)*(undefined4 *)((long)param_2 + 0x34);
  param_1[0x35] = (char)((ulong)param_2[6] >> 0x28);
  param_1[0x36] = (char)*(undefined2 *)((long)param_2 + 0x36);
  param_1[0x37] = *(undefined1 *)((long)param_2 + 0x37);
  return;
}

