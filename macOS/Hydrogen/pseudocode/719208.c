
ulong FUN_00719208(long param_1,undefined8 param_2,undefined8 param_3,long param_4,
                  undefined8 param_5)

{
  long lVar1;
  bool in_ZR;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 uStack_78;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  if (!in_ZR) {
    param_4 = param_1 + 8;
    func_0x007b1e7c(param_2,param_3,param_4);
  }
  auVar12 = __Unwind_Resume();
  lVar2 = auVar12._0_8_;
  uStack_58 = *(undefined8 *)(lVar2 + 0x98);
  uStack_60 = *(undefined8 *)(lVar2 + 0x90);
  uStack_68 = (undefined4)*(undefined8 *)(lVar2 + 0x88);
  uStack_64 = (undefined4)((ulong)*(undefined8 *)(lVar2 + 0x88) >> 0x20);
  uStack_70 = (undefined4)*(undefined8 *)(lVar2 + 0x80);
  uStack_6c = (undefined4)((ulong)*(undefined8 *)(lVar2 + 0x80) >> 0x20);
  func_0x00710d48();
  lVar5 = *(long *)(lVar2 + 0x1a8);
  lVar6 = *(long *)(lVar2 + 0x1b0);
  if (*(int *)(lVar2 + 0x80) == 0x119) {
    uVar11 = *(undefined8 *)(lVar2 + 0x98);
    uStack_80 = *(undefined8 *)(lVar2 + 0x8c);
    uStack_88 = *(undefined8 *)(lVar2 + 0x84);
    func_0x00710d48(lVar2);
    uStack_90 = uVar11;
  }
  else {
    func_0x0072415c(lVar2,"type function name");
    uStack_90 = *(undefined8 *)(lVar2 + 0x128);
    uStack_80 = *(undefined8 *)(lVar2 + 0x8c);
    uStack_88 = *(undefined8 *)(lVar2 + 0x84);
  }
  uStack_78 = 1;
  *(int *)(*(long *)(lVar2 + 0x1c0) + 0x4a0) = *(int *)(*(long *)(lVar2 + 0x1c0) + 0x4a0) + 1;
  uVar11 = *(undefined8 *)(lVar2 + 0x160);
  *(long *)(lVar2 + 0x160) = *(long *)(lVar2 + 0x150) - *(long *)(lVar2 + 0x148) >> 3;
  uStack_a0 = 0;
  uStack_98 = 0;
  lVar3 = func_0x00718a2c(lVar2,0,&uStack_70,&uStack_90,0,&uStack_a0);
  *(undefined8 *)(lVar2 + 0x160) = uVar11;
  *(int *)(*(long *)(lVar2 + 0x1c0) + 0x4a0) = *(int *)(*(long *)(lVar2 + 0x1c0) + 0x4a0) + -1;
  lVar8 = *(long *)(lVar2 + 0x1a8);
  lVar1 = *(long *)(lVar2 + 0x1b0);
  uStack_a0 = *auVar12._8_8_;
  uStack_98 = *(undefined8 *)(lVar3 + 0x14);
  uVar4 = func_0x00704c24(*(undefined8 *)(lVar2 + 0xd8),0x48);
  func_0x0070787c(uVar4,&uStack_a0,&uStack_90,&uStack_88,lVar3,param_4,
                  (ulong)((lVar6 - lVar5 >> 4) * -0x5555555555555555) <
                  (ulong)((lVar1 - lVar8 >> 4) * -0x5555555555555555));
  if (*(char *)(lVar2 + 0x58) != '\0') {
    uVar11 = func_0x00704c24(*(undefined8 *)(lVar2 + 0xd8),0x14);
    func_0x007096a4(uVar11,param_5,CONCAT44(uStack_68,uStack_6c));
    lVar5 = *(long *)(lVar2 + 0x420);
    if ((ulong)(lVar5 * 3) >> 2 <= *(ulong *)(lVar2 + 0x428)) {
      if ((*(ulong *)(lVar2 + 0x428) != 0) && (uVar4 != *(ulong *)(lVar2 + 0x430))) {
        uVar7 = 0;
        uVar9 = uVar4 >> 4 ^ uVar4 >> 9;
        do {
          uVar9 = uVar9 & lVar5 - 1U;
          uVar10 = *(ulong *)(*(long *)(lVar2 + 0x418) + uVar9 * 0x10);
          if (uVar10 == uVar4) goto code_r0x00719408;
          uVar7 = uVar7 + 1;
          uVar9 = uVar7 + uVar9;
        } while (uVar10 != *(ulong *)(lVar2 + 0x430) && uVar7 <= lVar5 - 1U);
      }
      func_0x006db93c();
      lVar5 = *(long *)(lVar2 + 0x420);
    }
code_r0x00719408:
    lVar6 = *(long *)(lVar2 + 0x418);
    uVar7 = (uVar4 >> 4 ^ uVar4 >> 9) & lVar5 - 1U;
    uVar9 = *(ulong *)(lVar6 + uVar7 * 0x10);
    if (uVar9 != *(ulong *)(lVar2 + 0x430)) {
      lVar8 = 1;
      do {
        if (uVar9 == uVar4) goto code_r0x00719468;
        uVar7 = uVar7 + lVar8 & lVar5 - 1U;
        uVar9 = *(ulong *)(lVar6 + uVar7 * 0x10);
        lVar8 = lVar8 + 1;
      } while (uVar9 != *(ulong *)(lVar2 + 0x430));
    }
    *(ulong *)(lVar6 + uVar7 * 0x10) = uVar4;
    *(long *)(lVar2 + 0x428) = *(long *)(lVar2 + 0x428) + 1;
code_r0x00719468:
    *(undefined8 *)(lVar6 + uVar7 * 0x10 + 8) = uVar11;
  }
  return uVar4;
}

