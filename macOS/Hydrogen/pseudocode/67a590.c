
undefined8 * FUN_0067a590(undefined8 param_1,undefined8 param_2,ulong param_3,undefined4 param_4)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  undefined1 auVar7 [16];
  undefined1 auStack_50 [8];
  ulong uStack_48;
  ulong uStack_40;
  long lStack_38;
  
  func_0x0062a89c();
  uVar3 = __Unwind_Resume(param_1);
  func_0x006553a4();
  auVar7 = __Unwind_Resume(uVar3);
  puVar4 = auVar7._0_8_;
  func_0x00676228(auStack_50,auVar7._8_8_ & 0xffffffff,param_3 & 0xffffffff,param_4);
  func_0x00679c08(puVar4,auStack_50);
  if (uStack_40 <= uStack_48) {
    uStack_48 = uStack_40;
  }
  if (lStack_38 != 0) {
    if (uStack_48 != 0) {
      do {
        *(undefined8 *)(lStack_38 + -8 + uStack_48 * 8) = 0;
        uStack_48 = uStack_48 - 1;
      } while (uStack_48 != 0);
    }
    func_0x00611644();
  }
  *puVar4 = &UNK_00a0f1c0;
  *(int *)((long)puVar4 + 0x94) = auVar7._8_4_;
  *(int *)(puVar4 + 0x13) = (int)param_3;
  uVar1 = *(uint *)(puVar4 + 0x12);
  uVar6 = (ulong)uVar1 + 0x3f >> 6;
  puVar4[0x15] = 0x1fffffffffffffff;
  puVar4[0x16] = uVar6;
  func_0x006108a0(uVar6);
  if (uVar1 == 0) {
    puVar2 = (undefined8 *)0x0;
    puVar4[0x17] = 0;
    lVar5 = puVar4[0x16];
  }
  else {
    puVar2 = (undefined8 *)func_0x006115d0(uVar6 << 3);
    puVar4[0x17] = puVar2;
    lVar5 = puVar4[0x16];
  }
  if (lVar5 != 0) {
    *puVar2 = 0;
    if (puVar4[0x16] != 1) {
      _bzero(puVar2 + 1,puVar4[0x16] * 8 + -8);
      return puVar4;
    }
  }
  return puVar4;
}

