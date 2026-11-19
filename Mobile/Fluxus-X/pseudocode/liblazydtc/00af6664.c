/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af6664
 */

int X509v3_addr_get_range(uint *param_1,int param_2,long param_3,long param_4,int param_5)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  iVar1 = 4;
  if (param_2 != 1) {
    iVar1 = (uint)(param_2 == 2) << 4;
  }
  if ((((param_5 < iVar1) || (param_1 == (uint *)0x0)) || (param_3 == 0)) ||
     (((param_4 == 0 || (iVar1 == 0)) || (1 < *param_1)))) {
    iVar3 = 0;
  }
  else {
    iVar2 = FUN_00af66d8(param_1,param_3,param_4,iVar1);
    iVar3 = 0;
    if (iVar2 != 0) {
      iVar3 = iVar1;
    }
  }
  return iVar3;
}

