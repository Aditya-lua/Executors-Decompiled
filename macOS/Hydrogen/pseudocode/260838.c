
void FUN_00260838(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong *puVar4;
  ushort uVar5;
  code *pcVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long lVar10;
  long *plVar11;
  long lVar12;
  long lVar13;
  int iVar14;
  long unaff_x19;
  ulong uVar15;
  ulong unaff_x20;
  long lVar16;
  long lVar17;
  long *unaff_x24;
  long lVar18;
  ulong uVar19;
  long *unaff_x26;
  long unaff_x27;
  ulong uVar20;
  long unaff_x29;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  undefined8 uStack00000000000000a0;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  ulong in_stack_000000c0;
  ulong in_stack_000000c8;
  ulong in_stack_000000d0;
  
  do {
    param_1 = (undefined8 *)param_1[0x70];
    unaff_x19 = unaff_x19 + -1;
    while (unaff_x19 == 0) {
LAB_002606cc:
      *unaff_x24 = *unaff_x24 + 1;
      func_0x0026d51c(&uStack00000000000000a0,&uStack0000000000000030);
      uVar19 = in_stack_000000d0;
      uVar3 = in_stack_000000c8;
      uVar20 = in_stack_000000a8;
      uVar15 = uStack00000000000000a0;
      if (in_stack_000000b8 == 2) {
        if (in_stack_00000098 - in_stack_00000088 != 0) {
          uVar15 = (ulong)(in_stack_00000098 - in_stack_00000088) / 0x50;
          puVar7 = (undefined8 *)(in_stack_00000088 + 0x30);
          do {
            if (puVar7[-6] != 0) {
              func_0x00187bd4(puVar7[-5],puVar7[-6],1);
            }
            if (puVar7[-1] != 0) {
              func_0x00187bd4(*puVar7,puVar7[-1],1);
            }
            puVar7 = puVar7 + 10;
            uVar15 = uVar15 - 1;
          } while (uVar15 != 0);
        }
        if (in_stack_00000090 != 0) {
          func_0x00187bd4(in_stack_00000080,in_stack_00000090 * 0x50,8);
        }
        if (in_stack_00000048 < 2) {
          if (uStack0000000000000030 != 0) {
            func_0x00187bd4(in_stack_00000038,uStack0000000000000030,1);
          }
          if (in_stack_00000058 != 0) {
            func_0x00187bd4(in_stack_00000060,in_stack_00000058,1);
          }
        }
        lVar17 = unaff_x26[1];
        if (lVar17 == 0) {
          return;
        }
        lVar13 = *unaff_x26;
        while (*(ushort *)(lVar13 + 0x37a) != 0) {
          lVar12 = (ulong)*(ushort *)(lVar13 + 0x37a) - 1;
          lVar10 = lVar13 + lVar12 * 8;
          lVar18 = *(long *)(lVar10 + 0x388);
          uVar15 = (ulong)*(ushort *)(lVar18 + 0x37a);
          if (*(ushort *)(lVar18 + 0x37a) < 5) {
            lVar10 = *(long *)(lVar10 + 0x380);
            uVar5 = *(ushort *)(lVar10 + 0x37a);
            uVar20 = -uVar15 + 5;
            if ((uint)uVar5 < (uint)uVar20) {
              func_0x007a247c(&UNK_0082b159,0x27,&UNK_009cb110);
            }
            else {
              uVar19 = uVar5 - uVar20;
              *(short *)(lVar10 + 0x37a) = (short)uVar19;
              *(undefined2 *)(lVar18 + 0x37a) = 5;
              lVar1 = lVar18 + 8;
              _memmove(lVar1 + (uVar20 & 0xffffffff) * 0x18,lVar1,uVar15 * 0x18);
              lVar2 = lVar18 + 0x110;
              _memmove(lVar2 + (uVar20 & 0xffffffff) * 0x38,lVar2,uVar15 * 0x38);
              uVar3 = uVar19 + 1;
              lVar16 = uVar5 - uVar3;
              if (lVar16 == -uVar15 + 4) {
                _memcpy(lVar1,lVar10 + 8 + (uVar3 & 0xffffffff) * 0x18);
                _memcpy(lVar2,lVar10 + 0x110 + (uVar3 & 0xffffffff) * 0x38,lVar16 * 0x38);
                puVar7 = (undefined8 *)(lVar10 + 8 + (uVar19 & 0xffffffff) * 0x18);
                puVar8 = (undefined8 *)(lVar10 + 0x110 + (uVar19 & 0xffffffff) * 0x38);
                uVar21 = *puVar8;
                *(undefined8 *)(unaff_x29 + -0xa8) = puVar8[1];
                *(undefined8 *)(unaff_x29 + -0xb0) = uVar21;
                uVar21 = puVar8[2];
                *(undefined8 *)(unaff_x29 + -0x98) = puVar8[3];
                *(undefined8 *)(unaff_x29 + -0xa0) = uVar21;
                uVar21 = puVar8[4];
                *(undefined8 *)(unaff_x29 + -0x88) = puVar8[5];
                *(undefined8 *)(unaff_x29 + -0x90) = uVar21;
                *(undefined8 *)(unaff_x29 + -0x80) = puVar8[6];
                iVar14 = (int)lVar12;
                lVar12 = lVar13 + (long)iVar14 * 0x18;
                lVar13 = lVar13 + (long)iVar14 * 0x38;
                in_stack_00000038 = *(long *)(lVar12 + 0x10);
                uStack0000000000000030 = *(long *)(lVar12 + 8);
                in_stack_00000040 = *(long *)(lVar12 + 0x18);
                uVar22 = puVar7[1];
                uVar21 = *puVar7;
                *(undefined8 *)(lVar12 + 0x18) = puVar7[2];
                *(undefined8 *)(lVar12 + 0x10) = uVar22;
                *(undefined8 *)(lVar12 + 8) = uVar21;
                in_stack_00000050 = *(ulong *)(lVar13 + 0x118);
                in_stack_00000048 = *(ulong *)(lVar13 + 0x110);
                in_stack_00000060 = *(ulong *)(lVar13 + 0x128);
                in_stack_00000058 = *(ulong *)(lVar13 + 0x120);
                in_stack_00000070 = *(ulong *)(lVar13 + 0x138);
                in_stack_00000068 = *(ulong *)(lVar13 + 0x130);
                in_stack_00000078 = *(ulong *)(lVar13 + 0x140);
                uVar21 = *(undefined8 *)(unaff_x29 + -0xa0);
                *(undefined8 *)(lVar13 + 0x128) = *(undefined8 *)(unaff_x29 + -0x98);
                *(undefined8 *)(lVar13 + 0x120) = uVar21;
                uVar21 = *(undefined8 *)(unaff_x29 + -0x90);
                *(undefined8 *)(lVar13 + 0x138) = *(undefined8 *)(unaff_x29 + -0x88);
                *(undefined8 *)(lVar13 + 0x130) = uVar21;
                *(undefined8 *)(lVar13 + 0x140) = *(undefined8 *)(unaff_x29 + -0x80);
                uVar21 = *(undefined8 *)(unaff_x29 + -0xb0);
                *(undefined8 *)(lVar13 + 0x118) = *(undefined8 *)(unaff_x29 + -0xa8);
                *(undefined8 *)(lVar13 + 0x110) = uVar21;
                *(long *)(unaff_x29 + -0x68) = in_stack_00000038;
                *(long *)(unaff_x29 + -0x70) = uStack0000000000000030;
                *(long *)(unaff_x29 + -0x60) = in_stack_00000040;
                plVar11 = (long *)(lVar1 + lVar16 * 0x18);
                plVar11[1] = in_stack_00000038;
                *plVar11 = uStack0000000000000030;
                plVar11[2] = in_stack_00000040;
                puVar4 = (ulong *)(lVar2 + lVar16 * 0x38);
                puVar4[1] = in_stack_00000050;
                *puVar4 = in_stack_00000048;
                puVar4[3] = in_stack_00000060;
                puVar4[2] = in_stack_00000058;
                puVar4[5] = in_stack_00000070;
                puVar4[4] = in_stack_00000068;
                puVar4[6] = in_stack_00000078;
                uStack00000000000000a0 = in_stack_00000048;
                in_stack_000000a8 = in_stack_00000050;
                in_stack_000000b0 = in_stack_00000058;
                in_stack_000000b8 = in_stack_00000060;
                in_stack_000000c0 = in_stack_00000068;
                in_stack_000000c8 = in_stack_00000070;
                in_stack_000000d0 = in_stack_00000078;
                if (lVar17 != 1) {
                  lVar13 = lVar18 + 0x380;
                  _memmove(lVar13 + uVar20 * 8,lVar13,uVar15 * 8 + 8);
                  _memcpy(lVar13,lVar10 + uVar3 * 8 + 0x380,uVar20 * 8);
                  plVar11 = *(long **)(lVar18 + 0x380);
                  *plVar11 = lVar18;
                  *(undefined2 *)(plVar11 + 0x6f) = 0;
                  plVar11 = *(long **)(lVar18 + 0x388);
                  *plVar11 = lVar18;
                  *(undefined2 *)(plVar11 + 0x6f) = 1;
                  plVar11 = *(long **)(lVar18 + 0x390);
                  *plVar11 = lVar18;
                  *(undefined2 *)(plVar11 + 0x6f) = 2;
                  plVar11 = *(long **)(lVar18 + 0x398);
                  *plVar11 = lVar18;
                  *(undefined2 *)(plVar11 + 0x6f) = 3;
                  plVar11 = *(long **)(lVar18 + 0x3a0);
                  *plVar11 = lVar18;
                  *(undefined2 *)(plVar11 + 0x6f) = 4;
                  plVar11 = *(long **)(lVar18 + 0x3a8);
                  *plVar11 = lVar18;
                  *(undefined2 *)(plVar11 + 0x6f) = 5;
                }
                goto code_r0x0026090c;
              }
            }
            func_0x007a247c(&UNK_0082b131,0x28,&UNK_009cb0f8);
            goto code_r0x00260c30;
          }
code_r0x0026090c:
          lVar17 = lVar17 + -1;
          lVar13 = lVar18;
          if (lVar17 == 0) {
            return;
          }
        }
        func_0x007a247c(&UNK_0082b07b,0x19,&UNK_009cb0c8);
        goto code_r0x00260bd4;
      }
      uVar5 = *(ushort *)((long)param_1 + 0x37a);
      uVar9 = (ulong)uVar5;
      if (uVar5 < 0xb) goto code_r0x00260674;
      unaff_x19 = 0;
      do {
        param_1 = (undefined8 *)*param_1;
        if (param_1 == (undefined8 *)0x0) {
          puVar7 = (undefined8 *)*unaff_x26;
          lVar17 = unaff_x26[1];
          param_1 = (undefined8 *)func_0x00187bd0(0x3e0,8);
          if (param_1 == (undefined8 *)0x0) goto code_r0x00260c30;
          *param_1 = 0;
          *(undefined2 *)((long)param_1 + 0x37a) = 0;
          param_1[0x70] = puVar7;
          unaff_x19 = lVar17 + 1;
          *puVar7 = param_1;
          *(undefined2 *)(puVar7 + 0x6f) = 0;
          *unaff_x26 = (long)param_1;
          unaff_x26[1] = unaff_x19;
          break;
        }
        unaff_x19 = unaff_x19 + 1;
      } while (10 < *(ushort *)((long)param_1 + 0x37a));
      puVar7 = (undefined8 *)func_0x00187bd0(0x380,8);
      if (puVar7 == (undefined8 *)0x0) goto code_r0x00260bd4;
      *puVar7 = 0;
      *(undefined2 *)((long)puVar7 + 0x37a) = 0;
      lVar17 = unaff_x19;
      while (lVar17 = lVar17 + -1, lVar17 != 0) {
        puVar8 = (undefined8 *)func_0x00187bd0(0x3e0,8);
        if (puVar8 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x3e0);
          goto code_r0x00260c3c;
        }
        *puVar8 = 0;
        *(undefined2 *)((long)puVar8 + 0x37a) = 0;
        puVar8[0x70] = puVar7;
        *puVar7 = puVar8;
        *(undefined2 *)(puVar7 + 0x6f) = 0;
        puVar7 = puVar8;
      }
      uVar5 = *(ushort *)((long)param_1 + 0x37a);
      uVar9 = (ulong)uVar5;
      if (10 < uVar5) {
        func_0x007a247c(&UNK_0082b111,0x20,&UNK_009cb0e0);
        goto code_r0x00260c3c;
      }
      *(ushort *)((long)param_1 + 0x37a) = uVar5 + 1;
      param_1[uVar9 * 3 + 1] = uVar15;
      param_1[uVar9 * 3 + 2] = uVar20;
      param_1[uVar9 * 3 + 3] = in_stack_000000b0;
      unaff_x20 = 0x38;
      uVar21 = *(undefined8 *)(unaff_x27 + 0x18);
      param_1[(ulong)uVar5 * 7 + 0x23] = *(undefined8 *)(unaff_x27 + 0x20);
      param_1[(ulong)uVar5 * 7 + 0x22] = uVar21;
      param_1[(ulong)uVar5 * 7 + 0x24] = uVar3;
      param_1[(ulong)uVar5 * 7 + 0x25] = uVar19;
      uVar21 = *(undefined8 *)(unaff_x27 + 0x38);
      param_1[(ulong)uVar5 * 7 + 0x27] = *(undefined8 *)(unaff_x27 + 0x40);
      param_1[(ulong)uVar5 * 7 + 0x26] = uVar21;
      param_1[(ulong)uVar5 * 7 + 0x28] = *(undefined8 *)(unaff_x27 + 0x48);
      param_1[uVar9 + 0x71] = puVar7;
      *puVar7 = param_1;
      *(ushort *)(puVar7 + 0x6f) = uVar5 + 1;
    }
    param_1 = param_1 + *(ushort *)((long)param_1 + 0x37a);
  } while( true );
