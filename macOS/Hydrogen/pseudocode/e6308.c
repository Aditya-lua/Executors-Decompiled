
void FUN_000e6308(undefined8 param_1,uint *param_2)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  long unaff_x19;
  float *pfVar7;
  long lVar8;
  long lVar9;
  float *pfVar10;
  float fVar11;
  float fVar12;
  double dStack0000000000000000;
  double dStack0000000000000008;
  double dStack0000000000000010;
  
  dStack0000000000000000 = (double)(ulong)*param_2;
  dStack0000000000000010 = (double)(ulong)*(uint *)(unaff_x19 + 4);
  dStack0000000000000008 = (double)param_1;
  iVar3 = func_0x001227f4(dStack0000000000000000,"Columns Id: 0x%08X, Count: %d, Flags: 0x%04X");
  if (iVar3 == 0) {
    return;
  }
  dStack0000000000000000 = (double)(*(float *)(unaff_x19 + 0x18) - *(float *)(unaff_x19 + 0x14));
  dStack0000000000000008 = (double)*(float *)(unaff_x19 + 0x14);
  dStack0000000000000010 = (double)*(float *)(unaff_x19 + 0x18);
  func_0x0010b3a8("Width: %.1f (MinX: %.1f, MaxX: %.1f)");
  if (*(int *)(unaff_x19 + 0x60) != 0) {
    pfVar7 = *(float **)(unaff_x19 + 0x68);
    lVar8 = (long)*(int *)(unaff_x19 + 0x60) * 0x1c;
    pfVar10 = pfVar7;
    do {
      lVar6 = *(long *)(unaff_x19 + 0x68);
      fVar11 = *pfVar10;
      fVar12 = (float)func_0x00134ff4();
      dStack0000000000000010 = (double)fVar12;
      dStack0000000000000000 = (double)(((long)pfVar7 - lVar6 >> 2) * 0x6db6db6db6db6db7);
      dStack0000000000000008 = (double)fVar11;
      func_0x0010b3a8("Column %02d: OffsetNorm %.3f (= %.1f px)");
      pfVar7 = pfVar7 + 7;
      lVar8 = lVar8 + -0x1c;
      pfVar10 = pfVar10 + 7;
    } while (lVar8 != 0);
  }
  lVar8 = lRam0000000000a334c0;
  lVar6 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar5 = *(int *)(lVar6 + 0x198) - 1;
  *(uint *)(lVar6 + 0x198) = uVar5;
  uVar2 = 1 << (ulong)(uVar5 & 0x1f);
  uVar5 = *(uint *)(lVar6 + 0x19c);
  if ((uVar5 & uVar2) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar8);
    if ((((&UNK_00004b78)[lVar8] != '\0') && (*(int *)(&UNK_00004bd0 + lVar8) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar8) == lVar6)) {
      lVar9 = *(long *)(&UNK_00004af8 + lVar8);
      iVar3 = *piVar1;
      iVar4 = func_0x000daf30();
      if (iVar4 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar8,lVar9 + (long)iVar3 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar5 = *(uint *)(lVar6 + 0x19c);
  }
  *(uint *)(lVar6 + 0x19c) = uVar5 & uVar2 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

