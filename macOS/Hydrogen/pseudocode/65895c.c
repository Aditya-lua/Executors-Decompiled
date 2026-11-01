
void FUN_0065895c(long param_1)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  undefined8 *unaff_x23;
  
  do {
    *(undefined1 *)(in_x9 + param_1) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if (unaff_x19 == 0) {
    *unaff_x23 = 0;
    unaff_x23[1] = 0;
  }
  else {
    lVar1 = func_0x006115d0();
    unaff_x21[3] = unaff_x19;
    unaff_x21[4] = lVar1;
    unaff_x21[2] = -1;
    if ((unaff_x20 != 0) && (lVar1 != 0)) {
      _memcpy();
    }
  }
  unaff_x21[2] = -1;
  plVar2 = (long *)(**(code **)(*unaff_x22 + 0x90))();
  uVar3 = (**(code **)(*unaff_x21 + 0xa0))();
                    /* WARNING: Could not recover jumptable at 0x006589fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x30))(plVar2,uVar3);
  return;
}

