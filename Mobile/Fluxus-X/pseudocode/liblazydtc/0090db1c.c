/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090db1c
 */

void FUN_0090db1c(long param_1,long param_2)

{
  long lVar1;
  int iVar2;
  undefined4 *puVar3;
  undefined8 uVar4;
  ulong uVar5;
  char *pcVar6;
  long lVar7;
  undefined4 uVar8;
  long lVar9;
  socklen_t local_1cc;
  sockaddr asStack_1c8 [8];
  undefined1 auStack_148 [264];
  
  lVar1 = tpidr_el0;
  lVar7 = *(long *)(lVar1 + 0x28);
  lVar9 = *(long *)(param_1 + 0x10);
  iVar2 = *(int *)(lVar9 + 0x98);
  if ((iVar2 != -1) &&
     ((*(byte *)(*(long *)(*(long *)(param_2 + 0x20) + 0x3a8) + 0x8d) >> 3 & 1) == 0)) {
    local_1cc = 0x80;
    memset(asStack_1c8,0,0x80);
    iVar2 = getsockname(iVar2,asStack_1c8,&local_1cc);
    if (iVar2 == 0) {
      uVar5 = FUN_00908a98(asStack_1c8,local_1cc,lVar9 + 0xca,lVar9 + 0xfc);
      if ((uVar5 & 1) != 0) goto LAB_0090dc04;
      puVar3 = (undefined4 *)__errno();
      uVar8 = *puVar3;
      uVar4 = FUN_00941a94(uVar8,auStack_148,0x100);
      pcVar6 = "ssloc inet_ntop() failed with errno %d: %s";
    }
    else {
      puVar3 = (undefined4 *)__errno();
      uVar8 = *puVar3;
      uVar4 = FUN_00941a94(uVar8,auStack_148,0x100);
      pcVar6 = "getsockname() failed with errno %d: %s";
    }
    FUN_00904b80(param_2,pcVar6,uVar8,uVar4);
  }
LAB_0090dc04:
  if (*(long *)(lVar1 + 0x28) != lVar7) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

