/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945a18
 */

void FUN_00945a18(long *param_1,long param_2,long param_3)

{
  undefined2 uVar1;
  ulong uVar2;
  uint uVar3;
  
  uVar2 = *(ulong *)(param_2 + 0x1f0);
  *param_1 = param_3;
  *(undefined4 *)(param_1 + 1) = 0;
  param_1[2] = 0;
  *(undefined2 *)(param_1 + 3) = 0;
  uVar1 = *(undefined2 *)(param_3 + 0x38);
  *(undefined2 *)((long)param_1 + 0x1c) = 0;
  *(undefined2 *)((long)param_1 + 0x1a) = uVar1;
  *(byte *)((long)param_1 + 0x1e) = *(byte *)((long)param_1 + 0x1e) & 0xf8 | 1;
  if (uVar2 != 1) {
    uVar3 = 0;
    if ((uVar2 & 1) != 0) {
      uVar3 = 3;
    }
    uVar3 = uVar3 | ((uint)(uVar2 >> 1) & 1) << 3 | ((uint)(uVar2 >> 3) & 1) << 6;
    if ((uVar2 & 0x40) != 0) {
      uVar3 = uVar3 | 0x180;
    }
    uVar3 = uVar3 & 0xffffffe0 | uVar3 & 0x1f | ((uint)(uVar2 >> 2) & 1) << 4;
    if (uVar3 != 0) {
      *(short *)((long)param_1 + 0x1a) = (short)uVar3;
    }
  }
  return;
}

