
/* WARNING: Removing unreachable block (ram,0x006bd004) */
/* WARNING: Removing unreachable block (ram,0x006bd01c) */
/* WARNING: Removing unreachable block (ram,0x006bd028) */

void FUN_006bce60(void)

{
  code *pcVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined4 uVar5;
  ulong uVar6;
  ulong *puVar7;
  byte bVar8;
  byte bVar9;
  long lVar10;
  long lVar11;
  bool bVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  ulong unaff_x21;
  undefined8 *unaff_x22;
  byte *unaff_x23;
  undefined8 uVar15;
  undefined8 uVar16;
  ulong *puVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  
  uVar3 = func_0x006bf528();
  if ((uVar3 & 1) == 0) {
    if (0 < *(int *)((long)unaff_x19 + 0xc)) {
      func_0x006b2e98(*unaff_x19,*(int *)((long)unaff_x22 + 0x14) + 1);
    }
    lVar11 = unaff_x19[0x95] - unaff_x19[0x94];
    if ((lVar11 != 0) && (unaff_x19[0x13] != 0)) {
      bVar12 = false;
      lVar10 = 0;
      lVar11 = lVar11 >> 3;
      bVar8 = 0xff;
LAB_006bceb4:
      do {
        uVar3 = *(ulong *)(unaff_x19[0x94] + lVar10 * 8);
        if (uVar3 != unaff_x19[0x14]) {
          uVar14 = 0;
          uVar6 = uVar3 >> 4 ^ uVar3 >> 9;
          do {
            uVar6 = uVar6 & unaff_x19[0x12] - 1;
            puVar7 = (ulong *)(unaff_x19[0x11] + uVar6 * 0x18);
            if (*puVar7 == uVar3) goto LAB_006bcf04;
            if (*puVar7 == unaff_x19[0x14]) break;
            uVar14 = uVar14 + 1;
            uVar6 = uVar14 + uVar6;
          } while (uVar14 <= unaff_x19[0x12] - 1);
        }
        puVar7 = (ulong *)0x0;
LAB_006bcf04:
        puVar17 = (ulong *)0x0;
        if (puVar7 != (ulong *)0x0) {
          puVar17 = puVar7 + 1;
        }
        if (*(byte *)((long)puVar17 + 2) != 0) {
          bVar9 = (byte)*puVar17;
          if (bVar8 <= (byte)*puVar17) {
            bVar9 = bVar8;
          }
          lVar10 = lVar10 + 1;
          bVar12 = true;
          bVar8 = bVar9;
          if (lVar10 == lVar11) goto LAB_006bcf88;
          goto LAB_006bceb4;
        }
        lVar10 = lVar10 + 1;
      } while (lVar10 != lVar11);
      bVar9 = bVar8;
      if (bVar12) {
LAB_006bcf88:
        func_0x006b1ccc(*unaff_x19,0xb,bVar9,0,0);
      }
    }
    func_0x006b1ccc(*unaff_x19,0x16,0,1,0);
  }
  if ((0 < *(int *)(unaff_x19 + 1)) && (1 < *(int *)((long)unaff_x19 + 0xc))) {
    uStack0000000000000038 = &UNK_00a1ae28;
    (**(code **)**(undefined8 **)(unaff_x21 + 0x90))
              (*(undefined8 **)(unaff_x21 + 0x90),&uStack0000000000000038);
    uStack0000000000000038 = &UNK_00a1ae28;
  }
  func_0x006b2e80(*unaff_x19,*(int *)(unaff_x21 + 0xc) + 1);
  iVar2 = *(int *)((long)unaff_x19 + 0xc);
  if (0 < iVar2) {
    lVar11 = *(long *)(unaff_x21 + 0xa0);
    if (lVar11 != 0) {
      uVar15 = *unaff_x19;
      uVar4 = _strlen(lVar11);
      func_0x006b2d74(uVar15,lVar11,uVar4);
      iVar2 = *(int *)((long)unaff_x19 + 0xc);
    }
    if (1 < iVar2) {
      puVar18 = (undefined8 *)unaff_x19[0x98];
      for (puVar19 = (undefined8 *)unaff_x19[0x97]; puVar19 != puVar18; puVar19 = puVar19 + 1) {
        uVar15 = *unaff_x19;
        uVar16 = *(undefined8 *)*puVar19;
        uVar4 = _strlen(uVar16);
        func_0x006b2fcc(uVar15,uVar16,uVar4);
      }
    }
  }
  if (0 < *(int *)(unaff_x19 + 2)) {
    puVar17 = (ulong *)unaff_x19[0x98];
    for (puVar7 = (ulong *)unaff_x19[0x97]; puVar7 != puVar17; puVar7 = puVar7 + 1) {
      if (unaff_x19[0x40] != 0) {
        uVar3 = *puVar7;
        if (uVar3 != unaff_x19[0x41]) {
          uVar14 = 0;
          uVar6 = uVar3 >> 4 ^ uVar3 >> 9;
          do {
            uVar6 = uVar6 & unaff_x19[0x3f] - 1;
            uVar13 = *(ulong *)(unaff_x19[0x3e] + uVar6 * 0x10);
            if (uVar13 == uVar3) {
              uVar5 = *(undefined4 *)(unaff_x19[0x3e] + uVar6 * 0x10 + 8);
              goto code_r0x006bd13c;
            }
            if (uVar13 == unaff_x19[0x41]) break;
            uVar14 = uVar14 + 1;
            uVar6 = uVar14 + uVar6;
          } while (uVar14 <= unaff_x19[0x3f] - 1);
        }
      }
      uVar5 = 0xf;
code_r0x006bd13c:
      func_0x006b2b14(*unaff_x19,uVar5);
    }
  }
  if (0 < *(int *)(unaff_x19 + 1)) {
    func_0x006b4050(*unaff_x19);
  }
  func_0x006b40ec(*unaff_x19);
  func_0x006bf744();
  uVar3 = func_0x006b2784(*unaff_x19);
  if (1000000000 < uVar3) {
    func_0x006bc388((int *)(unaff_x21 + 0xc),
                    "Exceeded function instruction limit; split the function into parts to compile")
    ;
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6bd47c);
    (*pcVar1)();
  }
  uVar3 = unaff_x21 >> 4;
  if ((unaff_x19[0x3b] != 0) && (unaff_x19[0x3c] != unaff_x21)) {
    uVar14 = 0;
    uVar6 = uVar3 ^ unaff_x21 >> 9;
    do {
      uVar6 = uVar6 & unaff_x19[0x3a] - 1;
      uVar13 = *(ulong *)(unaff_x19[0x39] + uVar6 * 0x20);
      if (uVar13 == unaff_x21) {
        lVar11 = unaff_x19[0x39] + uVar6 * 0x20;
        uVar4 = *unaff_x19;
        in_stack_00000030 = *(long *)(lVar11 + 0x18);
        in_stack_00000028 = *(undefined8 *)(lVar11 + 0x10);
        uStack0000000000000020 = *(undefined8 *)(lVar11 + 8);
        *(undefined8 *)(lVar11 + 0x10) = 0;
        *(undefined8 *)(lVar11 + 0x18) = 0;
        *(undefined8 *)(lVar11 + 8) = 0;
        func_0x006b2994(uVar4,&uStack0000000000000020);
        if (in_stack_00000030 < 0) {
          __ZdlPv(uStack0000000000000020);
        }
        break;
      }
      uVar14 = uVar14 + 1;
      uVar6 = uVar14 + uVar6;
    } while (uVar13 != unaff_x19[0x3c] && uVar14 <= unaff_x19[0x3a] - 1);
  }
  if ((*(long *)(unaff_x21 + 0x98) == 0) && (*(char *)(unaff_x19 + 0x93) == '\0')) {
    *unaff_x23 = *unaff_x23 | 2;
  }
  iVar2 = func_0x007064d8();
  if (iVar2 != 0) {
    *unaff_x23 = *unaff_x23 | 4;
  }
  func_0x006af5c8(*unaff_x19,*(undefined1 *)(unaff_x19 + 0x91),
                  (uint)(*(int *)(unaff_x19 + 0x98) - *(int *)(unaff_x19 + 0x97)) >> 3 & 0xff);
  lVar11 = unaff_x19[0xd];
  if ((ulong)(lVar11 * 3) >> 2 <= (ulong)unaff_x19[0xe]) {
    if ((unaff_x19[0xe] != 0) && (unaff_x19[0xf] != unaff_x21)) {
      uVar14 = 0;
      uVar6 = uVar3 ^ unaff_x21 >> 9;
      do {
        uVar6 = uVar6 & lVar11 - 1U;
        uVar13 = *(ulong *)(unaff_x19[0xc] + uVar6 * 0x38);
        if (uVar13 == unaff_x21) goto code_r0x006bd2e4;
        uVar14 = uVar14 + 1;
        uVar6 = uVar14 + uVar6;
      } while (uVar13 != unaff_x19[0xf] && uVar14 <= lVar11 - 1U);
    }
    func_0x006d0058();
    lVar11 = unaff_x19[0xd];
  }
