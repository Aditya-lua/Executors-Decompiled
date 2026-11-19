/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902e0c
 */

void curl_easy_recv(long param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  char *pcVar5;
  undefined8 local_58;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uVar3 = FUN_0092f1bc();
  if ((uVar3 & 1) == 0) {
    if (param_1 == 0) {
      uVar4 = 0x2b;
    }
    else {
      if (*(char *)(param_1 + 0xa81) == '\0') {
        pcVar5 = "CONNECT_ONLY is required";
      }
      else {
        iVar2 = FUN_00908b60(param_1,&local_58);
        if (iVar2 != -1) {
          if (*(long *)(param_1 + 0x20) == 0) {
            FUN_0092bb60(param_1,local_58);
          }
          *param_4 = 0;
          uVar4 = FUN_00908350(param_1,0,param_2,param_3,&local_50);
          if ((int)uVar4 == 0) {
            *param_4 = local_50;
          }
          goto LAB_00902ed8;
        }
        pcVar5 = "Failed to get recent socket";
      }
      FUN_00904b80(param_1,pcVar5);
      uVar4 = 1;
    }
  }
  else {
    uVar4 = 0x5d;
  }
LAB_00902ed8:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

