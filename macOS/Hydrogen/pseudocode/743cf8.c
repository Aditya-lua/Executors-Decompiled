
undefined8 thunk_FUN_00743db4(void)

{
  char *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  char *pcVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long *unaff_x19;
  long *unaff_x20;
  long *plVar11;
  undefined8 uVar12;
  long unaff_x23;
  long lVar13;
  long lVar14;
  ulong unaff_x26;
  long lVar15;
  long lVar16;
  long *in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000030;
  char *in_stack_00000038;
  
FUN_00743db4:
  lVar13 = unaff_x20[2];
  if (((unaff_x26 & 0x6b) == 0) && (lVar13 != 0)) {
    lVar8 = unaff_x20[3];
    if (lVar8 == 0) {
      lVar8 = _strlen(lVar13);
      lVar8 = lVar8 + 1;
    }
    lVar13 = func_0x0077e8e4(lVar13,lVar8);
    unaff_x20[2] = lVar13;
    if (lVar13 == 0) {
LAB_00743fe8:
      uVar12 = 1;
LAB_00744000:
      do {
        if ((char)unaff_x20[0xc] != '\0') {
          (*pcRam0000000000a2b5f0)(*unaff_x20);
          *unaff_x20 = 0;
          *(undefined1 *)(unaff_x20 + 0xc) = 0;
        }
        if (*(char *)((long)unaff_x20 + 0x61) != '\0') {
          (*pcRam0000000000a2b5f0)(unaff_x20[2]);
          unaff_x20[2] = 0;
          *(undefined1 *)((long)unaff_x20 + 0x61) = 0;
        }
        if (*(char *)((long)unaff_x20 + 0x62) != '\0') {
          (*pcRam0000000000a2b5f0)(unaff_x20[4]);
          unaff_x20[4] = 0;
          *(undefined1 *)((long)unaff_x20 + 0x62) = 0;
        }
        if (*(char *)((long)unaff_x20 + 99) != '\0') {
          (*pcRam0000000000a2b5f0)(unaff_x20[8]);
          unaff_x20[8] = 0;
          *(undefined1 *)((long)unaff_x20 + 99) = 0;
        }
        unaff_x20 = (long *)unaff_x20[0xb];
joined_r0x00743eec:
      } while (unaff_x20 != (long *)0x0);
LAB_00743ef8:
      do {
        plVar11 = (long *)unaff_x19[0xb];
        (*pcRam0000000000a2b5f0)(unaff_x19);
        unaff_x19 = plVar11;
      } while (plVar11 != (long *)0x0);
      return uVar12;
    }
    *(undefined1 *)((long)unaff_x20 + 0x61) = 1;
    unaff_x23 = *unaff_x20;
    unaff_x26 = unaff_x20[5];
  }
  lVar14 = unaff_x20[1];
  lVar8 = unaff_x20[6];
  lVar3 = unaff_x20[7];
  lVar2 = unaff_x20[3];
  lVar4 = unaff_x20[4];
  lVar10 = unaff_x20[10];
  lVar16 = unaff_x20[9];
  lVar15 = unaff_x20[8];
  if ((unaff_x23 != 0) && (lVar14 == 0)) {
    lVar14 = _strlen(unaff_x23);
  }
  uVar12 = 1;
  if ((lVar3 < 0) || (lVar14 < 0)) goto LAB_00744000;
  uVar12 = 1;
  lVar7 = (*pcRam0000000000a2b608)(1,0x70);
  if (lVar7 == 0) goto LAB_00744000;
  *(long *)(lVar7 + 8) = unaff_x23;
  *(long *)(lVar7 + 0x10) = lVar14;
  *(long *)(lVar7 + 0x18) = lVar13;
  *(long *)(lVar7 + 0x68) = lVar2;
  *(long *)(lVar7 + 0x28) = lVar8;
  *(long *)(lVar7 + 0x30) = lVar3;
  *(long *)(lVar7 + 0x38) = lVar4;
  *(long *)(lVar7 + 0x40) = lVar10;
  *(long *)(lVar7 + 0x60) = lVar16;
  *(long *)(lVar7 + 0x58) = lVar15;
  *(ulong *)(lVar7 + 0x50) = unaff_x26 | 0x80;
  if (in_stack_00000030 == 0) {
    plVar11 = in_stack_00000000;
    if ((long *)*in_stack_00000008 != (long *)0x0) {
      plVar11 = (long *)*in_stack_00000008;
    }
    *plVar11 = lVar7;
    plVar11 = in_stack_00000008;
  }
  else {
    *(long *)(lVar7 + 0x48) = *(long *)(in_stack_00000030 + 0x48);
    plVar11 = (long *)(in_stack_00000030 + 0x48);
  }
  uVar12 = 0;
  *plVar11 = lVar7;
  if ((char *)unaff_x20[4] != (char *)0x0) {
    in_stack_00000038 = (char *)unaff_x20[4];
  }
  unaff_x20 = (long *)unaff_x20[0xb];
  if (unaff_x20 == (long *)0x0) goto LAB_00743ef8;
  unaff_x23 = *unaff_x20;
  if (unaff_x23 == 0) {
    if (lVar7 == 0) goto code_r0x00743fd8;
  }
  else if (lVar7 == 0 && unaff_x20[2] == 0) {
code_r0x00743fd8:
    uVar12 = 5;
    goto LAB_00744000;
  }
  uVar9 = unaff_x20[5];
  uVar12 = 5;
  if ((((uint)(unaff_x20[3] != 0) & (uint)uVar9) != 0) || ((uVar9 & 9) == 9)) goto LAB_00744000;
  uVar5 = ~(uint)uVar9;
  uVar12 = 5;
  if (((uVar5 & 10) == 0) || ((uVar5 & 0x30) == 0 && unaff_x20[6] == 0)) goto LAB_00744000;
  in_stack_00000030 = lVar7;
  if (((uVar9 & 0x11) == 0) || (unaff_x20[4] != 0)) {
    if (unaff_x23 != 0) goto code_r0x00743cc8;
code_r0x00743d58:
    unaff_x26 = unaff_x20[5];
    if ((unaff_x20 == unaff_x19) && (((uint)unaff_x26 >> 2 & 1) == 0)) {
      unaff_x23 = 0;
      lVar13 = *unaff_x19;
code_r0x00743da4:
      if (lVar13 == 0) goto LAB_00743fe8;
      *(undefined1 *)(unaff_x20 + 0xc) = 1;
      unaff_x26 = unaff_x20[5];
    }
    goto FUN_00743db4;
  }
  lVar13 = 0x10;
  if ((uVar9 & 0x10) != 0) {
    lVar13 = 0x40;
  }
  pcVar6 = (char *)func_0x00760ea4(*(undefined8 *)((long)unaff_x20 + lVar13));
  pcVar1 = in_stack_00000038;
  if (pcVar6 != (char *)0x0) {
    pcVar1 = pcVar6;
  }
  pcVar6 = "application/octet-stream";
  if (pcVar1 != (char *)0x0) {
    pcVar6 = pcVar1;
  }
  lVar13 = (*pcRam0000000000a2b600)(pcVar6);
  unaff_x20[4] = lVar13;
  if (lVar13 == 0) goto LAB_00743fe8;
  *(undefined1 *)((long)unaff_x20 + 0x62) = 1;
  unaff_x23 = *unaff_x20;
  if (unaff_x23 == 0) goto code_r0x00743d58;
code_r0x00743cc8:
  lVar13 = unaff_x20[1];
  if (lVar13 == 0) {
    unaff_x26 = unaff_x20[5];
    if ((unaff_x20 != unaff_x19) || (((uint)unaff_x26 >> 2 & 1) != 0)) goto FUN_00743db4;
    lVar13 = _strlen(unaff_x23);
  }
  else {
    lVar8 = 0;
    do {
      if (*(char *)(unaff_x23 + lVar8) == '\0') {
        uVar12 = 3;
        goto joined_r0x00743eec;
      }
      lVar8 = lVar8 + 1;
    } while (lVar13 != lVar8);
    unaff_x26 = unaff_x20[5];
    if ((unaff_x20 != unaff_x19) || (((uint)unaff_x26 >> 2 & 1) != 0)) goto FUN_00743db4;
  }
  lVar13 = func_0x0077e93c(unaff_x23,lVar13);
  *unaff_x20 = lVar13;
  unaff_x23 = lVar13;
  goto code_r0x00743da4;
}

