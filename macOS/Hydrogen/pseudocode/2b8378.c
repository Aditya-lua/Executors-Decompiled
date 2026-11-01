
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002b8378(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
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
  int iVar55;
  ulong uVar56;
  long lVar57;
  ulong uVar58;
  ulong uVar59;
  ulong uVar60;
  ulong uVar61;
  ulong uVar62;
  undefined8 *puVar63;
  ulong in_x9;
  ulong uVar64;
  ulong uVar65;
  ulong uVar66;
  ulong uVar67;
  ulong uVar68;
  ulong uVar69;
  ulong uVar70;
  ulong uVar71;
  ulong uVar72;
  long unaff_x29;
  undefined8 uVar73;
  undefined8 uVar74;
  undefined8 uVar75;
  undefined8 uVar76;
  undefined1 auVar77 [16];
  undefined1 uStack0000000000000028;
  
  if ((((in_x9 < *(ulong *)(param_1 + 8)) || (in_x9 < *(ulong *)(param_1 + 0x10))) ||
      (in_x9 < *(ulong *)(param_1 + 0x18))) || (in_x9 < *(ulong *)(param_1 + 0x20))) {
    uVar56 = func_0x0079e580();
  }
  else {
    func_0x002b7154(&uStack0000000000000028);
    iVar55 = func_0x0036e62c(&uStack0000000000000028,&UNK_00832650,0x20);
    uVar56 = (ulong)(iVar55 != 0);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -8)) {
      return;
    }
  }
  auVar77 = ___stack_chk_fail(uVar56);
  auVar77._8_8_ = auVar77._8_8_;
  lVar57 = auVar77._0_8_;
  func_0x002b828c(lVar57,auVar77._8_8_ + 0x28,auVar77._8_8_);
  func_0x002b81b4(lVar57 + 0x28,auVar77._8_8_ + 0x28,auVar77._8_8_);
  uVar74 = *(undefined8 *)(auVar77._8_8_ + 0x58);
  uVar73 = *(undefined8 *)(auVar77._8_8_ + 0x50);
  uVar76 = *(undefined8 *)(auVar77._8_8_ + 0x68);
  uVar75 = *(undefined8 *)(auVar77._8_8_ + 0x60);
  *(undefined8 *)(lVar57 + 0x70) = *(undefined8 *)(auVar77._8_8_ + 0x70);
  *(undefined8 *)(lVar57 + 0x58) = uVar74;
  *(undefined8 *)(lVar57 + 0x50) = uVar73;
  *(undefined8 *)(lVar57 + 0x68) = uVar76;
  *(undefined8 *)(lVar57 + 0x60) = uVar75;
  uVar56 = *(ulong *)(auVar77._8_8_ + 0x78);
  if (((uVar56 < 0x1a666666666665) &&
      (uVar64 = *(ulong *)(auVar77._8_8_ + 0x80), uVar64 < 0x1a666666666665)) &&
     ((uVar65 = *(ulong *)(auVar77._8_8_ + 0x88), uVar65 < 0x1a666666666665 &&
      ((uVar66 = *(ulong *)(auVar77._8_8_ + 0x90), uVar66 < 0x1a666666666665 &&
       (uVar69 = *(ulong *)(auVar77._8_8_ + 0x98), uVar69 < 0x1a666666666665)))))) {
    if ((((_UNK_00831170 < 0x1a666666666665) && (_UNK_00831178 < 0x1a666666666665)) &&
        (_UNK_00831180 < 0x1a666666666665)) &&
       ((_UNK_00831188 < 0x1a666666666665 && (_UNK_00831190 < 0x1a666666666665)))) {
      uVar58 = _UNK_00831190 * 0x13;
      uVar59 = _UNK_00831188 * 0x13;
      auVar77._8_8_ = 0;
      auVar77._0_8_ = uVar59;
      auVar30._8_8_ = 0;
      auVar30._0_8_ = uVar69;
      uVar61 = _UNK_00831180 * 0x13;
      auVar6._8_8_ = 0;
      auVar6._0_8_ = _UNK_00831178 * 0x13;
      auVar31._8_8_ = 0;
      auVar31._0_8_ = uVar69;
      uVar71 = _UNK_00831178 * 0x13 * uVar69;
      uVar1 = uVar66 * uVar61 + uVar71;
      auVar7._8_8_ = 0;
      auVar7._0_8_ = uVar66;
      auVar32._8_8_ = 0;
      auVar32._0_8_ = uVar61;
      uVar68 = uVar1 + uVar65 * uVar59;
      auVar8._8_8_ = 0;
      auVar8._0_8_ = uVar65;
      auVar33._8_8_ = 0;
      auVar33._0_8_ = uVar59;
      uVar70 = uVar68 + uVar64 * uVar58;
      auVar9._8_8_ = 0;
      auVar9._0_8_ = uVar64;
      auVar34._8_8_ = 0;
      auVar34._0_8_ = uVar58;
      uVar2 = uVar70 + uVar56 * _UNK_00831170;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = uVar56;
      auVar35._8_8_ = 0;
      auVar35._0_8_ = _UNK_00831170;
      uVar72 = SUB168(auVar7 * auVar32,8) + SUB168(auVar6 * auVar31,8) +
               (ulong)CARRY8(uVar66 * uVar61,uVar71) + SUB168(auVar8 * auVar33,8) +
               (ulong)CARRY8(uVar1,uVar65 * uVar59) + SUB168(auVar9 * auVar34,8) +
               (ulong)CARRY8(uVar68,uVar64 * uVar58) + SUB168(auVar10 * auVar35,8) +
               (ulong)CARRY8(uVar70,uVar56 * _UNK_00831170);
      uVar1 = uVar66 * uVar58 + uVar59 * uVar69;
      auVar11._8_8_ = 0;
      auVar11._0_8_ = uVar66;
      auVar36._8_8_ = 0;
      auVar36._0_8_ = uVar58;
      uVar68 = uVar66 * uVar59 + uVar61 * uVar69;
      auVar12._8_8_ = 0;
      auVar12._0_8_ = uVar61;
      auVar37._8_8_ = 0;
      auVar37._0_8_ = uVar69;
      auVar13._8_8_ = 0;
      auVar13._0_8_ = uVar66;
      auVar38._8_8_ = 0;
      auVar38._0_8_ = uVar59;
      uVar70 = uVar68 + uVar65 * uVar58;
      auVar14._8_8_ = 0;
      auVar14._0_8_ = uVar65;
      auVar39._8_8_ = 0;
      auVar39._0_8_ = uVar58;
      uVar71 = uVar70 + _UNK_00831170 * uVar64;
      auVar15._8_8_ = 0;
      auVar15._0_8_ = _UNK_00831170;
      auVar40._8_8_ = 0;
      auVar40._0_8_ = uVar64;
      uVar3 = uVar71 + uVar56 * _UNK_00831178;
      auVar16._8_8_ = 0;
      auVar16._0_8_ = uVar56;
      auVar41._8_8_ = 0;
      auVar41._0_8_ = _UNK_00831178;
      uVar62 = uVar2 >> 0x33 | uVar72 * 0x2000;
      uVar4 = uVar3 + uVar62;
      auVar17._8_8_ = 0;
      auVar17._0_8_ = uVar58;
      auVar42._8_8_ = 0;
      auVar42._0_8_ = uVar69;
      uVar61 = SUB168(auVar13 * auVar38,8) + SUB168(auVar12 * auVar37,8) +
               (ulong)CARRY8(uVar66 * uVar59,uVar61 * uVar69) + SUB168(auVar14 * auVar39,8) +
               (ulong)CARRY8(uVar68,uVar65 * uVar58) + SUB168(auVar15 * auVar40,8) +
               (ulong)CARRY8(uVar70,_UNK_00831170 * uVar64) + SUB168(auVar16 * auVar41,8) +
               (ulong)CARRY8(uVar71,uVar56 * _UNK_00831178) + (uVar72 >> 0x33) +
               (ulong)CARRY8(uVar3,uVar62);
      uVar68 = uVar1 + uVar64 * _UNK_00831178;
      auVar18._8_8_ = 0;
      auVar18._0_8_ = uVar64;
      auVar43._8_8_ = 0;
      auVar43._0_8_ = _UNK_00831178;
      uVar70 = uVar68 + _UNK_00831170 * uVar65;
      auVar19._8_8_ = 0;
      auVar19._0_8_ = _UNK_00831170;
      auVar44._8_8_ = 0;
      auVar44._0_8_ = uVar65;
      uVar71 = uVar70 + uVar56 * _UNK_00831180;
      auVar20._8_8_ = 0;
      auVar20._0_8_ = uVar56;
      auVar45._8_8_ = 0;
      auVar45._0_8_ = _UNK_00831180;
      uVar62 = uVar4 >> 0x33 | uVar61 * 0x2000;
      uVar3 = uVar71 + uVar62;
      auVar21._8_8_ = 0;
      auVar21._0_8_ = _UNK_00831170;
      auVar46._8_8_ = 0;
      auVar46._0_8_ = uVar66;
      uVar60 = SUB168(auVar11 * auVar36,8) + SUB168(auVar77 * auVar30,8) +
               (ulong)CARRY8(uVar66 * uVar58,uVar59 * uVar69) + SUB168(auVar18 * auVar43,8) +
               (ulong)CARRY8(uVar1,uVar64 * _UNK_00831178) + SUB168(auVar19 * auVar44,8) +
               (ulong)CARRY8(uVar68,_UNK_00831170 * uVar65) + SUB168(auVar20 * auVar45,8) +
               (ulong)CARRY8(uVar70,uVar56 * _UNK_00831180) + (uVar61 >> 0x33) +
               (ulong)CARRY8(uVar71,uVar62);
      uVar1 = uVar65 * _UNK_00831178 + uVar58 * uVar69;
      auVar22._8_8_ = 0;
      auVar22._0_8_ = uVar65;
      auVar47._8_8_ = 0;
      auVar47._0_8_ = _UNK_00831178;
      uVar68 = uVar1 + uVar64 * _UNK_00831180;
      auVar23._8_8_ = 0;
      auVar23._0_8_ = uVar64;
      auVar48._8_8_ = 0;
      auVar48._0_8_ = _UNK_00831180;
      uVar70 = uVar68 + _UNK_00831170 * uVar66;
      auVar24._8_8_ = 0;
      auVar24._0_8_ = uVar56;
      auVar49._8_8_ = 0;
      auVar49._0_8_ = _UNK_00831188;
      uVar71 = uVar70 + uVar56 * _UNK_00831188;
      uVar59 = uVar65 * _UNK_00831180 + uVar66 * _UNK_00831178;
      auVar25._8_8_ = 0;
      auVar25._0_8_ = uVar66;
      auVar50._8_8_ = 0;
      auVar50._0_8_ = _UNK_00831178;
      auVar26._8_8_ = 0;
      auVar26._0_8_ = uVar65;
      auVar51._8_8_ = 0;
      auVar51._0_8_ = _UNK_00831180;
      uVar61 = uVar59 + uVar64 * _UNK_00831188;
      auVar27._8_8_ = 0;
      auVar27._0_8_ = uVar64;
      auVar52._8_8_ = 0;
      auVar52._0_8_ = _UNK_00831188;
      uVar62 = uVar61 + _UNK_00831170 * uVar69;
      auVar28._8_8_ = 0;
      auVar28._0_8_ = _UNK_00831170;
      auVar53._8_8_ = 0;
      auVar53._0_8_ = uVar69;
      uVar72 = uVar62 + uVar56 * _UNK_00831190;
      auVar29._8_8_ = 0;
      auVar29._0_8_ = uVar56;
      auVar54._8_8_ = 0;
      auVar54._0_8_ = _UNK_00831190;
      uVar67 = uVar3 >> 0x33 | uVar60 * 0x2000;
      uVar5 = uVar71 + uVar67;
      uVar68 = SUB168(auVar22 * auVar47,8) + SUB168(auVar17 * auVar42,8) +
               (ulong)CARRY8(uVar65 * _UNK_00831178,uVar58 * uVar69) + SUB168(auVar23 * auVar48,8) +
               (ulong)CARRY8(uVar1,uVar64 * _UNK_00831180) + SUB168(auVar21 * auVar46,8) +
               (ulong)CARRY8(uVar68,_UNK_00831170 * uVar66) + SUB168(auVar24 * auVar49,8) +
               (ulong)CARRY8(uVar70,uVar56 * _UNK_00831188) + (uVar60 >> 0x33) +
               (ulong)CARRY8(uVar71,uVar67);
      uVar70 = uVar5 >> 0x33 | uVar68 * 0x2000;
      uVar1 = uVar72 + uVar70;
      uVar64 = (uVar2 & 0x7ffffffffffff) +
               (uVar1 >> 0x33 |
               (SUB168(auVar26 * auVar51,8) + SUB168(auVar25 * auVar50,8) +
                (ulong)CARRY8(uVar65 * _UNK_00831180,uVar66 * _UNK_00831178) +
                SUB168(auVar27 * auVar52,8) + (ulong)CARRY8(uVar59,uVar64 * _UNK_00831188) +
                SUB168(auVar28 * auVar53,8) + (ulong)CARRY8(uVar61,_UNK_00831170 * uVar69) +
                SUB168(auVar29 * auVar54,8) + (ulong)CARRY8(uVar62,uVar56 * _UNK_00831190) +
                (uVar68 >> 0x33) + (ulong)CARRY8(uVar72,uVar70)) * 0x2000) * 0x13;
      uVar56 = (uVar4 & 0x7ffffffffffff) + (uVar64 >> 0x33);
      *(ulong *)(lVar57 + 0x78) = uVar64 & 0x7ffffffffffff;
      *(ulong *)(lVar57 + 0x80) = uVar56 & 0x7ffffffffffff;
      *(ulong *)(lVar57 + 0x88) = (uVar3 & 0x7ffffffffffff) + (uVar56 >> 0x33);
      *(ulong *)(lVar57 + 0x98) = (ulong)((uint7)uVar1 & 0x7ffffffffffff);
      *(ulong *)(lVar57 + 0x90) = (ulong)((uint7)uVar5 & 0x7ffffffffffff);
      return;
    }
  }
  else {
    func_0x0079f528();
  }
  lVar57 = func_0x0079f54c();
  puVar63 = *(undefined8 **)(lVar57 + 8);
  *(undefined8 *)((long)puVar63 + 0x54) = 0;
  *(undefined8 *)((long)puVar63 + 0x4c) = 0;
  puVar63[7] = 0;
  puVar63[6] = 0;
  puVar63[9] = 0;
  puVar63[8] = 0;
  puVar63[3] = 0;
  puVar63[2] = 0;
  puVar63[5] = 0;
  puVar63[4] = 0;
  uVar73 = _UNK_0082e9f0;
  puVar63[1] = _UNK_0082e9f8;
  *puVar63 = uVar73;
  return;
}

