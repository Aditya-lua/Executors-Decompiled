
undefined8 FUN_006b3598(long param_1)

{
  bool bVar1;
  long *plVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  byte bVar7;
  byte bVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  long lVar11;
  undefined1 *puVar12;
  long in_x9;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  long *unaff_x19;
  long unaff_x21;
  ulong uVar16;
  long *plVar17;
  uint uVar18;
  ulong uVar19;
  undefined8 uStack0000000000000008;
  
  for (; param_1 != in_x9; param_1 = param_1 + 0x88) {
    if ((char)*(byte *)(param_1 + 0x17) < '\0') {
      uVar15 = *(ulong *)(param_1 + 8);
    }
    else {
      uVar15 = (ulong)*(byte *)(param_1 + 0x17);
    }
    unaff_x21 = uVar15 + unaff_x21;
  }
  plVar2 = unaff_x19 + 0x57;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm(plVar2,unaff_x21);
  if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
    plVar17 = (long *)unaff_x19[0x57];
    unaff_x19[0x58] = 1;
  }
  else {
    *(undefined1 *)((long)unaff_x19 + 0x2cf) = 1;
    plVar17 = plVar2;
  }
  *(undefined2 *)plVar17 = 6;
  uStack0000000000000008._3_1_ = 3;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (plVar2,(long)&uStack0000000000000008 + 3,1);
  func_0x006b38c0();
  lVar11 = unaff_x19[0x45];
  lVar13 = unaff_x19[0x44];
  if ((lVar11 - lVar13 & 0x1fffffffe0U) != 0) {
    uVar15 = 0;
    do {
      if ((cRam0000000000a33580 == '\0') || (*(char *)(lVar13 + uVar15 * 0x20 + 0x1c) != '\0')) {
        uStack0000000000000008._6_1_ = (char)uVar15 + '\x01';
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (plVar2,(long)&uStack0000000000000008 + 6,1);
        uVar18 = *(uint *)(unaff_x19[0x44] + uVar15 * 0x20 + 0x18);
        do {
          bVar8 = (byte)uVar18 & 0x7f | (0x7f < uVar18) << 7;
          bVar7 = *(byte *)((long)unaff_x19 + 0x2cf);
          if ((char)bVar7 < '\0') {
            uVar19 = unaff_x19[0x59] & 0x7fffffffffffffff;
            uVar16 = uVar19 - 1;
            uVar14 = unaff_x19[0x58];
            if (uVar16 == uVar14) {
              if (uVar19 == 0x7ffffffffffffff7) {
                func_0x0001748c(plVar2);
                return 6;
              }
              plVar17 = (long *)*plVar2;
              uVar14 = 0x7ffffffffffffff7;
              if (uVar16 < 0x3ffffffffffffff3) goto code_r0x006b372c;
              goto code_r0x006b3758;
            }
            plVar17 = (long *)*plVar2;
code_r0x006b3794:
            *(byte *)((long)plVar17 + uVar14) = bVar8;
            lVar11 = uVar14 + 1;
            if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
              unaff_x19[0x58] = lVar11;
              puVar12 = (undefined1 *)((long)plVar17 + lVar11);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x2cf) = (byte)lVar11 & 0x7f;
              puVar12 = (undefined1 *)((long)plVar17 + lVar11);
            }
          }
          else {
            uVar14 = (ulong)bVar7;
            plVar17 = plVar2;
            if (bVar7 != 0x16) goto code_r0x006b3794;
            uVar19 = 0x17;
            uVar16 = 0x16;
code_r0x006b372c:
            uVar3 = uVar19;
            if (uVar19 <= uVar16 * 2) {
              uVar3 = uVar16 * 2;
            }
            uVar4 = (uVar3 & 0x7ffffffffffffff8) + 8;
            if ((uVar3 | 7) != 0x17) {
              uVar4 = uVar3 | 7;
            }
            uVar14 = 0x17;
            if (0x16 < uVar3) {
              uVar14 = uVar4 + 1;
            }
code_r0x006b3758:
            lVar11 = __Znwm(uVar14);
            if (uVar16 != 0) {
              _memmove(lVar11,plVar17,uVar16);
            }
            *(byte *)(lVar11 + uVar16) = bVar8;
            if (uVar16 != 0x16) {
              __ZdlPv(plVar17);
            }
            unaff_x19[0x57] = lVar11;
            unaff_x19[0x59] = uVar14 | 0x8000000000000000;
            unaff_x19[0x58] = uVar19;
            puVar12 = (undefined1 *)(lVar11 + uVar19);
          }
          *puVar12 = 0;
          bVar1 = 0x7f < uVar18;
          uVar18 = uVar18 >> 7;
        } while (bVar1);
        lVar11 = unaff_x19[0x45];
        lVar13 = unaff_x19[0x44];
      }
      uVar15 = uVar15 + 1;
    } while (uVar15 < ((ulong)(lVar11 - lVar13) >> 5 & 0xffffffff));
  }
  uStack0000000000000008._4_1_ = 0;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (plVar2,(long)&uStack0000000000000008 + 4,1);
  uVar18 = (int)((ulong)(unaff_x19[1] - *unaff_x19) >> 3) * -0xf0f0f0f;
  do {
    uStack0000000000000008._5_1_ = (byte)uVar18 & 0x7f | (0x7f < uVar18) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar2,(long)&uStack0000000000000008 + 5,1);
    bVar1 = 0x7f < uVar18;
    uVar18 = uVar18 >> 7;
  } while (bVar1);
  puVar6 = (undefined8 *)unaff_x19[1];
  for (puVar5 = (undefined8 *)*unaff_x19; puVar5 != puVar6; puVar5 = puVar5 + 0x11) {
    uVar15 = puVar5[1];
    puVar9 = (undefined8 *)*puVar5;
    if (-1 < (char)*(byte *)((long)puVar5 + 0x17)) {
      uVar15 = (ulong)*(byte *)((long)puVar5 + 0x17);
      puVar9 = puVar5;
    }
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (plVar2,puVar9,uVar15);
  }
  uVar18 = *(uint *)((long)unaff_x19 + 0x1c);
  do {
    uStack0000000000000008._7_1_ = (byte)uVar18 & 0x7f | (0x7f < uVar18) << 7;
    uVar10 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                       (plVar2,(long)&uStack0000000000000008 + 7,1);
    bVar1 = 0x7f < uVar18;
    uVar18 = uVar18 >> 7;
  } while (bVar1);
  return uVar10;
}

