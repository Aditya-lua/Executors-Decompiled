
undefined8 * FUN_00429e2c(long param_1)

{
  undefined1 *puVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  uint *puVar6;
  ulong uVar7;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined1 auVar8 [16];
  undefined1 auStack_1c8 [376];
  long lStack_50;
  uint uStack_48;
  undefined4 uStack_44;
  long lStack_40;
  
  if (param_1 != 0) {
    _memcpy(param_1);
    puVar5 = (undefined8 *)func_0x00187bd0(0x30,8);
    if (puVar5 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x30);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x429ed4);
      (*pcVar2)();
    }
    puVar5[1] = 1;
    *puVar5 = 1;
    puVar5[3] = param_1;
    puVar5[2] = unaff_x20;
    puVar5[5] = unaff_x21;
    puVar5[4] = unaff_x20;
    *unaff_x19 = puVar5;
    *(undefined1 *)(unaff_x19 + 1) = 0;
    return puVar5;
  }
  uVar4 = func_0x007a1f00();
  func_0x003f7814();
  __Unwind_Resume(uVar4);
  auVar8 = func_0x007a2668();
  uVar7 = auVar8._8_8_;
  if (uVar7 < 0x180) {
    _memcpy(auStack_1c8,auVar8._0_8_,uVar7);
    auStack_1c8[uVar7] = 0;
    func_0x00462a54(&uStack_48,auStack_1c8,uVar7 + 1);
    if ((uStack_48 & 1) == 0) {
      iVar3 = _unlink(lStack_40);
      if (iVar3 == -1) {
        puVar6 = (uint *)___error();
        puVar5 = (undefined8 *)((ulong)*puVar6 << 0x20 | 2);
      }
      else {
        puVar5 = (undefined8 *)0x0;
      }
    }
    else {
      puVar5 = (undefined8 *)&UNK_009dae48;
    }
    return puVar5;
  }
  func_0x00459450(&lStack_50,auVar8._0_8_,uVar7);
  if (lStack_50 == -0x8000000000000000) {
    puVar1 = (undefined1 *)CONCAT44(uStack_44,uStack_48);
    puVar5 = (undefined8 *)(*(code *)&DAT_003f4ba0)(1,puVar1,lStack_40);
    *puVar1 = 0;
    if (lStack_40 != 0) {
      func_0x00187bd4(puVar1,lStack_40,1);
    }
  }
  else {
    if (lStack_50 != 0) {
      func_0x00187bd4(CONCAT44(uStack_44,uStack_48),lStack_50,1);
    }
    puVar5 = (undefined8 *)&UNK_009dae48;
  }
  return puVar5;
}