code_r0x006bd2e4:
  uVar14 = 0;
  uVar3 = uVar3 ^ unaff_x21 >> 9;
  do {
    uVar3 = uVar3 & lVar11 - 1U;
    puVar7 = (ulong *)(unaff_x19[0xc] + uVar3 * 0x38);
    if (*puVar7 == unaff_x19[0xf]) {
      *puVar7 = unaff_x21;
      unaff_x19[0xe] = unaff_x19[0xe] + 1;
      *(undefined4 *)(puVar7 + 1) = unaff_w20;
      if (puVar7 + 2 == unaff_x19 + 0x97) goto code_r0x006bd378;
      goto code_r0x006bd364;
    }
    if (*puVar7 == unaff_x21) goto code_r0x006bd330;
    uVar14 = uVar14 + 1;
    uVar3 = uVar14 + uVar3;
  } while (uVar14 <= lVar11 - 1U);
  puVar7 = (ulong *)0x0;
code_r0x006bd330:
  *(undefined4 *)(puVar7 + 1) = unaff_w20;
  if (puVar7 + 2 != unaff_x19 + 0x97) {
code_r0x006bd364:
    func_0x006d0234();
  }
code_r0x006bd378:
  if ((((1 < *(int *)(unaff_x19 + 1)) && (*(char *)(unaff_x21 + 0x70) == '\0')) &&
      (*(long *)(unaff_x21 + 0x50) == 0)) &&
     ((*(char *)((long)unaff_x19 + 0x499) == '\0' && (*(char *)((long)unaff_x19 + 0x49a) == '\0'))))
  {
    *(undefined1 *)((long)puVar7 + 0x34) = 1;
    *(undefined4 *)(puVar7 + 6) = *(undefined4 *)(unaff_x19 + 0x91);
    uVar3 = func_0x006d8ebc(*(undefined8 *)(unaff_x21 + 0x90),*(undefined8 *)(unaff_x21 + 0x58),
                            *(undefined8 *)(unaff_x21 + 0x60),unaff_x19 + 0x2f,unaff_x19 + 0x20);
    puVar7[5] = uVar3;
    iVar2 = func_0x006bf528();
    if (iVar2 != 0) {
      uStack0000000000000038 = &UNK_00a1b050;
      (**(code **)*unaff_x22)();
      *(undefined1 *)((long)puVar7 + 0x35) = 1;
    }
  }
  unaff_x19[0x98] = unaff_x19[0x97];
  *(undefined4 *)(unaff_x19 + 0x91) = 0;
  unaff_x19[0x92] = 0;
  *(undefined1 *)(unaff_x19 + 0x93) = 0;
  *(undefined4 *)((long)unaff_x19 + 0x484) = in_stack_00000018._4_4_;
  return;
}

