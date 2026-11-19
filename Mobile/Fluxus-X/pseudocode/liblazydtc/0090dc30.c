/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090dc30
 */

void FUN_0090dc30(long param_1,long param_2,int param_3,undefined4 *param_4)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined4 *puVar4;
  ulong uVar5;
  char *pcVar6;
  long lVar7;
  long *plVar8;
  undefined4 uVar9;
  long lVar10;
  long lVar11;
  undefined1 auVar12 [16];
  socklen_t local_1f4;
  sockaddr asStack_1f0 [8];
  undefined1 auStack_170 [272];
  
  lVar1 = tpidr_el0;
  lVar7 = *(long *)(lVar1 + 0x28);
  plVar8 = *(long **)(param_2 + (long)param_3 * 8 + 0x248);
  if ((plVar8 == (long *)0x0) || ((undefined **)*plVar8 != &PTR_s_TCP_ACCEPT_00cc4a88)) {
    uVar3 = 2;
    goto LAB_0090dc90;
  }
  lVar10 = plVar8[2];
  lVar11 = *(long *)(param_2 + 0x18);
  iVar2 = *(int *)(lVar10 + 0x98);
  FUN_0092e498(param_1,iVar2);
  if (lVar11 == 0) {
    close(iVar2);
  }
  else {
    FUN_0092f198(param_1,1);
    (**(code **)(param_2 + 0x18))(*(undefined8 *)(param_2 + 0x20),iVar2);
    FUN_0092f198(param_1,0);
  }
  uVar9 = *param_4;
  *(undefined4 *)(lVar10 + 0x98) = uVar9;
  *(undefined4 *)(param_2 + (long)param_3 * 4 + 0x220) = uVar9;
  lVar11 = plVar8[2];
  *(undefined4 *)(lVar11 + 0xf8) = 0;
  *(undefined1 *)(lVar11 + 0x9c) = 0;
  local_1f4 = 0x80;
  memset(asStack_1f0,0,0x80);
  iVar2 = getpeername(*(int *)(lVar11 + 0x98),asStack_1f0,&local_1f4);
  if (iVar2 == 0) {
    uVar5 = FUN_00908a98(asStack_1f0,local_1f4,(undefined1 *)(lVar11 + 0x9c),
                         (undefined4 *)(lVar11 + 0xf8));
    if ((uVar5 & 1) == 0) {
      puVar4 = (undefined4 *)__errno();
      uVar9 = *puVar4;
      uVar3 = FUN_00941a94(uVar9,auStack_170,0x100);
      pcVar6 = "ssrem inet_ntop() failed with errno %d: %s";
      goto LAB_0090ddc0;
    }
  }
  else {
    puVar4 = (undefined4 *)__errno();
    uVar9 = *puVar4;
    uVar3 = FUN_00941a94(uVar9,auStack_170,0x100);
    pcVar6 = "getpeername() failed with errno %d: %s";
LAB_0090ddc0:
    FUN_00904b80(param_1,pcVar6,uVar9,uVar3);
  }
  FUN_0090db1c(plVar8,param_1);
  *(byte *)(lVar10 + 0x134) = *(byte *)(lVar10 + 0x134) | 10;
  auVar12 = FUN_00941cb8();
  *(undefined1 (*) [16])(lVar10 + 0x110) = auVar12;
  *(byte *)((long)plVar8 + 0x24) = *(byte *)((long)plVar8 + 0x24) | 1;
  if (param_1 != 0) {
    uVar3 = 0;
    if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0090dc90;
    if (((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
       (0 < *(int *)(*plVar8 + 0xc))) {
      FUN_00904ddc(param_1,plVar8,"accepted_set(sock=%d, remote=%s port=%d)",
                   *(undefined4 *)(lVar10 + 0x98),lVar10 + 0x9c,*(undefined4 *)(lVar10 + 0xf8));
    }
  }
  uVar3 = 0;
LAB_0090dc90:
  if (*(long *)(lVar1 + 0x28) != lVar7) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

