
void FUN_0007ce60(void)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000098;
  
  *unaff_x19 = &UNK_009b95c8;
  unaff_x19[4] = in_stack_00000098;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7ce90);
  (*pcVar1)();
}

