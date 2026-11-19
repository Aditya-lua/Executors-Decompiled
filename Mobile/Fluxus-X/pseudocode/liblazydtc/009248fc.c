/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009248fc
 */

void FUN_009248fc(long *param_1,ulong param_2)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  ulong uVar4;
  
  while ((param_2 != 0 && (lVar2 = *param_1, lVar2 != 0))) {
    plVar3 = (long *)(lVar2 + 0x10);
    uVar4 = *(long *)(lVar2 + 0x18) - *plVar3;
    if (uVar4 != 0) {
      if (param_2 <= uVar4) {
        uVar4 = param_2;
      }
      lVar1 = uVar4 + *plVar3;
      *plVar3 = lVar1;
      if (lVar1 == *(long *)(lVar2 + 0x18)) {
        *plVar3 = 0;
        *(undefined8 *)(lVar2 + 0x18) = 0;
      }
    }
    param_2 = param_2 - uVar4;
    FUN_009246cc(param_1);
  }
  return;
}

