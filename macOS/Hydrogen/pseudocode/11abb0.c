
uint FUN_0011abb0(long param_1)

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
  uint uVar14;
  int iVar15;
  uint uVar16;
  undefined8 uVar17;
  ulong uVar18;
  ushort *puVar19;
  ushort *puVar20;
  ushort *puVar21;
  undefined8 uVar22;
  undefined2 *puVar23;
  undefined8 uVar24;
  short sVar25;
  ulong uVar26;
  char *pcVar27;
  int *piVar28;
  long lVar29;
  short *psVar30;
  float *pfVar31;
  float *pfVar32;
  byte bVar33;
  long unaff_x19;
  uint unaff_w20;
  uint uVar34;
  undefined8 *puVar35;
  long unaff_x21;
  int unaff_w22;
  char *unaff_x23;
  long unaff_x24;
  long lVar36;
  uint unaff_w25;
  ushort *puVar37;
  long unaff_x26;
  ushort *puVar38;
  char *pcVar39;
  short *psVar40;
  short *psVar41;
  long unaff_x29;
  float fVar42;
  float fVar43;
  float fVar44;
  float fVar45;
  undefined8 uVar46;
  undefined8 uVar47;
  float fVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  float fVar51;
  float fVar52;
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
  undefined8 in_stack_00000018;
  int iStack0000000000000020;
  uint uStack0000000000000024;
  undefined8 in_stack_00000028;
  uint uStack0000000000000034;
  uint uStack0000000000000038;
  uint uStack000000000000003c;
  float *pfStack0000000000000040;
  uint uStack000000000000004c;
  float in_stack_00000050;
  code *in_stack_00000068;
  int iStack0000000000000070;
  int iStack0000000000000074;
  int *in_stack_00000078;
  float in_stack_00000080;
  undefined8 in_stack_00000090;
  char *in_stack_00000098;
  int *in_stack_000000a0;
  undefined8 in_stack_000000a8;
  float in_stack_000000b0;
  long in_stack_000000c8;
  char *in_stack_000000d0;
  long in_stack_000000d8;
  uint uStack00000000000000e0;
  uint uStack00000000000000e4;
  char *in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  float fStack0000000000000110;
  float fStack0000000000000114;
  
  while( true ) {
    uVar34 = (uint)*(ushort *)(param_1 + unaff_x19 * 2);
    *(uint *)(unaff_x29 + -0xf8) = uVar34;
    if ((uVar34 != 9) && (iVar9 = func_0x0011ebdc(), iVar9 != 0)) {
      func_0x0011cfe8();
    }
    unaff_x19 = unaff_x19 + 1;
    if (*(int *)(&UNK_000038d8 + unaff_x21) <= unaff_x19) break;
    param_1 = *(long *)(&UNK_000038e0 + unaff_x21);
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
  iVar9 = *(int *)(unaff_x24 + 0x804);
  if (iVar9 == unaff_w22) {
    if (*(char *)(unaff_x24 + 0x810) == '\0') {
      if ((_uStack0000000000000038 & 0x100000000) == 0) {
        iVar9 = (int)((in_stack_00000080 - *(float *)(&UNK_00003928 + unaff_x21)) /
                     *(float *)(&UNK_00003d38 + unaff_x21));
        if (iVar9 < 2) {
          iVar9 = 1;
        }
        *(int *)(unaff_x26 + 100) = iVar9;
        lVar36 = 0xe5c;
        if (uStack0000000000000038 == 0) {
          lVar36 = 0xe5e;
        }
        cVar3 = *(char *)(unaff_x21 + lVar36);
        uStack000000000000004c = unaff_w20;
        if ((((_uStack0000000000000038 & 1) == 0) && (*(char *)(unaff_x21 + 0xe5f) != '\0')) &&
           (*(char *)(unaff_x21 + 0xe5c) == '\0')) {
          uVar18 = func_0x000d78f8(0xa39);
          if ((uVar18 & 1) != 0) goto code_r0x0011ac68;
code_r0x0011b2e8:
          uVar13 = func_0x000d78f8(&UNK_0000220a);
          uVar14 = (uStack00000000000000e4 & 0x4000) >> 0xe;
          uVar16 = (unaff_w25 & 0x8000) >> 0xf;
          uVar34 = (uVar13 ^ 1 | uVar14 | uVar16) ^ 1;
          if ((((uVar13 ^ 1) & 1) == 0 && uVar14 == 0) && uVar16 == 0) {
joined_r0x0011ac84:
            if (in_stack_000000f0._4_4_ != 0) {
              uVar34 = (uint)(*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c));
            }
            goto code_r0x0011b330;
          }
          uVar18 = func_0x000d78f8(0xa24);
          if ((uVar18 & 1) != 0) goto code_r0x0011b344;
code_r0x0011b374:
          uVar14 = func_0x000d78f8(0x1209);
          uStack0000000000000014 = 0;
          if ((unaff_w25 & 0x8000) == 0) {
            uStack0000000000000014 = uVar14;
          }
          if ((in_stack_000000f0._4_4_ != 0) && ((uStack0000000000000014 & 1) != 0)) {
code_r0x0011b39c:
            uStack0000000000000014 =
                 (uint)(*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c));
          }
        }
        else {
          uVar18 = func_0x000d78f8(0xa39);
          if ((uVar18 & 1) == 0) goto code_r0x0011b2e8;
code_r0x0011ac68:
          uVar34 = (uint)((_uStack00000000000000e0 & 0x400000000000) == 0 &&
                         (unaff_w25 & 0x8000) == 0);
          if ((_uStack00000000000000e0 & 0x400000000000) == 0 && (unaff_w25 & 0x8000) == 0)
          goto joined_r0x0011ac84;
code_r0x0011b330:
          uVar18 = func_0x000d78f8(0xa24);
          if ((uVar18 & 1) == 0) goto code_r0x0011b374;
code_r0x0011b344:
          if ((unaff_w25 & 0x4008000) == 0x4000000) goto code_r0x0011b39c;
        }
        uVar18 = func_0x000d78f8(0xa37);
        if (((uVar18 & 1) == 0) && (uVar18 = func_0x000d78f8(&UNK_00002209), (uVar18 & 1) == 0)) {
          bVar4 = false;
          bVar6 = (_uStack00000000000000e0 & 0x400000000000) == 0;
        }
        else {
          bVar6 = (_uStack00000000000000e0 & 0x400000000000) == 0;
          bVar4 = bVar6;
        }
        bVar8 = func_0x000d78f8(0xa3b);
        bVar7 = false;
        if ((unaff_w25 & 0x10000) == 0) {
          bVar7 = bVar6;
        }
        uVar18 = func_0x000d78f8(0xa3a);
        bVar6 = bVar7;
        if (((uVar18 & 1) == 0) &&
           (((_uStack0000000000000038 & 1) != 0 ||
            (iVar10 = func_0x000d78f8(&UNK_00002a3b), iVar10 == 0)))) {
          bVar6 = false;
        }
        iVar10 = func_0x000d78f8(0xa22);
        bVar33 = 0;
        if ((*(byte *)(unaff_x21 + 8) >> 1 & 1) == 0) {
          uVar18 = func_0x000d68ec(0x20d,1);
          if ((uVar18 & 1) == 0) goto code_r0x0011b4c0;
code_r0x0011b480:
          uVar14 = 1;
          if (bVar33 == 0) goto code_r0x0011b4d4;
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
          bVar33 = *(byte *)(unaff_x21 + 0xc) & 1;
          uVar18 = func_0x000d68ec(0x20d,1);
          if ((uVar18 & 1) != 0) goto code_r0x0011b480;
code_r0x0011b4c0:
          uVar14 = func_0x000d68ec(0x273,1);
          if (bVar33 != 0) goto code_r0x0011b484;
code_r0x0011b4d4:
          uStack000000000000000c = 0;
          uVar17 = 0x20e;
code_r0x0011b518:
          iVar11 = func_0x000d78f8(uVar17);
        }
        iVar15 = func_0x000d68ec(0x201,1);
        if ((iVar15 == 0) && (iVar15 = func_0x000d68ec(0x202,1), iVar15 == 0)) {
          iVar15 = func_0x000d68ec(0x203,1);
          if ((in_stack_000000f0._4_4_ != 0) && (iVar15 != 0)) {
            if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
              func_0x0011cfe8();
            }
            else {
              fVar56 = *(float *)(in_stack_000000c8 + 0x90) - *(float *)(&UNK_00003d38 + unaff_x21);
              if (fVar56 < 0.0) {
                fVar56 = 0.0;
              }
              func_0x000d8cb4(fVar56);
            }
            _uStack0000000000000038 = 0;
            goto code_r0x0011b5b8;
          }
          iVar15 = func_0x000d68ec(0x204,1);
          if ((in_stack_000000f0._4_4_ != 0) && (iVar15 != 0)) {
            if (*(char *)(unaff_x21 + 0xe5c) == '\0') {
              func_0x0011cfe8();
            }
            else {
              fVar56 = *(float *)(in_stack_000000c8 + 0x90) + *(float *)(&UNK_00003d38 + unaff_x21);
              fVar55 = (float)func_0x000d8c90();
              if (fVar55 <= fVar56) {
                fVar56 = fVar55;
              }
              func_0x000d8cb4(fVar56,in_stack_000000c8);
            }
            _uStack0000000000000038 = 0;
            goto code_r0x0011b5b8;
          }
          iVar15 = func_0x000d68ec(0x205,1);
          if ((in_stack_000000f0._4_4_ != 0) && (iVar15 != 0)) {
            func_0x0011cfe8();
            _uStack0000000000000038 = 0;
            unaff_s13 = unaff_s13 - *(float *)(&UNK_00003d38 + unaff_x21) * (float)iVar9;
            goto code_r0x0011b5b8;
          }
          iVar15 = func_0x000d68ec(0x206,1);
          if ((in_stack_000000f0._4_4_ != 0) && (iVar15 != 0)) {
            func_0x0011cfe8();
            unaff_s13 = unaff_s13 + *(float *)(&UNK_00003d38 + unaff_x21) * (float)iVar9;
            goto code_r0x0011b5b0;
          }
          iVar9 = func_0x000d68ec(0x207,1);
          if ((iVar9 != 0) || (iVar9 = func_0x000d68ec(0x208,1), iVar9 != 0)) goto code_r0x0011b59c;
          uVar16 = func_0x000d68ec(0x20a,1);
          if (((uVar16 ^ 1 | (uStack00000000000000e4 & 0x4000) >> 0xe | uVar34) & 1) == 0) {
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
                  (*(char *)(unaff_x21 + 0xe5e) == '\0')) && (*(char *)(unaff_x21 + 0xe5c) == '\0'))
                )))) {
              func_0x0011cfe8();
            }
            goto code_r0x0011c648;
          }
          if ((uVar14 | uStack000000000000000c) == 1) {
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
            if ((byte)(bVar8 & bVar7 | bVar6) == 1) {
              func_0x0011cfe8();
              _uStack0000000000000038 = 0;
              *(undefined4 *)(unaff_x26 + 0x58) = *(undefined4 *)(unaff_x26 + 0x54);
              *(undefined4 *)(unaff_x26 + 0x5c) = *(undefined4 *)(unaff_x26 + 0x54);
            }
            else {
              if (iVar10 == 0) {
                if ((uVar34 | uStack0000000000000014) == 1) {
                  if (*(long *)(unaff_x21 + 0xb0) != 0) {
                    uVar14 = *(uint *)(unaff_x26 + 0x58);
                    uVar16 = *(uint *)(unaff_x26 + 0x5c);
                    if (uVar14 == uVar16) {
                      uVar18 = 0;
                      uVar14 = *(uint *)(unaff_x26 + 0xc);
                    }
                    else {
                      uVar13 = uVar14;
                      if ((int)uVar16 <= (int)uVar14) {
                        uVar13 = uVar16;
                      }
                      uVar18 = (ulong)uVar13;
                      if ((int)uVar14 <= (int)uVar16) {
                        uVar14 = uVar16;
                      }
                    }
                    uVar18 = -(uVar18 >> 0x1f) & 0xfffffffe00000000 | uVar18 << 1;
                    uVar26 = -(ulong)(uVar14 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar14 << 1;
                    iVar9 = func_0x000b91c4(*(long *)(unaff_x26 + 0x20) + uVar18,
                                            *(long *)(unaff_x26 + 0x20) + uVar26);
                    uVar17 = func_0x000b810c((long)(iVar9 + 1));
                    func_0x000b9034(uVar17,iVar9 + 1,*(long *)(unaff_x26 + 0x20) + uVar18,
                                    *(long *)(unaff_x26 + 0x20) + uVar26);
                    func_0x000c2d8c(uVar17);
                    func_0x000b83d4(uVar17);
                  }
                  if (uVar34 != 0) {
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
                else if ((bVar4) && (pcVar39 = (char *)func_0x000c2d68(), pcVar39 != (char *)0x0)) {
                  lVar36 = _strlen();
                  puVar23 = (undefined2 *)func_0x000b810c((lVar36 << 0x20) + 0x100000000 >> 0x1f);
                  if (*pcVar39 == '\0') {
                    *puVar23 = 0;
                  }
                  else {
                    iVar9 = 0;
                    do {
                      iVar10 = func_0x000b6c50(unaff_x29 + -0xf8,pcVar39,0);
                      iVar11 = func_0x0011ebdc();
                      if (iVar11 != 0) {
                        puVar23[iVar9] = (short)*(undefined4 *)(unaff_x29 + -0xf8);
                        iVar9 = iVar9 + 1;
                      }
                      pcVar39 = pcVar39 + iVar10;
                    } while (*pcVar39 != '\0');
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
            bVar6 = true;
            _uStack0000000000000038 = 0x100000000;
            uStack000000000000004c = 0;
          }
          else {
            bVar4 = *in_stack_000000e8 == '\0';
            uVar34 = 0;
            if (!bVar4) {
              uVar34 = uStack000000000000004c;
            }
            _uStack0000000000000038 = (ulong)bVar4 << 0x20;
            bVar6 = !bVar4;
            uVar14 = 0;
            if (!bVar4) {
              uVar14 = uStack00000000000000e0;
            }
            uStack000000000000004c = uVar34;
            uStack00000000000000e0 = uVar14;
          }
        }
        else {
code_r0x0011b59c:
          func_0x0011cfe8();
code_r0x0011b5b0:
          _uStack0000000000000038 = 0;
code_r0x0011b5b8:
          bVar6 = false;
        }
        uVar34 = 0;
        if (*(int *)(unaff_x26 + 0x58) != *(int *)(unaff_x26 + 0x5c)) {
          uVar34 = uStack00000000000000e0;
        }
        unaff_w20 = uStack000000000000004c | uVar34;
        iVar9 = *(int *)(in_stack_000000d8 + 0x804);
        unaff_x23 = in_stack_000000e8;
        unaff_x24 = in_stack_000000d8;
        unaff_w25 = in_stack_00000090._4_4_;
        goto joined_r0x0011b5dc;
      }
      bVar6 = false;
      pcVar39 = (char *)0x0;
      bVar8 = 0;
      _uStack0000000000000038 = 0x100000000;
    }
    else {
      bVar6 = false;
      _uStack0000000000000038 = (ulong)uStack000000000000003c << 0x20;
      pcVar39 = (char *)0x0;
      bVar8 = 0;
    }
    goto code_r0x0011add4;
  }
  bVar6 = false;
  _uStack0000000000000038 = (ulong)uStack000000000000003c << 0x20;
joined_r0x0011b5dc:
  uStack000000000000004c = unaff_w20;
  if (iVar9 == unaff_w22) {
    bVar8 = 0;
    pcVar39 = (char *)0x0;
    if (bVar6) {
      if ((uStack00000000000000e4 >> 0xe & 1) != 0) goto code_r0x0011add4;
      if ((unaff_w25 >> 0x14 & 1) != 0) {
        uVar34 = *(uint *)(unaff_x26 + 0xc);
        uVar18 = (ulong)uVar34;
        lVar36 = func_0x00129c14(unaff_x26 + 0x74,0,uVar18,0);
        if (((int)uVar34 < 1) || (lVar36 == 0)) {
          psVar40 = *(short **)(unaff_x26 + 0x20);
        }
        else {
          uVar26 = 0;
          psVar40 = *(short **)(unaff_x26 + 0x20);
          if ((0x1f < uVar34) && (0x3f < (ulong)(lVar36 - (long)psVar40))) {
            lVar29 = 0;
            uVar26 = uVar18 & 0xffffffe0;
            do {
              puVar35 = (undefined8 *)((long)psVar40 + lVar29);
              uVar17 = *puVar35;
              uVar24 = puVar35[3];
              uVar22 = puVar35[2];
              uVar47 = puVar35[5];
              uVar46 = puVar35[4];
              uVar50 = puVar35[7];
              uVar49 = puVar35[6];
              puVar1 = (undefined8 *)(lVar36 + lVar29);
              puVar1[1] = puVar35[1];
              *puVar1 = uVar17;
              puVar1[3] = uVar24;
              puVar1[2] = uVar22;
              puVar1[5] = uVar47;
              puVar1[4] = uVar46;
              puVar1[7] = uVar50;
              puVar1[6] = uVar49;
              lVar29 = lVar29 + 0x40;
            } while ((uVar18 & 0xffffffe0) * 2 != lVar29);
            if (uVar26 == uVar18) goto code_r0x0011ad4c;
          }
          do {
            *(short *)(lVar36 + uVar26 * 2) = psVar40[uVar26];
            uVar26 = uVar26 + 1;
          } while (uVar18 != uVar26);
        }
code_r0x0011ad4c:
        iVar9 = *(int *)(unaff_x26 + 0xc);
        lVar36 = (long)iVar9;
        *(undefined1 *)(unaff_x26 + 0xe86) = 1;
        iVar10 = func_0x000b91c4(psVar40,psVar40 + lVar36);
        *(int *)(unaff_x26 + 0xc) = *(int *)(unaff_x26 + 0xc) - iVar9;
        *(int *)(unaff_x26 + 0x10) = *(int *)(unaff_x26 + 0x10) - iVar10;
        sVar25 = *(short *)(*(long *)(unaff_x26 + 0x20) + lVar36 * 2);
        if (sVar25 != 0) {
          psVar30 = (short *)(*(long *)(unaff_x26 + 0x20) + lVar36 * 2);
          psVar41 = psVar40;
          do {
            psVar30 = psVar30 + 1;
            psVar40 = psVar41 + 1;
            *psVar41 = sVar25;
            sVar25 = *psVar30;
            psVar41 = psVar40;
          } while (sVar25 != 0);
        }
        *psVar40 = 0;
        *(undefined8 *)(unaff_x26 + 0x58) = 0;
        bVar8 = 1;
        pcVar39 = "";
        *(undefined4 *)(unaff_x26 + 0x54) = 0;
        unaff_x23 = in_stack_000000e8;
        unaff_x24 = in_stack_000000d8;
        goto code_r0x0011add4;
      }
      pcVar39 = *(char **)(unaff_x26 + 0x40);
      iVar9 = _strcmp(unaff_x23,pcVar39);
      if (iVar9 == 0) {
        bVar8 = 0;
        pcVar39 = (char *)0x0;
        goto code_r0x0011ade8;
      }
      iVar9 = *(int *)(unaff_x26 + 0x38);
      uVar34 = iVar9 - 1;
      *(undefined8 *)(unaff_x29 + -0xf8) = 0;
      *(undefined8 *)(unaff_x29 + -0xf0) = 0;
      if (1 < iVar9) {
        iVar9 = func_0x000b8e80(pcVar39,pcVar39 + uVar34);
        func_0x0011e9c0(unaff_x29 + -0xf8,iVar9 + 1);
        func_0x000b8db0(*(undefined8 *)(unaff_x29 + -0xf0),*(undefined4 *)(unaff_x29 + -0xf8),
                        pcVar39,pcVar39 + uVar34,0);
      }
      func_0x0011eeb4();
      func_0x0011f010(unaff_x29 + -0xf8);
      bVar8 = 1;
code_r0x0011adec:
      *(undefined1 *)(unaff_x26 + 0x48) = 1;
      uVar14 = *(int *)(unaff_x26 + 0x18) << 2 | 1;
      iVar9 = *(int *)(unaff_x26 + 0x2c);
      if (iVar9 < (int)uVar14) {
        iVar10 = iVar9;
        if (iVar9 < 0) {
          iVar10 = iVar9 + 1;
        }
        uVar16 = 8;
        if (iVar9 != 0) {
          uVar16 = iVar9 + (iVar10 >> 1);
        }
        if ((int)uVar16 <= (int)uVar14) {
          uVar16 = uVar14;
        }
        uVar17 = func_0x000b810c((long)(int)uVar16);
        if (*(long *)(unaff_x26 + 0x30) != 0) {
          _memcpy(uVar17,*(long *)(unaff_x26 + 0x30),(long)*(int *)(unaff_x26 + 0x28));
          func_0x000b83d4(*(undefined8 *)(unaff_x26 + 0x30));
        }
        *(undefined8 *)(unaff_x26 + 0x30) = uVar17;
        *(uint *)(unaff_x26 + 0x2c) = uVar16;
      }
      else {
        uVar17 = *(undefined8 *)(unaff_x26 + 0x30);
      }
      *(uint *)(unaff_x26 + 0x28) = uVar14;
      func_0x000b9034(uVar17,uVar14,*(undefined8 *)(unaff_x26 + 0x20),0);
      unaff_x24 = in_stack_000000d8;
      unaff_w25 = in_stack_00000090._4_4_;
      if (!bVar6) goto code_r0x0011ae94;
code_r0x0011ae88:
      if ((unaff_w25 >> 5 & 1) != 0) {
        if (uStack0000000000000038 != 0) goto code_r0x0011ae94;
      }
    }
    else {
code_r0x0011add4:
      uStack000000000000004c = unaff_w20;
      if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
code_r0x0011ade8:
        uVar34 = 0;
        goto code_r0x0011adec;
      }
      uVar34 = 0;
      if (bVar6) goto code_r0x0011ae88;
code_r0x0011ae94:
      if ((unaff_w25 & 0x801c0) != 0) {
        if ((unaff_w25 >> 6 & 1) == 0) {
code_r0x0011aec8:
          if ((unaff_w25 >> 7 & 1) == 0) {
code_r0x0011aefc:
            if (((unaff_w25 >> 0x13 & 1) == 0) || (*(char *)(unaff_x26 + 0xe86) == '\0')) {
              if ((unaff_w25 >> 8 & 1) == 0) goto code_r0x0011b0d0;
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
        pcVar27 = unaff_x23;
        if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
          pcVar27 = *(char **)(unaff_x26 + 0x30);
        }
        *(undefined4 *)(unaff_x29 + -0xdc) = uVar12;
        *(char **)(unaff_x29 + -0xd8) = pcVar27;
        uVar12 = *(undefined4 *)(unaff_x26 + 0x4c);
        *(undefined4 *)(unaff_x29 + -0xd0) = *(undefined4 *)(unaff_x26 + 0x10);
        *(undefined4 *)(unaff_x29 + -0xcc) = uVar12;
        lVar36 = *(long *)(unaff_x26 + 0x20);
        iVar9 = func_0x000b91c4(lVar36,lVar36 + (long)*(int *)(unaff_x26 + 0x54) * 2);
        *(int *)(unaff_x29 + -0xc4) = iVar9;
        iVar10 = func_0x000b91c4(lVar36,lVar36 + (long)*(int *)(unaff_x26 + 0x58) * 2);
        *(int *)(unaff_x29 + -0xc0) = iVar10;
        iVar11 = func_0x000b91c4(lVar36,lVar36 + (long)*(int *)(unaff_x26 + 0x5c) * 2);
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
        unaff_x24 = in_stack_000000d8;
        unaff_w25 = in_stack_00000090._4_4_;
      }
code_r0x0011b0d0:
      if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
        pcVar27 = *(char **)(unaff_x26 + 0x30);
        iVar9 = _strcmp(pcVar27,unaff_x23);
        if (iVar9 != 0) {
          uVar34 = *(uint *)(unaff_x26 + 0x10);
          bVar8 = 1;
          pcVar39 = pcVar27;
        }
      }
    }
    uStack0000000000000034 = (uint)bVar8;
    if (*in_stack_00000078 != unaff_w22) goto code_r0x0011b608;
code_r0x0011b120:
    if (*(int *)(unaff_x24 + 0x804) != unaff_w22) {
      iVar9 = func_0x000cfb2c();
      if ((iVar9 != 0) && ((uStack00000000000000e4 >> 0xe & 1) == 0)) {
        pcVar27 = *(char **)(&UNK_00005d98 + unaff_x21);
        iVar9 = _strcmp(pcVar27,unaff_x23);
        if (iVar9 != 0) {
          uVar34 = in_stack_00000078[2] - 1;
          uStack0000000000000034 = 1;
          pcVar39 = pcVar27;
        }
      }
    }
    *in_stack_00000078 = 0;
    if (pcVar39 != (char *)0x0) goto code_r0x0011b614;
code_r0x0011b180:
  }
  else {
    uVar34 = 0;
    pcVar39 = (char *)0x0;
    uStack0000000000000034 = 0;
    if (*in_stack_00000078 == unaff_w22) goto code_r0x0011b120;
code_r0x0011b608:
    if (pcVar39 == (char *)0x0) goto code_r0x0011b180;
code_r0x0011b614:
    if ((unaff_w25 >> 0x12 & 1) != 0) {
      *(undefined8 *)(unaff_x29 + -0xd8) = 0;
      *(undefined8 *)(unaff_x29 + -0xe0) = 0;
      *(undefined8 *)(unaff_x29 + -200) = 0;
      *(undefined8 *)(unaff_x29 + -0xd0) = 0;
      *(undefined8 *)(unaff_x29 + -0xc0) = 0;
      *(long *)(unaff_x29 + -0xf8) = unaff_x21;
      *(undefined4 *)(unaff_x29 + -0xf0) = 0x40000;
      *(uint *)(unaff_x29 + -0xec) = uStack00000000000000e4;
      *(char **)(unaff_x29 + -0xd8) = unaff_x23;
      if (in_stack_000000a8._4_4_ <= (int)(uVar34 + 1)) {
        in_stack_000000a8._4_4_ = uVar34 + 1;
      }
      *(uint *)(unaff_x29 + -0xd0) = uVar34;
      *(int *)(unaff_x29 + -0xcc) = in_stack_000000a8._4_4_;
      *(char **)(unaff_x29 + -0xe8) = in_stack_000000d0;
      (*in_stack_00000068)(unaff_x29 + -0xf8);
      unaff_x23 = *(char **)(unaff_x29 + -0xd8);
      in_stack_000000a8._4_4_ = *(int *)(unaff_x29 + -0xcc);
      uVar34 = *(uint *)(unaff_x29 + -0xd0);
      if ((int)(in_stack_000000a8._4_4_ - 1U) <= (int)*(uint *)(unaff_x29 + -0xd0)) {
        uVar34 = in_stack_000000a8._4_4_ - 1U;
      }
    }
    if ((int)(uVar34 + 1) < in_stack_000000a8._4_4_) {
      in_stack_000000a8._4_4_ = uVar34 + 1;
    }
    func_0x000b7ff8(unaff_x23,pcVar39,(long)in_stack_000000a8._4_4_);
  }
  uVar34 = uStack000000000000004c;
  pfStack0000000000000040 = (float *)(&UNK_00005f3c + unaff_x21);
  iVar9 = 0;
  if (*(int *)(unaff_x24 + 0x804) == unaff_w22) {
    iVar9 = uStack000000000000003c;
  }
  if (iVar9 == 1) {
    func_0x000c24fc();
  }
  else if (*(int *)(unaff_x24 + 0x804) == unaff_w22) {
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
  fVar56 = (float)((ulong)uStack0000000000000108 >> 0x20);
  _fStack0000000000000110 =
       CONCAT44(in_stack_00000080 + fVar56,in_stack_000000b0 + (float)uStack0000000000000108);
  if (in_stack_000000f0._4_4_ == 0) {
    uStack0000000000000100 =
         CONCAT44(fVar56 + (float)((ulong)*(undefined8 *)(in_stack_000000d8 + 0xc4) >> 0x20),
                  (float)uStack0000000000000108 + (float)*(undefined8 *)(in_stack_000000d8 + 0xc4));
  }
  else {
    uStack0000000000000100 = *(ulong *)(in_stack_000000c8 + 0x110);
  }
  if (iStack0000000000000070 != 0) {
    unaff_x23 = *(char **)(unaff_x26 + 0x30);
  }
  if (iStack0000000000000074 == 0) {
    if ((uStack00000000000000e0 | uVar34) == 1) {
      in_stack_000000d0 = unaff_x23 + *(int *)(unaff_x26 + 0x10);
      goto code_r0x0011b7f4;
    }
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011b834;
    if (*(int *)(in_stack_000000d8 + 0x804) == unaff_w22) {
      lVar36 = (long)*(int *)(unaff_x26 + 0x10);
    }
    else {
      lVar36 = _strlen(unaff_x23);
    }
    in_stack_000000d0 = unaff_x23 + lVar36;
    fVar56 = 0.0;
    in_stack_000000b0 = 0.0;
    in_stack_000000e8 = unaff_x23;
    if ((long)in_stack_000000d0 - (long)unaff_x23 < 0x200000) goto code_r0x0011b7c4;
joined_r0x0011c234:
    if ((_iStack0000000000000020 & 0x100000000) == 0) goto code_r0x0011bb4c;
code_r0x0011c078:
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011c07c;
code_r0x0011c104:
    uStack0000000000000024 = uStack0000000000000024 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uStack0000000000000024 = 1;
    }
    if ((uStack0000000000000024 & 1) == 0) goto LAB_0011c11c;
LAB_0011c1cc:
    if (unaff_s14 <= 0.0) goto LAB_0011c148;
LAB_0011c1d4:
    func_0x000bc130(*(float *)(unaff_x29 + -0xa0) + *(float *)(&UNK_0000393c + unaff_x21),
                    *(float *)(unaff_x29 + -0xa4) + *(float *)(&UNK_00003928 + unaff_x21),
                    in_stack_00000028,0,1);
    if (uStack0000000000000034 != 1 || (unaff_w25 & 0x8000000) != 0) goto LAB_0011c160;
  }
  else {
    lVar36 = _strlen(in_stack_00000098);
    in_stack_000000d0 = in_stack_00000098 + lVar36;
    unaff_x23 = in_stack_00000098;
    if (((uStack00000000000000e0 | uVar34) & 1) != 0) {
code_r0x0011b7f4:
      puVar37 = *(ushort **)(unaff_x26 + 0x20);
      if (uStack00000000000000e0 == 0) {
        puVar21 = (ushort *)0x0;
        iVar9 = -1000;
      }
      else {
        puVar21 = puVar37 + *(int *)(unaff_x26 + 0x54);
        iVar9 = -1;
      }
      uVar14 = (uint)(uStack00000000000000e0 != 0);
      if (uVar34 == 0) {
        puVar38 = (ushort *)0x0;
        iVar10 = -1000;
      }
      else {
        iVar10 = *(int *)(unaff_x26 + 0x58);
        if (*(int *)(unaff_x26 + 0x5c) <= *(int *)(unaff_x26 + 0x58)) {
          iVar10 = *(int *)(unaff_x26 + 0x5c);
        }
        puVar38 = puVar37 + iVar10;
        uVar14 = uVar14 + 1;
        iVar10 = -1;
      }
      iVar11 = 0;
      iVar15 = uVar14 + (in_stack_000000f0._4_4_ >> 0x1a);
      uVar2 = *puVar37;
      puVar19 = puVar37;
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
              if (iVar15 < 2) goto code_r0x0011b934;
              iVar15 = iVar15 + -1;
            }
          }
          if (iVar10 != -1) goto code_r0x0011b8a4;
          if (puVar19 < puVar38) {
            iVar10 = -1;
            puVar19 = puVar19 + 1;
            uVar2 = *puVar19;
            goto joined_r0x0011b89c;
          }
          iVar10 = iVar11;
          if (iVar15 < 2) {
code_r0x0011b934:
            puVar19 = (ushort *)func_0x000b84f0(puVar21,puVar37);
            piVar28 = *(int **)(&UNK_00003d30 + unaff_x21);
            fVar55 = *(float *)(&UNK_00003d38 + unaff_x21);
            fVar56 = 0.0;
            do {
              fVar44 = 0.0;
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
                    if (fVar44 <= fVar56) {
                      fVar44 = fVar56;
                    }
                    fVar48 = 0.0;
                    fVar59 = 0.0;
                    fVar42 = fVar55;
                    if (iVar10 < 0) goto code_r0x0011ba78;
                    puVar21 = (ushort *)func_0x000b84f0(puVar38,puVar37);
                    piVar28 = *(int **)(&UNK_00003d30 + unaff_x21);
                    fVar42 = *(float *)(&UNK_00003d38 + unaff_x21);
                    fVar56 = 0.0;
                    goto LAB_0011ba14;
                  }
                  puVar19 = puVar20 + 1;
                  uVar2 = *puVar20;
                  puVar20 = puVar19;
                } while (uVar2 == 0xd);
                if (uVar2 == 10) break;
                pfVar31 = (float *)(piVar28 + 4);
                if ((int)(uint)uVar2 < *piVar28) {
                  pfVar31 = (float *)(*(long *)(piVar28 + 2) + (ulong)(uint)uVar2 * 4);
                }
                fVar44 = fVar44 + (fVar55 / (float)piVar28[5]) * *pfVar31;
              }
              if (fVar56 < fVar44) {
                fVar56 = fVar44;
              }
            } while( true );
          }
          iVar15 = iVar15 + -1;
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
    fVar56 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      lVar36 = (long)in_stack_000000d0 - (long)in_stack_00000098;
      in_stack_000000b0 = 0.0;
