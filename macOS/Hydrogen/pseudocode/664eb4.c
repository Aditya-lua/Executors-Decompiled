
long FUN_00664eb4(long param_1,long param_2)

{
  undefined8 uVar1;
  
  *(undefined1 *)(param_1 + 0xa0) = 0;
  uVar1 = (**(code **)(**(long **)(param_1 + 0x10) + 0x20))
                    (*(long **)(param_1 + 0x10),param_2 + 8,param_2 + 0x28);
  func_0x00677180(param_1 + 0x80,uVar1);
  func_0x00677180(param_1 + 0x60,param_2 + 8);
  return param_1 + 0x58;
}

