
undefined8 FUN_0076edf0(void)

{
  undefined1 uVar1;
  byte bVar2;
  char cVar3;
  long lVar4;
  int iVar5;
  undefined8 uVar6;
  uint in_w8;
  undefined1 uVar7;
  long lVar8;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x23;
  long lVar9;
  undefined8 in_stack_00000008;
  
  lVar8 = 0;
  if (in_w8 != 0) goto LAB_0076ee30;
  do {
    lVar9 = 0;
    if (in_w8 != 0) {
      do {
        if (in_w8 == 0x3b) break;
        lVar4 = lVar9 + lVar8;
        in_w8 = (uint)unaff_x23[lVar4 + 1];
        lVar9 = lVar9 + 1;
      } while (unaff_x23[lVar4 + 1] != 0);
    }
    iVar5 = func_0x0077e76c(unaff_x23);
    if (iVar5 == 0) {
      uVar6 = 3;
      cVar3 = *(char *)(unaff_x21 + 0x4c9);
      goto joined_r0x0076ef74;
    }
    uVar6 = func_0x0073b7d8();
    if ((int)uVar6 != 0) {
      iVar5 = func_0x0077e76c(unaff_x23 + lVar8 + 1,"+APOP",lVar9 + -1);
      if (iVar5 == 0) goto LAB_0076ef50;
      *(undefined1 *)(unaff_x21 + 0x4c9) = 2;
      *(undefined2 *)(unaff_x21 + 0x4ba) = 0;
    }
    if (unaff_x23[lVar9 + lVar8] == 0x3b) {
      unaff_x23 = unaff_x23 + 1;
    }
    unaff_x23 = unaff_x23 + lVar8 + lVar9;
    bVar2 = *unaff_x23;
    if (bVar2 == 0) {
      uVar6 = 0;
LAB_0076ef50:
      cVar3 = *(char *)(unaff_x21 + 0x4c9);
joined_r0x0076ef74:
      if (cVar3 != '\x02') {
        uVar7 = 7;
        if (*(short *)(unaff_x21 + 0x4ba) != -0x21) {
          uVar7 = 4;
        }
        uVar1 = 0;
        if (*(short *)(unaff_x21 + 0x4ba) != 0) {
          uVar1 = uVar7;
        }
        *(undefined1 *)(unaff_x21 + 0x4c9) = uVar1;
      }
      if ((int)uVar6 == 0) {
        lVar8 = *(long *)(unaff_x20 + 0x18);
        *(undefined4 *)(lVar8 + 0x488) = 1;
        uVar6 = func_0x0076dfc0();
        *(bool *)in_stack_00000008 = *(int *)(lVar8 + 0x488) == 0;
      }
      return uVar6;
    }
    lVar8 = 0;
    while (in_w8 = (uint)bVar2, bVar2 != 0) {
LAB_0076ee30:
      if (in_w8 == 0x3d) break;
      lVar9 = lVar8 + 1;
      lVar8 = lVar8 + 1;
      bVar2 = unaff_x23[lVar9];
    }
  } while( true );
}