joined_r0x0011bb8c:
      in_stack_000000e8 = unaff_x23;
      if (0x1fffff < lVar36) goto joined_r0x0011c234;
code_r0x0011b7c4:
      puVar35 = &uStack0000000000000108;
    }
    else {
code_r0x0011b834:
      iVar9 = 0;
      in_stack_000000d0 = unaff_x23;
      while( true ) {
        pcVar39 = in_stack_000000d0 + 1;
        cVar3 = *in_stack_000000d0;
        if (cVar3 == '\0') break;
        in_stack_000000d0 = pcVar39;
        if (cVar3 == '\n') {
          iVar9 = iVar9 + 1;
        }
      }
      fVar56 = *(float *)(&UNK_00003d38 + unaff_x21) * (float)(iVar9 + 1);
      if (in_stack_000000f0._4_4_ == 0) {
        lVar36 = (long)in_stack_000000d0 - (long)unaff_x23;
        goto joined_r0x0011bb8c;
      }
      puVar35 = (undefined8 *)0x0;
    }
    uVar17 = func_0x000bba44(0x3f800000,iStack0000000000000074);
    func_0x000f4e60(*(undefined4 *)(&UNK_00003d38 + unaff_x21),0,
                    *(undefined8 *)(in_stack_000000c8 + 0x2a8),
                    *(undefined8 *)(&UNK_00003d30 + unaff_x21),&uStack0000000000000100,uVar17,
                    unaff_x23,in_stack_000000d0,puVar35);
    in_stack_000000e8 = unaff_x23;
