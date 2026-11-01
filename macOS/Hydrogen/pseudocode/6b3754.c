
undefined8 FUN_006b3754(ulong param_1)

{
  bool bVar1;
  long lVar2;
  byte bVar3;
  undefined1 in_CY;
  long lVar4;
  undefined8 uVar5;
  undefined1 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  ulong in_x9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  ulong unaff_x21;
  undefined8 *unaff_x22;
  ulong unaff_x25;
  uint uVar9;
  uint unaff_w26;
  ulong unaff_x27;
  uint unaff_w28;
  undefined1 uStack000000000000000c;
  byte bStack000000000000000d;
  byte bStack000000000000000f;
  
code_r0x006b3754:
  if ((bool)in_CY) {
    param_1 = in_x9 + 1;
  }
code_r0x006b3758:
  lVar4 = __Znwm(param_1);
  if (unaff_x21 != 0) {
    _memmove(lVar4,unaff_x22,unaff_x21);
  }
  *(char *)(lVar4 + unaff_x21) = (char)unaff_w28;
  if (unaff_x21 != 0x16) {
    __ZdlPv(unaff_x22);
  }
  unaff_x19[0x57] = lVar4;
  unaff_x19[0x59] = param_1 | 0x8000000000000000;
  unaff_x19[0x58] = unaff_x27;
  puVar6 = (undefined1 *)(lVar4 + unaff_x27);
  uVar9 = unaff_w26;
LAB_006b369c:
  *puVar6 = 0;
  unaff_w26 = uVar9 >> 7;
  if (uVar9 < 0x80) {
    do {
      unaff_x25 = unaff_x25 + 1;
      if (((ulong)(unaff_x19[0x45] - unaff_x19[0x44]) >> 5 & 0xffffffff) <= unaff_x25) {
        uStack000000000000000c = 0;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar9 = (int)((ulong)(unaff_x19[1] - *unaff_x19) >> 3) * -0xf0f0f0f;
        do {
          bStack000000000000000d = (byte)uVar9 & 0x7f | (0x7f < uVar9) << 7;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          bVar1 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar1);
        lVar2 = unaff_x19[1];
        for (lVar4 = *unaff_x19; lVar4 != lVar2; lVar4 = lVar4 + 0x88) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        }
        uVar9 = *(uint *)((long)unaff_x19 + 0x1c);
        do {
          bStack000000000000000f = (byte)uVar9 & 0x7f | (0x7f < uVar9) << 7;
          uVar5 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          bVar1 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar1);
        return uVar5;
      }
    } while ((cRam0000000000a33580 != '\0') &&
            (*(char *)(unaff_x19[0x44] + unaff_x25 * 0x20 + 0x1c) == '\0'));
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_w26 = *(uint *)(unaff_x19[0x44] + unaff_x25 * 0x20 + 0x18);
  }
  unaff_w28 = unaff_w26 & 0x7f | (uint)(0x7f < unaff_w26) << 7;
  bVar3 = *(byte *)((long)unaff_x19 + 0x2cf);
  if ((char)bVar3 < '\0') {
    unaff_x27 = unaff_x19[0x59] & 0x7fffffffffffffff;
    unaff_x21 = unaff_x27 - 1;
    uVar8 = unaff_x19[0x58];
    if (unaff_x21 == uVar8) goto code_r0x006b3700;
    puVar7 = (undefined8 *)*unaff_x20;
  }
  else {
    uVar8 = (ulong)bVar3;
    puVar7 = unaff_x20;
    if (bVar3 == 0x16) {
      unaff_x27 = 0x17;
      unaff_x21 = 0x16;
      unaff_x22 = unaff_x20;
      goto code_r0x006b372c;
    }
  }
  *(char *)((long)puVar7 + uVar8) = (char)unaff_w28;
  lVar4 = uVar8 + 1;
  uVar9 = unaff_w26;
  if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
    unaff_x19[0x58] = lVar4;
    puVar6 = (undefined1 *)((long)puVar7 + lVar4);
  }
  else {
    *(byte *)((long)unaff_x19 + 0x2cf) = (byte)lVar4 & 0x7f;
    puVar6 = (undefined1 *)((long)puVar7 + lVar4);
  }
  goto LAB_006b369c;
code_r0x006b3700:
  if (unaff_x27 == 0x7ffffffffffffff7) {
    func_0x0001748c();
    return 6;
  }
  unaff_x22 = (undefined8 *)*unaff_x20;
  param_1 = 0x7ffffffffffffff7;
  if (unaff_x21 < 0x3ffffffffffffff3) goto code_r0x006b372c;
  goto code_r0x006b3758;
code_r0x006b372c:
  uVar8 = unaff_x27;
  if (unaff_x27 <= unaff_x21 * 2) {
    uVar8 = unaff_x21 * 2;
  }
  in_x9 = (uVar8 & 0x7ffffffffffffff8) + 8;
  if ((uVar8 | 7) != 0x17) {
    in_x9 = uVar8 | 7;
  }
  in_CY = 0x16 < uVar8;
  param_1 = 0x17;
  goto code_r0x006b3754;
}

