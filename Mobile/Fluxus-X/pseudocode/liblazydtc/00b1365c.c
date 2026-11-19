/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1365c
 */

undefined8 ossl_policy_cache_set_mapping(long param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  uint *puVar4;
  long *plVar5;
  undefined8 uVar6;
  
  plVar5 = *(long **)(param_1 + 0x108);
  iVar1 = OPENSSL_sk_num(param_2);
  if (iVar1 == 0) {
LAB_00b13768:
    uVar6 = 0xffffffff;
  }
  else {
    iVar1 = OPENSSL_sk_num(param_2);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(param_2,iVar1);
        iVar2 = OBJ_obj2nid((ASN1_OBJECT *)puVar3[1]);
        if ((iVar2 == 0x2ea) || (iVar2 = OBJ_obj2nid((ASN1_OBJECT *)*puVar3), iVar2 == 0x2ea))
        goto LAB_00b13768;
        puVar4 = (uint *)ossl_policy_cache_find_data(plVar5,*puVar3);
        if (puVar4 == (uint *)0x0) {
          if ((uint *)*plVar5 != (uint *)0x0) {
            puVar4 = (uint *)ossl_policy_data_new(0,*puVar3,*(uint *)*plVar5 & 0x10);
            if (puVar4 != (uint *)0x0) {
              uVar6 = *(undefined8 *)(*plVar5 + 0x10);
              *puVar4 = *puVar4 | 6;
              *(undefined8 *)(puVar4 + 4) = uVar6;
              iVar2 = OPENSSL_sk_push(plVar5[1],puVar4);
              if (iVar2 != 0) goto LAB_00b13738;
              ossl_policy_data_free(puVar4);
            }
            goto LAB_00b1379c;
          }
        }
        else {
          *puVar4 = *puVar4 | 1;
LAB_00b13738:
          iVar2 = OPENSSL_sk_push(*(undefined8 *)(puVar4 + 6),puVar3[1]);
          if (iVar2 == 0) {
LAB_00b1379c:
            uVar6 = 0;
            goto LAB_00b1376c;
          }
          puVar3[1] = 0;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_2);
      } while (iVar1 < iVar2);
    }
    uVar6 = 1;
  }
LAB_00b1376c:
  OPENSSL_sk_pop_free(param_2,POLICY_MAPPING_free);
  return uVar6;
}

