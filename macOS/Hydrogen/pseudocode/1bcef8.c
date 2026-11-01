
void FUN_001bcef8(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  undefined8 extraout_x1;
  long *plVar4;
  undefined8 extraout_x9;
  undefined8 extraout_x10;
  undefined8 extraout_x10_00;
  long lVar5;
  undefined1 auVar6 [16];
  undefined4 auStack_60 [8];
  long *plStack_40;
  long lStack_38;
  
  func_0x007a28b0();
  func_0x007a28bc(extraout_x9,extraout_x10,&UNK_009c9a78);
  func_0x007a28b0(extraout_x10_00,extraout_x1,&UNK_009c9a78);
  auVar6 = func_0x007a1f00(1);
  plVar4 = auVar6._8_8_;
  lVar3 = auVar6._0_8_;
  auStack_60[0] = *(undefined4 *)(lVar3 + 0x18);
  func_0x001f0f84(auStack_60);
  lStack_38 = plVar4[2];
  lVar5 = lStack_38;
  if ((ulong)(*plVar4 - lStack_38) < 2) {
    func_0x0079b61c(plVar4,lStack_38,2,1,1);
    lVar5 = plVar4[2];
  }
  *(undefined2 *)(plVar4[1] + lVar5) = 0xffff;
  lVar5 = lVar5 + 2;
  plVar4[2] = lVar5;
  auStack_60[0] = CONCAT31(auStack_60[0]._1_3_,0x16);
  uVar1 = *(undefined8 *)(lVar3 + 8);
  uVar2 = *(ulong *)(lVar3 + 0x10);
  plStack_40 = plVar4;
  if ((ulong)(*plVar4 - lVar5) < uVar2) {
    func_0x0079b61c(plVar4,lVar5,uVar2,1,1);
    lVar5 = plVar4[2];
  }
  _memcpy(plVar4[1] + lVar5,uVar1,uVar2);
  plVar4[2] = lVar5 + uVar2;
  func_0x0024031c(auStack_60);
  return;
}

