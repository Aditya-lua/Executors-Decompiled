/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009049b8
 */

void FUN_009049b8(undefined8 param_1,FILE *param_2)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  char *__s;
  size_t sVar4;
  char acStack_c8 [128];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  FUN_0090456c();
  do {
    __s = fgets(acStack_c8,0x80,param_2);
    bVar2 = false;
    if ((__s == (char *)0x0) || (sVar4 = strlen(__s), bVar2 = false, sVar4 == 0)) goto LAB_00904a6c;
    iVar3 = FUN_009045fc(param_1,__s,sVar4);
    if (iVar3 != 0) {
      bVar2 = false;
      goto LAB_00904a6c;
    }
    if (__s[sVar4 - 1] == '\n') {
      bVar2 = true;
      goto LAB_00904a6c;
    }
    iVar3 = feof(param_2);
  } while (iVar3 == 0);
  iVar3 = FUN_009045fc(param_1,&DAT_002c4dae,1);
  bVar2 = iVar3 == 0;
LAB_00904a6c:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar2);
  }
  return;
}

