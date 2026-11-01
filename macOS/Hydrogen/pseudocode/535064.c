
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00535064(long param_1,long param_2)

{
  ulong uVar1;
  long *plVar2;
  long in_x9;
  long lVar3;
  long in_x10;
  long lVar4;
  long in_x11;
  ulong uVar5;
  ulong uVar6;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  byte unaff_w24;
  long lVar7;
  long lVar8;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  if (in_x10 != in_x11) {
    do {
      *(long *)(param_2 + param_1 * 8) = in_x9;
      in_x9 = in_x9 + 1;
      param_1 = param_1 + 1;
    } while (unaff_x23 != in_x9);
  }
  uVar1 = unaff_x21 - unaff_x22;
  lVar3 = param_1;
  if ((unaff_w24 & (uVar1 != 0 && unaff_x22 <= unaff_x21)) == 1) {
    if (uVar1 < 8) {
      lVar4 = unaff_x22;
    }
    else {
      uVar5 = uVar1 & 0xfffffffffffffff8;
      lVar3 = param_1 + uVar5;
      lVar4 = unaff_x22 + uVar5;
      lVar7 = unaff_x22 + _UNK_007fc2d0;
      lVar8 = unaff_x22 + _UNK_007fc2d8;
      plVar2 = (long *)(param_2 + param_1 * 8 + 0x20);
      uVar6 = uVar5;
      do {
        plVar2[-3] = lVar8;
        plVar2[-4] = lVar7;
        plVar2[-1] = lVar8 + 2;
        plVar2[-2] = lVar7 + 2;
        plVar2[1] = lVar8 + 4;
        *plVar2 = lVar7 + 4;
        plVar2[3] = lVar8 + 6;
        plVar2[2] = lVar7 + 6;
        lVar7 = lVar7 + 8;
        lVar8 = lVar8 + 8;
        uVar6 = uVar6 - 8;
        plVar2 = plVar2 + 8;
      } while (uVar6 != 0);
      if (uVar1 == uVar5) goto LAB_005351a8;
    }
    do {
      *(long *)(param_2 + lVar3 * 8) = lVar4;
      lVar4 = lVar4 + 1;
      lVar3 = lVar3 + 1;
    } while (unaff_x21 != lVar4);
  }
LAB_005351a8:
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = lVar3;
  return;
}

