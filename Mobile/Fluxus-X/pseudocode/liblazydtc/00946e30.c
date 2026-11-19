/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946e30
 */

long * FUN_00946e30(char *param_1)

{
  uint uVar1;
  int iVar2;
  size_t sVar3;
  uint uVar4;
  long *plVar5;
  size_t sVar6;
  
  sVar3 = strlen(param_1);
  plVar5 = (long *)0x0;
  if (sVar3 - 1 < 7) {
    sVar6 = 0;
    uVar4 = 0x3d2;
    do {
      uVar1 = FUN_009416e0(param_1[sVar6]);
      sVar6 = sVar6 + 1;
      uVar4 = uVar4 * 0x20 + (uVar1 & 0xff);
    } while (sVar3 != sVar6);
    plVar5 = (long *)(&PTR_PTR_00c50448)[uVar4 % 0x43];
    if (((plVar5 == (long *)0x0) || (iVar2 = curl_strnequal(param_1,*plVar5,sVar3), iVar2 == 0)) ||
       (*(char *)(*plVar5 + sVar3) != '\0')) {
      plVar5 = (long *)0x0;
    }
  }
  return plVar5;
}

