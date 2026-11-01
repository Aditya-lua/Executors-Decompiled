
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_003071fc(void)

{
  long lVar1;
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
  undefined8 uVar56;
  int iVar57;
  ulong *puVar58;
  ulong *puVar59;
  ulong uVar60;
  ulong *puVar61;
  ulong uVar62;
  long *plVar63;
  ulong uVar64;
  ulong uVar65;
  ulong uVar66;
  ulong uVar67;
  undefined8 *puVar68;
  ulong uVar69;
  ulong uVar70;
  ulong uVar71;
  ulong uVar72;
  ulong uVar73;
  ulong uVar74;
  ulong uVar75;
  ulong uVar76;
  ulong uVar77;
  ulong uVar78;
  ulong uVar79;
  ulong uVar80;
  ulong *unaff_x19;
  ulong uVar81;
  ulong *unaff_x20;
  ulong uVar82;
  undefined1 auVar83 [16];
  long lStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  
  func_0x002f31b0();
  lStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  plVar63 = &lStack0000000000000008;
  puVar61 = unaff_x20;
  iVar57 = func_0x00306af8();
  if ((iVar57 == 0) ||
     ((puVar61 = (ulong *)(ulong)*(uint *)((long)unaff_x20 + 0x13c),
      *(uint *)((long)unaff_x20 + 0x13c) != 0 &&
      (iVar57 = _memcmp(unaff_x20 + 0x29,&lStack0000000000000008), iVar57 != 0)))) {
    func_0x0036e464();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
      return (ulong *)0xffffffff;
    }
  }
  else {
    *(undefined4 *)((long)unaff_x20 + 0x131) = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
      return unaff_x19;
    }
  }
  ___stack_chk_fail();
  func_0x0079f504();
  auVar83 = func_0x0079f4e0();
  auVar83._0_8_ = auVar83._0_8_;
  if (*(int *)(*auVar83._0_8_ + 0x10) == 0x178) {
    uVar69 = auVar83._0_8_[2];
    if ((uVar69 & 7) != 0) goto LAB_003074b4;
    puVar58 = (ulong *)0xffffffff;
    if (0x19 < auVar83._8_4_) {
      return (ulong *)0xffffffff;
    }
    lVar1 = uVar69 + (uVar69 & 8);
    iVar57 = (int)puVar61;
    switch(auVar83._8_8_ & 0xffffffff) {
    case 0:
      func_0x0036e464(lVar1,0x170);
      *(undefined1 *)(lVar1 + 0x134) = 0;
      *(undefined4 *)(lVar1 + 0x130) = 0;
      *(undefined8 *)(lVar1 + 0x138) = _UNK_00830288;
      *(undefined8 *)(lVar1 + 0x140) = 0;
      return (ulong *)((long)&MACH_HEADER.magic + 1);
    case 8:
      if (*(int *)(*plVar63 + 0x10) == 0x178) {
        uVar69 = plVar63[2];
        if ((uVar69 & 7) == 0) {
          _memcpy(uVar69 + (uVar69 & 8),lVar1,0x170);
          return (ulong *)((long)&MACH_HEADER.magic + 1);
        }
        goto code_r0x003074bc;
      }
      goto code_r0x003074b8;
    case 9:
      if (0xfffffff8 < iVar57 - 0xeU) {
        *(int *)(lVar1 + 0x138) = 0xf - iVar57;
        return (ulong *)((long)&MACH_HEADER.magic + 1);
      }
      puVar58 = (ulong *)0x0;
      break;
    case 0x10:
      if (*(int *)((long)auVar83._0_8_ + 0x1c) == 0) {
        return (ulong *)0x0;
      }
      if (*(char *)(lVar1 + 0x132) == '\0') {
        return (ulong *)0x0;
      }
      if ((long)iVar57 != (ulong)*(uint *)(lVar1 + 0x13c)) {
        return (ulong *)0x0;
      }
      if (*(uint *)(lVar1 + 0x13c) != 0) {
        _memcpy(plVar63,lVar1 + 0x148);
      }
      *(undefined4 *)(lVar1 + 0x131) = 0;
      return (ulong *)((long)&MACH_HEADER.magic + 1);
    case 0x11:
      puVar58 = (ulong *)0x0;
      if ((((ulong)puVar61 & 1) == 0) && (0xfffffff2 < iVar57 - 0x11U)) {
        if ((plVar63 != (long *)0x0) && (*(int *)((long)auVar83._0_8_ + 0x1c) != 0)) {
          return (ulong *)0x0;
        }
        if (plVar63 != (long *)0x0) {
          _memcpy(lVar1 + 0x148,plVar63,(ulong)puVar61 & 0xffffffff);
          *(undefined1 *)(lVar1 + 0x132) = 1;
        }
        *(int *)(lVar1 + 0x13c) = iVar57;
        return (ulong *)((long)&MACH_HEADER.magic + 1);
      }
      break;
    case 0x14:
      if (iVar57 - 9U < 0xfffffff9) {
        return (ulong *)0x0;
      }
      *(int *)(lVar1 + 0x138) = iVar57;
      return (ulong *)((long)&MACH_HEADER.magic + 1);
    case 0x19:
      *(int *)plVar63 = 0xf - *(int *)(lVar1 + 0x138);
      return (ulong *)((long)&MACH_HEADER.magic + 1);
    }
    return puVar58;
  }
  func_0x0079f504();
