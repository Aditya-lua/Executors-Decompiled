/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60864
 */

ulong ossl_DER_w_algorithmIdentifier_MDWithRSAEncryption
                (undefined8 param_1,undefined4 param_2,int param_3)

{
  int iVar1;
  ulong uVar2;
  undefined1 *puVar3;
  undefined8 uVar4;
  
  uVar2 = 0xffffffff;
  if (param_3 < 0x446) {
    if (0x74 < param_3) {
      switch(param_3) {
      case 0x2a0:
        puVar3 = ossl_der_oid_sha256WithRSAEncryption;
        break;
      case 0x2a1:
        puVar3 = ossl_der_oid_sha384WithRSAEncryption;
        break;
      case 0x2a2:
        puVar3 = ossl_der_oid_sha512WithRSAEncryption;
        break;
      case 0x2a3:
        puVar3 = ossl_der_oid_sha224WithRSAEncryption;
        break;
      default:
        if (param_3 == 0x75) {
          puVar3 = (undefined1 *)&ossl_der_oid_ripemd160WithRSAEncryption;
          uVar4 = 8;
          goto LAB_00b609c0;
        }
        if (param_3 != 0x101) {
          return 0xffffffff;
        }
        puVar3 = ossl_der_oid_md4WithRSAEncryption;
      }
      goto LAB_00b609bc;
    }
    if (param_3 < 0x40) {
      if (param_3 == 3) {
        puVar3 = ossl_der_oid_md2WithRSAEncryption;
      }
      else {
        if (param_3 != 4) {
          return 0xffffffff;
        }
        puVar3 = ossl_der_oid_md5WithRSAEncryption;
      }
      goto LAB_00b609bc;
    }
    if (param_3 == 0x40) {
      puVar3 = ossl_der_oid_sha1WithRSAEncryption;
      goto LAB_00b609bc;
    }
    if (param_3 != 0x5f) {
      return 0xffffffff;
    }
    puVar3 = (undefined1 *)&ossl_der_oid_mdc2WithRSASignature;
    uVar4 = 7;
  }
  else {
    switch(param_3) {
    case 0x446:
      puVar3 = ossl_der_oid_sha512_224WithRSAEncryption;
      break;
    case 0x447:
      puVar3 = ossl_der_oid_sha512_256WithRSAEncryption;
      break;
    case 0x448:
      puVar3 = ossl_der_oid_id_rsassa_pkcs1_v1_5_with_sha3_224;
      break;
    case 0x449:
      puVar3 = ossl_der_oid_id_rsassa_pkcs1_v1_5_with_sha3_256;
      break;
    case 0x44a:
      puVar3 = ossl_der_oid_id_rsassa_pkcs1_v1_5_with_sha3_384;
      break;
    case 1099:
      puVar3 = ossl_der_oid_id_rsassa_pkcs1_v1_5_with_sha3_512;
      break;
    default:
      goto switchD_00b608d0_default;
    }
LAB_00b609bc:
    uVar4 = 0xb;
  }
LAB_00b609c0:
  uVar2 = ossl_DER_w_begin_sequence(param_1,param_2);
  if ((((int)uVar2 != 0) && (uVar2 = ossl_DER_w_null(param_1,0xffffffff), (int)uVar2 != 0)) &&
     (uVar2 = ossl_DER_w_precompiled(param_1,0xffffffff,puVar3,uVar4), (int)uVar2 != 0)) {
    iVar1 = ossl_DER_w_end_sequence(param_1,param_2);
    uVar2 = (ulong)(iVar1 != 0);
  }
switchD_00b608d0_default:
  return uVar2;
}

