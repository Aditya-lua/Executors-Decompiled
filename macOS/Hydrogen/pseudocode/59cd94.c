
/* WARNING: Possible PIC construction at 0x0059ce08: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0059ce0c) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_0059cd94(ulong *param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong uVar4;
  long *plVar5;
  undefined8 *puVar6;
  undefined *puVar7;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  uVar2 = *param_1;
  uVar4 = uVar2 ^ 0x8000000000000000;
  if (2 < uVar4) {
    uVar4 = 1;
  }
  puVar6 = uStack0000000000000010;
  puVar7 = in_stack_00000018;
  if (uVar4 == 0) {
    plVar5 = (long *)param_1[1];
    lVar1 = *plVar5;
    *plVar5 = lVar1 + -1;
    LORelease();
    if (lVar1 != 1) {
      return;
    }
    uVar4 = param_1[1];
    uVar2 = *(ulong *)(uVar4 + 0x10);
    if (uVar2 == 0x8000000000000000 || uVar2 == 0) {
      uVar2 = 0x28;
      uVar3 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000020;
    }
    else {
      puVar6 = &uStack0000000000000010;
      uVar4 = *(ulong *)(uVar4 + 0x18);
      uVar3 = 1;
      puVar7 = &UNK_005d2b08;
    }
  }
  else if (uVar4 == 1) {
    if (uVar2 == 0) {
      return;
    }
    uVar4 = param_1[1];
    uVar3 = 1;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000020;
  }
  else {
    uVar4 = param_1[1];
    func_0x0059ce88(uVar4);
    uVar2 = 0x40;
    uVar3 = 8;
    puVar6 = &uStack0000000000000010;
    puVar7 = (undefined *)0x59ce0c;
  }
  *(undefined8 **)((long)register0x00000008 + -0x10) = puVar6;
  *(undefined **)((long)register0x00000008 + -8) = puVar7;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar4,uVar2,uVar3);
  return;
}

