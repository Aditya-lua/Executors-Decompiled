
uint FUN_0011a774(undefined8 param_1)

{
  undefined8 *puVar1;
  ushort uVar2;
  char cVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  bool bVar7;
  byte bVar8;
  int iVar9;
  int iVar10;
  int iVar11;
  undefined4 uVar12;
  uint uVar13;
  int iVar14;
  uint uVar15;
  long lVar16;
  undefined8 uVar17;
  ulong uVar18;
  ushort *puVar19;
  ushort *puVar20;
  ushort *puVar21;
  undefined8 uVar22;
  undefined2 *puVar23;
  undefined8 uVar24;
  short sVar25;
  int in_w8;
  char *pcVar26;
  ulong uVar27;
  char *pcVar28;
  int *piVar29;
  long lVar30;
  short *psVar31;
  float *pfVar32;
  float *pfVar33;
  byte bVar34;
  uint unaff_w19;
  uint uVar35;
  uint uVar36;
  long unaff_x20;
  undefined8 *puVar37;
  long unaff_x21;
  int unaff_w22;
  char *unaff_x23;
  ushort *puVar38;
  long unaff_x26;
  uint unaff_w27;
  ushort *puVar39;
  int unaff_w28;
  short *psVar40;
  short *psVar41;
  long unaff_x29;
  float fVar42;
  float fVar43;
  float fVar44;
  float fVar45;
  float fVar46;
  float fVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  float fVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  float fVar53;
  float fVar54;
  float fVar55;
  float fVar56;
  undefined4 uVar57;
  undefined4 uVar58;
  float fVar59;
  undefined4 uVar60;
  float unaff_s13;
  float unaff_s14;
  uint uStack000000000000000c;
  int iStack0000000000000010;
  uint uStack0000000000000014;
  int iStack0000000000000018;
  uint uStack000000000000001c;
  int in_stack_00000020;
  uint uStack0000000000000024;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  uint uStack0000000000000038;
  int iStack000000000000003c;
  float *in_stack_00000040;
  uint uStack000000000000004c;
  float in_stack_00000050;
  code *in_stack_00000068;
  uint uStack0000000000000070;
  uint uStack0000000000000074;
  int *piStack0000000000000078;
  float in_stack_00000080;
  ulong in_stack_00000090;
  char *in_stack_00000098;
  int *in_stack_000000a0;
  undefined8 in_stack_000000a8;
  float in_stack_000000b0;
  long in_stack_000000c8;
  char *in_stack_000000d0;
  char *in_stack_000000d8;
  uint uStack00000000000000e0;
  uint uStack00000000000000e4;
  char *in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  float fStack0000000000000110;
  float fStack0000000000000114;
  
  uStack000000000000004c = 0;
  if ((int)((ulong)param_1 >> 0x20) != in_w8) {
    uStack000000000000004c = unaff_w27;
  }
  if ((((((uStack00000000000000e0 | uStack000000000000004c) & 1) != 0) ||
       (uStack0000000000000070 = 0, *(int *)(in_stack_000000d8 + 0x804) == unaff_w22)) &&
      (uStack0000000000000070 = 0, unaff_x26 != 0)) &&
     (uStack0000000000000070 = 0, (unaff_w19 >> 0xe & 1) == 0)) {
    uStack0000000000000070 = (uint)(*(char *)(unaff_x26 + 0x48) != '\0');
  }
  piStack0000000000000078 = (int *)(unaff_x21 + unaff_x20);
  if (in_stack_00000098 == (char *)0x0) {
    uVar35 = 0;
    uStack0000000000000074 = 0;
    uStack0000000000000024 = (uint)((in_stack_00000090 & 0x800000000000) == 0);
  }
  else {
    pcVar26 = unaff_x23;
    if (uStack0000000000000070 != 0) {
      pcVar26 = *(char **)(unaff_x26 + 0x30);
    }
    bVar7 = *pcVar26 == '\0';
    uVar35 = (uint)bVar7;
    uStack0000000000000074 = (uint)bVar7;
    uStack0000000000000024 = (uint)bVar7;
    if ((in_stack_00000090 & 0x800000000000) == 0) {
      uStack0000000000000024 = 1;
    }
  }
  if (uStack0000000000000024 == 0) {
    lVar16 = func_0x00105f10(*(undefined8 *)(&UNK_00003d30 + unaff_x21),0x2a);
    lVar30 = *(long *)(&UNK_00003d30 + unaff_x21);
    piStack0000000000000078[0xb] = *(int *)(lVar30 + 0x14);
    *(undefined8 *)(piStack0000000000000078 + 0x1f) = *(undefined8 *)(lVar30 + 100);
    piStack0000000000000078[0x21] = *(int *)(lVar30 + 0x6c);
    *(undefined8 *)(&UNK_00005de0 + unaff_x21) = *(undefined8 *)(lVar30 + 0x40);
    *(long *)(&UNK_00005dd8 + unaff_x21) = lVar16;
    piStack0000000000000078[10] = *(int *)(lVar16 + 4);
    func_0x000d33a0(&UNK_00005da0 + unaff_x21);
    uStack0000000000000074 = uVar35;
  }
  if (*(int *)(in_stack_000000d8 + 0x804) != unaff_w22) {
    iStack0000000000000010 = 0;
    iVar9 = *(int *)(in_stack_000000d8 + 0x804);
joined_r0x0011a94c:
    if (iVar9 != unaff_w22) goto LAB_0011aaf0;
LAB_0011a950:
    if (in_stack_000000d8[0x810] == '\0') {
      if ((_uStack0000000000000038 & 0x100000000) != 0) {
        bVar7 = false;
        pcVar26 = (char *)0x0;
        bVar8 = 0;
        _uStack0000000000000038 = 0x100000000;
        goto LAB_0011add4;
      }
      iVar9 = (int)((in_stack_00000080 - *(float *)(&UNK_00003928 + unaff_x21)) /
                   *(float *)(&UNK_00003d38 + unaff_x21));
      if (iVar9 < 2) {
        iVar9 = 1;
      }
      *(int *)(unaff_x26 + 100) = iVar9;
      lVar16 = 0xe5c;
      if (uStack0000000000000038 == 0) {
        lVar16 = 0xe5e;
      }
      cVar3 = *(char *)(unaff_x21 + lVar16);
      if ((((_uStack0000000000000038 & 1) == 0) && (*(char *)(unaff_x21 + 0xe5f) != '\0')) &&
         (*(char *)(unaff_x21 + 0xe5c) == '\0')) {
        uVar18 = func_0x000d78f8(0xa39);
        if ((uVar18 & 1) == 0) goto code_r0x0011b2e8;
code_r0x0011ac68:
        uVar36 = (uint)((unaff_w19 & 0x4000) == 0 && (in_stack_00000090 & 0x800000000000) == 0);
        if ((unaff_w19 & 0x4000) == 0 && (in_stack_00000090 & 0x800000000000) == 0) {
joined_r0x0011ac84:
          if (in_stack_000000f0._4_4_ != 0) {
            uVar36 = (uint)(*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c));
          }
        }
        uVar18 = func_0x000d78f8(0xa24);
        if ((uVar18 & 1) == 0) goto code_r0x0011b374;
code_r0x0011b344:
        if ((in_stack_00000090._4_4_ & 0x4008000) == 0x4000000) goto code_r0x0011b39c;
      }
      else {
        uVar18 = func_0x000d78f8(0xa39);
        if ((uVar18 & 1) != 0) goto code_r0x0011ac68;
code_r0x0011b2e8:
        uVar13 = func_0x000d78f8(&UNK_0000220a);
        uVar35 = (unaff_w19 & 0x4000) >> 0xe;
        uVar15 = (in_stack_00000090._4_4_ & 0x8000) >> 0xf;
        uVar36 = (uVar13 ^ 1 | uVar35 | uVar15) ^ 1;
        unaff_w19 = uStack00000000000000e4;
        if ((((uVar13 ^ 1) & 1) == 0 && uVar35 == 0) && uVar15 == 0) goto joined_r0x0011ac84;
        uVar18 = func_0x000d78f8(0xa24);
        if ((uVar18 & 1) != 0) goto code_r0x0011b344;
code_r0x0011b374:
        uVar35 = func_0x000d78f8(0x1209);
        uStack0000000000000014 = 0;
        if ((in_stack_00000090 & 0x800000000000) == 0) {
          uStack0000000000000014 = uVar35;
        }
        if ((in_stack_000000f0._4_4_ != 0) && ((uStack0000000000000014 & 1) != 0)) {
code_r0x0011b39c:
          uStack0000000000000014 = (uint)(*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c));
        }
      }
      uVar18 = func_0x000d78f8(0xa37);
      if (((uVar18 & 1) == 0) && (uVar18 = func_0x000d78f8(&UNK_00002209), (uVar18 & 1) == 0)) {
        bVar7 = false;
        bVar5 = (unaff_w19 & 0x4000) == 0;
      }
      else {
        bVar5 = (unaff_w19 & 0x4000) == 0;
        bVar7 = bVar5;
      }
      bVar8 = func_0x000d78f8(0xa3b);
      bVar6 = false;
      if ((in_stack_00000090 & 0x1000000000000) == 0) {
        bVar6 = bVar5;
      }
      uVar18 = func_0x000d78f8(0xa3a);
      bVar5 = bVar6;
      if (((uVar18 & 1) == 0) &&
         (((_uStack0000000000000038 & 1) != 0 ||
          (iVar10 = func_0x000d78f8(&UNK_00002a3b), iVar10 == 0)))) {
        bVar5 = false;
      }
      iVar10 = func_0x000d78f8(0xa22);
      bVar34 = 0;
      if ((*(byte *)(unaff_x21 + 8) >> 1 & 1) == 0) {
        uVar18 = func_0x000d68ec(0x20d,1);
        if ((uVar18 & 1) != 0) goto code_r0x0011b480;
code_r0x0011b4c0:
        uVar35 = func_0x000d68ec(0x273,1);
        if (bVar34 == 0) goto code_r0x0011b4d4;
code_r0x0011b484:
        uVar18 = func_0x000d68ec(0x27c,0);
        if ((uVar18 & 1) == 0) {
          uStack000000000000000c = func_0x000d68ec(0x27b,0);
        }
        else {
          uStack000000000000000c = 1;
        }
        iVar11 = 1;
        uVar18 = func_0x000d78f8(0x20e);
        if ((uVar18 & 1) == 0) {
          uVar17 = 0x27a;
          goto code_r0x0011b518;
        }
      }
      else {
        bVar34 = *(byte *)(unaff_x21 + 0xc) & 1;
        uVar18 = func_0x000d68ec(0x20d,1);
        if ((uVar18 & 1) == 0) goto code_r0x0011b4c0;
code_r0x0011b480:
        uVar35 = 1;
        if (bVar34 != 0) goto code_r0x0011b484;
code_r0x0011b4d4:
        uStack000000000000000c = 0;
        uVar17 = 0x20e;
code_r0x0011b518:
        iVar11 = func_0x000d78f8(uVar17);
      }
      iVar14 = func_0x000d68ec(0x201,1);
      if ((iVar14 == 0) && (iVar14 = func_0x000d68ec(0x202,1), iVar14 == 0)) {
        iVar14 = func_0x000d68ec(0x203,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
            func_0x0011cfe8();
          }
          else {
            fVar44 = *(float *)(in_stack_000000c8 + 0x90) - *(float *)(&UNK_00003d38 + unaff_x21);
            if (fVar44 < 0.0) {
              fVar44 = 0.0;
            }
            func_0x000d8cb4(fVar44);
          }
          _uStack0000000000000038 = 0;
          goto code_r0x0011b5b8;
        }
        iVar14 = func_0x000d68ec(0x204,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
            func_0x0011cfe8();
          }
          else {
            fVar44 = *(float *)(in_stack_000000c8 + 0x90) + *(float *)(&UNK_00003d38 + unaff_x21);
            fVar42 = (float)func_0x000d8c90();
            if (fVar42 <= fVar44) {
              fVar44 = fVar42;
            }
            func_0x000d8cb4(fVar44,in_stack_000000c8);
          }
          _uStack0000000000000038 = 0;
          goto code_r0x0011b5b8;
        }
        iVar14 = func_0x000d68ec(0x205,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          func_0x0011cfe8();
          _uStack0000000000000038 = 0;
          unaff_s13 = unaff_s13 - *(float *)(&UNK_00003d38 + unaff_x21) * (float)iVar9;
          goto code_r0x0011b5b8;
        }
        iVar14 = func_0x000d68ec(0x206,1);
        if ((in_stack_000000f0._4_4_ != 0) && (iVar14 != 0)) {
          func_0x0011cfe8();
          unaff_s13 = unaff_s13 + *(float *)(&UNK_00003d38 + unaff_x21) * (float)iVar9;
          goto code_r0x0011b5b0;
        }
        iVar9 = func_0x000d68ec(0x207,1);
        if ((iVar9 != 0) || (iVar9 = func_0x000d68ec(0x208,1), iVar9 != 0)) goto code_r0x0011b59c;
        uVar15 = func_0x000d68ec(0x20a,1);
        if (((uVar15 ^ 1 | (uStack00000000000000e4 & 0x4000) >> 0xe | uVar36) & 1) == 0) {
          if ((cVar3 != '\0') && (*(int *)(unaff_x26 + 0x58) == *(int *)(unaff_x26 + 0x5c))) {
            func_0x0011cfe8();
          }
code_r0x0011c648:
          func_0x0011cfe8();
code_r0x0011c654:
          _uStack0000000000000038 = 0;
          goto code_r0x0011b5b8;
        }
        iVar9 = func_0x000d68ec(0x20b,1);
        if ((iVar9 != 0) && ((_uStack00000000000000e0 & 0x400000000000) == 0)) {
          if ((*(int *)(unaff_x26 + 0x58) == *(int *)(unaff_x26 + 0x5c)) &&
             ((cVar3 != '\0' ||
              (((((_uStack0000000000000038 & 1) == 0 && (*(char *)(unaff_x21 + 0xe5f) != '\0')) &&
                (*(char *)(unaff_x21 + 0xe5e) == '\0')) && (*(char *)(unaff_x21 + 0xe5c) == '\0'))))
             )) {
            func_0x0011cfe8();
          }
          goto code_r0x0011c648;
        }
        if ((uVar35 | uStack000000000000000c) == 1) {
          if (in_stack_000000f0._4_4_ == 0 || (uStack000000000000000c & 1) != 0) {
            if ((in_stack_000000f0._4_4_ == 0) && (*(char *)(unaff_x21 + 0x5c) != '\0')) {
              *(undefined4 *)(unaff_x26 + 0x58) = 0;
              *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0xc);
              *(undefined4 *)(unaff_x26 + 0x54) = *(undefined4 *)(unaff_x26 + 0xc);
              *(undefined1 *)(unaff_x26 + 0x6a) = 0;
              _uStack0000000000000038 = 1;
            }
            else {
              _uStack0000000000000038 = 0x100000001;
            }
            goto code_r0x0011b5b8;
          }
          if ((in_stack_00000090._4_4_ >> 0xb & 1) == 0) {
            if (*(char *)(unaff_x21 + 0xe5c) != '\0') goto code_r0x0011c5c4;
          }
          else if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
