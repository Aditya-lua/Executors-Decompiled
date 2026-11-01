
ulong FUN_0036e998(void)

{
  ulong uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  char *pcVar5;
  char cVar6;
  int iVar7;
  char cVar8;
  long *plVar9;
  ulong *unaff_x20;
  ulong uVar10;
  long unaff_x22;
  ulong unaff_x23;
  
  uVar10 = unaff_x23 >> 1;
  uVar3 = func_0x0036e274(uVar10);
  if ((unaff_x23 < 2) || (uVar3 == 0)) {
    if (uVar3 == 0) {
      return 0;
    }
    if (unaff_x23 < 2) goto LAB_0036e9d0;
  }
  else {
    _bzero(uVar3,uVar10);
  }
  uVar4 = 0;
  uVar1 = uVar10;
  if (uVar10 < 2) {
    uVar1 = 1;
  }
  pcVar5 = (char *)(unaff_x22 + 1);
  do {
    uVar2 = (uint)(byte)pcVar5[-1];
    if (uVar2 - 0x3a < 0xfffffff6) {
      if (uVar2 - 0x61 < 6) {
        cVar6 = -0x57;
        cVar8 = *pcVar5;
      }
      else {
        if (5 < uVar2 - 0x41) goto code_r0x0036eab8;
        cVar6 = -0x37;
        cVar8 = *pcVar5;
      }
      iVar7 = (int)cVar8;
      if ((int)cVar8 - 0x3aU < 0xfffffff6) goto LAB_0036ea90;
LAB_0036ea00:
      cVar8 = -0x30;
    }
    else {
      cVar6 = '\0';
      iVar7 = (int)*pcVar5;
      if (0xfffffff5 < (int)*pcVar5 - 0x3aU) goto LAB_0036ea00;
LAB_0036ea90:
      if (iVar7 - 0x61U < 6) {
        cVar8 = -0x57;
      }
      else {
        if (5 < iVar7 - 0x41U) {
code_r0x0036eab8:
          if (pcRam0000000000a3bef0 == (code *)0x0) {
            plVar9 = (long *)(uVar3 - 8);
            if (*plVar9 + 8 != 0) {
              _bzero(plVar9,*plVar9 + 8);
            }
            _free(plVar9);
            return 0;
          }
          if (lRam0000000000a3bee0 == 0) {
            func_0x0079fc6c();
          }
          else if (lRam0000000000a3bee8 != 0) {
            (*pcRam0000000000a3bef0)(uVar3,"",0);
            return 0;
          }
          uVar2 = func_0x0079fc90();
          return (ulong)(uVar2 - 0x30 < 10 || (uVar2 & 0xffffffdf) - 0x41 < 0x1a);
        }
        cVar8 = -0x37;
      }
    }
    *(char *)(uVar3 + uVar4) = cVar8 + (char)iVar7 | (cVar6 + pcVar5[-1]) * '\x10';
    uVar4 = uVar4 + 1;
    pcVar5 = pcVar5 + 2;
  } while (uVar1 != uVar4);
LAB_0036e9d0:
  *unaff_x20 = uVar10;
  return uVar3;
}

