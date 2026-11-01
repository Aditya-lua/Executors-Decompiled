
void FUN_00435df0(undefined4 *param_1,int param_2,undefined8 param_3,int param_4)

{
  undefined4 uVar1;
  undefined4 uVar2;
  int iVar3;
  uint *puVar4;
  undefined4 uVar5;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  
  if (param_2 < 2) {
    if (param_2 == 0) {
      param_1[1] = 0;
      goto LAB_00435f20;
    }
    uVar5 = 0x1000000;
    if (param_4 == 0) {
      uVar5 = 0x1000001;
    }
    do {
      iVar3 = _open("/dev/null",uVar5);
      if (iVar3 != -1) goto LAB_00435e40;
      puVar4 = (uint *)___error();
    } while (*puVar4 == 4);
    *(ulong *)(param_1 + 2) = (ulong)*puVar4 << 0x20 | 2;
  }
  else {
    if (param_2 != 2) {
      if ((param_2 == 3) && (2 < (uint)param_3)) {
        param_1[1] = 1;
        param_1[2] = (uint)param_3;
      }
      else {
        iVar3 = _fcntl(param_3,0x43);
        if (iVar3 == -1) {
          puVar4 = (uint *)___error();
          *(ulong *)(param_1 + 2) = (ulong)*puVar4 << 0x20 | 2;
          goto LAB_00435ee8;
        }
LAB_00435e40:
        param_1[1] = 2;
        param_1[2] = iVar3;
      }
LAB_00435f20:
      uVar5 = 0;
      param_1[3] = 0xffffffff;
      goto LAB_00435f28;
    }
    func_0x0042f6e4(&uStack0000000000000010);
    if (((uint)uStack0000000000000010 & 1) == 0) {
      uVar5 = 0;
      uVar1 = uStack0000000000000010._4_4_;
      uVar2 = (int)in_stack_00000018;
      if (param_4 == 0) {
        uVar1 = (int)in_stack_00000018;
        uVar2 = uStack0000000000000010._4_4_;
      }
      param_1[1] = 2;
      param_1[2] = uVar1;
      param_1[3] = uVar2;
      goto LAB_00435f28;
    }
    *(undefined8 *)(param_1 + 2) = in_stack_00000018;
  }
LAB_00435ee8:
  uVar5 = 1;
LAB_00435f28:
  *param_1 = uVar5;
  return;
}

