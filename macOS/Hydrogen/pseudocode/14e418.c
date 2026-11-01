
ulong FUN_0014e418(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined1 *puVar1;
  uint uVar2;
  ulong uVar3;
  undefined1 *puVar4;
  undefined8 uVar5;
  byte bVar6;
  int iVar7;
  uint uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  int *piVar12;
  int *piVar13;
  undefined1 *unaff_x19;
  ulong unaff_x20;
  uint *unaff_x21;
  long unaff_x22;
  uint *unaff_x23;
  undefined8 *unaff_x24;
  undefined1 *unaff_x26;
  ulong uVar14;
  uint *unaff_x28;
  long unaff_x29;
  undefined8 unaff_d8;
  undefined8 in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined1 *in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  int *in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 *in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 *in_stack_00000080;
  undefined8 *in_stack_00000088;
  
code_r0x0014e418:
  uVar11 = func_0x00150f3c(unaff_x28,in_stack_00000028,param_3);
  uVar14 = uVar11;
  if (uVar11 < 0xffffffffffffff89) goto LAB_0014e31c;
LAB_0014e444:
LAB_0014e260:
  do {
    do {
      iVar7 = func_0x0015e310(uVar14);
      if ((iVar7 == 10 & in_stack_00000000._4_1_) != 0) {
        return 0xffffffffffffffb8;
      }
      if (0xffffffffffffff88 < uVar14) {
        return uVar14;
      }
      unaff_x19 = unaff_x19 + uVar14;
      unaff_x22 = unaff_x22 - uVar14;
      uVar14 = 5;
      if (unaff_x21[0x28] != 0) {
        uVar14 = 1;
      }
      in_stack_00000000._4_1_ = 1;
      if (unaff_x20 < uVar14) {
code_r0x0014dee8:
        uVar14 = 0xffffffffffffffb8;
        if (unaff_x20 == 0) {
          uVar14 = (long)unaff_x19 - in_stack_00000010;
        }
        return uVar14;
      }
      if (unaff_x21[0x28] == 0) {
        while ((3 < unaff_x20 && (*unaff_x23 >> 4 == 0x184d2a5))) {
          if (unaff_x20 < 8) {
            return 0xffffffffffffffb8;
          }
          if (0xfffffff7 < unaff_x23[1]) {
            return 0xfffffffffffffff2;
          }
          uVar11 = (ulong)unaff_x23[1] + 8;
          uVar3 = 0xffffffffffffffb8;
          if (uVar11 <= unaff_x20) {
            uVar3 = uVar11;
          }
          if (0xffffffffffffff88 < uVar3) {
            return uVar3;
          }
          unaff_x23 = (uint *)((long)unaff_x23 + uVar3);
          unaff_x20 = unaff_x20 - uVar3;
          if (unaff_x20 < uVar14) goto code_r0x0014dee8;
        }
      }
      if (in_stack_00000008 == 0) {
        unaff_x24[0xe9c] = uVar14;
        in_stack_00000080[1] = 0;
        *in_stack_00000080 = 0;
        in_stack_00000080[3] = 0;
        in_stack_00000080[2] = 0;
        *in_stack_00000088 = 0;
        in_stack_00000088[1] = 0;
        *(undefined4 *)(unaff_x24 + 0x507) = 0xc00000c;
        unaff_x21[0x40] = 0;
        *(undefined8 *)(unaff_x21 + 0xe) = in_stack_00000058;
        *(undefined8 *)(unaff_x21 + 0xc) = in_stack_00000050;
        unaff_x21[0x3a] = 1;
        *in_stack_00000070 = 0x400000001;
        *(undefined4 *)(in_stack_00000070 + 1) = 8;
        *unaff_x24 = *(undefined8 *)(unaff_x29 + -0x80);
        unaff_x24[1] = in_stack_00000068;
        unaff_x24[2] = in_stack_00000060;
        unaff_x24[3] = in_stack_00000078;
        if (in_stack_00000048._4_4_ != 0) {
          piVar12 = in_stack_00000038;
          piVar13 = in_stack_00000038;
          if ((7 < in_stack_00000040) && (*in_stack_00000038 == -0x13cf5bc9)) {
            unaff_x21[0x40] = in_stack_00000038[1];
            uVar14 = func_0x0014ed6c(*(undefined8 *)(unaff_x29 + -0x80),in_stack_00000038,
                                     in_stack_00000040);
            if (0xffffffffffffff88 < uVar14) {
              return 0xffffffffffffffe2;
            }
            piVar12 = (int *)((long)in_stack_00000038 + uVar14);
            unaff_x24[0xea6] = unaff_d8;
            unaff_x24[0xe9b] = unaff_x24[0xe98];
            piVar13 = (int *)((long)piVar12 + (unaff_x24[0xe99] - unaff_x24[0xe98]));
          }
          unaff_x24[0xe9a] = piVar13;
          unaff_x24[0xe99] = piVar12;
          unaff_x24[0xe98] = in_stack_00000030;
        }
      }
      else {
        lVar9 = func_0x00156654(in_stack_00000008);
        lVar10 = func_0x0015665c(in_stack_00000008);
        unaff_x21[0x41] = (uint)(unaff_x24[0xe9b] != lVar9 + lVar10);
        uVar5 = 5;
        if (unaff_x21[0x28] != 0) {
          uVar5 = 1;
        }
        unaff_x24[0xe9c] = uVar5;
        in_stack_00000080[1] = 0;
        *in_stack_00000080 = 0;
        in_stack_00000080[3] = 0;
        in_stack_00000080[2] = 0;
        *in_stack_00000088 = 0;
        in_stack_00000088[1] = 0;
        *(undefined4 *)(unaff_x24 + 0x507) = 0xc00000c;
        unaff_x21[0x40] = 0;
        *(undefined8 *)(unaff_x21 + 0xe) = in_stack_00000058;
        *(undefined8 *)(unaff_x21 + 0xc) = in_stack_00000050;
        unaff_x21[0x3a] = 1;
        *in_stack_00000070 = 0x400000001;
        *(undefined4 *)(in_stack_00000070 + 1) = 8;
        *unaff_x24 = *(undefined8 *)(unaff_x29 + -0x80);
        unaff_x24[1] = in_stack_00000068;
        unaff_x24[2] = in_stack_00000060;
        unaff_x24[3] = in_stack_00000078;
        func_0x00156664();
      }
      func_0x00155b60();
      uVar14 = 9;
      if (unaff_x21[0x28] != 0) {
        uVar14 = 5;
      }
      if (unaff_x20 < uVar14) {
code_r0x0014e25c:
        uVar14 = 0xffffffffffffffb8;
        goto LAB_0014e260;
      }
      lVar9 = 5;
      if (unaff_x21[0x28] != 0) {
        lVar9 = 1;
      }
      bVar6 = *(byte *)((long)unaff_x23 + lVar9 + -1);
      lVar9 = *(long *)(&UNK_00813b00 + ((ulong)bVar6 & 3) * 8) + lVar9 +
              *(long *)(&UNK_00813b20 + ((ulong)(bVar6 >> 3) & 0x18));
      if ((bVar6 & 0x20) == 0) {
        lVar9 = lVar9 + 1;
      }
      in_stack_00000028 = lVar9 + (ulong)((uint)(bVar6 < 0x40) & (bVar6 & 0x20) >> 5);
      uVar14 = in_stack_00000028;
    } while (0xffffffffffffff88 < in_stack_00000028);
    if (unaff_x20 < in_stack_00000028 + 3) goto code_r0x0014e25c;
    uVar14 = func_0x0014ec10();
  } while (0xffffffffffffff88 < uVar14);
  in_stack_00000000._4_1_ = 1;
  uVar8 = unaff_x21[0x48];
  if (uVar8 != 0) {
    uVar2 = *unaff_x21;
    if (uVar8 <= *unaff_x21) {
      uVar2 = uVar8;
    }
    *unaff_x21 = uVar2;
  }
  unaff_x28 = (uint *)((long)unaff_x23 + in_stack_00000028);
  in_stack_00000028 = unaff_x20 - in_stack_00000028;
  uVar11 = func_0x00150f3c(unaff_x28,in_stack_00000028,unaff_x29 + -0x74);
  if (0xffffffffffffff88 < uVar11) {
    uVar14 = uVar11;
    goto LAB_0014e444;
  }
  in_stack_00000018 = unaff_x19 + unaff_x22;
  unaff_x26 = unaff_x19;
LAB_0014e31c:
  uVar14 = in_stack_00000028 - 3;
  in_stack_00000028 = uVar14 - uVar11;
  if (uVar14 < uVar11) {
    uVar14 = 0xffffffffffffffb8;
    goto LAB_0014e444;
  }
  puVar1 = (undefined1 *)((long)unaff_x28 + 3);
  puVar4 = puVar1;
  if (in_stack_00000018 <= puVar1 || puVar1 < unaff_x26) {
    puVar4 = in_stack_00000018;
  }
  iVar7 = *(int *)(unaff_x29 + -0x74);
  if (iVar7 == 2) {
    uVar14 = func_0x00151c98();
    if (0xffffffffffffff88 < uVar14) goto LAB_0014e444;
  }
  else {
    if (iVar7 != 1) {
      if (iVar7 == 0) {
        if ((ulong)((long)in_stack_00000018 - (long)unaff_x26) < uVar11) goto code_r0x0014e478;
        if (unaff_x26 == (undefined1 *)0x0) {
          if (uVar11 != 0) goto code_r0x0014e49c;
          goto code_r0x0014e3e8;
        }
        _memmove(unaff_x26,puVar1,uVar11);
        uVar14 = uVar11;
        goto code_r0x0014e3ec;
      }
      goto code_r0x0014e470;
    }
    uVar14 = (ulong)*(uint *)(unaff_x29 + -0x6c);
    if ((ulong)((long)puVar4 - (long)unaff_x26) < uVar14) {
code_r0x0014e478:
      uVar14 = 0xffffffffffffffba;
      goto LAB_0014e444;
    }
    if (unaff_x26 != (undefined1 *)0x0) {
      _memset(unaff_x26,*puVar1,uVar14);
      goto code_r0x0014e3ec;
    }
    if (*(uint *)(unaff_x29 + -0x6c) != 0) {
code_r0x0014e49c:
      uVar14 = 0xffffffffffffffb6;
      goto LAB_0014e444;
    }
code_r0x0014e3e8:
    uVar14 = 0;
  }
code_r0x0014e3ec:
  if (unaff_x21[0x2a] != 0) {
    func_0x0015f240(in_stack_00000020,unaff_x26,uVar14);
  }
  unaff_x26 = unaff_x26 + uVar14;
  unaff_x28 = (uint *)(puVar1 + uVar11);
  if (*(int *)(unaff_x29 + -0x70) == 0) goto code_r0x0014e414;
  uVar14 = (long)unaff_x26 - (long)unaff_x19;
  if ((unaff_x24[0xe9d] == 0xffffffffffffffff) || (uVar14 == unaff_x24[0xe9d])) {
    if (unaff_x21[4] == 0) {
      unaff_x20 = in_stack_00000028;
      unaff_x23 = unaff_x28;
    }
    else if ((in_stack_00000028 < 4) ||
            ((unaff_x21[0x29] == 0 &&
             (uVar8 = func_0x0015f3e8(in_stack_00000020), *unaff_x28 != uVar8)))) {
      uVar14 = 0xffffffffffffffea;
    }
    else {
      unaff_x20 = in_stack_00000028 - 4;
      unaff_x23 = unaff_x28 + 1;
    }
    goto LAB_0014e444;
  }
code_r0x0014e470:
  uVar14 = 0xffffffffffffffec;
  goto LAB_0014e444;
code_r0x0014e414:
  param_3 = unaff_x29 + -0x74;
  goto code_r0x0014e418;
}

