
void FUN_005e82e4(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  undefined *puVar2;
  ulong uVar3;
  long *in_x9;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000008;
  undefined *puStack_60;
  undefined8 uStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined8 **ppuStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 *puStack_20;
  undefined *puStack_18;
  
  uVar3 = *(ulong *)(param_2 + 0x20);
  if (uVar3 < *(ulong *)(param_2 + 8)) {
    puVar1 = (undefined8 *)(*in_x9 + uVar3 * 0x10);
    func_0x004653b0(param_1,*puVar1,puVar1[1],&uStack0000000000000008,&UNK_009f3c20);
    return;
  }
  puVar2 = &UNK_009f44d8;
  auVar4 = func_0x007a2570(uVar3);
  uStack_58 = auVar4._8_8_;
  puStack_20 = &uStack_58;
  puStack_18 = &DAT_005ece4c;
  puStack_50 = &UNK_007fc120;
  uStack_48 = 1;
  uStack_38 = 1;
  uStack_30 = 0;
  ppuStack_40 = &puStack_20;
  puStack_60 = puVar2;
  func_0x00465ccc(auVar4._0_8_,&puStack_50,&UNK_009f3d20,&puStack_60,&UNK_009f3c20);
  return;
}

