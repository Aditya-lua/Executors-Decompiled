
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00498a50(undefined8 param_1,int param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  ulong uVar4;
  code *pcVar5;
  long lVar6;
  long lVar7;
  char cVar8;
  int iVar9;
  long *plVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  long lVar13;
  long lVar14;
  long *unaff_x22;
  ulong uVar15;
  long *unaff_x24;
  long unaff_x25;
  long *plVar16;
  ulong unaff_x27;
  long unaff_x29;
  undefined8 uVar17;
  long lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  undefined1 uStack000000000000001f;
  undefined8 uStack0000000000000020;
  long *in_stack_00000028;
  long *in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined1 *in_stack_00000070;
  undefined *in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined1 *in_stack_00000090;
  undefined *in_stack_00000098;
  undefined1 uStack00000000000000a0;
  undefined1 uStack00000000000000c0;
  undefined1 uStack00000000000000d8;
  undefined1 uStack00000000000000f0;
  undefined1 uStack0000000000000110;
  undefined1 in_stack_00000168;
  undefined1 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 uStack00000000000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined1 uStack00000000000001e0;
  
  if (((param_2 == 0) || (cVar8 = func_0x007b1274(0xa2a680), cVar8 == '\0')) ||
     (iVar9 = func_0x005e7964(lRam0000000000a2a680), lVar7 = lRam0000000000a2a680, iVar9 == 0)) {
    unaff_x24[0x1a] = 2;
    unaff_x24[0x1e] = 0;
code_r0x004981ac:
    in_stack_00000028 = (long *)unaff_x24[0x1b];
    uStack0000000000000020 = (undefined8 *)unaff_x24[0x1a];
    uStack0000000000000038 = unaff_x24[0x1d];
    in_stack_00000030 = (long *)unaff_x24[0x1c];
    in_stack_00000040 = unaff_x24[0x1e];
    if (uStack0000000000000020 != (undefined8 *)0x2) {
      func_0x005ec344(&uStack0000000000000020,&uStack0000000000000038);
    }
    func_0x004bab5c(&uStack0000000000000110);
    puVar12 = *(undefined1 **)(unaff_x25 + 0x88);
    if (puVar12 == (undefined1 *)0x8000000000000001) {
      lVar7 = *(long *)(unaff_x25 + 0x90);
      unaff_x24[0x1b] = *(long *)(unaff_x25 + 0x98);
      unaff_x24[0x1a] = lVar7;
      unaff_x24[0x1c] = *(long *)(unaff_x25 + 0xa0);
      func_0x007a2810(&UNK_0089ef3a,0x2b,&uStack00000000000001e0,&UNK_009e2160,&UNK_009e2228);
    }
    else {
      in_stack_00000078 = *(undefined **)(unaff_x25 + 0x98);
      in_stack_00000070 = *(undefined1 **)(unaff_x25 + 0x90);
      in_stack_00000080 = *(long *)(unaff_x25 + 0xa0);
      in_stack_00000058 = *(undefined8 *)(unaff_x25 + 0xb0);
      in_stack_00000050 = *(undefined8 *)(unaff_x25 + 0xa8);
      in_stack_00000060 = *(undefined8 *)(unaff_x25 + 0xb8);
      if (puVar12 == (undefined1 *)0x8000000000000000) {
        unaff_x22[1] = (long)in_stack_00000078;
        *unaff_x22 = (long)in_stack_00000070;
        unaff_x22[2] = in_stack_00000080;
code_r0x00498940:
        if (((unaff_x27 < 3) && (uStack0000000000000020 != (undefined8 *)0x2)) &&
           ((func_0x005ec378(&uStack0000000000000020,&uStack0000000000000038),
            lVar7 = (long)uStack0000000000000020, uStack0000000000000020 != (undefined8 *)0x2 &&
            (func_0x005ec3ac(&uStack0000000000000020,uStack0000000000000038), lVar7 != 0)))) {
          lVar7 = *in_stack_00000028;
          *in_stack_00000028 = lVar7 + -1;
          LORelease();
          if (lVar7 == 1) {
            DataMemoryBarrier(2,1);
            func_0x005e80f0((ulong)&uStack0000000000000020 | 8);
          }
        }
        return;
      }
      *(long *)(unaff_x25 + 0x18) = in_stack_00000080;
      *(undefined8 *)(unaff_x25 + 0x28) = in_stack_00000058;
      *(undefined8 *)(unaff_x25 + 0x20) = in_stack_00000050;
      *(undefined8 *)(unaff_x25 + 0x30) = in_stack_00000060;
      *(undefined8 *)(unaff_x25 + 0x38) = 0;
      *(undefined8 *)(unaff_x25 + 0x40) = 8;
      *(undefined8 *)(unaff_x25 + 0x48) = 0;
      uStack0000000000000088 = puVar12;
      in_stack_00000090 = in_stack_00000070;
      in_stack_00000098 = in_stack_00000078;
      plVar10 = (long *)func_0x00187bd0(0x10,8);
      if (plVar10 == (long *)0x0) {
        func_0x007a1f18(8,0x10);
      }
      else {
        *(undefined8 *)(unaff_x25 + 0x88) = 1;
        *(undefined8 *)(unaff_x25 + 0x90) = 0;
        *(undefined8 *)(unaff_x25 + 0x98) = 0;
        *(undefined8 *)(unaff_x25 + 0xa0) = 8;
        *(undefined8 *)(unaff_x25 + 0xa8) = 0;
        *(undefined8 *)(unaff_x25 + 0xb0) = 0;
        *(undefined8 *)(unaff_x25 + 0xb8) = 8;
        uVar17 = _UNK_007fc110;
        *(undefined8 *)(unaff_x25 + 200) = _UNK_007fc118;
        *(undefined8 *)(unaff_x25 + 0xc0) = uVar17;
        in_stack_00000168 = 0;
        puVar11 = (undefined8 *)func_0x00187bd0(0x60,8);
        if (puVar11 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x60);
        }
        else {
          plVar16 = (long *)(unaff_x29 + -0x98);
          uVar17 = *(undefined8 *)(unaff_x25 + 0xa8);
          uVar20 = *(undefined8 *)(unaff_x25 + 0xc0);
          uVar19 = *(undefined8 *)(unaff_x25 + 0xb8);
          puVar11[5] = *(undefined8 *)(unaff_x25 + 0xb0);
          puVar11[4] = uVar17;
          puVar11[7] = uVar20;
          puVar11[6] = uVar19;
          uVar17 = *(undefined8 *)(unaff_x25 + 200);
          uVar20 = *(undefined8 *)(unaff_x25 + 0xe0);
          uVar19 = *(undefined8 *)(unaff_x25 + 0xd8);
          puVar11[9] = *(undefined8 *)(unaff_x25 + 0xd0);
          puVar11[8] = uVar17;
          puVar11[0xb] = uVar20;
          puVar11[10] = uVar19;
          uVar17 = *(undefined8 *)(unaff_x25 + 0x88);
          uVar20 = *(undefined8 *)(unaff_x25 + 0xa0);
          uVar19 = *(undefined8 *)(unaff_x25 + 0x98);
          puVar11[1] = *(undefined8 *)(unaff_x25 + 0x90);
          *puVar11 = uVar17;
          puVar11[3] = uVar20;
          puVar11[2] = uVar19;
          lVar13 = *(long *)(unaff_x25 + 0x30);
          lVar7 = 1;
          *plVar10 = (long)puVar11;
          plVar10[1] = lVar13;
          *(undefined8 *)(unaff_x25 + 0x50) = 1;
          *(long **)(unaff_x25 + 0x58) = plVar10;
          do {
            *(long *)(unaff_x25 + 0x60) = lVar7 + -1;
            plVar10 = (long *)(*(long *)(unaff_x25 + 0x58) + (lVar7 + -1) * 0x10);
            lVar7 = *plVar10;
            lVar13 = plVar10[1];
            *(long *)(unaff_x29 + -0x80) = lVar7;
            func_0x0047bad8(&uStack0000000000000110,&uStack00000000000000a0,&uStack0000000000000088,
                            lVar13);
            lVar18 = *(long *)(unaff_x25 + 0xe0);
            lVar13 = *(long *)(unaff_x25 + 0xd8);
            lVar14 = *(long *)(unaff_x25 + 0xe8);
            lVar21 = *(long *)(unaff_x25 + 0x100);
            lVar6 = *(long *)(unaff_x25 + 0xf8);
            unaff_x24[0x27] = *(long *)(unaff_x25 + 0xf0);
            unaff_x24[0x26] = lVar14;
            unaff_x24[0x29] = lVar21;
            unaff_x24[0x28] = lVar6;
            unaff_x24[0x2b] = unaff_x24[0x11];
            unaff_x24[0x2a] = unaff_x24[0x10];
            unaff_x24[0x1f] = unaff_x24[5];
            unaff_x24[0x1e] = unaff_x24[4];
            unaff_x24[0x21] = unaff_x24[7];
            unaff_x24[0x20] = unaff_x24[6];
            unaff_x24[0x23] = unaff_x24[9];
            unaff_x24[0x22] = unaff_x24[8];
            unaff_x24[0x25] = lVar18;
            unaff_x24[0x24] = lVar13;
            unaff_x24[0x1b] = unaff_x24[1];
            unaff_x24[0x1a] = *unaff_x24;
            unaff_x24[0x1d] = unaff_x24[3];
            unaff_x24[0x1c] = unaff_x24[2];
            *(undefined8 *)(unaff_x25 + 0x70) = in_stack_000001c0;
            *(undefined8 *)(unaff_x25 + 0x68) = in_stack_000001b8;
            *(undefined8 *)(unaff_x25 + 0x80) = in_stack_000001d0;
            *(undefined8 *)(unaff_x25 + 0x78) = in_stack_000001c8;
            unaff_x24[0x2c] = lVar7;
            lVar7 = *(long *)(unaff_x25 + 0x48);
            if (lVar7 == *(long *)(unaff_x25 + 0x38)) {
              func_0x004ab120(&uStack00000000000000c0,&UNK_009e2240);
            }
            plVar10 = (long *)(*(long *)(unaff_x25 + 0x40) + lVar7 * 0xb0);
            lVar21 = unaff_x24[0x1c];
            lVar18 = unaff_x24[0x1f];
            lVar13 = unaff_x24[0x1e];
            lVar6 = unaff_x24[0x1b];
            lVar14 = unaff_x24[0x1a];
            plVar10[3] = unaff_x24[0x1d];
            plVar10[2] = lVar21;
            plVar10[5] = lVar18;
            plVar10[4] = lVar13;
            lVar13 = unaff_x24[0x24];
            lVar21 = unaff_x24[0x27];
            lVar18 = unaff_x24[0x26];
            lVar25 = unaff_x24[0x21];
            lVar24 = unaff_x24[0x20];
            lVar23 = unaff_x24[0x23];
            lVar22 = unaff_x24[0x22];
            plVar10[0xb] = unaff_x24[0x25];
            plVar10[10] = lVar13;
            plVar10[0xd] = lVar21;
            plVar10[0xc] = lVar18;
            plVar10[7] = lVar25;
            plVar10[6] = lVar24;
            plVar10[9] = lVar23;
            plVar10[8] = lVar22;
            lVar13 = unaff_x24[0x2c];
            lVar21 = unaff_x24[0x2f];
            lVar18 = unaff_x24[0x2e];
            lVar25 = unaff_x24[0x29];
            lVar24 = unaff_x24[0x28];
            lVar23 = unaff_x24[0x2b];
            lVar22 = unaff_x24[0x2a];
            plVar10[0x13] = unaff_x24[0x2d];
            plVar10[0x12] = lVar13;
            plVar10[0x15] = lVar21;
            plVar10[0x14] = lVar18;
            plVar10[0xf] = lVar25;
            plVar10[0xe] = lVar24;
            plVar10[0x11] = lVar23;
            plVar10[0x10] = lVar22;
            plVar10[1] = lVar6;
            *plVar10 = lVar14;
            *(long *)(unaff_x25 + 0x48) = lVar7 + 1;
            plVar10 = *(long **)(unaff_x25 + 0x68);
            lVar7 = *(long *)(unaff_x25 + 0x70);
            lVar13 = *(long *)(unaff_x25 + 0x80);
            unaff_x24[0x32] = (long)(plVar10 + lVar7 * -2 + -2);
            unaff_x24[0x33] = (long)plVar10;
            lVar18 = *plVar10;
            unaff_x24[0x30] = (ulong)(lVar7 != 0) << 3;
            unaff_x24[0x31] = lVar7 * 0x11 + 0x19;
            unaff_x24[0x34] =
                 CONCAT17(-(-1 < lVar18),
                          CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar18 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar18
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar18 >> 8)),-(-1 < (char)lVar18)))))))) &
                 0x8080808080808080;
            unaff_x24[0x35] = (long)(plVar10 + 1);
            unaff_x24[0x36] = (long)plVar10 + lVar7 + 1;
            unaff_x24[0x37] = lVar13;
            func_0x0048bc28(&uStack00000000000000d8,unaff_x29 + -0xf0,&UNK_009e2258);
            lVar7 = *(long *)(unaff_x25 + 0x60);
          } while (lVar7 != 0);
          if (*(long *)(unaff_x25 + 0x48) == 0) {
            func_0x007a23bc(&UNK_009e2270);
          }
          else {
            lVar13 = *(long *)(unaff_x25 + 0x40);
            plVar10 = *(long **)(lVar13 + 0x90);
            lVar7 = *plVar10;
            *plVar10 = lVar7 + 1;
            if (lVar7 < 0) {
              func_0x007a05dc();
            }
            else {
              unaff_x24[0x12] = (long)plVar10;
              lVar7 = *(long *)(lVar13 + 0x80);
              if (*(long *)(lVar13 + 0x60) == -0x8000000000000000) {
                unaff_x24[0x38] = -0x8000000000000000;
              }
              else {
                func_0x0045cd08(unaff_x29 + -0xb0);
              }
              func_0x0048c4ac(unaff_x29 + -0x98,lVar13,&UNK_009e2180);
              uVar3 = *(undefined1 *)(lVar13 + 0x88);
              func_0x0048d344(unaff_x29 + -0x80,lVar13 + 0x18,&UNK_009e5310);
              func_0x0048d5d8(&uStack00000000000000f0,lVar13 + 0x30,&UNK_009e5328);
              unaff_x24[0x1c] = *(long *)(unaff_x29 + -0x70);
              lVar14 = *(long *)(unaff_x29 + -0x78);
              lVar18 = *(long *)(unaff_x29 + -0x80);
              lVar6 = *(long *)(unaff_x25 + 0x68);
              unaff_x24[0x1e] = *(long *)(unaff_x25 + 0x70);
              unaff_x24[0x1d] = lVar6;
              unaff_x24[0x1f] = *(long *)(unaff_x25 + 0x78);
              unaff_x24[4] = lVar14;
              unaff_x24[3] = lVar18;
              unaff_x24[6] = unaff_x24[0x1d];
              unaff_x24[5] = unaff_x24[0x1c];
              unaff_x24[8] = unaff_x24[0x1f];
              unaff_x24[7] = unaff_x24[0x1e];
              uVar1 = *(undefined4 *)(lVar13 + 0x78);
              uVar2 = *(undefined4 *)(lVar13 + 0x7c);
              unaff_x24[0x10] = lVar7;
              unaff_x24[0xe] = unaff_x24[0x3a];
              unaff_x24[0xd] = unaff_x24[0x39];
              unaff_x24[0xc] = unaff_x24[0x38];
              lVar18 = *(long *)(unaff_x29 + -0x90);
              lVar7 = *plVar16;
              unaff_x24[2] = *(long *)(unaff_x29 + -0x88);
              unaff_x24[1] = lVar18;
              *unaff_x24 = lVar7;
              lVar7 = *(long *)(lVar13 + 0x48);
              unaff_x24[10] = *(long *)(lVar13 + 0x50);
              unaff_x24[9] = lVar7;
              unaff_x24[0xb] = *(long *)(lVar13 + 0x58);
              *(undefined4 *)(unaff_x24 + 0xf) = uVar1;
              *(undefined4 *)((long)unaff_x24 + 0x7c) = uVar2;
              in_stack_00000198 = uVar3;
              func_0x0048c4ac(&uStack00000000000001a8,lVar13 + 0x98,&UNK_009e20e8);
              lVar7 = unaff_x24[0x12];
              unaff_x24[0x38] = lVar7;
              func_0x00492f7c(&uStack0000000000000110);
              if (unaff_x24[0x15] != 0) {
                puVar11 = (undefined8 *)unaff_x24[0x14];
                lVar13 = 1 - unaff_x24[0x15];
                do {
                  lVar18 = *(long *)*puVar11;
                  *(long *)*puVar11 = lVar18 + -1;
                  LORelease();
                  if (lVar18 == 1) {
                    func_0x005d2ac4(puVar11);
                  }
                  puVar11 = puVar11 + 1;
                  lVar13 = lVar13 + 1;
                } while (lVar13 != 1);
              }
              if (unaff_x24[0x13] != 0) {
                func_0x00187bd4(unaff_x24[0x14],unaff_x24[0x13] << 3,8);
              }
              lVar13 = *(long *)(unaff_x25 + 0x38);
              lVar18 = *(long *)(unaff_x25 + 0x40);
              lVar14 = *(long *)(unaff_x25 + 0x48);
              *unaff_x24 = lVar18;
              unaff_x24[1] = lVar18;
              unaff_x24[2] = lVar13;
              unaff_x24[3] = lVar18 + lVar14 * 0xb0;
              func_0x004b5a44(&uStack00000000000001e0,&uStack0000000000000110);
              *plVar16 = lVar7;
              func_0x00491bc4(&uStack0000000000000110,&uStack00000000000001e0,
                              (lVar7 + 8) * 0x517cc1b727220a95,unaff_x29 + -0x98);
              lVar7 = unaff_x24[1];
              if (lVar7 != -0x8000000000000000) {
                lVar18 = unaff_x24[2];
                lVar13 = unaff_x24[3];
                lVar14 = *(long *)*unaff_x24;
                *(long *)*unaff_x24 = lVar14 + -1;
                LORelease();
                if (lVar14 == 1) {
                  func_0x005d2b20(&uStack0000000000000110);
                }
                if (lVar13 != 0) {
                  lVar14 = 0;
                  lVar13 = 1 - lVar13;
                  do {
                    lVar6 = **(long **)(lVar18 + lVar14);
                    **(long **)(lVar18 + lVar14) = lVar6 + -1;
                    LORelease();
                    if (lVar6 == 1) {
                      func_0x005d2ac4(lVar18 + lVar14);
                    }
                    lVar14 = lVar14 + 8;
                    lVar13 = lVar13 + 1;
                  } while (lVar13 != 1);
                }
                if (lVar7 != 0) {
                  func_0x00187bd4(lVar18,lVar7 << 3,8);
                }
              }
              plVar16 = (long *)*plVar16;
              if (*plVar16 == 1) {
                lVar13 = plVar16[2];
                lVar18 = plVar16[3];
                lVar7 = plVar16[4];
                lVar14 = plVar16[5];
                unaff_x24[1] = plVar16[6];
                *unaff_x24 = lVar14;
                uVar15 = plVar16[8];
                unaff_x24[2] = plVar16[7];
                lVar14 = plVar16[9];
                func_0x00187bd4(plVar16,0x60,8);
                lVar6 = *unaff_x24;
                *(long *)(unaff_x29 + -0x78) = unaff_x24[1];
                *(long *)(unaff_x29 + -0x80) = lVar6;
                *(long *)(unaff_x29 + -0x70) = unaff_x24[2];
                if ((uVar15 | 0x8000000000000000) != 0x8000000000000000) {
                  func_0x00187bd4(lVar14,uVar15,1);
                }
                if (lVar7 != 0) {
                  lVar14 = 0;
                  lVar7 = 1 - lVar7;
                  do {
                    lVar6 = **(long **)(lVar18 + lVar14);
                    **(long **)(lVar18 + lVar14) = lVar6 + -1;
                    LORelease();
                    if (lVar6 == 1) {
                      func_0x005d2ac4(lVar18 + lVar14);
                    }
                    lVar14 = lVar14 + 8;
                    lVar7 = lVar7 + 1;
                  } while (lVar7 != 1);
                }
                if (lVar13 != 0) {
                  func_0x00187bd4(lVar18,lVar13 << 3,8);
                }
                func_0x00499fc8(unaff_x29 + -0x80,&uStack00000000000001e0);
                func_0x005d731c(unaff_x29 + -0x80,1);
                *(undefined8 *)(unaff_x25 + 0x68) = 0;
                *(undefined8 *)(unaff_x25 + 0x70) = 1;
                *(undefined8 *)(unaff_x25 + 0x78) = 0;
                unaff_x24[2] = 0xe0000020;
                *unaff_x24 = (long)&uStack00000000000000f0;
                unaff_x24[1] = (long)&UNK_009e2088;
                iVar9 = func_0x005afc10(unaff_x29 + -0x80,&uStack0000000000000110);
                if (iVar9 == 0) {
                  lVar7 = *(long *)(unaff_x25 + 0x68);
                  unaff_x22[1] = *(long *)(unaff_x25 + 0x70);
                  *unaff_x22 = lVar7;
                  unaff_x22[2] = *(long *)(unaff_x25 + 0x78);
                  lVar7 = *(long *)(unaff_x29 + -0x70) + 1;
                  lVar13 = *(long *)(unaff_x29 + -0x78);
                  while (lVar7 = lVar7 + -1, lVar7 != 0) {
                    func_0x00488488(lVar13);
                    lVar13 = lVar13 + 0x108;
                  }
                  if (*(long *)(unaff_x29 + -0x80) != 0) {
                    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x78),
                                    *(long *)(unaff_x29 + -0x80) * 0x108,8);
                  }
                  lVar7 = unaff_x24[0x1b];
                  if (lVar7 != 0) {
                    lVar13 = unaff_x24[0x1d];
                    if (lVar13 != 0) {
                      plVar10 = (long *)unaff_x24[0x1a];
                      plVar16 = plVar10 + 1;
                      lVar18 = *plVar10;
                      uVar15 = CONCAT17(-(-1 < lVar18),
                                        CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                                 CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                                          CONCAT14(-(-1 < (char)((ulong)lVar18 >>
                                                                                0x20)),
                                                                   CONCAT13(-(-1 < (char)((ulong)
                                                  lVar18 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar18 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar18 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar18)))))))) &
                               0x8080808080808080;
                      do {
                        while (uVar15 == 0) {
                          lVar18 = *plVar16;
                          plVar10 = plVar10 + -0x20;
                          plVar16 = plVar16 + 1;
                          uVar15 = CONCAT17(-(-1 < lVar18),
                                            CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                                     CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                                              CONCAT14(-(-1 < (char)((ulong)lVar18
                                                                                    >> 0x20)),
                                                                       CONCAT13(-(-1 < (char)((ulong
                                                  )lVar18 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar18 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar18 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar18)))))))) &
                                   0x8080808080808080;
                        }
                        uVar4 = (uVar15 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                (uVar15 >> 7 & 0xff00ff00ff00ff) << 8;
                        uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 |
                                (uVar4 & 0xffff0000ffff) << 0x10;
                        func_0x00490a30((long)plVar10 +
                                        (LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) & 0x78U) * -4 +
                                        -0x20);
                        uVar15 = uVar15 - 1 & uVar15;
                        lVar13 = lVar13 + -1;
                      } while (lVar13 != 0);
                    }
                    lVar13 = lVar7 * 0x21 + 0x29;
                    if (lVar13 != 0) {
                      func_0x00187bd4(unaff_x24[0x1a] + lVar7 * -0x20 + -0x20,lVar13,8);
                    }
                  }
                  if (*(long *)(unaff_x25 + 0x60) != 0) {
                    puVar11 = *(undefined8 **)(unaff_x25 + 0x58);
                    lVar7 = 1 - *(long *)(unaff_x25 + 0x60);
                    do {
                      lVar13 = *(long *)*puVar11;
                      *(long *)*puVar11 = lVar13 + -1;
                      LORelease();
                      if (lVar13 == 1) {
                        func_0x005d2b20(puVar11);
                      }
                      puVar11 = puVar11 + 2;
                      lVar7 = lVar7 + 1;
                    } while (lVar7 != 1);
                  }
                  if (*(long *)(unaff_x25 + 0x50) != 0) {
                    func_0x00187bd4(*(undefined8 *)(unaff_x25 + 0x58),
                                    *(long *)(unaff_x25 + 0x50) << 4,8);
                  }
                  func_0x00493bd8(&uStack0000000000000088);
                  goto code_r0x00498940;
                }
                func_0x007a2810(&UNK_0089edb1,0x37,unaff_x29 + -0x61,&UNK_009e2100,&UNK_009e20b8);
              }
              else {
                *unaff_x24 = (long)plVar16;
                func_0x007a2810(&UNK_0089ef3a,0x2b,&uStack0000000000000110,&UNK_009e2120,
                                &UNK_009e2288);
              }
            }
          }
        }
      }
    }
  }
  else {
    plVar10 = (long *)(lRam0000000000a2a680 + 0x38);
    if (*plVar10 != 0) {
      plVar16 = (long *)(lRam0000000000a2a680 + 0x30);
      lVar13 = *plVar16;
      if (lVar13 != 0) {
        *(long *)(unaff_x25 + 0x88) = lVar13;
        lVar13 = *plVar10;
        *(undefined8 *)(unaff_x25 + 0x98) = *(undefined8 *)(lVar7 + 0x40);
        *(long *)(unaff_x25 + 0x90) = lVar13;
        *(undefined8 *)(unaff_x25 + 0xa0) = *(undefined8 *)(lVar7 + 0x48);
        *(undefined8 *)(unaff_x25 + 0xa8) = 0;
        uStack0000000000000088 = &uStack0000000000000110;
        in_stack_00000090 = &uStack000000000000001f;
        in_stack_00000098 = &UNK_009e2208;
        uStack0000000000000020 = &uStack0000000000000088;
        in_stack_00000028 = (long *)0x1;
        in_stack_00000030 = plVar16;
        func_0x005e699c(&uStack00000000000001e0,lVar7,&uStack0000000000000020);
        goto code_r0x004981ac;
      }
    }
    func_0x007a23d8(&UNK_0089f1aa,0x22,&UNK_009e21f0);
  }
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x498b50);
  (*pcVar5)();
}

