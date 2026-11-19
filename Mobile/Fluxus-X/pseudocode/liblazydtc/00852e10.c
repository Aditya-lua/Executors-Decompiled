/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00852e10
 */

void FUN_00852e10(undefined8 *param_1,undefined8 param_2)

{
  long lVar1;
  void *pvVar2;
  size_t sVar3;
  long lVar4;
  char *local_58;
  undefined4 local_50;
  int iStack_4c;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 2;
  param_1[1] = 0x80;
  pvVar2 = operator_new(0x10);
  param_1[3] = pvVar2;
  __memset_chk(pvVar2,0,param_1[2] << 3,0x10);
  param_1[4] = 0;
  param_1[5] = 0;
  *(undefined1 *)(param_1 + 6) = 0x40;
                    /* try { // try from 00852e7c to 00852e83 has its CatchHandler @ 00852f08 */
  pvVar2 = operator_new(0x800);
  lVar4 = 0;
  *param_1 = pvVar2;
  param_1[4] = 0x80;
  *(undefined1 *)(param_1 + 6) = 0x39;
  param_1[7] = param_2;
  do {
    local_58 = (&PTR_DAT_00c4a540)[lVar4];
    sVar3 = strlen(local_58);
    iStack_4c = (int)lVar4 + 0x123;
    local_50 = (undefined4)sVar3;
                    /* try { // try from 00852ebc to 00852ed3 has its CatchHandler @ 00852f1c */
    FUN_00855340(param_1,&local_58);
    FUN_0085546c(param_1,&local_58);
    lVar4 = lVar4 + 1;
  } while (lVar4 != 0x15);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

