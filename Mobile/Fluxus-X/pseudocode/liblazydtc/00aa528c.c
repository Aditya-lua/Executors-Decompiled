/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa528c
 */

void OSSL_SELF_TEST_onend(undefined8 *param_1,int param_2)

{
  undefined *puVar1;
  
  if ((param_1 != (undefined8 *)0x0) && (param_1[3] != 0)) {
    puVar1 = &DAT_002c9dcb;
    if (param_2 != 1) {
      puVar1 = &DAT_002c3d2a;
    }
    *param_1 = puVar1;
    FUN_00aa513c(param_1);
    (*(code *)param_1[3])(param_1 + 4,param_1[0x18]);
    param_1[1] = &DAT_002c934f;
    *param_1 = &DAT_002c934f;
    param_1[2] = &DAT_002c934f;
  }
  return;
}

