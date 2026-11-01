
undefined8 FUN_00734550(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  long unaff_x20;
  undefined8 uVar3;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  
  if (unaff_x20 != 0) {
    uStack0000000000000008 = param_1;
    uStack0000000000000010 = param_2;
    if ((*(long *)(unaff_x20 + 0x88) != 0) &&
       ((*(byte *)(*(long *)(unaff_x20 + 0x88) + 4) >> 5 & 1) != 0)) {
      func_0x00779cfc(*(undefined8 *)(unaff_x20 + 0x78),5,2);
    }
    *(byte *)(unaff_x20 + 0x98) = *(byte *)(unaff_x20 + 0x98) | 1;
    func_0x0074e010();
    lVar1 = func_0x0074e01c(&uStack0000000000000018);
    if (lVar1 != 0) {
      do {
        uVar3 = *(undefined8 *)(lVar1 + 0x20);
        lVar1 = func_0x0074e01c(&uStack0000000000000018);
        lVar2 = func_0x00740a58(uVar3);
        if (lVar2 != 0) {
          do {
            func_0x00156654(lVar2);
            lVar2 = func_0x006f4058(lVar2);
            func_0x00784e78();
          } while (lVar2 != 0);
        }
      } while (lVar1 != 0);
    }
    *(byte *)(unaff_x20 + 0x98) = *(byte *)(unaff_x20 + 0x98) & 0xfe;
    if ((*(long *)(unaff_x20 + 0x88) != 0) &&
       ((*(byte *)(*(long *)(unaff_x20 + 0x88) + 4) >> 5 & 1) != 0)) {
      func_0x00779d40(*(undefined8 *)(unaff_x20 + 0x78),5);
    }
  }
  return 0;
}

