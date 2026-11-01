
void FUN_002642e8(void)

{
  long lVar1;
  long in_x9;
  long *unaff_x19;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000060;
  
  *(long **)(in_x9 + 0x40) = unaff_x19;
  *(undefined1 **)(in_x9 + 0x48) = &uStack0000000000000010;
  func_0x0025bfe4(&uStack0000000000000050,&uStack0000000000000060,unaff_x29 + -0x38);
  lVar3 = *unaff_x19;
  if (-0x7fffffffffffffd5 < lVar3) {
    if ((((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
        (lVar1 = unaff_x19[4], lVar1 != -0x8000000000000000)) && (lVar1 != 0)) {
      func_0x00187bd4(unaff_x19[5],lVar1,1);
    }
    lVar1 = unaff_x19[1];
    lVar2 = unaff_x19[2];
    if (lVar2 != 0) {
      puVar4 = (undefined8 *)(lVar1 + 8);
      do {
        if (puVar4[-1] != 0) {
          func_0x00187bd4(*puVar4,puVar4[-1],1);
        }
        puVar4 = puVar4 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (lVar3 != 0) {
      func_0x00187bd4(lVar1,lVar3 * 0x18,8);
    }
  }
  return;
}

