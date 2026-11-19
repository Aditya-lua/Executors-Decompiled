/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31afc
 */

undefined8
EC_POINT_get_affine_coordinates_GF2m
          (EC_GROUP *param_1,EC_POINT *param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(long *)(*(long *)param_1 + 0x80) == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x389,"EC_POINT_get_affine_coordinates");
    uVar2 = 0xc0101;
  }
  else {
    if (*(long *)param_1 == *(long *)param_2) {
      if (((*(int *)(param_1 + 0x20) == 0) || (*(int *)(param_2 + 8) == 0)) ||
         (*(int *)(param_1 + 0x20) == *(int *)(param_2 + 8))) {
        iVar1 = EC_POINT_is_at_infinity(param_1,param_2);
        if (iVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x00a31a50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar2 = (**(code **)(*(long *)param_1 + 0x80))(param_1,param_2,param_3,param_4,param_5);
          return uVar2;
        }
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x391,"EC_POINT_get_affine_coordinates");
        uVar2 = 0x6a;
        goto LAB_00a31a04;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x38d,"EC_POINT_get_affine_coordinates");
    uVar2 = 0x65;
  }
LAB_00a31a04:
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

