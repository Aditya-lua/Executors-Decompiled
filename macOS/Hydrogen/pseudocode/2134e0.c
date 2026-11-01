
void FUN_002134e0(void)

{
  undefined1 uVar1;
  undefined1 uVar2;
  code *pcVar3;
  undefined2 *puVar4;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x24;
  
  puVar4 = (undefined2 *)func_0x00187bd0(2,1);
  if (puVar4 == (undefined2 *)0x0) {
    func_0x007a1f00(1,2,&UNK_009c64a8);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x213718);
    (*pcVar3)();
  }
  *puVar4 = 0xc;
  uVar1 = *(undefined1 *)(unaff_x20 + 0xb0);
  uVar2 = *(undefined1 *)(unaff_x20 + 0xb1);
  unaff_x21[2] = (long)puVar4;
  unaff_x21[3] = 1;
  *(undefined1 *)(unaff_x21 + 4) = uVar1;
  *(undefined1 *)((long)unaff_x21 + 0x21) = uVar2;
  *unaff_x21 = unaff_x24 + -0x15;
  unaff_x21[1] = 1;
  func_0x002087e4();
  func_0x002095c8();
  func_0x00187bd4();
  return;
}

