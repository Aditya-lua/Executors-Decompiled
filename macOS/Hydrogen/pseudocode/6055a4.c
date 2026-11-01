
undefined8 FUN_006055a4(void)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  long *plVar4;
  int iVar5;
  undefined8 uVar6;
  int in_w8;
  ulong uVar7;
  ulong uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long unaff_x21;
  long unaff_x22;
  long unaff_x25;
  uint unaff_w26;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long *in_stack_00000050;
  int in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long *in_stack_00000080;
  int in_stack_00000088;
  
  do {
    iVar5 = in_stack_00000088;
    plVar4 = in_stack_00000080;
    uVar3 = in_stack_00000078;
    uVar8 = in_stack_00000070;
    iVar2 = in_stack_00000058;
    if ((in_w8 != 1) && (*in_stack_00000080 == 0)) {
      uVar7 = in_stack_00000078;
      do {
        if (uVar7 == 0) goto code_r0x006055b0;
        uVar10 = uVar7 - 1;
        lVar1 = uVar7 - 1;
        uVar7 = uVar10;
      } while (in_stack_00000080[lVar1] == 0);
      if ((int)uVar10 == -1) {
code_r0x006055b0:
        if (unaff_w26 != 0) {
          uVar8 = (ulong)unaff_w26;
          do {
            uVar8 = uVar8 - 1;
            uStack0000000000000008._0_1_ = *(undefined1 *)(unaff_x22 + (uVar8 & 0xffffffff));
            func_0x00086db4();
          } while ((uVar8 & 0xffffffff) != 0);
        }
        uVar6 = func_0x00086db4();
        if (unaff_x22 != 0) {
          if ((int)unaff_x21 != 0) {
            puVar9 = (undefined1 *)(unaff_x22 + unaff_x21);
            do {
              puVar9 = puVar9 + -1;
              *puVar9 = 0;
              unaff_x21 = unaff_x21 + -1;
            } while (unaff_x21 != 0);
          }
          func_0x00611644();
        }
        if (in_stack_00000048 <= in_stack_00000040) {
          in_stack_00000040 = in_stack_00000048;
        }
        if (in_stack_00000050 != (long *)0x0) {
          for (; in_stack_00000040 != 0; in_stack_00000040 = in_stack_00000040 - 1) {
            in_stack_00000050[in_stack_00000040 - 1] = 0;
          }
          func_0x00611644();
        }
        if (in_stack_00000078 <= in_stack_00000070) {
          in_stack_00000070 = in_stack_00000078;
        }
        if (in_stack_00000080 != (long *)0x0) {
          for (; in_stack_00000070 != 0; in_stack_00000070 = in_stack_00000070 - 1) {
            in_stack_00000080[in_stack_00000070 - 1] = 0;
          }
          func_0x00611644();
        }
        return uVar6;
      }
    }
    func_0x0060572c(&uStack0000000000000008,&uStack0000000000000030,&uStack0000000000000060);
    *(undefined1 *)(unaff_x22 + (ulong)unaff_w26) =
         *(undefined1 *)
          (unaff_x25 + CONCAT71(uStack0000000000000008._1_7_,(undefined1)uStack0000000000000008));
    in_stack_00000078 = in_stack_00000048;
    in_stack_00000070 = in_stack_00000040;
    in_stack_00000048 = uVar3;
    in_stack_00000040 = uVar8;
    in_stack_00000080 = in_stack_00000050;
    in_stack_00000050 = plVar4;
    in_stack_00000088 = in_stack_00000058;
    in_stack_00000058 = iVar5;
    unaff_w26 = unaff_w26 + 1;
    in_w8 = iVar2;
  } while( true );
}

