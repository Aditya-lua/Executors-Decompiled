
/* WARNING: Possible PIC construction at 0x0062f870: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0062f874) */

undefined8 * FUN_0062f7b0(undefined8 param_1)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  long unaff_x19;
  undefined8 *puVar4;
  undefined8 uStack0000000000000048;
  undefined8 *in_stack_00000050;
  
  lVar1 = *(long *)(unaff_x19 + 0x20);
  uVar3 = *(ulong *)(unaff_x19 + 0x10);
  if (*(ulong *)(unaff_x19 + 0x18) <= *(ulong *)(unaff_x19 + 0x10)) {
    uVar3 = *(ulong *)(unaff_x19 + 0x18);
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(param_1);
  func_0x0001753c();
  lVar1 = *(long *)(unaff_x19 + 0x20);
  uVar3 = *(ulong *)(unaff_x19 + 0x10);
  if (*(ulong *)(unaff_x19 + 0x18) <= *(ulong *)(unaff_x19 + 0x10)) {
    uVar3 = *(ulong *)(unaff_x19 + 0x18);
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  puVar2 = uStack0000000000000048;
  puVar4 = in_stack_00000050;
  if (uStack0000000000000048 != (undefined8 *)0x0) {
    while (puVar4 != puVar2) {
      puVar4 = puVar4 + -10;
      (**(code **)*puVar4)(puVar4);
    }
    in_stack_00000050 = puVar2;
    __ZdlPv(uStack0000000000000048);
  }
  return &uStack0000000000000048;
}

