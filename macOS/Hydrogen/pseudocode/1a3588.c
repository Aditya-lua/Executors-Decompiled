
void FUN_001a3588(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined2 unaff_w27;
  long unaff_x28;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000080;
  
  lVar3 = func_0x00187bd0();
  if (lVar3 == 0) {
    func_0x007a1f00(in_stack_00000030,unaff_x23,&UNK_009c24c0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x1a37ac);
    (*pcVar2)();
  }
  _memcpy(lVar3);
  puVar1 = (undefined8 *)(unaff_x22 + unaff_x25);
  puVar1[1] = unaff_x23;
  *puVar1 = CONCAT71(in_stack_00000060._1_7_,5);
  puVar1[3] = unaff_x23;
  puVar1[2] = lVar3;
  puVar1[4] = CONCAT44(in_stack_00000080._4_4_,CONCAT22(in_stack_00000038._4_2_,unaff_w27));
  if ((unaff_x28 == unaff_x19) || (unaff_x20 == unaff_x25 + 0x28)) {
    in_stack_00000040[1] = in_stack_00000050;
    *in_stack_00000040 = in_stack_00000048;
    in_stack_00000040[2] = unaff_x28;
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001a3424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001a33d8 +
            (ulong)(byte)(&UNK_0081d4c6)[*(byte *)(unaff_x24 + unaff_x25 + 0x28)] * 4))();
  return;
}

