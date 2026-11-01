
undefined8 *
FUN_00651f74(undefined8 *param_1,long param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5)

{
  long lVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  long lVar5;
  undefined4 unaff_w20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  
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
      pcVar4 = (code *)SoftwareBreakpoint(1,0x652010);
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
  param_1[4] = param_3;
  param_1[5] = param_4;
  param_1[6] = param_5;
  param_1[7] = unaff_x22;
  param_1[8] = unaff_x21;
  *(undefined4 *)(param_1 + 9) = unaff_w20;
  return param_1;
}

