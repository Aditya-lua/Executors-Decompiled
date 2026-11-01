
void FUN_004e5360(undefined8 param_1,long param_2,undefined8 param_3)

{
  long *plVar1;
  long unaff_x19;
  undefined8 *puVar2;
  undefined8 *unaff_x20;
  
  do {
    func_0x00187bd4(param_1,param_2,param_3);
    puVar2 = unaff_x20;
    do {
      unaff_x20 = puVar2 + 3;
      unaff_x19 = unaff_x19 + -1;
      if (unaff_x19 == 0) {
        return;
      }
      plVar1 = puVar2 + 2;
      puVar2 = unaff_x20;
    } while (*plVar1 == 0);
    param_1 = *unaff_x20;
    param_2 = *plVar1 << 4;
    param_3 = 8;
  } while( true );
}

