
void FUN_00160810(long *param_1,undefined8 *param_2,long param_3,undefined8 param_4,
                 undefined8 param_5,long param_6)

{
  undefined1 uVar7;
  undefined1 uVar6;
  undefined1 uVar5;
  undefined1 uVar4;
  undefined1 uVar3;
  undefined1 uVar2;
  undefined1 uVar1;
  code *pcVar8;
  long *plVar9;
  undefined1 uVar10;
  undefined1 uVar11;
  undefined1 uVar12;
  undefined1 uVar13;
  undefined1 uVar14;
  undefined1 uVar15;
  undefined1 uVar16;
  undefined1 uVar17;
  undefined1 uVar18;
  long lStack_198;
  long lStack_190;
  long lStack_188;
  long lStack_148;
  long lStack_140;
  undefined1 uStack_138;
  undefined1 uStack_137;
  undefined1 uStack_136;
  undefined1 uStack_135;
  undefined1 uStack_134;
  undefined1 uStack_133;
  undefined1 uStack_132;
  undefined1 uStack_131;
  undefined1 uStack_130;
  undefined1 uStack_12f;
  undefined1 uStack_12e;
  undefined1 uStack_12d;
  undefined1 uStack_12c;
  undefined1 uStack_12b;
  undefined1 uStack_12a;
  undefined1 uStack_129;
  long lStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  undefined8 uStack_100;
  long lStack_f8;
  long lStack_f0;
  undefined1 uStack_e8;
  undefined1 uStack_e7;
  undefined1 uStack_e6;
  undefined1 uStack_e5;
  undefined1 uStack_e4;
  undefined1 uStack_e3;
  undefined1 uStack_e2;
  undefined1 uStack_e1;
  undefined1 uStack_e0;
  undefined1 uStack_df;
  undefined1 uStack_de;
  undefined1 uStack_dd;
  undefined1 uStack_dc;
  undefined1 uStack_db;
  undefined1 uStack_da;
  undefined1 uStack_d9;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  undefined1 uStack_c0;
  undefined4 uStack_b0;
  undefined3 uStack_ac;
  long lStack_a9;
  long lStack_a1;
  long lStack_89;
  long lStack_81;
  long lStack_79;
  undefined1 uStack_71;
  
  func_0x001652a0(&uStack_100,*param_2,*(undefined8 *)(param_3 + 8),*(undefined8 *)(param_3 + 0x10),
                  *(undefined8 *)(param_6 + 8),*(undefined8 *)(param_6 + 0x10));
  if ((uStack_100 & 1) == 0) {
    uStack_ac = (undefined3)(uStack_100 >> 0x28);
    lStack_108 = lStack_d0;
    lStack_110 = lStack_d8;
    lStack_a1 = lStack_f0;
    lStack_a9 = lStack_f8;
    lStack_81 = lStack_d0;
    lStack_89 = lStack_d8;
    lStack_79 = lStack_c8;
    uStack_71 = uStack_c0;
    uStack_b0 = uStack_100._1_4_;
    func_0x001678e0(&lStack_148,param_2,&uStack_b0,param_4,param_5);
    if (lStack_148 != -0x7fffffffffffffd9) {
      lStack_188 = lStack_120;
      lStack_190 = lStack_128;
      lStack_f8 = lStack_148;
      lStack_c8 = lStack_118;
      lStack_f0 = lStack_140;
      uStack_e8 = uStack_138;
      uStack_e7 = uStack_137;
      uStack_e6 = uStack_136;
      uStack_e5 = uStack_135;
      uStack_e4 = uStack_134;
      uStack_e3 = uStack_133;
      uStack_e2 = uStack_132;
      uStack_df = uStack_12f;
      uStack_de = uStack_12e;
      uStack_e1 = uStack_131;
      uStack_e0 = uStack_130;
      uStack_dd = uStack_12d;
      uStack_dc = uStack_12c;
      uStack_db = uStack_12b;
      uStack_da = uStack_12a;
      uStack_d9 = uStack_129;
      goto LAB_00160a94;
    }
    lStack_198 = lStack_140;
    lStack_188 = lStack_120;
    lStack_190 = lStack_128;
    uVar10 = uStack_138;
    uVar11 = uStack_137;
    uVar13 = uStack_136;
    uVar14 = uStack_135;
    uVar12 = uStack_134;
    uVar15 = uStack_133;
    uVar16 = uStack_132;
    uVar17 = uStack_12f;
    uVar18 = uStack_12e;
    uVar1 = uStack_12d;
    uVar2 = uStack_12c;
    uVar3 = uStack_12b;
    uVar4 = uStack_12a;
    uVar5 = uStack_131;
    uVar6 = uStack_130;
    uVar7 = uStack_129;
  }
  else {
    lStack_188 = lStack_d0;
    lStack_190 = lStack_d8;
    if (lStack_f8 != -0x7fffffffffffffd9) {
LAB_00160a94:
      *(undefined1 *)(param_1 + 2) = uStack_e8;
      *(undefined1 *)((long)param_1 + 0x11) = uStack_e7;
      *(undefined1 *)((long)param_1 + 0x12) = uStack_e6;
      *(undefined1 *)((long)param_1 + 0x13) = uStack_e5;
      *(undefined1 *)((long)param_1 + 0x14) = uStack_e4;
      *(undefined1 *)((long)param_1 + 0x15) = uStack_e3;
      *(undefined1 *)((long)param_1 + 0x16) = uStack_e2;
      *(undefined1 *)((long)param_1 + 0x17) = uStack_e1;
      *(undefined1 *)(param_1 + 3) = uStack_e0;
      *(undefined1 *)((long)param_1 + 0x19) = uStack_df;
      *(undefined1 *)((long)param_1 + 0x1a) = uStack_de;
      *(undefined1 *)((long)param_1 + 0x1b) = uStack_dd;
      *(undefined1 *)((long)param_1 + 0x1c) = uStack_dc;
      *(undefined1 *)((long)param_1 + 0x1d) = uStack_db;
      *(undefined1 *)((long)param_1 + 0x1e) = uStack_da;
      *(undefined1 *)((long)param_1 + 0x1f) = uStack_d9;
      param_1[5] = lStack_188;
      param_1[4] = lStack_190;
      *param_1 = lStack_f8;
      param_1[1] = lStack_f0;
      param_1[6] = lStack_c8;
      return;
    }
    lStack_198 = lStack_f0;
    uVar10 = uStack_e8;
    uVar11 = uStack_e7;
    uVar13 = uStack_e6;
    uVar14 = uStack_e5;
    uVar12 = uStack_e4;
    uVar15 = uStack_e3;
    uVar16 = uStack_e2;
    uVar17 = uStack_df;
    uVar18 = uStack_de;
    uVar1 = uStack_dd;
    uVar2 = uStack_dc;
    uVar3 = uStack_db;
    uVar4 = uStack_da;
    uVar5 = uStack_e1;
    uVar6 = uStack_e0;
    uVar7 = uStack_d9;
  }
  lStack_f8 = lStack_188;
  uStack_100 = lStack_190;
  plVar9 = (long *)func_0x00187bd0(0x28,8);
  if (plVar9 == (long *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar8 = (code *)SoftwareBreakpoint(1,0x160b1c);
    (*pcVar8)();
  }
  *plVar9 = lStack_198;
  *(undefined1 *)(plVar9 + 1) = uVar10;
  *(undefined1 *)((long)plVar9 + 9) = uVar11;
  *(undefined1 *)((long)plVar9 + 10) = uVar13;
  *(undefined1 *)((long)plVar9 + 0xb) = uVar14;
  *(undefined1 *)((long)plVar9 + 0xc) = uVar12;
  *(undefined1 *)((long)plVar9 + 0xd) = uVar15;
  *(undefined1 *)((long)plVar9 + 0xe) = uVar16;
  *(undefined1 *)((long)plVar9 + 0xf) = uVar5;
  *(undefined1 *)(plVar9 + 2) = uVar6;
  *(undefined1 *)((long)plVar9 + 0x11) = uVar17;
  *(undefined1 *)((long)plVar9 + 0x12) = uVar18;
  *(undefined1 *)((long)plVar9 + 0x13) = uVar1;
  *(undefined1 *)((long)plVar9 + 0x14) = uVar2;
  *(undefined1 *)((long)plVar9 + 0x15) = uVar3;
  *(undefined1 *)((long)plVar9 + 0x16) = uVar4;
  *(undefined1 *)((long)plVar9 + 0x17) = uVar7;
  plVar9[4] = lStack_f8;
  plVar9[3] = uStack_100;
  param_1[1] = (long)plVar9;
  param_1[2] = (long)&UNK_009bd898;
  *param_1 = -0x7fffffffffffffd9;
  return;
}

