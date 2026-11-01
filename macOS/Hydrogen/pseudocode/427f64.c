
void FUN_00427f64(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  int *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined4 uStack0000000000000020;
  undefined4 uStack0000000000000024;
  undefined8 in_stack_00000028;
  
  *unaff_x20 = param_1;
  func_0x003f7c9c(unaff_x20 + 1);
  *(undefined8 *)(unaff_x19 + 6) = in_stack_00000018;
  *(undefined8 *)(unaff_x19 + 4) = uStack0000000000000010;
  *(undefined8 *)(unaff_x19 + 10) = in_stack_00000028;
  *(ulong *)(unaff_x19 + 8) = CONCAT44(uStack0000000000000024,uStack0000000000000020);
  *(long *)(unaff_x19 + 2) = *(long *)(unaff_x19 + 2) + 1;
  iVar1 = *unaff_x19;
  *unaff_x19 = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    uRam0000000000a3c008 = 0;
    _pthread_mutex_unlock(uRam0000000000a3c000);
  }
  lVar3 = lRam0000000000a3bff8;
  lVar2 = lRam0000000000a3bff0;
  if (lRam0000000000a3bff8 != 0) {
    uStack0000000000000010 = 0;
    in_stack_00000018 = 0x20000;
    uStack0000000000000020 = 4;
    _sigaltstack(&uStack0000000000000010,0);
    _munmap(lVar3 - lVar2,lVar2 + 0x20000);
  }
  return;
}

