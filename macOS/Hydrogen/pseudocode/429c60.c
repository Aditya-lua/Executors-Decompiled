
void __ZN3std3sys9backtrace26__rust_end_short_backtrace17h95fae44203fdee4fE
               (undefined8 param_1,undefined8 param_2,ulong param_3,long param_4)

{
  undefined8 *puVar1;
  long lVar2;
  uint *puVar3;
  char *pcVar4;
  long lVar5;
  undefined1 auVar6 [16];
  undefined8 uStack_a0;
  undefined8 uStack_98;
  char *pcStack_90;
  long lStack_88;
  undefined **ppuStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined *puStack_60;
  undefined *puStack_58;
  undefined1 *puStack_50;
  undefined *puStack_48;
  
  auVar6 = func_0x0042d534();
  puVar3 = auVar6._8_8_;
  puVar1 = auVar6._0_8_;
  if ((*puVar3 & 1) == 0) {
    pcVar4 = *(char **)(puVar3 + 2);
    lVar5 = *(long *)(puVar3 + 4);
    if (((param_3 & 1) != 0) || (lVar5 == 0)) goto LAB_00429ce4;
  }
  else {
    pcVar4 = &UNK_008869e4;
    lVar5 = 9;
    if ((param_3 & 1) != 0) goto LAB_00429ce4;
  }
  if ((((param_4 != 0) && (*pcVar4 == '/')) &&
      (lVar2 = func_0x004259b8(pcVar4,lVar5,*(undefined8 *)(param_4 + 8),
                               *(undefined8 *)(param_4 + 0x10)), lVar2 != 0)) &&
     (func_0x0046b8d0(&pcStack_90), (int)pcStack_90 != 1)) {
    uStack_a0 = lStack_88;
    uStack_98 = ppuStack_80;
    puStack_60 = &UNK_00888494;
    puStack_58 = &__ZN43__LT_char_u20_as_u20_core__fmt__Display_GT_3fmt17ha5099e7a97893038E;
    puStack_48 = &DAT_003f40f4;
    pcStack_90 = &UNK_009daee0;
    lStack_88 = 2;
    uStack_78 = 2;
    uStack_70 = 0;
    ppuStack_80 = &puStack_60;
    puStack_50 = (undefined1 *)&uStack_a0;
    func_0x0046849c(*puVar1,puVar1[1],&pcStack_90);
    return;
  }
LAB_00429ce4:
  pcStack_90 = pcVar4;
  lStack_88 = lVar5;
  func_0x00415978(&pcStack_90,puVar1);
  return;
}

