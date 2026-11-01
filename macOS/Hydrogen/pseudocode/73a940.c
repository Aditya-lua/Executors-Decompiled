
long FUN_0073a940(void)

{
  long lVar1;
  long lVar2;
  int unaff_w21;
  undefined1 *unaff_x22;
  
  lVar1 = (*pcRam0000000000a2b608)(1,0x9a);
  if (lVar1 != 0) {
    *(long *)(lVar1 + 0x20) = lVar1 + 0x30;
    *(undefined1 *)(lVar1 + 0x31) = 1;
    lVar2 = _strlen();
    if (lVar2 + 1U < 0x69) {
      *(undefined8 *)(lVar1 + 4) = 0x100000001;
      *(int *)(lVar1 + 0x10) = (int)lVar2 + 3;
      if (unaff_w21 == 0) {
        lVar2 = lVar1 + 0x32;
      }
      else {
        lVar2 = lVar1 + 0x33;
      }
      _memcpy(lVar2);
      return lVar1;
    }
    (*pcRam0000000000a2b5f0)(lVar1);
    *unaff_x22 = 1;
  }
  return 0;
}

