/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa52fc
 */

undefined8 OSSL_SELF_TEST_oncorrupt_byte(undefined8 *param_1,byte *param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (param_1 != (undefined8 *)0x0) {
    if (param_1[3] == 0) {
      uVar2 = 0;
    }
    else {
      *param_1 = "Corrupt";
      FUN_00aa513c(param_1);
      iVar1 = (*(code *)param_1[3])(param_1 + 4,param_1[0x18]);
      uVar2 = 0;
      if (iVar1 == 0) {
        uVar2 = 1;
        *param_2 = *param_2 ^ 1;
      }
    }
  }
  return uVar2;
}

