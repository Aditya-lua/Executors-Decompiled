
void FUN_0045cd24(long *param_1,long param_2)

{
  long lVar1;
  ulong *puVar2;
  long unaff_x19;
  ulong uVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined1 auVar6 [16];
  
  uVar4 = *(undefined8 *)(param_2 + 8);
  if (unaff_x19 == 0) {
    lVar1 = 1;
  }
  else {
    lVar1 = func_0x00187bd0();
    if (lVar1 == 0) {
      auVar6 = func_0x007a1f00(1);
      puVar2 = auVar6._0_8_;
      uVar5 = 0;
      uVar4 = *(undefined8 *)(auVar6._8_8_ + 8);
      uVar3 = *(ulong *)(auVar6._8_8_ + 0x10);
      puVar2[2] = 0;
      if (*puVar2 < uVar3) {
        func_0x007a1e50(puVar2,0,uVar3);
        uVar5 = puVar2[2];
      }
      _memcpy(puVar2[1] + uVar5,uVar4,uVar3);
      puVar2[2] = uVar5 + uVar3;
      return;
    }
  }
  _memcpy(lVar1,uVar4);
  *param_1 = unaff_x19;
  param_1[1] = lVar1;
  param_1[2] = unaff_x19;
  return;
}

