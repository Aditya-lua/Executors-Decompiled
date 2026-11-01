
void FUN_0016bd44(void)

{
  ulong *puVar1;
  undefined2 uVar2;
  code *pcVar3;
  undefined1 in_ZR;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong in_x11;
  ulong uVar8;
  ulong unaff_x19;
  ulong unaff_x22;
  ulong unaff_x23;
  long *plVar9;
  long *unaff_x24;
  undefined8 uVar10;
  ulong unaff_x25;
  long *unaff_x26;
  ulong uVar11;
  long lVar12;
  long lVar13;
  long unaff_x29;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long *in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 in_stack_00000078;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined1 uStack0000000000000098;
  undefined2 uStack000000000000009c;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  
  do {
    if ((bool)in_ZR) {
code_r0x0016ba40:
      do {
        uVar11 = in_stack_00000040 >> 0x10;
        *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0x68);
        *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0x70);
        *(ulong *)(unaff_x29 + -0x80) = unaff_x22;
        uVar6 = in_stack_00000050;
        uVar8 = in_stack_00000040;
        uVar4 = in_stack_00000060;
        while( true ) {
          puVar1 = (ulong *)(in_stack_00000028 + in_stack_00000030 * 0x70);
          *puVar1 = in_stack_00000060;
          puVar1[1] = uVar6;
          in_stack_00000030 = in_stack_00000030 + 1;
          puVar1[2] = uVar4;
          puVar1[3] = in_stack_00000058;
          *(short *)(puVar1 + 4) = (short)uVar8;
          *(short *)((long)puVar1 + 0x22) = (short)uVar11;
          *(int *)((long)puVar1 + 0x24) = (int)(in_stack_00000040 >> 0x20);
          puVar1[5] = in_stack_00000080;
          *(undefined2 *)(puVar1 + 6) = uStack000000000000009c;
          *(undefined2 *)((long)puVar1 + 0x32) = in_stack_00000090._4_2_;
          *(undefined1 *)((long)puVar1 + 0x34) = uStack0000000000000098;
          uVar6 = *(ulong *)(unaff_x29 + -0x90);
          puVar1[8] = *(ulong *)(unaff_x29 + -0x88);
          puVar1[7] = uVar6;
          puVar1[9] = *(ulong *)(unaff_x29 + -0x80);
          puVar1[10] = in_stack_000000a0;
          puVar1[0xb] = in_stack_00000088;
          puVar1[0xc] = in_stack_00000070;
          plVar9 = *(long **)(unaff_x29 + -0x98);
          *(undefined1 *)(puVar1 + 0xd) = in_stack_00000078._4_1_;
          in_stack_00000048 = in_stack_00000048 + -1;
          if ((in_stack_00000048 == 0) || (plVar9 == in_stack_00000068)) {
            *in_stack_00000020 = in_stack_00000018;
            in_stack_00000020[1] = in_stack_00000028;
            in_stack_00000020[2] = in_stack_00000018;
            return;
          }
          lVar7 = *plVar9;
          *(long **)(unaff_x29 + -0x98) = plVar9 + 0xe;
          if (lVar7 != -0x8000000000000000) break;
          uVar6 = plVar9[3];
          if ((long)uVar6 < 0) {
            in_stack_00000010 = 0;
            goto code_r0x0016be9c;
          }
          uVar8 = (ulong)*(ushort *)(plVar9 + 4);
          uVar11 = (ulong)*(ushort *)((long)plVar9 + 0x22);
          lVar7 = plVar9[2];
          if (uVar6 == 0) {
            uVar4 = 1;
          }
          else {
            uVar4 = func_0x00187bd0(uVar6,1);
            if (uVar4 == 0) {
              in_stack_00000038 = uVar6;
              goto code_r0x0016be9c;
            }
          }
          _memcpy(uVar4,lVar7);
          in_stack_00000060 = 0x8000000000000000;
          in_stack_00000058 = uVar6;
          in_stack_00000038 = uVar4;
        }
        in_stack_00000060 = plVar9[2];
        if ((long)in_stack_00000060 < 0) {
          in_stack_00000010 = 0;
          in_stack_00000038 = in_stack_00000050;
code_r0x0016be9c:
          func_0x007a1f00(in_stack_00000010,in_stack_00000038,&UNK_009bdb28);
          goto LAB_0016beb0;
        }
        uStack0000000000000098 = *(undefined1 *)((long)plVar9 + 0x34);
        uStack000000000000009c = (undefined2)plVar9[6];
        in_stack_00000090._4_2_ = *(undefined2 *)((long)plVar9 + 0x32);
        lVar7 = plVar9[1];
        if (in_stack_00000060 == 0) {
          in_stack_00000050 = 1;
        }
        else {
          in_stack_00000050 = func_0x00187bd0(in_stack_00000060,1);
          if (in_stack_00000050 == 0) {
            in_stack_00000038 = in_stack_00000060;
            goto code_r0x0016be9c;
          }
        }
        _memcpy(in_stack_00000050,lVar7,in_stack_00000060);
        uVar10 = 0;
        in_stack_00000080 = plVar9[5];
        if (in_stack_00000080 >> 0x3d != 0) {
code_r0x0016be80:
          func_0x007a1f00(uVar10,in_stack_00000040,&UNK_009bdb28);
          goto LAB_0016beb0;
        }
        uVar6 = in_stack_00000080 * 8;
        if (0x7ffffffffffffffe < uVar6) goto code_r0x0016be80;
        lVar7 = plVar9[4];
        if (uVar6 == 0) {
          in_stack_00000058 = 0;
          in_stack_00000040 = 2;
        }
        else {
          in_stack_00000040 = func_0x00187bd0(uVar6,2);
          if (in_stack_00000040 == 0) {
            uVar10 = 2;
            in_stack_00000040 = uVar6;
            goto code_r0x0016be80;
          }
          in_stack_00000058 = in_stack_00000080;
        }
        _memcpy(in_stack_00000040,lVar7,uVar6);
        in_stack_00000078._4_1_ = (undefined1)plVar9[0xd];
        if (plVar9[10] == -0x8000000000000000) {
          in_stack_00000088 = plVar9[0xb];
          in_stack_00000070 = plVar9[0xc];
          in_stack_000000a0 = 0x8000000000000000;
        }
        else {
          func_0x0045cd08(unaff_x29 + -0x70);
          in_stack_000000a0 = *(ulong *)(unaff_x29 + -0x70);
          in_stack_00000088 = *(ulong *)(unaff_x29 + -0x68);
          in_stack_00000070 = *(ulong *)(unaff_x29 + -0x60);
        }
        uVar10 = 0;
        unaff_x22 = plVar9[9];
        uVar6 = in_x11;
        if ((unaff_x22 >> 0x3b != 0) ||
           (unaff_x23 = unaff_x22 * 0x20, 0x7ffffffffffffff8 < unaff_x23)) {
code_r0x0016be3c:
          func_0x007a1f00(uVar10,uVar6,&UNK_009bdb40);
          goto LAB_0016beb0;
        }
        if (unaff_x23 == 0) {
          *(undefined8 *)(unaff_x29 + -0x70) = 0;
          *(undefined8 *)(unaff_x29 + -0x68) = 8;
          in_x11 = 8;
          goto code_r0x0016ba40;
        }
        unaff_x24 = (long *)plVar9[8];
        in_x11 = func_0x00187bd0(unaff_x23,8);
        uVar10 = 8;
        uVar6 = unaff_x23;
        if (in_x11 == 0) goto code_r0x0016be3c;
        *(ulong *)(unaff_x29 + -0x70) = unaff_x22;
        *(ulong *)(unaff_x29 + -0x68) = in_x11;
      } while (unaff_x22 == 0);
      unaff_x19 = 0;
      unaff_x25 = 0;
      *(ulong *)(unaff_x29 + -0xa0) = in_x11;
      unaff_x26 = unaff_x24;
    }
    else {
      lVar7 = unaff_x26[3];
      uVar2 = *(undefined2 *)((long)unaff_x26 + 0x1a);
      if (*unaff_x26 == -0x8000000000000000) {
        lVar5 = *(long *)((long)unaff_x24 + unaff_x19 + 8);
        lVar13 = *(long *)((long)unaff_x24 + unaff_x19 + 0x10);
        lVar12 = -0x8000000000000000;
      }
      else {
        lVar13 = *(long *)((long)unaff_x24 + unaff_x19 + 0x10);
        if (lVar13 < 0) {
          in_stack_00000010 = 0;
          goto LAB_0016be24;
        }
        uVar10 = *(undefined8 *)((long)unaff_x24 + unaff_x19 + 8);
        if (lVar13 == 0) {
          lVar5 = 1;
        }
        else {
          lVar5 = func_0x00187bd0(lVar13,1);
          if (lVar5 == 0) {
            in_stack_000000a8 = lVar13;
LAB_0016be24:
            func_0x007a1f00(in_stack_00000010,in_stack_000000a8,&UNK_009bdb28);
LAB_0016beb0:
                    /* WARNING: Does not return */
            pcVar3 = (code *)SoftwareBreakpoint(1,0x16beb4);
            (*pcVar3)();
          }
        }
        _memcpy(lVar5,uVar10,lVar13);
        in_x11 = *(ulong *)(unaff_x29 + -0xa0);
        lVar12 = lVar13;
        in_stack_000000a8 = lVar5;
      }
      unaff_x25 = unaff_x25 + 1;
      plVar9 = (long *)(in_x11 + unaff_x19);
      *plVar9 = lVar12;
      plVar9[1] = lVar5;
      plVar9[2] = lVar13;
      *(short *)(plVar9 + 3) = (short)lVar7;
      unaff_x19 = unaff_x19 + 0x20;
      *(undefined2 *)((long)plVar9 + 0x1a) = uVar2;
      unaff_x26 = unaff_x26 + 4;
      if (unaff_x22 == unaff_x25) goto code_r0x0016ba40;
    }
    in_ZR = unaff_x23 == unaff_x19;
  } while( true );
}

