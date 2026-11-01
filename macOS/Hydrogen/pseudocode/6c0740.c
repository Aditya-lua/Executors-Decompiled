
/* WARNING: Removing unreachable block (ram,0x006c0cac) */
/* WARNING: Removing unreachable block (ram,0x006c0cc0) */
/* WARNING: Removing unreachable block (ram,0x006c0ccc) */
/* WARNING: Removing unreachable block (ram,0x006c0cd4) */

void FUN_006c0740(undefined8 param_1)

{
  ulong *puVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  long lVar9;
  byte bVar10;
  byte bVar11;
  bool bVar12;
  ulong uVar13;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  ulong uVar14;
  long lVar15;
  undefined8 unaff_x25;
  ulong uVar16;
  long unaff_x27;
  long unaff_x28;
  undefined4 uStack0000000000000004;
  
  unaff_x19[0x9f] = param_1;
  if (unaff_x22 != 0) {
    __ZdlPv();
  }
  unaff_x19[0x9e] = unaff_x25;
  *(undefined1 *)(unaff_x19 + 0x93) = 1;
  uVar4 = func_0x006b2784(*unaff_x19);
  lVar15 = *(long *)(unaff_x20 + 0x28);
  uStack0000000000000004 = *(undefined4 *)((long)unaff_x19 + 0x484);
  if (*(long *)(lVar15 + 0x28) != 0) {
    bVar12 = false;
    uVar14 = 0;
    uVar16 = 0;
    do {
      while( true ) {
        func_0x006bed0c();
        lVar9 = unaff_x19[0x9e];
        *(long *)(lVar9 + -0x10) = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
        if (*(long *)(lVar9 + -8) == 0 || bVar12) break;
        uVar16 = uVar16 + 1;
        func_0x006cb3d0();
        uVar14 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
        bVar12 = true;
        uVar8 = *(ulong *)(lVar15 + 0x28);
        if (uVar8 <= uVar16) goto LAB_006c0810;
      }
      uVar16 = uVar16 + 1;
      uVar8 = *(ulong *)(lVar15 + 0x28);
    } while (uVar16 < uVar8);
LAB_006c0810:
    if (bVar12) {
      if (0 < *(int *)((long)unaff_x19 + 0xc)) {
        func_0x006b2e98(*unaff_x19,
                        *(int *)(*(long *)(*(long *)(lVar15 + 0x20) + uVar8 * 8 + -8) + 0x14) + 1);
      }
      uVar16 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
      if ((uVar14 < uVar16) && (unaff_x19[0x13] != 0)) {
        bVar12 = false;
        bVar10 = 0xff;
LAB_006c0870:
        do {
          uVar8 = *(ulong *)(unaff_x19[0x94] + uVar14 * 8);
          if (uVar8 != unaff_x19[0x14]) {
            uVar13 = 0;
            uVar6 = uVar8 >> 4 ^ uVar8 >> 9;
            do {
              uVar6 = uVar6 & unaff_x19[0x12] - 1;
              puVar7 = (ulong *)(unaff_x19[0x11] + uVar6 * 0x18);
              if (*puVar7 == uVar8) goto LAB_006c08c0;
              if (*puVar7 == unaff_x19[0x14]) break;
              uVar13 = uVar13 + 1;
              uVar6 = uVar13 + uVar6;
            } while (uVar13 <= unaff_x19[0x12] - 1);
          }
          puVar7 = (ulong *)0x0;
LAB_006c08c0:
          puVar1 = (ulong *)0x0;
          if (puVar7 != (ulong *)0x0) {
            puVar1 = puVar7 + 1;
          }
          if (*(byte *)((long)puVar1 + 2) != 0) {
            bVar11 = (byte)*puVar1;
            if (bVar10 <= (byte)*puVar1) {
              bVar11 = bVar10;
            }
            uVar14 = uVar14 + 1;
            bVar12 = true;
            bVar10 = bVar11;
            if (uVar14 == uVar16) goto code_r0x006c090c;
            goto LAB_006c0870;
          }
          uVar14 = uVar14 + 1;
        } while (uVar14 != uVar16);
        bVar11 = bVar10;
        if (bVar12) {
code_r0x006c090c:
          func_0x006b1ccc(*unaff_x19,0xb,bVar11,0,0);
        }
      }
      func_0x006bf744();
    }
  }
  func_0x006b2784(*unaff_x19);
  if (0 < *(int *)((long)unaff_x19 + 0xc)) {
    func_0x006b2e98(*unaff_x19,*(int *)(*(long *)(unaff_x20 + 0x20) + 0xc) + 1);
  }
  iVar3 = func_0x006cae38();
  if (iVar3 == 0) {
    func_0x006c526c();
    uVar16 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
    if ((unaff_x21 < uVar16) && (unaff_x19[0x13] != 0)) {
      bVar12 = false;
      uVar14 = unaff_x21;
      bVar10 = 0xff;
code_r0x006c0a8c:
      do {
        uVar8 = *(ulong *)(unaff_x19[0x94] + uVar14 * 8);
        if (uVar8 != unaff_x19[0x14]) {
          uVar13 = 0;
          uVar6 = uVar8 >> 4 ^ uVar8 >> 9;
          do {
            uVar6 = uVar6 & unaff_x19[0x12] - 1;
            puVar7 = (ulong *)(unaff_x19[0x11] + uVar6 * 0x18);
            if (*puVar7 == uVar8) goto code_r0x006c0adc;
            if (*puVar7 == unaff_x19[0x14]) break;
            uVar13 = uVar13 + 1;
            uVar6 = uVar13 + uVar6;
          } while (uVar13 <= unaff_x19[0x12] - 1);
        }
        puVar7 = (ulong *)0x0;
code_r0x006c0adc:
        puVar1 = (ulong *)0x0;
        if (puVar7 != (ulong *)0x0) {
          puVar1 = puVar7 + 1;
        }
        if (*(byte *)((long)puVar1 + 2) != 0) {
          bVar11 = (byte)*puVar1;
          if (bVar10 <= (byte)*puVar1) {
            bVar11 = bVar10;
          }
          uVar14 = uVar14 + 1;
          bVar12 = true;
          bVar10 = bVar11;
          if (uVar14 == uVar16) goto code_r0x006c0b54;
          goto code_r0x006c0a8c;
        }
        uVar14 = uVar14 + 1;
      } while (uVar14 != uVar16);
      bVar11 = bVar10;
      if (bVar12) {
code_r0x006c0b54:
        func_0x006b1ccc(*unaff_x19,0xb,bVar11,0,0);
      }
    }
    uVar5 = func_0x006b2784(*unaff_x19);
    func_0x006b1f78(*unaff_x19,0x18,0,0);
    func_0x006b2784(*unaff_x19);
    uVar16 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
    if ((unaff_x21 < uVar16) && (unaff_x19[0x13] != 0)) {
      bVar12 = false;
      bVar10 = 0xff;
code_r0x006c0bcc:
      do {
        uVar14 = *(ulong *)(unaff_x19[0x94] + unaff_x21 * 8);
        if (uVar14 != unaff_x19[0x14]) {
          uVar8 = 0;
          uVar13 = uVar14 >> 4 ^ uVar14 >> 9;
          do {
            uVar13 = uVar13 & unaff_x19[0x12] - 1;
            puVar7 = (ulong *)(unaff_x19[0x11] + uVar13 * 0x18);
            if (*puVar7 == uVar14) goto code_r0x006c0c1c;
            if (*puVar7 == unaff_x19[0x14]) break;
            uVar8 = uVar8 + 1;
            uVar13 = uVar8 + uVar13;
          } while (uVar8 <= unaff_x19[0x12] - 1);
        }
        puVar7 = (ulong *)0x0;
code_r0x006c0c1c:
        puVar1 = (ulong *)0x0;
        if (puVar7 != (ulong *)0x0) {
          puVar1 = puVar7 + 1;
        }
        if (*(byte *)((long)puVar1 + 2) != 0) {
          bVar11 = (byte)*puVar1;
          if (bVar10 <= (byte)*puVar1) {
            bVar11 = bVar10;
          }
          unaff_x21 = unaff_x21 + 1;
          bVar12 = true;
          bVar10 = bVar11;
          if (unaff_x21 == uVar16) goto code_r0x006c0c68;
          goto code_r0x006c0bcc;
        }
        unaff_x21 = unaff_x21 + 1;
      } while (unaff_x21 != uVar16);
      bVar11 = bVar10;
      if (bVar12) {
code_r0x006c0c68:
        func_0x006b1ccc(*unaff_x19,0xb,bVar11,0,0);
      }
    }
    func_0x006b2784(*unaff_x19);
    uVar16 = func_0x006b2794(*unaff_x19,uVar5,uVar4);
    if ((uVar16 & 1) == 0) {
      func_0x006bc388(unaff_x20 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x6c0d84);
      (*pcVar2)();
    }
  }
  else {
    uVar16 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
    if ((unaff_x21 < uVar16) && (unaff_x19[0x13] != 0)) {
      bVar12 = false;
      bVar10 = 0xff;
code_r0x006c09a0:
      do {
        uVar14 = *(ulong *)(unaff_x19[0x94] + unaff_x21 * 8);
        if (uVar14 != unaff_x19[0x14]) {
          uVar8 = 0;
          uVar13 = uVar14 >> 4 ^ uVar14 >> 9;
          do {
            uVar13 = uVar13 & unaff_x19[0x12] - 1;
            puVar7 = (ulong *)(unaff_x19[0x11] + uVar13 * 0x18);
            if (*puVar7 == uVar14) goto code_r0x006c09f0;
            if (*puVar7 == unaff_x19[0x14]) break;
            uVar8 = uVar8 + 1;
            uVar13 = uVar8 + uVar13;
          } while (uVar8 <= unaff_x19[0x12] - 1);
        }
        puVar7 = (ulong *)0x0;
code_r0x006c09f0:
        puVar1 = (ulong *)0x0;
        if (puVar7 != (ulong *)0x0) {
          puVar1 = puVar7 + 1;
        }
        if (*(byte *)((long)puVar1 + 2) != 0) {
          bVar11 = (byte)*puVar1;
          if (bVar10 <= (byte)*puVar1) {
            bVar11 = bVar10;
          }
          unaff_x21 = unaff_x21 + 1;
          bVar12 = true;
          bVar10 = bVar11;
          if (unaff_x21 == uVar16) goto code_r0x006c0b28;
          goto code_r0x006c09a0;
        }
        unaff_x21 = unaff_x21 + 1;
      } while (unaff_x21 != uVar16);
      bVar11 = bVar10;
      if (bVar12) {
code_r0x006c0b28:
        func_0x006b1ccc(*unaff_x19,0xb,bVar11,0,0);
      }
    }
    func_0x006b2784(*unaff_x19);
  }
  func_0x006bf744();
  uVar14 = unaff_x28 - unaff_x27 >> 4;
  func_0x006cb1e0();
  uVar16 = (long)(unaff_x19[0x9b] - unaff_x19[0x9a]) >> 4;
  if (uVar14 < uVar16 || uVar14 - uVar16 == 0) {
    if (uVar14 < uVar16) {
      unaff_x19[0x9b] = unaff_x19[0x9a] + uVar14 * 0x10;
    }
  }
  else {
    func_0x006cb2a8(unaff_x19 + 0x9a,uVar14 - uVar16);
  }
  unaff_x19[0x9e] = unaff_x19[0x9e] + -0x18;
  *(undefined4 *)((long)unaff_x19 + 0x484) = uStack0000000000000004;
  return;
}

