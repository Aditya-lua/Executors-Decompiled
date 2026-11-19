/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091c1b4
 */

undefined8 FUN_0091c1b4(long param_1)

{
  uint *puVar1;
  ulong uVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x20);
  if (*(long *)(param_1 + 0x198) != 0) {
    if ((*(byte *)(lVar3 + 0x3a0) >> 6 & 1) != 0) {
      *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) & 0xfffffffe;
      *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 2;
      return 0;
    }
    *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 0x200;
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Ignoring the response-body");
    }
  }
  if (*(long *)(param_1 + 0x1118) != 0) {
    puVar1 = (uint *)(param_1 + 0x1b1);
    if ((((*puVar1 >> 2 & 1) == 0) && ((*puVar1 >> 9 & 1) == 0)) &&
       (*(char *)(param_1 + 0x131a) == '\0')) {
      if (*(long *)(param_1 + 0xd8) != *(long *)(param_1 + 0x1118)) {
        FUN_00904b80(param_1,"HTTP server does not seem to support byte ranges. Cannot resume.");
        return 0x21;
      }
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"The entire document is already downloaded");
      }
      FUN_00908c4c(lVar3,2);
      *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) & 0xfffffffe;
      *puVar1 = *puVar1 | 2;
      return 0;
    }
  }
  if (*(char *)(param_1 + 0x528) != '\0') {
    if (*(long *)(param_1 + 0x1110) != 0) {
      return 0;
    }
    uVar2 = FUN_00941ef0(param_1,*(undefined8 *)(param_1 + 0x188));
    if ((uVar2 & 1) != 0) {
      return 0;
    }
    *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 2;
    *(undefined4 *)(param_1 + 0x1328) = 0x130;
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Simulate an HTTP 304 response");
    }
    FUN_00908c4c(lVar3,2);
  }
  return 0;
}

