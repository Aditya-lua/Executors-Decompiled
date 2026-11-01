
void FUN_004e50e8(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  lVar1 = func_0x007a2668();
  lVar2 = *(long *)(lVar1 + 0x10);
  if (lVar2 != 0) {
    puVar3 = (undefined8 *)(*(long *)(lVar1 + 8) + 0x10);
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 4;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  return;
}

