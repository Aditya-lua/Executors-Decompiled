
undefined8 FUN_0008cb88(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long *in_x9;
  undefined8 *unaff_x19;
  
  if (*in_x9 == param_1) {
    return param_2;
  }
  uVar1 = ___stack_chk_fail();
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    __ZdlPv(*unaff_x19);
  }
  __Unwind_Resume(uVar1);
  return 0;
}

