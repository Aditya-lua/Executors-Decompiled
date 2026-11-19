/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009168c8
 */

void FUN_009168c8(long *param_1)

{
  long *plVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  
  if (((param_1 != (long *)0x0) && (lVar3 = *param_1, lVar3 != 0)) &&
     (uVar2 = param_1[4], uVar2 != 0)) {
    uVar4 = 0;
    while( true ) {
      plVar1 = (long *)(lVar3 + uVar4 * 0x20);
      lVar3 = *plVar1;
      if (lVar3 != 0) {
        do {
          lVar5 = *(long *)(lVar3 + 0x10);
          FUN_00925d80(plVar1,lVar3,param_1);
          param_1[5] = param_1[5] + -1;
          lVar3 = lVar5;
        } while (lVar5 != 0);
        uVar2 = param_1[4];
      }
      uVar4 = uVar4 + 1;
      if (uVar2 <= uVar4) break;
      lVar3 = *param_1;
    }
  }
  return;
}

