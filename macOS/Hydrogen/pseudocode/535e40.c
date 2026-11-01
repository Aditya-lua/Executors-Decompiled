
bool FUN_00535e40(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  long lVar2;
  long in_x9;
  long unaff_x19;
  ulong uVar3;
  code *pcVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  long lStack0000000000000010;
  
  lStack0000000000000010 = in_x9 + 8;
  pcVar4 = *(code **)(param_1 + 0x38);
  uStack0000000000000000 = param_3;
  uStack0000000000000008 = param_4;
  do {
    lVar1 = func_0x00535738();
    if (lVar1 == 0) goto LAB_00535e90;
    lVar2 = (*pcVar4)();
  } while (lVar2 == 0);
  uVar3 = *(ulong *)(unaff_x19 + 0x18);
  if ((uVar3 & 3) == 1) {
    uVar5 = *(undefined8 *)(uVar3 - 1);
    puVar6 = *(undefined8 **)(uVar3 + 7);
    if ((code *)*puVar6 != (code *)0x0) {
      (*(code *)*puVar6)(uVar5);
    }
    if (puVar6[1] != 0) {
      func_0x00187bd4(uVar5,puVar6[1],puVar6[2]);
    }
    func_0x00187bd4((undefined8 *)(uVar3 - 1),0x18,8);
  }
  *(long *)(unaff_x19 + 0x18) = lVar2;
LAB_00535e90:
  return lVar1 != 0;
}

