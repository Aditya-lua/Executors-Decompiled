/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180b21900(undefined8 param_1,ulonglong param_2)

{
  ulonglong uVar1;
  code *pcVar2;
  undefined3 uVar3;
  longlong lVar4;
  char cVar5;
  byte bVar6;
  int iVar7;
  longlong lVar8;
  ulonglong *puVar9;
  undefined8 uVar10;
  ulonglong *puVar11;
  byte bVar12;
  int iVar13;
  uint uVar14;
  undefined8 ****ppppuVar15;
  byte bVar16;
  ulonglong uVar17;
  undefined1 *puVar18;
  undefined1 *puVar19;
  undefined4 uVar20;
  undefined7 uVar23;
  ulonglong uVar21;
  ulonglong uVar22;
  ulonglong uVar24;
  ulonglong uVar25;
  byte bVar26;
  char cVar27;
  undefined1 uStack0000000000000000;
  undefined1 uStack0000000000000030;
  longlong lStack_2238;
  longlong lStack_2230;
  longlong lStack_2228;
  ulonglong uStack_2220;
  ulonglong uStack_2218;
  ulonglong uStack_2210;
  ulonglong uStack_2200;
  ulonglong uStack_21f8;
  uint uStack_21f0;
  undefined4 uStack_21ec;
  undefined4 uStack_21e8;
  undefined1 uStack_21e4;
  undefined1 uStack_21e3;
  undefined1 uStack_21e2;
  uint uStack_21e1;
  undefined2 uStack_21dd;
  undefined1 uStack_21db;
  undefined7 uStack_21da;
  undefined1 uStack_21d3;
  undefined8 uStack_21d2;
  longlong alStack_21c8 [2];
  undefined8 uStack_21b8;
  longlong lStack_21b0;
  undefined8 uStack_21a8;
  undefined8 uStack_21a0;
  byte bStack_2198;
  char acStack_2197 [3];
  uint uStack_2194;
  undefined8 ****ppppuStack_2190;
  undefined8 uStack_2188;
  undefined8 uStack_2180;
  ulonglong uStack_2178;
  ulonglong uStack_2170;
  undefined8 auStack_2168 [1024];
  undefined1 auStack_168 [272];
  ulonglong uStack_58;
  undefined8 uStack_48;
  
  uStack_48 = 0x180b2191f;
  lVar8 = FUN_180e15b20();
  lVar8 = -lVar8;
  puVar19 = auStack_168 + lVar8 + 0x128;
  uStack_58 = _DAT_1810c1700 ^ (ulonglong)(auStack_168 + lVar8 + 0x128);
  *(undefined8 *)(&uStack0000000000000030 + lVar8) = param_1;
  uStack_2200 = param_2;
  if (&uStack0000000000000000 == (undefined1 *)0x0) {
    *(undefined8 *)(lVar8 + -0x48) = 0x180b21954;
    (*(code *)0xffffffffffffddf0)();
    *(undefined1 **)(lVar8 + -0x48) = &LAB_180b21958;
    (*(code *)0x0)();
    puVar19 = (undefined1 *)(lVar8 + -0x40);
  }
  alStack_21c8[0] = 0;
  alStack_21c8[1] = 0;
  uStack_21b8 = 0;
  lStack_21b0 = 0;
  uStack_21a8 = 0;
  uStack_21a0 = 0;
  *(undefined8 *)(puVar19 + -8) = 0x180b2197c;
  lVar8 = VirtualQueryEx(param_1,0,alStack_21c8);
  if (lVar8 != 0) {
    *(uint *)(puVar19 + 0x34) = (uint)bStack_2198;
    *(uint *)(puVar19 + 0x30) = (uint)bStack_2198;
    bVar26 = bStack_2198;
    do {
      lVar8 = lStack_21b0;
      if (((int)uStack_21b8 == 0x80) && (uStack_21a8._4_4_ == 0x20)) {
        lStack_2238 = 0;
        lStack_2230 = 0;
        lStack_2228 = 0;
        if (lStack_21b0 != 0) {
          *(undefined8 *)(puVar19 + -8) = 0x180b219da;
          FUN_1801bf090(&lStack_2238,lStack_21b0);
          lVar4 = lStack_2238;
          *(undefined8 *)(puVar19 + -8) = 0x180b219eb;
          FUN_180f297c0(lStack_2238,0,lVar8);
          lStack_2230 = lVar8 + lVar4;
        }
        uStack_2170 = 0;
        *(ulonglong **)(puVar19 + 0x20) = &uStack_2170;
        *(undefined8 *)(puVar19 + -8) = 0x180b21a1c;
        iVar7 = ReadProcessMemory(param_1,alStack_21c8[0],lStack_2238,lStack_21b0);
        if (iVar7 != 0) {
          uVar25 = 0;
          uVar24 = 0;
          uVar17 = 0;
          *(undefined8 *)(puVar19 + 0x78) = 0;
          if (uStack_2170 != 0) {
            do {
              if (*(char *)(lStack_2238 + uVar17) == '\0') {
                uStack_2218 = uVar17;
                if (uVar25 != 0) {
                  uStack_2218 = uVar24;
                }
                uStack_2210 = uVar25 + 1;
                uVar24 = uStack_2218;
                uVar25 = uStack_2210;
                if (param_2 <= uStack_2210) {
                  uStack_2220 = alStack_21c8[0] + uStack_2218;
                  *(undefined8 *)(puVar19 + -8) = 0x180b21a8e;
                  FUN_180f297c0(auStack_168,0,0x104);
                  *(undefined8 *)(puVar19 + -8) = 0x180b21a9f;
                  FUN_180f297c0(auStack_2168,0);
                  uStack_2194 = 0;
                  uStack_21f8 = 0xb728222b2d292f05;
                  uStack_21f0 = 0;
                  uStack_21ec = 0;
                  uStack_21e8 = 0;
                  uStack_21e4 = 0;
                  uStack_21e3 = 0;
                  uStack_21e2 = 0;
                  uStack_21e1 = 0;
code_r0x000180b21ac0:
                  *(undefined8 *)(puVar19 + -8) = 0x180b21ac5;
                  puVar9 = (ulonglong *)func_0x000180b36780();
                  uVar17 = *puVar9;
                  *(undefined8 *)(puVar19 + -8) = 0x180b21acd;
                  puVar9 = (ulonglong *)func_0x000180b36790();
                  uVar24 = *puVar9;
code_r0x000180b21ad0:
                  uVar21 = 0;
                  uVar25 = uVar24;
code_r0x000180b21ad3:
                  if (0x1a < uVar21) {
                    puVar9 = &uStack_21f8;
code_r0x000180b22436:
                    ppppuStack_2190 = (undefined8 ****)0x0;
                    uStack_2188 = 0;
                    uStack_2180 = 0;
                    uStack_2178 = 0;
                    *(undefined8 *)(puVar19 + -8) = 0x180b22455;
                    uVar10 = FUN_180f29c00(puVar9);
                    *(undefined8 *)(puVar19 + -8) = 0x180b22464;
                    FUN_180191ab0(&ppppuStack_2190,puVar9,uVar10);
                    param_1 = *(undefined8 *)(puVar19 + 0x70);
                    *(undefined8 *)(puVar19 + -8) = 0x180b22480;
                    iVar7 = func_0x000180e07696(param_1,auStack_2168,0x2000,&uStack_2194);
                    uVar17 = uStack_2220;
                    if ((iVar7 == 0) || (uVar24 = 0, uStack_2194 >> 3 == 0))
                    goto code_r0x000180b22527;
                    goto code_r0x000180b224a0;
                  }
                  bVar16 = *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30));
                  bVar6 = (byte)uVar21;
code_r0x000180b21b06:
                  if (uVar21 < uVar17) {
                    puVar9 = (ulonglong *)((longlong)register0x00000020 + 0x11aac30);
                    goto code_r0x000180b22436;
                  }
                  iVar7 = (int)uVar21;
                  if (uVar25 + 1 <= uVar17) {
                    if (uVar17 != uVar25 + 1) {
                      if (uVar17 != uVar25 + 2) {
                        if (uVar17 != uVar25 + 3) {
                          if (uVar17 != uVar25 + 8) goto LAB_180b21b62;
                          bVar12 = bVar6 - 0x28;
                          cVar5 = bVar16 - 0x10;
                          goto code_r0x000180b222f1;
                        }
                        bVar12 = bVar6 + 0x28;
                        cVar5 = bVar16 + 0x10;
                        goto code_r0x000180b2232b;
                      }
                      bVar12 = bVar6 - 0x18;
                      cVar5 = bVar16 + 0x90;
code_r0x000180b22373:
                      *(uint *)(puVar19 + 0x30) =
                           (uint)(byte)(cVar5 + bVar6 + (bVar12 & bVar16) * -2);
                      goto code_r0x000180b22383;
                    }
                    bVar6 = bVar6 + 0x58;
                    uVar24 = (ulonglong)
                             CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                      (char)(iVar7 + (uint)bVar16) + -0x10);
                    goto code_r0x000180b223c6;
                  }
                  iVar13 = (uint)(bVar6 - 0x38 & bVar16) * 0xfe;
                  *(uint *)(puVar19 + 0x30) =
                       CONCAT31((int3)((uint)iVar13 >> 8),
                                (char)iVar13 + -0x78 + (bVar6 - 0x38) + bVar16);
LAB_180b21b62:
                  if (uVar21 < uVar25) {
                    puVar9 = (ulonglong *)((longlong)register0x00000020 + 0x1596868);
                    goto code_r0x000180b22436;
                  }
                  if (uVar25 + 0x20 <= uVar17) {
                    if (uVar17 != uVar25 + 1) {
                      if (uVar17 != uVar25 + 4) {
                        if (uVar17 != uVar25 + 3) {
                          if (uVar17 == uVar25 + 7) {
                            bVar12 = bVar6 + 0x58;
                            cVar5 = bVar16 - 0x10;
                            goto code_r0x000180b2226c;
                          }
                          if (uVar17 != uVar25 + 2) goto code_r0x000180b21bd0;
                          bVar6 = bVar6 + 0x78;
                          uVar24 = (ulonglong)
                                   CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                            (char)(iVar7 + (uint)bVar16) + '0');
                          goto code_r0x000180b223c6;
                        }
                        uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                          (char)(iVar7 + (uint)bVar16) + 'P' +
                                          (bVar6 - 0x38 & bVar16) * -2);
                        *(uint *)(puVar19 + 0x30) = uVar14;
                        uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
                        goto code_r0x000180b21ad3;
                      }
                      uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                        (char)(iVar7 + (uint)bVar16) + -0x50 +
                                        (bVar6 + 0x38 & bVar16) * -2);
                      goto code_r0x000180b2234e;
                    }
                    bVar12 = bVar6 - 8;
                    cVar5 = bVar16 + 0x30;
                    goto code_r0x000180b222f1;
                  }
                  *(uint *)(puVar19 + 0x30) =
                       (uint)(byte)(bVar16 + 0x28 + bVar6 + 0x68 + (bVar6 + 0x68 & bVar16) * -2);
code_r0x000180b21bd0:
                  while (uVar24 = uVar25, uVar21 < uVar25 + uVar17) {
                    while( true ) {
                      do {
                        uVar25 = uVar24;
                        if (uVar17 == uVar25 + 1000) {
                          bVar12 = bVar6 - 0x10;
                          cVar5 = bVar16 + 0x60;
                          goto code_r0x000180b222f1;
                        }
                        if (uVar17 == uVar25 + 0x400) {
                          uVar25 = uVar25 + 1;
                          *(uint *)(puVar19 + 0x30) =
                               CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                        (char)(iVar7 + (uint)bVar16) + (bVar6 + 0x80 & bVar16) * -2)
                          ;
                          goto code_r0x000180b21ad3;
                        }
                        if (uVar17 == uVar25 + 0x1000) {
                          *(uint *)(puVar19 + 0x30) =
                               CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                        (char)(iVar7 + (uint)bVar16) + -0x60 +
                                        (bVar6 + 0x10 & bVar16) * -2);
                          goto code_r0x000180b21ad3;
                        }
                        if (uVar17 == uVar25 + 0x61) {
                          bVar12 = bVar6 + 0xa0;
                          cVar5 = bVar16 + 0x40;
                          goto code_r0x000180b2232b;
                        }
                        if (uVar17 == uVar25 + 0x7a) {
                          uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                            (char)(iVar7 + (uint)bVar16) + -0x20 +
                                            (bVar6 + 0x30 & bVar16) * -2);
                          goto code_r0x000180b2234e;
                        }
                        if (uVar17 == uVar25 + 0x41) {
                          uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                            (char)(iVar7 + (uint)bVar16) + -0x80 +
                                            (bVar6 - 0x40 & bVar16) * -2);
                          *(uint *)(puVar19 + 0x30) = uVar14;
                          uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
                          goto code_r0x000180b21ad3;
                        }
                        if (uVar17 == uVar25 + 0x5a) {
                          bVar12 = bVar6 + 0x50;
                          cVar5 = bVar16 + 0x20;
                          goto code_r0x000180b2226c;
                        }
                        if (uVar17 == uVar25 + 0x2a) {
                          bVar12 = bVar6 - 0x20;
                          cVar5 = bVar16 - 0x40;
                          goto code_r0x000180b22373;
                        }
                        if (uVar17 == uVar25 + 1) {
                          bVar6 = bVar6 + 0x70;
                          uVar24 = (ulonglong)
                                   CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                            (char)(iVar7 + (uint)bVar16) + '`');
                          goto code_r0x000180b223c6;
                        }
                        uVar24 = uVar25;
                      } while (uVar17 == uVar25 + 2);
                      uVar17 = uVar25 + 100;
                      uVar23 = (undefined7)(uVar21 >> 8);
                      if (uVar17 < uVar25 + 0xe7) {
                        iVar7 = (uint)bVar16 + (int)CONCAT71(uVar23,bVar6 + 0x58);
                        *(uint *)(puVar19 + 0x30) =
                             CONCAT31((int3)((uint)iVar7 >> 8),
                                      (char)iVar7 + -0x68 + (bVar16 & bVar6 + 0x58) * -2);
                        goto code_r0x000180b21ac0;
                      }
                      uVar24 = uVar25 + 0x67;
                      if (uVar17 < uVar25 + 0x267) {
                        iVar7 = (uint)bVar16 + (int)CONCAT71(uVar23,bVar6 - 0x18);
                        *(uint *)(puVar19 + 0x30) =
                             CONCAT31((int3)((uint)iVar7 >> 8),
                                      (char)iVar7 + -0x58 + (bVar16 & bVar6 - 0x18) * -2);
                        goto code_r0x000180b21ad0;
                      }
                      if (uVar17 < uVar25 + 0x44f) {
                        *(uint *)(puVar19 + 0x30) =
                             (uint)(byte)(bVar16 + 0xb8 + bVar6 + 0x78 +
                                         (bVar6 + 0x78 & bVar16) * -2);
                        uVar25 = uVar24;
                        goto code_r0x000180b21b06;
                      }
                      if (uVar17 < uVar25 + 0x467) {
                        *(uint *)(puVar19 + 0x30) =
                             (uint)(byte)((bVar16 - 0x38) + bVar6 + 8 + (bVar6 + 8 & bVar16) * -2);
                        uVar25 = uVar24;
                        goto LAB_180b21b62;
                      }
                      if (uVar17 < uVar25 + 0x1067) break;
                      if (uVar17 < uVar25 + 200) {
                        uVar20 = CONCAT31((int3)(bVar16 + 0x10 >> 8),
                                          (char)(bVar16 + 0x10) + bVar6 +
                                          (bVar6 + 0x28 & bVar16) * -2);
                        *(undefined4 *)(puVar19 + 0x30) = uVar20;
                        uVar25 = uVar24;
                        goto code_r0x000180b220ed;
                      }
                      if (uVar17 < uVar25 + 0xe1) {
                        bVar12 = bVar6 + 0xb8;
                        iVar13 = bVar16 + 0xb0;
                        uVar25 = uVar24;
                        goto code_r0x000180b21f54;
                      }
                      uVar22 = uVar25 + 0xa8;
                      if (uVar17 < uVar22) {
                        bVar12 = bVar6 + 0x48;
                        iVar7 = bVar16 + 0x50;
                        uVar25 = uVar24;
                        goto code_r0x000180b21f1b;
                      }
                      if (uVar17 < uVar25 + 0xc1) {
                        uVar20 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                          (char)(iVar7 + (uint)bVar16) + -0x10 +
                                          (bVar6 - 0x28 & bVar16) * -2);
                        *(undefined4 *)(puVar19 + 0x30) = uVar20;
                        uVar25 = uVar24;
                        goto code_r0x000180b21f03;
                      }
                      if (uVar25 + 0x91 <= uVar17) {
                        uVar17 = uVar25 + 0xa7;
                        if (uVar25 + 0xea < uVar17) {
                          bVar6 = bVar6 - 0x40;
                          uVar24 = (ulonglong)
                                   CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                            (char)(iVar7 + (uint)bVar16) + -0x80);
                          uVar25 = uVar22;
                          goto code_r0x000180b223c6;
                        }
                        if (uVar25 + 0x10c < uVar17) {
                          bVar12 = bVar6 + 0x50;
                          cVar5 = bVar16 + 0x20;
                          uVar25 = uVar22;
                          goto code_r0x000180b22373;
                        }
                        if (uVar25 + 0x128 < uVar17) {
                          bVar12 = bVar6 - 0x20;
                          cVar5 = bVar16 - 0x40;
                          uVar25 = uVar22;
                          goto code_r0x000180b2226c;
                        }
                        if (uVar25 + 0x2a8 < uVar17) {
                          uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                            (char)(iVar7 + (uint)bVar16) + '`' +
                                            (bVar6 + 0x70 & bVar16) * -2);
                          *(uint *)(puVar19 + 0x30) = uVar14;
                          uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
                          uVar25 = uVar22;
                          goto code_r0x000180b21ad3;
                        }
                        if (uVar25 + 0x490 < uVar17) {
                          uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                            (char)(iVar7 + (uint)bVar16) + (bVar6 & bVar16) * -2);
                          uVar25 = uVar22;
                          goto code_r0x000180b2234e;
                        }
                        if (uVar25 + 0x4a8 < uVar17) {
                          bVar12 = bVar6 + 0x90;
                          cVar5 = bVar16 + 0xa0;
                          uVar25 = uVar22;
                          goto code_r0x000180b2232b;
                        }
                        if (uVar25 + 0x10a8 < uVar17) {
                          *(uint *)(puVar19 + 0x30) =
                               CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                        (char)(iVar7 + (uint)bVar16) + '@' +
                                        (bVar6 + 0x20 & bVar16) * -2);
                          uVar25 = uVar22;
                          goto code_r0x000180b21ad3;
                        }
                        if (uVar25 + 0x109 < uVar17) {
                          *(uint *)(puVar19 + 0x30) =
                               CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                        (char)(iVar7 + (uint)bVar16) + -0x20 +
                                        (bVar6 + 0xb0 & bVar16) * -2);
                          uVar25 = uVar25 + 0xa9;
                          goto code_r0x000180b21ad3;
                        }
                        if (uVar25 + 0x122 < uVar17) {
                          bVar12 = bVar6 + 0x40;
                          cVar5 = bVar16 + 0x80;
                          uVar25 = uVar22;
                          goto code_r0x000180b222f1;
                        }
                        uVar24 = uVar22;
                        if (uVar17 <= uVar25 + 0xe9) {
                          uVar17 = uVar25 + 200;
                          uVar24 = uVar25 + 0x122;
                        }
                      }
                    }
                    *(uint *)(puVar19 + 0x30) =
                         (uint)(byte)((bVar16 - 0x28) + bVar6 + 0x98 + (bVar6 + 0x98 & bVar16) * -2)
                    ;
                    uVar25 = uVar24;
                  }
                  if (uVar17 < uVar25 + 0x61) {
                    uVar20 = CONCAT31((int3)(bVar16 + 0x50 >> 8),
                                      (char)(bVar16 + 0x50) + bVar6 + (bVar6 - 0x38 & bVar16) * -2);
                    *(undefined4 *)(puVar19 + 0x30) = uVar20;
code_r0x000180b220ed:
                    if (uVar25 + uVar17 != 1000) {
                      if (uVar25 + 6 < uVar17) {
                        bVar12 = bVar6 + 0xa8;
                        iVar13 = bVar16 + 0x10;
code_r0x000180b21f54:
                        uVar20 = CONCAT31((int3)((uint)iVar13 >> 8),
                                          (char)iVar13 + bVar6 + (bVar12 & bVar16) * -2);
                        *(undefined4 *)(puVar19 + 0x30) = uVar20;
code_r0x000180b21f5e:
                        if (0x7f < uVar17) {
                          uVar14 = (byte)(bVar16 * '\x02' + bVar6 + (bVar6 + 0x40 & bVar16) * -2) +
                                   0x80;
code_r0x000180b22337:
                          *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) =
                               bVar16 + (bVar6 + 8 & bVar16) * -2 + -0x30 + bVar6 + (char)uVar14;
                          goto code_r0x000180b2234e;
                        }
                        if (uVar25 + 4 < uVar17) {
                          bVar12 = bVar6 + 0x10;
                          iVar7 = bVar16 + 0xa0;
code_r0x000180b21f1b:
                          uVar20 = CONCAT31((int3)((uint)iVar7 >> 8),
                                            (char)iVar7 + bVar6 + (bVar12 & bVar16) * -2);
                          *(undefined4 *)(puVar19 + 0x30) = uVar20;
                        }
                        else {
                          if (uVar17 == uVar25 + 1) {
                            bVar6 = bVar6 + 0xa0;
                            uVar24 = (ulonglong)
                                     CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                              (char)(iVar7 + (uint)bVar16) + '@');
                            goto code_r0x000180b223c6;
                          }
                          if (uVar17 == uVar25 + 3) {
                            bVar12 = bVar6 - 0x40;
                            cVar5 = bVar16 + 0x80;
                            goto code_r0x000180b2226c;
                          }
                          if (uVar17 == uVar25 + 2) {
                            uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                              (char)(iVar7 + (uint)bVar16) + ' ' +
                                              (bVar6 + 0x50 & bVar16) * -2);
                            *(uint *)(puVar19 + 0x30) = uVar14;
                            uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
                            goto code_r0x000180b21ad3;
                          }
                          if (uVar17 == uVar25 + 5) {
                            bVar12 = bVar6 + 0x70;
                            cVar5 = bVar16 + 0x60;
code_r0x000180b2232b:
                            uVar14 = (uint)(byte)(cVar5 + bVar6 + (bVar12 & bVar16) * -2);
                            goto code_r0x000180b22337;
                          }
                        }
                        if (uVar25 < 0x42) {
code_r0x000180b21f03:
                          *(char *)((longlong)alStack_21c8 + (uVar21 - 0x30)) = (char)uVar20;
                          uVar21 = uVar21 + 1;
                          goto code_r0x000180b21ad3;
                        }
                        uVar14 = CONCAT31((int3)(bVar16 + 0xe0 >> 8),
                                          (char)(bVar16 + 0xe0) + bVar6 +
                                          (bVar6 + 0xb0 & bVar16) * -2) * 2;
                      }
                      else {
                        if (uVar17 != uVar25 + 1) {
                          if (uVar17 == uVar25 + 2) {
                            uVar25 = uVar25 + 1;
                            *(uint *)(puVar19 + 0x30) =
                                 CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                          (char)(iVar7 + (uint)bVar16) + 'P' +
                                          (bVar6 - 0x38 & bVar16) * -2);
                          }
                          else {
                            if (uVar17 == uVar25 + 3) {
                              uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                                (char)(iVar7 + (uint)bVar16) + '0' +
                                                (bVar6 + 0x78 & bVar16) * -2);
                              goto code_r0x000180b2234e;
                            }
                            if (uVar17 != uVar25 + 5) goto code_r0x000180b21f5e;
                            uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                              (char)(iVar7 + (uint)bVar16) + -0x30 +
                                              (bVar6 + 8 & bVar16) * -2);
                            *(uint *)(puVar19 + 0x30) = uVar14;
                            uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
                          }
                          goto code_r0x000180b21ad3;
                        }
                        bVar12 = bVar6 + 0x38;
                        cVar5 = bVar16 + 0xb0;
