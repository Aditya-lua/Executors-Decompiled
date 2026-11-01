
void FUN_0059f050(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  undefined8 *puVar4;
  
  lVar2 = func_0x007a1f00();
  if (*(long *)(lVar2 + 0x10) != 0) {
    puVar4 = *(undefined8 **)(lVar2 + 8);
    lVar2 = 1 - *(long *)(lVar2 + 0x10);
    do {
      plVar3 = (long *)*puVar4;
      if (plVar3 != (long *)0x0) {
        lVar1 = *plVar3;
        *plVar3 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2c74(puVar4);
        }
      }
      puVar4 = puVar4 + 3;
      lVar2 = lVar2 + 1;
    } while (lVar2 != 1);
  }
  return;
}

