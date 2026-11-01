
void FUN_00505bf8(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long lStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  lVar4 = 0;
  lVar2 = 1;
  do {
    puVar6 = in_stack_00000010;
    lVar2 = lVar2 + -1;
    puVar5 = *(undefined8 **)(in_stack_00000028 + lVar2 * 8);
    lStack0000000000000030 = lVar2;
    if (lVar4 != 0) {
      lVar3 = puVar5[1];
      lVar7 = lVar4 << 3;
      puVar8 = in_stack_00000010;
      do {
        if ((((undefined8 *)*puVar8)[1] == lVar3) &&
           (iVar1 = _memcmp(*(undefined8 *)*puVar8,*puVar5,lVar3), iVar1 == 0)) goto LAB_00505c1c;
        lVar7 = lVar7 + -8;
        puVar8 = puVar8 + 1;
      } while (lVar7 != 0);
    }
    if (lVar4 == uStack0000000000000008) {
      func_0x0050c238(&uStack0000000000000008,&UNK_009e8bf0);
      puVar6 = in_stack_00000010;
    }
    puVar6[lVar4] = puVar5;
    lVar4 = lVar4 + 1;
    lVar2 = lStack0000000000000030;
    in_stack_00000018 = lVar4;
LAB_00505c1c:
    if (lVar2 == 0) {
      in_stack_00000000[1] = in_stack_00000040;
      *in_stack_00000000 = in_stack_00000038;
      in_stack_00000000[2] = in_stack_00000048;
      if (in_stack_00000020 != 0) {
        func_0x00187bd4(in_stack_00000028,in_stack_00000020 << 3,8);
      }
      if (uStack0000000000000008 != 0) {
        func_0x00187bd4(in_stack_00000010,uStack0000000000000008 << 3,8);
      }
      return;
    }
  } while( true );
}

