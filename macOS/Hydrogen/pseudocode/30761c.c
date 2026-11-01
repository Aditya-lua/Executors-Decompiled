
void FUN_0030761c(ulong param_1,ulong *param_2,ulong param_3,long param_4,long param_5,long param_6,
                 ulong param_7,ulong param_8,long param_9)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
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
  byte in_CY;
  ulong uVar31;
  ulong uVar32;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong uVar33;
  ulong uVar34;
  ulong in_x12;
  ulong uVar35;
  ulong in_x13;
  long in_x14;
  ulong in_x15;
  ulong in_x16;
  ulong in_x17;
  ulong unaff_x19;
  ulong unaff_x20;
  ulong uVar36;
  
  uVar31 = param_5 + (unaff_x20 >> 0x33) + (ulong)in_CY;
  uVar1 = param_8 + in_x9 * in_x15;
  auVar7._8_8_ = 0;
  auVar7._0_8_ = in_x9;
  auVar19._8_8_ = 0;
  auVar19._0_8_ = in_x15;
  uVar34 = uVar1 + in_x13 * in_x10;
  auVar8._8_8_ = 0;
  auVar8._0_8_ = in_x13;
  auVar20._8_8_ = 0;
  auVar20._0_8_ = in_x10;
  uVar35 = uVar34 + param_1 * in_x16;
  auVar9._8_8_ = 0;
  auVar9._0_8_ = param_1;
  auVar21._8_8_ = 0;
  auVar21._0_8_ = in_x16;
  uVar36 = param_7 >> 0x33 | uVar31 * 0x2000;
  uVar2 = uVar35 + uVar36;
  auVar10._8_8_ = 0;
  auVar10._0_8_ = in_x13;
  auVar22._8_8_ = 0;
  auVar22._0_8_ = in_x11;
  uVar32 = param_6 + SUB168(auVar7 * auVar19,8) + (ulong)CARRY8(param_8,in_x9 * in_x15) +
           SUB168(auVar8 * auVar20,8) + (ulong)CARRY8(uVar1,in_x13 * in_x10) +
           SUB168(auVar9 * auVar21,8) + (ulong)CARRY8(uVar34,param_1 * in_x16) + (uVar31 >> 0x33) +
           (ulong)CARRY8(uVar35,uVar36);
  uVar1 = in_x10 * in_x15 + param_4 * in_x12;
  auVar11._8_8_ = 0;
  auVar11._0_8_ = in_x10;
  auVar23._8_8_ = 0;
  auVar23._0_8_ = in_x15;
  uVar34 = uVar1 + in_x9 * in_x16;
  auVar12._8_8_ = 0;
  auVar12._0_8_ = in_x9;
  auVar24._8_8_ = 0;
  auVar24._0_8_ = in_x16;
  uVar35 = uVar34 + in_x13 * in_x11;
  auVar13._8_8_ = 0;
  auVar13._0_8_ = param_1;
  auVar25._8_8_ = 0;
  auVar25._0_8_ = in_x17;
  uVar31 = uVar35 + param_1 * in_x17;
  uVar36 = in_x10 * in_x16 + in_x11 * in_x15;
  auVar14._8_8_ = 0;
  auVar14._0_8_ = in_x11;
  auVar26._8_8_ = 0;
  auVar26._0_8_ = in_x15;
  auVar15._8_8_ = 0;
  auVar15._0_8_ = in_x10;
  auVar27._8_8_ = 0;
  auVar27._0_8_ = in_x16;
  uVar3 = uVar36 + in_x9 * in_x17;
  auVar16._8_8_ = 0;
  auVar16._0_8_ = in_x9;
  auVar28._8_8_ = 0;
  auVar28._0_8_ = in_x17;
  uVar4 = uVar3 + in_x13 * in_x12;
  auVar17._8_8_ = 0;
  auVar17._0_8_ = in_x13;
  auVar29._8_8_ = 0;
  auVar29._0_8_ = in_x12;
  uVar5 = uVar4 + param_1 * param_3;
  auVar18._8_8_ = 0;
  auVar18._0_8_ = param_1;
  auVar30._8_8_ = 0;
  auVar30._0_8_ = param_3;
  uVar33 = uVar2 >> 0x33 | uVar32 * 0x2000;
  uVar6 = uVar31 + uVar33;
  uVar34 = SUB168(auVar11 * auVar23,8) + param_9 + (ulong)CARRY8(in_x10 * in_x15,param_4 * in_x12) +
           SUB168(auVar12 * auVar24,8) + (ulong)CARRY8(uVar1,in_x9 * in_x16) +
           SUB168(auVar10 * auVar22,8) + (ulong)CARRY8(uVar34,in_x13 * in_x11) +
           SUB168(auVar13 * auVar25,8) + (ulong)CARRY8(uVar35,param_1 * in_x17) + (uVar32 >> 0x33) +
           (ulong)CARRY8(uVar31,uVar33);
  uVar35 = uVar6 >> 0x33 | uVar34 * 0x2000;
  uVar1 = uVar5 + uVar35;
  uVar35 = (unaff_x19 & 0x7ffffffffffff) +
           (uVar1 >> 0x33 |
           (SUB168(auVar15 * auVar27,8) + SUB168(auVar14 * auVar26,8) +
            (ulong)CARRY8(in_x10 * in_x16,in_x11 * in_x15) + SUB168(auVar16 * auVar28,8) +
            (ulong)CARRY8(uVar36,in_x9 * in_x17) + SUB168(auVar17 * auVar29,8) +
            (ulong)CARRY8(uVar3,in_x13 * in_x12) + SUB168(auVar18 * auVar30,8) +
            (ulong)CARRY8(uVar4,param_1 * param_3) + (uVar34 >> 0x33) + (ulong)CARRY8(uVar5,uVar35))
           * 0x2000) * in_x14;
  uVar34 = (param_7 & 0x7ffffffffffff) + (uVar35 >> 0x33);
  *param_2 = uVar35 & 0x7ffffffffffff;
  param_2[1] = uVar34 & 0x7ffffffffffff;
  param_2[2] = (uVar2 & 0x7ffffffffffff) + (uVar34 >> 0x33);
  param_2[4] = (ulong)((uint7)uVar1 & 0x7ffffffffffff);
  param_2[3] = (ulong)((uint7)uVar6 & 0x7ffffffffffff);
  return;
}

