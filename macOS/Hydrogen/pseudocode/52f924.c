
void FUN_0052f924(undefined1 *param_1)

{
  ulong uVar1;
  ulong uVar2;
  bool bVar3;
  long lVar4;
  long lVar5;
  char *pcVar6;
  undefined8 uVar7;
  ulong *puVar8;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000068;
  undefined *in_stack_00000070;
  undefined1 *puStack0000000000000078;
  undefined *puStack0000000000000080;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000a0;
  undefined8 *in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined *in_stack_000000b8;
  undefined8 in_stack_000000c0;
  
  puStack0000000000000080 = (undefined *)0x4;
  puStack0000000000000078 = param_1;
  func_0x0052f08c(&uStack0000000000000030,&uStack0000000000000068);
  if (*(long *)(in_stack_00000010 + 0x68) != 0) {
    uVar7 = *(undefined8 *)(in_stack_00000010 + 0x70);
    *(long *)(unaff_x29 + -0x78) = *(long *)(in_stack_00000010 + 0x68);
    *(undefined8 *)(unaff_x29 + -0x70) = uVar7;
    uStack0000000000000068 = (undefined *)(unaff_x29 + -0x78);
    in_stack_00000070 = &DAT_005243dc;
    uStack0000000000000098 = &UNK_009eb2b8;
    in_stack_000000a0 = 1;
    in_stack_000000b0 = 1;
    in_stack_000000b8 = (undefined *)0x0;
    in_stack_000000a8 = &uStack0000000000000068;
    func_0x0052f08c(&uStack0000000000000030,&uStack0000000000000098);
  }
  lVar4 = func_0x0051ad08(in_stack_00000018,10);
  bVar3 = lVar4 != 0;
  if (lVar4 != 0) {
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
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a8455,10,lVar4);
  }
  lVar5 = func_0x0051ad08(in_stack_00000018,0xb);
  if (lVar5 != 0) {
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
    if (lVar4 == 0) {
      if (uStack0000000000000030 == in_stack_00000040) {
        func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
      in_stack_00000040 = in_stack_00000040 + 1;
    }
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a8f00,8,lVar5);
    bVar3 = true;
  }
  lVar4 = func_0x0051ad08(in_stack_00000018,0xc);
  if (lVar4 != 0) {
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
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a845f,5,lVar4);
    bVar3 = true;
  }
  pcVar6 = (char *)func_0x0051ad08(in_stack_00000018,0xe);
  if ((pcVar6 != (char *)0x0) && (*pcVar6 == '\x05')) {
    if (!bVar3) {
      if (uStack0000000000000030 == in_stack_00000040) {
        func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
      in_stack_00000040 = in_stack_00000040 + 1;
    }
    if (*(long *)(pcVar6 + 0x18) != 0) {
      puVar8 = (ulong *)(*(long *)(pcVar6 + 0x10) + 0x10);
      lVar4 = *(long *)(pcVar6 + 0x18) * 0x18;
      do {
        uStack0000000000000068 = &UNK_009eb108;
        in_stack_00000070 = &DAT_00519924;
        puStack0000000000000078 = &uStack0000000000000020;
        puStack0000000000000080 = &DAT_00524310;
        uStack0000000000000098 = &UNK_009eb0c8;
        in_stack_000000a0 = 4;
        in_stack_000000b8 = &UNK_008a8468;
        in_stack_000000c0 = 3;
        in_stack_000000b0 = 2;
        in_stack_000000a8 = &uStack0000000000000068;
        func_0x0046849c(&uStack0000000000000030,&UNK_009eb098,&uStack0000000000000098);
        uVar1 = puVar8[-1];
        uVar2 = *puVar8;
        if ((ulong)(uStack0000000000000030 - in_stack_00000040) < uVar2) {
          func_0x007a5594(&uStack0000000000000030,in_stack_00000040,uVar2,1,1);
        }
        lVar5 = in_stack_00000040;
        _memcpy(in_stack_00000038 + in_stack_00000040,uVar1,uVar2);
        in_stack_00000040 = lVar5 + uVar2;
        puVar8 = puVar8 + 3;
        lVar4 = lVar4 + -0x18;
      } while (lVar4 != 0);
    }
  }
  pcVar6 = (char *)func_0x0051ad08(in_stack_00000018,0xf);
  if ((pcVar6 != (char *)0x0) && (*pcVar6 == '\x04')) {
    if ((ulong)(uStack0000000000000030 - in_stack_00000040) < 2) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,2,1,1);
    }
    *(undefined2 *)(in_stack_00000038 + in_stack_00000040) = 0xa0a;
    in_stack_00000040 = in_stack_00000040 + 2;
    uVar7 = *(undefined8 *)(pcVar6 + 0x10);
    uVar1 = *(ulong *)(pcVar6 + 0x18);
    if ((ulong)(uStack0000000000000030 - in_stack_00000040) < uVar1) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,uVar1,1,1);
    }
    lVar4 = in_stack_00000040;
    _memcpy(in_stack_00000038 + in_stack_00000040,uVar7,uVar1);
    in_stack_00000040 = lVar4 + uVar1;
  }
  if (*(long *)(in_stack_00000010 + 0x50) == -0x7fffffffffffffff) {
    if (uStack0000000000000030 == in_stack_00000040) {
      func_0x007a5594(&uStack0000000000000030,in_stack_00000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + in_stack_00000040) = 10;
    in_stack_00000040 = in_stack_00000040 + 1;
  }
  else {
    uVar7 = *(undefined8 *)(in_stack_00000010 + 0x60);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(in_stack_00000010 + 0x58);
    *(undefined8 *)(unaff_x29 + -0x70) = uVar7;
    *(long *)(unaff_x29 + -0x68) = unaff_x29 + -0x60;
    *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000000;
    uStack0000000000000068 = (undefined *)(unaff_x29 + -0x68);
    puStack0000000000000078 = (undefined1 *)(unaff_x29 + -0x78);
    in_stack_00000070 = &DAT_00524310;
    puStack0000000000000080 = &DAT_00519924;
    uStack0000000000000098 = &UNK_009eb660;
    in_stack_000000a0 = 4;
    in_stack_000000b8 = &UNK_008a8590;
    in_stack_000000c0 = 3;
    in_stack_000000a8 = &uStack0000000000000068;
    in_stack_000000b0 = 2;
    func_0x0046849c(&uStack0000000000000030,&UNK_009eb098,&uStack0000000000000098);
  }
  in_stack_00000008[1] = in_stack_00000038;
  *in_stack_00000008 = uStack0000000000000030;
  in_stack_00000008[2] = in_stack_00000040;
  return;
}

