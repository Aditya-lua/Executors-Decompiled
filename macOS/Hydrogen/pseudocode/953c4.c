
/* WARNING: Removing unreachable block (ram,0x0009549c) */

undefined8 FUN_000953c4(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  byte in_ZR;
  long lVar3;
  undefined8 uVar4;
  int iVar5;
  int in_w9;
  uint uVar6;
  long *unaff_x19;
  uint *unaff_x20;
  ulong unaff_x21;
  uint unaff_w22;
  uint unaff_w23;
  uint uVar7;
  
  if (unaff_w22 < in_w9 + 8U) {
    do {
      unaff_w22 = unaff_w22 << 1;
    } while (unaff_w22 < in_w9 + 8U);
    lVar3 = _realloc(*unaff_x19,unaff_w22);
    *unaff_x19 = lVar3;
    if (lVar3 == 0) {
      *(undefined4 *)(unaff_x19 + 1) = 0;
      return 0x100;
    }
    *(uint *)((long)unaff_x19 + 0xc) = unaff_w22;
    param_1 = (ulong)*(uint *)(unaff_x19 + 1);
  }
  else {
    lVar3 = *unaff_x19;
  }
  *(uint *)(lVar3 + (param_1 & 0xffffffff)) =
       (uint)(unaff_x21 >> 0x1b) & 0x1fffe0 | unaff_w23 | (uint)in_ZR << 0x1f | 0x72c00000;
  *(int *)(unaff_x19 + 1) = (int)unaff_x19[1] + 4;
  uVar1 = *unaff_x20;
  uVar2 = unaff_x20[1];
  if (unaff_x19 == (long *)0x0) {
    return 0x10;
  }
  uVar6 = *(uint *)(unaff_x19 + 1);
  uVar7 = *(uint *)((long)unaff_x19 + 0xc);
  if (uVar7 < uVar6 + 4) {
    do {
      uVar7 = uVar7 << 1;
    } while (uVar7 < uVar6 + 4);
    lVar3 = _realloc(*unaff_x19,uVar7);
    *unaff_x19 = lVar3;
    if (lVar3 == 0) {
      uVar4 = 0x100;
      iVar5 = 0;
      goto code_r0x00095548;
    }
    *(uint *)((long)unaff_x19 + 0xc) = uVar7;
    uVar6 = *(uint *)(unaff_x19 + 1);
  }
  else {
    lVar3 = *unaff_x19;
  }
  uVar4 = 0;
  *(uint *)(lVar3 + (ulong)uVar6) =
       uVar1 | (uint)(uVar2 == 0x40) << 0x1f | (uint)(ushort)(unaff_x21 >> 0x30) << 5 | 0x60600000 |
       0x12800000;
  iVar5 = (int)unaff_x19[1] + 4;
code_r0x00095548:
  *(int *)(unaff_x19 + 1) = iVar5;
  return uVar4;
}

