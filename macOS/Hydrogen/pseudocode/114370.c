
bool FUN_00114370(float param_1,float param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
                 undefined8 param_9,undefined8 param_10,undefined8 param_11,undefined8 param_12)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  int iVar4;
  long lVar5;
  ulong extraout_x1;
  undefined8 uVar6;
  long lVar7;
  undefined8 unaff_x20;
  long unaff_x22;
  int iVar8;
  undefined4 extraout_s0;
  undefined1 uStack0000000000000050;
  long in_stack_00000058;
  
  uVar6 = unaff_x20;
  if ((param_2 <= param_1) && (uVar6 = param_5, param_1 == param_2)) {
    uVar6 = unaff_x20;
  }
  func_0x00110860();
  iVar4 = _memcmp(&uStack0000000000000050);
  if (iVar4 != 0) {
    func_0x000c255c(param_12._4_4_);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000058) {
    return iVar4 != 0;
  }
  lVar5 = ___stack_chk_fail();
  lVar1 = lRam0000000000a334c0;
  lVar7 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar7 + 0xc0) = 1;
  if (*(char *)(lVar7 + 0xc3) == '\0') {
    func_0x000d8a9c();
    func_0x000d4e10(lVar5);
    func_0x000d890c();
    func_0x000d876c(uVar6);
    iVar4 = (int)uVar6;
    if (iVar4 < 1) {
      bVar2 = 0;
    }
    else {
      lVar7 = *(long *)(&UNK_009bae28 +
                       (-(extraout_x1 >> 0x1f & 1) & 0xffffffe000000000 |
                       (extraout_x1 & 0xffffffff) << 5));
      func_0x000d505c(0);
      bVar2 = func_0x00113a24(extraout_s0,"",extraout_x1,unaff_x22,param_7,param_8,param_9,param_10)
      ;
      func_0x000d53d0();
      func_0x000d88dc();
      if (iVar4 != 1) {
        iVar8 = 1;
        do {
          unaff_x22 = unaff_x22 + lVar7;
          func_0x000d505c(iVar8);
          func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + lVar1));
          bVar3 = func_0x00113a24(extraout_s0,"",extraout_x1,unaff_x22,param_7,param_8,param_9,
                                  param_10);
          bVar2 = bVar2 | bVar3;
          func_0x000d53d0();
          func_0x000d88dc();
          iVar8 = iVar8 + 1;
        } while (iVar4 != iVar8);
      }
    }
    func_0x000d53d0();
    lVar7 = func_0x000bc0e8(lVar5,0);
    if (lVar7 != lVar5) {
      func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + lVar1));
      func_0x0010aa24(lVar5,lVar7,0);
    }
    func_0x000d818c();
  }
  else {
    bVar2 = 0;
  }
  return (bool)(bVar2 & 1);
}

