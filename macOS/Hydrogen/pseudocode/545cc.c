
long * FUN_000545cc(undefined8 param_1)

{
  long *plVar1;
  byte bVar2;
  int iVar3;
  long *plVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
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
  ulong unaff_x28;
  undefined2 uVar10;
  undefined8 uVar11;
  
  do {
    iVar3 = _memcmp(param_1);
    if (iVar3 == 0) {
      return unaff_x20;
    }
LAB_0005455c:
    while( true ) {
      do {
        do {
          unaff_x20 = (long *)*unaff_x20;
          if (unaff_x20 == (long *)0x0) goto code_r0x000545e0;
          if (unaff_x20[1] != unaff_x23) goto code_r0x00054550;
        } while (unaff_x20[2] != unaff_x27);
        bVar2 = *(byte *)((long)unaff_x20 + 0x2f);
        uVar7 = unaff_x20[4];
        if (-1 < (char)bVar2) {
          uVar7 = (ulong)bVar2;
        }
      } while (uVar7 != unaff_x26);
      if ((char)bVar2 < '\0') break;
      if (bVar2 == 0) {
        return unaff_x20;
      }
      uVar7 = 0;
      while (*(char *)((long)unaff_x20 + uVar7 + 0x18) == *(char *)(unaff_x22 + uVar7)) {
        uVar7 = uVar7 + 1;
        if (bVar2 == uVar7) {
          return unaff_x20;
        }
      }
    }
    param_1 = unaff_x20[3];
  } while( true );
code_r0x00054550:
  if ((unaff_x20[1] & unaff_x28) == unaff_x25) goto LAB_0005455c;
code_r0x000545e0:
  plVar1 = unaff_x19 + 2;
  plVar4 = (long *)__Znwm(0x30);
  *plVar4 = 0;
  plVar4[1] = unaff_x23;
  plVar4[2] = *unaff_x21;
  lVar8 = unaff_x21[1];
  plVar4[4] = unaff_x21[2];
  plVar4[3] = lVar8;
  plVar4[5] = unaff_x21[3];
  unaff_x21[1] = 0;
  unaff_x21[2] = 0;
  unaff_x21[3] = 0;
  if ((unaff_x24 == 0) || (*(float *)(unaff_x19 + 4) * (float)unaff_x24 < (float)(unaff_x19[3] + 1))
     ) {
    uVar7 = 1;
    if (2 < unaff_x24) {
      uVar7 = (ulong)((unaff_x24 & unaff_x24 - 1) != 0);
    }
    uVar7 = uVar7 | unaff_x24 << 1;
    uVar9 = (ulong)((float)(unaff_x19[3] + 1) / *(float *)(unaff_x19 + 4));
    if (uVar7 <= uVar9) {
      uVar7 = uVar9;
    }
    if (uVar7 - 1 == 0) {
      uVar7 = 2;
    }
    else if ((uVar7 & uVar7 - 1) != 0) {
      uVar7 = __ZNSt3__112__next_primeEm(uVar7);
    }
    uVar9 = unaff_x19[1];
    if (uVar9 < uVar7) {
code_r0x000546bc:
      func_0x000280c4();
    }
    else if (uVar7 < uVar9) {
      uVar5 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
      if ((uVar9 < 3) ||
         (uVar11 = CONCAT17(POPCOUNT((char)(uVar9 >> 0x38)),
                            CONCAT16(POPCOUNT((char)(uVar9 >> 0x30)),
                                     CONCAT15(POPCOUNT((char)(uVar9 >> 0x28)),
                                              CONCAT14(POPCOUNT((char)(uVar9 >> 0x20)),
                                                       CONCAT13(POPCOUNT((char)(uVar9 >> 0x18)),
                                                                CONCAT12(POPCOUNT((char)(uVar9 >> 
                                                  0x10)),CONCAT11(POPCOUNT((char)(uVar9 >> 8)),
                                                                  POPCOUNT((char)uVar9)))))))),
         uVar10 = NEON_uaddlv(uVar11,1),
         1 < (CONCAT62((int6)((ulong)uVar11 >> 0x10),uVar10) & 0xffffffff))) {
        uVar5 = __ZNSt3__112__next_primeEm();
      }
      else if (1 < uVar5) {
        uVar5 = 1L << (-LZCOUNT(uVar5 - 1) & 0x3fU);
      }
      if (uVar7 <= uVar5) {
        uVar7 = uVar5;
      }
      if (uVar7 < uVar9) goto code_r0x000546bc;
    }
    unaff_x24 = unaff_x19[1];
    if ((unaff_x24 & unaff_x24 - 1) == 0) {
      unaff_x25 = unaff_x24 - 1 & unaff_x23;
      lVar8 = *unaff_x19;
      plVar6 = *(long **)(lVar8 + unaff_x25 * 8);
      goto joined_r0x0005479c;
    }
    if (unaff_x23 < unaff_x24) {
      lVar8 = *unaff_x19;
      plVar6 = *(long **)(lVar8 + unaff_x23 * 8);
      unaff_x25 = unaff_x23;
      goto joined_r0x0005479c;
    }
    uVar7 = 0;
    if (unaff_x24 != 0) {
      uVar7 = unaff_x23 / unaff_x24;
    }
    unaff_x25 = unaff_x23 - uVar7 * unaff_x24;
    lVar8 = *unaff_x19;
    plVar6 = *(long **)(lVar8 + unaff_x25 * 8);
    if (plVar6 == (long *)0x0) goto code_r0x00054758;
code_r0x00054650:
    *plVar4 = *plVar6;
  }
  else {
    lVar8 = *unaff_x19;
    plVar6 = *(long **)(lVar8 + unaff_x25 * 8);
joined_r0x0005479c:
    if (plVar6 != (long *)0x0) goto code_r0x00054650;
code_r0x00054758:
    *plVar4 = *plVar1;
    *plVar1 = (long)plVar4;
    *(long **)(lVar8 + unaff_x25 * 8) = plVar1;
    if (*plVar4 == 0) goto code_r0x000547d8;
    uVar7 = *(ulong *)(*plVar4 + 8);
    if ((unaff_x24 & unaff_x24 - 1) == 0) {
      uVar7 = uVar7 & unaff_x24 - 1;
    }
    else if (unaff_x24 <= uVar7) {
      uVar9 = 0;
      if (unaff_x24 != 0) {
        uVar9 = uVar7 / unaff_x24;
      }
      uVar7 = uVar7 - uVar9 * unaff_x24;
    }
    plVar6 = (long *)(*unaff_x19 + uVar7 * 8);
  }
  *plVar6 = (long)plVar4;
code_r0x000547d8:
  unaff_x19[3] = unaff_x19[3] + 1;
  return plVar4;
}

