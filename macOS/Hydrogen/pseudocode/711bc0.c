
ulong FUN_00711bc0(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 uVar10;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  
  iVar1 = *(int *)(param_2 + 8);
  if (((iRam0000000000a27a98 != iVar1 && iRam0000000000a27aa8 != iVar1) &&
      iRam0000000000a27ae8 != iVar1) && iRam0000000000a27ad8 != iVar1) {
    uStack0000000000000060 = (long *)func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),8);
    *uStack0000000000000060 = param_2;
    in_stack_00000068 = 1;
    param_2 = func_0x0071b400(param_1,param_2 + 0xc,&uStack0000000000000060,
                              "Assigned expression must be a variable or a field");
  }
  uVar10 = *(undefined8 *)(param_1 + 0x84);
  func_0x00710d48(param_1);
  lVar2 = func_0x007168a8(param_1,0);
  uStack0000000000000060 = *(long **)(param_2 + 0xc);
  in_stack_00000068 = *(undefined8 *)(lVar2 + 0x14);
  uVar3 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x38);
  func_0x00707598(uVar3,&uStack0000000000000060,param_3,param_2,lVar2);
  if (*(char *)(param_1 + 0x58) != '\0') {
    uVar4 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0xc);
    func_0x00709610(uVar4,uVar10);
    lVar2 = *(long *)(param_1 + 0x420);
    if ((ulong)(lVar2 * 3) >> 2 <= *(ulong *)(param_1 + 0x428)) {
      if ((*(ulong *)(param_1 + 0x428) != 0) && (uVar3 != *(ulong *)(param_1 + 0x430))) {
        uVar6 = 0;
        uVar8 = uVar3 >> 4 ^ uVar3 >> 9;
        do {
          uVar8 = uVar8 & lVar2 - 1U;
          uVar9 = *(ulong *)(*(long *)(param_1 + 0x418) + uVar8 * 0x10);
          if (uVar9 == uVar3) goto code_r0x00715474;
          uVar6 = uVar6 + 1;
          uVar8 = uVar6 + uVar8;
        } while (uVar9 != *(ulong *)(param_1 + 0x430) && uVar6 <= lVar2 - 1U);
      }
      func_0x006db93c();
      lVar2 = *(long *)(param_1 + 0x420);
    }
code_r0x00715474:
    lVar5 = *(long *)(param_1 + 0x418);
    uVar6 = (uVar3 >> 4 ^ uVar3 >> 9) & lVar2 - 1U;
    uVar8 = *(ulong *)(lVar5 + uVar6 * 0x10);
    if (uVar8 != *(ulong *)(param_1 + 0x430)) {
      lVar7 = 1;
      do {
        if (uVar8 == uVar3) goto code_r0x007154d4;
        uVar6 = uVar6 + lVar7 & lVar2 - 1U;
        uVar8 = *(ulong *)(lVar5 + uVar6 * 0x10);
        lVar7 = lVar7 + 1;
      } while (uVar8 != *(ulong *)(param_1 + 0x430));
    }
    *(ulong *)(lVar5 + uVar6 * 0x10) = uVar3;
    *(long *)(param_1 + 0x428) = *(long *)(param_1 + 0x428) + 1;
code_r0x007154d4:
    *(undefined8 *)(lVar5 + uVar6 * 0x10 + 8) = uVar4;
  }
  return uVar3;
}

