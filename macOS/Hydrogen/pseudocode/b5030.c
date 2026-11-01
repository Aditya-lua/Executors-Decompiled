
int FUN_000b5030(undefined8 *param_1)

{
  long lVar1;
  bool in_CY;
  undefined1 *puVar2;
  int in_w6;
  undefined1 *puVar3;
  ulong uVar4;
  undefined8 *in_x9;
  ulong in_x10;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 *in_x15;
  undefined8 *unaff_x19;
  undefined1 *puVar9;
  undefined1 *puVar10;
  int iVar11;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long lVar12;
  char *unaff_x27;
  long unaff_x29;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  long in_stack_00000080;
  long in_stack_000000a0;
  int *in_stack_000000f0;
  undefined2 in_stack_00000118;
  int in_stack_00000160;
  undefined8 in_stack_00000168;
  
  if ((in_CY) &&
     (param_1 = in_x15, in_x9 = unaff_x21, 0x3f < (ulong)((long)unaff_x21 - (long)in_x15))) {
    uVar4 = (in_x10 >> 3) + 1;
    uVar5 = uVar4 & 0x3ffffffffffffff8;
    puVar6 = in_x15 + 4;
    puVar7 = unaff_x21 + 4;
    uVar8 = uVar5;
    do {
      uVar13 = puVar6[-4];
      uVar15 = puVar6[-1];
      uVar14 = puVar6[-2];
      uVar17 = puVar6[1];
      uVar16 = *puVar6;
      uVar19 = puVar6[3];
      uVar18 = puVar6[2];
      puVar7[-3] = puVar6[-3];
      puVar7[-4] = uVar13;
      puVar7[-1] = uVar15;
      puVar7[-2] = uVar14;
      puVar7[1] = uVar17;
      *puVar7 = uVar16;
      puVar7[3] = uVar19;
      puVar7[2] = uVar18;
      uVar8 = uVar8 - 8;
      puVar6 = puVar6 + 8;
      puVar7 = puVar7 + 8;
    } while (uVar8 != 0);
    param_1 = in_x15 + uVar5;
    in_x9 = unaff_x21 + uVar5;
    if (uVar4 != uVar5) goto LAB_000b508c;
  }
  else {
LAB_000b508c:
    do {
      puVar6 = in_x9 + 1;
      *in_x9 = *param_1;
      param_1 = param_1 + 1;
      in_x9 = puVar6;
    } while (puVar6 < unaff_x19);
  }
  puVar9 = (undefined1 *)((long)unaff_x19 + 2);
  *(undefined2 *)unaff_x19 = in_stack_00000118;
  if (unaff_x22 - 4U < 0xf) {
    *unaff_x27 = *unaff_x27 + (char)(unaff_x22 - 4U);
  }
  else {
    *unaff_x27 = *unaff_x27 + '\x0f';
    uVar4 = unaff_x22 - 0x13;
    if (0x1fd < uVar4) {
      lVar12 = ((unaff_x22 - 0x211U) / 0x1fe) * 2;
      _memset(puVar9,0xff,lVar12 + 2);
      puVar9 = (undefined1 *)((long)unaff_x21 + ((lVar12 + unaff_x20) - (long)in_x15) + 4);
      uVar4 = (unaff_x22 - 0x211U) % 0x1fe;
      in_w6 = in_stack_00000168._4_4_;
    }
    puVar10 = puVar9;
    if (0xfe < uVar4) {
      puVar10 = puVar9 + 1;
      *puVar9 = 0xff;
      uVar4 = uVar4 - 0xff;
    }
    puVar9 = puVar10 + 1;
    *puVar10 = (char)uVar4;
  }
  lVar12 = unaff_x20 + unaff_x22;
  puVar10 = (undefined1 *)(in_stack_00000080 - lVar12);
  lVar1 = 5;
  if (in_w6 != 2) {
    lVar1 = 0;
  }
  if ((in_w6 != 0) &&
     (puVar3 = (undefined1 *)(in_stack_000000a0 + lVar1),
     puVar3 < puVar9 + (long)(puVar10 + (ulong)(puVar10 + 0xf0) / 0xff + 1))) {
    if (in_w6 == 1) {
      iVar11 = 0;
      goto code_r0x000b4c80;
    }
    puVar10 = puVar3 + (~(ulong)puVar9 - ((ulong)(puVar3 + ~(ulong)puVar9 + 0xf1) >> 8));
  }
  iVar11 = (int)puVar10;
  puVar3 = puVar10 + -0xf;
  if (puVar10 < (undefined1 *)0xf) {
    *puVar9 = (char)(iVar11 << 4);
  }
  else {
    puVar2 = puVar9 + 1;
    *puVar9 = 0xf0;
    if ((undefined1 *)0xfe < puVar3) {
      uVar4 = (ulong)(puVar10 + -0x10e) / 0xff;
      _memset(puVar2,0xff,uVar4 + 1);
      puVar3 = (undefined1 *)((ulong)(puVar10 + -0x10e) % 0xff);
      puVar2 = puVar9 + uVar4 + 2;
    }
    *puVar2 = (char)puVar3;
    puVar9 = puVar2;
  }
  _memcpy(puVar9 + 1,lVar12,puVar10);
  *in_stack_000000f0 = ((int)lVar12 + iVar11) - in_stack_00000160;
  iVar11 = ((int)(puVar9 + 1) + iVar11) - (int)*(undefined8 *)(unaff_x29 + -0x100);
  if (0 < iVar11) {
    return iVar11;
  }
code_r0x000b4c80:
  *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
  return iVar11;
}

