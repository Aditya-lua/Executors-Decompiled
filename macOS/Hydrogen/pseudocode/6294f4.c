
void FUN_006294f4(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long *unaff_x20;
  long *unaff_x21;
  
  uVar1 = (**(code **)(param_1 + 0xa0))(param_3);
  uVar2 = (**(code **)(*unaff_x20 + 0x50))();
  uVar3 = (**(code **)(unaff_x20[1] + 0x68))(unaff_x20 + 1);
  (**(code **)(unaff_x21[0xc] + 0xa8))(unaff_x21 + 0xc,uVar1,uVar3);
  func_0x005ffccc(unaff_x21 + 0xf,uVar2);
  *(undefined4 *)(unaff_x21 + 0xe) = 0;
                    /* WARNING: Could not recover jumptable at 0x00629570. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x28))();
  return;
}

