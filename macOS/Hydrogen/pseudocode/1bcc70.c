
void FUN_001bcc70(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *unaff_x20;
  
  func_0x0079b61c();
  lVar1 = unaff_x20[2];
  lVar2 = *unaff_x20;
  lVar3 = unaff_x20[1];
  *(undefined2 *)(lVar3 + lVar1) = 0xdfe;
  lVar1 = lVar1 + 2;
  unaff_x20[2] = lVar1;
  if ((ulong)(lVar2 - lVar1) < 2) {
    func_0x0079b61c();
    lVar3 = unaff_x20[1];
    lVar1 = unaff_x20[2];
  }
  *(undefined2 *)(lVar3 + lVar1) = 0xffff;
  unaff_x20[2] = lVar1 + 2;
  func_0x001bc4a4();
  func_0x0024031c();
  return;
}

