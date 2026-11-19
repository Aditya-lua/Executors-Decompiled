/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a34b68
 */

undefined8 EC_POINT_set_compressed_coordinates_GFp(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  byte *pbVar2;
  
  pbVar2 = (byte *)*param_1;
  if ((*(code **)(pbVar2 + 0x88) == (code *)0x0) && ((*pbVar2 & 1) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_oct.c",0x1d,"EC_POINT_set_compressed_coordinates");
    uVar1 = 0xc0101;
  }
  else {
    if ((pbVar2 == (byte *)*param_2) &&
       (((*(int *)(param_1 + 4) == 0 || (*(int *)(param_2 + 1) == 0)) ||
        (*(int *)(param_1 + 4) == *(int *)(param_2 + 1))))) {
      if ((*pbVar2 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00a34b48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar1 = (**(code **)(pbVar2 + 0x88))();
        return uVar1;
      }
      if (*(int *)(pbVar2 + 4) == 0x196) {
        uVar1 = ossl_ec_GFp_simple_set_compressed_coordinates();
        return uVar1;
      }
      uVar1 = ossl_ec_GF2m_simple_set_compressed_coordinates();
      return uVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_oct.c",0x21,"EC_POINT_set_compressed_coordinates");
    uVar1 = 0x65;
  }
  ERR_set_error(0x10,uVar1,0);
  return 0;
}

