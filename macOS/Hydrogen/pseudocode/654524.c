
undefined8 * FUN_00654524(undefined8 *param_1,long param_2,undefined4 param_3,undefined4 param_4)

{
  long lVar1;
  long lVar2;
  undefined4 uVar3;
  long lVar4;
  code *pcVar5;
  long lVar6;
  undefined8 uVar7;
  undefined4 unaff_w20;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  long unaff_x29;
  
  param_1[1] = 0;
  *param_1 = &UNK_009f6678;
  param_1[2] = 0;
  param_1[3] = 0;
  lVar2 = *(long *)(param_2 + 8);
  lVar4 = *(long *)(param_2 + 0x10) - lVar2;
  if (lVar4 != 0) {
    if (lVar4 < 0) {
      func_0x00017f90(param_1 + 1);
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x6545c8);
      (*pcVar5)();
    }
    lVar6 = __Znwm(lVar4);
    param_1[1] = lVar6;
    param_1[2] = lVar6;
    lVar1 = lVar6 + (lVar4 >> 2) * 4;
    param_1[3] = lVar1;
    _memcpy(lVar6,lVar2,lVar4);
    param_1[2] = lVar1;
  }
  uVar3 = *(undefined4 *)(unaff_x29 + 0x18);
  uVar7 = *(undefined8 *)(unaff_x29 + 0x10);
  param_1[4] = unaff_x25;
  param_1[5] = unaff_x24;
  param_1[6] = unaff_x23;
  param_1[7] = uVar7;
  *(undefined4 *)(param_1 + 8) = uVar3;
  *(undefined4 *)((long)param_1 + 0x44) = 0;
  *(undefined4 *)(param_1 + 9) = 0;
  *(undefined4 *)((long)param_1 + 0x4c) = param_3;
  *(undefined4 *)(param_1 + 10) = param_4;
  *(undefined4 *)((long)param_1 + 0x54) = unaff_w20;
  return param_1;
}

