
ulong FUN_0036ea70(long param_1)

{
  uint uVar1;
  long in_x9;
  char *pcVar2;
  char *in_x10;
  uint in_w11;
  char cVar3;
  int iVar4;
  char cVar5;
  ulong unaff_x19;
  long *plVar6;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  
code_r0x0036ea70:
  if (5 < in_w11 - 0x41) {
LAB_0036eab8:
    if (pcRam0000000000a3bef0 == (code *)0x0) {
      plVar6 = (long *)(unaff_x19 - 8);
      if (*plVar6 + 8 != 0) {
        _bzero(plVar6,*plVar6 + 8);
      }
      _free(plVar6);
      return 0;
    }
    if (lRam0000000000a3bee0 == 0) {
      func_0x0079fc6c();
    }
    else if (lRam0000000000a3bee8 != 0) {
      (*pcRam0000000000a3bef0)();
      return 0;
    }
    uVar1 = func_0x0079fc90();
    return (ulong)(uVar1 - 0x30 < 10 || (uVar1 & 0xffffffdf) - 0x41 < 0x1a);
  }
  cVar3 = -0x37;
  iVar4 = (int)*in_x10;
  if (0xfffffff5 < iVar4 - 0x3aU) goto LAB_0036ea00;
  do {
    pcVar2 = in_x10;
    if (iVar4 - 0x61U < 6) {
      cVar5 = -0x57;
    }
    else {
      if (5 < iVar4 - 0x41U) goto LAB_0036eab8;
      cVar5 = -0x37;
    }
    while( true ) {
      *(char *)(unaff_x19 + param_1) = cVar5 + (char)iVar4 | (cVar3 + (char)in_w11) * '\x10';
      param_1 = param_1 + 1;
      in_x10 = pcVar2 + 2;
      if (in_x9 == param_1) {
        *unaff_x20 = unaff_x21;
        return unaff_x19;
      }
      in_w11 = (uint)(byte)pcVar2[1];
      if (in_w11 - 0x3a < 0xfffffff6) {
        if (5 < in_w11 - 0x61) goto code_r0x0036ea70;
        cVar3 = -0x57;
        cVar5 = *in_x10;
      }
      else {
        cVar3 = '\0';
        cVar5 = *in_x10;
      }
      iVar4 = (int)cVar5;
      if (iVar4 - 0x3aU < 0xfffffff6) break;
LAB_0036ea00:
      cVar5 = -0x30;
      pcVar2 = in_x10;
    }
  } while( true );
}

