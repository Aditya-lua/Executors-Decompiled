/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916d64
 */

long * FUN_00916d64(long param_1,char *param_2,undefined4 param_3)

{
  long lVar1;
  char cVar2;
  long lVar3;
  int iVar4;
  size_t sVar5;
  long *plVar6;
  time_t tVar7;
  char *pcVar8;
  long lVar9;
  undefined1 auStack_160 [264];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  sVar5 = strlen(param_2);
  if (0xfe < sVar5) {
    sVar5 = 0xff;
  }
  FUN_00941848(auStack_160,param_2,sVar5);
  iVar4 = curl_msnprintf(auStack_160 + sVar5,7,&DAT_002b14f0,param_3);
  lVar1 = sVar5 + (long)iVar4;
  plVar6 = (long *)FUN_009167a8(*(undefined8 *)(param_1 + 0xb0),auStack_160,lVar1 + 1);
  if (plVar6 == (long *)0x0) {
    if ((*(byte *)(param_1 + 0x131e) & 1) == 0) goto LAB_00916f48;
    FUN_00941848(auStack_160,&DAT_002c8dbd,1);
    iVar4 = curl_msnprintf((ulong)auStack_160 | 1,7,&DAT_002b14f0,param_3);
    lVar1 = (long)iVar4 + 1;
    plVar6 = (long *)FUN_009167a8(*(undefined8 *)(param_1 + 0xb0),auStack_160,(long)iVar4 + 2);
  }
  if (plVar6 == (long *)0x0) goto LAB_00916f48;
  if (*(int *)(param_1 + 0x6e0) == -1) {
LAB_00916ea4:
    cVar2 = *(char *)(*(long *)(param_1 + 0x20) + 0x573);
    if (cVar2 == '\0') goto LAB_00916f48;
    lVar9 = *plVar6;
    iVar4 = 10;
    if (cVar2 != '\x02') {
      iVar4 = 2;
    }
    if (lVar9 != 0) {
      do {
        if (*(int *)(lVar9 + 4) == iVar4) goto LAB_00916f48;
        lVar9 = *(long *)(lVar9 + 0x28);
      } while (lVar9 != 0);
      if (param_1 == 0) goto LAB_00916f34;
    }
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      pcVar8 = "Hostname in DNS cache does not have needed family, zapped";
LAB_00916f2c:
      FUN_00904c98(param_1,pcVar8);
    }
  }
  else {
    tVar7 = time((time_t *)0x0);
    if ((plVar6[1] == 0) || (tVar7 - plVar6[1] < (long)*(int *)(param_1 + 0x6e0)))
    goto LAB_00916ea4;
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      pcVar8 = "Hostname in DNS cache was stale, zapped";
      goto LAB_00916f2c;
    }
  }
LAB_00916f34:
  FUN_009166fc(*(undefined8 *)(param_1 + 0xb0),auStack_160,lVar1 + 1);
  plVar6 = (long *)0x0;
LAB_00916f48:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar6;
}

