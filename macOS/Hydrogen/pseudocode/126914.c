
bool FUN_00126914(void)

{
  undefined8 *puVar1;
  int iVar2;
  uint uVar3;
  undefined8 uVar4;
  int iVar5;
  uint uVar6;
  undefined4 uVar7;
  uint *unaff_x19;
  uint unaff_w21;
  long lVar8;
  int unaff_w23;
  long unaff_x24;
  long unaff_x25;
  int *unaff_x26;
  float fVar9;
  float fVar10;
  undefined8 *in_stack_00000008;
  undefined4 uStack0000000000000010;
  float fStack0000000000000014;
  undefined4 uStack0000000000000018;
  float fStack000000000000001c;
  
  iVar5 = *unaff_x26;
  if (iVar5 == unaff_x26[1]) {
    iVar2 = iVar5;
    if (iVar5 < 0) {
      iVar2 = iVar5 + 1;
    }
    uVar6 = 8;
    if (iVar5 != 0) {
      uVar6 = iVar5 + (iVar2 >> 1);
    }
    if ((int)uVar6 <= (int)(iVar5 + 1U)) {
      uVar6 = iVar5 + 1U;
    }
    lVar8 = func_0x000b810c(-(ulong)(uVar6 >> 0x1f) & 0xfffffff000000000 | (ulong)uVar6 << 4);
    if (*(long *)(&UNK_00004eb8 + unaff_x25) != 0) {
      _memcpy(lVar8,*(long *)(&UNK_00004eb8 + unaff_x25),(long)*unaff_x26 << 4);
      func_0x000b83d4(*(undefined8 *)(&UNK_00004eb8 + unaff_x25));
    }
    *(long *)(&UNK_00004eb8 + unaff_x25) = lVar8;
    unaff_x26[1] = uVar6;
    iVar5 = *unaff_x26;
  }
  else {
    lVar8 = *(long *)(&UNK_00004eb8 + unaff_x25);
  }
  puVar1 = (undefined8 *)(lVar8 + (long)iVar5 * 0x10);
  *puVar1 = unaff_x19;
  puVar1[1] = 0xffffffff;
  *unaff_x26 = *unaff_x26 + 1;
  *(uint **)(&UNK_00004e80 + unaff_x25) = unaff_x19;
  *(undefined8 *)(unaff_x19 + 0x22) = *(undefined8 *)(unaff_x24 + 0x110);
  uVar6 = unaff_x19[9];
  if (uVar6 == *(uint *)(&UNK_00003f58 + unaff_x25)) {
    fVar9 = (float)unaff_x19[0xe];
    fVar10 = (float)unaff_x19[0x1f];
    *(uint *)(unaff_x24 + 0x110) = unaff_x19[0xb];
    *(float *)(unaff_x24 + 0x114) = fVar9 + fVar10;
    *(char *)((long)unaff_x19 + 0x72) = *(char *)((long)unaff_x19 + 0x72) + '\x01';
  }
  else {
    if ((((unaff_w21 & 1) != (unaff_x19[4] & 1)) ||
        (((unaff_w21 & 1) == 0 && (*(char *)((long)unaff_x19 + 0x75) != '\0')))) && (1 < *unaff_x19)
       ) {
      _qsort(*(undefined8 *)(unaff_x19 + 2),(long)(int)*unaff_x19,0x2c,&DAT_00126b58);
      uVar6 = unaff_x19[9];
    }
    *(undefined1 *)((long)unaff_x19 + 0x75) = 0;
    uVar3 = unaff_w21 | 0x40;
    if ((unaff_w21 & 0xc0) != 0) {
      uVar3 = unaff_w21;
    }
    unaff_x19[4] = uVar3;
    uVar4 = *in_stack_00000008;
    *(undefined8 *)(unaff_x19 + 0xd) = in_stack_00000008[1];
    *(undefined8 *)(unaff_x19 + 0xb) = uVar4;
    *(undefined1 *)((long)unaff_x19 + 0x73) = 1;
    unaff_x19[10] = uVar6;
    unaff_x19[9] = *(uint *)(&UNK_00003f58 + unaff_x25);
    fVar10 = (float)unaff_x19[0xe];
    unaff_x19[0x10] = unaff_x19[0xf];
    unaff_x19[0xf] = 0;
    fVar9 = *(float *)(&UNK_00003938 + unaff_x25);
    unaff_x19[0x1f] = (uint)fVar9;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(&UNK_00003924 + unaff_x25);
    *(undefined4 *)((long)unaff_x19 + 0x76) = 0xffff0000;
    *(undefined1 *)((long)unaff_x19 + 0x72) = 1;
    *(uint *)(unaff_x24 + 0x110) = unaff_x19[0xb];
    *(float *)(unaff_x24 + 0x114) = fVar9 + fVar10;
    uVar7 = 0x25;
    if ((uVar3 & 0x200000) != 0) {
      uVar7 = 0x23;
    }
    uVar4 = func_0x000bba44(0x3f800000,uVar7);
    if (0.0 < *(float *)(&UNK_0000397c + unaff_x25)) {
      fStack0000000000000014 = (float)unaff_x19[0xe];
      fStack000000000000001c = fStack0000000000000014 - *(float *)(&UNK_0000397c + unaff_x25);
      uStack0000000000000018 = unaff_x19[0x19];
      uStack0000000000000010 = unaff_x19[0x1a];
      func_0x000f3bb0(0,*(undefined8 *)(unaff_x24 + 0x2a8),&uStack0000000000000018,
                      &uStack0000000000000010,uVar4,0);
    }
  }
  return unaff_w23 == 0;
}

