
undefined8 FUN_006b3468(long param_1)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  byte bVar6;
  byte bVar7;
  undefined8 *puVar8;
  int iVar9;
  undefined8 uVar10;
  undefined1 *puVar11;
  long lVar12;
  ulong uVar13;
  long *unaff_x19;
  long lVar14;
  long lVar15;
  ulong uVar16;
  ulong unaff_x22;
  long *plVar17;
  ulong uVar18;
  long *plVar19;
  uint uVar20;
  ulong uVar21;
  undefined8 uStack0000000000000008;
  
  uVar18 = 0;
  plVar19 = (long *)(param_1 + 8);
  lVar15 = 0x10;
  while (((plVar19[-1] != 0 && (*plVar19 == unaff_x19[0x4b])) && (iVar9 = _memcmp(), iVar9 == 0))) {
    uVar18 = uVar18 + 1;
    plVar19 = plVar19 + 3;
    if (unaff_x22 == uVar18) {
LAB_006b3584:
      for (lVar12 = *unaff_x19; lVar12 != unaff_x19[1]; lVar12 = lVar12 + 0x88) {
        if ((char)*(byte *)(lVar12 + 0x17) < '\0') {
          uVar18 = *(ulong *)(lVar12 + 8);
        }
        else {
          uVar18 = (ulong)*(byte *)(lVar12 + 0x17);
        }
        lVar15 = uVar18 + lVar15;
      }
      plVar19 = unaff_x19 + 0x57;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm(plVar19,lVar15);
      if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
        plVar17 = (long *)unaff_x19[0x57];
        unaff_x19[0x58] = 1;
      }
      else {
        *(undefined1 *)((long)unaff_x19 + 0x2cf) = 1;
        plVar17 = plVar19;
      }
      *(undefined2 *)plVar17 = 6;
      uStack0000000000000008._3_1_ = 3;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (plVar19,(long)&uStack0000000000000008 + 3,1);
      func_0x006b38c0();
      lVar15 = unaff_x19[0x45];
      lVar12 = unaff_x19[0x44];
      if ((lVar15 - lVar12 & 0x1fffffffe0U) != 0) {
        uVar18 = 0;
        do {
          if ((cRam0000000000a33580 == '\0') || (*(char *)(lVar12 + uVar18 * 0x20 + 0x1c) != '\0'))
          {
            uStack0000000000000008._6_1_ = (char)uVar18 + '\x01';
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (plVar19,(long)&uStack0000000000000008 + 6,1);
            uVar20 = *(uint *)(unaff_x19[0x44] + uVar18 * 0x20 + 0x18);
            do {
              bVar7 = (byte)uVar20 & 0x7f | (0x7f < uVar20) << 7;
              bVar6 = *(byte *)((long)unaff_x19 + 0x2cf);
              if ((char)bVar6 < '\0') {
                uVar21 = unaff_x19[0x59] & 0x7fffffffffffffff;
                uVar16 = uVar21 - 1;
                uVar13 = unaff_x19[0x58];
                if (uVar16 != uVar13) {
                  plVar17 = (long *)*plVar19;
                  goto code_r0x006b3794;
                }
                if (uVar21 == 0x7ffffffffffffff7) {
                  func_0x0001748c(plVar19);
                  return 6;
                }
                plVar17 = (long *)*plVar19;
                uVar13 = 0x7ffffffffffffff7;
                if (uVar16 < 0x3ffffffffffffff3) goto code_r0x006b372c;
code_r0x006b3758:
                lVar15 = __Znwm(uVar13);
                if (uVar16 != 0) {
                  _memmove(lVar15,plVar17,uVar16);
                }
                *(byte *)(lVar15 + uVar16) = bVar7;
                if (uVar16 != 0x16) {
                  __ZdlPv(plVar17);
                }
                unaff_x19[0x57] = lVar15;
                unaff_x19[0x59] = uVar13 | 0x8000000000000000;
                unaff_x19[0x58] = uVar21;
                puVar11 = (undefined1 *)(lVar15 + uVar21);
              }
              else {
                uVar13 = (ulong)bVar6;
                plVar17 = plVar19;
                if (bVar6 == 0x16) {
                  uVar21 = 0x17;
                  uVar16 = 0x16;
code_r0x006b372c:
                  uVar2 = uVar21;
                  if (uVar21 <= uVar16 * 2) {
                    uVar2 = uVar16 * 2;
                  }
                  uVar3 = (uVar2 & 0x7ffffffffffffff8) + 8;
                  if ((uVar2 | 7) != 0x17) {
                    uVar3 = uVar2 | 7;
                  }
                  uVar13 = 0x17;
                  if (0x16 < uVar2) {
                    uVar13 = uVar3 + 1;
                  }
                  goto code_r0x006b3758;
                }
code_r0x006b3794:
                *(byte *)((long)plVar17 + uVar13) = bVar7;
                lVar15 = uVar13 + 1;
                if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
                  unaff_x19[0x58] = lVar15;
                  puVar11 = (undefined1 *)((long)plVar17 + lVar15);
                }
                else {
                  *(byte *)((long)unaff_x19 + 0x2cf) = (byte)lVar15 & 0x7f;
                  puVar11 = (undefined1 *)((long)plVar17 + lVar15);
                }
              }
              *puVar11 = 0;
              bVar1 = 0x7f < uVar20;
              uVar20 = uVar20 >> 7;
            } while (bVar1);
            lVar15 = unaff_x19[0x45];
            lVar12 = unaff_x19[0x44];
          }
          uVar18 = uVar18 + 1;
        } while (uVar18 < ((ulong)(lVar15 - lVar12) >> 5 & 0xffffffff));
      }
      uStack0000000000000008._4_1_ = 0;
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (plVar19,(long)&uStack0000000000000008 + 4,1);
      uVar20 = (int)((ulong)(unaff_x19[1] - *unaff_x19) >> 3) * -0xf0f0f0f;
      do {
        uStack0000000000000008._5_1_ = (byte)uVar20 & 0x7f | (0x7f < uVar20) << 7;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (plVar19,(long)&uStack0000000000000008 + 5,1);
        bVar1 = 0x7f < uVar20;
        uVar20 = uVar20 >> 7;
      } while (bVar1);
      puVar5 = (undefined8 *)unaff_x19[1];
      for (puVar4 = (undefined8 *)*unaff_x19; puVar4 != puVar5; puVar4 = puVar4 + 0x11) {
        uVar18 = puVar4[1];
        puVar8 = (undefined8 *)*puVar4;
        if (-1 < (char)*(byte *)((long)puVar4 + 0x17)) {
          uVar18 = (ulong)*(byte *)((long)puVar4 + 0x17);
          puVar8 = puVar4;
        }
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (plVar19,puVar8,uVar18);
      }
      uVar20 = *(uint *)((long)unaff_x19 + 0x1c);
      do {
        uStack0000000000000008._7_1_ = (byte)uVar20 & 0x7f | (0x7f < uVar20) << 7;
        uVar10 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                           (plVar19,(long)&uStack0000000000000008 + 7,1);
        bVar1 = 0x7f < uVar20;
        uVar20 = uVar20 >> 7;
      } while (bVar1);
      return uVar10;
    }
  }
  if (uVar18 == unaff_x22) {
    lVar15 = 0x10;
  }
  else {
    lVar12 = unaff_x19[0x47];
    lVar15 = 0x10;
    do {
      lVar15 = lVar15 + *(long *)(lVar12 + uVar18 * 0x18 + 8) + 2;
      uVar13 = uVar18 + 1;
      if (uVar13 < unaff_x22) {
        lVar14 = unaff_x19[0x4a];
        if (lVar14 == 0) {
          plVar19 = (long *)(lVar12 + 0x18 + uVar18 * 0x18);
          while (*plVar19 == 0) {
            uVar13 = uVar13 + 1;
            plVar19 = plVar19 + 3;
            if (unaff_x22 == uVar13) goto LAB_006b3584;
          }
        }
        else {
          plVar19 = (long *)(lVar12 + 0x20 + uVar18 * 0x18);
          while( true ) {
            if ((plVar19[-1] == 0) || (*plVar19 != unaff_x19[0x4b])) break;
            iVar9 = _memcmp(plVar19[-1],lVar14);
            if (iVar9 != 0) break;
            uVar13 = uVar13 + 1;
            plVar19 = plVar19 + 3;
            if (unaff_x22 == uVar13) goto LAB_006b3584;
          }
        }
      }
      uVar18 = uVar13;
    } while (uVar18 != unaff_x22);
  }
  goto LAB_006b3584;
}

