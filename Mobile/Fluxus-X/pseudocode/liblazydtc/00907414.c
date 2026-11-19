/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907414
 */

undefined8 FUN_00907414(long param_1,long *param_2,undefined8 param_3,uint param_4)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = param_1;
  do {
    lVar1 = lVar2;
    lVar2 = *(long *)(lVar1 + 8);
    if (lVar2 == 0) {
      if ((param_4 & 1) == 0) {
        return 0;
      }
      uVar3 = 0;
      goto LAB_0090745c;
    }
  } while (lVar2 != param_1);
  uVar3 = 1;
  *(long *)(lVar1 + 8) = param_2[1];
  param_2[1] = 0;
LAB_0090745c:
  param_2[1] = 0;
  (**(code **)(*param_2 + 0x10))(param_2,param_3);
  (*(code *)PTR_free_00cc4678)(param_2);
  return uVar3;
}

