
int FUN_007715f4(void)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  undefined8 in_stack_00000008;
  
  uVar2 = func_0x00729904();
  if ((((uVar2 & 1) != 0) || (lVar3 = func_0x0072a52c(), -1 < lVar3)) ||
     (in_stack_00000008._4_4_ == 0x51)) {
    iVar1 = func_0x0077120c();
    in_stack_00000008._4_4_ = 0;
    if (iVar1 != 0x51) {
      in_stack_00000008._4_4_ = iVar1;
    }
  }
  return in_stack_00000008._4_4_;
}