code_r0x000180b222f1:
                        uVar14 = (uint)(byte)(cVar5 + bVar6 + (bVar12 & bVar16) * -2);
                      }
                      *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) =
                           bVar16 + 0x30 + (bVar6 + 0x78 & bVar16) * -2 + bVar6;
                      *(uint *)(puVar19 + 0x30) = uVar14;
                      uVar25 = uVar25 + 1;
                      goto code_r0x000180b21ad3;
                    }
                    bVar12 = bVar6 - 0x30;
                    cVar5 = bVar6 + 0x20;
                  }
                  else {
                    if (uVar17 == uVar25 + 1) {
                      bVar6 = bVar6 - 0x30;
                      uVar24 = (ulonglong)
                               CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                        (char)(iVar7 + (uint)bVar16) + ' ');
code_r0x000180b223c6:
                      *(int *)(puVar19 + 0x30) =
                           (int)CONCAT71((int7)(uVar24 >> 8),(char)uVar24 + (bVar6 & bVar16) * -2);
                      uVar21 = uVar21 + *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) + uVar25
                               + 1;
                      goto code_r0x000180b21ad3;
                    }
                    if (uVar17 != uVar25 + 3) {
                      if (uVar17 != uVar25 + 5) {
                        if (uVar17 != uVar25 + 9) {
                          uVar20 = *(undefined4 *)(puVar19 + 0x30);
                          goto code_r0x000180b220ed;
                        }
                        bVar12 = bVar6 + 0x50;
                        cVar5 = bVar16 + 0x20;
                        goto code_r0x000180b222f1;
                      }
                      uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                        (char)(iVar7 + (uint)bVar16) + -0x60 +
                                        (bVar6 + 0x10 & bVar16) * -2);
