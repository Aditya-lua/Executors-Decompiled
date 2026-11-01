
void FUN_005133f8(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long *unaff_x27;
  long *in_stack_00000008;
  
  do {
    if (unaff_x19 == 0) {
      lVar2 = 1;
    }
    else {
      lVar2 = func_0x00187bd0(unaff_x19,1);
      if (lVar2 == 0) {
        uVar3 = 1;
        goto code_r0x005134b4;
      }
    }
    _memcpy(lVar2,unaff_x20,unaff_x19);
    unaff_x27[-1] = unaff_x19;
    *unaff_x27 = lVar2;
    unaff_x27[1] = unaff_x19;
    if (unaff_x26 == unaff_x24) {
      *in_stack_00000008 = unaff_x23 + unaff_x24 + 1;
      return;
    }
    unaff_x20 = unaff_x25[-1];
    unaff_x19 = *unaff_x25;
    unaff_x25 = unaff_x25 + 2;
    unaff_x27 = unaff_x27 + 3;
    unaff_x24 = unaff_x24 + 1;
  } while (-1 < unaff_x19);
  uVar3 = 0;
  unaff_x19 = lVar2;
code_r0x005134b4:
  func_0x007a1f00(uVar3,unaff_x19,&UNK_009e9838);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5134c8);
  (*pcVar1)();
}

