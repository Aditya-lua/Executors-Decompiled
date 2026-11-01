
/* WARNING: Possible PIC construction at 0x00134de8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00134e28: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00134e2c) */
/* WARNING: Removing unreachable block (ram,0x00134e30) */

void FUN_001347c4(undefined1 param_1 [16],undefined4 param_2,undefined4 *param_3)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  undefined4 *puVar7;
  uint uVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  undefined4 uVar13;
  undefined8 uStack_220;
  uint uStack_218;
  undefined4 uStack_214;
  undefined4 uStack_210;
  undefined4 uStack_20c;
  long lStack_10;
  
  lVar11 = lRam0000000000a334c0;
  lStack_10 = *(long *)PTR____stack_chk_guard_009b01e8;
  iVar4 = param_3[0x1a];
  iVar5 = *(int *)(&UNK_00003f58 + lRam0000000000a334c0);
  if (iVar4 < iVar5 + -2) {
    uVar6 = func_0x000bbba8(1);
    func_0x000bbcfc(0,uVar6);
  }
  iVar3 = func_0x001227f4(param_3,"Table 0x%08X (%d columns, in \'%s\')%s");
  if (iVar4 < iVar5 + -2) {
    func_0x000bbdd0(1);
    iVar4 = func_0x000c2648(0);
    if (iVar4 == 0) goto LAB_00134870;
LAB_00134890:
    uVar6 = func_0x000c2b9c();
    param_2 = 0x3f800000;
    func_0x000f3af4(0,uVar6,param_3 + 0x3c,param_3 + 0x3e,0xff00ffff,0);
    iVar4 = func_0x000cff94();
  }
  else {
    iVar4 = func_0x000c2648(0);
    if (iVar4 != 0) goto LAB_00134890;
LAB_00134870:
    iVar4 = func_0x000cff94();
  }
  if ((iVar4 != 0) && (*(short *)((long)param_3 + 0x20a) != -1)) {
    uVar6 = func_0x000c2b9c();
    uStack_210 = func_0x000d0068();
    uStack_20c = param_2;
    uVar13 = func_0x000d0080();
    uStack_220 = CONCAT44(param_2,uVar13);
    func_0x000f3af4(0,0x3f800000,uVar6,&uStack_210,&uStack_220,0xff00ffff,0);
  }
  if (iVar3 == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_10) {
      return;
    }
    puVar7 = (undefined4 *)___stack_chk_fail();