code_r0x000180b2234e:
                      *(uint *)(puVar19 + 0x30) = uVar14;
                      uVar17 = uVar17 + uVar25;
                      uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
                      goto code_r0x000180b21ad3;
                    }
                    bVar12 = bVar6 - 0x10;
                    cVar5 = bVar16 + 0x60;
code_r0x000180b2226c:
                    cVar5 = cVar5 + bVar6;
                  }
                  *(uint *)(puVar19 + 0x30) = (uint)(byte)(cVar5 + (bVar12 & bVar16) * -2);
                  bVar6 = bVar16 + 0x70 + (bVar6 + 0x98 & bVar16) * -2 + bVar6;
                  *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) = bVar6;
                  uVar25 = uVar25 + 1;
                  uVar21 = (uVar21 - uVar25) - (ulonglong)bVar6;
code_r0x000180b22383:
                  *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) =
                       (char)uVar21 + -0x40 + bVar16 + ((char)uVar21 + 0x60U & bVar16) * -2;
                  uVar17 = uVar17 + 1;
                  uVar21 = uVar21 + ~uVar17 +
                           *(byte *)((longlong)alStack_21c8 + uVar21 + ~uVar17 + -0x30) + uVar25 + 1
                  ;
                  goto code_r0x000180b21ad3;
                }
              }
              else {
                uVar25 = 0;
              }
LAB_180b23a16:
              uVar17 = uVar17 + 1;
              *(ulonglong *)(puVar19 + 0x78) = uVar17;
              param_2 = uStack_2200;
            } while (uVar17 < uStack_2170);
          }
        }
        if (lStack_2238 != 0) {
          uVar17 = lStack_2228 - lStack_2238;
          if (uVar17 < 0x1000) {
            lVar8 = lStack_2238;
          }
          else {
            if (0x1f < (lStack_2238 - *(longlong *)(lStack_2238 + -8)) - 8U)
            goto code_r0x000180b245e1;
            uVar17 = uVar17 + 0x27;
            lVar8 = *(longlong *)(lStack_2238 + -8);
          }
          *(undefined **)(puVar19 + -8) = &LAB_180b23a68;
          func_0x000180e15340(lVar8,uVar17);
        }
      }
      *(undefined8 *)(puVar19 + -8) = 0x180b23a83;
      lVar8 = VirtualQueryEx(param_1,alStack_21c8[0] + lStack_21b0,alStack_21c8);
    } while (lVar8 != 0);
  }
  uStack_21f8 = 0x3f707686708e875d;
  uStack_21f0 = 0x1b60606c;
  uStack_21ec = 0;
  uStack_21e8 = 0;
  uStack_21e4 = 0;
  uStack_21e3 = 0;
  uStack_21e2 = 0;
  puVar9 = &uStack_21f8;
  bVar26 = bStack_2198;
code_r0x000180b23ab6:
  *(undefined8 *)(puVar19 + -8) = 0x180b23ae5;
  puVar11 = (ulonglong *)func_0x000180b36780();
  uVar17 = *puVar11;
  *(undefined8 *)(puVar19 + -8) = 0x180b23aed;
  puVar11 = (ulonglong *)func_0x000180b36790();
  uVar24 = *puVar11;
code_r0x000180b23af0:
  uVar25 = uVar24;
  for (uVar21 = 0; uVar21 < 0x17; uVar21 = uVar21 + 1) {
    bVar16 = *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30));
    cVar5 = (char)uVar21;
code_r0x000180b23b20:
    if (uVar21 < uVar17) {
      puVar9 = (ulonglong *)((longlong)register0x00000020 + 0x13aed0f);
      break;
    }
    if (uVar25 + 1 <= uVar17) {
      if (uVar17 != uVar25 + 1) {
        if (uVar17 == uVar25 + 3) {
          bVar26 = bVar16 & cVar5 + 0x15U;
          cVar27 = bVar16 + 0x82;
          goto code_r0x000180b2442f;
        }
        if (uVar17 == uVar25 + 2) {
          bVar26 = cVar5 + 0x21;
          cVar5 = cVar5 + bVar16 + ':';
          goto code_r0x000180b24401;
        }
        if (uVar17 != uVar25 + 7) {
          if (uVar17 != uVar25 + 9) goto code_r0x000180b23ba3;
          bVar26 = cVar5 + 0x39;
          cVar27 = bVar16 + 0xaa;
          goto code_r0x000180b243a5;
        }
        bVar26 = cVar5 + bVar16 + -0xe + (bVar16 & cVar5 + 0x2dU) * -2;
        uVar21 = uVar21 - 1;
        goto code_r0x000180b244a2;
      }
      bVar26 = cVar5 + bVar16 + -0x36 + (bVar16 & cVar5 + 9U) * -2;
      goto code_r0x000180b24496;
    }
    bVar26 = (cVar5 + 3U & bVar16) * -2 + -0x15 + cVar5 + 3U + bVar16;
