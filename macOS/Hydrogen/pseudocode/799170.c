
void FUN_00799170(long *param_1,long param_2)

{
  ulong uVar1;
  long *plVar2;
  code *pcVar3;
  undefined1 in_ZR;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long *in_x9;
  long *plVar7;
  ulong uVar8;
  long *unaff_x19;
  long *unaff_x20;
  long *plVar9;
  ulong unaff_x21;
  long unaff_x22;
  long *plVar10;
  ulong unaff_x26;
  long *unaff_x27;
  ulong unaff_x28;
  
code_r0x00799170:
  if ((bool)in_ZR) goto LAB_007991ac;
LAB_00799174:
  do {
    plVar9 = unaff_x20 + -1;
    lVar4 = unaff_x20[-2];
    unaff_x20 = unaff_x20 + -2;
    in_x9[-1] = *plVar9;
    in_x9[-2] = lVar4;
    in_x9 = in_x9 + -2;
  } while (unaff_x20 != unaff_x27);
  plVar9 = (long *)*unaff_x19;
  *unaff_x19 = (long)in_x9;
  unaff_x19[1] = (long)(param_1 + 2);
  unaff_x19[2] = param_2 + unaff_x28 * 0x10;
  unaff_x20 = param_1 + 2;
joined_r0x007991a4:
  if (plVar9 != (long *)0x0) {
    __ZdlPv(plVar9);
  }
  do {
    unaff_x19[1] = (long)unaff_x20;
    unaff_x22 = unaff_x22 + unaff_x26 + 1;
    unaff_x21 = unaff_x21 - (unaff_x26 + 1);
    if (unaff_x21 == 0) {
      return;
    }
    lVar4 = _memchr(unaff_x22);
    if ((lVar4 == 0) || (unaff_x26 = lVar4 - unaff_x22, unaff_x26 == 0xffffffffffffffff)) {
      if (unaff_x20 < (long *)unaff_x19[2]) {
        *unaff_x20 = unaff_x22;
        unaff_x20[1] = unaff_x21;
        plVar9 = unaff_x20 + 2;
        goto code_r0x007992ac;
      }
      plVar10 = (long *)*unaff_x19;
      lVar4 = (long)unaff_x20 - (long)plVar10 >> 4;
      uVar1 = lVar4 + 1;
      if (uVar1 >> 0x3c != 0) {
        func_0x00017f90();
        goto code_r0x007992f0;
      }
      uVar6 = unaff_x19[2] - (long)plVar10;
      uVar8 = (long)uVar6 >> 3;
      if (uVar8 <= uVar1) {
        uVar8 = uVar1;
      }
      if (0x7fffffffffffffef < uVar6) {
        uVar8 = 0xfffffffffffffff;
      }
      if (uVar8 == 0) {
        plVar7 = (long *)(lVar4 * 0x10);
        lVar5 = 0;
        *plVar7 = unaff_x22;
        plVar7[1] = unaff_x21;
      }
      else {
        if (uVar8 >> 0x3c != 0) {
          func_0x00017514();
          goto code_r0x007992f0;
        }
        lVar5 = __Znwm(uVar8 << 4);
        plVar7 = (long *)(lVar5 + lVar4 * 0x10);
        lVar5 = lVar5 + uVar8 * 0x10;
        *plVar7 = unaff_x22;
        plVar7[1] = unaff_x21;
      }
      plVar9 = plVar7 + 2;
      if (unaff_x20 == plVar10) {
        *unaff_x19 = (long)plVar7;
        unaff_x19[1] = (long)plVar9;
        unaff_x19[2] = lVar5;
      }
      else {
        do {
          plVar2 = unaff_x20 + -1;
          lVar4 = unaff_x20[-2];
          unaff_x20 = unaff_x20 + -2;
          plVar7[-1] = *plVar2;
          plVar7[-2] = lVar4;
          plVar7 = plVar7 + -2;
        } while (unaff_x20 != plVar10);
        unaff_x20 = (long *)*unaff_x19;
        *unaff_x19 = (long)plVar7;
        unaff_x19[1] = (long)plVar9;
        unaff_x19[2] = lVar5;
      }
      if (unaff_x20 != (long *)0x0) {
        __ZdlPv(unaff_x20);
      }
code_r0x007992ac:
      unaff_x19[1] = (long)plVar9;
      return;
    }
    uVar1 = unaff_x21;
    if (unaff_x26 <= unaff_x21) {
      uVar1 = unaff_x26;
    }
    if ((long *)unaff_x19[2] <= unaff_x20) break;
    *unaff_x20 = unaff_x22;
    unaff_x20[1] = uVar1;
    unaff_x20 = unaff_x20 + 2;
  } while( true );
  unaff_x27 = (long *)*unaff_x19;
  lVar4 = (long)unaff_x20 - (long)unaff_x27 >> 4;
  uVar8 = lVar4 + 1;
  if (uVar8 >> 0x3c == 0) {
    uVar6 = unaff_x19[2] - (long)unaff_x27;
    unaff_x28 = (long)uVar6 >> 3;
    if (unaff_x28 <= uVar8) {
      unaff_x28 = uVar8;
    }
    if (0x7fffffffffffffef < uVar6) {
      unaff_x28 = 0xfffffffffffffff;
    }
    if (unaff_x28 == 0) {
      param_2 = 0;
      param_1 = (long *)(lVar4 * 0x10);
      *param_1 = unaff_x22;
      param_1[1] = uVar1;
      in_ZR = unaff_x20 == unaff_x27;
      in_x9 = param_1;
      goto code_r0x00799170;
    }
    if (unaff_x28 >> 0x3c == 0) {
      param_2 = __Znwm(unaff_x28 << 4);
      param_1 = (long *)(param_2 + lVar4 * 0x10);
      *param_1 = unaff_x22;
      param_1[1] = uVar1;
      in_x9 = param_1;
      if (unaff_x20 != unaff_x27) goto LAB_00799174;
LAB_007991ac:
      *unaff_x19 = (long)in_x9;
      unaff_x19[1] = (long)(param_1 + 2);
      unaff_x19[2] = param_2 + unaff_x28 * 0x10;
      plVar9 = unaff_x20;
      unaff_x20 = param_1 + 2;
      goto joined_r0x007991a4;
    }
    func_0x00017514();
  }
  else {
    func_0x00017f90();
  }
code_r0x007992f0:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x7992f4);
  (*pcVar3)();
}

