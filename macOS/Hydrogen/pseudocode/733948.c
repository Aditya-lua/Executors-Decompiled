
void FUN_00733948(void)

{
  long lVar1;
  code *pcVar2;
  long unaff_x19;
  long unaff_x20;
  int unaff_w22;
  
  func_0x00768a04();
  if (-1 < *(char *)(unaff_x20 + 0x39b)) {
    if (*(long *)(unaff_x20 + 0x48) != 0) {
      func_0x00750010();
    }
    if ((*(long *)(unaff_x20 + 0x3a0) != 0) &&
       (pcVar2 = *(code **)(*(long *)(unaff_x20 + 0x3a0) + 0x60), pcVar2 != (code *)0x0)) {
      (*pcVar2)();
    }
    func_0x007289ec();
    *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x80000000;
  }
  if (unaff_w22 != 0) {
    func_0x007341b8();
  }
  func_0x00730bf8();
  func_0x00730bf8();
  func_0x0076891c();
  func_0x00784acc();
  if ((unaff_x19 == 0) || (lVar1 = *(long *)(unaff_x19 + 0x80), lVar1 == 0)) {
    return;
  }
  *(byte *)(lVar1 + 0x271) = *(byte *)(lVar1 + 0x271) | 2;
  return;
}

