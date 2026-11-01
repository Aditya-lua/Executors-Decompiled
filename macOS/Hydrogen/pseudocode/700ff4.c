
undefined8 * FUN_00700ff4(void)

{
  undefined8 *puVar1;
  long unaff_x19;
  long unaff_x29;
  
  func_0x006f4f8c();
  puVar1 = (undefined8 *)func_0x006e3a84();
  *(undefined4 *)(unaff_x19 + 0x4c) = 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return puVar1;
  }
  puVar1 = (undefined8 *)___stack_chk_fail();
  if (puVar1[4] != 0) {
    func_0x006f3a2c(puVar1[3],puVar1[4],puVar1[5] << 3,0);
  }
  if (puVar1[1] != 0) {
    func_0x006f3a2c(*puVar1,puVar1[1],puVar1[2] << 3,0);
  }
  return puVar1;
}

