/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00914e28
 */

long FUN_00914e28(long param_1)

{
  char *pcVar1;
  char *pcVar2;
  undefined *puVar3;
  char *pcVar4;
  undefined1 *puVar5;
  long lVar6;
  long lVar7;
  undefined1 *puVar8;
  char *pcVar9;
  long *plVar10;
  long lVar11;
  ulong uVar12;
  
  FUN_0093f628(param_1,2,2);
  plVar10 = *(long **)(param_1 + 0xa90);
  if ((plVar10 == (long *)0x0) || ((int)plVar10[0x40] == 0)) {
    lVar11 = 0;
  }
  else {
    uVar12 = 0;
    lVar11 = 0;
    plVar10 = (long *)*plVar10;
    if (plVar10 != (long *)0x0) goto LAB_00914eac;
    while (uVar12 = uVar12 + 1, uVar12 < 0x3f) {
      plVar10 = *(long **)(*(long *)(param_1 + 0xa90) + uVar12 * 8);
      if (plVar10 != (long *)0x0) {
LAB_00914eac:
        do {
          pcVar9 = (char *)plVar10[5];
          if (pcVar9 == (char *)0x0) {
            lVar7 = lVar11;
          }
          else {
            pcVar1 = "";
            if (*(char *)((long)plVar10 + 0x3b) != '\0') {
              pcVar1 = "#HttpOnly_";
            }
            if ((char)plVar10[7] == '\0') {
              puVar8 = &DAT_002ab32c;
            }
            else {
              puVar8 = &DAT_002ab32c;
              if (*pcVar9 != '.') {
                puVar8 = &DAT_002ab502;
              }
            }
            pcVar2 = "FALSE";
            if ((char)plVar10[7] != '\0') {
              pcVar2 = "TRUE";
            }
            puVar3 = &DAT_002a91de;
            if ((undefined *)plVar10[3] != (undefined *)0x0) {
              puVar3 = (undefined *)plVar10[3];
            }
            pcVar4 = "FALSE";
            if (*(char *)((long)plVar10 + 0x39) != '\0') {
              pcVar4 = "TRUE";
            }
            puVar5 = &DAT_002ab32c;
            if ((undefined1 *)plVar10[2] != (undefined1 *)0x0) {
              puVar5 = (undefined1 *)plVar10[2];
            }
            lVar6 = curl_maprintf("%s%s%s\t%s\t%s\t%s\t%ld\t%s\t%s",pcVar1,puVar8,pcVar9,pcVar2,
                                  puVar3,pcVar4,plVar10[6],plVar10[1],puVar5);
            if (lVar6 == 0) {
              curl_slist_free_all(lVar11);
              lVar11 = 0;
              goto LAB_00914fac;
            }
            lVar7 = FUN_0093f6d8(lVar11,lVar6);
            if (lVar7 == 0) {
              (*(code *)PTR_free_00cc4678)(lVar6);
              curl_slist_free_all(lVar11);
              lVar11 = lVar7;
              goto LAB_00914fac;
            }
          }
          lVar11 = lVar7;
          plVar10 = (long *)*plVar10;
        } while (plVar10 != (long *)0x0);
      }
    }
  }
LAB_00914fac:
  FUN_0093f680(param_1,2);
  return lVar11;
}

