
void FUN_004e0bec(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined8 *puVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  
  auVar7 = __Unwind_Resume();
  lVar3 = auVar7._8_8_;
  plVar2 = auVar7._0_8_;
  do {
    if (lVar3 == param_3) {
      return;
    }
    while ((*(byte *)(lVar3 + 0x250) >> 1 & 1) != 0) {
      uVar5 = *(undefined8 *)(lVar3 + 0x218);
      uVar6 = *(undefined8 *)(lVar3 + 0x220);
      lVar4 = plVar2[2];
      if (lVar4 == *plVar2) {
        func_0x007a5594(plVar2,lVar4,1,8,0x10);
      }
      puVar1 = (undefined8 *)(plVar2[1] + lVar4 * 0x10);
      *puVar1 = uVar5;
      puVar1[1] = uVar6;
      plVar2[2] = lVar4 + 1;
      lVar3 = lVar3 + 600;
      if (lVar3 == param_3) {
        return;
      }
    }
    lVar3 = lVar3 + 600;
  } while( true );
}

