
void FUN_006b31b8(void)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar9;
  undefined4 *unaff_x22;
  undefined8 *puVar10;
  long unaff_x23;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined4 *puVar13;
  long lVar14;
  undefined4 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
  puVar11 = *(undefined8 **)(unaff_x19 + 0x288);
  uVar15 = (undefined4)((ulong)(*(long *)(unaff_x19 + 0x30) - *(long *)(unaff_x19 + 0x28)) >> 2);
  if (*(undefined8 **)(unaff_x19 + 0x290) <= puVar11) {
    puVar9 = *(undefined8 **)(unaff_x19 + 0x280);
    lVar14 = (long)puVar11 - (long)puVar9 >> 3;
    uVar3 = lVar14 + 1;
    if (uVar3 >> 0x3d == 0) {
      uVar4 = (long)*(undefined8 **)(unaff_x19 + 0x290) - (long)puVar9;
      uVar6 = (long)uVar4 >> 2;
      if (uVar6 <= uVar3) {
        uVar6 = uVar3;
      }
      if (0x7ffffffffffffff7 < uVar4) {
        uVar6 = 0x1fffffffffffffff;
      }
      if (uVar6 >> 0x3d == 0) {
        lVar2 = __Znwm(uVar6 * 8);
        puVar5 = (undefined8 *)(lVar2 + lVar14 * 8);
        *(undefined4 *)puVar5 = uVar15;
        *(int *)((long)puVar5 + 4) = (int)unaff_x23;
        puVar10 = puVar5 + 1;
        if ((long)puVar11 - (long)puVar9 != 0) {
          uVar3 = ((long)puVar11 - (long)puVar9) - 8;
          puVar12 = puVar11;
          if ((0x57 < uVar3) &&
             (0x3f < (ulong)((long)puVar11 + (-lVar2 - ((long)puVar11 - (long)puVar9))))) {
            uVar3 = (uVar3 >> 3) + 1;
            uVar7 = uVar3 & 0x3ffffffffffffff8;
            puVar12 = puVar11 + -uVar7;
            puVar5 = puVar5 + -uVar7;
            puVar11 = puVar11 + -4;
            puVar8 = (undefined8 *)(lVar2 + lVar14 * 8 + -0x20);
            uVar4 = uVar7;
            do {
              uVar18 = *puVar11;
              uVar17 = puVar11[3];
              uVar16 = puVar11[2];
              uVar22 = puVar11[-3];
              uVar21 = puVar11[-4];
              uVar20 = puVar11[-1];
              uVar19 = puVar11[-2];
              puVar8[1] = puVar11[1];
              *puVar8 = uVar18;
              puVar8[3] = uVar17;
              puVar8[2] = uVar16;
              puVar8[-3] = uVar22;
              puVar8[-4] = uVar21;
              puVar8[-1] = uVar20;
              puVar8[-2] = uVar19;
              puVar11 = puVar11 + -8;
              puVar8 = puVar8 + -8;
              uVar4 = uVar4 - 8;
            } while (uVar4 != 0);
            if (uVar3 == uVar7) goto code_r0x006b32d4;
          }
          do {
            puVar12 = puVar12 + -1;
            puVar5 = puVar5 + -1;
            *puVar5 = *puVar12;
          } while (puVar12 != puVar9);
        }
code_r0x006b32d4:
        *(undefined8 **)(unaff_x19 + 0x280) = puVar5;
        *(undefined8 **)(unaff_x19 + 0x288) = puVar10;
        *(ulong *)(unaff_x19 + 0x290) = lVar2 + uVar6 * 8;
        if (puVar9 != (undefined8 *)0x0) {
          __ZdlPv(puVar9);
        }
        goto LAB_006b32ec;
      }
    }
    else {
      func_0x00017f90();
    }
    func_0x00017514();
code_r0x006b33d8:
    func_0x0001748c(unaff_x22);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6b33e4);
    (*pcVar1)();
  }
  *(undefined4 *)puVar11 = uVar15;
  *(int *)((long)puVar11 + 4) = (int)unaff_x23;
  puVar10 = puVar11 + 1;
LAB_006b32ec:
  *(undefined8 **)(unaff_x19 + 0x288) = puVar10;
  if (*(char *)(unaff_x19 + 0x2af) < '\0') {
    unaff_x20 = (undefined8 *)*unaff_x20;
  }
  puVar13 = *(undefined4 **)(unaff_x19 + 0x2f8);
  if (*(undefined4 **)(unaff_x19 + 0x300) <= puVar13) {
    puVar13 = (undefined4 *)func_0x006b7894(unaff_x19 + 0x2f0);
    goto code_r0x006b33ac;
  }
  unaff_x22 = puVar13 + 2;
  *puVar13 = *(undefined4 *)(unaff_x19 + 0x1b8);
  uVar3 = _strlen((long)unaff_x20 + unaff_x23);
  if (0x7ffffffffffffff7 < uVar3) goto code_r0x006b33d8;
  if (uVar3 < 0x17) {
    *(char *)((long)puVar13 + 0x1f) = (char)uVar3;
    if (uVar3 != 0) goto code_r0x006b3390;
  }
  else {
    uVar6 = (uVar3 & 0xfffffffffffffff8) + 8;
    if ((uVar3 | 7) != 0x17) {
      uVar6 = uVar3 | 7;
    }
    unaff_x22 = (undefined4 *)__Znwm(uVar6 + 1);
    *(ulong *)(puVar13 + 4) = uVar3;
    *(ulong *)(puVar13 + 6) = uVar6 + 1 | 0x8000000000000000;
    *(undefined4 **)(puVar13 + 2) = unaff_x22;
code_r0x006b3390:
    _memmove(unaff_x22,(long)unaff_x20 + unaff_x23,uVar3);
  }
  *(undefined1 *)((long)unaff_x22 + uVar3) = 0;
  puVar13 = puVar13 + 8;
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar13;
code_r0x006b33ac:
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar13;
  return;
}

