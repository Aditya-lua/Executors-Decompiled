
/* WARNING: Possible PIC construction at 0x006502f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00650398: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006502f4) */
/* WARNING: Removing unreachable block (ram,0x00650310) */
/* WARNING: Removing unreachable block (ram,0x00650318) */
/* WARNING: Removing unreachable block (ram,0x0065031c) */
/* WARNING: Removing unreachable block (ram,0x00650320) */
/* WARNING: Removing unreachable block (ram,0x0065032c) */
/* WARNING: Removing unreachable block (ram,0x0065033c) */
/* WARNING: Removing unreachable block (ram,0x00650360) */
/* WARNING: Removing unreachable block (ram,0x00650368) */
/* WARNING: Removing unreachable block (ram,0x0065036c) */
/* WARNING: Removing unreachable block (ram,0x00650370) */
/* WARNING: Removing unreachable block (ram,0x0065037c) */
/* WARNING: Removing unreachable block (ram,0x0065038c) */
/* WARNING: Removing unreachable block (ram,0x0065039c) */

undefined8 * FUN_00650114(ulong param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long in_x9;
  long lVar4;
  ulong in_x10;
  long in_x11;
  ulong uVar5;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *puVar6;
  long unaff_x22;
  long unaff_x23;
  long lVar7;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  undefined8 *in_stack_00000018;
  long in_stack_00000020;
  
  if (param_1 < in_x10) {
    func_0x00017f90();
LAB_006502e4:
    func_0x00017514();
    puVar2 = in_stack_00000010;
    while (in_stack_00000018 != puVar2) {
      in_stack_00000018 = in_stack_00000018 + -10;
      (**(code **)*in_stack_00000018)();
    }
    if (uStack0000000000000008 != 0) {
      __ZdlPv();
    }
    return &uStack0000000000000008;
  }
  lVar4 = in_x9 - in_x11 >> 4;
  uVar5 = lVar4 * -0x6666666666666666;
  if (uVar5 <= in_x10) {
    uVar5 = in_x10;
  }
  if (0x199999999999998 < (ulong)(lVar4 * -0x3333333333333333)) {
    uVar5 = param_1;
  }
  if (uVar5 == 0) {
    uStack0000000000000008 = 0;
  }
  else {
    if (param_1 < uVar5) goto LAB_006502e4;
    uStack0000000000000008 = __Znwm(uVar5 * 0x50);
  }
  lVar4 = 0;
  lVar7 = uStack0000000000000008 + unaff_x23 * 0x50;
  in_stack_00000020 = uStack0000000000000008 + uVar5 * 0x50;
  lVar1 = lVar7 + unaff_x22 * 0x50;
  in_stack_00000010 = (undefined8 *)lVar7;
  in_stack_00000018 = (undefined8 *)lVar7;
  do {
    puVar2 = (undefined8 *)(lVar7 + lVar4);
    *puVar2 = &UNK_00a09a70;
    func_0x00675bac(puVar2 + 1,unaff_x20 + 8);
    func_0x00675bac(puVar2 + 5,unaff_x20 + 0x28);
    *(undefined1 *)(lVar7 + lVar4 + 0x48) = *(undefined1 *)(unaff_x20 + 0x48);
    lVar4 = lVar4 + 0x50;
  } while (unaff_x22 * 0x50 != lVar4);
  in_stack_00000018 = (undefined8 *)lVar1;
  auVar8 = func_0x006503f8();
  puVar3 = auVar8._0_8_;
  puVar2 = (undefined8 *)*unaff_x19;
  puVar6 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = auVar8._8_8_;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = in_stack_00000020;
  while (puVar6 != puVar2) {
    puVar6 = puVar6 + -10;
    puVar3 = (undefined8 *)(**(code **)*puVar6)(puVar6);
  }
  if (puVar2 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)__ZdlPv(puVar2);
  }
  return puVar3;
}

