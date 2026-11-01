
void FUN_0075bed4(void)

{
  undefined1 uVar1;
  char cVar2;
  long lVar3;
  int iVar4;
  int iVar5;
  undefined1 in_w8;
  undefined1 uVar6;
  long lVar7;
  long unaff_x20;
  long unaff_x21;
  char *pcVar8;
  undefined8 unaff_x24;
  long lVar9;
  
  *(undefined1 *)(unaff_x21 + 0x4e1) = in_w8;
  func_0x0073b884(unaff_x21 + 0x488);
  func_0x0074066c(unaff_x21 + 0x4a8,0x10000);
  func_0x0076e19c();
  pcVar8 = *(char **)(unaff_x21 + 0x1f0);
  if ((pcVar8 != (char *)0x0) && (cVar2 = *pcVar8, cVar2 != '\0')) {
    lVar9 = 0;
    while( true ) {
      while ((cVar2 != '\0' && (cVar2 != '='))) {
        lVar7 = lVar9 + 1;
        lVar9 = lVar9 + 1;
        cVar2 = pcVar8[lVar7];
      }
      lVar7 = 0;
      while ((cVar2 != '\0' && (cVar2 != ';'))) {
        lVar3 = lVar7 + lVar9;
        lVar7 = lVar7 + 1;
        cVar2 = pcVar8[lVar3 + 1];
      }
      iVar4 = func_0x0077e76c(pcVar8,"AUTH=+LOGIN",0xb);
      if (iVar4 == 0) {
        iVar5 = func_0x0077e76c(pcVar8,"AUTH=",5);
        if (iVar5 == 0) {
          iVar5 = 3;
          goto code_r0x0075c004;
        }
        iVar5 = func_0x0073b7d8(unaff_x21 + 0x488,pcVar8 + lVar9 + 1,lVar7 + -1);
        if (iVar5 != 0) goto code_r0x0075c004;
      }
      else {
        *(undefined2 *)(unaff_x21 + 0x4a2) = 0;
      }
      if (pcVar8[lVar7 + lVar9] == ';') {
        pcVar8 = pcVar8 + 1;
      }
      pcVar8 = pcVar8 + lVar9 + lVar7;
      cVar2 = *pcVar8;
      if (cVar2 == '\0') break;
      lVar9 = 0;
    }
    if (iVar4 != 0) {
      *(undefined1 *)(unaff_x21 + 0x4e1) = 1;
      goto code_r0x0075c028;
    }
  }
  iVar5 = 0;
code_r0x0075c004:
  uVar6 = 2;
  if (*(short *)(unaff_x21 + 0x4a2) == -0x21) {
    uVar6 = 3;
  }
  uVar1 = 0;
  if (*(short *)(unaff_x21 + 0x4a2) != 0) {
    uVar1 = uVar6;
  }
  *(undefined1 *)(unaff_x21 + 0x4e1) = uVar1;
  if (iVar5 != 0) {
    return;
  }
code_r0x0075c028:
  *(undefined4 *)(*(long *)(unaff_x20 + 0x18) + 0x4d8) = 1;
  *(undefined2 *)(unaff_x21 + 0x4dc) = 0x2a;
  lVar9 = *(long *)(unaff_x20 + 0x18);
  func_0x0076dfc0();
  *(bool *)unaff_x24 = *(int *)(lVar9 + 0x4d8) == 0;
  return;
}

