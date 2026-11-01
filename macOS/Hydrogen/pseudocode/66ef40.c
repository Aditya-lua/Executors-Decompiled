
/* WARNING: Removing unreachable block (ram,0x0066e258) */
/* WARNING: Removing unreachable block (ram,0x0066e304) */
/* WARNING: Removing unreachable block (ram,0x0066e280) */
/* WARNING: Removing unreachable block (ram,0x0066e30c) */
/* WARNING: Removing unreachable block (ram,0x0066e2a0) */
/* WARNING: Removing unreachable block (ram,0x0066e2ac) */
/* WARNING: Removing unreachable block (ram,0x0066e2b0) */
/* WARNING: Removing unreachable block (ram,0x0066e2b4) */
/* WARNING: Removing unreachable block (ram,0x0066e2b8) */
/* WARNING: Removing unreachable block (ram,0x0066e2c4) */
/* WARNING: Removing unreachable block (ram,0x0066e2cc) */
/* WARNING: Removing unreachable block (ram,0x0066e2dc) */
/* WARNING: Removing unreachable block (ram,0x0066e310) */
/* WARNING: Removing unreachable block (ram,0x0066e190) */
/* WARNING: Removing unreachable block (ram,0x0066e334) */

ulong FUN_0066ef40(long param_1,undefined8 param_2,char *param_3)

{
  int iVar1;
  undefined4 uVar2;
  code *pcVar3;
  undefined1 in_ZR;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  char *in_x9;
  long unaff_x21;
  undefined8 uVar7;
  long unaff_x22;
  long unaff_x23;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  while( true ) {
    if (!(bool)in_ZR) {
      uVar7 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,"AuthenticatedEncryptionFilter");
      func_0x00674cac(uVar7,&uStack0000000000000008);
      ___cxa_throw(uVar7,&UNK_00a0d1a8,&DAT_0066ee68);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x66f018);
      (*pcVar3)();
    }
    in_x9 = in_x9 + 1;
    param_3 = param_3 + 1;
    param_1 = param_1 + -1;
    if (param_1 == 0) break;
    in_ZR = *in_x9 == *param_3;
  }
  plVar4 = (long *)(unaff_x23 + 0xd8);
  iVar1 = *(int *)(unaff_x23 + 0x100);
  if (iVar1 == 0) {
    *(undefined8 *)(unaff_x23 + 0xf8) = 0;
    if (*(char *)(unaff_x23 + 0x138) == '\0') goto code_r0x0066e234;
  }
  else if (iVar1 != 1) {
    if (iVar1 != 2) {
      return 0;
    }
    uVar7 = *(undefined8 *)(unaff_x23 + 0x140);
    uVar2 = *(undefined4 *)(unaff_x23 + 0x13c);
    plVar4 = (long *)(**(code **)(*plVar4 + 0x160))(plVar4);
    lVar5 = (**(code **)(*plVar4 + 0x130))(plVar4,unaff_x23 + 0x160,uVar7,uVar2,0);
    *(uint *)(unaff_x23 + 0x100) = (uint)(lVar5 != 0) << 1;
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = (ulong)*(uint *)(unaff_x23 + 0x13c) - *(long *)(unaff_x23 + 0xf8);
    goto code_r0x0066e388;
  }
  plVar4 = (long *)(**(code **)(*plVar4 + 0x160))(plVar4);
  lVar5 = (**(code **)(*plVar4 + 0x130))(plVar4,unaff_x23 + 0x148);
  *(uint *)(unaff_x23 + 0x100) = (uint)(lVar5 != 0);
  if (lVar5 == 0) {
code_r0x0066e234:
    if ((unaff_x22 != 0) && (unaff_x21 != 0)) {
      (**(code **)(**(long **)(unaff_x23 + 0x130) + 0x28))();
    }
    return 0;
  }
  uVar6 = unaff_x21 - *(long *)(unaff_x23 + 0xf8);
code_r0x0066e388:
  if (uVar6 < 2) {
    uVar6 = 1;
  }
  return uVar6;
}

