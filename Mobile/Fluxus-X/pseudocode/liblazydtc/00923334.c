/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00923334
 */

undefined8
FUN_00923334(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,long param_6)

{
  undefined4 uVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  
  uVar1 = FUN_00963a64(param_3);
  plVar2 = (long *)FUN_009230d0(param_1,param_2,uVar1);
  if (plVar2 == (long *)0x0) {
    uVar3 = 0x1b;
  }
  else {
    uVar1 = FUN_00963a64(param_5);
    (**(code **)(*plVar2 + 8))(plVar2[1],param_4,uVar1);
    lVar4 = *plVar2;
    if (param_6 == 0) {
      param_6 = plVar2[2] + (ulong)*(uint *)(lVar4 + 0x18);
    }
    (**(code **)(lVar4 + 0x10))(param_6,plVar2[1]);
    (**(code **)(lVar4 + 8))(plVar2[2],param_6,*(undefined4 *)(lVar4 + 0x20));
    (**(code **)(lVar4 + 0x10))(param_6,plVar2[2]);
    (*(code *)PTR_free_00cc4678)(plVar2);
    uVar3 = 0;
  }
  return uVar3;
}

