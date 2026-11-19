/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097001c
 */

undefined4 FUN_0097001c(long param_1,uchar *param_2,undefined8 param_3)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  
  if (param_1 == 0) {
    iVar1 = RAND_status();
    if (iVar1 == 0) {
      return 2;
    }
  }
  else if ((*(long *)(param_1 + 0xc0) == 0) ||
          ((*(byte *)(*(long *)(param_1 + 0xc0) + 0x231) >> 3 & 1) == 0)) {
    iVar1 = RAND_status();
    if (iVar1 == 0) {
      FUN_00904b80(param_1,"Insufficient randomness");
      return 2;
    }
    lVar3 = *(long *)(param_1 + 0xc0);
    if (lVar3 != 0) {
      *(byte *)(lVar3 + 0x231) = *(byte *)(lVar3 + 0x231) | 8;
    }
  }
  iVar1 = FUN_00963a5c(param_3);
  iVar1 = RAND_bytes(param_2,iVar1);
  uVar2 = 0;
  if (iVar1 != 1) {
    uVar2 = 2;
  }
  return uVar2;
}

