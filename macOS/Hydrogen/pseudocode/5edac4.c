
void FUN_005edac4(long param_1,long param_2,long param_3)

{
  long unaff_x20;
  long *plVar1;
  long *unaff_x21;
  
  do {
    (**(code **)(param_1 + 0x18))(param_2,param_3);
    do {
      plVar1 = unaff_x21;
      unaff_x21 = plVar1 + 3;
      unaff_x20 = unaff_x20 + -1;
      if (unaff_x20 == 0) {
        func_0x004661a4();
        return;
      }
      param_2 = plVar1[2];
    } while (param_2 == 0);
    param_3 = plVar1[1];
    param_1 = *unaff_x21;
  } while( true );
}

