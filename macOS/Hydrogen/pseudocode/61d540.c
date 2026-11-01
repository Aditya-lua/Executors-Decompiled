
void FUN_0061d540(long *param_1,ulong param_2,ulong param_3,ulong param_4)

{
  code *pcVar1;
  bool bVar2;
  uint uVar3;
  int iVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 uVar7;
  byte bVar8;
  ulong uVar9;
  ulong uVar10;
  bool bVar11;
  long lVar12;
  undefined2 uVar13;
  uint uVar14;
  uint uVar15;
  undefined1 uStack0000000000000008;
  
  plVar5 = (long *)(**(code **)(*param_1 + 0x100))();
  uVar6 = (**(code **)(*plVar5 + 0x18))();
  uVar9 = param_1[0x11];
  if (uVar9 != 0) {
    uVar10 = uVar9;
    if (param_4 <= uVar9) {
      uVar10 = param_4;
    }
    func_0x00685528(param_2,param_3,(param_1[0x10] + param_1[0xf]) - uVar9,uVar10);
    param_3 = param_3 + uVar10;
    param_2 = param_2 + uVar10;
    param_4 = param_4 - uVar10;
    param_1[0x11] = param_1[0x11] - uVar10;
  }
  if (param_4 == 0) {
    return;
  }
  uVar6 = uVar6 & 0xffffffff;
  uVar3 = (**(code **)(*plVar5 + 0x10))(plVar5);
  uVar15 = uVar3 - 1;
  if (uVar15 == 0) {
    bVar2 = true;
    bVar11 = true;
  }
  else {
    uVar14 = CONCAT13(POPCOUNT((char)(uVar3 >> 0x18)),
                      CONCAT12(POPCOUNT((char)(uVar3 >> 0x10)),
                               CONCAT11(POPCOUNT((char)(uVar3 >> 8)),POPCOUNT((char)uVar3))));
    uVar13 = NEON_uaddlv((ulong)uVar14,1);
    uVar14 = CONCAT22((short)(uVar14 >> 0x10),uVar13);
    if ((uVar3 == 0) || (1 < uVar14)) {
      uVar10 = (ulong)uVar3;
      uVar9 = 0;
      if (uVar10 != 0) {
        uVar9 = param_3 / uVar10;
      }
      bVar2 = param_3 == uVar9 * uVar10;
    }
    else {
      bVar2 = (uVar15 & (uint)param_3) == 0;
    }
    uVar10 = (ulong)uVar3;
    uVar9 = 0;
    if (uVar10 != 0) {
      uVar9 = param_2 / uVar10;
    }
    bVar11 = param_2 == uVar9 * uVar10;
    if (uVar14 == 1) {
      bVar11 = (uVar15 & (uint)param_2) == 0;
    }
  }
  iVar4 = (**(code **)(*plVar5 + 0x38))(plVar5);
  if (iVar4 == 0 || param_4 < uVar6) {
    uVar9 = param_1[0xf];
    if (param_4 < uVar9) goto joined_r0x0061d674;
  }
  else {
    bVar8 = 2;
    if (!bVar2) {
      bVar8 = 0;
    }
    uVar9 = 0;
    if (uVar6 != 0) {
      uVar9 = param_4 / uVar6;
    }
    (**(code **)(*plVar5 + 0x40))(plVar5,bVar8 | bVar11,param_2,param_3,uVar9);
    lVar12 = uVar9 * uVar6;
    param_3 = param_3 + lVar12;
    param_2 = param_2 + lVar12;
    param_4 = param_4 - lVar12;
    uVar9 = param_1[0xf];
    if (param_4 < uVar9) goto joined_r0x0061d674;
  }
  lVar12 = 0;
  uVar10 = 0;
  if (uVar6 != 0) {
    uVar10 = uVar9 / uVar6;
  }
  do {
    (**(code **)(*plVar5 + 0x30))(plVar5,param_1[0x10],uVar10);
    func_0x00685528(param_2 + lVar12,param_3 + lVar12,param_1[0x10],uVar9);
    lVar12 = lVar12 + uVar9;
    param_4 = param_4 - uVar9;
  } while (uVar9 <= param_4);
  param_2 = param_2 + lVar12;
  param_3 = param_3 + lVar12;
joined_r0x0061d674:
  if (param_4 != 0) {
    if (-uVar6 < param_4) {
      uVar7 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,"RoundUpToMultipleOf: integer overflow");
      func_0x0002703c(uVar7,&uStack0000000000000008);
      ___cxa_throw(uVar7,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x61d810);
      (*pcVar1)();
    }
    uVar10 = (uVar6 + param_4) - 1;
    uVar15 = CONCAT13(POPCOUNT((char)(uVar6 >> 0x18)),
                      CONCAT12(POPCOUNT((char)(uVar6 >> 0x10)),
                               CONCAT11(POPCOUNT((char)(uVar6 >> 8)),POPCOUNT((char)uVar6))));
    uVar13 = NEON_uaddlv((ulong)uVar15,1);
    uVar9 = 0;
    if (uVar6 != 0) {
      uVar9 = uVar10 / uVar6;
    }
    uVar9 = uVar9 * uVar6;
    if (CONCAT22((short)(uVar15 >> 0x10),uVar13) == 1) {
      uVar9 = uVar10 & -uVar6;
    }
    uVar10 = 0;
    if (uVar6 != 0) {
      uVar10 = uVar9 / uVar6;
    }
    (**(code **)(*plVar5 + 0x30))(plVar5,(param_1[0x10] + param_1[0xf]) - uVar9,uVar10);
    func_0x00685528(param_2,param_3,(param_1[0x10] + param_1[0xf]) - uVar9,param_4);
    param_1[0x11] = uVar9 - param_4;
  }
  return;
}

