
void FUN_004e5354(long param_1)

{
  long unaff_x19;
  undefined8 *puVar1;
  undefined8 *unaff_x20;
  
  do {
    func_0x00187bd4(*unaff_x20,param_1 << 4,8);
    puVar1 = unaff_x20;
    do {
      unaff_x20 = puVar1 + 3;
      unaff_x19 = unaff_x19 + -1;
      if (unaff_x19 == 0) {
        return;
      }
      param_1 = puVar1[2];
      puVar1 = unaff_x20;
    } while (param_1 == 0);
  } while( true );
}

