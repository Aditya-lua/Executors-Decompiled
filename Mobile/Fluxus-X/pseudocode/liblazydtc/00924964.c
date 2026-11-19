/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924964
 */

long FUN_00924964(long param_1,ulong param_2,code *param_3,undefined8 param_4,undefined4 *param_5)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  undefined4 uVar4;
  
  *param_5 = 0x51;
  lVar2 = FUN_009244cc();
  if (lVar2 == 0) {
    if (*(ulong *)(param_1 + 0x20) < *(ulong *)(param_1 + 0x28)) {
      uVar4 = 0x1b;
      goto LAB_00924a00;
    }
  }
  else {
    uVar1 = *(long *)(lVar2 + 8) - *(long *)(lVar2 + 0x18);
    if (uVar1 != 0) {
      if (uVar1 <= param_2 || param_2 == 0) {
        param_2 = uVar1;
      }
      lVar3 = (*param_3)(param_4,lVar2 + *(long *)(lVar2 + 0x18) + 0x20,param_2,param_5);
      if (0 < lVar3) {
        *(long *)(lVar2 + 0x18) = *(long *)(lVar2 + 0x18) + lVar3;
        return lVar3;
      }
      if (lVar3 < 0) {
        return -1;
      }
      *param_5 = 0;
      return 0;
    }
  }
  uVar4 = 0x51;
LAB_00924a00:
  *param_5 = uVar4;
  return -1;
}

