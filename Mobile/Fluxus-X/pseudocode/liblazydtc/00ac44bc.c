/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac44bc
 */

int FUN_00ac44bc(ulong *param_1,ulong *param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  
  iVar1 = strcmp((char *)param_1[1],(char *)param_2[1]);
  if (iVar1 == 0) {
    uVar2 = *param_1;
    if ((uVar2 == 0) || (uVar3 = *param_2, uVar3 == 0)) {
      iVar1 = 0;
    }
    else {
      iVar1 = -(uint)(uVar3 < uVar2);
      if (uVar2 < uVar3) {
        iVar1 = 1;
      }
    }
  }
  return iVar1;
}

