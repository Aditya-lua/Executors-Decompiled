
bool FUN_00648a54(long *param_1)

{
  bool bVar1;
  int iVar2;
  long *plVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  int unaff_w19;
  long *unaff_x22;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  iVar2 = (**(code **)(*param_1 + 0x20))();
  plVar3 = (long *)(**(code **)(*unaff_x22 + 0x10))();
  uVar4 = (**(code **)(*plVar3 + 0xa0))();
  lVar5 = (**(code **)(*unaff_x22 + 0x20))();
  if (iVar2 == 0 || *(int *)(lVar5 + 0x28) == 1) {
    bVar1 = false;
  }
  else {
    uVar6 = func_0x005ffc7c();
    if ((uVar6 & 1) != 0) {
      return false;
    }
    iVar2 = func_0x00609ec8(lVar5,uVar4);
    bVar1 = unaff_w19 == 0 && iVar2 < 0;
    if ((unaff_w19 != 0) && (iVar2 < 0)) {
      func_0x0060a94c(lVar5,uVar4);
      func_0x00604ce4();
      iVar2 = func_0x00609ec8();
      bVar1 = iVar2 == 0;
      if (in_stack_00000018 <= in_stack_00000010) {
        in_stack_00000010 = in_stack_00000018;
      }
      if (in_stack_00000020 != 0) {
        if (in_stack_00000010 != 0) {
          do {
            *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
            in_stack_00000010 = in_stack_00000010 - 1;
          } while (in_stack_00000010 != 0);
        }
        func_0x00611644();
      }
    }
  }
  return bVar1;
}

