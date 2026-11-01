
undefined8 FUN_006d9260(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  long unaff_x23;
  long in_stack_00000000;
  long in_stack_00000030;
  long in_stack_00000078;
  undefined8 in_stack_000000a0;
  
  puVar1 = (undefined8 *)func_0x006d9030();
  *puVar1 = 0xff0000000000;
  if (unaff_x23 != 5) {
    puVar1 = (undefined8 *)func_0x006d9030();
    *puVar1 = 0xff000000000000;
    if (unaff_x23 != 6) {
      puVar1 = (undefined8 *)func_0x006d9030();
      *puVar1 = 0xff00000000000000;
    }
  }
  (**(code **)*unaff_x19)();
  if (in_stack_00000078 != 0) {
    __ZdlPv();
  }
  if (in_stack_00000000 != 0) {
    __ZdlPv();
  }
  if (in_stack_00000030 != 0) {
    __ZdlPv();
  }
  return in_stack_000000a0;
}

