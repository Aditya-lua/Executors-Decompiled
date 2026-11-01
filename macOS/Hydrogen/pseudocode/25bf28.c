
void FUN_0025bf28(long param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  undefined8 *puVar3;
  long unaff_x22;
  
  if ((param_3 != param_1) && (param_3 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x28),param_3,1);
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

