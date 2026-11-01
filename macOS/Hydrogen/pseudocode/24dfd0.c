
/* WARNING: Possible PIC construction at 0x0024e354: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0024e358) */

void FUN_0024dfd0(int *param_1,undefined8 param_2,undefined8 param_3,ulong param_4,ulong param_5,
                 ulong *param_6,ulong param_7,undefined8 param_8,undefined8 param_9,ulong param_10,
                 undefined8 param_11,undefined8 param_12,undefined8 param_13,undefined8 param_14,
                 ulong param_15,ulong param_16,ulong *param_17,undefined8 param_18,
                 undefined8 param_19,ulong param_20,undefined8 param_21,undefined8 *param_22,
                 undefined8 param_23,undefined1 param_24,undefined8 param_25,undefined8 param_26,
                 undefined8 param_27,undefined8 param_28,undefined8 param_29,long param_30,
                 ulong param_31,undefined8 param_32,undefined8 param_33,ulong param_34,
                 ulong param_35,undefined1 param_36,undefined8 param_37,undefined8 param_38,
                 undefined8 param_39,long param_40,ulong param_41,undefined8 param_42,byte param_43,
                 undefined1 param_44,undefined8 param_45,undefined1 param_46,long param_47,
                 ulong param_48,undefined8 param_49,undefined8 param_50,ulong param_51,
                 undefined8 param_52,undefined8 param_53,undefined1 param_54 [16],
                 undefined1 param_55)

