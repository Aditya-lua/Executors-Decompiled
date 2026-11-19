/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00825c7c
 */

undefined1  [16]
FUN_00825c7c(long *param_1,basic_string_conflict *param_2,undefined8 param_3,undefined8 *param_4)

{
  ulong uVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  
  plVar6 = param_1 + 1;
  plVar3 = (long *)*plVar6;
  if ((long *)*plVar6 == (long *)0x0) {
    plVar7 = plVar6;
  }
  else {
    do {
      while (plVar7 = plVar3,
            uVar1 = cpr::CaseInsensitiveCompare::operator()
                              ((CaseInsensitiveCompare *)(param_1 + 2),param_2,
                               (basic_string_conflict *)(plVar7 + 4)), (uVar1 & 1) != 0) {
        plVar3 = (long *)*plVar7;
        plVar6 = plVar7;
        if ((long *)*plVar7 == (long *)0x0) goto LAB_00825cf8;
      }
      uVar1 = cpr::CaseInsensitiveCompare::operator()
                        ((CaseInsensitiveCompare *)(param_1 + 2),
                         (basic_string_conflict *)(plVar7 + 4),param_2);
      if ((uVar1 & 1) == 0) {
        puVar2 = (undefined8 *)*plVar6;
        if (puVar2 != (undefined8 *)0x0) {
          uVar5 = 0;
          goto LAB_00825d60;
        }
        break;
      }
      plVar6 = plVar7 + 1;
      plVar3 = (long *)*plVar6;
    } while ((long *)*plVar6 != (long *)0x0);
  }
LAB_00825cf8:
  puVar2 = operator_new(0x50);
  param_4 = (undefined8 *)*param_4;
  uVar8 = *param_4;
  uVar5 = param_4[2];
  puVar2[5] = param_4[1];
  puVar2[4] = uVar8;
  puVar2[6] = uVar5;
  *param_4 = 0;
  param_4[1] = 0;
  param_4[2] = 0;
  plVar3 = (long *)*param_1;
  puVar2[8] = 0;
  puVar2[9] = 0;
  puVar2[7] = 0;
  *puVar2 = 0;
  puVar2[1] = 0;
  *plVar6 = (long)puVar2;
  lVar4 = *plVar3;
  puVar2[2] = plVar7;
  if (lVar4 != 0) {
    *param_1 = lVar4;
  }
  FUN_00825dfc(param_1[1],puVar2);
  uVar5 = 1;
  param_1[2] = param_1[2] + 1;
LAB_00825d60:
  auVar9._8_8_ = uVar5;
  auVar9._0_8_ = puVar2;
  return auVar9;
}

