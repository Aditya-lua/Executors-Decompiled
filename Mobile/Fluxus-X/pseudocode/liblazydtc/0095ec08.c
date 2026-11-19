/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095ec08
 */

undefined8 FUN_0095ec08(long param_1,long param_2)

{
  char cVar1;
  char *pcVar2;
  uint uVar3;
  
  *(undefined1 *)(param_2 + 0x572) = 4;
  pcVar2 = strstr(*(char **)(param_1 + 0x11a8),";mode=");
  if ((pcVar2 != (char *)0x0) ||
     (pcVar2 = strstr(*(char **)(param_2 + 0x40),";mode="), pcVar2 != (char *)0x0)) {
    *pcVar2 = '\0';
    cVar1 = FUN_009416cc(pcVar2[6]);
    if ((cVar1 == 'N') || (cVar1 == 'A')) {
      uVar3 = *(uint *)(param_1 + 0x131c) | 0x1000;
    }
    else {
      uVar3 = *(uint *)(param_1 + 0x131c) & 0xffffefff;
    }
    *(uint *)(param_1 + 0x131c) = uVar3;
  }
  return 0;
}

