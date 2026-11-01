
undefined8 FUN_006b3774(long param_1,undefined8 *param_2,ulong param_3)

{
  bool bVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  byte bVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  ulong unaff_x21;
  undefined8 *unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  uint uVar10;
  uint unaff_w26;
  ulong unaff_x27;
  uint unaff_w28;
  undefined1 uStack000000000000000c;
  byte bStack000000000000000d;
  byte bStack000000000000000f;
  
code_r0x006b3774:
  _memmove(param_1,param_2,param_3);
  param_3 = unaff_x21;
  param_2 = unaff_x22;
  param_1 = unaff_x24;
code_r0x006b3778:
  *(char *)(param_1 + param_3) = (char)unaff_w28;
  if (param_3 != 0x16) {
    __ZdlPv(param_2);
  }
  unaff_x19[0x57] = param_1;
  unaff_x19[0x59] = unaff_x23 | 0x8000000000000000;
  unaff_x19[0x58] = unaff_x27;
  puVar7 = (undefined1 *)(param_1 + unaff_x27);
  uVar10 = unaff_w26;
code_r0x006b369c:
  *puVar7 = 0;
  unaff_w26 = uVar10 >> 7;
  if (uVar10 < 0x80) {
    do {
      unaff_x25 = unaff_x25 + 1;
      if (((ulong)(unaff_x19[0x45] - unaff_x19[0x44]) >> 5 & 0xffffffff) <= unaff_x25) {
        uStack000000000000000c = 0;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        uVar10 = (int)((ulong)(unaff_x19[1] - *unaff_x19) >> 3) * -0xf0f0f0f;
        do {
          bStack000000000000000d = (byte)uVar10 & 0x7f | (0x7f < uVar10) << 7;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          bVar1 = 0x7f < uVar10;
          uVar10 = uVar10 >> 7;
        } while (bVar1);
        lVar4 = unaff_x19[1];
        for (lVar2 = *unaff_x19; lVar2 != lVar4; lVar2 = lVar2 + 0x88) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
        }
        uVar10 = *(uint *)((long)unaff_x19 + 0x1c);
        do {
          bStack000000000000000f = (byte)uVar10 & 0x7f | (0x7f < uVar10) << 7;
          uVar6 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
          bVar1 = 0x7f < uVar10;
          uVar10 = uVar10 >> 7;
        } while (bVar1);
        return uVar6;
      }
    } while ((cRam0000000000a33580 != '\0') &&
            (*(char *)(unaff_x19[0x44] + unaff_x25 * 0x20 + 0x1c) == '\0'));
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_w26 = *(uint *)(unaff_x19[0x44] + unaff_x25 * 0x20 + 0x18);
  }
  unaff_w28 = unaff_w26 & 0x7f | (uint)(0x7f < unaff_w26) << 7;
  bVar5 = *(byte *)((long)unaff_x19 + 0x2cf);
  if ((char)bVar5 < '\0') {
    unaff_x27 = unaff_x19[0x59] & 0x7fffffffffffffff;
    param_3 = unaff_x27 - 1;
    uVar9 = unaff_x19[0x58];
    if (param_3 == uVar9) {
      if (unaff_x27 == 0x7ffffffffffffff7) {
        func_0x0001748c();
        return 6;
      }
      param_2 = (undefined8 *)*unaff_x20;
      unaff_x23 = 0x7ffffffffffffff7;
      if (0x3ffffffffffffff2 < param_3) goto code_r0x006b3758;
      goto code_r0x006b372c;
    }
    puVar8 = (undefined8 *)*unaff_x20;
  }
  else {
    uVar9 = (ulong)bVar5;
    puVar8 = unaff_x20;
    if (bVar5 == 0x16) goto code_r0x006b36d8;
  }
  *(char *)((long)puVar8 + uVar9) = (char)unaff_w28;
  lVar2 = uVar9 + 1;
  uVar10 = unaff_w26;
  if (*(char *)((long)unaff_x19 + 0x2cf) < '\0') {
    unaff_x19[0x58] = lVar2;
    puVar7 = (undefined1 *)((long)puVar8 + lVar2);
  }
  else {
    *(byte *)((long)unaff_x19 + 0x2cf) = (byte)lVar2 & 0x7f;
    puVar7 = (undefined1 *)((long)puVar8 + lVar2);
  }
  goto code_r0x006b369c;
code_r0x006b36d8:
  unaff_x27 = 0x17;
  param_3 = 0x16;
  param_2 = unaff_x20;
code_r0x006b372c:
  uVar9 = unaff_x27;
  if (unaff_x27 <= param_3 * 2) {
    uVar9 = param_3 * 2;
  }
  uVar3 = (uVar9 & 0x7ffffffffffffff8) + 8;
  if ((uVar9 | 7) != 0x17) {
    uVar3 = uVar9 | 7;
  }
  unaff_x23 = 0x17;
  if (0x16 < uVar9) {
    unaff_x23 = uVar3 + 1;
  }
code_r0x006b3758:
  param_1 = __Znwm(unaff_x23);
  if (param_3 != 0) goto code_r0x006b3768;
  goto code_r0x006b3778;
code_r0x006b3768:
  unaff_x21 = param_3;
  unaff_x22 = param_2;
  unaff_x24 = param_1;
  goto code_r0x006b3774;
}

