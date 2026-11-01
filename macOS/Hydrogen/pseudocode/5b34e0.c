
/* WARNING: Possible PIC construction at 0x005ae3b0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae858: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005ae85c) */
/* WARNING: Removing unreachable block (ram,0x005ae864) */
/* WARNING: Removing unreachable block (ram,0x005ae870) */
/* WARNING: Removing unreachable block (ram,0x005ae87c) */
/* WARNING: Removing unreachable block (ram,0x005ae894) */
/* WARNING: Removing unreachable block (ram,0x005ae8bc) */
/* WARNING: Removing unreachable block (ram,0x005ae89c) */
/* WARNING: Removing unreachable block (ram,0x005ae884) */

void FUN_005b34e0(long *param_1,long *param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined *puVar6;
  long lVar7;
  long unaff_x29;
  undefined *unaff_x30;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  undefined8 uStack0000000000000080;
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
  undefined8 uStack0000000000000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined1 uStack0000000000000160;
  
  switch(param_2[3]) {
  case 0xc:
    puVar6 = &UNK_008b0993;
    goto code_r0x005b376c;
  case 0xd:
    lVar4 = param_2[4];
    lVar7 = param_2[7];
    lVar3 = param_2[6];
    param_1[1] = param_2[5];
    *param_1 = lVar4;
    param_1[3] = lVar7;
    param_1[2] = lVar3;
    break;
  case 0xe:
    param_1[1] = (long)&UNK_008af1ae;
    param_1[2] = 0x2b;
    *param_1 = -0x8000000000000000;
    puVar1 = &uStack0000000000000120;
    unaff_x29 = (long)register0x00000008 + 0x150;
    lVar3 = param_2[10];
    func_0x005adc80(lVar3);
    lVar4 = 0x40;
    uVar5 = 8;
    unaff_x30 = &UNK_005ae85c;
    goto code_r0x00187bd4;
  case 0xf:
    puVar6 = &UNK_008b09b9;
    lVar4 = 0x27;
    goto code_r0x005b36ec;
  case 0x10:
    in_stack_00000048 = param_2[0xd];
    uStack0000000000000040 = (long *)param_2[0xc];
    param_1[1] = (long)&UNK_008b09e0;
    param_1[2] = 0x23;
    *param_1 = -0x8000000000000000;
    func_0x005ae0f0();
    break;
  case 0x11:
    param_1[1] = (long)&UNK_008b0a03;
    param_1[2] = 0x25;
    *param_1 = -0x8000000000000000;
    lVar4 = *param_2;
    goto joined_r0x005b379c;
  case 0x12:
    param_1[1] = (long)&UNK_008b0a28;
    param_1[2] = 0x26;
    *param_1 = -0x8000000000000000;
    lVar4 = *param_2;
    goto joined_r0x005b379c;
  case 0x13:
    uStack0000000000000040 = (long *)param_2[0xc];
    param_1[1] = (long)&UNK_008b0a4e;
    param_1[2] = 0x26;
    *param_1 = -0x8000000000000000;
    func_0x005adc80();
    goto code_r0x005b3968;
  case 0x14:
    uStack0000000000000040 = (long *)param_2[0xc];
    param_1[1] = (long)&UNK_008b0a74;
    param_1[2] = 0x27;
    *param_1 = -0x8000000000000000;
    func_0x005adc80();
code_r0x005b3968:
    lVar4 = *uStack0000000000000040;
    *uStack0000000000000040 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      func_0x005d2c74(&uStack0000000000000040);
    }
    break;
  default:
    _memcpy();
    param_1[1] = (long)&UNK_008b0a9b;
    param_1[2] = 0x2b;
    *param_1 = -0x8000000000000000;
    func_0x005aec78();
    func_0x005aec78(&uStack0000000000000058);
    func_0x005aec78(&uStack00000000000000b0);
    break;
  case 0x16:
    in_stack_000000a8 = param_2[0x19];
    in_stack_000000a0 = param_2[0x18];
    in_stack_000000b8 = param_2[0x1b];
    uStack00000000000000b0 = param_2[0x1a];
    in_stack_000000c8 = param_2[0x1d];
    in_stack_000000c0 = param_2[0x1c];
    in_stack_000000d0 = param_2[0x1e];
    in_stack_00000068 = param_2[0x11];
    in_stack_00000060 = param_2[0x10];
    in_stack_00000078 = param_2[0x13];
    in_stack_00000070 = param_2[0x12];
    in_stack_00000088 = param_2[0x15];
    uStack0000000000000080 = param_2[0x14];
    in_stack_00000098 = param_2[0x17];
    in_stack_00000090 = param_2[0x16];
    in_stack_00000048 = param_2[0xd];
    uStack0000000000000040 = (long *)param_2[0xc];
    uStack0000000000000058 = param_2[0xf];
    in_stack_00000050 = param_2[0xe];
    param_1[1] = (long)&UNK_008b0ac6;
    param_1[2] = 0x2b;
    *param_1 = -0x8000000000000000;
    func_0x005aec78(&uStack0000000000000080);
    func_0x005adc80();
    func_0x005adc80(&uStack0000000000000040);
    break;
  case 0x17:
    in_stack_000000a8 = param_2[0x19];
    in_stack_000000a0 = param_2[0x18];
    in_stack_000000b8 = param_2[0x1b];
    uStack00000000000000b0 = param_2[0x1a];
    in_stack_000000c8 = param_2[0x1d];
    in_stack_000000c0 = param_2[0x1c];
    in_stack_00000068 = param_2[0x11];
    in_stack_00000060 = param_2[0x10];
    in_stack_00000078 = param_2[0x13];
    in_stack_00000070 = param_2[0x12];
    in_stack_00000088 = param_2[0x15];
    uStack0000000000000080 = param_2[0x14];
    in_stack_00000098 = param_2[0x17];
    in_stack_00000090 = param_2[0x16];
    in_stack_00000048 = param_2[0xd];
    uStack0000000000000040 = (long *)param_2[0xc];
    uStack0000000000000058 = param_2[0xf];
    in_stack_00000050 = param_2[0xe];
    param_1[1] = (long)&UNK_008b0af1;
    param_1[2] = 0x2b;
    *param_1 = -0x8000000000000000;
    func_0x005ae72c();
    break;
  case 0x18:
    puVar6 = &UNK_008b0b1c;
    lVar4 = 0x2f;
code_r0x005b36ec:
    param_1[1] = (long)puVar6;
    param_1[2] = lVar4;
    *param_1 = -0x8000000000000000;
    puVar1 = (undefined8 *)&uStack0000000000000160;
    lVar3 = param_2[5];
    lVar4 = param_2[6] + 1;
    lVar7 = lVar3;
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x0059cd8c(lVar7);
      lVar7 = lVar7 + 0x18;
    }
    if (param_2[4] == 0) {
      lVar3 = param_2[8];
      lVar4 = param_2[9] + 1;
      lVar7 = lVar3;
      while (lVar4 = lVar4 + -1, lVar4 != 0) {
        func_0x0059ce88(lVar7);
        lVar7 = lVar7 + 0x40;
      }
      if (param_2[7] == 0) {
        return;
      }
      lVar4 = param_2[7] << 6;
      uVar5 = 8;
    }
    else {
      lVar4 = param_2[4] * 0x18;
      uVar5 = 8;
      unaff_x30 = &UNK_005ae3b4;
      puVar1 = &uStack0000000000000120;
      unaff_x29 = (long)register0x00000008 + 0x150;
    }
    goto code_r0x00187bd4;
  case 0x19:
    in_stack_00000068 = param_2[0x11];
    in_stack_00000060 = param_2[0x10];
    in_stack_00000078 = param_2[0x13];
    in_stack_00000070 = param_2[0x12];
    in_stack_00000088 = param_2[0x15];
    uStack0000000000000080 = param_2[0x14];
    in_stack_00000090 = param_2[0x16];
    in_stack_00000048 = param_2[0xd];
    uStack0000000000000040 = (long *)param_2[0xc];
    uStack0000000000000058 = param_2[0xf];
    in_stack_00000050 = param_2[0xe];
    param_1[1] = (long)&UNK_008b0b4b;
    param_1[2] = 0x2f;
    *param_1 = -0x8000000000000000;
    func_0x005aeb9c();
    break;
  case 0x1a:
    param_1[1] = (long)&UNK_008b0b7a;
    param_1[2] = 0x2b;
    *param_1 = -0x8000000000000000;
    func_0x005ae550();
    break;
  case 0x1b:
    param_1[1] = (long)&UNK_008b0ba5;
    param_1[2] = 0x27;
    *param_1 = -0x8000000000000000;
    lVar3 = param_2[1];
    lVar4 = param_2[2] + 1;
    lVar7 = lVar3;
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x0059ce88(lVar7);
      lVar7 = lVar7 + 0x40;
    }
    if (*param_2 == 0) {
      return;
    }
    lVar4 = *param_2 << 6;
    goto code_r0x005b39f0;
  case 0x1c:
    puVar6 = &UNK_008b0bcc;
    lVar4 = 0x29;
    goto code_r0x005b3770;
  case 0x1d:
    puVar6 = &UNK_008b0bf5;
