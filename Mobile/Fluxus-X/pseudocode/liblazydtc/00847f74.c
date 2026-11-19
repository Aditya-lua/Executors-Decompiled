/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00847f74
 */

char * FUN_00847f74(undefined8 param_1,char *param_2,char *param_3,ulong *param_4)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  char *pcVar4;
  ulong local_50;
  ulong uStack_48;
  ulong local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  lVar3 = ((long)param_3 - (long)param_2) + -2;
  if (1 < (long)param_3 - (long)param_2) {
    pcVar4 = param_2;
    while ((*pcVar4 != '.' || (pcVar4[1] != ']'))) {
      if (lVar3 == 0) goto LAB_0084805c;
      lVar3 = lVar3 + -1;
      pcVar4 = pcVar4 + 1;
    }
    if (pcVar4 != param_3) {
      FUN_00848aa8(&local_50,param_1,param_2,pcVar4,0);
      if ((*param_4 & 1) != 0) {
        operator_delete((void *)param_4[2],*param_4 & 0xfffffffffffffffe);
      }
      param_4[1] = uStack_48;
      *param_4 = local_50;
      uVar1 = (ulong)(byte)((byte)*param_4 >> 1);
      if (((byte)*param_4 & 1) != 0) {
        uVar1 = param_4[1];
      }
      param_4[2] = local_40;
      if (1 < uVar1 - 1) goto LAB_00848070;
      if (*(long *)(lVar2 + 0x28) == local_38) {
        return pcVar4 + 2;
      }
      goto LAB_00848084;
    }
  }
LAB_0084805c:
  if (*(long *)(lVar2 + 0x28) == local_38) {
    FUN_00847644();
LAB_00848070:
    if (*(long *)(lVar2 + 0x28) == local_38) {
      FUN_00848a5c();
    }
  }
LAB_00848084:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

