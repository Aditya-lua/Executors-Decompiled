
void FUN_00693f34(undefined8 param_1,undefined8 param_2,char *param_3)

{
  ulong uVar1;
  uint uVar2;
  undefined8 uVar3;
  long *extraout_x8;
  ulong *puVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined1 uStack0000000000000100;
  
  func_0x0001753c();
  func_0x0001753c();
  func_0x0001753c();
  func_0x0001753c();
  func_0x0001753c();
  func_0x0001753c();
  func_0x0001753c();
  func_0x0001753c();
  uVar3 = func_0x0001753c();
  func_0x00087574(unaff_x29 + -0xe8);
  func_0x00087574(unaff_x29 + -0xb8);
  __Unwind_Resume(uVar3);
  uVar3 = func_0x0001753c();
  func_0x00087574(unaff_x29 + -0x88);
  func_0x00694398(&uStack0000000000000100);
  func_0x00087574(unaff_x29 + -0xe8);
  func_0x00087574(unaff_x29 + -0xb8);
  auVar9 = __Unwind_Resume(uVar3);
  puVar4 = (ulong *)*auVar9._0_8_;
  uVar2 = *(uint *)(auVar9._0_8_ + 1);
  uVar6 = (ulong)uVar2;
  uVar7 = (ulong)*(uint *)(auVar9._8_8_ + 1) + (*auVar9._8_8_ - (long)puVar4) * 8;
  uVar5 = uVar7 - uVar6;
  if (*param_3 == '\0') {
    if (uVar2 != 0) {
      uVar8 = (ulong)(0x40 - uVar2);
      uVar1 = uVar8;
      if (uVar5 <= uVar8) {
        uVar1 = uVar5;
      }
      uVar6 = 0xffffffffffffffffU >> (uVar8 - uVar1 & 0x3f) & -1L << (uVar6 & 0x3f) &
              (*puVar4 ^ 0xffffffffffffffff);
      if (uVar6 != 0) goto LAB_006942d4;
      if (uVar5 <= uVar8) goto LAB_0069434c;
      uVar5 = uVar5 - uVar1;
      puVar4 = puVar4 + 1;
    }
    for (; 0x3f < uVar5; uVar5 = uVar5 - 0x40) {
      if (*puVar4 != 0xffffffffffffffff) {
        uVar7 = ~*puVar4;
        uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
        uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
        uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        *extraout_x8 = (long)puVar4;
        *(int *)(extraout_x8 + 1) = (int)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20);
        return;
      }
      puVar4 = puVar4 + 1;
    }
    if (uVar5 == 0) goto LAB_00694294;
    uVar7 = 0xffffffffffffffffU >> (-uVar5 & 0x3f) & (*puVar4 ^ 0xffffffffffffffff);
  }
  else {
    if (uVar2 != 0) {
      uVar8 = (ulong)(0x40 - uVar2);
      uVar1 = uVar8;
      if (uVar5 <= uVar8) {
        uVar1 = uVar5;
      }
      uVar6 = 0xffffffffffffffffU >> (uVar8 - uVar1 & 0x3f) & -1L << (uVar6 & 0x3f) & *puVar4;
      if (uVar6 != 0) {
LAB_006942d4:
        uVar7 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
        uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
        uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        *extraout_x8 = (long)puVar4;
        *(int *)(extraout_x8 + 1) = (int)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20);
        return;
      }
      if (uVar5 <= uVar8) {
LAB_0069434c:
        uVar6 = uVar7;
        if (-1 < (long)(uVar7 - 0x3f)) {
          uVar6 = uVar7 - 0x3f;
        }
        uVar6 = (long)uVar6 >> 6;
        if ((uVar5 & 0x8000000000000000) == 0) {
          uVar6 = uVar7 >> 6;
        }
        *extraout_x8 = (long)(puVar4 + uVar6);
        *(uint *)(extraout_x8 + 1) = uVar2 + (int)uVar5 & 0x3f;
        return;
      }
      uVar5 = uVar5 - uVar1;
      puVar4 = puVar4 + 1;
    }
    for (; 0x3f < uVar5; uVar5 = uVar5 - 0x40) {
      uVar7 = *puVar4;
      if (uVar7 != 0) goto LAB_00694338;
      puVar4 = puVar4 + 1;
    }
    if (uVar5 == 0) goto LAB_00694294;
    uVar7 = *puVar4 & 0xffffffffffffffffU >> (-uVar5 & 0x3f);
  }
  if (uVar7 != 0) {
LAB_00694338:
    uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
    uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
    uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
    uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
    *extraout_x8 = (long)puVar4;
    *(int *)(extraout_x8 + 1) = (int)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20);
    return;
  }
LAB_00694294:
  *extraout_x8 = (long)puVar4;
  *(int *)(extraout_x8 + 1) = (int)uVar5;
  return;
}

