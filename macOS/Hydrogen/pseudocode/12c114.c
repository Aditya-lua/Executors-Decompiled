
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_0012c114(float param_1,undefined1 param_2 [16],undefined8 param_3,ulong param_4,uint param_5,
            undefined8 *param_6)

{
  bool bVar1;
  undefined8 *puVar2;
  uint uVar3;
  int *piVar4;
  uint uVar5;
  undefined8 uVar6;
  double dVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  int iVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined8 uVar13;
  undefined1 auVar14 [16];
  undefined8 uVar15;
  undefined8 uVar16;
  bool bVar17;
  code *pcVar18;
  int iVar19;
  undefined8 uVar20;
  int *piVar21;
  undefined8 uVar22;
  uint uVar23;
  int iVar24;
  int iVar25;
  uint uVar26;
  uint uVar27;
  long lVar28;
  long lVar29;
  ulong uVar30;
  byte bVar31;
  long lVar32;
  undefined8 *puVar33;
  long lVar34;
  float *pfVar35;
  ulong uVar36;
  long lVar37;
  long lVar38;
  uint uVar39;
  ulong uVar40;
  int iVar41;
  ulong uVar42;
  uint uVar43;
  long lVar44;
  ulong uVar45;
  float fVar46;
  undefined4 uVar47;
  float fVar48;
  undefined8 uVar49;
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined2 uVar52;
  undefined2 uVar53;
  short sVar54;
  undefined2 uVar55;
  short sVar56;
  short sVar57;
  float fVar58;
  float fVar59;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  uVar20 = func_0x000d53ec();
  lVar34 = lRam0000000000a334c0;
  uStack_30 = in_stack_00000000;
  uStack_28 = in_stack_00000008;
  lVar44 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar44 + 0xc0) = 1;
  if (*(char *)(lVar44 + 0xc3) != '\0') {
    return 0;
  }
  fVar46 = (float)func_0x000d08e8();
  uVar52 = SUB42(fVar46,0);
  if (fVar46 <= 1.0) {
    uVar52 = 0;
  }
  uVar53 = param_2._0_2_;
  if (param_2._0_4_ <= 1.0) {
    uVar53 = 0;
  }
  uVar55 = 0;
  if ((param_5 & 0x3000000) != 0) {
    uVar55 = uVar53;
  }
  auVar51 = ZEXT416(*(uint *)((long)param_6 + 4));
  fVar46 = (float)func_0x000d0934(*(undefined4 *)param_6,auVar51,uVar52,uVar55);
  uStack_48 = *(undefined8 *)(lVar44 + 0x110);
  uStack_40 = CONCAT44(auVar51._0_4_ + (float)((ulong)uStack_48 >> 0x20),fVar46 + (float)uStack_48);
  if (*(char *)(lVar44 + 0xdc) < '\x01') {
    bVar1 = '\0' < *(char *)(lVar44 + 0xdd);
  }
  else {
    bVar1 = true;
  }
  if (((param_5 & 0x3000000) != 0) &&
     (uVar39 = func_0x000c2bbc(&uStack_48,0), ((uVar39 ^ 1) & 1) == 0 && !bVar1)) {
    uStack_c0 = CONCAT44((float)((ulong)uStack_40 >> 0x20) - (float)((ulong)uStack_48 >> 0x20),
                         (float)uStack_40 - (float)uStack_48);
    func_0x000d0d0c(0xbf800000,&uStack_c0);
    return 0;
  }
  uVar39 = param_5 & 0x3000000;
  uVar27 = param_5 & 0x3000000;
  if (*(int *)(&UNK_00004e20 + lVar34) == (int)uVar20) {
                    /* WARNING: Does not return */
    pcVar18 = (code *)SoftwareBreakpoint(0xf000,0x12c26c);
    (*pcVar18)();
  }
  piVar21 = (int *)func_0x0012ce7c(&UNK_00004e38 + lVar34,uVar20);
  uVar5 = piVar21[1];
  lVar28 = *(long *)(&UNK_00004e40 + lVar34);
  iVar41 = *(int *)(&UNK_00004e24 + lVar34);
  uVar23 = *(uint *)(&UNK_00004e28 + lVar34);
  uVar40 = (long)iVar41 + 1;
  iVar19 = (int)uVar40;
  *(int *)(&UNK_00004e24 + lVar34) = iVar19;
  if ((int)uVar23 <= iVar41) {
    uStack_50 = 0;
    uStack_68 = 0;
    uStack_70 = 0;
    uStack_58 = 0;
    uStack_60 = 0;
    uStack_88 = 0;
    uStack_84 = 0;
    uStack_90 = 0;
    uStack_8c = 0;
    uStack_78 = 0;
    uStack_80 = 0;
    uStack_a8 = 0;
    uStack_b0 = 0;
    lStack_98 = 0;
    uStack_a0 = 0;
    uStack_b8 = 0;
    uStack_c0 = 0xbf80000000000000;
    iVar25 = *(int *)(&UNK_00004e2c + lVar34);
    if (iVar25 <= iVar41) {
      iVar24 = iVar25;
      if (iVar25 < 0) {
        iVar24 = iVar25 + 1;
      }
      iVar10 = 8;
      if (iVar25 != 0) {
        iVar10 = iVar25 + (iVar24 >> 1);
      }
      if (iVar10 <= iVar19) {
        iVar10 = iVar19;
      }
      uVar22 = func_0x000b810c((long)iVar10 * 0x78);
      if (*(long *)(&UNK_00004e30 + lVar34) != 0) {
        _memcpy(uVar22,*(long *)(&UNK_00004e30 + lVar34),
                (long)*(int *)(&UNK_00004e28 + lVar34) * 0x78);
        func_0x000b83d4(*(undefined8 *)(&UNK_00004e30 + lVar34));
      }
      *(undefined8 *)(&UNK_00004e30 + lVar34) = uVar22;
      *(int *)(&UNK_00004e2c + lVar34) = iVar10;
      uVar23 = *(uint *)(&UNK_00004e28 + lVar34);
      param_4 = param_4 & 0xffffffff;
    }
    if ((int)uVar23 <= iVar41) {
      lVar32 = uVar40 - (long)(int)uVar23;
      lVar29 = (-(ulong)(uVar23 >> 0x1f) & 0xffffff8000000000 | (ulong)uVar23 << 7) +
               (long)(int)uVar23 * -8;
      do {
        puVar33 = (undefined8 *)(*(long *)(&UNK_00004e30 + lVar34) + lVar29);
        puVar33[5] = lStack_98;
        puVar33[4] = uStack_a0;
        puVar33[7] = CONCAT44(uStack_84,uStack_88);
        puVar33[6] = CONCAT44(uStack_8c,uStack_90);
        puVar33[1] = uStack_b8;
        *puVar33 = uStack_c0;
        puVar33[3] = uStack_a8;
        puVar33[2] = uStack_b0;
        puVar33[0xe] = uStack_50;
        puVar33[0xb] = uStack_68;
        puVar33[10] = uStack_70;
        puVar33[0xd] = uStack_58;
        puVar33[0xc] = uStack_60;
        puVar33[9] = uStack_78;
        puVar33[8] = uStack_80;
        lVar29 = lVar29 + 0x78;
        lVar32 = lVar32 + -1;
      } while (lVar32 != 0);
    }
    *(int *)(&UNK_00004e28 + lVar34) = iVar19;
    func_0x000efd64(&uStack_a8);
    if (lStack_98 != 0) {
      func_0x000b83d4();
    }
    uVar40 = (ulong)*(uint *)(&UNK_00004e24 + lVar34);
  }
  lVar29 = (long)piVar21 - lVar28 >> 4;
  uVar42 = lVar29 * 0x14c1bacf914c1bad;
  lVar37 = (long)(int)uVar40 + -1;
  lVar32 = *(long *)(&UNK_00004e30 + lVar34);
  lVar28 = lVar32 + lVar37 * 0x78;
  *(long *)(piVar21 + 4) = lVar28;
  iVar41 = (int)uVar42;
  *(int *)(lVar32 + lVar37 * 0x78) = iVar41;
  puVar33 = (undefined8 *)(lVar28 + 0x18);
  *puVar33 = _UNK_0080bff0;
  *(undefined8 **)(piVar21 + 0x68) = puVar33;
  *(bool *)((long)piVar21 + 0x243) = (param_5 & 0xe000) == 0;
  if ((param_5 & 0xe000) == 0) {
    uVar23 = 0x2000;
    if (((param_5 >> 0x18 & 1) == 0) && (uVar23 = 0x8000, (*(byte *)(lVar44 + 0x14) & 0x40) != 0)) {
      uVar23 = 0x2000;
    }
    param_5 = uVar23 | param_5;
  }
  uVar23 = param_5 | 0x40000;
  if ((param_5 & 0xe000) != 0x4000) {
    uVar23 = param_5;
  }
  uVar43 = uVar23;
  if ((uVar23 & 0x3000000) != 0) {
    uVar43 = uVar23 & 0xfffcffff;
  }
  if ((uVar43 & 0x1000) != 0) {
    uVar43 = uVar43 & 0xfffff7ff;
  }
  uVar23 = (uVar23 & 1) << 9 | uVar43;
  uVar26 = uVar23 | 0x10;
  uVar3 = uVar26;
  if ((uVar43 & 0xf) != 0) {
    uVar3 = uVar23;
  }
  if ((*(byte *)(*(long *)(lVar44 + 0x388) + 0x15) & 1) != 0) {
    uVar3 = uVar26;
  }
  iVar19 = piVar21[0x1a];
  iVar25 = *(int *)(&UNK_00003f58 + lVar34);
  if (iVar19 == iVar25) {
    uVar23 = (int)(short)piVar21[0x1e] + 1;
  }
  else {
    uVar23 = 0;
  }
  *piVar21 = (int)uVar20;
  piVar21[1] = uVar3;
  *(long *)(piVar21 + 0x60) = lVar44;
  *(long *)(piVar21 + 0x62) = lVar44;
  uVar43 = (uint)param_4;
  piVar21[0x1a] = iVar25;
  piVar21[0x1b] = uVar43;
  *(undefined1 *)((long)piVar21 + 0x236) = 0;
  piVar21[0x33] = (int)param_1;
  *(undefined8 *)(lVar32 + lVar37 * 0x78 + 0xc) = *param_6;
  *(short *)(piVar21 + 0x1e) = (short)uVar23;
  if ((int)uVar23 < 1) {
    uVar22 = uVar20;
    uVar26 = uVar23;
    if ((uVar23 & 0xffff) == 0) goto code_r0x0012c540;
code_r0x0012c618:
    *(int *)(*(long *)(piVar21 + 0x72) + (long)(int)(short)uVar26 * 0x18 + -0x18) = (int)uVar22;
    if (uVar27 != 0) goto code_r0x0012c634;
code_r0x0012c550:
    *(undefined8 *)(piVar21 + 0x3e) = uStack_40;
    *(undefined8 *)(piVar21 + 0x3c) = uStack_48;
    *(undefined8 *)(piVar21 + 0x42) = uStack_40;
    *(undefined8 *)(piVar21 + 0x40) = uStack_48;
    *(undefined8 *)(piVar21 + 0x46) = uStack_40;
    *(undefined8 *)(piVar21 + 0x44) = uStack_48;
    func_0x000d5164(uVar20);
  }
  else {
    iVar25 = piVar21[0x70];
    if (iVar25 < (int)uVar23) {
      if (iVar25 == piVar21[0x71]) {
        if (iVar25 == 0) {
          iVar24 = 8;
        }
        else {
          iVar24 = iVar25;
          if (iVar25 < 0) {
            iVar24 = iVar25 + 1;
          }
          iVar24 = iVar25 + (iVar24 >> 1);
        }
        if (iVar24 <= iVar25 + 1) {
          iVar24 = iVar25 + 1;
        }
        lVar28 = func_0x000b810c((long)iVar24 * 0x18);
        if (*(long *)(piVar21 + 0x72) != 0) {
          _memcpy(lVar28,*(long *)(piVar21 + 0x72),(long)piVar21[0x70] * 0x18);
          func_0x000b83d4(*(undefined8 *)(piVar21 + 0x72));
        }
        *(long *)(piVar21 + 0x72) = lVar28;
        piVar21[0x71] = iVar24;
        iVar25 = piVar21[0x70];
      }
      else {
        lVar28 = *(long *)(piVar21 + 0x72);
      }
      puVar33 = (undefined8 *)(lVar28 + (long)iVar25 * 0x18);
      *puVar33 = 0;
      puVar33[1] = 0;
      puVar33[2] = 0xffffffffffffffff;
      piVar21[0x70] = piVar21[0x70] + 1;
    }
    uVar22 = func_0x000d5210("##Instances",0,uVar20);
    uVar22 = func_0x000d533c(uVar23,uVar22);
    uVar26 = (uint)*(ushort *)(piVar21 + 0x1e);
    if (*(ushort *)(piVar21 + 0x1e) != 0) goto code_r0x0012c618;
code_r0x0012c540:
    piVar21[0x6a] = (int)uVar22;
    if (uVar39 == 0) goto code_r0x0012c550;
code_r0x0012c634:
    if (((uint)(0.0 < param_1) & (uVar3 & 0x1000000) >> 0x18) == 0) {
      param_1 = 3.4028235e+38;
    }
    if ((param_1 != 3.4028235e+38) || ((uVar3 & 0x3000000) == 0x1000000)) {
      if (param_1 == 3.4028235e+38) {
        param_1 = 0.0;
      }
      uVar47 = 0x800000;
      if ((uVar3 & 0x3000000) != 0x1000000) {
        uVar47 = 0;
      }
      uStack_c0 = CONCAT44(uVar47,param_1);
      func_0x000d4234(&uStack_c0);
    }
    if ((uVar5 & 0x3000000) == 0) {
      uStack_c0 = 0;
      func_0x000d4260(&uStack_c0);
    }
    uStack_c0 = CONCAT44((float)((ulong)uStack_40 >> 0x20) - (float)((ulong)uStack_48 >> 0x20),
                         (float)uStack_40 - (float)uStack_48);
    func_0x000d01b4(param_3,uVar22,&uStack_c0,0,(uVar3 & 0x1000000) >> 0xd);
    lVar28 = *(long *)(lVar34 + 0x4000);
    *(long *)(piVar21 + 0x62) = lVar28;
    uVar6 = *(undefined8 *)(lVar28 + 0x228);
    *(undefined8 *)(piVar21 + 0x46) = *(undefined8 *)(lVar28 + 0x230);
    *(undefined8 *)(piVar21 + 0x44) = uVar6;
    uVar6 = *(undefined8 *)(lVar28 + 0x28);
    uVar49 = *(undefined8 *)(lVar28 + 0x30);
    *(undefined8 *)(piVar21 + 0x3c) = uVar6;
    *(ulong *)(piVar21 + 0x3e) =
         CONCAT44((float)((ulong)uVar6 >> 0x20) + (float)((ulong)uVar49 >> 0x20),
                  (float)uVar6 + (float)uVar49);
    uVar6 = *(undefined8 *)(lVar28 + 0x208);
    *(undefined8 *)(piVar21 + 0x42) = *(undefined8 *)(lVar28 + 0x210);
    *(undefined8 *)(piVar21 + 0x40) = uVar6;
    bVar17 = false;
    if (*(char *)(lVar28 + 0xc3) != '\0') {
      bVar17 = bVar1;
    }
    if (bVar17) {
      *(undefined1 *)(lVar28 + 0xc3) = 0;
    }
    bVar31 = *(byte *)((long)piVar21 + 0x246);
    if (uVar23 == 0) {
      *(byte *)((long)piVar21 + 0x247) = bVar31;
      *(undefined1 *)((long)piVar21 + 0x246) = 0;
      bVar31 = 0;
    }
    *(byte *)((long)piVar21 + 0x246) = bVar31 | *(byte *)(lVar28 + 0xbd);
    func_0x000d5164(uVar20);
  }
  if (0 < (int)uVar23) {
    func_0x000d5164(uVar22);
  }
  lVar38 = *(long *)(piVar21 + 0x62);
  piVar21[0x2d] = *(int *)(lVar38 + 0x154);
  uVar20 = *(undefined8 *)(lVar38 + 0x248);
  *(undefined8 *)(piVar21 + 0x5a) = *(undefined8 *)(lVar38 + 0x250);
  *(undefined8 *)(piVar21 + 0x58) = uVar20;
  *(undefined1 *)((long)piVar21 + 0x249) = *(undefined1 *)(lVar38 + 0xc3);
  lVar28 = lVar32 + lVar37 * 0x78;
  uVar20 = *(undefined8 *)(lVar38 + 0x228);
  *(undefined8 *)(lVar28 + 0x38) = *(undefined8 *)(lVar38 + 0x230);
  *(undefined8 *)(lVar28 + 0x30) = uVar20;
  uVar20 = *(undefined8 *)(lVar38 + 0x238);
  *(undefined8 *)(lVar28 + 0x48) = *(undefined8 *)(lVar38 + 0x240);
  *(undefined8 *)(lVar28 + 0x40) = uVar20;
  *(undefined4 *)(lVar28 + 0x68) = *(undefined4 *)(lVar44 + 0x158);
  *(undefined8 *)(lVar28 + 0x50) = *(undefined8 *)(lVar38 + 0x140);
  *(undefined8 *)(lVar28 + 0x58) = *(undefined8 *)(lVar38 + 0x138);
  *(undefined8 *)(lVar28 + 0x60) = *(undefined8 *)(lVar38 + 0x128);
  *(undefined4 *)(lVar28 + 0x6c) = *(undefined4 *)(lVar44 + 0x1cc);
  *(undefined4 *)(lVar28 + 0x70) = *(undefined4 *)(lVar44 + 0x1d8);
  *(undefined8 *)(lVar38 + 0x138) = 0;
  *(undefined8 *)(lVar38 + 0x140) = 0;
  if (lVar38 != lVar44) {
    if ((uVar3 >> 10 & 1) != 0) {
      fVar46 = (float)piVar21[0x58] + 1.0;
      if ((float)piVar21[0x5a] <= (float)piVar21[0x58] + 1.0) {
        fVar46 = (float)piVar21[0x5a];
      }
      piVar21[0x58] = (int)fVar46;
    }
    if ((uVar3 >> 8 & 1) != 0) {
      fVar46 = (float)piVar21[0x59] + 1.0;
      if ((float)piVar21[0x5b] <= (float)piVar21[0x59] + 1.0) {
        fVar46 = (float)piVar21[0x5b];
      }
      piVar21[0x59] = (int)fVar46;
    }
  }
  fVar46 = 0.0;
  fVar48 = 0.0;
  if ((uVar3 & 0x200) != 0) {
    fVar48 = 1.0;
  }
  if ((uVar3 & 0x800200) == 0x200) {
    fVar46 = *(float *)(&UNK_00003944 + lVar34);
code_r0x0012c864:
    uVar52 = 0;
    uVar53 = 0;
  }
  else {
    if ((uVar3 & 0x800200) != 0) goto code_r0x0012c864;
    uVar52 = (undefined2)*(undefined4 *)(&UNK_00003944 + lVar34);
    uVar53 = (undefined2)((uint)*(undefined4 *)(&UNK_00003944 + lVar34) >> 0x10);
  }
  piVar21[0x31] = (int)(fVar48 + (float)CONCAT22(uVar53,uVar52));
  piVar21[0x32] = CONCAT22(uVar53,uVar52);
  piVar21[0x30] = (int)fVar46;
  uVar52 = 0;
  uVar53 = 0;
  fVar48 = 0.0;
  if ((uVar3 & 0x400) != 0) {
    fVar48 = 1.0;
  }
  if ((uVar3 & 0x200400) != 0 && (uVar3 & 0x400000) == 0) {
    uVar52 = (undefined2)*(undefined4 *)(&UNK_00003944 + lVar34);
    uVar53 = (undefined2)((uint)*(undefined4 *)(&UNK_00003944 + lVar34) >> 0x10);
  }
  piVar21[0x2f] = (int)((fVar48 + (float)CONCAT22(uVar53,uVar52)) - fVar46);
  piVar21[0x1c] = -1;
  piVar21[0x1d] = -1;
  piVar21[0x25] = (uint)*(ushort *)(piVar21 + 0x25);
  piVar21[0x26] = 0;
  piVar4 = piVar21 + 0x44;
  if (lVar38 != lVar44) {
    piVar4 = (int *)(lVar38 + 0x248);
  }
  uVar20 = *(undefined8 *)piVar4;
  *(undefined8 *)(piVar21 + 0x4a) = *(undefined8 *)(piVar4 + 2);
  *(undefined8 *)(piVar21 + 0x48) = uVar20;
  fVar46 = (float)((ulong)*(undefined8 *)(piVar21 + 0x46) >> 0x20);
  uVar20 = *(undefined8 *)*(undefined1 (*) [12])(piVar21 + 0x44);
  fVar48 = (float)((ulong)uVar20 >> 0x20);
  auVar50 = *(undefined1 (*) [16])(piVar21 + 0x48);
  sVar54 = -(ushort)(fVar48 <= auVar50._4_4_);
  sVar56 = -(ushort)(auVar50._8_4_ < (float)*(undefined8 *)(piVar21 + 0x46));
  sVar57 = -(ushort)(auVar50._12_4_ < fVar46);
  uVar6 = *(undefined8 *)(piVar21 + 0x58);
  fVar58 = (float)uVar6;
  fVar59 = (float)((ulong)uVar6 >> 0x20);
  uVar22 = *(undefined8 *)(piVar21 + 0x5a);
  auVar51._12_4_ = fVar46;
  auVar51._0_12_ = *(undefined1 (*) [12])(piVar21 + 0x44);
  auVar8._4_2_ = sVar54;
  auVar8._0_4_ = (int)(short)-(ushort)((float)uVar20 <= auVar50._0_4_);
  auVar8._6_2_ = sVar54 >> 0xf;
  auVar8._8_2_ = sVar56;
  auVar8._10_2_ = sVar56 >> 0xf;
  auVar8._12_2_ = sVar57;
  auVar8._14_2_ = sVar57 >> 0xf;
  auVar50 = auVar50 ^ (auVar50 ^ auVar51) & ~auVar8;
  iVar25 = -(uint)(auVar50._4_4_ < fVar59);
  iVar24 = -(uint)(auVar50._8_4_ < fVar58);
  iVar10 = -(uint)(auVar50._12_4_ < fVar59);
  fVar46 = (float)((ulong)uVar22 >> 0x20);
  auVar11._8_2_ = (short)uVar22;
  auVar11._0_8_ = uVar22;
  auVar11._10_2_ = (short)((ulong)uVar22 >> 0x10);
  auVar11._12_2_ = (short)((ulong)uVar22 >> 0x20);
  auVar11._14_2_ = (short)((ulong)uVar22 >> 0x30);
  auVar14._4_4_ = -(uint)(fVar46 < auVar50._4_4_);
  auVar14._0_4_ = -(uint)((float)uVar22 < auVar50._0_4_);
  auVar14._8_4_ = -(uint)((float)uVar22 < auVar50._8_4_);
  auVar14._12_4_ = -(uint)(fVar46 < auVar50._12_4_);
  auVar51 = auVar50 ^ (auVar50 ^ auVar11) & auVar14;
  auVar12._8_4_ = fVar58;
  auVar12._0_8_ = uVar6;
  auVar12._12_4_ = fVar59;
  auVar9._4_2_ = (short)iVar25;
  auVar9._0_4_ = -(uint)(auVar50._0_4_ < fVar58);
  auVar9._6_2_ = (short)((uint)iVar25 >> 0x10);
  auVar9._8_2_ = (short)iVar24;
  auVar9._10_2_ = (short)((uint)iVar24 >> 0x10);
  auVar9._12_2_ = (short)iVar10;
  auVar9._14_2_ = (short)((uint)iVar10 >> 0x10);
  auVar51 = auVar51 ^ (auVar51 ^ auVar12) & auVar9;
  *(long *)(piVar21 + 0x4a) = auVar51._8_8_;
  *(long *)(piVar21 + 0x48) = auVar51._0_8_;
  if ((uVar3 >> 0x11 & 1) == 0) {
    fVar46 = *(float *)(lVar38 + 0x254);
  }
  else {
    fVar46 = auVar51._12_4_;
    if (*(float *)(lVar38 + 0x234) <= auVar51._12_4_) {
      fVar46 = *(float *)(lVar38 + 0x234);
    }
  }
  piVar21[0x4b] = (int)fVar46;
  *(ulong *)(piVar21 + 0x1f) = CONCAT44(fVar48,fVar48);
  piVar21[0x22] = 0;
  piVar21[0x23] = 0;
  *(undefined8 *)((long)piVar21 + 0x226) = 0;
  *(undefined1 *)((long)piVar21 + 0x242) = 1;
  *(undefined4 *)((long)piVar21 + 0x206) = 0;
  if (iVar19 + 1 < *(int *)(&UNK_00003f58 + lVar34)) {
    *(undefined1 *)((long)piVar21 + 0x245) = 0;
  }
  *(undefined4 *)(lVar32 + lVar37 * 0x78 + 8) = 0;
  iVar19 = func_0x000bba44(0x3f800000,0x2b);
  piVar21[0x29] = iVar19;
  iVar19 = func_0x000bba44(0x3f800000,0x2c);
  piVar21[0x2a] = iVar19;
  *(int **)(&UNK_00004e18 + lVar34) = piVar21;
  *(undefined1 *)(lVar44 + 0x170) = 0;
  *(int *)(lVar44 + 0x1c0) = iVar41;
  if (lVar38 != lVar44) {
    *(int *)(lVar38 + 0x1c0) = iVar41;
  }
  if (((uVar5 >> 1 & 1) != 0) && ((uVar3 >> 1 & 1) == 0)) {
    *(undefined1 *)((long)piVar21 + 0x241) = 1;
  }
  iVar19 = *(int *)(&UNK_00004e60 + lVar34);
  if (iVar19 <= iVar41) {
    uVar39 = iVar41 + 1;
    iVar25 = *(int *)(&UNK_00004e64 + lVar34);
    if (iVar25 <= iVar41) {
      if (iVar25 == 0) {
        uVar27 = 8;
      }
      else {
        iVar19 = iVar25;
        if (iVar25 < 0) {
          iVar19 = iVar25 + 1;
        }
        uVar27 = iVar25 + (iVar19 >> 1);
      }
      if ((int)uVar27 <= (int)uVar39) {
        uVar27 = uVar39;
      }
      uVar20 = func_0x000b810c(-(ulong)(uVar27 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar27 << 2);
      if (*(long *)(&UNK_00004e68 + lVar34) != 0) {
        _memcpy(uVar20,*(long *)(&UNK_00004e68 + lVar34),(long)*(int *)(&UNK_00004e60 + lVar34) << 2
               );
        func_0x000b83d4(*(undefined8 *)(&UNK_00004e68 + lVar34));
      }
      *(undefined8 *)(&UNK_00004e68 + lVar34) = uVar20;
      *(uint *)(&UNK_00004e64 + lVar34) = uVar27;
      iVar19 = *(int *)(&UNK_00004e60 + lVar34);
    }
    if (iVar19 <= iVar41) {
      lVar44 = (long)iVar19;
      do {
        *(undefined4 *)(*(long *)(&UNK_00004e68 + lVar34) + lVar44 * 4) = 0xbf800000;
        lVar44 = lVar44 + 1;
      } while ((int)uVar39 != lVar44);
    }
    *(uint *)(&UNK_00004e60 + lVar34) = uVar39;
  }
  dVar7 = *(double *)(&UNK_00003f50 + lVar34);
  *(float *)(*(long *)(&UNK_00004e68 + lVar34) +
            (-(uVar42 >> 0x1f & 1) & 0xfffffffc00000000 | lVar29 * 0x5306eb3e45306eb4 & 0x3fffffffcU
            )) = (float)dVar7;
  *(float *)(lVar32 + lVar37 * 0x78 + 4) = (float)dVar7;
  *(undefined1 *)(piVar21 + 0x92) = 0;
  uVar39 = (int)(*(long *)(piVar21 + 8) - *(long *)(piVar21 + 6) >> 4) * -0x49249249;
  lVar44 = *(long *)(piVar21 + 2);
  if (uVar39 == 0 || uVar39 == uVar43) {
    lVar37 = 0;
    lVar32 = 0;
    lVar28 = 0;
    lVar29 = 0;
    if (lVar44 == 0) goto code_r0x0012cb00;
    if ((char)piVar21[0x90] != '\0') goto code_r0x0012cad8;
code_r0x0012cbd4:
    if ((char)piVar21[0x8e] != '\0') goto code_r0x0012cbdc;
  }
  else {
    piVar21[2] = 0;
    piVar21[3] = 0;
    lVar28 = *(long *)(piVar21 + 6);
    lVar29 = lVar44;
code_r0x0012cb00:
    lVar32 = lVar29;
    lVar37 = lVar28;
    uVar36 = (ulong)(int)(uVar43 * 0x72 + 3);
    uVar42 = uVar36 + (long)(int)(uVar43 << 3);
    uVar30 = (long)((ulong)(uVar43 + 0x1f) << 0x20) >> 0x23 & 0xfffffffffffffffc;
    uVar40 = uVar30 + (long)(int)uVar42;
    uVar45 = uVar30 + (long)(int)uVar40 & 0xfffffffffffffffc;
    lVar44 = (long)((int)uVar45 + (int)uVar30);
    uVar20 = func_0x000b810c(lVar44);
    *(undefined8 *)(piVar21 + 2) = uVar20;
    _bzero(uVar20,lVar44);
    lVar28 = *(long *)(piVar21 + 2);
    lVar44 = lVar28 + (int)(uVar43 * 0x70);
    *(long *)(piVar21 + 6) = lVar28;
    *(long *)(piVar21 + 8) = lVar44;
    *(long *)(piVar21 + 10) = lVar44;
    *(long *)(piVar21 + 0xc) = lVar44 + (int)(uVar43 * 2);
    lVar44 = lVar28 + (uVar36 & 0xfffffffffffffffc);
    *(long *)(piVar21 + 0xe) = lVar44;
    *(long *)(piVar21 + 0x10) = lVar44 + (int)(uVar43 << 3);
    *(ulong *)(piVar21 + 0x12) = lVar28 + (uVar42 & 0xfffffffffffffffc);
    *(ulong *)(piVar21 + 0x14) = lVar28 + (uVar40 & 0xfffffffffffffffc);
    *(ulong *)(piVar21 + 0x16) = lVar28 + uVar45;
    *(undefined1 *)((long)piVar21 + 0x23d) = 1;
    *(undefined1 *)(piVar21 + 0x8e) = 1;
    if ((char)piVar21[0x90] == '\0') goto code_r0x0012cbd4;
code_r0x0012cad8:
    *(undefined1 *)(piVar21 + 0x8e) = 1;
    *(undefined1 *)(piVar21 + 0x90) = 0;
    *(undefined2 *)((long)piVar21 + 0x23d) = 0x100;
    piVar21[0x18] = 0;
code_r0x0012cbdc:
    piVar21[0x19] = -1;
    *(undefined1 *)((long)piVar21 + 0x239) = 1;
    *(undefined2 *)((long)piVar21 + 0x7a) = 0xffff;
    *(undefined2 *)(piVar21 + 0x89) = 0xffff;
    *(undefined2 *)(piVar21 + 0x85) = 0xffff;
    *(undefined2 *)(piVar21 + 0x86) = 0xffff;
    piVar21[0x84] = -1;
    *(undefined4 *)((long)piVar21 + 0x20a) = 0xffffffff;
    if (0 < (int)uVar43) {
      lVar28 = 0;
      lVar44 = 0;
      do {
        lVar29 = *(long *)(piVar21 + 6);
        puVar33 = (undefined8 *)(lVar29 + lVar28);
        if ((lVar37 == 0) || ((int)uVar39 <= lVar44)) {
          uStack_b8 = 0;
          uStack_c0 = 0;
          uStack_a8 = 0;
          uStack_b0 = 0;
          lStack_98 = 0;
          uStack_a0 = 0;
          uStack_90 = 0;
          uStack_8c = 0xffffffff;
          uStack_88 = 0xffffffff;
          uStack_84 = 0xffffffff;
          *puVar33 = 0;
          puVar33[1] = 0;
          *(undefined4 *)(puVar33 + 2) = 0xbf800000;
          *(undefined4 *)(puVar33 + 3) = 0xbf800000;
          *(undefined8 *)((long)puVar33 + 0x24) = 0;
          *(undefined8 *)((long)puVar33 + 0x1c) = 0;
          *(undefined8 *)((long)puVar33 + 0x34) = 0;
          *(undefined8 *)((long)puVar33 + 0x2c) = 0;
          *(undefined8 *)((long)puVar33 + 0x44) = 0;
          *(undefined8 *)((long)puVar33 + 0x3c) = 0;
          *(undefined8 *)((long)puVar33 + 0x54) = 0xffffffffffffffff;
          *(undefined8 *)((long)puVar33 + 0x4c) = 0xffffffff00000000;
          *(undefined4 *)((long)puVar33 + 0x5c) = 0xff00ff;
          *(undefined2 *)(puVar33 + 0xc) = 0xff;
          *(undefined8 *)((long)puVar33 + 0x67) = 0;
          *(undefined8 *)((long)puVar33 + 0x62) = 0;
          *(undefined4 *)((long)puVar33 + 0x14) = *(undefined4 *)((long)puVar33 + 0x14);
          *(undefined1 *)((long)puVar33 + 0x69) = 1;
          *(undefined1 *)((long)puVar33 + 100) = 1;
          *(undefined2 *)((long)puVar33 + 0x62) = 0x101;
        }
        else {
          puVar2 = (undefined8 *)(lVar37 + lVar28);
          uVar49 = *puVar2;
          uVar13 = puVar2[1];
          uVar20 = puVar2[2];
          uVar6 = puVar2[5];
          uVar22 = puVar2[4];
          puVar33[3] = puVar2[3];
          puVar33[2] = uVar20;
          puVar33[5] = uVar6;
          puVar33[4] = uVar22;
          puVar33[1] = uVar13;
          *puVar33 = uVar49;
          uVar15 = puVar2[6];
          uVar16 = puVar2[7];
          uVar22 = puVar2[9];
          uVar20 = puVar2[8];
          uVar49 = puVar2[0xb];
          uVar6 = puVar2[10];
          uVar13 = *(undefined8 *)((long)puVar2 + 0x5f);
          *(undefined8 *)((long)puVar33 + 0x67) = *(undefined8 *)((long)puVar2 + 0x67);
          *(undefined8 *)((long)puVar33 + 0x5f) = uVar13;
          puVar33[9] = uVar22;
          puVar33[8] = uVar20;
          puVar33[0xb] = uVar49;
          puVar33[10] = uVar6;
          puVar33[7] = uVar16;
          puVar33[6] = uVar15;
        }
        *(short *)(*(long *)(piVar21 + 10) + lVar44 * 2) = (short)lVar44;
        *(short *)(lVar29 + lVar28 + 0x52) = (short)lVar44;
        lVar44 = lVar44 + 1;
        lVar28 = lVar28 + 0x70;
      } while ((param_4 & 0xffffffff) * 0x70 != lVar28);
    }
  }
  if (lVar32 != 0) {
    func_0x000b83d4();
  }
  if (*(char *)((long)piVar21 + 0x23d) != '\0') {
    func_0x0012d0f4(piVar21);
  }
  fVar46 = *(float *)(&UNK_00003d38 + lVar34);
  fVar48 = (float)piVar21[0x39];
  if (((fVar48 != 0.0) && (fVar48 != fVar46)) && (0 < (int)uVar43)) {
    lVar34 = *(long *)(piVar21 + 6);
    fVar48 = fVar46 / fVar48;
    if (uVar43 < 4) {
      uVar42 = 0;
    }
    else {
      uVar42 = param_4 & 0xfffffffc;
      pfVar35 = (float *)(lVar34 + 0xf0);
      uVar40 = uVar42;
      do {
        pfVar35[-0x38] = fVar48 * pfVar35[-0x38];
        pfVar35[-0x1c] = fVar48 * pfVar35[-0x1c];
        *pfVar35 = fVar48 * *pfVar35;
        pfVar35[0x1c] = fVar48 * pfVar35[0x1c];
        pfVar35 = pfVar35 + 0x70;
        uVar40 = uVar40 - 4;
      } while (uVar40 != 0);
      if (uVar42 == (param_4 & 0xffffffff)) goto code_r0x0012cddc;
    }
    lVar44 = (param_4 & 0xffffffff) - uVar42;
    pfVar35 = (float *)(lVar34 + uVar42 * 0x70 + 0x10);
    do {
      *pfVar35 = fVar48 * *pfVar35;
      lVar44 = lVar44 + -1;
      pfVar35 = pfVar35 + 0x1c;
    } while (lVar44 != 0);
  }
code_r0x0012cddc:
  piVar21[0x39] = (int)fVar46;
  *(undefined1 *)(lVar38 + 0xc3) = 1;
  if (0 < piVar21[100]) {
    if (piVar21[0x65] < 0) {
      uVar20 = func_0x000b810c(0);
      if (*(long *)(piVar21 + 0x66) != 0) {
        _memcpy(uVar20,*(long *)(piVar21 + 0x66),(long)piVar21[100]);
        func_0x000b83d4(*(undefined8 *)(piVar21 + 0x66));
      }
      *(undefined8 *)(piVar21 + 0x66) = uVar20;
      piVar21[0x65] = 0;
    }
    piVar21[100] = 0;
  }
  func_0x0012d354(piVar21);
  return 1;
}

