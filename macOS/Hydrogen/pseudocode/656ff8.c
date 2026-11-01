
void FUN_00656ff8(void)

{
  long *plVar1;
  undefined8 uVar2;
  long *unaff_x21;
  long *unaff_x22;
  
  _memcpy();
  unaff_x21[2] = -1;
  plVar1 = (long *)(**(code **)(*unaff_x22 + 0x90))();
  uVar2 = (**(code **)(*unaff_x21 + 0xa0))();
                    /* WARNING: Could not recover jumptable at 0x00657064. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x30))(plVar1,uVar2);
  return;
}

