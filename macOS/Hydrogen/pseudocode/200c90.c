
/* WARNING: Removing unreachable block (ram,0x00200df4) */
/* WARNING: Removing unreachable block (ram,0x00200dfc) */

void FUN_00200c90(void)

{
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar1;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 uStack0000000000000010;
  undefined1 uStack00000000000000a8;
  undefined8 uStack00000000000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined1 uStack0000000000000130;
  undefined8 uStack0000000000000140;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000198;
  
  uVar3 = *(undefined8 *)(unaff_x19 + 0x480);
  unaff_x22[0xf] = *(undefined8 *)(unaff_x19 + 0x488);
  unaff_x22[0xe] = uVar3;
  uStack0000000000000140 = *(undefined8 *)(unaff_x19 + 0x490);
  func_0x001fe038(&uStack00000000000000c0,&uStack0000000000000010,&uStack0000000000000130,
                  unaff_x19 + 0x4b0,unaff_x19 + 0x498,&uStack00000000000000a8);
  uVar4 = in_stack_000000d0;
  uVar3 = in_stack_000000c8;
  if (uStack00000000000000c0 == unaff_x23) {
    if (*(long *)(unaff_x19 + 1000) == unaff_x23) {
      uVar1 = *(undefined8 *)(unaff_x19 + 0x3f0);
      puVar2 = *(undefined8 **)(unaff_x19 + 0x3f8);
      if ((code *)*puVar2 != (code *)0x0) {
        (*(code *)*puVar2)(uVar1);
      }
      if (puVar2[1] != 0) {
        func_0x00187bd4(uVar1,puVar2[1],puVar2[2]);
      }
    }
    else {
      func_0x00245b38(unaff_x19 + 1000);
    }
    *(long *)(unaff_x19 + 1000) = unaff_x23;
    *(undefined8 *)(unaff_x19 + 0x3f0) = uVar3;
    *(undefined8 *)(unaff_x19 + 0x3f8) = uVar4;
    _memcpy();
    func_0x001f8508(unaff_x19 + 0x498);
  }
  else {
    _memcpy(&uStack0000000000000130);
    func_0x0021f858(&uStack00000000000000f8,&uStack0000000000000130);
    in_stack_00000160 = in_stack_000000f0;
    in_stack_00000198 = in_stack_00000128;
    unaff_x22[0xf] = unaff_x22[1];
    unaff_x22[0xe] = *unaff_x22;
    unaff_x22[0x11] = unaff_x22[3];
    unaff_x22[0x10] = unaff_x22[2];
    unaff_x22[0x13] = unaff_x22[5];
    unaff_x22[0x12] = unaff_x22[4];
    unaff_x22[0x16] = in_stack_00000100;
    unaff_x22[0x15] = uStack00000000000000f8;
    unaff_x22[0x18] = in_stack_00000110;
    unaff_x22[0x17] = in_stack_00000108;
    unaff_x22[0x1a] = in_stack_00000120;
    unaff_x22[0x19] = in_stack_00000118;
    uVar1 = unaff_x22[0x13];
    uVar4 = unaff_x22[0x12];
    uVar3 = unaff_x22[0x14];
    unaff_x20[8] = unaff_x22[0x15];
    unaff_x20[7] = uVar3;
    uVar3 = unaff_x22[0x16];
    uVar6 = unaff_x22[0x19];
    uVar5 = unaff_x22[0x18];
    unaff_x20[10] = unaff_x22[0x17];
    unaff_x20[9] = uVar3;
    unaff_x20[0xc] = uVar6;
    unaff_x20[0xb] = uVar5;
    uVar3 = unaff_x22[0x1a];
    unaff_x20[0xe] = unaff_x22[0x1b];
    unaff_x20[0xd] = uVar3;
    uVar3 = unaff_x22[0xe];
    uVar6 = unaff_x22[0x11];
    uVar5 = unaff_x22[0x10];
    unaff_x20[2] = unaff_x22[0xf];
    unaff_x20[1] = uVar3;
    unaff_x20[4] = uVar6;
    unaff_x20[3] = uVar5;
    unaff_x20[6] = uVar1;
    unaff_x20[5] = uVar4;
    *unaff_x20 = 2;
    func_0x001f8508(unaff_x19 + 0x498);
  }
  return;
}

