/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae50d4
 */

undefined8 ossl_sm3_final(undefined1 *param_1,undefined4 *param_2)

{
  undefined4 *ptr;
  undefined4 uVar1;
  undefined4 uVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  
  uVar3 = param_2[0x1a];
  uVar4 = (ulong)uVar3;
  ptr = param_2 + 10;
  *(undefined1 *)((long)ptr + uVar4) = 0x80;
  lVar5 = uVar4 + 1;
  if (0x37 < uVar3) {
    memset((void *)((long)ptr + lVar5),0,0x3f - uVar4);
    ossl_sm3_block_data_order(param_2,ptr,1);
    lVar5 = 0;
  }
  memset((void *)((long)ptr + lVar5),0,0x38 - lVar5);
  uVar1 = param_2[8];
  uVar2 = param_2[9];
  *(char *)(param_2 + 0x18) = (char)((uint)uVar2 >> 0x18);
  *(char *)((long)param_2 + 99) = (char)uVar2;
  *(char *)((long)param_2 + 0x62) = (char)((uint)uVar2 >> 8);
  *(char *)(param_2 + 0x19) = (char)((uint)uVar1 >> 0x18);
  *(char *)((long)param_2 + 0x65) = (char)((uint)uVar1 >> 0x10);
  *(char *)((long)param_2 + 0x61) = (char)((uint)uVar2 >> 0x10);
  *(char *)((long)param_2 + 0x66) = (char)((uint)uVar1 >> 8);
  *(char *)((long)param_2 + 0x67) = (char)uVar1;
  ossl_sm3_block_data_order(param_2,ptr,1);
  param_2[0x1a] = 0;
  OPENSSL_cleanse(ptr,0x40);
  uVar1 = *param_2;
  *param_1 = (char)((uint)uVar1 >> 0x18);
  param_1[3] = (char)uVar1;
  param_1[1] = (char)((uint)uVar1 >> 0x10);
  param_1[2] = (char)((uint)uVar1 >> 8);
  uVar1 = param_2[1];
  param_1[4] = (char)((uint)uVar1 >> 0x18);
  param_1[7] = (char)uVar1;
  param_1[5] = (char)((uint)uVar1 >> 0x10);
  param_1[6] = (char)((uint)uVar1 >> 8);
  uVar1 = param_2[2];
  param_1[8] = (char)((uint)uVar1 >> 0x18);
  param_1[0xb] = (char)uVar1;
  param_1[9] = (char)((uint)uVar1 >> 0x10);
  param_1[10] = (char)((uint)uVar1 >> 8);
  uVar1 = param_2[3];
  param_1[0xc] = (char)((uint)uVar1 >> 0x18);
  param_1[0xf] = (char)uVar1;
  param_1[0xd] = (char)((uint)uVar1 >> 0x10);
  param_1[0xe] = (char)((uint)uVar1 >> 8);
  uVar1 = param_2[4];
  param_1[0x10] = (char)((uint)uVar1 >> 0x18);
  param_1[0x13] = (char)uVar1;
  param_1[0x11] = (char)((uint)uVar1 >> 0x10);
  param_1[0x12] = (char)((uint)uVar1 >> 8);
  uVar1 = param_2[5];
  param_1[0x14] = (char)((uint)uVar1 >> 0x18);
  param_1[0x17] = (char)uVar1;
  param_1[0x15] = (char)((uint)uVar1 >> 0x10);
  param_1[0x16] = (char)((uint)uVar1 >> 8);
  uVar1 = param_2[6];
  param_1[0x18] = (char)((uint)uVar1 >> 0x18);
  param_1[0x1b] = (char)uVar1;
  param_1[0x19] = (char)((uint)uVar1 >> 0x10);
  param_1[0x1a] = (char)((uint)uVar1 >> 8);
  uVar1 = param_2[7];
  param_1[0x1c] = (char)((uint)uVar1 >> 0x18);
  param_1[0x1d] = (char)((uint)uVar1 >> 0x10);
  param_1[0x1e] = (char)((uint)uVar1 >> 8);
  param_1[0x1f] = (char)uVar1;
  return 1;
}

