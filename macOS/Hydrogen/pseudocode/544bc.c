
undefined1  [16] FUN_000544bc(void)

{
  long *plVar1;
  byte bVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long *plVar7;
  long lVar8;
  ulong uVar9;
  long *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  undefined2 uVar10;
  undefined1 auVar11 [16];
  
code_r0x000544bc:
  do {
    unaff_x20 = (long *)*unaff_x20;
    if (unaff_x20 == (long *)0x0) break;
    uVar6 = unaff_x20[1];
    if (uVar6 == unaff_x23) {
      if (unaff_x20[2] == unaff_x27) {
        bVar2 = *(byte *)((long)unaff_x20 + 0x2f);
        uVar6 = unaff_x20[4];
        if (-1 < (char)bVar2) {
          uVar6 = (ulong)bVar2;
        }
        if (uVar6 == unaff_x26) {
          if ((char)bVar2 < '\0') {
            iVar3 = _memcmp(unaff_x20[3]);
            if (iVar3 != 0) goto code_r0x000544bc;
          }
          else if (bVar2 != 0) {
            uVar6 = 0;
            while (*(char *)((long)unaff_x20 + uVar6 + 0x18) == *(char *)(unaff_x22 + uVar6)) {
              uVar6 = uVar6 + 1;
              if (bVar2 == uVar6) goto LAB_000545d8;
            }
            goto code_r0x000544bc;
          }
LAB_000545d8:
          uVar5 = 0;
          goto code_r0x000547e8;
        }
      }
      goto code_r0x000544bc;
    }
    if (unaff_x24 <= uVar6) {
      uVar9 = 0;
      if (unaff_x24 != 0) {
        uVar9 = uVar6 / unaff_x24;
      }
      uVar6 = uVar6 - uVar9 * unaff_x24;
    }
  } while (uVar6 == unaff_x25);
  plVar1 = unaff_x19 + 2;
  unaff_x20 = (long *)__Znwm(0x30);
  *unaff_x20 = 0;
  unaff_x20[1] = unaff_x23;
  unaff_x20[2] = *unaff_x21;
  lVar8 = unaff_x21[1];
  unaff_x20[4] = unaff_x21[2];
  unaff_x20[3] = lVar8;
  unaff_x20[5] = unaff_x21[3];
  unaff_x21[1] = 0;
  unaff_x21[2] = 0;
  unaff_x21[3] = 0;
  if ((unaff_x24 == 0) || (*(float *)(unaff_x19 + 4) * (float)unaff_x24 < (float)(unaff_x19[3] + 1))
     ) {
    uVar6 = 1;
    if (2 < unaff_x24) {
      uVar6 = (ulong)((unaff_x24 & unaff_x24 - 1) != 0);
    }
    uVar6 = uVar6 | unaff_x24 << 1;
    uVar9 = (ulong)((float)(unaff_x19[3] + 1) / *(float *)(unaff_x19 + 4));
    if (uVar6 <= uVar9) {
      uVar6 = uVar9;
    }
    if (uVar6 - 1 == 0) {
      uVar6 = 2;
    }
    else if ((uVar6 & uVar6 - 1) != 0) {
      uVar6 = __ZNSt3__112__next_primeEm(uVar6);
    }
    uVar9 = unaff_x19[1];
    if (uVar9 < uVar6) {
LAB_000546bc:
      func_0x000280c4();
    }
    else if (uVar6 < uVar9) {
      uVar4 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
      if ((uVar9 < 3) ||
         (uVar5 = CONCAT17(POPCOUNT((char)(uVar9 >> 0x38)),
                           CONCAT16(POPCOUNT((char)(uVar9 >> 0x30)),
                                    CONCAT15(POPCOUNT((char)(uVar9 >> 0x28)),
                                             CONCAT14(POPCOUNT((char)(uVar9 >> 0x20)),
                                                      CONCAT13(POPCOUNT((char)(uVar9 >> 0x18)),
                                                               CONCAT12(POPCOUNT((char)(uVar9 >> 
                                                  0x10)),CONCAT11(POPCOUNT((char)(uVar9 >> 8)),
                                                                  POPCOUNT((char)uVar9)))))))),
         uVar10 = NEON_uaddlv(uVar5,1),
         1 < (CONCAT62((int6)((ulong)uVar5 >> 0x10),uVar10) & 0xffffffff))) {
        uVar4 = __ZNSt3__112__next_primeEm();
      }
      else if (1 < uVar4) {
        uVar4 = 1L << (-LZCOUNT(uVar4 - 1) & 0x3fU);
      }
      if (uVar6 <= uVar4) {
        uVar6 = uVar4;
      }
      if (uVar6 < uVar9) goto LAB_000546bc;
    }
    unaff_x24 = unaff_x19[1];
    if ((unaff_x24 & unaff_x24 - 1) == 0) {
      unaff_x25 = unaff_x24 - 1 & unaff_x23;
      lVar8 = *unaff_x19;
      plVar7 = *(long **)(lVar8 + unaff_x25 * 8);
      goto joined_r0x0005479c;
    }
    if (unaff_x23 < unaff_x24) {
      lVar8 = *unaff_x19;
      plVar7 = *(long **)(lVar8 + unaff_x23 * 8);
      unaff_x25 = unaff_x23;
      goto joined_r0x0005479c;
    }
    uVar6 = 0;
    if (unaff_x24 != 0) {
      uVar6 = unaff_x23 / unaff_x24;
    }
    unaff_x25 = unaff_x23 - uVar6 * unaff_x24;
    lVar8 = *unaff_x19;
    plVar7 = *(long **)(lVar8 + unaff_x25 * 8);
    if (plVar7 != (long *)0x0) goto LAB_00054650;
code_r0x00054758:
    *unaff_x20 = *plVar1;
    *plVar1 = (long)unaff_x20;
    *(long **)(lVar8 + unaff_x25 * 8) = plVar1;
    if (*unaff_x20 == 0) goto LAB_000547d8;
    uVar6 = *(ulong *)(*unaff_x20 + 8);
    if ((unaff_x24 & unaff_x24 - 1) == 0) {
      uVar6 = uVar6 & unaff_x24 - 1;
    }
    else if (unaff_x24 <= uVar6) {
      uVar9 = 0;
      if (unaff_x24 != 0) {
        uVar9 = uVar6 / unaff_x24;
      }
      uVar6 = uVar6 - uVar9 * unaff_x24;
    }
    plVar7 = (long *)(*unaff_x19 + uVar6 * 8);
  }
  else {
    lVar8 = *unaff_x19;
    plVar7 = *(long **)(lVar8 + unaff_x25 * 8);
joined_r0x0005479c:
    if (plVar7 == (long *)0x0) goto code_r0x00054758;
LAB_00054650:
    *unaff_x20 = *plVar7;
  }
  *plVar7 = (long)unaff_x20;
LAB_000547d8:
  unaff_x19[3] = unaff_x19[3] + 1;
  uVar5 = 1;
code_r0x000547e8:
  auVar11._8_8_ = uVar5;
  auVar11._0_8_ = unaff_x20;
  return auVar11;
}

