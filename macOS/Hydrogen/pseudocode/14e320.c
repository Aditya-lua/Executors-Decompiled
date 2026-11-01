
ulong FUN_0014e320(ulong param_1)

{
  ulong uVar1;
  undefined1 *puVar2;
  uint uVar3;
  ulong uVar4;
  undefined1 *puVar5;
  undefined8 uVar6;
  byte bVar7;
  int iVar8;
  uint uVar9;
  long lVar10;
  long lVar11;
  int *piVar12;
  ulong uVar13;
  int *piVar14;
  undefined1 *unaff_x19;
  ulong unaff_x20;
  uint *unaff_x21;
  long unaff_x22;
  uint *unaff_x23;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined1 *unaff_x26;
  uint *unaff_x28;
  long unaff_x29;
  undefined8 unaff_d8;
  undefined8 in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined1 *in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong uStack0000000000000028;
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
  
  uStack0000000000000028 = param_1;
code_r0x0014e320:
  do {
    uVar13 = uStack0000000000000028 - 3;
    uStack0000000000000028 = uVar13 - unaff_x25;
    if (uVar13 < unaff_x25) {
      uVar13 = 0xffffffffffffffb8;
      break;
    }
    puVar2 = (undefined1 *)((long)unaff_x28 + 3);
    puVar5 = puVar2;
    if (in_stack_00000018 <= puVar2 || puVar2 < unaff_x26) {
      puVar5 = in_stack_00000018;
    }
    iVar8 = *(int *)(unaff_x29 + -0x74);
    if (iVar8 != 2) {
      if (iVar8 == 1) {
        uVar13 = (ulong)*(uint *)(unaff_x29 + -0x6c);
        if ((ulong)((long)puVar5 - (long)unaff_x26) < uVar13) {
LAB_0014e478:
          uVar13 = 0xffffffffffffffba;
          break;
        }
        if (unaff_x26 == (undefined1 *)0x0) {
          if (*(uint *)(unaff_x29 + -0x6c) != 0) goto LAB_0014e49c;
LAB_0014e3e8:
          uVar13 = 0;
        }
        else {
          _memset(unaff_x26,*puVar2,uVar13);
        }
        goto LAB_0014e3ec;
      }
      if (iVar8 == 0) {
        if ((ulong)((long)in_stack_00000018 - (long)unaff_x26) < unaff_x25) goto LAB_0014e478;
        if (unaff_x26 == (undefined1 *)0x0) {
          if (unaff_x25 == 0) goto LAB_0014e3e8;
LAB_0014e49c:
          uVar13 = 0xffffffffffffffb6;
          break;
        }
        _memmove(unaff_x26,puVar2,unaff_x25);
        uVar13 = unaff_x25;
        goto LAB_0014e3ec;
      }
LAB_0014e470:
      uVar13 = 0xffffffffffffffec;
      break;
    }
    uVar13 = func_0x00151c98();
    if (0xffffffffffffff88 < uVar13) break;
LAB_0014e3ec:
    if (unaff_x21[0x2a] != 0) {
      func_0x0015f240(in_stack_00000020,unaff_x26,uVar13);
    }
    unaff_x28 = (uint *)(puVar2 + unaff_x25);
    if (*(int *)(unaff_x29 + -0x70) != 0) {
      uVar13 = (long)(unaff_x26 + uVar13) - (long)unaff_x19;
      if ((unaff_x24[0xe9d] == 0xffffffffffffffff) || (uVar13 == unaff_x24[0xe9d])) {
        if (unaff_x21[4] == 0) {
          unaff_x20 = uStack0000000000000028;
          unaff_x23 = unaff_x28;
        }
        else {
          uVar1 = uStack0000000000000028 - 4;
          if ((uStack0000000000000028 < 4) ||
             ((unaff_x21[0x29] == 0 &&
              (uVar9 = func_0x0015f3e8(in_stack_00000020), *unaff_x28 != uVar9)))) {
            uVar13 = 0xffffffffffffffea;
          }
          else {
            unaff_x20 = uVar1;
            unaff_x23 = unaff_x28 + 1;
          }
        }
        break;
      }
      goto LAB_0014e470;
    }
    unaff_x25 = func_0x00150f3c(unaff_x28,uStack0000000000000028,unaff_x29 + -0x74);
    unaff_x26 = unaff_x26 + uVar13;
    uVar13 = unaff_x25;
  } while (unaff_x25 < 0xffffffffffffff89);
  do {
code_r0x0014e260:
    do {
      do {
        iVar8 = func_0x0015e310(uVar13);
        if ((iVar8 == 10 & in_stack_00000000._4_1_) != 0) {
          return 0xffffffffffffffb8;
        }
        if (0xffffffffffffff88 < uVar13) {
          return uVar13;
        }
        unaff_x19 = unaff_x19 + uVar13;
        unaff_x22 = unaff_x22 - uVar13;
        uVar13 = 5;
        if (unaff_x21[0x28] != 0) {
          uVar13 = 1;
        }
        in_stack_00000000._4_1_ = 1;
        if (unaff_x20 < uVar13) {
code_r0x0014dee8:
          uVar13 = 0xffffffffffffffb8;
          if (unaff_x20 == 0) {
            uVar13 = (long)unaff_x19 - in_stack_00000010;
          }
          return uVar13;
        }
        if (unaff_x21[0x28] == 0) {
          while ((3 < unaff_x20 && (*unaff_x23 >> 4 == 0x184d2a5))) {
            if (unaff_x20 < 8) {
              return 0xffffffffffffffb8;
            }
            if (0xfffffff7 < unaff_x23[1]) {
              return 0xfffffffffffffff2;
            }
            uVar1 = (ulong)unaff_x23[1] + 8;
            uVar4 = 0xffffffffffffffb8;
            if (uVar1 <= unaff_x20) {
              uVar4 = uVar1;
            }
            if (0xffffffffffffff88 < uVar4) {
              return uVar4;
            }
            unaff_x23 = (uint *)((long)unaff_x23 + uVar4);
            unaff_x20 = unaff_x20 - uVar4;
            if (unaff_x20 < uVar13) goto code_r0x0014dee8;
          }
        }
        if (in_stack_00000008 == 0) {
          unaff_x24[0xe9c] = uVar13;
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
            piVar14 = in_stack_00000038;
            if ((7 < in_stack_00000040) && (*in_stack_00000038 == -0x13cf5bc9)) {
              unaff_x21[0x40] = in_stack_00000038[1];
              uVar13 = func_0x0014ed6c(*(undefined8 *)(unaff_x29 + -0x80),in_stack_00000038,
                                       in_stack_00000040);
              if (0xffffffffffffff88 < uVar13) {
                return 0xffffffffffffffe2;
              }
              piVar12 = (int *)((long)in_stack_00000038 + uVar13);
              unaff_x24[0xea6] = unaff_d8;
              unaff_x24[0xe9b] = unaff_x24[0xe98];
              piVar14 = (int *)((long)piVar12 + (unaff_x24[0xe99] - unaff_x24[0xe98]));
            }
            unaff_x24[0xe9a] = piVar14;
            unaff_x24[0xe99] = piVar12;
            unaff_x24[0xe98] = in_stack_00000030;
          }
        }
        else {
          lVar10 = func_0x00156654(in_stack_00000008);
          lVar11 = func_0x0015665c(in_stack_00000008);
          unaff_x21[0x41] = (uint)(unaff_x24[0xe9b] != lVar10 + lVar11);
          uVar6 = 5;
          if (unaff_x21[0x28] != 0) {
            uVar6 = 1;
          }
          unaff_x24[0xe9c] = uVar6;
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
        uVar13 = 9;
        if (unaff_x21[0x28] != 0) {
          uVar13 = 5;
        }
        if (unaff_x20 < uVar13) {
code_r0x0014e25c:
          uVar13 = 0xffffffffffffffb8;
          goto code_r0x0014e260;
        }
        lVar10 = 5;
        if (unaff_x21[0x28] != 0) {
          lVar10 = 1;
        }
        bVar7 = *(byte *)((long)unaff_x23 + lVar10 + -1);
        lVar10 = *(long *)(&UNK_00813b00 + ((ulong)bVar7 & 3) * 8) + lVar10 +
                 *(long *)(&UNK_00813b20 + ((ulong)(bVar7 >> 3) & 0x18));
        if ((bVar7 & 0x20) == 0) {
          lVar10 = lVar10 + 1;
        }
        uVar1 = lVar10 + (ulong)((uint)(bVar7 < 0x40) & (bVar7 & 0x20) >> 5);
        uVar13 = uVar1;
      } while (0xffffffffffffff88 < uVar1);
      if (unaff_x20 < uVar1 + 3) goto code_r0x0014e25c;
      uVar13 = func_0x0014ec10();
    } while (0xffffffffffffff88 < uVar13);
    in_stack_00000000._4_1_ = 1;
    uVar9 = unaff_x21[0x48];
    if (uVar9 != 0) {
      uVar3 = *unaff_x21;
      if (uVar9 <= *unaff_x21) {
        uVar3 = uVar9;
      }
      *unaff_x21 = uVar3;
    }
    unaff_x28 = (uint *)((long)unaff_x23 + uVar1);
    uStack0000000000000028 = unaff_x20 - uVar1;
    unaff_x25 = func_0x00150f3c(unaff_x28,uStack0000000000000028,unaff_x29 + -0x74);
    if (unaff_x25 < 0xffffffffffffff89) break;
    uVar13 = unaff_x25;
  } while( true );
  in_stack_00000018 = unaff_x19 + unaff_x22;
  unaff_x26 = unaff_x19;
  goto code_r0x0014e320;
}

