
void FUN_006e5528(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  int iVar2;
  undefined8 *puVar3;
  
  iVar2 = (int)param_2;
  if (1 < iVar2) {
    if (*(ulong *)(*(long *)(param_1 + 0x18) + 0x40) <= *(ulong *)(*(long *)(param_1 + 0x18) + 0x48)
       ) {
      func_0x006efe90(param_1,1);
    }
    if ((*(byte *)(param_1 + 1) >> 2 & 1) != 0) {
      func_0x006f0ed4(param_1,param_1,param_1 + 0x68);
    }
    func_0x00702e38(param_1,param_2,
                    (int)((ulong)(*(long *)(param_1 + 8) - *(long *)(param_1 + 0x10)) >> 4) + -1);
    *(ulong *)(param_1 + 8) = *(long *)(param_1 + 8) + (ulong)(iVar2 - 1) * -0x10;
    return;
  }
  if (iVar2 != 0) {
    return;
  }
  if ((*(byte *)(param_1 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4(param_1,param_1,param_1 + 0x68);
  }
  puVar3 = *(undefined8 **)(param_1 + 8);
  uVar1 = func_0x006f6ef8(param_1,"",0);
  *puVar3 = uVar1;
  *(undefined4 *)((long)puVar3 + 0xc) = 5;
  *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + 0x10;
  return;
}

