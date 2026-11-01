
void FUN_006afb8c(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  int *piVar3;
  undefined4 *puVar4;
  uint *puVar5;
  byte bVar6;
  byte bVar7;
  bool bVar8;
  long lVar9;
  long lVar10;
  long *plVar11;
  undefined4 *puVar12;
  undefined1 *puVar13;
  ulong uVar14;
  long *unaff_x19;
  long unaff_x20;
  undefined1 uVar15;
  uint unaff_w21;
  uint uVar16;
  uint *puVar17;
  long *unaff_x22;
  ulong unaff_x23;
  ulong uVar18;
  long *unaff_x24;
  ulong unaff_x25;
  ulong uVar19;
  ulong unaff_x27;
  ulong uVar20;
  uint unaff_w28;
  undefined1 auVar21 [12];
  long in_stack_00000010;
  ulong in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  
code_r0x006afb8c:
  uVar15 = (undefined1)unaff_w21;
  if (param_1 <= unaff_x23) goto LAB_006afbc0;
code_r0x006afb94:
  uVar15 = (undefined1)unaff_w21;
  uVar14 = unaff_x27;
  if (unaff_x27 <= unaff_x23 * 2) {
    uVar14 = unaff_x23 * 2;
  }
  uVar18 = (uVar14 & 0x7ffffffffffffff8) + 8;
  if ((uVar14 | 7) != 0x17) {
    uVar18 = uVar14 | 7;
  }
  unaff_x25 = 0x17;
  if (0x16 < uVar14) {
    unaff_x25 = uVar18 + 1;
  }
LAB_006afbc0:
  lVar9 = __Znwm(unaff_x25);
  if (unaff_x23 != 0) {
    _memmove(lVar9,unaff_x24,unaff_x23);
  }
  *(undefined1 *)(lVar9 + unaff_x23) = uVar15;
  if (unaff_x23 != 0x16) {
    __ZdlPv(unaff_x24);
  }
  *(long *)(unaff_x20 + 0x308) = lVar9;
  *(ulong *)(unaff_x20 + 0x318) = unaff_x25 | 0x8000000000000000;
  *(ulong *)(unaff_x20 + 0x310) = unaff_x27;
  puVar13 = (undefined1 *)(lVar9 + unaff_x27);
  uVar16 = unaff_w28;
code_r0x006afb04:
  *puVar13 = 0;
  unaff_w28 = uVar16 >> 7;
  if (0x7f < uVar16) {
code_r0x006afb18:
    unaff_w21 = unaff_w28 & 0x7f | (uint)(0x7f < unaff_w28) << 7;
    bVar6 = *(byte *)(unaff_x20 + 799);
    if ((char)bVar6 < '\0') {
      unaff_x27 = *(ulong *)(unaff_x20 + 0x318) & 0x7fffffffffffffff;
      unaff_x23 = unaff_x27 - 1;
      uVar14 = *(ulong *)(unaff_x20 + 0x310);
      if (unaff_x23 == uVar14) {
        if (unaff_x27 == 0x7ffffffffffffff7) goto code_r0x006b0e20;
        unaff_x24 = (long *)*unaff_x22;
        unaff_x25 = 0x7ffffffffffffff7;
        param_1 = 0x3ffffffffffffff3;
        goto code_r0x006afb8c;
      }
      plVar11 = (long *)*unaff_x22;
code_r0x006afbfc:
      *(char *)((long)plVar11 + uVar14) = (char)unaff_w21;
      lVar9 = uVar14 + 1;
      uVar16 = unaff_w28;
      if (*(char *)(unaff_x20 + 799) < '\0') {
        *(long *)(unaff_x20 + 0x310) = lVar9;
        puVar13 = (undefined1 *)((long)plVar11 + lVar9);
      }
      else {
        *(byte *)(unaff_x20 + 799) = (byte)lVar9 & 0x7f;
        puVar13 = (undefined1 *)((long)plVar11 + lVar9);
      }
      goto code_r0x006afb04;
    }
    uVar14 = (ulong)bVar6;
    plVar11 = unaff_x22;
    if (bVar6 != 0x16) goto code_r0x006afbfc;
    unaff_x27 = 0x17;
    unaff_x23 = 0x16;
    unaff_x24 = unaff_x22;
    goto code_r0x006afb94;
  }
  uVar16 = *(int *)(in_stack_00000030 + 0xc) - *(int *)(in_stack_00000030 + 8);
  do {
    bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
    bVar6 = *(byte *)(unaff_x20 + 799);
    if ((char)bVar6 < '\0') {
      uVar20 = *(ulong *)(unaff_x20 + 0x318) & 0x7fffffffffffffff;
      uVar18 = uVar20 - 1;
      uVar14 = *(ulong *)(unaff_x20 + 0x310);
      if (uVar18 != uVar14) {
        plVar11 = (long *)*unaff_x22;
        goto code_r0x006afd44;
      }
      if (uVar20 == 0x7ffffffffffffff7) goto code_r0x006b0e20;
      plVar11 = (long *)*unaff_x22;
      uVar14 = 0x7ffffffffffffff7;
      if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006afcdc;
code_r0x006afd08:
      lVar9 = __Znwm(uVar14);
      if (uVar18 != 0) {
        _memmove(lVar9,plVar11,uVar18);
      }
      *(byte *)(lVar9 + uVar18) = bVar7;
      if (uVar18 != 0x16) {
        __ZdlPv(plVar11);
      }
      *(long *)(unaff_x20 + 0x308) = lVar9;
      *(ulong *)(unaff_x20 + 0x318) = uVar14 | 0x8000000000000000;
      *(ulong *)(unaff_x20 + 0x310) = uVar20;
      puVar13 = (undefined1 *)(lVar9 + uVar20);
    }
    else {
      uVar14 = (ulong)bVar6;
      plVar11 = unaff_x22;
      if (bVar6 == 0x16) {
        uVar20 = 0x17;
        uVar18 = 0x16;
code_r0x006afcdc:
        uVar19 = uVar20;
        if (uVar20 <= uVar18 * 2) {
          uVar19 = uVar18 * 2;
        }
        uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
        if ((uVar19 | 7) != 0x17) {
          uVar2 = uVar19 | 7;
        }
        uVar14 = 0x17;
        if (0x16 < uVar19) {
          uVar14 = uVar2 + 1;
        }
        goto code_r0x006afd08;
      }
code_r0x006afd44:
      *(byte *)((long)plVar11 + uVar14) = bVar7;
      lVar9 = uVar14 + 1;
      if (*(char *)(unaff_x20 + 799) < '\0') {
        *(long *)(unaff_x20 + 0x310) = lVar9;
        puVar13 = (undefined1 *)((long)plVar11 + lVar9);
      }
      else {
        *(byte *)(unaff_x20 + 799) = (byte)lVar9 & 0x7f;
        puVar13 = (undefined1 *)((long)plVar11 + lVar9);
      }
    }
    *puVar13 = 0;
    bVar8 = 0x7f < uVar16;
    uVar16 = uVar16 >> 7;
  } while (bVar8);
  if (in_stack_00000030 + 0x10 != in_stack_00000028) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_w28 = *(uint *)(in_stack_00000030 + 0x18);
    in_stack_00000030 = in_stack_00000030 + 0x10;
    goto code_r0x006afb18;
  }
  if ((char)*(byte *)(unaff_x20 + 799) < '\0') {
    uVar14 = *(ulong *)(unaff_x20 + 0x310);
  }
  else {
    uVar14 = (ulong)*(byte *)(unaff_x20 + 799);
  }
  do {
    uVar16 = (uint)uVar14;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar14 = (ulong)(uVar16 >> 7);
  } while (0x7f < uVar16);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar14 = (ulong)(*(long *)(unaff_x20 + 0x30) - *(long *)(unaff_x20 + 0x28)) >> 2;
  do {
    uVar16 = (uint)uVar14;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar14 = (ulong)(uVar16 >> 7);
  } while (0x7f < uVar16);
  unaff_x22 = *(long **)(unaff_x20 + 0x30);
  for (plVar11 = *(long **)(unaff_x20 + 0x28); plVar11 != unaff_x22;
      plVar11 = (long *)((long)plVar11 + 4)) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  }
  uVar16 = (int)((ulong)(*(long *)(unaff_x20 + 0x60) - *(long *)(unaff_x20 + 0x58)) >> 3) *
           -0x55555555;
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar8 = 0x7f < uVar16;
    uVar16 = uVar16 >> 7;
  } while (bVar8);
  puVar4 = *(undefined4 **)(unaff_x20 + 0x60);
  for (puVar12 = *(undefined4 **)(unaff_x20 + 0x58); puVar12 != puVar4; puVar12 = puVar12 + 6) {
    switch(*puVar12) {
    case 0:
      break;
    case 1:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      break;
    case 2:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      break;
    case 3:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      break;
    case 4:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar16 = puVar12[2];
      do {
        bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
        bVar6 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar6 < '\0') {
          uVar14 = unaff_x19[1];
          uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar18 = uVar20 - 1;
          if (uVar18 != uVar14) {
            plVar11 = (long *)*unaff_x19;
            goto code_r0x006b0118;
          }
          if (uVar20 != 0x7ffffffffffffff7) {
            unaff_x22 = (long *)*unaff_x19;
            uVar14 = 0x7ffffffffffffff7;
            if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b00b0;
            goto code_r0x006b00dc;
          }
          goto code_r0x006b0e18;
        }
        uVar14 = (ulong)bVar6;
        plVar11 = unaff_x19;
        if (bVar6 == 0x16) {
          uVar20 = 0x17;
          uVar18 = 0x16;
          unaff_x22 = unaff_x19;
code_r0x006b00b0:
          uVar19 = uVar20;
          if (uVar20 <= uVar18 * 2) {
            uVar19 = uVar18 * 2;
          }
          uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
          if ((uVar19 | 7) != 0x17) {
            uVar2 = uVar19 | 7;
          }
          uVar14 = 0x17;
          if (0x16 < uVar19) {
            uVar14 = uVar2 + 1;
          }
code_r0x006b00dc:
          lVar9 = __Znwm(uVar14);
          if (uVar18 != 0) {
            _memmove(lVar9,unaff_x22,uVar18);
          }
          *(byte *)(lVar9 + uVar18) = bVar7;
          if (uVar18 != 0x16) {
            __ZdlPv(unaff_x22);
          }
          unaff_x19[1] = uVar20;
          unaff_x19[2] = uVar14 | 0x8000000000000000;
          *unaff_x19 = lVar9;
          puVar13 = (undefined1 *)(lVar9 + uVar20);
        }
        else {
code_r0x006b0118:
          *(byte *)((long)plVar11 + uVar14) = bVar7;
          lVar9 = uVar14 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar9;
            puVar13 = (undefined1 *)((long)plVar11 + lVar9);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
            puVar13 = (undefined1 *)((long)plVar11 + lVar9);
          }
        }
        *puVar13 = 0;
        bVar8 = 0x7f < uVar16;
        uVar16 = uVar16 >> 7;
      } while (bVar8);
      goto code_r0x006afed4;
    case 5:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      break;
    case 6:
      lVar9 = *(long *)(unaff_x20 + 0xa0) + (ulong)(uint)puVar12[2] * 0x84;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      puVar17 = (uint *)(lVar9 + 0x80);
      uVar16 = *puVar17;
      do {
        bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
        bVar6 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar6 < '\0') {
          uVar14 = unaff_x19[1];
          uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar18 = uVar20 - 1;
          if (uVar18 != uVar14) {
            plVar11 = (long *)*unaff_x19;
            goto code_r0x006b0284;
          }
          if (uVar20 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
          unaff_x22 = (long *)*unaff_x19;
          uVar14 = 0x7ffffffffffffff7;
          if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b021c;
code_r0x006b0248:
          lVar10 = __Znwm(uVar14);
          if (uVar18 != 0) {
            _memmove(lVar10,unaff_x22,uVar18);
          }
          *(byte *)(lVar10 + uVar18) = bVar7;
          if (uVar18 != 0x16) {
            __ZdlPv(unaff_x22);
          }
          unaff_x19[1] = uVar20;
          unaff_x19[2] = uVar14 | 0x8000000000000000;
          *unaff_x19 = lVar10;
          puVar13 = (undefined1 *)(lVar10 + uVar20);
        }
        else {
          uVar14 = (ulong)bVar6;
          plVar11 = unaff_x19;
          if (bVar6 == 0x16) {
            uVar20 = 0x17;
            uVar18 = 0x16;
            unaff_x22 = unaff_x19;
code_r0x006b021c:
            uVar19 = uVar20;
            if (uVar20 <= uVar18 * 2) {
              uVar19 = uVar18 * 2;
            }
            uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
            if ((uVar19 | 7) != 0x17) {
              uVar2 = uVar19 | 7;
            }
            uVar14 = 0x17;
            if (0x16 < uVar19) {
              uVar14 = uVar2 + 1;
            }
            goto code_r0x006b0248;
          }
code_r0x006b0284:
          *(byte *)((long)plVar11 + uVar14) = bVar7;
          lVar10 = uVar14 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar10;
            puVar13 = (undefined1 *)((long)plVar11 + lVar10);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar10 & 0x7f;
            puVar13 = (undefined1 *)((long)plVar11 + lVar10);
          }
        }
        *puVar13 = 0;
        bVar8 = 0x7f < uVar16;
        uVar16 = uVar16 >> 7;
      } while (bVar8);
      if (*puVar17 != 0) {
        uVar14 = 0;
        do {
          uVar16 = *(uint *)(lVar9 + uVar14 * 4);
          do {
            bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
            bVar6 = *(byte *)((long)unaff_x19 + 0x17);
            if ((char)bVar6 < '\0') {
              uVar18 = unaff_x19[1];
              uVar19 = unaff_x19[2] & 0x7fffffffffffffff;
              uVar20 = uVar19 - 1;
              if (uVar20 != uVar18) {
                plVar11 = (long *)*unaff_x19;
                goto code_r0x006b053c;
              }
              if (uVar19 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
              unaff_x22 = (long *)*unaff_x19;
              uVar18 = 0x7ffffffffffffff7;
              if (uVar20 < 0x3ffffffffffffff3) goto code_r0x006b04d4;
code_r0x006b0500:
              lVar10 = __Znwm(uVar18);
              if (uVar20 != 0) {
                _memmove(lVar10,unaff_x22,uVar20);
              }
              *(byte *)(lVar10 + uVar20) = bVar7;
              if (uVar20 != 0x16) {
                __ZdlPv(unaff_x22);
              }
              unaff_x19[1] = uVar19;
              unaff_x19[2] = uVar18 | 0x8000000000000000;
              *unaff_x19 = lVar10;
              puVar13 = (undefined1 *)(lVar10 + uVar19);
            }
            else {
              uVar18 = (ulong)bVar6;
              plVar11 = unaff_x19;
              if (bVar6 == 0x16) {
                uVar19 = 0x17;
                uVar20 = 0x16;
                unaff_x22 = unaff_x19;
code_r0x006b04d4:
                uVar2 = uVar19;
                if (uVar19 <= uVar20 * 2) {
                  uVar2 = uVar20 * 2;
                }
                uVar1 = (uVar2 & 0x7ffffffffffffff8) + 8;
                if ((uVar2 | 7) != 0x17) {
                  uVar1 = uVar2 | 7;
                }
                uVar18 = 0x17;
                if (0x16 < uVar2) {
                  uVar18 = uVar1 + 1;
                }
                goto code_r0x006b0500;
              }
code_r0x006b053c:
              *(byte *)((long)plVar11 + uVar18) = bVar7;
              lVar10 = uVar18 + 1;
              if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
                unaff_x19[1] = lVar10;
                puVar13 = (undefined1 *)((long)plVar11 + lVar10);
              }
              else {
                *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar10 & 0x7f;
                puVar13 = (undefined1 *)((long)plVar11 + lVar10);
              }
            }
            *puVar13 = 0;
            bVar8 = 0x7f < uVar16;
            uVar16 = uVar16 >> 7;
          } while (bVar8);
          uVar14 = uVar14 + 1;
        } while (uVar14 < *puVar17);
      }
      goto code_r0x006afed4;
    case 7:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar16 = puVar12[2];
      do {
        bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
        bVar6 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar6 < '\0') {
          uVar14 = unaff_x19[1];
          uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar18 = uVar20 - 1;
          if (uVar18 != uVar14) {
            plVar11 = (long *)*unaff_x19;
            goto code_r0x006b03d8;
          }
          if (uVar20 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
          unaff_x22 = (long *)*unaff_x19;
          uVar14 = 0x7ffffffffffffff7;
          if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0370;
code_r0x006b039c:
          lVar9 = __Znwm(uVar14);
          if (uVar18 != 0) {
            _memmove(lVar9,unaff_x22,uVar18);
          }
          *(byte *)(lVar9 + uVar18) = bVar7;
          if (uVar18 != 0x16) {
            __ZdlPv(unaff_x22);
          }
          unaff_x19[1] = uVar20;
          unaff_x19[2] = uVar14 | 0x8000000000000000;
          *unaff_x19 = lVar9;
          puVar13 = (undefined1 *)(lVar9 + uVar20);
        }
        else {
          uVar14 = (ulong)bVar6;
          plVar11 = unaff_x19;
          if (bVar6 == 0x16) {
            uVar20 = 0x17;
            uVar18 = 0x16;
            unaff_x22 = unaff_x19;
code_r0x006b0370:
            uVar19 = uVar20;
            if (uVar20 <= uVar18 * 2) {
              uVar19 = uVar18 * 2;
            }
            uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
            if ((uVar19 | 7) != 0x17) {
              uVar2 = uVar19 | 7;
            }
            uVar14 = 0x17;
            if (0x16 < uVar19) {
              uVar14 = uVar2 + 1;
            }
            goto code_r0x006b039c;
          }
code_r0x006b03d8:
          *(byte *)((long)plVar11 + uVar14) = bVar7;
          lVar9 = uVar14 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar9;
            puVar13 = (undefined1 *)((long)plVar11 + lVar9);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
            puVar13 = (undefined1 *)((long)plVar11 + lVar9);
          }
        }
        *puVar13 = 0;
        bVar8 = 0x7f < uVar16;
        uVar16 = uVar16 >> 7;
      } while (bVar8);
    default:
      goto code_r0x006afed4;
    }
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
code_r0x006afed4:
  }
  uVar14 = (ulong)(*(long *)(unaff_x20 + 0x78) - *(long *)(unaff_x20 + 0x70)) >> 2;
  do {
    uVar16 = (uint)uVar14;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar14 = (ulong)(uVar16 >> 7);
  } while (0x7f < uVar16);
  puVar5 = *(uint **)(unaff_x20 + 0x78);
  for (puVar17 = *(uint **)(unaff_x20 + 0x70); puVar17 != puVar5; puVar17 = puVar17 + 1) {
    uVar16 = *puVar17;
    do {
      bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
      bVar6 = *(byte *)((long)unaff_x19 + 0x17);
      if ((char)bVar6 < '\0') {
        uVar14 = unaff_x19[1];
        uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
        uVar18 = uVar20 - 1;
        if (uVar18 != uVar14) {
          plVar11 = (long *)*unaff_x19;
          goto code_r0x006b06cc;
        }
        if (uVar20 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
        unaff_x22 = (long *)*unaff_x19;
        uVar14 = 0x7ffffffffffffff7;
        if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0664;
code_r0x006b0690:
        lVar9 = __Znwm(uVar14);
        if (uVar18 != 0) {
          _memmove(lVar9,unaff_x22,uVar18);
        }
        *(byte *)(lVar9 + uVar18) = bVar7;
        if (uVar18 != 0x16) {
          __ZdlPv(unaff_x22);
        }
        unaff_x19[1] = uVar20;
        unaff_x19[2] = uVar14 | 0x8000000000000000;
        *unaff_x19 = lVar9;
        puVar13 = (undefined1 *)(lVar9 + uVar20);
      }
      else {
        uVar14 = (ulong)bVar6;
        plVar11 = unaff_x19;
        if (bVar6 == 0x16) {
          uVar20 = 0x17;
          uVar18 = 0x16;
          unaff_x22 = unaff_x19;
code_r0x006b0664:
          uVar19 = uVar20;
          if (uVar20 <= uVar18 * 2) {
            uVar19 = uVar18 * 2;
          }
          uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
          if ((uVar19 | 7) != 0x17) {
            uVar2 = uVar19 | 7;
          }
          uVar14 = 0x17;
          if (0x16 < uVar19) {
            uVar14 = uVar2 + 1;
          }
          goto code_r0x006b0690;
        }
code_r0x006b06cc:
        *(byte *)((long)plVar11 + uVar14) = bVar7;
        lVar9 = uVar14 + 1;
        if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
          unaff_x19[1] = lVar9;
          puVar13 = (undefined1 *)((long)plVar11 + lVar9);
        }
        else {
          *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
          puVar13 = (undefined1 *)((long)plVar11 + lVar9);
        }
      }
      *puVar13 = 0;
      bVar8 = 0x7f < uVar16;
      uVar16 = uVar16 >> 7;
    } while (bVar8);
  }
  uVar16 = *(uint *)(in_stack_00000010 + (in_stack_00000020 & 0xffffffff) * 0x88 + 0x20);
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar8 = 0x7f < uVar16;
    uVar16 = uVar16 >> 7;
  } while (bVar8);
  uVar16 = *(uint *)(in_stack_00000010 + (in_stack_00000020 & 0xffffffff) * 0x88 + 0x1c);
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar8 = 0x7f < uVar16;
    uVar16 = uVar16 >> 7;
  } while (bVar8);
  piVar3 = *(int **)(unaff_x20 + 0x40);
  do {
    if (piVar3 == *(int **)(unaff_x20 + 0x48)) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      func_0x006b3c88();
      if (*(long *)(unaff_x20 + 0x1c0) == *(long *)(unaff_x20 + 0x1c8)) goto code_r0x006b07ec;
code_r0x006b07f8:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar14 = (ulong)(*(long *)(unaff_x20 + 0x1c8) - *(long *)(unaff_x20 + 0x1c0)) >> 4;
      do {
        uVar16 = (uint)uVar14;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar14 = (ulong)(uVar16 >> 7);
      } while (0x7f < uVar16);
      puVar17 = *(uint **)(unaff_x20 + 0x1c0);
      puVar5 = *(uint **)(unaff_x20 + 0x1c8);
      do {
        if (puVar17 == puVar5) {
          uVar14 = (ulong)(*(long *)(unaff_x20 + 0x1e0) - *(long *)(unaff_x20 + 0x1d8)) >> 2;
          do {
            uVar16 = (uint)uVar14;
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
            uVar14 = (ulong)(uVar16 >> 7);
          } while (0x7f < uVar16);
          puVar17 = *(uint **)(unaff_x20 + 0x1d8);
          puVar5 = *(uint **)(unaff_x20 + 0x1e0);
          do {
            if (puVar17 == puVar5) {
              return;
            }
            uVar16 = *puVar17;
            do {
              bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
              bVar6 = *(byte *)((long)unaff_x19 + 0x17);
              if ((char)bVar6 < '\0') {
                uVar14 = unaff_x19[1];
                uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
                uVar18 = uVar20 - 1;
                if (uVar18 != uVar14) {
                  plVar11 = (long *)*unaff_x19;
                  goto code_r0x006b0da4;
                }
                if (uVar20 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
                plVar11 = (long *)*unaff_x19;
                unaff_x22 = (long *)0x7ffffffffffffff7;
                if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0d40;
code_r0x006b0d68:
                lVar9 = __Znwm(unaff_x22);
                if (uVar18 != 0) {
                  _memmove(lVar9,plVar11,uVar18);
                }
                *(byte *)(lVar9 + uVar18) = bVar7;
                if (uVar18 != 0x16) {
                  __ZdlPv(plVar11);
                }
                unaff_x19[1] = uVar20;
                unaff_x19[2] = (ulong)unaff_x22 | 0x8000000000000000;
                *unaff_x19 = lVar9;
                puVar13 = (undefined1 *)(lVar9 + uVar20);
              }
              else {
                uVar14 = (ulong)bVar6;
                plVar11 = unaff_x19;
                if (bVar6 == 0x16) {
                  uVar20 = 0x17;
                  uVar18 = 0x16;
code_r0x006b0d40:
                  uVar14 = uVar20;
                  if (uVar20 <= uVar18 * 2) {
                    uVar14 = uVar18 * 2;
                  }
                  uVar19 = (uVar14 & 0x7ffffffffffffff8) + 8;
                  if ((uVar14 | 7) != 0x17) {
                    uVar19 = uVar14 | 7;
                  }
                  unaff_x22 = (long *)((long)&MACH_HEADER.sizeofcmds + 3);
                  if (0x16 < uVar14) {
                    unaff_x22 = (long *)(uVar19 + 1);
                  }
                  goto code_r0x006b0d68;
                }
code_r0x006b0da4:
                *(byte *)((long)plVar11 + uVar14) = bVar7;
                lVar9 = uVar14 + 1;
                if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
                  unaff_x19[1] = lVar9;
                  puVar13 = (undefined1 *)((long)plVar11 + lVar9);
                }
                else {
                  *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
                  puVar13 = (undefined1 *)((long)plVar11 + lVar9);
                }
              }
              *puVar13 = 0;
              bVar8 = 0x7f < uVar16;
              uVar16 = uVar16 >> 7;
            } while (bVar8);
            puVar17 = puVar17 + 1;
          } while( true );
        }
        uVar16 = *puVar17;
        do {
          bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
          bVar6 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar6 < '\0') {
            uVar14 = unaff_x19[1];
            uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar18 = uVar20 - 1;
            if (uVar18 != uVar14) {
              plVar11 = (long *)*unaff_x19;
              goto code_r0x006b099c;
            }
            if (uVar20 != 0x7ffffffffffffff7) {
              unaff_x22 = (long *)*unaff_x19;
              uVar14 = 0x7ffffffffffffff7;
              if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0938;
              goto code_r0x006b0960;
            }
            goto code_r0x006b0e18;
          }
          uVar14 = (ulong)bVar6;
          plVar11 = unaff_x19;
          if (bVar6 == 0x16) {
            uVar20 = 0x17;
            uVar18 = 0x16;
            unaff_x22 = unaff_x19;
code_r0x006b0938:
            uVar19 = uVar20;
            if (uVar20 <= uVar18 * 2) {
              uVar19 = uVar18 * 2;
            }
            uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
            if ((uVar19 | 7) != 0x17) {
              uVar2 = uVar19 | 7;
            }
            uVar14 = 0x17;
            if (0x16 < uVar19) {
              uVar14 = uVar2 + 1;
            }
code_r0x006b0960:
            lVar9 = __Znwm(uVar14);
            if (uVar18 != 0) {
              _memmove(lVar9,unaff_x22,uVar18);
            }
            *(byte *)(lVar9 + uVar18) = bVar7;
            if (uVar18 != 0x16) {
              __ZdlPv(unaff_x22);
            }
            unaff_x19[1] = uVar20;
            unaff_x19[2] = uVar14 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar13 = (undefined1 *)(lVar9 + uVar20);
          }
          else {
code_r0x006b099c:
            *(byte *)((long)plVar11 + uVar14) = bVar7;
            lVar9 = uVar14 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar13 = (undefined1 *)((long)plVar11 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar13 = (undefined1 *)((long)plVar11 + lVar9);
            }
          }
          *puVar13 = 0;
          bVar8 = 0x7f < uVar16;
          uVar16 = uVar16 >> 7;
        } while (bVar8);
        uVar16 = puVar17[2];
        do {
          bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
          bVar6 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar6 < '\0') {
            uVar14 = unaff_x19[1];
            uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar18 = uVar20 - 1;
            if (uVar18 != uVar14) {
              plVar11 = (long *)*unaff_x19;
              goto code_r0x006b0ad4;
            }
            if (uVar20 != 0x7ffffffffffffff7) {
              unaff_x22 = (long *)*unaff_x19;
              uVar14 = 0x7ffffffffffffff7;
              if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0a70;
              goto code_r0x006b0a98;
            }
code_r0x006b0e18:
            func_0x0001748c();
code_r0x006b0e20:
            auVar21 = func_0x0001748c(unaff_x22);
            *(int *)(auVar21._0_8_ + 0x1c) = auVar21._8_4_;
            return;
          }
          uVar14 = (ulong)bVar6;
          plVar11 = unaff_x19;
          if (bVar6 == 0x16) {
            uVar20 = 0x17;
            uVar18 = 0x16;
            unaff_x22 = unaff_x19;
code_r0x006b0a70:
            uVar19 = uVar20;
            if (uVar20 <= uVar18 * 2) {
              uVar19 = uVar18 * 2;
            }
            uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
            if ((uVar19 | 7) != 0x17) {
              uVar2 = uVar19 | 7;
            }
            uVar14 = 0x17;
            if (0x16 < uVar19) {
              uVar14 = uVar2 + 1;
            }
code_r0x006b0a98:
            lVar9 = __Znwm(uVar14);
            if (uVar18 != 0) {
              _memmove(lVar9,unaff_x22,uVar18);
            }
            *(byte *)(lVar9 + uVar18) = bVar7;
            if (uVar18 != 0x16) {
              __ZdlPv(unaff_x22);
            }
            unaff_x19[1] = uVar20;
            unaff_x19[2] = uVar14 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar13 = (undefined1 *)(lVar9 + uVar20);
          }
          else {
code_r0x006b0ad4:
            *(byte *)((long)plVar11 + uVar14) = bVar7;
            lVar9 = uVar14 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar13 = (undefined1 *)((long)plVar11 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar13 = (undefined1 *)((long)plVar11 + lVar9);
            }
          }
          *puVar13 = 0;
          bVar8 = 0x7f < uVar16;
          uVar16 = uVar16 >> 7;
        } while (bVar8);
        uVar16 = puVar17[3];
        do {
          bVar7 = (byte)uVar16 & 0x7f | (0x7f < uVar16) << 7;
          bVar6 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar6 < '\0') {
            uVar14 = unaff_x19[1];
            uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar18 = uVar20 - 1;
            if (uVar18 != uVar14) {
              plVar11 = (long *)*unaff_x19;
              goto code_r0x006b0c0c;
            }
            if (uVar20 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
            unaff_x22 = (long *)*unaff_x19;
            uVar14 = 0x7ffffffffffffff7;
            if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0ba8;
code_r0x006b0bd0:
            lVar9 = __Znwm(uVar14);
            if (uVar18 != 0) {
              _memmove(lVar9,unaff_x22,uVar18);
            }
            *(byte *)(lVar9 + uVar18) = bVar7;
            if (uVar18 != 0x16) {
              __ZdlPv(unaff_x22);
            }
            unaff_x19[1] = uVar20;
            unaff_x19[2] = uVar14 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar13 = (undefined1 *)(lVar9 + uVar20);
          }
          else {
            uVar14 = (ulong)bVar6;
            plVar11 = unaff_x19;
            if (bVar6 == 0x16) {
              uVar20 = 0x17;
              uVar18 = 0x16;
              unaff_x22 = unaff_x19;
code_r0x006b0ba8:
              uVar19 = uVar20;
              if (uVar20 <= uVar18 * 2) {
                uVar19 = uVar18 * 2;
              }
              uVar2 = (uVar19 & 0x7ffffffffffffff8) + 8;
              if ((uVar19 | 7) != 0x17) {
                uVar2 = uVar19 | 7;
              }
              uVar14 = 0x17;
              if (0x16 < uVar19) {
                uVar14 = uVar2 + 1;
              }
              goto code_r0x006b0bd0;
            }
code_r0x006b0c0c:
            *(byte *)((long)plVar11 + uVar14) = bVar7;
            lVar9 = uVar14 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar13 = (undefined1 *)((long)plVar11 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar13 = (undefined1 *)((long)plVar11 + lVar9);
            }
          }
          *puVar13 = 0;
          bVar8 = 0x7f < uVar16;
          uVar16 = uVar16 >> 7;
        } while (bVar8);
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        puVar17 = puVar17 + 4;
      } while( true );
    }
    if (*piVar3 == 0) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      if (*(long *)(unaff_x20 + 0x1c0) == *(long *)(unaff_x20 + 0x1c8)) {
code_r0x006b07ec:
        if (*(long *)(unaff_x20 + 0x1d8) == *(long *)(unaff_x20 + 0x1e0)) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          return;
        }
      }
      goto code_r0x006b07f8;
    }
    piVar3 = piVar3 + 1;
  } while( true );
}

