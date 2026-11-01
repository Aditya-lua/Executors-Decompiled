
void thunk_FUN_006b0890(void)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  byte bVar5;
  long lVar6;
  undefined1 *puVar7;
  ulong uVar8;
  long *unaff_x19;
  long unaff_x20;
  uint uVar9;
  uint *unaff_x21;
  ulong uVar10;
  long *plVar11;
  long *unaff_x22;
  uint *puVar12;
  ulong uVar13;
  ulong unaff_x26;
  undefined1 auVar14 [12];
  uint *in_stack_00000028;
  uint *puStack0000000000000030;
  
  do {
    uVar9 = *unaff_x21;
    puStack0000000000000030 = unaff_x21;
    do {
      bVar5 = (byte)uVar9 & 0x7f | (0x7f < uVar9) << 7;
      bVar4 = *(byte *)((long)unaff_x19 + 0x17);
      if ((char)bVar4 < '\0') {
        uVar8 = unaff_x19[1];
        uVar13 = unaff_x19[2] & 0x7fffffffffffffff;
        uVar10 = uVar13 - 1;
        if (uVar10 != uVar8) {
          plVar11 = (long *)*unaff_x19;
          goto LAB_006b099c;
        }
        if (uVar13 == 0x7ffffffffffffff7) goto LAB_006b0e18;
        unaff_x22 = (long *)*unaff_x19;
        uVar8 = 0x7ffffffffffffff7;
        if (uVar10 < 0x3ffffffffffffff3) goto LAB_006b0938;
LAB_006b0960:
        lVar6 = __Znwm(uVar8);
        if (uVar10 != 0) {
          _memmove(lVar6,unaff_x22,uVar10);
        }
        *(byte *)(lVar6 + uVar10) = bVar5;
        if (uVar10 != 0x16) {
          __ZdlPv(unaff_x22);
        }
        unaff_x19[1] = uVar13;
        unaff_x19[2] = uVar8 | 0x8000000000000000;
        *unaff_x19 = lVar6;
        puVar7 = (undefined1 *)(lVar6 + uVar13);
      }
      else {
        uVar8 = (ulong)bVar4;
        plVar11 = unaff_x19;
        if (bVar4 == 0x16) {
          uVar13 = 0x17;
          uVar10 = 0x16;
          unaff_x22 = unaff_x19;
LAB_006b0938:
          uVar3 = uVar13;
          if (uVar13 <= uVar10 * 2) {
            uVar3 = uVar10 * 2;
          }
          uVar2 = (uVar3 & 0x7ffffffffffffff8) + 8;
          if ((uVar3 | 7) != 0x17) {
            uVar2 = uVar3 | 7;
          }
          uVar8 = unaff_x26;
          if (0x16 < uVar3) {
            uVar8 = uVar2 + 1;
          }
          goto LAB_006b0960;
        }
LAB_006b099c:
        *(byte *)((long)plVar11 + uVar8) = bVar5;
        lVar6 = uVar8 + 1;
        if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
          unaff_x19[1] = lVar6;
          puVar7 = (undefined1 *)((long)plVar11 + lVar6);
        }
        else {
          *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar6 & 0x7f;
          puVar7 = (undefined1 *)((long)plVar11 + lVar6);
        }
      }
      *puVar7 = 0;
      bVar1 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar1);
    uVar9 = puStack0000000000000030[2];
    do {
      bVar5 = (byte)uVar9 & 0x7f | (0x7f < uVar9) << 7;
      bVar4 = *(byte *)((long)unaff_x19 + 0x17);
      if ((char)bVar4 < '\0') {
        uVar8 = unaff_x19[1];
        uVar13 = unaff_x19[2] & 0x7fffffffffffffff;
        uVar10 = uVar13 - 1;
        if (uVar10 != uVar8) {
          plVar11 = (long *)*unaff_x19;
          goto code_r0x006b0ad4;
        }
        if (uVar13 == 0x7ffffffffffffff7) goto LAB_006b0e18;
        unaff_x22 = (long *)*unaff_x19;
        uVar8 = 0x7ffffffffffffff7;
        if (uVar10 < 0x3ffffffffffffff3) goto code_r0x006b0a70;
code_r0x006b0a98:
        lVar6 = __Znwm(uVar8);
        if (uVar10 != 0) {
          _memmove(lVar6,unaff_x22,uVar10);
        }
        *(byte *)(lVar6 + uVar10) = bVar5;
        if (uVar10 != 0x16) {
          __ZdlPv(unaff_x22);
        }
        unaff_x19[1] = uVar13;
        unaff_x19[2] = uVar8 | 0x8000000000000000;
        *unaff_x19 = lVar6;
        puVar7 = (undefined1 *)(lVar6 + uVar13);
      }
      else {
        uVar8 = (ulong)bVar4;
        plVar11 = unaff_x19;
        if (bVar4 == 0x16) {
          uVar13 = 0x17;
          uVar10 = 0x16;
          unaff_x22 = unaff_x19;
code_r0x006b0a70:
          uVar3 = uVar13;
          if (uVar13 <= uVar10 * 2) {
            uVar3 = uVar10 * 2;
          }
          uVar2 = (uVar3 & 0x7ffffffffffffff8) + 8;
          if ((uVar3 | 7) != 0x17) {
            uVar2 = uVar3 | 7;
          }
          uVar8 = unaff_x26;
          if (0x16 < uVar3) {
            uVar8 = uVar2 + 1;
          }
          goto code_r0x006b0a98;
        }
code_r0x006b0ad4:
        *(byte *)((long)plVar11 + uVar8) = bVar5;
        lVar6 = uVar8 + 1;
        if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
          unaff_x19[1] = lVar6;
          puVar7 = (undefined1 *)((long)plVar11 + lVar6);
        }
        else {
          *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar6 & 0x7f;
          puVar7 = (undefined1 *)((long)plVar11 + lVar6);
        }
      }
      *puVar7 = 0;
      bVar1 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar1);
    uVar9 = puStack0000000000000030[3];
    do {
      bVar5 = (byte)uVar9 & 0x7f | (0x7f < uVar9) << 7;
      bVar4 = *(byte *)((long)unaff_x19 + 0x17);
      if ((char)bVar4 < '\0') {
        uVar8 = unaff_x19[1];
        uVar13 = unaff_x19[2] & 0x7fffffffffffffff;
        uVar10 = uVar13 - 1;
        if (uVar10 != uVar8) {
          plVar11 = (long *)*unaff_x19;
          goto code_r0x006b0c0c;
        }
        if (uVar13 == 0x7ffffffffffffff7) goto LAB_006b0e18;
        unaff_x22 = (long *)*unaff_x19;
        uVar8 = 0x7ffffffffffffff7;
        if (uVar10 < 0x3ffffffffffffff3) goto code_r0x006b0ba8;
code_r0x006b0bd0:
        lVar6 = __Znwm(uVar8);
        if (uVar10 != 0) {
          _memmove(lVar6,unaff_x22,uVar10);
        }
        *(byte *)(lVar6 + uVar10) = bVar5;
        if (uVar10 != 0x16) {
          __ZdlPv(unaff_x22);
        }
        unaff_x19[1] = uVar13;
        unaff_x19[2] = uVar8 | 0x8000000000000000;
        *unaff_x19 = lVar6;
        puVar7 = (undefined1 *)(lVar6 + uVar13);
      }
      else {
        uVar8 = (ulong)bVar4;
        plVar11 = unaff_x19;
        if (bVar4 == 0x16) {
          uVar13 = 0x17;
          uVar10 = 0x16;
          unaff_x22 = unaff_x19;
code_r0x006b0ba8:
          uVar3 = uVar13;
          if (uVar13 <= uVar10 * 2) {
            uVar3 = uVar10 * 2;
          }
          uVar2 = (uVar3 & 0x7ffffffffffffff8) + 8;
          if ((uVar3 | 7) != 0x17) {
            uVar2 = uVar3 | 7;
          }
          uVar8 = unaff_x26;
          if (0x16 < uVar3) {
            uVar8 = uVar2 + 1;
          }
          goto code_r0x006b0bd0;
        }
code_r0x006b0c0c:
        *(byte *)((long)plVar11 + uVar8) = bVar5;
        lVar6 = uVar8 + 1;
        if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
          unaff_x19[1] = lVar6;
          puVar7 = (undefined1 *)((long)plVar11 + lVar6);
        }
        else {
          *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar6 & 0x7f;
          puVar7 = (undefined1 *)((long)plVar11 + lVar6);
        }
      }
      puVar12 = puStack0000000000000030;
      *puVar7 = 0;
      bVar1 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar1);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_x21 = puVar12 + 4;
  } while (unaff_x21 != in_stack_00000028);
  uVar8 = (ulong)(*(long *)(unaff_x20 + 0x1e0) - *(long *)(unaff_x20 + 0x1d8)) >> 2;
  do {
    uVar9 = (uint)uVar8;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar8 = (ulong)(uVar9 >> 7);
  } while (0x7f < uVar9);
  puVar12 = *(uint **)(unaff_x20 + 0x1d8);
  puStack0000000000000030 = *(uint **)(unaff_x20 + 0x1e0);
  if (puVar12 != puStack0000000000000030) {
    do {
      uVar9 = *puVar12;
      do {
        bVar5 = (byte)uVar9 & 0x7f | (0x7f < uVar9) << 7;
        bVar4 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar4 < '\0') {
          uVar8 = unaff_x19[1];
          uVar13 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar10 = uVar13 - 1;
          if (uVar10 != uVar8) {
            plVar11 = (long *)*unaff_x19;
            goto code_r0x006b0da4;
          }
          if (uVar13 == 0x7ffffffffffffff7) {
LAB_006b0e18:
            func_0x0001748c();
            auVar14 = func_0x0001748c(unaff_x22);
            *(int *)(auVar14._0_8_ + 0x1c) = auVar14._8_4_;
            return;
          }
          plVar11 = (long *)*unaff_x19;
          unaff_x22 = (long *)0x7ffffffffffffff7;
          if (uVar10 < 0x3ffffffffffffff3) goto code_r0x006b0d40;
code_r0x006b0d68:
          lVar6 = __Znwm(unaff_x22);
          if (uVar10 != 0) {
            _memmove(lVar6,plVar11,uVar10);
          }
          *(byte *)(lVar6 + uVar10) = bVar5;
          if (uVar10 != 0x16) {
            __ZdlPv(plVar11);
          }
          unaff_x19[1] = uVar13;
          unaff_x19[2] = (ulong)unaff_x22 | 0x8000000000000000;
          *unaff_x19 = lVar6;
          puVar7 = (undefined1 *)(lVar6 + uVar13);
        }
        else {
          uVar8 = (ulong)bVar4;
          plVar11 = unaff_x19;
          if (bVar4 == 0x16) {
            uVar13 = 0x17;
            uVar10 = 0x16;
code_r0x006b0d40:
            uVar8 = uVar13;
            if (uVar13 <= uVar10 * 2) {
              uVar8 = uVar10 * 2;
            }
            uVar3 = (uVar8 & 0x7ffffffffffffff8) + 8;
            if ((uVar8 | 7) != 0x17) {
              uVar3 = uVar8 | 7;
            }
            unaff_x22 = (long *)((long)&MACH_HEADER.sizeofcmds + 3);
            if (0x16 < uVar8) {
              unaff_x22 = (long *)(uVar3 + 1);
            }
            goto code_r0x006b0d68;
          }
code_r0x006b0da4:
          *(byte *)((long)plVar11 + uVar8) = bVar5;
          lVar6 = uVar8 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar6;
            puVar7 = (undefined1 *)((long)plVar11 + lVar6);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar6 & 0x7f;
            puVar7 = (undefined1 *)((long)plVar11 + lVar6);
          }
        }
        *puVar7 = 0;
        bVar1 = 0x7f < uVar9;
        uVar9 = uVar9 >> 7;
      } while (bVar1);
      puVar12 = puVar12 + 1;
    } while (puVar12 != puStack0000000000000030);
  }
  return;
}

