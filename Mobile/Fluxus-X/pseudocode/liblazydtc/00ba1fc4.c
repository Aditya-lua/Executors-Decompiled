/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba1fc4
 */

undefined8 FUN_00ba1fc4(undefined8 param_1,void *param_2,ulong param_3)

{
  size_t __n;
  int iVar1;
  
  if (param_3 != 0) {
    iVar1 = DAT_00cca4d8;
    do {
      __n = param_3;
      if (3 < param_3) {
        __n = 4;
      }
      iVar1 = iVar1 * 0x19660d + 0x3c6ef35f;
      DAT_00cca4d8 = iVar1;
      memcpy(param_2,&DAT_00cca4d8,__n);
      param_3 = param_3 - __n;
      param_2 = (void *)((long)param_2 + __n);
    } while (param_3 != 0);
  }
  return 0;
}

