
void FUN_0062b748(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  int iVar2;
  long *plVar3;
  ulong uVar4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long lVar5;
  long *unaff_x24;
  long unaff_x25;
  long unaff_x29;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  while( true ) {
    func_0x00677180(unaff_x20,param_2);
    plVar3 = (long *)(*(long *)(unaff_x29 + -0x70) + unaff_x19 * unaff_x22);
    uVar4 = plVar3[1] - *plVar3;
    if (0x20 < uVar4) {
      iVar2 = (int)(uVar4 >> 5);
      if (2 < iVar2) {
        lVar5 = (ulong)(iVar2 - 2) + 1;
        do {
          (**(code **)(*unaff_x24 + 0x48))();
          (**(code **)(*unaff_x24 + 0x48))();
          lVar5 = lVar5 + -1;
        } while (1 < lVar5);
      }
      (**(code **)(*unaff_x24 + 0x48))();
      (**(code **)(*unaff_x24 + 0x38))();
      uVar1 = (**(code **)(*unaff_x24 + 0x20))();
      func_0x00677180(unaff_x20,uVar1);
    }
    unaff_x20 = unaff_x20 + 0x20;
    unaff_x19 = unaff_x19 + 1;
    if (unaff_x19 == unaff_x25) break;
    param_2 = *(long *)(*(long *)(unaff_x29 + -0x70) + unaff_x19 * unaff_x22 + 8) + -0x20;
  }
  uVar4 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar4 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    func_0x0064b344(unaff_x29 + -0x88);
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x88));
  }
  uStack0000000000000038 = unaff_x29 + -0x70;
  func_0x0064f2d8(&uStack0000000000000038);
  return;
}

