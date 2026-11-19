/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008abbf0
 */

long FUN_008abbf0(long param_1,int *param_2)

{
  short sVar1;
  code *pcVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 8);
  if (lVar3 == 0) {
    lVar3 = 0;
  }
  else {
    if (param_2 != (int *)0x0) {
      sVar1 = *(short *)(lVar3 + 6);
      if (sVar1 == -0x8000) {
        pcVar2 = *(code **)(*(long *)(param_1 + 0x60) + 0x6a8);
        if (pcVar2 == (code *)0x0) {
          sVar1 = -1;
        }
        else {
          sVar1 = (*pcVar2)(param_1,lVar3 + 0x18,*(undefined4 *)(lVar3 + 0x14));
        }
        *(short *)(lVar3 + 6) = sVar1;
      }
      *param_2 = (int)sVar1;
    }
    lVar3 = lVar3 + 0x18;
  }
  return lVar3;
}

