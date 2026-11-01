
ulong FUN_0027b768(void)

{
  uint uVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 extraout_x1;
  long lVar4;
  undefined1 auVar5 [16];
  undefined1 auStack_70 [16];
  long **pplStack_60;
  undefined8 uStack_58;
  undefined1 uStack_41;
  long *plStack_30;
  undefined8 uStack_28;
  long lStack_20;
  undefined1 uStack_11;
  
  puVar2 = (undefined8 *)func_0x007a2810();
  uVar1 = func_0x002d9108(*puVar2);
  if (-1 < (int)uVar1) {
    return (ulong)uVar1;
  }
  auVar5 = func_0x007a2810(&UNK_0082e7f3,0x18,&uStack_11,&UNK_009cdbc8,&UNK_009cdd08);
  uStack_28 = 0x27b7b8;
  lVar4 = *(long *)(&UNK_0082e3d0 + (ulong)*(byte *)(auVar5._8_8_ + 0x10) * 8);
  plStack_30 = (long *)(auStack_70 + 0x60);
  uVar1 = func_0x002d90e8(*auVar5._0_8_);
  if ((int)uVar1 < 0) {
    func_0x007a2810(&UNK_0082e7f3,0x18,&uStack_41,&UNK_009cdbc8,&UNK_009cdcf0);
    uStack_58 = 0x27b81c;
    pplStack_60 = &plStack_30;
    func_0x00469240(auStack_70,extraout_x1,&UNK_0082e377,0x17);
    uVar3 = func_0x00465564(auStack_70);
    return uVar3;
  }
  return lVar4 + (ulong)uVar1;
}

