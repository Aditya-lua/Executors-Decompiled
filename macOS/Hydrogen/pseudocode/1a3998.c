
void FUN_001a3998(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  lVar2 = *(long *)(param_1 + 0x10);
  if (lVar2 != 0) {
    puVar3 = (undefined8 *)(*(long *)(param_1 + 8) + 0x10);
    do {
      lVar1 = puVar3[-1];
      if (puVar3[-2] == 0) {
        if (lVar1 != -0x8000000000000000) goto LAB_001a39dc;
      }
      else if (puVar3[-2] == 1 || lVar1 != -0x8000000000000000) {
LAB_001a39dc:
        if (lVar1 != 0) {
          func_0x00187bd4(*puVar3,lVar1,1);
        }
      }
      puVar3 = puVar3 + 5;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  return;
}

