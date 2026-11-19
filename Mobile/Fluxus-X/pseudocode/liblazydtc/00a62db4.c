/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a62db4
 */

bool FUN_00a62db4(undefined8 param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)(param_2 + 0x10);
  lVar1 = OSSL_ENCODER_INSTANCE_get_encoder(uVar2);
  uVar2 = OSSL_ENCODER_INSTANCE_get_encoder_ctx(uVar2);
  lVar1 = (**(code **)(lVar1 + 0x78))(uVar2,*(undefined4 *)(param_2 + 8),param_1);
  *(long *)(param_2 + 0x20) = lVar1;
  return lVar1 != 0;
}

