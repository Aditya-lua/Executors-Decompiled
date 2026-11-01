
/* WARNING: Possible PIC construction at 0x0024e354: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0024e358) */

void FUN_0024d894(undefined8 param_1,undefined8 param_2,ulong *param_3,ulong *param_4,ulong *param_5
                 ,ulong *param_6,ulong *param_7)

{
  ushort uVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  code *pcVar5;
  bool in_CY;
  bool bVar6;
  undefined8 uVar7;
  int *piVar8;
  ulong uVar9;
  long *plVar10;
  ulong *puVar11;
  ulong *puVar12;
  undefined1 uVar13;
  long lVar14;
  int *piVar15;
  int *piVar16;
  char cVar17;
  long in_x9;
  ulong *puVar18;
  undefined8 *puVar19;
  ulong in_x10;
  ulong *puVar20;
  long lVar21;
  long lVar22;
  undefined1 in_w13;
  int iVar23;
  long unaff_x19;
  undefined2 uVar24;
  uint unaff_w21;
  undefined2 unaff_w22;
  ulong *puVar25;
  ulong unaff_x23;
  undefined8 unaff_x24;
  ulong uVar26;
  ulong uVar27;
  short sVar28;
  undefined2 uVar29;
  undefined8 *puVar30;
  ulong unaff_x26;
  undefined1 unaff_w27;
  uint uVar31;
  undefined1 uVar32;
  ulong uVar33;
  ulong *puVar34;
  undefined1 auVar35 [16];
  ulong in_stack_00000028;
  long in_stack_00000038;
  long in_stack_00000058;
  undefined8 *in_stack_00000060;
  undefined1 uStack0000000000000140;
  ulong uStack_270;
  ulong *puStack_268;
  ulong *puStack_260;
  uint uStack_224;
  ulong uStack_220;
  long lStack_218;
  undefined8 *puStack_210;
  uint uStack_204;
  ulong *puStack_200;
  ulong uStack_1f8;
  undefined8 uStack_1f0;
  long lStack_1d0;
  ulong uStack_1c8;
  undefined1 uStack_1c0;
  undefined1 uStack_1bf;
  undefined2 uStack_1be;
  uint uStack_1bc;
  undefined8 uStack_1b8;
  ulong uStack_1b0;
  ulong uStack_1a8;
  undefined1 uStack_1a0;
  undefined1 uStack_19f;
  undefined2 uStack_19e;
  uint uStack_19c;
  long lStack_180;
  ulong uStack_178;
  undefined8 uStack_170;
  undefined1 uStack_168;
  undefined1 uStack_167;
  undefined2 uStack_166;
  undefined2 uStack_164;
  undefined2 uStack_162;
  undefined1 uStack_160;
  undefined8 uStack_15f;
  long lStack_148;
  ulong uStack_140;
  undefined1 uStack_138;
  undefined1 uStack_137;
  short sStack_136;
  undefined2 uStack_134;
  char cStack_130;
  undefined7 uStack_12f;
  undefined8 uStack_128;
  undefined1 uStack_120;
  undefined7 uStack_11f;
  undefined8 uStack_118;
  undefined1 uStack_110;
  undefined8 uStack_10f;
  undefined2 uStack_78;
  
  if ((in_CY) && (in_x10 <= in_stack_00000028)) {
    *(long *)(in_stack_00000038 + 8) = *(long *)(in_stack_00000038 + 8) + in_stack_00000058;
    in_stack_00000060[1] = unaff_x19 + in_x9;
    in_stack_00000060[2] = unaff_x24;
    *(undefined1 *)(in_stack_00000060 + 3) = unaff_w27;
    *(undefined1 *)((long)in_stack_00000060 + 0x19) = in_w13;
    *(undefined2 *)((long)in_stack_00000060 + 0x1a) = unaff_w22;
    *(short *)((long)in_stack_00000060 + 0x1c) = (short)unaff_w21;
    *in_stack_00000060 = 0x8000000000000027;
    return;
  }
  uVar7 = func_0x007a23bc(&UNK_009c9ed8);
  func_0x001c079c(&uStack0000000000000140);
  __Unwind_Resume(uVar7);
  auVar35 = func_0x007a2668();
  auVar35._8_8_ = auVar35._8_8_;
  puVar19 = auVar35._0_8_;
  uVar33 = CONCAT44(uStack_128._4_4_,(int)uStack_128);
  piVar16 = auVar35._8_8_ + 0xda;
  lVar14 = *(long *)(auVar35._8_8_ + 0xde);
  uStack_128._0_4_ = (int)param_5;
  iVar4 = (int)uStack_128;
  if ((lVar14 != 0) && (piVar8 = *(int **)(auVar35._8_8_ + 0xdc), *piVar8 == 1)) {
    puVar25 = *(ulong **)(piVar8 + 4);
    puVar20 = *(ulong **)(piVar8 + 6);
    lVar21 = 0;
    if (puVar25 <= puVar20) {
      lVar21 = (long)puVar20 - (long)puVar25;
    }
    if (*(long *)(piVar8 + 2) + 4 == lVar21) {
      cStack_130 = (char)piVar16;
      uStack_12f = (undefined7)((ulong)piVar16 >> 8);
      uStack_128._4_4_ = (undefined4)((ulong)param_5 >> 0x20);
      uStack_120 = SUB81(param_6,0);
      uStack_11f = (undefined7)((ulong)param_6 >> 8);
      if (lVar14 == 1) {
        lVar21 = *(long *)(auVar35._8_8_ + 0xe0);
        auVar35._8_8_[0xe0] = 0;
        auVar35._8_8_[0xe1] = 0;
        puVar25 = *(ulong **)(piVar8 + 4);
        puVar20 = *(ulong **)(piVar8 + 6);
      }
      else {
        lVar21 = 0;
      }
      uStack_118 = 1;
      if (param_6 < puVar20 || puVar20 < puVar25) {
        func_0x007a23bc(&UNK_009c2900);
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x24e370);
        (*pcVar5)();
      }
      uVar1 = *(ushort *)((long)piVar8 + 0x22);
      iVar4 = piVar8[8];
      param_7[1] = param_7[1] + lVar21;
      auVar35._8_8_[0xde] = 0;
      auVar35._8_8_[0xdf] = 0;
      lVar14 = lVar14 + -1;
      if (lVar14 != 0) {
        _memmove(piVar8,piVar8 + 10,lVar14 * 0x28);
        *(long *)(auVar35._8_8_ + 0xde) = lVar14;
      }
      puVar19[1] = (long)param_5 + (long)puVar25;
      puVar19[2] = (long)puVar20 - (long)puVar25;
      *(undefined1 *)(puVar19 + 3) = 2;
      *(short *)((long)puVar19 + 0x1a) = (short)iVar4;
      *(uint *)((long)puVar19 + 0x1c) = (uint)uVar1;
      *puVar19 = 0x8000000000000027;
      return;
    }
  }
  iVar3 = auVar35._8_8_[0xca];
  uStack_220 = (long)param_5 + (long)param_6;
  puVar25 = (ulong *)*param_7;
  puVar30 = puVar19;
  puStack_200 = param_5;
  uStack_1f8 = uStack_220;
  uStack_128 = uVar33;
  if (param_6 < puVar25) {
code_r0x0024e1a8:
    uVar29 = SUB82(puVar30,0);
    func_0x007a28a4(puVar25,param_6,&UNK_009c9f68);
    iVar23 = iVar4;
    uVar31 = uStack_204;
code_r0x0024e1bc:
    uStack_204 = uVar31;
    puVar19 = puStack_210;
    param_3 = puStack_268;
    param_4 = puStack_260;
    uVar2 = unaff_x23 + 5;
    uStack_1a8 = unaff_x26;
    uStack_19c = uStack_204;
    uStack_1a0 = (char)iVar23;
    uStack_19e = uVar29;
    uStack_19f = (undefined1)uStack_270;
joined_r0x0024e20c:
    uVar31 = unaff_w21 & 0xff;
    if (uVar31 < 3) {
      puStack_210 = puVar19;
      if (uVar31 < 2) {
code_r0x0024e1dc:
        *(undefined2 *)((long)puStack_210 + 0x1a) = 10;
        puVar19 = puStack_210;
code_r0x0024e1e8:
        *puVar19 = 0x8000000000000027;
        return;
      }
      uStack_1b0 = 7;
    }
    else {
      uVar33 = 3;
      if (uVar31 != 4) {
        uVar33 = 0x11;
      }
      uStack_1b0 = 10;
      if (uVar31 != 3) {
        uStack_1b0 = uVar33;
      }
    }
    uStack_1b0 = uStack_1b0 | uVar2 & 0xffffffffffffff00;
    uStack_1b8 = 0x8000000000000014;
    func_0x0024e5e4(puVar19,auVar35._8_8_,&uStack_1b8,param_3,param_4);
    return;
  }
  puVar30 = (undefined8 *)0x0;
  uVar33 = 0;
  puVar20 = param_3;
  puVar11 = param_4;
  puVar12 = param_5;
