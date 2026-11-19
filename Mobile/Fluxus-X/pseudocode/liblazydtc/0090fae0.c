/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fae0
 */

bool FUN_0090fae0(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = curl_easy_init();
  *(long *)(param_1 + 0x80) = lVar1;
  if (lVar1 != 0) {
    *(uint *)(lVar1 + 0x131c) = *(uint *)(lVar1 + 0x131c) | 0x40000;
    FUN_009164e8(param_1,param_3,&LAB_00916a04,&LAB_00916a3c,&LAB_0090fb6c);
    *(long *)(*(long *)(param_1 + 0x80) + 0xc38) = param_1;
    *(undefined8 *)(param_1 + 0x88) = param_2;
    FUN_00925c98(param_1 + 0x58,0);
  }
  return lVar1 == 0;
}

