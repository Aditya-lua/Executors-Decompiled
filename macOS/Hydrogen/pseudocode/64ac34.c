
void FUN_0064ac34(undefined8 param_1,long param_2,long param_3)

{
  long lVar1;
  ulong uVar2;
  undefined8 *puVar3;
  
  puVar3 = *(undefined8 **)(param_2 + 0x20);
  if (puVar3 != *(undefined8 **)(param_3 + 0x20)) {
    do {
      puVar3[6] = &UNK_009f5d60;
      lVar1 = puVar3[10];
      uVar2 = puVar3[8];
      if ((ulong)puVar3[9] <= (ulong)puVar3[8]) {
        uVar2 = puVar3[9];
      }
      if (lVar1 != 0) {
        if (uVar2 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
      }
      *puVar3 = &UNK_009f5d60;
      lVar1 = puVar3[4];
      uVar2 = puVar3[2];
      if ((ulong)puVar3[3] <= (ulong)puVar3[2]) {
        uVar2 = puVar3[3];
      }
      if (lVar1 != 0) {
        if (uVar2 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
      }
      puVar3 = (undefined8 *)(*(long *)(param_2 + 0x20) + 0x70);
      *(undefined8 **)(param_2 + 0x20) = puVar3;
    } while (puVar3 != *(undefined8 **)(param_3 + 0x20));
  }
  return;
}

