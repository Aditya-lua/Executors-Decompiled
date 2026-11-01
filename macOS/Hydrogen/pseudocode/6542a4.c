
undefined8 *
FUN_006542a4(undefined8 *param_1,long param_2,undefined4 param_3,undefined4 param_4,
            undefined4 param_5,undefined4 param_6,undefined4 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  long lVar5;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined4 in_stack_00000078;
  
  param_1[1] = 0;
  *param_1 = &UNK_009f6678;
  param_1[2] = 0;
  param_1[3] = 0;
  lVar2 = *(long *)(param_2 + 8);
  lVar3 = *(long *)(param_2 + 0x10) - lVar2;
  if (lVar3 != 0) {
    if (lVar3 < 0) {
      func_0x00017f90(param_1 + 1);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x654364);
      (*pcVar4)();
    }
    lVar5 = __Znwm(lVar3);
    param_1[1] = lVar5;
    param_1[2] = lVar5;
    lVar1 = lVar5 + (lVar3 >> 2) * 4;
    param_1[3] = lVar1;
    _memcpy(lVar5,lVar2,lVar3);
    param_1[2] = lVar1;
  }
  param_1[4] = param_8;
  param_1[5] = in_stack_00000060;
  param_1[6] = in_stack_00000068;
  param_1[7] = in_stack_00000070;
  *(undefined4 *)(param_1 + 8) = in_stack_00000078;
  *(undefined4 *)((long)param_1 + 0x44) = param_3;
  *(undefined4 *)(param_1 + 9) = param_4;
  *(undefined4 *)((long)param_1 + 0x4c) = param_5;
  *(undefined4 *)(param_1 + 10) = param_6;
  *(undefined4 *)((long)param_1 + 0x54) = param_7;
  return param_1;
}

