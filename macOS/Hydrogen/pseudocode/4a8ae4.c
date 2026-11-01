
void FUN_004a8ae4(void)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  undefined8 *puVar4;
  long lVar5;
  long alStack_68 [2];
  long lStack_58;
  
  func_0x004b7fe4();
  if (*(long *)(unaff_x19 + 0x40) != 0) {
    func_0x004b7fe4((long *)(unaff_x19 + 0x40));
  }
  __Unwind_Resume();
  uVar1 = func_0x007a2668();
  func_0x004a9e7c(alStack_68,uVar1);
  while (alStack_68[0] != 0) {
    lVar5 = alStack_68[0] + lStack_58 * 0x48;
    lVar2 = *(long *)(lVar5 + 0x80);
    if (lVar2 != 0) {
      lVar3 = lVar2 * 8 + 8;
      func_0x00187bd4(*(long *)(lVar5 + 0x78) - lVar3,lVar2 + lVar3 + 9,8);
    }
    if (*(long *)(lVar5 + 0x70) != 0) {
      puVar4 = *(undefined8 **)(lVar5 + 0x68);
      lVar2 = 1 - *(long *)(lVar5 + 0x70);
      do {
        lVar3 = *(long *)*puVar4;
        *(long *)*puVar4 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          func_0x005d2ac4(puVar4);
        }
        puVar4 = puVar4 + 2;
        lVar2 = lVar2 + 1;
      } while (lVar2 != 1);
    }
    if (*(long *)(lVar5 + 0x60) != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar5 + 0x68),*(long *)(lVar5 + 0x60) << 4,8);
    }
    func_0x004a9e7c(alStack_68,uVar1);
  }
  return;
}

