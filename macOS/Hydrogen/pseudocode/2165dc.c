
void FUN_002165dc(long param_1)

{
  code *pcVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long lVar3;
  long unaff_x24;
  long *unaff_x26;
  long *unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000008;
  
  do {
    lVar2 = func_0x00187bd0(param_1,1);
    param_1 = unaff_x23;
    if (lVar2 == 0) {
LAB_0021661c:
      func_0x007a1f00(in_stack_00000008,param_1,&UNK_009c6fd0);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x216634);
      (*pcVar1)();
    }
    lVar3 = unaff_x24;
    unaff_x24 = lVar2;
    while( true ) {
      _memcpy(unaff_x24,lVar3,unaff_x23);
      param_1 = unaff_x23;
      do {
        *unaff_x19 = unaff_x28;
        unaff_x19[1] = unaff_x23;
        unaff_x19[2] = unaff_x24;
        unaff_x19[3] = param_1;
        unaff_x19 = unaff_x19 + 4;
        if (unaff_x27 == unaff_x26) {
          return;
        }
        unaff_x28 = *unaff_x27;
        unaff_x23 = unaff_x27[1];
        unaff_x24 = unaff_x27[2];
        param_1 = unaff_x27[3];
        unaff_x27 = unaff_x27 + 4;
        *(long **)(unaff_x21 + 8) = unaff_x27;
      } while (unaff_x28 != -0x7fffffffffffffff || unaff_x23 != unaff_x22);
      if (param_1 < 0) {
        in_stack_00000008 = 0;
        goto LAB_0021661c;
      }
      unaff_x23 = param_1;
      if (param_1 != 0) break;
      lVar3 = unaff_x24;
      unaff_x24 = 1;
    }
  } while( true );
}

