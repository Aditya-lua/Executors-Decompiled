/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67120
 */

void ossl_ccm_initctx(byte *param_1,ulong param_2,undefined8 param_3)

{
  *(ulong *)(param_1 + 0x18) = param_2 >> 3;
  param_1[0x20] = 0xff;
  param_1[0x21] = 0xff;
  param_1[0x22] = 0xff;
  param_1[0x23] = 0xff;
  param_1[0x24] = 0xff;
  param_1[0x25] = 0xff;
  param_1[0x26] = 0xff;
  param_1[0x27] = 0xff;
  *param_1 = *param_1 & 0xe1;
  param_1[0x10] = 0xc;
  param_1[0x11] = 0;
  param_1[0x12] = 0;
  param_1[0x13] = 0;
  param_1[0x14] = 0;
  param_1[0x15] = 0;
  param_1[0x16] = 0;
  param_1[0x17] = 0;
  param_1[8] = 8;
  param_1[9] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  param_1[0xe] = 0;
  param_1[0xf] = 0;
  *(undefined8 *)(param_1 + 0x90) = param_3;
  return;
}

