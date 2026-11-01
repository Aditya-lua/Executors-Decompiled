
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00119684(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 extraout_x1;
  undefined1 *puVar3;
  undefined1 *puVar4;
  undefined4 uVar5;
  long unaff_x20;
  long unaff_x23;
  undefined8 uVar6;
  int unaff_w24;
  int *unaff_x25;
  long unaff_x29;
  undefined4 extraout_s0;
  float fVar7;
  float unaff_s8;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000020;
  undefined4 uStack0000000000000028;
  float fStack000000000000002c;
  undefined1 uStack0000000000000030;
  undefined4 uStack0000000000000040;
  float fStack0000000000000044;
  float in_stack_00000048;
  undefined1 uStack0000000000000050;
  float fStack_18;
  undefined4 uStack_14;
  
  uVar6 = *(undefined8 *)(unaff_x23 + 0x2a8);
  uVar5 = 0x13;
  if (*unaff_x25 == unaff_w24) {
    uVar5 = 0x14;
  }
  uVar2 = func_0x000bba44(0x3f800000,uVar5);
  func_0x000f3bb0(*(undefined4 *)(&UNK_00003968 + unaff_x20),uVar6,&uStack0000000000000030,
                  param_1 + 8,uVar2,0);
  iVar1 = func_0x0010fdc0(&uStack0000000000000050,0x40);
  puVar4 = &uStack0000000000000050 + iVar1;
  fVar7 = fStack0000000000000044 + *(float *)(&UNK_00003928 + unaff_x20);
  uStack0000000000000028 = uStack0000000000000040;
  uStack0000000000000020 = _UNK_00813248;
  puVar3 = &uStack0000000000000050;
  uVar6 = 0;
  fStack000000000000002c = fVar7;
  func_0x000bca40(&uStack0000000000000028,in_stack_00000008,puVar3,puVar4,0,&uStack0000000000000020,
                  0);
  if (0.0 < unaff_s8) {
    fVar7 = fStack0000000000000044 + *(float *)(&UNK_00003928 + unaff_x20);
    puVar3 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    func_0x000bc130(in_stack_00000048 + *(float *)(&UNK_0000393c + unaff_x20));
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return;
  }
  uVar2 = ___stack_chk_fail();
  fStack_18 = fVar7;
  uStack_14 = extraout_s0;
  func_0x0011940c(uVar2,extraout_x1,8,puVar3,&uStack_14,&fStack_18,puVar4,uVar6);
  return;
}

