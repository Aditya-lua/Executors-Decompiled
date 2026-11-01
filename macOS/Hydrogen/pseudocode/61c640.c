
void FUN_0061c640(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  code *pcVar5;
  long *plVar6;
  long *plVar7;
  undefined8 *puVar8;
  char *pcVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  undefined2 uVar13;
  uint uVar14;
  undefined1 auVar15 [16];
  
  auVar15 = __Unwind_Resume();
  lVar12 = auVar15._8_8_;
  plVar6 = auVar15._0_8_;
  uVar10 = plVar6[0xd];
  if (uVar10 != 0) {
    uVar1 = uVar10;
    if (param_3 <= uVar10) {
      uVar1 = param_3;
    }
    _memcpy(lVar12,(plVar6[0xc] + plVar6[0xb]) - uVar10,uVar1);
    plVar6[0xd] = plVar6[0xd] - uVar1;
    param_3 = param_3 - uVar1;
    if (param_3 == 0) {
      return;
    }
    lVar12 = lVar12 + uVar1;
  }
  plVar7 = (long *)(**(code **)(*plVar6 + 0xe0))(plVar6);
  uVar10 = (**(code **)(*plVar7 + 0x18))();
  uVar10 = uVar10 & 0xffffffff;
  if (uVar10 <= param_3) {
    uVar1 = 0;
    if (uVar10 != 0) {
      uVar1 = param_3 / uVar10;
    }
    (**(code **)(*plVar7 + 0x30))(plVar7,lVar12,uVar1);
    param_3 = param_3 - uVar1 * uVar10;
    lVar12 = lVar12 + uVar1 * uVar10;
  }
  if (param_3 != 0) {
    if (-uVar10 < param_3) {
      puVar8 = (undefined8 *)___cxa_allocate_exception(0x28);
      pcVar9 = (char *)__Znwm(0x28);
      *(ulong *)(pcVar9 + 0x1d) =
           CONCAT53(s_RoundUpToMultipleOf__integer_ove_008e5516._32_5_,
                    s_RoundUpToMultipleOf__integer_ove_008e5516._29_3_);
      uVar4 = s_RoundUpToMultipleOf__integer_ove_008e5516._16_8_;
      uVar3 = s_RoundUpToMultipleOf__integer_ove_008e5516._0_8_;
      uVar2 = CONCAT35(s_RoundUpToMultipleOf__integer_ove_008e5516._29_3_,
                       s_RoundUpToMultipleOf__integer_ove_008e5516._24_5_);
      *(undefined8 *)(pcVar9 + 8) = s_RoundUpToMultipleOf__integer_ove_008e5516._8_8_;
      *(undefined8 *)pcVar9 = uVar3;
      *(undefined8 *)(pcVar9 + 0x18) = uVar2;
      *(undefined8 *)(pcVar9 + 0x10) = uVar4;
      pcVar9[0x25] = '\0';
      *puVar8 = &UNK_009b2ec8;
      *(undefined4 *)(puVar8 + 1) = 1;
      func_0x00017634(puVar8 + 2,pcVar9,0x25);
      *puVar8 = &UNK_009b2f08;
      ___cxa_throw(puVar8,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x61c808);
      (*pcVar5)();
    }
    uVar11 = (uVar10 + param_3) - 1;
    uVar14 = CONCAT13(POPCOUNT((char)(uVar10 >> 0x18)),
                      CONCAT12(POPCOUNT((char)(uVar10 >> 0x10)),
                               CONCAT11(POPCOUNT((char)(uVar10 >> 8)),POPCOUNT((char)uVar10))));
    uVar13 = NEON_uaddlv((ulong)uVar14,1);
    uVar1 = 0;
    if (uVar10 != 0) {
      uVar1 = uVar11 / uVar10;
    }
    uVar1 = uVar1 * uVar10;
    if (CONCAT22((short)(uVar14 >> 0x10),uVar13) == 1) {
      uVar1 = uVar11 & -uVar10;
    }
    uVar11 = 0;
    if (uVar10 != 0) {
      uVar11 = uVar1 / uVar10;
    }
    (**(code **)(*plVar7 + 0x30))(plVar7,(plVar6[0xc] + plVar6[0xb]) - uVar1,uVar11);
    _memcpy(lVar12,(plVar6[0xc] + plVar6[0xb]) - uVar1,param_3);
    plVar6[0xd] = uVar1 - param_3;
  }
  return;
}