code_r0x000180b23ba3:
    if (uVar21 < uVar25) {
      puVar9 = (ulonglong *)((longlong)register0x00000020 + 0x16b0c0c);
      break;
    }
    if (uVar17 < uVar25 + 0x42) {
      bVar26 = bVar16 + 0x47 + cVar5 + 0x3fU + (bVar16 & cVar5 + 0x3fU) * -2;
    }
    else {
      if (uVar17 == uVar25 + 1) {
        bVar26 = cVar5 + 0x45;
        cVar27 = bVar16 + 0x62;
        goto code_r0x000180b243a5;
      }
      if (uVar17 == uVar25 + 2) {
        bVar26 = cVar5 + bVar16 + '\x1a' + (bVar16 & cVar5 + 0x51U) * -2;
        uVar21 = uVar21 - 1;
        goto code_r0x000180b244a2;
      }
      if (uVar17 == uVar25 + 3) {
        bVar26 = cVar5 + bVar16 + -0x2e + (cVar5 + 0x5dU & bVar16) * -2;
        uVar17 = uVar17 + uVar25;
        uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
        goto code_r0x000180b244a2;
      }
      if (uVar17 == uVar25 + 7) {
        bVar26 = cVar5 + 0x69U & bVar16;
        cVar27 = bVar16 + 0x8a;
        goto code_r0x000180b2442f;
      }
      if (uVar17 == uVar25 + 5) {
        bVar26 = cVar5 + bVar16 + 'B' + (cVar5 + 0x75U & bVar16) * -2;
        goto code_r0x000180b24496;
      }
    }
    while (uVar24 = uVar25, uVar21 < uVar25 + uVar17) {
      while( true ) {
        do {
          uVar25 = uVar24;
          if (uVar17 == uVar25 + 5) {
            bVar26 = cVar5 + 0x4aU & bVar16;
            cVar27 = bVar16 + 0x44;
            goto code_r0x000180b243ab;
          }
          if (uVar17 == uVar25 + 0x61) {
            bVar26 = cVar5 + bVar16 + ' ' + (cVar5 + 0x50U & bVar16) * -2;
            uVar25 = uVar25 + 1;
            uVar21 = uVar21 - 1;
            goto code_r0x000180b244a2;
          }
          if (uVar17 == uVar25 + 3) {
            bVar26 = cVar5 + bVar16 + -4 + (cVar5 + 0x56U & bVar16) * -2;
            uVar21 = uVar21 - 1;
            goto code_r0x000180b244a2;
          }
          if (uVar17 == uVar25 + 0x10) {
            bVar26 = (bVar16 - 0x28) + cVar5 + (cVar5 + 0x5cU & bVar16) * -2;
            goto code_r0x000180b242d4;
          }
          if (uVar17 == uVar25 + 1) {
            bVar26 = cVar5 + bVar16 + -0x4c + (cVar5 + 0x62U & bVar16) * -2;
            uVar17 = uVar17 + uVar25;
            uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
            goto code_r0x000180b244a2;
          }
          if (uVar17 == uVar25 + 9) {
            bVar26 = cVar5 + bVar16 + -0x70 + (cVar5 + 0x68U & bVar16) * -2;
            uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
            goto code_r0x000180b244a2;
          }
          if (uVar17 == uVar25 + 100) {
            bVar26 = cVar5 + 0x6eU & bVar16;
            cVar27 = bVar16 + 0x6c;
            goto code_r0x000180b2442f;
          }
          if (uVar17 == uVar25 + 0x7a) {
            bVar26 = bVar16 + 0x48 + cVar5 + (cVar5 + 0x74U & bVar16) * -2;
            goto code_r0x000180b2445a;
          }
          if (uVar17 == uVar25 + 0x40) {
            bVar26 = cVar5 + bVar16 + '$' + (cVar5 + 0x7aU & bVar16) * -2;
            goto code_r0x000180b24496;
          }
          uVar24 = uVar25;
        } while (uVar17 == uVar25 + 0x1000);
        uVar17 = uVar25 + 0x20;
        if (uVar17 < uVar25 + 0x24) {
          bVar26 = bVar16 + cVar5 + 0x89U + 'A' + (bVar16 & cVar5 + 0x89U) * -2;
          goto code_r0x000180b23ab6;
        }
        uVar24 = uVar25 + 0x22;
        if (uVar17 < uVar25 + 0x2c) {
          bVar26 = bVar16 + cVar5 + 0x8fU + '\x17' + (bVar16 & cVar5 + 0x8fU) * -2;
          goto code_r0x000180b23af0;
        }
        if (uVar17 < uVar25 + 0xa2) {
          bVar26 = (bVar16 - 0x13) + cVar5 + 0x95U + (bVar16 & cVar5 + 0x95U) * -2;
          uVar25 = uVar24;
          goto code_r0x000180b23b20;
        }
        if (uVar17 < uVar25 + 99) {
          bVar26 = (bVar16 - 0x3d) + cVar5 + 0x9bU + (bVar16 & cVar5 + 0x9bU) * -2;
          uVar25 = uVar24;
          goto code_r0x000180b23ba3;
        }
        if (uVar17 < uVar25 + 100) break;
        if (uVar17 < uVar25 + 0x83) {
          bVar26 = cVar5 + 0xa7;
          cVar27 = bVar16 + 0x16;
          uVar25 = uVar24;
          goto code_r0x000180b23fd5;
        }
        if (uVar17 < uVar25 + 0x25) {
          bVar26 = cVar5 + 0xad;
          cVar27 = bVar16 - 0xe;
          uVar25 = uVar24;
          goto code_r0x000180b23f9c;
        }
        if (uVar17 < uVar25 + 0x422) {
          bVar26 = cVar5 + 0xb3;
          cVar27 = bVar16 - 0x32;
          uVar25 = uVar24;
          goto code_r0x000180b23f60;
        }
        if (uVar17 < uVar25 + 0x23) {
          bVar26 = cVar5 + bVar16 + -0x56 + (cVar5 + 0xb9U & bVar16) * -2;
          uVar25 = uVar24;
          goto code_r0x000180b23f46;
        }
        if (uVar25 + 0x2b <= uVar17) {
          uVar17 = uVar25 + 0x7c;
          uVar24 = uVar25 + 0xe0;
          if (uVar25 + 0x144 < uVar17) {
            bVar26 = cVar5 + bVar16 + 'P' + (cVar5 - 0x38U & bVar16) * -2;
            uVar25 = uVar24;
            goto code_r0x000180b24496;
          }
          if (uVar25 + 0x15a < uVar17) {
            bVar26 = bVar16 + 0x2c + cVar5 + (cVar5 - 0x32U & bVar16) * -2;
            uVar25 = uVar24;
            goto code_r0x000180b2445a;
          }
          if (uVar25 + 0xe4 < uVar17) {
            bVar26 = cVar5 - 0x2cU & bVar16;
            cVar27 = bVar16 + 8;
            uVar25 = uVar24;
            goto code_r0x000180b2442f;
          }
          if (uVar25 + 0x100 < uVar17) {
            bVar26 = cVar5 + bVar16 + -0x1c + (cVar5 - 0x26U & bVar16) * -2;
            uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
            uVar25 = uVar24;
            goto code_r0x000180b244a2;
          }
          if (uVar25 + 0xe2 < uVar17) {
            bVar26 = cVar5 + bVar16 + -0x40 + (cVar5 - 0x20U & bVar16) * -2;
            uVar17 = uVar17 + uVar24;
            uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
            uVar25 = uVar24;
            goto code_r0x000180b244a2;
          }
          if (uVar25 + 0xea < uVar17) {
            bVar26 = bVar16 + 0x9c + cVar5 + (cVar5 - 0x1aU & bVar16) * -2;
            uVar25 = uVar24;
            goto code_r0x000180b242d4;
          }
          if (uVar25 + 0x160 < uVar17) {
            bVar26 = cVar5 + bVar16 + 'x' + (cVar5 - 0x14U & bVar16) * -2;
            uVar21 = uVar21 - 1;
            uVar25 = uVar24;
            goto code_r0x000180b244a2;
          }
          if (uVar25 + 0xe8 < uVar17) {
            bVar26 = cVar5 + bVar16 + 'T' + (cVar5 - 0xeU & bVar16) * -2;
            uVar21 = uVar21 - 1;
            uVar25 = uVar25 + 0xe1;
            goto code_r0x000180b244a2;
          }
          if (uVar25 + 0x122 < uVar17) {
            bVar26 = cVar5 - 8U & bVar16;
            cVar27 = bVar16 + 0x30;
            uVar25 = uVar24;
            goto code_r0x000180b243ab;
          }
          if (uVar17 <= uVar25 + 0x141) {
            uVar17 = uVar25 + 0x108;
            uVar24 = uVar25 + 0x130;
          }
        }
      }
      bVar26 = bVar16 + 0x99 + cVar5 + 0xa1U + (bVar16 & cVar5 + 0xa1U) * -2;
      uVar25 = uVar24;
    }
    if (uVar17 < uVar25 + 0x20) {
      bVar26 = cVar5 + 3;
      cVar27 = bVar16 - 0x12;
code_r0x000180b23fd5:
      bVar26 = cVar27 + cVar5 + (bVar26 & bVar16) * -2;
code_r0x000180b23fdb:
      if (uVar25 + uVar17 == 0x200) {
        bVar26 = cVar5 + -0x74 + (cVar5 + 0x3eU & bVar16) * -2;
code_r0x000180b24437:
        bVar6 = bVar16 + 0x7a + (cVar5 + 0x41U & bVar16) * -2 + cVar5;
        *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) = bVar6;
        uVar21 = (uVar21 - (uVar25 + 1)) - (ulonglong)bVar6;
        uVar25 = uVar25 + 1;
code_r0x000180b2445a:
        *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) =
             (char)uVar21 + 'h' + bVar16 + ((char)uVar21 + 0x44U & bVar16) * -2;
        uVar17 = uVar17 + 1;
        uVar21 = uVar21 + ~uVar17;
code_r0x000180b24496:
        uVar21 = uVar21 + *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) + uVar25;
      }
      else if (uVar25 + 9 < uVar17) {
        bVar26 = cVar5 + 0xb7;
        cVar27 = bVar16 + 0xb6;
code_r0x000180b23f9c:
        bVar26 = cVar27 + cVar5 + (bVar26 & bVar16) * -2;
code_r0x000180b23fa2:
        if (4 < uVar17) {
          bVar26 = bVar16 * '\x02' + cVar5 + (cVar5 + 0x38U & bVar16) * -2 + 0xb0;
          goto code_r0x000180b242d4;
        }
        if (uVar25 + 0x61 < uVar17) {
          bVar26 = cVar5 - 10;
          cVar27 = bVar16 + 0x3c;
code_r0x000180b23f60:
          bVar26 = cVar27 + cVar5 + (bVar26 & bVar16) * -2;
        }
        else {
          if (uVar17 == uVar25 + 1) {
            bVar26 = cVar5 + bVar16 + '\x18' + (cVar5 - 4U & bVar16) * -2;
            goto code_r0x000180b24496;
          }
          if (uVar17 == uVar25 + 2) {
            bVar26 = cVar5 + 8U & bVar16;
            cVar27 = bVar16 - 0x30;
code_r0x000180b2442f:
            bVar26 = cVar27 + cVar5 + bVar26 * -2;
            goto code_r0x000180b24437;
          }
          if (uVar17 == uVar25 + 5) {
            bVar26 = cVar5 + bVar16 + '\x1c' + (bVar16 & cVar5 + 0x26U) * -2;
            uVar25 = uVar25 + 1;
            uVar21 = uVar21 - 1;
            goto code_r0x000180b244a2;
          }
          if (uVar17 == uVar25 + 6) {
            bVar26 = cVar5 + 0x2c;
            cVar27 = bVar16 - 8;
            goto code_r0x000180b243a5;
          }
        }
        if (999 < uVar25) {
          bVar26 = ((bVar16 - 0x2c) + cVar5 + (cVar5 + 0x32U & bVar16) * -2) * '\x02';
          goto code_r0x000180b243b3;
        }
code_r0x000180b23f46:
        *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) = bVar26;
      }
      else {
        if (uVar17 == uVar25 + 1) {
          bVar26 = cVar5 + 0xbdU & bVar16;
          cVar27 = bVar16 + 0x92;
          goto code_r0x000180b243ab;
        }
        if (uVar17 == uVar25 + 2) {
          bVar26 = cVar5 + bVar16 + 'J' + (cVar5 - 0x37U & bVar16) * -2;
          uVar21 = uVar21 - 1;
        }
        else if (uVar17 == uVar25 + 3) {
          bVar26 = cVar5 - 0x2b;
          cVar5 = cVar5 + bVar16 + '\x02';
code_r0x000180b24401:
          bVar26 = cVar5 + (bVar16 & bVar26) * -2;
          uVar17 = uVar17 + uVar25;
          uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
        }
        else {
          if (uVar17 != uVar25 + 5) goto code_r0x000180b23fa2;
          bVar26 = cVar5 + bVar16 + -0x22 + (bVar16 & cVar5 - 0x25U) * -2;
          uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
        }
      }
    }
    else {
      if (uVar17 == uVar25 + 1) {
        bVar26 = cVar5 + bVar16 + '\f' + (cVar5 + 0x7eU & bVar16) * -2;
        goto code_r0x000180b24496;
      }
      if (uVar17 == uVar25 + 6) {
        bVar26 = bVar16 + 0x58 + cVar5 + (bVar16 & cVar5 + 0x9cU) * -2;
code_r0x000180b242d4:
        *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) =
             bVar16 + (cVar5 + 0x3bU & bVar16) * -2 + -0x62 + cVar5 + bVar26;
        uVar17 = uVar17 + uVar25;
        uVar21 = (uVar21 - 1) - (ulonglong)bVar26;
      }
      else {
        if (uVar17 == uVar25 + 4) {
          bVar26 = cVar5 + bVar16 + '\x10' + (bVar16 & cVar5 + 0xa8U) * -2;
          uVar25 = uVar25 + 1;
          uVar21 = uVar21 - 1;
          goto code_r0x000180b244a2;
        }
        if (uVar17 != uVar25 + 8) goto code_r0x000180b23fdb;
        bVar26 = cVar5 + 0xae;
        cVar27 = bVar16 - 0x14;
code_r0x000180b243a5:
        bVar26 = bVar16 & bVar26;
code_r0x000180b243ab:
        bVar26 = cVar27 + cVar5 + bVar26 * -2;
code_r0x000180b243b3:
        *(byte *)((longlong)alStack_21c8 + (uVar21 - 0x30)) =
             (bVar16 - 0x3e) + (cVar5 + 0x35U & bVar16) * -2 + cVar5;
        uVar21 = uVar21 - 1;
        uVar25 = uVar25 + 1;
      }
    }
