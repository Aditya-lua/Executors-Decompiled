/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a602d4
 */

bool ossl_asn1_type_set_octetstring_int
               (undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined4 param_4)

{
  long lVar1;
  undefined4 local_40;
  undefined4 uStack_3c;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined1 *local_28;
  undefined4 local_20;
  undefined8 local_18;
  
  local_28 = (undefined1 *)&local_40;
  uStack_30 = 0;
  uStack_3c = 4;
  local_40 = param_4;
  local_38 = param_3;
  local_20 = param_2;
  local_18 = param_1;
  lVar1 = ASN1_TYPE_pack_sequence(&DAT_00c5d758,&local_28,&local_18);
  return lVar1 != 0;
}

