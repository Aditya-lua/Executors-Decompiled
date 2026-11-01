
void FUN_0017376c(long *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  long *plVar5;
  undefined8 uStack0000000000000010;
  char cStack0000000000000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  
  plVar5 = *(long **)(param_2 + 0x30);
  do {
    func_0x003ef080(&uStack0000000000000010,param_2,&UNK_009be058);
    if ((uStack0000000000000010 & 1) == 0) {
      do {
        if (in_stack_00000020 == -0x8000000000000000) goto LAB_00173840;
        if (cStack0000000000000018 == '\0') {
          _cStack0000000000000018 = in_stack_00000030;
          uStack0000000000000010 = in_stack_00000028;
          goto LAB_00173850;
        }
        if (in_stack_00000020 != 0) {
          func_0x00187bd4(in_stack_00000028,in_stack_00000020,1);
        }
        func_0x003ef080(&uStack0000000000000010,param_2,&UNK_009be058);
      } while ((int)uStack0000000000000010 != 1);
    }
    lVar4 = in_stack_00000030;
    uVar3 = in_stack_00000028;
    lVar2 = in_stack_00000020;
    lVar1 = _cStack0000000000000018;
    if (_cStack0000000000000018 == 6) {
LAB_00173840:
      in_stack_00000020 = -0x7fffffffffffffff;
      goto LAB_00173858;
    }
    if (_cStack0000000000000018 != 5) {
      if (*plVar5 != 5) {
        func_0x00174248(plVar5);
      }
      *plVar5 = lVar1;
      plVar5[1] = lVar2;
      plVar5[3] = lVar4;
      plVar5[2] = uVar3;
      in_stack_00000020 = -0x7fffffffffffffff;
      goto LAB_00173858;
    }
    if (in_stack_00000020 != -0x7fffffffffffffff) {
      _cStack0000000000000018 = in_stack_00000030;
      uStack0000000000000010 = in_stack_00000028;
      if (in_stack_00000020 != -0x7ffffffffffffffe) {
LAB_00173850:
        param_1[2] = _cStack0000000000000018;
        param_1[1] = uStack0000000000000010;
LAB_00173858:
        *param_1 = in_stack_00000020;
        return;
      }
    }
  } while( true );
}

