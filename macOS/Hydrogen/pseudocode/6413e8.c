
void FUN_006413e8(void)

{
  int iVar1;
  long *unaff_x19;
  long unaff_x20;
  long lVar2;
  long lVar3;
  
  iVar1 = _strcmp(unaff_x20 + 0xb,&UNK_008be681);
  if (iVar1 != 0) {
    return;
  }
  func_0x0003eef0();
  lVar2 = *unaff_x19;
  lVar3 = unaff_x19[3];
  func_0x00699f60(lVar3 + 0x18,lVar2 + 0x18);
  func_0x00655680(lVar3 + 0x60,lVar2 + 0x60);
  if (lVar3 != lVar2) {
    func_0x00653920(lVar3 + 0x158,*(long *)(lVar2 + 0x158),*(long *)(lVar2 + 0x160),
                    *(long *)(lVar2 + 0x160) - *(long *)(lVar2 + 0x158) >> 2);
  }
  func_0x005ffccc(lVar3 + 0x170,lVar2 + 0x170);
  func_0x005ffccc(lVar3 + 0x1a0,lVar2 + 0x1a0);
  *(undefined2 *)(lVar3 + 0x1d0) = *(undefined2 *)(lVar2 + 0x1d0);
  func_0x005ffccc(lVar3 + 0x1d8,lVar2 + 0x1d8);
  *(undefined1 *)(unaff_x19 + 4) = 1;
  return;
}

