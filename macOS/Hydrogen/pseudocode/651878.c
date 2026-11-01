
undefined8 * FUN_00651878(void)

{
  undefined8 *puVar1;
  
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x0001753c();
  *puVar1 = &UNK_00a09aa0;
  if ((long *)puVar1[2] != (long *)0x0) {
    (**(code **)(*(long *)puVar1[2] + 8))();
  }
  if ((long *)puVar1[1] != (long *)0x0) {
    (**(code **)(*(long *)puVar1[1] + 8))();
  }
  return puVar1;
}

