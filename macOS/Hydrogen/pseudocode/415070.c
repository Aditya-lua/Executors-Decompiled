
void FUN_00415070(void)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  undefined8 uVar4;
  long lVar5;
  long *extraout_x8;
  long *plVar6;
  long unaff_x23;
  undefined1 uStack0000000000000018;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  
  uVar4 = func_0x007a1f00();
  if (unaff_x23 != 0) {
    func_0x00187bd4();
    func_0x0016b01c(&uStack0000000000000018);
    uVar4 = __Unwind_Resume(uVar4);
  }
  func_0x0016b01c(&uStack0000000000000018);
  lVar5 = __Unwind_Resume(uVar4);
  plVar6 = *(long **)(lVar5 + 8);
  if (plVar6 != *(long **)(lVar5 + 0x18)) {
    *(long **)(lVar5 + 8) = plVar6 + 3;
    lVar5 = *plVar6;
    if (lVar5 != -0x8000000000000000) {
      lVar1 = plVar6[1];
      lVar2 = plVar6[2];
      func_0x0046b8d0(&lStack_48,lVar1,lVar2);
      if (((uint)lStack_48 & 1) != 0) {
        lStack_48 = lVar5;
        lStack_40 = lVar1;
        lStack_38 = lVar2;
        func_0x007a2810(&UNK_008851be,0x2b,&lStack_48,&UNK_009d93f8,&UNK_009da1f8);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x415168);
        (*pcVar3)();
      }
      *extraout_x8 = lVar5;
      extraout_x8[1] = lVar1;
      extraout_x8[2] = lVar2;
      return;
    }
  }
  *extraout_x8 = -0x8000000000000000;
  return;
}

