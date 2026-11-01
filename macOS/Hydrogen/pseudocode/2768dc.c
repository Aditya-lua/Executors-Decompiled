
void FUN_002768dc(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  long lVar1;
  undefined8 *puVar2;
  undefined *puVar3;
  undefined8 extraout_x8;
  long lVar4;
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  long lVar5;
  undefined1 auVar6 [16];
  
  lVar1 = func_0x00187bd0();
  if (lVar1 != 0) {
    _memcpy();
    *unaff_x20 = param_1;
    unaff_x20[1] = lVar1;
    unaff_x20[2] = unaff_x19;
    return;
  }
  puVar3 = &UNK_009ccac0;
  auVar6 = func_0x007a1f00(1);
  puVar2 = auVar6._0_8_;
  lVar1 = puVar2[1];
  lVar5 = puVar2[2];
  func_0x00276b64(extraout_x8,*puVar2,lVar1,lVar5,auVar6._8_8_,puVar3,param_4,param_5,0);
  if (lVar5 == 0) {
    return;
  }
  lVar4 = 0;
  do {
    *(undefined1 *)(lVar1 + lVar4) = 0;
    lVar4 = lVar4 + 1;
  } while (lVar5 != lVar4);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar5,1);
  return;
}

