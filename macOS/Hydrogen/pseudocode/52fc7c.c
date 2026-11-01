
void FUN_0052fc7c(undefined8 param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  ulong uVar3;
  bool bVar4;
  char *pcVar5;
  char *pcVar6;
  long lVar7;
  long lVar8;
  ulong *puVar9;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined uStack0000000000000050;
  undefined uStack0000000000000058;
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
  long in_stack_000000c8;
  undefined *in_stack_000000d0;
  
  pcVar5 = (char *)func_0x0051ad08(param_1,1);
  pcVar6 = (char *)func_0x0051ad08(in_stack_00000018,5);
  if ((((pcVar5 == (char *)0x0) || (pcVar6 == (char *)0x0)) || (*pcVar5 != '\x02')) ||
     (*pcVar6 != '\x02')) {
                    /* WARNING: Could not recover jumptable at 0x0052fe04. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&UNK_0052fe08 + (ulong)(byte)(&UNK_008a837c)[*(byte *)(in_stack_00000010 + 0xdd)] * 4
              ))();
    return;
  }
  *(char **)(unaff_x29 + -0x60) = pcVar5 + 8;
  *(char **)(unaff_x29 + -0x78) = pcVar6 + 8;
  uStack0000000000000098 = &uStack0000000000000050;
  in_stack_000000a0 = &DAT_00524378;
  in_stack_000000a8 = (undefined8 *)(unaff_x29 + -0x78);
  in_stack_000000b0 = &DAT_00510bfc;
  in_stack_000000b8 = &uStack0000000000000058;
  in_stack_000000c0 = &DAT_00524378;
  in_stack_000000c8 = unaff_x29 + -0x60;
  in_stack_000000d0 = &DAT_00510bfc;
  uStack0000000000000068 = &UNK_009eb2c8;
  in_stack_00000070 = (undefined *)0x7;
  in_stack_00000088 = &UNK_008a8638;
  in_stack_00000090 = 6;
  in_stack_00000078 = &uStack0000000000000098;
  in_stack_00000080 = (undefined *)0x4;
  func_0x0052f08c(&uStack0000000000000030,&uStack0000000000000068);
  lVar7 = func_0x0051ad08(in_stack_00000018,10);
  bVar4 = lVar7 != 0;
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
  lVar8 = func_0x0051ad08(in_stack_00000018,0xb);
  if (lVar8 != 0) {
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
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a8f00,8,lVar8);
    bVar4 = true;
  }
  lVar7 = func_0x0051ad08(in_stack_00000018,0xc);
  if (lVar7 != 0) {
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
    if (!bVar4) {
      if (uStack0000000000000030 == in_stack_00000040) {
        func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
      in_stack_00000040 = in_stack_00000040 + 1;
    }
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a845f,5,lVar7);
    bVar4 = true;
  }
  pcVar5 = (char *)func_0x0051ad08(in_stack_00000018,0xe);
  if ((pcVar5 != (char *)0x0) && (*pcVar5 == '\x05')) {
    if (!bVar4) {
      if (uStack0000000000000030 == in_stack_00000040) {
        func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
      in_stack_00000040 = in_stack_00000040 + 1;
    }
    if (*(long *)(pcVar5 + 0x18) != 0) {
      puVar9 = (ulong *)(*(long *)(pcVar5 + 0x10) + 0x10);
      lVar7 = *(long *)(pcVar5 + 0x18) * 0x18;
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
        uVar1 = puVar9[-1];
        uVar3 = *puVar9;
        if ((ulong)(uStack0000000000000030 - in_stack_00000040) < uVar3) {
          func_0x007a5594(&uStack0000000000000030,in_stack_00000040,uVar3,1,1);
        }
        lVar8 = in_stack_00000040;
        _memcpy(in_stack_00000038 + in_stack_00000040,uVar1,uVar3);
        in_stack_00000040 = lVar8 + uVar3;
        puVar9 = puVar9 + 3;
        lVar7 = lVar7 + -0x18;
      } while (lVar7 != 0);
    }
  }
  pcVar5 = (char *)func_0x0051ad08(in_stack_00000018,0xf);
  if ((pcVar5 != (char *)0x0) && (*pcVar5 == '\x04')) {
    if ((ulong)(uStack0000000000000030 - in_stack_00000040) < 2) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,2,1,1);
    }
    *(undefined2 *)(in_stack_00000038 + in_stack_00000040) = 0xa0a;
    in_stack_00000040 = in_stack_00000040 + 2;
    uVar2 = *(undefined8 *)(pcVar5 + 0x10);
    uVar1 = *(ulong *)(pcVar5 + 0x18);
    if ((ulong)(uStack0000000000000030 - in_stack_00000040) < uVar1) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,uVar1,1,1);
    }
    lVar7 = in_stack_00000040;
    _memcpy(in_stack_00000038 + in_stack_00000040,uVar2,uVar1);
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
    uVar2 = *(undefined8 *)(in_stack_00000010 + 0x60);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(in_stack_00000010 + 0x58);
    *(undefined8 *)(unaff_x29 + -0x70) = uVar2;
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

