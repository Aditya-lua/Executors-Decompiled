
/* WARNING: Possible PIC construction at 0x0016de20: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0016deb8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0016debc) */

void FUN_0016dddc(undefined8 param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  undefined1 *puVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  long unaff_x19;
  ulong uVar10;
  long unaff_x21;
  long lVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined1 *unaff_x29;
  undefined1 auStack_d0 [128];
  undefined8 uStack_8;
  
  if (param_2 == 0) {
    func_0x0016de34(unaff_x19 + unaff_x21);
    lVar7 = __Unwind_Resume();
    uStack_8 = 0x16de34;
    puVar5 = auStack_d0;
    uVar12 = *(ulong *)(lVar7 + 0x28);
    uVar10 = *(ulong *)(lVar7 + 0x10);
    if (uVar12 != 0) {
      lVar3 = *(long *)(lVar7 + 0x18);
      uVar4 = *(ulong *)(lVar7 + 0x20);
      uVar1 = 0;
      if (uVar10 <= uVar4) {
        uVar1 = uVar10;
      }
      lVar9 = uVar4 - uVar1;
      uVar14 = uVar10 - lVar9;
      lVar11 = 0;
      if (uVar14 <= uVar12) {
        lVar11 = uVar12 - uVar14;
      }
      uVar2 = uVar10;
      if (uVar12 <= uVar14) {
        uVar2 = lVar9 + uVar12;
      }
      lVar9 = uVar2 - lVar9;
      if (lVar9 != 0) {
        puVar13 = (undefined8 *)(uVar4 * 0x18 + uVar1 * -0x18 + lVar3 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
      }
      if (uVar14 < uVar12) {
        puVar13 = (undefined8 *)(lVar3 + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0) {
            uVar6 = *puVar13;
            uVar8 = 1;
            uStack_8 = 0x16debc;
            register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
            unaff_x29 = puVar5 + 0xc0;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
      }
    }
    if (uVar10 == 0) {
      return;
    }
    uVar6 = *(undefined8 *)(lVar7 + 0x18);
    param_2 = uVar10 * 0x18;
    uVar8 = 8;
  }
  else {
    uVar6 = *(undefined8 *)(unaff_x19 + 0x468);
    uVar8 = 1;
    uStack_8 = 0x16de24;
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar6,param_2,uVar8);
  return;
}

