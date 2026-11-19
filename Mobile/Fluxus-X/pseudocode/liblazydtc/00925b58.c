/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925b58
 */

void FUN_00925b58(int param_1,undefined8 param_2,undefined8 param_3,char *param_4,char *param_5,
                 socklen_t param_6)

{
  size_t __n;
  long lVar1;
  int __fd;
  int iVar2;
  size_t sVar3;
  char *pcVar4;
  undefined4 uVar5;
  undefined4 local_88 [2];
  undefined1 uStack_80;
  undefined1 auStack_7f [15];
  ushort local_70;
  undefined4 local_6c;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar5 = 0;
  if ((param_1 == 2) && (param_4 != (char *)0x0)) {
    sVar3 = strlen(param_4);
    uVar5 = 0;
    if (sVar3 < 0x10) {
      __fd = socket(2,1,0);
      if (__fd != -1) {
        __n = 0;
        if (sVar3 + 1 < 0x28) {
          __n = 0x27 - sVar3;
        }
        memset(auStack_7f + sVar3,0,__n);
        memcpy(&uStack_80,param_4,sVar3 + 1);
        local_70 = 2;
        iVar2 = ioctl(__fd,0x8915,&uStack_80);
        if (-1 < iVar2) {
          local_88[0] = local_6c;
          pcVar4 = inet_ntop((uint)local_70,local_88,param_5,param_6);
          close(__fd);
          uVar5 = 0;
          if (pcVar4 != (char *)0x0) {
            uVar5 = 2;
          }
          goto LAB_00925c68;
        }
        close(__fd);
      }
      uVar5 = 0;
    }
  }
LAB_00925c68:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

