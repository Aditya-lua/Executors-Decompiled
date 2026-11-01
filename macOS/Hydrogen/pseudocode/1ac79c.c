
void FUN_001ac79c(undefined8 *param_1,long param_2)

{
  short *psVar1;
  long lVar2;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if (*(long *)(param_2 + 0x10) != 0) {
    psVar1 = (short *)(*(long *)(param_2 + 8) + 0x20);
    lVar2 = *(long *)(param_2 + 0x10) * 0x28;
    do {
      if (0xe < *(byte *)(psVar1 + -0x10)) {
        if (*(byte *)(psVar1 + -0x10) != 0x10) {
          func_0x001a24cc(&uStack0000000000000008,psVar1 + -0xc);
          param_1[1] = in_stack_00000010;
          *param_1 = uStack0000000000000008;
          param_1[2] = in_stack_00000018;
          return;
        }
        if (*psVar1 == 0x28) break;
      }
      psVar1 = psVar1 + 0x14;
      lVar2 = lVar2 + -0x28;
    } while (lVar2 != 0);
  }
  *param_1 = 0x8000000000000000;
  return;
}

