/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ebcc
 */

undefined4 FUN_0090ebcc(long param_1,undefined8 *param_2)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  
  iVar1 = FUN_0090fa8c(*(undefined8 *)(param_1 + 0xda0));
  uVar2 = 0;
  if ((param_2 != (undefined8 *)0x0) && (iVar1 != 0)) {
    lVar3 = *(long *)(param_1 + 0xda0);
    uVar2 = FUN_00916af4(param_1,*(undefined4 *)(lVar3 + 0x40),*(undefined8 *)(lVar3 + 0x48));
    *(undefined8 *)(lVar3 + 0x48) = 0;
  }
  *(byte *)(param_1 + 0xdb8) = *(byte *)(param_1 + 0xdb8) | 1;
  if (param_2 != (undefined8 *)0x0) {
    *param_2 = *(undefined8 *)(param_1 + 0xd98);
  }
  if (*(long *)(param_1 + 0xd98) == 0) {
    uVar2 = FUN_0091829c(param_1);
  }
  FUN_0090ea5c(param_1 + 0xd90);
  if (*(long *)(param_1 + 0xd98) == 0) {
    FUN_00908c4c(*(undefined8 *)(param_1 + 0x20),1);
  }
  return uVar2;
}

