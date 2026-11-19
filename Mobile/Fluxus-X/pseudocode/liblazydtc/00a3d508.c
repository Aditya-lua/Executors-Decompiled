/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3d508
 */

undefined8 FUN_00a3d508(undefined8 param_1,long param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  undefined8 local_30;
  undefined8 uStack_28;
  
  uVar1 = FUN_00a3d570(param_1,&uStack_28,&local_30);
  if (((int)uVar1 != 0) &&
     ((param_2 == 0 || (uVar1 = ossl_x25519(param_2,uStack_28,local_30), (int)uVar1 != 0)))) {
    uVar1 = 1;
    *param_3 = 0x20;
  }
  return uVar1;
}

