
void FUN_0042113c(undefined4 *param_1,undefined8 param_2)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined1 auStack_70 [16];
  short asStack_60 [2];
  undefined4 uStack_5c;
  ulong uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  ulong uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  func_0x00469240(auStack_70,param_2,&UNK_00887581,0xb);
  uVar1 = *param_1;
  func_0x004338c0(asStack_60,uVar1);
  if (asStack_60[0] == 2) {
    if ((uStack_58 & 3) == 1) {
      uVar2 = *(undefined8 *)(uStack_58 - 1);
      puVar3 = *(undefined8 **)(uStack_58 + 7);
      if ((code *)*puVar3 != (code *)0x0) {
        (*(code *)*puVar3)(uVar2);
      }
      if (puVar3[1] != 0) {
        func_0x00187bd4(uVar2,puVar3[1],puVar3[2]);
      }
      func_0x00187bd4((undefined8 *)(uStack_58 - 1),0x18,8);
    }
  }
  else {
    uStack_3c = uStack_5c;
    uStack_38 = uStack_58;
    uStack_28 = uStack_48;
    uStack_30 = uStack_50;
    func_0x004653b0(auStack_70,&UNK_00888470,4,&uStack_40,&UNK_009dbc60);
  }
  _uStack_40 = CONCAT44(uStack_3c,uVar1);
  func_0x004653b0(auStack_70,&UNK_00886584,2,&uStack_40,&UNK_009da4a0);
  func_0x00465628();
  return;
}

