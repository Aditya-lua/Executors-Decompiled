
void FUN_00234c38(undefined8 param_1)

{
  undefined1 *puVar1;
  code *pcVar2;
  code *in_x9;
  long lVar3;
  undefined1 *puVar4;
  long *unaff_x19;
  undefined1 (*unaff_x20) [16];
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x27;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000008;
  ulong in_stack_00000048;
  undefined8 uStack00000000000000f0;
  
  uStack00000000000000f0 = param_1;
  (*in_x9)(&uStack0000000000000008);
  if (0x40 < in_stack_00000048) {
    func_0x007a28b0(in_stack_00000048,0x40,&UNK_009ca5f0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x234d6c);
    (*pcVar2)();
  }
  auVar6 = (**(code **)(*(long *)(*(long *)unaff_x20[1] + 0x18) + 0x20))
                     (*(undefined8 *)(*(long *)unaff_x20[1] + 0x10),&uStack0000000000000008,
                      in_stack_00000048,unaff_x27 + unaff_x24);
  if ((code *)*unaff_x23 != (code *)0x0) {
    (*(code *)*unaff_x23)();
  }
  if (unaff_x23[1] != 0) {
    func_0x00187bd4();
  }
  *unaff_x20 = auVar6;
  func_0x00252db4(&uStack0000000000000008);
  uVar5 = *(undefined8 *)*unaff_x20;
  unaff_x22[1] = *(undefined8 *)(*unaff_x20 + 8);
  *unaff_x22 = uVar5;
  unaff_x22[2] = *(undefined8 *)unaff_x20[1];
  puVar1 = (undefined1 *)unaff_x19[1];
  lVar3 = unaff_x19[2];
  if (lVar3 != 0) {
    puVar4 = puVar1;
    do {
      *puVar4 = 0;
      lVar3 = lVar3 + -1;
      puVar4 = puVar4 + 1;
    } while (lVar3 != 0);
  }
  unaff_x19[2] = 0;
  for (lVar3 = *unaff_x19; lVar3 != 0; lVar3 = lVar3 + -1) {
    *puVar1 = 0;
    puVar1 = puVar1 + 1;
  }
  if (*unaff_x19 != 0) {
    func_0x00187bd4(unaff_x19[1],*unaff_x19,1);
  }
  return;
}

