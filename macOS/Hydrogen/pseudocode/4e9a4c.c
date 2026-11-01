
void FUN_004e9a4c(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 uStack000000000000003f;
  
  lVar5 = *(long *)(*(long *)*param_2 + 0x90);
  if (lVar5 != 0) {
    lVar6 = *(long *)(*(long *)*param_2 + 0x88);
    uVar1 = *param_3;
    lVar2 = param_3[1];
    lVar5 = lVar5 * 600;
    do {
      if ((*(long *)(lVar6 + 0x220) == lVar2) &&
         (iVar4 = _memcmp(*(undefined8 *)(lVar6 + 0x218),uVar1,lVar2), iVar4 == 0)) {
        uStack0000000000000008 = 0;
        in_stack_00000010 = 1;
        in_stack_00000030 = 0xe0000020;
        uStack0000000000000020 = &uStack0000000000000008;
        in_stack_00000018 = 0;
        in_stack_00000028 = &UNK_009e8008;
        iVar4 = func_0x0050f9f0(lVar6,&uStack0000000000000020);
        if (iVar4 != 0) {
          func_0x007a2810(&UNK_008a36e0,0x37,&uStack000000000000003f,&UNK_009e8068,&UNK_009e8038);
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x4e9b3c);
          (*pcVar3)();
        }
        param_1[1] = in_stack_00000010;
        *param_1 = uStack0000000000000008;
        param_1[2] = in_stack_00000018;
        return;
      }
      lVar6 = lVar6 + 600;
      lVar5 = lVar5 + -600;
    } while (lVar5 != 0);
  }
  *param_1 = 0x8000000000000000;
  return;
}

