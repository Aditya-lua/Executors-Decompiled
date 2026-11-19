/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092656c
 */

undefined8 curl_mime_data(long param_1,char *param_2,size_t param_3)

{
  long lVar1;
  undefined8 uVar2;
  
  if (param_1 == 0) {
    uVar2 = 0x2b;
  }
  else {
    if (*(code **)(param_1 + 0x30) != (code *)0x0) {
      (**(code **)(param_1 + 0x30))(*(undefined8 *)(param_1 + 0x38));
    }
    *(undefined8 *)(param_1 + 0x1b0) = 1;
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
    if (param_2 == (char *)0x0) {
      uVar2 = 0;
    }
    else {
      if (param_3 == 0xffffffffffffffff) {
        param_3 = strlen(param_2);
      }
      lVar1 = FUN_00941948(param_2,param_3);
      *(long *)(param_1 + 0x18) = lVar1;
      if (lVar1 == 0) {
        uVar2 = 0x1b;
      }
      else {
        uVar2 = 0;
        *(code **)(param_1 + 0x20) = FUN_00926c78;
        *(undefined1 **)(param_1 + 0x28) = &LAB_00926cec;
        *(size_t *)(param_1 + 0x70) = param_3;
        *(undefined1 **)(param_1 + 0x30) = &LAB_00926d44;
        *(undefined4 *)(param_1 + 0x10) = 1;
        *(uint *)(param_1 + 0x14) = *(uint *)(param_1 + 0x14) | 4;
      }
    }
  }
  return uVar2;
}

