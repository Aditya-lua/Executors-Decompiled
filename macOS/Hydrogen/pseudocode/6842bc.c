
undefined8 * FUN_006842bc(long param_1,undefined8 *param_2,long *param_3)

{
  long lVar1;
  ulong uVar2;
  long *plVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  char *pcVar8;
  char *pcStack0000000000000000;
  ulong uStack0000000000000008;
  ulong uStack0000000000000010;
  char cStack0000000000000046;
  
  lVar1 = param_3[1];
  if (-1 < (char)param_1) {
    lVar1 = param_1;
  }
  uStack0000000000000008 = lVar1 + 0x46;
  if (0x7ffffffffffffff7 < uStack0000000000000008) {
    uVar6 = func_0x0001748c();
    __ZNSt9exceptionD2Ev();
    __ZdlPv(lVar1);
    puVar7 = (undefined8 *)__Unwind_Resume(uVar6);
    *puVar7 = &UNK_009b2ec8;
    if (*(char *)((long)puVar7 + 0x27) < '\0') {
      __ZdlPv(puVar7[2]);
      __ZNSt9exceptionD2Ev(puVar7);
    }
    else {
      __ZNSt9exceptionD2Ev(puVar7);
    }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    puVar7 = (undefined8 *)(*(code *)PTR___ZdlPv_009b01b8)();
    return puVar7;
  }
  if (uStack0000000000000008 < 0x17) {
    pcVar8 = &cStack0000000000000046;
    uStack0000000000000008 = s_IteratedHashBase__input_data_exc_008e9576._8_8_;
    pcStack0000000000000000 = (char *)s_IteratedHashBase__input_data_exc_008e9576._0_8_;
    uStack0000000000000010 = s_IteratedHashBase__input_data_exc_008e9576._16_8_;
  }
  else {
    uVar2 = (uStack0000000000000008 & 0xfffffffffffffff8) + 8;
    if ((uStack0000000000000008 | 7) != 0x17) {
      uVar2 = uStack0000000000000008 | 7;
    }
    pcStack0000000000000000 = (char *)__Znwm(uVar2 + 1);
    uVar5 = s_IteratedHashBase__input_data_exc_008e9576._48_8_;
    uVar4 = s_IteratedHashBase__input_data_exc_008e9576._32_8_;
    uStack0000000000000010 = uVar2 + 1 | 0x8000000000000000;
    pcVar8 = pcStack0000000000000000 + 0x46;
    uVar6 = CONCAT26(s_IteratedHashBase__input_data_exc_008e9576._62_2_,
                     s_IteratedHashBase__input_data_exc_008e9576._56_6_);
    *(undefined8 *)(pcStack0000000000000000 + 0x28) =
         s_IteratedHashBase__input_data_exc_008e9576._40_8_;
    *(undefined8 *)(pcStack0000000000000000 + 0x20) = uVar4;
    *(undefined8 *)(pcStack0000000000000000 + 0x38) = uVar6;
    *(undefined8 *)(pcStack0000000000000000 + 0x30) = uVar5;
    *(ulong *)(pcStack0000000000000000 + 0x3e) =
         CONCAT62(s_IteratedHashBase__input_data_exc_008e9576._64_6_,
                  s_IteratedHashBase__input_data_exc_008e9576._62_2_);
    uVar5 = s_IteratedHashBase__input_data_exc_008e9576._24_8_;
    uVar4 = s_IteratedHashBase__input_data_exc_008e9576._16_8_;
    uVar6 = s_IteratedHashBase__input_data_exc_008e9576._0_8_;
    *(undefined8 *)(pcStack0000000000000000 + 8) = s_IteratedHashBase__input_data_exc_008e9576._8_8_
    ;
    *(undefined8 *)pcStack0000000000000000 = uVar6;
    *(undefined8 *)(pcStack0000000000000000 + 0x18) = uVar5;
    *(undefined8 *)(pcStack0000000000000000 + 0x10) = uVar4;
    if (lVar1 == 0) goto LAB_00684384;
  }
  plVar3 = (long *)*param_3;
  if (-1 < (char)param_1) {
    plVar3 = param_3;
  }
  _memmove(pcVar8,plVar3,lVar1);
LAB_00684384:
  pcVar8[lVar1] = '\0';
  *param_2 = &UNK_009b2ec8;
  *(undefined4 *)(param_2 + 1) = 4;
  if ((long)uStack0000000000000010 < 0) {
    func_0x00017634(param_2 + 2,pcStack0000000000000000,uStack0000000000000008);
    *param_2 = &UNK_00a084b0;
    __ZdlPv(pcStack0000000000000000);
  }
  else {
    param_2[3] = uStack0000000000000008;
    param_2[2] = pcStack0000000000000000;
    param_2[4] = uStack0000000000000010;
    *param_2 = &UNK_00a084b0;
  }
  *param_2 = &UNK_00a12ac0;
  return param_2;
}

