
/* WARNING: Possible PIC construction at 0x00650398: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0065039c) */

undefined8 * FUN_00650334(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  ulong uVar5;
  long unaff_x19;
  long unaff_x24;
  long unaff_x25;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  undefined8 *in_stack_00000018;
  
  uVar4 = func_0x0001753c();
  *(long *)(unaff_x19 + 8) = unaff_x24 + unaff_x25;
  __Unwind_Resume(uVar4);
  lVar1 = unaff_x25 + unaff_x24;
  lVar2 = *(long *)(lVar1 + 0x20);
  uVar5 = *(ulong *)(lVar1 + 0x10);
  if (*(ulong *)(lVar1 + 0x18) <= *(ulong *)(lVar1 + 0x10)) {
    uVar5 = *(ulong *)(lVar1 + 0x18);
  }
  if (lVar2 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  puVar3 = in_stack_00000010;
  in_stack_00000018 = (undefined8 *)(unaff_x25 + unaff_x24);
  while (in_stack_00000018 != puVar3) {
    in_stack_00000018 = in_stack_00000018 + -10;
    (**(code **)*in_stack_00000018)();
  }
  if (uStack0000000000000008 != 0) {
    __ZdlPv();
  }
  return &uStack0000000000000008;
}

