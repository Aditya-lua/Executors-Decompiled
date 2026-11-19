/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946ee0
 */

long * FUN_00946ee0(long param_1,long param_2)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  long *plVar4;
  long lVar5;
  
  plVar4 = (long *)0x0;
  if (param_2 - 1U < 7) {
    lVar5 = 0;
    uVar3 = 0x3d2;
    do {
      uVar1 = FUN_009416e0(*(undefined1 *)(param_1 + lVar5));
      lVar5 = lVar5 + 1;
      uVar3 = uVar3 * 0x20 + (uVar1 & 0xff);
    } while (param_2 != lVar5);
    plVar4 = (long *)(&PTR_PTR_00c50448)[uVar3 % 0x43];
    if (((plVar4 == (long *)0x0) || (iVar2 = curl_strnequal(param_1,*plVar4,param_2), iVar2 == 0))
       || (*(char *)(*plVar4 + param_2) != '\0')) {
      plVar4 = (long *)0x0;
    }
  }
  return plVar4;
}