code_r0x0011c5c4:
            _uStack0000000000000038 = 0x100000001;
            goto code_r0x0011b5b8;
          }
          if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
            *(undefined4 *)(unaff_x29 + -0xf8) = 10;
            iVar9 = func_0x0011ebdc();
            if (iVar9 != 0) goto code_r0x0011c648;
          }
          goto code_r0x0011c654;
        }
        if (iVar11 == 0) {
          if ((byte)(bVar8 & bVar6 | bVar5) == 1) {
            func_0x0011cfe8();
            _uStack0000000000000038 = 0;
            *(undefined4 *)(unaff_x26 + 0x58) = *(undefined4 *)(unaff_x26 + 0x54);
            *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0x54);
          }
          else {
            if (iVar10 == 0) {
              if ((uVar36 | uStack0000000000000014) == 1) {
                if (*(long *)(unaff_x21 + 0xb0) != 0) {
                  uVar35 = *(uint *)(unaff_x26 + 0x58);
                  uVar15 = *(uint *)(unaff_x26 + 0x5c);
                  if (uVar35 == uVar15) {
                    uVar18 = 0;
                    uVar35 = *(uint *)(unaff_x26 + 0xc);
                  }
                  else {
                    uVar13 = uVar35;
                    if ((int)uVar15 <= (int)uVar35) {
                      uVar13 = uVar15;
                    }
                    uVar18 = (ulong)uVar13;
                    if ((int)uVar35 <= (int)uVar15) {
                      uVar35 = uVar15;
                    }
                  }
                  uVar18 = -(uVar18 >> 0x1f) & 0xfffffffe00000000 | uVar18 << 1;
                  uVar27 = -(ulong)(uVar35 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar35 << 1;
                  iVar9 = func_0x000b91c4(*(long *)(unaff_x26 + 0x20) + uVar18,
                                          *(long *)(unaff_x26 + 0x20) + uVar27);
                  uVar17 = func_0x000b810c((long)(iVar9 + 1));
                  func_0x000b9034(uVar17,iVar9 + 1,*(long *)(unaff_x26 + 0x20) + uVar18,
                                  *(long *)(unaff_x26 + 0x20) + uVar27);
                  func_0x000c2d8c(uVar17);
                  func_0x000b83d4(uVar17);
                }
                if (uVar36 != 0) {
                  iVar9 = *(int *)(unaff_x26 + 0x58);
                  iVar10 = *(int *)(unaff_x26 + 0x5c);
                  if (iVar9 == iVar10) {
                    iVar9 = 0;
                    iVar10 = *(int *)(unaff_x26 + 0xc);
                    *(undefined4 *)(unaff_x26 + 0x58) = 0;
                    *(int *)(unaff_x26 + 0x5c) = iVar10;
                    *(int *)(unaff_x26 + 0x54) = iVar10;
                    *(undefined1 *)(unaff_x26 + 0x6a) = 0;
                  }
                  *(undefined1 *)(unaff_x26 + 0xe84) = 1;
                  if (iVar9 != iVar10) {
                    func_0x001294b4();
                    _uStack0000000000000038 = 0;
                    *(undefined1 *)(unaff_x26 + 0x6a) = 0;
                    goto code_r0x0011b5b8;
                  }
                }
              }
              else if ((bVar7) && (pcVar26 = (char *)func_0x000c2d68(), pcVar26 != (char *)0x0)) {
                lVar16 = _strlen();
                puVar23 = (undefined2 *)func_0x000b810c((lVar16 << 0x20) + 0x100000000 >> 0x1f);
                if (*pcVar26 == '\0') {
                  *puVar23 = 0;
                }
                else {
                  iVar9 = 0;
                  do {
                    iVar10 = func_0x000b6c50(unaff_x29 + -0xf8,pcVar26,0);
                    iVar11 = func_0x0011ebdc();
                    if (iVar11 != 0) {
                      puVar23[iVar9] = (short)*(undefined4 *)(unaff_x29 + -0xf8);
                      iVar9 = iVar9 + 1;
                    }
                    pcVar26 = pcVar26 + iVar10;
                  } while (*pcVar26 != '\0');
                  puVar23[iVar9] = 0;
                  if (0 < iVar9) {
                    func_0x0011eddc();
                    *(undefined1 *)(unaff_x26 + 0xe84) = 1;
                  }
                }
                func_0x000b83d4(puVar23);
              }
              goto code_r0x0011c654;
            }
            _uStack0000000000000038 = 0;
            *(undefined4 *)(unaff_x26 + 0x58) = 0;
            *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0xc);
            *(undefined4 *)(unaff_x26 + 0x54) = *(undefined4 *)(unaff_x26 + 0xc);
            *(undefined1 *)(unaff_x26 + 0x6a) = 0;
            *(undefined1 *)(unaff_x26 + 0xe84) = 1;
          }
          goto code_r0x0011b5b8;
        }
        if ((in_stack_00000090._4_4_ >> 0x14 & 1) == 0) {
          uStack00000000000000e0 = 0;
          bVar7 = true;
          _uStack0000000000000038 = 0x100000000;
          uStack000000000000004c = 0;
        }
        else {
          bVar5 = *in_stack_000000e8 == '\0';
          uVar35 = 0;
          if (!bVar5) {
            uVar35 = uStack000000000000004c;
          }
          _uStack0000000000000038 = (ulong)bVar5 << 0x20;
          bVar7 = !bVar5;
          uVar15 = 0;
          if (!bVar5) {
            uVar15 = uStack00000000000000e0;
          }
          uStack000000000000004c = uVar35;
          uStack00000000000000e0 = uVar15;
        }
      }
      else {
code_r0x0011b59c:
        func_0x0011cfe8();
code_r0x0011b5b0:
        _uStack0000000000000038 = 0;
code_r0x0011b5b8:
        bVar7 = false;
      }
      uVar35 = 0;
      if (*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c)) {
        uVar35 = uStack00000000000000e0;
      }
      uStack000000000000004c = uStack000000000000004c | uVar35;
      iVar9 = *(int *)(in_stack_000000d8 + 0x804);
      unaff_x23 = in_stack_000000e8;
      unaff_w19 = uStack00000000000000e4;
      goto joined_r0x0011b5dc;
    }
    bVar7 = false;
    _uStack0000000000000038 = _uStack0000000000000038 & 0xffffffff00000000;
    pcVar26 = (char *)0x0;
    bVar8 = 0;
    goto LAB_0011add4;
  }
  iStack0000000000000010 = *(int *)(unaff_x26 + 0x10);
  *(undefined1 *)(unaff_x26 + 0xe86) = 0;
  *(int *)(unaff_x26 + 0x4c) = in_stack_000000a8._4_4_;
  *(uint *)(unaff_x26 + 0xe88) = unaff_w19;
  bVar8 = *(byte *)(unaff_x21 + 0xe48);
  in_stack_000000d8[0x811] = bVar8 ^ 1;
  if (unaff_w28 == 0) {
    fVar44 = *(float *)(&UNK_00003d38 + unaff_x21) * 0.5;
    if (in_stack_00000030._4_4_ != 0) goto LAB_0011a998;
LAB_0011a8b4:
    fVar42 = ((*(float *)(unaff_x21 + 0xe40) - *(float *)(unaff_x29 + -0xa8)) -
             *(float *)(&UNK_00003924 + unaff_x21)) + *(float *)(unaff_x26 + 0x50);
    if (((iStack0000000000000018 == 0) || (uVar2 = *(ushort *)(in_stack_000000d8 + 10), uVar2 < 2))
       || (*(char *)(unaff_x21 + 0xe5d) != '\0')) {
      if ((*in_stack_000000d8 == '\0') || (*(char *)(unaff_x26 + 0xe85) != '\0')) {
        unaff_w19 = uStack00000000000000e4;
        if (((bVar8 != 0) && (*(char *)(unaff_x26 + 0xe85) == '\0')) &&
           ((*(float *)(unaff_x21 + 0xe8) != 0.0 || (*(float *)(unaff_x21 + 0xec) != 0.0)))) {
          func_0x0011eb90();
          *(undefined4 *)(unaff_x26 + 0xe80) = 0xbe99999a;
          *(undefined1 *)(unaff_x26 + 0xe84) = 1;
        }
      }
      else {
        unaff_w19 = uStack00000000000000e4;
        if (iStack0000000000000018 != 0) {
          if (*(char *)(unaff_x21 + 0xe5d) == '\0') {
            if (*(char *)(unaff_x26 + 0x6b) != '\0') {
              fVar44 = 0.0;
            }
            uVar12 = func_0x00129e5c(fVar42,fVar44);
            *(undefined4 *)(unaff_x26 + 0x54) = uVar12;
            *(undefined4 *)(unaff_x26 + 0x58) = uVar12;
            *(undefined4 *)(unaff_x26 + 0x5c) = uVar12;
            *(undefined1 *)(unaff_x26 + 0x6a) = 0;
          }
          else {
            func_0x0011eb90();
          }
          goto code_r0x0011c308;
        }
      }
    }
    else {
      if (*(char *)(unaff_x26 + 0x6b) != '\0') {
        fVar44 = 0.0;
      }
      iVar9 = func_0x00129e5c(fVar42,fVar44);
      *(int *)(unaff_x26 + 0x54) = iVar9;
      *(int *)(unaff_x26 + 0x58) = iVar9;
      *(int *)(unaff_x26 + 0x5c) = iVar9;
      *(undefined1 *)(unaff_x26 + 0x6a) = 0;
      if ((uVar2 & 1) == 0) {
        if (((iVar9 == 0) || (*(short *)(*(long *)(unaff_x26 + 0x20) + (long)iVar9 * 2 + -2) == 10))
           || (func_0x0011cfe8(), *(int *)(unaff_x26 + 0x58) == *(int *)(unaff_x26 + 0x5c))) {
          *(undefined4 *)(unaff_x26 + 0x58) = *(undefined4 *)(unaff_x26 + 0x54);
          *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0x54);
        }
        uVar12 = func_0x0011ea4c();
        *(undefined4 *)(unaff_x26 + 0x54) = uVar12;
        *(undefined4 *)(unaff_x26 + 0x5c) = uVar12;
        func_0x0011eb30(*(undefined4 *)(unaff_x26 + 0xc),(int *)(unaff_x26 + 0x54));
      }
      else {
        sVar25 = *(short *)(*(long *)(unaff_x26 + 0x20) + (long)iVar9 * 2);
        func_0x0011cfe8();
        func_0x0011cfe8();
        func_0x0011cfe8();
        if ((unaff_w28 != 0) && (sVar25 != 10)) {
          *(int *)(unaff_x26 + 0x5c) = (int)*(undefined8 *)(unaff_x26 + 0x58);
          *(undefined8 *)(unaff_x26 + 0x54) = *(undefined8 *)(unaff_x26 + 0x58);
        }
        *(undefined1 *)(unaff_x26 + 0xe84) = 0;
      }
code_r0x0011c308:
      *(undefined4 *)(unaff_x26 + 0xe80) = 0xbe99999a;
      unaff_w19 = uStack00000000000000e4;
    }
  }
  else {
    fVar44 = *(float *)(unaff_x21 + 0xe44) - *(float *)(in_stack_000000c8 + 0x114);
    if (in_stack_00000030._4_4_ == 0) goto LAB_0011a8b4;
LAB_0011a998:
    *(undefined4 *)(unaff_x26 + 0x58) = 0;
    *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0xc);
    *(undefined4 *)(unaff_x26 + 0x54) = *(undefined4 *)(unaff_x26 + 0xc);
    *(undefined1 *)(unaff_x26 + 0x6a) = 0;
    *(undefined1 *)(unaff_x26 + 0xe85) = 1;
  }
  if ((*(char *)(unaff_x26 + 0xe85) != '\0') && (*(char *)(unaff_x21 + 0xe48) == '\0')) {
    *(undefined1 *)(unaff_x26 + 0xe85) = 0;
  }
  if ((((in_stack_00000090._4_4_ >> 10 & 1) != 0) && ((unaff_w19 >> 0xe & 1) == 0)) &&
     (iVar9 = func_0x000d78f8(0x200), iVar9 != 0)) {
    *(undefined4 *)(unaff_x29 + -0xf8) = 9;
    iVar9 = func_0x0011ebdc();
    if (iVar9 != 0) {
      func_0x0011cfe8();
    }
  }
  if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
    if ((_uStack0000000000000038 & 1) == 0) goto LAB_0011aa70;
    bVar7 = false;
  }
  else {
    bVar7 = *(char *)(unaff_x21 + 0xe5e) == '\0';
    uVar35 = uStack0000000000000038;
    if (bVar7) {
      uVar35 = 1;
    }
    if ((uVar35 & 1) == 0) {
LAB_0011aa70:
      bVar7 = *(char *)(unaff_x21 + 0xe5f) != '\0';
    }
  }
  if (0 < *(int *)(&UNK_000038d8 + unaff_x21)) {
    if ((!bVar7 && (unaff_w19 & 0x4000) == 0) && ((ulong)in_stack_00000040 & 1) == 0) {
      lVar16 = 0;
      do {
        uVar35 = (uint)*(ushort *)(*(long *)(&UNK_000038e0 + unaff_x21) + lVar16 * 2);
        *(uint *)(unaff_x29 + -0xf8) = uVar35;
        if ((uVar35 != 9) && (iVar9 = func_0x0011ebdc(), iVar9 != 0)) {
          func_0x0011cfe8();
        }
        lVar16 = lVar16 + 1;
      } while (lVar16 < *(int *)(&UNK_000038d8 + unaff_x21));
    }
    if (*(int *)(&UNK_000038dc + unaff_x21) < 0) {
      uVar17 = func_0x000b810c(0);
      if (*(long *)(&UNK_000038e0 + unaff_x21) != 0) {
        _memcpy(uVar17,*(long *)(&UNK_000038e0 + unaff_x21),
                (long)*(int *)(&UNK_000038d8 + unaff_x21) << 1);
        func_0x000b83d4(*(undefined8 *)(&UNK_000038e0 + unaff_x21));
      }
      *(undefined8 *)(&UNK_000038e0 + unaff_x21) = uVar17;
      *(undefined4 *)(&UNK_000038dc + unaff_x21) = 0;
    }
    *(undefined4 *)(&UNK_000038d8 + unaff_x21) = 0;
    iVar9 = *(int *)(in_stack_000000d8 + 0x804);
    unaff_w19 = uStack00000000000000e4;
    goto joined_r0x0011a94c;
  }
  iVar9 = *(int *)(in_stack_000000d8 + 0x804);
  if (iVar9 == unaff_w22) goto LAB_0011a950;
