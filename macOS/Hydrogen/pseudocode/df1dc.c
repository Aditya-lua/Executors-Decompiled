
void FUN_000df1dc(void)

{
  long lVar1;
  undefined4 *puVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  long *plVar6;
  undefined4 uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  float fVar11;
  undefined8 uVar12;
  ulong uVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  lVar8 = lRam0000000000a334c0;
  lVar9 = *(long *)(lRam0000000000a334c0 + 0x4000);
  if ((*(int *)(&UNK_00003fd0 + lRam0000000000a334c0) < 2) &&
     ((&UNK_00003f65)[lRam0000000000a334c0] != '\0')) {
    return;
  }
  lVar10 = lVar9;
  if (*(long *)(lVar9 + 0x1b8) != 0) {
    func_0x00135d60();
    lVar10 = *(long *)(lRam0000000000a334c0 + 0x4000);
  }
  *(undefined1 *)(lVar10 + 0xc0) = 1;
  func_0x000f0b24(*(undefined8 *)(lVar10 + 0x2a8));
  lVar1 = *(long *)(*(long *)(lVar10 + 0x2a8) + 0x60) +
          (long)*(int *)(*(long *)(lVar10 + 0x2a8) + 0x58) * 0x10;
  uVar12 = *(undefined8 *)(lVar1 + -0x10);
  *(undefined8 *)(lVar10 + 0x250) = *(undefined8 *)(lVar1 + -8);
  *(undefined8 *)(lVar10 + 0x248) = uVar12;
  lVar10 = lRam0000000000a334c0;
  iVar3 = *(int *)(&UNK_00004aa0 + lRam0000000000a334c0);
  if (iVar3 != 0) {
    puVar2 = (undefined4 *)(&UNK_00004978 + lRam0000000000a334c0);
    *(int *)(&UNK_00004aa0 + lRam0000000000a334c0) = iVar3 + -1;
    if (iVar3 + -1 == 0) {
      uVar7 = 0;
    }
    else {
      uVar7 = *(undefined4 *)
               (*(long *)(&UNK_00004aa8 + lVar10) +
               (-(ulong)(iVar3 - 2U >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar3 - 2U) << 3));
    }
    *puVar2 = uVar7;
  }
  if ((*(byte *)(lVar9 + 0x17) & 1) == 0) {
    func_0x000d2c88();
  }
  if (*(char *)(lVar9 + 0x151) != '\0') {
    lVar10 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar10 + 0x151) = 0;
    uVar13 = *(ulong *)(lVar10 + 0x128);
    uVar15 = *(ulong *)(lVar10 + 0x110);
    *(ulong *)(lVar10 + 0x128) =
         uVar13 ^ (uVar13 ^ uVar15) &
                  ~CONCAT44(-(uint)((float)(uVar15 >> 0x20) <= (float)(uVar13 >> 0x20)),
                            -(uint)((float)uVar15 <= (float)uVar13));
  }
  iVar3 = *(int *)(&UNK_00003fd0 + lVar8);
  iVar5 = iVar3 + -1;
  lVar10 = *(long *)(&UNK_00003fd8 + lVar8) + (long)iVar5 * 0x68;
  uVar12 = *(undefined8 *)(lVar10 + 8);
  *(undefined8 *)(&UNK_000049b0 + lVar8) = *(undefined8 *)(lVar10 + 0x10);
  *(undefined8 *)(&UNK_000049a8 + lVar8) = uVar12;
  uVar14 = *(undefined8 *)(lVar10 + 0x30);
  uVar12 = *(undefined8 *)(lVar10 + 0x28);
  uVar17 = *(undefined8 *)(lVar10 + 0x40);
  uVar16 = *(undefined8 *)(lVar10 + 0x38);
  uVar18 = *(undefined8 *)(lVar10 + 0x44);
  uVar20 = *(undefined8 *)(lVar10 + 0x20);
  uVar19 = *(undefined8 *)(lVar10 + 0x18);
  *(undefined8 *)(&UNK_000049ec + lVar8) = *(undefined8 *)(lVar10 + 0x4c);
  *(undefined8 *)(&UNK_000049e4 + lVar8) = uVar18;
  *(undefined8 *)(&UNK_000049d0 + lVar8) = uVar14;
  *(undefined8 *)(&UNK_000049c8 + lVar8) = uVar12;
  *(undefined8 *)(&UNK_000049e0 + lVar8) = uVar17;
  *(undefined8 *)(&UNK_000049d8 + lVar8) = uVar16;
  *(undefined8 *)(&UNK_000049c0 + lVar8) = uVar20;
  *(undefined8 *)(&UNK_000049b8 + lVar8) = uVar19;
  uVar4 = *(uint *)(lVar9 + 0x14);
  if ((uVar4 >> 0x1c & 1) != 0) {
    *(int *)(&UNK_00004b00 + lVar8) = *(int *)(&UNK_00004b00 + lVar8) + -1;
  }
  if ((uVar4 >> 0x1a & 1) == 0) {
    *(int *)(&UNK_00003fd0 + lVar8) = iVar5;
    lVar9 = lRam0000000000a334c0;
  }
  else {
    *(int *)(&UNK_00004ae0 + lVar8) = *(int *)(&UNK_00004ae0 + lVar8) + -1;
    *(int *)(&UNK_00003fd0 + lVar8) = iVar5;
    lVar9 = lRam0000000000a334c0;
  }
  lRam0000000000a334c0 = lVar9;
  if (iVar5 == 0) {
    *(undefined8 *)(lVar9 + 0x4000) = 0;
  }
  else {
    plVar6 = *(long **)(*(long *)(&UNK_00003fd8 + lVar8) + (long)(iVar3 + -2) * 0x68);
    *(long **)(lVar9 + 0x4000) = plVar6;
    if (plVar6 != (long *)0x0) {
      if ((int)plVar6[0x38] == -1) {
        lVar8 = 0;
      }
      else {
        lVar8 = *(long *)(&UNK_00004e40 + lVar9) + (long)(int)plVar6[0x38] * 0x250;
      }
      *(long *)(&UNK_00004e18 + lVar9) = lVar8;
      fVar11 = *(float *)(&UNK_00003d3c + *plVar6) * *(float *)(plVar6 + 0x54);
      if (plVar6[0x6f] != 0) {
        fVar11 = fVar11 * *(float *)(plVar6[0x6f] + 0x2a0);
      }
      *(float *)(&UNK_00003d50 + lVar9) = fVar11;
      *(float *)(&UNK_00003d38 + lVar9) = fVar11;
      if (lVar8 == 0) {
        *(bool *)(plVar6 + 0x2e) = plVar6[0x37] == 0;
        return;
      }
      *(undefined1 *)(plVar6 + 0x2e) = 0;
      return;
    }
  }
  *(undefined8 *)(&UNK_00004e18 + lVar9) = 0;
  return;
}

