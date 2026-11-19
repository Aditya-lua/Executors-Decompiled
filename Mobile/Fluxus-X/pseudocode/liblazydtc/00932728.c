/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932728
 */

undefined8 FUN_00932728(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(uint *)(param_1 + 0xd9) = *(uint *)(param_1 + 0xd9) & 0xfffbfd74 | 1;
  *(undefined8 *)(param_1 + 0x30) = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  uVar2 = FUN_009352f8(param_2);
  if ((int)uVar2 == 0) {
    lVar1 = param_1 + 0x68;
    if ((*(byte *)(param_1 + 0xdb) >> 1 & 1) == 0) {
      FUN_009242bc(lVar1,*(undefined4 *)(param_2 + 0x6e8),1,1);
      uVar2 = 0;
      *(uint *)(param_1 + 0xd9) = *(uint *)(param_1 + 0xd9) | 0x20000;
    }
    else {
      FUN_00924348(lVar1);
      uVar2 = 0;
      if (*(ulong *)(param_1 + 0x98) != (ulong)*(uint *)(param_2 + 0x6e8)) {
        FUN_009242d4(lVar1);
        FUN_009242bc(lVar1,*(undefined4 *)(param_2 + 0x6e8),1,1);
        uVar2 = 0;
      }
    }
  }
  return uVar2;
}

