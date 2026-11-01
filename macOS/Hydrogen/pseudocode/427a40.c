
void FUN_00427a40(void)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  uint *puVar4;
  int *unaff_x19;
  long *unaff_x20;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined4 uStack0000000000000040;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  
  _close();
  unaff_x19[3] = -1;
  if (*unaff_x19 == 1) {
    uStack0000000000000040 = unaff_x19[1];
LAB_00427afc:
    unaff_x20[1] = in_stack_00000010;
    *unaff_x20 = in_stack_00000008;
    unaff_x20[3] = in_stack_00000020;
    unaff_x20[2] = in_stack_00000018;
    unaff_x20[5] = in_stack_00000030;
    unaff_x20[4] = in_stack_00000028;
    *(int *)(unaff_x20 + 6) = uStack0000000000000040;
  }
  else {
    uStack0000000000000040 = 0;
    iVar1 = unaff_x19[2];
    do {
      iVar3 = _waitpid(iVar1,&uStack0000000000000040,0);
      if (iVar3 != -1) {
        *unaff_x19 = 1;
        unaff_x19[1] = uStack0000000000000040;
        goto LAB_00427afc;
      }
      puVar4 = (uint *)___error();
      uVar2 = *puVar4;
    } while (uVar2 == 4);
    *unaff_x20 = -0x8000000000000000;
    unaff_x20[1] = (ulong)uVar2 << 0x20 | 2;
    if (in_stack_00000020 != 0) {
      func_0x00187bd4(in_stack_00000028,in_stack_00000020,1);
    }
    if (in_stack_00000008 != 0) {
      func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
    }
  }
  return;
}

