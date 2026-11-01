
undefined8
FUN_0036dd78(long *param_1,undefined8 *param_2,undefined8 param_3,code *param_4,code *param_5)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  int iVar4;
  long *plVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  
  *param_2 = 0;
  uVar3 = (*param_4)(param_1[5],param_3);
  uVar1 = param_1[2];
  uVar2 = 0;
  if (uVar1 != 0) {
    uVar2 = uVar3 / uVar1;
  }
  plVar5 = (long *)(param_1[1] + ((ulong)uVar3 - uVar2 * uVar1) * 8);
  puVar6 = (undefined8 *)*plVar5;
  if (puVar6 != (undefined8 *)0x0) {
    iVar4 = (*param_5)(param_1[4],*puVar6,param_3);
    if (iVar4 != 0) {
      do {
        puVar7 = puVar6;
        puVar6 = (undefined8 *)puVar7[1];
        if (puVar6 == (undefined8 *)0x0) {
          plVar5 = puVar7 + 1;
          goto LAB_0036de20;
        }
        iVar4 = (*param_5)(param_1[4],*puVar6,param_3);
      } while (iVar4 != 0);
      plVar5 = puVar7 + 1;
    }
    if ((undefined8 *)*plVar5 != (undefined8 *)0x0) {
      *param_2 = *(undefined8 *)*plVar5;
      *(undefined8 *)*plVar5 = param_3;
      return 1;
    }
  }
LAB_0036de20:
  puVar6 = (undefined8 *)func_0x0036e31c(0x18);
  if (puVar6 == (undefined8 *)0x0) {
    return 0;
  }
  *puVar6 = param_3;
  *(uint *)(puVar6 + 2) = uVar3;
  *plVar5 = (long)puVar6;
  *param_1 = *param_1 + 1;
  func_0x0036de68(param_1);
  return 1;
}

