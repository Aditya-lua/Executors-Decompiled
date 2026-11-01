
void FUN_004b5724(void)

{
  code *pcVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  ulong *unaff_x24;
  ulong *unaff_x25;
  long unaff_x26;
  undefined8 unaff_x27;
  
  while( true ) {
    *(ulong *)(unaff_x20 + 0x10) = unaff_x22;
    if (unaff_x25 == unaff_x24) {
      if (unaff_x19[2] == 0) {
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(*unaff_x19,unaff_x19[2] << 3,8);
      return;
    }
    uVar3 = *unaff_x25;
    unaff_x19[1] = unaff_x25 + 1;
    uVar2 = *(ulong *)(unaff_x26 + 0x10);
    if (uVar2 <= unaff_x22) break;
    if (uVar2 <= uVar3) {
      unaff_x21 = unaff_x27;
      unaff_x22 = uVar3;
      break;
    }
    func_0x0049eb60();
    unaff_x22 = unaff_x22 + 1;
    unaff_x25 = unaff_x25 + 1;
  }
  func_0x007a2570(unaff_x22,uVar2,unaff_x21);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4b5794);
  (*pcVar1)();
}