code_r0x000180b244a2:
  }
  ppppuStack_2190 = (undefined8 ****)0x0;
  uStack_2188 = 0;
  uStack_2180 = 0;
  uStack_2178 = 0;
  *(undefined8 *)(puVar19 + -8) = 0x180b2455d;
  uVar10 = FUN_180f29c00(puVar9);
  *(undefined8 *)(puVar19 + -8) = 0x180b2456c;
  FUN_180191ab0(&ppppuStack_2190,puVar9,uVar10);
  *(undefined8 *)(puVar19 + -8) = 0x180b24576;
  FUN_1801a4a90(&ppppuStack_2190);
  if (0xf < uStack_2178) {
    if (uStack_2178 + 1 < 0x1000) {
      lVar8 = 1;
      ppppuVar15 = ppppuStack_2190;
    }
    else {
      if (0x1f < (ulonglong)((longlong)ppppuStack_2190 + (-8 - (longlong)ppppuStack_2190[-1]))) {
code_r0x000180b245e1:
        pcVar2 = (code *)swi(0x29);
        (*pcVar2)(5);
        pcVar2 = (code *)swi(3);
        (*pcVar2)();
        return;
      }
      lVar8 = 0x28;
      ppppuVar15 = (undefined8 ****)ppppuStack_2190[-1];
    }
    *(undefined8 *)(puVar19 + -8) = 0x180b245bc;
    func_0x000180e15340(ppppuVar15,uStack_2178 + lVar8);
  }
code_r0x000180b245be:
  *(undefined8 *)(puVar19 + -8) = 0x180b245cd;
  FUN_180e155e0(uStack_58 ^ (ulonglong)puVar19);
  return;
code_r0x000180b224a0:
  uStack_21f8 = 0;
  uStack_21f0 = 0;
  uStack_21ec = 0;
  uStack_21e8 = 0;
  uStack_21e4 = 0;
  uStack_21e3 = 0;
  uStack_21e2 = 0;
  uStack_21e1 = uStack_21e1 & 0xffffff00;
  uVar10 = auStack_2168[uVar24];
  *(undefined8 *)(puVar19 + -8) = 0x180b224c4;
  iVar7 = func_0x000180e076a2(param_1,uVar10,&uStack_21f8,0x18);
  if ((iVar7 != 0) && ((uStack_21f8 <= uVar17 && (uVar17 < uStack_21f0 + uStack_21f8)))) {
    uVar10 = auStack_2168[uVar24];
    *(undefined8 *)(puVar19 + -8) = 0x180b22504;
    iVar7 = func_0x000180e0769c(param_1,uVar10,auStack_168,0x104);
    if (iVar7 != 0) {
      *(undefined8 *)(puVar19 + -8) = 0x180b22514;
      FUN_180f29c00(auStack_168);
      *(undefined8 *)(puVar19 + -8) = 0x180b22527;
      FUN_18019a4f0(&ppppuStack_2190,auStack_168);
    }
    goto code_r0x000180b22527;
  }
  uVar14 = (int)uVar24 + 1;
  uVar24 = (ulonglong)uVar14;
  if (uStack_2194 >> 3 <= uVar14) {
code_r0x000180b22527:
    uStack_21f8 = 0x534ca5ab575aa844;
    uStack_21f0 = 0xb147ba5d;
    uStack_21ec = 0x44b04260;
    uStack_21e8 = 0x4cb04e08;
    uStack_21e4 = 0x2a;
    uStack_21e3 = 0;
    uStack_21e2 = 0;
    uStack_21e1 = 0;
    uStack_21dd = 0;
    uStack_21db = 0;
    uStack_21da = 0;
    uStack_21d3 = 0;
    uStack_21d2 = 0;
code_r0x000180b22560:
    *(undefined8 *)(puVar19 + -8) = 0x180b22565;
    puVar9 = (ulonglong *)func_0x000180b36780();
    uVar17 = *puVar9;
    *(undefined8 *)(puVar19 + -8) = 0x180b2256d;
    puVar9 = (ulonglong *)func_0x000180b36790();
    uVar24 = *puVar9;
code_r0x000180b22570:
    uVar22 = 0;
    uVar25 = uVar17;
    uVar21 = uVar24;
code_r0x000180b22573:
    if (uVar22 < 0x2e) goto code_r0x000180b2257d;
    puVar9 = &uStack_21f8;
code_r0x000180b23007:
    *(undefined8 *)(puVar19 + -8) = 0x180b2300f;
    uVar10 = FUN_180f29c00(puVar9);
    ppppuVar15 = &ppppuStack_2190;
    if (0xf < uStack_2178) {
      ppppuVar15 = ppppuStack_2190;
    }
    *(undefined8 *)(puVar19 + 0x20) = uVar10;
    *(undefined8 *)(puVar19 + -8) = 0x180b23031;
    lVar8 = FUN_180291a30(ppppuVar15,uStack_2180,0,puVar9);
    if (lVar8 != -1) goto code_r0x000180b239fc;
    *(undefined4 *)(puVar19 + 0x40) = 0x8f788e6a;
    *(undefined4 *)(puVar19 + 0x44) = 0x83669d83;
    *(undefined4 *)(puVar19 + 0x48) = 0x818f9871;
    *(undefined4 *)(puVar19 + 0x4c) = 0x6e82904e;
    *(undefined4 *)(puVar19 + 0x50) = 0x9f9e955e;
    puVar19[0x54] = 4;
    *(undefined8 *)(puVar19 + 0x55) = 0;
    *(undefined8 *)(puVar19 + 0x5d) = 0;
    puVar19[0x65] = 0;
code_r0x000180b23076:
    *(undefined8 *)(puVar19 + -8) = 0x180b2307b;
    puVar9 = (ulonglong *)func_0x000180b36780();
    uVar17 = *puVar9;
    *(undefined8 *)(puVar19 + -8) = 0x180b23083;
    puVar9 = (ulonglong *)func_0x000180b36790();
    uVar24 = *puVar9;
code_r0x000180b23090:
    uVar21 = 0;
    uVar25 = uVar24;
code_r0x000180b23093:
    if (0x25 < uVar21) {
      puVar18 = puVar19 + 0x40;
code_r0x000180b23935:
      *(undefined8 *)(puVar19 + -8) = 0x180b2393d;
      uVar10 = FUN_180f29c00(puVar18);
      ppppuVar15 = &ppppuStack_2190;
      if (0xf < uStack_2178) {
        ppppuVar15 = ppppuStack_2190;
      }
      *(undefined8 *)(puVar19 + 0x20) = uVar10;
      *(undefined8 *)(puVar19 + -8) = 0x180b2395f;
      lVar8 = FUN_180291a30(ppppuVar15,uStack_2180,0,puVar18);
      uVar17 = uStack_2220;
      param_1 = *(undefined8 *)(puVar19 + 0x70);
      if (lVar8 != -1) {
code_r0x000180b239fc:
        *(undefined8 *)(puVar19 + -8) = 0x180b23a05;
        FUN_180195980(&ppppuStack_2190);
        uVar17 = *(ulonglong *)(puVar19 + 0x78);
        uVar24 = uStack_2218;
        uVar25 = uStack_2210;
        goto LAB_180b23a16;
      }
      acStack_2197[1] = 0x90;
      acStack_2197[0] = '\0';
      *(undefined8 *)(puVar19 + 0x20) = 0;
      *(undefined8 *)(puVar19 + -8) = 0x180b2399c;
      iVar7 = WriteProcessMemory(param_1,uStack_2220,acStack_2197 + 1,1);
      if (iVar7 != 0) {
        *(undefined8 *)(puVar19 + 0x20) = 0;
        *(undefined8 *)(puVar19 + -8) = 0x180b239bc;
        ReadProcessMemory(param_1,uVar17,acStack_2197,1);
        bStack_2198 = 0;
        *(undefined8 *)(puVar19 + 0x20) = 0;
        *(undefined8 *)(puVar19 + -8) = 0x180b239dc;
        WriteProcessMemory(param_1,uVar17,&bStack_2198,1);
        if (acStack_2197[0] == -0x70) {
          *(undefined8 *)(puVar19 + -8) = 0x180b23b57;
          FUN_180195980(&ppppuStack_2190);
          *(undefined8 *)(puVar19 + -8) = 0x180b23b61;
          FUN_1801c0ba0(&lStack_2238);
          goto code_r0x000180b245be;
        }
      }
      *(undefined8 *)(puVar19 + -8) = 0x180b239f1;
      FUN_180195980(&ppppuStack_2190);
      uVar17 = *(ulonglong *)(puVar19 + 0x78);
      uVar24 = uStack_2218;
      uVar25 = 0;
      goto LAB_180b23a16;
    }
    bVar16 = puVar19[uVar21 + 0x40];
    cVar5 = (char)uVar21;
    uVar14 = *(uint *)(puVar19 + 0x34);
code_r0x000180b230f0:
    if (uVar21 < uVar17) {
      puVar18 = (undefined1 *)((longlong)register0x00000020 + 0x1543f3c);
      goto code_r0x000180b23935;
    }
    iVar7 = (int)uVar21;
    uVar24 = uVar25;
    if (uVar25 + 1 <= uVar17) {
      if (uVar17 == uVar25 + 1) {
        bVar6 = cVar5 + 0xc;
        uVar22 = (ulonglong)
                 CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),(char)(iVar7 + (uint)bVar16) + -0x48);
        goto code_r0x000180b238c4;
      }
      if (uVar17 == uVar25 + 3) {
        bVar6 = cVar5 + 0x1c;
        cVar27 = bVar16 + 0x58;
        goto code_r0x000180b2384d;
      }
      if (uVar17 == uVar25 + 2) goto code_r0x000180b23820;
      if (uVar17 != uVar25 + 5) {
        if (uVar17 != uVar25 + 8) goto code_r0x000180b23160;
        bVar6 = bVar16 & cVar5 + 0x4cU;
        cVar27 = bVar16 + 0x38;
        goto code_r0x000180b237cf;
      }
      *(uint *)(puVar19 + 0x34) =
           CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                    (char)(iVar7 + (uint)bVar16) + -0x68 + (cVar5 + 0x3cU & bVar16) * -2);
      goto code_r0x000180b23093;
    }
    iVar13 = (uint)(cVar5 + 4U & bVar16) * 0xfe;
    uVar14 = CONCAT31((int3)((uint)iVar13 >> 8),(char)iVar13 + -0x1c + cVar5 + 4U + bVar16);
    *(uint *)(puVar19 + 0x34) = uVar14;