code_r0x00134e38:
    iVar4 = func_0x001227f4(*puVar7,"Settings 0x%08X (%d columns)");
    if (iVar4 == 0) {
      return;
    }
    func_0x0010b3a8("SaveFlags: 0x%08X");
    func_0x0010b3a8("ColumnsCount: %d (max %d)");
    if (0 < *(short *)(puVar7 + 3)) {
      lVar11 = 0;
      do {
        func_0x0010b3a8("Column %d Order %d SortOrder %d %s Vis %d %s %7.3f UserID 0x%08X");
        lVar11 = lVar11 + 1;
      } while (lVar11 < *(short *)(puVar7 + 3));
    }
  }
  else {
    if (0 < *(short *)(param_3 + 0x1e)) {
      func_0x0010adc0("** %d instances of same table! Some data below will refer to last instance.")
      ;
    }
    if (*(char *)(lVar11 + 0x78) != '\0') {
      iVar4 = func_0x000e5cd8("**DebugBreak**","in BeginTable()");
      if (iVar4 != 0) {
        *(undefined4 *)(&UNK_00004e20 + lVar11) = *param_3;
      }
      func_0x000d8444(0,0xbf800000);
    }
    iVar4 = func_0x0010beb8("Clear settings");
    func_0x0010b3a8("OuterRect: Pos: (%.1f,%.1f) Size: (%.1f,%.1f) Sizing: \'%s\'");
    func_0x0010b3a8("ColumnsGivenWidth: %.1f, ColumnsAutoFitWidth: %.1f, InnerWidth: %.1f%s");
    func_0x0010b3a8("CellPaddingX: %.1f, CellSpacingX: %.1f/%.1f, OuterPaddingX: %.1f");
    func_0x0010b3a8("HoveredColumnBody: %d, HoveredColumnBorder: %d");
    func_0x0010b3a8("ResizedColumn: %d, ReorderColumn: %d, HeldHeaderColumn: %d");
    if ((-1 < *(short *)(param_3 + 0x1e)) &&
       (func_0x0010b3a8("Instance %d: HoveredRow: %d, LastOuterHeight: %.2f"),
       0 < *(short *)(param_3 + 0x1e))) {
      lVar11 = 0;
      do {
        lVar11 = lVar11 + 1;
        func_0x0010b3a8("Instance %d: HoveredRow: %d, LastOuterHeight: %.2f");
      } while (lVar11 < *(short *)(param_3 + 0x1e));
    }
    uVar8 = param_3[0x1b];
    uVar9 = (ulong)uVar8;
    if (0 < (int)uVar8) {
      do {
        uVar9 = uVar9 - 1;
      } while (uVar9 != 0);
      lVar12 = 0;
      lVar11 = 0;
      do {
        lVar10 = *(long *)(param_3 + 6);
        func_0x000b875c(&uStack_210,0x200,
                        "Column %d order %d \'%s\': offset %+.2f to %+.2f%s\nEnabled: %d, VisibleX/Y: %d/%d, RequestOutput: %d, SkipItems: %d, DrawChannels: %d,%d\nWidthGiven: %.1f, Request/Auto: %.1f/%.1f, StretchWeight: %.3f (%.1f%%)\nMinX: %.1f, MaxX: %.1f (%+.1f), ClipRect: %.1f to %.1f (+%.1f)\nContentWidth: %.1f,%.1f, HeadersUsed/Ideal %.1f/%.1f\nSort: %d%s, UserID: 0x%08X, Flags: 0x%04X: %s%s%s.."
                       );
        func_0x0010da88();
        uStack_220 = 0;
        func_0x0010f27c(&uStack_210,0,0,&uStack_220);
        iVar5 = func_0x000c2648(0);
        if (iVar5 != 0) {
          uStack_218 = *(uint *)(lVar10 + lVar12 + 0xc);
          uStack_214 = param_3[0x3f];
          uStack_220 = CONCAT44(param_3[0x3d],*(undefined4 *)(lVar10 + lVar12 + 8));
          uVar6 = func_0x000c2b9c();
          func_0x000f3af4(0,0x3f800000,uVar6,&uStack_220,&uStack_218,0xff00ffff,0);
        }
        lVar11 = lVar11 + 1;
        uVar8 = param_3[0x1b];
        lVar12 = lVar12 + 0x70;
      } while (lVar11 < (int)uVar8);
    }
    if (param_3[0x19] != -1) {
      puVar7 = (undefined4 *)
               (*(long *)(&UNK_00005f98 + lRam0000000000a334c0) + (long)(int)param_3[0x19]);
      if ((int)uVar8 <= (int)*(short *)((long)puVar7 + 0xe)) goto code_r0x00134e38;
      *puVar7 = 0;
    }
    if (iVar4 != 0) {
      *(undefined1 *)(param_3 + 0x90) = 1;
    }
  }
  lVar11 = lRam0000000000a334c0;
  lVar12 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar8 = *(int *)(lVar12 + 0x198) - 1;
  *(uint *)(lVar12 + 0x198) = uVar8;
  uVar2 = 1 << (ulong)(uVar8 & 0x1f);
  uVar8 = *(uint *)(lVar12 + 0x19c);
  if ((uVar8 & uVar2) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar11);
    if ((((&UNK_00004b78)[lVar11] != '\0') && (*(int *)(&UNK_00004bd0 + lVar11) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar11) == lVar12)) {
      lVar10 = *(long *)(&UNK_00004af8 + lVar11);
      iVar4 = *piVar1;
      iVar5 = func_0x000daf30();
      if (iVar5 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar11,lVar10 + (long)iVar4 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar8 = *(uint *)(lVar12 + 0x19c);
  }
  *(uint *)(lVar12 + 0x19c) = uVar8 & uVar2 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

