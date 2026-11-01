
/* WARNING: Possible PIC construction at 0x0026b704: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0026b708) */

void FUN_0026b67c(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long in_x9;
  long unaff_x20;
  long lVar4;
  long *plVar5;
  undefined8 unaff_x29;
  undefined8 uVar6;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  if (in_x9 + 0x27 < unaff_x20) {
    if (((*(byte *)(param_1 + 0x18) & 1) == 0) &&
       (lVar1 = *(long *)(param_1 + 0x20), lVar1 != -0x8000000000000000 && lVar1 != 0)) {
      func_0x00187bd4(*(undefined8 *)(param_1 + 0x28),lVar1,1);
      lVar1 = *(long *)(param_1 + 8);
      lVar4 = *(long *)(param_1 + 0x10);
    }
    else {
      lVar1 = *(long *)(param_1 + 8);
      lVar4 = *(long *)(param_1 + 0x10);
    }
    if (lVar4 != 0) {
      plVar5 = (long *)(lVar1 + 8);
      do {
        lVar2 = plVar5[-1];
        if (lVar2 != 0) {
          lVar1 = *plVar5;
          uVar3 = 1;
          uVar6 = 0x26b708;
          goto code_r0x00187bd4;
        }
        plVar5 = plVar5 + 3;
        lVar4 = lVar4 + -1;
      } while (lVar4 != 0);
    }
    if (unaff_x20 != 0) {
      lVar2 = unaff_x20 * 0x18;
      uVar3 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
      unaff_x29 = in_stack_00000020;
      uVar6 = in_stack_00000028;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar1,lVar2,uVar3);
      return;
    }
  }
  return;
}

