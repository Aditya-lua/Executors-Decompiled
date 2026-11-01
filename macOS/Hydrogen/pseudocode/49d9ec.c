
void FUN_0049d9ec(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined1 in_ZR;
  long lVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  do {
    if ((bool)in_ZR) {
      return;
    }
    while (lVar1 = *(long *)*unaff_x19, *(long *)*unaff_x19 = lVar1 + unaff_x22, lVar1 < 0) {
      func_0x007a05dc();
      puVar2 = (undefined8 *)(unaff_x20 + 0x20);
      func_0x007ae680();
      if (unaff_x19 == param_3) {
        return;
      }
      unaff_x22 = 1;
      param_3 = puVar2;
    }
    func_0x0049ede4();
    unaff_x19 = unaff_x19 + 1;
    unaff_x21 = unaff_x21 + -1;
    in_ZR = unaff_x21 == 0;
  } while( true );
}

