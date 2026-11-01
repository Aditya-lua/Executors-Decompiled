
void FUN_006af984(void)

{
  ulong uVar1;
  ulong uVar2;
  int *piVar3;
  uint *puVar4;
  byte bVar5;
  byte bVar6;
  undefined8 *puVar7;
  bool bVar8;
  long lVar9;
  long lVar10;
  undefined1 *puVar11;
  long *unaff_x19;
  long unaff_x20;
  uint uVar12;
  undefined8 *unaff_x21;
  undefined4 *puVar13;
  uint *puVar14;
  long *plVar15;
  ulong uVar16;
  undefined4 *puVar17;
  ulong uVar18;
  uint unaff_w24;
  long *plVar19;
  ulong uVar20;
  ulong uVar21;
  undefined1 auVar22 [12];
  long in_stack_00000010;
  undefined8 uStack0000000000000038;
  
  *(undefined8 *)(unaff_x20 + 0x310) = 0;
  plVar15 = (long *)(unaff_x20 + 0x308);
  if ((char)*(byte *)((long)unaff_x21 + 0x17) < '\0') {
    uVar16 = unaff_x21[1];
  }
  else {
    uVar16 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
  }
  do {
    uVar12 = (uint)uVar16;
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar15,&uStack0000000000000038,1);
    uVar16 = (ulong)(uVar12 >> 7);
  } while (0x7f < uVar12);
  uVar16 = (ulong)(*(long *)(unaff_x20 + 0x210) - *(long *)(unaff_x20 + 0x208)) >> 2;
  do {
    uVar12 = (uint)uVar16;
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar15,&uStack0000000000000038,1);
    uVar16 = (ulong)(uVar12 >> 7);
  } while (0x7f < uVar12);
  uVar16 = (ulong)(*(long *)(unaff_x20 + 0x1f8) - *(long *)(unaff_x20 + 0x1f0)) >> 4;
  do {
    uVar12 = (uint)uVar16;
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar15,&uStack0000000000000038,1);
    uVar16 = (ulong)(uVar12 >> 7);
  } while (0x7f < uVar12);
  uVar16 = unaff_x21[1];
  puVar7 = (undefined8 *)*unaff_x21;
  if (-1 < (char)*(byte *)((long)unaff_x21 + 0x17)) {
    uVar16 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
    puVar7 = unaff_x21;
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (plVar15,puVar7,uVar16);
  puVar17 = *(undefined4 **)(unaff_x20 + 0x210);
  for (puVar13 = *(undefined4 **)(unaff_x20 + 0x208); puVar13 != puVar17; puVar13 = puVar13 + 1) {
    uStack0000000000000038._1_7_ = (uint7)(uStack0000000000000038 >> 8);
    uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,(char)*puVar13);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar15,&uStack0000000000000038,1);
  }
  puVar17 = *(undefined4 **)(unaff_x20 + 0x1f8);
  for (puVar13 = *(undefined4 **)(unaff_x20 + 0x1f0); puVar13 != puVar17; puVar13 = puVar13 + 4) {
    uStack0000000000000038._0_1_ = (char)*puVar13;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar15,&uStack0000000000000038,1);
    uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,*(undefined1 *)(puVar13 + 1));
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar15,&uStack0000000000000038,1);
    uVar12 = puVar13[2];
    do {
      bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
      bVar5 = *(byte *)(unaff_x20 + 799);
      if ((char)bVar5 < '\0') {
        uVar21 = *(ulong *)(unaff_x20 + 0x318) & 0x7fffffffffffffff;
        uVar18 = uVar21 - 1;
        uVar16 = *(ulong *)(unaff_x20 + 0x310);
        if (uVar18 != uVar16) {
          plVar19 = (long *)*plVar15;
          goto code_r0x006afbfc;
        }
        if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e20;
        plVar19 = (long *)*plVar15;
        uVar16 = 0x7ffffffffffffff7;
        if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006afb94;
code_r0x006afbc0:
        lVar9 = __Znwm(uVar16);
        if (uVar18 != 0) {
          _memmove(lVar9,plVar19,uVar18);
        }
        *(byte *)(lVar9 + uVar18) = bVar6;
        if (uVar18 != 0x16) {
          __ZdlPv(plVar19);
        }
        *(long *)(unaff_x20 + 0x308) = lVar9;
        *(ulong *)(unaff_x20 + 0x318) = uVar16 | 0x8000000000000000;
        *(ulong *)(unaff_x20 + 0x310) = uVar21;
        puVar11 = (undefined1 *)(lVar9 + uVar21);
      }
      else {
        uVar16 = (ulong)bVar5;
        plVar19 = plVar15;
        if (bVar5 == 0x16) {
          uVar21 = 0x17;
          uVar18 = 0x16;
code_r0x006afb94:
          uVar20 = uVar21;
          if (uVar21 <= uVar18 * 2) {
            uVar20 = uVar18 * 2;
          }
          uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
          if ((uVar20 | 7) != 0x17) {
            uVar2 = uVar20 | 7;
          }
          uVar16 = 0x17;
          if (0x16 < uVar20) {
            uVar16 = uVar2 + 1;
          }
          goto code_r0x006afbc0;
        }
code_r0x006afbfc:
        *(byte *)((long)plVar19 + uVar16) = bVar6;
        lVar9 = uVar16 + 1;
        if (*(char *)(unaff_x20 + 799) < '\0') {
          *(long *)(unaff_x20 + 0x310) = lVar9;
          puVar11 = (undefined1 *)((long)plVar19 + lVar9);
        }
        else {
          *(byte *)(unaff_x20 + 799) = (byte)lVar9 & 0x7f;
          puVar11 = (undefined1 *)((long)plVar19 + lVar9);
        }
      }
      *puVar11 = 0;
      bVar8 = 0x7f < uVar12;
      uVar12 = uVar12 >> 7;
    } while (bVar8);
    uVar12 = puVar13[3] - puVar13[2];
    do {
      bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
      bVar5 = *(byte *)(unaff_x20 + 799);
      if ((char)bVar5 < '\0') {
        uVar21 = *(ulong *)(unaff_x20 + 0x318) & 0x7fffffffffffffff;
        uVar18 = uVar21 - 1;
        uVar16 = *(ulong *)(unaff_x20 + 0x310);
        if (uVar18 != uVar16) {
          plVar19 = (long *)*plVar15;
          goto code_r0x006afd44;
        }
        if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e20;
        plVar19 = (long *)*plVar15;
        uVar16 = 0x7ffffffffffffff7;
        if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006afcdc;
code_r0x006afd08:
        lVar9 = __Znwm(uVar16);
        if (uVar18 != 0) {
          _memmove(lVar9,plVar19,uVar18);
        }
        *(byte *)(lVar9 + uVar18) = bVar6;
        if (uVar18 != 0x16) {
          __ZdlPv(plVar19);
        }
        *(long *)(unaff_x20 + 0x308) = lVar9;
        *(ulong *)(unaff_x20 + 0x318) = uVar16 | 0x8000000000000000;
        *(ulong *)(unaff_x20 + 0x310) = uVar21;
        puVar11 = (undefined1 *)(lVar9 + uVar21);
      }
      else {
        uVar16 = (ulong)bVar5;
        plVar19 = plVar15;
        if (bVar5 == 0x16) {
          uVar21 = 0x17;
          uVar18 = 0x16;
code_r0x006afcdc:
          uVar20 = uVar21;
          if (uVar21 <= uVar18 * 2) {
            uVar20 = uVar18 * 2;
          }
          uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
          if ((uVar20 | 7) != 0x17) {
            uVar2 = uVar20 | 7;
          }
          uVar16 = 0x17;
          if (0x16 < uVar20) {
            uVar16 = uVar2 + 1;
          }
          goto code_r0x006afd08;
        }
code_r0x006afd44:
        *(byte *)((long)plVar19 + uVar16) = bVar6;
        lVar9 = uVar16 + 1;
        if (*(char *)(unaff_x20 + 799) < '\0') {
          *(long *)(unaff_x20 + 0x310) = lVar9;
          puVar11 = (undefined1 *)((long)plVar19 + lVar9);
        }
        else {
          *(byte *)(unaff_x20 + 799) = (byte)lVar9 & 0x7f;
          puVar11 = (undefined1 *)((long)plVar19 + lVar9);
        }
      }
      *puVar11 = 0;
      bVar8 = 0x7f < uVar12;
      uVar12 = uVar12 >> 7;
    } while (bVar8);
  }
  if ((char)*(byte *)(unaff_x20 + 799) < '\0') {
    uVar16 = *(ulong *)(unaff_x20 + 0x310);
  }
  else {
    uVar16 = (ulong)*(byte *)(unaff_x20 + 799);
  }
  do {
    uVar12 = (uint)uVar16;
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar16 = (ulong)(uVar12 >> 7);
  } while (0x7f < uVar12);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar16 = (ulong)(*(long *)(unaff_x20 + 0x30) - *(long *)(unaff_x20 + 0x28)) >> 2;
  do {
    uVar12 = (uint)uVar16;
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar16 = (ulong)(uVar12 >> 7);
  } while (0x7f < uVar12);
  plVar15 = *(long **)(unaff_x20 + 0x30);
  for (plVar19 = *(long **)(unaff_x20 + 0x28); plVar19 != plVar15;
      plVar19 = (long *)((long)plVar19 + 4)) {
    uStack0000000000000038._4_4_ = (undefined4)(uStack0000000000000038 >> 0x20);
    uStack0000000000000038 = CONCAT44(uStack0000000000000038._4_4_,(int)*plVar19);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  }
  uVar12 = (int)((ulong)(*(long *)(unaff_x20 + 0x60) - *(long *)(unaff_x20 + 0x58)) >> 3) *
           -0x55555555;
  do {
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar12 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar8 = 0x7f < uVar12;
    uVar12 = uVar12 >> 7;
  } while (bVar8);
  puVar17 = *(undefined4 **)(unaff_x20 + 0x60);
  for (puVar13 = *(undefined4 **)(unaff_x20 + 0x58); puVar13 != puVar17; puVar13 = puVar13 + 6) {
    switch(*puVar13) {
    case 0:
      uStack0000000000000038 = (ulong)uStack0000000000000038._1_7_ << 8;
      break;
    case 1:
      uStack0000000000000038._0_1_ = 1;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,*(undefined1 *)(puVar13 + 2));
      break;
    case 2:
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,2);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000038 = *(ulong *)(puVar13 + 2);
      break;
    case 3:
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,7);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000038._0_4_ = puVar13[2];
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000038._0_4_ = puVar13[3];
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000038._0_4_ = puVar13[4];
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000038 = CONCAT44(uStack0000000000000038._4_4_,puVar13[5]);
      break;
    case 4:
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,3);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar12 = puVar13[2];
      do {
        bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
        bVar5 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar5 < '\0') {
          uVar16 = unaff_x19[1];
          uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar18 = uVar21 - 1;
          if (uVar18 != uVar16) {
            plVar19 = (long *)*unaff_x19;
            goto code_r0x006b0118;
          }
          if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
          plVar15 = (long *)*unaff_x19;
          uVar16 = 0x7ffffffffffffff7;
          if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b00b0;
code_r0x006b00dc:
          lVar9 = __Znwm(uVar16);
          if (uVar18 != 0) {
            _memmove(lVar9,plVar15,uVar18);
          }
          *(byte *)(lVar9 + uVar18) = bVar6;
          if (uVar18 != 0x16) {
            __ZdlPv(plVar15);
          }
          unaff_x19[1] = uVar21;
          unaff_x19[2] = uVar16 | 0x8000000000000000;
          *unaff_x19 = lVar9;
          puVar11 = (undefined1 *)(lVar9 + uVar21);
        }
        else {
          uVar16 = (ulong)bVar5;
          plVar19 = unaff_x19;
          if (bVar5 == 0x16) {
            uVar21 = 0x17;
            uVar18 = 0x16;
            plVar15 = unaff_x19;
code_r0x006b00b0:
            uVar20 = uVar21;
            if (uVar21 <= uVar18 * 2) {
              uVar20 = uVar18 * 2;
            }
            uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
            if ((uVar20 | 7) != 0x17) {
              uVar2 = uVar20 | 7;
            }
            uVar16 = 0x17;
            if (0x16 < uVar20) {
              uVar16 = uVar2 + 1;
            }
            goto code_r0x006b00dc;
          }
code_r0x006b0118:
          *(byte *)((long)plVar19 + uVar16) = bVar6;
          lVar9 = uVar16 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar9;
            puVar11 = (undefined1 *)((long)plVar19 + lVar9);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
            puVar11 = (undefined1 *)((long)plVar19 + lVar9);
          }
        }
        *puVar11 = 0;
        bVar8 = 0x7f < uVar12;
        uVar12 = uVar12 >> 7;
      } while (bVar8);
      goto code_r0x006afed4;
    case 5:
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,4);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uStack0000000000000038 = CONCAT44(uStack0000000000000038._4_4_,puVar13[2]);
      break;
    case 6:
      lVar9 = *(long *)(unaff_x20 + 0xa0) + (ulong)(uint)puVar13[2] * 0x84;
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,5);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      puVar14 = (uint *)(lVar9 + 0x80);
      uVar12 = *puVar14;
      do {
        bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
        bVar5 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar5 < '\0') {
          uVar16 = unaff_x19[1];
          uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar18 = uVar21 - 1;
          if (uVar18 != uVar16) {
            plVar19 = (long *)*unaff_x19;
            goto code_r0x006b0284;
          }
          if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
          plVar15 = (long *)*unaff_x19;
          uVar16 = 0x7ffffffffffffff7;
          if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b021c;
code_r0x006b0248:
          lVar10 = __Znwm(uVar16);
          if (uVar18 != 0) {
            _memmove(lVar10,plVar15,uVar18);
          }
          *(byte *)(lVar10 + uVar18) = bVar6;
          if (uVar18 != 0x16) {
            __ZdlPv(plVar15);
          }
          unaff_x19[1] = uVar21;
          unaff_x19[2] = uVar16 | 0x8000000000000000;
          *unaff_x19 = lVar10;
          puVar11 = (undefined1 *)(lVar10 + uVar21);
        }
        else {
          uVar16 = (ulong)bVar5;
          plVar19 = unaff_x19;
          if (bVar5 == 0x16) {
            uVar21 = 0x17;
            uVar18 = 0x16;
            plVar15 = unaff_x19;
code_r0x006b021c:
            uVar20 = uVar21;
            if (uVar21 <= uVar18 * 2) {
              uVar20 = uVar18 * 2;
            }
            uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
            if ((uVar20 | 7) != 0x17) {
              uVar2 = uVar20 | 7;
            }
            uVar16 = 0x17;
            if (0x16 < uVar20) {
              uVar16 = uVar2 + 1;
            }
            goto code_r0x006b0248;
          }
code_r0x006b0284:
          *(byte *)((long)plVar19 + uVar16) = bVar6;
          lVar10 = uVar16 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar10;
            puVar11 = (undefined1 *)((long)plVar19 + lVar10);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar10 & 0x7f;
            puVar11 = (undefined1 *)((long)plVar19 + lVar10);
          }
        }
        *puVar11 = 0;
        bVar8 = 0x7f < uVar12;
        uVar12 = uVar12 >> 7;
      } while (bVar8);
      if (*puVar14 != 0) {
        uVar16 = 0;
        do {
          uVar12 = *(uint *)(lVar9 + uVar16 * 4);
          do {
            bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
            bVar5 = *(byte *)((long)unaff_x19 + 0x17);
            if ((char)bVar5 < '\0') {
              uVar18 = unaff_x19[1];
              uVar20 = unaff_x19[2] & 0x7fffffffffffffff;
              uVar21 = uVar20 - 1;
              if (uVar21 != uVar18) {
                plVar19 = (long *)*unaff_x19;
                goto code_r0x006b053c;
              }
              if (uVar20 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
              plVar15 = (long *)*unaff_x19;
              uVar18 = 0x7ffffffffffffff7;
              if (uVar21 < 0x3ffffffffffffff3) goto code_r0x006b04d4;
code_r0x006b0500:
              lVar10 = __Znwm(uVar18);
              if (uVar21 != 0) {
                _memmove(lVar10,plVar15,uVar21);
              }
              *(byte *)(lVar10 + uVar21) = bVar6;
              if (uVar21 != 0x16) {
                __ZdlPv(plVar15);
              }
              unaff_x19[1] = uVar20;
              unaff_x19[2] = uVar18 | 0x8000000000000000;
              *unaff_x19 = lVar10;
              puVar11 = (undefined1 *)(lVar10 + uVar20);
            }
            else {
              uVar18 = (ulong)bVar5;
              plVar19 = unaff_x19;
              if (bVar5 == 0x16) {
                uVar20 = 0x17;
                uVar21 = 0x16;
                plVar15 = unaff_x19;
code_r0x006b04d4:
                uVar2 = uVar20;
                if (uVar20 <= uVar21 * 2) {
                  uVar2 = uVar21 * 2;
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
              *(byte *)((long)plVar19 + uVar18) = bVar6;
              lVar10 = uVar18 + 1;
              if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
                unaff_x19[1] = lVar10;
                puVar11 = (undefined1 *)((long)plVar19 + lVar10);
              }
              else {
                *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar10 & 0x7f;
                puVar11 = (undefined1 *)((long)plVar19 + lVar10);
              }
            }
            *puVar11 = 0;
            bVar8 = 0x7f < uVar12;
            uVar12 = uVar12 >> 7;
          } while (bVar8);
          uVar16 = uVar16 + 1;
        } while (uVar16 < *puVar14);
      }
      goto code_r0x006afed4;
    case 7:
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,6);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar12 = puVar13[2];
      do {
        bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
        bVar5 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar5 < '\0') {
          uVar16 = unaff_x19[1];
          uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar18 = uVar21 - 1;
          if (uVar18 != uVar16) {
            plVar19 = (long *)*unaff_x19;
            goto code_r0x006b03d8;
          }
          if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
          plVar15 = (long *)*unaff_x19;
          uVar16 = 0x7ffffffffffffff7;
          if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0370;
code_r0x006b039c:
          lVar9 = __Znwm(uVar16);
          if (uVar18 != 0) {
            _memmove(lVar9,plVar15,uVar18);
          }
          *(byte *)(lVar9 + uVar18) = bVar6;
          if (uVar18 != 0x16) {
            __ZdlPv(plVar15);
          }
          unaff_x19[1] = uVar21;
          unaff_x19[2] = uVar16 | 0x8000000000000000;
          *unaff_x19 = lVar9;
          puVar11 = (undefined1 *)(lVar9 + uVar21);
        }
        else {
          uVar16 = (ulong)bVar5;
          plVar19 = unaff_x19;
          if (bVar5 == 0x16) {
            uVar21 = 0x17;
            uVar18 = 0x16;
            plVar15 = unaff_x19;
code_r0x006b0370:
            uVar20 = uVar21;
            if (uVar21 <= uVar18 * 2) {
              uVar20 = uVar18 * 2;
            }
            uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
            if ((uVar20 | 7) != 0x17) {
              uVar2 = uVar20 | 7;
            }
            uVar16 = 0x17;
            if (0x16 < uVar20) {
              uVar16 = uVar2 + 1;
            }
            goto code_r0x006b039c;
          }
code_r0x006b03d8:
          *(byte *)((long)plVar19 + uVar16) = bVar6;
          lVar9 = uVar16 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar9;
            puVar11 = (undefined1 *)((long)plVar19 + lVar9);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
            puVar11 = (undefined1 *)((long)plVar19 + lVar9);
          }
        }
        *puVar11 = 0;
        bVar8 = 0x7f < uVar12;
        uVar12 = uVar12 >> 7;
      } while (bVar8);
    default:
      goto code_r0x006afed4;
    }
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
code_r0x006afed4:
  }
  uVar16 = (ulong)(*(long *)(unaff_x20 + 0x78) - *(long *)(unaff_x20 + 0x70)) >> 2;
  do {
    uVar12 = (uint)uVar16;
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar16 = (ulong)(uVar12 >> 7);
  } while (0x7f < uVar12);
  puVar4 = *(uint **)(unaff_x20 + 0x78);
  for (puVar14 = *(uint **)(unaff_x20 + 0x70); puVar14 != puVar4; puVar14 = puVar14 + 1) {
    uVar12 = *puVar14;
    do {
      bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
      bVar5 = *(byte *)((long)unaff_x19 + 0x17);
      if ((char)bVar5 < '\0') {
        uVar16 = unaff_x19[1];
        uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
        uVar18 = uVar21 - 1;
        if (uVar18 != uVar16) {
          plVar19 = (long *)*unaff_x19;
          goto code_r0x006b06cc;
        }
        if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
        plVar15 = (long *)*unaff_x19;
        uVar16 = 0x7ffffffffffffff7;
        if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0664;
code_r0x006b0690:
        lVar9 = __Znwm(uVar16);
        if (uVar18 != 0) {
          _memmove(lVar9,plVar15,uVar18);
        }
        *(byte *)(lVar9 + uVar18) = bVar6;
        if (uVar18 != 0x16) {
          __ZdlPv(plVar15);
        }
        unaff_x19[1] = uVar21;
        unaff_x19[2] = uVar16 | 0x8000000000000000;
        *unaff_x19 = lVar9;
        puVar11 = (undefined1 *)(lVar9 + uVar21);
      }
      else {
        uVar16 = (ulong)bVar5;
        plVar19 = unaff_x19;
        if (bVar5 == 0x16) {
          uVar21 = 0x17;
          uVar18 = 0x16;
          plVar15 = unaff_x19;
code_r0x006b0664:
          uVar20 = uVar21;
          if (uVar21 <= uVar18 * 2) {
            uVar20 = uVar18 * 2;
          }
          uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
          if ((uVar20 | 7) != 0x17) {
            uVar2 = uVar20 | 7;
          }
          uVar16 = 0x17;
          if (0x16 < uVar20) {
            uVar16 = uVar2 + 1;
          }
          goto code_r0x006b0690;
        }
code_r0x006b06cc:
        *(byte *)((long)plVar19 + uVar16) = bVar6;
        lVar9 = uVar16 + 1;
        if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
          unaff_x19[1] = lVar9;
          puVar11 = (undefined1 *)((long)plVar19 + lVar9);
        }
        else {
          *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
          puVar11 = (undefined1 *)((long)plVar19 + lVar9);
        }
      }
      *puVar11 = 0;
      bVar8 = 0x7f < uVar12;
      uVar12 = uVar12 >> 7;
    } while (bVar8);
  }
  uVar12 = *(uint *)(in_stack_00000010 + (ulong)unaff_w24 * 0x88 + 0x20);
  do {
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar12 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar8 = 0x7f < uVar12;
    uVar12 = uVar12 >> 7;
  } while (bVar8);
  uVar12 = *(uint *)(in_stack_00000010 + (ulong)unaff_w24 * 0x88 + 0x1c);
  do {
    uStack0000000000000038 =
         CONCAT71(uStack0000000000000038._1_7_,(byte)uVar12 & 0x7f | (0x7f < uVar12) << 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar8 = 0x7f < uVar12;
    uVar12 = uVar12 >> 7;
  } while (bVar8);
  piVar3 = *(int **)(unaff_x20 + 0x40);
  do {
    if (piVar3 == *(int **)(unaff_x20 + 0x48)) {
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,1);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      func_0x006b3c88();
      if (*(long *)(unaff_x20 + 0x1c0) == *(long *)(unaff_x20 + 0x1c8)) {
LAB_006b07ec:
        if (*(long *)(unaff_x20 + 0x1d8) == *(long *)(unaff_x20 + 0x1e0)) {
          uStack0000000000000038 = uStack0000000000000038 & 0xffffffffffffff00;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          return;
        }
      }
LAB_006b07f8:
      uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,1);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar16 = (ulong)(*(long *)(unaff_x20 + 0x1c8) - *(long *)(unaff_x20 + 0x1c0)) >> 4;
      do {
        uVar12 = (uint)uVar16;
        uStack0000000000000038 =
             CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar16 = (ulong)(uVar12 >> 7);
      } while (0x7f < uVar12);
      puVar4 = *(uint **)(unaff_x20 + 0x1c8);
      for (puVar14 = *(uint **)(unaff_x20 + 0x1c0); puVar14 != puVar4; puVar14 = puVar14 + 4) {
        uVar12 = *puVar14;
        do {
          bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
          bVar5 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar5 < '\0') {
            uVar16 = unaff_x19[1];
            uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar18 = uVar21 - 1;
            if (uVar18 != uVar16) {
              plVar19 = (long *)*unaff_x19;
              goto code_r0x006b099c;
            }
            if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
            plVar15 = (long *)*unaff_x19;
            uVar16 = 0x7ffffffffffffff7;
            if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0938;
code_r0x006b0960:
            lVar9 = __Znwm(uVar16);
            if (uVar18 != 0) {
              _memmove(lVar9,plVar15,uVar18);
            }
            *(byte *)(lVar9 + uVar18) = bVar6;
            if (uVar18 != 0x16) {
              __ZdlPv(plVar15);
            }
            unaff_x19[1] = uVar21;
            unaff_x19[2] = uVar16 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar11 = (undefined1 *)(lVar9 + uVar21);
          }
          else {
            uVar16 = (ulong)bVar5;
            plVar19 = unaff_x19;
            if (bVar5 == 0x16) {
              uVar21 = 0x17;
              uVar18 = 0x16;
              plVar15 = unaff_x19;
code_r0x006b0938:
              uVar20 = uVar21;
              if (uVar21 <= uVar18 * 2) {
                uVar20 = uVar18 * 2;
              }
              uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
              if ((uVar20 | 7) != 0x17) {
                uVar2 = uVar20 | 7;
              }
              uVar16 = 0x17;
              if (0x16 < uVar20) {
                uVar16 = uVar2 + 1;
              }
              goto code_r0x006b0960;
            }
code_r0x006b099c:
            *(byte *)((long)plVar19 + uVar16) = bVar6;
            lVar9 = uVar16 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
          }
          *puVar11 = 0;
          bVar8 = 0x7f < uVar12;
          uVar12 = uVar12 >> 7;
        } while (bVar8);
        uVar12 = puVar14[2];
        do {
          bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
          bVar5 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar5 < '\0') {
            uVar16 = unaff_x19[1];
            uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar18 = uVar21 - 1;
            if (uVar18 != uVar16) {
              plVar19 = (long *)*unaff_x19;
              goto code_r0x006b0ad4;
            }
            if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
            plVar15 = (long *)*unaff_x19;
            uVar16 = 0x7ffffffffffffff7;
            if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0a70;
code_r0x006b0a98:
            lVar9 = __Znwm(uVar16);
            if (uVar18 != 0) {
              _memmove(lVar9,plVar15,uVar18);
            }
            *(byte *)(lVar9 + uVar18) = bVar6;
            if (uVar18 != 0x16) {
              __ZdlPv(plVar15);
            }
            unaff_x19[1] = uVar21;
            unaff_x19[2] = uVar16 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar11 = (undefined1 *)(lVar9 + uVar21);
          }
          else {
            uVar16 = (ulong)bVar5;
            plVar19 = unaff_x19;
            if (bVar5 == 0x16) {
              uVar21 = 0x17;
              uVar18 = 0x16;
              plVar15 = unaff_x19;
code_r0x006b0a70:
              uVar20 = uVar21;
              if (uVar21 <= uVar18 * 2) {
                uVar20 = uVar18 * 2;
              }
              uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
              if ((uVar20 | 7) != 0x17) {
                uVar2 = uVar20 | 7;
              }
              uVar16 = 0x17;
              if (0x16 < uVar20) {
                uVar16 = uVar2 + 1;
              }
              goto code_r0x006b0a98;
            }
code_r0x006b0ad4:
            *(byte *)((long)plVar19 + uVar16) = bVar6;
            lVar9 = uVar16 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
          }
          *puVar11 = 0;
          bVar8 = 0x7f < uVar12;
          uVar12 = uVar12 >> 7;
        } while (bVar8);
        uVar12 = puVar14[3];
        do {
          bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
          bVar5 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar5 < '\0') {
            uVar16 = unaff_x19[1];
            uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar18 = uVar21 - 1;
            if (uVar18 != uVar16) {
              plVar19 = (long *)*unaff_x19;
              goto code_r0x006b0c0c;
            }
            if (uVar21 == 0x7ffffffffffffff7) goto code_r0x006b0e18;
            plVar15 = (long *)*unaff_x19;
            uVar16 = 0x7ffffffffffffff7;
            if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0ba8;
code_r0x006b0bd0:
            lVar9 = __Znwm(uVar16);
            if (uVar18 != 0) {
              _memmove(lVar9,plVar15,uVar18);
            }
            *(byte *)(lVar9 + uVar18) = bVar6;
            if (uVar18 != 0x16) {
              __ZdlPv(plVar15);
            }
            unaff_x19[1] = uVar21;
            unaff_x19[2] = uVar16 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar11 = (undefined1 *)(lVar9 + uVar21);
          }
          else {
            uVar16 = (ulong)bVar5;
            plVar19 = unaff_x19;
            if (bVar5 == 0x16) {
              uVar21 = 0x17;
              uVar18 = 0x16;
              plVar15 = unaff_x19;
code_r0x006b0ba8:
              uVar20 = uVar21;
              if (uVar21 <= uVar18 * 2) {
                uVar20 = uVar18 * 2;
              }
              uVar2 = (uVar20 & 0x7ffffffffffffff8) + 8;
              if ((uVar20 | 7) != 0x17) {
                uVar2 = uVar20 | 7;
              }
              uVar16 = 0x17;
              if (0x16 < uVar20) {
                uVar16 = uVar2 + 1;
              }
              goto code_r0x006b0bd0;
            }
code_r0x006b0c0c:
            *(byte *)((long)plVar19 + uVar16) = bVar6;
            lVar9 = uVar16 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
          }
          *puVar11 = 0;
          bVar8 = 0x7f < uVar12;
          uVar12 = uVar12 >> 7;
        } while (bVar8);
        uStack0000000000000038 = CONCAT71(uStack0000000000000038._1_7_,(char)puVar14[1]);
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      }
      uVar16 = (ulong)(*(long *)(unaff_x20 + 0x1e0) - *(long *)(unaff_x20 + 0x1d8)) >> 2;
      do {
        uVar12 = (uint)uVar16;
        uStack0000000000000038 =
             CONCAT71(uStack0000000000000038._1_7_,(byte)uVar16 & 0x7f | (0x7f < uVar12) << 7);
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar16 = (ulong)(uVar12 >> 7);
      } while (0x7f < uVar12);
      puVar14 = *(uint **)(unaff_x20 + 0x1d8);
      puVar4 = *(uint **)(unaff_x20 + 0x1e0);
      do {
        if (puVar14 == puVar4) {
          return;
        }
        uVar12 = *puVar14;
        do {
          bVar6 = (byte)uVar12 & 0x7f | (0x7f < uVar12) << 7;
          bVar5 = *(byte *)((long)unaff_x19 + 0x17);
          if ((char)bVar5 < '\0') {
            uVar16 = unaff_x19[1];
            uVar21 = unaff_x19[2] & 0x7fffffffffffffff;
            uVar18 = uVar21 - 1;
            if (uVar18 != uVar16) {
              plVar19 = (long *)*unaff_x19;
              goto code_r0x006b0da4;
            }
            if (uVar21 == 0x7ffffffffffffff7) {
code_r0x006b0e18:
              func_0x0001748c();
code_r0x006b0e20:
              auVar22 = func_0x0001748c(plVar15);
              *(int *)(auVar22._0_8_ + 0x1c) = auVar22._8_4_;
              return;
            }
            plVar19 = (long *)*unaff_x19;
            plVar15 = (long *)0x7ffffffffffffff7;
            if (uVar18 < 0x3ffffffffffffff3) goto code_r0x006b0d40;
code_r0x006b0d68:
            lVar9 = __Znwm(plVar15);
            if (uVar18 != 0) {
              _memmove(lVar9,plVar19,uVar18);
            }
            *(byte *)(lVar9 + uVar18) = bVar6;
            if (uVar18 != 0x16) {
              __ZdlPv(plVar19);
            }
            unaff_x19[1] = uVar21;
            unaff_x19[2] = (ulong)plVar15 | 0x8000000000000000;
            *unaff_x19 = lVar9;
            puVar11 = (undefined1 *)(lVar9 + uVar21);
          }
          else {
            uVar16 = (ulong)bVar5;
            plVar19 = unaff_x19;
            if (bVar5 == 0x16) {
              uVar21 = 0x17;
              uVar18 = 0x16;
code_r0x006b0d40:
              uVar16 = uVar21;
              if (uVar21 <= uVar18 * 2) {
                uVar16 = uVar18 * 2;
              }
              uVar20 = (uVar16 & 0x7ffffffffffffff8) + 8;
              if ((uVar16 | 7) != 0x17) {
                uVar20 = uVar16 | 7;
              }
              plVar15 = (long *)((long)&MACH_HEADER.sizeofcmds + 3);
              if (0x16 < uVar16) {
                plVar15 = (long *)(uVar20 + 1);
              }
              goto code_r0x006b0d68;
            }
code_r0x006b0da4:
            *(byte *)((long)plVar19 + uVar16) = bVar6;
            lVar9 = uVar16 + 1;
            if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
              unaff_x19[1] = lVar9;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar9 & 0x7f;
              puVar11 = (undefined1 *)((long)plVar19 + lVar9);
            }
          }
          *puVar11 = 0;
          bVar8 = 0x7f < uVar12;
          uVar12 = uVar12 >> 7;
        } while (bVar8);
        puVar14 = puVar14 + 1;
      } while( true );
    }
    if (*piVar3 == 0) {
      uStack0000000000000038 = (ulong)uStack0000000000000038._1_7_ << 8;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      if (*(long *)(unaff_x20 + 0x1c0) == *(long *)(unaff_x20 + 0x1c8)) goto LAB_006b07ec;
      goto LAB_006b07f8;
    }
    piVar3 = piVar3 + 1;
  } while( true );
}

