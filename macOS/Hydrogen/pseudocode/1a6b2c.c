
void FUN_001a6b2c(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  byte *pbVar5;
  byte bVar6;
  undefined1 auVar7 [16];
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long *plStack_50;
  long lStack_48;
  
  auVar7 = func_0x007a2668();
  plVar1 = auVar7._8_8_;
  lStack_48 = plVar1[2];
  lVar4 = lStack_48;
  if (*plVar1 == lStack_48) {
    func_0x0079b61c(plVar1,lStack_48,1,1,1);
    lVar4 = plVar1[2];
  }
  *(undefined1 *)(plVar1[1] + lVar4) = 0xff;
  lVar4 = lVar4 + 1;
  plVar1[2] = lVar4;
  uStack_68 = 0x1515151515151515;
  uStack_70 = 0x1515151515151515;
  uStack_58 = 0x1515151515151515;
  uStack_60 = 0x1515151515151515;
  lVar2 = *(long *)(auVar7._0_8_ + 0x10);
  plStack_50 = plVar1;
  if (lVar2 != 0) {
    pbVar5 = (byte *)(*(long *)(auVar7._0_8_ + 8) + 1);
    lVar2 = lVar2 << 1;
    do {
      bVar6 = pbVar5[-1];
      if (bVar6 < 2) {
LAB_001a6bd0:
        lVar3 = *plVar1;
      }
      else {
        if (bVar6 == 2) {
          bVar6 = 0x40;
          goto LAB_001a6bd0;
        }
        bVar6 = *pbVar5;
        lVar3 = *plVar1;
      }
      if (lVar4 == lVar3) {
        func_0x00458a18(plVar1,&UNK_009c9a90);
      }
      *(byte *)(plVar1[1] + lVar4) = bVar6;
      lVar4 = lVar4 + 1;
      plVar1[2] = lVar4;
      pbVar5 = pbVar5 + 2;
      lVar2 = lVar2 + -2;
    } while (lVar2 != 0);
  }
  func_0x0024031c(&uStack_70);
  return;
}

