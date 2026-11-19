/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b6de4
 */

void FUN_008b6de4(long param_1,undefined8 param_2)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  char *pcVar4;
  char *pcVar5;
  int local_60;
  int local_5c;
  char *local_58;
  uint local_50;
  undefined4 uStack_4c;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  FUN_008b8780(param_2,&local_50,&local_58,&local_5c,&local_60);
  pcVar4 = (char *)CONCAT44(uStack_4c,local_50);
  pcVar5 = pcVar4;
  if (pcVar4 != local_58) {
    bVar1 = *(byte *)(*(long *)(param_1 + 0x60) + 2);
    do {
      if (*pcVar5 != '\0') {
        if ((byte)((pcVar5[2] ^ 3U) & (bVar1 ^ 3)) == 0) {
          FUN_008b6448(param_1,pcVar5,param_2);
          local_5c = local_5c + -1;
          if (local_5c == 0) {
            iVar2 = 0;
            if (local_60 != 0) {
              iVar2 = (int)((int)pcVar5 - local_50) / local_60;
            }
            iVar2 = iVar2 + 1;
            goto LAB_008b6ed0;
          }
        }
        else {
          pcVar5[2] = pcVar5[2] & 0xf8U | bVar1 & 3;
        }
      }
      pcVar5 = pcVar5 + local_60;
    } while (pcVar5 != local_58);
    pcVar4 = (char *)(ulong)local_50;
  }
  iVar2 = 0;
  if (local_60 != 0) {
    iVar2 = ((int)pcVar5 - (int)pcVar4) / local_60;
  }
LAB_008b6ed0:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar2);
  }
  return;
}

