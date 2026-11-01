
void FUN_00250c78(void)

{
  code *pcVar1;
  long *plVar2;
  long lVar3;
  undefined1 *unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined1 uStack000000000000001f;
  
  func_0x00278048(&UNK_009ca3c8);
  if (in_stack_00000000 == 0xc) {
    func_0x007a2810(&UNK_00829d3c,0x2b,&uStack000000000000001f,&UNK_009c9e28,&UNK_009ca420);
  }
  else if (unaff_x22 == 0xc) {
    plVar2 = (long *)func_0x00187bd0(0x28,8);
    if (plVar2 != (long *)0x0) {
      *plVar2 = in_stack_00000000;
      plVar2[1] = in_stack_00000008;
      lVar3 = *unaff_x21;
      plVar2[2] = in_stack_00000010;
      plVar2[3] = lVar3;
      *(int *)(plVar2 + 4) = (int)unaff_x21[1];
      *unaff_x19 = 0;
      unaff_x19[1] = 0;
      unaff_x19[2] = 0;
      unaff_x19[3] = 0;
      unaff_x19[4] = 0;
      unaff_x19[5] = 0;
      unaff_x19[6] = 0;
      unaff_x19[7] = 0;
      unaff_x19[8] = 0;
      unaff_x19[9] = 0;
      unaff_x19[10] = 0;
      unaff_x19[0xb] = 0;
      unaff_x19[0xc] = 0;
      unaff_x19[0xd] = 0;
      unaff_x19[0xe] = 0;
      unaff_x19[0xf] = 0;
      unaff_x19[0x10] = 0;
      unaff_x19[0x11] = 0;
      unaff_x19[0x12] = 0;
      unaff_x19[0x13] = 0;
      unaff_x19[0x14] = 0;
      unaff_x19[0x15] = 0;
      unaff_x19[0x16] = 0;
      unaff_x19[0x17] = 0;
      unaff_x19[0x18] = 0;
      unaff_x19[0x19] = 0;
      unaff_x19[0x1a] = 0;
      unaff_x19[0x1b] = 0;
      unaff_x19[0x1c] = 0;
      unaff_x19[0x1d] = 0;
      unaff_x19[0x1e] = 0;
      unaff_x19[0x1f] = 0;
      return;
    }
    func_0x007a1f18(8,0x28);
  }
  else {
    func_0x007a2930(0xc);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x250de4);
  (*pcVar1)();
}

