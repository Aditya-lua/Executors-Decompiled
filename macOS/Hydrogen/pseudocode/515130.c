
void FUN_00515130(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long unaff_x19;
  long lVar5;
  long unaff_x20;
  long lVar6;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 unaff_x26;
  long unaff_x27;
  undefined8 *puVar7;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long *in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  
  do {
    puVar7 = (undefined8 *)(unaff_x19 + 8);
    do {
      if (puVar7[-1] != 0) {
        func_0x00187bd4(*puVar7,puVar7[-1],1);
      }
      puVar7 = puVar7 + 3;
      unaff_x20 = unaff_x20 + -1;
    } while (unaff_x20 != 0);
    do {
      func_0x00187bd4(unaff_x19,unaff_x27 * 0x18,8);
      lVar5 = 0;
      lVar6 = in_stack_00000030;
      plVar4 = in_stack_00000038;
      do {
        if ((*plVar4 == unaff_x24) && (iVar2 = _memcmp(plVar4[-1],unaff_x26,unaff_x24), iVar2 == 0))
        {
          if (unaff_x24 < 0) {
            in_stack_00000008 = 0;
code_r0x005153e8:
            func_0x007a1f00(in_stack_00000008,unaff_x23,&UNK_009e9838);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x515400);
            (*pcVar1)();
          }
          if (unaff_x24 == 0) {
            unaff_x23 = 1;
          }
          else {
            unaff_x23 = func_0x00187bd0(unaff_x24,1);
            if (unaff_x23 == 0) {
              unaff_x23 = unaff_x24;
              goto code_r0x005153e8;
            }
          }
          _memcpy(unaff_x23,unaff_x26,unaff_x24);
          if (unaff_x25 == -0x8000000000000000) goto LAB_005150c8;
          *(long *)(unaff_x29 + -0xd8) = lVar5;
          *(long *)(unaff_x29 + -0xd0) = lVar5;
          *(long *)(unaff_x29 + -200) = unaff_x25;
          *(long *)(unaff_x29 + -0xc0) = in_stack_00000040;
          *(long *)(unaff_x29 + -0xb8) = in_stack_00000028;
          *(long *)(unaff_x29 + -0xb0) = unaff_x24;
          *(long *)(unaff_x29 + -0xa8) = unaff_x23;
          *(long *)(unaff_x29 + -0xa0) = unaff_x24;
          *(long *)(unaff_x29 + -0x98) = unaff_x21;
          *(long *)(unaff_x29 + -0x90) = in_stack_00000048;
          *(undefined8 *)(unaff_x29 + -0x88) = in_stack_00000050;
          *(undefined8 *)(unaff_x29 + -0x80) = unaff_x22;
          *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000010;
          *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000018;
          func_0x0051ebd4(&uStack0000000000000070,unaff_x29 + -0x98,unaff_x29 + -0xd8);
          if (in_stack_00000080 == -0x8000000000000000) goto code_r0x00515274;
          in_stack_000000b8 = in_stack_00000078;
          in_stack_000000b0 = uStack0000000000000070;
          in_stack_000000c8 = in_stack_00000088;
          in_stack_000000c0 = in_stack_00000080;
          in_stack_000000d8 = in_stack_00000098;
          in_stack_000000d0 = in_stack_00000090;
          in_stack_000000e8 = in_stack_000000a8;
          in_stack_000000e0 = in_stack_000000a0;
          in_stack_00000020[1] = in_stack_00000088;
          *in_stack_00000020 = in_stack_00000080;
          in_stack_00000020[3] = in_stack_00000098;
          in_stack_00000020[2] = in_stack_00000090;
          in_stack_00000020[5] = in_stack_000000a8;
          in_stack_00000020[4] = in_stack_000000a0;
          if (in_stack_00000058 == 0) {
            return;
          }
          goto code_r0x0051528c;
        }
        lVar5 = lVar5 + 1;
        lVar6 = lVar6 + -0x10;
        plVar4 = plVar4 + 2;
      } while (lVar6 != 0);
      if (unaff_x25 != 0) {
        uVar3 = 1;
        goto LAB_005150c4;
      }
LAB_005150c8:
      if (unaff_x21 == in_stack_00000048) {
code_r0x00515274:
        *in_stack_00000020 = -0x8000000000000000;
        if (in_stack_00000058 != 0) {
code_r0x0051528c:
          func_0x00187bd4(in_stack_00000060,in_stack_00000058 * 0x18,8);
        }
        return;
      }
      func_0x00500450(unaff_x21,0);
      unaff_x26 = *(undefined8 *)(unaff_x21 + 0x230);
      unaff_x24 = *(long *)(unaff_x21 + 0x238);
      func_0x00514b20(unaff_x29 + -0x98,in_stack_00000050);
      unaff_x21 = unaff_x21 + 0x2c8;
      if (*(long *)(unaff_x29 + -0x88) == 0) {
        if (*(long *)(unaff_x29 + -0x98) != 0) {
          in_stack_00000040 = *(long *)(unaff_x29 + -0x90);
          unaff_x25 = *(long *)(unaff_x29 + -0x98) * 0x18;
          uVar3 = 8;
LAB_005150c4:
          func_0x00187bd4(in_stack_00000040,unaff_x25,uVar3);
        }
        goto LAB_005150c8;
      }
      unaff_x27 = *(long *)(unaff_x29 + -0x98);
      unaff_x19 = *(long *)(unaff_x29 + -0x90);
      unaff_x20 = *(long *)(unaff_x29 + -0x88) + -1;
      plVar4 = (long *)(unaff_x19 + unaff_x20 * 0x18);
      unaff_x25 = *plVar4;
      in_stack_00000040 = plVar4[1];
      in_stack_00000028 = plVar4[2];
    } while (unaff_x20 == 0);
  } while( true );
}

