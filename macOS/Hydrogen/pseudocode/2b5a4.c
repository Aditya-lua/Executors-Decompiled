
char * FUN_0002b5a4(void)

{
  undefined1 in_ZR;
  char *pcVar1;
  undefined8 *puVar2;
  char *pcVar3;
  char *pcVar4;
  undefined8 uVar5;
  char *unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  char *pcVar6;
  long unaff_x23;
  long lVar7;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  long lVar8;
  undefined8 unaff_x26;
  long lVar9;
  undefined1 auVar10 [16];
  
  while( true ) {
    if ((bool)in_ZR) {
      return unaff_x19;
    }
    if (*unaff_x21 != '|') {
      return unaff_x21;
    }
    lVar9 = *(long *)(unaff_x20 + 0x38);
    pcVar6 = unaff_x21 + 1;
    pcVar4 = unaff_x19;
    pcVar1 = (char *)func_0x00034144();
    if (pcVar1 == pcVar6) break;
    do {
      unaff_x21 = pcVar1;
      pcVar4 = unaff_x19;
      pcVar1 = (char *)func_0x00034144();
    } while (pcVar1 != unaff_x21);
    if (unaff_x21 == pcVar6) break;
    puVar2 = (undefined8 *)__Znwm(0x18);
    uVar5 = *(undefined8 *)(lVar9 + 8);
    puVar2[1] = *(undefined8 *)(unaff_x23 + 8);
    puVar2[2] = uVar5;
    *puVar2 = unaff_x24;
    *(undefined8 **)(unaff_x23 + 8) = puVar2;
    *(undefined8 *)(lVar9 + 8) = 0;
    puVar2 = (undefined8 *)__Znwm(0x10);
    uVar5 = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
    *puVar2 = unaff_x25;
    puVar2[1] = uVar5;
    *(undefined8 **)(lVar9 + 8) = puVar2;
    *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
    puVar2 = (undefined8 *)__Znwm(0x10);
    uVar5 = *(undefined8 *)(lVar9 + 8);
    *puVar2 = unaff_x26;
    puVar2[1] = uVar5;
    *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar2;
    *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(lVar9 + 8);
    in_ZR = unaff_x21 == unaff_x19;
  }
  auVar10 = func_0x000339f8();
  pcVar3 = auVar10._8_8_;
  lVar9 = auVar10._0_8_;
  lVar7 = *(long *)(lVar9 + 0x38);
  pcVar1 = (char *)_memchr(pcVar3,10,(long)pcVar4 - (long)pcVar3);
  pcVar6 = pcVar4;
  if (pcVar1 != (char *)0x0) {
    pcVar6 = pcVar1;
  }
  if (pcVar6 == pcVar3) {
    puVar2 = (undefined8 *)__Znwm(0x10);
    uVar5 = *(undefined8 *)(lVar7 + 8);
    *puVar2 = &UNK_009b2fd8;
    puVar2[1] = uVar5;
    *(undefined8 **)(lVar7 + 8) = puVar2;
    *(undefined8 *)(lVar9 + 0x38) = *(undefined8 *)(*(long *)(lVar9 + 0x38) + 8);
    if (pcVar6 != pcVar4) {
      pcVar6 = pcVar6 + 1;
    }
  }
  else {
    func_0x0002b2f0(lVar9,pcVar3,pcVar6);
    if (pcVar6 != pcVar4) {
      pcVar6 = pcVar6 + 1;
    }
  }
  if (pcVar6 != pcVar4) {
    lVar8 = *(long *)(lVar9 + 0x38);
    do {
      pcVar3 = (char *)_memchr(pcVar6,10,(long)pcVar4 - (long)pcVar6);
      pcVar1 = pcVar4;
      if (pcVar3 != (char *)0x0) {
        pcVar1 = pcVar3;
      }
      if (pcVar1 == pcVar6) {
        puVar2 = (undefined8 *)__Znwm(0x10);
        uVar5 = *(undefined8 *)(lVar8 + 8);
        *puVar2 = &UNK_009b2fd8;
        puVar2[1] = uVar5;
        *(undefined8 **)(lVar8 + 8) = puVar2;
        *(undefined8 *)(lVar9 + 0x38) = *(undefined8 *)(*(long *)(lVar9 + 0x38) + 8);
      }
      else {
        func_0x0002b2f0(lVar9,pcVar6,pcVar1);
      }
      puVar2 = (undefined8 *)__Znwm(0x18);
      uVar5 = *(undefined8 *)(lVar8 + 8);
      puVar2[1] = *(undefined8 *)(lVar7 + 8);
      puVar2[2] = uVar5;
      *puVar2 = &UNK_009b3548;
      *(undefined8 **)(lVar7 + 8) = puVar2;
      *(undefined8 *)(lVar8 + 8) = 0;
      puVar2 = (undefined8 *)__Znwm(0x10);
      uVar5 = *(undefined8 *)(*(long *)(lVar9 + 0x38) + 8);
      *puVar2 = &UNK_009b2fd8;
      puVar2[1] = uVar5;
      *(undefined8 **)(lVar8 + 8) = puVar2;
      *(undefined8 *)(*(long *)(lVar9 + 0x38) + 8) = 0;
      puVar2 = (undefined8 *)__Znwm(0x10);
      uVar5 = *(undefined8 *)(lVar8 + 8);
      *puVar2 = &UNK_009b3590;
      puVar2[1] = uVar5;
      *(undefined8 **)(*(long *)(lVar9 + 0x38) + 8) = puVar2;
      lVar8 = *(long *)(lVar8 + 8);
      *(long *)(lVar9 + 0x38) = lVar8;
      if (pcVar1 != pcVar4) {
        pcVar1 = pcVar1 + 1;
      }
      pcVar6 = pcVar1;
    } while (pcVar1 != pcVar4);
  }
  return pcVar4;
}