LAB_003074b4:
  puVar58 = (ulong *)func_0x0079f4e0();
code_r0x003074b8:
  func_0x0079f504(puVar58);
code_r0x003074bc:
  auVar83 = func_0x0079f4e0();
  puVar59 = auVar83._8_8_;
  puVar58 = auVar83._0_8_;
  uVar69 = *puVar59;
  if ((((uVar69 < 0x1a666666666665) && (uVar70 = puVar59[1], uVar70 < 0x1a666666666665)) &&
      (uVar71 = puVar59[2], uVar71 < 0x1a666666666665)) &&
     ((uVar72 = puVar59[3], uVar72 < 0x1a666666666665 &&
      (uVar75 = puVar59[4], uVar75 < 0x1a666666666665)))) {
    uVar77 = *puVar61;
    if (((uVar77 < 0x1a666666666665) && (uVar78 = puVar61[1], uVar78 < 0x1a666666666665)) &&
       ((uVar79 = puVar61[2], uVar79 < 0x1a666666666665 &&
        ((uVar80 = puVar61[3], uVar80 < 0x1a666666666665 &&
         (uVar60 = puVar61[4], uVar60 < 0x1a666666666665)))))) {
      uVar62 = uVar60 * 0x13;
      uVar64 = uVar80 * 0x13;
      auVar83._8_8_ = 0;
      auVar83._0_8_ = uVar64;
      auVar31._8_8_ = 0;
      auVar31._0_8_ = uVar75;
      uVar66 = uVar79 * 0x13;
      auVar7._8_8_ = 0;
      auVar7._0_8_ = uVar78 * 0x13;
      auVar32._8_8_ = 0;
      auVar32._0_8_ = uVar75;
      uVar81 = uVar78 * 0x13 * uVar75;
      uVar2 = uVar72 * uVar66 + uVar81;
      auVar8._8_8_ = 0;
      auVar8._0_8_ = uVar72;
      auVar33._8_8_ = 0;
      auVar33._0_8_ = uVar66;
      uVar74 = uVar2 + uVar71 * uVar64;
      auVar9._8_8_ = 0;
      auVar9._0_8_ = uVar71;
      auVar34._8_8_ = 0;
      auVar34._0_8_ = uVar64;
      uVar76 = uVar74 + uVar70 * uVar62;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = uVar70;
      auVar35._8_8_ = 0;
      auVar35._0_8_ = uVar62;
      uVar3 = uVar76 + uVar69 * uVar77;
      auVar11._8_8_ = 0;
      auVar11._0_8_ = uVar69;
      auVar36._8_8_ = 0;
      auVar36._0_8_ = uVar77;
      uVar82 = SUB168(auVar8 * auVar33,8) + SUB168(auVar7 * auVar32,8) +
               (ulong)CARRY8(uVar72 * uVar66,uVar81) + SUB168(auVar9 * auVar34,8) +
               (ulong)CARRY8(uVar2,uVar71 * uVar64) + SUB168(auVar10 * auVar35,8) +
               (ulong)CARRY8(uVar74,uVar70 * uVar62) + SUB168(auVar11 * auVar36,8) +
               (ulong)CARRY8(uVar76,uVar69 * uVar77);
      uVar2 = uVar72 * uVar62 + uVar64 * uVar75;
      auVar12._8_8_ = 0;
      auVar12._0_8_ = uVar72;
      auVar37._8_8_ = 0;
      auVar37._0_8_ = uVar62;
      uVar74 = uVar72 * uVar64 + uVar66 * uVar75;
      auVar13._8_8_ = 0;
      auVar13._0_8_ = uVar66;
      auVar38._8_8_ = 0;
      auVar38._0_8_ = uVar75;
      auVar14._8_8_ = 0;
      auVar14._0_8_ = uVar72;
      auVar39._8_8_ = 0;
      auVar39._0_8_ = uVar64;
      uVar76 = uVar74 + uVar71 * uVar62;
      auVar15._8_8_ = 0;
      auVar15._0_8_ = uVar71;
      auVar40._8_8_ = 0;
      auVar40._0_8_ = uVar62;
      uVar81 = uVar76 + uVar77 * uVar70;
      auVar16._8_8_ = 0;
      auVar16._0_8_ = uVar77;
      auVar41._8_8_ = 0;
      auVar41._0_8_ = uVar70;
      uVar4 = uVar81 + uVar69 * uVar78;
      auVar17._8_8_ = 0;
      auVar17._0_8_ = uVar69;
      auVar42._8_8_ = 0;
      auVar42._0_8_ = uVar78;
      uVar67 = uVar3 >> 0x33 | uVar82 * 0x2000;
      uVar5 = uVar4 + uVar67;
      auVar18._8_8_ = 0;
      auVar18._0_8_ = uVar62;
      auVar43._8_8_ = 0;
      auVar43._0_8_ = uVar75;
      uVar66 = SUB168(auVar14 * auVar39,8) + SUB168(auVar13 * auVar38,8) +
               (ulong)CARRY8(uVar72 * uVar64,uVar66 * uVar75) + SUB168(auVar15 * auVar40,8) +
               (ulong)CARRY8(uVar74,uVar71 * uVar62) + SUB168(auVar16 * auVar41,8) +
               (ulong)CARRY8(uVar76,uVar77 * uVar70) + SUB168(auVar17 * auVar42,8) +
               (ulong)CARRY8(uVar81,uVar69 * uVar78) + (uVar82 >> 0x33) +
               (ulong)CARRY8(uVar4,uVar67);
      uVar74 = uVar2 + uVar70 * uVar78;
      auVar19._8_8_ = 0;
      auVar19._0_8_ = uVar70;
      auVar44._8_8_ = 0;
      auVar44._0_8_ = uVar78;
      uVar76 = uVar74 + uVar77 * uVar71;
      auVar20._8_8_ = 0;
      auVar20._0_8_ = uVar77;
      auVar45._8_8_ = 0;
      auVar45._0_8_ = uVar71;
      uVar81 = uVar76 + uVar69 * uVar79;
      auVar21._8_8_ = 0;
      auVar21._0_8_ = uVar69;
      auVar46._8_8_ = 0;
      auVar46._0_8_ = uVar79;
      uVar67 = uVar5 >> 0x33 | uVar66 * 0x2000;
      uVar4 = uVar81 + uVar67;
      auVar22._8_8_ = 0;
      auVar22._0_8_ = uVar77;
      auVar47._8_8_ = 0;
      auVar47._0_8_ = uVar72;
      uVar65 = SUB168(auVar12 * auVar37,8) + SUB168(auVar83 * auVar31,8) +
               (ulong)CARRY8(uVar72 * uVar62,uVar64 * uVar75) + SUB168(auVar19 * auVar44,8) +
               (ulong)CARRY8(uVar2,uVar70 * uVar78) + SUB168(auVar20 * auVar45,8) +
               (ulong)CARRY8(uVar74,uVar77 * uVar71) + SUB168(auVar21 * auVar46,8) +
               (ulong)CARRY8(uVar76,uVar69 * uVar79) + (uVar66 >> 0x33) +
               (ulong)CARRY8(uVar81,uVar67);
      uVar2 = uVar71 * uVar78 + uVar62 * uVar75;
      auVar23._8_8_ = 0;
      auVar23._0_8_ = uVar71;
      auVar48._8_8_ = 0;
      auVar48._0_8_ = uVar78;
      uVar74 = uVar2 + uVar70 * uVar79;
      auVar24._8_8_ = 0;
      auVar24._0_8_ = uVar70;
      auVar49._8_8_ = 0;
      auVar49._0_8_ = uVar79;
      uVar76 = uVar74 + uVar77 * uVar72;
      auVar25._8_8_ = 0;
      auVar25._0_8_ = uVar69;
      auVar50._8_8_ = 0;
      auVar50._0_8_ = uVar80;
      uVar81 = uVar76 + uVar69 * uVar80;
      uVar64 = uVar71 * uVar79 + uVar72 * uVar78;
      auVar26._8_8_ = 0;
      auVar26._0_8_ = uVar72;
      auVar51._8_8_ = 0;
      auVar51._0_8_ = uVar78;
      auVar27._8_8_ = 0;
      auVar27._0_8_ = uVar71;
      auVar52._8_8_ = 0;
      auVar52._0_8_ = uVar79;
      uVar66 = uVar64 + uVar70 * uVar80;
      auVar28._8_8_ = 0;
      auVar28._0_8_ = uVar70;
      auVar53._8_8_ = 0;
      auVar53._0_8_ = uVar80;
      uVar67 = uVar66 + uVar77 * uVar75;
      auVar29._8_8_ = 0;
      auVar29._0_8_ = uVar77;
      auVar54._8_8_ = 0;
      auVar54._0_8_ = uVar75;
      uVar82 = uVar67 + uVar69 * uVar60;
      auVar30._8_8_ = 0;
      auVar30._0_8_ = uVar69;
      auVar55._8_8_ = 0;
      auVar55._0_8_ = uVar60;
      uVar73 = uVar4 >> 0x33 | uVar65 * 0x2000;
      uVar6 = uVar81 + uVar73;
      uVar74 = SUB168(auVar23 * auVar48,8) + SUB168(auVar18 * auVar43,8) +
               (ulong)CARRY8(uVar71 * uVar78,uVar62 * uVar75) + SUB168(auVar24 * auVar49,8) +
               (ulong)CARRY8(uVar2,uVar70 * uVar79) + SUB168(auVar22 * auVar47,8) +
               (ulong)CARRY8(uVar74,uVar77 * uVar72) + SUB168(auVar25 * auVar50,8) +
               (ulong)CARRY8(uVar76,uVar69 * uVar80) + (uVar65 >> 0x33) +
               (ulong)CARRY8(uVar81,uVar73);
      uVar76 = uVar6 >> 0x33 | uVar74 * 0x2000;
      uVar2 = uVar82 + uVar76;
      uVar70 = (uVar3 & 0x7ffffffffffff) +
               (uVar2 >> 0x33 |
               (SUB168(auVar27 * auVar52,8) + SUB168(auVar26 * auVar51,8) +
                (ulong)CARRY8(uVar71 * uVar79,uVar72 * uVar78) + SUB168(auVar28 * auVar53,8) +
                (ulong)CARRY8(uVar64,uVar70 * uVar80) + SUB168(auVar29 * auVar54,8) +
                (ulong)CARRY8(uVar66,uVar77 * uVar75) + SUB168(auVar30 * auVar55,8) +
                (ulong)CARRY8(uVar67,uVar69 * uVar60) + (uVar74 >> 0x33) +
               (ulong)CARRY8(uVar82,uVar76)) * 0x2000) * 0x13;
      uVar69 = (uVar5 & 0x7ffffffffffff) + (uVar70 >> 0x33);
      *puVar58 = uVar70 & 0x7ffffffffffff;
      puVar58[1] = uVar69 & 0x7ffffffffffff;
      puVar58[2] = (uVar4 & 0x7ffffffffffff) + (uVar69 >> 0x33);
      puVar58[4] = (ulong)((uint7)uVar2 & 0x7ffffffffffff);
      puVar58[3] = (ulong)((uint7)uVar6 & 0x7ffffffffffff);
      return puVar58;
    }
  }
  else {
    func_0x0079f528();
  }
  puVar61 = (ulong *)func_0x0079f54c();
  puVar68 = (undefined8 *)puVar61[1];
  *(undefined8 *)((long)puVar68 + 0x54) = 0;
  *(undefined8 *)((long)puVar68 + 0x4c) = 0;
  puVar68[7] = 0;
  puVar68[6] = 0;
  puVar68[9] = 0;
  puVar68[8] = 0;
  puVar68[3] = 0;
  puVar68[2] = 0;
  puVar68[5] = 0;
  puVar68[4] = 0;
  uVar56 = _UNK_0082e9f0;
  puVar68[1] = _UNK_0082e9f8;
  *puVar68 = uVar56;
  return puVar61;
}

