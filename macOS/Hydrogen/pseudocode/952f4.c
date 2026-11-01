
/* WARNING: Removing unreachable block (ram,0x0009549c) */

undefined8 FUN_000952f4(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  undefined8 uVar5;
  int iVar6;
  uint uVar7;
  long *unaff_x19;
  uint *unaff_x20;
  ulong unaff_x21;
  undefined4 unaff_w22;
  uint uVar8;
  uint unaff_w23;
  int unaff_w24;
  
  lVar4 = _realloc();
  *unaff_x19 = lVar4;
  if (lVar4 == 0) {
LAB_00095400:
    *(undefined4 *)(unaff_x19 + 1) = 0;
    return 0x100;
  }
  *(undefined4 *)((long)unaff_x19 + 0xc) = unaff_w22;
  *(uint *)(lVar4 + (ulong)*(uint *)(unaff_x19 + 1)) =
       ((uint)unaff_x21 & 0xffff) << 5 | unaff_w23 | unaff_w24 << 0x1f | 0x52800000;
  lVar4 = unaff_x19[1];
  uVar8 = *(uint *)((long)unaff_x19 + 0xc);
  uVar1 = (int)lVar4 + 4;
  *(uint *)(unaff_x19 + 1) = uVar1;
  uVar7 = *unaff_x20;
  uVar3 = unaff_x20[1];
  uVar2 = (int)lVar4 + 8;
  if (uVar8 < uVar2) {
    do {
      uVar8 = uVar8 << 1;
    } while (uVar8 < uVar2);
    lVar4 = _realloc(*unaff_x19,uVar8);
    *unaff_x19 = lVar4;
    if (lVar4 == 0) goto LAB_00095400;
    *(uint *)((long)unaff_x19 + 0xc) = uVar8;
    uVar1 = *(uint *)(unaff_x19 + 1);
  }
  else {
    lVar4 = *unaff_x19;
  }
  *(uint *)(lVar4 + (ulong)uVar1) =
       uVar7 | ((uint)unaff_x21 >> 0x10) << 5 | (uint)(uVar3 == 0x40) << 0x1f | 0x72a00000;
  lVar4 = unaff_x19[1];
  uVar8 = *(uint *)((long)unaff_x19 + 0xc);
  uVar1 = (int)lVar4 + 4;
  *(uint *)(unaff_x19 + 1) = uVar1;
  uVar7 = *unaff_x20;
  uVar3 = unaff_x20[1];
  uVar2 = (int)lVar4 + 8;
  if (uVar8 < uVar2) {
    do {
      uVar8 = uVar8 << 1;
    } while (uVar8 < uVar2);
    lVar4 = _realloc(*unaff_x19,uVar8);
    *unaff_x19 = lVar4;
    if (lVar4 == 0) goto LAB_00095400;
    *(uint *)((long)unaff_x19 + 0xc) = uVar8;
    uVar1 = *(uint *)(unaff_x19 + 1);
  }
  else {
    lVar4 = *unaff_x19;
  }
  *(uint *)(lVar4 + (ulong)uVar1) =
       (uint)(unaff_x21 >> 0x1b) & 0x1fffe0 | uVar7 | (uint)(uVar3 == 0x40) << 0x1f | 0x72c00000;
  *(int *)(unaff_x19 + 1) = (int)unaff_x19[1] + 4;
  uVar1 = *unaff_x20;
  uVar2 = unaff_x20[1];
  if (unaff_x19 == (long *)0x0) {
    return 0x10;
  }
  uVar7 = *(uint *)(unaff_x19 + 1);
  uVar8 = *(uint *)((long)unaff_x19 + 0xc);
  if (uVar8 < uVar7 + 4) {
    do {
      uVar8 = uVar8 << 1;
    } while (uVar8 < uVar7 + 4);
    lVar4 = _realloc(*unaff_x19,uVar8);
    *unaff_x19 = lVar4;
    if (lVar4 == 0) {
      uVar5 = 0x100;
      iVar6 = 0;
      goto code_r0x00095548;
    }
    *(uint *)((long)unaff_x19 + 0xc) = uVar8;
    uVar7 = *(uint *)(unaff_x19 + 1);
  }
  else {
    lVar4 = *unaff_x19;
  }
  uVar5 = 0;
  *(uint *)(lVar4 + (ulong)uVar7) =
       uVar1 | (uint)(uVar2 == 0x40) << 0x1f | (uint)(ushort)(unaff_x21 >> 0x30) << 5 | 0x60600000 |
       0x12800000;
  iVar6 = (int)unaff_x19[1] + 4;
code_r0x00095548:
  *(int *)(unaff_x19 + 1) = iVar6;
  return uVar5;
}

