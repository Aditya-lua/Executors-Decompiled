
void FUN_0020f7a4(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined1 uVar3;
  undefined *puVar4;
  long in_x9;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long *plVar5;
  long unaff_x24;
  int unaff_w25;
  long unaff_x26;
  int unaff_w27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  long lStack0000000000000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  undefined8 in_stack_000000f8;
  long in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  long in_stack_00000120;
  long in_stack_00000128;
  long in_stack_00000130;
  long in_stack_00000138;
  long in_stack_00000140;
  long in_stack_00000148;
  long in_stack_00000150;
  long in_stack_00000158;
  long in_stack_00000160;
  long in_stack_00000168;
  long in_stack_00000170;
  long in_stack_00000178;
  long in_stack_00000180;
  long in_stack_00000188;
  long in_stack_00000190;
  long in_stack_00000198;
  long in_stack_000001a0;
  long in_stack_000001a8;
  long in_stack_000001b0;
  long in_stack_000001b8;
  long in_stack_000001c0;
  long in_stack_000001c8;
  long in_stack_000001d0;
  long in_stack_000001d8;
  long in_stack_000001e0;
  long in_stack_000001e8;
  
  lStack0000000000000038 = param_1;
  if (param_1 == -0x8000000000000000) {
    if (unaff_w27 == 4) {
      uStack0000000000000000 = 0x8000000000000000;
    }
    else {
LAB_0020f7fc:
      uStack0000000000000000 = 0x8000000000000000;
      func_0x00207f98(param_2);
    }
LAB_0020f808:
    if ((*(byte *)(unaff_x22 + 0x339) & 1) == 0) {
LAB_0020f898:
      plVar5 = unaff_x19 + 4;
      lVar2 = *plVar5;
      if (lVar2 == -0x8000000000000000) {
        lVar1 = func_0x001ac37c(unaff_x20 + 0x20,0x19);
        if (lVar1 != 0) {
          uVar3 = 10;
          goto LAB_0020f8c4;
        }
        if (*(char *)(unaff_x22 + 0x33d) == '\x03') {
          *(undefined1 *)(unaff_x22 + 0x33d) = 0;
        }
        if ((*(byte *)((long)unaff_x19 + 0x1a) & 1) == 0) {
          in_stack_00000108 = unaff_x19[0x1c];
          in_stack_00000100 = unaff_x19[0x1b];
          in_stack_00000118 = unaff_x19[0x1e];
          in_stack_00000110 = unaff_x19[0x1d];
          in_stack_000001e0 = unaff_x19[0x37];
          in_stack_000001d8 = unaff_x19[0x36];
          in_stack_000001e8 = unaff_x19[0x38];
          in_stack_00000120 = unaff_x19[0x1f];
          in_stack_00000128 = unaff_x19[0x20];
          in_stack_000000b8 = unaff_x19[0x15];
          uStack00000000000000b0 = unaff_x19[0x14];
          in_stack_000000c8 = unaff_x19[0x17];
          in_stack_000000c0 = unaff_x19[0x16];
          in_stack_000000d8 = unaff_x19[0x19];
          in_stack_000000d0 = unaff_x19[0x18];
          in_stack_000001d0 = unaff_x19[0x35];
          in_stack_000000e0 = unaff_x19[0x1a];
          in_stack_00000138 = unaff_x19[0x22];
          in_stack_00000130 = unaff_x19[0x21];
          in_stack_00000148 = unaff_x19[0x24];
          in_stack_00000140 = unaff_x19[0x23];
          in_stack_00000178 = unaff_x19[0x2a];
          in_stack_00000170 = unaff_x19[0x29];
          in_stack_00000188 = unaff_x19[0x2c];
          in_stack_00000180 = unaff_x19[0x2b];
          in_stack_00000158 = unaff_x19[0x26];
          in_stack_00000150 = unaff_x19[0x25];
          in_stack_00000168 = unaff_x19[0x28];
          in_stack_00000160 = unaff_x19[0x27];
          in_stack_000001b8 = unaff_x19[0x32];
          in_stack_000001b0 = unaff_x19[0x31];
          in_stack_000001c8 = unaff_x19[0x34];
          in_stack_000001c0 = unaff_x19[0x33];
          in_stack_00000198 = unaff_x19[0x2e];
          in_stack_00000190 = unaff_x19[0x2d];
          in_stack_000001a8 = unaff_x19[0x30];
          in_stack_000001a0 = unaff_x19[0x2f];
          *(undefined8 *)(unaff_x26 + 0x40) = in_stack_00000008;
          *(undefined8 *)(unaff_x26 + 0x38) = uStack0000000000000000;
          in_stack_000000f8 = in_stack_00000010;
          lVar1 = func_0x0020a620(0x168);
          _memcpy(lVar1,&uStack00000000000000b0,0x168);
          puVar4 = &UNK_009c6730;
        }
        else {
          in_stack_00000108 = unaff_x19[0x1c];
          in_stack_00000100 = unaff_x19[0x1b];
          in_stack_00000118 = unaff_x19[0x1e];
          in_stack_00000110 = unaff_x19[0x1d];
          in_stack_000001e0 = unaff_x19[0x37];
          in_stack_000001d8 = unaff_x19[0x36];
          in_stack_000001e8 = unaff_x19[0x38];
          in_stack_00000120 = unaff_x19[0x1f];
          in_stack_00000128 = unaff_x19[0x20];
          in_stack_000000b8 = unaff_x19[0x15];
          uStack00000000000000b0 = unaff_x19[0x14];
          in_stack_000000c8 = unaff_x19[0x17];
          in_stack_000000c0 = unaff_x19[0x16];
          in_stack_000000d8 = unaff_x19[0x19];
          in_stack_000000d0 = unaff_x19[0x18];
          in_stack_000001d0 = unaff_x19[0x35];
          in_stack_000000e0 = unaff_x19[0x1a];
          in_stack_00000138 = unaff_x19[0x22];
          in_stack_00000130 = unaff_x19[0x21];
          in_stack_00000148 = unaff_x19[0x24];
          in_stack_00000140 = unaff_x19[0x23];
          in_stack_00000178 = unaff_x19[0x2a];
          in_stack_00000170 = unaff_x19[0x29];
          in_stack_00000188 = unaff_x19[0x2c];
          in_stack_00000180 = unaff_x19[0x2b];
          in_stack_00000158 = unaff_x19[0x26];
          in_stack_00000150 = unaff_x19[0x25];
          in_stack_00000168 = unaff_x19[0x28];
          in_stack_00000160 = unaff_x19[0x27];
          in_stack_000001b8 = unaff_x19[0x32];
          in_stack_000001b0 = unaff_x19[0x31];
          in_stack_000001c8 = unaff_x19[0x34];
          in_stack_000001c0 = unaff_x19[0x33];
          in_stack_00000198 = unaff_x19[0x2e];
          in_stack_00000190 = unaff_x19[0x2d];
          in_stack_000001a8 = unaff_x19[0x30];
          in_stack_000001a0 = unaff_x19[0x2f];
          *(undefined8 *)(unaff_x26 + 0x40) = in_stack_00000008;
          *(undefined8 *)(unaff_x26 + 0x38) = uStack0000000000000000;
          in_stack_000000f8 = in_stack_00000010;
          lVar1 = func_0x0020a620(0x168);
          _memcpy(lVar1,&uStack00000000000000b0,0x168);
          puVar4 = &UNK_009c6778;
        }
        unaff_x21[1] = lVar1;
        unaff_x21[2] = (long)puVar4;
        *unaff_x21 = unaff_x24;
      }
      else {
        in_stack_00000078 = unaff_x19[0xd];
        in_stack_00000070 = unaff_x19[0xc];
        in_stack_00000088 = unaff_x19[0xf];
        in_stack_00000080 = unaff_x19[0xe];
        in_stack_00000098 = unaff_x19[0x11];
        in_stack_00000090 = unaff_x19[0x10];
        in_stack_000000a8 = unaff_x19[0x13];
        in_stack_000000a0 = unaff_x19[0x12];
        lStack0000000000000038 = unaff_x19[5];
        uStack0000000000000030 = *plVar5;
        in_stack_00000048 = unaff_x19[7];
        in_stack_00000040 = unaff_x19[6];
        in_stack_00000058 = unaff_x19[9];
        in_stack_00000050 = unaff_x19[8];
        in_stack_00000068 = unaff_x19[0xb];
        in_stack_00000060 = unaff_x19[10];
        if ((*(byte *)(unaff_x22 + 0x334) & 1) != 0) {
          lVar1 = func_0x001ac37c(unaff_x20 + 0x20,0x19);
          if (lVar1 == 0) {
            *(undefined1 *)(unaff_x28 + 0x18) = 4;
            *(undefined1 *)(unaff_x22 + 0x334) = 0;
          }
          else {
            func_0x001fbee0(unaff_x28 + 0x10);
            if ((*(byte *)(unaff_x22 + 0x334) & 1) != 0) goto LAB_0020fa08;
          }
          func_0x00236e70(unaff_x19[0x23],unaff_x19 + 0x24);
        }
LAB_0020fa08:
        func_0x001a37dc(&uStack00000000000000b0,in_stack_00000050 + 0x10,&UNK_009c66d0);
        *(long *)(unaff_x29 + -0x78) = in_stack_000000b8;
        *(long *)(unaff_x29 + -0x80) = uStack00000000000000b0;
        *(long *)(unaff_x29 + -0x70) = in_stack_000000c0;
        func_0x0016e8dc(unaff_x22 + 0x2f0);
        uVar6 = *(undefined8 *)(unaff_x29 + -0x80);
        *(undefined8 *)(unaff_x22 + 0x2f8) = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)(unaff_x22 + 0x2f0) = uVar6;
        *(undefined8 *)(unaff_x22 + 0x300) = *(undefined8 *)(unaff_x29 + -0x70);
        *(undefined1 *)(unaff_x22 + 0x33d) = 2;
        in_stack_00000148 = unaff_x19[0x1c];
        in_stack_00000140 = unaff_x19[0x1b];
        in_stack_00000158 = unaff_x19[0x1e];
        in_stack_00000150 = unaff_x19[0x1d];
        in_stack_00000160 = unaff_x19[0x1f];
        in_stack_00000168 = unaff_x19[0x20];
        in_stack_000000b8 = unaff_x19[0x15];
        uStack00000000000000b0 = unaff_x19[0x14];
        in_stack_000000c8 = unaff_x19[0x17];
        in_stack_000000c0 = unaff_x19[0x16];
        in_stack_000000d8 = unaff_x19[0x19];
        in_stack_000000d0 = unaff_x19[0x18];
        in_stack_000000e0 = unaff_x19[0x1a];
        in_stack_000001b8 = unaff_x19[0x2a];
        in_stack_000001b0 = unaff_x19[0x29];
        in_stack_000001c8 = unaff_x19[0x2c];
        in_stack_000001c0 = unaff_x19[0x2b];
        in_stack_000001d8 = unaff_x19[0x2e];
        in_stack_000001d0 = unaff_x19[0x2d];
        in_stack_000001e8 = unaff_x19[0x30];
        in_stack_000001e0 = unaff_x19[0x2f];
        in_stack_00000178 = unaff_x19[0x22];
        in_stack_00000170 = unaff_x19[0x21];
        in_stack_00000188 = unaff_x19[0x24];
        in_stack_00000180 = unaff_x19[0x23];
        in_stack_00000198 = unaff_x19[0x26];
        in_stack_00000190 = unaff_x19[0x25];
        in_stack_000001a8 = unaff_x19[0x28];
        in_stack_000001a0 = unaff_x19[0x27];
        *(undefined8 *)(unaff_x26 + 0x40) = in_stack_00000008;
        *(undefined8 *)(unaff_x26 + 0x38) = uStack0000000000000000;
        in_stack_00000100 = unaff_x24 + -0x25;
        in_stack_000000f8 = in_stack_00000010;
        lVar1 = func_0x0020a620(0x1a8);
        _memcpy(lVar1,&uStack00000000000000b0,0x1a8);
        unaff_x21[1] = lVar1;
        unaff_x21[2] = (long)&UNK_009c66e8;
        *unaff_x21 = unaff_x24;
        func_0x002097e0(&uStack0000000000000030);
      }
      func_0x002087e4();
      if ((lVar2 == -0x8000000000000000) && (*plVar5 != -0x8000000000000000)) {
        func_0x002097e0(plVar5);
      }
      if (*unaff_x19 != 0) {
        func_0x00187bd4(unaff_x19[1],*unaff_x19 << 2,2);
      }
      goto code_r0x0020f44c;
    }
    func_0x001ac650(&uStack0000000000000018,unaff_x20 + 0x20);
    if (uStack0000000000000018 != -0x8000000000000000) {
      lVar2 = *(long *)(unaff_x22 + 0x130);
      if ((lVar2 != -0x8000000000000000) && (lVar2 != 0)) {
        func_0x00187bd4(*(undefined8 *)(unaff_x22 + 0x138),lVar2,1);
      }
      *(undefined8 *)(unaff_x22 + 0x138) = in_stack_00000020;
      *(long *)(unaff_x22 + 0x130) = uStack0000000000000018;
      *(undefined8 *)(unaff_x22 + 0x140) = in_stack_00000028;
      goto LAB_0020f898;
    }
    in_stack_00000168 = CONCAT62(in_stack_00000168._2_6_,4);
    uStack00000000000000b0 = -0x7fffffffffffffff;
    in_stack_000000b8 = CONCAT44(in_stack_000000b8._4_4_,unaff_w25 + -0x10000);
    func_0x00248ae4();
    *(undefined1 *)(unaff_x22 + 0x335) = 1;
    uVar3 = 0x21;
LAB_0020f8c4:
    *unaff_x21 = unaff_x24 + -0xd;
    *(undefined1 *)(unaff_x21 + 1) = uVar3;
    func_0x00207f98();
  }
  else {
    if ((unaff_w27 != 0) && (unaff_w27 != 3)) {
      if (unaff_w27 != 4) goto LAB_0020f7fc;
      uVar6 = *(undefined8 *)(in_x9 + 0x10);
      *(undefined8 *)(unaff_x26 + 0x10) = *(undefined8 *)(in_x9 + 0x18);
      *(undefined8 *)(unaff_x26 + 8) = uVar6;
      uStack00000000000000b0 = param_1;
      func_0x0020fe10(unaff_x29 + -0x80,&uStack00000000000000b0);
      in_stack_00000008 = *(undefined8 *)(unaff_x29 + -0x78);
      uStack0000000000000000 = *(undefined8 *)(unaff_x29 + -0x80);
      in_stack_00000010 = *(undefined8 *)(unaff_x29 + -0x70);
      goto LAB_0020f808;
    }
    in_stack_00000168 = CONCAT62(in_stack_00000168._2_6_,4);
    uStack00000000000000b0 = -0x7fffffffffffffff;
    in_stack_000000b8 = CONCAT44(in_stack_000000b8._4_4_,unaff_w25);
    func_0x00248ae4();
    *(undefined1 *)(unaff_x22 + 0x335) = 1;
    *unaff_x21 = unaff_x24 + -0xd;
    *(undefined1 *)(unaff_x21 + 1) = 0x4a;
    func_0x00208154(&uStack0000000000000030);
  }
  func_0x002087e4();
  func_0x00209bac();
code_r0x0020f44c:
  func_0x00187bd4();
  return;
}