code_r0x0024da58:
  uVar26 = (long)param_6 - (long)puVar25;
  uVar27 = (long)param_5 + (long)puVar25;
  cStack_130 = (char)uVar27;
  uStack_12f = (undefined7)(uVar27 >> 8);
  puStack_268 = param_3;
  puStack_260 = param_4;
  puStack_210 = puVar19;
  uStack_128 = uVar26;
  uVar2 = uStack_270;
  uStack_1a8 = unaff_x26;
  uStack_19c = uStack_204;
  uStack_1a0 = (char)uVar33;
  uStack_19e = (short)puVar30;
  uStack_19f = (undefined1)uStack_220;
  if ((short)iVar3 == 5) {
    uStack_120 = 0;
    uStack_11f = 0;
    uVar9 = func_0x00256ec0(&cStack_130);
    uStack_224 = (uint)uVar9 & 0xffff;
    unaff_w21 = (uint)(uVar9 >> 0x10);
    if (uStack_224 != 10) {
      lStack_218 = 0;
      do {
        unaff_x23 = uVar27;
        uVar29 = (undefined2)uStack_224;
        uVar24 = (undefined2)(uVar9 >> 0x10);
        puVar30 = (undefined8 *)(ulong)uStack_224;
        unaff_x26 = uVar9 >> 0x30;
        uVar27 = unaff_x26 + 5;
        bVar6 = uVar26 < uVar27;
        uVar26 = uVar26 - uVar27;
        if (bVar6) goto code_r0x0024e1dc;
        uVar33 = uVar9 >> 0x20 & 0xff;
        uStack_220 = uVar9 >> 0x28;
        uVar13 = (undefined1)(uVar9 >> 0x28);
        lStack_218 = uVar27 + lStack_218;
        lStack_1d0 = unaff_x23 + 5;
        uVar32 = (undefined1)(uVar9 >> 0x20);
        uVar31 = (uint)(uVar9 >> 0x10) & 0xffff | uStack_204 & 0xffff0000;
        uStack_1c8 = unaff_x26;
        uStack_1c0 = uVar32;
        uStack_1bf = uVar13;
        uStack_1be = uVar29;
        uStack_1bc = uVar31;
        if ((((int)uVar33 == 0) ||
            ((((int)uVar33 == 1 && (unaff_x26 < 3)) && ((*(byte *)(auVar35._8_8_ + 0x12) & 1) == 0))
            )) && (*(long *)(auVar35._8_8_ + 0xde) == 0)) goto code_r0x0024de54;
        if (*(char *)((long)auVar35._8_8_ + 0x4a) != '\x02') goto code_r0x0024ddcc;
        puVar34 = *(ulong **)(auVar35._8_8_ + 0x10);
        puVar20 = puVar34;
        (**(code **)(*(long *)(auVar35._8_8_ + 10) + 0x18))
                  (&cStack_130,*(undefined8 *)(auVar35._8_8_ + 8),&lStack_1d0);
        lStack_180 = CONCAT71(uStack_12f,cStack_130);
        if (lStack_180 == -0x7fffffffffffffd9) {
          *(long *)(auVar35._8_8_ + 0x10) = (long)puVar34 + 1;
          if ((*(byte *)(auVar35._8_8_ + 0x12) & 1) == 0) {
            *(undefined1 *)(auVar35._8_8_ + 0x12) = 1;
          }
          if (uStack_118._2_2_ != 10) goto code_r0x0024de0c;
        }
        else {
          uStack_178 = uStack_128;
          if (((lStack_180 != -0x7fffffffffffffe9) || (*auVar35._8_8_ != 1)) ||
             (*(ulong *)(auVar35._8_8_ + 2) < unaff_x26)) goto code_r0x0024e120;
          auVar35._8_8_[0] = 1;
          auVar35._8_8_[1] = 0;
          *(ulong *)(auVar35._8_8_ + 2) = *(ulong *)(auVar35._8_8_ + 2) - unaff_x26;
          func_0x002550e4(&cStack_130);
        }
        uVar27 = unaff_x23 + uVar27;
        piVar8 = *(int **)(auVar35._8_8_ + 0xdc);
        lVar14 = *(long *)(auVar35._8_8_ + 0xde) * 0x28;
        while (lVar14 != 0) {
          if (*piVar8 != 1) goto code_r0x0024e070;
          plVar10 = (long *)(piVar8 + 2);
          puVar18 = (ulong *)(piVar8 + 4);
          puVar34 = (ulong *)(piVar8 + 6);
          piVar8 = piVar8 + 10;
          lVar21 = 0;
          if (*puVar18 <= *puVar34) {
            lVar21 = *puVar34 - *puVar18;
          }
          lVar14 = lVar14 + -0x28;
          if (*plVar10 + 4 != lVar21) goto code_r0x0024e070;
        }
        cStack_130 = (char)uVar27;
        uStack_12f = (undefined7)(uVar27 >> 8);
        uStack_120 = 0;
        uStack_11f = 0;
        uStack_128 = uVar26;
        uVar9 = func_0x00256ec0(&cStack_130);
        uStack_224 = (uint)uVar9 & 0xffff;
        unaff_w21 = (uint)(uVar9 >> 0x10);
        if (uStack_224 == 10) {
          uVar2 = unaff_x23 + 5;
          uStack_1a8 = unaff_x26;
          uStack_19c = uVar31;
          uStack_1a0 = uVar32;
          uStack_19e = uVar29;
          uStack_19f = uVar13;
          break;
        }
      } while( true );
    }
  }
  else {
    uStack_120 = 0;
    uStack_11f = 0;
    uVar9 = func_0x00256ec0(&cStack_130);
    uStack_224 = (uint)uVar9 & 0xffff;
    unaff_w21 = (uint)(uVar9 >> 0x10);
    if (uStack_224 != 10) {
      lStack_218 = 0;
      do {
        unaff_x23 = uVar27;
        uVar29 = (undefined2)uStack_224;
        uVar24 = (undefined2)(uVar9 >> 0x10);
        puVar30 = (undefined8 *)(ulong)uStack_224;
        unaff_x26 = uVar9 >> 0x30;
        uVar27 = unaff_x26 + 5;
        bVar6 = uVar26 < uVar27;
        uVar26 = uVar26 - uVar27;
        if (bVar6) goto code_r0x0024e1dc;
        uVar33 = uVar9 >> 0x20 & 0xff;
        uStack_220 = uVar9 >> 0x28;
        uStack_270._0_1_ = (undefined1)(uVar9 >> 0x28);
        lStack_218 = uVar27 + lStack_218;
        lStack_1d0 = unaff_x23 + 5;
        iVar23 = (int)uVar33;
        uStack_1c0 = (undefined1)(uVar9 >> 0x20);
        uVar31 = (uint)(uVar9 >> 0x10) & 0xffff | uStack_204 & 0xffff0000;
        uStack_1c8 = unaff_x26;
        uStack_1bf = (undefined1)uStack_270;
        uStack_1be = uVar29;
        uStack_1bc = uVar31;
        if ((iVar23 == 0) && (*(long *)(auVar35._8_8_ + 0xde) == 0)) {
          uVar33 = 0;
code_r0x0024de54:
          uVar31 = (uint)uVar33;
          goto code_r0x0024de60;
        }
        if (*(char *)((long)auVar35._8_8_ + 0x4a) != '\x02') goto code_r0x0024ddcc;
        puVar34 = *(ulong **)(auVar35._8_8_ + 0x10);
        puVar20 = puVar34;
        (**(code **)(*(long *)(auVar35._8_8_ + 10) + 0x18))
                  (&cStack_130,*(undefined8 *)(auVar35._8_8_ + 8),&lStack_1d0);
        lStack_180 = CONCAT71(uStack_12f,cStack_130);
        if (lStack_180 == -0x7fffffffffffffd9) {
          *(long *)(auVar35._8_8_ + 0x10) = (long)puVar34 + 1;
          if ((*(byte *)(auVar35._8_8_ + 0x12) & 1) == 0) {
            *(undefined1 *)(auVar35._8_8_ + 0x12) = 1;
          }
          if (uStack_118._2_2_ != 10) goto code_r0x0024ddec;
        }
        else {
          uStack_178 = uStack_128;
          if (((lStack_180 != -0x7fffffffffffffe9) || (*auVar35._8_8_ != 1)) ||
             (*(ulong *)(auVar35._8_8_ + 2) < unaff_x26)) {
code_r0x0024e120:
            uStack_170 = CONCAT71(uStack_11f,uStack_120);
            uStack_1f0 = uStack_10f;
            uStack_168 = (byte)uStack_118;
            uStack_167 = uStack_118._1_1_;
            uStack_166 = uStack_118._2_2_;
            uStack_164 = uStack_118._4_2_;
            uStack_162 = uStack_118._6_2_;
            uStack_160 = uStack_110;
            uStack_15f = uStack_10f;
            uStack_128 = uStack_178;
            func_0x0024e5e4(puVar19,auVar35._8_8_,&lStack_180,param_3,param_4);
            return;
          }
          auVar35._8_8_[0] = 1;
          auVar35._8_8_[1] = 0;
          *(ulong *)(auVar35._8_8_ + 2) = *(ulong *)(auVar35._8_8_ + 2) - unaff_x26;
          func_0x002550e4(&cStack_130);
        }
        uVar27 = unaff_x23 + uVar27;
        piVar8 = *(int **)(auVar35._8_8_ + 0xdc);
        lVar14 = *(long *)(auVar35._8_8_ + 0xde) * 0x28;
        while (lVar14 != 0) {
          if (*piVar8 != 1) goto code_r0x0024e070;
          plVar10 = (long *)(piVar8 + 2);
          puVar18 = (ulong *)(piVar8 + 4);
          puVar34 = (ulong *)(piVar8 + 6);
          piVar8 = piVar8 + 10;
          lVar21 = 0;
          if (*puVar18 <= *puVar34) {
            lVar21 = *puVar34 - *puVar18;
          }
          lVar14 = lVar14 + -0x28;
          if (*plVar10 + 4 != lVar21) goto code_r0x0024e070;
        }
        cStack_130 = (char)uVar27;
        uStack_12f = (undefined7)(uVar27 >> 8);
        uStack_120 = 0;
        uStack_11f = 0;
        uStack_128 = uVar26;
        uVar9 = func_0x00256ec0(&cStack_130);
        uStack_224 = (uint)uVar9 & 0xffff;
        unaff_w21 = (uint)(uVar9 >> 0x10);
        if (uStack_224 == 10) goto code_r0x0024e1bc;
      } while( true );
    }
  }
  goto joined_r0x0024e20c;
