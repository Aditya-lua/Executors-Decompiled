
undefined1  [16] FUN_00072498(ulong param_1)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong in_x9;
  ulong uVar4;
  long *plVar5;
  ulong uVar6;
  long *unaff_x19;
  ulong unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  undefined2 uVar7;
  long lVar8;
  undefined1 auVar9 [16];
  
  do {
    if (in_x9 == unaff_x27) {
      if (((uint)param_1 >> 7 & 1) == 0) {
        if ((uint)param_1 == 0) goto LAB_00072574;
        uVar4 = 0;
        while (*(char *)((long)unaff_x23 + uVar4 + 0x10) == *(char *)(unaff_x24 + uVar4)) {
          uVar4 = uVar4 + 1;
          if (param_1 == uVar4) goto LAB_00072574;
        }
      }
      else {
        iVar1 = _memcmp(unaff_x23[2]);
        if (iVar1 == 0) {
LAB_00072574:
          uVar3 = 0;
LAB_000727c8:
          auVar9._8_8_ = uVar3;
          auVar9._0_8_ = unaff_x23;
          return auVar9;
        }
      }
    }
LAB_00072470:
    unaff_x23 = (long *)*unaff_x23;
    if (unaff_x23 == (long *)0x0) goto code_r0x0007257c;
    uVar4 = unaff_x23[1];
    if (uVar4 != unaff_x20) break;
    param_1 = (ulong)*(byte *)((long)unaff_x23 + 0x27);
    in_x9 = unaff_x23[3];
    if (-1 < (char)*(byte *)((long)unaff_x23 + 0x27)) {
      in_x9 = param_1;
    }
  } while( true );
  if (unaff_x25 <= uVar4) {
    uVar6 = 0;
    if (unaff_x25 != 0) {
      uVar6 = uVar4 / unaff_x25;
    }
    uVar4 = uVar4 - uVar6 * unaff_x25;
  }
  if (uVar4 == unaff_x26) goto LAB_00072470;
code_r0x0007257c:
  unaff_x23 = (long *)__Znwm(0x40);
  *unaff_x23 = 0;
  unaff_x23[1] = unaff_x20;
  if (*(char *)((long)unaff_x22 + 0x17) < '\0') {
    func_0x00017634(unaff_x23 + 2,*unaff_x22,unaff_x22[1]);
  }
  else {
    lVar8 = *unaff_x22;
    unaff_x23[3] = unaff_x22[1];
    unaff_x23[2] = lVar8;
    unaff_x23[4] = unaff_x22[2];
  }
  lVar8 = *unaff_x21;
  unaff_x23[6] = unaff_x21[1];
  unaff_x23[5] = lVar8;
  unaff_x23[7] = unaff_x21[2];
  unaff_x21[1] = 0;
  unaff_x21[2] = 0;
  *unaff_x21 = 0;
  if ((unaff_x25 != 0) &&
     ((float)(unaff_x19[3] + 1) <= *(float *)(unaff_x19 + 4) * (float)unaff_x25)) {
    plVar5 = *(long **)(*unaff_x19 + unaff_x26 * 8);
    goto joined_r0x00072778;
  }
  uVar4 = 1;
  if (2 < unaff_x25) {
    uVar4 = (ulong)((unaff_x25 & unaff_x25 - 1) != 0);
  }
  uVar4 = uVar4 | unaff_x25 << 1;
  uVar6 = (ulong)((float)(unaff_x19[3] + 1) / *(float *)(unaff_x19 + 4));
  if (uVar4 <= uVar6) {
    uVar4 = uVar6;
  }
  if (uVar4 - 1 == 0) {
    uVar4 = 2;
  }
  else if ((uVar4 & uVar4 - 1) != 0) {
    uVar4 = __ZNSt3__112__next_primeEm(uVar4);
  }
  uVar6 = unaff_x19[1];
  if (uVar6 < uVar4) {
code_r0x00072684:
    func_0x000280c4();
  }
  else if (uVar4 < uVar6) {
    uVar2 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
    if ((uVar6 < 3) ||
       (uVar3 = CONCAT17(POPCOUNT((char)(uVar6 >> 0x38)),
                         CONCAT16(POPCOUNT((char)(uVar6 >> 0x30)),
                                  CONCAT15(POPCOUNT((char)(uVar6 >> 0x28)),
                                           CONCAT14(POPCOUNT((char)(uVar6 >> 0x20)),
                                                    CONCAT13(POPCOUNT((char)(uVar6 >> 0x18)),
                                                             CONCAT12(POPCOUNT((char)(uVar6 >> 0x10)
                                                                              ),
                                                                      CONCAT11(POPCOUNT((char)(uVar6
                                                                                              >> 8))
                                                                               ,POPCOUNT((char)uVar6
                                                                                        )))))))),
       uVar7 = NEON_uaddlv(uVar3,1), 1 < (CONCAT62((int6)((ulong)uVar3 >> 0x10),uVar7) & 0xffffffff)
       )) {
      uVar2 = __ZNSt3__112__next_primeEm();
    }
    else if (1 < uVar2) {
      uVar2 = 1L << (-LZCOUNT(uVar2 - 1) & 0x3fU);
    }
    if (uVar4 <= uVar2) {
      uVar4 = uVar2;
    }
    if (uVar4 < uVar6) goto code_r0x00072684;
  }
  unaff_x25 = unaff_x19[1];
  if ((unaff_x25 & unaff_x25 - 1) == 0) {
    unaff_x26 = unaff_x25 - 1 & unaff_x20;
    plVar5 = *(long **)(*unaff_x19 + unaff_x26 * 8);
  }
  else if (unaff_x20 < unaff_x25) {
    plVar5 = *(long **)(*unaff_x19 + unaff_x20 * 8);
    unaff_x26 = unaff_x20;
  }
  else {
    uVar4 = 0;
    if (unaff_x25 != 0) {
      uVar4 = unaff_x20 / unaff_x25;
    }
    unaff_x26 = unaff_x20 - uVar4 * unaff_x25;
    plVar5 = *(long **)(*unaff_x19 + unaff_x26 * 8);
  }
joined_r0x00072778:
  if (plVar5 == (long *)0x0) {
    *unaff_x23 = unaff_x19[2];
    unaff_x19[2] = (long)unaff_x23;
    *(long **)(*unaff_x19 + unaff_x26 * 8) = unaff_x19 + 2;
    if (*unaff_x23 != 0) {
      uVar4 = *(ulong *)(*unaff_x23 + 8);
      if ((unaff_x25 & unaff_x25 - 1) == 0) {
        uVar4 = uVar4 & unaff_x25 - 1;
      }
      else if (unaff_x25 <= uVar4) {
        uVar6 = 0;
        if (unaff_x25 != 0) {
          uVar6 = uVar4 / unaff_x25;
        }
        uVar4 = uVar4 - uVar6 * unaff_x25;
      }
      *(long **)(*unaff_x19 + uVar4 * 8) = unaff_x23;
    }
  }
  else {
    *unaff_x23 = *plVar5;
    *plVar5 = (long)unaff_x23;
  }
  unaff_x19[3] = unaff_x19[3] + 1;
  uVar3 = 1;
  goto LAB_000727c8;
}

