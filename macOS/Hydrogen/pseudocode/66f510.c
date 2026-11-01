
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0066f510(ulong param_1,undefined8 param_2,char *param_3,ulong param_4)

{
  ulong uVar1;
  code *pcVar2;
  char in_NG;
  char in_OV;
  int iVar3;
  undefined8 uVar4;
  char *pcVar5;
  char *pcVar6;
  undefined8 *unaff_x20;
  undefined1 uStack0000000000000008;
  
  if (in_NG == in_OV) {
    param_4 = param_1;
  }
  if (param_4 != 0) {
    uVar1 = _UNK_008ba5e8;
    if (-1 < (char)UNK_008ba5f7) {
      uVar1 = (ulong)UNK_008ba5f7;
    }
    if (param_4 != uVar1) {
code_r0x0066f5a4:
      uVar4 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,"AuthenticatedDecryptionFilter");
      func_0x00674cac(uVar4,&uStack0000000000000008,param_3);
      ___cxa_throw(uVar4,&UNK_00a0d1a8,&DAT_0066ee68);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x66f5f4);
      (*pcVar2)();
    }
    pcVar5 = _UNK_008ba5e0;
    if (-1 < (char)UNK_008ba5f7) {
      pcVar5 = "AAD";
    }
    if (((uint)param_1 >> 7 & 1) == 0) {
      if ((uint)param_1 != 0) {
        pcVar6 = param_3;
        do {
          if (*pcVar6 != *pcVar5) goto code_r0x0066f5a4;
          pcVar6 = pcVar6 + 1;
          pcVar5 = pcVar5 + 1;
          param_1 = param_1 - 1;
        } while (param_1 != 0);
      }
    }
    else {
      iVar3 = _memcmp(*(undefined8 *)param_3);
      if (iVar3 != 0) goto code_r0x0066f5a4;
    }
  }
  *unaff_x20 = 0;
  return 0;
}

