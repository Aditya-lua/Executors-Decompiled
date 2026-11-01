
void FUN_0025e130(undefined8 param_1,long param_2)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  undefined8 *puVar3;
  long unaff_x22;
  
  if ((param_2 != -0x8000000000000000) && (param_2 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x28),param_2,1);
  }
  lVar1 = *(long *)(unaff_x19 + 8);
  lVar2 = *(long *)(unaff_x19 + 0x10);
  if (lVar2 != 0) {
    puVar3 = (undefined8 *)(lVar1 + 8);
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 3;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  if (unaff_x22 != 0) {
    func_0x00187bd4(lVar1,unaff_x22 * 0x18,8);
  }
  return;
}

