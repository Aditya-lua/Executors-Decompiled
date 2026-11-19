/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1fc54
 */

undefined8 ossl_prov_bio_vprintf(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  undefined8 local_30;
  undefined8 uStack_28;
  undefined8 local_20;
  undefined8 uStack_18;
  
  if (DAT_00d23800 == (code *)0x0) {
    return 0xffffffff;
  }
  uStack_18 = param_3[3];
  local_20 = param_3[2];
  uStack_28 = param_3[1];
  local_30 = *param_3;
  uVar1 = (*DAT_00d23800)(param_1,param_2,&local_30);
  return uVar1;
}

