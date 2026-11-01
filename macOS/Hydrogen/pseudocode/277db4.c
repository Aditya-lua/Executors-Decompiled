
void FUN_00277db4(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined1 *puVar6;
  long lVar7;
  undefined8 *extraout_x8;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x24;
  undefined8 *unaff_x25;
  undefined1 auVar8 [16];
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000030;
  char acStack_21c [492];
  
  iVar2 = func_0x002dcf44();
  if (iVar2 != 1) {
    if (unaff_x19 != 0) {
      lVar7 = 0;
      do {
        *(undefined1 *)(unaff_x20 + lVar7) = 0;
        lVar7 = lVar7 + 1;
      } while (unaff_x19 != lVar7);
      func_0x00187bd4();
    }
    func_0x007a2810(&UNK_0082dc98,0x2b,(long)&uStack0000000000000030 + 4,&UNK_009ccdc0,&UNK_009ccdf8
                   );
    func_0x007a28b0();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x277eec);
    (*pcVar1)();
  }
  if (unaff_x19 != 0) {
    lVar7 = 0;
    do {
      *(undefined1 *)(unaff_x20 + lVar7) = 0;
      lVar7 = lVar7 + 1;
    } while (unaff_x19 != lVar7);
    func_0x00187bd4();
  }
  (*(code *)*unaff_x25)((long)&uStack0000000000000030 + 4,&uStack0000000000000010);
  if (uStack0000000000000030._4_1_ != '\x04') {
    _memcpy((long)unaff_x21 + 9,(long)&uStack0000000000000030 + 4U | 1,0x1eb);
    *unaff_x21 = unaff_x25;
    *(char *)(unaff_x21 + 1) = uStack0000000000000030._4_1_;
    return;
  }
  puVar6 = (undefined1 *)((long)&uStack0000000000000030 + 4);
  lVar3 = func_0x007a2810(&UNK_0082dc98,0x2b,puVar6,&UNK_009ccdc0,&UNK_009cce10);
  lVar5 = *(long *)(unaff_x24 + 0x10);
  lVar7 = lVar3;
  if (lVar5 != 0) {
    lVar7 = 0;
    lVar4 = *(long *)(unaff_x24 + 8);
    do {
      *(undefined1 *)(lVar4 + lVar7) = 0;
      lVar7 = lVar7 + 1;
    } while (lVar5 != lVar7);
    puVar6 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    func_0x00187bd4(lVar4,lVar5,1);
    lVar7 = __Unwind_Resume(lVar3);
    if (lVar3 != 0) {
      lVar5 = 0;
      do {
        *(undefined1 *)(lVar5 + 4) = 0;
        lVar5 = lVar5 + 1;
      } while (lVar3 != lVar5);
      puVar6 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
      func_0x00187bd4(4,lVar3,1);
    }
  }
  auVar8 = __Unwind_Resume(lVar7);
  (*(code *)*auVar8._0_8_)(acStack_21c,auVar8._8_8_,puVar6);
  if (acStack_21c[0] == '\x04') {
    *(undefined1 *)(extraout_x8 + 1) = 4;
  }
  else {
    _memcpy(extraout_x8 + 1,acStack_21c,0x1ec);
    *extraout_x8 = auVar8._0_8_;
  }
  return;
}

