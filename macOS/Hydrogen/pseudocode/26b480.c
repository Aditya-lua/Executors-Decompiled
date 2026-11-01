
void thunk_FUN_0026b4c8(undefined8 param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong extraout_x8;
  ulong extraout_x8_00;
  ulong extraout_x8_01;
  long unaff_x19;
  undefined8 *puVar3;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  char unaff_w26;
  long unaff_x27;
  long lVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined8 *in_stack_00000020;
  undefined4 uStack0000000000000088;
  
  auVar6._8_8_ = param_2;
  auVar6._0_8_ = param_1;
  auVar5._8_8_ = param_2;
  auVar5._0_8_ = param_1;
  uVar2 = unaff_x19 - 1;
  if ((long)uVar2 < unaff_x25) {
    if ((unaff_w26 == '\0') &&
       (uVar2 = param_2 | 0x8000000000000000, auVar5 = auVar6, uVar2 != 0x8000000000000000)) {
      auVar5 = func_0x00187bd4(param_1,param_2,1);
      uVar2 = extraout_x8;
    }
    uVar1 = auVar5._0_8_;
    if (unaff_x27 != 0) {
      puVar3 = (undefined8 *)(unaff_x23 + 8);
      lVar4 = unaff_x27;
      do {
        auVar5._8_8_ = 0;
        auVar5._0_8_ = uVar1;
        if (puVar3[-1] != 0) {
          auVar5 = func_0x00187bd4(*puVar3,puVar3[-1],1);
          uVar2 = extraout_x8_00;
        }
        uVar1 = auVar5._0_8_;
        puVar3 = puVar3 + 3;
        lVar4 = lVar4 + -1;
        unaff_x27 = 0;
      } while (lVar4 != 0);
    }
    auVar6 = auVar5;
    if (unaff_x25 != 0) {
      auVar6 = func_0x00187bd4();
      uVar2 = extraout_x8_01;
    }
  }
  in_stack_00000020[1] = unaff_x23;
  in_stack_00000020[2] = unaff_x27;
  *(char *)(in_stack_00000020 + 3) = unaff_w26;
  *(undefined4 *)((long)in_stack_00000020 + 0x19) = uStack0000000000000088;
  *(int *)((long)in_stack_00000020 + 0x1c) = (int)((ulong)_uStack0000000000000088 >> 0x18);
  in_stack_00000020[4] = auVar6._8_8_;
  in_stack_00000020[5] = auVar6._0_8_;
  in_stack_00000020[6] = uVar2;
  *in_stack_00000020 = unaff_x24;
  return;
}

