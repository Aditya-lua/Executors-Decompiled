/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00903188
 */

undefined8 FUN_00903188(long param_1,long param_2,undefined8 *param_3)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  
  lVar1 = FUN_00941d54(*param_3,param_3[1],*(undefined8 *)(param_2 + 0x3b8),
                       *(undefined8 *)(param_2 + 0x3c0));
  if (*(long *)(param_1 + 0xa38) < lVar1) {
    FUN_0092bb60(param_1,param_2);
    pcVar2 = *(code **)(*(long *)(param_2 + 0x3a8) + 0x78);
    if (pcVar2 == (code *)0x0) {
      FUN_00908288(param_1,param_2,0);
    }
    else {
      (*pcVar2)(param_1,param_2,2);
    }
    FUN_0092bab8(param_1);
    uVar3 = *param_3;
    *(undefined8 *)(param_2 + 0x3c0) = param_3[1];
    *(undefined8 *)(param_2 + 0x3b8) = uVar3;
  }
  return 0;
}

