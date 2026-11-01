
undefined8 FUN_006b3674(void)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  byte bVar5;
  byte bVar6;
  long lVar7;
  undefined8 uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long *unaff_x19;
  undefined8 *unaff_x20;
  ulong uVar11;
  undefined8 *puVar12;
  ulong unaff_x25;
  uint uVar13;
  ulong uVar14;
  undefined1 uStack000000000000000c;
  byte bStack000000000000000d;
  byte bStack000000000000000f;
  
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar13 = *(uint *)(unaff_x19[0x44] + unaff_x25 * 0x20 + 0x18);
    do {
      bVar6 = (byte)uVar13 & 0x7f | (0x7f < uVar13) << 7;
      bVar5 = *(byte *)((long)unaff_x19 + 0x2cf);
      if ((char)bVar5 < '\0') {
        uVar14 = unaff_x19[0x59] & 0x7fffffffffffffff;
        uVar11 = uVar14 - 1;
        uVar10 = unaff_x19[0x58];
        if (uVar11 == uVar10) {
          if (uVar14 == 0x7ffffffffffffff7) {
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
        *(byte *)((long)puVar12 + uVar10) = bVar6;
        lVar7 = uVar10 + 1;
        if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
          unaff_x19[0x58] = lVar7;
          puVar9 = (undefined1 *)((long)puVar12 + lVar7);
        }
        else {
          *(byte *)((long)unaff_x19 + 0x2cf) = (byte)lVar7 & 0x7f;
          puVar9 = (undefined1 *)((long)puVar12 + lVar7);
        }
      }
      else {
        uVar10 = (ulong)bVar5;
        puVar12 = unaff_x20;
        if (bVar5 != 0x16) goto code_r0x006b3794;
        uVar14 = 0x17;
        uVar11 = 0x16;
code_r0x006b372c:
        uVar2 = uVar14;
        if (uVar14 <= uVar11 * 2) {
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
        *(byte *)(lVar7 + uVar11) = bVar6;
        if (uVar11 != 0x16) {
          __ZdlPv(puVar12);
        }
        unaff_x19[0x57] = lVar7;
        unaff_x19[0x59] = uVar10 | 0x8000000000000000;
        unaff_x19[0x58] = uVar14;
        puVar9 = (undefined1 *)(lVar7 + uVar14);
      }
      *puVar9 = 0;
      bVar1 = 0x7f < uVar13;
      uVar13 = uVar13 >> 7;
    } while (bVar1);
    do {
      unaff_x25 = unaff_x25 + 1;
      if (((ulong)(unaff_x19[0x45] - unaff_x19[0x44]) >> 5 & 0xffffffff) <= unaff_x25) {
        uStack000000000000000c = 0;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar13 = (int)((ulong)(unaff_x19[1] - *unaff_x19) >> 3) * -0xf0f0f0f;
        do {
          bStack000000000000000d = (byte)uVar13 & 0x7f | (0x7f < uVar13) << 7;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          bVar1 = 0x7f < uVar13;
          uVar13 = uVar13 >> 7;
        } while (bVar1);
        lVar4 = unaff_x19[1];
        for (lVar7 = *unaff_x19; lVar7 != lVar4; lVar7 = lVar7 + 0x88) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        }
        uVar13 = *(uint *)((long)unaff_x19 + 0x1c);
        do {
          bStack000000000000000f = (byte)uVar13 & 0x7f | (0x7f < uVar13) << 7;
          uVar8 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          bVar1 = 0x7f < uVar13;
          uVar13 = uVar13 >> 7;
        } while (bVar1);
        return uVar8;
      }
    } while ((cRam0000000000a33580 != '\0') &&
            (*(char *)(unaff_x19[0x44] + unaff_x25 * 0x20 + 0x1c) == '\0'));
  } while( true );
}

