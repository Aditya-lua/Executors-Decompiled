
void FUN_0012ef44(long param_1,uint param_2)

{
  char cVar1;
  ushort uVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  char *pcVar8;
  ulong uVar9;
  byte *pbVar10;
  undefined *puVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  uint uVar15;
  long lVar16;
  
  if (*(char *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0xc3) == '\0') {
    uVar2 = *(ushort *)(param_1 + 0x224);
    iVar7 = (int)(short)uVar2;
    if (((short)uVar2 < 0) ||
       (*(int *)(param_1 + 0x6c) == (int)(short)uVar2 ||
        *(int *)(param_1 + 0x6c) < (int)(short)uVar2)) {
      pbVar10 = (byte *)0x0;
      iVar7 = -1;
    }
    else {
      pbVar10 = (byte *)(*(long *)(param_1 + 0x18) + (ulong)uVar2 * 0x70);
    }
    if ((param_2 & 1) != 0) {
      if (pbVar10 != (byte *)0x0) {
        if ((*pbVar10 >> 5 & 1) == 0) {
          bVar5 = pbVar10[0x62] != 0;
        }
        else {
          bVar5 = false;
        }
        pcVar8 = "*Missing Text*";
        if (*(char **)(&UNK_00005fc0 + lRam0000000000a334c0) != (char *)0x0) {
          pcVar8 = *(char **)(&UNK_00005fc0 + lRam0000000000a334c0);
        }
        iVar6 = func_0x001266f4(pcVar8,0,0,bVar5);
        if ((iVar6 != 0) &&
           (*(char *)(*(long *)(param_1 + 0x18) + (long)iVar7 * 0x70 + 0x62) != '\0')) {
          *(undefined1 *)(*(long *)(param_1 + 0x18) + (long)iVar7 * 0x70 + 0x6c) = 1;
          *(short *)(param_1 + 0x210) = (short)iVar7;
        }
      }
      if ((*(short *)(param_1 + 0x204) == *(short *)(param_1 + 0x202)) &&
         ((*(uint *)(param_1 + 4) & 0xe000) != 0x4000)) {
        puVar11 = &UNK_00005fc8;
      }
      else {
        puVar11 = &UNK_00005fd0;
      }
      pcVar8 = "*Missing Text*";
      if (*(char **)(puVar11 + lRam0000000000a334c0) != (char *)0x0) {
        pcVar8 = *(char **)(puVar11 + lRam0000000000a334c0);
      }
      iVar7 = func_0x001266f4(pcVar8,0,0,1);
      if ((iVar7 != 0) &&
         (uVar9 = (ulong)*(uint *)(param_1 + 0x6c), 0 < (int)*(uint *)(param_1 + 0x6c))) {
        lVar14 = *(long *)(param_1 + 0x18) + 0x6c;
        do {
          if ((*(char *)(lVar14 + -10) != '\0') || ((*(byte *)(lVar14 + -0x6c) >> 3 & 1) != 0)) {
            *(undefined2 *)(lVar14 + -1) = 0x102;
          }
          lVar14 = lVar14 + 0x70;
          uVar9 = uVar9 - 1;
        } while (uVar9 != 0);
      }
    }
    uVar15 = param_2 & 1;
    if ((param_2 >> 1 & 1) != 0) {
      pcVar8 = "*Missing Text*";
      if (*(char **)(&UNK_00005fd8 + lRam0000000000a334c0) != (char *)0x0) {
        pcVar8 = *(char **)(&UNK_00005fd8 + lRam0000000000a334c0);
      }
      iVar7 = func_0x001266f4(pcVar8,0,0,*(char *)(param_1 + 0x23f) == '\0');
      uVar15 = 1;
      if (iVar7 != 0) {
        *(undefined1 *)(param_1 + 0x241) = 1;
      }
    }
    if ((param_2 >> 2 & 1) != 0) {
      if (uVar15 != 0) {
        func_0x0010df50();
      }
      func_0x000d35a8(0x20,1);
      if (0 < *(int *)(param_1 + 0x6c)) {
        lVar13 = 0;
        lVar14 = 0;
        do {
          lVar16 = *(long *)(param_1 + 0x18);
          uVar15 = *(uint *)(lVar16 + lVar13);
          if ((uVar15 & 1) == 0) {
            if ((*(char *)(param_1 + 0x236) == '\0') &&
               (pcVar8 = "", *(short *)(param_1 + 0x206) <= lVar14)) {
code_r0x0012f1ac:
              if (*pcVar8 == '\0') goto code_r0x0012f1b4;
            }
            else {
              lVar12 = (long)*(short *)(lVar16 + lVar13 + 0x50);
              if (lVar12 == -1) {
                pcVar8 = "";
                if (s__008ed50c[0] != '\0') goto code_r0x0012f1b8;
              }
              else if (*(long *)(param_1 + 0x198) != 0) {
                pcVar8 = (char *)(*(long *)(param_1 + 0x198) + lVar12);
                goto code_r0x0012f1ac;
              }
code_r0x0012f1b4:
              pcVar8 = "<Unknown>";
            }
code_r0x0012f1b8:
            bVar5 = (uVar15 & 0x80) == 0;
            cVar1 = *(char *)(lVar16 + lVar13 + 99);
            if (cVar1 != '\0') {
              bVar5 = false;
              bVar3 = true;
              bVar4 = false;
              if ((uVar15 & 0x80) == 0) {
                iVar7 = (int)*(short *)(param_1 + 0x202);
                bVar4 = SBORROW4(iVar7,1);
                bVar5 = iVar7 + -1 < 0;
                bVar3 = iVar7 == 1;
              }
              bVar5 = !bVar3 && bVar5 == bVar4;
            }
            iVar7 = func_0x001266f4(pcVar8,0,cVar1 != '\0',bVar5);
            if (iVar7 != 0) {
              *(byte *)(lVar16 + lVar13 + 100) = *(byte *)(lVar16 + lVar13 + 99) ^ 1;
            }
          }
          lVar14 = lVar14 + 1;
          lVar13 = lVar13 + 0x70;
        } while (lVar14 < *(int *)(param_1 + 0x6c));
      }
      lVar14 = lRam0000000000a334c0;
      iVar7 = *(int *)(&UNK_00004ab0 + lRam0000000000a334c0);
      *(int *)(&UNK_00004ab0 + lRam0000000000a334c0) = iVar7 + -1;
      *(undefined4 *)(&UNK_0000497c + lVar14) =
           *(undefined4 *)(*(long *)(&UNK_00004ab8 + lVar14) + (long)(iVar7 + -2) * 4);
      return;
    }
  }
  return;
}

