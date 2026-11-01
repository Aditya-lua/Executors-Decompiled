
void FUN_006b3914(undefined8 param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  undefined8 *puVar5;
  code *pcVar6;
  int iVar7;
  long *plVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  long *unaff_x19;
  uint uVar11;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong uVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 uVar19;
  long lStack0000000000000020;
  undefined8 uStack0000000000000030;
  byte bStack000000000000003f;
  
  lStack0000000000000020 = param_2;
  uStack0000000000000030 = param_1;
  _bzero();
  lVar16 = unaff_x21 + unaff_x20;
  uVar15 = *(ulong *)(unaff_x22 + 0x240);
  if (uVar15 == 0) {
    uVar17 = 0;
LAB_006b3994:
    if (uVar17 != uVar15) {
      lVar13 = *(long *)(unaff_x22 + 0x238);
      do {
        puVar9 = (undefined8 *)(lVar13 + uVar17 * 0x18);
        uVar19 = *puVar9;
        puVar5 = (undefined8 *)(unaff_x21 + (ulong)(*(int *)(puVar9 + 2) - 1) * 0x10);
        puVar5[1] = puVar9[1];
        *puVar5 = uVar19;
        uVar12 = uVar17 + 1;
        if (uVar12 < uVar15) {
          lVar14 = *(long *)(unaff_x22 + 0x250);
          if (lVar14 == 0) {
            plVar8 = (long *)(lVar13 + 0x18 + uVar17 * 0x18);
            while (*plVar8 == 0) {
              uVar12 = uVar12 + 1;
              plVar8 = plVar8 + 3;
              if (uVar15 == uVar12) goto code_r0x006b3a68;
            }
          }
          else {
            plVar8 = (long *)(lVar13 + 0x20 + uVar17 * 0x18);
            while (((plVar8[-1] != 0 && (*plVar8 == *(long *)(unaff_x22 + 600))) &&
                   (iVar7 = _memcmp(plVar8[-1],lVar14), iVar7 == 0))) {
              uVar12 = uVar12 + 1;
              plVar8 = plVar8 + 3;
              if (uVar15 == uVar12) goto code_r0x006b3a68;
            }
          }
        }
        uVar17 = uVar12;
      } while (uVar12 != uVar15);
    }
  }
  else {
    plVar8 = *(long **)(unaff_x22 + 0x238);
    lVar13 = *(long *)(unaff_x22 + 0x250);
    if (lVar13 == 0) {
      uVar17 = 0;
      do {
        if (*plVar8 != 0) goto LAB_006b3994;
        uVar17 = uVar17 + 1;
        plVar8 = plVar8 + 3;
      } while (uVar15 != uVar17);
    }
    else {
      uVar17 = 0;
      plVar8 = plVar8 + 1;
      do {
        if (((plVar8[-1] == 0) || (*plVar8 != *(long *)(unaff_x22 + 600))) ||
           (iVar7 = _memcmp(plVar8[-1],lVar13), iVar7 != 0)) goto LAB_006b3994;
        uVar17 = uVar17 + 1;
        plVar8 = plVar8 + 3;
      } while (uVar15 != uVar17);
    }
  }
code_r0x006b3a68:
  uVar15 = (ulong)(lVar16 - unaff_x21) >> 4;
  do {
    uVar11 = (uint)uVar15;
    bStack000000000000003f = (byte)uVar15 & 0x7f | (0x7f < uVar11) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar15 = (ulong)(uVar11 >> 7);
  } while (0x7f < uVar11);
  if (unaff_x21 != lVar16) {
    do {
      uVar15 = (ulong)*(uint *)(unaff_x21 + 8);
      do {
        uVar11 = (uint)uVar15;
        bVar4 = (byte)uVar15 & 0x7f | (0x7f < uVar11) << 7;
        bVar3 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar3 < '\0') {
          uVar17 = unaff_x19[1];
          uVar18 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar12 = uVar18 - 1;
          if (uVar12 != uVar17) {
            plVar8 = (long *)*unaff_x19;
            goto code_r0x006b3bbc;
          }
          if (uVar18 == 0x7ffffffffffffff7) {
            func_0x0001748c();
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x6b3c50);
            (*pcVar6)();
          }
          plVar8 = (long *)*unaff_x19;
          uVar17 = 0x7ffffffffffffff7;
          if (uVar12 < 0x3ffffffffffffff3) goto code_r0x006b3b58;
code_r0x006b3b80:
          lVar13 = __Znwm(uVar17);
          if (uVar12 != 0) {
            _memmove(lVar13,plVar8,uVar12);
          }
          *(byte *)(lVar13 + uVar12) = bVar4;
          if (uVar12 != 0x16) {
            __ZdlPv(plVar8);
          }
          unaff_x19[1] = uVar18;
          unaff_x19[2] = uVar17 | 0x8000000000000000;
          *unaff_x19 = lVar13;
          puVar10 = (undefined1 *)(lVar13 + uVar18);
        }
        else {
          uVar17 = (ulong)bVar3;
          plVar8 = unaff_x19;
          if (bVar3 == 0x16) {
            uVar18 = 0x17;
            uVar12 = 0x16;
code_r0x006b3b58:
            uVar1 = uVar18;
            if (uVar18 <= uVar12 * 2) {
              uVar1 = uVar12 * 2;
            }
            uVar2 = (uVar1 & 0x7ffffffffffffff8) + 8;
            if ((uVar1 | 7) != 0x17) {
              uVar2 = uVar1 | 7;
            }
            uVar17 = 0x17;
            if (0x16 < uVar1) {
              uVar17 = uVar2 + 1;
            }
            goto code_r0x006b3b80;
          }
code_r0x006b3bbc:
          *(byte *)((long)plVar8 + uVar17) = bVar4;
          lVar13 = uVar17 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar13;
            puVar10 = (undefined1 *)((long)plVar8 + lVar13);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar13 & 0x7f;
            puVar10 = (undefined1 *)((long)plVar8 + lVar13);
          }
        }
        *puVar10 = 0;
        uVar15 = uVar15 >> 7;
      } while (0x7f < uVar11);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      unaff_x21 = unaff_x21 + 0x10;
    } while (unaff_x21 != lVar16);
    lVar16 = lStack0000000000000020;
  }
  if (lVar16 != 0) {
    __ZdlPv(lVar16);
  }
  return;
}

