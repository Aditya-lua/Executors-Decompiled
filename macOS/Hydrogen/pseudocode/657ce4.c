
void FUN_00657ce4(long param_1)

{
  long *plVar1;
  undefined8 uVar2;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  unaff_x19[0xf] = unaff_x22;
  unaff_x19[0x10] = param_1;
  unaff_x19[0xe] = -1;
  if ((unaff_x21 != 0) && (param_1 != 0)) {
    _memcpy();
  }
  unaff_x19[0xe] = -1;
  func_0x005febd4(unaff_x19 + 0x17,unaff_x21 + unaff_x22);
  plVar1 = (long *)(**(code **)(*unaff_x20 + 0xa0))();
  uVar2 = (**(code **)(*unaff_x19 + 0xa0))();
                    /* WARNING: Could not recover jumptable at 0x00657d78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x28))(plVar1,uVar2,unaff_x19[0x10],unaff_x19[0xf]);
  return;
}

