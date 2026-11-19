/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5074
 */

void OSSL_SELF_TEST_get_callback(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  puVar1 = (undefined8 *)ossl_lib_ctx_get_data(param_1,0xc,&DAT_00c6d920);
  if (param_2 != (undefined8 *)0x0) {
    if (puVar1 == (undefined8 *)0x0) {
      uVar2 = 0;
    }
    else {
      uVar2 = *puVar1;
    }
    *param_2 = uVar2;
  }
  if (param_3 != (undefined8 *)0x0) {
    if (puVar1 == (undefined8 *)0x0) {
      uVar2 = 0;
    }
    else {
      uVar2 = puVar1[1];
    }
    *param_3 = uVar2;
  }
  return;
}

