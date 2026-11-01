
/* WARNING: Removing unreachable block (ram,0x0041fe0c) */
/* WARNING: Removing unreachable block (ram,0x0041fe10) */

void FUN_0041fdd8(long param_1)

{
  undefined2 *puVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  code *pcVar5;
  undefined8 uVar6;
  undefined *puVar7;
  uint uVar8;
  uint in_w8;
  long lVar9;
  long in_x9;
  undefined2 uVar10;
  long *unaff_x20;
  long unaff_x21;
  int iVar11;
  uint uVar12;
  uint unaff_w25;
  long unaff_x26;
  undefined *puVar13;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
code_r0x0041fdd8:
  if (in_w8 < 0x1c) {
    puVar13 = &UNK_0088751b;
    uVar6 = 0x35;
    puVar7 = &UNK_009dbc00;
code_r0x0041fea4:
    func_0x007a247c(puVar13,uVar6,puVar7);
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x41fefc);
    (*pcVar5)();
  }
  uVar2 = *(undefined4 *)(in_x9 + 4);
  iVar11 = *(uint *)(in_x9 + 8) << 0x10;
  puVar13 = *(undefined **)(in_x9 + 0xc);
  uVar3 = *(undefined4 *)(in_x9 + 0x14);
  uVar4 = *(undefined4 *)(in_x9 + 0x18);
  uVar12 = *(uint *)(in_x9 + 8) >> 0x10;
  uVar10 = 1;
  uVar8 = unaff_w25;
  if (unaff_x21 != uStack0000000000000018) goto LAB_0041fd30;
  do {
    func_0x007a0000(&uStack0000000000000018,unaff_x21,1,4,0x20);
    param_1 = in_stack_00000020;
LAB_0041fd30:
    do {
      puVar1 = (undefined2 *)(param_1 + unaff_x21 * 0x20);
      *puVar1 = uVar10;
      *(int *)(puVar1 + 1) = iVar11;
      puVar1[3] = (short)uVar12;
      *(undefined **)(puVar1 + 4) = puVar13;
      *(undefined4 *)(puVar1 + 8) = uVar3;
      *(undefined4 *)(puVar1 + 10) = uVar2;
      *(undefined4 *)(puVar1 + 0xc) = uVar4;
      puVar1[0xe] = (short)uVar8;
      unaff_x21 = unaff_x21 + 1;
      in_stack_00000028 = unaff_x21;
      if (unaff_x26 == 0) {
code_r0x0041fe40:
        _freeaddrinfo(in_stack_00000010);
        *unaff_x20 = in_stack_00000020;
        unaff_x20[1] = in_stack_00000020;
        unaff_x20[2] = uStack0000000000000018;
        unaff_x20[3] = in_stack_00000020 + unaff_x21 * 0x20;
        return;
      }
      lVar9 = unaff_x26;
      while( true ) {
        in_x9 = *(long *)(lVar9 + 0x20);
        unaff_x26 = *(long *)(lVar9 + 0x28);
        if (*(char *)(in_x9 + 1) == '\x1e') {
          in_w8 = *(uint *)(lVar9 + 0x10);
          goto code_r0x0041fdd8;
        }
        if (*(char *)(in_x9 + 1) == '\x02') break;
        lVar9 = unaff_x26;
        if (unaff_x26 == 0) goto code_r0x0041fe40;
      }
      if (*(uint *)(lVar9 + 0x10) < 0x10) {
        puVar7 = &UNK_009dbbe8;
        puVar13 = &UNK_008874bb;
        uVar6 = 0x34;
        goto code_r0x0041fea4;
      }
      uVar10 = 0;
      iVar11 = *(int *)(in_x9 + 4);
      uVar8 = (uint)*(ushort *)(in_x9 + 2);
      puVar13 = &UNK_009dbc18;
      uVar12 = unaff_w25;
    } while (unaff_x21 != uStack0000000000000018);
  } while( true );
}

