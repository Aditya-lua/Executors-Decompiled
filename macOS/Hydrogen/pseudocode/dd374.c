
void FUN_000dd374(void)

{
  byte bVar1;
  int iVar2;
  undefined1 *puVar3;
  long lVar4;
  char *pcVar5;
  uint uVar6;
  char *pcVar7;
  uint uVar8;
  long lVar9;
  uint uVar10;
  long unaff_x19;
  long unaff_x20;
  char *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  char *pcVar11;
  char *unaff_x28;
  undefined1 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  char *in_stack_00000028;
  
code_r0x000dd374:
  if ((unaff_x24 != 0) && (unaff_x23 != 0)) {
    (**(code **)(unaff_x24 + 0x28))();
  }
  do {
    do {
      pcVar5 = unaff_x22 + 1;
      if (unaff_x28 <= pcVar5) {
        *in_stack_00000008 = 1;
        _memcpy(in_stack_00000018,in_stack_00000010,in_stack_00000020);
        if (*(int *)(in_stack_00000008 + 0x18) != 0) {
          lVar4 = *(long *)(&UNK_00005f78 + unaff_x19);
          lVar9 = (long)*(int *)(in_stack_00000008 + 0x18) * 0x48;
          do {
            if (*(code **)(lVar4 + 0x30) != (code *)0x0) {
              (**(code **)(lVar4 + 0x30))();
            }
            lVar4 = lVar4 + 0x48;
            lVar9 = lVar9 + -0x48;
          } while (lVar9 != 0);
        }
        return;
      }
      pcVar7 = unaff_x22 + 3;
      pcVar11 = unaff_x22 + 4;
      if (*pcVar5 == '\n' || *pcVar5 == '\r') {
        do {
          pcVar7 = pcVar7 + 1;
          pcVar11 = pcVar11 + 1;
          pcVar5 = pcVar5 + 1;
        } while (*pcVar5 == '\n' || *pcVar5 == '\r');
      }
      unaff_x22 = pcVar5;
      if (pcVar5 < unaff_x28) {
        do {
          if (*unaff_x22 == '\n' || *unaff_x22 == '\r') goto code_r0x000dd358;
          unaff_x22 = unaff_x22 + 1;
        } while (unaff_x22 < unaff_x28);
        unaff_x22 = in_stack_00000028;
      }
code_r0x000dd358:
      *unaff_x22 = '\0';
    } while (*pcVar5 == ';');
    if ((*pcVar5 != '[' || unaff_x22 <= pcVar5) || (unaff_x22[-1] != ']')) goto code_r0x000dd374;
    unaff_x22[-1] = '\0';
    puVar3 = (undefined1 *)_memchr(pcVar5 + 1,0x5d,(long)unaff_x22 - (long)pcVar7);
    if (puVar3 != (undefined1 *)0x0) {
      lVar4 = _memchr(puVar3 + 1,0x5b,(long)(unaff_x22 + -1) - (long)(puVar3 + 1));
      if (lVar4 != 0) {
        *puVar3 = 0;
        bVar1 = pcVar5[1];
        if (bVar1 == 0) {
          uVar6 = 0;
          iVar2 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
        }
        else {
          uVar6 = 0xffffffff;
          uVar8 = (uint)bVar1;
          do {
            uVar10 = (uint)(byte)pcVar11[-1];
            if (((uVar8 == 0x23) && (uVar10 == 0x23)) && (*pcVar11 == '#')) {
              uVar6 = 0xffffffff;
            }
            uVar6 = *(uint *)(unaff_x20 + (ulong)(uVar6 & 0xff ^ uVar8) * 4) ^ uVar6 >> 8;
            pcVar11 = pcVar11 + 1;
            uVar8 = uVar10;
          } while (uVar10 != 0);
          uVar6 = ~uVar6;
          iVar2 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
        }
        if (iVar2 == 0) {
          unaff_x23 = 0;
          unaff_x24 = 0;
        }
        else {
          lVar4 = *(long *)(&UNK_00005f78 + lRam0000000000a334c0);
          lVar9 = (long)iVar2 * 0x48;
          do {
            if (*(uint *)(lVar4 + 8) == uVar6) {
              unaff_x23 = (**(code **)(lVar4 + 0x20))();
              unaff_x24 = lVar4;
              break;
            }
            unaff_x24 = 0;
            unaff_x23 = 0;
            lVar4 = lVar4 + 0x48;
            lVar9 = lVar9 + -0x48;
          } while (lVar9 != 0);
        }
      }
    }
  } while( true );
}

