/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3191c
 */

undefined8
EC_POINT_set_affine_coordinates_GFp
          (EC_GROUP *param_1,EC_POINT *param_2,undefined8 param_3,undefined8 param_4,BN_CTX *param_5
          )

{
  int iVar1;
  undefined8 uVar2;
  code *pcVar3;
  
  pcVar3 = *(code **)(*(long *)param_1 + 0x78);
  if (pcVar3 == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x361,"EC_POINT_set_affine_coordinates");
    uVar2 = 0xc0101;
  }
  else if ((*(long *)param_1 == *(long *)param_2) &&
          (((*(int *)(param_1 + 0x20) == 0 || (*(int *)(param_2 + 8) == 0)) ||
           (*(int *)(param_1 + 0x20) == *(int *)(param_2 + 8))))) {
    uVar2 = (*pcVar3)(param_1,param_2,param_3,param_4,param_5);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    iVar1 = EC_POINT_is_on_curve(param_1,param_2,param_5);
    if (0 < iVar1) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x36c,"EC_POINT_set_affine_coordinates");
    uVar2 = 0x6b;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x365,"EC_POINT_set_affine_coordinates");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