code_r0x00260674:
  *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x27 + 0x48);
  uVar25 = *(undefined8 *)(unaff_x27 + 0x40);
  uVar24 = *(undefined8 *)(unaff_x27 + 0x38);
  uVar21 = *(undefined8 *)(unaff_x27 + 0x28);
  uVar23 = *(undefined8 *)(unaff_x27 + 0x20);
  uVar22 = *(undefined8 *)(unaff_x27 + 0x18);
  *(undefined8 *)(unaff_x29 + -0x98) = *(undefined8 *)(unaff_x27 + 0x30);
  *(undefined8 *)(unaff_x29 + -0xa0) = uVar21;
  *(undefined8 *)(unaff_x29 + -0x88) = uVar25;
  *(undefined8 *)(unaff_x29 + -0x90) = uVar24;
  *(undefined8 *)(unaff_x29 + -0xa8) = uVar23;
  *(undefined8 *)(unaff_x29 + -0xb0) = uVar22;
  *(ushort *)((long)param_1 + 0x37a) = uVar5 + 1;
  param_1[uVar9 * 3 + 3] = in_stack_000000b0;
  param_1[uVar9 * 3 + 2] = in_stack_000000a8;
  param_1[uVar9 * 3 + 1] = uStack00000000000000a0;
  lVar17 = uVar9 * (unaff_x20 & 0xffffffff);
  uVar22 = *(undefined8 *)(unaff_x29 + -0xa8);
  uVar21 = *(undefined8 *)(unaff_x29 + -0xb0);
  uVar24 = *(undefined8 *)(unaff_x29 + -0x98);
  uVar23 = *(undefined8 *)(unaff_x29 + -0xa0);
  uVar26 = *(undefined8 *)(unaff_x29 + -0x88);
  uVar25 = *(undefined8 *)(unaff_x29 + -0x90);
  *(undefined8 *)((long)param_1 + lVar17 + 0x140) = *(undefined8 *)(unaff_x29 + -0x80);
  *(undefined8 *)((long)param_1 + lVar17 + 0x128) = uVar24;
  *(undefined8 *)((long)param_1 + lVar17 + 0x120) = uVar23;
  *(undefined8 *)((long)param_1 + lVar17 + 0x138) = uVar26;
  *(undefined8 *)((long)param_1 + lVar17 + 0x130) = uVar25;
  *(undefined8 *)((long)param_1 + lVar17 + 0x118) = uVar22;
  *(undefined8 *)((long)param_1 + lVar17 + 0x110) = uVar21;
  goto LAB_002606cc;
code_r0x00260c30:
  func_0x007a1f18(8,0x3e0);
  goto code_r0x00260c3c;
code_r0x00260bd4:
  func_0x007a1f18(8,0x380);
code_r0x00260c3c:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x260c40);
  (*pcVar6)();
}

