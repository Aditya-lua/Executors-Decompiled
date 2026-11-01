
undefined8 * FUN_0062be7c(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long in_x9;
  undefined8 *unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  
  do {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return unaff_x21;
  }
  uVar1 = ___stack_chk_fail();
  func_0x0062a89c();
  func_0x0062a89c();
  func_0x0062a89c(&uStack0000000000000008);
  puVar2 = (undefined8 *)__Unwind_Resume(uVar1);
  puVar2[1] = &UNK_00a099a8;
  puVar2[2] = puVar2;
  *puVar2 = &UNK_00a00d18;
  func_0x00675af8(puVar2 + 3);
  *puVar2 = &UNK_009fae50;
  func_0x00675af8(puVar2 + 7);
  return puVar2;
}

