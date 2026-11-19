/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4b80
 */

void FUN_008b4b80(long param_1,long param_2)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  ulong uVar4;
  long *plVar5;
  long lVar6;
  
  while( true ) {
    do {
      while( true ) {
        while( true ) {
          if (((*(char *)(param_1 + 3) != '\x7f') && (*(char *)(param_1 + 3) != '\0')) ||
             (uVar4 = *(ulong *)(param_1 + 0x50),
             uVar4 <= (ulong)(*(long *)(param_1 + 0x20) + param_2))) {
            return;
          }
          plVar5 = *(long **)(uVar4 + 8);
          *(undefined1 *)(param_1 + 3) = 0;
          uVar1 = *(uint *)(uVar4 + 0x2c);
          lVar6 = *plVar5;
          if (*(char *)(lVar6 + 6) != '\0') break;
          if ((uVar1 >> 3 & 1) != 0) {
            FUN_008c8948(param_1);
          }
          FUN_008be71c(param_1);
        }
        if ((uVar1 >> 4 & 1) == 0) break;
        FUN_008c8d44(param_1);
      }
      *(uint *)(uVar4 + 0x2c) = uVar1 & 0xffffffed;
      iVar3 = (**(code **)(lVar6 + 0x20))(param_1,0);
      cVar2 = *(char *)(param_1 + 3);
    } while (cVar2 == '\x7f');
    if (cVar2 == '\x01') {
      return;
    }
    if (cVar2 == '\x06') break;
    FUN_008c8c74(param_1,*(long *)(param_1 + 0x68) + (long)iVar3 * -0x10);
  }
  return;
}