code_r0x0024de0c:
  uVar27 = CONCAT71(uStack_11f,uStack_120);
  uVar26 = uStack_128;
  uVar13 = uStack_118._1_1_;
  sVar28 = uStack_118._2_2_;
  uStack_204 = uVar31;
  goto code_r0x0024de18;
code_r0x0024ddcc:
  uVar31 = (uint)uVar33;
code_r0x0024de60:
  sVar28 = (short)puVar30;
  uVar13 = (undefined1)uStack_220;
  uVar26 = unaff_x23 + 5;
  uVar27 = uStack_1c8;
  unaff_x26 = uStack_1c8;
  uStack_270 = uVar26;
  uStack_204 = uStack_1bc;
  goto code_r0x0024de74;
code_r0x0024e070:
  *puVar19 = 0x800000000000001a;
  uVar13 = 0x2a;
  goto code_r0x0024e080;
code_r0x0024ddec:
  uVar27 = CONCAT71(uStack_11f,uStack_120);
  uVar26 = uStack_128;
  uVar13 = uStack_118._1_1_;
  sVar28 = uStack_118._2_2_;
  uStack_204 = uVar31;
code_r0x0024de18:
  uStack_128._4_4_ = (undefined4)(uVar26 >> 0x20);
  uVar31 = (uint)(byte)uStack_118;
  uVar24 = uStack_118._4_2_;
  uStack_270 = unaff_x23 + 5;
  uStack_128 = uVar26;
  if (puVar34 == (ulong *)0xffffffffffff0000) {
    if ((*(byte *)((long)auVar35._8_8_ + 0x335) & 1) == 0) {
      *(undefined2 *)((long)auVar35._8_8_ + 0x335) = 0x101;
      uStack_78 = 4;
      cStack_130 = '\x01';
      uStack_12f = 0x80000000000000;
      uStack_128._0_4_ = 0;
      puVar20 = (ulong *)(ulong)(*(char *)((long)auVar35._8_8_ + 0x49) == '\x02');
      func_0x00248ae4(auVar35._8_8_,&cStack_130);
      puVar30 = (undefined8 *)(ulong)uStack_224;
      unaff_x23 = uVar26;
      uStack_128 = CONCAT44(uStack_128._4_4_,(int)uStack_128);
    }
    else {
      puVar30 = (undefined8 *)(ulong)uStack_224;
    }
  }
  else {
    puVar30 = (undefined8 *)(ulong)uStack_224;
  }
