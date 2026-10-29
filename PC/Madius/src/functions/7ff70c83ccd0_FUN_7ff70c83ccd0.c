/* 7ff70c83ccd0 FUN_7ff70c83ccd0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c83ccd0(uint param_1)

{
  longlong *plVar1;
  uint uVar2;
  longlong lVar3;
  code *pcVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  if ((param_1 & 0xffffcf50) != 0) {
    FUN_7ff70c80af70(&UNK_7ff70cb906a3);
  }
  lVar3 = *(longlong *)(lVar5 + 0x1448);
  if (lVar3 != 0) {
    if ((param_1 & 4) == 0) {
      lVar6 = *(longlong *)(lVar5 + 0x1440);
      if ((param_1 & 2) == 0) {
joined_r0x7ff70c83cd7d:
        if ((param_1 & 1) != 0) {
          lVar9 = lVar3;
          if ((param_1 & 8) == 0) {
LAB_7ff70c83cda0:
            do {
              lVar8 = lVar9;
              lVar9 = *(longlong *)(*(longlong *)(lVar8 + 0x3c0) + 0x3c8);
            } while (lVar8 != lVar9);
          }
          else {
LAB_7ff70c83cdc0:
            do {
              lVar8 = lVar9;
              lVar9 = *(longlong *)(lVar8 + 0x3c0);
            } while (lVar8 != *(longlong *)(lVar8 + 0x3c0));
          }
          lVar9 = lVar3;
          if (lVar8 != lVar6) {
            do {
              if (lVar9 == lVar6) goto LAB_7ff70c83cdff;
            } while ((lVar9 != lVar8) &&
                    (plVar1 = (longlong *)(lVar9 + 0x3b0), lVar9 = *plVar1, *plVar1 != 0));
            goto LAB_7ff70c83ceba;
          }
          goto LAB_7ff70c83cdff;
        }
      }
      else {
        if (lVar6 == 0) {
          lVar6 = 0;
          goto joined_r0x7ff70c83cd7d;
        }
        lVar9 = lVar6;
        if ((param_1 & 8) == 0) {
          do {
            lVar6 = lVar9;
            lVar9 = *(longlong *)(*(longlong *)(lVar6 + 0x3c0) + 0x3c8);
          } while (lVar6 != lVar9);
          lVar9 = lVar3;
          if ((param_1 & 1) == 0) goto LAB_7ff70c83cd7f;
          goto LAB_7ff70c83cda0;
        }
        do {
          lVar6 = lVar9;
          lVar9 = *(longlong *)(lVar6 + 0x3c0);
        } while (lVar6 != *(longlong *)(lVar6 + 0x3c0));
        lVar9 = lVar3;
        if ((param_1 & 1) != 0) goto LAB_7ff70c83cdc0;
      }
LAB_7ff70c83cd7f:
      if (lVar3 != lVar6) goto LAB_7ff70c83ceba;
    }
LAB_7ff70c83cdff:
    uVar7 = *(ulonglong *)(_DAT_7ff70cc1a3c0 + 0x1f98);
    if ((((uVar7 != 0) && (lVar6 = *(longlong *)(uVar7 + 0x3c0), lVar6 != 0)) &&
        (*(char *)(lVar6 + 0xcd) == '\x01')) &&
       (lVar9 = *(longlong *)(lVar3 + 0x3c0), lVar6 != lVar9)) {
      uVar2 = *(uint *)(lVar6 + 0x14);
      uVar7 = (ulonglong)uVar2;
      if ((((uVar2 & 0x8000000) != 0) ||
          (((param_1 & 0x20) == 0 &&
           (uVar7 = (ulonglong)(uVar2 & 0x4000000), (uVar2 & 0x4000000) != 0)))) &&
         (*(longlong *)(lVar9 + 0x3c0) != lVar6)) {
        do {
          if (lVar9 == lVar6) goto LAB_7ff70c83ce75;
          lVar9 = *(longlong *)(lVar9 + 0x3b8);
          uVar7 = 0;
        } while (lVar9 != 0);
        goto LAB_7ff70c83cebc;
      }
    }
LAB_7ff70c83ce75:
    if (-1 < (char)param_1) {
      uVar2 = *(uint *)(lVar5 + 0x14b4);
      uVar7 = (ulonglong)uVar2;
      if (((uVar2 != 0) && (*(char *)(lVar5 + 0x14c1) == '\0')) &&
         (uVar2 != *(uint *)(lVar3 + 0x8c))) goto LAB_7ff70c83ceba;
    }
    if ((param_1 & 0x1000) != 0) {
      param_1 = param_1 | *(uint *)(lVar5 + 0x1100);
    }
    if (((param_1 & 0x2000) == 0) ||
       (uVar7 = (ulonglong)*(uint *)(lVar5 + 0x23f4),
       *(uint *)(lVar5 + 0x23f4) == *(uint *)(lVar3 + 0x10))) {
      uVar7 = CONCAT71((int7)(uVar7 >> 8),1);
      goto LAB_7ff70c83cebc;
    }
  }
LAB_7ff70c83ceba:
  uVar7 = 0;
LAB_7ff70c83cebc:
  if (_DAT_7ff70cbebd80 != (uStack_18 ^ (ulonglong)auStack_38)) {
    FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
    pcVar4 = (code *)swi(3);
    uVar7 = (*pcVar4)();
    return uVar7;
  }
  return uVar7;
}


