
void thunk_FUN_00054728(ulong param_1)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long *unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong uVar5;
  
  if (unaff_x21 <= param_1) {
    unaff_x21 = param_1;
  }
  if (unaff_x21 < unaff_x24) {
    func_0x000280c4();
  }
  uVar5 = unaff_x19[1];
  if ((uVar5 & uVar5 - 1) == 0) {
    unaff_x23 = uVar5 - 1 & unaff_x23;
    lVar4 = *unaff_x19;
    plVar2 = *(long **)(lVar4 + unaff_x23 * 8);
joined_r0x000547b4:
    if (plVar2 == (long *)0x0) goto code_r0x00054758;
LAB_00054650:
    *unaff_x20 = *plVar2;
  }
  else {
    if (uVar5 <= unaff_x23) {
      uVar3 = 0;
      if (uVar5 != 0) {
        uVar3 = unaff_x23 / uVar5;
      }
      unaff_x23 = unaff_x23 - uVar3 * uVar5;
      lVar4 = *unaff_x19;
      plVar2 = *(long **)(lVar4 + unaff_x23 * 8);
      goto joined_r0x000547b4;
    }
    lVar4 = *unaff_x19;
    plVar2 = *(long **)(lVar4 + unaff_x23 * 8);
    if (plVar2 != (long *)0x0) goto LAB_00054650;
code_r0x00054758:
    *unaff_x20 = *unaff_x22;
    *unaff_x22 = (long)unaff_x20;
    *(long **)(lVar4 + unaff_x23 * 8) = unaff_x22;
    if (*unaff_x20 == 0) goto LAB_000547d8;
    uVar3 = *(ulong *)(*unaff_x20 + 8);
    if ((uVar5 & uVar5 - 1) == 0) {
      uVar3 = uVar3 & uVar5 - 1;
    }
    else if (uVar5 <= uVar3) {
      uVar1 = 0;
      if (uVar5 != 0) {
        uVar1 = uVar3 / uVar5;
      }
      uVar3 = uVar3 - uVar1 * uVar5;
    }
    plVar2 = (long *)(*unaff_x19 + uVar3 * 8);
  }
  *plVar2 = (long)unaff_x20;
LAB_000547d8:
  unaff_x19[3] = unaff_x19[3] + 1;
  return;
}

