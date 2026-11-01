
undefined8 FUN_000955cc(void)

{
  uint in_w8;
  uint uVar1;
  long lVar2;
  uint uVar3;
  long *unaff_x19;
  uint uVar4;
  uint *unaff_x20;
  uint uVar5;
  uint uVar6;
  
  if (in_w8 < 8) {
    uVar5 = *(uint *)(&UNK_0080be6c + (long)(int)in_w8 * 4);
    uVar6 = *unaff_x20;
    uVar3 = *(uint *)(unaff_x19 + 1);
    uVar4 = *(uint *)((long)unaff_x19 + 0xc);
    uVar1 = uVar3 + 4;
    if (uVar4 < uVar1) {
LAB_00095638:
      do {
        uVar4 = uVar4 << 1;
      } while (uVar4 < uVar1);
      lVar2 = _realloc(*unaff_x19,uVar4);
      *unaff_x19 = lVar2;
      if (lVar2 == 0) {
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
    uVar1 = uVar3 + 4;
    if (uVar4 < uVar1) goto LAB_00095638;
  }
  lVar2 = *unaff_x19;
LAB_0009566c:
  *(uint *)(lVar2 + (ulong)uVar3) = uVar6 | uVar5;
  *(int *)(unaff_x19 + 1) = (int)unaff_x19[1] + 4;
  return 0;
}

