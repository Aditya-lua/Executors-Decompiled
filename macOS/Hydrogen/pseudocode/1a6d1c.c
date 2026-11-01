
void FUN_001a6d1c(long param_1,long param_2)

{
  long unaff_x19;
  long lVar1;
  long lVar2;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  *(undefined2 *)(*(long *)(unaff_x19 + 8) + param_1) = 0xffff;
  *(long *)(unaff_x19 + 0x10) = param_1 + 2;
  uStack0000000000000008 = 0x1616161616161616;
  uStack0000000000000000 = 0x1616161616161616;
  uStack0000000000000018 = 0x1616161616161616;
  uStack0000000000000010 = 0x1616161616161616;
  if (*(long *)(param_2 + 0x10) != 0) {
    lVar1 = *(long *)(param_2 + 8);
    lVar2 = *(long *)(param_2 + 0x10) * 0x28;
    do {
      func_0x001b03d8(lVar1);
      lVar1 = lVar1 + 0x28;
      lVar2 = lVar2 + -0x28;
    } while (lVar2 != 0);
  }
  func_0x0024031c();
  return;
}