{
  ulong *puVar1;
  ulong *puVar2;
  int iVar3;
  code *pcVar4;
  bool bVar5;
  ulong uVar6;
  undefined8 uVar7;
  long *plVar8;
  undefined1 uVar9;
  long lVar10;
  undefined1 uVar11;
  char cVar12;
  int *piVar13;
  long in_x9;
  ulong uVar14;
  long in_x10;
  int *in_x11;
  long lVar15;
  long in_x12;
  long in_x13;
  long in_x15;
  ulong unaff_x19;
  int *unaff_x20;
  undefined2 uVar16;
  uint unaff_w21;
  ulong unaff_x22;
  ulong unaff_x23;
  short sVar17;
  undefined2 uVar18;
  uint unaff_w25;
  ulong unaff_x26;
  uint uVar19;
  ulong uVar20;
  ulong unaff_x28;
  undefined1 auVar21 [16];
  undefined1 uStack00000000000000d1;
  undefined2 uStack00000000000000d2;
  uint uStack00000000000000d4;
  undefined1 uStack0000000000000109;
  short sStack000000000000010a;
  undefined2 uStack000000000000010c;
  undefined2 uStack000000000000010e;
  undefined8 uStack0000000000000111;
  
  param_19._4_4_ = unaff_w25;
code_r0x0024dfd0:
  piVar13 = in_x11;
  if (in_x15 == in_x13) goto LAB_0024dfa0;
code_r0x0024dfd8:
  uVar18 = (undefined2)param_19._4_4_;
  *(bool *)((long)unaff_x20 + 0x331) = in_x10 == 0;
  if ((in_x9 == 0) || (*param_1 != 1)) {
LAB_0024e010:
    if (param_7 < unaff_x22) {
      func_0x007a28a4(unaff_x22,param_7,&UNK_009c9f68);
      unaff_x28 = unaff_x19;
      uVar19 = param_23._4_4_;
code_r0x0024e1bc:
      param_23._4_4_ = uVar19;
      uStack00000000000000d1 = (undefined1)param_10;
      param_10 = unaff_x23 + 5;
      uVar20 = unaff_x26;
      uStack00000000000000d4 = param_23._4_4_;
      uVar9 = (char)unaff_x28;
      uStack00000000000000d2 = uVar18;
    }
    else {
      param_7 = param_7 - unaff_x22;
      uVar14 = unaff_x19 + unaff_x22;
      param_50._0_1_ = (char)uVar14;
      param_50._1_7_ = (undefined7)(uVar14 >> 8);
      param_51 = param_7;
      uVar9 = (char)unaff_x28;
      uStack00000000000000d2 = uVar18;
      if (param_13._4_4_ == 5) {
        param_52._0_1_ = 0;
        param_52._1_7_ = 0;
        uVar6 = func_0x00256ec0(&param_50);
        param_19._4_4_ = (uint)uVar6 & 0xffff;
        unaff_w21 = (uint)(uVar6 >> 0x10);
        uVar20 = unaff_x26;
        uStack00000000000000d4 = param_23._4_4_;
        uStack00000000000000d1 = (undefined1)param_20;
        if (param_19._4_4_ != 10) {
          param_21 = 0;
          do {
            unaff_x23 = uVar14;
            uVar18 = (undefined2)param_19._4_4_;
            uVar16 = (undefined2)(uVar6 >> 0x10);
            unaff_x26 = uVar6 >> 0x30;
            uVar14 = unaff_x26 + 5;
            bVar5 = param_7 < uVar14;
            param_7 = param_7 - uVar14;
            if (bVar5) goto code_r0x0024e1dc;
            unaff_x28 = uVar6 >> 0x20 & 0xff;
            param_10 = uVar6 >> 0x28;
            uVar11 = (undefined1)(uVar6 >> 0x28);
            param_21 = uVar14 + param_21;
            param_30 = unaff_x23 + 5;
            uVar9 = (undefined1)(uVar6 >> 0x20);
            uVar19 = (uint)(uVar6 >> 0x10) & 0xffff | param_23._4_4_ & 0xffff0000;
            param_31 = unaff_x26;
            param_32._0_1_ = uVar9;
            param_32._1_1_ = uVar11;
            param_32._2_2_ = uVar18;
            param_32._4_4_ = uVar19;
            if ((((int)unaff_x28 == 0) ||
                ((((int)unaff_x28 == 1 && (unaff_x26 < 3)) &&
                 ((*(byte *)(unaff_x20 + 0x12) & 1) == 0)))) && (*(long *)(unaff_x20 + 0xde) == 0))
            goto code_r0x0024de54;
            if (*(char *)((long)unaff_x20 + 0x4a) != '\x02') goto code_r0x0024ddcc;
            uVar20 = *(ulong *)(unaff_x20 + 0x10);
            param_4 = uVar20;
            (**(code **)(*(long *)(unaff_x20 + 10) + 0x18))
                      (&param_50,*(undefined8 *)(unaff_x20 + 8),&param_30);
            lVar10 = CONCAT71(param_50._1_7_,(char)param_50);
            if (lVar10 == -0x7fffffffffffffd9) {
              *(ulong *)(unaff_x20 + 0x10) = uVar20 + 1;
              if ((*(byte *)(unaff_x20 + 0x12) & 1) == 0) {
                *(undefined1 *)(unaff_x20 + 0x12) = 1;
              }
              if (param_53._2_2_ != 10) goto code_r0x0024de0c;
            }
            else {
              uVar20 = param_51;
              if ((lVar10 != -0x7fffffffffffffe9) || (uVar20 = param_51, *unaff_x20 != 1))
              goto code_r0x0024e120;
              uVar20 = param_51;
              if (*(ulong *)(unaff_x20 + 2) < unaff_x26) goto code_r0x0024e120;
              unaff_x20[0] = 1;
              unaff_x20[1] = 0;
              *(ulong *)(unaff_x20 + 2) = *(ulong *)(unaff_x20 + 2) - unaff_x26;
              func_0x002550e4(&param_50);
            }
            uVar14 = unaff_x23 + uVar14;
            piVar13 = *(int **)(unaff_x20 + 0xdc);
            lVar10 = *(long *)(unaff_x20 + 0xde) * 0x28;
            while (lVar10 != 0) {
              if (*piVar13 != 1) goto code_r0x0024e070;
              plVar8 = (long *)(piVar13 + 2);
              puVar2 = (ulong *)(piVar13 + 4);
              puVar1 = (ulong *)(piVar13 + 6);
              piVar13 = piVar13 + 10;
              lVar15 = 0;
              if (*puVar2 <= *puVar1) {
                lVar15 = *puVar1 - *puVar2;
              }
              lVar10 = lVar10 + -0x28;
              if (*plVar8 + 4 != lVar15) goto code_r0x0024e070;
            }
            param_50._0_1_ = (char)uVar14;
            param_50._1_7_ = (undefined7)(uVar14 >> 8);
            param_52._0_1_ = 0;
            param_52._1_7_ = 0;
            param_51 = param_7;
            uVar6 = func_0x00256ec0(&param_50);
            param_19._4_4_ = (uint)uVar6 & 0xffff;
            unaff_w21 = (uint)(uVar6 >> 0x10);
            if (param_19._4_4_ == 10) {
              param_10 = unaff_x23 + 5;
              uVar20 = unaff_x26;
              uStack00000000000000d4 = uVar19;
              uStack00000000000000d1 = uVar11;
              uStack00000000000000d2 = uVar18;
              break;
            }
          } while( true );
        }
      }
      else {
        param_52._0_1_ = 0;
        param_52._1_7_ = 0;
        uVar6 = func_0x00256ec0(&param_50);
        param_19._4_4_ = (uint)uVar6 & 0xffff;
        unaff_w21 = (uint)(uVar6 >> 0x10);
        uVar20 = unaff_x26;
        uStack00000000000000d4 = param_23._4_4_;
        uStack00000000000000d1 = (undefined1)param_20;
        if (param_19._4_4_ != 10) {
          param_21 = 0;
          do {
            unaff_x23 = uVar14;
            uVar18 = (undefined2)param_19._4_4_;
            uVar16 = (undefined2)(uVar6 >> 0x10);
            unaff_x26 = uVar6 >> 0x30;
            uVar14 = unaff_x26 + 5;
            bVar5 = param_7 < uVar14;
            param_7 = param_7 - uVar14;
            if (bVar5) goto code_r0x0024e1dc;
            unaff_x28 = uVar6 >> 0x20 & 0xff;
            param_10 = uVar6 >> 0x28;
            param_21 = uVar14 + param_21;
            param_30 = unaff_x23 + 5;
            param_32._0_1_ = (undefined1)(uVar6 >> 0x20);
            uVar19 = (uint)(uVar6 >> 0x10) & 0xffff | param_23._4_4_ & 0xffff0000;
            param_32._1_1_ = (undefined1)(uVar6 >> 0x28);
            param_31 = unaff_x26;
            param_32._2_2_ = uVar18;
            param_32._4_4_ = uVar19;
            if (((int)unaff_x28 == 0) && (*(long *)(unaff_x20 + 0xde) == 0)) {
              unaff_x28 = 0;
code_r0x0024de54:
              uVar19 = (uint)unaff_x28;
              unaff_x19 = param_4;
              param_7 = param_5;
              param_20 = param_10;
              goto code_r0x0024de60;
            }
            if (*(char *)((long)unaff_x20 + 0x4a) != '\x02') goto code_r0x0024ddcc;
            uVar20 = *(ulong *)(unaff_x20 + 0x10);
            param_4 = uVar20;
            (**(code **)(*(long *)(unaff_x20 + 10) + 0x18))
                      (&param_50,*(undefined8 *)(unaff_x20 + 8),&param_30);
            lVar10 = CONCAT71(param_50._1_7_,(char)param_50);
            if (lVar10 == -0x7fffffffffffffd9) {
              *(ulong *)(unaff_x20 + 0x10) = uVar20 + 1;
              if ((*(byte *)(unaff_x20 + 0x12) & 1) == 0) {
                *(undefined1 *)(unaff_x20 + 0x12) = 1;
              }
              if (param_53._2_2_ != 10) goto code_r0x0024ddec;
            }
            else {
              uVar20 = param_51;
              if ((lVar10 != -0x7fffffffffffffe9) || (uVar20 = param_51, *unaff_x20 != 1)) {
code_r0x0024e120:
                param_41 = uVar20;
                param_42 = CONCAT71(param_52._1_7_,(undefined1)param_52);
                param_26 = param_54._1_8_;
                param_27._7_1_ = param_55;
                param_43 = (byte)param_53;
                uStack0000000000000109 = param_53._1_1_;
                sStack000000000000010a = param_53._2_2_;
                uStack000000000000010c = param_53._4_2_;
                uStack000000000000010e = param_53._6_2_;
                param_44 = param_54[0];
                uStack0000000000000111 = param_54._1_8_;
                param_46 = param_55;
                param_40 = lVar10;
                param_51 = param_41;
                func_0x0024e5e4(param_22);
                return;
              }
              uVar20 = param_51;
              if (*(ulong *)(unaff_x20 + 2) < unaff_x26) goto code_r0x0024e120;
              unaff_x20[0] = 1;
              unaff_x20[1] = 0;
              *(ulong *)(unaff_x20 + 2) = *(ulong *)(unaff_x20 + 2) - unaff_x26;
              func_0x002550e4(&param_50);
            }
            uVar14 = unaff_x23 + uVar14;
            piVar13 = *(int **)(unaff_x20 + 0xdc);
            lVar10 = *(long *)(unaff_x20 + 0xde) * 0x28;
            while (lVar10 != 0) {
              if (*piVar13 != 1) goto code_r0x0024e070;
              plVar8 = (long *)(piVar13 + 2);
              puVar2 = (ulong *)(piVar13 + 4);
              puVar1 = (ulong *)(piVar13 + 6);
              piVar13 = piVar13 + 10;
              lVar15 = 0;
              if (*puVar2 <= *puVar1) {
                lVar15 = *puVar1 - *puVar2;
              }
              lVar10 = lVar10 + -0x28;
              if (*plVar8 + 4 != lVar15) goto code_r0x0024e070;
            }
            param_50._0_1_ = (char)uVar14;
            param_50._1_7_ = (undefined7)(uVar14 >> 8);
            param_52._0_1_ = 0;
            param_52._1_7_ = 0;
            param_51 = param_7;
            uVar6 = func_0x00256ec0(&param_50);
            param_19._4_4_ = (uint)uVar6 & 0xffff;
            unaff_w21 = (uint)(uVar6 >> 0x10);
            if (param_19._4_4_ == 10) goto code_r0x0024e1bc;
          } while( true );
        }
      }
    }
    param_36 = uVar9;
    param_35 = uVar20;
    uVar19 = unaff_w21 & 0xff;
    if (2 < uVar19) {
      uVar14 = 3;
      if (uVar19 != 4) {
        uVar14 = 0x11;
      }
      param_34 = 10;
      if (uVar19 != 3) {
        param_34 = uVar14;
      }
LAB_0024e238:
      param_34 = param_34 | param_10 & 0xffffffffffffff00;
      param_38 = CONCAT17(param_27._7_1_,(undefined7)param_27);
      param_39 = CONCAT17(param_28._7_1_,(undefined7)param_28);
      param_33 = 0x8000000000000014;
      param_37 = param_26;
      func_0x0024e5e4(param_22);
      return;
    }
    if (1 < uVar19) {
      param_34 = 7;
      goto LAB_0024e238;
    }
code_r0x0024e1dc:
    *(undefined2 *)((long)param_22 + 0x1a) = 10;
    goto code_r0x0024e1e8;
  }
  lVar10 = 0;
  if (*(ulong *)(param_1 + 4) <= *(ulong *)(param_1 + 6)) {
    lVar10 = *(ulong *)(param_1 + 6) - *(ulong *)(param_1 + 4);
  }
  if (*(long *)(param_1 + 2) + 4 != lVar10) goto LAB_0024e010;
  unaff_x20[0] = 0;
  unaff_x20[1] = 0;
  plVar8 = param_22 + 1;
  goto SUB_0024e394;
code_r0x0024de0c:
  uVar14 = CONCAT71(param_52._1_7_,(undefined1)param_52);
  uVar6 = param_51;
  param_20 = param_10;
  param_23._4_4_ = uVar19;
  goto code_r0x0024de18;
code_r0x0024ddcc:
  uVar19 = (uint)unaff_x28;
  unaff_x19 = param_4;
  param_7 = param_5;
  param_20 = param_10;
code_r0x0024de60:
  sVar17 = (short)param_19._4_4_;
  uVar9 = (undefined1)param_20;
  uVar6 = unaff_x23 + 5;
  uVar14 = param_31;
  unaff_x26 = param_31;
  param_10 = uVar6;
  param_23._4_4_ = param_32._4_4_;
  goto code_r0x0024de74;
code_r0x0024e070:
  *param_22 = 0x800000000000001a;
  uVar9 = 0x2a;
  goto code_r0x0024e080;
code_r0x0024ddec:
  uVar14 = CONCAT71(param_52._1_7_,(undefined1)param_52);
  uVar6 = param_51;
  param_20 = param_10;
  param_23._4_4_ = uVar19;
code_r0x0024de18:
  uVar16 = param_53._4_2_;
  sVar17 = param_53._2_2_;
  uVar9 = param_53._1_1_;
  param_51._4_4_ = (undefined4)(uVar6 >> 0x20);
  uVar19 = (uint)(byte)param_53;
  param_10 = unaff_x23 + 5;
  unaff_x19 = param_4;
  param_7 = param_5;
  param_51 = uVar6;
  if (uVar20 == 0xffffffffffff0000) {
    if ((*(byte *)((long)unaff_x20 + 0x335) & 1) == 0) {
      *(undefined2 *)((long)unaff_x20 + 0x335) = 0x101;
      param_50._0_1_ = '\x01';
      param_50._1_7_ = 0x80000000000000;
      param_51._0_4_ = 0;
      unaff_x19 = (ulong)(*(char *)((long)unaff_x20 + 0x49) == '\x02');
      func_0x00248ae4();
      param_7 = param_5;
      unaff_x23 = uVar6;
      param_51 = CONCAT44(param_51._4_4_,(undefined4)param_51);
    }
    else {
    }
  }
  else {
  }
code_r0x0024de74:
  piVar13 = *(int **)(unaff_x20 + 0xdc);
  lVar10 = *(long *)(unaff_x20 + 0xde) * 0x28;
  do {
    if (lVar10 == 0) {
      bVar5 = uVar19 == 2;
      goto joined_r0x0024ded8;
    }
    if (*piVar13 != 1) break;
    plVar8 = (long *)(piVar13 + 2);
    puVar2 = (ulong *)(piVar13 + 4);
    puVar1 = (ulong *)(piVar13 + 6);
    piVar13 = piVar13 + 10;
    lVar15 = 0;
    if (*puVar2 <= *puVar1) {
      lVar15 = *puVar1 - *puVar2;
    }
    lVar10 = lVar10 + -0x28;
  } while (*plVar8 + 4 == lVar15);
  if (uVar19 != 2) {
    *param_22 = 0x800000000000001a;
    uVar9 = 0x1d;
code_r0x0024e080:
    *(undefined1 *)(param_22 + 1) = uVar9;
    return;
  }
  bVar5 = true;
joined_r0x0024ded8:
  if (uVar14 == 0) {
    if ((char)unaff_x20[0xf0] == ' ') {
      *param_22 = 0x800000000000001a;
      uVar9 = 0x3f;
      goto code_r0x0024e080;
    }
    cVar12 = (char)unaff_x20[0xf0] + '\x01';
  }
  else {
    cVar12 = '\0';
  }
  *(char *)(unaff_x20 + 0xf0) = cVar12;
  unaff_x22 = param_21 + unaff_x22;
  *param_17 = unaff_x22;
  uVar6 = uVar6 - param_16;
  uVar20 = uVar6 + uVar14;
  if (bVar5) {
    if ((uVar6 <= uVar20) && (uVar20 <= param_15)) {
      param_47 = param_16 + uVar6;
      param_49._0_1_ = 2;
      param_5 = unaff_x22;
      param_48 = uVar14;
      param_49._1_1_ = uVar9;
      param_49._2_2_ = sVar17;
      param_49._4_2_ = uVar16;
      func_0x001bffc0(param_14,&param_47,&param_24);
      param_4 = param_15;
      func_0x001c0230(&param_50,param_14,param_16);
      if ((char)param_50 != '\x15') {
        *(ulong *)((long)param_22 + 0x11) = CONCAT17((undefined1)param_52,(int7)(param_51 >> 8));
        *(ulong *)((long)param_22 + 9) = CONCAT17((undefined1)param_51,param_50._1_7_);
        param_22[3] = CONCAT71(param_52._1_7_,(undefined1)param_52);
        *param_22 = 0x8000000000000014;
        *(char *)(param_22 + 1) = (char)param_50;
        return;
      }
      param_1 = *(int **)(unaff_x20 + 0xdc);
      in_x9 = *(long *)(unaff_x20 + 0xde);
      unaff_w21 = 0x27;
      param_7 = param_15;
      piVar13 = param_1;
      in_x12 = in_x9 * 0x28;
      unaff_x19 = param_16;
LAB_0024dfa0:
      in_x10 = in_x12;
      if ((in_x10 == 0) || (*piVar13 != 1)) goto code_r0x0024dfd8;
      in_x11 = piVar13 + 10;
      in_x15 = *(long *)(piVar13 + 2) + 4;
      in_x13 = 0;
      if (*(ulong *)(piVar13 + 4) <= *(ulong *)(piVar13 + 6)) {
        in_x13 = *(ulong *)(piVar13 + 6) - *(ulong *)(piVar13 + 4);
      }
      in_x12 = in_x10 + -0x28;
      goto code_r0x0024dfd0;
    }
  }
  else if ((uVar6 <= uVar20) && (uVar20 <= param_15)) {
    param_17[1] = param_17[1] + param_21;
    param_22[1] = param_16 + uVar6;
    param_22[2] = uVar14;
    *(char *)(param_22 + 3) = (char)uVar19;
    *(undefined1 *)((long)param_22 + 0x19) = uVar9;
    *(short *)((long)param_22 + 0x1a) = sVar17;
    *(undefined2 *)((long)param_22 + 0x1c) = uVar16;
code_r0x0024e1e8:
    *param_22 = 0x8000000000000027;
    return;
  }
  uVar7 = func_0x007a23bc(&UNK_009c9ed8);
  func_0x001c079c(&param_50);
  __Unwind_Resume(uVar7);
  auVar21 = func_0x007a2668();
  unaff_x20 = auVar21._8_8_;
  plVar8 = auVar21._0_8_;
  param_17 = param_6;
SUB_0024e394:
  lVar10 = *(long *)(unaff_x20 + 0xde);
  if (lVar10 == 0) {
    *(undefined2 *)((long)plVar8 + 0x12) = 10;
    return;
  }
  piVar13 = *(int **)(unaff_x20 + 0xdc);
  if (*piVar13 == 1) {
    uVar14 = *(ulong *)(piVar13 + 4);
    uVar20 = *(ulong *)(piVar13 + 6);
    lVar15 = 0;
    if (uVar14 <= uVar20) {
      lVar15 = uVar20 - uVar14;
    }
    if (*(long *)(piVar13 + 2) + 4 == lVar15) {
      if (lVar10 == 1) {
        lVar15 = *(long *)(unaff_x20 + 0xe0);
        unaff_x20[0xe0] = 0;
        unaff_x20[0xe1] = 0;
        uVar14 = *(ulong *)(piVar13 + 4);
        uVar20 = *(ulong *)(piVar13 + 6);
      }
      else {
        lVar15 = 0;
      }
      if (param_7 < uVar20 || uVar20 < uVar14) {
        func_0x007a23bc(&UNK_009c2900);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x24e4a4);
        (*pcVar4)();
      }
      iVar3 = piVar13[8];
      *plVar8 = unaff_x19 + uVar14;
      plVar8[1] = uVar20 - uVar14;
      *(undefined1 *)(plVar8 + 2) = 2;
      *(int *)((long)plVar8 + 0x12) = iVar3;
      param_17[1] = param_17[1] + lVar15;
      unaff_x20[0xde] = 0;
      unaff_x20[0xdf] = 0;
      lVar10 = lVar10 + -1;
      if (lVar10 == 0) {
        return;
      }
      _memmove(*(long *)(unaff_x20 + 0xdc),*(long *)(unaff_x20 + 0xdc) + 0x28,lVar10 * 0x28);
      goto LAB_0024e408;
    }
  }
  *(undefined2 *)((long)plVar8 + 0x12) = 10;
  unaff_x20[0xde] = 0;
  unaff_x20[0xdf] = 0;
LAB_0024e408:
  *(long *)(unaff_x20 + 0xde) = lVar10;
  return;
}

