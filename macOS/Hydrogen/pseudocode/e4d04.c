
/* WARNING: Possible PIC construction at 0x000e52ec: Changing call to branch */

void FUN_000e4d04(long param_1)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  undefined8 extraout_x1;
  undefined8 uVar6;
  undefined8 extraout_x1_00;
  uint uVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong unaff_x22;
  long lVar10;
  long unaff_x29;
  undefined1 auVar11 [12];
  undefined1 uStack00000000000000a0;
  undefined8 uStack00000000000000a8;
  
  uStack00000000000000a8 = *(undefined8 *)(param_1 + 0x358);
  _uStack00000000000000a0 = *(undefined8 *)(param_1 + 0x350);
  func_0x0010ae94(&uStack00000000000000a0,"CURRENTLY APPENDING");
  if ((unaff_x22 & 1) == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
      return;
    }
    auVar11 = ___stack_chk_fail();
    if (auVar11._8_4_ == 0) {
      __Unwind_Resume(auVar11._0_8_);
    }
    lVar5 = func_0x0001753c(auVar11._0_8_);
    func_0x001237f8(1,2);
    iVar3 = func_0x001226d4("viewport0","Viewport #%d");
    if (iVar3 == 0) {
      return;
    }
    func_0x0010b3a8(
                   "Main Pos: (%.0f,%.0f), Size: (%.0f,%.0f)\nWorkArea Offset Left: %.0f Top: %.0f, Right: %.0f, Bottom: %.0f"
                   );
    func_0x0010b3a8("Flags: 0x%04X =%s%s%s");
    if (*(int *)(lVar5 + 0x58) != 0) {
      lVar9 = (long)*(int *)(lVar5 + 0x58) << 3;
      uVar6 = extraout_x1;
      puVar8 = *(undefined8 **)(lVar5 + 0x60);
      do {
        func_0x000e4b74(0,uVar6,*puVar8,"DrawList");
        lVar9 = lVar9 + -8;
        uVar6 = extraout_x1_00;
        puVar8 = puVar8 + 1;
      } while (lVar9 != 0);
    }
  }
  lVar5 = lRam0000000000a334c0;
  lVar9 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar7 = *(int *)(lVar9 + 0x198) - 1;
  *(uint *)(lVar9 + 0x198) = uVar7;
  uVar2 = 1 << (ulong)(uVar7 & 0x1f);
  uVar7 = *(uint *)(lVar9 + 0x19c);
  if ((uVar7 & uVar2) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar5);
    if ((((&UNK_00004b78)[lVar5] != '\0') && (*(int *)(&UNK_00004bd0 + lVar5) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar5) == lVar9)) {
      lVar10 = *(long *)(&UNK_00004af8 + lVar5);
      iVar3 = *piVar1;
      iVar4 = func_0x000daf30();
      if (iVar4 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar5,lVar10 + (long)iVar3 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar7 = *(uint *)(lVar9 + 0x19c);
  }
  *(uint *)(lVar9 + 0x19c) = uVar7 & uVar2 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

