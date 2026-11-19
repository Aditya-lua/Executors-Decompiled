/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096ab00
 */

undefined8 FUN_0096ab00(long *param_1,long param_2,long *param_3,ulong param_4)

{
  undefined1 *puVar1;
  long lVar2;
  
  lVar2 = param_1[3];
  if (((*(byte *)(lVar2 + 0x3a0) >> 3 & 1) == 0) ||
     (((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) != 0)) {
    puVar1 = (undefined1 *)(lVar2 + 0x570);
  }
  else {
    puVar1 = (undefined1 *)(lVar2 + 0x571);
  }
  if ((param_3 == (long *)0x0) || (param_4 == 0)) {
    *puVar1 = 0;
    if (((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
      FUN_00904c98(param_2,"ALPN: server did not agree on a protocol. Uses default.");
    }
  }
  else if ((param_4 == 8) && (*param_3 == 0x312e312f70747468)) {
    *puVar1 = 2;
    if (((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
      FUN_00904c98(param_2,"ALPN: server accepted %.*s",8,param_3);
    }
  }
  else {
    *puVar1 = 0;
    FUN_00904b80(param_2,"unsupported ALPN protocol: \'%.*s\'",param_4 & 0xffffffff,param_3);
  }
  if (((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) != 0) {
    FUN_0092f0f0(param_2,0xffffffff);
  }
  return 0;
}

