
/* WARNING: Removing unreachable block (ram,0x002601a8) */
/* WARNING: Removing unreachable block (ram,0x002601d8) */

void FUN_0025fcd4(void)

{
  int iVar1;
  long lVar2;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long lVar3;
  undefined8 *unaff_x22;
  undefined8 *puVar4;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined1 uStack0000000000000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_00000100;
  long in_stack_00000238;
  undefined8 in_stack_00000240;
  long in_stack_00000248;
  undefined8 in_stack_00000260;
  undefined8 in_stack_00000268;
  undefined8 in_stack_00000270;
  undefined8 in_stack_00000278;
  undefined8 in_stack_00000280;
  undefined8 in_stack_00000288;
  undefined8 in_stack_000002d8;
  undefined8 in_stack_000002e8;
  undefined8 in_stack_000002f8;
  undefined8 in_stack_00000308;
  undefined8 in_stack_00000318;
  undefined8 in_stack_00000328;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00263a40(&uStack0000000000000038,0x30);
  if (in_stack_00000238 == unaff_x24) {
    lVar3 = unaff_x24 + -0x11;
    if ((in_stack_00000248 == unaff_x22[3]) &&
       (iVar1 = _memcmp(in_stack_00000240,unaff_x22[2]), iVar1 == 0)) {
      func_0x00263a40(auStack_7ffffffe + 0x80000236,&uStack0000000000000038,0x30);
      if ((in_stack_00000238 == unaff_x24) &&
         ((func_0x00263a40(auStack_7ffffffe + 0x80000236,&uStack0000000000000038,0x30),
          in_stack_00000238 == unaff_x24 &&
          (func_0x00263a40(auStack_7ffffffe + 0x80000236,&uStack0000000000000038,0x30),
          in_stack_00000238 == unaff_x24)))) {
        func_0x00263a40(auStack_7ffffffe + 0x80000236,&uStack0000000000000038,0x30);
        if (in_stack_00000238 == unaff_x24) {
          uVar5 = *(undefined8 *)unaff_x22[6];
          uVar7 = ((undefined8 *)unaff_x22[6])[1];
          uVar6 = *unaff_x22;
          uVar9 = unaff_x22[3];
          uVar8 = unaff_x22[2];
          *(undefined8 *)(unaff_x28 + 0x30) = unaff_x22[1];
          *(undefined8 *)(unaff_x28 + 0x28) = uVar6;
          *(undefined8 *)(unaff_x28 + 0x40) = uVar9;
          *(undefined8 *)(unaff_x28 + 0x38) = uVar8;
          uVar6 = unaff_x22[4];
          *(undefined8 *)(unaff_x28 + 0x50) = unaff_x22[5];
          *(undefined8 *)(unaff_x28 + 0x48) = uVar6;
          if (in_stack_00000048 == in_stack_00000040) {
            *(undefined8 *)(unaff_x23 + 0x1c8) = in_stack_00000260;
            *(long *)(unaff_x23 + 0x1c0) = unaff_x25;
            *(undefined8 *)(unaff_x23 + 0x1d8) = in_stack_00000270;
            *(undefined8 *)(unaff_x23 + 0x1d0) = in_stack_00000268;
            *(undefined8 *)(unaff_x23 + 0x188) = 0;
            *(undefined8 *)(unaff_x23 + 0x180) = in_stack_000002f8;
            *(undefined8 *)(unaff_x23 + 0x198) = 0;
            *(undefined8 *)(unaff_x23 + 400) = in_stack_00000308;
            *(undefined8 *)(unaff_x23 + 0x1a8) = 0;
            *(undefined8 *)(unaff_x23 + 0x1a0) = in_stack_00000318;
            *(undefined8 *)(unaff_x23 + 0x148) = in_stack_00000240;
            *(long *)(unaff_x23 + 0x140) = in_stack_00000248;
            *(undefined8 *)(unaff_x23 + 0x158) = 0;
            *(long *)(unaff_x23 + 0x150) = in_stack_00000248;
            *(undefined8 *)(unaff_x23 + 0x168) = 0;
            *(undefined8 *)(unaff_x23 + 0x160) = in_stack_000002d8;
            *(undefined8 *)(unaff_x23 + 0x178) = 0;
            *(undefined8 *)(unaff_x23 + 0x170) = in_stack_000002e8;
            *(undefined8 *)(unaff_x23 + 0x108) = in_stack_00000280;
            *(undefined8 *)(unaff_x23 + 0x100) = in_stack_00000278;
            *(undefined8 *)(unaff_x23 + 0x118) = in_stack_00000240;
            *(undefined8 *)(unaff_x23 + 0x110) = in_stack_00000288;
            *(undefined8 *)(unaff_x23 + 0x128) = in_stack_00000240;
            *(long *)(unaff_x23 + 0x120) = in_stack_00000248;
            *(undefined8 *)(unaff_x23 + 0x138) = in_stack_00000240;
            *(long *)(unaff_x23 + 0x130) = in_stack_00000248;
            lVar3 = in_stack_00000048;
          }
          else {
            *(undefined1 *)(unaff_x29 + -0x90) = 3;
            *(long *)(unaff_x29 + -0x98) = unaff_x24 + -0x10;
            func_0x00262218(unaff_x29 + -0xd0,&uStack0000000000000038,0xa3,unaff_x29 + -0x98,
                            auStack_7ffffffe + 0x80000236,0xffff);
            lVar3 = *(long *)(unaff_x29 + -0xd0);
            if (lVar3 != unaff_x24) {
              unaff_x26 = *(undefined8 *)(unaff_x29 + -200);
              unaff_x25 = *(long *)(unaff_x29 + -0xc0);
              uVar5 = *(undefined8 *)(unaff_x27 + 0x18);
              uVar6 = *(undefined8 *)(unaff_x27 + 0x30);
              uVar7 = *(undefined8 *)(unaff_x27 + 0x28);
              *(undefined8 *)(unaff_x23 + 0x1c8) = *(undefined8 *)(unaff_x27 + 0x20);
              *(undefined8 *)(unaff_x23 + 0x1c0) = uVar5;
              *(undefined8 *)(unaff_x23 + 0x1d8) = uVar6;
              *(undefined8 *)(unaff_x23 + 0x1d0) = uVar7;
              goto code_r0x0025fd2c;
            }
            *(undefined8 *)(unaff_x23 + 0x1c8) = in_stack_00000260;
            *(long *)(unaff_x23 + 0x1c0) = unaff_x25;
            *(undefined8 *)(unaff_x23 + 0x1d8) = in_stack_00000270;
            *(undefined8 *)(unaff_x23 + 0x1d0) = in_stack_00000268;
            *(undefined8 *)(unaff_x23 + 0x188) = 0;
            *(undefined8 *)(unaff_x23 + 0x180) = in_stack_000002f8;
            *(undefined8 *)(unaff_x23 + 0x198) = 0;
            *(undefined8 *)(unaff_x23 + 400) = in_stack_00000308;
            *(undefined8 *)(unaff_x23 + 0x1a8) = 0;
            *(undefined8 *)(unaff_x23 + 0x1a0) = in_stack_00000318;
            *(undefined8 *)(unaff_x23 + 0x148) = in_stack_00000240;
            *(long *)(unaff_x23 + 0x140) = in_stack_00000248;
            *(undefined8 *)(unaff_x23 + 0x158) = 0;
            *(long *)(unaff_x23 + 0x150) = in_stack_00000248;
            *(undefined8 *)(unaff_x23 + 0x168) = 0;
            *(undefined8 *)(unaff_x23 + 0x160) = in_stack_000002d8;
            *(undefined8 *)(unaff_x23 + 0x178) = 0;
            *(undefined8 *)(unaff_x23 + 0x170) = in_stack_000002e8;
            *(undefined8 *)(unaff_x23 + 0x108) = in_stack_00000280;
            *(undefined8 *)(unaff_x23 + 0x100) = in_stack_00000278;
            *(undefined8 *)(unaff_x23 + 0x118) = in_stack_00000240;
            *(undefined8 *)(unaff_x23 + 0x110) = in_stack_00000288;
            *(undefined8 *)(unaff_x23 + 0x128) = in_stack_00000240;
            *(long *)(unaff_x23 + 0x120) = in_stack_00000248;
            *(undefined8 *)(unaff_x23 + 0x138) = in_stack_00000240;
            *(long *)(unaff_x23 + 0x130) = in_stack_00000248;
            lVar3 = in_stack_00000040;
          }
          *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x1c8);
          *(undefined8 *)(unaff_x23 + 0xe0) = *(undefined8 *)(unaff_x23 + 0x1c0);
          *(undefined8 *)(unaff_x23 + 0xf8) = *(undefined8 *)(unaff_x23 + 0x1d8);
          *(undefined8 *)(unaff_x23 + 0xf0) = *(undefined8 *)(unaff_x23 + 0x1d0);
          *(undefined8 *)(unaff_x23 + 0x98) = *(undefined8 *)(unaff_x23 + 0x198);
          *(undefined8 *)(unaff_x23 + 0x90) = *(undefined8 *)(unaff_x23 + 400);
          *(undefined8 *)(unaff_x23 + 0xa8) = *(undefined8 *)(unaff_x23 + 0x1a8);
          *(undefined8 *)(unaff_x23 + 0xa0) = *(undefined8 *)(unaff_x23 + 0x1a0);
          in_stack_00000098 = *(undefined8 *)(unaff_x23 + 0x148);
          in_stack_00000090 = *(undefined8 *)(unaff_x23 + 0x140);
          in_stack_000000a8 = *(undefined8 *)(unaff_x23 + 0x158);
          in_stack_000000a0 = *(undefined8 *)(unaff_x23 + 0x150);
          in_stack_000000b8 = *(undefined8 *)(unaff_x23 + 0x168);
          in_stack_000000b0 = *(undefined8 *)(unaff_x23 + 0x160);
          *(undefined8 *)(unaff_x23 + 0x78) = *(undefined8 *)(unaff_x23 + 0x178);
          *(undefined8 *)(unaff_x23 + 0x70) = *(undefined8 *)(unaff_x23 + 0x170);
          *(undefined8 *)(unaff_x23 + 0x88) = *(undefined8 *)(unaff_x23 + 0x188);
          *(undefined8 *)(unaff_x23 + 0x80) = *(undefined8 *)(unaff_x23 + 0x180);
          in_stack_00000058 = *(undefined8 *)(unaff_x23 + 0x108);
          in_stack_00000050 = *(undefined8 *)(unaff_x23 + 0x100);
          in_stack_00000068 = *(undefined8 *)(unaff_x23 + 0x118);
          in_stack_00000060 = *(undefined8 *)(unaff_x23 + 0x110);
          in_stack_00000078 = *(undefined8 *)(unaff_x23 + 0x128);
          in_stack_00000070 = *(undefined8 *)(unaff_x23 + 0x120);
          in_stack_00000088 = *(undefined8 *)(unaff_x23 + 0x138);
          in_stack_00000080 = *(undefined8 *)(unaff_x23 + 0x130);
          *(undefined8 *)(unaff_x23 + 200) = *(undefined8 *)(unaff_x23 + 0xe8);
          *(undefined8 *)(unaff_x23 + 0xc0) = *(undefined8 *)(unaff_x23 + 0xe0);
          *(undefined8 *)(unaff_x23 + 0xd8) = *(undefined8 *)(unaff_x23 + 0xf8);
          *(undefined8 *)(unaff_x23 + 0xd0) = *(undefined8 *)(unaff_x23 + 0xf0);
          if (in_stack_00000048 == lVar3) {
            *unaff_x20 = 0x8000000000000000;
            unaff_x20[1] = uVar5;
            unaff_x20[2] = uVar7;
            unaff_x20[3] = unaff_x26;
            uVar5 = *(undefined8 *)(unaff_x23 + 0xc0);
            uVar6 = *(undefined8 *)(unaff_x23 + 0xd8);
            uVar7 = *(undefined8 *)(unaff_x23 + 0xd0);
            unaff_x20[5] = *(undefined8 *)(unaff_x23 + 200);
            unaff_x20[4] = uVar5;
            unaff_x20[7] = uVar6;
            unaff_x20[6] = uVar7;
            uVar7 = *(undefined8 *)(unaff_x23 + 0x98);
            uVar5 = *(undefined8 *)(unaff_x23 + 0x90);
            uVar8 = *(undefined8 *)(unaff_x23 + 0xa8);
            uVar6 = *(undefined8 *)(unaff_x23 + 0xa0);
            uVar12 = *(undefined8 *)(unaff_x23 + 0x78);
            uVar11 = *(undefined8 *)(unaff_x23 + 0x70);
            uVar9 = *(undefined8 *)(unaff_x23 + 0x80);
            unaff_x20[0x19] = *(undefined8 *)(unaff_x23 + 0x88);
            unaff_x20[0x18] = uVar9;
            unaff_x20[0x1b] = uVar7;
            unaff_x20[0x1a] = uVar5;
            unaff_x20[0x1d] = uVar8;
            unaff_x20[0x1c] = uVar6;
            unaff_x20[0x1e] = in_stack_00000328;
            unaff_x20[0x11] = in_stack_00000098;
            unaff_x20[0x10] = in_stack_00000090;
            unaff_x20[0x13] = in_stack_000000a8;
            unaff_x20[0x12] = in_stack_000000a0;
            unaff_x20[0x15] = in_stack_000000b8;
            unaff_x20[0x14] = in_stack_000000b0;
            unaff_x20[0x17] = uVar12;
            unaff_x20[0x16] = uVar11;
            unaff_x20[9] = in_stack_00000058;
            unaff_x20[8] = in_stack_00000050;
            unaff_x20[0xb] = in_stack_00000068;
            unaff_x20[10] = in_stack_00000060;
            unaff_x20[0xd] = in_stack_00000078;
            unaff_x20[0xc] = in_stack_00000070;
            unaff_x20[0xf] = in_stack_00000088;
            unaff_x20[0xe] = in_stack_00000080;
            func_0x002219a8();
            return;
          }
          lVar3 = *unaff_x19;
          lVar10 = unaff_x19[3];
          lVar2 = unaff_x19[2];
          unaff_x20[2] = unaff_x19[1];
          unaff_x20[1] = lVar3;
          unaff_x20[4] = lVar10;
          unaff_x20[3] = lVar2;
          lVar3 = unaff_x19[4];
          unaff_x20[6] = unaff_x19[5];
          unaff_x20[5] = lVar3;
          unaff_x20[7] = unaff_x19[6];
          *unaff_x20 = 0x8000000000000001;
          return;
        }
        uVar5 = *(undefined8 *)(unaff_x28 + 0x18);
        uVar6 = *(undefined8 *)(unaff_x28 + 0x30);
        uVar7 = *(undefined8 *)(unaff_x28 + 0x28);
        *(undefined8 *)(unaff_x23 + 0x1c8) = *(undefined8 *)(unaff_x28 + 0x20);
        *(undefined8 *)(unaff_x23 + 0x1c0) = uVar5;
        *(undefined8 *)(unaff_x23 + 0x1d8) = uVar6;
        *(undefined8 *)(unaff_x23 + 0x1d0) = uVar7;
        lVar3 = in_stack_00000238;
        unaff_x25 = in_stack_00000248;
        unaff_x26 = in_stack_00000240;
      }
      else {
        uVar5 = *(undefined8 *)(unaff_x28 + 0x18);
        uVar6 = *(undefined8 *)(unaff_x28 + 0x30);
        uVar7 = *(undefined8 *)(unaff_x28 + 0x28);
        *(undefined8 *)(unaff_x23 + 0x1c8) = *(undefined8 *)(unaff_x28 + 0x20);
        *(undefined8 *)(unaff_x23 + 0x1c0) = uVar5;
        *(undefined8 *)(unaff_x23 + 0x1d8) = uVar6;
        *(undefined8 *)(unaff_x23 + 0x1d0) = uVar7;
        lVar3 = in_stack_00000238;
        unaff_x25 = in_stack_00000248;
        unaff_x26 = in_stack_00000240;
      }
    }
  }
  else {
    uVar5 = *(undefined8 *)(unaff_x28 + 0x18);
    uVar6 = *(undefined8 *)(unaff_x28 + 0x30);
    uVar7 = *(undefined8 *)(unaff_x28 + 0x28);
    *(undefined8 *)(unaff_x23 + 0x1c8) = *(undefined8 *)(unaff_x28 + 0x20);
    *(undefined8 *)(unaff_x23 + 0x1c0) = uVar5;
    *(undefined8 *)(unaff_x23 + 0x1d8) = uVar6;
    *(undefined8 *)(unaff_x23 + 0x1d0) = uVar7;
    lVar3 = in_stack_00000238;
    unaff_x25 = in_stack_00000248;
    unaff_x26 = in_stack_00000240;
  }
