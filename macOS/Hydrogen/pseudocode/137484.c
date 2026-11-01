
void FUN_00137484(void)

{
  long *plVar1;
  long unaff_x19;
  undefined8 unaff_x20;
  long *plVar2;
  long *plVar3;
  
  *(undefined8 *)(unaff_x19 + 0x40) = unaff_x20;
  __ZdlPv();
  plVar2 = *(long **)(unaff_x19 + 8);
  if (plVar2 != (long *)0x0) {
    plVar1 = plVar2;
    if (*(long **)(unaff_x19 + 0x10) != plVar2) {
      plVar1 = *(long **)(unaff_x19 + 0x10);
      do {
        plVar3 = plVar1 + -3;
        if (*plVar3 != 0) {
          plVar1[-2] = *plVar3;
          __ZdlPv();
        }
        plVar1 = plVar3;
      } while (plVar3 != plVar2);
      plVar1 = *(long **)(unaff_x19 + 8);
    }
    *(long **)(unaff_x19 + 0x10) = plVar2;
    __ZdlPv(plVar1);
  }
  return;
}

