/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4bc44
 */

void FUN_00a4bc44(undefined8 param_1,long param_2,ulong *param_3)

{
  ulong uVar1;
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
  ulong uVar22;
  long lVar23;
  ulong uVar24;
  long lVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong local_a0;
  ulong uStack_98;
  ulong local_90;
  ulong uStack_88;
  ulong local_80;
  ulong uStack_78;
  ulong local_70;
  ulong uStack_68;
  
  lVar25 = 0;
  local_70 = 0;
  uStack_78 = 0;
  local_80 = 0;
  uStack_88 = 0;
  local_90 = 0;
  uStack_98 = 0;
  local_a0 = 0;
  uVar24 = 0;
  do {
    uVar26 = *(ulong *)(param_2 + lVar25);
    lVar25 = lVar25 + 8;
    uVar33 = *param_3 * uVar26;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = *param_3;
    auVar15._8_8_ = 0;
    auVar15._0_8_ = uVar26;
    uVar1 = uVar33 + local_a0;
    uVar22 = SUB168(auVar2 * auVar15,8) + (ulong)CARRY8(uVar33,local_a0);
    uVar33 = uVar22 + uStack_98;
    uVar28 = param_3[1] * uVar26;
    auVar3._8_8_ = 0;
    auVar3._0_8_ = param_3[1];
    auVar16._8_8_ = 0;
    auVar16._0_8_ = uVar26;
    uVar29 = uVar33 + uVar28;
    uVar27 = (ulong)CARRY8(uVar22,uStack_98) + SUB168(auVar3 * auVar16,8) +
             (ulong)CARRY8(uVar33,uVar28);
    uVar33 = uVar27 + local_90;
    uVar28 = param_3[2] * uVar26;
    auVar4._8_8_ = 0;
    auVar4._0_8_ = param_3[2];
    auVar17._8_8_ = 0;
    auVar17._0_8_ = uVar26;
    uVar22 = uVar33 + uVar28;
    uVar30 = (ulong)CARRY8(uVar27,local_90) + SUB168(auVar4 * auVar17,8) +
             (ulong)CARRY8(uVar33,uVar28);
    uVar33 = uVar30 + uStack_88;
    uVar27 = param_3[3] * uVar26;
    auVar5._8_8_ = 0;
    auVar5._0_8_ = param_3[3];
    auVar18._8_8_ = 0;
    auVar18._0_8_ = uVar26;
    uVar28 = uVar33 + uVar27;
    uVar31 = (ulong)CARRY8(uVar30,uStack_88) + SUB168(auVar5 * auVar18,8) +
             (ulong)CARRY8(uVar33,uVar27);
    uVar33 = uVar31 + local_80;
    uVar30 = param_3[4] * uVar26;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = param_3[4];
    auVar19._8_8_ = 0;
    auVar19._0_8_ = uVar26;
    uVar27 = uVar33 + uVar30;
    uVar32 = (ulong)CARRY8(uVar31,local_80) + SUB168(auVar6 * auVar19,8) +
             (ulong)CARRY8(uVar33,uVar30);
    uVar33 = uVar32 + uStack_78;
    uVar31 = param_3[5] * uVar26;
    auVar7._8_8_ = 0;
    auVar7._0_8_ = param_3[5];
    auVar20._8_8_ = 0;
    auVar20._0_8_ = uVar26;
    uVar30 = uVar33 + uVar31;
    uVar32 = (ulong)CARRY8(uVar32,uStack_78) + SUB168(auVar7 * auVar20,8) +
             (ulong)CARRY8(uVar33,uVar31);
    uVar33 = uVar32 + local_70;
    auVar8._8_8_ = 0;
    auVar8._0_8_ = param_3[6];
    auVar21._8_8_ = 0;
    auVar21._0_8_ = uVar26;
    uVar26 = param_3[6] * uVar26;
    uVar31 = uVar33 + uVar26;
    uStack_68 = (ulong)CARRY8(uVar32,local_70) + SUB168(auVar8 * auVar21,8) +
                (ulong)CARRY8(uVar33,uVar26);
    uVar26 = uVar1 * 0x3bd440fae918bc5;
    auVar9._8_8_ = 0;
    auVar9._0_8_ = uVar26;
    uVar32 = SUB168(auVar9 * ZEXT816(0x2378c292ab5844f3),8) + (ulong)CARRY8(uVar1,-uVar1);
    uVar33 = uVar32 + uVar29;
    local_a0 = uVar33 + uVar1 * 0x5eeb636e52ff7369;
    auVar10._8_8_ = 0;
    auVar10._0_8_ = uVar26;
    uVar29 = (ulong)CARRY8(uVar32,uVar29) + SUB168(auVar10 * ZEXT816(0x216cc2728dc58f55),8) +
             (ulong)CARRY8(uVar33,uVar1 * 0x5eeb636e52ff7369);
    uVar33 = uVar29 + uVar22;
    uStack_98 = uVar33 + uVar1 * 0x48acd47ca2082cd0;
    auVar11._8_8_ = 0;
    auVar11._0_8_ = uVar26;
    uVar29 = (ulong)CARRY8(uVar29,uVar22) + SUB168(auVar11 * ZEXT816(0xc44edb49aed63690),8) +
             (ulong)CARRY8(uVar33,uVar1 * 0x48acd47ca2082cd0);
    uVar33 = uVar29 + uVar28;
    local_90 = uVar33 + uVar1 * -0x1a12361581f9dab3;
    auVar12._8_8_ = 0;
    auVar12._0_8_ = uVar26;
    uVar29 = (ulong)CARRY8(uVar29,uVar28) + SUB168(auVar12 * ZEXT816(0xffffffff7cca23e9),8) +
             (ulong)CARRY8(uVar33,uVar1 * -0x1a12361581f9dab3);
    uVar33 = uVar29 + uVar27;
    uVar22 = uVar1 * -0x3bd440fae918bc5;
    auVar13._8_8_ = 0;
    auVar13._0_8_ = uVar26;
    lVar23 = SUB168(auVar13 * ZEXT816(0xffffffffffffffff),8);
    uStack_88 = uVar33 + uVar22;
    uVar29 = (ulong)CARRY8(uVar29,uVar27) + lVar23 + (ulong)CARRY8(uVar33,uVar22);
    uVar33 = uVar29 + uVar30;
    local_80 = uVar33 + uVar22;
    uVar29 = (ulong)CARRY8(uVar29,uVar30) + lVar23 + (ulong)CARRY8(uVar33,uVar22);
    uVar33 = uVar29 + uVar31;
    uStack_78 = uVar33 + uVar1 * 0x3c42bbf0516e743b;
    auVar14._8_8_ = 0;
    auVar14._0_8_ = uVar26;
    uVar33 = (ulong)CARRY8(uVar29,uVar31) + SUB168(auVar14 * ZEXT816(0x3fffffffffffffff),8) +
             (ulong)CARRY8(uVar33,uVar1 * 0x3c42bbf0516e743b);
    uVar1 = uVar33 + uVar24;
    local_70 = uVar1 + uStack_68;
    uVar24 = (ulong)CARRY8(uVar33,uVar24) + (ulong)CARRY8(uVar1,uStack_68);
  } while (lVar25 != 0x38);
  FUN_00a4bee0(param_1,&local_a0,&DAT_00765f28);
  return;
}

