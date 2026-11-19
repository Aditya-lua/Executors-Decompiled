/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092c32c
 */

void curl_multi_wakeup(int *param_1)

{
  char cVar1;
  long lVar2;
  ssize_t sVar3;
  undefined8 uVar4;
  int *piVar5;
  undefined1 local_3c [4];
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar4 = 1;
  }
  else if (param_1[0x89] == -1) {
LAB_0092c408:
    uVar4 = 9;
  }
  else {
    local_3c[0] = 1;
    sVar3 = write(param_1[0x89],local_3c,1);
    uVar4 = 0;
    if (sVar3 < 0) {
      piVar5 = (int *)__errno(0);
      do {
        cVar1 = '\x02';
        if (*piVar5 != 4) {
          cVar1 = *piVar5 != 0xb;
        }
        if (cVar1 != '\x02') {
          uVar4 = 0;
          if (cVar1 != '\0') goto LAB_0092c408;
          goto LAB_0092c3dc;
        }
        sVar3 = write(param_1[0x89],local_3c,1);
      } while (sVar3 < 0);
      uVar4 = 0;
    }
  }
LAB_0092c3dc:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

