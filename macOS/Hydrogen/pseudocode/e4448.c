
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000e4448(char *param_1,float param_2,float param_3,undefined1 param_4 [16],float param_5)

{
  char *pcVar1;
  undefined4 *puVar2;
  char in_NG;
  char in_OV;
  int iVar3;
  long lVar4;
  char *pcVar5;
  code *pcVar6;
  char *pcVar7;
  long in_x9;
  char cVar8;
  undefined4 *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  char *pcVar9;
  char *pcVar10;
  long unaff_x29;
  float fVar11;
  float fVar12;
  int iVar15;
  undefined8 uVar13;
  undefined8 uVar14;
  float fVar16;
  ulong uVar17;
  ulong uVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  ulong uVar22;
  undefined8 uStack0000000000000010;
  
  if (in_NG != in_OV) {
    fVar20 = *(float *)(in_x9 + 0x74);
    if (fVar20 <= 0.0) {
      if ((param_2 < param_3) || (param_3 <= param_5)) goto LAB_000e3fac;
    }
    else {
      if (param_3 <= param_5) {
        iVar3 = (int)((param_5 - param_3) / fVar20);
      }
      else {
        iVar3 = -1;
      }
      if (param_3 <= param_2) {
        iVar15 = (int)((param_2 - param_3) / fVar20);
      }
      else {
        iVar15 = -1;
      }
      if (iVar15 <= iVar3) goto LAB_000e3fac;
    }
    if (*param_1 == '\0') {
      unaff_x19[9] = (float)*(double *)(&UNK_00003f50 + unaff_x23);
      pcVar9 = *(char **)(&UNK_00006220 + unaff_x23);
      if ((0 < (int)unaff_x19[4]) && (3 < (int)unaff_x19[0x5c])) {
        iVar3 = 0;
        pcVar1 = pcVar9 + (int)unaff_x19[0x5c];
        pcVar10 = pcVar9;
        do {
          *pcVar10 = '/';
          func_0x000e73a8();
          pcVar9 = pcVar10 + 1;
          pcVar7 = (char *)((long)&uStack0000000000000010 + 1);
          cVar8 = (char)uStack0000000000000010;
          if ((char)uStack0000000000000010 != '\0' && pcVar10 + 3 < pcVar1) {
            do {
              pcVar5 = pcVar9;
              if (cVar8 == '/') {
                *pcVar5 = '\\';
                pcVar5 = pcVar10 + 2;
                cVar8 = pcVar7[-1];
              }
              *pcVar5 = cVar8;
              pcVar9 = pcVar5 + 1;
              cVar8 = *pcVar7;
              pcVar7 = pcVar7 + 1;
              pcVar10 = pcVar5;
            } while (cVar8 != '\0' && pcVar5 + 3 < pcVar1);
          }
          iVar3 = iVar3 + 1;
          pcVar10 = pcVar9;
        } while (iVar3 < (int)unaff_x19[4] && pcVar9 + 3 < pcVar1);
      }
      *pcVar9 = '\0';
      pcVar6 = *(code **)(*(long *)(unaff_x22 + 0x4c0) + 0xb0);
      if (pcVar6 != (code *)0x0) {
        (*pcVar6)(*(undefined8 *)(*(long *)(unaff_x22 + 0x4c0) + 0xb8),
                  *(undefined8 *)(&UNK_00006220 + unaff_x23));
      }
    }
  }
LAB_000e3fac:
  *unaff_x19 = *(undefined4 *)(&UNK_00003f58 + unaff_x23);
  if (0 < (int)unaff_x19[4]) {
    uStack0000000000000010 = 0;
    iVar3 = func_0x0012c108(0,"##table",3,0x780,&uStack0000000000000010);
    if (iVar3 != 0) {
      fVar20 = (float)func_0x00106300(*(undefined4 *)(&UNK_00003d38 + *(long *)(unaff_x22 + 0x4c0)),
                                      0x7f7fffff,0xbf800000,
                                      *(undefined8 *)(&UNK_00003d30 + *(long *)(unaff_x22 + 0x4c0)),
                                      "0xDDDDDDDD",0,0);
      func_0x00131154((float)(int)(fVar20 + 0.99999),"Seed",0x10,0);
      func_0x00131154(0,"PushID",8,0);
      func_0x00131154((float)(int)(fVar20 + 0.99999),"Result",0x10,0);
      func_0x0013275c();
      if (0 < (int)unaff_x19[4]) {
        func_0x00131cb4();
        func_0x0010adc0("0x%08X");
        func_0x00131cb4();
        func_0x000e73a8();
        func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
        func_0x00131cb4();
        func_0x0010adc0("0x%08X");
        iVar3 = unaff_x19[4];
        if (iVar3 == 1) {
          lVar4 = *(long *)(unaff_x22 + 0x4c0);
          fVar11 = *(float *)(&UNK_00003b4c + lVar4);
          fVar16 = *(float *)(&UNK_00003b50 + lVar4);
          fVar19 = *(float *)(&UNK_00003b58 + lVar4) * *(float *)(&UNK_000038e8 + lVar4);
          fVar20 = 1.0;
          if (fVar11 <= 1.0) {
            fVar20 = fVar11;
          }
          fVar21 = 0.0;
          if (0.0 <= fVar11) {
            fVar21 = fVar20;
          }
          fVar11 = *(float *)(&UNK_00003b54 + lVar4);
          fVar20 = 1.0;
          if (fVar16 <= 1.0) {
            fVar20 = fVar16;
          }
          fVar12 = 0.0;
          if (0.0 <= fVar16) {
            fVar12 = fVar20;
          }
          iVar3 = -(uint)(fVar11 < 0.0);
          iVar15 = -(uint)(fVar19 < 0.0);
          uVar17 = NEON_fmov(0x3f800000,4);
          uVar17 = uVar17 ^ (uVar17 ^ CONCAT44(fVar19,fVar11)) &
                            ~CONCAT44(-(uint)((float)(uVar17 >> 0x20) < fVar19),
                                      -(uint)((float)uVar17 < fVar11));
          fVar20 = (float)CONCAT13((byte)(uVar17 >> 0x18) & ~(byte)((uint)iVar3 >> 0x18),
                                   CONCAT12((byte)(uVar17 >> 0x10) & ~(byte)((uint)iVar3 >> 0x10),
                                            CONCAT11((byte)(uVar17 >> 8) & ~(byte)((uint)iVar3 >> 8)
                                                     ,(byte)uVar17 & ~(byte)iVar3)));
          uVar13 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar17 >> 0x38) &
                                                             ~(byte)((uint)iVar15 >> 0x18),
                                                             CONCAT16((byte)(uVar17 >> 0x30) &
                                                                      ~(byte)((uint)iVar15 >> 0x10),
                                                                      CONCAT15((byte)(uVar17 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar15 >> 8),
                                                  CONCAT14((byte)(uVar17 >> 0x20) & ~(byte)iVar15,
                                                           fVar20)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar20 * 255.0 + 0.5)),_UNK_0080c190,4);
          func_0x00131634(3,(int)(fVar21 * 255.0 + 0.5) | (int)(fVar12 * 255.0 + 0.5) << 8 |
                            (uint)uVar13 | (uint)((ulong)uVar13 >> 0x20),0xffffffff);
          iVar3 = unaff_x19[4];
        }
        uVar13 = _UNK_0080c190;
        if (1 < iVar3) {
          uVar17 = 1;
          uVar22 = NEON_fmov(0x3f800000,4);
          do {
            func_0x00131cb4();
            func_0x0010adc0("0x%08X");
            func_0x00131cb4();
            func_0x000e73a8();
            func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
            func_0x00131cb4();
            func_0x0010adc0("0x%08X");
            iVar3 = unaff_x19[4];
            if (uVar17 == iVar3 - 1) {
              lVar4 = *(long *)(unaff_x22 + 0x4c0);
              fVar11 = *(float *)(&UNK_00003b4c + lVar4);
              fVar16 = *(float *)(&UNK_00003b50 + lVar4);
              fVar19 = *(float *)(&UNK_00003b54 + lVar4);
              fVar20 = 1.0;
              if (fVar11 <= 1.0) {
                fVar20 = fVar11;
              }
              fVar21 = 0.0;
              if (0.0 <= fVar11) {
                fVar21 = fVar20;
              }
              fVar11 = *(float *)(&UNK_00003b58 + lVar4) * *(float *)(&UNK_000038e8 + lVar4);
              fVar20 = 1.0;
              if (fVar16 <= 1.0) {
                fVar20 = fVar16;
              }
              fVar12 = 0.0;
              if (0.0 <= fVar16) {
                fVar12 = fVar20;
              }
              iVar3 = -(uint)(fVar19 < 0.0);
              iVar15 = -(uint)(fVar11 < 0.0);
              uVar18 = CONCAT44(fVar11,fVar19) ^
                       (CONCAT44(fVar11,fVar19) ^ uVar22) &
                       CONCAT44(-(uint)((float)(uVar22 >> 0x20) < fVar11),
                                -(uint)((float)uVar22 < fVar19));
              fVar20 = (float)CONCAT13((byte)(uVar18 >> 0x18) & ~(byte)((uint)iVar3 >> 0x18),
                                       CONCAT12((byte)(uVar18 >> 0x10) &
                                                ~(byte)((uint)iVar3 >> 0x10),
                                                CONCAT11((byte)(uVar18 >> 8) &
                                                         ~(byte)((uint)iVar3 >> 8),
                                                         (byte)uVar18 & ~(byte)iVar3)));
              uVar14 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar18 >> 0x38) &
                                                                 ~(byte)((uint)iVar15 >> 0x18),
                                                                 CONCAT16((byte)(uVar18 >> 0x30) &
                                                                          ~(byte)((uint)iVar15 >>
                                                                                 0x10),
                                                                          CONCAT15((byte)(uVar18 >>
                                                                                         0x28) &
                                                                                   ~(byte)((uint)
                                                  iVar15 >> 8),
                                                  CONCAT14((byte)(uVar18 >> 0x20) & ~(byte)iVar15,
                                                           fVar20)))) >> 0x20) * 255.0 + 0.5),
                                          (int)(fVar20 * 255.0 + 0.5)),uVar13,4);
              func_0x00131634(3,(int)(fVar21 * 255.0 + 0.5) | (int)(fVar12 * 255.0 + 0.5) << 8 |
                                (uint)uVar14 | (uint)((ulong)uVar14 >> 0x20),0xffffffff);
              iVar3 = unaff_x19[4];
            }
            uVar17 = uVar17 + 1;
          } while ((long)uVar17 < (long)iVar3);
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
  lVar4 = lRam0000000000a334c0;
  puVar2 = (undefined4 *)(&UNK_00004970 + lRam0000000000a334c0);
  *(undefined4 *)(lRam0000000000a334c0 + 0x3ffc) = 0;
  *(undefined4 *)(&UNK_00004e20 + lVar4) = 0;
  *puVar2 = 0;
  return;
}

