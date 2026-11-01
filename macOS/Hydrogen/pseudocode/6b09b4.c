
void FUN_006b09b4(long *param_1)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  uint *puVar4;
  uint *puVar5;
  byte bVar6;
  byte bVar7;
  long lVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long in_x9;
  long *unaff_x19;
  long unaff_x20;
  uint uVar11;
  ulong uVar12;
  long *plVar13;
  long *unaff_x22;
  ulong uVar14;
  ulong unaff_x26;
  uint unaff_w27;
  undefined1 auVar15 [12];
  uint *in_stack_00000028;
  uint *in_stack_00000030;
  
  do {
    puVar9 = (undefined1 *)((long)param_1 + in_x9);
    uVar11 = unaff_w27;
LAB_006b08ac:
    *puVar9 = 0;
    unaff_w27 = uVar11 >> 7;
    if (uVar11 < 0x80) {
      uVar11 = in_stack_00000030[2];
      do {
        bVar7 = (byte)uVar11 & 0x7f | (0x7f < uVar11) << 7;
        bVar6 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar6 < '\0') {
          uVar10 = unaff_x19[1];
          uVar14 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar12 = uVar14 - 1;
          if (uVar12 == uVar10) {
            if (uVar14 != 0x7ffffffffffffff7) {
              unaff_x22 = (long *)*unaff_x19;
              uVar10 = 0x7ffffffffffffff7;
              if (uVar12 < 0x3ffffffffffffff3) goto code_r0x006b0a70;
              goto code_r0x006b0a98;
            }
            goto code_r0x006b0e18;
          }
          plVar13 = (long *)*unaff_x19;
code_r0x006b0ad4:
          *(byte *)((long)plVar13 + uVar10) = bVar7;
          lVar8 = uVar10 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar8;
            puVar9 = (undefined1 *)((long)plVar13 + lVar8);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar8 & 0x7f;
            puVar9 = (undefined1 *)((long)plVar13 + lVar8);
          }
        }
        else {
          uVar10 = (ulong)bVar6;
          plVar13 = unaff_x19;
          if (bVar6 != 0x16) goto code_r0x006b0ad4;
          uVar14 = 0x17;
          uVar12 = 0x16;
          unaff_x22 = unaff_x19;
code_r0x006b0a70:
          uVar3 = uVar14;
          if (uVar14 <= uVar12 * 2) {
            uVar3 = uVar12 * 2;
          }
          uVar2 = (uVar3 & 0x7ffffffffffffff8) + 8;
          if ((uVar3 | 7) != 0x17) {
            uVar2 = uVar3 | 7;
          }
          uVar10 = unaff_x26;
          if (0x16 < uVar3) {
            uVar10 = uVar2 + 1;
          }
code_r0x006b0a98:
          lVar8 = __Znwm(uVar10);
          if (uVar12 != 0) {
            _memmove(lVar8,unaff_x22,uVar12);
          }
          *(byte *)(lVar8 + uVar12) = bVar7;
          if (uVar12 != 0x16) {
            __ZdlPv(unaff_x22);
          }
          unaff_x19[1] = uVar14;
          unaff_x19[2] = uVar10 | 0x8000000000000000;
          *unaff_x19 = lVar8;
          puVar9 = (undefined1 *)(lVar8 + uVar14);
        }
        *puVar9 = 0;
        bVar1 = 0x7f < uVar11;
        uVar11 = uVar11 >> 7;
      } while (bVar1);
      uVar11 = in_stack_00000030[3];
      do {
        bVar7 = (byte)uVar11 & 0x7f | (0x7f < uVar11) << 7;
        bVar6 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar6 < '\0') {
          uVar10 = unaff_x19[1];
          uVar14 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar12 = uVar14 - 1;
          if (uVar12 == uVar10) {
            if (uVar14 != 0x7ffffffffffffff7) {
              unaff_x22 = (long *)*unaff_x19;
              uVar10 = 0x7ffffffffffffff7;
              if (uVar12 < 0x3ffffffffffffff3) goto code_r0x006b0ba8;
              goto code_r0x006b0bd0;
            }
            goto code_r0x006b0e18;
          }
          plVar13 = (long *)*unaff_x19;
code_r0x006b0c0c:
          *(byte *)((long)plVar13 + uVar10) = bVar7;
          lVar8 = uVar10 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar8;
            puVar9 = (undefined1 *)((long)plVar13 + lVar8);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar8 & 0x7f;
            puVar9 = (undefined1 *)((long)plVar13 + lVar8);
          }
        }
        else {
          uVar10 = (ulong)bVar6;
          plVar13 = unaff_x19;
          if (bVar6 != 0x16) goto code_r0x006b0c0c;
          uVar14 = 0x17;
          uVar12 = 0x16;
          unaff_x22 = unaff_x19;
code_r0x006b0ba8:
          uVar3 = uVar14;
          if (uVar14 <= uVar12 * 2) {
            uVar3 = uVar12 * 2;
          }
          uVar2 = (uVar3 & 0x7ffffffffffffff8) + 8;
          if ((uVar3 | 7) != 0x17) {
            uVar2 = uVar3 | 7;
          }
          uVar10 = unaff_x26;
          if (0x16 < uVar3) {
            uVar10 = uVar2 + 1;
          }
code_r0x006b0bd0:
          lVar8 = __Znwm(uVar10);
          if (uVar12 != 0) {
            _memmove(lVar8,unaff_x22,uVar12);
          }
          *(byte *)(lVar8 + uVar12) = bVar7;
          if (uVar12 != 0x16) {
            __ZdlPv(unaff_x22);
          }
          unaff_x19[1] = uVar14;
          unaff_x19[2] = uVar10 | 0x8000000000000000;
          *unaff_x19 = lVar8;
          puVar9 = (undefined1 *)(lVar8 + uVar14);
        }
        *puVar9 = 0;
        bVar1 = 0x7f < uVar11;
        uVar11 = uVar11 >> 7;
      } while (bVar1);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      in_stack_00000030 = in_stack_00000030 + 4;
      if (in_stack_00000030 == in_stack_00000028) {
        uVar10 = (ulong)(*(long *)(unaff_x20 + 0x1e0) - *(long *)(unaff_x20 + 0x1d8)) >> 2;
        do {
          uVar11 = (uint)uVar10;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          uVar10 = (ulong)(uVar11 >> 7);
        } while (0x7f < uVar11);
        puVar4 = *(uint **)(unaff_x20 + 0x1d8);
        puVar5 = *(uint **)(unaff_x20 + 0x1e0);
        do {
          if (puVar4 == puVar5) {
            return;
          }
          uVar11 = *puVar4;
          do {
            bVar7 = (byte)uVar11 & 0x7f | (0x7f < uVar11) << 7;
            bVar6 = *(byte *)((long)unaff_x19 + 0x17);
            if ((char)bVar6 < '\0') {
              uVar10 = unaff_x19[1];
              uVar14 = unaff_x19[2] & 0x7fffffffffffffff;
              uVar12 = uVar14 - 1;
              if (uVar12 == uVar10) {
                if (uVar14 != 0x7ffffffffffffff7) {
                  plVar13 = (long *)*unaff_x19;
                  unaff_x22 = (long *)0x7ffffffffffffff7;
                  if (uVar12 < 0x3ffffffffffffff3) goto code_r0x006b0d40;
                  goto code_r0x006b0d68;
                }
code_r0x006b0e18:
                func_0x0001748c();
                auVar15 = func_0x0001748c(unaff_x22);
                *(int *)(auVar15._0_8_ + 0x1c) = auVar15._8_4_;
                return;
              }
              plVar13 = (long *)*unaff_x19;
code_r0x006b0da4:
              *(byte *)((long)plVar13 + uVar10) = bVar7;
              lVar8 = uVar10 + 1;
              if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
                unaff_x19[1] = lVar8;
                puVar9 = (undefined1 *)((long)plVar13 + lVar8);
              }
              else {
                *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar8 & 0x7f;
                puVar9 = (undefined1 *)((long)plVar13 + lVar8);
              }
            }
            else {
              uVar10 = (ulong)bVar6;
              plVar13 = unaff_x19;
              if (bVar6 != 0x16) goto code_r0x006b0da4;
              uVar14 = 0x17;
              uVar12 = 0x16;
code_r0x006b0d40:
              uVar10 = uVar14;
              if (uVar14 <= uVar12 * 2) {
                uVar10 = uVar12 * 2;
              }
              uVar3 = (uVar10 & 0x7ffffffffffffff8) + 8;
              if ((uVar10 | 7) != 0x17) {
                uVar3 = uVar10 | 7;
              }
              unaff_x22 = (long *)((long)&MACH_HEADER.sizeofcmds + 3);
              if (0x16 < uVar10) {
                unaff_x22 = (long *)(uVar3 + 1);
              }
code_r0x006b0d68:
              lVar8 = __Znwm(unaff_x22);
              if (uVar12 != 0) {
                _memmove(lVar8,plVar13,uVar12);
              }
              *(byte *)(lVar8 + uVar12) = bVar7;
              if (uVar12 != 0x16) {
                __ZdlPv(plVar13);
              }
              unaff_x19[1] = uVar14;
              unaff_x19[2] = (ulong)unaff_x22 | 0x8000000000000000;
              *unaff_x19 = lVar8;
              puVar9 = (undefined1 *)(lVar8 + uVar14);
            }
            *puVar9 = 0;
            bVar1 = 0x7f < uVar11;
            uVar11 = uVar11 >> 7;
          } while (bVar1);
          puVar4 = puVar4 + 1;
        } while( true );
      }
      unaff_w27 = *in_stack_00000030;
    }
    bVar7 = (byte)unaff_w27 & 0x7f | (0x7f < unaff_w27) << 7;
    bVar6 = *(byte *)((long)unaff_x19 + 0x17);
    uVar11 = unaff_w27;
    if (-1 < (char)bVar6) {
      uVar10 = (ulong)bVar6;
      param_1 = unaff_x19;
      if (bVar6 != 0x16) goto code_r0x006b099c;
      uVar14 = 0x17;
      uVar12 = 0x16;
      unaff_x22 = unaff_x19;
code_r0x006b0938:
      uVar3 = uVar14;
      if (uVar14 <= uVar12 * 2) {
        uVar3 = uVar12 * 2;
      }
      uVar2 = (uVar3 & 0x7ffffffffffffff8) + 8;
      if ((uVar3 | 7) != 0x17) {
        uVar2 = uVar3 | 7;
      }
      uVar10 = unaff_x26;
      if (0x16 < uVar3) {
        uVar10 = uVar2 + 1;
      }
code_r0x006b0960:
      lVar8 = __Znwm(uVar10);
      if (uVar12 != 0) {
        _memmove(lVar8,unaff_x22,uVar12);
      }
      *(byte *)(lVar8 + uVar12) = bVar7;
      if (uVar12 != 0x16) {
        __ZdlPv(unaff_x22);
      }
      unaff_x19[1] = uVar14;
      unaff_x19[2] = uVar10 | 0x8000000000000000;
      *unaff_x19 = lVar8;
      puVar9 = (undefined1 *)(lVar8 + uVar14);
      goto LAB_006b08ac;
    }
    uVar10 = unaff_x19[1];
    uVar14 = unaff_x19[2] & 0x7fffffffffffffff;
    uVar12 = uVar14 - 1;
    if (uVar12 == uVar10) {
      if (uVar14 != 0x7ffffffffffffff7) {
        unaff_x22 = (long *)*unaff_x19;
        uVar10 = 0x7ffffffffffffff7;
        if (uVar12 < 0x3ffffffffffffff3) goto code_r0x006b0938;
        goto code_r0x006b0960;
      }
      goto code_r0x006b0e18;
    }
    param_1 = (long *)*unaff_x19;
code_r0x006b099c:
    *(byte *)((long)param_1 + uVar10) = bVar7;
    in_x9 = uVar10 + 1;
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
      unaff_x19[1] = in_x9;
      puVar9 = (undefined1 *)((long)param_1 + in_x9);
      goto LAB_006b08ac;
    }
    *(byte *)((long)unaff_x19 + 0x17) = (byte)in_x9 & 0x7f;
  } while( true );
}

