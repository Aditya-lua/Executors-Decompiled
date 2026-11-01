
/* WARNING: Possible PIC construction at 0x0016e7d4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0016e7d8) */

void FUN_0016e79c(long param_1)

{
  bool in_CY;
  undefined8 uVar1;
  long lVar2;
  undefined8 uVar3;
  long in_x9;
  long in_x10;
  long in_x11;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  undefined8 *puVar4;
  long unaff_x23;
  ulong unaff_x24;
  undefined8 unaff_x29;
  undefined8 uVar5;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  lVar2 = unaff_x20;
  if (in_CY) {
    lVar2 = in_x11;
  }
  lVar2 = lVar2 - in_x10;
  if (lVar2 != 0) {
    puVar4 = (undefined8 *)(param_1 * 0x18 + in_x9 * -0x18 + unaff_x23 + 8);
    do {
      if (puVar4[-1] != 0) {
        func_0x00187bd4(*puVar4,puVar4[-1],1);
      }
      puVar4 = puVar4 + 3;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  if (unaff_x24 < unaff_x22) {
    puVar4 = (undefined8 *)(unaff_x23 + 8);
    do {
      lVar2 = puVar4[-1];
      if (lVar2 != 0) {
        uVar1 = *puVar4;
        uVar3 = 1;
        uVar5 = 0x16e7d8;
        goto code_r0x00187bd4;
      }
      puVar4 = puVar4 + 3;
      unaff_x21 = unaff_x21 + -1;
    } while (unaff_x21 != 0);
  }
  if (unaff_x20 == 0) {
    return;
  }
  uVar1 = *(undefined8 *)(unaff_x19 + 0x18);
  lVar2 = unaff_x20 * 0x18;
  uVar3 = 8;
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
  unaff_x29 = in_stack_00000040;
  uVar5 = in_stack_00000048;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,lVar2,uVar3);
  return;
}

