
long FUN_001995a4(void)

{
  int iVar1;
  ulong uVar2;
  ulong *unaff_x19;
  ulong unaff_x20;
  uint unaff_w21;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  undefined1 auVar3 [16];
  
  do {
    if (unaff_x24 < unaff_x23) goto LAB_00199638;
    if (unaff_x24 - unaff_x23 < 0x10) {
      if (unaff_x24 == unaff_x23) goto LAB_00199634;
      uVar2 = 0;
      while (*(byte *)(unaff_x22 + unaff_x23 + uVar2) != unaff_w21) {
        uVar2 = uVar2 + 1;
        if (unaff_x24 - unaff_x23 == uVar2) goto LAB_00199634;
      }
    }
    else {
      auVar3 = func_0x0046b0fc();
      uVar2 = auVar3._8_8_;
      if ((auVar3._0_8_ & 1) == 0) {
LAB_00199634:
        unaff_x19[4] = unaff_x24;
LAB_00199638:
        *(undefined1 *)((long)unaff_x19 + 0x41) = 1;
        if (((unaff_x19[8] & 1) == 0) && (unaff_x19[1] == *unaff_x19)) {
          return 0;
        }
        return unaff_x22 + *unaff_x19;
      }
    }
    unaff_x23 = unaff_x23 + uVar2 + 1;
    unaff_x19[4] = unaff_x23;
    if ((unaff_x20 <= unaff_x23 && unaff_x23 <= unaff_x25) &&
       (iVar1 = _memcmp(unaff_x22 + (unaff_x23 - unaff_x20),unaff_x19 + 6), iVar1 == 0)) {
      uVar2 = *unaff_x19;
      *unaff_x19 = unaff_x23;
      return unaff_x22 + uVar2;
    }
  } while( true );
}

