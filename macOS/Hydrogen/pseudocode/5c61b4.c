
void FUN_005c61b4(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uStack0000000000000008;
  long in_stack_00000018;
  
  func_0x005c6d30(&uStack0000000000000008,param_1);
  while (uStack0000000000000008 != 0) {
    lVar4 = uStack0000000000000008 + in_stack_00000018 * 0x48;
    lVar1 = *(long *)(lVar4 + 0x80);
    if (lVar1 != 0) {
      lVar2 = lVar1 * 8 + 8;
      func_0x00187bd4(*(long *)(lVar4 + 0x78) - lVar2,lVar1 + lVar2 + 9,8);
    }
    if (*(long *)(lVar4 + 0x70) != 0) {
      puVar3 = *(undefined8 **)(lVar4 + 0x68);
      lVar1 = 1 - *(long *)(lVar4 + 0x70);
      do {
        lVar2 = *(long *)*puVar3;
        *(long *)*puVar3 = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          func_0x005d2ac4(puVar3);
        }
        puVar3 = puVar3 + 2;
        lVar1 = lVar1 + 1;
      } while (lVar1 != 1);
    }
    if (*(long *)(lVar4 + 0x60) != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar4 + 0x68),*(long *)(lVar4 + 0x60) << 4,8);
    }
    func_0x005c6d30(&uStack0000000000000008,param_1);
  }
  return;
}

