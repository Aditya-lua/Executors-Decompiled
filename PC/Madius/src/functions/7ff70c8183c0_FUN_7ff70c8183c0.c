/* 7ff70c8183c0 FUN_7ff70c8183c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8183c0(uint param_1)

{
  longlong lVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  uint uVar5;
  undefined4 uVar6;
  ulonglong uVar7;
  uint uVar8;
  longlong lVar9;
  float fVar10;
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if ((param_1 & 0xfffc005f) != 0) {
    FUN_7ff70c80af70(&UNK_7ff70cb906c8);
  }
  if (((*(char *)(lVar4 + 0x1f91) == '\x01') && ((param_1 & 0x800) == 0)) &&
     (*(char *)(lVar4 + 0x1f90) != '\0')) {
    uVar7 = 0;
    if ((*(int *)(_DAT_7ff70cc1a3c0 + 0x1f94) == 0) ||
       (*(int *)(_DAT_7ff70cc1a3c0 + 0x1f94) != *(int *)(_DAT_7ff70cc1a3c0 + 0x1e20)))
    goto LAB_7ff70c81858c;
    if (((param_1 & 0x400) == 0) &&
       (uVar5 = *(uint *)(lVar4 + 0x1e24) & 0x400, uVar7 = (ulonglong)uVar5, uVar5 != 0))
    goto LAB_7ff70c81858a;
    if ((param_1 & 0x1000) != 0) {
      uVar5 = *(uint *)(lVar4 + 0x1104);
      uVar7 = (ulonglong)uVar5;
      uVar8 = uVar5 & 0xfffe2fff;
      if ((param_1 & 0x1c000) == 0) {
        uVar8 = uVar5;
      }
      param_1 = param_1 | uVar8;
    }
LAB_7ff70c8185d9:
    if ((param_1 & 0x10000) == 0) {
      fVar10 = 0.0;
      if ((short)param_1 < 0) {
        fVar10 = *(float *)(_DAT_7ff70cc1a3c0 + 0x10f8);
      }
    }
    else {
      fVar10 = *(float *)(_DAT_7ff70cc1a3c0 + 0x10fc);
    }
    if (((param_1 & 0x2000) != 0) || (0.0 < fVar10)) {
      uVar5 = *(uint *)(lVar4 + 0x1e20);
      if (uVar5 == 0) {
        uVar6 = crc32(~*(uint *)(*(longlong *)(lVar1 + 0x110) + -4 +
                                (longlong)*(int *)(lVar1 + 0x108) * 4),
                      *(float *)(lVar4 + 0x1e2c) - *(float *)(lVar1 + 0x128));
        uVar5 = crc32(uVar6,*(float *)(lVar4 + 0x1e30) - *(float *)(lVar1 + 300));
        uVar5 = ~uVar5;
      }
      uVar7 = (ulonglong)uVar5;
      if (((param_1 & 0x20000) != 0) && (*(uint *)(lVar4 + 0x23e4) != uVar5)) {
        *(undefined4 *)(lVar4 + 0x23e8) = 0;
      }
      *(uint *)(lVar4 + 0x23e0) = uVar5;
      if ((((param_1 & 0x2000) != 0) && (*(uint *)(lVar4 + 0x23f0) != uVar5)) ||
         (*(float *)(lVar4 + 0x23e8) <= fVar10 && fVar10 != *(float *)(lVar4 + 0x23e8)))
      goto LAB_7ff70c81858a;
    }
    uVar7 = CONCAT71((int7)(uVar7 >> 8),1);
  }
  else {
    if ((*(uint *)(lVar4 + 0x1e28) & 1) != 0) {
      if ((param_1 & 0x1000) != 0) {
        uVar5 = *(uint *)(lVar4 + 0x1100) & 0xfffe2fff;
        if ((param_1 & 0x1c000) == 0) {
          uVar5 = *(uint *)(lVar4 + 0x1100);
        }
        param_1 = param_1 | uVar5;
      }
      if ((*(longlong *)(lVar4 + 0x1448) == lVar1) ||
         ((param_1 & 0x200) != 0 || (*(uint *)(lVar4 + 0x1e28) & 0x80) != 0)) {
        uVar5 = *(uint *)(lVar4 + 0x1e20);
        uVar7 = (ulonglong)uVar5;
        if (((((char)param_1 < '\0') ||
             ((uVar8 = *(uint *)(lVar4 + 0x14b4), uVar8 == 0 || (uVar8 == uVar5)))) ||
            (*(char *)(lVar4 + 0x14c1) != '\0')) || (uVar8 == *(uint *)(lVar1 + 0x8c))) {
          if ((((((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) != 0) &&
                 (lVar2 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3c0),
                 lVar2 != 0)) && (*(char *)(lVar2 + 0xcd) == '\x01')) &&
               (lVar9 = *(longlong *)(lVar1 + 0x3c0), lVar2 != lVar9)) &&
              (((*(uint *)(lVar2 + 0x14) & 0x8000000) != 0 ||
               (((param_1 & 0x20) == 0 && ((*(uint *)(lVar2 + 0x14) & 0x4000000) != 0)))))) &&
             (*(longlong *)(lVar9 + 0x3c0) != lVar2)) {
            do {
              if (lVar9 == lVar2) goto LAB_7ff70c81856a;
              lVar9 = *(longlong *)(lVar9 + 0x3b8);
            } while (lVar9 != 0);
            if ((*(byte *)(lVar4 + 0x1e25) & 0x20) == 0) goto LAB_7ff70c81858a;
          }
LAB_7ff70c81856a:
          if (((((param_1 & 0x400) == 0 & (byte)(*(uint *)(lVar4 + 0x1e24) >> 10) & 1) == 0) &&
              ((uVar5 != *(uint *)(lVar1 + 0x8c) || (*(char *)(lVar1 + 0xce) == '\0')))) &&
             (((param_1 & 0x100) != 0 ||
              ((((*(uint *)(lVar4 + 0x1e24) & 0x4000) == 0 || (uVar5 == 0)) ||
               (*(uint *)(lVar4 + 0x14a0) == uVar5)))))) goto LAB_7ff70c8185d9;
        }
      }
    }
LAB_7ff70c81858a:
    uVar7 = 0;
  }
LAB_7ff70c81858c:
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_48)) {
    return uVar7;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
  pcVar3 = (code *)swi(3);
  uVar7 = (*pcVar3)();
  return uVar7;
}


