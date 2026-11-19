/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5b40
 */

undefined8 check_in_list(undefined8 param_1,uint param_2,long param_3,ulong param_4,int param_5)

{
  int iVar1;
  ulong uVar2;
  
  if ((param_4 != 0) && (param_3 != 0)) {
    uVar2 = 0;
    do {
      if (((uint)*(ushort *)(param_3 + uVar2 * 2) == (param_2 & 0xffff)) &&
         ((param_5 == 0 || (iVar1 = tls_group_allowed(param_1,param_2,0x20006), iVar1 != 0)))) {
        return 1;
      }
      uVar2 = uVar2 + 1;
    } while (uVar2 < param_4);
  }
  return 0;
}

