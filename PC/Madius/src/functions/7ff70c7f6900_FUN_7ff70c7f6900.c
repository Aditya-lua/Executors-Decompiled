/* 7ff70c7f6900 FUN_7ff70c7f6900 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7f6900(longlong param_1)

{
  int iVar1;
  int iVar2;
  longlong lVar3;
  undefined4 *puVar4;
  code *pcVar5;
  longlong lVar6;
  undefined1 auStack_68 [32];
  undefined8 uStack_48;
  undefined8 uStack_40;
  ulonglong uStack_38;
  
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  iVar1 = *(int *)(param_1 + 0x40);
  if ((longlong)iVar1 != 0) {
    lVar3 = *(longlong *)(param_1 + 0x48);
    lVar6 = 0;
    do {
      puVar4 = *(undefined4 **)(lVar3 + lVar6);
      iVar2 = puVar4[1];
      if (iVar2 == 4) {
        if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
          uStack_40 = *(undefined8 *)(puVar4 + 2);
          uStack_48 = *(undefined8 *)(puVar4 + 4);
          FUN_7ff70c800cf0(&UNK_7ff70cb90faa,*puVar4,puVar4[7],puVar4[8]);
        }
      }
      else if (iVar2 == 3) {
        if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
          uStack_48 = *(undefined8 *)(puVar4 + 2);
          FUN_7ff70c800cf0(&UNK_7ff70cb9140e,*puVar4,puVar4[0x10],*(undefined8 *)(puVar4 + 4));
        }
      }
      else if (((iVar2 == 2) && (_DAT_7ff70cc1a3c0 != 0)) &&
              ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
        FUN_7ff70c800cf0(&UNK_7ff70cb911db,*puVar4,puVar4[7],puVar4[8]);
      }
      lVar6 = lVar6 + 8;
    } while ((longlong)iVar1 * 8 != lVar6);
  }
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_68)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_68);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


