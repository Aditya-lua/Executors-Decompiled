
void FUN_0061621c(long param_1)

{
  uint uVar1;
  char cVar2;
  bool in_ZR;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  ulong uVar7;
  long in_x9;
  undefined8 unaff_x19;
  long unaff_x20;
  long *plVar8;
  int unaff_w21;
  uint unaff_w24;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  undefined4 uStack0000000000000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  long in_stack_00000070;
  undefined1 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  long *in_stack_00000088;
  char in_stack_00000090;
  
  uVar6 = uStack0000000000000040;
  lVar5 = in_x9 + 0x50c;
  if (in_ZR) {
    lVar5 = param_1;
  }
  plVar8 = *(long **)(unaff_x20 + 0x90);
  _uStack0000000000000078 = &UNK_008bb19c;
  func_0x006164a8(&uStack0000000000000080,"EncodingLookupArray",&uStack0000000000000078,0);
  cVar2 = in_stack_00000090;
  puVar3 = (undefined8 *)__Znwm(0x28);
  *(char *)(puVar3 + 2) = cVar2;
  *(undefined1 *)((long)puVar3 + 0x11) = 0;
  *puVar3 = &UNK_009f7ee8;
  puVar3[1] = "PaddingByte";
  *(undefined1 *)(puVar3 + 4) = 0x3d;
  puVar3[3] = in_stack_00000088;
  in_stack_00000088 = puVar3;
  in_stack_00000088 = (long *)__Znwm(0x28);
  if (unaff_w21 == 0) {
    uVar6 = 0x48;
  }
  *(char *)(in_stack_00000088 + 2) = cVar2;
  *(undefined1 *)((long)in_stack_00000088 + 0x11) = 0;
  uVar1 = 0;
  if ((unaff_w24 & 1) == 0) {
    uVar1 = uVar6;
  }
  *in_stack_00000088 = (long)&UNK_009f8b20;
  in_stack_00000088[1] = (long)"GroupSize";
  *(uint *)(in_stack_00000088 + 4) = uVar1;
  in_stack_00000088[3] = (long)puVar3;
  in_stack_00000068 = 0;
  in_stack_00000070 = 0;
  in_stack_00000060 = 0xffffffffffffffff;
  uStack0000000000000040 = uStack0000000000000040 & 0xffffff00;
  in_stack_00000048 = lVar5;
  in_stack_00000050 = (ulong)~unaff_w24 & 1;
  lVar4 = func_0x0003fcac(&uStack0000000000000080,"Separator",&uStack0000000000000040,cVar2 != '\0')
  ;
  in_stack_00000030 = 0;
  in_stack_00000038 = 0;
  in_stack_00000028 = 0xffffffffffffffff;
  uStack0000000000000008 = 0;
  in_stack_00000010 = lVar5;
  in_stack_00000018 = (ulong)~unaff_w24 & 1;
  lVar5 = func_0x0003fcac(lVar4,"Terminator",&uStack0000000000000008,*(undefined1 *)(lVar4 + 0x10));
  puVar3 = (undefined8 *)__Znwm(0x28);
  *(undefined2 *)(puVar3 + 2) = 1;
  *puVar3 = &UNK_009f8b20;
  puVar3[1] = "Log2Base";
  *(undefined4 *)(puVar3 + 4) = 6;
  puVar3[3] = *(undefined8 *)(lVar5 + 8);
  *(undefined8 **)(lVar5 + 8) = puVar3;
  *(undefined1 *)(lVar5 + 0x10) = 1;
  *(undefined **)(unaff_x29 + -0x68) = &UNK_009f6848;
  *(undefined8 *)(unaff_x29 + -0x60) = unaff_x19;
  *(long *)(unaff_x29 + -0x58) = lVar5;
  (**(code **)(*plVar8 + 0x70))(plVar8,unaff_x29 + -0x68,0xffffffff);
  uVar7 = in_stack_00000028;
  if (in_stack_00000030 <= in_stack_00000028) {
    uVar7 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined1 *)(in_stack_00000038 + -1 + uVar7) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  uVar7 = in_stack_00000060;
  if (in_stack_00000068 <= in_stack_00000060) {
    uVar7 = in_stack_00000068;
  }
  if (in_stack_00000070 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined1 *)(in_stack_00000070 + -1 + uVar7) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000080 = &UNK_009f6820;
  if (in_stack_00000088 != (long *)0x0) {
    (**(code **)(*in_stack_00000088 + 8))();
  }
  return;
}

