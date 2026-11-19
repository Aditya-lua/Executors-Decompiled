/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f859c
 */

undefined8 ossl_x509_algor_mgf1_decode(undefined8 *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = OBJ_obj2nid((ASN1_OBJECT *)*param_1);
  uVar2 = 0;
  if (iVar1 == 0x38f) {
    uVar2 = ASN1_TYPE_unpack_sequence(&DAT_00c59180,param_1[1]);
  }
  return uVar2;
}

