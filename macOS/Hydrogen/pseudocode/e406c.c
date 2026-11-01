
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000e406c(void)

{
  undefined4 *puVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  float fVar3;
  float fVar4;
  int iVar5;
  float fVar6;
  int iVar9;
  undefined8 uVar7;
  undefined8 uVar8;
  float fVar10;
  ulong uVar11;
  ulong uVar12;
  float fVar13;
  float fVar14;
  ulong uVar15;
  
  func_0x00131154();
  func_0x0013275c();
  if (0 < *(int *)(unaff_x19 + 0x10)) {
    func_0x00131cb4();
    func_0x0010adc0("0x%08X");
    func_0x00131cb4();
    func_0x000e73a8();
    func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
    func_0x00131cb4();
    func_0x0010adc0("0x%08X");
    iVar5 = *(int *)(unaff_x19 + 0x10);
    if (iVar5 == 1) {
      lVar2 = *(long *)(unaff_x22 + 0x4c0);
      fVar3 = *(float *)(&UNK_00003b4c + lVar2);
      fVar10 = *(float *)(&UNK_00003b50 + lVar2);
      fVar13 = *(float *)(&UNK_00003b58 + lVar2) * *(float *)(&UNK_000038e8 + lVar2);
      fVar6 = 1.0;
      if (fVar3 <= 1.0) {
        fVar6 = fVar3;
      }
      fVar14 = 0.0;
      if (0.0 <= fVar3) {
        fVar14 = fVar6;
      }
      fVar3 = *(float *)(&UNK_00003b54 + lVar2);
      fVar6 = 1.0;
      if (fVar10 <= 1.0) {
        fVar6 = fVar10;
      }
      fVar4 = 0.0;
      if (0.0 <= fVar10) {
        fVar4 = fVar6;
      }
      iVar5 = -(uint)(fVar3 < 0.0);
      iVar9 = -(uint)(fVar13 < 0.0);
      uVar11 = NEON_fmov(0x3f800000,4);
      uVar11 = uVar11 ^ (uVar11 ^ CONCAT44(fVar13,fVar3)) &
                        ~CONCAT44(-(uint)((float)(uVar11 >> 0x20) < fVar13),
                                  -(uint)((float)uVar11 < fVar3));
      fVar6 = (float)CONCAT13((byte)(uVar11 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                              CONCAT12((byte)(uVar11 >> 0x10) & ~(byte)((uint)iVar5 >> 0x10),
                                       CONCAT11((byte)(uVar11 >> 8) & ~(byte)((uint)iVar5 >> 8),
                                                (byte)uVar11 & ~(byte)iVar5)));
      uVar7 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar11 >> 0x38) &
                                                        ~(byte)((uint)iVar9 >> 0x18),
                                                        CONCAT16((byte)(uVar11 >> 0x30) &
                                                                 ~(byte)((uint)iVar9 >> 0x10),
                                                                 CONCAT15((byte)(uVar11 >> 0x28) &
                                                                          ~(byte)((uint)iVar9 >> 8),
                                                                          CONCAT14((byte)(uVar11 >>
                                                                                         0x20) &
                                                                                   ~(byte)iVar9,
                                                                                   fVar6)))) >> 0x20
                                              ) * 255.0 + 0.5),(int)(fVar6 * 255.0 + 0.5)),
                        _UNK_0080c190,4);
      func_0x00131634(3,(int)(fVar14 * 255.0 + 0.5) | (int)(fVar4 * 255.0 + 0.5) << 8 | (uint)uVar7
                        | (uint)((ulong)uVar7 >> 0x20),0xffffffff);
      iVar5 = *(int *)(unaff_x19 + 0x10);
    }
    uVar7 = _UNK_0080c190;
    if (1 < iVar5) {
      uVar11 = 1;
      uVar15 = NEON_fmov(0x3f800000,4);
      do {
        func_0x00131cb4();
        func_0x0010adc0("0x%08X");
        func_0x00131cb4();
        func_0x000e73a8();
        func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
        func_0x00131cb4();
        func_0x0010adc0("0x%08X");
        iVar5 = *(int *)(unaff_x19 + 0x10);
        if (uVar11 == iVar5 - 1) {
          lVar2 = *(long *)(unaff_x22 + 0x4c0);
          fVar3 = *(float *)(&UNK_00003b4c + lVar2);
          fVar10 = *(float *)(&UNK_00003b50 + lVar2);
          fVar13 = *(float *)(&UNK_00003b54 + lVar2);
          fVar6 = 1.0;
          if (fVar3 <= 1.0) {
            fVar6 = fVar3;
          }
          fVar14 = 0.0;
          if (0.0 <= fVar3) {
            fVar14 = fVar6;
          }
          fVar3 = *(float *)(&UNK_00003b58 + lVar2) * *(float *)(&UNK_000038e8 + lVar2);
          fVar6 = 1.0;
          if (fVar10 <= 1.0) {
            fVar6 = fVar10;
          }
          fVar4 = 0.0;
          if (0.0 <= fVar10) {
            fVar4 = fVar6;
          }
          iVar5 = -(uint)(fVar13 < 0.0);
          iVar9 = -(uint)(fVar3 < 0.0);
          uVar12 = CONCAT44(fVar3,fVar13) ^
                   (CONCAT44(fVar3,fVar13) ^ uVar15) &
                   CONCAT44(-(uint)((float)(uVar15 >> 0x20) < fVar3),-(uint)((float)uVar15 < fVar13)
                           );
          fVar6 = (float)CONCAT13((byte)(uVar12 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                                  CONCAT12((byte)(uVar12 >> 0x10) & ~(byte)((uint)iVar5 >> 0x10),
                                           CONCAT11((byte)(uVar12 >> 8) & ~(byte)((uint)iVar5 >> 8),
                                                    (byte)uVar12 & ~(byte)iVar5)));
          uVar8 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar12 >> 0x38) &
                                                            ~(byte)((uint)iVar9 >> 0x18),
                                                            CONCAT16((byte)(uVar12 >> 0x30) &
                                                                     ~(byte)((uint)iVar9 >> 0x10),
                                                                     CONCAT15((byte)(uVar12 >> 0x28)
                                                                              & ~(byte)((uint)iVar9
                                                                                       >> 8),
                                                                              CONCAT14((byte)(uVar12
                                                                                             >> 0x20
                                                  ) & ~(byte)iVar9,fVar6)))) >> 0x20) * 255.0 + 0.5)
                                     ,(int)(fVar6 * 255.0 + 0.5)),uVar7,4);
          func_0x00131634(3,(int)(fVar14 * 255.0 + 0.5) | (int)(fVar4 * 255.0 + 0.5) << 8 |
                            (uint)uVar8 | (uint)((ulong)uVar8 >> 0x20),0xffffffff);
          iVar5 = *(int *)(unaff_x19 + 0x10);
        }
        uVar11 = uVar11 + 1;
      } while ((long)uVar11 < (long)iVar5);
    }
  }
  func_0x0012f400();
  func_0x000cea90();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x90)) {
    return;
  }
  ___stack_chk_fail();
  lVar2 = lRam0000000000a334c0;
  puVar1 = (undefined4 *)(&UNK_00004970 + lRam0000000000a334c0);
  *(undefined4 *)(lRam0000000000a334c0 + 0x3ffc) = 0;
  *(undefined4 *)(&UNK_00004e20 + lVar2) = 0;
  *puVar1 = 0;
  return;
}

