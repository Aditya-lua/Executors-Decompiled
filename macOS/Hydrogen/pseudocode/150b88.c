
ulong FUN_00150b88(ulong param_1)

{
  undefined8 uVar1;
  undefined1 in_ZR;
  undefined1 in_CY;
  bool bVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *unaff_x19;
  long unaff_x20;
  long lVar10;
  ulong uVar11;
  long *plVar12;
  ulong uVar13;
  long unaff_x22;
  uint *unaff_x23;
  ulong uVar14;
  long unaff_x25;
  long *unaff_x26;
  ulong unaff_x28;
  long unaff_x29;
  ulong in_stack_00000000;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 *in_stack_00000048;
  undefined8 *in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long *in_stack_00000078;
  long in_stack_00000080;
  long *in_stack_00000090;
  long *in_stack_00000098;
  
code_r0x00150b88:
  if ((bool)in_CY && !(bool)in_ZR) {
    return param_1;
  }
  unaff_x25 = unaff_x25 + param_1;
LAB_00150c50:
  uVar6 = 2;
  do {
    lVar8 = *(long *)(unaff_x29 + -0x78);
    unaff_x23[0x49] = uVar6;
    *(ulong *)(unaff_x29 + -0x78) = lVar8 + unaff_x28;
LAB_001504e4:
    while( true ) {
      while (unaff_x23[0x49] == 4) {
        lVar8 = unaff_x19[0xeca];
        uVar11 = unaff_x19[0xecb] - lVar8;
        uVar14 = unaff_x22 - unaff_x25;
        uVar13 = uVar14;
        if (uVar11 <= uVar14) {
          uVar13 = uVar11;
        }
        if (uVar13 != 0) {
          _memcpy(unaff_x25,unaff_x19[0xec8] + lVar8,uVar13);
          lVar8 = unaff_x19[0xeca];
        }
        lVar4 = unaff_x25 + uVar13;
        bVar2 = unaff_x25 != 0;
        unaff_x25 = 0;
        if (bVar2) {
          unaff_x25 = lVar4;
        }
        *unaff_x26 = lVar8 + uVar13;
        if (uVar14 < uVar11) goto code_r0x00150cf8;
        unaff_x23[0x49] = 2;
        if (((ulong)unaff_x19[0xec9] < (ulong)unaff_x19[0xe9d]) &&
           ((ulong)unaff_x19[0xec9] < lVar8 + uVar13 + (ulong)*unaff_x23)) {
          *unaff_x26 = 0;
          unaff_x26[1] = 0;
        }
      }
      switch(unaff_x23[0x49]) {
      case 0:
        unaff_x23[0x49] = 1;
        unaff_x19[0xec6] = 0;
        unaff_x26[1] = 0;
        unaff_x26[2] = 0;
        *unaff_x26 = 0;
        *(undefined4 *)(unaff_x26 + 3) = 0;
        lVar4 = in_stack_00000098[1];
        lVar8 = *in_stack_00000098;
        in_stack_00000090[2] = in_stack_00000098[2];
        in_stack_00000090[1] = lVar4;
        *in_stack_00000090 = lVar8;
        uVar13 = func_0x0014d50c(*(undefined8 *)(unaff_x29 + -0x90),
                                 *(undefined8 *)(unaff_x29 + -0x88),0,unaff_x23[0x28]);
        uVar6 = unaff_x23[0x46];
        break;
      case 1:
        uVar13 = func_0x0014d50c(*(undefined8 *)(unaff_x29 + -0x90),
                                 *(undefined8 *)(unaff_x29 + -0x88),unaff_x19[0xecc],unaff_x23[0x28]
                                );
        uVar6 = unaff_x23[0x46];
        break;
      case 2:
        goto code_r0x00150a50;
      case 3:
        uVar6 = unaff_x23[0xd];
        lVar8 = *(long *)(unaff_x29 + -0x78);
        lVar4 = unaff_x19[0xec6];
        uVar13 = unaff_x19[0xe9c] - lVar4;
        goto joined_r0x001506ec;
      default:
        return 0xffffffffffffffff;
      }
      if (((uVar6 != 0) && (plVar12 = (long *)unaff_x19[0xec1], plVar12 != (long *)0x0)) &&
         (unaff_x19[0xebe] != 0)) {
        uVar6 = unaff_x23[3];
        lVar8 = plVar12[1];
        *(uint *)(unaff_x29 + -0x70) = uVar6;
        uVar11 = func_0x0015efe4(unaff_x29 + -0x70,4,0);
        uVar11 = uVar11 & lVar8 - 1U;
        do {
          uVar14 = uVar11;
          uVar3 = func_0x00156b00(*(undefined8 *)(*plVar12 + uVar14 * 8));
          uVar11 = (uVar14 & lVar8 - 1U) + 1;
        } while (uVar3 != uVar6 && uVar3 != 0);
        lVar8 = *(long *)(*plVar12 + uVar14 * 8);
        if (lVar8 != 0) {
          func_0x001568cc(unaff_x19[0xebd]);
          unaff_x19[0xebd] = 0;
          unaff_x23[0x40] = unaff_x23[3];
          unaff_x19[0xebe] = lVar8;
          unaff_x23[0x42] = 0xffffffff;
        }
      }
      lVar8 = *(long *)(unaff_x29 + -0x78);
      if (0xffffffffffffff88 < uVar13) {
        return uVar13;
      }
      if (uVar13 == 0) break;
      lVar4 = unaff_x19[0xecc];
      uVar11 = uVar13 - lVar4;
      uVar14 = *(long *)(unaff_x29 + -0x80) - lVar8;
      if (uVar14 < uVar11) {
        if (*(long *)(unaff_x29 + -0x80) == lVar8) {
          lVar10 = *(long *)(unaff_x29 + -0x88);
        }
        else {
          lVar10 = *(long *)(unaff_x29 + -0x88);
          _memcpy(lVar10 + lVar4,lVar8,uVar14);
          lVar4 = unaff_x19[0xecc] + uVar14;
          unaff_x19[0xecc] = lVar4;
        }
        in_stack_00000078[2] = in_stack_00000078[1];
        uVar11 = func_0x0014d50c(*(undefined8 *)(unaff_x29 + -0x90),lVar10,lVar4,unaff_x23[0x28]);
        if (0xffffffffffffff88 < uVar11) {
          return uVar11;
        }
        uVar11 = 6;
        if (unaff_x23[0x28] != 0) {
          uVar11 = 2;
        }
        if (uVar11 <= uVar13) {
          uVar11 = uVar13;
        }
        return (uVar11 - unaff_x19[0xecc]) + 3;
      }
      _memcpy(*(long *)(unaff_x29 + -0x88) + lVar4,lVar8,uVar11);
      unaff_x19[0xecc] = uVar13;
      *(ulong *)(unaff_x29 + -0x78) = lVar8 + uVar11;
    }
    if (((**(ulong **)(unaff_x29 + -0x90) != 0xffffffffffffffff) && (unaff_x23[1] != 1)) &&
       (**(ulong **)(unaff_x29 + -0x90) <= (ulong)(unaff_x22 - unaff_x25))) {
      func_0x0014db84(unaff_x29 + -0x70,in_stack_00000080,in_stack_00000000,unaff_x23[0x28]);
      uVar13 = *(ulong *)(unaff_x29 + -0x68);
      if (in_stack_00000000 < uVar13) goto code_r0x00150758;
      func_0x0014e59c();
      uVar11 = func_0x0014de64();
      if (0xffffffffffffff88 < uVar11) {
        return uVar11;
      }
      *(ulong *)(unaff_x29 + -0x78) = in_stack_00000080 + uVar13;
      lVar8 = unaff_x25 + uVar11;
      bVar2 = unaff_x25 != 0;
      unaff_x25 = 0;
      if (bVar2) {
        unaff_x25 = lVar8;
      }
      unaff_x19[0xe9c] = 0;
code_r0x00150ca0:
      unaff_x23[0x49] = 0;
      goto code_r0x00150cf8;
    }
code_r0x00150758:
    if (((unaff_x23[0x5e] == 1) && (unaff_x23[1] != 1)) &&
       ((**(ulong **)(unaff_x29 + -0x90) != 0xffffffffffffffff &&
        ((ulong)(unaff_x22 - unaff_x25) < **(ulong **)(unaff_x29 + -0x90))))) {
      return 0xffffffffffffffba;
    }
    if (unaff_x23[0x42] == 0xffffffff) {
code_r0x001507a4:
      lVar8 = unaff_x19[0xebe];
      if (lVar8 == 0) {
        bVar2 = true;
      }
      else {
        lVar4 = func_0x00156654(lVar8);
        lVar8 = func_0x0015665c(lVar8);
        bVar2 = false;
        unaff_x23[0x41] = (uint)(unaff_x19[0xe9b] != lVar4 + lVar8);
      }
    }
    else {
      if (unaff_x23[0x42] == 1) {
        unaff_x23[0x42] = 0;
        goto code_r0x001507a4;
      }
      func_0x001568cc(*in_stack_00000008);
      unaff_x23[0x42] = 0;
      bVar2 = true;
      *in_stack_00000008 = 0;
      in_stack_00000008[1] = 0;
    }
    uVar6 = unaff_x23[0x28];
    uVar1 = 5;
    if (uVar6 != 0) {
      uVar1 = 1;
    }
    unaff_x19[0xe9c] = uVar1;
    in_stack_00000048[1] = 0;
    *in_stack_00000048 = 0;
    in_stack_00000048[3] = 0;
    in_stack_00000048[2] = 0;
    *in_stack_00000050 = 0;
    in_stack_00000050[1] = 0;
    *(undefined4 *)(unaff_x19 + 0x507) = 0xc00000c;
    unaff_x23[0x40] = 0;
    *(undefined8 *)(unaff_x23 + 0xe) = in_stack_00000018;
    *(undefined8 *)(unaff_x23 + 0xc) = in_stack_00000010;
    unaff_x23[0x3a] = 1;
    *in_stack_00000030 = 0x400000001;
    *(undefined4 *)(in_stack_00000030 + 1) = 8;
    *unaff_x19 = in_stack_00000040;
    unaff_x19[1] = in_stack_00000028;
    unaff_x19[2] = in_stack_00000020;
    unaff_x19[3] = in_stack_00000038;
    if (!bVar2) {
      func_0x00156664();
      uVar6 = unaff_x23[0x28];
    }
    if ((uVar6 == 0) && (**(uint **)(unaff_x29 + -0x88) >> 4 == 0x184d2a5)) {
      uVar13 = (ulong)*(uint *)(*(long *)(unaff_x29 + -0x88) + 4);
      uVar6 = 7;
    }
    else {
      uVar13 = func_0x0014ec10();
      if (0xffffffffffffff88 < uVar13) {
        return uVar13;
      }
      uVar6 = 2;
      uVar13 = 3;
    }
    unaff_x19[0xe9c] = uVar13;
    unaff_x23[0xd] = uVar6;
    uVar13 = unaff_x19[0xe9e];
    if (uVar13 < 0x401) {
      uVar13 = 0x400;
    }
    unaff_x19[0xe9e] = uVar13;
    if ((ulong)unaff_x19[0xec7] < uVar13) {
      return 0xfffffffffffffff0;
    }
    uVar3 = unaff_x23[0x48];
    uVar6 = *unaff_x23;
    if (uVar3 != 0) {
      if (uVar3 <= uVar6) {
        uVar6 = uVar3;
      }
      *unaff_x23 = uVar6;
    }
    uVar3 = uVar6;
    if (uVar6 < 5) {
      uVar3 = 4;
    }
    uVar11 = (ulong)uVar3;
    if (unaff_x23[0x5e] == 0) {
      uVar14 = uVar13;
      if (uVar6 <= uVar13) {
        uVar14 = (ulong)uVar6;
      }
      if (0x1ffff < uVar14) {
        uVar14 = 0x20000;
      }
      uVar13 = uVar13 + uVar14 * 2 + 0x40;
      if (**(ulong **)(unaff_x29 + -0x90) <= uVar13) {
        uVar13 = **(ulong **)(unaff_x29 + -0x90);
      }
    }
    else {
      uVar13 = 0;
    }
    uVar7 = unaff_x19[0xec5];
    uVar5 = unaff_x19[0xec9];
    uVar14 = uVar13 + uVar11;
    if (uVar5 + uVar7 < uVar14 * 3) {
      uVar9 = 0;
      *(undefined8 *)(*(long *)(unaff_x29 + -0x88) + 0x14) = 0;
      if (uVar11 <= uVar7) goto code_r0x001509b0;
code_r0x001509c0:
      if (unaff_x19[0xebb] == 0) {
        if (unaff_x19[0xec4] != 0) {
          if ((code *)unaff_x19[0xeb7] == (code *)0x0) {
            _free(unaff_x19[0xec4]);
          }
          else {
            (*(code *)unaff_x19[0xeb7])(unaff_x19[0xeb8]);
          }
        }
        unaff_x19[0xec5] = 0;
        unaff_x19[0xec9] = 0;
        if ((code *)unaff_x19[0xeb6] == (code *)0x0) {
          lVar8 = _malloc(uVar14);
        }
        else {
          lVar8 = (*(code *)unaff_x19[0xeb6])(unaff_x19[0xeb8],uVar14);
        }
        unaff_x19[0xec4] = lVar8;
        if (lVar8 == 0) {
          return 0xffffffffffffffc0;
        }
      }
      else {
        if (unaff_x19[0xebb] - 0x176e0 < uVar14) {
          return 0xffffffffffffffc0;
        }
        lVar8 = unaff_x19[0xec4];
      }
      unaff_x19[0xec5] = uVar11;
      unaff_x19[0xec8] = lVar8 + uVar11;
      unaff_x19[0xec9] = uVar13;
    }
    else {
      uVar9 = *(long *)(*(long *)(unaff_x29 + -0x88) + 0x14) + 1;
      *(ulong *)(*(long *)(unaff_x29 + -0x88) + 0x14) = uVar9;
      if (uVar7 < uVar11) goto code_r0x001509c0;
code_r0x001509b0:
      if ((uVar5 < uVar13) || (0x7f < uVar9)) goto code_r0x001509c0;
    }
    unaff_x23[0x49] = 2;
code_r0x00150a50:
    lVar8 = *(long *)(unaff_x29 + -0x78);
    uVar11 = *(long *)(unaff_x29 + -0x80) - lVar8;
    uVar6 = unaff_x23[0xd];
    if (uVar6 - 3 < 2) {
      uVar13 = unaff_x19[0xe9c];
      if (unaff_x23[0xc] != 0) goto code_r0x00150a8c;
      unaff_x28 = uVar13;
      if (uVar11 <= uVar13) {
        unaff_x28 = uVar11;
      }
      if (unaff_x28 < 2) {
        unaff_x28 = 1;
      }
    }
    else {
      uVar13 = unaff_x19[0xe9c];
code_r0x00150a8c:
      unaff_x28 = uVar13;
      if (uVar13 == 0) goto code_r0x00150ca0;
    }
    if (uVar11 < unaff_x28) {
      if (lVar8 == *(long *)(unaff_x29 + -0x80)) {
        *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x80);
        goto code_r0x00150cf8;
      }
      unaff_x23[0x49] = 3;
      lVar4 = unaff_x19[0xec6];
      uVar13 = uVar13 - lVar4;
joined_r0x001506ec:
      uVar11 = uVar13;
      if (uVar6 == 7) {
        uVar14 = *(long *)(unaff_x29 + -0x80) - lVar8;
        if (uVar14 <= uVar13) {
          uVar11 = uVar14;
        }
        if (uVar11 != 0) goto code_r0x00150b00;
      }
      else {
        if ((ulong)(unaff_x19[0xec5] - lVar4) < uVar13) {
          return 0xffffffffffffffec;
        }
        uVar14 = *(long *)(unaff_x29 + -0x80) - lVar8;
        if (uVar14 <= uVar13) {
          uVar11 = uVar14;
        }
        if (uVar11 != 0) {
          _memcpy(unaff_x19[0xec4] + lVar4,lVar8,uVar11);
          lVar8 = *(long *)(unaff_x29 + -0x78);
          lVar4 = unaff_x19[0xec6];
code_r0x00150b00:
          lVar8 = lVar8 + uVar11;
          unaff_x19[0xec6] = lVar4 + uVar11;
        }
      }
      *(long *)(unaff_x29 + -0x78) = lVar8;
      if (uVar11 < uVar13) {
code_r0x00150cf8:
        lVar8 = *(long *)(unaff_x29 + -0x78);
        in_stack_00000078[2] = lVar8 - *in_stack_00000078;
        in_stack_00000098[2] = unaff_x25 - *in_stack_00000098;
        lVar10 = in_stack_00000098[1];
        lVar4 = *in_stack_00000098;
        in_stack_00000090[2] = unaff_x25 - *in_stack_00000098;
        in_stack_00000090[1] = lVar10;
        *in_stack_00000090 = lVar4;
        if ((lVar8 == in_stack_00000080) && (unaff_x25 == in_stack_00000058)) {
          uVar6 = unaff_x23[0x5d];
          unaff_x23[0x5d] = uVar6 + 1;
          if (0xe < (int)uVar6) {
            if (in_stack_00000068 == in_stack_00000060) {
              return 0xffffffffffffffb0;
            }
            if (in_stack_00000070 == unaff_x20) {
              return 0xffffffffffffffae;
            }
          }
        }
        else {
          unaff_x23[0x5d] = 0;
        }
        if (unaff_x19[0xe9c] != 0) {
          lVar8 = 3;
          if (unaff_x23[0xd] != 3) {
            lVar8 = 0;
          }
          return (unaff_x19[0xe9c] - unaff_x19[0xec6]) + lVar8;
        }
        if (unaff_x19[0xecb] != unaff_x19[0xeca]) {
          if (unaff_x23[0x5c] == 0) {
            in_stack_00000078[2] = in_stack_00000078[2] + -1;
            unaff_x23[0x5c] = 1;
            return 1;
          }
          return 1;
        }
        if (unaff_x23[0x5c] == 0) {
          return 0;
        }
        if ((ulong)in_stack_00000078[2] < (ulong)in_stack_00000078[1]) {
          in_stack_00000078[2] = in_stack_00000078[2] + 1;
          return 0;
        }
        unaff_x23[0x49] = 2;
        return 1;
      }
      unaff_x19[0xec6] = 0;
      uVar6 = unaff_x23[0xd];
      if (unaff_x23[0x5e] == 0) {
        uVar13 = func_0x0014e758();
        if (0xffffffffffffff88 < uVar13) {
          return uVar13;
        }
        if ((uVar6 == 7) || (uVar13 != 0)) {
          unaff_x19[0xecb] = unaff_x19[0xeca] + uVar13;
          unaff_x23[0x49] = 4;
          goto LAB_001504e4;
        }
      }
      else {
        uVar13 = func_0x0014e758();
        if (0xffffffffffffff88 < uVar13) {
          return uVar13;
        }
        unaff_x25 = unaff_x25 + uVar13;
      }
      unaff_x23[0x49] = 2;
      goto LAB_001504e4;
    }
    if (unaff_x23[0x5e] != 0) {
      param_1 = func_0x0014e758();
      in_CY = 0xffffffffffffff87 < param_1;
      in_ZR = param_1 == 0xffffffffffffff88;
      goto code_r0x00150b88;
    }
    uVar13 = func_0x0014e758();
    if (0xffffffffffffff88 < uVar13) {
      return uVar13;
    }
    if ((uVar6 != 7) && (uVar13 == 0)) goto LAB_00150c50;
    unaff_x19[0xecb] = unaff_x19[0xeca] + uVar13;
    uVar6 = 4;
  } while( true );
}

