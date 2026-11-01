
undefined8
FUN_0030c0ac(ulong param_1,ulong param_2,ulong param_3,ulong param_4,long param_5,ulong param_6,
            long param_7,undefined8 param_8,ulong param_9)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  undefined1 auVar63 [16];
  undefined1 auVar64 [16];
  ulong uVar65;
  ulong uVar66;
  long lVar67;
  ulong uVar68;
  ulong uVar69;
  ulong uVar70;
  ulong in_x9;
  ulong uVar71;
  ulong in_x10;
  ulong uVar72;
  ulong in_x11;
  ulong uVar73;
  ulong in_x12;
  ulong uVar74;
  ulong in_x13;
  ulong uVar75;
  ulong in_x14;
  ulong uVar76;
  ulong uVar77;
  ulong uVar78;
  ulong in_x15;
  ulong uVar79;
  ulong in_x16;
  ulong uVar80;
  ulong *in_x17;
  ulong uVar81;
  ulong uVar82;
  ulong uVar83;
  ulong unaff_x21;
  ulong unaff_x23;
  long unaff_x27;
  long unaff_x29;
  long unaff_x30;
  long in_stack_00000068;
  ulong *in_stack_00000070;
  
  uVar66 = param_5 + -0x8000000000000000 + (ulong)(0xffffffffffff7fff < param_4);
  uVar78 = (unaff_x21 + param_9) - in_x13;
  lVar67 = (unaff_x30 + param_7 + (ulong)CARRY8(unaff_x21,param_9)) -
           (unaff_x27 + (ulong)(unaff_x21 + param_9 < in_x13));
  uVar77 = (in_x14 & 0xffff) << 0x28;
  uVar68 = (unaff_x23 & 0xffffffffffffff) + (param_3 >> 8);
  uVar65 = uVar78 + uVar77;
  uVar76 = (in_x16 >> 0x10 | param_3 << 0x30) & 0xffff0000000000;
  if (CARRY8(uVar78,uVar77)) {
    lVar67 = lVar67 + 1;
  }
  uVar78 = uVar65 + uVar76;
  uVar77 = param_4 + 0x8000 >> 0x38 | uVar66 * 0x100;
  if (CARRY8(uVar65,uVar76)) {
    lVar67 = lVar67 + 1;
  }
  uVar65 = uVar78 + uVar77;
  uVar76 = uVar65 + 0xff80000000000000;
  uVar78 = lVar67 + (uVar66 >> 0x38) + (ulong)CARRY8(uVar78,uVar77) + 0x7fffffffffffff7f +
           (ulong)(0x7fffffffffffff < uVar65);
  uVar66 = uVar76 >> 0x38 | uVar78 * 0x100;
  uVar65 = uVar68 + uVar66;
  uVar77 = param_4 + 0x8000 & 0xffffffffffffff;
  uVar78 = uVar78 >> 0x38;
  if (CARRY8(uVar68,uVar66)) {
    uVar78 = uVar78 + 1;
  }
  uVar68 = (uVar65 >> 0x38 | uVar78 << 8) + (in_x16 & 0xffffffffffffff);
  uVar78 = (((uVar76 & 0xffffffffffffff | 0xffffffffff) & uVar65 & uVar68) + 1 |
           (long)(uVar77 + (uVar76 & 0xffffffffff) + -1) >> 0x3f) & 0xffffffffffffff;
  uVar66 = 0;
  if (uVar78 != 0) {
    uVar66 = 0xffffffffffffff;
  }
  uVar73 = 0xffffffffff;
  if (uVar78 != 0) {
    uVar73 = 0x1ffffffffffffff;
  }
  uVar78 = (uVar77 - (uVar68 >> 0x38)) + ((long)(uVar78 - 1) >> 0x3f);
  uVar77 = (uVar73 & (uVar76 & 0xffffffffffffff) + ((uVar68 >> 0x38) << 0x28)) +
           ((long)uVar78 >> 0x3f);
  uVar65 = (uVar66 & uVar65) + ((long)uVar77 >> 0x38);
  *in_x17 = uVar78 + ((uVar78 >> 0x3f) << 0x38) | uVar77 << 0x38;
  in_x17[1] = uVar77 >> 8 & 0xffffffffffff | uVar65 << 0x30;
  uVar68 = (uVar66 & uVar68) + ((long)uVar65 >> 0x38);
  in_x17[2] = uVar65 >> 0x10 & 0xffffffffff | uVar68 << 0x28;
  in_x17[3] = uVar68 >> 0x18;
  if (in_stack_00000070 != (ulong *)0x0) {
    param_2 = param_2 & 0xffffffffffffff;
    auVar1._8_8_ = 0;
    auVar1._0_8_ = param_2;
    auVar33._8_8_ = 0;
    auVar33._0_8_ = in_x10;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = param_2;
    auVar34._8_8_ = 0;
    auVar34._0_8_ = in_x9;
    *(ulong *)(unaff_x29 + -0x68) = param_2 * in_x9;
    *(long *)(unaff_x29 + -0x60) = SUB168(auVar2 * auVar34,8);
    param_6 = param_6 & 0xffffffffffffff;
    auVar3._8_8_ = 0;
    auVar3._0_8_ = param_6;
    auVar35._8_8_ = 0;
    auVar35._0_8_ = in_x10;
    *(long *)(unaff_x29 + -0x70) = SUB168(auVar3 * auVar35,8);
    auVar4._8_8_ = 0;
    auVar4._0_8_ = param_2;
    auVar36._8_8_ = 0;
    auVar36._0_8_ = in_x11;
    auVar5._8_8_ = 0;
    auVar5._0_8_ = param_6;
    auVar37._8_8_ = 0;
    auVar37._0_8_ = in_x9;
    uVar81 = in_x15 & 0xffffffffffffff;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = uVar81;
    auVar38._8_8_ = 0;
    auVar38._0_8_ = in_x10;
    auVar7._8_8_ = 0;
    auVar7._0_8_ = param_2;
    auVar39._8_8_ = 0;
    auVar39._0_8_ = param_1;
    auVar8._8_8_ = 0;
    auVar8._0_8_ = param_6;
    auVar40._8_8_ = 0;
    auVar40._0_8_ = in_x11;
    auVar9._8_8_ = 0;
    auVar9._0_8_ = uVar81;
    auVar41._8_8_ = 0;
    auVar41._0_8_ = in_x9;
    auVar10._8_8_ = 0;
    auVar10._0_8_ = in_x12;
    auVar42._8_8_ = 0;
    auVar42._0_8_ = in_x10;
    auVar11._8_8_ = 0;
    auVar11._0_8_ = param_6;
    auVar43._8_8_ = 0;
    auVar43._0_8_ = param_1;
    auVar12._8_8_ = 0;
    auVar12._0_8_ = uVar81;
    auVar44._8_8_ = 0;
    auVar44._0_8_ = in_x11;
    uVar68 = uVar81 * in_x11 + param_6 * param_1;
    auVar13._8_8_ = 0;
    auVar13._0_8_ = in_x12;
    auVar45._8_8_ = 0;
    auVar45._0_8_ = in_x9;
    uVar65 = uVar68 + in_x12 * in_x9;
    auVar14._8_8_ = 0;
    auVar14._0_8_ = uVar81;
    auVar46._8_8_ = 0;
    auVar46._0_8_ = param_1;
    auVar15._8_8_ = 0;
    auVar15._0_8_ = in_x12;
    auVar47._8_8_ = 0;
    auVar47._0_8_ = in_x11;
    uVar78 = in_x12 * in_x11 + uVar81 * param_1;
    uVar80 = SUB168(auVar15 * auVar47,8) + SUB168(auVar14 * auVar46,8) +
             (ulong)CARRY8(in_x12 * in_x11,uVar81 * param_1);
    uVar82 = in_x12 * param_1;
    auVar16._8_8_ = 0;
    auVar16._0_8_ = in_x12;
    auVar48._8_8_ = 0;
    auVar48._0_8_ = param_1;
    uVar71 = SUB168(auVar16 * auVar48,8);
    uVar66 = uVar82 >> 0x10 | uVar71 << 0x30;
    uVar77 = uVar65 + uVar66;
    uVar72 = SUB168(auVar12 * auVar44,8) + SUB168(auVar11 * auVar43,8) +
             (ulong)CARRY8(uVar81 * in_x11,param_6 * param_1) + SUB168(auVar13 * auVar45,8) +
             (ulong)CARRY8(uVar68,in_x12 * in_x9) + (uVar71 >> 0x10) + (ulong)CARRY8(uVar65,uVar66);
    uVar69 = *(ulong *)(in_stack_00000068 + 0x48) & 0xffffffffffffff;
    uVar79 = *(ulong *)(in_stack_00000068 + 0x48) >> 0x38 |
             (*(ulong *)(in_stack_00000068 + 0x50) & 0xffffffffffff) << 8;
    uVar75 = *(ulong *)(in_stack_00000068 + 0x50) >> 0x30 |
             (*(ulong *)(in_stack_00000068 + 0x58) & 0xffffffffff) << 0x10;
    uVar74 = *(ulong *)(in_stack_00000068 + 0x58) >> 0x28 |
             (*(ulong *)(in_stack_00000068 + 0x60) & 0xffffffff) << 0x18;
    uVar68 = param_2 * in_x11 + param_6 * in_x9;
    uVar76 = (uVar82 & 0xffff) << 0x28;
    uVar70 = uVar78 >> 0x10 | uVar80 << 0x30;
    uVar65 = uVar68 + uVar81 * in_x10;
    uVar73 = (uVar78 & 0xffff) << 0x28;
    uVar66 = uVar65 - uVar82;
    lVar67 = (SUB168(auVar4 * auVar36,8) + SUB168(auVar5 * auVar37,8) +
              (ulong)CARRY8(param_2 * in_x11,param_6 * in_x9) + SUB168(auVar6 * auVar38,8) +
             (ulong)CARRY8(uVar68,uVar81 * in_x10)) - (uVar71 + (uVar65 < uVar82));
    uVar65 = uVar77 >> 0x10 | uVar72 << 0x30;
    uVar68 = uVar66 + uVar73;
    if (CARRY8(uVar66,uVar73)) {
      lVar67 = lVar67 + 1;
    }
    uVar66 = uVar68 + uVar65;
    uVar68 = lVar67 + (uVar72 >> 0x10) + (ulong)CARRY8(uVar68,uVar65) + 0x7fffffffffffff80;
    uVar82 = (uVar77 & 0xffff) << 0x28;
    uVar83 = uVar66 >> 0x38 | uVar68 * 0x100;
    uVar65 = param_6 * in_x11 + param_2 * param_1;
    uVar73 = uVar65 + uVar81 * in_x9;
    uVar71 = uVar73 + in_x12 * in_x10;
    lVar67 = SUB168(auVar8 * auVar40,8) + SUB168(auVar7 * auVar39,8) +
             (ulong)CARRY8(param_6 * in_x11,param_2 * param_1) + SUB168(auVar9 * auVar41,8) +
             (ulong)CARRY8(uVar65,uVar81 * in_x9) + SUB168(auVar10 * auVar42,8) +
             (ulong)CARRY8(uVar73,in_x12 * in_x10);
    uVar65 = uVar71 + uVar76;
    if (CARRY8(uVar71,uVar76)) {
      lVar67 = lVar67 + 1;
    }
    uVar76 = uVar65 + uVar70;
    uVar73 = uVar76 + uVar83;
    uVar70 = lVar67 + (uVar80 >> 0x10) + (ulong)CARRY8(uVar65,uVar70) + (uVar68 >> 0x38) +
             (ulong)CARRY8(uVar76,uVar83);
    uVar81 = uVar73 >> 0x38 | uVar70 * 0x100;
    uVar65 = (uVar66 & 0xffffffffffffff) + (uVar70 >> 8);
    uVar71 = (uVar73 >> 0x10 | uVar70 << 0x30) & 0xffff0000000000;
    uVar66 = uVar77 + uVar81;
    uVar76 = param_2 * in_x10 - uVar66;
    uVar68 = uVar76 + 0x8000;
    uVar76 = (SUB168(auVar1 * auVar33,8) -
             (uVar72 + (uVar70 >> 0x38) + (ulong)CARRY8(uVar77,uVar81) +
             (ulong)(param_2 * in_x10 < uVar66))) + -0x8000000000000000 +
             (ulong)(0xffffffffffff7fff < uVar76);
    uVar70 = uVar68 >> 0x38 | uVar76 * 0x100;
    uVar77 = *(ulong *)(unaff_x29 + -0x68) + param_6 * in_x10;
    uVar66 = uVar77 - uVar78;
    lVar67 = (*(long *)(unaff_x29 + -0x60) + *(long *)(unaff_x29 + -0x70) +
             (ulong)CARRY8(*(ulong *)(unaff_x29 + -0x68),param_6 * in_x10)) -
             (uVar80 + (uVar77 < uVar78));
    uVar78 = uVar66 + uVar82;
    if (CARRY8(uVar66,uVar82)) {
      lVar67 = lVar67 + 1;
    }
    uVar77 = uVar78 + uVar71;
    if (CARRY8(uVar78,uVar71)) {
      lVar67 = lVar67 + 1;
    }
    uVar78 = uVar77 + uVar70;
    uVar66 = uVar78 + 0xff80000000000000;
    uVar78 = lVar67 + (uVar76 >> 0x38) + (ulong)CARRY8(uVar77,uVar70) + 0x7fffffffffffff7f +
             (ulong)(0x7fffffffffffff < uVar78);
    uVar77 = uVar78 >> 0x38;
    uVar76 = uVar66 >> 0x38 | uVar78 * 0x100;
    uVar78 = uVar65 + uVar76;
    if (CARRY8(uVar65,uVar76)) {
      uVar77 = uVar77 + 1;
    }
    uVar65 = (uVar78 >> 0x38 | uVar77 << 8) + (uVar73 & 0xffffffffffffff);
    uVar68 = uVar68 & 0xffffffffffffff;
    auVar17._8_8_ = 0;
    auVar17._0_8_ = uVar68;
    auVar49._8_8_ = 0;
    auVar49._0_8_ = uVar69;
    uVar66 = uVar66 & 0xffffffffffffff;
    auVar18._8_8_ = 0;
    auVar18._0_8_ = uVar66;
    auVar50._8_8_ = 0;
    auVar50._0_8_ = uVar69;
    auVar19._8_8_ = 0;
    auVar19._0_8_ = uVar68;
    auVar51._8_8_ = 0;
    auVar51._0_8_ = uVar79;
    uVar78 = uVar78 & 0xffffffffffffff;
    auVar20._8_8_ = 0;
    auVar20._0_8_ = uVar78;
    auVar52._8_8_ = 0;
    auVar52._0_8_ = uVar69;
    auVar21._8_8_ = 0;
    auVar21._0_8_ = uVar66;
    auVar53._8_8_ = 0;
    auVar53._0_8_ = uVar79;
    auVar22._8_8_ = 0;
    auVar22._0_8_ = uVar68;
    auVar54._8_8_ = 0;
    auVar54._0_8_ = uVar75;
    auVar23._8_8_ = 0;
    auVar23._0_8_ = uVar65;
    auVar55._8_8_ = 0;
    auVar55._0_8_ = uVar69;
    auVar24._8_8_ = 0;
    auVar24._0_8_ = uVar78;
    auVar56._8_8_ = 0;
    auVar56._0_8_ = uVar79;
    auVar25._8_8_ = 0;
    auVar25._0_8_ = uVar65;
    auVar57._8_8_ = 0;
    auVar57._0_8_ = uVar79;
    auVar26._8_8_ = 0;
    auVar26._0_8_ = uVar78;
    auVar58._8_8_ = 0;
    auVar58._0_8_ = uVar75;
    uVar77 = uVar78 * uVar75 + uVar65 * uVar79;
    auVar27._8_8_ = 0;
    auVar27._0_8_ = uVar66;
    auVar59._8_8_ = 0;
    auVar59._0_8_ = uVar74;
    uVar76 = uVar77 + uVar66 * uVar74;
    uVar73 = uVar78 * uVar74 + uVar65 * uVar75;
    auVar28._8_8_ = 0;
    auVar28._0_8_ = uVar66;
    auVar60._8_8_ = 0;
    auVar60._0_8_ = uVar75;
    auVar29._8_8_ = 0;
    auVar29._0_8_ = uVar65;
    auVar61._8_8_ = 0;
    auVar61._0_8_ = uVar75;
    auVar30._8_8_ = 0;
    auVar30._0_8_ = uVar78;
    auVar62._8_8_ = 0;
    auVar62._0_8_ = uVar74;
    uVar81 = SUB168(auVar30 * auVar62,8) + SUB168(auVar29 * auVar61,8) +
             (ulong)CARRY8(uVar78 * uVar74,uVar65 * uVar75);
    auVar31._8_8_ = 0;
    auVar31._0_8_ = uVar68;
    auVar63._8_8_ = 0;
    auVar63._0_8_ = uVar74;
    uVar72 = uVar65 * uVar74;
    auVar32._8_8_ = 0;
    auVar32._0_8_ = uVar65;
    auVar64._8_8_ = 0;
    auVar64._0_8_ = uVar74;
    uVar80 = SUB168(auVar32 * auVar64,8);
    uVar71 = uVar72 >> 0x10 | uVar80 << 0x30;
    uVar70 = uVar76 + uVar71;
    uVar82 = SUB168(auVar26 * auVar58,8) + SUB168(auVar25 * auVar57,8) +
             (ulong)CARRY8(uVar78 * uVar75,uVar65 * uVar79) + SUB168(auVar27 * auVar59,8) +
             (ulong)CARRY8(uVar77,uVar66 * uVar74) + (uVar80 >> 0x10) + (ulong)CARRY8(uVar76,uVar71)
    ;
    uVar77 = uVar78 * uVar69 + uVar66 * uVar79;
    uVar76 = uVar77 + uVar68 * uVar75;
    uVar71 = uVar76 - uVar72;
    lVar67 = (SUB168(auVar20 * auVar52,8) + SUB168(auVar21 * auVar53,8) +
              (ulong)CARRY8(uVar78 * uVar69,uVar66 * uVar79) + SUB168(auVar22 * auVar54,8) +
             (ulong)CARRY8(uVar77,uVar68 * uVar75)) - (uVar80 + (uVar76 < uVar72));
    uVar76 = (uVar73 & 0xffff) << 0x28;
    uVar77 = uVar71 + uVar76;
    uVar80 = uVar70 >> 0x10 | uVar82 << 0x30;
    if (CARRY8(uVar71,uVar76)) {
      lVar67 = lVar67 + 1;
    }
    uVar76 = uVar77 + uVar80;
    uVar77 = lVar67 + (uVar82 >> 0x10) + (ulong)CARRY8(uVar77,uVar80) + 0x7fffffffffffff80;
    uVar71 = uVar78 * uVar79 + uVar65 * uVar69;
    uVar80 = uVar71 + uVar66 * uVar75;
    uVar83 = uVar80 + uVar68 * uVar74;
    lVar67 = SUB168(auVar24 * auVar56,8) + SUB168(auVar23 * auVar55,8) +
             (ulong)CARRY8(uVar78 * uVar79,uVar65 * uVar69) + SUB168(auVar28 * auVar60,8) +
             (ulong)CARRY8(uVar71,uVar66 * uVar75) + SUB168(auVar31 * auVar63,8) +
             (ulong)CARRY8(uVar80,uVar68 * uVar74);
    uVar78 = (uVar72 & 0xffff) << 0x28;
    uVar65 = uVar83 + uVar78;
    uVar71 = uVar73 >> 0x10 | uVar81 << 0x30;
    if (CARRY8(uVar83,uVar78)) {
      lVar67 = lVar67 + 1;
    }
    uVar78 = uVar65 + uVar71;
    uVar74 = uVar76 >> 0x38 | uVar77 * 0x100;
    uVar72 = uVar78 + uVar74;
    uVar74 = lVar67 + (uVar81 >> 0x10) + (ulong)CARRY8(uVar65,uVar71) + (uVar77 >> 0x38) +
             (ulong)CARRY8(uVar78,uVar74);
    uVar71 = uVar72 >> 0x38 | uVar74 * 0x100;
    uVar78 = uVar70 + uVar71;
    uVar77 = uVar68 * uVar69 - uVar78;
    uVar65 = uVar77 + 0x8000;
    uVar71 = (SUB168(auVar17 * auVar49,8) -
             (uVar82 + (uVar74 >> 0x38) + (ulong)CARRY8(uVar70,uVar71) +
             (ulong)(uVar68 * uVar69 < uVar78))) + -0x8000000000000000 +
             (ulong)(0xffffffffffff7fff < uVar77);
    uVar78 = uVar66 * uVar69 + uVar68 * uVar79;
    uVar77 = uVar78 - uVar73;
    lVar67 = (SUB168(auVar18 * auVar50,8) + SUB168(auVar19 * auVar51,8) +
             (ulong)CARRY8(uVar66 * uVar69,uVar68 * uVar79)) - (uVar81 + (uVar78 < uVar73));
    uVar78 = (uVar70 & 0xffff) << 0x28;
    uVar68 = uVar77 + uVar78;
    uVar66 = (uVar72 >> 0x10 | uVar74 << 0x30) & 0xffff0000000000;
    if (CARRY8(uVar77,uVar78)) {
      lVar67 = lVar67 + 1;
    }
    uVar78 = uVar68 + uVar66;
    uVar77 = uVar65 >> 0x38 | uVar71 * 0x100;
    if (CARRY8(uVar68,uVar66)) {
      lVar67 = lVar67 + 1;
    }
    uVar68 = uVar78 + uVar77;
    uVar66 = uVar68 + 0xff80000000000000;
    uVar77 = lVar67 + (uVar71 >> 0x38) + (ulong)CARRY8(uVar78,uVar77) + 0x7fffffffffffff7f +
             (ulong)(0x7fffffffffffff < uVar68);
    uVar73 = uVar66 >> 0x38 | uVar77 * 0x100;
    uVar68 = (uVar76 & 0xffffffffffffff) + (uVar74 >> 8);
    uVar78 = uVar68 + uVar73;
    uVar65 = uVar65 & 0xffffffffffffff;
    uVar77 = uVar77 >> 0x38;
    if (CARRY8(uVar68,uVar73)) {
      uVar77 = uVar77 + 1;
    }
    uVar68 = (uVar78 >> 0x38 | uVar77 << 8) + (uVar72 & 0xffffffffffffff);
    uVar77 = (((uVar66 & 0xffffffffffffff | 0xffffffffff) & uVar78 & uVar68) + 1 |
             (long)(uVar65 + (uVar66 & 0xffffffffff) + -1) >> 0x3f) & 0xffffffffffffff;
    uVar76 = 0;
    if (uVar77 != 0) {
      uVar76 = 0xffffffffffffff;
    }
    uVar73 = 0xffffffffff;
    if (uVar77 != 0) {
      uVar73 = 0x1ffffffffffffff;
    }
    uVar65 = (uVar65 - (uVar68 >> 0x38)) + ((long)(uVar77 - 1) >> 0x3f);
    uVar77 = (uVar73 & (uVar66 & 0xffffffffffffff) + ((uVar68 >> 0x38) << 0x28)) +
             ((long)uVar65 >> 0x3f);
    uVar78 = (uVar76 & uVar78) + ((long)uVar77 >> 0x38);
    *in_stack_00000070 = uVar65 + ((uVar65 >> 0x3f) << 0x38) | uVar77 << 0x38;
    in_stack_00000070[1] = uVar77 >> 8 & 0xffffffffffff | uVar78 << 0x30;
    uVar68 = (uVar76 & uVar68) + ((long)uVar78 >> 0x38);
    in_stack_00000070[2] = uVar78 >> 0x10 & 0xffffffffff | uVar68 << 0x28;
    in_stack_00000070[3] = uVar68 >> 0x18;
  }
  return 1;
}

