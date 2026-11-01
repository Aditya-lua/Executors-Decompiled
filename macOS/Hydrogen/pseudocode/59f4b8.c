
void FUN_0059f4b8(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  __Unwind_Resume();
  lVar2 = func_0x007a2668();
  if (*(long *)(lVar2 + 0x10) != 0) {
    puVar3 = *(undefined8 **)(lVar2 + 8);
    lVar2 = 1 - *(long *)(lVar2 + 0x10);
    do {
      lVar1 = *(long *)*puVar3;
      *(long *)*puVar3 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(puVar3);
      }
      puVar3 = puVar3 + 1;
      lVar2 = lVar2 + 1;
    } while (lVar2 != 1);
  }
  return;
}

