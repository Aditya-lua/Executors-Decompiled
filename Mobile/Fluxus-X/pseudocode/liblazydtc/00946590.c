/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946590
 */

undefined8 FUN_00946590(undefined8 *param_1)

{
  undefined4 *puVar1;
  
  if ((param_1 != (undefined8 *)0x0) &&
     (puVar1 = (undefined4 *)*param_1, puVar1 != (undefined4 *)0x0)) {
    *param_1 = 0;
    FUN_0092ba18(puVar1);
    FUN_0092bab8(puVar1);
    if ((*(byte *)((long)puVar1 + 0x131e) >> 2 & 1) == 0) {
      if (*(long *)(puVar1 + 0x30) != 0) {
        curl_multi_remove_handle(*(long *)(puVar1 + 0x30),puVar1);
      }
      if (*(long *)(puVar1 + 0x32) != 0) {
        curl_multi_cleanup();
        *(undefined8 *)(puVar1 + 0x32) = 0;
      }
    }
    *puVar1 = 0;
    if ((*(byte *)((long)puVar1 + 0x131d) >> 1 & 1) != 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x444));
    }
    FUN_00932a98(puVar1 + 0x36,puVar1);
    FUN_00968c2c(puVar1);
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x324));
    *(undefined8 *)(puVar1 + 0x324) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x330));
    *(undefined8 *)(puVar1 + 0x330) = 0;
    FUN_00968e9c(puVar1);
    if (*(char *)((long)puVar1 + 0x131d) < '\0') {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x470));
      *(undefined8 *)(puVar1 + 0x470) = 0;
      puVar1[0x4c7] = puVar1[0x4c7] & 0xffff7fff;
    }
    *(undefined8 *)(puVar1 + 0x470) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x45e));
    *(undefined8 *)(puVar1 + 0x45e) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x460));
    *(undefined8 *)(puVar1 + 0x460) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x462));
    *(undefined8 *)(puVar1 + 0x462) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x464));
    *(undefined8 *)(puVar1 + 0x464) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x466));
    *(undefined8 *)(puVar1 + 0x466) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x468));
    *(undefined8 *)(puVar1 + 0x468) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x46a));
    *(undefined8 *)(puVar1 + 0x46a) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x46c));
    *(undefined8 *)(puVar1 + 0x46c) = 0;
    curl_url_cleanup(*(undefined8 *)(puVar1 + 0x45c));
    *(undefined8 *)(puVar1 + 0x45c) = 0;
    FUN_00904534(puVar1 + 0x318);
    FUN_00914fdc(puVar1,1);
    FUN_009035e8(puVar1,*(undefined8 *)(puVar1 + 0x2a8),*(undefined8 *)(puVar1 + 0x24e));
    FUN_00903550(puVar1 + 0x2a8);
    FUN_00918888(puVar1,*(undefined8 *)(puVar1 + 0x2a6),*(undefined8 *)(puVar1 + 0x250));
    if ((*(long *)(puVar1 + 0x34) == 0) || (*(long *)(*(long *)(puVar1 + 0x34) + 0xf0) == 0)) {
      FUN_0091839c(puVar1 + 0x2a6);
    }
    curl_slist_free_all(*(undefined8 *)(puVar1 + 800));
    FUN_00924ca4(puVar1);
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4d8));
    *(undefined8 *)(puVar1 + 0x4d8) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4da));
    *(undefined8 *)(puVar1 + 0x4da) = 0;
    FUN_0090ea54(puVar1);
    free(*(void **)(puVar1 + 0x36a));
    if (*(long *)(puVar1 + 0x34) != 0) {
      FUN_0093f628(puVar1,1,2);
      *(int *)(*(long *)(puVar1 + 0x34) + 8) = *(int *)(*(long *)(puVar1 + 0x34) + 8) + -1;
      FUN_0093f680(puVar1,1);
    }
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4c0));
    *(undefined8 *)(puVar1 + 0x4c0) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4aa));
    *(undefined8 *)(puVar1 + 0x4aa) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4ae));
    *(undefined8 *)(puVar1 + 0x4ae) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4ac));
    *(undefined8 *)(puVar1 + 0x4ac) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4ba));
    *(undefined8 *)(puVar1 + 0x4ba) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4b0));
    *(undefined8 *)(puVar1 + 0x4b0) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4b2));
    *(undefined8 *)(puVar1 + 0x4b2) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4b4));
    *(undefined8 *)(puVar1 + 0x4b4) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4b6));
    *(undefined8 *)(puVar1 + 0x4b6) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4b8));
    *(undefined8 *)(puVar1 + 0x4b8) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4bc));
    *(undefined8 *)(puVar1 + 0x4bc) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4be));
    *(undefined8 *)(puVar1 + 0x4be) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4c2));
    *(undefined8 *)(puVar1 + 0x4c2) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x4c4));
    *(undefined8 *)(puVar1 + 0x4c4) = 0;
    FUN_00925eb8(*(undefined8 *)(puVar1 + 0x476));
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(puVar1 + 0x476));
    *(undefined8 *)(puVar1 + 0x476) = 0;
    FUN_0092f788(puVar1 + 0x4c8);
    FUN_00946444(puVar1);
    FUN_00921ca8(puVar1);
    (*(code *)PTR_free_00cc4678)(puVar1);
  }
  return 0;
}

