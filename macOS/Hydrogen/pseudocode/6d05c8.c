
void FUN_006d05c8(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  long *plVar2;
  long lVar3;
  long *plVar4;
  
  if (*(long *)(unaff_x20 + 0x88) != 0) {
    __ZdlPv();
    *(long *)(unaff_x20 + 0x88) = 0;
    *(undefined8 *)(unaff_x20 + 0x90) = 0;
  }
  plVar2 = (long *)(unaff_x19 + 0x60);
  lVar1 = *plVar2;
  if (lVar1 != 0) {
    lVar3 = *(long *)(unaff_x19 + 0x68);
    if (lVar3 != 0) {
      plVar4 = (long *)(lVar1 + 0x18);
      do {
        if (plVar4[-1] != 0) {
          *plVar4 = plVar4[-1];
          __ZdlPv();
        }
        plVar4 = plVar4 + 7;
        lVar3 = lVar3 + -1;
      } while (lVar3 != 0);
      lVar1 = *plVar2;
    }
    __ZdlPv(lVar1);
    *plVar2 = 0;
    *(undefined8 *)(unaff_x19 + 0x68) = 0;
  }
  return;
}

