
void FUN_00656328(long param_1,long param_2)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x24;
  
  if (param_1 != 0) {
    do {
      *(undefined1 *)(param_2 + -1 + param_1) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  if (unaff_x22 == 0) {
    *unaff_x24 = 0;
    unaff_x24[1] = 0;
  }
  else {
    lVar1 = func_0x006115d0();
    unaff_x19[0xf] = unaff_x22;
    unaff_x19[0x10] = lVar1;
    unaff_x19[0xe] = -1;
    if ((unaff_x21 != 0) && (lVar1 != 0)) {
      _memcpy();
    }
  }
  unaff_x19[0xe] = -1;
  func_0x005febd4(unaff_x19 + 0x17,unaff_x21 + unaff_x22);
  plVar2 = (long *)(**(code **)(*unaff_x20 + 0xa0))();
  uVar3 = (**(code **)(*unaff_x19 + 0xa0))();
                    /* WARNING: Could not recover jumptable at 0x006563e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x28))(plVar2,uVar3,unaff_x19[0x10],unaff_x19[0xf]);
  return;
}

