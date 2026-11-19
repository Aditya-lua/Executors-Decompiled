/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941e8c
 */

long FUN_00941e8c(long param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x340);
  while( true ) {
    if (plVar2 == (long *)0x0) {
      return 0;
    }
    iVar1 = curl_strnequal(*plVar2,param_2,param_3);
    if ((iVar1 != 0) && ((*(byte *)(*plVar2 + param_3) & 0xfe) == 0x3a)) break;
    plVar2 = (long *)plVar2[1];
  }
  return *plVar2;
}

