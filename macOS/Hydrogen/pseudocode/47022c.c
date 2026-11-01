
ulong FUN_0047022c(undefined1 param_1 [16])

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  int *piVar8;
  long lVar9;
  ulong uVar10;
  uint *puVar11;
  uint *puVar12;
  ulong unaff_x19;
  uint *unaff_x20;
  undefined8 *unaff_x21;
  uint *unaff_x22;
  long unaff_x23;
  ulong uVar13;
  bool bVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  
  uVar16 = param_1._8_8_;
  uVar15 = param_1._0_8_;
  unaff_x21[0xd] = uVar16;
  unaff_x21[0xc] = uVar15;
  unaff_x21[0xf] = uVar16;
  unaff_x21[0xe] = uVar15;
  unaff_x21[9] = uVar16;
  unaff_x21[8] = uVar15;
  unaff_x21[0xb] = uVar16;
  unaff_x21[10] = uVar15;
  unaff_x21[5] = uVar16;
  unaff_x21[4] = uVar15;
  unaff_x21[7] = uVar16;
  unaff_x21[6] = uVar15;
  unaff_x21[1] = uVar16;
  *unaff_x21 = uVar15;
  unaff_x21[3] = uVar16;
  unaff_x21[2] = uVar15;
  *(undefined8 *)(unaff_x20 + 2) = uVar16;
  *(undefined8 *)unaff_x20 = uVar15;
  *(undefined8 *)(unaff_x20 + 6) = uVar16;
  *(undefined8 *)(unaff_x20 + 4) = uVar15;
  *(undefined8 *)(unaff_x20 + 10) = uVar16;
  *(undefined8 *)(unaff_x20 + 8) = uVar15;
  *(undefined8 *)(unaff_x20 + 0xe) = uVar16;
  *(undefined8 *)(unaff_x20 + 0xc) = uVar15;
  *(undefined8 *)(unaff_x20 + 0x12) = uVar16;
  *(undefined8 *)(unaff_x20 + 0x10) = uVar15;
  *(undefined8 *)(unaff_x20 + 0x16) = uVar16;
  *(undefined8 *)(unaff_x20 + 0x14) = uVar15;
  *(undefined8 *)(unaff_x20 + 0x1a) = uVar16;
  *(undefined8 *)(unaff_x20 + 0x18) = uVar15;
  *(undefined8 *)(unaff_x20 + 0x1e) = uVar16;
  *(undefined8 *)(unaff_x20 + 0x1c) = uVar15;
  *(undefined8 *)(unaff_x20 + 0x22) = uVar16;
  *(undefined8 *)(unaff_x20 + 0x20) = uVar15;
  *(undefined8 *)(unaff_x20 + 0x26) = uVar16;
  *(undefined8 *)(unaff_x20 + 0x24) = uVar15;
  *(ulong *)(unaff_x20 + 0x28) = unaff_x19;
  unaff_x21[0x14] = 1;
  uVar6 = *(ulong *)(unaff_x23 + 0xa0);
  if (uVar6 < 0x29) {
    piVar8 = (int *)(unaff_x23 + uVar6 * 4);
    lVar9 = uVar6 * -4;
    uVar7 = uVar6 << 5 ^ 0xffffffffffffffff;
    do {
      if (lVar9 == 0) {
        return uVar6;
      }
      piVar8 = piVar8 + -1;
      lVar9 = lVar9 + 4;
      uVar7 = uVar7 + 0x20;
    } while (*piVar8 == 0);
    if (*piVar8 != 0) {
      uVar7 = ((uint)LZCOUNT(*piVar8) ^ 0x1f) - uVar7;
      if (uVar7 != 0) {
        bVar14 = true;
        do {
          uVar13 = uVar7 - 1;
          func_0x0046f88c();
          uVar6 = uVar13 >> 5;
          if (0x500 < uVar7) goto LAB_0047042c;
          *unaff_x20 = *(uint *)(unaff_x23 + uVar6 * 4) >> (ulong)((uint)uVar13 & 0x1f) & 1 |
                       *unaff_x20;
          uVar7 = unaff_x19;
          if (unaff_x19 <= *(ulong *)(unaff_x20 + 0x28)) {
            uVar7 = *(ulong *)(unaff_x20 + 0x28);
          }
          if (0x28 < uVar7) {
            func_0x007a28b0(uVar7,0x28,&UNK_009e0b68);
LAB_004703cc:
            func_0x007a247c(&UNK_00894d89,0x1a,&UNK_009e0b68);
            uVar6 = func_0x007a28b0();
            goto LAB_004703f8;
          }
          lVar9 = uVar7 << 2;
          do {
            if (lVar9 == 0) goto LAB_00470368;
            uVar2 = *(uint *)((long)unaff_x20 + lVar9 + -4);
            uVar3 = *(uint *)((long)unaff_x22 + lVar9 + -4);
            lVar9 = lVar9 + -4;
          } while (uVar2 == uVar3);
          if (uVar3 <= uVar2) {
LAB_00470368:
            uVar10 = uVar7;
            puVar11 = unaff_x20;
            puVar12 = unaff_x22;
            bVar4 = true;
            do {
              uVar2 = *puVar11;
              uVar3 = ~*puVar12;
              bVar1 = CARRY4(uVar2 + uVar3,(uint)bVar4);
              *puVar11 = uVar3 + uVar2 + (uint)bVar4;
              uVar10 = uVar10 - 1;
              puVar11 = puVar11 + 1;
              puVar12 = puVar12 + 1;
              bVar4 = CARRY4(uVar2,uVar3) || bVar1;
            } while (uVar10 != 0);
            if (!CARRY4(uVar2,uVar3) && !bVar1) goto LAB_004703cc;
            *(ulong *)(unaff_x20 + 0x28) = uVar7;
            if (bVar14) {
              unaff_x21[0x14] = uVar6 + 1;
            }
            bVar14 = false;
            *(uint *)((long)unaff_x21 + uVar6 * 4) =
                 *(uint *)((long)unaff_x21 + uVar6 * 4) | 1 << ((uint)uVar13 & 0x1f);
          }
          uVar7 = uVar13;
        } while (uVar13 != 0);
      }
      return uVar6;
    }
  }
  else {
LAB_004703f8:
    func_0x007a28b0(uVar6,0x28,&UNK_009e0b68);
  }
  func_0x007a20e8(&UNK_009e0b68);
  uVar6 = func_0x007a247c(&UNK_00894ddb,0x1e,&UNK_009e0b68);
LAB_0047042c:
  auVar17 = func_0x007a2570(uVar6,0x28,&UNK_009e0b68);
  iVar5 = _memcmp(auVar17._0_8_,auVar17._8_8_,0xa0);
  return (ulong)(iVar5 == 0);
}

