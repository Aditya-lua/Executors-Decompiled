
void FUN_0059a514(void)

{
  bool in_ZR;
  bool in_CY;
  long lVar1;
  char *pcVar2;
  ulong uVar3;
  ulong unaff_x19;
  char *unaff_x20;
  ulong *unaff_x21;
  ulong unaff_x22;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000034;
  
  if (in_CY && !in_ZR) {
    lVar1 = func_0x0046b0fc(0x5c);
    if (lVar1 == 1) {
LAB_0059a554:
      uStack0000000000000034 = 0x80;
      func_0x0059b140(&uStack0000000000000018);
      unaff_x21[1] = in_stack_00000008;
      *unaff_x21 = in_stack_00000000;
      unaff_x21[2] = in_stack_00000010;
      if ((unaff_x19 | 0x8000000000000000) == 0x8000000000000000) {
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)();
      return;
    }
  }
  else if (unaff_x22 != 0) {
    pcVar2 = unaff_x20;
    uVar3 = unaff_x22;
    do {
      if (*pcVar2 == '\\') goto LAB_0059a554;
      uVar3 = uVar3 - 1;
      pcVar2 = pcVar2 + 1;
    } while (uVar3 != 0);
  }
  *unaff_x21 = unaff_x19;
  unaff_x21[1] = (ulong)unaff_x20;
  unaff_x21[2] = unaff_x22;
  return;
}

