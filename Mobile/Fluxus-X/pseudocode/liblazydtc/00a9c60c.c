/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c60c
 */

undefined8 WPACKET_sub_reserve_bytes__(long param_1,long param_2,long *param_3,long param_4)

{
  undefined8 uVar1;
  
  if (((param_4 == 0) || (uVar1 = 0, (*(byte *)(param_1 + 0x30) & 1) == 0)) &&
     (uVar1 = WPACKET_reserve_bytes(param_1,param_4 + param_2,param_3), (int)uVar1 != 0)) {
    if (*param_3 != 0) {
      *param_3 = *param_3 + param_4;
    }
    uVar1 = 1;
  }
  return uVar1;
}

