
/* WARNING: Removing unreachable block (ram,0x000aad30) */

undefined8 FUN_000aa8a4(undefined *param_1,long param_2)

{
  ulong uVar1;
  bool in_ZR;
  uint uVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long in_x9;
  ulong uVar7;
  long unaff_x21;
  long unaff_x23;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  int *in_stack_00000008;
  long *in_stack_00000028;
  long in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  
  if (in_ZR) {
    if (param_1 < &UNK_00020001) {
      param_1 = param_1 + param_2;
    }
    else {
      _memcpy(param_2,param_1 + param_2 + -0x10000,0x10000);
      *(undefined8 *)(unaff_x23 + 0x88) = 0x10000;
      param_1 = (undefined *)(*(long *)(unaff_x23 + 0x78) + 0x10000);
    }
  }
  else {
    if ((undefined *)0xffff < param_1) {
      param_1 = (undefined *)0x10000;
    }
    param_1 = param_1 + in_x9;
  }
  *(undefined **)(unaff_x23 + 0x90) = param_1;
  uVar2 = func_0x000a64e8();
  if ((int)uVar2 < 0) {
    return 0xfffffffffffffff0;
  }
  if ((*(int *)(unaff_x23 + 0x28) != 0) && (*(int *)(unaff_x23 + 0x108) == 0)) {
    func_0x000b561c(in_stack_00000058,*(undefined8 *)(unaff_x23 + 0x90),uVar2);
  }
  uVar5 = (ulong)uVar2;
  if (*(long *)(unaff_x23 + 0x30) != 0) {
    *(ulong *)(unaff_x23 + 0x48) = *(long *)(unaff_x23 + 0x48) - uVar5;
  }
  uVar7 = 0;
  *(ulong *)(unaff_x23 + 0x98) = uVar5;
  *(undefined8 *)(unaff_x23 + 0xa0) = 0;
  *(undefined4 *)(unaff_x23 + 0x44) = 9;
  if (unaff_x25 == 0) goto code_r0x000aa3c4;
  uVar7 = *(long *)(unaff_x29 + -0x58) - unaff_x25;
  uVar1 = uVar5;
  if (uVar7 <= uVar5) {
    uVar1 = uVar7;
  }
  _memcpy();
  if (*(int *)(unaff_x23 + 0x24) == 0) {
    lVar6 = *(long *)(unaff_x23 + 0x88);
    if (lVar6 == 0) {
      *in_stack_00000028 = unaff_x25;
code_r0x000aa3ac:
      uVar5 = lVar6 + uVar1;
    }
    else {
      lVar4 = *in_stack_00000028 + lVar6;
      if (lVar4 == unaff_x25) goto code_r0x000aa3ac;
      uVar5 = uVar1 + (unaff_x25 - unaff_x27);
      if (uVar5 < 0x10000) {
        if (*in_stack_00000028 != *(long *)(unaff_x23 + 0x78)) {
          uVar5 = 0;
          if (*(undefined **)(unaff_x23 + 0x98) < &UNK_00010001) {
            uVar5 = 0x10000 - (long)*(undefined **)(unaff_x23 + 0x98);
          }
          uVar7 = *(long *)(unaff_x23 + 0x90) - *(long *)(unaff_x23 + 0x78);
          if (uVar7 <= uVar5) {
            uVar5 = uVar7;
          }
          _memcpy(*(long *)(unaff_x23 + 0x90) - uVar5,(lVar4 - *(long *)(unaff_x23 + 0xa0)) - uVar5)
          ;
          *(undefined8 *)(unaff_x23 + 0x80) = *(undefined8 *)(unaff_x23 + 0x78);
          lVar6 = uVar7 + *(long *)(unaff_x23 + 0xa0);
          unaff_x27 = in_stack_00000068;
        }
        goto code_r0x000aa3ac;
      }
      *in_stack_00000028 = unaff_x27;
    }
    *(ulong *)(unaff_x23 + 0x88) = uVar5;
  }
  uVar5 = *(ulong *)(unaff_x23 + 0x98);
  uVar7 = *(long *)(unaff_x23 + 0xa0) + uVar1;
  *(ulong *)(unaff_x23 + 0xa0) = uVar7;
  unaff_x25 = unaff_x25 + uVar1;
code_r0x000aa3c4:
  if (uVar7 == uVar5) {
    *(undefined4 *)(unaff_x23 + 0x44) = 3;
    do {
    } while (0xe < *(uint *)(unaff_x23 + 0x44));
                    /* WARNING: Could not recover jumptable at 0x000aa3f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar3 = (*(code *)(&UNK_000aa3fc +
                      (ulong)*(ushort *)(unaff_x21 + (ulong)*(uint *)(unaff_x23 + 0x44) * 2) * 4))()
    ;
    return uVar3;
  }
  *(undefined8 *)(unaff_x29 + -0x60) = 4;
  if ((((*(int *)(unaff_x23 + 0x24) == 0) && (lVar6 = *(long *)(unaff_x23 + 0x80), lVar6 != 0)) &&
      (lVar4 = *(long *)(unaff_x23 + 0x78), lVar6 != lVar4)) &&
     (((in_stack_00000008 == (int *)0x0 || (*in_stack_00000008 == 0)) &&
      (*(int *)(unaff_x23 + 0x44) - 2U < 8)))) {
    if (*(int *)(unaff_x23 + 0x44) == 9) {
      uVar5 = 0;
      if (*(undefined **)(unaff_x23 + 0x98) < &UNK_00010001) {
        uVar5 = 0x10000 - (long)*(undefined **)(unaff_x23 + 0x98);
      }
      uVar7 = *(long *)(unaff_x23 + 0x90) - lVar4;
      if (uVar7 <= uVar5) {
        uVar5 = uVar7;
      }
      _memcpy(*(long *)(unaff_x23 + 0x90) - uVar5,
              ((lVar6 + *(long *)(unaff_x23 + 0x88)) - *(long *)(unaff_x23 + 0xa0)) - uVar5);
      *(undefined8 *)(unaff_x23 + 0x80) = *(undefined8 *)(unaff_x23 + 0x78);
      *(ulong *)(unaff_x23 + 0x88) = *(long *)(unaff_x23 + 0xa0) + uVar7;
    }
    else {
      uVar7 = *(ulong *)(unaff_x23 + 0x88);
      uVar5 = uVar7;
      if (0xffff < uVar7) {
        uVar5 = 0x10000;
      }
      _memcpy(lVar4,(lVar6 + uVar7) - uVar5,uVar5);
      *(long *)(unaff_x23 + 0x80) = *(long *)(unaff_x23 + 0x78);
      *(ulong *)(unaff_x23 + 0x88) = uVar5;
      *(ulong *)(unaff_x23 + 0x90) = *(long *)(unaff_x23 + 0x78) + uVar5;
    }
  }
  *in_stack_00000038 = unaff_x26 - in_stack_00000030;
  *in_stack_00000040 = unaff_x25 - unaff_x27;
  return *(undefined8 *)(unaff_x29 + -0x60);
}

