/* 7ff70c928760 FUN_7ff70c928760 */

undefined8 *
FUN_7ff70c928760(undefined8 *param_1,undefined8 *param_2,undefined1 *param_3,undefined1 *param_4,
                undefined8 param_5,undefined8 *param_6,uint param_7)

{
  undefined1 uVar1;
  code *pcVar2;
  undefined1 *puVar3;
  char cVar4;
  uint uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulonglong uVar8;
  uint uVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  undefined8 uStack_c8;
  undefined1 uStack_c0;
  undefined8 *puStack_b8;
  undefined8 *puStack_b0;
  longlong lStack_a8;
  undefined1 uStack_a0;
  undefined7 uStack_9f;
  undefined1 uStack_98;
  undefined7 uStack_97;
  undefined1 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined1 uStack_60;
  undefined8 *puStack_58;
  undefined8 *puStack_50;
  undefined8 uStack_48;
  undefined4 uVar12;
  
  uStack_48 = 0xfffffffffffffffe;
  uStack_c8 = 0;
  uStack_c0 = 0;
  uStack_88 = 0;
  uStack_80 = 0;
  uStack_78 = 0;
  uStack_70 = 0;
  uStack_68 = 0;
  uStack_60 = 0;
  puStack_b8 = (undefined8 *)0x0;
  puStack_b0 = (undefined8 *)0x0;
  lStack_a8 = 0;
  uStack_a0 = 0;
  uStack_9f = 0;
  uStack_98 = 0;
  uStack_97 = 0;
  uStack_90 = 0;
  uVar5 = 0;
  uVar9 = param_7;
  puStack_58 = param_1;
  while( true ) {
    puVar11 = param_3;
    cVar4 = FUN_7ff70c928a20(param_3,param_4,&uStack_c8,param_5,uVar5 | uVar9,param_3);
    uVar12 = (undefined4)((ulonglong)puVar11 >> 0x20);
    if (cVar4 == '\0') break;
    if ((param_7 & 0x800) == 0) {
      puVar3 = (undefined1 *)CONCAT71(uStack_97,uStack_98);
      for (puVar10 = (undefined1 *)CONCAT71(uStack_9f,uStack_a0); puVar10 != puVar3;
          puVar10 = puVar10 + 1) {
        while( true ) {
          uVar12 = (undefined4)((ulonglong)puVar11 >> 0x20);
          uVar1 = *puVar10;
          uVar8 = param_2[2];
          if ((ulonglong)param_2[3] <= uVar8) break;
          param_2[2] = uVar8 + 1;
          puVar6 = param_2;
          if (0xf < (ulonglong)param_2[3]) {
            puVar6 = (undefined8 *)*param_2;
          }
          *(undefined1 *)((longlong)puVar6 + uVar8) = uVar1;
          *(undefined1 *)((longlong)puVar6 + uVar8 + 1) = 0;
          puVar10 = puVar10 + 1;
          if (puVar10 == puVar3) goto LAB_7ff70c928876;
        }
        FUN_7ff70ca31d10(param_2,1);
        uVar12 = (undefined4)((ulonglong)puVar11 >> 0x20);
      }
    }
LAB_7ff70c928876:
    puVar6 = param_6;
    if (0xf < (ulonglong)param_6[3]) {
      puVar6 = (undefined8 *)*param_6;
    }
    if ((uVar9 & 0x400) == 0) {
      FUN_7ff70c92c840(&puStack_50,&uStack_c8,param_2,puVar6,param_6[2] + (longlong)puVar6,
                       CONCAT44(uVar12,uVar9));
    }
    else {
      FUN_7ff70c92c4a0(&puStack_50,&uStack_c8,param_2,puVar6,param_6[2] + (longlong)puVar6,
                       CONCAT44(uVar12,uVar9));
    }
    puVar6 = puStack_b8 + 1;
    if (puStack_b0 == puStack_b8) {
      puVar6 = &uStack_68;
    }
    param_3 = (undefined1 *)*puVar6;
    param_2 = puStack_50;
    if (((param_7 & 0x1000) != 0) || (param_3 == param_4)) break;
    puVar6 = puStack_b8;
    if (puStack_b0 == puStack_b8) {
      puVar6 = &uStack_70;
    }
    if ((undefined1 *)*puVar6 != param_3) {
      uVar9 = uVar9 | 0x100;
    }
    uVar5 = (uint)((undefined1 *)*puVar6 == param_3) << 0xd;
  }
  if ((param_7 & 0x800) == 0) {
    for (; param_3 != param_4; param_3 = param_3 + 1) {
      while( true ) {
        uVar1 = *param_3;
        uVar8 = param_2[2];
        if (uVar8 < (ulonglong)param_2[3]) break;
        FUN_7ff70ca31d10(param_2,1);
        param_3 = param_3 + 1;
        if (param_3 == param_4) goto LAB_7ff70c928986;
      }
      param_2[2] = uVar8 + 1;
      puVar6 = param_2;
      if (0xf < (ulonglong)param_2[3]) {
        puVar6 = (undefined8 *)*param_2;
      }
      *(undefined1 *)((longlong)puVar6 + uVar8) = uVar1;
      *(undefined1 *)((longlong)puVar6 + uVar8 + 1) = 0;
    }
  }
LAB_7ff70c928986:
  puVar6 = puStack_58;
  *puStack_58 = param_2;
  if (puStack_b8 != (undefined8 *)0x0) {
    uVar8 = lStack_a8 - (longlong)puStack_b8;
    puVar7 = puStack_b8;
    if (0xfff < uVar8) {
      puVar7 = (undefined8 *)puStack_b8[-1];
      if (0x1f < (ulonglong)((longlong)puStack_b8 + (-8 - (longlong)puVar7))) {
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar8 = uVar8 + 0x27;
    }
    thunk_FUN_7ff70ca90250(puVar7,uVar8);
  }
  return puVar6;
}


