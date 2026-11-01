
long * FUN_007a01c4(undefined8 param_1)

{
  byte bVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  long *plVar5;
  byte *pbVar6;
  undefined8 extraout_x8;
  code *in_x9;
  undefined8 extraout_x12;
  code *unaff_x21;
  byte unaff_w22;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  if (lRam0000000000a3bfe0 == -1) {
    func_0x007a0378();
    uStack0000000000000008 = &UNK_009d9f88;
    in_stack_00000010 = 1;
    in_stack_00000020 = 0;
    in_stack_00000028 = 0;
    in_stack_00000018 = 8;
    func_0x007a2420(&uStack0000000000000008,&UNK_009d9f98);
  }
  else {
    lRam0000000000a3bfe0 = lRam0000000000a3bfe0 + 1;
    puVar4 = (undefined8 *)(*in_x9)(param_1);
    *puVar4 = extraout_x12;
    uStack0000000000000008 = (undefined *)0x8000000000000000;
    plVar5 = (long *)func_0x00412b1c(extraout_x12,&uStack0000000000000008);
    pbVar6 = (byte *)(*pcRam0000000000a2bca0)();
    bVar1 = *pbVar6;
    *pbVar6 = unaff_w22;
    if ((bVar1 & 1) == 0) {
      __tlv_atexit(&DAT_0043837c,0);
    }
    lVar3 = *plVar5;
    *plVar5 = lVar3 + 1;
    if (-1 < lVar3) {
      puVar4 = (undefined8 *)(*unaff_x21)(plVar5 + 2);
      *puVar4 = extraout_x8;
      return plVar5;
    }
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x7a02f0);
  (*pcVar2)();
}

