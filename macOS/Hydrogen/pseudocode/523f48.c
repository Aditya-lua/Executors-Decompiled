
void FUN_00523f48(void)

{
  long lVar1;
  undefined *puVar2;
  long *unaff_x19;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  
  func_0x004f6da0();
  func_0x004f7050();
  func_0x00511444();
  lVar4 = unaff_x19[1];
  auVar7 = func_0x004af770(lVar4,unaff_x19[2]);
  lVar3 = auVar7._8_8_;
  if (-1 < lVar3) {
    if (lVar3 == 0) {
      lVar5 = 1;
      _memcpy(1,auVar7._0_8_,0);
      lVar1 = *unaff_x19;
    }
    else {
      uVar6 = 1;
      lVar5 = func_0x00187bd0(lVar3,1);
      if (lVar5 == 0) goto code_r0x005240b8;
      _memcpy(lVar5,auVar7._0_8_,lVar3);
      lVar1 = *unaff_x19;
    }
    if (lVar1 != 0) {
      func_0x00187bd4(lVar4,lVar1,1);
    }
    *unaff_x19 = lVar3;
    unaff_x19[1] = lVar5;
    unaff_x19[2] = lVar3;
    func_0x007a5594();
    lVar4 = unaff_x19[2];
    *(undefined1 *)(unaff_x19[1] + lVar4) = 10;
    unaff_x19[2] = lVar4 + 1;
    return;
  }
  uVar6 = 0;
code_r0x005240b8:
  puVar2 = &UNK_009e95a8;
  auVar7 = func_0x007a1f00(uVar6,lVar3);
  lVar4 = (long)puVar2 - auVar7._8_8_;
  if (lVar4 != 0) {
    lVar3 = auVar7._0_8_ + auVar7._8_8_ * 0x28;
    do {
      func_0x00519b74(lVar3);
      lVar3 = lVar3 + 0x28;
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
  }
  return;
}