code_r0x000180b23160:
    if (uVar21 < uVar24) {
      puVar18 = (undefined1 *)((longlong)register0x00000020 + 0x1658438);
      goto code_r0x000180b23935;
    }
    uVar25 = uVar24;
    if (uVar24 + 1 <= uVar17) {
      if (uVar17 != uVar24 + 1) {
        if (uVar17 != uVar24 + 3) {
          if (uVar17 == uVar24 + 2) {
            bVar6 = bVar16 & cVar5 + 0x74U;
            cVar27 = bVar16 + 0x48;
            goto code_r0x000180b23754;
          }
          if (uVar17 != uVar24 + 5) {
            if (uVar17 != uVar24 + 8) goto code_r0x000180b231d0;
            uVar14 = (uint)(byte)(bVar16 + 0x58 + cVar5 + (bVar16 & cVar5 + 0x9cU) * -2);
            goto code_r0x000180b238ca;
          }
          bVar6 = bVar16 & cVar5 + 0x8cU;
          cVar27 = bVar16 + 0xb8;
          goto code_r0x000180b2384f;
        }
        *(uint *)(puVar19 + 0x34) =
             (uint)(byte)(bVar16 + 0x78 + cVar5 + (bVar16 & cVar5 + 0x6cU) * -2);
        goto code_r0x000180b23093;
      }
      bVar6 = bVar16 & cVar5 + 0x5cU;
      cVar27 = bVar16 - 0x28;
      goto code_r0x000180b237cf;
    }
    bVar6 = bVar16 + 0xb4 + cVar5 + 0x54U + (bVar16 & cVar5 + 0x54U) * -2;
    uVar14 = (uint)bVar6;
    *(uint *)(puVar19 + 0x34) = (uint)bVar6;
code_r0x000180b231d0:
    while( true ) {
      bVar6 = (byte)uVar14;
      if (uVar25 + uVar17 <= uVar21) break;
      while( true ) {
        do {
          if (uVar17 == uVar25 + 0x1000) {
            bVar6 = bVar16 & cVar5 + 0xb8U;
            cVar27 = bVar16 + 0xb0;
            goto code_r0x000180b237cf;
          }
          if (uVar17 == uVar25 + 0x2a) {
            *(uint *)(puVar19 + 0x34) =
                 (uint)(byte)(bVar16 + 0x80 + cVar5 + (bVar16 & cVar5 - 0x40U) * -2);
            uVar25 = uVar25 + 1;
            goto code_r0x000180b23093;
          }
          if (uVar17 == uVar25 + 5) {
            *(uint *)(puVar19 + 0x34) =
                 (uint)(byte)(bVar16 + 0x50 + cVar5 + (bVar16 & cVar5 - 0x38U) * -2);
            goto code_r0x000180b23093;
          }
          if (uVar17 == uVar25 + 0x10) {
            bVar6 = bVar16 & cVar5 - 0x30U;
            cVar27 = bVar16 + 0x20;
            uVar24 = uVar25;
            goto code_r0x000180b23754;
          }
          if (uVar17 == uVar25 + 100) {
            bVar16 = (bVar16 - 0x10) + cVar5 + (bVar16 & cVar5 - 0x28U) * -2;
            *(uint *)(puVar19 + 0x34) = (uint)bVar16;
            uVar17 = uVar17 + uVar25;
            uVar21 = uVar21 - bVar16;
            goto code_r0x000180b23093;
          }
        } while (uVar17 == uVar25 + 0x5a);
        uVar22 = uVar25 + 0x42;
        uVar23 = (undefined7)(uVar21 >> 8);
        if (uVar22 < uVar25 + 0x446) {
          iVar7 = (uint)bVar16 + (int)CONCAT71(uVar23,cVar5 + 0xcU);
          *(uint *)(puVar19 + 0x34) =
               CONCAT31((int3)((uint)iVar7 >> 8),(char)iVar7 + -0x54 + (bVar16 & cVar5 + 0xcU) * -2)
          ;
          goto code_r0x000180b23076;
        }
        uVar24 = uVar25 + 0x46;
        if (uVar22 < uVar25 + 0xa0) {
          iVar7 = (uint)bVar16 + (int)CONCAT71(uVar23,cVar5 + 0x14U);
          *(uint *)(puVar19 + 0x34) =
               CONCAT31((int3)((uint)iVar7 >> 8),(char)iVar7 + 't' + (bVar16 & cVar5 + 0x14U) * -2);
          uVar17 = uVar22;
          goto code_r0x000180b23090;
        }
        uVar17 = uVar25 + 0x4a;
        if (uVar22 < uVar17) {
          bVar6 = bVar16 + 0x3c + cVar5 + 0x1cU + (cVar5 + 0x1cU & bVar16) * -2;
          uVar14 = (uint)bVar6;
          *(uint *)(puVar19 + 0x34) = (uint)bVar6;
          uVar17 = uVar22;
          uVar25 = uVar24;
          goto code_r0x000180b230f0;
        }
        if (uVar22 < uVar25 + 0x50) {
          bVar6 = bVar16 + 4 + cVar5 + 0x24U + (cVar5 + 0x24U & bVar16) * -2;
          uVar14 = (uint)bVar6;
          *(uint *)(puVar19 + 0x34) = (uint)bVar6;
          uVar17 = uVar22;
          goto code_r0x000180b23160;
        }
        if (uVar22 < uVar25 + 0x88) break;
        uVar24 = uVar25 + 0x44a;
        if (uVar25 + 0x454 < uVar17) {
          bVar6 = cVar5 + 0x60;
          uVar22 = (ulonglong)
                   CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),(char)(iVar7 + (uint)bVar16) + -0x40);
          uVar25 = uVar24;
          goto code_r0x000180b238c4;
        }
        if (uVar25 + 0x48c < uVar17) {
          *(uint *)(puVar19 + 0x34) =
               (uint)(byte)(bVar16 + 0x90 + cVar5 + (bVar16 & cVar5 + 0x68U) * -2);
          uVar25 = uVar24;
          goto code_r0x000180b23881;
        }
        uVar22 = uVar25 + 0x84a;
        if (uVar22 < uVar17) {
          bVar6 = bVar16 & cVar5 + 0x70U;
          cVar27 = bVar16 + 0x60;
          goto code_r0x000180b2384f;
        }
        if (uVar25 + 0x4a4 < uVar17) {
          bVar16 = bVar16 + 0x30 + cVar5 + (bVar16 & cVar5 + 0x78U) * -2;
          *(uint *)(puVar19 + 0x34) = (uint)bVar16;
          uVar21 = uVar21 - bVar16;
          uVar25 = uVar24;
          goto code_r0x000180b23093;
        }
        if (uVar25 + 0x44e < uVar17) {
          bVar16 = bVar16 + cVar5 + (bVar16 & cVar5 + 0x80U) * -2;
          *(uint *)(puVar19 + 0x34) = (uint)bVar16;
          uVar17 = uVar17 + uVar24;
          uVar21 = uVar21 - bVar16;
          uVar25 = uVar24;
          goto code_r0x000180b23093;
        }
        uVar25 = uVar25 + 0x854;
        uVar17 = uVar22;
      }
      bVar6 = (bVar16 - 0x34) + cVar5 + 0x2cU + (cVar5 + 0x2cU & bVar16) * -2;
      uVar14 = (uint)bVar6;
      *(uint *)(puVar19 + 0x34) = (uint)bVar6;
      uVar17 = uVar22;
      uVar25 = uVar24;
    }
    uVar22 = uVar25 + 1;
    uVar24 = uVar25;
    if (uVar17 < uVar22) {
      bVar6 = (bVar16 - 0x18) + cVar5 + (bVar16 & cVar5 + 4U) * -2;
      *(uint *)(puVar19 + 0x34) = (uint)bVar6;
code_r0x000180b234a0:
      if (uVar25 + uVar17 != 0x20) {
        if (uVar22 < uVar17) {
          bVar6 = bVar16 + 0x48 + cVar5 + (bVar16 & cVar5 - 0xcU) * -2;
          *(uint *)(puVar19 + 0x34) = (uint)bVar6;
code_r0x000180b234d1:
          if (uVar17 < 0x10) {
            if (uVar25 + 0x2a < uVar17) {
              bVar6 = bVar16 + 0x50 + cVar5 + (bVar16 & cVar5 + 0x48U) * -2;
              *(uint *)(puVar19 + 0x34) = (uint)bVar6;
            }
            else {
              if (uVar17 == uVar22) {
                uVar14 = (uint)(byte)(bVar16 + 0x20 + cVar5 + (bVar16 & cVar5 + 0x50U) * -2);
                goto code_r0x000180b238ca;
              }
              if (uVar17 == uVar25 + 2) {
                bVar6 = cVar5 + 0x60;
                cVar27 = bVar16 - 0x40;
code_r0x000180b2384d:
                bVar6 = bVar6 & bVar16;
code_r0x000180b2384f:
                bVar6 = cVar27 + cVar5 + bVar6 * -2;
                uVar25 = uVar24;
                goto code_r0x000180b23856;
              }
              if (uVar17 == uVar25 + 3) {
                uVar14 = CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                  (char)(iVar7 + (uint)bVar16) + '`' + (cVar5 + 0x70U & bVar16) * -2
                                 );
                *(uint *)(puVar19 + 0x34) = uVar14;
                uVar17 = uVar17 + uVar25;
                uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
                goto code_r0x000180b23093;
              }
              if (uVar17 == uVar25 + 6) {
                bVar6 = cVar5 + 0x78U & bVar16;
                cVar27 = bVar16 + 0x30;
                goto code_r0x000180b23754;
              }
              if (uVar17 == uVar25 + 5) {
                *(uint *)(puVar19 + 0x34) =
                     CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                              (char)(iVar7 + (uint)bVar16) + -0x30 + (cVar5 + 0x88U & bVar16) * -2);
                uVar25 = uVar25 + 1;
                goto code_r0x000180b23093;
              }
            }
            if (uVar25 < 0x2a) {
              puVar19[uVar21 + 0x40] = bVar6;
              uVar21 = uVar21 + 1;
            }
            else {
              uVar14 = CONCAT31((int3)(bVar16 + 0x70 >> 8),
                                (char)(bVar16 + 0x70) + cVar5 + (bVar16 & cVar5 + 0x98U) * -2) * 2;
code_r0x000180b237d9:
              puVar19[uVar21 + 0x40] = bVar16 + 0x58 + (cVar5 + 0x9cU & bVar16) * -2 + cVar5;
              *(uint *)(puVar19 + 0x34) = uVar14;
              uVar25 = uVar25 + 1;
            }
            goto code_r0x000180b23093;
          }
          uVar14 = (uint)bVar16 +
                   CONCAT31((int3)(bVar16 + 0x40 >> 8),
                            (char)(bVar16 + 0x40) + cVar5 + (bVar16 & cVar5 + 0xa0U) * -2);
        }
        else {
          if (uVar17 == uVar22) {
            bVar6 = bVar16 & cVar5 - 4U;
            cVar27 = bVar16 + 0x18;
code_r0x000180b237cf:
            uVar14 = (uint)(byte)(cVar27 + cVar5 + bVar6 * -2);
            goto code_r0x000180b237d9;
          }
          if (uVar17 != uVar25 + 2) {
            if (uVar17 == uVar25 + 5) {
code_r0x000180b23820:
              uVar3 = (undefined3)(iVar7 + (uint)bVar16 >> 8);
              cVar27 = (char)(iVar7 + (uint)bVar16) + '(';
              bVar6 = cVar5 + 0x24;
              goto code_r0x000180b2382b;
            }
            if (uVar17 == uVar25 + 3) {
              *(uint *)(puVar19 + 0x34) =
                   (uint)(byte)((bVar16 - 0x38) + cVar5 + (cVar5 + 0x34U & bVar16) * -2);
              goto code_r0x000180b23881;
            }
            if (uVar17 == uVar25 + 6) {
              bVar6 = cVar5 + 0x3c;
              uVar22 = (ulonglong)
                       CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                                (char)(iVar7 + (uint)bVar16) + -0x68);
code_r0x000180b238c4:
              uVar14 = (uint)CONCAT71((int7)(uVar22 >> 8),(char)uVar22 + (bVar6 & bVar16) * -2);
              uVar24 = uVar25;
              goto code_r0x000180b238ca;
            }
            goto code_r0x000180b234d1;
          }
          bVar6 = cVar5 + 0x14U & bVar16;
          cVar27 = bVar16 + 0x88;
