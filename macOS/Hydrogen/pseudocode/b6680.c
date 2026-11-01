
void FUN_000b6680(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined1 auVar3 [16];
  undefined8 unaff_d8;
  
  *(undefined8 *)(unaff_x19 + 0x3800) = param_2;
  _memset_pattern16(unaff_x19 + param_1,&UNK_0080c390,0x14);
  auVar3 = NEON_fmov(0xbf800000,4);
  unaff_x20[1] = auVar3._8_8_;
  *unaff_x20 = auVar3._0_8_;
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

