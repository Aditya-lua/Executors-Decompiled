
long * FUN_002de000(long *param_1,long *param_2,long *param_3)

{
  undefined1 *puVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  uint uVar5;
  undefined8 *puVar6;
  long *plVar7;
  long *plVar8;
  ulong *puVar9;
  ulong *puVar10;
  long unaff_x19;
  long *unaff_x23;
  long *unaff_x24;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  undefined1 auVar18 [16];
  long *in_stack_00000000;
  long *in_stack_00000008;
  long *in_stack_00000010;
  long *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  lVar4 = 0;
  puVar1 = &uStack0000000000000030;
  do {
    *(undefined8 *)(puVar1 + -0x50) = unaff_x28;
    *(undefined8 *)(puVar1 + -0x48) = unaff_x27;
    *(long **)(puVar1 + -0x40) = unaff_x24;
    *(long **)(puVar1 + -0x38) = unaff_x23;
    *(long **)(puVar1 + -0x30) = in_stack_00000000;
    *(long **)(puVar1 + -0x28) = in_stack_00000008;
    *(long **)(puVar1 + -0x20) = in_stack_00000010;
    *(long **)(puVar1 + -0x18) = in_stack_00000018;
    *(undefined8 *)(puVar1 + -0x10) = in_stack_00000020;
    *(undefined8 *)(puVar1 + -8) = in_stack_00000028;
    *(undefined8 *)(puVar1 + -0x58) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    if (lVar4 == 0) {
      uVar5 = (uint)*(byte *)(param_1 + 0x53);
      if (*(byte *)(param_1 + 0x53) - 3 < 2) {
        uVar5 = 1;
        *(undefined1 *)(param_1 + 0x53) = 1;
      }
      if ((param_2 == (long *)0x0) && (uVar5 == 1)) {
        if ((unaff_x19 == 0) || (*param_1 == unaff_x19)) {
          in_stack_00000010 = (long *)((long)&MACH_HEADER.magic + 1);
        }
        else {
code_r0x002c1974:
          func_0x00373e9c(0xa295e8,&DAT_0031c068);
          unaff_x24 = (long *)0xa3b258;
          if (((((lRam0000000000a3b258 == unaff_x19) ||
                (unaff_x24 = (long *)0xa3b290, lRam0000000000a3b290 == unaff_x19)) ||
               (unaff_x24 = (long *)0xa3b2c8, lRam0000000000a3b2c8 == unaff_x19)) ||
              ((unaff_x24 = (long *)0xa3b300, lRam0000000000a3b300 == unaff_x19 ||
               (unaff_x24 = (long *)0xa3b338, lRam0000000000a3b338 == unaff_x19)))) ||
             ((unaff_x24 = (long *)0xa3b370, lRam0000000000a3b370 == unaff_x19 ||
              ((unaff_x24 = (long *)0xa3b3a8, lRam0000000000a3b3a8 == unaff_x19 ||
               (unaff_x24 = (long *)0xa3b3e0, lRam0000000000a3b3e0 == unaff_x19)))))) {
            *param_1 = unaff_x19;
            param_1[1] = (long)unaff_x24;
            uVar5 = *(uint *)(unaff_x19 + 0x28);
joined_r0x002c1b14:
            if ((uVar5 & 7) != 0) {
              func_0x0079e708();
              goto code_r0x002c1b1c;
            }
            in_stack_00000010 = (long *)(ulong)uVar5;
            in_stack_00000008 = param_3;
            in_stack_00000000 = param_2;
            if (0x80 < uVar5) goto code_r0x002c1d50;
            *(undefined8 *)(puVar1 + -0x78) = 0;
            *(undefined8 *)(puVar1 + -0x80) = 0;
            *(undefined8 *)(puVar1 + -0x68) = 0;
            *(undefined8 *)(puVar1 + -0x70) = 0;
            *(undefined8 *)(puVar1 + -0x98) = 0;
            *(undefined8 *)(puVar1 + -0xa0) = 0;
            *(undefined8 *)(puVar1 + -0x88) = 0;
            *(undefined8 *)(puVar1 + -0x90) = 0;
            *(undefined8 *)(puVar1 + -0xb8) = 0;
            *(undefined8 *)(puVar1 + -0xc0) = 0;
            *(undefined8 *)(puVar1 + -0xa8) = 0;
            *(undefined8 *)(puVar1 + -0xb0) = 0;
            *(undefined8 *)(puVar1 + -0xd8) = 0;
            *(undefined8 *)(puVar1 + -0xe0) = 0;
            *(undefined8 *)(puVar1 + -200) = 0;
            *(undefined8 *)(puVar1 + -0xd0) = 0;
            *(undefined8 *)(puVar1 + -0xf8) = 0;
            *(undefined8 *)(puVar1 + -0x100) = 0;
            *(undefined8 *)(puVar1 + -0xe8) = 0;
            *(undefined8 *)(puVar1 + -0xf0) = 0;
            *(undefined8 *)(puVar1 + -0x118) = 0;
            *(undefined8 *)(puVar1 + -0x120) = 0;
            *(undefined8 *)(puVar1 + -0x108) = 0;
            *(undefined8 *)(puVar1 + -0x110) = 0;
            *(undefined8 *)(puVar1 + -0x138) = 0;
            *(undefined8 *)(puVar1 + -0x140) = 0;
            *(undefined8 *)(puVar1 + -0x128) = 0;
            *(undefined8 *)(puVar1 + -0x130) = 0;
            *(undefined8 *)(puVar1 + -0x158) = 0;
            *(undefined8 *)(puVar1 + -0x160) = 0;
            *(undefined8 *)(puVar1 + -0x148) = 0;
            *(undefined8 *)(puVar1 + -0x150) = 0;
            if (in_stack_00000010 < param_3) {
              unaff_x23 = param_1 + 2;
              iVar2 = (*(code *)unaff_x24[2])(unaff_x23);
              if (((iVar2 != 0) &&
                  (iVar2 = (*(code *)unaff_x24[3])(unaff_x23,param_2,param_3), iVar2 != 0)) &&
                 (iVar2 = (*(code *)unaff_x24[4])(puVar1 + -0x160,unaff_x23), iVar2 != 0))
              goto code_r0x002c1ad4;
code_r0x002c1ce8:
              in_stack_00000010 = (long *)0x0;
            }
            else {
              if (param_3 != (long *)0x0) {
                ___memcpy_chk(puVar1 + -0x160,param_2,param_3,0x80);
              }
code_r0x002c1ad4:
              param_2 = (long *)(ulong)(uVar5 >> 3);
              if (7 < uVar5) {
                plVar3 = param_2;
                if (param_2 < (long *)((long)&MACH_HEADER.magic + 2)) {
                  plVar3 = (long *)((long)&MACH_HEADER.magic + 1);
                }
                if ((long *)((long)&MACH_HEADER.cputype + 3) < plVar3) {
                  plVar7 = (long *)((ulong)plVar3 & 0x1ffffff8);
                  puVar9 = (ulong *)(puVar1 + -0xc0);
                  puVar10 = (ulong *)(puVar1 + -0x140);
                  plVar8 = plVar7;
                  do {
                    uVar11 = puVar10[-4];
                    uVar13 = puVar10[-1];
                    uVar12 = puVar10[-2];
                    uVar15 = puVar10[1];
                    uVar14 = *puVar10;
                    uVar17 = puVar10[3];
                    uVar16 = puVar10[2];
                    puVar9[-3] = puVar10[-3] ^ 0x3636363636363636;
                    puVar9[-4] = uVar11 ^ 0x3636363636363636;
                    puVar9[-1] = uVar13 ^ 0x3636363636363636;
                    puVar9[-2] = uVar12 ^ 0x3636363636363636;
                    puVar9[1] = uVar15 ^ 0x3636363636363636;
                    *puVar9 = uVar14 ^ 0x3636363636363636;
                    puVar9[3] = uVar17 ^ 0x3636363636363636;
                    puVar9[2] = uVar16 ^ 0x3636363636363636;
                    plVar8 = plVar8 + -1;
                    puVar9 = puVar9 + 8;
                    puVar10 = puVar10 + 8;
                  } while (plVar8 != (long *)0x0);
                  if (plVar3 == plVar7) goto code_r0x002c1ba4;
                }
                else {
                  plVar7 = (long *)0x0;
                }
                lVar4 = (long)plVar3 - (long)plVar7;
                puVar9 = (ulong *)(puVar1 + (long)plVar7 * 8 + -0xe0);
                puVar10 = (ulong *)(puVar1 + (long)plVar7 * 8 + -0x160);
                do {
                  *puVar9 = *puVar10 ^ 0x3636363636363636;
                  lVar4 = lVar4 + -1;
                  puVar9 = puVar9 + 1;
                  puVar10 = puVar10 + 1;
                } while (lVar4 != 0);
              }
code_r0x002c1ba4:
              param_3 = param_1 + 0x1d;
              iVar2 = (*(code *)unaff_x24[2])(param_3);
              if ((iVar2 == 0) ||
                 (iVar2 = (*(code *)unaff_x24[3])(param_3,puVar1 + -0xe0,in_stack_00000010),
                 iVar2 == 0)) goto code_r0x002c1ce8;
              if (7 < uVar5) {
                if (param_2 < (long *)((long)&MACH_HEADER.magic + 2)) {
                  param_2 = (long *)((long)&MACH_HEADER.magic + 1);
                }
                if ((long *)((long)&MACH_HEADER.cputype + 3) < param_2) {
                  plVar8 = (long *)((ulong)param_2 & 0x1ffffff8);
                  puVar9 = (ulong *)(puVar1 + -0xc0);
                  puVar10 = (ulong *)(puVar1 + -0x140);
                  plVar3 = plVar8;
                  do {
                    uVar11 = puVar10[-4];
                    uVar13 = puVar10[-1];
                    uVar12 = puVar10[-2];
                    uVar15 = puVar10[1];
                    uVar14 = *puVar10;
                    uVar17 = puVar10[3];
                    uVar16 = puVar10[2];
                    puVar9[-3] = puVar10[-3] ^ 0x5c5c5c5c5c5c5c5c;
                    puVar9[-4] = uVar11 ^ 0x5c5c5c5c5c5c5c5c;
                    puVar9[-1] = uVar13 ^ 0x5c5c5c5c5c5c5c5c;
                    puVar9[-2] = uVar12 ^ 0x5c5c5c5c5c5c5c5c;
                    puVar9[1] = uVar15 ^ 0x5c5c5c5c5c5c5c5c;
                    *puVar9 = uVar14 ^ 0x5c5c5c5c5c5c5c5c;
                    puVar9[3] = uVar17 ^ 0x5c5c5c5c5c5c5c5c;
                    puVar9[2] = uVar16 ^ 0x5c5c5c5c5c5c5c5c;
                    plVar3 = plVar3 + -1;
                    puVar9 = puVar9 + 8;
                    puVar10 = puVar10 + 8;
                  } while (plVar3 != (long *)0x0);
                  if (param_2 == plVar8) goto code_r0x002c1c70;
                }
                else {
                  plVar8 = (long *)0x0;
                }
                lVar4 = (long)param_2 - (long)plVar8;
                puVar9 = (ulong *)(puVar1 + (long)plVar8 * 8 + -0xe0);
                puVar10 = (ulong *)(puVar1 + (long)plVar8 * 8 + -0x160);
                do {
                  *puVar9 = *puVar10 ^ 0x5c5c5c5c5c5c5c5c;
                  lVar4 = lVar4 + -1;
                  puVar9 = puVar9 + 1;
                  puVar10 = puVar10 + 1;
                } while (lVar4 != 0);
              }
code_r0x002c1c70:
              param_2 = param_1 + 0x38;
              iVar2 = (*(code *)unaff_x24[2])(param_2);
              if ((iVar2 == 0) ||
                 (iVar2 = (*(code *)unaff_x24[3])(param_2,puVar1 + -0xe0,in_stack_00000010),
                 iVar2 == 0)) goto code_r0x002c1ce8;
              param_1[0x17] = param_1[0x32];
              param_1[0x16] = param_1[0x31];
              param_1[0x19] = param_1[0x34];
              param_1[0x18] = param_1[0x33];
              param_1[0x1b] = param_1[0x36];
              param_1[0x1a] = param_1[0x35];
              param_1[0x1c] = param_1[0x37];
              param_1[0xf] = param_1[0x2a];
              param_1[0xe] = param_1[0x29];
              param_1[0x11] = param_1[0x2c];
              param_1[0x10] = param_1[0x2b];
              param_1[0x13] = param_1[0x2e];
              param_1[0x12] = param_1[0x2d];
              param_1[0x15] = param_1[0x30];
              param_1[0x14] = param_1[0x2f];
              param_1[7] = param_1[0x22];
              param_1[6] = param_1[0x21];
              param_1[9] = param_1[0x24];
              param_1[8] = param_1[0x23];
              param_1[0xb] = param_1[0x26];
              param_1[10] = param_1[0x25];
              param_1[0xd] = param_1[0x28];
              param_1[0xc] = param_1[0x27];
              param_1[3] = param_1[0x1e];
              param_1[2] = *param_3;
              param_1[5] = param_1[0x20];
              param_1[4] = param_1[0x1f];
              in_stack_00000010 = (long *)((long)&MACH_HEADER.magic + 1);
              *(undefined1 *)(param_1 + 0x53) = 1;
            }
            func_0x0036e464(puVar1 + -0xe0,0x80);
            func_0x0036e464(puVar1 + -0x160,0x80);
            if ((int)in_stack_00000010 == 0) {
              func_0x0036e464(param_1,0x2a0);
            }
          }
          else {
            in_stack_00000010 = (long *)0x0;
            param_1[1] = 0;
          }
        }
      }
      else {
        if ((unaff_x19 != 0) && ((uVar5 == 0 || (*param_1 != unaff_x19)))) goto code_r0x002c1974;
        if (uVar5 - 1 < 2) {
          unaff_x24 = (long *)param_1[1];
          uVar5 = *(uint *)(*unaff_x24 + 0x28);
          goto joined_r0x002c1b14;
        }
code_r0x002c1b1c:
        in_stack_00000010 = (long *)0x0;
      }
      in_stack_00000008 = param_3;
      in_stack_00000000 = param_2;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar1 + -0x58)) {
        return in_stack_00000010;
      }
    }
    else {
      func_0x0079e730();
      param_1 = in_stack_00000018;
code_r0x002c1d50:
      func_0x0079e6e0();
    }
    auVar18 = ___stack_chk_fail();
    lVar4 = auVar18._8_8_;
    plVar3 = auVar18._0_8_;
    plVar3[3] = 0;
    plVar3[2] = 0;
    plVar3[5] = 0;
    plVar3[4] = 0;
    plVar3[1] = 0;
    *plVar3 = 0;
    *(long **)(puVar1 + -0x180) = in_stack_00000010;
    *(long **)(puVar1 + -0x178) = param_1;
    *(undefined1 **)(puVar1 + -0x170) = puVar1 + -0x10;
    *(undefined **)(puVar1 + -0x168) = &_aws_lc_0_24_0_EVP_DigestInit;
    if ((*plVar3 != lVar4) && ((*plVar3 = lVar4, plVar3[5] != 0x800 || (plVar3[3] == 0)))) {
      if (*(int *)(lVar4 + 0x2c) == 0) goto code_r0x002c18bc;
      plVar3[2] = *(long *)(lVar4 + 0x18);
      lVar4 = func_0x0036e274();
      if (lVar4 == 0) {
        return (long *)0x0;
      }
      func_0x0036e3d8(plVar3[1]);
      plVar3[1] = lVar4;
    }
    lVar4 = plVar3[3];
    if (lVar4 == 0) {
code_r0x002c1888:
      (**(code **)(*plVar3 + 0x10))(plVar3);
      return (long *)((long)&MACH_HEADER.magic + 1);
    }
    if (plVar3[4] == 0) {
      func_0x0079e690();
code_r0x002c18bc:
      lVar4 = func_0x0079e6b8();
      if (*(long *)(lVar4 + 0x28) == 0x800) {
        return (long *)(ulong)(*(long *)(lVar4 + 0x18) != 0);
      }
      return (long *)0x0;
    }
    if (plVar3[5] != 0x800) goto code_r0x002c1888;
    plVar3 = *(long **)(lVar4 + 0x28);
    if (plVar3 == (long *)0x0) {
      return (long *)0x0;
    }
    if ((*(long *)(lVar4 + 0x10) == 0) ||
       (puVar6 = *(undefined8 **)(*(long *)(lVar4 + 0x10) + 8), puVar6 == (undefined8 *)0x0)) {
      return (long *)0x0;
    }
    param_2 = (long *)*puVar6;
    param_3 = (long *)puVar6[1];
    param_1 = plVar3 + 1;
    unaff_x19 = *plVar3;
    lVar4 = *(long *)(lVar4 + 8);
    in_stack_00000020 = *(undefined8 *)(puVar1 + -0x170);
    in_stack_00000028 = *(undefined8 *)(puVar1 + -0x168);
    in_stack_00000010 = *(long **)(puVar1 + -0x180);
    in_stack_00000018 = *(long **)(puVar1 + -0x178);
    puVar1 = puVar1 + -0x160;
  } while( true );
}