code_r0x0024de74:
  piVar8 = *(int **)(auVar35._8_8_ + 0xdc);
  lVar14 = *(long *)(auVar35._8_8_ + 0xde) * 0x28;
  do {
    if (lVar14 == 0) {
      bVar6 = uVar31 == 2;
      goto joined_r0x0024ded8;
    }
    if (*piVar8 != 1) break;
    plVar10 = (long *)(piVar8 + 2);
    puVar18 = (ulong *)(piVar8 + 4);
    puVar34 = (ulong *)(piVar8 + 6);
    piVar8 = piVar8 + 10;
    lVar21 = 0;
    if (*puVar18 <= *puVar34) {
      lVar21 = *puVar34 - *puVar18;
    }
    lVar14 = lVar14 + -0x28;
  } while (*plVar10 + 4 == lVar21);
  if (uVar31 != 2) {
    *puVar19 = 0x800000000000001a;
    uVar13 = 0x1d;
code_r0x0024e080:
    *(undefined1 *)(puVar19 + 1) = uVar13;
    return;
  }
  bVar6 = true;
joined_r0x0024ded8:
  if (uVar27 == 0) {
    if ((char)auVar35._8_8_[0xf0] == ' ') {
      *puVar19 = 0x800000000000001a;
      uVar13 = 0x3f;
      goto code_r0x0024e080;
    }
    cVar17 = (char)auVar35._8_8_[0xf0] + '\x01';
  }
  else {
    cVar17 = '\0';
  }
  *(char *)(auVar35._8_8_ + 0xf0) = cVar17;
  puVar25 = (ulong *)(lStack_218 + (long)puVar25);
  *param_7 = (ulong)puVar25;
  puVar18 = (ulong *)(uVar26 - (long)param_5);
  puVar34 = (ulong *)((long)puVar18 + uVar27);
  if (bVar6) {
    if ((puVar34 < puVar18) || (param_6 < puVar34)) goto code_r0x0024e370;
    lStack_148 = (long)param_5 + (long)puVar18;
    uStack_138 = 2;
    puVar11 = puVar25;
    uStack_140 = uVar27;
    uStack_137 = uVar13;
    sStack_136 = sVar28;
    uStack_134 = uVar24;
    func_0x001bffc0(piVar16,&lStack_148,&puStack_200);
    puVar20 = param_6;
    func_0x001c0230(&cStack_130,piVar16,param_5);
    if (cStack_130 != '\x15') {
      *(ulong *)((long)puVar19 + 0x11) = CONCAT17(uStack_120,(int7)(uStack_128 >> 8));
      *(ulong *)((long)puVar19 + 9) = CONCAT17((undefined1)uStack_128,uStack_12f);
      puVar19[3] = CONCAT71(uStack_11f,uStack_120);
      *puVar19 = 0x8000000000000014;
      *(char *)(puVar19 + 1) = cStack_130;
      return;
    }
    piVar15 = *(int **)(auVar35._8_8_ + 0xdc);
    unaff_w21 = 0x27;
    piVar8 = piVar15;
    lVar14 = *(long *)(auVar35._8_8_ + 0xde) * 0x28;
    do {
      lVar21 = lVar14;
      if ((lVar21 == 0) || (*piVar8 != 1)) break;
      plVar10 = (long *)(piVar8 + 2);
      puVar18 = (ulong *)(piVar8 + 4);
      puVar34 = (ulong *)(piVar8 + 6);
      piVar8 = piVar8 + 10;
      lVar22 = 0;
      if (*puVar18 <= *puVar34) {
        lVar22 = *puVar34 - *puVar18;
      }
      lVar14 = lVar21 + -0x28;
    } while (*plVar10 + 4 == lVar22);
    *(bool *)((long)auVar35._8_8_ + 0x331) = lVar21 == 0;
    if ((*(long *)(auVar35._8_8_ + 0xde) == 0) || (*piVar15 != 1)) {
code_r0x0024e010:
      if (param_6 < puVar25) goto code_r0x0024e1a8;
      goto code_r0x0024da58;
    }
    lVar14 = 0;
    if (*(ulong *)(piVar15 + 4) <= *(ulong *)(piVar15 + 6)) {
      lVar14 = *(ulong *)(piVar15 + 6) - *(ulong *)(piVar15 + 4);
    }
    if (*(long *)(piVar15 + 2) + 4 != lVar14) goto code_r0x0024e010;
    auVar35._8_8_[0] = 0;
    auVar35._8_8_[1] = 0;
    auVar35._8_8_ = auVar35._8_8_;
    auVar35._0_8_ = puVar19 + 1;
    puVar20 = param_5;
    puVar11 = param_6;
    puVar12 = param_7;
  }
  else {
    if ((puVar34 >= puVar18) && (puVar34 <= param_6)) {
      param_7[1] = param_7[1] + lStack_218;
      puVar19[1] = (long)param_5 + (long)puVar18;
      puVar19[2] = uVar27;
      *(char *)(puVar19 + 3) = (char)uVar31;
      *(undefined1 *)((long)puVar19 + 0x19) = uVar13;
      *(short *)((long)puVar19 + 0x1a) = sVar28;
      *(undefined2 *)((long)puVar19 + 0x1c) = uVar24;
      goto code_r0x0024e1e8;
    }
code_r0x0024e370:
    uVar7 = func_0x007a23bc(&UNK_009c9ed8);
    func_0x001c079c(&cStack_130);
    __Unwind_Resume(uVar7);
    auVar35 = func_0x007a2668();
  }
  lVar21 = auVar35._8_8_;
  plVar10 = auVar35._0_8_;
  lVar14 = *(long *)(lVar21 + 0x378);
  if (lVar14 == 0) {
    *(undefined2 *)((long)plVar10 + 0x12) = 10;
    return;
  }
  piVar16 = *(int **)(lVar21 + 0x370);
  if (*piVar16 == 1) {
    puVar25 = *(ulong **)(piVar16 + 4);
    puVar34 = *(ulong **)(piVar16 + 6);
    lVar22 = 0;
    if (puVar25 <= puVar34) {
      lVar22 = (long)puVar34 - (long)puVar25;
    }
    if (*(long *)(piVar16 + 2) + 4 == lVar22) {
      if (lVar14 == 1) {
        lVar22 = *(long *)(lVar21 + 0x380);
        *(undefined8 *)(lVar21 + 0x380) = 0;
        puVar25 = *(ulong **)(piVar16 + 4);
        puVar34 = *(ulong **)(piVar16 + 6);
      }
      else {
        lVar22 = 0;
      }
      if (puVar11 < puVar34 || puVar34 < puVar25) {
        func_0x007a23bc(&UNK_009c2900);
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x24e4a4);
        (*pcVar5)();
      }
      iVar4 = piVar16[8];
      *plVar10 = (long)puVar20 + (long)puVar25;
      plVar10[1] = (long)puVar34 - (long)puVar25;
      *(undefined1 *)(plVar10 + 2) = 2;
      *(int *)((long)plVar10 + 0x12) = iVar4;
      puVar12[1] = puVar12[1] + lVar22;
      *(undefined8 *)(lVar21 + 0x378) = 0;
      lVar14 = lVar14 + -1;
      if (lVar14 == 0) {
        return;
      }
      _memmove(*(long *)(lVar21 + 0x370),*(long *)(lVar21 + 0x370) + 0x28,lVar14 * 0x28);
      goto code_r0x0024e408;
    }
  }
  *(undefined2 *)((long)plVar10 + 0x12) = 10;
  *(undefined8 *)(lVar21 + 0x378) = 0;
code_r0x0024e408:
  *(long *)(lVar21 + 0x378) = lVar14;
  return;
}

