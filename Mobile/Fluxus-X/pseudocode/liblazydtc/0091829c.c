/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091829c
 */

int FUN_0091829c(long param_1)

{
  char *pcVar1;
  ulong uVar2;
  
  uVar2 = *(ulong *)(*(long *)(param_1 + 0x20) + 0x3a0);
  pcVar1 = "host";
  if ((uVar2 & 1) != 0) {
    pcVar1 = "proxy";
  }
  FUN_00904b80(param_1,"Could not resolve %s: %s",pcVar1,*(undefined8 *)(param_1 + 0xd90));
  return 6 - ((uint)uVar2 & 1);
}

