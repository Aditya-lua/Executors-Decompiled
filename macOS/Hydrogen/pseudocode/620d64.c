
void FUN_00620d64(code *param_1)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x29;
  
  do {
    (*param_1)(unaff_x19);
    bVar1 = unaff_x19 == unaff_x23;
    puVar2 = unaff_x23;
    unaff_x19 = unaff_x24;
    if (bVar1) {
      puVar2 = (undefined8 *)*unaff_x21;
      do {
        unaff_x22[-2] = unaff_x23;
        __ZdlPv(puVar2);
        do {
          unaff_x22 = unaff_x21;
          if (unaff_x22 == unaff_x20) {
            *(undefined8 **)(unaff_x29 + -0x68) = unaff_x20;
            __ZdlPv(*(undefined8 *)(unaff_x29 + -0x70));
            return;
          }
          unaff_x21 = unaff_x22 + -3;
          puVar2 = (undefined8 *)*unaff_x21;
        } while (puVar2 == (undefined8 *)0x0);
        unaff_x23 = puVar2;
      } while ((undefined8 *)unaff_x22[-2] == puVar2);
      unaff_x19 = (undefined8 *)unaff_x22[-2] + -6;
    }
    unaff_x24 = unaff_x19 + -6;
    param_1 = *(code **)*unaff_x19;
    unaff_x23 = puVar2;
  } while( true );
}

