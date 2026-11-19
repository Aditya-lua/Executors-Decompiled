/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926c78
 */

size_t FUN_00926c78(void *param_1,undefined8 param_2,size_t param_3,long param_4)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  
  uVar1 = FUN_00963a7c(*(long *)(param_4 + 0x70) - *(long *)(param_4 + 0x88));
  if (param_3 == 0) {
    param_3 = 0xfffffffffffffffe;
  }
  else {
    if (uVar1 <= param_3) {
      param_3 = uVar1;
    }
    if (param_3 != 0) {
      lVar3 = *(long *)(param_4 + 0x18);
      lVar2 = FUN_00963a7c(*(undefined8 *)(param_4 + 0x88));
      memcpy(param_1,(void *)(lVar3 + lVar2),param_3);
    }
  }
  return param_3;
}

