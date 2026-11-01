
long FUN_006bbc78(ulong param_1)

{
  int iVar1;
  int iVar2;
  long in_x9;
  int in_w10;
  long in_x12;
  uint in_w13;
  uint *unaff_x19;
  long *unaff_x22;
  long lVar3;
  int unaff_w24;
  long unaff_x25;
  ulong uVar4;
  long lVar5;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  while( true ) {
    param_1 = (ulong)((in_w13 ^ (uint)param_1) * in_w10);
    in_x12 = in_x12 + -1;
    if (in_x12 == 0) break;
    in_w13 = *unaff_x19;
    unaff_x19 = unaff_x19 + 1;
  }
  uVar4 = 0;
  lVar5 = *unaff_x22;
  while( true ) {
    param_1 = param_1 & in_x9 - 1U;
    lVar3 = lVar5 + param_1 * 0x88;
    iVar2 = *(int *)(lVar3 + 0x80);
    if ((iVar2 == unaff_w24) &&
       (iVar1 = _memcmp(lVar3,in_stack_00000018,in_stack_00000010), iVar1 == 0)) {
      return lVar3;
    }
    if ((iVar2 == (int)unaff_x25) &&
       (iVar2 = _memcmp(lVar3,in_stack_00000008,unaff_x25 << 2), iVar2 == 0)) break;
    uVar4 = uVar4 + 1;
    param_1 = uVar4 + param_1;
    if (in_x9 - 1U < uVar4) {
      return 0;
    }
  }
  return 0;
}

