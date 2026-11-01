
void FUN_002d241c(long param_1,undefined8 param_2,undefined8 param_3,ulong param_4,
                 undefined8 param_5,long param_6)

{
  uint uVar1;
  uint uVar2;
  undefined1 *puVar3;
  uint uVar4;
  undefined4 uVar5;
  uint uVar6;
  long in_x9;
  ulong uVar7;
  uint uVar8;
  uint uVar9;
  long lVar10;
  undefined1 auVar11 [16];
  
  uVar5 = (undefined4)((ulong)param_5 >> 0x20);
  uVar4 = (uint)param_5;
  if (in_x9 == param_1) {
    return;
  }
  auVar11 = ___stack_chk_fail();
  puVar3 = auVar11._0_8_;
  if (uVar4 - 8 < 0xfffffff9) {
LAB_002d2570:
    func_0x0079e8b0();
  }
  else if (param_4 != 0) {
    uVar1 = 2 << (ulong)(uVar4 & 0x1f);
    uVar6 = uVar1 - 1 & *auVar11._8_8_;
    if (param_4 != 0xffffffffffffffff) {
      uVar2 = 1 << (ulong)(uVar4 & 0x1f);
      uVar7 = (ulong)uVar4;
      lVar10 = param_4 + 1;
      do {
        uVar7 = uVar7 + 1;
        if (((int)uVar6 < 0) || ((int)uVar1 < (int)uVar6)) {
          func_0x0079e928();
code_r0x002d255c:
          func_0x0079e950();
code_r0x002d2560:
          func_0x0079e9ec();
code_r0x002d2564:
          func_0x0079e974();
code_r0x002d2568:
          func_0x0079e99c();
code_r0x002d256c:
          func_0x0079e9c4();
          goto LAB_002d2570;
        }
        if ((uVar6 & 1) != 0) {
          if ((int)uVar1 <= (int)uVar6) goto code_r0x002d2560;
          uVar9 = uVar6 - uVar1;
          if (param_4 <= uVar7) {
            uVar9 = uVar6 & uVar1 - 1 >> 1;
          }
          uVar8 = uVar6;
          if ((uVar6 & uVar2) != 0) {
            uVar8 = uVar9;
          }
          uVar6 = uVar6 - uVar8;
          if (((uVar6 == 0) || (uVar6 == uVar1)) || (uVar6 == uVar2)) {
            if (((int)uVar8 <= (int)-uVar2) || ((int)uVar2 <= (int)uVar8)) goto code_r0x002d2564;
            if ((uVar8 & 1) != 0) goto code_r0x002d2504;
            goto code_r0x002d2568;
          }
          goto code_r0x002d256c;
        }
        uVar8 = 0;
code_r0x002d2504:
        *puVar3 = (char)uVar8;
        if (uVar7 >> 6 < param_4 + 0x3f >> 6) {
          uVar9 = (uint)(*(ulong *)(auVar11._8_8_ + (uVar7 >> 6) * 2) >> (uVar7 & 0x3f)) & 1;
        }
        else {
          uVar9 = 0;
        }
        uVar6 = (uVar9 << (ulong)(uVar4 & 0x1f)) + ((int)uVar6 >> 1);
        if ((int)uVar1 < (int)uVar6) goto code_r0x002d255c;
        puVar3 = puVar3 + 1;
        lVar10 = lVar10 + -1;
      } while (lVar10 != 0);
    }
    if (uVar6 == 0) {
      return;
    }
    goto code_r0x002d2578;
  }
  func_0x0079e8d8();
code_r0x002d2578:
  auVar11 = func_0x0079e900();
  lVar10 = param_6 << 3;
  if (lVar10 == 0) {
    return;
  }
  _memcpy(auVar11._0_8_,CONCAT44(uVar5,uVar4),lVar10);
  _memcpy(auVar11._8_8_,CONCAT44(uVar5,uVar4) + param_6 * 8,lVar10);
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__memcpy_00a250b8)(param_4,CONCAT44(uVar5,uVar4) + param_6 * 0x10,lVar10);
  return;
}

