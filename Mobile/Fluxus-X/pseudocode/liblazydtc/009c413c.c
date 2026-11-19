/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c413c
 */

undefined8 tls1_save_sigalgs(long param_1,undefined8 param_2,int param_3)

{
  undefined8 uVar1;
  long lVar2;
  
  if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 1 & 1) == 0) {
    return 1;
  }
  if (*(long *)(param_1 + 0x898) == 0) {
    return 0;
  }
  if (param_3 == 0) {
    lVar2 = param_1 + 0x390;
    param_1 = param_1 + 0x3a0;
  }
  else {
    lVar2 = param_1 + 0x398;
    param_1 = param_1 + 0x3a8;
  }
  uVar1 = tls1_save_u16(param_2,lVar2,param_1);
  return uVar1;
}

