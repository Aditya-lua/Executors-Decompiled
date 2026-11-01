
void FUN_0063d2f4(void)

{
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  long extraout_x1;
  undefined8 extraout_x8;
  ulong uVar4;
  
  func_0x00611644();
  __Unwind_Resume();
  uVar2 = func_0x0001753c();
  func_0x0062ec4c();
  __Unwind_Resume(uVar2);
  uVar1 = func_0x00676f98(extraout_x1 + 8);
  uVar4 = (ulong)uVar1;
  if (uVar1 == 0) {
    lVar3 = 0;
  }
  else {
    lVar3 = func_0x006115d0(uVar4);
  }
  func_0x00676bc0(extraout_x1 + 8,lVar3,uVar4);
  func_0x005fef78(extraout_x8,lVar3,uVar4,0,1);
  if (lVar3 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined1 *)(lVar3 + -1 + uVar4) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644(lVar3);
  }
  return;
}

