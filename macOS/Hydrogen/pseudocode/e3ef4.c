
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000e3ef4(long param_1,float param_2)

{
  char *pcVar1;
  undefined4 *puVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  char *pcVar7;
  code *pcVar8;
  char *pcVar9;
  char cVar10;
  undefined4 *unaff_x19;
  char *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  char *pcVar11;
  char *pcVar12;
  long unaff_x29;
  float fVar13;
  float fVar14;
  float fVar15;
  int iVar18;
  undefined8 uVar16;
  undefined8 uVar17;
  float fVar19;
  ulong uVar20;
  ulong uVar21;
  float fVar22;
  float fVar23;
  float unaff_s8;
  ulong uVar24;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  
  *(float *)(param_1 + 0x110) = param_2 + *(float *)(param_1 + 0x118);
  *(undefined4 *)(param_1 + 0x114) = *(undefined4 *)(param_1 + 0x11c);
  *(undefined8 *)(param_1 + 0x138) = *(undefined8 *)(param_1 + 0x140);
  *(undefined4 *)(param_1 + 0x148) = *(undefined4 *)(param_1 + 0x14c);
  *(undefined1 *)(param_1 + 0x150) = 1;
  fVar13 = (float)_fmodf(unaff_s8,0x3e800000);
  bVar3 = false;
  if ((0.0 <= unaff_s8) && (bVar3 = false, !NAN(unaff_s8))) {
    bVar3 = unaff_s8 < 0.75;
  }
  bVar4 = false;
  if ((bVar3) && (bVar4 = false, !NAN(fVar13))) {
    bVar4 = fVar13 < 0.125;
  }
  if (bVar4) {
    in_stack_00000018 = _UNK_0080c348;
    uStack0000000000000010 = _UNK_0080c340;
    func_0x0010ae94(&uStack0000000000000010,"*COPIED*");
    cVar10 = *unaff_x20;
  }
  else {
    uStack0000000000000010 = 0;
    in_stack_00000018 = 0;
    func_0x0010ae94(&uStack0000000000000010,"*COPIED*");
    cVar10 = *unaff_x20;
  }
  if (cVar10 != '\0') {
    lVar6 = *(long *)(unaff_x22 + 0x4c0);
    if ((((&UNK_000037c4)[lVar6] != '\0') && ((&UNK_000047e4)[lVar6] == '\0')) &&
       ((&UNK_000030a4)[lVar6] != '\0')) {
      fVar13 = *(float *)(&UNK_000030a8 + lVar6);
      if (0.0 <= fVar13) {
        if (fVar13 != 0.0) {
          fVar14 = *(float *)(lVar6 + 0x70);
          if ((fVar13 <= fVar14) || (fVar19 = fVar13 - *(float *)(lVar6 + 0x18), fVar13 <= fVar19))
          goto LAB_000e3fac;
          fVar22 = *(float *)(lVar6 + 0x74);
          if (fVar22 <= 0.0) {
            if ((fVar13 < fVar14) || (fVar14 <= fVar19)) goto LAB_000e3fac;
          }
          else {
            if (fVar14 <= fVar19) {
              iVar5 = (int)((fVar19 - fVar14) / fVar22);
            }
            else {
              iVar5 = -1;
            }
            if (fVar14 <= fVar13) {
              iVar18 = (int)((fVar13 - fVar14) / fVar22);
            }
            else {
              iVar18 = -1;
            }
            if (iVar18 <= iVar5) goto LAB_000e3fac;
          }
        }
        if ((&UNK_0000428c)[lVar6] == '\0') {
          unaff_x19[9] = (float)*(double *)(&UNK_00003f50 + unaff_x23);
          pcVar11 = *(char **)(&UNK_00006220 + unaff_x23);
          if ((0 < (int)unaff_x19[4]) && (3 < (int)unaff_x19[0x5c])) {
            iVar5 = 0;
            pcVar1 = pcVar11 + (int)unaff_x19[0x5c];
            pcVar12 = pcVar11;
            do {
              *pcVar12 = '/';
              func_0x000e73a8();
              pcVar11 = pcVar12 + 1;
              pcVar9 = (char *)((long)&uStack0000000000000010 + 1);
              cVar10 = (char)uStack0000000000000010;
              if ((char)uStack0000000000000010 != '\0' && pcVar12 + 3 < pcVar1) {
                do {
                  pcVar7 = pcVar11;
                  if (cVar10 == '/') {
                    *pcVar7 = '\\';
                    pcVar7 = pcVar12 + 2;
                    cVar10 = pcVar9[-1];
                  }
                  *pcVar7 = cVar10;
                  pcVar11 = pcVar7 + 1;
                  cVar10 = *pcVar9;
                  pcVar9 = pcVar9 + 1;
                  pcVar12 = pcVar7;
                } while (cVar10 != '\0' && pcVar7 + 3 < pcVar1);
              }
              iVar5 = iVar5 + 1;
              pcVar12 = pcVar11;
            } while (iVar5 < (int)unaff_x19[4] && pcVar11 + 3 < pcVar1);
          }
          *pcVar11 = '\0';
          pcVar8 = *(code **)(*(long *)(unaff_x22 + 0x4c0) + 0xb0);
          if (pcVar8 != (code *)0x0) {
            (*pcVar8)(*(undefined8 *)(*(long *)(unaff_x22 + 0x4c0) + 0xb8),
                      *(undefined8 *)(&UNK_00006220 + unaff_x23));
          }
        }
      }
    }
  }
LAB_000e3fac:
  *unaff_x19 = *(undefined4 *)(&UNK_00003f58 + unaff_x23);
  if (0 < (int)unaff_x19[4]) {
    uStack0000000000000010 = 0;
    iVar5 = func_0x0012c108(0,"##table",3,0x780,&uStack0000000000000010);
    if (iVar5 != 0) {
      fVar13 = (float)func_0x00106300(*(undefined4 *)(&UNK_00003d38 + *(long *)(unaff_x22 + 0x4c0)),
                                      0x7f7fffff,0xbf800000,
                                      *(undefined8 *)(&UNK_00003d30 + *(long *)(unaff_x22 + 0x4c0)),
                                      "0xDDDDDDDD",0,0);
      func_0x00131154((float)(int)(fVar13 + 0.99999),"Seed",0x10,0);
      func_0x00131154(0,"PushID",8,0);
      func_0x00131154((float)(int)(fVar13 + 0.99999),"Result",0x10,0);
      func_0x0013275c();
      if (0 < (int)unaff_x19[4]) {
        func_0x00131cb4();
        func_0x0010adc0("0x%08X");
        func_0x00131cb4();
        func_0x000e73a8();
        func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
        func_0x00131cb4();
        func_0x0010adc0("0x%08X");
        iVar5 = unaff_x19[4];
        if (iVar5 == 1) {
          lVar6 = *(long *)(unaff_x22 + 0x4c0);
          fVar14 = *(float *)(&UNK_00003b4c + lVar6);
          fVar19 = *(float *)(&UNK_00003b50 + lVar6);
          fVar22 = *(float *)(&UNK_00003b58 + lVar6) * *(float *)(&UNK_000038e8 + lVar6);
          fVar13 = 1.0;
          if (fVar14 <= 1.0) {
            fVar13 = fVar14;
          }
          fVar23 = 0.0;
          if (0.0 <= fVar14) {
            fVar23 = fVar13;
          }
          fVar14 = *(float *)(&UNK_00003b54 + lVar6);
          fVar13 = 1.0;
          if (fVar19 <= 1.0) {
            fVar13 = fVar19;
          }
          fVar15 = 0.0;
          if (0.0 <= fVar19) {
            fVar15 = fVar13;
          }
          iVar5 = -(uint)(fVar14 < 0.0);
          iVar18 = -(uint)(fVar22 < 0.0);
          uVar20 = NEON_fmov(0x3f800000,4);
          uVar20 = uVar20 ^ (uVar20 ^ CONCAT44(fVar22,fVar14)) &
                            ~CONCAT44(-(uint)((float)(uVar20 >> 0x20) < fVar22),
                                      -(uint)((float)uVar20 < fVar14));
          fVar13 = (float)CONCAT13((byte)(uVar20 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                                   CONCAT12((byte)(uVar20 >> 0x10) & ~(byte)((uint)iVar5 >> 0x10),
                                            CONCAT11((byte)(uVar20 >> 8) & ~(byte)((uint)iVar5 >> 8)
                                                     ,(byte)uVar20 & ~(byte)iVar5)));
          uVar16 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar20 >> 0x38) &
                                                             ~(byte)((uint)iVar18 >> 0x18),
                                                             CONCAT16((byte)(uVar20 >> 0x30) &
                                                                      ~(byte)((uint)iVar18 >> 0x10),
                                                                      CONCAT15((byte)(uVar20 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar18 >> 8),
                                                  CONCAT14((byte)(uVar20 >> 0x20) & ~(byte)iVar18,
                                                           fVar13)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar13 * 255.0 + 0.5)),_UNK_0080c190,4);
          func_0x00131634(3,(int)(fVar23 * 255.0 + 0.5) | (int)(fVar15 * 255.0 + 0.5) << 8 |
                            (uint)uVar16 | (uint)((ulong)uVar16 >> 0x20),0xffffffff);
          iVar5 = unaff_x19[4];
        }
        uVar16 = _UNK_0080c190;
        if (1 < iVar5) {
          uVar20 = 1;
          uVar24 = NEON_fmov(0x3f800000,4);
          do {
            func_0x00131cb4();
            func_0x0010adc0("0x%08X");
            func_0x00131cb4();
            func_0x000e73a8();
            func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
            func_0x00131cb4();
            func_0x0010adc0("0x%08X");
            iVar5 = unaff_x19[4];
            if (uVar20 == iVar5 - 1) {
              lVar6 = *(long *)(unaff_x22 + 0x4c0);
              fVar14 = *(float *)(&UNK_00003b4c + lVar6);
              fVar19 = *(float *)(&UNK_00003b50 + lVar6);
              fVar22 = *(float *)(&UNK_00003b54 + lVar6);
              fVar13 = 1.0;
              if (fVar14 <= 1.0) {
                fVar13 = fVar14;
              }
              fVar23 = 0.0;
              if (0.0 <= fVar14) {
                fVar23 = fVar13;
              }
              fVar14 = *(float *)(&UNK_00003b58 + lVar6) * *(float *)(&UNK_000038e8 + lVar6);
              fVar13 = 1.0;
              if (fVar19 <= 1.0) {
                fVar13 = fVar19;
              }
              fVar15 = 0.0;
              if (0.0 <= fVar19) {
                fVar15 = fVar13;
              }
              iVar5 = -(uint)(fVar22 < 0.0);
              iVar18 = -(uint)(fVar14 < 0.0);
              uVar21 = CONCAT44(fVar14,fVar22) ^
                       (CONCAT44(fVar14,fVar22) ^ uVar24) &
                       CONCAT44(-(uint)((float)(uVar24 >> 0x20) < fVar14),
                                -(uint)((float)uVar24 < fVar22));
              fVar13 = (float)CONCAT13((byte)(uVar21 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                                       CONCAT12((byte)(uVar21 >> 0x10) &
                                                ~(byte)((uint)iVar5 >> 0x10),
                                                CONCAT11((byte)(uVar21 >> 8) &
                                                         ~(byte)((uint)iVar5 >> 8),
                                                         (byte)uVar21 & ~(byte)iVar5)));
              uVar17 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar21 >> 0x38) &
                                                                 ~(byte)((uint)iVar18 >> 0x18),
                                                                 CONCAT16((byte)(uVar21 >> 0x30) &
                                                                          ~(byte)((uint)iVar18 >>
                                                                                 0x10),
                                                                          CONCAT15((byte)(uVar21 >>
                                                                                         0x28) &
                                                                                   ~(byte)((uint)
                                                  iVar18 >> 8),
                                                  CONCAT14((byte)(uVar21 >> 0x20) & ~(byte)iVar18,
                                                           fVar13)))) >> 0x20) * 255.0 + 0.5),
                                          (int)(fVar13 * 255.0 + 0.5)),uVar16,4);
              func_0x00131634(3,(int)(fVar23 * 255.0 + 0.5) | (int)(fVar15 * 255.0 + 0.5) << 8 |
                                (uint)uVar17 | (uint)((ulong)uVar17 >> 0x20),0xffffffff);
              iVar5 = unaff_x19[4];
            }
            uVar20 = uVar20 + 1;
          } while ((long)uVar20 < (long)iVar5);
        }
      }
      func_0x0012f400();
    }
  }
  func_0x000cea90();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x90)) {
    return;
  }
  ___stack_chk_fail();
  lVar6 = lRam0000000000a334c0;
  puVar2 = (undefined4 *)(&UNK_00004970 + lRam0000000000a334c0);
  *(undefined4 *)(lRam0000000000a334c0 + 0x3ffc) = 0;
  *(undefined4 *)(&UNK_00004e20 + lVar6) = 0;
  *puVar2 = 0;
  return;
}