joined_r0x0011bb48:
    if ((_iStack0000000000000020 & 0x100000000) != 0) goto code_r0x0011c078;
code_r0x0011bb4c:
    func_0x000d34c4();
    if (in_stack_000000f0._4_4_ == 0) goto code_r0x0011c104;
code_r0x0011c07c:
    uStack00000000000000f8._0_4_ = in_stack_000000b0;
    uStack00000000000000f8._4_4_ = fVar56 + *(float *)(&UNK_00003928 + unaff_x21);
    lVar36 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar36 + 0xc0) = 1;
    if (*(char *)(lVar36 + 0xc3) == '\0') {
      uVar17 = *(undefined8 *)(lVar36 + 0x110);
      *(undefined8 *)(unaff_x29 + -0xf8) = uVar17;
      *(ulong *)(unaff_x29 + -0xf0) =
           CONCAT44(uStack00000000000000f8._4_4_ + (float)((ulong)uVar17 >> 0x20),
                    (float)uStack00000000000000f8 + (float)uVar17);
      func_0x000d0d0c(0xbf800000,&uStack00000000000000f8);
      func_0x000d0e24(unaff_x29 + -0xf8,0,0,0);
    }
    *(uint *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
             in_stack_000000d8 + 0xc) =
         *(uint *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                  in_stack_000000d8 + 0xc) | 0x401;
    func_0x000d0b80();
    uVar34 = in_stack_000000a0[2];
    func_0x000d818c();
    if (*in_stack_000000a0 != 0) goto code_r0x0011c104;
    *in_stack_000000a0 = unaff_w22;
    in_stack_000000a0[1] = iStack0000000000000020;
    in_stack_000000a0[2] = uVar34 & 0x80 | in_stack_00000018._4_4_;
    uStack0000000000000024 = uStack0000000000000024 ^ 1;
    if ((&UNK_00005ff8)[unaff_x21] == '\0') {
      uStack0000000000000024 = 1;
    }
    if ((uStack0000000000000024 & 1) != 0) goto LAB_0011c1cc;
