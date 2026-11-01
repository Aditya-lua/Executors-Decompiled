
void FUN_005e1d14(void)

{
  code *pcVar1;
  long *unaff_x19;
  long unaff_x21;
  long lVar2;
  long unaff_x22;
  long lVar3;
  long unaff_x23;
  long *unaff_x26;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  
  func_0x0046b8d0();
  lVar2 = unaff_x21;
  lVar3 = unaff_x22;
  if ((uStack0000000000000048 & 1) != 0) {
    if (unaff_x23 != -0x8000000000000000) {
      func_0x007a2810(&UNK_008b916f,0x24,&uStack0000000000000048,&UNK_009f3378,&UNK_009f3480);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x5e1e08);
      (*pcVar1)();
    }
    lVar2 = in_stack_00000050;
    lVar3 = unaff_x21;
    unaff_x23 = unaff_x22;
  }
  *unaff_x19 = unaff_x23;
  unaff_x19[1] = lVar3;
  unaff_x19[2] = lVar2;
  if (*unaff_x26 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x26[1],*unaff_x26 << 3,8);
  return;
}

