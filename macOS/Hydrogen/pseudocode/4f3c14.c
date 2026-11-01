
void FUN_004f3c14(undefined8 *param_1,undefined8 *param_2)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  undefined8 unaff_x19;
  ulong unaff_x20;
  long lVar7;
  long *plVar8;
  long unaff_x22;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  undefined8 unaff_x25;
  long lVar12;
  undefined8 unaff_x28;
  undefined8 *in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long *in_stack_00000018;
  undefined8 in_stack_00000020;
  long *in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  
code_r0x004f3c14:
  func_0x004f4e4c(param_1,param_2);
  plVar8 = in_stack_00000028;
  do {
    lVar7 = *plVar8;
    uVar2 = *(ushort *)(lVar7 + 0x1c2);
    uVar11 = (ulong)uVar2;
    uVar9 = unaff_x20 + 1;
    puVar4 = (undefined8 *)(lVar7 + unaff_x20 * 0x20);
    lVar10 = uVar11 - unaff_x20;
    if (uVar11 < unaff_x20 || lVar10 == 0) {
      *puVar4 = unaff_x19;
      puVar4[1] = unaff_x22;
      puVar4[2] = unaff_x25;
      puVar4[3] = in_stack_00000038;
      *(undefined8 *)(lVar7 + unaff_x20 * 8 + 0x168) = in_stack_00000048;
    }
    else {
      _memmove(lVar7 + uVar9 * 0x20,puVar4,lVar10 * 0x20);
      *puVar4 = unaff_x19;
      puVar4[1] = unaff_x22;
      lVar6 = lVar7 + 0x168;
      lVar12 = unaff_x20 * 8;
      puVar4[2] = unaff_x25;
      puVar4[3] = in_stack_00000038;
      _memmove(lVar6 + uVar9 * 8,lVar6 + lVar12,lVar10 * 8);
      *(undefined8 *)(lVar6 + lVar12) = in_stack_00000048;
      _memmove(lVar7 + 0x1c8 + lVar12 + 0x10,lVar7 + 0x1c8 + uVar9 * 8,lVar10 * 8);
      unaff_x28 = in_stack_00000008;
    }
    *(long *)(lVar7 + uVar9 * 8 + 0x1c8) = in_stack_00000050;
    *(ushort *)(lVar7 + 0x1c2) = uVar2 + 1;
    unaff_x19 = uStack0000000000000070;
    unaff_x22 = in_stack_00000078;
    unaff_x25 = in_stack_00000080;
    in_stack_00000038 = in_stack_00000088;
    in_stack_00000048 = in_stack_00000090;
    lVar10 = in_stack_00000098;
    in_stack_00000050 = in_stack_000000a8;
    lVar6 = in_stack_000000b0;
    if (uVar9 < uVar11 + 2) {
      lVar12 = unaff_x20 + 0x3a;
      do {
        lVar5 = *(long *)(lVar7 + lVar12 * 8);
        *(long *)(lVar5 + 0x160) = lVar7;
        *(short *)(lVar5 + 0x1c0) = (short)lVar12 + -0x39;
        lVar12 = lVar12 + 1;
      } while (lVar12 - uVar11 != 0x3b);
    }
joined_r0x004f3bb8:
    if (unaff_x22 == -0x8000000000000000) {
FUN_004f3eb8:
      *in_stack_00000030 = in_stack_00000020;
      in_stack_00000030[1] = in_stack_00000010;
      in_stack_00000030[2] = unaff_x28;
      return;
    }
    lVar7 = *(long *)(lVar10 + 0x160);
    uStack0000000000000070 = unaff_x19;
    in_stack_00000078 = unaff_x22;
    in_stack_00000080 = unaff_x25;
    in_stack_00000088 = in_stack_00000038;
    in_stack_00000090 = in_stack_00000048;
    in_stack_000000a8 = in_stack_00000050;
    in_stack_000000b0 = lVar6;
    if (lVar7 == 0) {
      plVar8 = (long *)*in_stack_00000000;
      lVar10 = *plVar8;
      if (lVar10 == 0) {
        func_0x007a23bc(&UNK_009e8340);
      }
      else {
        lVar7 = plVar8[1];
        puVar4 = (undefined8 *)func_0x00187bd0(0x228,8);
        if (puVar4 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x228);
        }
        else {
          puVar4[0x2c] = 0;
          *(undefined2 *)((long)puVar4 + 0x1c2) = 0;
          puVar4[0x39] = lVar10;
          *(undefined8 **)(lVar10 + 0x160) = puVar4;
          *(undefined2 *)(lVar10 + 0x1c0) = 0;
          *plVar8 = (long)puVar4;
          plVar8[1] = lVar7 + 1;
          if (lVar6 == lVar7) {
            *(undefined2 *)((long)puVar4 + 0x1c2) = 1;
            *puVar4 = unaff_x19;
            puVar4[1] = unaff_x22;
            puVar4[2] = unaff_x25;
            puVar4[3] = in_stack_00000038;
            puVar4[0x2d] = in_stack_00000048;
            puVar4[0x3a] = in_stack_00000050;
            *(undefined8 **)(in_stack_00000050 + 0x160) = puVar4;
            *(undefined2 *)(in_stack_00000050 + 0x1c0) = 1;
            goto FUN_004f3eb8;
          }
          func_0x007a247c(&UNK_008a3c1b,0x30,&UNK_009e8370);
        }
      }
code_r0x004f4034:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x4f4038);
      (*pcVar3)();
    }
    if (lVar6 != in_stack_000000a0) {
      func_0x007a247c(&UNK_008a3c73,0x35,&UNK_009e83d0);
      goto code_r0x004f4034;
    }
    uVar2 = *(ushort *)(lVar10 + 0x1c0);
    unaff_x20 = (ulong)uVar2;
    uVar1 = *(ushort *)(lVar7 + 0x1c2);
    uVar9 = (ulong)uVar1;
    if (uVar1 < 0xb) {
      uVar11 = unaff_x20 + 1;
      puVar4 = (undefined8 *)(lVar7 + unaff_x20 * 0x20);
      if (uVar2 < uVar1) {
        _memmove(lVar7 + uVar11 * 0x20,puVar4,(uVar9 - unaff_x20) * 0x20);
        *puVar4 = unaff_x19;
        puVar4[1] = unaff_x22;
        lVar10 = lVar7 + 0x168;
        lVar12 = unaff_x20 * 8;
        lVar6 = (uVar9 - unaff_x20) * 8;
        puVar4[2] = unaff_x25;
        puVar4[3] = in_stack_00000038;
        _memmove(lVar10 + uVar11 * 8,lVar10 + lVar12,lVar6);
        *(undefined8 *)(lVar10 + lVar12) = in_stack_00000048;
        _memmove(lVar7 + 0x1c8 + lVar12 + 0x10,lVar7 + 0x1c8 + uVar11 * 8,lVar6);
      }
      else {
        *puVar4 = unaff_x19;
        puVar4[1] = unaff_x22;
        puVar4[2] = unaff_x25;
        puVar4[3] = in_stack_00000038;
        *(undefined8 *)(lVar7 + unaff_x20 * 8 + 0x168) = in_stack_00000048;
      }
      *(long *)(lVar7 + uVar11 * 8 + 0x1c8) = in_stack_00000050;
      *(ushort *)(lVar7 + 0x1c2) = uVar1 + 1;
      if (uVar11 < uVar9 + 2) {
        lVar10 = unaff_x20 + 0x3a;
        do {
          lVar6 = *(long *)(lVar7 + lVar10 * 8);
          *(long *)(lVar6 + 0x160) = lVar7;
          *(short *)(lVar6 + 0x1c0) = (short)lVar10 + -0x39;
          lVar10 = lVar10 + 1;
        } while (lVar10 - uVar9 != 0x3b);
      }
      goto FUN_004f3eb8;
    }
    in_stack_00000060 = in_stack_000000a0 + 1;
    uStack0000000000000058 = lVar7;
    if (uVar2 < 5) {
      in_stack_00000068 = 4;
      param_1 = &uStack0000000000000070;
      param_2 = &uStack0000000000000058;
      goto code_r0x004f3c14;
    }
    if (uVar2 == 5) {
      in_stack_00000068 = 5;
      func_0x004f4e4c(&uStack0000000000000070,&uStack0000000000000058);
      lVar10 = in_stack_00000098;
      uVar2 = *(ushort *)(in_stack_00000098 + 0x1c2);
      uVar9 = (ulong)uVar2;
      if (uVar9 < 6) break;
      _memmove(in_stack_00000098 + 0xc0,in_stack_00000098 + 0xa0,(uVar9 - 5) * 0x20);
      *(undefined8 *)(lVar10 + 0xa0) = unaff_x19;
      *(long *)(lVar10 + 0xa8) = unaff_x22;
      *(undefined8 *)(lVar10 + 0xb0) = unaff_x25;
      *(undefined8 *)(lVar10 + 0xb8) = in_stack_00000038;
      _memmove(lVar10 + 0x198,lVar10 + 400,(uVar9 - 5) * 8);
      *(undefined8 *)(lVar10 + 400) = in_stack_00000048;
      _memmove(lVar10 + 0x200,lVar10 + 0x1f8,uVar9 * 8 + -0x28);
      *(long *)(lVar10 + 0x1f8) = in_stack_00000050;
      *(ushort *)(lVar10 + 0x1c2) = uVar2 + 1;
      goto code_r0x004f3df8;
    }
    if (uVar2 == 6) {
      in_stack_00000068 = 5;
      func_0x004f4e4c(&uStack0000000000000070,&uStack0000000000000058);
      unaff_x20 = 0;
    }
    else {
      in_stack_00000068 = 6;
      func_0x004f4e4c(&uStack0000000000000070,&uStack0000000000000058);
      unaff_x20 = unaff_x20 - 7;
    }
    plVar8 = in_stack_00000018;
  } while( true );
  *(undefined8 *)(in_stack_00000098 + 0xa0) = unaff_x19;
  *(long *)(in_stack_00000098 + 0xa8) = unaff_x22;
  *(undefined8 *)(in_stack_00000098 + 0xb0) = unaff_x25;
  *(undefined8 *)(in_stack_00000098 + 0xb8) = in_stack_00000038;
  *(undefined8 *)(in_stack_00000098 + 400) = in_stack_00000048;
  *(long *)(in_stack_00000098 + 0x1f8) = in_stack_00000050;
  *(ushort *)(in_stack_00000098 + 0x1c2) = uVar2 + 1;
  unaff_x19 = uStack0000000000000070;
  unaff_x22 = in_stack_00000078;
  unaff_x25 = in_stack_00000080;
  in_stack_00000038 = in_stack_00000088;
  in_stack_00000048 = in_stack_00000090;
  in_stack_00000050 = in_stack_000000a8;
  lVar6 = in_stack_000000b0;
  if (uVar2 == 5) {
code_r0x004f3df8:
    lVar7 = 0x3f;
    do {
      lVar6 = *(long *)(lVar10 + lVar7 * 8);
      *(long *)(lVar6 + 0x160) = lVar10;
      *(short *)(lVar6 + 0x1c0) = (short)lVar7 + -0x39;
      lVar7 = lVar7 + 1;
      unaff_x19 = uStack0000000000000070;
      unaff_x22 = in_stack_00000078;
      unaff_x25 = in_stack_00000080;
      in_stack_00000038 = in_stack_00000088;
      in_stack_00000048 = in_stack_00000090;
      in_stack_00000050 = in_stack_000000a8;
      lVar6 = in_stack_000000b0;
    } while ((4 - uVar9) + lVar7 != 0x3f);
  }
  goto joined_r0x004f3bb8;
}

