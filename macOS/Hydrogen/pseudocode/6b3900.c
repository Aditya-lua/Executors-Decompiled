
void FUN_006b3900(void)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  undefined8 *puVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  long *plVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  long *unaff_x19;
  uint uVar13;
  long lVar14;
  long unaff_x22;
  ulong uVar15;
  long unaff_x23;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  undefined8 uVar20;
  byte bStack000000000000003f;
  
  lVar14 = unaff_x23 * 0x10;
  lVar8 = __Znwm(lVar14);
  _bzero(lVar8,lVar14);
  lVar14 = lVar8 + lVar14;
  uVar17 = *(ulong *)(unaff_x22 + 0x240);
  if (uVar17 == 0) {
    uVar18 = 0;
LAB_006b3994:
    if (uVar18 != uVar17) {
      lVar16 = *(long *)(unaff_x22 + 0x238);
      do {
        puVar11 = (undefined8 *)(lVar16 + uVar18 * 0x18);
        uVar20 = *puVar11;
        puVar5 = (undefined8 *)(lVar8 + (ulong)(*(int *)(puVar11 + 2) - 1) * 0x10);
        puVar5[1] = puVar11[1];
        *puVar5 = uVar20;
        uVar15 = uVar18 + 1;
        if (uVar15 < uVar17) {
          lVar9 = *(long *)(unaff_x22 + 0x250);
          if (lVar9 == 0) {
            plVar10 = (long *)(lVar16 + 0x18 + uVar18 * 0x18);
            while (*plVar10 == 0) {
              uVar15 = uVar15 + 1;
              plVar10 = plVar10 + 3;
              if (uVar17 == uVar15) goto code_r0x006b3a68;
            }
          }
          else {
            plVar10 = (long *)(lVar16 + 0x20 + uVar18 * 0x18);
            while (((plVar10[-1] != 0 && (*plVar10 == *(long *)(unaff_x22 + 600))) &&
                   (iVar7 = _memcmp(plVar10[-1],lVar9), iVar7 == 0))) {
              uVar15 = uVar15 + 1;
              plVar10 = plVar10 + 3;
              if (uVar17 == uVar15) goto code_r0x006b3a68;
            }
          }
        }
        uVar18 = uVar15;
      } while (uVar15 != uVar17);
    }
  }
  else {
    plVar10 = *(long **)(unaff_x22 + 0x238);
    lVar16 = *(long *)(unaff_x22 + 0x250);
    if (lVar16 == 0) {
      uVar18 = 0;
      do {
        if (*plVar10 != 0) goto LAB_006b3994;
        uVar18 = uVar18 + 1;
        plVar10 = plVar10 + 3;
      } while (uVar17 != uVar18);
    }
    else {
      uVar18 = 0;
      plVar10 = plVar10 + 1;
      do {
        if (((plVar10[-1] == 0) || (*plVar10 != *(long *)(unaff_x22 + 600))) ||
           (iVar7 = _memcmp(plVar10[-1],lVar16), iVar7 != 0)) goto LAB_006b3994;
        uVar18 = uVar18 + 1;
        plVar10 = plVar10 + 3;
      } while (uVar17 != uVar18);
    }
  }
code_r0x006b3a68:
  uVar17 = (ulong)(lVar14 - lVar8) >> 4;
  do {
    uVar13 = (uint)uVar17;
    bStack000000000000003f = (byte)uVar17 & 0x7f | (0x7f < uVar13) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar17 = (ulong)(uVar13 >> 7);
  } while (0x7f < uVar13);
  if (lVar8 != lVar14) {
    lVar16 = lVar8;
    do {
      uVar17 = (ulong)*(uint *)(lVar16 + 8);
      do {
        uVar13 = (uint)uVar17;
        bVar4 = (byte)uVar17 & 0x7f | (0x7f < uVar13) << 7;
        bVar3 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar3 < '\0') {
          uVar18 = unaff_x19[1];
          uVar19 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar15 = uVar19 - 1;
          if (uVar15 != uVar18) {
            plVar10 = (long *)*unaff_x19;
            goto code_r0x006b3bbc;
          }
          if (uVar19 == 0x7ffffffffffffff7) {
            func_0x0001748c();
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x6b3c50);
            (*pcVar6)();
          }
          plVar10 = (long *)*unaff_x19;
          uVar18 = 0x7ffffffffffffff7;
          if (uVar15 < 0x3ffffffffffffff3) goto code_r0x006b3b58;
code_r0x006b3b80:
          lVar9 = __Znwm(uVar18);
          if (uVar15 != 0) {
            _memmove(lVar9,plVar10,uVar15);
          }
          *(byte *)(lVar9 + uVar15) = bVar4;
          if (uVar15 != 0x16) {
            __ZdlPv(plVar10);
          }
          unaff_x19[1] = uVar19;
          unaff_x19[2] = uVar18 | 0x8000000000000000;
          *unaff_x19 = lVar9;
          puVar12 = (undefined1 *)(lVar9 + uVar19);
        }
        else {
          uVar18 = (ulong)bVar3;
          plVar10 = unaff_x19;
          if (bVar3 == 0x16) {
            uVar19 = 0x17;
            uVar15 = 0x16;
code_r0x006b3b58:
            uVar1 = uVar19;
            if (uVar19 <= uVar15 * 2) {
              uVar1 = uVar15 * 2;
            }
            uVar2 = (uVar1 & 0x7ffffffffffffff8) + 8;
            if ((uVar1 | 7) != 0x17) {
              uVar2 = uVar1 | 7;
            }
            uVar18 = 0x17;
            if (0x16 < uVar1) {
              uVar18 = uVar2 + 1;
            }
            goto code_r0x006b3b80;
          }
code_r0x006b3bbc:
          *(byte *)((long)plVar10 + uVar18) = bVar4;
          lVar9 = uVar18 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar9;
            puVar12 = (undefined1 *)((long)plVar10 + lVar9);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
            puVar12 = (undefined1 *)((long)plVar10 + lVar9);
          }
        }
        *puVar12 = 0;
        uVar17 = uVar17 >> 7;
      } while (0x7f < uVar13);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      lVar16 = lVar16 + 0x10;
    } while (lVar16 != lVar14);
    lVar14 = lVar8;
  }
  if (lVar14 != 0) {
    __ZdlPv(lVar14);
  }
  return;
}

