/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00944e8c
 */

undefined4 FUN_00944e8c(uchar *param_1,void *param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  undefined4 uVar5;
  MD5_CTX MStack_a8;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  iVar2 = MD5_Init(&MStack_a8);
  uVar5 = 0x1b;
  iVar3 = 0;
  if (iVar2 != 0) {
    uVar5 = 0;
    uVar4 = FUN_00963a64(param_3);
    MD5_Update(&MStack_a8,param_2,uVar4 & 0xffffffff);
    iVar3 = MD5_Final(param_1,&MStack_a8);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar3);
  }
  return uVar5;
}