LAB_0011aaf0:
  bVar7 = false;
  _uStack0000000000000038 = _uStack0000000000000038 & 0xffffffff00000000;
joined_r0x0011b5dc:
  if (iVar9 == unaff_w22) {
    bVar8 = 0;
    pcVar26 = (char *)0x0;
    if (bVar7) {
      if ((unaff_w19 >> 0xe & 1) != 0) goto LAB_0011add4;
      if ((in_stack_00000090._4_4_ >> 0x14 & 1) != 0) {
        uVar35 = *(uint *)(unaff_x26 + 0xc);
        uVar18 = (ulong)uVar35;
        lVar16 = func_0x00129c14(unaff_x26 + 0x74,0,uVar18,0);
        if (((int)uVar35 < 1) || (lVar16 == 0)) {
          psVar40 = *(short **)(unaff_x26 + 0x20);
        }
        else {
          uVar27 = 0;
          psVar40 = *(short **)(unaff_x26 + 0x20);
          if ((0x1f < uVar35) && (0x3f < (ulong)(lVar16 - (long)psVar40))) {
            lVar30 = 0;
            uVar27 = uVar18 & 0xffffffe0;
            do {
              puVar37 = (undefined8 *)((long)psVar40 + lVar30);
              uVar17 = *puVar37;
              uVar24 = puVar37[3];
              uVar22 = puVar37[2];
              uVar49 = puVar37[5];
              uVar48 = puVar37[4];
              uVar52 = puVar37[7];
              uVar51 = puVar37[6];
              puVar1 = (undefined8 *)(lVar16 + lVar30);
              puVar1[1] = puVar37[1];
              *puVar1 = uVar17;
              puVar1[3] = uVar24;
              puVar1[2] = uVar22;
              puVar1[5] = uVar49;
              puVar1[4] = uVar48;
              puVar1[7] = uVar52;
              puVar1[6] = uVar51;
              lVar30 = lVar30 + 0x40;
            } while ((uVar18 & 0xffffffe0) * 2 != lVar30);
            if (uVar27 == uVar18) goto code_r0x0011ad4c;
          }
          do {
            *(short *)(lVar16 + uVar27 * 2) = psVar40[uVar27];
            uVar27 = uVar27 + 1;
          } while (uVar18 != uVar27);
        }
code_r0x0011ad4c:
        iVar9 = *(int *)(unaff_x26 + 0xc);
        lVar16 = (long)iVar9;
        *(undefined1 *)(unaff_x26 + 0xe86) = 1;
        iVar10 = func_0x000b91c4(psVar40,psVar40 + lVar16);
        *(int *)(unaff_x26 + 0xc) = *(int *)(unaff_x26 + 0xc) - iVar9;
        *(int *)(unaff_x26 + 0x10) = *(int *)(unaff_x26 + 0x10) - iVar10;
        sVar25 = *(short *)(*(long *)(unaff_x26 + 0x20) + lVar16 * 2);
        if (sVar25 != 0) {
          psVar31 = (short *)(*(long *)(unaff_x26 + 0x20) + lVar16 * 2);
          psVar41 = psVar40;
          do {
            psVar31 = psVar31 + 1;
            psVar40 = psVar41 + 1;
            *psVar41 = sVar25;
            sVar25 = *psVar31;
            psVar41 = psVar40;
          } while (sVar25 != 0);
        }
        *psVar40 = 0;
        *(undefined8 *)(unaff_x26 + 0x58) = 0;
        bVar8 = 1;
        pcVar26 = "";
        *(undefined4 *)(unaff_x26 + 0x54) = 0;
        unaff_x23 = in_stack_000000e8;
        unaff_w19 = uStack00000000000000e4;
        goto LAB_0011add4;
      }
      pcVar26 = *(char **)(unaff_x26 + 0x40);
      iVar9 = _strcmp(unaff_x23,pcVar26);
      if (iVar9 == 0) {
        bVar8 = 0;
        pcVar26 = (char *)0x0;
        goto code_r0x0011ade8;
      }
      iVar9 = *(int *)(unaff_x26 + 0x38);
      uVar35 = iVar9 - 1;
      *(undefined8 *)(unaff_x29 + -0xf8) = 0;
      *(undefined8 *)(unaff_x29 + -0xf0) = 0;
      if (1 < iVar9) {
        iVar9 = func_0x000b8e80(pcVar26,pcVar26 + uVar35);
        func_0x0011e9c0(unaff_x29 + -0xf8,iVar9 + 1);
        func_0x000b8db0(*(undefined8 *)(unaff_x29 + -0xf0),*(undefined4 *)(unaff_x29 + -0xf8),
                        pcVar26,pcVar26 + uVar35,0);
      }
      func_0x0011eeb4();
      func_0x0011f010(unaff_x29 + -0xf8);
      bVar8 = 1;
      unaff_w19 = uStack00000000000000e4;
code_r0x0011adec:
      *(undefined1 *)(unaff_x26 + 0x48) = 1;
      uVar15 = *(int *)(unaff_x26 + 0x18) << 2 | 1;
      iVar9 = *(int *)(unaff_x26 + 0x2c);
      if (iVar9 < (int)uVar15) {
        iVar10 = iVar9;
        if (iVar9 < 0) {
          iVar10 = iVar9 + 1;
        }
        uVar36 = 8;
        if (iVar9 != 0) {
          uVar36 = iVar9 + (iVar10 >> 1);
        }
        if ((int)uVar36 <= (int)uVar15) {
          uVar36 = uVar15;
        }
        uVar17 = func_0x000b810c((long)(int)uVar36);
        if (*(long *)(unaff_x26 + 0x30) != 0) {
          _memcpy(uVar17,*(long *)(unaff_x26 + 0x30),(long)*(int *)(unaff_x26 + 0x28));
          func_0x000b83d4(*(undefined8 *)(unaff_x26 + 0x30));
        }
        *(undefined8 *)(unaff_x26 + 0x30) = uVar17;
        *(uint *)(unaff_x26 + 0x2c) = uVar36;
        unaff_w19 = uStack00000000000000e4;
      }
      else {
        uVar17 = *(undefined8 *)(unaff_x26 + 0x30);
      }
      *(uint *)(unaff_x26 + 0x28) = uVar15;
      func_0x000b9034(uVar17,uVar15,*(undefined8 *)(unaff_x26 + 0x20),0);
      if (!bVar7) goto code_r0x0011ae94;
code_r0x0011ae88:
      if ((in_stack_00000090._4_4_ >> 5 & 1) != 0) {
        if (uStack0000000000000038 != 0) goto code_r0x0011ae94;
      }
    }
    else {
LAB_0011add4:
      if ((unaff_w19 >> 0xe & 1) == 0) {
code_r0x0011ade8:
        uVar35 = 0;
        goto code_r0x0011adec;
      }
      uVar35 = 0;
      if (bVar7) goto code_r0x0011ae88;
code_r0x0011ae94:
      if ((in_stack_00000090 & 0x801c000000000) != 0) {
        if ((in_stack_00000090._4_4_ >> 6 & 1) == 0) {
code_r0x0011aec8:
          if ((in_stack_00000090._4_4_ >> 7 & 1) == 0) {
code_r0x0011aefc:
            if (((in_stack_00000090._4_4_ >> 0x13 & 1) == 0) ||
               (*(char *)(unaff_x26 + 0xe86) == '\0')) {
              unaff_w19 = uStack00000000000000e4;
              if ((in_stack_00000090._4_4_ >> 8 & 1) == 0) goto code_r0x0011b0d0;
              uVar12 = 0;
              uVar57 = 0x100;
            }
            else {
              uVar12 = 0;
              uVar57 = 0x80000;
            }
          }
          else {
            uVar12 = 0x203;
            uVar18 = func_0x000d68ec(0x203,1);
            if ((uVar18 & 1) == 0) {
              uVar12 = 0x204;
              uVar18 = func_0x000d68ec(0x204,1);
              if ((uVar18 & 1) == 0) goto code_r0x0011aefc;
            }
            uVar57 = 0x80;
          }
        }
        else {
          uVar12 = 0x200;
          uVar18 = func_0x000d78f8(0x200);
          if ((uVar18 & 1) == 0) goto code_r0x0011aec8;
          uVar57 = 0x40;
        }
        *(undefined8 *)(unaff_x29 + -0xc0) = 0;
        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        *(undefined8 *)(unaff_x29 + -200) = 0;
        *(undefined8 *)(unaff_x29 + -0xd0) = 0;
        *(long *)(unaff_x29 + -0xf8) = unaff_x21;
        *(undefined4 *)(unaff_x29 + -0xf0) = uVar57;
        *(uint *)(unaff_x29 + -0xec) = uStack00000000000000e4;
        *(char **)(unaff_x29 + -0xe8) = in_stack_000000d0;
        pcVar28 = unaff_x23;
        if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
          pcVar28 = *(char **)(unaff_x26 + 0x30);
        }
        *(undefined4 *)(unaff_x29 + -0xdc) = uVar12;
        *(char **)(unaff_x29 + -0xd8) = pcVar28;
        uVar12 = *(undefined4 *)(unaff_x26 + 0x4c);
        *(undefined4 *)(unaff_x29 + -0xd0) = *(undefined4 *)(unaff_x26 + 0x10);
        *(undefined4 *)(unaff_x29 + -0xcc) = uVar12;
        lVar16 = *(long *)(unaff_x26 + 0x20);
        iVar9 = func_0x000b91c4(lVar16,lVar16 + (long)*(int *)(unaff_x26 + 0x54) * 2);
        *(int *)(unaff_x29 + -0xc4) = iVar9;
        iVar10 = func_0x000b91c4(lVar16,lVar16 + (long)*(int *)(unaff_x26 + 0x58) * 2);
        *(int *)(unaff_x29 + -0xc0) = iVar10;
        iVar11 = func_0x000b91c4(lVar16,lVar16 + (long)*(int *)(unaff_x26 + 0x5c) * 2);
        *(int *)(unaff_x29 + -0xbc) = iVar11;
        (*in_stack_00000068)(unaff_x29 + -0xf8);
        cVar3 = *(char *)(unaff_x29 + -200);
        if ((cVar3 != '\0') || (*(int *)(unaff_x29 + -0xc4) != iVar9)) {
          uVar12 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                   *(long *)(unaff_x29 + -0xd8) + (long)*(int *)(unaff_x29 + -0xc4))
          ;
          *(undefined4 *)(unaff_x26 + 0x54) = uVar12;
          *(undefined1 *)(unaff_x26 + 0xe84) = 1;
        }
        iVar9 = *(int *)(unaff_x29 + -0xc0);
        if ((cVar3 != '\0') || (iVar9 != iVar10)) {
          if (iVar9 == *(int *)(unaff_x29 + -0xc4)) {
            uVar12 = *(undefined4 *)(unaff_x26 + 0x54);
          }
          else {
            uVar12 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                     *(long *)(unaff_x29 + -0xd8) + (long)iVar9);
          }
          *(undefined4 *)(unaff_x26 + 0x58) = uVar12;
        }
        iVar9 = *(int *)(unaff_x29 + -0xbc);
        if ((cVar3 != '\0') || (iVar9 != iVar11)) {
          if (iVar9 == *(int *)(unaff_x29 + -0xc0)) {
            uVar12 = *(undefined4 *)(unaff_x26 + 0x58);
          }
          else {
            uVar12 = func_0x000b8e80(*(long *)(unaff_x29 + -0xd8),
                                     *(long *)(unaff_x29 + -0xd8) + (long)iVar9);
          }
          *(undefined4 *)(unaff_x26 + 0x5c) = uVar12;
          if (cVar3 != '\0') {
            func_0x0011f040();
            if (((in_stack_00000090._4_4_ >> 0x12 & 1) != 0) &&
               (iVar9 = *(int *)(unaff_x29 + -0xd0) - iStack0000000000000010,
               iVar9 != 0 && iStack0000000000000010 <= *(int *)(unaff_x29 + -0xd0))) {
              func_0x0011e9c0((int *)(unaff_x26 + 0x18),iVar9 + *(int *)(unaff_x26 + 0x18));
            }
            uVar12 = func_0x000b8db0(*(undefined8 *)(unaff_x26 + 0x20),
                                     *(undefined4 *)(unaff_x26 + 0x18),
                                     *(undefined8 *)(unaff_x29 + -0xd8),0,0);
            *(undefined4 *)(unaff_x26 + 0xc) = uVar12;
            *(undefined4 *)(unaff_x26 + 0x10) = *(undefined4 *)(unaff_x29 + -0xd0);
            *(undefined4 *)(unaff_x26 + 0xe80) = 0xbe99999a;
          }
        }
        unaff_w19 = uStack00000000000000e4;
      }
