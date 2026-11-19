/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902700
 */

void curl_easy_cleanup(int *param_1)

{
  long lVar1;
  uint uVar2;
  int *local_80;
  _union_1457 local_78 [2];
  undefined8 local_68;
  undefined8 uStack_60;
  byte local_58;
  _union_1457 local_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_80 = param_1;
  if ((param_1 != (int *)0x0) && (*param_1 == -0x3f212453)) {
    local_58 = (byte)((uint)*(int *)((long)param_1 + 0xa82) >> 0x1f);
    if (-1 < *(int *)((long)param_1 + 0xa82)) {
      sigaction(0xd,(sigaction *)0x0,(sigaction *)local_78);
      local_50.sa_handler = local_78[0].sa_handler;
      uStack_38 = uStack_60;
      uStack_40 = local_68;
      uStack_48 = 1;
      sigaction(0xd,(sigaction *)&local_50,(sigaction *)0x0);
    }
    param_1 = (int *)FUN_00946590(&local_80);
    if (local_58 == 0) {
      uVar2 = sigaction(0xd,(sigaction *)local_78,(sigaction *)0x0);
      param_1 = (int *)(ulong)uVar2;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1);
  }
  return;
}

