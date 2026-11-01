
long * FUN_006511ec(ulong param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  long extraout_x1;
  undefined8 *puVar6;
  long lVar7;
  long in_x9;
  ulong uVar8;
  ulong in_x10;
  long in_x11;
  ulong uVar9;
  long *unaff_x19;
  long unaff_x22;
  undefined8 *puVar10;
  undefined8 *unaff_x23;
  long unaff_x24;
  long lVar11;
  undefined1 auVar12 [16];
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  long *in_stack_00000018;
  long in_stack_00000020;
  long *plStack0000000000000028;
  
  plVar5 = unaff_x19 + 2;
  uVar8 = (*plVar5 - in_x9 >> 4) * in_x11;
  uVar9 = uVar8 * 2;
  if (uVar9 <= in_x10) {
    uVar9 = in_x10;
  }
  if (0x124924924924923 < uVar8) {
    uVar9 = param_1;
  }
  plStack0000000000000028 = plVar5;
  if (uVar9 == 0) {
    lVar2 = 0;
  }
  else {
    if (param_1 < uVar9) {
      uVar3 = func_0x00017514();
      *unaff_x23 = &UNK_009f5d60;
      lVar7 = unaff_x22 + unaff_x24 * 0x70;
      lVar2 = *(long *)(lVar7 + 0x28);
      uVar9 = *(ulong *)(lVar7 + 0x18);
      if (*(ulong *)(lVar7 + 0x20) <= *(ulong *)(lVar7 + 0x18)) {
        uVar9 = *(ulong *)(lVar7 + 0x20);
      }
      if (lVar2 != 0) {
        if (uVar9 != 0) {
          do {
            *(undefined8 *)(lVar2 + -8 + uVar9 * 8) = 0;
            uVar9 = uVar9 - 1;
          } while (uVar9 != 0);
        }
        func_0x00611644();
      }
      func_0x0064fcb8(&uStack0000000000000008);
      auVar12 = __Unwind_Resume(uVar3);
      puVar6 = auVar12._8_8_;
      plVar4 = auVar12._0_8_;
      lVar7 = *plVar4;
      lVar1 = plVar4[1];
      lVar2 = puVar6[1];
      plVar5 = plVar4;
      if (lVar1 != lVar7) {
        lVar11 = 0;
        do {
          plVar5 = (long *)func_0x00651558(lVar2 + lVar11 + -0xa0,lVar1 + lVar11 + -0xa0);
          lVar11 = lVar11 + -0xa0;
        } while (lVar1 + lVar11 != lVar7);
        lVar2 = lVar2 + lVar11;
      }
      puVar6[1] = lVar2;
      lVar7 = *plVar4;
      *plVar4 = lVar2;
      puVar6[1] = lVar7;
      lVar2 = plVar4[1];
      plVar4[1] = puVar6[2];
      puVar6[2] = lVar2;
      lVar2 = plVar4[2];
      plVar4[2] = puVar6[3];
      puVar6[3] = lVar2;
      *puVar6 = puVar6[1];
      return plVar5;
    }
    lVar2 = __Znwm(uVar9 * 0x70);
  }
  in_stack_00000010 = (undefined8 *)(lVar2 + unaff_x24 * 0x70);
  in_stack_00000020 = lVar2 + uVar9 * 0x70;
  *in_stack_00000010 = &UNK_00a09a40;
  uStack0000000000000008 = lVar2;
  in_stack_00000018 = in_stack_00000010;
  func_0x005fe0b4(in_stack_00000010 + 1,param_3 + 8);
  func_0x005fe0b4(lVar2 + unaff_x24 * 0x70 + 0x38,param_3 + 0x38);
  *(undefined1 *)(lVar2 + unaff_x24 * 0x70 + 0x68) = *(undefined1 *)(param_3 + 0x68);
  plVar4 = in_stack_00000018 + 0xe;
  in_stack_00000018 = plVar4;
  func_0x0064fd0c(plVar5,unaff_x19[1],unaff_x19[1],*unaff_x19,*unaff_x19,in_stack_00000010,
                  in_stack_00000010);
  puVar6 = (undefined8 *)*unaff_x19;
  puVar10 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = extraout_x1;
  unaff_x19[1] = (long)plVar4;
  unaff_x19[2] = in_stack_00000020;
  while (puVar10 != puVar6) {
    puVar10 = puVar10 + -0xe;
    (**(code **)*puVar10)(puVar10);
  }
  if (puVar6 != (undefined8 *)0x0) {
    __ZdlPv(puVar6);
  }
  return plVar4;
}

