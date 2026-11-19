/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00969614
 */

bool FUN_00969614(int param_1,long param_2,undefined8 *param_3)

{
  int iVar1;
  long lVar2;
  int *piVar3;
  undefined *puVar4;
  undefined8 *puVar5;
  
  if (param_3 != (undefined8 *)0x0) {
    *param_3 = &PTR_DAT_00cc4d10;
  }
  if (PTR_DAT_00cc4d08 == &UNK_00c51540) {
    if (PTR_DAT_00cc4d10 != (undefined *)0x0) {
      piVar3 = (int *)PTR_DAT_00cc4d10;
      puVar5 = &DAT_00cc4d18;
      do {
        if (*piVar3 == param_1) {
LAB_009696d4:
          if (PTR_DAT_00cc4d08 != &UNK_00c51540) {
            return false;
          }
          if (piVar3 != (int *)0x0) {
            PTR_DAT_00cc4d08 = (undefined *)piVar3;
            return false;
          }
          if (PTR_DAT_00cc4d10 == (undefined *)0x0) {
            return false;
          }
          lVar2 = curl_getenv("CURL_SSL_BACKEND");
          if ((lVar2 == 0) || (PTR_DAT_00cc4d10 == (undefined *)0x0)) goto LAB_00969734;
          puVar4 = PTR_DAT_00cc4d10;
          puVar5 = &DAT_00cc4d18;
          goto LAB_0096971c;
        }
        if ((param_2 != 0) &&
           (iVar1 = curl_strequal(*(undefined8 *)(piVar3 + 2),param_2), iVar1 != 0)) {
          piVar3 = (int *)puVar5[-1];
          goto LAB_009696d4;
        }
        piVar3 = (int *)*puVar5;
        puVar5 = puVar5 + 1;
      } while (piVar3 != (int *)0x0);
    }
  }
  else {
    if (*(int *)PTR_DAT_00cc4d08 == param_1) {
      return false;
    }
    if (param_2 != 0) {
      iVar1 = curl_strequal(param_2,*(undefined8 *)(PTR_DAT_00cc4d08 + 8));
      return iVar1 == 0;
    }
  }
  return true;
  while( true ) {
    puVar4 = (undefined *)*puVar5;
    puVar5 = puVar5 + 1;
    if (puVar4 == (undefined *)0x0) break;
LAB_0096971c:
    iVar1 = curl_strequal(lVar2,*(undefined8 *)(puVar4 + 8));
    if (iVar1 != 0) {
      PTR_DAT_00cc4d08 = (undefined *)puVar5[-1];
      goto LAB_00969738;
    }
  }
LAB_00969734:
  PTR_DAT_00cc4d08 = PTR_DAT_00cc4d10;
LAB_00969738:
  (*(code *)PTR_free_00cc4678)(lVar2);
  return false;
}

