
/* WARNING: Possible PIC construction at 0x004a7604: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004a76d4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004a76d8) */

void FUN_004a75f0(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 *puVar10;
  undefined8 *puVar9;
  undefined1 *unaff_x29;
  undefined1 auVar11 [16];
  long in_stack_00000010;
  undefined1 auStack_90 [8];
  undefined8 uStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 *puStack_70;
  long lStack_68;
  undefined8 uStack_8;
  
  if (in_stack_00000010 == 0) {
    auVar11 = __Unwind_Resume();
    uVar5 = auVar11._8_8_;
    uStack_88 = auVar11._0_8_;
    uStack_8 = (undefined *)0x4a7610;
    puVar2 = auStack_90;
    func_0x005dba30(&lStack_78);
    puVar4 = puStack_70;
    lStack_80 = lStack_78;
    if (lStack_68 != 0) {
      puVar1 = puStack_70 + lStack_68;
      puVar9 = puStack_70;
      do {
        puVar10 = puVar9 + 1;
        if (*(long *)*puVar9 == -0x7ffffffffffffffe) {
          func_0x005cf324(&lStack_78,(long *)*puVar9 + 1);
          puVar9 = puStack_70;
          lVar3 = lStack_78;
          lVar8 = lStack_68 * 8;
          for (lVar6 = 0; lVar8 != lVar6; lVar6 = lVar6 + 8) {
            uVar7 = *(undefined8 *)((long)puVar9 + lVar6);
            func_0x004aff18(uVar5,uVar7);
            func_0x004af888(uVar7,uVar5);
          }
          if (lVar3 != 0) {
            uStack_8 = &UNK_004a76d8;
            register0x00000008 = (BADSPACEBASE *)auStack_90;
            unaff_x29 = puVar2 + 0x80;
            goto code_r0x00187bd4;
          }
        }
        puVar9 = puVar10;
      } while (puVar10 != puVar1);
    }
    if (lStack_80 != 0) {
      func_0x00187bd4(puVar4,lStack_80 << 3,8);
    }
    func_0x005dbb64(&lStack_78,uStack_88);
    for (lVar6 = 0; lStack_68 * 8 != lVar6; lVar6 = lVar6 + 8) {
      uVar7 = *(undefined8 *)((long)puStack_70 + lVar6);
      func_0x004aa3a8(uVar5,uVar7);
      func_0x004a9af0(uVar7,uVar5);
    }
    if (lStack_78 == 0) {
      return;
    }
  }
  else {
    uStack_8 = (undefined *)0x4a7608;
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

