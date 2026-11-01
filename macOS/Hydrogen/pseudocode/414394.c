
void FUN_00414394(void)

{
  code *pcVar1;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long lVar2;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  
  func_0x0046b8d0();
  if ((int)uStack0000000000000008 == 1) {
    func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000008,&UNK_009d93f8,&UNK_009da178);
LAB_00414460:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x414464);
    (*pcVar1)();
  }
  func_0x0046b8d0(&uStack0000000000000008);
  lVar2 = unaff_x21;
  if ((uStack0000000000000008 & 1) != 0) {
    if (unaff_x22 != -0x8000000000000000) {
      func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000008,&UNK_009d93f8,&UNK_009da190);
      goto LAB_00414460;
    }
    lVar2 = unaff_x25;
    unaff_x22 = unaff_x21;
    unaff_x25 = in_stack_00000010;
  }
  *unaff_x23 = unaff_x19;
  unaff_x23[1] = unaff_x20;
  unaff_x23[2] = unaff_x24;
  unaff_x23[3] = unaff_x22;
  unaff_x23[4] = lVar2;
  unaff_x23[5] = unaff_x25;
  return;
}