code_r0x005b376c:
    lVar4 = 0x26;
code_r0x005b3770:
    param_1[1] = (long)puVar6;
    param_1[2] = lVar4;
    *param_1 = -0x8000000000000000;
    break;
  case 0x1e:
    param_1[1] = (long)&UNK_008b0c1b;
    param_1[2] = 0x26;
    *param_1 = -0x8000000000000000;
    lVar3 = param_2[1];
    if (param_2[2] != 0) {
      lVar4 = 0;
      lVar7 = 1 - param_2[2];
      do {
        lVar2 = **(long **)(lVar3 + lVar4);
        **(long **)(lVar3 + lVar4) = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          func_0x005d2ac4(lVar3 + lVar4);
        }
        lVar4 = lVar4 + 8;
        lVar7 = lVar7 + 1;
      } while (lVar7 != 1);
    }
    if (*param_2 == 0) {
      return;
    }
    lVar4 = *param_2 << 3;
code_r0x005b39f0:
    uVar5 = 8;
    goto code_r0x005b39f8;
  case 0x1f:
    in_stack_00000048 = param_2[0xd];
    uStack0000000000000040 = (long *)param_2[0xc];
    uStack0000000000000058 = param_2[0xf];
    in_stack_00000050 = param_2[0xe];
    in_stack_00000060 = param_2[0x10];
    param_1[1] = (long)&UNK_008b0c41;
    param_1[2] = 0x28;
    *param_1 = -0x8000000000000000;
    func_0x005aea88();
    break;
  case 0x20:
    param_1[1] = (long)&UNK_008b0c69;
    param_1[2] = 0x28;
    *param_1 = -0x8000000000000000;
    lVar4 = *param_2;
joined_r0x005b379c:
    if (lVar4 != 0) {
      lVar3 = param_2[1];
      uVar5 = 1;
code_r0x005b39f8:
      puVar1 = (undefined8 *)&uStack0000000000000160;
code_r0x00187bd4:
      *(long *)((long)puVar1 + -0x10) = unaff_x29;
      *(undefined **)((long)puVar1 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar3,lVar4,uVar5);
      return;
    }
  }
  return;
}