code_r0x000180b23754:
          uVar14 = (uint)(byte)(cVar27 + cVar5 + bVar6 * -2);
          uVar25 = uVar24;
        }
        puVar19[uVar21 + 0x40] =
             bVar16 + 0x28 + (cVar5 + 0xa4U & bVar16) * -2 + cVar5 + (char)uVar14;
        *(uint *)(puVar19 + 0x34) = uVar14;
        uVar17 = uVar17 + uVar25;
        uVar21 = uVar21 - (uVar14 & 0xff);
        goto code_r0x000180b23093;
      }
      bVar6 = cVar5 + '\x10' + (bVar16 & cVar5 + 0xa8U) * -2;
code_r0x000180b23856:
      *(uint *)(puVar19 + 0x34) = (uint)bVar6;
      bVar6 = (bVar16 - 8) + (cVar5 + 0xacU & bVar16) * -2 + cVar5;
      puVar19[uVar21 + 0x40] = bVar6;
      uVar21 = (uVar21 - (uVar25 + 1)) - (ulonglong)bVar6;
      uVar25 = uVar25 + 1;
    }
    else {
      if (uVar17 == uVar22) {
        uVar14 = (uint)(byte)(bVar16 + 0x10 + cVar5 + (bVar16 & cVar5 + 0xa8U) * -2);
code_r0x000180b238ca:
        *(uint *)(puVar19 + 0x34) = uVar14;
        uVar21 = uVar21 + (byte)puVar19[uVar21 + 0x40] + uVar24 + 1;
        uVar25 = uVar24;
        goto code_r0x000180b23093;
      }
      if (uVar17 != uVar25 + 2) {
        if (uVar17 == uVar25 + 3) {
          bVar6 = cVar5 - 0x40;
          uVar3 = (undefined3)(iVar7 + (uint)bVar16 >> 8);
          cVar27 = (char)(iVar7 + (uint)bVar16) + -0x80;
code_r0x000180b2382b:
          uVar14 = CONCAT31(uVar3,cVar27 + (bVar6 & bVar16) * -2);
          *(uint *)(puVar19 + 0x34) = uVar14;
          uVar21 = uVar21 - ((ulonglong)uVar14 & 0xff);
        }
        else {
          if (uVar17 != uVar25 + 7) goto code_r0x000180b234a0;
          *(uint *)(puVar19 + 0x34) =
               CONCAT31((int3)(iVar7 + (uint)bVar16 >> 8),
                        (char)(iVar7 + (uint)bVar16) + -0x10 + (cVar5 - 0x28U & bVar16) * -2);
        }
        goto code_r0x000180b23093;
      }
      *(uint *)(puVar19 + 0x34) =
           (uint)(byte)((bVar16 - 0x20) + cVar5 + (cVar5 + 0xb0U & bVar16) * -2);
    }
code_r0x000180b23881:
    puVar19[uVar21 + 0x40] = (char)uVar21 + -0x20 + bVar16 + ((char)uVar21 + 0xb0U & bVar16) * -2;
    uVar17 = uVar17 + 1;
    uVar21 = uVar21 + ~uVar17 + (byte)puVar19[uVar21 + ~uVar17 + 0x40] + uVar25 + 1;
    goto code_r0x000180b23093;
  }
  goto code_r0x000180b224a0;
code_r0x000180b2257d:
  bVar16 = *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30));
  cVar5 = (char)uVar22;
code_r0x000180b225c4:
  if (uVar22 < uVar25) {
    puVar9 = (ulonglong *)((longlong)register0x00000020 + 0x102c6e3);
    goto code_r0x000180b23007;
  }
  if (uVar21 + 1 <= uVar25) {
    if (uVar25 == uVar21 + 1) {
      bVar26 = cVar5 + bVar16 + 'B' + (bVar16 & cVar5 - 0xbU) * -2;
      uVar22 = uVar22 + *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) + uVar21 + 1;
    }
    else if (uVar25 == uVar21 + 3) {
      bVar26 = cVar5 + 0x2d;
      cVar5 = cVar5 + bVar16 + -0xe;
code_r0x000180b22f70:
      bVar26 = cVar5 + (bVar16 & bVar26) * -2;
      uVar25 = uVar25 + uVar21;
      uVar22 = uVar22 - bVar26;
    }
    else {
      if (uVar25 != uVar21 + 2) {
        if (uVar25 != uVar21 + 9) goto code_r0x000180b22620;
        bVar26 = cVar5 + 0x65;
        cVar27 = bVar16 + 0xa2;
code_r0x000180b22f11:
        bVar26 = bVar16 & bVar26;
        goto code_r0x000180b22f16;
      }
      bVar26 = cVar5 + bVar16 + 'v' + (bVar16 & cVar5 + 0x17U) * -2;
      uVar21 = uVar21 + 1;
    }
    goto code_r0x000180b22573;
  }
  bVar26 = (cVar5 + 0xa7U & bVar16) * -2 + 'o' + cVar5 + 0xa7U + bVar16;
code_r0x000180b22620:
  if (uVar22 < uVar21) {
    puVar9 = (ulonglong *)((longlong)register0x00000020 + 0x17f6e3c);
    goto code_r0x000180b23007;
  }
  if (uVar21 + 1000 <= uVar25) {
    if (uVar25 != uVar21 + 1) {
      if (uVar25 != uVar21 + 3) {
        if (uVar25 == uVar21 + 4) {
          bVar26 = cVar5 - 0x15;
          cVar27 = bVar16 + 0x7e;
code_r0x000180b22e9f:
          bVar26 = bVar16 & bVar26;
          goto code_r0x000180b22ea4;
        }
        if (uVar25 != uVar21 + 2) {
          if (uVar25 != uVar21 + 5) goto code_r0x000180b22690;
          bVar26 = cVar5 - 0x2b;
          cVar27 = bVar16 + 2;
          goto code_r0x000180b22e28;
        }
        bVar26 = cVar5 + 0x39;
        cVar5 = cVar5 + bVar16 + -0x56;
        goto code_r0x000180b22f70;
      }
      bVar26 = cVar5 + bVar16 + 'R' + (bVar16 & cVar5 + 0x9dU) * -2;
      goto code_r0x000180b22573;
    }
    bVar26 = cVar5 + 1;
    cVar27 = bVar16 - 6;
    goto code_r0x000180b22f11;
  }
  bVar26 = bVar16 + 0x1b + cVar5 + 0xb3U + (cVar5 + 0xb3U & bVar16) * -2;
