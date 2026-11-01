
void FUN_004e8b08(long param_1,undefined8 param_2)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long *plVar3;
  long *unaff_x27;
  long *plVar4;
  long *unaff_x28;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  do {
    lVar2 = func_0x00187bd0(param_1,param_2);
    param_1 = unaff_x21;
    if (lVar2 == 0) {
LAB_004e8b60:
      func_0x007a1f00(unaff_x20,param_1,&UNK_009e8da8);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x4e8b78);
      (*pcVar1)();
    }
    plVar3 = unaff_x27;
    plVar4 = unaff_x28;
    while( true ) {
      unaff_x27 = plVar3 + 2;
      _memcpy(lVar2,unaff_x22,param_1);
      plVar4[-2] = param_1;
      plVar4[-1] = lVar2;
      unaff_x28 = plVar4 + 3;
      *plVar4 = param_1;
      unaff_x24 = unaff_x24 + 1;
      if (unaff_x25 == unaff_x24) {
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = in_stack_00000008;
        unaff_x19[2] = unaff_x25;
        return;
      }
      param_1 = *unaff_x27;
      if (param_1 < 0) {
        unaff_x20 = 0;
        goto LAB_004e8b60;
      }
      unaff_x22 = plVar3[1];
      if (param_1 != 0) break;
      lVar2 = 1;
      plVar3 = unaff_x27;
      plVar4 = unaff_x28;
    }
    param_2 = 1;
    unaff_x21 = param_1;
  } while( true );
}

