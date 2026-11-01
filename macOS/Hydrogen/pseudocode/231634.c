
/* WARNING: Possible PIC construction at 0x00231674: Changing call to branch */

void FUN_00231634(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  long unaff_x19;
  long *plVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 unaff_x29;
  undefined8 uVar6;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  if (param_1 != 1) {
    return;
  }
  plVar3 = (long *)(unaff_x19 + -1);
  lVar4 = *plVar3;
  puVar5 = *(undefined8 **)(unaff_x19 + 7);
  if ((code *)*puVar5 != (code *)0x0) {
    (*(code *)*puVar5)(lVar4);
  }
  lVar1 = puVar5[1];
  if (lVar1 == 0) {
    lVar1 = 0x18;
    uVar2 = 8;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
    unaff_x29 = in_stack_00000020;
    uVar6 = in_stack_00000028;
  }
  else {
    uVar2 = puVar5[2];
    plVar3 = (long *)lVar4;
    uVar6 = 0x231678;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar3,lVar1,uVar2);
  return;
}

