
void FUN_00580aa8(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  undefined8 uStack0000000000000008;
  long in_stack_00000018;
  
  func_0x00582958();
  while (uStack0000000000000008 != 0) {
    lVar1 = uStack0000000000000008 + in_stack_00000018 * 8;
    plVar3 = *(long **)(lVar1 + 0x110);
    lVar2 = *plVar3;
    *plVar3 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      func_0x005d2ac4(lVar1 + 0x110);
    }
    func_0x00582958(&uStack0000000000000008);
  }
  return;
}

