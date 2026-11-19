/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926804
 */

undefined8
curl_mime_data_cb(long param_1,undefined8 param_2,long param_3,undefined8 param_4,undefined8 param_5
                 ,undefined8 param_6)

{
  undefined8 uVar1;
  
  if (param_1 == 0) {
    uVar1 = 0x2b;
  }
  else {
    if (*(code **)(param_1 + 0x30) != (code *)0x0) {
      (**(code **)(param_1 + 0x30))(*(undefined8 *)(param_1 + 0x38));
    }
    *(undefined8 *)(param_1 + 0x1b0) = 1;
    uVar1 = 0;
    *(undefined8 *)(param_1 + 0x18) = 0;
    *(undefined8 *)(param_1 + 0x20) = 0;
    *(undefined8 *)(param_1 + 0x28) = 0;
    *(undefined8 *)(param_1 + 0x30) = 0;
    *(long *)(param_1 + 0x38) = param_1;
    *(undefined8 *)(param_1 + 0x40) = 0;
    *(undefined8 *)(param_1 + 0x70) = 0;
    *(undefined8 *)(param_1 + 0xa0) = 0;
    *(undefined8 *)(param_1 + 0xa8) = 0;
    *(undefined8 *)(param_1 + 0x98) = 0;
    *(undefined4 *)(param_1 + 0x10) = 0;
    *(uint *)(param_1 + 0x14) = *(uint *)(param_1 + 0x14) & 0xfffffffb;
    *(undefined4 *)(param_1 + 0x78) = 0;
    if (param_3 != 0) {
      *(long *)(param_1 + 0x20) = param_3;
      *(undefined8 *)(param_1 + 0x28) = param_4;
      *(undefined8 *)(param_1 + 0x30) = param_5;
      *(undefined8 *)(param_1 + 0x38) = param_6;
      *(undefined8 *)(param_1 + 0x70) = param_2;
      *(undefined4 *)(param_1 + 0x10) = 3;
    }
  }
  return uVar1;
}

