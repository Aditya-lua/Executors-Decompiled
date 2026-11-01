
uint * FUN_00434164(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   undefined8 param_5)

{
  uint uVar1;
  int iVar2;
  uint *puVar3;
  undefined8 uVar4;
  ushort uVar5;
  undefined *puVar6;
  undefined4 in_w9;
  long lVar7;
  undefined2 uVar8;
  undefined4 extraout_w12;
  undefined8 extraout_x13;
  undefined4 extraout_w14;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined4 uStack0000000000000010;
  undefined8 uStack0000000000000014;
  undefined4 uStack000000000000001c;
  undefined4 in_stack_00000020;
  int aiStack_18 [2];
  
  *(undefined4 *)(unaff_x29 + -0x14) = in_w9;
  puVar3 = (uint *)_recvfrom(param_3,param_4,param_5,param_1,&uStack0000000000000008,
                             unaff_x29 + -0x14);
  if (puVar3 == (uint *)0xffffffffffffffff) {
    puVar3 = (uint *)___error();
    puVar6 = (undefined *)((ulong)*puVar3 << 0x20 | 2);
LAB_00434230:
    *unaff_x19 = puVar6;
    *(undefined2 *)(unaff_x19 + 1) = 2;
  }
  else {
    if (uStack0000000000000008._1_1_ == '\x1e') {
      if (*(uint *)(unaff_x29 + -0x14) < 0x1c) {
LAB_00434264:
        uVar4 = func_0x007a247c(&UNK_0088751b,0x35,&UNK_009dbc00);
        aiStack_18[0] = 0;
        aiStack_18[1] = 4;
        iVar2 = _getsockopt(uVar4,0xffff,"rks/CoreFoundation.framework/Versions/A/CoreFoundation",
                            aiStack_18,aiStack_18 + 1);
        if (iVar2 == -1) {
          ___error();
          puVar3 = (uint *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          puVar3 = (uint *)0x0;
        }
        return puVar3;
      }
      uVar5 = uStack0000000000000008._2_2_ >> 8 | uStack0000000000000008._2_2_ << 8;
      lVar7 = (ulong)(uint)uStack0000000000000010 << 0x10;
      uVar8 = 1;
    }
    else {
      if (uStack0000000000000008._1_1_ != '\x02') {
        puVar6 = &UNK_009dbc18;
        goto LAB_00434230;
      }
      if (*(uint *)(unaff_x29 + -0x14) < 0x10) {
        func_0x007a247c(&UNK_008874bb,0x34,&UNK_009dbbe8);
        goto LAB_00434264;
      }
      uVar8 = 0;
      uVar1 = (uint)(uStack0000000000000008._2_2_ >> 8) |
              (uStack0000000000000008._2_2_ & 0xff00ff) << 8;
      uVar5 = (ushort)uVar1;
      lVar7 = CONCAT44(uVar1,uStack0000000000000008._4_4_);
      uStack0000000000000014 = extraout_x13;
      uStack000000000000001c = extraout_w14;
      in_stack_00000020 = extraout_w12;
    }
    *unaff_x19 = puVar3;
    *(undefined2 *)(unaff_x19 + 1) = uVar8;
    *(int *)((long)unaff_x19 + 10) = (int)lVar7;
    *(short *)((long)unaff_x19 + 0xe) = (short)((ulong)lVar7 >> 0x20);
    unaff_x19[2] = uStack0000000000000014;
    *(undefined4 *)(unaff_x19 + 3) = uStack000000000000001c;
    *(undefined4 *)((long)unaff_x19 + 0x1c) = uStack0000000000000008._4_4_;
    *(undefined4 *)(unaff_x19 + 4) = in_stack_00000020;
    *(ushort *)((long)unaff_x19 + 0x24) = uVar5;
  }
  return puVar3;
}

