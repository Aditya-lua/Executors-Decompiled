
undefined1  [16] FUN_004323b0(void)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  uint *puVar6;
  ulong uVar7;
  undefined *puVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  
  func_0x00187bd4();
  auVar10 = __Unwind_Resume();
  auVar10._0_8_ = auVar10._0_8_;
  lVar2 = _realpath_DARWIN_EXTSN(auVar10._8_8_,0);
  if (lVar2 == 0) {
    auVar10 = ___error();
    uVar1 = *auVar10._0_8_;
    *auVar10._0_8_ = -0x8000000000000000;
    auVar10._0_8_[1] = (ulong)uVar1 << 0x20 | 2;
  }
  else {
    lVar3 = _strlen();
    if (lVar3 < 0) {
      uVar9 = 0;
LAB_00432478:
      puVar8 = &UNK_009d9be8;
      auVar10 = func_0x007a1f00(uVar9,lVar3);
      if ((undefined *)0x7ffffffd < puVar8) {
        puVar8 = (undefined *)0x7ffffffe;
      }
      uVar5 = _read(*(undefined4 *)(auVar10._0_8_ + 0x90),auVar10._8_8_,puVar8);
      if (uVar5 == 0xffffffffffffffff) {
        puVar6 = (uint *)___error();
        uVar7 = (ulong)*puVar6 << 0x20 | 2;
      }
      else {
        uVar7 = uVar5;
      }
      auVar10._1_7_ = 0;
      auVar10[0] = uVar5 == 0xffffffffffffffff;
      auVar10._8_8_ = uVar7;
      return auVar10;
    }
    if (lVar3 == 0) {
      lVar4 = 1;
    }
    else {
      uVar9 = 1;
      lVar4 = func_0x00187bd0(lVar3,1);
      if (lVar4 == 0) goto LAB_00432478;
    }
    _memcpy(lVar4,lVar2,lVar3);
    auVar10 = _free(lVar2);
    *auVar10._0_8_ = lVar3;
    auVar10._0_8_[1] = lVar4;
    auVar10._0_8_[2] = lVar3;
  }
  return auVar10;
}

