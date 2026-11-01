
void FUN_006b4f50(void)

{
  long lVar1;
  long unaff_x29;
  long in_stack_00000048;
  long in_stack_00000060;
  
  if (in_stack_00000048 != 0) goto LAB_006b4f74;
  if (in_stack_00000060 != 0) goto LAB_006b4f88;
  do {
    lVar1 = *(long *)(unaff_x29 + -0x68);
    while( true ) {
      if (lVar1 != 0) {
        __ZdlPv();
      }
      __Unwind_Resume();
LAB_006b4f74:
      __ZdlPv(in_stack_00000048);
      if (in_stack_00000060 == 0) break;
LAB_006b4f88:
      __ZdlPv();
      lVar1 = *(long *)(unaff_x29 + -0x68);
    }
  } while( true );
}

