/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7e730
 */

void mbedtls_mpi_read_file(undefined8 param_1,int param_2,FILE *param_3)

{
  byte bVar1;
  long lVar2;
  undefined8 uVar3;
  char *pcVar4;
  size_t sVar5;
  long lVar6;
  ulong uVar7;
  char acStack_9fe [2494];
  
  lVar2 = tpidr_el0;
  lVar6 = *(long *)(lVar2 + 0x28);
  if (0xe < param_2 - 2U) {
    uVar3 = 0xfffffffc;
    goto LAB_00b7e8a4;
  }
  memset(acStack_9fe + 2,0,0x9b4);
  pcVar4 = fgets(acStack_9fe + 2,0x9b3,param_3);
  if (pcVar4 == (char *)0x0) {
    uVar3 = 0xfffffffe;
    goto LAB_00b7e8a4;
  }
  sVar5 = strlen(acStack_9fe + 2);
  if (sVar5 == 0) {
    pcVar4 = acStack_9fe + 2;
    goto LAB_00b7e81c;
  }
  if (sVar5 == 0x9b2) {
    uVar3 = 0xfffffff8;
    goto LAB_00b7e8a4;
  }
  pcVar4 = acStack_9fe + sVar5 + 1;
  if (*pcVar4 == '\n') {
    pcVar4 = acStack_9fe + 2;
    acStack_9fe[sVar5 + 1] = '\0';
    if (sVar5 - 1 != 0) {
      pcVar4 = acStack_9fe + sVar5;
      sVar5 = sVar5 - 1;
      if (*pcVar4 == '\r') goto LAB_00b7e818;
LAB_00b7e800:
      pcVar4 = acStack_9fe + sVar5 + 2;
    }
  }
  else {
    if (*pcVar4 != '\r') goto LAB_00b7e800;
LAB_00b7e818:
    *pcVar4 = '\0';
  }
LAB_00b7e81c:
  do {
    while( true ) {
      if (pcVar4 <= acStack_9fe + 2) goto LAB_00b7e898;
      bVar1 = pcVar4[-1];
      uVar7 = (ulong)bVar1;
      pcVar4 = pcVar4 + -1;
      if (9 < bVar1 - 0x30) break;
      uVar7 = uVar7 - 0x30;
joined_r0x00b7e884:
      if ((ulong)(long)param_2 <= uVar7) goto LAB_00b7e898;
    }
    if ((bVar1 - 0x41 & 0xff) < 6) {
      uVar7 = uVar7 - 0x37;
      goto joined_r0x00b7e884;
    }
    if (bVar1 - 0x61 < 6) {
      uVar7 = uVar7 - 0x57;
      goto joined_r0x00b7e884;
    }
  } while (0xff < (ulong)(long)param_2);
LAB_00b7e898:
  uVar3 = mbedtls_mpi_read_string(param_1,param_2);
LAB_00b7e8a4:
  if (*(long *)(lVar2 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

