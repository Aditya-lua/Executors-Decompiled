
ulong FUN_00788a9c(long param_1,long param_2)

{
  int iVar1;
  ulong uVar2;
  
  if ((*(char *)(param_1 + 0x24) != *(char *)(param_2 + 0x24)) ||
     (*(int *)(param_1 + 0x20) != *(int *)(param_2 + 0x20))) {
    return 0;
  }
  uVar2 = func_0x0077e6f8(*(undefined8 *)(param_1 + 0x10),*(undefined8 *)(param_2 + 0x10));
  if ((int)uVar2 != 0) {
    iVar1 = func_0x0077e89c(*(undefined8 *)(param_1 + 0x28),*(undefined8 *)(param_2 + 0x28));
    if (iVar1 == 0) {
      iVar1 = func_0x0077e89c(*(undefined8 *)(param_1 + 0x30),*(undefined8 *)(param_2 + 0x30));
      return (ulong)(iVar1 == 0);
    }
    uVar2 = 0;
  }
  return uVar2;
}

