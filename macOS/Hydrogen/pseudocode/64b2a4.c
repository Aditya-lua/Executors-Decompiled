
/* WARNING: Possible PIC construction at 0x0064b2e4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0064b2e8) */

undefined8 * FUN_0064b2a4(void)

{
  undefined8 *puVar1;
  long unaff_x19;
  long lVar2;
  long unaff_x21;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  undefined8 *in_stack_00000018;
  
  *(long *)(unaff_x19 + 8) = unaff_x22;
  __Unwind_Resume();
  if (unaff_x22 != -0x30) {
    lVar2 = unaff_x22 + 0x30;
    do {
      (*(code *)**(undefined8 **)(unaff_x21 + lVar2))();
      lVar2 = lVar2 + 0x30;
    } while (lVar2 != 0);
  }
  puVar1 = in_stack_00000010;
  while (in_stack_00000018 != puVar1) {
    in_stack_00000018 = in_stack_00000018 + -6;
    (**(code **)*in_stack_00000018)();
  }
  if (uStack0000000000000008 != 0) {
    __ZdlPv();
  }
  return &uStack0000000000000008;
}

