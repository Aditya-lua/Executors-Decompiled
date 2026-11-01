
int FUN_000b4d90(ulong param_1,undefined8 *param_2)

{
  long lVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  char *in_x12;
  undefined8 *in_x13;
  undefined8 *puVar9;
  ulong uVar10;
  int in_w15;
  undefined8 *unaff_x19;
  int iVar11;
  long unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long lVar12;
  undefined2 unaff_w25;
  long unaff_x27;
  long unaff_x29;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  long in_stack_00000070;
  int *in_stack_000000f0;
  int in_stack_00000160;
  undefined8 in_stack_00000168;
  
  if ((param_1 < 0x38) || ((ulong)((long)unaff_x19 - (long)in_x13) < 0x40)) {
    puVar7 = unaff_x19;
LAB_000b4dfc:
    do {
      puVar9 = puVar7 + 1;
      *puVar7 = *in_x13;
      in_x13 = in_x13 + 1;
      puVar7 = puVar9;
    } while (puVar9 < param_2);
  }
  else {
    uVar6 = (param_1 >> 3) + 1;
    uVar8 = uVar6 & 0x3ffffffffffffff8;
    puVar7 = in_x13 + 4;
    puVar9 = unaff_x19 + 4;
    uVar10 = uVar8;
    do {
      uVar13 = puVar7[-4];
      uVar15 = puVar7[-1];
      uVar14 = puVar7[-2];
      uVar17 = puVar7[1];
      uVar16 = *puVar7;
      uVar19 = puVar7[3];
      uVar18 = puVar7[2];
      puVar9[-3] = puVar7[-3];
      puVar9[-4] = uVar13;
      puVar9[-1] = uVar15;
      puVar9[-2] = uVar14;
      puVar9[1] = uVar17;
      *puVar9 = uVar16;
      puVar9[3] = uVar19;
      puVar9[2] = uVar18;
      uVar10 = uVar10 - 8;
      puVar7 = puVar7 + 8;
      puVar9 = puVar9 + 8;
    } while (uVar10 != 0);
    in_x13 = in_x13 + uVar8;
    puVar7 = unaff_x19 + uVar8;
    if (uVar6 != uVar8) goto LAB_000b4dfc;
  }
  puVar3 = (undefined1 *)((long)param_2 + 2);
  *(undefined2 *)param_2 = unaff_w25;
  if (unaff_x20 - 4U < 0xf) {
    *in_x12 = *in_x12 + (char)(unaff_x20 - 4U);
  }
  else {
    *in_x12 = *in_x12 + '\x0f';
    uVar6 = unaff_x20 - 0x13;
    if (0x1fd < uVar6) {
      lVar12 = ((unaff_x20 - 0x211U) / 0x1fe) * 2;
      _memset(puVar3,0xff,lVar12 + 2);
      puVar3 = (undefined1 *)((long)unaff_x19 + lVar12 + unaff_x23 + 4);
      uVar6 = (unaff_x20 - 0x211U) % 0x1fe;
      in_w15 = in_stack_00000168._4_4_;
    }
    puVar4 = puVar3;
    if (0xfe < uVar6) {
      puVar4 = puVar3 + 1;
      *puVar3 = 0xff;
      uVar6 = uVar6 - 0xff;
    }
    puVar3 = puVar4 + 1;
    *puVar4 = (char)uVar6;
  }
  lVar12 = unaff_x24 + unaff_x20;
  puVar4 = (undefined1 *)(in_stack_00000070 - lVar12);
  lVar1 = 5;
  if (in_w15 != 2) {
    lVar1 = 0;
  }
  if ((in_w15 != 0) &&
     (puVar5 = (undefined1 *)(unaff_x27 + lVar1),
     puVar5 < puVar3 + (long)(puVar4 + (ulong)(puVar4 + 0xf0) / 0xff + 1))) {
    if (in_w15 == 1) {
      iVar11 = 0;
      _free(*(undefined8 *)(unaff_x29 + -0xa0));
      goto code_r0x000b4c80;
    }
    puVar4 = puVar5 + (~(ulong)puVar3 - ((ulong)(puVar5 + ~(ulong)puVar3 + 0xf1) >> 8));
  }
  iVar11 = (int)puVar4;
  puVar5 = puVar4 + -0xf;
  if (puVar4 < (undefined1 *)0xf) {
    *puVar3 = (char)(iVar11 << 4);
  }
  else {
    puVar2 = puVar3 + 1;
    *puVar3 = 0xf0;
    if ((undefined1 *)0xfe < puVar5) {
      uVar6 = (ulong)(puVar4 + -0x10e) / 0xff;
      _memset(puVar2,0xff,uVar6 + 1);
      puVar5 = (undefined1 *)((ulong)(puVar4 + -0x10e) % 0xff);
      puVar2 = puVar3 + uVar6 + 2;
    }
    *puVar2 = (char)puVar5;
    puVar3 = puVar2;
  }
  _memcpy(puVar3 + 1,lVar12,puVar4);
  *in_stack_000000f0 = ((int)lVar12 + iVar11) - in_stack_00000160;
  iVar11 = ((int)(puVar3 + 1) + iVar11) - (int)*(undefined8 *)(unaff_x29 + -0x100);
  _free(*(undefined8 *)(unaff_x29 + -0xa0));
  if (0 < iVar11) {
    return iVar11;
  }
code_r0x000b4c80:
  *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
  return iVar11;
}

