
void FUN_000c91c0(void)

{
  undefined4 in_w8;
  undefined8 *puVar1;
  long lVar2;
  long unaff_x27;
  undefined1 *unaff_x28;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  
  *(undefined4 *)(&UNK_00003f78 + unaff_x27) = in_w8;
  if (unaff_x28[0xec] != '\0') {
    _bzero(unaff_x27 + 0xb58,0x29a);
    lVar2 = 0x298;
    uVar3 = NEON_fmov(0xbf800000,4);
    puVar1 = (undefined8 *)(unaff_x27 + 0xe98);
    do {
      *(undefined1 *)((long)puVar1 + -0x34) = 0;
      *(undefined1 *)((long)puVar1 + -0x24) = 0;
      *(undefined1 *)((long)puVar1 + -0x14) = 0;
      *(undefined1 *)((long)puVar1 + -4) = 0;
      puVar1[-6] = uVar3;
      puVar1[-4] = uVar3;
      puVar1[-2] = uVar3;
      *puVar1 = uVar3;
      lVar2 = lVar2 + -4;
      puVar1 = puVar1 + 8;
    } while (lVar2 != 0);
    *unaff_x28 = 0;
    *(undefined8 *)(&UNK_000037e8 + unaff_x27) = uVar3;
    unaff_x28[0x10] = 0;
    *(undefined8 *)(&UNK_000037f8 + unaff_x27) = uVar3;
    *(undefined8 *)(unaff_x27 + 0xe5c) = 0;
    *(undefined8 *)(unaff_x27 + 0xe40) = 0xff7fffffff7fffff;
    *(undefined4 *)(unaff_x27 + 0xe48) = 0;
    *(undefined1 *)(unaff_x27 + 0xe4c) = 0;
    _memset_pattern16(&UNK_00003890 + unaff_x27,&UNK_0080c390,0x14);
    auVar4 = NEON_fmov(0xbf800000,4);
    *(long *)(unaff_x28 + 200) = auVar4._8_8_;
    *(long *)(unaff_x28 + 0xc0) = auVar4._0_8_;
    *(undefined4 *)(&UNK_000038b4 + unaff_x27) = 0xbf800000;
    *(undefined8 *)(unaff_x27 + 0xe50) = 0;
    if (*(int *)(&UNK_000038dc + unaff_x27) < 0) {
      func_0x000c202c(&UNK_000038d8 + unaff_x27,0);
    }
    *(undefined4 *)(&UNK_000038d8 + unaff_x27) = 0;
  }
  return;
}

