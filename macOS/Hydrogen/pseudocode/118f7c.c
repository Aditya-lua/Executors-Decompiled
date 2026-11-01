
ulong FUN_00118f7c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                  undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  int iVar8;
  ulong unaff_x25;
  int iVar9;
  long unaff_x29;
  undefined1 auVar10 [16];
  
  lVar6 = 1;
  func_0x000bc130(param_1,0,1);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return unaff_x25;
  }
  auVar10 = ___stack_chk_fail();
  lVar1 = lRam0000000000a334c0;
  uVar5 = auVar10._8_8_;
  lVar4 = auVar10._0_8_;
  lVar7 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar7 + 0xc0) = 1;
  if (*(char *)(lVar7 + 0xc3) == '\0') {
    func_0x000d8a9c();
    func_0x000d4e10(lVar4);
    func_0x000d890c();
    func_0x000d876c(param_4);
    iVar8 = (int)param_4;
    if (iVar8 < 1) {
      uVar2 = 0;
    }
    else {
      lVar7 = *(long *)(&UNK_009bae28 +
                       (-(uVar5 >> 0x1f & 1) & 0xffffffe000000000 | (uVar5 & 0xffffffff) << 5));
      func_0x000d505c(0);
      uVar2 = func_0x00118b6c("",uVar5,lVar6,param_5,param_6,param_7,param_8);
      func_0x000d53d0();
      func_0x000d88dc();
      if (iVar8 != 1) {
        iVar9 = 1;
        do {
          lVar6 = lVar6 + lVar7;
          func_0x000d505c(iVar9);
          func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + lVar1));
          uVar3 = func_0x00118b6c("",uVar5,lVar6,param_5,param_6,param_7,param_8);
          uVar2 = uVar2 | uVar3;
          func_0x000d53d0();
          func_0x000d88dc();
          iVar9 = iVar9 + 1;
        } while (iVar8 != iVar9);
      }
    }
    func_0x000d53d0();
    lVar6 = func_0x000bc0e8(lVar4,0);
    if (lVar6 != lVar4) {
      func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + lVar1));
      func_0x0010aa24(lVar4,lVar6,0);
    }
    func_0x000d818c();
  }
  else {
    uVar2 = 0;
  }
  return (ulong)(uVar2 & 1);
}

