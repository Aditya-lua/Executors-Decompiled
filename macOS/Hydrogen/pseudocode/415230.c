
void FUN_00415230(long *param_1,long param_2)

{
  long lVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  lVar3 = *(long *)(param_2 + 0x18);
  if (*(long *)(param_2 + 8) != lVar3) {
    lVar4 = *(long *)(lVar3 + -0x18);
    *(long **)(param_2 + 0x18) = (long *)(lVar3 + -0x18);
    if (lVar4 != -0x8000000000000000) {
      lVar1 = *(long *)(lVar3 + -0x10);
      lVar3 = *(long *)(lVar3 + -8);
      func_0x0046b8d0(&uStack0000000000000008,lVar1,lVar3);
      if ((uStack0000000000000008 & 1) != 0) {
        uStack0000000000000008 = lVar4;
        in_stack_00000010 = lVar1;
        in_stack_00000018 = lVar3;
        func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000008,&UNK_009d93f8,&UNK_009da210);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x4152d0);
        (*pcVar2)();
      }
      *param_1 = lVar4;
      param_1[1] = lVar1;
      param_1[2] = lVar3;
      return;
    }
  }
  *param_1 = -0x8000000000000000;
  return;
}

