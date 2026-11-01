
void FUN_0005f9c4(void)

{
  char cVar1;
  long *plVar2;
  uint uVar3;
  ulong uVar4;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  uint unaff_w24;
  ulong uVar5;
  ulong unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long lStack0000000000000000;
  undefined1 uStack0000000000000008;
  
  while (uVar3 = (uint)*(byte *)(unaff_x20 + unaff_x25), uVar5 = unaff_x25, uVar3 != 0) {
    while( true ) {
      while ((uVar3 != unaff_w24 || (unaff_x22 <= unaff_x27))) {
        uVar5 = uVar5 + 1;
        uVar3 = (uint)*(byte *)(unaff_x20 + uVar5);
        if (*(byte *)(unaff_x20 + uVar5) == 0) goto LAB_0005f8d8;
      }
      if (uVar5 == 0) break;
      uVar4 = uVar5;
      do {
        if (*(char *)(unaff_x26 + uVar4) != ' ' && *(char *)(unaff_x26 + uVar4) != '\t') break;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
      if (uVar4 <= unaff_x25) break;
      _uStack0000000000000008 = unaff_x20 + unaff_x25;
      lStack0000000000000000 = unaff_x20 + uVar4;
      plVar2 = *(long **)(unaff_x19 + 0x18);
      if (plVar2 == (long *)0x0) goto code_r0x0005fa40;
      (**(code **)(*plVar2 + 0x30))(plVar2,&uStack0000000000000008);
      unaff_x25 = uVar5 + 1;
      unaff_x27 = unaff_x27 + 1;
      uVar3 = (uint)*(byte *)(unaff_x20 + unaff_x25);
      uVar5 = unaff_x25;
      if (uVar3 == 0) goto LAB_0005f8d8;
    }
    unaff_x27 = unaff_x27 + 1;
    unaff_x25 = uVar5 + 1;
  }
LAB_0005f8d8:
  if (uVar5 != 0) {
    if (unaff_x20 + unaff_x25 < unaff_x21) {
      do {
        if (*(char *)(unaff_x20 + unaff_x25) != ' ' && *(char *)(unaff_x20 + unaff_x25) != '\t')
        goto code_r0x0005f90c;
        unaff_x25 = unaff_x25 + 1;
      } while (unaff_x20 + unaff_x25 < unaff_x21);
      unaff_x25 = unaff_x23;
    }
code_r0x0005f90c:
    do {
      cVar1 = *(char *)(unaff_x20 + -1 + uVar5);
      if (cVar1 != ' ' && cVar1 != '\t') break;
      uVar5 = uVar5 - 1;
    } while (uVar5 != 0);
    if (unaff_x25 < uVar5) {
      _uStack0000000000000008 = unaff_x20 + unaff_x25;
      lStack0000000000000000 = unaff_x20 + uVar5;
      plVar2 = *(long **)(unaff_x19 + 0x18);
      if (plVar2 == (long *)0x0) {
code_r0x0005fa40:
        func_0x00056004();
        return;
      }
      (**(code **)(*plVar2 + 0x30))(plVar2,&uStack0000000000000008);
    }
  }
  return;
}

