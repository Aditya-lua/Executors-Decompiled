/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e8bc
 */

EC_KEY * FUN_00b4e8bc(undefined8 *param_1)

{
  bool bVar1;
  int iVar2;
  point_conversion_form_t form;
  EC_KEY *key;
  EC_GROUP *group;
  
  iVar2 = ossl_prov_is_running();
  if (param_1 == (undefined8 *)0x0) {
    return (EC_KEY *)0x0;
  }
  if (iVar2 == 0) {
    return (EC_KEY *)0x0;
  }
  key = (EC_KEY *)EC_KEY_new_ex(*param_1,0);
  if (key == (EC_KEY *)0x0) {
    return (EC_KEY *)0x0;
  }
  if (param_1[0x10] == 0) {
    iVar2 = FUN_00b4f5a8(param_1);
    if (iVar2 == 0) goto LAB_00b4e9f4;
LAB_00b4e948:
    group = (EC_GROUP *)param_1[0x10];
    if (group == (EC_GROUP *)0x0) goto LAB_00b4e964;
LAB_00b4e950:
    iVar2 = EC_KEY_set_group(key,group);
    bVar1 = 0 < iVar2;
  }
  else {
    if (param_1[2] != 0) {
      iVar2 = ossl_ec_encoding_name2id();
      if (iVar2 < 0) goto LAB_00b4e9f4;
      EC_GROUP_set_asn1_flag((EC_GROUP *)param_1[0x10],iVar2);
    }
    if (param_1[3] == 0) goto LAB_00b4e948;
    form = ossl_ec_pt_format_name2id();
    if ((int)form < 0) goto LAB_00b4e9f4;
    EC_GROUP_set_point_conversion_form((EC_GROUP *)param_1[0x10],form);
    group = (EC_GROUP *)param_1[0x10];
    if (group != (EC_GROUP *)0x0) goto LAB_00b4e950;
LAB_00b4e964:
    ERR_new();
    ERR_set_debug("providers/implementations/keymgmt/ec_kmgmt.c",0x4d1,"ec_gen_assign_group");
    ERR_set_error(0x39,0xb1,0);
    bVar1 = false;
  }
  if (((*(byte *)(param_1 + 0xf) & 3) != 0) && (bVar1)) {
    iVar2 = EC_KEY_generate_key(key);
    bVar1 = iVar2 != 0;
  }
  if ((*(int *)((long)param_1 + 0x7c) != -1) && (bVar1)) {
    iVar2 = ossl_ec_set_ecdh_cofactor_mode(key);
    bVar1 = iVar2 != 0;
  }
  if (param_1[4] != 0) {
    if (!bVar1) goto LAB_00b4e9f4;
    iVar2 = ossl_ec_set_check_group_type_from_name(key);
    bVar1 = iVar2 != 0;
  }
  if (bVar1) {
    return key;
  }
LAB_00b4e9f4:
  EC_KEY_free(key);
  return (EC_KEY *)0x0;
}

