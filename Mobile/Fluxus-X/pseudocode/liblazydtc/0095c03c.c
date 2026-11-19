/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095c03c
 */

int FUN_0095c03c(long param_1)

{
  long lVar1;
  int iVar2;
  char *pcVar3;
  size_t sVar4;
  char *pcVar5;
  long lVar6;
  undefined8 local_58;
  undefined8 uStack_50;
  char *local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar6 = *(long *)(param_1 + 0x20);
  uStack_40 = 0;
  local_48 = (char *)0x0;
  uStack_50 = 0;
  local_58 = 0;
  pcVar5 = (char *)**(undefined8 **)(*(long *)(param_1 + 0x1a0) + 0x10);
  pcVar3 = pcVar5 + 1;
  if (*pcVar5 != '<') {
    pcVar3 = pcVar5;
  }
  pcVar3 = (char *)(*(code *)PTR_strdup_00cc4688)(pcVar3);
  if (pcVar3 == (char *)0x0) {
    iVar2 = 0x1b;
    goto LAB_0095c15c;
  }
  sVar4 = strlen(pcVar3);
  if ((sVar4 != 0) && (pcVar3[sVar4 - 1] == '>')) {
    pcVar3[sVar4 - 1] = '\0';
  }
  local_48 = strchr(pcVar3,0x40);
  if (local_48 == (char *)0x0) {
    local_48 = (char *)0x0;
LAB_0095c120:
    iVar2 = FUN_009453ec(param_1,lVar6 + 0x428,"RCPT TO:<%s>",pcVar3);
  }
  else {
    *local_48 = '\0';
    local_48 = local_48 + 1;
    FUN_0095c6d4(&local_58);
    if (local_48 == (char *)0x0) goto LAB_0095c120;
    iVar2 = FUN_009453ec(param_1,lVar6 + 0x428,"RCPT TO:<%s@%s>",pcVar3);
  }
  (*(code *)PTR_free_00cc4678)(pcVar3);
  if (iVar2 == 0) {
    *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4e8) = 9;
  }
LAB_0095c15c:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

