
void FUN_0075bfd4(void)

{
  undefined1 uVar1;
  char cVar2;
  int iVar3;
  undefined1 uVar4;
  long unaff_x19;
  long lVar5;
  long unaff_x20;
  long unaff_x21;
  char *unaff_x23;
  int unaff_w27;
  long unaff_x28;
  undefined8 in_stack_00000008;
  
  do {
    iVar3 = func_0x0073b7d8();
    if (iVar3 != 0) goto LAB_0075c004;
    while( true ) {
      if (unaff_x23[unaff_x19 + unaff_x28] == ';') {
        unaff_x23 = unaff_x23 + 1;
      }
      unaff_x23 = unaff_x23 + unaff_x28 + unaff_x19;
      cVar2 = *unaff_x23;
      if (cVar2 == '\0') {
        if (unaff_w27 == 0) {
          iVar3 = 0;
          goto LAB_0075c004;
        }
        *(undefined1 *)(unaff_x21 + 0x4e1) = 1;
        goto code_r0x0075c028;
      }
      unaff_x28 = 0;
      while ((cVar2 != '\0' && (cVar2 != '='))) {
        lVar5 = unaff_x28 + 1;
        unaff_x28 = unaff_x28 + 1;
        cVar2 = unaff_x23[lVar5];
      }
      unaff_x19 = 0;
      while ((cVar2 != '\0' && (cVar2 != ';'))) {
        lVar5 = unaff_x19 + unaff_x28;
        unaff_x19 = unaff_x19 + 1;
        cVar2 = unaff_x23[lVar5 + 1];
      }
      unaff_w27 = func_0x0077e76c(unaff_x23);
      if (unaff_w27 == 0) break;
      *(undefined2 *)(unaff_x21 + 0x4a2) = 0;
    }
    iVar3 = func_0x0077e76c(unaff_x23);
  } while (iVar3 != 0);
  iVar3 = 3;
LAB_0075c004:
  uVar4 = 2;
  if (*(short *)(unaff_x21 + 0x4a2) == -0x21) {
    uVar4 = 3;
  }
  uVar1 = 0;
  if (*(short *)(unaff_x21 + 0x4a2) != 0) {
    uVar1 = uVar4;
  }
  *(undefined1 *)(unaff_x21 + 0x4e1) = uVar1;
  if (iVar3 == 0) {
code_r0x0075c028:
    *(undefined4 *)(*(long *)(unaff_x20 + 0x18) + 0x4d8) = 1;
    *(undefined2 *)(unaff_x21 + 0x4dc) = 0x2a;
    lVar5 = *(long *)(unaff_x20 + 0x18);
    func_0x0076dfc0();
    *(bool *)in_stack_00000008 = *(int *)(lVar5 + 0x4d8) == 0;
  }
  return;
}

