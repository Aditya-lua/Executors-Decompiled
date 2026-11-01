
void FUN_0052ff80(undefined8 param_1,long param_2)

{
  ulong uVar1;
  undefined8 uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  char *pcVar6;
  undefined1 unaff_w19;
  long unaff_x21;
  ulong unaff_x23;
  ulong *puVar7;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long lStack0000000000000040;
  undefined8 uStack0000000000000068;
  undefined *in_stack_00000070;
  undefined1 *in_stack_00000078;
  undefined *in_stack_00000080;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000a0;
  undefined8 *in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined *in_stack_000000b8;
  undefined8 in_stack_000000c0;
  
  lStack0000000000000040 = param_2 + 1;
  if (uStack0000000000000030 == lStack0000000000000040) {
    func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,1,1,1);
  }
  *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = unaff_w19;
  lStack0000000000000040 = lStack0000000000000040 + 1;
  func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a8455,10);
  lVar5 = func_0x0051ad08(in_stack_00000018,0xb);
  if (lVar5 != 0) {
    if (uStack0000000000000030 == lStack0000000000000040) {
      func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = 10;
    lStack0000000000000040 = lStack0000000000000040 + 1;
    if (unaff_x21 == 0) {
      if (uStack0000000000000030 == lStack0000000000000040) {
        func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = 10;
      lStack0000000000000040 = lStack0000000000000040 + 1;
    }
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a8f00,8,lVar5);
    unaff_x23 = 1;
  }
  lVar5 = func_0x0051ad08(in_stack_00000018,0xc);
  if (lVar5 != 0) {
    if (uStack0000000000000030 == lStack0000000000000040) {
      func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = 10;
    lStack0000000000000040 = lStack0000000000000040 + 1;
    if ((unaff_x23 & 1) == 0) {
      if (uStack0000000000000030 == lStack0000000000000040) {
        func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = 10;
      lStack0000000000000040 = lStack0000000000000040 + 1;
    }
    func_0x00530f60(&uStack0000000000000030,in_stack_00000010 + 0x78,&UNK_008a845f,5,lVar5);
    unaff_x23 = 1;
  }
  pcVar6 = (char *)func_0x0051ad08(in_stack_00000018,0xe);
  if ((pcVar6 != (char *)0x0) && (*pcVar6 == '\x05')) {
    if ((unaff_x23 & 1) == 0) {
      if (uStack0000000000000030 == lStack0000000000000040) {
        func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,1,1,1);
      }
      *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = 10;
      lStack0000000000000040 = lStack0000000000000040 + 1;
    }
    if (*(long *)(pcVar6 + 0x18) != 0) {
      puVar7 = (ulong *)(*(long *)(pcVar6 + 0x10) + 0x10);
      lVar5 = *(long *)(pcVar6 + 0x18) * 0x18;
      do {
        uStack0000000000000068 = &UNK_009eb108;
        in_stack_00000070 = &DAT_00519924;
        in_stack_00000078 = &uStack0000000000000020;
        in_stack_00000080 = &DAT_00524310;
        uStack0000000000000098 = &UNK_009eb0c8;
        in_stack_000000a0 = 4;
        in_stack_000000b8 = &UNK_008a8468;
        in_stack_000000c0 = 3;
        in_stack_000000b0 = 2;
        in_stack_000000a8 = &uStack0000000000000068;
        func_0x0046849c(&uStack0000000000000030,&UNK_009eb098,&uStack0000000000000098);
        uVar1 = puVar7[-1];
        uVar3 = *puVar7;
        if ((ulong)(uStack0000000000000030 - lStack0000000000000040) < uVar3) {
          func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,uVar3,1,1);
        }
        lVar4 = lStack0000000000000040;
        _memcpy(in_stack_00000038 + lStack0000000000000040,uVar1,uVar3);
        lStack0000000000000040 = lVar4 + uVar3;
        puVar7 = puVar7 + 3;
        lVar5 = lVar5 + -0x18;
      } while (lVar5 != 0);
    }
  }
  pcVar6 = (char *)func_0x0051ad08(in_stack_00000018,0xf);
  if ((pcVar6 != (char *)0x0) && (*pcVar6 == '\x04')) {
    if ((ulong)(uStack0000000000000030 - lStack0000000000000040) < 2) {
      func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,2,1,1);
    }
    *(undefined2 *)(in_stack_00000038 + lStack0000000000000040) = 0xa0a;
    lStack0000000000000040 = lStack0000000000000040 + 2;
    uVar2 = *(undefined8 *)(pcVar6 + 0x10);
    uVar1 = *(ulong *)(pcVar6 + 0x18);
    if ((ulong)(uStack0000000000000030 - lStack0000000000000040) < uVar1) {
      func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,uVar1,1,1);
    }
    lVar5 = lStack0000000000000040;
    _memcpy(in_stack_00000038 + lStack0000000000000040,uVar2,uVar1);
    lStack0000000000000040 = lVar5 + uVar1;
  }
  if (*(long *)(in_stack_00000010 + 0x50) == -0x7fffffffffffffff) {
    if (uStack0000000000000030 == lStack0000000000000040) {
      func_0x007a5594(&uStack0000000000000030,lStack0000000000000040,1,1,1);
    }
    *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = 10;
    lStack0000000000000040 = lStack0000000000000040 + 1;
  }
  else {
    uVar2 = *(undefined8 *)(in_stack_00000010 + 0x60);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(in_stack_00000010 + 0x58);
    *(undefined8 *)(unaff_x29 + -0x70) = uVar2;
    *(long *)(unaff_x29 + -0x68) = unaff_x29 + -0x60;
    *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000000;
    uStack0000000000000068 = (undefined *)(unaff_x29 + -0x68);
    in_stack_00000078 = (undefined1 *)(unaff_x29 + -0x78);
    in_stack_00000070 = &DAT_00524310;
    in_stack_00000080 = &DAT_00519924;
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
  in_stack_00000008[2] = lStack0000000000000040;
  return;
}

