
bool FUN_007a0358(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  bool bVar1;
  ulong *puVar2;
  long lVar3;
  uint *puVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined *puStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  
  uStack0000000000000018 = param_1;
  func_0x0041f554(unaff_x29 + -8,&uStack0000000000000008);
  func_0x003f77f4();
  func_0x007a144c();
  puStack_40 = &UNK_009d9ff8;
  uStack_38 = 1;
  uStack_28 = 0;
  uStack_20 = 0;
  uStack_30 = 8;
  auVar7 = func_0x007a2420(&puStack_40,&UNK_009da008);
  puVar2 = auVar7._0_8_;
  uVar5 = *puVar2;
  if (uVar5 - puVar2[2] < param_4) {
    lVar3 = func_0x004182bc(puVar2);
    if (lVar3 != 0) {
      return true;
    }
    uVar5 = *puVar2;
  }
  if (param_4 < uVar5) {
    uVar5 = puVar2[2];
    _memcpy(puVar2[1] + uVar5,auVar7._8_8_,param_4);
    bVar1 = false;
    puVar2[2] = uVar5 + param_4;
  }
  else {
    *(undefined1 *)(puVar2 + 3) = 1;
    if (0x7ffffffd < param_4) {
      param_4 = 0x7ffffffe;
    }
    uVar5 = _write(1,auVar7._8_8_,param_4);
    if (uVar5 == 0xffffffffffffffff) {
      puVar4 = (uint *)___error();
      uVar6 = (ulong)*puVar4 << 0x20 | 2;
    }
    else {
      uVar6 = uVar5;
    }
    bVar1 = (uVar5 == 0xffffffffffffffff) !=
            (uVar5 == 0xffffffffffffffff && (uVar6 & 0xffffffff00000003) == 0x900000002);
    *(undefined1 *)(puVar2 + 3) = 0;
  }
  return bVar1;
}

