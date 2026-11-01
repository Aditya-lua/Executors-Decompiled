
void FUN_001a2f5c(void)

{
  undefined4 uVar1;
  code *pcVar2;
  long unaff_x20;
  long *unaff_x21;
  long lVar3;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x28;
  long lVar4;
  undefined8 in_stack_00000008;
  undefined8 *in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  
code_r0x001a2f5c:
  lVar3 = 1;
  lVar4 = unaff_x28;
  do {
    unaff_x28 = lVar4 + 0x20;
    unaff_x26 = unaff_x26 + 1;
    _memcpy(lVar3,unaff_x24,unaff_x23);
    uVar1 = *(undefined4 *)(lVar4 + 0x18);
    unaff_x21[-2] = unaff_x23;
    unaff_x21[-1] = lVar3;
    *unaff_x21 = unaff_x23;
    *(undefined4 *)(unaff_x21 + 1) = uVar1;
    unaff_x20 = unaff_x20 + -0x20;
    unaff_x21 = unaff_x21 + 4;
    if ((unaff_x25 == unaff_x26) || (unaff_x20 == 0)) {
      in_stack_00000010[1] = in_stack_00000020;
      *in_stack_00000010 = in_stack_00000018;
      in_stack_00000010[2] = unaff_x25;
      return;
    }
    unaff_x23 = *(long *)(lVar4 + 0x30);
    if (unaff_x23 < 0) {
      in_stack_00000008 = 0;
LAB_001a3010:
      func_0x007a1f00(in_stack_00000008,lVar3,&UNK_009c24c0);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x1a3028);
      (*pcVar2)();
    }
    unaff_x24 = *(undefined8 *)(lVar4 + 0x28);
    if (unaff_x23 == 0) goto code_r0x001a2f5c;
    lVar3 = func_0x00187bd0(unaff_x23,1);
    if (lVar3 == 0) {
      lVar3 = unaff_x23;
      goto LAB_001a3010;
    }
    lVar4 = unaff_x28;
  } while( true );
}

