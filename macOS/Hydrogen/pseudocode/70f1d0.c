
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f344) */
/* WARNING: Removing unreachable block (ram,0x0070f390) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0070f1d0(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  char *pcVar4;
  long lVar5;
  long *unaff_x19;
  long lVar6;
  long lVar7;
  long unaff_x29;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  
  pcVar4 = (char *)__Znwm(0x38);
  lVar6 = _UNK_008cc728;
  pcVar4[0x30] = 'n';
  uVar3 = s__deprecated_can_be_parametrized_o_008ec175._24_8_;
  uVar2 = s__deprecated_can_be_parametrized_o_008ec175._16_8_;
  uVar1 = s__deprecated_can_be_parametrized_o_008ec175._0_8_;
  pcVar4[0x31] = 't';
  *(undefined8 *)(pcVar4 + 8) = s__deprecated_can_be_parametrized_o_008ec175._8_8_;
  *(undefined8 *)pcVar4 = uVar1;
  *(undefined8 *)(pcVar4 + 0x18) = uVar3;
  *(undefined8 *)(pcVar4 + 0x10) = uVar2;
  uVar1 = s__deprecated_can_be_parametrized_o_008ec175._32_8_;
  *(undefined8 *)(pcVar4 + 0x28) = s__deprecated_can_be_parametrized_o_008ec175._40_8_;
  *(undefined8 *)(pcVar4 + 0x20) = uVar1;
  pcVar4[0x32] = '\0';
  func_0x00724abc();
  if (lVar6 < 0) {
    __ZdlPv(pcVar4);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  ___stack_chk_fail();
  if (in_stack_00000038 < 0) {
    __ZdlPv(in_stack_00000028);
  }
  if ((long)pcVar4 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  lVar6 = *unaff_x19;
  if (lVar6 != 0) {
    lVar7 = unaff_x19[1];
    lVar5 = lVar6;
    if (lVar7 != lVar6) {
      do {
        lVar7 = lVar7 + -0x28;
      } while (lVar7 != lVar6);
      lVar5 = *unaff_x19;
    }
    unaff_x19[1] = lVar6;
    __ZdlPv(lVar5);
  }
  return;
}

