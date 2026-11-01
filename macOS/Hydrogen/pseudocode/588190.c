
void FUN_00588190(long *param_1)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  
  puVar2 = (undefined8 *)*param_1;
  if (param_1[1] - (long)puVar2 != 0) {
    lVar3 = 1 - ((ulong)(param_1[1] - (long)puVar2) >> 3);
    do {
      lVar1 = *(long *)*puVar2;
      *(long *)*puVar2 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(puVar2);
      }
      puVar2 = puVar2 + 1;
      lVar3 = lVar3 + 1;
    } while (lVar3 != 1);
  }
  return;
}

