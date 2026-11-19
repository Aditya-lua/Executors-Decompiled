/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00859330
 */

void FUN_00859330(long param_1,undefined4 param_2,long param_3)

{
  undefined7 *puVar1;
  undefined7 *puVar2;
  long lVar3;
  undefined8 local_90;
  undefined8 uStack_88;
  byte local_80;
  undefined7 uStack_7f;
  undefined7 *local_70;
  byte local_60;
  undefined7 uStack_5f;
  undefined7 *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  local_90 = 0;
  uStack_88 = 0;
  FUN_008521dc(&local_80,&local_90,param_2);
  FUN_008521fc(&local_60,&local_80);
                    /* try { // try from 00859380 to 0085938f has its CatchHandler @ 00859460 */
  FUN_008521fc(&local_80,param_1 + 0x90);
  puVar1 = local_50;
  if ((local_60 & 1) == 0) {
    puVar1 = &uStack_5f;
  }
  puVar2 = local_70;
  if ((local_80 & 1) == 0) {
    puVar2 = &uStack_7f;
  }
  if (param_3 == 0) {
    FUN_00860ecc(param_1,param_1 + 0x94,"Expected %s, got %s",puVar1,puVar2);
  }
  else {
                    /* try { // try from 008593b4 to 008593e7 has its CatchHandler @ 00859440 */
    FUN_00860ecc(param_1,param_1 + 0x94,"Expected %s when parsing %s, got %s",puVar1,param_3);
  }
  if ((local_80 & 1) != 0) {
    operator_delete(local_70,CONCAT71(uStack_7f,local_80) & 0xfffffffffffffffe);
  }
  if ((local_60 & 1) != 0) {
    operator_delete(local_50,CONCAT71(uStack_5f,local_60) & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

