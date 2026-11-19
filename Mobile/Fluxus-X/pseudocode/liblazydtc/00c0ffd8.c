/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0ffd8
 */

undefined8 FUN_00c0ffd8(long *param_1,void *param_2,size_t param_3)

{
  void *__s1;
  int iVar1;
  undefined8 uVar2;
  
  __s1 = (void *)*param_1;
  if (((ulong)(param_1[1] - (long)__s1) < param_3) ||
     (iVar1 = memcmp(__s1,param_2,param_3), iVar1 != 0)) {
    uVar2 = 0;
  }
  else {
    uVar2 = 1;
    *param_1 = (long)__s1 + param_3;
  }
  return uVar2;
}

