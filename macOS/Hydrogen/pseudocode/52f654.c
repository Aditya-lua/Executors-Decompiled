
void FUN_0052f654(void)

{
  ulong uVar1;
  ulong uVar2;
  bool in_ZR;
  bool bVar3;
  char *pcVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  ulong *puVar8;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined uStack0000000000000050;
  undefined8 uStack0000000000000068;
  undefined *in_stack_00000070;
  undefined8 *in_stack_00000078;
  undefined *in_stack_00000080;
  undefined *in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  undefined *in_stack_000000a0;
  undefined8 *in_stack_000000a8;
  undefined *in_stack_000000b0;
  undefined *in_stack_000000b8;
  undefined *in_stack_000000c0;
  
  if (in_ZR) {
    pcVar4 = (char *)func_0x0051ad08(in_stack_00000018,1);
    if ((pcVar4 == (char *)0x0) || (*pcVar4 != '\x03')) {
LAB_0052fdd8:
                    /* WARNING: Could not recover jumptable at 0x0052fe04. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_0052fe08 +
                (ulong)(byte)(&UNK_008a837c)[*(byte *)(in_stack_00000010 + 0xdd)] * 4))();
      return;
    }
    func_0x005113c8(&uStack0000000000000030,&UNK_008a8bcd,0x33);
    if (*(long *)(pcVar4 + 0x18) != 0) {
      lVar6 = *(long *)(pcVar4 + 0x18) * 0x18;
      lVar7 = *(long *)(pcVar4 + 0x10);
      do {
        *(long *)(unaff_x29 + -0x78) = lVar7;
        uStack0000000000000098 = &UNK_009eb108;
        in_stack_000000a0 = &DAT_00519924;
        in_stack_000000a8 = &uStack0000000000000048;
        in_stack_000000b0 = &DAT_00524378;
        in_stack_000000c0 = &DAT_00510bfc;
        uStack0000000000000068 = &UNK_009eb590;
        in_stack_00000070 = (undefined *)0x4;
        in_stack_00000088 = &UNK_008a8ae0;
        in_stack_00000090 = 4;
        in_stack_00000080 = (undefined *)0x3;
        in_stack_00000078 = &uStack0000000000000098;
        in_stack_000000b8 = (undefined *)(unaff_x29 + -0x78);
        func_0x0046849c(&uStack0000000000000030,&UNK_009eb098,&uStack0000000000000068);
        lVar7 = lVar7 + 0x18;
        lVar6 = lVar6 + -0x18;
      } while (lVar6 != 0);
    }
  }
  else {
    pcVar4 = (char *)func_0x0051ad08(in_stack_00000018,0);
    if ((pcVar4 == (char *)0x0) || (*pcVar4 != '\x02')) goto LAB_0052fdd8;
    *(char **)(unaff_x29 + -0x78) = pcVar4 + 8;
    uStack0000000000000068 = &uStack0000000000000050;
    in_stack_00000070 = &DAT_00524378;
    in_stack_00000078 = (undefined8 *)(unaff_x29 + -0x78);
    in_stack_00000080 = &DAT_00510bfc;
    uStack0000000000000098 = &UNK_009eb5d0;
    in_stack_000000a0 = (undefined *)0x4;
    in_stack_000000b8 = &UNK_008a8590;
    in_stack_000000c0 = (undefined *)0x3;
    in_stack_000000a8 = &uStack0000000000000068;
    in_stack_000000b0 = (undefined *)0x2;
    func_0x0052f08c(&uStack0000000000000030,&uStack0000000000000098);
    uVar5 = func_0x0051ad08(in_stack_00000018,3);
    func_0x005308b0(&UNK_008a8c30,0xb,&uStack0000000000000030,uStack0000000000000048,uVar5);
  }
  lVar7 = func_0x0051ad08(in_stack_00000018,10);
  bVar3 = lVar7 != 0;
  if (lVar7 != 0) {
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a8455,10,lVar7);
  }
  lVar6 = func_0x0051ad08(in_stack_00000018,0xb);
  if (lVar6 != 0) {
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
    if (lVar7 == 0) {
      if (uStack0000000000000030 == in_stack_00000040) {
        func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
      in_stack_00000040 = in_stack_00000040 + 1;
    }
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a8f00,8,lVar6);
    bVar3 = true;
  }
  lVar7 = func_0x0051ad08(in_stack_00000018,0xc);
  if (lVar7 != 0) {
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
    if (!bVar3) {
      if (uStack0000000000000030 == in_stack_00000040) {
        func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
      in_stack_00000040 = in_stack_00000040 + 1;
    }
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a845f,5,lVar7);
    bVar3 = true;
  }
  pcVar4 = (char *)func_0x0051ad08(in_stack_00000018,0xe);
  if ((pcVar4 != (char *)0x0) && (*pcVar4 == '\x05')) {
    if (!bVar3) {
      if (uStack0000000000000030 == in_stack_00000040) {
        func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
      in_stack_00000040 = in_stack_00000040 + 1;
    }
    if (*(long *)(pcVar4 + 0x18) != 0) {
      puVar8 = (ulong *)(*(long *)(pcVar4 + 0x10) + 0x10);
      lVar7 = *(long *)(pcVar4 + 0x18) * 0x18;
      do {
        uStack0000000000000068 = &UNK_009eb108;
        in_stack_00000070 = &DAT_00519924;
        in_stack_00000078 = &uStack0000000000000020;
        in_stack_00000080 = &DAT_00524310;
        uStack0000000000000098 = &UNK_009eb0c8;
        in_stack_000000a0 = (undefined *)0x4;
        in_stack_000000b8 = &UNK_008a8468;
        in_stack_000000c0 = (undefined *)0x3;
        in_stack_000000b0 = (undefined *)0x2;
        in_stack_000000a8 = &uStack0000000000000068;
        func_0x0046849c(&uStack0000000000000030,&UNK_009eb098,&uStack0000000000000098);
        uVar1 = puVar8[-1];
        uVar2 = *puVar8;
        if ((ulong)(uStack0000000000000030 - in_stack_00000040) < uVar2) {
          func_0x007a5594(&uStack0000000000000030,in_stack_00000040,uVar2,1,1);
        }
        lVar6 = in_stack_00000040;
        _memcpy(in_stack_00000038 + in_stack_00000040,uVar1,uVar2);
        in_stack_00000040 = lVar6 + uVar2;
        puVar8 = puVar8 + 3;
        lVar7 = lVar7 + -0x18;
      } while (lVar7 != 0);
    }
  }
  pcVar4 = (char *)func_0x0051ad08(in_stack_00000018,0xf);
  if ((pcVar4 != (char *)0x0) && (*pcVar4 == '\x04')) {
    if ((ulong)(uStack0000000000000030 - in_stack_00000040) < 2) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,2,1,1);
    }
    *(undefined2 *)(in_stack_00000038 + in_stack_00000040) = 0xa0a;
    in_stack_00000040 = in_stack_00000040 + 2;
    uVar5 = *(undefined8 *)(pcVar4 + 0x10);
    uVar1 = *(ulong *)(pcVar4 + 0x18);
    if ((ulong)(uStack0000000000000030 - in_stack_00000040) < uVar1) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,uVar1,1,1);
    }
    lVar7 = in_stack_00000040;
    _memcpy(in_stack_00000038 + in_stack_00000040,uVar5,uVar1);
    in_stack_00000040 = lVar7 + uVar1;
  }
  if (*(long *)(in_stack_00000010 + 0x50) == -0x7fffffffffffffff) {
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
  }
  else {
    uVar5 = *(undefined8 *)(in_stack_00000010 + 0x60);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(in_stack_00000010 + 0x58);
    *(undefined8 *)(unaff_x29 + -0x70) = uVar5;
    *(long *)(unaff_x29 + -0x68) = unaff_x29 + -0x60;
    *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000000;
    uStack0000000000000068 = (undefined *)(unaff_x29 + -0x68);
    in_stack_00000078 = (undefined8 *)(unaff_x29 + -0x78);
    in_stack_00000070 = &DAT_00524310;
    in_stack_00000080 = &DAT_00519924;
    uStack0000000000000098 = &UNK_009eb660;
    in_stack_000000a0 = (undefined *)0x4;
    in_stack_000000b8 = &UNK_008a8590;
    in_stack_000000c0 = (undefined *)0x3;
    in_stack_000000a8 = &uStack0000000000000068;
    in_stack_000000b0 = (undefined *)0x2;
    func_0x0046849c(&uStack0000000000000030,&UNK_009eb098,&uStack0000000000000098);
  }
  in_stack_00000008[1] = in_stack_00000038;
  *in_stack_00000008 = uStack0000000000000030;
  in_stack_00000008[2] = in_stack_00000040;
  return;
}

