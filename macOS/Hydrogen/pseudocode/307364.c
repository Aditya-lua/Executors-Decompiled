
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_00307364(ulong param_1,undefined8 param_2,undefined8 param_3,ulong *param_4)

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
  undefined8 uVar55;
  bool in_ZR;
  ulong *puVar56;
  ulong uVar57;
  ulong uVar58;
  ulong uVar59;
  ulong uVar60;
  ulong uVar61;
  ulong uVar62;
  ulong uVar63;
  undefined8 *puVar64;
  ulong uVar65;
  ulong uVar66;
  ulong uVar67;
  ulong uVar68;
  ulong uVar69;
  ulong uVar70;
  ulong uVar71;
  ulong uVar72;
  ulong uVar73;
  ulong uVar74;
  ulong uVar75;
  ulong uVar76;
  ulong uVar77;
  undefined1 auVar78 [16];
  
  if (in_ZR) {
    _memcpy(param_1 + (param_1 & 8));
    return (ulong *)((long)&MACH_HEADER.magic + 1);
  }
  auVar78 = func_0x0079f4e0();
  auVar78._8_8_ = auVar78._8_8_;
  puVar56 = auVar78._0_8_;
  uVar63 = *auVar78._8_8_;
  if ((((uVar63 < 0x1a666666666665) && (uVar65 = auVar78._8_8_[1], uVar65 < 0x1a666666666665)) &&
      (uVar66 = auVar78._8_8_[2], uVar66 < 0x1a666666666665)) &&
     ((uVar67 = auVar78._8_8_[3], uVar67 < 0x1a666666666665 &&
      (uVar70 = auVar78._8_8_[4], uVar70 < 0x1a666666666665)))) {
    uVar72 = *param_4;
    if (((uVar72 < 0x1a666666666665) && (uVar73 = param_4[1], uVar73 < 0x1a666666666665)) &&
       ((uVar74 = param_4[2], uVar74 < 0x1a666666666665 &&
        ((uVar75 = param_4[3], uVar75 < 0x1a666666666665 &&
         (uVar57 = param_4[4], uVar57 < 0x1a666666666665)))))) {
      uVar58 = uVar57 * 0x13;
      uVar59 = uVar75 * 0x13;
      auVar78._8_8_ = 0;
      auVar78._0_8_ = uVar59;
      auVar30._8_8_ = 0;
      auVar30._0_8_ = uVar70;
      uVar61 = uVar74 * 0x13;
      auVar6._8_8_ = 0;
      auVar6._0_8_ = uVar73 * 0x13;
      auVar31._8_8_ = 0;
      auVar31._0_8_ = uVar70;
      uVar76 = uVar73 * 0x13 * uVar70;
      uVar1 = uVar67 * uVar61 + uVar76;
      auVar7._8_8_ = 0;
      auVar7._0_8_ = uVar67;
      auVar32._8_8_ = 0;
      auVar32._0_8_ = uVar61;
      uVar69 = uVar1 + uVar66 * uVar59;
      auVar8._8_8_ = 0;
      auVar8._0_8_ = uVar66;
      auVar33._8_8_ = 0;
      auVar33._0_8_ = uVar59;
      uVar71 = uVar69 + uVar65 * uVar58;
      auVar9._8_8_ = 0;
      auVar9._0_8_ = uVar65;
      auVar34._8_8_ = 0;
      auVar34._0_8_ = uVar58;
      uVar2 = uVar71 + uVar63 * uVar72;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = uVar63;
      auVar35._8_8_ = 0;
      auVar35._0_8_ = uVar72;
      uVar77 = SUB168(auVar7 * auVar32,8) + SUB168(auVar6 * auVar31,8) +
               (ulong)CARRY8(uVar67 * uVar61,uVar76) + SUB168(auVar8 * auVar33,8) +
               (ulong)CARRY8(uVar1,uVar66 * uVar59) + SUB168(auVar9 * auVar34,8) +
               (ulong)CARRY8(uVar69,uVar65 * uVar58) + SUB168(auVar10 * auVar35,8) +
               (ulong)CARRY8(uVar71,uVar63 * uVar72);
      uVar1 = uVar67 * uVar58 + uVar59 * uVar70;
      auVar11._8_8_ = 0;
      auVar11._0_8_ = uVar67;
      auVar36._8_8_ = 0;
      auVar36._0_8_ = uVar58;
      uVar69 = uVar67 * uVar59 + uVar61 * uVar70;
      auVar12._8_8_ = 0;
      auVar12._0_8_ = uVar61;
      auVar37._8_8_ = 0;
      auVar37._0_8_ = uVar70;
      auVar13._8_8_ = 0;
      auVar13._0_8_ = uVar67;
      auVar38._8_8_ = 0;
      auVar38._0_8_ = uVar59;
      uVar71 = uVar69 + uVar66 * uVar58;
      auVar14._8_8_ = 0;
      auVar14._0_8_ = uVar66;
      auVar39._8_8_ = 0;
      auVar39._0_8_ = uVar58;
      uVar76 = uVar71 + uVar72 * uVar65;
      auVar15._8_8_ = 0;
      auVar15._0_8_ = uVar72;
      auVar40._8_8_ = 0;
      auVar40._0_8_ = uVar65;
      uVar3 = uVar76 + uVar63 * uVar73;
      auVar16._8_8_ = 0;
      auVar16._0_8_ = uVar63;
      auVar41._8_8_ = 0;
      auVar41._0_8_ = uVar73;
      uVar62 = uVar2 >> 0x33 | uVar77 * 0x2000;
      uVar4 = uVar3 + uVar62;
      auVar17._8_8_ = 0;
      auVar17._0_8_ = uVar58;
      auVar42._8_8_ = 0;
      auVar42._0_8_ = uVar70;
      uVar61 = SUB168(auVar13 * auVar38,8) + SUB168(auVar12 * auVar37,8) +
               (ulong)CARRY8(uVar67 * uVar59,uVar61 * uVar70) + SUB168(auVar14 * auVar39,8) +
               (ulong)CARRY8(uVar69,uVar66 * uVar58) + SUB168(auVar15 * auVar40,8) +
               (ulong)CARRY8(uVar71,uVar72 * uVar65) + SUB168(auVar16 * auVar41,8) +
               (ulong)CARRY8(uVar76,uVar63 * uVar73) + (uVar77 >> 0x33) +
               (ulong)CARRY8(uVar3,uVar62);
      uVar69 = uVar1 + uVar65 * uVar73;
      auVar18._8_8_ = 0;
      auVar18._0_8_ = uVar65;
      auVar43._8_8_ = 0;
      auVar43._0_8_ = uVar73;
      uVar71 = uVar69 + uVar72 * uVar66;
      auVar19._8_8_ = 0;
      auVar19._0_8_ = uVar72;
      auVar44._8_8_ = 0;
      auVar44._0_8_ = uVar66;
      uVar76 = uVar71 + uVar63 * uVar74;
      auVar20._8_8_ = 0;
      auVar20._0_8_ = uVar63;
      auVar45._8_8_ = 0;
      auVar45._0_8_ = uVar74;
      uVar62 = uVar4 >> 0x33 | uVar61 * 0x2000;
      uVar3 = uVar76 + uVar62;
      auVar21._8_8_ = 0;
      auVar21._0_8_ = uVar72;
      auVar46._8_8_ = 0;
      auVar46._0_8_ = uVar67;
      uVar60 = SUB168(auVar11 * auVar36,8) + SUB168(auVar78 * auVar30,8) +
               (ulong)CARRY8(uVar67 * uVar58,uVar59 * uVar70) + SUB168(auVar18 * auVar43,8) +
               (ulong)CARRY8(uVar1,uVar65 * uVar73) + SUB168(auVar19 * auVar44,8) +
               (ulong)CARRY8(uVar69,uVar72 * uVar66) + SUB168(auVar20 * auVar45,8) +
               (ulong)CARRY8(uVar71,uVar63 * uVar74) + (uVar61 >> 0x33) +
               (ulong)CARRY8(uVar76,uVar62);
      uVar1 = uVar66 * uVar73 + uVar58 * uVar70;
      auVar22._8_8_ = 0;
      auVar22._0_8_ = uVar66;
      auVar47._8_8_ = 0;
      auVar47._0_8_ = uVar73;
      uVar69 = uVar1 + uVar65 * uVar74;
      auVar23._8_8_ = 0;
      auVar23._0_8_ = uVar65;
      auVar48._8_8_ = 0;
      auVar48._0_8_ = uVar74;
      uVar71 = uVar69 + uVar72 * uVar67;
      auVar24._8_8_ = 0;
      auVar24._0_8_ = uVar63;
      auVar49._8_8_ = 0;
      auVar49._0_8_ = uVar75;
      uVar76 = uVar71 + uVar63 * uVar75;
      uVar59 = uVar66 * uVar74 + uVar67 * uVar73;
      auVar25._8_8_ = 0;
      auVar25._0_8_ = uVar67;
      auVar50._8_8_ = 0;
      auVar50._0_8_ = uVar73;
      auVar26._8_8_ = 0;
      auVar26._0_8_ = uVar66;
      auVar51._8_8_ = 0;
      auVar51._0_8_ = uVar74;
      uVar61 = uVar59 + uVar65 * uVar75;
      auVar27._8_8_ = 0;
      auVar27._0_8_ = uVar65;
      auVar52._8_8_ = 0;
      auVar52._0_8_ = uVar75;
      uVar62 = uVar61 + uVar72 * uVar70;
      auVar28._8_8_ = 0;
      auVar28._0_8_ = uVar72;
      auVar53._8_8_ = 0;
      auVar53._0_8_ = uVar70;
      uVar77 = uVar62 + uVar63 * uVar57;
      auVar29._8_8_ = 0;
      auVar29._0_8_ = uVar63;
      auVar54._8_8_ = 0;
      auVar54._0_8_ = uVar57;
      uVar68 = uVar3 >> 0x33 | uVar60 * 0x2000;
      uVar5 = uVar76 + uVar68;
      uVar69 = SUB168(auVar22 * auVar47,8) + SUB168(auVar17 * auVar42,8) +
               (ulong)CARRY8(uVar66 * uVar73,uVar58 * uVar70) + SUB168(auVar23 * auVar48,8) +
               (ulong)CARRY8(uVar1,uVar65 * uVar74) + SUB168(auVar21 * auVar46,8) +
               (ulong)CARRY8(uVar69,uVar72 * uVar67) + SUB168(auVar24 * auVar49,8) +
               (ulong)CARRY8(uVar71,uVar63 * uVar75) + (uVar60 >> 0x33) +
               (ulong)CARRY8(uVar76,uVar68);
      uVar71 = uVar5 >> 0x33 | uVar69 * 0x2000;
      uVar1 = uVar77 + uVar71;
      uVar65 = (uVar2 & 0x7ffffffffffff) +
               (uVar1 >> 0x33 |
               (SUB168(auVar26 * auVar51,8) + SUB168(auVar25 * auVar50,8) +
                (ulong)CARRY8(uVar66 * uVar74,uVar67 * uVar73) + SUB168(auVar27 * auVar52,8) +
                (ulong)CARRY8(uVar59,uVar65 * uVar75) + SUB168(auVar28 * auVar53,8) +
                (ulong)CARRY8(uVar61,uVar72 * uVar70) + SUB168(auVar29 * auVar54,8) +
                (ulong)CARRY8(uVar62,uVar63 * uVar57) + (uVar69 >> 0x33) +
               (ulong)CARRY8(uVar77,uVar71)) * 0x2000) * 0x13;
      uVar63 = (uVar4 & 0x7ffffffffffff) + (uVar65 >> 0x33);
      *puVar56 = uVar65 & 0x7ffffffffffff;
      puVar56[1] = uVar63 & 0x7ffffffffffff;
      puVar56[2] = (uVar3 & 0x7ffffffffffff) + (uVar63 >> 0x33);
      puVar56[4] = (ulong)((uint7)uVar1 & 0x7ffffffffffff);
      puVar56[3] = (ulong)((uint7)uVar5 & 0x7ffffffffffff);
      return puVar56;
    }
  }
  else {
    func_0x0079f528();
  }
  puVar56 = (ulong *)func_0x0079f54c();
  puVar64 = (undefined8 *)puVar56[1];
  *(undefined8 *)((long)puVar64 + 0x54) = 0;
  *(undefined8 *)((long)puVar64 + 0x4c) = 0;
  puVar64[7] = 0;
  puVar64[6] = 0;
  puVar64[9] = 0;
  puVar64[8] = 0;
  puVar64[3] = 0;
  puVar64[2] = 0;
  puVar64[5] = 0;
  puVar64[4] = 0;
  uVar55 = _UNK_0082e9f0;
  puVar64[1] = _UNK_0082e9f8;
  *puVar64 = uVar55;
  return puVar56;
}

