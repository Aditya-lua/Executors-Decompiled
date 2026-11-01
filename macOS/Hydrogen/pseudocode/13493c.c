
/* WARNING: Possible PIC construction at 0x00134de8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00134e28: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00134dec) */
/* WARNING: Removing unreachable block (ram,0x00134e34) */
/* WARNING: Removing unreachable block (ram,0x00134e04) */
/* WARNING: Removing unreachable block (ram,0x00134e2c) */
/* WARNING: Removing unreachable block (ram,0x00134e30) */

void FUN_0013493c(undefined8 param_1)

{
  int *piVar1;
  undefined4 *puVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  uint uVar7;
  ulong uVar8;
  long lVar9;
  undefined4 *unaff_x19;
  long unaff_x22;
  long lVar10;
  long *unaff_x25;
  long lVar11;
  undefined8 uStack0000000000000120;
  undefined8 uStack0000000000000128;
  undefined1 uStack0000000000000130;
  
  iVar4 = func_0x000e5cd8(param_1,"in BeginTable()");
  if (iVar4 != 0) {
    *(undefined4 *)(&UNK_00004e20 + unaff_x22) = *unaff_x19;
  }
  func_0x000d8444(0,0xbf800000);
  iVar4 = func_0x0010beb8("Clear settings");
  func_0x0010b3a8("OuterRect: Pos: (%.1f,%.1f) Size: (%.1f,%.1f) Sizing: \'%s\'");
  func_0x0010b3a8("ColumnsGivenWidth: %.1f, ColumnsAutoFitWidth: %.1f, InnerWidth: %.1f%s");
  func_0x0010b3a8("CellPaddingX: %.1f, CellSpacingX: %.1f/%.1f, OuterPaddingX: %.1f");
  func_0x0010b3a8("HoveredColumnBody: %d, HoveredColumnBorder: %d");
  func_0x0010b3a8("ResizedColumn: %d, ReorderColumn: %d, HeldHeaderColumn: %d");
  if ((-1 < *(short *)(unaff_x19 + 0x1e)) &&
     (func_0x0010b3a8("Instance %d: HoveredRow: %d, LastOuterHeight: %.2f"),
     0 < *(short *)(unaff_x19 + 0x1e))) {
    lVar10 = 0;
    do {
      lVar10 = lVar10 + 1;
      func_0x0010b3a8("Instance %d: HoveredRow: %d, LastOuterHeight: %.2f");
    } while (lVar10 < *(short *)(unaff_x19 + 0x1e));
  }
  uVar7 = unaff_x19[0x1b];
  uVar8 = (ulong)uVar7;
  if (0 < (int)uVar7) {
    do {
      uVar8 = uVar8 - 1;
    } while (uVar8 != 0);
    lVar11 = 0;
    lVar10 = 0;
    do {
      lVar9 = *(long *)(unaff_x19 + 6);
      func_0x000b875c(&uStack0000000000000130,0x200,
                      "Column %d order %d \'%s\': offset %+.2f to %+.2f%s\nEnabled: %d, VisibleX/Y: %d/%d, RequestOutput: %d, SkipItems: %d, DrawChannels: %d,%d\nWidthGiven: %.1f, Request/Auto: %.1f/%.1f, StretchWeight: %.3f (%.1f%%)\nMinX: %.1f, MaxX: %.1f (%+.1f), ClipRect: %.1f to %.1f (+%.1f)\nContentWidth: %.1f,%.1f, HeadersUsed/Ideal %.1f/%.1f\nSort: %d%s, UserID: 0x%08X, Flags: 0x%04X: %s%s%s.."
                     );
      func_0x0010da88();
      uStack0000000000000120 = 0;
      func_0x0010f27c(&uStack0000000000000130,0,0,&uStack0000000000000120);
      iVar5 = func_0x000c2648(0);
      if (iVar5 != 0) {
        uStack0000000000000128._0_4_ = *(undefined4 *)(lVar9 + lVar11 + 0xc);
        uStack0000000000000128._4_4_ = unaff_x19[0x3f];
        uStack0000000000000120 = CONCAT44(unaff_x19[0x3d],*(undefined4 *)(lVar9 + lVar11 + 8));
        uVar6 = func_0x000c2b9c();
        func_0x000f3af4(0,0x3f800000,uVar6,&uStack0000000000000120,&uStack0000000000000128,
                        0xff00ffff,0);
      }
      lVar10 = lVar10 + 1;
      uVar7 = unaff_x19[0x1b];
      lVar11 = lVar11 + 0x70;
    } while (lVar10 < (int)uVar7);
    unaff_x25 = (long *)0xa334c0;
  }
  if (unaff_x19[0x19] != -1) {
    puVar2 = (undefined4 *)(*(long *)(&UNK_00005f98 + *unaff_x25) + (long)(int)unaff_x19[0x19]);
    if ((int)uVar7 <= (int)*(short *)((long)puVar2 + 0xe)) {
      iVar4 = func_0x001227f4(*puVar2,"Settings 0x%08X (%d columns)");
      if (iVar4 == 0) {
        return;
      }
      func_0x0010b3a8("SaveFlags: 0x%08X");
      func_0x0010b3a8("ColumnsCount: %d (max %d)");
      if (0 < *(short *)(puVar2 + 3)) {
        lVar10 = 0;
        do {
          func_0x0010b3a8("Column %d Order %d SortOrder %d %s Vis %d %s %7.3f UserID 0x%08X");
          lVar10 = lVar10 + 1;
        } while (lVar10 < *(short *)(puVar2 + 3));
      }
      goto code_r0x00123710;
    }
    *puVar2 = 0;
  }
  if (iVar4 != 0) {
    *(undefined1 *)(unaff_x19 + 0x90) = 1;
  }
code_r0x00123710:
  lVar10 = lRam0000000000a334c0;
  lVar11 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar7 = *(int *)(lVar11 + 0x198) - 1;
  *(uint *)(lVar11 + 0x198) = uVar7;
  uVar3 = 1 << (ulong)(uVar7 & 0x1f);
  uVar7 = *(uint *)(lVar11 + 0x19c);
  if ((uVar7 & uVar3) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar10);
    if ((((&UNK_00004b78)[lVar10] != '\0') && (*(int *)(&UNK_00004bd0 + lVar10) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar10) == lVar11)) {
      lVar9 = *(long *)(&UNK_00004af8 + lVar10);
      iVar4 = *piVar1;
      iVar5 = func_0x000daf30();
      if (iVar5 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar10,lVar9 + (long)iVar4 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar7 = *(uint *)(lVar11 + 0x19c);
  }
  *(uint *)(lVar11 + 0x19c) = uVar7 & uVar3 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

