
/* WARNING: Possible PIC construction at 0x001f942c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f94a0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001f94a4) */

void FUN_001f93c0(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 *puVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  long unaff_x19;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined1 *unaff_x29;
  undefined1 auStack_d0 [128];
  undefined8 uStack_8;
  
  func_0x001f7ed8(unaff_x19 + 0x10);
  __Unwind_Resume();
  plVar4 = (long *)func_0x007a2668();
  uStack_8 = 0x1f93ec;
  puVar3 = auStack_d0;
  func_0x00437c4c();
  lVar8 = *plVar4;
  *plVar4 = 0;
  if (lVar8 == 0) {
    func_0x0018d6a0(plVar4 + 6);
    uVar10 = plVar4[5];
    if (uVar10 != 0) {
      lVar8 = plVar4[3];
      uVar2 = plVar4[4];
      uVar7 = plVar4[2];
      uVar1 = 0;
      if (uVar7 <= uVar2) {
        uVar1 = uVar7;
      }
      lVar5 = uVar2 - uVar1;
      uVar12 = uVar7 - lVar5;
      lVar9 = 0;
      if (uVar12 <= uVar10) {
        lVar9 = uVar10 - uVar12;
      }
      if (uVar10 <= uVar12) {
        uVar7 = lVar5 + uVar10;
      }
      lVar5 = uVar7 - lVar5;
      if (lVar5 != 0) {
        puVar13 = (undefined8 *)(uVar2 * 0x18 + uVar1 * -0x18 + lVar8 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar5 = lVar5 + -1;
        } while (lVar5 != 0);
      }
      if (uVar12 < uVar10) {
        plVar11 = (long *)(lVar8 + 8);
        do {
          lVar5 = plVar11[-1];
          if (lVar5 != 0) {
            lVar8 = *plVar11;
            uVar6 = 1;
            uStack_8 = 0x1f94a4;
            register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
            unaff_x29 = puVar3 + 0xc0;
            goto code_r0x00187bd4;
          }
          plVar11 = plVar11 + 3;
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
      }
    }
    if (plVar4[2] == 0) {
      return;
    }
    lVar8 = plVar4[3];
    lVar5 = plVar4[2] * 0x18;
    uVar6 = 8;
  }
  else {
    func_0x00430058(lVar8);
    lVar5 = 0x40;
    uVar6 = 8;
    uStack_8 = 0x1f9430;
    register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
    unaff_x29 = puVar3 + 0xc0;
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar8,lVar5,uVar6);
  return;
}

