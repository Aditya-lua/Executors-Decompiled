
bool FUN_0041f114(uint *param_1)

{
  undefined *puVar1;
  ulong uVar2;
  ulong uVar3;
  undefined *puVar4;
  ulong *unaff_x19;
  ulong *puVar5;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  undefined *puVar6;
  ulong unaff_x23;
  long *plVar7;
  ulong unaff_x24;
  ulong uVar8;
  undefined1 auVar9 [16];
  
  while (*param_1 == 4) {
    while( true ) {
      if (unaff_x21 == 0) {
        return false;
      }
      uVar3 = unaff_x21;
      if (unaff_x24 <= unaff_x21) {
        uVar3 = unaff_x24;
      }
      uVar3 = _write(2,unaff_x20,uVar3);
      if (uVar3 == 0xffffffffffffffff) break;
      if (uVar3 == 0) goto LAB_0041f16c;
      if (unaff_x21 < uVar3) {
        puVar4 = &UNK_009da7a0;
        func_0x007a28a4(uVar3,unaff_x21);
        *unaff_x19 = unaff_x22;
        auVar9 = __Unwind_Resume();
        plVar7 = (long *)*auVar9._0_8_;
        uVar2 = plVar7[1];
        uVar8 = plVar7[2];
        uVar3 = uVar2;
        if (uVar8 <= uVar2) {
          uVar3 = uVar8;
        }
        puVar6 = (undefined *)(uVar2 - uVar3);
        puVar1 = puVar6;
        if (puVar4 <= puVar6) {
          puVar1 = puVar4;
        }
        _memcpy(*plVar7 + uVar3,auVar9._8_8_,puVar1);
        plVar7[2] = (long)(puVar1 + uVar8);
        if (puVar6 < puVar4) {
          plVar7 = auVar9._0_8_ + 1;
          if (*plVar7 != 0) {
            func_0x003f67e4(plVar7);
          }
          *plVar7 = (long)&UNK_009da470;
        }
        return puVar6 < puVar4;
      }
      unaff_x20 = unaff_x20 + uVar3;
      unaff_x21 = unaff_x21 - uVar3;
    }
    param_1 = (uint *)___error();
  }
  unaff_x22 = unaff_x23 & 0xffffffff | (ulong)*param_1 << 0x20;
LAB_0041f16c:
  puVar5 = unaff_x19 + 1;
  if (*puVar5 != 0) {
    func_0x003f67e4(puVar5);
  }
  *puVar5 = unaff_x22;
  return true;
}

