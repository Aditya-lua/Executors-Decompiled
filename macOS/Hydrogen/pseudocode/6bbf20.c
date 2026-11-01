
void FUN_006bbf20(ulong param_1)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  uint *in_x9;
  ulong in_x10;
  int in_w12;
  long unaff_x19;
  int unaff_w22;
  long lVar4;
  undefined8 *unaff_x25;
  long unaff_x26;
  undefined8 *puVar5;
  ulong unaff_x28;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  ulong in_stack_00000020;
  long *in_stack_00000030;
  ulong in_stack_00000038;
  uint *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  
  do {
    do {
      param_1 = (ulong)((*in_x9 ^ (uint)param_1) * in_w12);
      in_x10 = in_x10 - 1;
      in_x9 = in_x9 + 1;
    } while (in_x10 != 0);
    do {
      lVar4 = 0;
      while( true ) {
        param_1 = param_1 & in_stack_00000058;
        puVar5 = (undefined8 *)(in_stack_00000060 + param_1 * unaff_x26);
        iVar3 = *(int *)(puVar5 + 0x10);
        if ((iVar3 == unaff_w22) &&
           (iVar2 = _memcmp(puVar5,in_stack_00000050,in_stack_00000048), iVar2 == 0)) break;
        if ((iVar3 == (int)unaff_x28) && (iVar3 = _memcmp(puVar5,unaff_x25,unaff_x19), iVar3 == 0))
        goto LAB_006bbe68;
        lVar4 = lVar4 + 1;
        param_1 = lVar4 + param_1;
      }
      uVar6 = *unaff_x25;
      puVar5[1] = unaff_x25[1];
      *puVar5 = uVar6;
      uVar7 = unaff_x25[3];
      uVar6 = unaff_x25[2];
      uVar9 = unaff_x25[5];
      uVar8 = unaff_x25[4];
      uVar10 = unaff_x25[6];
      uVar12 = unaff_x25[9];
      uVar11 = unaff_x25[8];
      puVar5[7] = unaff_x25[7];
      puVar5[6] = uVar10;
      puVar5[9] = uVar12;
      puVar5[8] = uVar11;
      puVar5[3] = uVar7;
      puVar5[2] = uVar6;
      puVar5[5] = uVar9;
      puVar5[4] = uVar8;
      uVar7 = unaff_x25[0xb];
      uVar6 = unaff_x25[10];
      uVar9 = unaff_x25[0xd];
      uVar8 = unaff_x25[0xc];
      uVar11 = unaff_x25[0xf];
      uVar10 = unaff_x25[0xe];
      *(undefined4 *)(puVar5 + 0x10) = *(undefined4 *)(unaff_x25 + 0x10);
      puVar5[0xd] = uVar9;
      puVar5[0xc] = uVar8;
      puVar5[0xf] = uVar11;
      puVar5[0xe] = uVar10;
      puVar5[0xb] = uVar7;
      puVar5[10] = uVar6;
LAB_006bbe68:
      uVar6 = *unaff_x25;
      puVar5[1] = unaff_x25[1];
      *puVar5 = uVar6;
      uVar7 = unaff_x25[3];
      uVar6 = unaff_x25[2];
      uVar9 = unaff_x25[5];
      uVar8 = unaff_x25[4];
      uVar10 = unaff_x25[6];
      uVar12 = unaff_x25[9];
      uVar11 = unaff_x25[8];
      puVar5[7] = unaff_x25[7];
      puVar5[6] = uVar10;
      puVar5[9] = uVar12;
      puVar5[8] = uVar11;
      puVar5[3] = uVar7;
      puVar5[2] = uVar6;
      puVar5[5] = uVar9;
      puVar5[4] = uVar8;
      uVar7 = unaff_x25[0xb];
      uVar6 = unaff_x25[10];
      uVar9 = unaff_x25[0xd];
      uVar8 = unaff_x25[0xc];
      uVar11 = unaff_x25[0xf];
      uVar10 = unaff_x25[0xe];
      *(undefined4 *)(puVar5 + 0x10) = *(undefined4 *)(unaff_x25 + 0x10);
      puVar5[0xd] = uVar9;
      puVar5[0xc] = uVar8;
      puVar5[0xf] = uVar11;
      puVar5[0xe] = uVar10;
      puVar5[0xb] = uVar7;
      puVar5[10] = uVar6;
      unaff_x26 = 0x88;
      *(undefined4 *)(in_stack_00000060 + param_1 * 0x88 + 0x84) =
           *(undefined4 *)(in_stack_00000018 + in_stack_00000038 * 0x88 + 0x84);
      do {
        in_stack_00000038 = in_stack_00000038 + 1;
        in_x9 = in_stack_00000040 + 0x22;
        if (in_stack_00000020 <= in_stack_00000038) {
          *in_stack_00000030 = in_stack_00000060;
          in_stack_00000030[1] = in_stack_00000008;
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR___ZdlPv_009b01b8)(in_stack_00000018);
          return;
        }
        unaff_x25 = (undefined8 *)(in_stack_00000018 + in_stack_00000038 * 0x88);
        uVar1 = *(uint *)(unaff_x25 + 0x10);
        in_x10 = (ulong)uVar1;
        unaff_x19 = in_x10 << 2;
        in_stack_00000040 = in_x9;
      } while ((uVar1 == *(uint *)(in_stack_00000030 + 0x13)) &&
              (iVar3 = _memcmp(unaff_x25,in_stack_00000010,unaff_x19), iVar3 == 0));
      param_1 = 0x811c9dc5;
      unaff_x28 = in_x10;
    } while (uVar1 == 0);
    in_w12 = 0x1000193;
  } while( true );
}

