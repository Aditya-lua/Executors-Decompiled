
void FUN_00240718(undefined8 param_1,undefined8 param_2)

{
  undefined1 *puVar1;
  undefined8 extraout_x1;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar2;
  ulong unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  
  do {
    if (unaff_x19 < unaff_x20) {
      func_0x007a28bc();
    }
    else if (unaff_x19 <= unaff_x23) {
      _memcpy(unaff_x25 + unaff_x20,param_2);
      *(long *)(unaff_x22 + 0x18) = *(long *)(unaff_x22 + 0x18) + unaff_x21;
      return;
    }
    func_0x007a28b0();
    func_0x0079b61c();
    unaff_x25 = *(long *)(unaff_x22 + 8);
    lVar2 = *(long *)(unaff_x22 + 0x10);
    puVar1 = (undefined1 *)(unaff_x25 + lVar2);
    if (1 < unaff_x24) {
      unaff_x24 = unaff_x24 - 1;
      _bzero(puVar1,unaff_x24);
      lVar2 = lVar2 + unaff_x24;
      puVar1 = (undefined1 *)(unaff_x25 + lVar2);
    }
    *puVar1 = 0;
    unaff_x23 = lVar2 + 1;
    *(ulong *)(unaff_x22 + 0x10) = unaff_x23;
    param_2 = extraout_x1;
  } while( true );
}

