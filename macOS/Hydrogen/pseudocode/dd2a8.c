
void FUN_000dd2a8(void)

{
  byte bVar1;
  int iVar2;
  undefined1 *puVar3;
  char *pcVar4;
  uint uVar5;
  char *pcVar6;
  uint uVar7;
  long lVar8;
  uint uVar9;
  long unaff_x19;
  long lVar10;
  char *pcVar11;
  long unaff_x23;
  long lVar12;
  char *pcVar13;
  char *unaff_x28;
  undefined1 *in_stack_00000008;
  undefined8 in_stack_00000010;
  char *in_stack_00000018;
  long in_stack_00000020;
  char *pcStack0000000000000028;
  
  lVar12 = 0;
  pcStack0000000000000028 = in_stack_00000018 + in_stack_00000020;
  pcVar4 = in_stack_00000018;
  do {
    pcVar6 = pcVar4 + 2;
    pcVar13 = pcVar4 + 3;
    if (*pcVar4 == '\n' || *pcVar4 == '\r') {
      do {
        pcVar6 = pcVar6 + 1;
        pcVar13 = pcVar13 + 1;
        pcVar4 = pcVar4 + 1;
      } while (*pcVar4 == '\n' || *pcVar4 == '\r');
    }
    pcVar11 = pcVar4;
    if (pcVar4 < unaff_x28) {
      do {
        if (*pcVar11 == '\n' || *pcVar11 == '\r') goto LAB_000dd358;
        pcVar11 = pcVar11 + 1;
      } while (pcVar11 < unaff_x28);
      pcVar11 = pcStack0000000000000028;
    }
LAB_000dd358:
    *pcVar11 = '\0';
    if (*pcVar4 != ';') {
      if ((*pcVar4 == '[' && pcVar4 < pcVar11) && (pcVar11[-1] == ']')) {
        pcVar11[-1] = '\0';
        puVar3 = (undefined1 *)_memchr(pcVar4 + 1,0x5d,(long)pcVar11 - (long)pcVar6);
        if (puVar3 != (undefined1 *)0x0) {
          lVar10 = _memchr(puVar3 + 1,0x5b,(long)(pcVar11 + -1) - (long)(puVar3 + 1));
          if (lVar10 != 0) {
            *puVar3 = 0;
            bVar1 = pcVar4[1];
            if (bVar1 == 0) {
              uVar5 = 0;
              iVar2 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
            }
            else {
              uVar5 = 0xffffffff;
              uVar7 = (uint)bVar1;
              do {
                uVar9 = (uint)(byte)pcVar13[-1];
                if (((uVar7 == 0x23) && (uVar9 == 0x23)) && (*pcVar13 == '#')) {
                  uVar5 = 0xffffffff;
                }
                uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ uVar7) * 4) ^ uVar5 >> 8;
                pcVar13 = pcVar13 + 1;
                uVar7 = uVar9;
              } while (uVar9 != 0);
              uVar5 = ~uVar5;
              iVar2 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
            }
            if (iVar2 == 0) {
              unaff_x23 = 0;
              lVar12 = 0;
            }
            else {
              lVar10 = *(long *)(&UNK_00005f78 + lRam0000000000a334c0);
              lVar8 = (long)iVar2 * 0x48;
              do {
                if (*(uint *)(lVar10 + 8) == uVar5) {
                  unaff_x23 = (**(code **)(lVar10 + 0x20))();
                  lVar12 = lVar10;
                  break;
                }
                lVar12 = 0;
                unaff_x23 = 0;
                lVar10 = lVar10 + 0x48;
                lVar8 = lVar8 + -0x48;
              } while (lVar8 != 0);
            }
          }
        }
      }
      else if ((lVar12 != 0) && (unaff_x23 != 0)) {
        (**(code **)(lVar12 + 0x28))();
      }
    }
    pcVar4 = pcVar11 + 1;
    if (unaff_x28 <= pcVar4) {
      *in_stack_00000008 = 1;
      _memcpy(in_stack_00000018,in_stack_00000010,in_stack_00000020);
      if (*(int *)(in_stack_00000008 + 0x18) != 0) {
        lVar12 = *(long *)(&UNK_00005f78 + unaff_x19);
        lVar10 = (long)*(int *)(in_stack_00000008 + 0x18) * 0x48;
        do {
          if (*(code **)(lVar12 + 0x30) != (code *)0x0) {
            (**(code **)(lVar12 + 0x30))();
          }
          lVar12 = lVar12 + 0x48;
          lVar10 = lVar10 + -0x48;
        } while (lVar10 != 0);
      }
      return;
    }
  } while( true );
}

