
undefined8 FUN_006b35e0(undefined2 *param_1)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  byte bVar5;
  undefined8 uVar6;
  long lVar7;
  undefined1 *puVar8;
  long in_x9;
  long lVar9;
  ulong uVar10;
  long *unaff_x19;
  undefined8 *unaff_x20;
  ulong uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  uint uVar14;
  ulong uVar15;
  undefined1 uStack000000000000000b;
  undefined1 uStack000000000000000c;
  byte bStack000000000000000d;
  byte bStack000000000000000f;
  
  unaff_x19[0x58] = in_x9;
  *param_1 = 6;
  uStack000000000000000b = 3;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  func_0x006b38c0();
  lVar7 = unaff_x19[0x45];
  lVar9 = unaff_x19[0x44];
  if ((lVar7 - lVar9 & 0x1fffffffe0U) != 0) {
    uVar13 = 0;
    do {
      if ((cRam0000000000a33580 == '\0') || (*(char *)(lVar9 + uVar13 * 0x20 + 0x1c) != '\0')) {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar14 = *(uint *)(unaff_x19[0x44] + uVar13 * 0x20 + 0x18);
        do {
          bVar5 = (byte)uVar14 & 0x7f | (0x7f < uVar14) << 7;
          bVar4 = *(byte *)((long)unaff_x19 + 0x2cf);
          if ((char)bVar4 < '\0') {
            uVar15 = unaff_x19[0x59] & 0x7fffffffffffffff;
            uVar11 = uVar15 - 1;
            uVar10 = unaff_x19[0x58];
            if (uVar11 == uVar10) {
              if (uVar15 == 0x7ffffffffffffff7) {
                func_0x0001748c();
                return 6;
              }
              puVar12 = (undefined8 *)*unaff_x20;
              uVar10 = 0x7ffffffffffffff7;
              if (uVar11 < 0x3ffffffffffffff3) goto code_r0x006b372c;
              goto code_r0x006b3758;
            }
            puVar12 = (undefined8 *)*unaff_x20;
code_r0x006b3794:
            *(byte *)((long)puVar12 + uVar10) = bVar5;
            lVar7 = uVar10 + 1;
            if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
              unaff_x19[0x58] = lVar7;
              puVar8 = (undefined1 *)((long)puVar12 + lVar7);
            }
            else {
              *(byte *)((long)unaff_x19 + 0x2cf) = (byte)lVar7 & 0x7f;
              puVar8 = (undefined1 *)((long)puVar12 + lVar7);
            }
          }
          else {
            uVar10 = (ulong)bVar4;
            puVar12 = unaff_x20;
            if (bVar4 != 0x16) goto code_r0x006b3794;
            uVar15 = 0x17;
            uVar11 = 0x16;
code_r0x006b372c:
            uVar2 = uVar15;
            if (uVar15 <= uVar11 * 2) {
              uVar2 = uVar11 * 2;
            }
            uVar3 = (uVar2 & 0x7ffffffffffffff8) + 8;
            if ((uVar2 | 7) != 0x17) {
              uVar3 = uVar2 | 7;
            }
            uVar10 = 0x17;
            if (0x16 < uVar2) {
              uVar10 = uVar3 + 1;
            }
code_r0x006b3758:
            lVar7 = __Znwm(uVar10);
            if (uVar11 != 0) {
              _memmove(lVar7,puVar12,uVar11);
            }
            *(byte *)(lVar7 + uVar11) = bVar5;
            if (uVar11 != 0x16) {
              __ZdlPv(puVar12);
            }
            unaff_x19[0x57] = lVar7;
            unaff_x19[0x59] = uVar10 | 0x8000000000000000;
            unaff_x19[0x58] = uVar15;
            puVar8 = (undefined1 *)(lVar7 + uVar15);
          }
          *puVar8 = 0;
          bVar1 = 0x7f < uVar14;
          uVar14 = uVar14 >> 7;
        } while (bVar1);
        lVar7 = unaff_x19[0x45];
        lVar9 = unaff_x19[0x44];
      }
      uVar13 = uVar13 + 1;
    } while (uVar13 < ((ulong)(lVar7 - lVar9) >> 5 & 0xffffffff));
  }
  uStack000000000000000c = 0;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar14 = (int)((ulong)(unaff_x19[1] - *unaff_x19) >> 3) * -0xf0f0f0f;
  do {
    bStack000000000000000d = (byte)uVar14 & 0x7f | (0x7f < uVar14) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar1 = 0x7f < uVar14;
    uVar14 = uVar14 >> 7;
  } while (bVar1);
  lVar9 = unaff_x19[1];
  for (lVar7 = *unaff_x19; lVar7 != lVar9; lVar7 = lVar7 + 0x88) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  }
  uVar14 = *(uint *)((long)unaff_x19 + 0x1c);
  do {
    bStack000000000000000f = (byte)uVar14 & 0x7f | (0x7f < uVar14) << 7;
    uVar6 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar1 = 0x7f < uVar14;
    uVar14 = uVar14 >> 7;
  } while (bVar1);
  return uVar6;
}

