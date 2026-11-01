
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f390) */

long * FUN_0070f2d4(undefined8 param_1)

{
  long lVar1;
  long *unaff_x19;
  long lVar2;
  long lVar3;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  long in_stack_00000060;
  
  if (in_stack_00000060 < 0) {
    __ZdlPv(in_stack_00000050);
    __Unwind_Resume(param_1);
    __Unwind_Resume();
    if (in_stack_00000038 < 0) {
      __ZdlPv(in_stack_00000028);
    }
    if (in_stack_00000050 < 0) {
      __ZdlPv(in_stack_00000040);
    }
  }
  else {
    unaff_x19 = (long *)__Unwind_Resume(param_1);
  }
  lVar2 = *unaff_x19;
  if (lVar2 != 0) {
    lVar3 = unaff_x19[1];
    lVar1 = lVar2;
    if (lVar3 != lVar2) {
      do {
        lVar3 = lVar3 + -0x28;
      } while (lVar3 != lVar2);
      lVar1 = *unaff_x19;
    }
    unaff_x19[1] = lVar2;
    __ZdlPv(lVar1);
  }
  return unaff_x19;
}

