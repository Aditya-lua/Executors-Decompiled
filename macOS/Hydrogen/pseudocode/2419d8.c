
void FUN_002419d8(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined1 auVar4 [16];
  
  auVar4 = __Unwind_Resume();
  lVar2 = auVar4._8_8_;
  if (lVar2 != 0) {
    puVar3 = (undefined8 *)(auVar4._0_8_ + 0x10);
    do {
      if (((*(byte *)(puVar3 + -2) & 1) == 0) &&
         (lVar1 = puVar3[-1], lVar1 != -0x8000000000000000 && lVar1 != 0)) {
        func_0x00187bd4(*puVar3,lVar1,1);
      }
      puVar3 = puVar3 + 4;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  return;
}