code_r0x0011b0d0:
      if ((unaff_w19 >> 0xe & 1) == 0) {
        pcVar28 = *(char **)(unaff_x26 + 0x30);
        iVar9 = _strcmp(pcVar28,unaff_x23);
        if (iVar9 != 0) {
          uVar35 = *(uint *)(unaff_x26 + 0x10);
          bVar8 = 1;
          pcVar26 = pcVar28;
        }
      }
    }
    in_stack_00000030._4_4_ = (uint)bVar8;
    if (*piStack0000000000000078 == unaff_w22) goto code_r0x0011b120;
code_r0x0011b608:
    if (pcVar26 != (char *)0x0) goto code_r0x0011b614;
code_r0x0011b180:
    uVar15 = uStack0000000000000074;
  }
  else {
    uVar35 = 0;
    pcVar26 = (char *)0x0;
    in_stack_00000030._4_4_ = 0;
    if (*piStack0000000000000078 != unaff_w22) goto code_r0x0011b608;
code_r0x0011b120:
    if (*(int *)(in_stack_000000d8 + 0x804) != unaff_w22) {
      iVar9 = func_0x000cfb2c();
      if ((iVar9 != 0) && ((uStack00000000000000e4 >> 0xe & 1) == 0)) {
        pcVar28 = *(char **)(&UNK_00005d98 + unaff_x21);
        iVar9 = _strcmp(pcVar28,unaff_x23);
        if (iVar9 != 0) {
          uVar35 = piStack0000000000000078[2] - 1;
          in_stack_00000030._4_4_ = 1;
          pcVar26 = pcVar28;
        }
      }
    }
    *piStack0000000000000078 = 0;
    if (pcVar26 == (char *)0x0) goto code_r0x0011b180;
code_r0x0011b614:
    uVar15 = uStack0000000000000074;
    if ((in_stack_00000090._4_4_ >> 0x12 & 1) != 0) {
      *(undefined8 *)(unaff_x29 + -0xd8) = 0;
      *(undefined8 *)(unaff_x29 + -0xe0) = 0;
      *(undefined8 *)(unaff_x29 + -200) = 0;
      *(undefined8 *)(unaff_x29 + -0xd0) = 0;
      *(undefined8 *)(unaff_x29 + -0xc0) = 0;
      *(long *)(unaff_x29 + -0xf8) = unaff_x21;
      *(undefined4 *)(unaff_x29 + -0xf0) = 0x40000;
      *(uint *)(unaff_x29 + -0xec) = uStack00000000000000e4;
      *(char **)(unaff_x29 + -0xd8) = unaff_x23;
      if (in_stack_000000a8._4_4_ <= (int)(uVar35 + 1)) {
        in_stack_000000a8._4_4_ = uVar35 + 1;
      }
      *(uint *)(unaff_x29 + -0xd0) = uVar35;
      *(int *)(unaff_x29 + -0xcc) = in_stack_000000a8._4_4_;
      *(char **)(unaff_x29 + -0xe8) = in_stack_000000d0;
      (*in_stack_00000068)(unaff_x29 + -0xf8);
      unaff_x23 = *(char **)(unaff_x29 + -0xd8);
      in_stack_000000a8._4_4_ = *(int *)(unaff_x29 + -0xcc);
      uVar35 = *(uint *)(unaff_x29 + -0xd0);
      if ((int)(in_stack_000000a8._4_4_ - 1U) <= (int)*(uint *)(unaff_x29 + -0xd0)) {
        uVar35 = in_stack_000000a8._4_4_ - 1U;
      }
    }
    if ((int)(uVar35 + 1) < in_stack_000000a8._4_4_) {
      in_stack_000000a8._4_4_ = uVar35 + 1;
    }
    func_0x000b7ff8(unaff_x23,pcVar26,(long)in_stack_000000a8._4_4_);
  }
  in_stack_00000040 = (float *)(&UNK_00005f3c + unaff_x21);
  iVar9 = 0;
  if (*(int *)(in_stack_000000d8 + 0x804) == unaff_w22) {
    iVar9 = iStack000000000000003c;
  }
  if (iVar9 == 1) {
    func_0x000c24fc();
  }
  else if (*(int *)(in_stack_000000d8 + 0x804) == unaff_w22) {
    *(undefined4 *)(&UNK_00006210 + unaff_x21) = 1;
  }
  if (in_stack_000000f0._4_4_ == 0) {
    func_0x000bd308(unaff_x29 + -0xa8);
    uVar12 = *(undefined4 *)(unaff_x29 + -0xa8);
    uVar57 = *(undefined4 *)(unaff_x29 + -0xa4);
    uVar58 = *(undefined4 *)(unaff_x29 + -0xa0);
    uVar60 = *(undefined4 *)(unaff_x29 + -0x9c);
    uVar17 = func_0x000bba44(0x3f800000,7);
    func_0x000bcf14(uVar12,uVar57,uVar58,uVar60,*(undefined4 *)(&UNK_0000392c + unaff_x21),uVar17,1)
    ;
  }
  uStack0000000000000108 = *(undefined8 *)(unaff_x29 + -0xa8);
  fVar44 = (float)((ulong)uStack0000000000000108 >> 0x20);
  _fStack0000000000000110 =
       CONCAT44(in_stack_00000080 + fVar44,in_stack_000000b0 + (float)uStack0000000000000108);
  if (in_stack_000000f0._4_4_ == 0) {
    uStack0000000000000100 =
         CONCAT44(fVar44 + (float)((ulong)*(undefined8 *)(in_stack_000000d8 + 0xc4) >> 0x20),
                  (float)uStack0000000000000108 + (float)*(undefined8 *)(in_stack_000000d8 + 0xc4));
  }
  else {
    uStack0000000000000100 = *(ulong *)(in_stack_000000c8 + 0x110);
  }
  if (uStack0000000000000070 != 0) {
    unaff_x23 = *(char **)(unaff_x26 + 0x30);
  }
  if (uVar15 == 0) {
    if ((uStack00000000000000e0 | uStack000000000000004c) == 1) {
      in_stack_000000d0 = unaff_x23 + *(int *)(unaff_x26 + 0x10);
      goto code_r0x0011b7f4;
    }
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011b834;
    if (*(int *)(in_stack_000000d8 + 0x804) == unaff_w22) {
      lVar16 = (long)*(int *)(unaff_x26 + 0x10);
    }
    else {
      lVar16 = _strlen(unaff_x23);
    }
    in_stack_000000d0 = unaff_x23 + lVar16;
    fVar44 = 0.0;
    in_stack_000000b0 = 0.0;
    if (0x1fffff < (long)in_stack_000000d0 - (long)unaff_x23) goto code_r0x0011bbe0;
code_r0x0011b7c4:
    puVar37 = &uStack0000000000000108;
code_r0x0011bafc:
    uVar17 = func_0x000bba44(0x3f800000,uStack0000000000000074);
    func_0x000f4e60(*(undefined4 *)(&UNK_00003d38 + unaff_x21),0,
                    *(undefined8 *)(in_stack_000000c8 + 0x2a8),
                    *(undefined8 *)(&UNK_00003d30 + unaff_x21),&uStack0000000000000100,uVar17,
                    unaff_x23,in_stack_000000d0,puVar37);
    uVar35 = uStack0000000000000024;
joined_r0x0011c234:
    in_stack_000000e8 = unaff_x23;
    if ((uVar35 & 1) == 0) goto code_r0x0011bb4c;
code_r0x0011c078:
    fVar42 = in_stack_000000b0;
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011c07c;
code_r0x0011c104:
    uVar35 = uVar35 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uVar35 = 1;
    }
    if ((uVar35 & 1) == 0) goto LAB_0011c11c;
