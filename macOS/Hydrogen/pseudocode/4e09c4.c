
void FUN_004e09c4(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long *plVar5;
  undefined8 *puVar6;
  long lVar7;
  long unaff_x23;
  undefined1 auVar8 [16];
  
  if (unaff_x23 != 0) {
    param_3 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    func_0x00187bd4();
  }
  auVar8 = __Unwind_Resume(param_1);
  plVar5 = auVar8._0_8_;
  puVar4 = auVar8._8_8_;
  while (puVar6 = puVar4, puVar6 != param_3) {
    puVar4 = puVar6 + 3;
    if (*(char *)(puVar6 + 2) == '\x01') {
      uVar2 = *puVar6;
      uVar3 = puVar6[1];
      lVar7 = plVar5[2];
      if (lVar7 == *plVar5) {
        func_0x007a5594(plVar5,lVar7,1,8,0x10);
      }
      puVar1 = (undefined8 *)(plVar5[1] + lVar7 * 0x10);
      *puVar1 = uVar2;
      puVar1[1] = uVar3;
      plVar5[2] = lVar7 + 1;
    }
  }
  return;
}

