/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7e8d0
 */

ulong mbedtls_mpi_write_file(char *param_1,undefined8 param_2,int param_3,FILE *param_4)

{
  long lVar1;
  uint uVar2;
  char *pcVar3;
  char *__n;
  size_t sVar4;
  ulong uVar5;
  undefined1 auStack_a18 [12];
  char acStack_a0c [2484];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (param_3 - 2U < 0xf) {
    memset(acStack_a0c,0,0x9b4);
    pcVar3 = (char *)mbedtls_mpi_write_string(param_2,param_3,acStack_a0c,0x9b2,auStack_a18);
    uVar5 = (ulong)pcVar3 & 0xffffffff;
    if ((int)pcVar3 == 0) {
      pcVar3 = "";
      if (param_1 != (char *)0x0) {
        pcVar3 = param_1;
      }
      __n = (char *)strlen(pcVar3);
      sVar4 = strlen(acStack_a0c);
      (acStack_a0c + sVar4)[0] = '\r';
      (acStack_a0c + sVar4)[1] = '\n';
      if (param_4 == (FILE *)0x0) {
        uVar2 = printf("%s%s",pcVar3,acStack_a0c);
        pcVar3 = (char *)(ulong)uVar2;
      }
      else {
        pcVar3 = (char *)fwrite(pcVar3,1,(size_t)__n,param_4);
        if ((pcVar3 != __n) ||
           (pcVar3 = (char *)fwrite(acStack_a0c,1,sVar4 + 2,param_4), pcVar3 != (char *)(sVar4 + 2))
           ) {
          uVar5 = 0xfffffffe;
        }
      }
    }
  }
  else {
    uVar5 = 0xfffffffc;
    pcVar3 = param_1;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(pcVar3);
  }
  return uVar5;
}

