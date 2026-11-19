/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f798
 */

undefined8 EC_KEY_key2buf(long param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  if (param_1 != 0) {
    if ((*(long *)(param_1 + 0x20) != 0) && (*(long *)(param_1 + 0x18) != 0)) {
      uVar1 = EC_POINT_point2buf(*(long *)(param_1 + 0x18),*(long *)(param_1 + 0x20),param_2,param_3
                                 ,param_4);
      return uVar1;
    }
  }
  return 0;
}

