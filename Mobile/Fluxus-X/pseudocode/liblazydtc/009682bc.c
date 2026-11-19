/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009682bc
 */

undefined4 FUN_009682bc(void)

{
  int iVar1;
  long lVar2;
  undefined *puVar3;
  undefined8 *puVar4;
  
  if ((PTR_DAT_00cc4d08 == &UNK_00c51540) && (PTR_DAT_00cc4d10 != (undefined *)0x0)) {
    lVar2 = curl_getenv("CURL_SSL_BACKEND");
    if ((lVar2 != 0) && (PTR_DAT_00cc4d10 != (undefined *)0x0)) {
      puVar3 = PTR_DAT_00cc4d10;
      puVar4 = &DAT_00cc4d18;
      do {
        iVar1 = curl_strequal(lVar2,*(undefined8 *)(puVar3 + 8));
        if (iVar1 != 0) {
          PTR_DAT_00cc4d08 = (undefined *)puVar4[-1];
          goto LAB_0096833c;
        }
        puVar3 = (undefined *)*puVar4;
        puVar4 = puVar4 + 1;
      } while (puVar3 != (undefined *)0x0);
    }
    PTR_DAT_00cc4d08 = PTR_DAT_00cc4d10;
LAB_0096833c:
    (*(code *)PTR_free_00cc4678)(lVar2);
  }
  return *(undefined4 *)PTR_DAT_00cc4d08;
}

