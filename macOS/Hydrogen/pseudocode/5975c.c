
/* WARNING: Possible PIC construction at 0x000597b0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000597b4) */
/* WARNING: Removing unreachable block (ram,0x00059890) */
/* WARNING: Removing unreachable block (ram,0x000597c8) */
/* WARNING: Removing unreachable block (ram,0x000597d4) */
/* WARNING: Removing unreachable block (ram,0x000597ec) */
/* WARNING: Removing unreachable block (ram,0x000597f8) */
/* WARNING: Removing unreachable block (ram,0x00059820) */
/* WARNING: Removing unreachable block (ram,0x00059848) */
/* WARNING: Removing unreachable block (ram,0x00059858) */
/* WARNING: Removing unreachable block (ram,0x0005985c) */
/* WARNING: Removing unreachable block (ram,0x00059870) */
/* WARNING: Removing unreachable block (ram,0x000598a8) */
/* WARNING: Removing unreachable block (ram,0x000598b8) */
/* WARNING: Removing unreachable block (ram,0x0005988c) */
/* WARNING: Removing unreachable block (ram,0x000598bc) */
/* WARNING: Removing unreachable block (ram,0x000598c0) */
/* WARNING: Removing unreachable block (ram,0x000598c4) */

long FUN_0005975c(long param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  ulong in_x9;
  long in_x11;
  ulong uVar6;
  ulong in_x12;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined1 auVar7 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  
  uVar6 = in_x11 - param_1 >> 2;
  if (uVar6 <= in_x9) {
    uVar6 = in_x9;
  }
  if (in_x12 <= (ulong)(in_x11 - param_1)) {
    uVar6 = 0x1fffffffffffffff;
  }
  if (uVar6 == 0) {
    uStack0000000000000008 = 0;
  }
  else {
    if (uVar6 >> 0x3d != 0) {
      uVar2 = func_0x00017514();
      func_0x00059e60(&uStack0000000000000008);
      auVar7 = __Unwind_Resume(uVar2);
      unaff_x20 = auVar7._8_8_;
      lVar3 = auVar7._0_8_;
      goto code_r0x000598fc;
    }
    uStack0000000000000008 = __Znwm(uVar6 << 3);
  }
  lVar3 = uStack0000000000000008 + unaff_x21 * 8;
  in_stack_00000020 = uStack0000000000000008 + uVar6 * 8;
  in_stack_00000010 = lVar3;
  in_stack_00000018 = lVar3;
code_r0x000598fc:
  uVar2 = __Znwm(8);
  __ZNSt3__115__thread_structC1Ev();
  puVar4 = (undefined8 *)__Znwm(0x10);
  uVar5 = *unaff_x20;
  *puVar4 = uVar2;
  puVar4[1] = uVar5;
  uVar2 = _pthread_create(lVar3,0,&DAT_000599c8,puVar4);
  if ((int)uVar2 != 0) {
    __ZNSt3__120__throw_system_errorEiPKc(uVar2,"thread constructor failed");
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x59984);
    (*pcVar1)();
  }
  return lVar3;
}

