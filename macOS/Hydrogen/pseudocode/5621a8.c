
void FUN_005621a8(void)

{
  ulong uVar1;
  long lVar2;
  undefined1 auVar3 [16];
  long lVar4;
  ulong uVar5;
  undefined8 *extraout_x8;
  ulong uVar6;
  ulong uVar7;
  undefined *puVar8;
  undefined1 auVar9 [16];
  
  __Unwind_Resume();
  uVar5 = func_0x007a2668();
  if (uVar5 == 0) {
    auVar9 = ZEXT816(0);
    puVar8 = &UNK_008aaa70;
    goto code_r0x0053c5bc;
  }
  if (uVar5 < 8) {
    uVar6 = 4;
    if (3 < uVar5) {
      uVar6 = 8;
    }
code_r0x0053c514:
    auVar3._8_8_ = 0;
    auVar3._0_8_ = uVar6;
    if (SUB168(auVar3 * ZEXT816(0x28),8) != 0) goto code_r0x0053c548;
    uVar7 = uVar6 * 0x28;
    uVar5 = uVar6 + 8;
    if ((CARRY8(uVar7,uVar5)) || (uVar1 = uVar7 + uVar5, 0x7ffffffffffffff8 < uVar1))
    goto code_r0x0053c548;
    lVar4 = func_0x00187bd0(uVar1,8);
    if (lVar4 != 0) {
      lVar2 = uVar6 - 1;
      if (8 < uVar6) {
        lVar2 = (uVar6 >> 3) * 7;
      }
      auVar9._8_8_ = lVar2;
      auVar9._0_8_ = uVar6 - 1;
      puVar8 = (undefined *)(lVar4 + uVar7);
      _memset(puVar8,0xff,uVar5);
      goto code_r0x0053c5bc;
    }
    auVar9 = func_0x004584ec(1,8,uVar1);
  }
  else {
    if (uVar5 >> 0x3d == 0) {
      uVar6 = (0xffffffffffffffffU >> (LZCOUNT((uVar5 * 8) / 7 - 1) & 0x3fU)) + 1;
      goto code_r0x0053c514;
    }
code_r0x0053c548:
    auVar9 = func_0x004584a8(1);
  }
  puVar8 = (undefined *)0x0;
code_r0x0053c5bc:
  *extraout_x8 = puVar8;
  *(undefined1 (*) [16])(extraout_x8 + 1) = auVar9;
  extraout_x8[3] = 0;
  return;
}

