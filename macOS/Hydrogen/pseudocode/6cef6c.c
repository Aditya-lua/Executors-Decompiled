
/* WARNING: Removing unreachable block (ram,0x006d6288) */

void thunk_FUN_006cef90(long param_1)

{
  int iVar1;
  long extraout_x8;
  long lVar2;
  long lVar3;
  long in_x9;
  ulong extraout_x10;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  ulong unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  ulong unaff_x26;
  ulong in_stack_00000018;
  
  do {
    if (*(int *)(param_1 + unaff_x23) == 0) {
      iVar1 = func_0x006b2794(*unaff_x20,*(undefined8 *)(param_1 + unaff_x23 + 8));
      if (iVar1 == 0) {
        func_0x006bc388((long)unaff_x19 + 0xc,
                        "Exceeded jump distance limit; simplify the code to compile");
        param_1 = extraout_x8;
        uVar4 = extraout_x10;
        break;
      }
      in_x9 = unaff_x20[0x9b];
      param_1 = unaff_x20[0x9a];
    }
    unaff_x24 = unaff_x24 + 1;
    uVar4 = in_x9 - param_1 >> 4;
    unaff_x23 = unaff_x23 + 0x10;
  } while (unaff_x24 < uVar4);
  if (unaff_x22 < uVar4 || unaff_x22 - uVar4 == 0) {
    if (unaff_x22 < uVar4) {
      unaff_x20[0x9b] = param_1 + unaff_x22 * 0x10;
    }
  }
  else {
    func_0x006cb2a8(unaff_x20 + 0x9a,unaff_x22 - uVar4);
  }
  unaff_x20[0x9e] = unaff_x20[0x9e] + -0x18;
  lVar2 = unaff_x20[0x26];
  if ((ulong)(lVar2 * 3) >> 2 <= (ulong)unaff_x20[0x27]) {
    if ((unaff_x20[0x27] != 0) && (unaff_x26 != unaff_x20[0x28])) {
      uVar4 = 0;
      uVar6 = in_stack_00000018 ^ unaff_x26 >> 9;
      do {
        uVar6 = uVar6 & lVar2 - 1U;
        uVar7 = *(ulong *)(unaff_x20[0x25] + uVar6 * 0x20);
        if (uVar7 == unaff_x26) goto LAB_006cf058;
        uVar4 = uVar4 + 1;
        uVar6 = uVar4 + uVar6;
      } while (uVar7 != unaff_x20[0x28] && uVar4 <= lVar2 - 1U);
    }
    func_0x006ce510(unaff_x20 + 0x25);
    lVar2 = unaff_x20[0x26];
  }
LAB_006cf058:
  lVar3 = unaff_x20[0x25];
  uVar4 = (in_stack_00000018 ^ unaff_x26 >> 9) & lVar2 - 1U;
  uVar6 = *(ulong *)(lVar3 + uVar4 * 0x20);
  if (uVar6 != unaff_x20[0x28]) {
    lVar5 = 1;
    do {
      if (uVar6 == unaff_x26) goto LAB_006cf0bc;
      uVar4 = uVar4 + lVar5 & lVar2 - 1U;
      uVar6 = *(ulong *)(lVar3 + uVar4 * 0x20);
      lVar5 = lVar5 + 1;
    } while (uVar6 != unaff_x20[0x28]);
  }
  *(ulong *)(lVar3 + uVar4 * 0x20) = unaff_x26;
  unaff_x20[0x27] = unaff_x20[0x27] + 1;
LAB_006cf0bc:
  *(undefined4 *)(lVar3 + uVar4 * 0x20 + 8) = 0;
  (**(code **)*unaff_x19)();
  return;
}