LAB_0011c1cc:
    if (0.0 < unaff_s14) goto LAB_0011c1d4;
LAB_0011c148:
    if (in_stack_00000030._4_4_ != 1 || (in_stack_00000090 & 0x800000000000000) != 0)
    goto LAB_0011c160;
  }
  else {
    lVar16 = _strlen(in_stack_00000098);
    in_stack_000000d0 = in_stack_00000098 + lVar16;
    unaff_x23 = in_stack_00000098;
    if (((uStack00000000000000e0 | uStack000000000000004c) & 1) != 0) {
code_r0x0011b7f4:
      puVar38 = *(ushort **)(unaff_x26 + 0x20);
      if (uStack00000000000000e0 == 0) {
        puVar21 = (ushort *)0x0;
        iVar9 = -1000;
      }
      else {
        puVar21 = puVar38 + *(int *)(unaff_x26 + 0x54);
        iVar9 = -1;
      }
      uVar35 = (uint)(uStack00000000000000e0 != 0);
      if (uStack000000000000004c == 0) {
        puVar39 = (ushort *)0x0;
        iVar10 = -1000;
      }
      else {
        iVar10 = *(int *)(unaff_x26 + 0x58);
        if (*(int *)(unaff_x26 + 0x5c) <= *(int *)(unaff_x26 + 0x58)) {
          iVar10 = *(int *)(unaff_x26 + 0x5c);
        }
        puVar39 = puVar38 + iVar10;
        uVar35 = uVar35 + 1;
        iVar10 = -1;
      }
      iVar11 = 0;
      iVar14 = uVar35 + (in_stack_000000f0._4_4_ >> 0x1a);
      uVar2 = *puVar38;
      puVar19 = puVar38;
joined_r0x0011b89c:
      do {
        if (uVar2 == 10) {
          iVar11 = iVar11 + 1;
          if (iVar9 == -1) {
            if (puVar19 < puVar21) {
              iVar9 = -1;
            }
            else {
              iVar9 = iVar11;
              if (iVar14 < 2) goto code_r0x0011b934;
              iVar14 = iVar14 + -1;
            }
          }
          if (iVar10 != -1) goto code_r0x0011b8a4;
          if (puVar19 < puVar39) {
            iVar10 = -1;
            puVar19 = puVar19 + 1;
            uVar2 = *puVar19;
            goto joined_r0x0011b89c;
          }
          iVar10 = iVar11;
          if (iVar14 < 2) {
code_r0x0011b934:
            puVar19 = (ushort *)func_0x000b84f0(puVar21,puVar38);
            piVar29 = *(int **)(&UNK_00003d30 + unaff_x21);
            fVar42 = *(float *)(&UNK_00003d38 + unaff_x21);
            fVar44 = 0.0;
            do {
              fVar46 = 0.0;
              puVar20 = puVar19;
              while( true ) {
                do {
                  if (puVar21 <= puVar20) {
                    if (iVar9 == -1) {
                      iVar9 = iVar11 + 1;
                    }
                    if (iVar10 == -1) {
                      iVar10 = iVar11 + 1;
                    }
                    if (fVar46 <= fVar44) {
                      fVar46 = fVar44;
                    }
                    fVar50 = 0.0;
                    fVar59 = 0.0;
                    fVar43 = fVar42;
                    if (iVar10 < 0) goto code_r0x0011ba78;
                    puVar21 = (ushort *)func_0x000b84f0(puVar39,puVar38);
                    piVar29 = *(int **)(&UNK_00003d30 + unaff_x21);
                    fVar43 = *(float *)(&UNK_00003d38 + unaff_x21);
                    fVar44 = 0.0;
                    goto LAB_0011ba14;
                  }
                  puVar19 = puVar20 + 1;
                  uVar2 = *puVar20;
                  puVar20 = puVar19;
                } while (uVar2 == 0xd);
                if (uVar2 == 10) break;
                pfVar32 = (float *)(piVar29 + 4);
                if ((int)(uint)uVar2 < *piVar29) {
                  pfVar32 = (float *)(*(long *)(piVar29 + 2) + (ulong)(uint)uVar2 * 4);
                }
                fVar46 = fVar46 + (fVar42 / (float)piVar29[5]) * *pfVar32;
              }
              if (fVar44 < fVar46) {
                fVar44 = fVar46;
              }
            } while( true );
          }
          iVar14 = iVar14 + -1;
          uVar2 = puVar19[1];
        }
        else {
          if (uVar2 == 0) goto code_r0x0011b934;
code_r0x0011b8a4:
          uVar2 = puVar19[1];
        }
        puVar19 = puVar19 + 1;
      } while( true );
    }
    fVar44 = 0.0;
    if (in_stack_000000f0._4_4_ != 0) {
code_r0x0011b834:
      iVar9 = 0;
      in_stack_000000d0 = unaff_x23;
      while( true ) {
        pcVar26 = in_stack_000000d0 + 1;
        cVar3 = *in_stack_000000d0;
        if (cVar3 == '\0') break;
        in_stack_000000d0 = pcVar26;
        if (cVar3 == '\n') {
          iVar9 = iVar9 + 1;
        }
      }
      fVar44 = *(float *)(&UNK_00003d38 + unaff_x21) * (float)(iVar9 + 1);
      if (in_stack_000000f0._4_4_ == 0) {
        lVar16 = (long)in_stack_000000d0 - (long)unaff_x23;
        goto joined_r0x0011bb8c;
      }
      puVar37 = (undefined8 *)0x0;
      goto code_r0x0011bafc;
    }
    lVar16 = (long)in_stack_000000d0 - (long)in_stack_00000098;
    in_stack_000000b0 = 0.0;
joined_r0x0011bb8c:
    if (lVar16 < 0x200000) goto code_r0x0011b7c4;
code_r0x0011bbe0:
    uVar35 = uStack0000000000000024;
    in_stack_000000e8 = unaff_x23;
    if ((uStack0000000000000024 & 1) != 0) goto code_r0x0011c078;
code_r0x0011bb4c:
    func_0x000d34c4();
    fVar42 = in_stack_000000b0;
    if (in_stack_000000f0._4_4_ == 0) goto code_r0x0011c104;
code_r0x0011c07c:
    uStack00000000000000f8._0_4_ = fVar42;
    uStack00000000000000f8._4_4_ = fVar44 + *(float *)(&UNK_00003928 + unaff_x21);
    lVar16 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar16 + 0xc0) = 1;
    if (*(char *)(lVar16 + 0xc3) == '\0') {
      uVar17 = *(undefined8 *)(lVar16 + 0x110);
      *(undefined8 *)(unaff_x29 + -0xf8) = uVar17;
      *(ulong *)(unaff_x29 + -0xf0) =
           CONCAT44(uStack00000000000000f8._4_4_ + (float)((ulong)uVar17 >> 0x20),
                    (float)uStack00000000000000f8 + (float)uVar17);
      func_0x000d0d0c(0xbf800000,&uStack00000000000000f8);
      func_0x000d0e24(unaff_x29 + -0xf8,0,0,0);
    }
    *(uint *)(in_stack_000000d8 + 0x112c) = *(uint *)(in_stack_000000d8 + 0x112c) | 0x401;
    func_0x000d0b80();
    uVar15 = in_stack_000000a0[2];
    func_0x000d818c();
    if (*in_stack_000000a0 != 0) goto code_r0x0011c104;
    *in_stack_000000a0 = unaff_w22;
    in_stack_000000a0[1] = in_stack_00000020;
    in_stack_000000a0[2] = uVar15 & 0x80 | uStack000000000000001c;
    uVar35 = uVar35 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uVar35 = 1;
    }
    if ((uVar35 & 1) != 0) goto LAB_0011c1cc;
