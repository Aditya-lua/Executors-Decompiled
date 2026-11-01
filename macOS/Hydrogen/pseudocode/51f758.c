
void FUN_0051f758(int param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long *in_stack_00000008;
  
  while( true ) {
    if (param_1 != 0) goto LAB_0051f730;
    *(long *)(unaff_x25 + unaff_x22 * 8) = unaff_x21;
    unaff_x22 = unaff_x22 + 1;
    unaff_x24 = unaff_x24 + 1;
    if (unaff_x24 == unaff_x27) {
      *in_stack_00000008 = unaff_x22;
      return;
    }
    if (*(long *)(unaff_x26 + 0x90) == 0) break;
    unaff_x21 = *(long *)(unaff_x26 + 0x88);
    puVar1 = (undefined8 *)(unaff_x23 + unaff_x24 * 0x10);
    unaff_x20 = *puVar1;
    unaff_x19 = puVar1[1];
    unaff_x28 = *(long *)(unaff_x26 + 0x90) * 600;
    while (*(long *)(unaff_x21 + 0x220) != unaff_x19) {
LAB_0051f730:
      unaff_x21 = unaff_x21 + 600;
      unaff_x28 = unaff_x28 + -600;
      if (unaff_x28 == 0) goto code_r0x0051f798;
    }
    param_1 = _memcmp(*(undefined8 *)(unaff_x21 + 0x218),unaff_x20,unaff_x19);
  }
code_r0x0051f798:
  func_0x007a23d8(&UNK_008a75ee,99,&UNK_009ea3d0);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x51f7b4);
  (*pcVar2)();
}

