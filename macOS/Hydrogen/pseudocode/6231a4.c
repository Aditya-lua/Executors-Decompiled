
void FUN_006231a4(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long lVar4;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
  if (unaff_x23 == 1) {
                    /* WARNING: Could not recover jumptable at 0x006231e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*unaff_x19 + 0x58))();
    return;
  }
  func_0x005fdd18(&uStack0000000000000060);
  func_0x005fdd18(&uStack0000000000000030);
  if (0x60 < unaff_x24) {
    lVar4 = (unaff_x25 >> 1) + 1;
    do {
      func_0x00659964();
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
  }
  func_0x00659be4();
  while (uVar2 = func_0x005ffc7c(unaff_x20 + 0x30), (uVar2 & 1) == 0) {
    func_0x005ffccc(&uStack0000000000000030,param_3 + -0x30);
    func_0x00608f38(param_3 + -0x30,&uStack0000000000000060,&uStack0000000000000030,unaff_x20 + 0x30
                   );
    uVar3 = func_0x00604ce4();
    iVar1 = func_0x00609ec8(&uStack0000000000000060,uVar3);
    if (iVar1 == 0) {
      (**(code **)(*unaff_x19 + 0x48))();
    }
    else {
      (**(code **)(*unaff_x19 + 0x58))();
      (**(code **)(*unaff_x19 + 0x48))();
      uVar2 = in_stack_00000010;
      if (in_stack_00000018 <= in_stack_00000010) {
        uVar2 = in_stack_00000018;
      }
      if (in_stack_00000020 != 0) {
        if (uVar2 != 0) {
          do {
            *(undefined8 *)(in_stack_00000020 + -8 + uVar2 * 8) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
      }
    }
    func_0x00659e44();
    func_0x00659be4();
  }
  (**(code **)(*unaff_x19 + 0x58))();
  uStack0000000000000030 = &UNK_009f5d60;
  uVar2 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar2 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000060 = &UNK_009f5d60;
  uVar2 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar2 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

