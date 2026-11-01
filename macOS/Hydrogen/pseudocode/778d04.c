
undefined8 FUN_00778d04(long *param_1)

{
  undefined *puVar1;
  long lVar2;
  long unaff_x20;
  
  (*pcRam0000000000a2b5f0)(*param_1);
  *param_1 = 0;
  if (unaff_x20 != 0) {
    puVar1 = (undefined *)_strlen();
    if (&UNK_007a1200 < puVar1) {
      return 0x2b;
    }
    lVar2 = (*pcRam0000000000a2b600)();
    *param_1 = lVar2;
    if (lVar2 == 0) {
      return 0x1b;
    }
  }
  return 0;
}

