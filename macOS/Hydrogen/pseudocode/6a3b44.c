
void FUN_006a3b44(long param_1,byte *param_2,long param_3)

{
  uint in_w8;
  int in_w9;
  int in_w10;
  int in_w11;
  uint in_w12;
  uint in_w13;
  uint uVar1;
  uint in_w14;
  
  while( true ) {
    *param_2 = (byte)in_w14 ^ (byte)(in_w13 >> 0x18) ^ (byte)in_w13;
    param_3 = param_3 + -1;
    if (param_3 == 0) break;
    uVar1 = (uint)((ulong)*(uint *)(param_1 + 8) * (ulong)in_w8 >> 0x2f);
    uVar1 = (*(uint *)(param_1 + 8) - uVar1 * in_w9) * in_w10 + uVar1 * in_w11;
    in_w13 = in_w12;
    if (uVar1 != 0) {
      in_w13 = uVar1;
    }
    *(uint *)(param_1 + 8) = in_w13;
    in_w14 = in_w13 >> 0x10 ^ in_w13 >> 8;
    param_2 = param_2 + 1;
  }
  return;
}

