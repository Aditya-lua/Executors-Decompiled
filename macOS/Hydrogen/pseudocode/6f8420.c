
undefined8 FUN_006f8420(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  bool in_ZR;
  bool in_CY;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  undefined1 *puVar7;
  undefined8 uVar8;
  char *pcVar9;
  long unaff_x19;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x29;
  ulong in_stack_00000000;
  undefined1 uStack0000000000000008;
  uint auStack_298 [2];
  ulong uStack_290;
  ulong uStack_288;
  undefined8 uStack_280;
  long lStack_278;
  long *plStack_270;
  undefined *puStack_268;
  long lStack_260;
  long alStack_258 [68];
  long lStack_38;
  
  if (!in_CY || in_ZR) {
    unaff_x19 = func_0x006e726c();
    _memcpy();
    lVar6 = unaff_x19 + in_stack_00000000;
    unaff_x22 = in_stack_00000000 * (param_1 & 0xffffffff) - in_stack_00000000;
    unaff_x21 = in_stack_00000000;
    if (in_stack_00000000 < unaff_x22) {
      do {
        _memcpy(lVar6,unaff_x19,unaff_x21);
        lVar6 = lVar6 + unaff_x21;
        unaff_x22 = unaff_x22 - unaff_x21;
        unaff_x21 = unaff_x21 << 1;
      } while (unaff_x21 < unaff_x22);
    }
    _memcpy(lVar6,unaff_x19,unaff_x22);
    func_0x006e7a54(&uStack0000000000000008,in_stack_00000000 * (param_1 & 0xffffffff));
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return 1;
    }
    ___stack_chk_fail();
  }
  uVar5 = func_0x006e644c(unaff_x19,"resulting string too large");
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar6 = func_0x006e67c8(uVar5,1,&lStack_260);
  puVar7 = (undefined1 *)func_0x006e726c(uVar5,alStack_258,lStack_260);
  while (bVar3 = lStack_260 != 0, lStack_260 = lStack_260 + -1, bVar3) {
    *puVar7 = *(undefined1 *)(lVar6 + lStack_260);
    puVar7 = puVar7 + 1;
  }
  func_0x006e7a54(alStack_258,(long)puVar7 - alStack_258[0]);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return 1;
  }
  uVar8 = ___stack_chk_fail();
  puStack_268 = &DAT_006f85d0;
  uStack_290 = unaff_x22;
  uStack_288 = unaff_x21;
  uStack_280 = uVar5;
  lStack_278 = lVar6;
  plStack_270 = alStack_258 + 0x49;
  lVar6 = func_0x006e67c8(uVar8,1,auStack_298);
  iVar4 = func_0x006e6bc0(uVar8,2);
  uVar1 = (auStack_298[0] + 1 & iVar4 >> 0x1f) + iVar4;
  iVar4 = func_0x006e6c08(uVar8,3,0xffffffff);
  uVar2 = (auStack_298[0] + 1 & iVar4 >> 0x1f) + iVar4;
  uVar2 = uVar2 & ((int)uVar2 >> 0x1f ^ 0xffffffffU);
  if ((int)uVar1 < 2) {
    uVar1 = 1;
  }
  if ((int)auStack_298[0] <= (int)uVar2) {
    uVar2 = auStack_298[0];
  }
  if ((int)uVar2 < (int)uVar1) {
    pcVar9 = "";
    lVar6 = 0;
  }
  else {
    pcVar9 = (char *)(lVar6 + (ulong)uVar1 + -1);
    lVar6 = (long)(int)((uVar2 - uVar1) + 1);
  }
  func_0x006e38d8(uVar8,pcVar9,lVar6);
  return 1;
}

