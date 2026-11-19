/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096ac38
 */

undefined8 FUN_0096ac38(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined *puVar4;
  undefined8 *puVar5;
  
  if ((PTR_DAT_00cc4d08 != &UNK_00c51540) || (PTR_DAT_00cc4d10 == (undefined *)0x0)) {
    return 1;
  }
  lVar2 = curl_getenv("CURL_SSL_BACKEND");
  if ((lVar2 != 0) && (PTR_DAT_00cc4d10 != (undefined *)0x0)) {
    puVar4 = PTR_DAT_00cc4d10;
    puVar5 = &DAT_00cc4d18;
    do {
      iVar1 = curl_strequal(lVar2,*(undefined8 *)(puVar4 + 8));
      if (iVar1 != 0) {
        PTR_DAT_00cc4d08 = (undefined *)puVar5[-1];
        goto LAB_0096accc;
      }
      puVar4 = (undefined *)*puVar5;
      puVar5 = puVar5 + 1;
    } while (puVar4 != (undefined *)0x0);
  }
  PTR_DAT_00cc4d08 = PTR_DAT_00cc4d10;
LAB_0096accc:
  (*(code *)PTR_free_00cc4678)(lVar2);
  uVar3 = (**(code **)(PTR_DAT_00cc4d08 + 0x20))();
  return uVar3;
}

