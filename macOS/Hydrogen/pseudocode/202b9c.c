
void FUN_00202b9c(void)

{
  long lVar1;
  undefined8 *puVar2;
  undefined1 *puVar3;
  
  lVar1 = func_0x00187bd0();
  if (lVar1 != 0) {
    return;
  }
  func_0x007a1f18(8,0x28);
  lVar1 = func_0x00187bd0(0x88,8);
  if (lVar1 != 0) {
    return;
  }
  func_0x007a1f18(8,0x88);
  lVar1 = func_0x00187bd0(0x78,8);
  if (lVar1 != 0) {
    return;
  }
  puVar2 = (undefined8 *)func_0x007a1f18(8,0x78);
  lVar1 = puVar2[1];
  if (lVar1 != 0) {
    puVar3 = (undefined1 *)*puVar2;
    do {
      *puVar3 = 0;
      lVar1 = lVar1 + -1;
      puVar3 = puVar3 + 1;
    } while (lVar1 != 0);
  }
  return;
}

