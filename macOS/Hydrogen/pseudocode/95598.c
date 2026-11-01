
undefined8 FUN_00095598(long param_1,long param_2)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  long *unaff_x19;
  uint uVar4;
  uint *unaff_x20;
  uint uVar5;
  long *unaff_x21;
  uint uVar6;
  undefined8 unaff_x22;
  
  *unaff_x21 = param_1 + 1;
  if (param_2 == 0) {
    lVar1 = _malloc((param_1 + 1) * 0x10);
    unaff_x21[1] = lVar1;
  }
  else {
    lVar1 = _realloc();
    unaff_x21[1] = lVar1;
  }
  if (lVar1 == 0) {
    *unaff_x21 = 0;
    return 0x100;
  }
  lVar1 = lVar1 + *unaff_x21 * 0x10;
  *(undefined4 *)(lVar1 + -0x10) = 0;
  *(undefined8 *)(lVar1 + -8) = unaff_x22;
  if (unaff_x20[2] - 1 < 8) {
    uVar5 = *(uint *)(&UNK_0080be6c + (long)(int)(unaff_x20[2] - 1) * 4);
    uVar6 = *unaff_x20;
    uVar3 = *(uint *)(unaff_x19 + 1);
    uVar4 = *(uint *)((long)unaff_x19 + 0xc);
    uVar2 = uVar3 + 4;
    if (uVar4 < uVar2) {
LAB_00095638:
      do {
        uVar4 = uVar4 << 1;
      } while (uVar4 < uVar2);
      lVar1 = _realloc(*unaff_x19,uVar4);
      *unaff_x19 = lVar1;
      if (lVar1 == 0) {
        *(undefined4 *)(unaff_x19 + 1) = 0;
        return 0x100;
      }
      *(uint *)((long)unaff_x19 + 0xc) = uVar4;
      uVar3 = *(uint *)(unaff_x19 + 1);
      goto LAB_0009566c;
    }
  }
  else {
    uVar5 = 0x18000000;
    uVar6 = *unaff_x20;
    uVar3 = *(uint *)(unaff_x19 + 1);
    uVar4 = *(uint *)((long)unaff_x19 + 0xc);
    uVar2 = uVar3 + 4;
    if (uVar4 < uVar2) goto LAB_00095638;
  }
  lVar1 = *unaff_x19;
LAB_0009566c:
  *(uint *)(lVar1 + (ulong)uVar3) = uVar6 | uVar5;
  *(int *)(unaff_x19 + 1) = (int)unaff_x19[1] + 4;
  return 0;
}

