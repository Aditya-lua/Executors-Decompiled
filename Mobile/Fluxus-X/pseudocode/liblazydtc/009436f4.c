/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009436f4
 */

int FUN_009436f4(long param_1,undefined1 *param_2)

{
  long lVar1;
  int iVar2;
  char *pcVar3;
  undefined4 *puVar4;
  char *pcVar5;
  long lVar6;
  byte local_4c [4];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  *param_2 = 0;
  iVar2 = FUN_0091583c(*(long *)(param_1 + 0x11a8) + 1,0,*(long *)(param_1 + 0x1a0) + 8,0,3);
  if ((iVar2 != 0) ||
     ((*(long *)(param_1 + 0x818) != 0 &&
      (iVar2 = FUN_0091583c(*(long *)(param_1 + 0x818),0,*(long *)(param_1 + 0x1a0) + 0x10,0,3),
      iVar2 != 0)))) goto LAB_0094374c;
  *(undefined8 *)(param_1 + 0xd8) = 0xffffffffffffffff;
  FUN_00931fec(param_1,0);
  FUN_00931fe0(param_1,0);
  FUN_00931c50(param_1,0xffffffffffffffff);
  FUN_00931c24(param_1,0xffffffffffffffff);
  if (*(char *)(param_1 + 0x1b2) < '\0') {
    **(undefined4 **)(param_1 + 0x1a0) = 1;
  }
  *param_2 = 0;
  puVar4 = *(undefined4 **)(param_1 + 0x1a0);
  lVar6 = *(long *)(param_1 + 0x20);
  if (**(char **)(puVar4 + 2) == '\0') {
    pcVar3 = *(char **)(puVar4 + 4);
    if (pcVar3 == (char *)0x0) {
LAB_0094388c:
      pcVar3 = "LIST";
    }
    else {
LAB_00943838:
      if (*pcVar3 == '\0') goto LAB_0094388c;
    }
    iVar2 = FUN_009453ec(param_1,lVar6 + 0x428,&DAT_002b6c62,pcVar3);
  }
  else {
    if ((*(byte *)(param_1 + 0xa83) >> 3 & 1) == 0) {
      pcVar3 = *(char **)(puVar4 + 4);
      pcVar5 = "RETR";
      if (pcVar3 == (char *)0x0) goto LAB_00943868;
LAB_00943820:
      if (*pcVar3 == '\0') goto LAB_00943868;
    }
    else {
      *puVar4 = 1;
      pcVar3 = *(char **)(puVar4 + 4);
      if (**(char **)(puVar4 + 2) == '\0') {
        if (pcVar3 != (char *)0x0) goto LAB_00943838;
        goto LAB_0094388c;
      }
      pcVar5 = "LIST";
      if (pcVar3 != (char *)0x0) goto LAB_00943820;
LAB_00943868:
      pcVar3 = pcVar5;
    }
    iVar2 = FUN_009453ec(param_1,lVar6 + 0x428,"%s %s",pcVar3);
  }
  if (iVar2 != 0) goto LAB_0094374c;
  lVar6 = *(long *)(param_1 + 0x20);
  *(undefined4 *)(lVar6 + 0x4c8) = 9;
  if (((*(byte *)(*(long *)(lVar6 + 0x3a8) + 0x94) & 1) == 0) ||
     ((*(byte *)(lVar6 + 0x50a) & 1) != 0)) {
LAB_00943908:
    iVar2 = FUN_009450b4(param_1,lVar6 + 0x428,0,0);
    *param_2 = *(int *)(lVar6 + 0x4c8) == 0;
  }
  else {
    local_4c[0] = 0;
    iVar2 = FUN_00907508(param_1,0,0,local_4c);
    *(byte *)(lVar6 + 0x50a) = *(byte *)(lVar6 + 0x50a) & 0xfe | local_4c[0];
    if ((iVar2 == 0) && (local_4c[0] != 0)) goto LAB_00943908;
  }
  FUN_009077cc(*(undefined8 *)(param_1 + 0x20),0);
LAB_0094374c:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

