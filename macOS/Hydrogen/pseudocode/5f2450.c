
/* WARNING: Removing unreachable block (ram,0x005f243c) */
/* WARNING: Removing unreachable block (ram,0x005f244c) */

long FUN_005f2450(undefined8 param_1)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 unaff_x20;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  
  __ZdlPv(param_1);
  uVar1 = __Unwind_Resume(unaff_x20);
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  ___cxa_free_exception();
  uVar1 = __Unwind_Resume(uVar1);
  ___cxa_free_exception();
  lVar2 = __Unwind_Resume(uVar1);
  return lVar2 + 8;
}

