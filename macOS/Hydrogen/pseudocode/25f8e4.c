
void FUN_0025f8e4(undefined8 param_1,long param_2)

{
  long unaff_x19;
  undefined8 *puVar1;
  undefined8 *unaff_x21;
  long unaff_x22;
  
  do {
    func_0x00187bd4(*unaff_x21,param_2,1);
    puVar1 = unaff_x21;
    do {
      unaff_x21 = puVar1 + 3;
      unaff_x19 = unaff_x19 + -1;
      if (unaff_x19 == 0) {
        if (unaff_x22 != 0) {
          func_0x00187bd4();
        }
        return;
      }
      param_2 = puVar1[2];
      puVar1 = unaff_x21;
    } while (param_2 == 0);
  } while( true );
}

