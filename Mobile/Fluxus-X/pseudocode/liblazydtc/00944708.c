/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00944708
 */

undefined8
FUN_00944708(undefined8 param_1,long param_2,int *param_3,ulong param_4,undefined4 *param_5)

{
  int iVar1;
  undefined4 uVar2;
  
  if ((3 < param_4) && (*param_3 == 0x5252452d)) {
    uVar2 = 0x2d;
    goto LAB_009447a0;
  }
  if (*(int *)(param_2 + 0x4c8) == 2) {
    if ((param_4 != 0) && ((char)*param_3 == '.')) {
LAB_00944778:
      uVar2 = 0x2b;
      goto LAB_009447a0;
    }
  }
  else {
    if (param_4 < 3) {
      if (param_4 == 0) {
        return 0;
      }
    }
    else {
      iVar1 = memcmp(&DAT_002c708a,param_3,3);
      if (iVar1 == 0) goto LAB_00944778;
    }
    if ((char)*param_3 != '+') {
      return 0;
    }
  }
  uVar2 = 0x2a;
LAB_009447a0:
  *param_5 = uVar2;
  return 1;
}

