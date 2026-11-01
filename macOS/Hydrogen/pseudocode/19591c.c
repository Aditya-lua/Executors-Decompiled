
undefined8 FUN_0019591c(undefined8 param_1,undefined8 param_2)

{
  long *plVar1;
  code *pcVar2;
  ulong *puVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined8 uVar10;
  ulong uVar11;
  undefined1 auVar12 [16];
  long lStack_50;
  long lStack_48;
  
  uVar10 = 8;
  func_0x00187bd4(param_1,param_2,8);
  __Unwind_Resume();
  auVar12 = func_0x007a2668();
  puVar3 = auVar12._0_8_;
  if (*(long *)PTR__kSecValueData_009b0430 == 0) {
LAB_00195a68:
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
  }
  else {
    uVar11 = puVar3[2];
    lVar4 = _CFRetain();
    if (lVar4 == 0) goto LAB_00195a68;
    lStack_50 = lVar4;
    lVar5 = func_0x0019f0a4(auVar12._8_8_,uVar10);
    if (lVar5 != 0) {
      lStack_50 = lVar4;
      lStack_48 = lVar5;
      if (uVar11 == *puVar3) {
        func_0x0019275c(puVar3,&UNK_009c1638);
      }
      plVar1 = (long *)(puVar3[1] + uVar11 * 0x10);
      *plVar1 = lVar4;
      plVar1[1] = lVar5;
      puVar3[2] = uVar11 + 1;
      uVar10 = func_0x0018e2ec(puVar3[1]);
      lStack_50 = 0;
      uVar6 = _SecItemAdd(uVar10,&lStack_50);
      if ((int)uVar6 != -0x62d3) {
LAB_00195a44:
        _CFRelease(uVar10);
        return uVar6;
      }
      if (puVar3[2] < uVar11) {
        func_0x007a28b0(uVar11,puVar3[2],&UNK_009c1650);
      }
      else {
        uVar7 = func_0x0018e2ec(puVar3[1],uVar11);
        uVar9 = puVar3[2];
        if (uVar11 <= uVar9) {
          uVar8 = func_0x0018e2ec(puVar3[1] + uVar11 * 0x10,uVar9 - uVar11);
          uVar6 = _SecItemUpdate(uVar7,uVar8);
          _CFRelease(uVar8);
          _CFRelease(uVar7);
          goto LAB_00195a44;
        }
        func_0x007a28a4(uVar11,uVar9,&UNK_009c1668);
      }
      goto code_r0x00195ac0;
    }
  }
  func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14b0);
code_r0x00195ac0:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x195ac4);
  (*pcVar2)();
}