LAB_0011c11c:
    func_0x000dc80c("{","}");
    func_0x000bc2c4(&uStack0000000000000100,in_stack_000000e8,in_stack_000000d0);
    if (unaff_s14 <= 0.0) goto LAB_0011c148;
LAB_0011c1d4:
    func_0x000bc130(*(float *)(unaff_x29 + -0xa0) + *(float *)(&UNK_0000393c + unaff_x21),
                    *(float *)(unaff_x29 + -0xa4) + *(float *)(&UNK_00003928 + unaff_x21),
                    in_stack_00000028,0,1);
    if (in_stack_00000030._4_4_ != 1 || (in_stack_00000090 & 0x800000000000000) != 0)
    goto LAB_0011c160;
  }
  func_0x000c255c();
LAB_0011c160:
  if ((in_stack_00000090 & 0x2000000000) != 0) {
    in_stack_00000030._4_4_ = uStack0000000000000038;
  }
  return in_stack_00000030._4_4_;
LAB_0011ba14:
  fVar50 = 0.0;
  puVar19 = puVar21;
LAB_0011ba18:
  if (puVar19 < puVar39) goto code_r0x0011ba20;
  if (fVar50 <= fVar44) {
    fVar50 = fVar44;
  }
  fVar59 = fVar43 * (float)iVar10;
