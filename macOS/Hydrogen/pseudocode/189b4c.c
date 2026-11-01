
/* WARNING: Removing unreachable block (ram,0x0079a318) */
/* WARNING: Removing unreachable block (ram,0x0079a324) */

ulong * FUN_00189b4c(ulong *param_1,undefined8 param_2,ulong param_3)

{
  ulong *puVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong *unaff_x19;
  ulong unaff_x20;
  undefined1 auVar6 [16];
  undefined1 auStack_98 [16];
  long lStack_88;
  undefined8 uStack_80;
  ulong uStack_70;
  ulong *puStack_68;
  int *piStack_60;
  undefined *puStack_58;
  int aiStack_50 [2];
  ulong uStack_48;
  ulong uStack_40;
  ulong uStack_38;
  ulong uStack_30;
  undefined8 uStack_28;
  
  uVar4 = param_1[2];
  if (param_3 <= *param_1 - uVar4) {
    return param_1;
  }
  if (CARRY8(uVar4,param_3)) {
code_r0x0079a3b4:
    func_0x007a1f00(0,uVar4,&UNK_009c0210);
  }
  else {
    uVar5 = *param_1;
    unaff_x20 = param_3 + uVar4;
    if (param_3 + uVar4 <= uVar5 * 2) {
      unaff_x20 = uVar5 * 2;
    }
    if (unaff_x20 < 9) {
      unaff_x20 = 8;
    }
    auVar6._8_8_ = 0;
    auVar6._0_8_ = unaff_x20;
    unaff_x19 = param_1;
    if (SUB168(ZEXT816(1) * auVar6,8) != 0) goto code_r0x0079a3b4;
    uVar2 = 0;
    if (0x7fffffffffffffff < unaff_x20) goto code_r0x0079a3c4;
    if (uVar5 != 0) {
      uStack_38 = param_1[1];
      uStack_28 = uVar5;
    }
    uStack_30 = (ulong)(uVar5 != 0);
    puVar1 = (ulong *)func_0x0079a108(aiStack_50,1,unaff_x20,&uStack_38);
    if (aiStack_50[0] != 1) {
      *param_1 = unaff_x20;
      param_1[1] = uStack_48;
      return puVar1;
    }
  }
  uVar2 = uStack_48;
  uVar4 = uStack_40;
code_r0x0079a3c4:
  auVar6 = func_0x007a1f00(uVar2,uVar4,&UNK_009c0210);
  uVar3 = *auVar6._0_8_;
  puStack_58 = &DAT_0079a3d0;
  uStack_70 = unaff_x20;
  puStack_68 = unaff_x19;
  piStack_60 = aiStack_50 + 0x10;
  func_0x00469240(auStack_98,auVar6._8_8_,&UNK_0081b47d,0xe);
  func_0x00193394(&lStack_88,uVar3);
  func_0x004653b0(auStack_98,&UNK_0081b48b,7,&lStack_88,&UNK_009c1390);
  puVar1 = (ulong *)func_0x00465628();
  if (lStack_88 != 0) {
    func_0x00187bd4(uStack_80,lStack_88,1);
  }
  return puVar1;
}

