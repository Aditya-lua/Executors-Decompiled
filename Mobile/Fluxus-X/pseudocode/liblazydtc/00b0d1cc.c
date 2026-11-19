/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d1cc
 */

undefined8 FUN_00b0d1cc(undefined8 param_1,X509 *param_2,uint param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = X509_check_purpose(param_2,-1,0);
  if (((iVar1 == 1) && ((param_3 >> 2 & 1) == 0)) &&
     ((*(byte *)((long)&param_2[1].name + 1) >> 5 & 1) != 0)) {
    uVar2 = 1;
  }
  else {
    uVar2 = 3;
  }
  return uVar2;
}

