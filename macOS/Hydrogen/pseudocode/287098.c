
undefined8 FUN_00287098(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 unaff_x19;
  long in_stack_00000028;
  
  iVar1 = func_0x0036e62c();
  if (iVar1 != 0) {
    unaff_x19 = 0xffffffff;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
    return unaff_x19;
  }
  lVar2 = ___stack_chk_fail();
  if (*(long *)(lVar2 + 0x10) == 0) {
    return 0;
  }
  uVar3 = _bzero(*(long *)(lVar2 + 0x10));
  return uVar3;
}

