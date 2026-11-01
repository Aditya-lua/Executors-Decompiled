
void FUN_006b0748(void)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  int *piVar4;
  uint *puVar5;
  uint *puVar6;
  byte bVar7;
  byte bVar8;
  long lVar9;
  undefined1 *puVar10;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  long *plVar14;
  long *unaff_x22;
  ulong uVar15;
  undefined1 auVar16 [12];
  byte bStack0000000000000038;
  
  do {
    bStack0000000000000038 = (byte)unaff_w21 & 0x7f | (0x7f < unaff_w21) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar1 = 0x7f < unaff_w21;
    unaff_w21 = unaff_w21 >> 7;
  } while (bVar1);
  piVar4 = *(int **)(unaff_x20 + 0x40);
  do {
    if (piVar4 == *(int **)(unaff_x20 + 0x48)) {
      bStack0000000000000038 = 1;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      func_0x006b3c88();
      if (*(long *)(unaff_x20 + 0x1c0) == *(long *)(unaff_x20 + 0x1c8)) {
LAB_006b07ec:
        if (*(long *)(unaff_x20 + 0x1d8) == *(long *)(unaff_x20 + 0x1e0)) {
          bStack0000000000000038 = 0;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          return;
        }
      }
LAB_006b07f8:
      bStack0000000000000038 = 1;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar12 = (ulong)(*(long *)(unaff_x20 + 0x1c8) - *(long *)(unaff_x20 + 0x1c0)) >> 4;
      do {
        uVar11 = (uint)uVar12;
        bStack0000000000000038 = (byte)uVar12 & 0x7f | (0x7f < uVar11) << 7;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar12 = (ulong)(uVar11 >> 7);
      } while (0x7f < uVar11);
      puVar6 = *(uint **)(unaff_x20 + 0x1c8);
      for (puVar5 = *(uint **)(unaff_x20 + 0x1c0); puVar5 != puVar6; puVar5 = puVar5 + 4) {
        uVar11 = *puVar5;
        do {
          bVar8 = (byte)uVar11 & 0x7f | (0x7f < uVar11) << 7;
          bVar7 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar7 < '\0') {
            uVar12 = unaff_x19[1];
            uVar15 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar13 = uVar15 - 1;
            if (uVar13 == uVar12) {
              if (uVar15 != 0x7ffffffffffffff7) {
                unaff_x22 = (long *)*unaff_x19;
                uVar12 = 0x7ffffffffffffff7;
                if (uVar13 < 0x3ffffffffffffff3) goto code_r0x006b0938;
                goto code_r0x006b0960;
              }
              goto code_r0x006b0e18;
            }
            plVar14 = (long *)*unaff_x19;
code_r0x006b099c:
            *(byte *)((long)plVar14 + uVar12) = bVar8;
            lVar9 = uVar12 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
          }
          else {
            uVar12 = (ulong)bVar7;
            plVar14 = unaff_x19;
            if (bVar7 != 0x16) goto code_r0x006b099c;
            uVar15 = 0x17;
            uVar13 = 0x16;
            unaff_x22 = unaff_x19;
code_r0x006b0938:
            uVar2 = uVar15;
            if (uVar15 <= uVar13 * 2) {
              uVar2 = uVar13 * 2;
            }
            uVar3 = (uVar2 & 0x7ffffffffffffff8) + 8;
            if ((uVar2 | 7) != 0x17) {
              uVar3 = uVar2 | 7;
            }
            uVar12 = 0x17;
            if (0x16 < uVar2) {
              uVar12 = uVar3 + 1;
            }
code_r0x006b0960:
            lVar9 = __Znwm(uVar12);
            if (uVar13 != 0) {
              _memmove(lVar9,unaff_x22,uVar13);
            }
            *(byte *)(lVar9 + uVar13) = bVar8;
            if (uVar13 != 0x16) {
              __ZdlPv(unaff_x22);
            }
            unaff_x19[1] = uVar15;
            unaff_x19[2] = uVar12 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar10 = (undefined1 *)(lVar9 + uVar15);
          }
          *puVar10 = 0;
          bVar1 = 0x7f < uVar11;
          uVar11 = uVar11 >> 7;
        } while (bVar1);
        uVar11 = puVar5[2];
        do {
          bVar8 = (byte)uVar11 & 0x7f | (0x7f < uVar11) << 7;
          bVar7 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar7 < '\0') {
            uVar12 = unaff_x19[1];
            uVar15 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar13 = uVar15 - 1;
            if (uVar13 == uVar12) {
              if (uVar15 != 0x7ffffffffffffff7) {
                unaff_x22 = (long *)*unaff_x19;
                uVar12 = 0x7ffffffffffffff7;
                if (uVar13 < 0x3ffffffffffffff3) goto code_r0x006b0a70;
                goto code_r0x006b0a98;
              }
              goto code_r0x006b0e18;
            }
            plVar14 = (long *)*unaff_x19;
code_r0x006b0ad4:
            *(byte *)((long)plVar14 + uVar12) = bVar8;
            lVar9 = uVar12 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
          }
          else {
            uVar12 = (ulong)bVar7;
            plVar14 = unaff_x19;
            if (bVar7 != 0x16) goto code_r0x006b0ad4;
            uVar15 = 0x17;
            uVar13 = 0x16;
            unaff_x22 = unaff_x19;
code_r0x006b0a70:
            uVar2 = uVar15;
            if (uVar15 <= uVar13 * 2) {
              uVar2 = uVar13 * 2;
            }
            uVar3 = (uVar2 & 0x7ffffffffffffff8) + 8;
            if ((uVar2 | 7) != 0x17) {
              uVar3 = uVar2 | 7;
            }
            uVar12 = 0x17;
            if (0x16 < uVar2) {
              uVar12 = uVar3 + 1;
            }
code_r0x006b0a98:
            lVar9 = __Znwm(uVar12);
            if (uVar13 != 0) {
              _memmove(lVar9,unaff_x22,uVar13);
            }
            *(byte *)(lVar9 + uVar13) = bVar8;
            if (uVar13 != 0x16) {
              __ZdlPv(unaff_x22);
            }
            unaff_x19[1] = uVar15;
            unaff_x19[2] = uVar12 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar10 = (undefined1 *)(lVar9 + uVar15);
          }
          *puVar10 = 0;
          bVar1 = 0x7f < uVar11;
          uVar11 = uVar11 >> 7;
        } while (bVar1);
        uVar11 = puVar5[3];
        do {
          bVar8 = (byte)uVar11 & 0x7f | (0x7f < uVar11) << 7;
          bVar7 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar7 < '\0') {
            uVar12 = unaff_x19[1];
            uVar15 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar13 = uVar15 - 1;
            if (uVar13 == uVar12) {
              if (uVar15 != 0x7ffffffffffffff7) {
                unaff_x22 = (long *)*unaff_x19;
                uVar12 = 0x7ffffffffffffff7;
                if (uVar13 < 0x3ffffffffffffff3) goto code_r0x006b0ba8;
                goto code_r0x006b0bd0;
              }
              goto code_r0x006b0e18;
            }
            plVar14 = (long *)*unaff_x19;
code_r0x006b0c0c:
            *(byte *)((long)plVar14 + uVar12) = bVar8;
            lVar9 = uVar12 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
          }
          else {
            uVar12 = (ulong)bVar7;
            plVar14 = unaff_x19;
            if (bVar7 != 0x16) goto code_r0x006b0c0c;
            uVar15 = 0x17;
            uVar13 = 0x16;
            unaff_x22 = unaff_x19;
code_r0x006b0ba8:
            uVar2 = uVar15;
            if (uVar15 <= uVar13 * 2) {
              uVar2 = uVar13 * 2;
            }
            uVar3 = (uVar2 & 0x7ffffffffffffff8) + 8;
            if ((uVar2 | 7) != 0x17) {
              uVar3 = uVar2 | 7;
            }
            uVar12 = 0x17;
            if (0x16 < uVar2) {
              uVar12 = uVar3 + 1;
            }
code_r0x006b0bd0:
            lVar9 = __Znwm(uVar12);
            if (uVar13 != 0) {
              _memmove(lVar9,unaff_x22,uVar13);
            }
            *(byte *)(lVar9 + uVar13) = bVar8;
            if (uVar13 != 0x16) {
              __ZdlPv(unaff_x22);
            }
            unaff_x19[1] = uVar15;
            unaff_x19[2] = uVar12 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar10 = (undefined1 *)(lVar9 + uVar15);
          }
          *puVar10 = 0;
          bVar1 = 0x7f < uVar11;
          uVar11 = uVar11 >> 7;
        } while (bVar1);
        bStack0000000000000038 = (byte)puVar5[1];
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      }
      uVar12 = (ulong)(*(long *)(unaff_x20 + 0x1e0) - *(long *)(unaff_x20 + 0x1d8)) >> 2;
      do {
        uVar11 = (uint)uVar12;
        bStack0000000000000038 = (byte)uVar12 & 0x7f | (0x7f < uVar11) << 7;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar12 = (ulong)(uVar11 >> 7);
      } while (0x7f < uVar11);
      puVar5 = *(uint **)(unaff_x20 + 0x1d8);
      puVar6 = *(uint **)(unaff_x20 + 0x1e0);
      do {
        if (puVar5 == puVar6) {
          return;
        }
        uVar11 = *puVar5;
        do {
          bVar8 = (byte)uVar11 & 0x7f | (0x7f < uVar11) << 7;
          bVar7 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar7 < '\0') {
            uVar12 = unaff_x19[1];
            uVar15 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar13 = uVar15 - 1;
            if (uVar13 == uVar12) {
              if (uVar15 == 0x7ffffffffffffff7) {
code_r0x006b0e18:
                func_0x0001748c();
                auVar16 = func_0x0001748c(unaff_x22);
                *(int *)(auVar16._0_8_ + 0x1c) = auVar16._8_4_;
                return;
              }
              plVar14 = (long *)*unaff_x19;
              unaff_x22 = (long *)0x7ffffffffffffff7;
              if (uVar13 < 0x3ffffffffffffff3) goto code_r0x006b0d40;
              goto code_r0x006b0d68;
            }
            plVar14 = (long *)*unaff_x19;
code_r0x006b0da4:
            *(byte *)((long)plVar14 + uVar12) = bVar8;
            lVar9 = uVar12 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar10 = (undefined1 *)((long)plVar14 + lVar9);
            }
          }
          else {
            uVar12 = (ulong)bVar7;
            plVar14 = unaff_x19;
            if (bVar7 != 0x16) goto code_r0x006b0da4;
            uVar15 = 0x17;
            uVar13 = 0x16;
code_r0x006b0d40:
            uVar12 = uVar15;
            if (uVar15 <= uVar13 * 2) {
              uVar12 = uVar13 * 2;
            }
            uVar2 = (uVar12 & 0x7ffffffffffffff8) + 8;
            if ((uVar12 | 7) != 0x17) {
              uVar2 = uVar12 | 7;
            }
            unaff_x22 = (long *)((long)&MACH_HEADER.sizeofcmds + 3);
            if (0x16 < uVar12) {
              unaff_x22 = (long *)(uVar2 + 1);
            }
code_r0x006b0d68:
            lVar9 = __Znwm(unaff_x22);
            if (uVar13 != 0) {
              _memmove(lVar9,plVar14,uVar13);
            }
            *(byte *)(lVar9 + uVar13) = bVar8;
            if (uVar13 != 0x16) {
              __ZdlPv(plVar14);
            }
            unaff_x19[1] = uVar15;
            unaff_x19[2] = (ulong)unaff_x22 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar10 = (undefined1 *)(lVar9 + uVar15);
          }
          *puVar10 = 0;
          bVar1 = 0x7f < uVar11;
          uVar11 = uVar11 >> 7;
        } while (bVar1);
        puVar5 = puVar5 + 1;
      } while( true );
    }
    if (*piVar4 == 0) {
      bStack0000000000000038 = 0;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      if (*(long *)(unaff_x20 + 0x1c0) != *(long *)(unaff_x20 + 0x1c8)) goto LAB_006b07f8;
      goto LAB_006b07ec;
    }
    piVar4 = piVar4 + 1;
  } while( true );
}

