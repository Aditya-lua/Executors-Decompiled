
void FUN_005db844(undefined8 *param_1,long *param_2,long *param_3,long *param_4)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long *plStack0000000000000008;
  long *plStack0000000000000010;
  long *plStack0000000000000018;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000048;
  
  plStack0000000000000008 = param_2;
  plStack0000000000000010 = param_3;
  plStack0000000000000018 = param_4;
  puVar3 = (undefined8 *)func_0x00187bd0(0x48,8);
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x48);
  }
  else {
    lVar2 = *param_2;
    *param_2 = lVar2 + 1;
    if (lVar2 < 0) {
      func_0x007a05dc();
    }
    else {
      lVar2 = *param_3;
      *param_3 = lVar2 + 1;
      if (lVar2 < 0) {
        func_0x007a05dc();
      }
      else {
        lVar2 = *param_4;
        *param_4 = lVar2 + 1;
        if (lVar2 < 0) {
          func_0x007a05dc();
        }
        else {
          puVar3[1] = param_2;
          *puVar3 = 0x8000000000000000;
          puVar3[2] = in_stack_00000030;
          puVar3[4] = param_3;
          puVar3[3] = 0x8000000000000000;
          puVar3[5] = in_stack_00000048;
          puVar3[6] = 0x8000000000000000;
          puVar3[7] = param_4;
          puVar4 = (undefined8 *)func_0x00187bd0(0xc0,8);
          if (puVar4 != (undefined8 *)0x0) {
            *puVar4 = 0;
            puVar4[1] = param_2;
            puVar4[8] = 0;
            puVar4[9] = param_3;
            puVar4[0x10] = 0;
            puVar4[0x11] = param_4;
            param_1[1] = puVar3;
            *param_1 = 3;
            param_1[2] = 3;
            param_1[3] = 3;
            param_1[4] = puVar4;
            param_1[5] = 3;
            *(undefined2 *)(param_1 + 6) = 0;
            return;
          }
          func_0x007a1f18(8,0xc0);
        }
      }
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5db970);
  (*pcVar1)();
}

