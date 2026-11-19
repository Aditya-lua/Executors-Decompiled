/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00919984
 */

long FUN_00919984(long param_1,long param_2,undefined8 param_3,long param_4)

{
  int iVar1;
  long *plVar2;
  
  if (((*(byte *)(param_2 + 0x3a0) >> 5 & 1) == 0) || ((*(byte *)(param_1 + 0xa82) >> 3 & 1) == 0))
  {
    plVar2 = *(long **)(param_1 + 0x340);
  }
  else {
    plVar2 = *(long **)(param_1 + 0x6c0);
  }
  while( true ) {
    if (plVar2 == (long *)0x0) {
      return 0;
    }
    iVar1 = curl_strnequal(*plVar2,param_3,param_4);
    if ((iVar1 != 0) && ((*(byte *)(*plVar2 + param_4) & 0xfe) == 0x3a)) break;
    plVar2 = (long *)plVar2[1];
  }
  return *plVar2;
}

