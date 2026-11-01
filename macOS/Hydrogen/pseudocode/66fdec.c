
void FUN_0066fdec(void)

{
  long *plVar1;
  long *unaff_x20;
  long *unaff_x21;
  
  (**(code **)(*unaff_x21 + 0x10))();
  (**(code **)(*unaff_x21 + 0x58))();
  if ((*(byte *)(unaff_x20 + 0x14) >> 2 & 1) == 0) {
    return;
  }
  plVar1 = (long *)(**(code **)(*unaff_x20 + 0x160))();
                    /* WARNING: Could not recover jumptable at 0x0066fed0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x38))();
  return;
}

