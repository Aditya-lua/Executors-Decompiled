
void FUN_000dd490(void)

{
  byte bVar1;
  int iVar2;
  undefined1 *puVar3;
  long lVar4;
  long lVar5;
  char *pcVar6;
  uint uVar7;
  char *pcVar8;
  uint uVar9;
  long lVar10;
  uint uVar11;
  long unaff_x19;
  long unaff_x20;
  char *unaff_x22;
  long unaff_x25;
  char *pcVar12;
  char *unaff_x28;
  undefined1 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  char *in_stack_00000028;
  
code_r0x000dd490:
  lVar5 = (**(code **)(unaff_x25 + 0x20))();
LAB_000dd2ec:
  do {
    do {
      pcVar6 = unaff_x22 + 1;
      if (unaff_x28 <= pcVar6) {
        *in_stack_00000008 = 1;
        _memcpy(in_stack_00000018,in_stack_00000010,in_stack_00000020);
        if (*(int *)(in_stack_00000008 + 0x18) != 0) {
          lVar5 = *(long *)(&UNK_00005f78 + unaff_x19);
          lVar4 = (long)*(int *)(in_stack_00000008 + 0x18) * 0x48;
          do {
            if (*(code **)(lVar5 + 0x30) != (code *)0x0) {
              (**(code **)(lVar5 + 0x30))();
            }
            lVar5 = lVar5 + 0x48;
            lVar4 = lVar4 + -0x48;
          } while (lVar4 != 0);
        }
        return;
      }
      pcVar8 = unaff_x22 + 3;
      pcVar12 = unaff_x22 + 4;
      if (*pcVar6 == '\n' || *pcVar6 == '\r') {
        do {
          pcVar8 = pcVar8 + 1;
          pcVar12 = pcVar12 + 1;
          pcVar6 = pcVar6 + 1;
        } while (*pcVar6 == '\n' || *pcVar6 == '\r');
      }
      unaff_x22 = pcVar6;
      if (pcVar6 < unaff_x28) {
        do {
          if (*unaff_x22 == '\n' || *unaff_x22 == '\r') goto code_r0x000dd358;
          unaff_x22 = unaff_x22 + 1;
        } while (unaff_x22 < unaff_x28);
        unaff_x22 = in_stack_00000028;
      }
code_r0x000dd358:
      *unaff_x22 = '\0';
    } while (*pcVar6 == ';');
    if ((!(*pcVar6 != '[' || unaff_x22 <= pcVar6)) && (unaff_x22[-1] == ']')) {
      unaff_x22[-1] = '\0';
      puVar3 = (undefined1 *)_memchr(pcVar6 + 1,0x5d,(long)unaff_x22 - (long)pcVar8);
      if ((puVar3 != (undefined1 *)0x0) &&
         (lVar4 = _memchr(puVar3 + 1,0x5b,(long)(unaff_x22 + -1) - (long)(puVar3 + 1)), lVar4 != 0))
      {
        *puVar3 = 0;
        bVar1 = pcVar6[1];
        if (bVar1 == 0) {
          uVar7 = 0;
          iVar2 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
        }
        else {
          uVar7 = 0xffffffff;
          uVar9 = (uint)bVar1;
          do {
            uVar11 = (uint)(byte)pcVar12[-1];
            if (((uVar9 == 0x23) && (uVar11 == 0x23)) && (*pcVar12 == '#')) {
              uVar7 = 0xffffffff;
            }
            uVar7 = *(uint *)(unaff_x20 + (ulong)(uVar7 & 0xff ^ uVar9) * 4) ^ uVar7 >> 8;
            pcVar12 = pcVar12 + 1;
            uVar9 = uVar11;
          } while (uVar11 != 0);
          uVar7 = ~uVar7;
          iVar2 = *(int *)(&UNK_00005f70 + lRam0000000000a334c0);
        }
        if (iVar2 == 0) {
          unaff_x25 = 0;
          lVar5 = 0;
        }
        else {
          lVar4 = *(long *)(&UNK_00005f78 + lRam0000000000a334c0);
          lVar10 = (long)iVar2 * 0x48;
          do {
            unaff_x25 = lVar4;
            if (*(uint *)(lVar4 + 8) == uVar7) goto code_r0x000dd490;
            unaff_x25 = 0;
            lVar5 = 0;
            lVar4 = lVar4 + 0x48;
            lVar10 = lVar10 + -0x48;
          } while (lVar10 != 0);
        }
      }
      goto LAB_000dd2ec;
    }
    if ((unaff_x25 != 0) && (lVar5 != 0)) {
      (**(code **)(unaff_x25 + 0x28))();
    }
  } while( true );
}