code_r0x0011ba78:
  fVar42 = fVar42 * (float)iVar9;
  fVar45 = fVar43 * (float)(iVar11 + 1);
  fVar44 = fVar45;
  if (in_stack_000000f0._4_4_ == 0) {
    fVar44 = 0.0;
  }
  if ((uStack00000000000000e0 != 0) && (*(char *)(unaff_x26 + 0xe84) != '\0')) {
    if ((in_stack_00000090._4_4_ >> 0xc & 1) == 0) {
      if (*(float *)(unaff_x26 + 0x50) <= fVar46) {
        fVar53 = fVar46 - (in_stack_000000b0 - *(float *)(in_stack_000000d8 + 0xc4));
        if (fVar53 < *(float *)(unaff_x26 + 0x50)) goto code_r0x0011bc1c;
        fVar53 = in_stack_000000b0 * 0.25 + fVar53;
      }
      else {
        fVar47 = fVar46 - in_stack_000000b0 * 0.25;
        fVar53 = 0.0;
        if (0.0 < fVar47) {
          fVar53 = fVar47;
        }
      }
      *(float *)(unaff_x26 + 0x50) = (float)(int)fVar53;
    }
    else {
      *(undefined4 *)(unaff_x26 + 0x50) = 0;
    }
code_r0x0011bc1c:
    if (in_stack_000000f0._4_4_ != 0) {
      fVar43 = fVar42 - fVar43;
      if (unaff_s13 <= fVar43) {
        fVar43 = *(float *)(&UNK_00003928 + unaff_x21);
        if (unaff_s13 <= fVar42 - (in_stack_00000080 + fVar43 * -2.0)) {
          unaff_s13 = (fVar42 - in_stack_00000080) + fVar43 * 2.0;
        }
      }
      else {
        unaff_s13 = 0.0;
        if (0.0 < fVar43) {
          unaff_s13 = fVar43;
        }
        fVar43 = *(float *)(&UNK_00003928 + unaff_x21);
      }
      in_stack_00000080 = (fVar45 + fVar43 * 2.0) - in_stack_00000080;
      if (in_stack_00000080 < 0.0) {
        in_stack_00000080 = 0.0;
      }
      if (unaff_s13 <= in_stack_00000080) {
        in_stack_00000080 = unaff_s13;
      }
      fVar43 = 0.0;
      if (0.0 <= unaff_s13) {
        fVar43 = in_stack_00000080;
      }
      uStack0000000000000100 =
           CONCAT44(uStack0000000000000100._4_4_ + (*(float *)(in_stack_000000c8 + 0x90) - fVar43),
                    (float)uStack0000000000000100);
      *(float *)(in_stack_000000c8 + 0x90) = fVar43;
    }
    *(undefined1 *)(unaff_x26 + 0xe84) = 0;
  }
  fVar43 = *(float *)(unaff_x26 + 0x50);
  if (uStack000000000000004c != 0) {
    iVar10 = *(int *)(unaff_x26 + 0x58);
    iVar11 = *(int *)(unaff_x26 + 0x5c);
    iVar9 = iVar10;
    if (iVar11 <= iVar10) {
      iVar9 = iVar11;
    }
    if (iVar10 <= iVar11) {
      iVar10 = iVar11;
    }
    uVar17 = 0x3f800000;
    if (uStack00000000000000e0 == 0) {
      uVar17 = 0x3f19999a;
    }
    uVar17 = func_0x000bba44(uVar17,0x2f);
    fVar45 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar45 = -1.0;
    }
    fVar53 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar53 = 2.0;
    }
    if (iVar9 < iVar10) {
      puVar21 = puVar38 + iVar10;
      puVar38 = puVar38 + iVar9;
      uVar18 = uStack0000000000000100 & 0xffffffff;
      fVar50 = fVar50 + (float)uStack0000000000000100;
      fVar59 = fVar59 + uStack0000000000000100._4_4_;
      fVar47 = *(float *)(&UNK_00003d38 + unaff_x21);
      do {
        if (fStack0000000000000114 + fVar47 < fVar59) break;
        puVar39 = puVar38;
        if (uStack0000000000000108._4_4_ <= fVar59) {
          piVar29 = *(int **)(&UNK_00003d30 + unaff_x21);
          pfVar32 = (float *)(piVar29 + 4);
          fVar54 = 0.0;
          while (puVar38 < puVar21) {
            puVar39 = puVar38 + 1;
            uVar2 = *puVar38;
            puVar38 = puVar39;
            if (uVar2 != 0xd) {
              if (uVar2 == 10) {
                fVar55 = 0.0;
                if (0.0 < fVar54) {
                  fVar55 = fVar54;
                }
                fVar54 = 0.0;
                if (0.0 <= fVar55) {
                  fVar54 = fVar55;
                }
                goto joined_r0x0011be20;
              }
              pfVar33 = pfVar32;
              if ((int)(uint)uVar2 < *piVar29) {
                pfVar33 = (float *)(*(long *)(piVar29 + 2) + (ulong)(uint)uVar2 * 4);
              }
              fVar54 = fVar54 + (fVar47 / (float)piVar29[5]) * *pfVar33;
            }
          }
          if (fVar54 <= 0.0) {
            fVar54 = 0.0;
          }
joined_r0x0011be20:
          if (fVar54 <= 0.0) {
            if (0x20 < *piVar29) {
              pfVar32 = (float *)(*(long *)(piVar29 + 2) + 0x80);
            }
            fVar54 = (float)(int)(*pfVar32 * 0.5);
          }
          fVar56 = (fVar50 - fVar43) + 0.0;
          fVar55 = fVar59 + (fVar45 - fVar47);
          fVar54 = (fVar50 - fVar43) + fVar54;
          if (fVar56 < (float)uStack0000000000000108) {
            fVar56 = (float)uStack0000000000000108;
          }
          if (fVar55 < uStack0000000000000108._4_4_) {
            fVar55 = uStack0000000000000108._4_4_;
          }
          *(float *)(unaff_x29 + -0xf8) = fVar56;
          *(float *)(unaff_x29 + -0xf4) = fVar55;
          if (fStack0000000000000110 <= fVar54) {
            fVar54 = fStack0000000000000110;
          }
          fVar50 = fVar53 + fVar59;
          if (fStack0000000000000114 <= fVar53 + fVar59) {
            fVar50 = fStack0000000000000114;
          }
          *(float *)(unaff_x29 + -0xf0) = fVar54;
          *(float *)(unaff_x29 + -0xec) = fVar50;
          bVar7 = false;
          bVar5 = true;
          bVar6 = false;
          if (uStack0000000000000108._4_4_ < fVar50) {
            bVar7 = false;
            bVar5 = false;
            bVar6 = true;
            if (!NAN(fStack0000000000000114) && !NAN(fVar55)) {
              bVar7 = fStack0000000000000114 < fVar55;
              bVar5 = fStack0000000000000114 == fVar55;
              bVar6 = false;
            }
          }
          bVar4 = false;
          if ((!bVar5 && bVar7 == bVar6) &&
             (bVar4 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar54))) {
            bVar4 = (float)uStack0000000000000108 < fVar54;
          }
          bVar7 = false;
          bVar5 = true;
          bVar6 = false;
          if (bVar4) {
            bVar7 = false;
            bVar5 = false;
            bVar6 = true;
            if (!NAN(fStack0000000000000110) && !NAN(fVar56)) {
              bVar7 = fStack0000000000000110 < fVar56;
              bVar5 = fStack0000000000000110 == fVar56;
              bVar6 = false;
            }
          }
          if (!bVar5 && bVar7 == bVar6) {
            func_0x000f3bb0(0,*(undefined8 *)(in_stack_000000c8 + 0x2a8),unaff_x29 + -0xf8,
                            unaff_x29 + -0xf0,uVar17,0);
            uVar18 = uStack0000000000000100 & 0xffffffff;
            fVar47 = *(float *)(&UNK_00003d38 + unaff_x21);
          }
        }
        else {
          do {
            puVar38 = puVar39;
            if (puVar21 <= puVar39) break;
            puVar38 = puVar39 + 1;
            uVar2 = *puVar39;
            puVar39 = puVar38;
          } while (uVar2 != 10);
        }
        fVar59 = fVar59 + fVar47;
        fVar50 = (float)uVar18;
      } while (puVar38 < puVar21);
    }
  }
  if (in_stack_000000f0._4_4_ == 0) {
    if ((long)in_stack_000000d0 - (long)unaff_x23 < 0x200000) {
      puVar37 = &uStack0000000000000108;
      goto code_r0x0011bf08;
    }
  }
  else {
    puVar37 = (undefined8 *)0x0;
code_r0x0011bf08:
    uVar17 = func_0x000bba44(0x3f800000,uStack0000000000000074);
    uVar22 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
    uVar24 = *(undefined8 *)(&UNK_00003d30 + unaff_x21);
    uVar12 = *(undefined4 *)(&UNK_00003d38 + unaff_x21);
    *(float *)(unaff_x29 + -0xf8) = (float)uStack0000000000000100 - fVar43;
    *(float *)(unaff_x29 + -0xf4) = uStack0000000000000100._4_4_;
    func_0x000f4e60(uVar12,0,uVar22,uVar24,unaff_x29 + -0xf8,uVar17,unaff_x23,in_stack_000000d0,
                    puVar37);
  }
  in_stack_000000b0 = in_stack_00000050;
  uVar35 = uStack0000000000000024;
  if (uStack00000000000000e0 != 0) {
    fVar50 = *(float *)(unaff_x21 + 0x18) + *(float *)(unaff_x26 + 0xe80);
    *(float *)(unaff_x26 + 0xe80) = fVar50;
    bVar7 = true;
    if ((*(char *)(unaff_x21 + 0x5b) != '\0') && (0.0 < fVar50)) {
      fVar50 = (float)_fmodf(fVar50,0x3f99999a);
      bVar7 = fVar50 <= 0.8;
    }
    uVar35 = uStack0000000000000024;
    fVar43 = (float)(int)((fVar46 + (float)uStack0000000000000100) - fVar43);
    fVar59 = (float)(int)(fVar42 + uStack0000000000000100._4_4_);
    fVar46 = (fVar59 - *(float *)(&UNK_00003d38 + unaff_x21)) + 0.5;
    fVar50 = fVar43 + 1.0;
    *(float *)(unaff_x29 + -0xf8) = fVar43;
    *(float *)(unaff_x29 + -0xf4) = fVar46;
    fVar42 = fVar59 + -1.5;
    *(float *)(unaff_x29 + -0xf0) = fVar50;
    *(float *)(unaff_x29 + -0xec) = fVar42;
    if (bVar7) {
      bVar7 = false;
      bVar5 = true;
      bVar6 = false;
      if (uStack0000000000000108._4_4_ < fVar42) {
        bVar7 = false;
        bVar5 = false;
        bVar6 = true;
        if (!NAN(fStack0000000000000114) && !NAN(fVar46)) {
          bVar7 = fStack0000000000000114 < fVar46;
          bVar5 = fStack0000000000000114 == fVar46;
          bVar6 = false;
        }
      }
      bVar4 = false;
      if ((!bVar5 && bVar7 == bVar6) &&
         (bVar4 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar50))) {
        bVar4 = (float)uStack0000000000000108 < fVar50;
      }
      bVar7 = false;
      bVar5 = true;
      bVar6 = false;
      if (bVar4) {
        bVar7 = false;
        bVar5 = false;
        bVar6 = true;
        if (!NAN(fStack0000000000000110) && !NAN(fVar43)) {
          bVar7 = fStack0000000000000110 < fVar43;
          bVar5 = fStack0000000000000110 == fVar43;
          bVar6 = false;
        }
      }
      if (!bVar5 && bVar7 == bVar6) {
        uVar22 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
        uStack00000000000000f8._0_4_ = fVar43;
        uStack00000000000000f8._4_4_ = fVar42;
        uVar17 = func_0x000bba44(0x3f800000,0);
        func_0x000f397c(0x3f800000,uVar22,unaff_x29 + -0xf8,&uStack00000000000000f8,uVar17);
      }
    }
    if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
      *(undefined1 *)(piStack0000000000000078 + 0x6c) = 1;
      *in_stack_00000040 = fVar43 + -1.0;
      *(float *)(&UNK_00005f40 + unaff_x21) = fVar59 - *(float *)(&UNK_00003d38 + unaff_x21);
      *(float *)(&UNK_00005f44 + unaff_x21) = *(float *)(&UNK_00003d38 + unaff_x21);
    }
  }
  goto joined_r0x0011c234;
code_r0x0011ba20:
  puVar21 = puVar19 + 1;
  uVar2 = *puVar19;
  puVar19 = puVar21;
  if (uVar2 == 0xd) goto LAB_0011ba18;
  if (uVar2 != 10) {
    pfVar32 = (float *)(piVar29 + 4);
    if ((int)(uint)uVar2 < *piVar29) {
      pfVar32 = (float *)(*(long *)(piVar29 + 2) + (ulong)(uint)uVar2 * 4);
    }
    fVar50 = fVar50 + (fVar43 / (float)piVar29[5]) * *pfVar32;
    goto LAB_0011ba18;
  }
  if (fVar44 < fVar50) {
    fVar44 = fVar50;
  }
  goto LAB_0011ba14;
}

