
void FUN_0002cfb4(code *param_1)

{
  code *pcVar1;
  long unaff_x19;
  int *unaff_x23;
  
  (*param_1)();
  if (9 < *unaff_x23 + 1000U) {
    func_0x0002d4a4();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x2d1fc);
    (*pcVar1)();
  }
                    /* WARNING: Could not recover jumptable at 0x0002cfd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_0002cf78 + (ulong)*(byte *)(unaff_x19 + (ulong)(*unaff_x23 + 1000U)) * 4))();
  return;
}

