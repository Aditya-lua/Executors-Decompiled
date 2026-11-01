
void FUN_0066c57c(undefined8 param_1)

{
  undefined8 uVar1;
  long lVar2;
  long *unaff_x20;
  
  (**(code **)(*unaff_x20 + 8))();
  uVar1 = __Unwind_Resume(param_1);
  __ZdlPv();
  lVar2 = __Unwind_Resume(uVar1);
  if (*(long **)(lVar2 + 0x90) == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0066c5c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar2 + 0x90) + 0x38))();
  return;
}

