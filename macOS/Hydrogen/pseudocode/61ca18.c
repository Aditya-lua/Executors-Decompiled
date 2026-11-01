
void FUN_0061ca18(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  ulong uVar4;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined2 uVar5;
  ulong in_stack_00000000;
  undefined1 uStack0000000000000008;
  
  while( true ) {
    (**(code **)(*unaff_x23 + 0x30))();
    func_0x00685528(unaff_x26,unaff_x27,*(undefined8 *)(unaff_x20 + 0x60));
    unaff_x28 = unaff_x28 + unaff_x24;
    unaff_x19 = unaff_x19 - unaff_x24;
    if (unaff_x19 < unaff_x24) break;
    unaff_x26 = unaff_x22 + unaff_x28;
    unaff_x27 = unaff_x21 + unaff_x28;
  }
  if (unaff_x19 != 0) {
    if (-in_stack_00000000 < unaff_x19) {
      uVar3 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,"RoundUpToMultipleOf: integer overflow");
      func_0x0002703c(uVar3,&uStack0000000000000008);
      ___cxa_throw(uVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x61cb48);
      (*pcVar2)();
    }
    uVar4 = (in_stack_00000000 + unaff_x19) - 1;
    uVar3 = CONCAT17(POPCOUNT((char)(in_stack_00000000 >> 0x38)),
                     CONCAT16(POPCOUNT((char)(in_stack_00000000 >> 0x30)),
                              CONCAT15(POPCOUNT((char)(in_stack_00000000 >> 0x28)),
                                       CONCAT14(POPCOUNT((char)(in_stack_00000000 >> 0x20)),
                                                CONCAT13(POPCOUNT((char)(in_stack_00000000 >> 0x18))
                                                         ,CONCAT12(POPCOUNT((char)(in_stack_00000000
                                                                                  >> 0x10)),
                                                                   CONCAT11(POPCOUNT((char)(
                                                  in_stack_00000000 >> 8)),
                                                  POPCOUNT((char)in_stack_00000000))))))));
    uVar5 = NEON_uaddlv(uVar3,1);
    uVar1 = 0;
    if (in_stack_00000000 != 0) {
      uVar1 = uVar4 / in_stack_00000000;
    }
    uVar1 = uVar1 * in_stack_00000000;
    if ((CONCAT62((int6)((ulong)uVar3 >> 0x10),uVar5) & 0xffffffff) == 1) {
      uVar1 = uVar4 & -in_stack_00000000;
    }
    (**(code **)(*unaff_x23 + 0x30))();
    func_0x00685528(unaff_x22 + unaff_x28,unaff_x21 + unaff_x28,
                    (*(long *)(unaff_x20 + 0x60) + *(long *)(unaff_x20 + 0x58)) - uVar1,unaff_x19);
    *(ulong *)(unaff_x20 + 0x68) = uVar1 - unaff_x19;
  }
  return;
}

