/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84e44
 */

undefined4 FUN_00a84e44(char *param_1)

{
  char *pcVar1;
  int iVar2;
  char *pcVar3;
  undefined4 uVar4;
  char acStack_28 [8];
  
  pcVar3 = strchr(param_1,0x3a);
  if (pcVar3 != (char *)0x0) {
    iVar2 = strncmp(param_1,"CMP ",4);
    pcVar1 = param_1 + 4;
    if (iVar2 != 0) {
      pcVar1 = param_1;
    }
    if ((int)((long)pcVar3 - (long)pcVar1) < 6) {
      OPENSSL_strlcpy(acStack_28,pcVar1,((long)pcVar3 - (long)pcVar1 << 0x20) + 0x100000000 >> 0x20)
      ;
      iVar2 = strcmp(acStack_28,"EMERG");
      if (iVar2 == 0) {
        return 0;
      }
      iVar2 = strcmp(acStack_28,"ALERT");
      if (iVar2 == 0) {
        return 1;
      }
      iVar2 = strcmp(acStack_28,"CRIT");
      if (iVar2 == 0) {
        return 2;
      }
      iVar2 = strcmp(acStack_28,"ERROR");
      if (iVar2 == 0) {
        return 3;
      }
      iVar2 = strcmp(acStack_28,"WARN");
      if (iVar2 == 0) {
        return 4;
      }
      iVar2 = strcmp(acStack_28,"NOTE");
      if (iVar2 == 0) {
        return 5;
      }
      iVar2 = strcmp(acStack_28,"INFO");
      if (iVar2 == 0) {
        return 6;
      }
      iVar2 = strcmp(acStack_28,"DEBUG");
      uVar4 = 7;
      if (iVar2 != 0) {
        uVar4 = 0xffffffff;
      }
      return uVar4;
    }
  }
  return 0xffffffff;
}

