
char * FUN_00072f6c(void)

{
  undefined1 in_ZR;
  undefined8 *puVar1;
  char *pcVar2;
  char *pcVar3;
  long lVar4;
  undefined8 uVar5;
  char *unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  long unaff_x24;
  char *unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000008;
  
  do {
    pcVar2 = unaff_x21;
    if ((bool)in_ZR) goto LAB_00072e94;
    pcVar3 = (char *)func_0x00073bc4();
    do {
      unaff_x21 = pcVar3;
      if (unaff_x21 == pcVar2) {
LAB_00072e94:
        if (pcVar2 == unaff_x25) {
          puVar1 = (undefined8 *)__Znwm(0x10);
          lVar4 = *(long *)(unaff_x20 + 0x38);
          uVar5 = *(undefined8 *)(lVar4 + 8);
          *puVar1 = in_stack_00000008;
          puVar1[1] = uVar5;
          *(undefined8 **)(lVar4 + 8) = puVar1;
          *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
        }
        puVar1 = (undefined8 *)__Znwm(0x18);
        uVar5 = *(undefined8 *)(unaff_x28 + 8);
        puVar1[1] = *(undefined8 *)(unaff_x24 + 8);
        puVar1[2] = uVar5;
        *puVar1 = unaff_x26;
        *(undefined8 **)(unaff_x24 + 8) = puVar1;
        *(undefined8 *)(unaff_x28 + 8) = 0;
        puVar1 = (undefined8 *)__Znwm(0x10);
        uVar5 = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
        *puVar1 = &UNK_009b2fd8;
        puVar1[1] = uVar5;
        *(undefined8 **)(unaff_x28 + 8) = puVar1;
        *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
        puVar1 = (undefined8 *)__Znwm(0x10);
        uVar5 = *(undefined8 *)(unaff_x28 + 8);
        *puVar1 = unaff_x27;
        puVar1[1] = uVar5;
        *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar1;
        *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(unaff_x28 + 8);
        if (pcVar2 == unaff_x19) {
          return unaff_x19;
        }
        if (*pcVar2 != '|') {
          return pcVar2;
        }
        unaff_x28 = *(long *)(unaff_x20 + 0x38);
        unaff_x21 = pcVar2 + 1;
        unaff_x25 = unaff_x21;
      }
      pcVar3 = (char *)func_0x00073638();
      pcVar2 = unaff_x21;
    } while (unaff_x21 != pcVar3);
    pcVar2 = (char *)func_0x0007395c();
    in_ZR = unaff_x21 == pcVar2;
  } while( true );
}

