/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009450b4
 */

undefined8 FUN_009450b4(long param_1,long param_2,ulong param_3,ulong param_4)

{
  undefined4 uVar1;
  undefined4 uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  undefined1 auVar10 [16];
  
  lVar8 = *(long *)(param_1 + 0x20);
  uVar9 = (ulong)*(uint *)(param_1 + 0x2ec);
  uVar2 = *(undefined4 *)(lVar8 + 0x220);
  if (*(uint *)(param_1 + 0x2ec) == 0) {
    uVar9 = *(ulong *)(param_2 + 0x38);
  }
  auVar10 = FUN_00941cb8();
  lVar6 = FUN_00941d54(auVar10._0_8_,auVar10._8_8_,*(undefined8 *)(param_2 + 0x28),
                       *(undefined8 *)(param_2 + 0x30));
  uVar3 = *(uint *)(param_1 + 0x2e0);
  lVar6 = uVar9 - lVar6;
  if ((uVar3 != 0) && ((param_4 & 1) == 0)) {
    auVar10 = FUN_00941cb8();
    lVar8 = FUN_00941d54(auVar10._0_8_,auVar10._8_8_,*(undefined8 *)(lVar8 + 0x1f0),
                         *(undefined8 *)(lVar8 + 0x1f8));
    lVar8 = (ulong)uVar3 - lVar8;
    if (lVar8 <= lVar6) {
      lVar6 = lVar8;
    }
  }
  if (lVar6 < 1) {
    FUN_00904b80(param_1,"server response timeout");
    return 0x1c;
  }
  if (999 < lVar6) {
    lVar6 = 1000;
  }
  if ((param_3 & 1) == 0) {
    lVar6 = 0;
  }
  uVar9 = FUN_009078cc(param_1,0);
  if (((uVar9 & 1) == 0) && (*(long *)(param_2 + 0x80) == 0)) {
    lVar8 = *(long *)(param_2 + 0x18);
    if (lVar8 == 0) {
      uVar9 = FUN_009078cc(param_1,0);
      if ((uVar9 & 1) != 0) goto LAB_00945158;
      lVar8 = *(long *)(param_2 + 0x18);
    }
    if (lVar8 == 0) {
      uVar1 = 0xffffffff;
    }
    else {
      uVar1 = uVar2;
      uVar2 = 0xffffffff;
    }
    iVar5 = FUN_0093456c(uVar2,0xffffffff,uVar1,lVar6);
  }
  else {
LAB_00945158:
    iVar5 = 1;
  }
  if ((param_3 & 1) != 0) {
    iVar4 = FUN_009314dc(param_1);
    if (iVar4 != 0) {
      return 0x2a;
    }
    auVar10 = FUN_00941cb8();
    uVar7 = FUN_00941244(param_1,auVar10._0_8_,auVar10._8_8_);
    if ((int)uVar7 != 0) {
      return uVar7;
    }
  }
  if (iVar5 == 0) {
    uVar7 = 0;
  }
  else {
    if (iVar5 != -1) {
                    /* WARNING: Could not recover jumptable at 0x0094524c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar7 = (**(code **)(param_2 + 0x90))(param_1,*(undefined8 *)(param_1 + 0x20));
      return uVar7;
    }
    FUN_00904b80(param_1,"select/poll error");
    uVar7 = 0x1b;
  }
  return uVar7;
}

