
/* WARNING: Possible PIC construction at 0x004a7a1c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004a7a20) */

void FUN_004a7950(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 *puVar10;
  undefined1 *unaff_x29;
  undefined1 auVar11 [16];
  undefined1 auStack_90 [8];
  undefined8 uStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 *puStack_70;
  long lStack_68;
  undefined8 uStack_8;
  
  auVar11 = __Unwind_Resume();
  uVar6 = auVar11._8_8_;
  uStack_88 = auVar11._0_8_;
  uStack_8 = (undefined *)0x4a7958;
  puVar2 = auStack_90;
  func_0x005dad2c(&lStack_78);
  puVar4 = puStack_70;
  lStack_80 = lStack_78;
  if (lStack_68 != 0) {
    puVar1 = puStack_70 + lStack_68;
    puVar5 = puStack_70;
    do {
      puVar10 = puVar5 + 1;
      if (*(long *)*puVar5 == -0x7ffffffffffffffe) {
        func_0x005cf324(&lStack_78,(long *)*puVar5 + 1);
        puVar5 = puStack_70;
        lVar3 = lStack_78;
        lVar9 = lStack_68 * 8;
        for (lVar7 = 0; lVar9 != lVar7; lVar7 = lVar7 + 8) {
          uVar8 = *(undefined8 *)((long)puVar5 + lVar7);
          func_0x004aff18(uVar6,uVar8);
          func_0x004af888(uVar8,uVar6);
        }
        if (lVar3 != 0) {
          uStack_8 = &UNK_004a7a20;
          register0x00000008 = (BADSPACEBASE *)auStack_90;
          unaff_x29 = puVar2 + 0x80;
          lStack_78 = lVar3;
          goto code_r0x00187bd4;
        }
      }
      puVar5 = puVar10;
    } while (puVar10 != puVar1);
  }
  if (lStack_80 != 0) {
    func_0x00187bd4(puVar4,lStack_80 << 3,8);
  }
  func_0x005dadec(&lStack_78,uStack_88);
  for (lVar7 = 0; lStack_68 * 8 != lVar7; lVar7 = lVar7 + 8) {
    uVar8 = *(undefined8 *)((long)puStack_70 + lVar7);
    func_0x004aa3a8(uVar6,uVar8);
    func_0x004a9af0(uVar8,uVar6);
  }
  if (lStack_78 == 0) {
    return;
  }
  puVar5 = puStack_70;
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(puVar5,lStack_78 << 3,8);
  return;
}

