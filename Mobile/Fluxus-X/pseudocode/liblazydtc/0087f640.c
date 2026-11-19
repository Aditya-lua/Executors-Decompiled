/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087f640
 */

bool FUN_0087f640(undefined8 *param_1,char *param_2,char *param_3)

{
  bool bVar1;
  int iVar2;
  
  bVar1 = false;
  if ((char *)*param_1 != (char *)0x0) {
    iVar2 = strcmp((char *)*param_1,param_2);
    if (iVar2 == 0) {
      bVar1 = false;
      if ((char *)param_1[1] != (char *)0x0) {
        iVar2 = strcmp((char *)param_1[1],param_3);
        bVar1 = iVar2 == 0;
      }
    }
    else {
      bVar1 = false;
    }
  }
  return bVar1;
}

