
void FUN_0023f24c(void)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  long *plVar4;
  long unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  int unaff_w23;
  long unaff_x24;
  undefined1 unaff_w25;
  long unaff_x26;
  long unaff_x27;
  
  *(short *)(unaff_x24 + 10) = (short)unaff_x26;
  if (((uint)unaff_x21 & 0xffff) < 0xc) {
    if (unaff_w23 == (int)unaff_x27) {
      _memcpy(unaff_x19 + 0x18,unaff_x24 + unaff_x26 * 8 + 0x20,(unaff_x27 - unaff_x26) * 8);
      uVar3 = 0;
      lVar2 = *(long *)(unaff_x22 + 8);
      do {
        plVar4 = *(long **)(unaff_x19 + 0x18 + uVar3 * 8);
        *plVar4 = unaff_x19;
        *(short *)(plVar4 + 1) = (short)uVar3;
        if (unaff_x21 <= uVar3) break;
        uVar3 = uVar3 + 1;
      } while (uVar3 <= unaff_x21);
      *unaff_x20 = unaff_x24;
      unaff_x20[1] = lVar2;
      *(undefined1 *)(unaff_x20 + 4) = unaff_w25;
      unaff_x20[2] = unaff_x19;
      unaff_x20[3] = lVar2;
      return;
    }
    func_0x007a247c(&UNK_0082980f,0x28,&UNK_009c9a00);
  }
  else {
    func_0x007a28b0(unaff_x27 - unaff_x26,0xc,&UNK_009c9a30);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x23f344);
  (*pcVar1)();
}

