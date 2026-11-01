
void FUN_0069899c(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  
  while( true ) {
    lVar1 = unaff_x19[4];
    uVar2 = unaff_x19[2];
    if ((ulong)unaff_x19[3] <= (ulong)unaff_x19[2]) {
      uVar2 = unaff_x19[3];
    }
    if (lVar1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    __ZdlPv(unaff_x19);
    if (unaff_x20 == (undefined8 *)0x0) break;
    unaff_x19 = unaff_x20;
    unaff_x20 = (undefined8 *)*unaff_x20;
  }
  return;
}