code_r0x0025fd2c:
  uVar5 = *(undefined8 *)(unaff_x23 + 0x1c0);
  uVar6 = *(undefined8 *)(unaff_x23 + 0x1d8);
  uVar7 = *(undefined8 *)(unaff_x23 + 0x1d0);
  *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x1c8);
  *(undefined8 *)(unaff_x23 + 0xe0) = uVar5;
  *(undefined8 *)(unaff_x23 + 0xf8) = uVar6;
  *(undefined8 *)(unaff_x23 + 0xf0) = uVar7;
  unaff_x20[5] = *(undefined8 *)(unaff_x23 + 0x1c8);
  unaff_x20[4] = uVar5;
  unaff_x20[7] = uVar6;
  unaff_x20[6] = uVar7;
  unaff_x20[2] = unaff_x26;
  unaff_x20[3] = unaff_x25;
  *unaff_x20 = 0x8000000000000001;
  unaff_x20[1] = lVar3;
  lVar3 = *unaff_x19;
  if (unaff_x24 + -1 < lVar3) {
    if ((((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
        (lVar2 = unaff_x19[4], lVar2 != -0x8000000000000000)) && (lVar2 != 0)) {
      func_0x00187bd4(unaff_x19[5],lVar2,1);
    }
    lVar2 = unaff_x19[1];
    lVar10 = unaff_x19[2];
    if (lVar10 != 0) {
      puVar4 = (undefined8 *)(lVar2 + 8);
      do {
        if (puVar4[-1] != 0) {
          func_0x00187bd4(*puVar4,puVar4[-1],1);
        }
        puVar4 = puVar4 + 3;
        lVar10 = lVar10 + -1;
      } while (lVar10 != 0);
    }
    if (lVar3 != 0) {
      func_0x00187bd4(lVar2,lVar3 * 0x18,8);
    }
  }
  return;
}

