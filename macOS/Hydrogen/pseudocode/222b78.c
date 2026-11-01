
/* WARNING: Possible PIC construction at 0x00222bc8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00222c38: Changing call to branch */

void FUN_00222b78(long param_1)

{
  undefined1 *puVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  undefined1 *puVar6;
  ulong *unaff_x19;
  undefined8 unaff_x29;
  undefined8 uVar7;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  if (param_1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa0f4();
  }
  puVar1 = (undefined1 *)unaff_x19[1];
  uVar5 = unaff_x19[2];
  if (uVar5 != 0) {
    puVar6 = puVar1;
    do {
      *puVar6 = 0;
      uVar5 = uVar5 - 1;
      puVar6 = puVar6 + 1;
    } while (uVar5 != 0);
  }
  unaff_x19[2] = 0;
  for (uVar5 = *unaff_x19; uVar5 != 0; uVar5 = uVar5 - 1) {
    *puVar1 = 0;
    puVar1 = puVar1 + 1;
  }
  uVar5 = *unaff_x19;
  if (uVar5 != 0) {
    uVar3 = unaff_x19[1];
    uVar4 = 1;
    uVar7 = 0x222bcc;
code_r0x00187bd4:
    *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = uVar7;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(uVar3,uVar5,uVar4);
    return;
  }
  lVar2 = *(long *)unaff_x19[4];
  *(long *)unaff_x19[4] = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa510();
  }
  uVar3 = unaff_x19[5];
  if (uVar3 != 0xffffffffffffffff) {
    lVar2 = *(long *)(uVar3 + 8);
    *(long *)(uVar3 + 8) = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      uVar4 = *(ulong *)(unaff_x19[6] + 0x10);
      if (uVar4 < 9) {
        uVar4 = 8;
      }
      uVar5 = *(long *)(unaff_x19[6] + 8) + uVar4 + 0xf & -uVar4;
      if (uVar5 != 0) {
        uVar7 = 0x222c3c;
        goto code_r0x00187bd4;
      }
    }
  }
  uVar3 = unaff_x19[7];
  if (uVar3 != 0xffffffffffffffff) {
    lVar2 = *(long *)(uVar3 + 8);
    *(long *)(uVar3 + 8) = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      uVar4 = *(ulong *)(unaff_x19[8] + 0x10);
      if (uVar4 < 9) {
        uVar4 = 8;
      }
      uVar5 = *(long *)(unaff_x19[8] + 8) + uVar4 + 0xf & -uVar4;
      if (uVar5 != 0) {
        register0x00000008 = (BADSPACEBASE *)&uStack0000000000000020;
        unaff_x29 = in_stack_00000010;
        uVar7 = in_stack_00000018;
        goto code_r0x00187bd4;
      }
    }
  }
  return;
}

