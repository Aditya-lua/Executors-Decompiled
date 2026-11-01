
void FUN_0013e4b0(void)

{
  long *plVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  long *plVar6;
  undefined1 in_ZR;
  bool bVar7;
  undefined8 *puVar8;
  long *plVar9;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  long in_x13;
  int in_w14;
  byte bVar10;
  int iVar11;
  long unaff_x19;
  undefined8 *puVar12;
  int *unaff_x21;
  undefined8 *puVar13;
  int unaff_w24;
  long *plVar14;
  undefined8 *in_stack_00000000;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000078;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  
  do {
    iVar11 = in_w14;
    if ((bool)in_ZR) {
      iVar11 = in_w14 + 1;
    }
    while( true ) {
      in_x12 = (ulong)(uint)(iVar11 + (int)in_x12);
      if (in_x11 <= in_x12) {
        func_0x00149130();
        uStack0000000000000030 = (undefined8 *)0x0;
        in_stack_00000038 = 0;
        plVar1 = (long *)(unaff_x19 + 0x280);
        uStack0000000000000028 = &uStack0000000000000030;
        if (*(long **)(unaff_x19 + 0x278) == plVar1) goto code_r0x0013e6ac;
        plVar14 = *(long **)(unaff_x19 + 0x278);
        goto code_r0x0013e568;
      }
      bVar10 = *(byte *)(in_x10 + in_x12 * in_x13);
      if (bVar10 == 9) break;
      unaff_w24 = unaff_w24 + 1;
      if ((bVar10 & 0xfe) == 0xfc) {
        iVar11 = 6;
      }
      else if ((bVar10 & 0xfc) == 0xf8) {
        iVar11 = 5;
      }
      else if ((bVar10 & 0xf8) == 0xf0) {
        iVar11 = 4;
      }
      else {
        if ((bVar10 & 0xf0) != 0xe0) goto code_r0x0013e4a8;
        iVar11 = 3;
      }
    }
    iVar11 = *(int *)(unaff_x19 + 0x54);
    iVar5 = 0;
    if (iVar11 != 0) {
      iVar5 = unaff_w24 / iVar11;
    }
    unaff_w24 = iVar11 + iVar5 * iVar11;
    bVar10 = 0;
code_r0x0013e4a8:
    in_ZR = (bVar10 & 0xe0) == 0xc0;
  } while( true );
code_r0x0013e568:
  iVar11 = (int)plVar14[4] + -1;
  if (iVar11 != *unaff_x21) {
    iVar11 = (int)plVar14[4];
  }
  if (*(char *)((long)plVar14 + 0x3f) < '\0') {
    func_0x00017634(&uStack0000000000000010,plVar14[5],plVar14[6]);
  }
  else {
    in_stack_00000018 = plVar14[6];
    uStack0000000000000010 = plVar14[5];
    in_stack_00000020 = plVar14[7];
  }
  puVar8 = uStack0000000000000030;
  puVar12 = &uStack0000000000000030;
  puVar13 = &uStack0000000000000030;
  if (uStack0000000000000030 != (undefined8 *)0x0) {
    do {
      while( true ) {
        puVar12 = puVar8;
        if (iVar11 < *(int *)(puVar12 + 4)) break;
        if (iVar11 <= *(int *)(puVar12 + 4)) goto code_r0x0013e660;
        puVar8 = (undefined8 *)puVar12[1];
        if ((undefined8 *)puVar12[1] == (undefined8 *)0x0) {
          puVar13 = puVar12 + 1;
          goto code_r0x0013e604;
        }
      }
      puVar8 = (undefined8 *)*puVar12;
      puVar13 = puVar12;
    } while ((undefined8 *)*puVar12 != (undefined8 *)0x0);
  }
code_r0x0013e604:
  puVar8 = (undefined8 *)__Znwm(0x40);
  *(int *)(puVar8 + 4) = iVar11;
  puVar8[6] = in_stack_00000018;
  puVar8[5] = uStack0000000000000010;
  puVar8[7] = in_stack_00000020;
  uStack0000000000000010 = 0;
  in_stack_00000018 = 0;
  in_stack_00000020 = 0;
  *puVar8 = 0;
  puVar8[1] = 0;
  puVar8[2] = puVar12;
  *puVar13 = puVar8;
  if ((undefined8 *)*uStack0000000000000028 != (undefined8 *)0x0) {
    puVar8 = (undefined8 *)*puVar13;
    uStack0000000000000028 = (undefined8 *)*uStack0000000000000028;
  }
  func_0x0003767c(uStack0000000000000030,puVar8);
  in_stack_00000038 = in_stack_00000038 + 1;
code_r0x0013e660:
  if (in_stack_00000020 < 0) {
    __ZdlPv(uStack0000000000000010);
    plVar6 = (long *)plVar14[1];
    if ((long *)plVar14[1] != (long *)0x0) goto code_r0x0013e684;
code_r0x0013e694:
    do {
      plVar9 = (long *)plVar14[2];
      bVar7 = (long *)*plVar9 != plVar14;
      plVar14 = plVar9;
    } while (bVar7);
  }
  else {
    plVar6 = (long *)plVar14[1];
    if ((long *)plVar14[1] == (long *)0x0) goto code_r0x0013e694;
code_r0x0013e684:
    do {
      plVar9 = plVar6;
      plVar6 = (long *)*plVar9;
    } while ((long *)*plVar9 != (long *)0x0);
  }
  plVar14 = plVar9;
  if (plVar9 == plVar1) {
code_r0x0013e6ac:
    func_0x0014a65c((long *)(unaff_x19 + 0x278),*(undefined8 *)(unaff_x19 + 0x280));
    *(undefined8 **)(unaff_x19 + 0x278) = uStack0000000000000028;
    *(undefined8 **)(unaff_x19 + 0x280) = uStack0000000000000030;
    *(long *)(unaff_x19 + 0x288) = in_stack_00000038;
    if (in_stack_00000038 == 0) {
      *(long *)(unaff_x19 + 0x278) = (long)plVar1;
    }
    else {
      uStack0000000000000030[2] = plVar1;
      uStack0000000000000030 = (undefined8 *)0x0;
      in_stack_00000038 = 0;
      uStack0000000000000028 = &uStack0000000000000030;
    }
    func_0x0013aef4();
    *(int *)(unaff_x19 + 0x30) = *(int *)(unaff_x19 + 0x30) + -1;
    *(int *)(unaff_x19 + 0x34) = unaff_w24;
    func_0x0014a65c(&uStack0000000000000028,uStack0000000000000030);
    *(undefined1 *)(unaff_x19 + 0x5d) = 1;
    func_0x001420d0();
    uVar3 = *(uint *)(unaff_x19 + 0x30);
    uVar4 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) *
            -0x55555555;
    if ((int)(uVar3 + 1) < (int)uVar4) {
      uVar4 = uVar3 + 1;
    }
    uVar2 = *(uint *)(unaff_x19 + 0x6c);
    if ((int)uVar3 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
      uVar2 = uVar3;
    }
    uVar3 = *(uint *)(unaff_x19 + 0x70);
    if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar4) {
      uVar3 = uVar4;
    }
    uVar2 = uVar2 & ((int)uVar2 >> 0x1f ^ 0xffffffffU);
    uVar4 = uVar2;
    if ((int)uVar2 <= (int)uVar3) {
      uVar4 = uVar3;
    }
    *(uint *)(unaff_x19 + 0x6c) = uVar2;
    *(uint *)(unaff_x19 + 0x70) = uVar4;
    *(undefined1 *)(unaff_x19 + 0x248) = 1;
    in_stack_000000b0 = in_stack_00000000[1];
    in_stack_000000a8 = *in_stack_00000000;
    in_stack_000000b8 = in_stack_00000000[2];
    func_0x00139988();
    if (in_stack_00000078._7_1_ < '\0') {
      __ZdlPv(in_stack_00000068);
    }
    if (in_stack_00000050._7_1_ < '\0') {
      __ZdlPv(in_stack_00000040);
    }
    return;
  }
  goto code_r0x0013e568;
}

