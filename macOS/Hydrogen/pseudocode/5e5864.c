
/* WARNING: Possible PIC construction at 0x005e58d4: Changing call to branch */

void FUN_005e5864(undefined8 param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  long *plVar6;
  undefined8 *puVar7;
  undefined1 *unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined1 auStack_b0 [128];
  undefined8 uStack_8;
  
  uStack0000000000000018 = param_1;
  func_0x005e5364(unaff_x29 + -8,&uStack0000000000000008);
  func_0x005e5794();
  lVar2 = func_0x007a144c();
  uStack_8 = 0x5e587c;
  puVar1 = auStack_b0;
  uVar5 = *(ulong *)(lVar2 + 8);
  if ((uVar5 & 3) != 1) {
    return;
  }
  plVar6 = (long *)(uVar5 - 1);
  lVar2 = *plVar6;
  puVar7 = *(undefined8 **)(uVar5 + 7);
  if ((code *)*puVar7 != (code *)0x0) {
    (*(code *)*puVar7)(lVar2);
  }
  lVar3 = puVar7[1];
  if (lVar3 == 0) {
    lVar3 = 0x18;
    uVar4 = 8;
  }
  else {
    uVar4 = puVar7[2];
    uStack_8 = 0x5e58d8;
    register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
    plVar6 = (long *)lVar2;
    unaff_x29 = puVar1 + 0xa0;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar6,lVar3,uVar4);
  return;
}

