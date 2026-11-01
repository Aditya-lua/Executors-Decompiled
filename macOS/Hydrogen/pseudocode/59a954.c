
void FUN_0059a954(long param_1)

{
  undefined8 uVar1;
  ulong uVar2;
  long *unaff_x19;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  
  lStack0000000000000000 = 0;
  lStack0000000000000008 = 1;
  lStack0000000000000010 = 0;
  if (*(long *)(param_1 + 0x10) != 0) {
    lVar4 = 0;
    lVar3 = *(long *)(param_1 + 8);
    lVar5 = *(long *)(param_1 + 0x10) * 3;
    lVar6 = 1;
    do {
      func_0x0059abe0(&uStack0000000000000018,lVar3);
      uVar2 = in_stack_00000028;
      uVar1 = in_stack_00000020;
      if ((ulong)(lStack0000000000000000 - lVar4) < in_stack_00000028) {
        func_0x007acb90();
        lVar4 = lStack0000000000000010;
        lVar6 = lStack0000000000000008;
      }
      _memcpy(lVar6 + lVar4,uVar1,uVar2);
      lVar4 = lVar4 + uVar2;
      lStack0000000000000010 = lVar4;
      if (uStack0000000000000018 != 0) {
        func_0x00187bd4(uVar1,uStack0000000000000018,1);
      }
      lVar3 = lVar3 + 3;
      lVar5 = lVar5 + -3;
    } while (lVar5 != 0);
  }
  unaff_x19[1] = lStack0000000000000008;
  *unaff_x19 = lStack0000000000000000;
  unaff_x19[2] = lStack0000000000000010;
  return;
}

