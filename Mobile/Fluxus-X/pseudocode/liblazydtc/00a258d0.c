/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a258d0
 */

EC_GROUP * EC_GROUP_new_from_ecpkparameters(int *param_1)

{
  int iVar1;
  EC_GROUP *pEVar2;
  undefined8 uVar3;
  
  if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x358,"EC_GROUP_new_from_ecpkparameters");
    uVar3 = 0x7c;
LAB_00a25988:
    ERR_set_error(0x10,uVar3,0);
    return (EC_GROUP *)0x0;
  }
  iVar1 = *param_1;
  if (iVar1 == 2) {
    return (EC_GROUP *)0x0;
  }
  if (iVar1 == 1) {
    pEVar2 = (EC_GROUP *)EC_GROUP_new_from_ecparameters(*(undefined8 *)(param_1 + 2));
    if (pEVar2 != (EC_GROUP *)0x0) {
      EC_GROUP_set_asn1_flag(pEVar2,0);
      return pEVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x368,"EC_GROUP_new_from_ecpkparameters");
    uVar3 = 0x80010;
  }
  else {
    if (iVar1 != 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x370,"EC_GROUP_new_from_ecpkparameters");
      uVar3 = 0x73;
      goto LAB_00a25988;
    }
    iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 2));
    pEVar2 = EC_GROUP_new_by_curve_name(iVar1);
    if (pEVar2 != (EC_GROUP *)0x0) {
      EC_GROUP_set_asn1_flag(pEVar2,1);
      return pEVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x360,"EC_GROUP_new_from_ecpkparameters");
    uVar3 = 0x77;
  }
  ERR_set_error(0x10,uVar3,0);
  return (EC_GROUP *)0x0;
}

