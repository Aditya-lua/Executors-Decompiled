
void FUN_004150e4(long *param_1)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  long *unaff_x19;
  long lVar4;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  lVar4 = *param_1;
  if (lVar4 == -0x8000000000000000) {
    *unaff_x19 = -0x8000000000000000;
  }
  else {
    lVar1 = param_1[1];
    lVar2 = param_1[2];
    func_0x0046b8d0(&uStack0000000000000008,lVar1,lVar2);
    if ((uStack0000000000000008 & 1) != 0) {
      uStack0000000000000008 = lVar4;
      in_stack_00000010 = lVar1;
      in_stack_00000018 = lVar2;
      func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000008,&UNK_009d93f8,&UNK_009da1f8);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x415168);
      (*pcVar3)();
    }
    *unaff_x19 = lVar4;
    unaff_x19[1] = lVar1;
    unaff_x19[2] = lVar2;
  }
  return;
}