code_r0x000180b22690:
  while (uVar24 = uVar21, uVar22 < uVar21 + uVar25) {
    while( true ) {
      do {
        uVar21 = uVar24;
        if (uVar25 == uVar21 + 0x41) {
          bVar26 = cVar5 - 0x3e;
          cVar27 = bVar16 + 0x74;
          goto code_r0x000180b22f11;
        }
        if (uVar25 == uVar21 + 10) {
          bVar26 = cVar5 + bVar16 + -0x60 + (bVar16 & cVar5 + 0x10U) * -2;
          uVar21 = uVar21 + 1;
          goto code_r0x000180b22573;
        }
        if (uVar25 == uVar21 + 0x1000) {
          bVar26 = cVar5 + bVar16 + -0x34 + (bVar16 & cVar5 + 0x5eU) * -2;
          goto code_r0x000180b22573;
        }
        uVar17 = uVar21 + 0x7a;
        if (uVar25 == uVar17) {
          bVar26 = cVar5 + 0xac;
          cVar27 = bVar16 - 8;
          goto code_r0x000180b22e9f;
        }
        if (uVar25 == uVar21 + 9) {
          bVar26 = cVar5 - 6;
          cVar5 = cVar5 + bVar16 + '$';
          goto code_r0x000180b22f70;
        }
        if (uVar25 == uVar21 + 0x400) {
          bVar26 = cVar5 + bVar16 + 'P' + (bVar16 & cVar5 + 0x48U) * -2;
          uVar22 = uVar22 - bVar26;
          goto code_r0x000180b22573;
        }
        if (uVar25 == uVar21 + 5) {
          bVar26 = cVar5 + 0x96;
          cVar27 = bVar16 + 0x7c;
          goto code_r0x000180b22e28;
        }
        if (uVar25 == uVar21 + 0x80) {
          bVar26 = bVar16 + 0xa8 + cVar5 + (bVar16 & cVar5 - 0x1cU) * -2;
          goto code_r0x000180b22e51;
        }
        if (uVar25 == uVar21 + 2) {
          bVar26 = cVar5 + bVar16 + -0x2c + (cVar5 + 0x32U & bVar16) * -2;
          uVar22 = uVar22 + *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) + uVar21 + 1;
          goto code_r0x000180b22573;
        }
        uVar24 = uVar21;
      } while (uVar25 == uVar21 + 4);
      if (uVar17 < uVar21 + 0xe7) {
        bVar26 = bVar16 + cVar5 + 0x75U + -0x33 + (bVar16 & cVar5 + 0x75U) * -2;
        goto code_r0x000180b22560;
      }
      uVar24 = uVar21 + 0xde;
      if (uVar17 < uVar21 + 0x4de) {
        bVar26 = bVar16 + (cVar5 - 0x3dU) + -0x55 + (bVar16 & cVar5 - 0x3dU) * -2;
        goto code_r0x000180b22570;
      }
      uVar25 = uVar17;
      if (uVar17 < uVar21 + 0xe3) {
        bVar26 = bVar16 + 0x89 + cVar5 + 0x11U + (bVar16 & cVar5 + 0x11U) * -2;
        uVar21 = uVar24;
        goto code_r0x000180b225c4;
      }
      uVar1 = uVar21 + 0x15e;
      if (uVar17 < uVar1) {
        bVar26 = bVar16 + 0x67 + cVar5 + 0x5fU + (cVar5 + 0x5fU & bVar16) * -2;
        uVar21 = uVar24;
        goto code_r0x000180b22620;
      }
      if (uVar17 < uVar21 + 0x4c6) break;
      if (uVar17 < uVar21 + 0xe2) {
        bVar26 = cVar5 - 5;
        cVar27 = bVar16 + 0x1e;
        uVar21 = uVar24;
        goto code_r0x000180b22a64;
      }
      if (uVar17 < uVar21 + 0x142) {
        bVar26 = cVar5 + 0x49;
        cVar27 = bVar16 + 0x4a;
        uVar21 = uVar24;
        goto code_r0x000180b22a2d;
      }
      if (uVar17 < uVar21 + 0xdf) {
        bVar26 = cVar5 + 0x97;
        cVar27 = bVar16 + 0x76;
        uVar21 = uVar24;
        goto code_r0x000180b229f9;
      }
      if (uVar17 < uVar21 + 0x106) {
        bVar26 = cVar5 + bVar16 + -0x5e + (cVar5 - 0x1bU & bVar16) * -2;
        uVar21 = uVar24;
        goto code_r0x000180b229e0;
      }
      if (uVar21 + 0x11f <= uVar17) {
        uVar24 = uVar21 + 0x188;
        uVar25 = uVar1;
        if (uVar21 + 0x570 < uVar1) {
          bVar26 = cVar5 + bVar16 + '\x10' + (cVar5 + 0x28U & bVar16) * -2;
          uVar22 = uVar22 + *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) + uVar24 + 1;
          uVar21 = uVar24;
          goto code_r0x000180b22573;
        }
        if (uVar21 + 0x18c < uVar1) {
          bVar26 = bVar16 + 0x3c + cVar5 + (cVar5 + 0x76U & bVar16) * -2;
          uVar21 = uVar24;
          goto code_r0x000180b22e51;
        }
        if (uVar21 + 0x1ec < uVar1) {
          bVar26 = cVar5 - 0x3c;
          cVar27 = bVar16 + 0x68;
          uVar21 = uVar24;
          goto code_r0x000180b22e28;
        }
        if (uVar21 + 0x189 < uVar1) {
          bVar26 = cVar5 + bVar16 + -0x6c + (cVar5 + 0x12U & bVar16) * -2;
          uVar22 = uVar22 - bVar26;
          uVar21 = uVar24;
          goto code_r0x000180b22573;
        }
        if (uVar21 + 0x1b0 < uVar1) {
          bVar26 = cVar5 + bVar16 + -0x40 + (cVar5 + 0x60U & bVar16) * -2;
          uVar22 = uVar22 - bVar26;
          uVar25 = uVar1 + uVar24;
          uVar21 = uVar24;
          goto code_r0x000180b22573;
        }
        if (uVar21 + 0x1ca < uVar1) {
          bVar26 = cVar5 + 0xaeU & bVar16;
          cVar27 = bVar16 - 0x14;
          uVar21 = uVar24;
          goto code_r0x000180b22ea4;
        }
        if (uVar21 + 0x1b2 < uVar1) {
          bVar26 = cVar5 + bVar16 + '\x18' + (cVar5 - 4U & bVar16) * -2;
          uVar21 = uVar24;
          goto code_r0x000180b22573;
        }
        if (uVar21 + 0x1a8 < uVar1) {
          bVar26 = cVar5 + bVar16 + 'D' + (cVar5 + 0x4aU & bVar16) * -2;
          uVar21 = uVar21 + 0x189;
          goto code_r0x000180b22573;
        }
        if (uVar21 + 0x202 < uVar1) {
          bVar26 = cVar5 + 0x98U & bVar16;
          cVar27 = bVar16 + 0x70;
          uVar21 = uVar24;
          goto code_r0x000180b22f16;
        }
        if (uVar1 <= uVar21 + 0x191) {
          uVar25 = uVar21 + 0x189;
          uVar24 = uVar21 + 0x589;
        }
      }
    }
    bVar26 = bVar16 + 0x45 + cVar5 + 0xadU + (cVar5 + 0xadU & bVar16) * -2;
    uVar21 = uVar24;
  }
  if (uVar21 + 0x10 <= uVar25) {
    if (uVar25 == uVar21 + 1) {
      bVar26 = cVar5 + bVar16 + -100 + (cVar5 + 0x66U & bVar16) * -2;
      uVar22 = uVar22 + *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) + uVar21 + 1;
      goto code_r0x000180b22573;
    }
    if (uVar25 == uVar21 + 3) {
      bVar26 = cVar5 + bVar16 + ' ' + (cVar5 + 0x50U & bVar16) * -2;
      uVar22 = uVar22 - bVar26;
      goto code_r0x000180b22573;
    }
    if (uVar25 == uVar21 + 5) {
      bVar26 = cVar5 + bVar16 + 'L' + (cVar5 + 0x9eU & bVar16) * -2;
      uVar25 = uVar25 + uVar21;
      uVar22 = uVar22 - bVar26;
      goto code_r0x000180b22573;
    }
    if (uVar25 == uVar21 + 2) {
      bVar26 = cVar5 + bVar16 + -0x30 + (cVar5 + 0x88U & bVar16) * -2;
      uVar21 = uVar21 + 1;
      goto code_r0x000180b22573;
    }
    if (uVar25 != uVar21 + 9) goto code_r0x000180b22a6a;
    bVar26 = cVar5 - 0x2aU & bVar16;
    cVar27 = bVar16 - 4;
code_r0x000180b22f16:
    bVar26 = cVar27 + cVar5 + bVar26 * -2;
    goto code_r0x000180b22f1e;
  }
  bVar26 = cVar5 + 0xa7;
  cVar27 = bVar16 + 0x16;
code_r0x000180b22a64:
  bVar26 = cVar27 + cVar5 + (bVar26 & bVar16) * -2;
code_r0x000180b22a6a:
  if (uVar21 + uVar25 == 10) {
    bVar26 = cVar5 + 0x26;
    cVar27 = cVar5 + '\x1c';
code_r0x000180b22e2b:
    bVar26 = cVar27 + (bVar16 & bVar26) * -2;
    bVar6 = bVar16 + 0x32 + (cVar5 - 0x33U & bVar16) * -2 + cVar5;
    *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) = bVar6;
    uVar22 = (uVar22 - (uVar21 + 1)) - (ulonglong)bVar6;
    uVar21 = uVar21 + 1;
code_r0x000180b22e51:
    *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) =
         (char)uVar22 + 'H' + bVar16 + ((char)uVar22 + 0x74U & bVar16) * -2;
    lVar8 = uVar22 + ~(uVar25 + 1);
    uVar22 = lVar8 + *(byte *)((longlong)alStack_21c8 + lVar8 + -0x30) + uVar21 + 1;
    uVar25 = uVar25 + 1;
    goto code_r0x000180b22573;
  }
  if (uVar21 + 2 < uVar25) {
    bVar26 = cVar5 - 0x35;
    cVar27 = bVar16 + 0x3e;
code_r0x000180b22a2d:
    bVar26 = cVar27 + cVar5 + (bVar26 & bVar16) * -2;
  }
  else {
    if (uVar25 == uVar21 + 1) {
      bVar26 = cVar5 + 0x19U & bVar16;
      cVar27 = bVar16 + 0x6a;
      goto code_r0x000180b22f16;
    }
    if (uVar25 == uVar21 + 2) {
      bVar26 = cVar5 + bVar16 + -0x3e + (cVar5 + 0xb5U & bVar16) * -2;
      goto code_r0x000180b22573;
    }
    if (uVar25 == uVar21 + 5) {
      bVar26 = cVar5 + bVar16 + 'F' + (cVar5 + 0x9fU & bVar16) * -2;
      uVar22 = uVar22 - bVar26;
      goto code_r0x000180b22573;
    }
    if (uVar25 == uVar21 + 7) {
      bVar26 = bVar16 + 0x9e + cVar5 + (cVar5 + 0x3bU & bVar16) * -2;
      goto code_r0x000180b22e51;
    }
    if (uVar25 == uVar21 + 9) {
      bVar26 = cVar5 + bVar16 + -0x36 + (cVar5 + 0x89U & bVar16) * -2;
      uVar22 = uVar22 + *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) + uVar21 + 1;
      goto code_r0x000180b22573;
    }
  }
  if (2 < uVar25) {
    bVar26 = bVar16 * '\x02' + cVar5 + (cVar5 - 0x28U & bVar16) * -2 + -0x10;
code_r0x000180b22eac:
    *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) =
         bVar16 + 6 + (cVar5 + 0x7fU & bVar16) * -2 + cVar5 + bVar26;
    uVar22 = uVar22 - bVar26;
    uVar25 = uVar25 + uVar21;
    goto code_r0x000180b22573;
  }
  if (uVar21 + 0x28 < uVar25) {
    bVar26 = cVar5 + 0x7e;
    cVar27 = bVar16 + 0xc;
code_r0x000180b229f9:
    bVar26 = cVar27 + cVar5 + (bVar26 & bVar16) * -2;
  }
  else {
    if (uVar25 == uVar21 + 1) {
      bVar26 = cVar5 + bVar16 + '8' + (cVar5 - 0x34U & bVar16) * -2;
      uVar22 = uVar22 + *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) + uVar21 + 1;
      goto code_r0x000180b22573;
    }
    if (uVar25 == uVar21 + 2) {
      bVar26 = cVar5 + 0x68;
      cVar27 = bVar16 + 0x90;
code_r0x000180b22e28:
      cVar27 = cVar27 + cVar5;
      goto code_r0x000180b22e2b;
    }
    if (uVar25 == uVar21 + 3) {
      bVar26 = cVar5 + bVar16 + -0x44 + (cVar5 + 0xb6U & bVar16) * -2;
      uVar22 = uVar22 - bVar26;
      goto code_r0x000180b22573;
    }
    if (uVar25 == uVar21 + 5) {
      bVar26 = cVar5 + 0x52U & bVar16;
      cVar27 = bVar16 + 0x14;
code_r0x000180b22ea4:
      bVar26 = cVar27 + cVar5 + bVar26 * -2;
      goto code_r0x000180b22eac;
    }
    if (uVar25 == uVar21 + 6) {
      bVar26 = cVar5 + bVar16 + '@' + (cVar5 + 0xa0U & bVar16) * -2;
      goto code_r0x000180b22573;
    }
  }
  if (uVar21 < 0x40) {
code_r0x000180b229e0:
    *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) = bVar26;
    uVar22 = uVar22 + 1;
    goto code_r0x000180b22573;
  }
  bVar26 = ((bVar16 - 0x3c) + cVar5 + (cVar5 + 0x8aU & bVar16) * -2) * '\x02';
code_r0x000180b22f1e:
  *(byte *)((longlong)alStack_21c8 + (uVar22 - 0x30)) =
       (bVar16 - 0x26) + (cVar5 + 0x31U & bVar16) * -2 + cVar5;
  uVar21 = uVar21 + 1;
  goto code_r0x000180b22573;
}

