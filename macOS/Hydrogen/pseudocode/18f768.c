
void FUN_0018f768(long *param_1,long param_2)

{
  uint uVar1;
  long in_x9;
  long in_x10;
  uint in_w11;
  long *in_x12;
  uint in_w13;
  long lVar2;
  
  while( true ) {
    if (in_x10 == in_x9) {
      *(long *)(param_2 + 0x10) = in_x10;
      *param_1 = 0;
      return;
    }
    lVar2 = in_x12[3];
    if ((lVar2 != 0) &&
       (uVar1 = *(uint *)(in_x12 + 4), (uVar1 & in_w11) != 0 && (uVar1 & in_w13) == uVar1)) break;
    in_x9 = in_x9 + 1;
    in_x12 = in_x12 + 3;
  }
  *(long *)(param_2 + 0x10) = in_x9 + 1;
  *(uint *)(param_2 + 0x1c) = in_w11 & (uVar1 ^ 0xffffffff);
  *param_1 = in_x12[2];
  param_1[1] = lVar2;
  *(uint *)(param_1 + 2) = uVar1;
  return;
}

