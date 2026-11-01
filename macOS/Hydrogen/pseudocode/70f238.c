
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f344) */
/* WARNING: Removing unreachable block (ram,0x0070f390) */

void FUN_0070f238(long param_1,char *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long *unaff_x19;
  long lVar5;
  long lVar6;
  long unaff_x29;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  long lStack0000000000000060;
  
  uVar3 = s_Unknown_argument_type_for__depre_008ec1a8._16_8_;
  uVar2 = s_Unknown_argument_type_for__depre_008ec1a8._0_8_;
  lStack0000000000000060 = *(long *)(param_1 + 0x708);
  uStack0000000000000058 = *(undefined8 *)(param_1 + 0x700);
  uVar1 = CONCAT35(s_Unknown_argument_type_for__depre_008ec1a8._29_3_,
                   s_Unknown_argument_type_for__depre_008ec1a8._24_5_);
  *(undefined8 *)(param_2 + 8) = s_Unknown_argument_type_for__depre_008ec1a8._8_8_;
  *(undefined8 *)param_2 = uVar2;
  *(undefined8 *)(param_2 + 0x18) = uVar1;
  *(undefined8 *)(param_2 + 0x10) = uVar3;
  *(ulong *)(param_2 + 0x1d) =
       CONCAT53(s_Unknown_argument_type_for__depre_008ec1a8._32_5_,
                s_Unknown_argument_type_for__depre_008ec1a8._29_3_);
  param_2[0x25] = '\0';
  func_0x00724abc();
  if (lStack0000000000000060 < 0) {
    __ZdlPv(in_stack_00000050);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  ___stack_chk_fail();
  if (in_stack_00000038 < 0) {
    __ZdlPv(in_stack_00000028);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  lVar5 = *unaff_x19;
  if (lVar5 != 0) {
    lVar6 = unaff_x19[1];
    lVar4 = lVar5;
    if (lVar6 != lVar5) {
      do {
        lVar6 = lVar6 + -0x28;
      } while (lVar6 != lVar5);
      lVar4 = *unaff_x19;
    }
    unaff_x19[1] = lVar5;
    __ZdlPv(lVar4);
  }
  return;
}

