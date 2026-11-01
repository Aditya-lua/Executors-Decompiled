
undefined8 FUN_0073dd30(void)

{
  long *plVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  
  lVar2 = func_0x00774174();
  if (lVar2 != 0) {
    if ((*(byte *)(lVar2 + 0x28) >> 1 & 1) != 0) {
      return 0x17;
    }
    if ((*(byte *)(lVar2 + 0x28) & 1) == 0) {
      uVar3 = func_0x0073e0b8(lVar2);
      if ((int)uVar3 != 0) {
        *(byte *)(lVar2 + 0x28) = *(byte *)(lVar2 + 0x28) | 2;
        plVar1 = (long *)*(long *)(lVar2 + 0x20);
        while (plVar1 != (long *)0x0) {
          lVar4 = *plVar1;
          func_0x00740678(plVar1 + 1);
          (*pcRam0000000000a2b5f0)(plVar1);
          *(long *)(lVar2 + 0x20) = lVar4;
          plVar1 = (long *)lVar4;
        }
      }
      return uVar3;
    }
  }
  return 0;
}