LAB_0011c11c:
    func_0x000dc80c("{","}");
    func_0x000bc2c4(&uStack0000000000000100,in_stack_000000e8,in_stack_000000d0);
    if (0.0 < unaff_s14) goto LAB_0011c1d4;
LAB_0011c148:
    if (uStack0000000000000034 != 1 || (unaff_w25 & 0x8000000) != 0) goto LAB_0011c160;
  }
  func_0x000c255c();
LAB_0011c160:
  if ((unaff_w25 & 0x20) != 0) {
    uStack0000000000000034 = uStack0000000000000038;
  }
  return uStack0000000000000034;
LAB_0011ba14:
  fVar48 = 0.0;
  puVar19 = puVar21;
LAB_0011ba18:
  if (puVar19 < puVar38) goto code_r0x0011ba20;
  if (fVar48 <= fVar56) {
    fVar48 = fVar56;
  }
  fVar59 = fVar42 * (float)iVar10;
code_r0x0011ba78:
  fVar55 = fVar55 * (float)iVar9;
  fVar43 = fVar42 * (float)(iVar11 + 1);
  fVar56 = fVar43;
  if (in_stack_000000f0._4_4_ == 0) {
    fVar56 = 0.0;
  }
  if ((uStack00000000000000e0 != 0) && (*(char *)(unaff_x26 + 0xe84) != '\0')) {
    if ((in_stack_00000090._4_4_ >> 0xc & 1) == 0) {
      if (*(float *)(unaff_x26 + 0x50) <= fVar44) {
        fVar51 = fVar44 - (in_stack_000000b0 - *(float *)(in_stack_000000d8 + 0xc4));
        if (fVar51 < *(float *)(unaff_x26 + 0x50)) goto code_r0x0011bc1c;
        fVar51 = in_stack_000000b0 * 0.25 + fVar51;
      }
      else {
        fVar45 = fVar44 - in_stack_000000b0 * 0.25;
        fVar51 = 0.0;
        if (0.0 < fVar45) {
          fVar51 = fVar45;
        }
      }
      *(float *)(unaff_x26 + 0x50) = (float)(int)fVar51;
    }
    else {
      *(undefined4 *)(unaff_x26 + 0x50) = 0;
    }
code_r0x0011bc1c:
    if (in_stack_000000f0._4_4_ != 0) {
      fVar42 = fVar55 - fVar42;
      if (unaff_s13 <= fVar42) {
        fVar42 = *(float *)(&UNK_00003928 + unaff_x21);
        if (unaff_s13 <= fVar55 - (in_stack_00000080 + fVar42 * -2.0)) {
          unaff_s13 = (fVar55 - in_stack_00000080) + fVar42 * 2.0;
        }
      }
      else {
        unaff_s13 = 0.0;
        if (0.0 < fVar42) {
          unaff_s13 = fVar42;
        }
        fVar42 = *(float *)(&UNK_00003928 + unaff_x21);
      }
      in_stack_00000080 = (fVar43 + fVar42 * 2.0) - in_stack_00000080;
      if (in_stack_00000080 < 0.0) {
        in_stack_00000080 = 0.0;
      }
      if (unaff_s13 <= in_stack_00000080) {
        in_stack_00000080 = unaff_s13;
      }
      fVar42 = 0.0;
      if (0.0 <= unaff_s13) {
        fVar42 = in_stack_00000080;
      }
      uStack0000000000000100 =
           CONCAT44(uStack0000000000000100._4_4_ + (*(float *)(in_stack_000000c8 + 0x90) - fVar42),
                    (float)uStack0000000000000100);
      *(float *)(in_stack_000000c8 + 0x90) = fVar42;
    }
    *(undefined1 *)(unaff_x26 + 0xe84) = 0;
  }
  fVar42 = *(float *)(unaff_x26 + 0x50);
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
    fVar43 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar43 = -1.0;
    }
    fVar51 = 0.0;
    if (in_stack_000000f0._4_4_ == 0) {
      fVar51 = 2.0;
    }
    if (iVar9 < iVar10) {
      puVar21 = puVar37 + iVar10;
      puVar37 = puVar37 + iVar9;
      uVar18 = uStack0000000000000100 & 0xffffffff;
      fVar48 = fVar48 + (float)uStack0000000000000100;
      fVar59 = fVar59 + uStack0000000000000100._4_4_;
      fVar45 = *(float *)(&UNK_00003d38 + unaff_x21);
      do {
        if (fStack0000000000000114 + fVar45 < fVar59) break;
        puVar38 = puVar37;
        if (uStack0000000000000108._4_4_ <= fVar59) {
          piVar28 = *(int **)(&UNK_00003d30 + unaff_x21);
          pfVar31 = (float *)(piVar28 + 4);
          fVar52 = 0.0;
          while (puVar37 < puVar21) {
            puVar38 = puVar37 + 1;
            uVar2 = *puVar37;
            puVar37 = puVar38;
            if (uVar2 != 0xd) {
              if (uVar2 == 10) {
                fVar53 = 0.0;
                if (0.0 < fVar52) {
                  fVar53 = fVar52;
                }
                fVar52 = 0.0;
                if (0.0 <= fVar53) {
                  fVar52 = fVar53;
                }
                goto joined_r0x0011be20;
              }
              pfVar32 = pfVar31;
              if ((int)(uint)uVar2 < *piVar28) {
                pfVar32 = (float *)(*(long *)(piVar28 + 2) + (ulong)(uint)uVar2 * 4);
              }
              fVar52 = fVar52 + (fVar45 / (float)piVar28[5]) * *pfVar32;
            }
          }
          if (fVar52 <= 0.0) {
            fVar52 = 0.0;
          }
joined_r0x0011be20:
          if (fVar52 <= 0.0) {
            if (0x20 < *piVar28) {
              pfVar31 = (float *)(*(long *)(piVar28 + 2) + 0x80);
            }
            fVar52 = (float)(int)(*pfVar31 * 0.5);
          }
          fVar54 = (fVar48 - fVar42) + 0.0;
          fVar53 = fVar59 + (fVar43 - fVar45);
          fVar52 = (fVar48 - fVar42) + fVar52;
          if (fVar54 < (float)uStack0000000000000108) {
            fVar54 = (float)uStack0000000000000108;
          }
          if (fVar53 < uStack0000000000000108._4_4_) {
            fVar53 = uStack0000000000000108._4_4_;
          }
          *(float *)(unaff_x29 + -0xf8) = fVar54;
          *(float *)(unaff_x29 + -0xf4) = fVar53;
          if (fStack0000000000000110 <= fVar52) {
            fVar52 = fStack0000000000000110;
          }
          fVar48 = fVar51 + fVar59;
          if (fStack0000000000000114 <= fVar51 + fVar59) {
            fVar48 = fStack0000000000000114;
          }
          *(float *)(unaff_x29 + -0xf0) = fVar52;
          *(float *)(unaff_x29 + -0xec) = fVar48;
          bVar4 = false;
          bVar6 = true;
          bVar7 = false;
          if (uStack0000000000000108._4_4_ < fVar48) {
            bVar4 = false;
            bVar6 = false;
            bVar7 = true;
            if (!NAN(fStack0000000000000114) && !NAN(fVar53)) {
              bVar4 = fStack0000000000000114 < fVar53;
              bVar6 = fStack0000000000000114 == fVar53;
              bVar7 = false;
            }
          }
          bVar5 = false;
          if ((!bVar6 && bVar4 == bVar7) &&
             (bVar5 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar52))) {
            bVar5 = (float)uStack0000000000000108 < fVar52;
          }
          bVar4 = false;
          bVar6 = true;
          bVar7 = false;
          if (bVar5) {
            bVar4 = false;
            bVar6 = false;
            bVar7 = true;
            if (!NAN(fStack0000000000000110) && !NAN(fVar54)) {
              bVar4 = fStack0000000000000110 < fVar54;
              bVar6 = fStack0000000000000110 == fVar54;
              bVar7 = false;
            }
          }
          if (!bVar6 && bVar4 == bVar7) {
            func_0x000f3bb0(0,*(undefined8 *)(in_stack_000000c8 + 0x2a8),unaff_x29 + -0xf8,
                            unaff_x29 + -0xf0,uVar17,0);
            uVar18 = uStack0000000000000100 & 0xffffffff;
            fVar45 = *(float *)(&UNK_00003d38 + unaff_x21);
          }
        }
        else {
          do {
            puVar37 = puVar38;
            if (puVar21 <= puVar38) break;
            puVar37 = puVar38 + 1;
            uVar2 = *puVar38;
            puVar38 = puVar37;
          } while (uVar2 != 10);
        }
        fVar59 = fVar59 + fVar45;
        fVar48 = (float)uVar18;
      } while (puVar37 < puVar21);
    }
  }
  if (in_stack_000000f0._4_4_ == 0) {
    if ((long)in_stack_000000d0 - (long)unaff_x23 < 0x200000) {
      puVar35 = &uStack0000000000000108;
      goto code_r0x0011bf08;
    }
  }
  else {
    puVar35 = (undefined8 *)0x0;
code_r0x0011bf08:
    uVar17 = func_0x000bba44(0x3f800000,iStack0000000000000074);
    uVar22 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
    uVar24 = *(undefined8 *)(&UNK_00003d30 + unaff_x21);
    uVar12 = *(undefined4 *)(&UNK_00003d38 + unaff_x21);
    *(float *)(unaff_x29 + -0xf8) = (float)uStack0000000000000100 - fVar42;
    *(float *)(unaff_x29 + -0xf4) = uStack0000000000000100._4_4_;
    func_0x000f4e60(uVar12,0,uVar22,uVar24,unaff_x29 + -0xf8,uVar17,unaff_x23,in_stack_000000d0,
                    puVar35);
  }
  in_stack_000000e8 = unaff_x23;
  in_stack_000000b0 = in_stack_00000050;
  unaff_w25 = in_stack_00000090._4_4_;
  if (uStack00000000000000e0 != 0) {
    fVar48 = *(float *)(unaff_x21 + 0x18) + *(float *)(unaff_x26 + 0xe80);
    *(float *)(unaff_x26 + 0xe80) = fVar48;
    bVar4 = true;
    if ((*(char *)(unaff_x21 + 0x5b) != '\0') && (0.0 < fVar48)) {
      fVar48 = (float)_fmodf(fVar48,0x3f99999a);
      bVar4 = fVar48 <= 0.8;
    }
    fVar42 = (float)(int)((fVar44 + (float)uStack0000000000000100) - fVar42);
    fVar59 = (float)(int)(fVar55 + uStack0000000000000100._4_4_);
    fVar44 = (fVar59 - *(float *)(&UNK_00003d38 + unaff_x21)) + 0.5;
    fVar48 = fVar42 + 1.0;
    *(float *)(unaff_x29 + -0xf8) = fVar42;
    *(float *)(unaff_x29 + -0xf4) = fVar44;
    fVar55 = fVar59 + -1.5;
    *(float *)(unaff_x29 + -0xf0) = fVar48;
    *(float *)(unaff_x29 + -0xec) = fVar55;
    if (bVar4) {
      bVar4 = false;
      bVar6 = true;
      bVar7 = false;
      if (uStack0000000000000108._4_4_ < fVar55) {
        bVar4 = false;
        bVar6 = false;
        bVar7 = true;
        if (!NAN(fStack0000000000000114) && !NAN(fVar44)) {
          bVar4 = fStack0000000000000114 < fVar44;
          bVar6 = fStack0000000000000114 == fVar44;
          bVar7 = false;
        }
      }
      bVar5 = false;
      if ((!bVar6 && bVar4 == bVar7) &&
         (bVar5 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar48))) {
        bVar5 = (float)uStack0000000000000108 < fVar48;
      }
      bVar4 = false;
      bVar6 = true;
      bVar7 = false;
      if (bVar5) {
        bVar4 = false;
        bVar6 = false;
        bVar7 = true;
        if (!NAN(fStack0000000000000110) && !NAN(fVar42)) {
          bVar4 = fStack0000000000000110 < fVar42;
          bVar6 = fStack0000000000000110 == fVar42;
          bVar7 = false;
        }
      }
      if (!bVar6 && bVar4 == bVar7) {
        uVar22 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
        uStack00000000000000f8._0_4_ = fVar42;
        uStack00000000000000f8._4_4_ = fVar55;
        uVar17 = func_0x000bba44(0x3f800000,0);
        func_0x000f397c(0x3f800000,uVar22,unaff_x29 + -0xf8,&uStack00000000000000f8,uVar17);
      }
    }
    if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
      *(undefined1 *)(in_stack_00000078 + 0x6c) = 1;
      *pfStack0000000000000040 = fVar42 + -1.0;
      *(float *)(&UNK_00005f40 + unaff_x21) = fVar59 - *(float *)(&UNK_00003d38 + unaff_x21);
      *(float *)(&UNK_00005f44 + unaff_x21) = *(float *)(&UNK_00003d38 + unaff_x21);
      goto joined_r0x0011c234;
    }
    goto joined_r0x0011bb48;
  }
  goto joined_r0x0011c234;
code_r0x0011ba20:
  puVar21 = puVar19 + 1;
  uVar2 = *puVar19;
  puVar19 = puVar21;
  if (uVar2 == 0xd) goto LAB_0011ba18;
  if (uVar2 != 10) {
    pfVar31 = (float *)(piVar28 + 4);
    if ((int)(uint)uVar2 < *piVar28) {
      pfVar31 = (float *)(*(long *)(piVar28 + 2) + (ulong)(uint)uVar2 * 4);
    }
    fVar48 = fVar48 + (fVar42 / (float)piVar28[5]) * *pfVar31;
    goto LAB_0011ba18;
  }
  if (fVar56 < fVar48) {
    fVar56 = fVar48;
  }
  goto LAB_0011ba14;
}

