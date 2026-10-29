/* 7ff70c94bb80 FUN_7ff70c94bb80 */

ulonglong FUN_7ff70c94bb80(longlong param_1,undefined8 *param_2)

{
  undefined4 *puVar1;
  longlong lVar2;
  longlong *plVar3;
  code *UNRECOVERED_JUMPTABLE_00;
  ulonglong uVar4;
  uint uVar5;
  longlong *plVar6;
  ulonglong uVar7;
  uint uVar8;
  bool bVar9;
  undefined4 uStack_38;
  undefined4 uStack_34;
  undefined4 uStack_30;
  undefined4 uStack_2c;
  undefined1 auStack_28 [16];
  
  lVar2 = *(longlong *)(param_1 + 0x20);
  if (lVar2 != 0) {
    switch(*(undefined4 *)(param_1 + 0x58)) {
    case 3:
      if (*(char *)(*(longlong *)(param_1 + 0x20) + 0x2de) != '\0') {
        return 0;
      }
      lVar2 = *(longlong *)(param_1 + 0xd98);
      if (lVar2 == 0) {
        puVar1 = *(undefined4 **)(param_1 + 0xda0);
        FUN_7ff70c958630(auStack_28);
        uStack_38 = *puVar1;
        uStack_34 = puVar1[1];
        uStack_30 = puVar1[2];
        uStack_2c = puVar1[3];
        uVar4 = FUN_7ff70c9586d0(auStack_28,&uStack_38);
        uVar7 = 0;
        if ((longlong)uVar4 < 3) {
          uVar5 = 0;
        }
        else if (uVar4 < 0x33) {
          uVar5 = ((int)uVar4 * 0xab & 0xffffU) >> 9;
        }
        else {
          uVar5 = 200;
          if (uVar4 < 0xfb) {
            uVar5 = 0x32;
          }
        }
        FUN_7ff70c94a660(param_1,uVar5,1);
      }
      else {
        *param_2 = *(undefined8 *)(lVar2 + 0x38);
        *(longlong *)(lVar2 + 0x30) = param_1;
        uVar7 = 1;
      }
      return uVar7;
    case 4:
    case 5:
code_r0x7ff70c955250:
      plVar3 = *(longlong **)(*(longlong *)(param_1 + 0x20) + 0x1d8);
      do {
        plVar6 = plVar3;
        if (plVar6 == (longlong *)0x0) {
          return 0;
        }
        plVar3 = (longlong *)plVar6[1];
      } while ((plVar3 != (longlong *)0x0) && (*(char *)((longlong)plVar3 + 0x24) != '\x01'));
                    /* WARNING: Could not recover jumptable at 0x7ff70c955291. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (**(code **)(*plVar6 + 0x30))(plVar6,param_1,param_2,*(code **)(*plVar6 + 0x30));
      return uVar4;
    case 6:
    case 7:
      UNRECOVERED_JUMPTABLE_00 = *(code **)(*(longlong *)(lVar2 + 0x2e8) + 0x40);
      if (UNRECOVERED_JUMPTABLE_00 == (code *)0x0) goto code_r0x7ff70c955250;
      goto code_r0x7ff70c94bbd3;
    case 8:
    case 9:
      UNRECOVERED_JUMPTABLE_00 = *(code **)(*(longlong *)(lVar2 + 0x2e8) + 0x48);
      break;
    case 10:
      UNRECOVERED_JUMPTABLE_00 = *(code **)(*(longlong *)(lVar2 + 0x2e8) + 0x50);
      break;
    case 0xb:
    case 0xc:
      UNRECOVERED_JUMPTABLE_00 = *(code **)(*(longlong *)(lVar2 + 0x2e8) + 0x58);
      if (UNRECOVERED_JUMPTABLE_00 != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c994cd0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar4 = (*UNRECOVERED_JUMPTABLE_00)();
        return uVar4;
      }
      uVar5 = *(uint *)(param_1 + 0x154);
      uVar8 = uVar5 & 0x15;
      bVar9 = uVar8 == 1;
      if (bVar9) {
        *param_2 = *(undefined8 *)(lVar2 + 0x308);
        uVar5 = *(uint *)(param_1 + 0x154);
      }
      if ((uVar5 & 0x2a) == 2) {
        if ((uVar8 == 1) && (*(longlong *)(lVar2 + 0x308) == *(longlong *)(lVar2 + 0x310))) {
          return 0x10001;
        }
        param_2[uVar8 == 1] = *(longlong *)(lVar2 + 0x310);
        return (ulonglong)((uint)bVar9 | 1 << (uVar8 == 1 | 0x10));
      }
      return (ulonglong)bVar9;
    default:
      goto LAB_7ff70c94bbee;
    }
    if (UNRECOVERED_JUMPTABLE_00 != (code *)0x0) {
code_r0x7ff70c94bbd3:
                    /* WARNING: Could not recover jumptable at 0x7ff70c94bbd3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (*UNRECOVERED_JUMPTABLE_00)();
      return uVar4;
    }
  }
LAB_7ff70c94bbee:
  return 0;
}


