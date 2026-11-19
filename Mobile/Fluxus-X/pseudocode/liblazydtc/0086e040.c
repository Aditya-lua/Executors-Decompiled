/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086e040
 */

void FUN_0086e040(long param_1,long param_2)

{
  undefined7 *puVar1;
  long lVar2;
  byte local_50;
  undefined7 uStack_4f;
  undefined7 *local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if (param_2 == 0) {
    FUN_008521fc(&local_50,param_1 + 0x90);
    puVar1 = local_40;
    if ((local_50 & 1) == 0) {
      puVar1 = &uStack_4f;
    }
                    /* try { // try from 0086e0cc to 0086e0df has its CatchHandler @ 0086e11c */
    FUN_00860ecc(param_1,param_1 + 0x94,"Expected identifier, got %s",puVar1);
  }
  else {
    FUN_008521fc(&local_50,param_1 + 0x90);
    puVar1 = local_40;
    if ((local_50 & 1) == 0) {
      puVar1 = &uStack_4f;
    }
                    /* try { // try from 0086e08c to 0086e0a3 has its CatchHandler @ 0086e120 */
    FUN_00860ecc(param_1,param_1 + 0x94,"Expected identifier when parsing %s, got %s",param_2,puVar1
                );
  }
  if ((local_50 & 1) != 0) {
    operator_delete(local_40,CONCAT71(uStack_4f,local_50) & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

