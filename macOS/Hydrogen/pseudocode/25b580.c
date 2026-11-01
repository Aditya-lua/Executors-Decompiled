
void FUN_0025b580(undefined8 param_1,long param_2)

{
  long unaff_x19;
  long unaff_x21;
  undefined8 *puVar1;
  undefined8 *unaff_x22;
  
  do {
    func_0x00187bd4(*unaff_x22,param_2,1);
    puVar1 = unaff_x22;
    do {
      unaff_x22 = puVar1 + 3;
      unaff_x19 = unaff_x19 + -1;
      if (unaff_x19 == 0) {
        if (unaff_x21 != 0) {
          func_0x00187bd4();
        }
        return;
      }
      param_2 = puVar1[2];
      puVar1 = unaff_x22;
    } while (param_2 == 0);
  } while( true );
}

