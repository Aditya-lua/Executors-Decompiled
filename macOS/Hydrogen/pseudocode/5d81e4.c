
/* WARNING: Possible PIC construction at 0x005d824c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005d8250) */

void FUN_005d81e4(ulong param_1)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  long lVar3;
  long lVar4;
  ulong in_x9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  ulong uVar5;
  undefined8 unaff_x29;
  undefined8 uVar6;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  auVar1._8_8_ = 0;
  auVar1._0_8_ = param_1;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x9;
  uVar5 = SUB168(auVar1 * auVar2,8) >> 5;
  while( true ) {
    lVar3 = *(long *)*unaff_x20;
    *(long *)*unaff_x20 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      func_0x005d2ac4(unaff_x20);
    }
    lVar4 = unaff_x20[2];
    lVar3 = lVar4 * 0x11 + 0x19;
    if (lVar4 != 0 && lVar3 != 0) break;
    unaff_x20 = unaff_x20 + 6;
    uVar5 = uVar5 - 1;
    if (uVar5 == 0) {
      if (unaff_x19[2] == 0) {
        return;
      }
      lVar4 = *unaff_x19;
      lVar3 = unaff_x19[2] * 0x30;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
      unaff_x29 = in_stack_00000020;
      uVar6 = in_stack_00000028;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar4,lVar3,8);
      return;
    }
  }
  lVar4 = unaff_x20[1] + lVar4 * -0x10 + -0x10;
  uVar6 = 0x5d8250;
  goto code_r0x00187bd4;
}

