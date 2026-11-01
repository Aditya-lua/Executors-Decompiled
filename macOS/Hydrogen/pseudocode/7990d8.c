
void FUN_007990d8(long param_1)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long *plVar9;
  long lVar10;
  ulong uVar11;
  long *plVar12;
  
  do {
    uVar11 = param_1 - unaff_x22;
    if (uVar11 == 0xffffffffffffffff) break;
    uVar8 = unaff_x21;
    if (uVar11 <= unaff_x21) {
      uVar8 = uVar11;
    }
    if (unaff_x20 < (long *)unaff_x19[2]) {
      *unaff_x20 = unaff_x22;
      unaff_x20[1] = uVar8;
      unaff_x20 = unaff_x20 + 2;
    }
    else {
      plVar12 = (long *)*unaff_x19;
      lVar10 = (long)unaff_x20 - (long)plVar12 >> 4;
      uVar5 = lVar10 + 1;
      if (uVar5 >> 0x3c != 0) {
        func_0x00017f90();
        goto code_r0x007992f0;
      }
      uVar4 = unaff_x19[2] - (long)plVar12;
      uVar7 = (long)uVar4 >> 3;
      if (uVar7 <= uVar5) {
        uVar7 = uVar5;
      }
      if (0x7fffffffffffffef < uVar4) {
        uVar7 = 0xfffffffffffffff;
      }
      if (uVar7 == 0) {
        lVar3 = 0;
        plVar9 = (long *)(lVar10 * 0x10);
        *plVar9 = unaff_x22;
        plVar9[1] = uVar8;
        plVar6 = plVar9;
        if (unaff_x20 == plVar12) goto LAB_007991ac;
LAB_00799174:
        do {
          plVar1 = unaff_x20 + -1;
          lVar10 = unaff_x20[-2];
          unaff_x20 = unaff_x20 + -2;
          plVar6[-1] = *plVar1;
          plVar6[-2] = lVar10;
          plVar6 = plVar6 + -2;
        } while (unaff_x20 != plVar12);
        plVar12 = (long *)*unaff_x19;
        *unaff_x19 = (long)plVar6;
        unaff_x19[1] = (long)(plVar9 + 2);
        unaff_x19[2] = lVar3 + uVar7 * 0x10;
        unaff_x20 = plVar9 + 2;
      }
      else {
        if (uVar7 >> 0x3c != 0) {
          func_0x00017514();
          goto code_r0x007992f0;
        }
        lVar3 = __Znwm(uVar7 << 4);
        plVar9 = (long *)(lVar3 + lVar10 * 0x10);
        *plVar9 = unaff_x22;
        plVar9[1] = uVar8;
        plVar6 = plVar9;
        if (unaff_x20 != plVar12) goto LAB_00799174;
LAB_007991ac:
        *unaff_x19 = (long)plVar9;
        unaff_x19[1] = (long)(plVar9 + 2);
        unaff_x19[2] = lVar3 + uVar7 * 0x10;
        plVar12 = unaff_x20;
        unaff_x20 = plVar9 + 2;
      }
      if (plVar12 != (long *)0x0) {
        __ZdlPv(plVar12);
      }
    }
    unaff_x19[1] = (long)unaff_x20;
    unaff_x22 = unaff_x22 + uVar11 + 1;
    unaff_x21 = unaff_x21 - (uVar11 + 1);
    if (unaff_x21 == 0) {
      return;
    }
    param_1 = _memchr(unaff_x22);
  } while (param_1 != 0);
  if (unaff_x20 < (long *)unaff_x19[2]) {
    *unaff_x20 = unaff_x22;
    unaff_x20[1] = unaff_x21;
    plVar12 = unaff_x20 + 2;
    goto code_r0x007992ac;
  }
  plVar9 = (long *)*unaff_x19;
  lVar10 = (long)unaff_x20 - (long)plVar9 >> 4;
  uVar11 = lVar10 + 1;
  if (uVar11 >> 0x3c != 0) {
    func_0x00017f90();
code_r0x007992f0:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x7992f4);
    (*pcVar2)();
  }
  uVar5 = unaff_x19[2] - (long)plVar9;
  uVar8 = (long)uVar5 >> 3;
  if (uVar8 <= uVar11) {
    uVar8 = uVar11;
  }
  if (0x7fffffffffffffef < uVar5) {
    uVar8 = 0xfffffffffffffff;
  }
  if (uVar8 == 0) {
    plVar6 = (long *)(lVar10 * 0x10);
    lVar3 = 0;
    *plVar6 = unaff_x22;
    plVar6[1] = unaff_x21;
    plVar12 = plVar6 + 2;
    if (unaff_x20 == plVar9) goto code_r0x00799298;
code_r0x00799268:
    do {
      plVar1 = unaff_x20 + -1;
      lVar10 = unaff_x20[-2];
      unaff_x20 = unaff_x20 + -2;
      plVar6[-1] = *plVar1;
      plVar6[-2] = lVar10;
      plVar6 = plVar6 + -2;
    } while (unaff_x20 != plVar9);
    unaff_x20 = (long *)*unaff_x19;
    *unaff_x19 = (long)plVar6;
    unaff_x19[1] = (long)plVar12;
    unaff_x19[2] = lVar3;
  }
  else {
    if (uVar8 >> 0x3c != 0) {
      func_0x00017514();
      goto code_r0x007992f0;
    }
    lVar3 = __Znwm(uVar8 << 4);
    plVar6 = (long *)(lVar3 + lVar10 * 0x10);
    lVar3 = lVar3 + uVar8 * 0x10;
    *plVar6 = unaff_x22;
    plVar6[1] = unaff_x21;
    plVar12 = plVar6 + 2;
    if (unaff_x20 != plVar9) goto code_r0x00799268;
code_r0x00799298:
    *unaff_x19 = (long)plVar6;
    unaff_x19[1] = (long)plVar12;
    unaff_x19[2] = lVar3;
  }
  if (unaff_x20 != (long *)0x0) {
    __ZdlPv(unaff_x20);
  }
code_r0x007992ac:
  unaff_x19[1] = (long)plVar12;
  return;
}

