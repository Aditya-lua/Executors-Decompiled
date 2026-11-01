
void FUN_004008f4(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *in_x10;
  undefined8 in_x11;
  undefined8 *in_x13;
  undefined8 *unaff_x19;
  long lVar3;
  undefined8 unaff_x21;
  long unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined8 in_stack_00000038;
  undefined8 *in_stack_00000040;
  
  lVar3 = in_x13[1];
  puVar2 = (undefined8 *)func_0x00187bd0(0x280,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x280);
  }
  else {
    *puVar2 = 0;
    *(undefined2 *)((long)puVar2 + 0x21a) = 0;
    puVar2[0x44] = unaff_x19;
    *unaff_x19 = puVar2;
    *(undefined2 *)(unaff_x19 + 0x43) = 0;
    *in_x13 = puVar2;
    in_x13[1] = lVar3 + 1;
    if (unaff_x25 == lVar3) {
      *(undefined2 *)((long)puVar2 + 0x21a) = 1;
      puVar2[1] = unaff_x28;
      puVar2[2] = in_stack_00000038;
      puVar2[3] = unaff_x26;
      puVar2[0x22] = unaff_x21;
      puVar2[0x23] = unaff_x27;
      puVar2[0x24] = in_x11;
      puVar2[0x45] = in_x10;
      *in_x10 = puVar2;
      *(undefined2 *)(in_x10 + 0x43) = 1;
      in_x13[2] = in_x13[2] + 1;
      *in_stack_00000040 = 0x8000000000000000;
      return;
    }
    func_0x007a247c(&UNK_008852a4,0x30,&UNK_009d94f0);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x400afc);
  (*pcVar1)();
}

