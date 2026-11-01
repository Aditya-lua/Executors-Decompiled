
void FUN_0070e204(void)

{
  undefined8 *puVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  uint in_w8;
  ulong uVar6;
  byte *in_x9;
  ulong in_x10;
  int in_w12;
  ulong unaff_x19;
  int unaff_w21;
  long unaff_x22;
  ulong unaff_x24;
  byte *unaff_x25;
  long lVar7;
  undefined8 uVar8;
  long in_stack_00000000;
  undefined8 *in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  long *in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 in_stack_00000038;
  
  do {
    uVar5 = in_w8 * in_w12;
    uVar6 = (ulong)uVar5;
    in_x10 = in_x10 - 1;
    if (in_x10 == 0) {
      do {
        lVar7 = 0;
        while( true ) {
          puVar1 = (undefined8 *)(unaff_x22 + (uVar6 & unaff_x19) * 0x10);
          iVar4 = *(int *)(puVar1 + 1);
          if ((iVar4 == unaff_w21) && (iVar3 = _memcmp(*puVar1,in_stack_00000038), iVar3 == 0))
          break;
          if ((iVar4 == (int)unaff_x24) &&
             (iVar4 = _memcmp(*puVar1,unaff_x25,unaff_x24), iVar4 == 0)) goto LAB_0070e184;
          lVar7 = lVar7 + 1;
          uVar6 = lVar7 + (uVar6 & unaff_x19);
        }
        uVar8 = *in_stack_00000030;
        puVar1[1] = in_stack_00000030[1];
        *puVar1 = uVar8;
LAB_0070e184:
        uVar8 = *in_stack_00000030;
        puVar1[1] = in_stack_00000030[1];
        *puVar1 = uVar8;
        do {
          in_stack_00000028 = in_stack_00000028 + 1;
          if (in_stack_00000010 <= in_stack_00000028) {
            *in_stack_00000020 = unaff_x22;
            in_stack_00000020[1] = in_stack_00000000;
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)PTR___ZdlPv_009b01b8)(in_stack_00000018);
            return;
          }
          in_stack_00000030 = (undefined8 *)(in_stack_00000018 + in_stack_00000028 * 0x10);
          uVar2 = *(uint *)(in_stack_00000030 + 1);
          in_x10 = (ulong)uVar2;
          in_x9 = (byte *)*in_stack_00000030;
        } while ((uVar2 == *(uint *)(in_stack_00000020 + 4)) &&
                (iVar4 = _memcmp(in_x9,*in_stack_00000008,in_x10), iVar4 == 0));
        uVar6 = 0x811c9dc5;
        uVar5 = 0x811c9dc5;
        unaff_x24 = in_x10;
        unaff_x25 = in_x9;
      } while (uVar2 == 0);
      in_w12 = 0x1000193;
    }
    in_w8 = uVar5 ^ *in_x9;
    in_x9 = in_x9 + 1;
  } while( true );
}

