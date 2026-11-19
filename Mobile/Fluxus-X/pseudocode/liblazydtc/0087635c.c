/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087635c
 */

int FUN_0087635c(long param_1)

{
  long lVar1;
  ulong *puVar2;
  ulong *puVar3;
  long lVar4;
  ulong local_58;
  ulong uStack_50;
  undefined5 uStack_48;
  undefined3 local_43;
  undefined4 uStack_40;
  undefined1 uStack_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_58 = 0;
  uStack_50 = 0;
  uStack_40 = 0;
  uStack_3c = 0;
  uStack_48 = 0;
  local_43 = 0;
                    /* try { // try from 0087638c to 008763df has its CatchHandler @ 00876434 */
  FUN_0080269c(&local_58);
  puVar3 = *(ulong **)(param_1 + 0x210);
  if (puVar3 < *(ulong **)(param_1 + 0x218)) {
    puVar2 = puVar3 + 4;
    puVar3[2] = CONCAT35(local_43,uStack_48);
    puVar3[1] = uStack_50;
    *puVar3 = local_58;
    *(undefined1 *)((long)puVar3 + 0x1c) = uStack_3c;
    *(undefined4 *)(puVar3 + 3) = uStack_40;
    lVar4 = *(long *)(param_1 + 0x208);
    *(ulong **)(param_1 + 0x210) = puVar2;
  }
  else {
    puVar2 = (ulong *)FUN_0087a250(param_1 + 0x208,&local_58);
    lVar4 = *(long *)(param_1 + 0x208);
    *(ulong **)(param_1 + 0x210) = puVar2;
    if ((local_58 & 1) != 0) {
      operator_delete((void *)CONCAT35(local_43,uStack_48),local_58 & 0xfffffffffffffffe);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return (int)((ulong)((long)puVar2 - lVar4) >> 5) + -1;
}

