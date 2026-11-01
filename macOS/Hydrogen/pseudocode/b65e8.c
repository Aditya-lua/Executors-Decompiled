
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000b65e8(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  undefined8 unaff_d8;
  
  *(undefined8 *)(unaff_x19 + 8) = unaff_d8;
  *(undefined8 *)(unaff_x19 + 0x10) = param_1;
  *(char **)(unaff_x19 + 0x18) = "imgui.ini";
  *(char **)(unaff_x19 + 0x20) = "imgui_log.txt";
  _memset(unaff_x19 + 0xe8,0xff,0xa68);
  *(undefined8 *)(unaff_x19 + 0x28) = 0;
  *(undefined8 *)(unaff_x19 + 0x30) = 0;
  *(undefined4 *)(unaff_x19 + 0x38) = 0x3f800000;
  *(undefined1 *)(unaff_x19 + 0x3c) = 0;
  uVar3 = NEON_fmov(0x3f800000,4);
  *(undefined8 *)(unaff_x19 + 0x48) = uVar3;
  *(undefined8 *)(unaff_x19 + 0x68) = _UNK_0080c158;
  *(undefined2 *)(unaff_x19 + 0x51) = 0x101;
  *(undefined1 *)(unaff_x19 + 0x53) = 1;
  *(undefined2 *)(unaff_x19 + 0x55) = 0x100;
  uVar3 = _UNK_0080c2b0;
  *(undefined8 *)(unaff_x19 + 0x60) = _UNK_0080c2b8;
  *(undefined8 *)(unaff_x19 + 0x58) = uVar3;
  *(undefined1 *)(unaff_x19 + 0x72) = 0;
  *(undefined8 *)(unaff_x19 + 0x80) = 0;
  *(undefined8 *)(unaff_x19 + 0x78) = 0;
  *(undefined8 *)(unaff_x19 + 0x90) = 0;
  *(undefined8 *)(unaff_x19 + 0x88) = 0;
  *(undefined8 *)(unaff_x19 + 0x98) = 0;
  *(undefined2 *)(unaff_x19 + 0xc0) = 0x2e;
  *(undefined8 *)(unaff_x19 + 0xe38) = 0xff7fffffff7fffff;
  *(undefined8 *)(unaff_x19 + 0x3800) = 0xff7fffffff7fffff;
  _memset_pattern16(&UNK_00003888 + unaff_x19,&UNK_0080c390,0x14);
  auVar4 = NEON_fmov(0xbf800000,4);
  unaff_x20[1] = auVar4._8_8_;
  *unaff_x20 = auVar4._0_8_;
  *(undefined4 *)(&UNK_000038ac + unaff_x19) = 0xbf800000;
  lVar2 = -0x2980;
  do {
    lVar1 = unaff_x19 + lVar2;
    *(undefined8 *)(&UNK_000037e0 + lVar1) = unaff_d8;
    *(undefined8 *)(&UNK_000037f0 + lVar1) = unaff_d8;
    *(undefined8 *)(lVar1 + 0x3800) = unaff_d8;
    *(undefined8 *)(&UNK_00003810 + lVar1) = unaff_d8;
    lVar2 = lVar2 + 0x40;
  } while (lVar2 != 0);
  *(undefined8 *)(&UNK_000037e0 + unaff_x19) = unaff_d8;
  *(undefined8 *)(&UNK_000037f0 + unaff_x19) = unaff_d8;
  *(undefined2 *)((long)unaff_x20 + 0x2d) = 0xff01;
  *(undefined1 *)((long)unaff_x20 + 0x2f) = 1;
  return;
}

