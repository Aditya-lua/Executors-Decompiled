
char * FUN_00072e20(void)

{
  char *pcVar1;
  bool in_ZR;
  undefined8 *puVar2;
  char *pcVar3;
  long lVar4;
  undefined8 uVar5;
  char *unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  long unaff_x24;
  long lVar6;
  
  if (in_ZR) {
    puVar2 = (undefined8 *)__Znwm(0x10);
    lVar6 = *(long *)(unaff_x20 + 0x38);
    uVar5 = *(undefined8 *)(lVar6 + 8);
    *puVar2 = &UNK_009b2fd8;
    puVar2[1] = uVar5;
    *(undefined8 **)(lVar6 + 8) = puVar2;
    *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
  }
  do {
    if (unaff_x21 == unaff_x19) {
      return unaff_x19;
    }
    if (*unaff_x21 != '|') {
      return unaff_x21;
    }
    lVar6 = *(long *)(unaff_x20 + 0x38);
    pcVar1 = unaff_x21 + 1;
    pcVar3 = pcVar1;
    do {
      unaff_x21 = pcVar3;
      pcVar3 = (char *)func_0x00073638();
      if (unaff_x21 == pcVar3) {
        pcVar3 = (char *)func_0x0007395c();
        if (unaff_x21 == pcVar3) break;
        pcVar3 = (char *)func_0x00073bc4();
      }
    } while (pcVar3 != unaff_x21);
    if (unaff_x21 == pcVar1) {
      puVar2 = (undefined8 *)__Znwm(0x10);
      lVar4 = *(long *)(unaff_x20 + 0x38);
      uVar5 = *(undefined8 *)(lVar4 + 8);
      *puVar2 = &UNK_009b2fd8;
      puVar2[1] = uVar5;
      *(undefined8 **)(lVar4 + 8) = puVar2;
      *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
    }
    puVar2 = (undefined8 *)__Znwm(0x18);
    uVar5 = *(undefined8 *)(lVar6 + 8);
    puVar2[1] = *(undefined8 *)(unaff_x24 + 8);
    puVar2[2] = uVar5;
    *puVar2 = &UNK_009b3548;
    *(undefined8 **)(unaff_x24 + 8) = puVar2;
    *(undefined8 *)(lVar6 + 8) = 0;
    puVar2 = (undefined8 *)__Znwm(0x10);
    uVar5 = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
    *puVar2 = &UNK_009b2fd8;
    puVar2[1] = uVar5;
    *(undefined8 **)(lVar6 + 8) = puVar2;
    *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
    puVar2 = (undefined8 *)__Znwm(0x10);
    uVar5 = *(undefined8 *)(lVar6 + 8);
    *puVar2 = &UNK_009b3590;
    puVar2[1] = uVar5;
    *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar2;
    *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(lVar6 + 8);
  } while( true );
}

