
void FUN_000dd1c4(undefined8 param_1,long param_2)

{
  undefined *puVar1;
  char *pcVar2;
  int iVar3;
  int iVar4;
  byte bVar5;
  long lVar6;
  char *pcVar7;
  undefined1 *puVar8;
  long lVar9;
  char *pcVar10;
  int iVar11;
  uint uVar12;
  char *pcVar13;
  uint uVar14;
  long lVar15;
  uint uVar16;
  int iVar17;
  long lVar18;
  char *pcVar19;
  long lVar20;
  long lVar21;
  char *pcVar22;
  
  lVar6 = lRam0000000000a334c0;
  puVar1 = &UNK_00005f58 + lRam0000000000a334c0;
  if (param_2 == 0) {
    param_2 = _strlen(param_1);
    iVar17 = (int)param_2 + 1;
    iVar11 = *(int *)(&UNK_00005f64 + lVar6);
    if ((int)param_2 < iVar11) goto LAB_000dd238;
  }
  else {
    iVar17 = (int)param_2 + 1;
    iVar11 = *(int *)(&UNK_00005f64 + lRam0000000000a334c0);
    if ((int)param_2 < iVar11) goto LAB_000dd238;
  }
  iVar3 = iVar11;
  if (iVar11 < 0) {
    iVar3 = iVar11 + 1;
  }
  iVar4 = 8;
  if (iVar11 != 0) {
    iVar4 = iVar11 + (iVar3 >> 1);
  }
  if (iVar4 <= iVar17) {
    iVar4 = iVar17;
  }
  func_0x000ba578(&UNK_00005f60 + lVar6,iVar4);
LAB_000dd238:
  *(int *)(&UNK_00005f60 + lVar6) = iVar17;
  pcVar7 = *(char **)(&UNK_00005f68 + lVar6);
  pcVar2 = pcVar7 + param_2;
  _memcpy(pcVar7,param_1,param_2);
  *pcVar2 = '\0';
  if (*(int *)(&UNK_00005f70 + lVar6) != 0) {
    lVar20 = *(long *)(&UNK_00005f78 + lVar6);
    lVar18 = (long)*(int *)(&UNK_00005f70 + lVar6) * 0x48;
    do {
      if (*(code **)(lVar20 + 0x18) != (code *)0x0) {
        (**(code **)(lVar20 + 0x18))(lVar6,lVar20);
      }
      lVar20 = lVar20 + 0x48;
      lVar18 = lVar18 + -0x48;
    } while (lVar18 != 0);
  }
  if (0 < param_2) {
    lVar18 = 0;
    lVar20 = 0;
    pcVar10 = pcVar7;
    do {
      pcVar13 = pcVar10 + 2;
      pcVar22 = pcVar10 + 3;
      if (*pcVar10 == '\n' || *pcVar10 == '\r') {
        do {
          pcVar13 = pcVar13 + 1;
          pcVar22 = pcVar22 + 1;
          pcVar10 = pcVar10 + 1;
        } while (*pcVar10 == '\n' || *pcVar10 == '\r');
      }
      pcVar19 = pcVar10;
      if (pcVar10 < pcVar2) {
        do {
          if (*pcVar19 == '\n' || *pcVar19 == '\r') goto LAB_000dd358;
          pcVar19 = pcVar19 + 1;
        } while (pcVar19 < pcVar2);
        pcVar19 = pcVar7 + param_2;
      }
LAB_000dd358:
      *pcVar19 = '\0';
      if (*pcVar10 != ';') {
        if ((*pcVar10 == '[' && pcVar10 < pcVar19) && (pcVar19[-1] == ']')) {
          pcVar19[-1] = '\0';
          puVar8 = (undefined1 *)_memchr(pcVar10 + 1,0x5d,(long)pcVar19 - (long)pcVar13);
          if (puVar8 != (undefined1 *)0x0) {
            lVar9 = _memchr(puVar8 + 1,0x5b,(long)(pcVar19 + -1) - (long)(puVar8 + 1));
            if (lVar9 != 0) {
              *puVar8 = 0;
              bVar5 = pcVar10[1];
              if (bVar5 == 0) {
                uVar12 = 0;
                iVar17 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
              }
              else {
                uVar12 = 0xffffffff;
                uVar14 = (uint)bVar5;
                do {
                  uVar16 = (uint)(byte)pcVar22[-1];
                  if (((uVar14 == 0x23) && (uVar16 == 0x23)) && (*pcVar22 == '#')) {
                    uVar12 = 0xffffffff;
                  }
                  uVar12 = *(uint *)(&UNK_0080c404 + (ulong)(uVar12 & 0xff ^ uVar14) * 4) ^
                           uVar12 >> 8;
                  pcVar22 = pcVar22 + 1;
                  uVar14 = uVar16;
                } while (uVar16 != 0);
                uVar12 = ~uVar12;
                iVar17 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
              }
              if (iVar17 == 0) {
                lVar18 = 0;
                lVar20 = 0;
              }
              else {
                lVar21 = *(long *)(&UNK_00005f78 + lRam0000000000a334c0);
                lVar15 = (long)iVar17 * 0x48;
                do {
                  if (*(uint *)(lVar21 + 8) == uVar12) {
                    lVar18 = (**(code **)(lVar21 + 0x20))(lVar6,lVar21,lVar9 + 1);
                    lVar20 = lVar21;
                    break;
                  }
                  lVar20 = 0;
                  lVar18 = 0;
                  lVar21 = lVar21 + 0x48;
                  lVar15 = lVar15 + -0x48;
                } while (lVar15 != 0);
              }
            }
          }
        }
        else if ((lVar20 != 0) && (lVar18 != 0)) {
          (**(code **)(lVar20 + 0x28))(lVar6,lVar20,lVar18);
        }
      }
      pcVar10 = pcVar19 + 1;
    } while (pcVar10 < pcVar2);
  }
  *puVar1 = 1;
  _memcpy(pcVar7,param_1,param_2);
  if (*(int *)(&UNK_00005f70 + lVar6) != 0) {
    lVar20 = *(long *)(&UNK_00005f78 + lVar6);
    lVar18 = (long)*(int *)(&UNK_00005f70 + lVar6) * 0x48;
    do {
      if (*(code **)(lVar20 + 0x30) != (code *)0x0) {
        (**(code **)(lVar20 + 0x30))(lVar6,lVar20);
      }
      lVar20 = lVar20 + 0x48;
      lVar18 = lVar18 + -0x48;
    } while (lVar18 != 0);
  }
  return;
}

