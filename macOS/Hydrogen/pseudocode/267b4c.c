
void FUN_00267b4c(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  func_0x0016b01c();
  lVar1 = __Unwind_Resume();
  lVar2 = *(long *)(lVar1 + 0x10);
  if (lVar2 != 0) {
    puVar3 = (undefined8 *)(*(long *)(lVar1 + 8) + 0x30);
    do {
      if (puVar3[-6] != 0) {
        func_0x00187bd4(puVar3[-5],puVar3[-6],1);
      }
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 10;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  return;
}

