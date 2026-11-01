
void FUN_004e0660(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long in_stack_00000008;
  
  while( true ) {
    unaff_x19 = unaff_x19 + 600;
    unaff_x28 = unaff_x28 + -600;
    if (unaff_x28 == 0) break;
    while ((*(long *)(unaff_x19 + 0x220) == unaff_x22 &&
           (iVar3 = _memcmp(*(undefined8 *)(unaff_x19 + 0x218),unaff_x23,unaff_x22), iVar3 == 0))) {
      *(long *)(unaff_x26 + unaff_x20 * 8) = unaff_x19;
      unaff_x20 = unaff_x20 + 1;
      unaff_x25 = unaff_x25 + 1;
      if (unaff_x25 == unaff_x21) {
        *(long *)(in_stack_00000008 + 0x10) = unaff_x20;
        return;
      }
      if (*(long *)(unaff_x27 + 0x90) == 0) goto LAB_004e06c8;
      unaff_x19 = *(long *)(unaff_x27 + 0x88);
      puVar1 = (undefined8 *)(unaff_x24 + unaff_x25 * 0x10);
      unaff_x23 = *puVar1;
      unaff_x22 = puVar1[1];
      unaff_x28 = *(long *)(unaff_x27 + 0x90) * 600;
    }
  }
LAB_004e06c8:
  func_0x007a23d8(&UNK_008a75ee,99,&UNK_009ea3d0);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4e06e4);
  (*pcVar2)();
}

