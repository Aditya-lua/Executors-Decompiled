/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64680
 */

ulong ossl_DER_w_algorithmIdentifier_DSA_with_MD
                (undefined8 param_1,undefined4 param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  ulong uVar2;
  undefined1 *puVar3;
  undefined8 uVar4;
  
  switch(param_4) {
  case 0x2a0:
    puVar3 = ossl_der_oid_id_dsa_with_sha256;
    break;
  case 0x2a1:
    puVar3 = ossl_der_oid_id_dsa_with_sha384;
    break;
  case 0x2a2:
    puVar3 = ossl_der_oid_id_dsa_with_sha512;
    break;
  case 0x2a3:
    puVar3 = ossl_der_oid_id_dsa_with_sha224;
    break;
  default:
    switch(param_4) {
    case 0x448:
      puVar3 = ossl_der_oid_id_dsa_with_sha3_224;
      break;
    case 0x449:
      puVar3 = ossl_der_oid_id_dsa_with_sha3_256;
      break;
    case 0x44a:
      puVar3 = ossl_der_oid_id_dsa_with_sha3_384;
      break;
    case 1099:
      puVar3 = ossl_der_oid_id_dsa_with_sha3_512;
      break;
    default:
      if (param_4 != 0x40) {
        return 0;
      }
      puVar3 = ossl_der_oid_id_dsa_with_sha1;
      uVar4 = 9;
      goto LAB_00b64754;
    }
  }
  uVar4 = 0xb;
LAB_00b64754:
  uVar2 = ossl_DER_w_begin_sequence(param_1,param_2);
  if (((int)uVar2 != 0) &&
     (uVar2 = ossl_DER_w_precompiled(param_1,0xffffffff,puVar3,uVar4), (int)uVar2 != 0)) {
    iVar1 = ossl_DER_w_end_sequence(param_1,param_2);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}

