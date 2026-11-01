
void FUN_005f0200(ulong param_1)

{
  ulong uVar1;
  undefined1 *puVar2;
  code *pcVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x29;
  undefined8 uVar7;
  undefined1 *in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000048;
  
  if (unaff_x20 <= param_1) {
    return;
  }
  uVar4 = ___cxa_allocate_exception(0x28);
  uVar5 = (**(code **)(*unaff_x19 + 0x48))();
  func_0x005eec2c(&uStack0000000000000018,uVar5,10);
  func_0x00049ad4(&uStack0000000000000030,"HashTransformation: can\'t truncate a ",
                  &uStack0000000000000018);
  func_0x0003a638(&uStack0000000000000048,&uStack0000000000000030," byte digest to ");
  func_0x0060de44();
  uVar1 = in_stack_00000008;
  puVar2 = in_stack_00000000;
  if (-1 < (char)in_stack_00000010._7_1_) {
    uVar1 = (ulong)in_stack_00000010._7_1_;
    puVar2 = (undefined1 *)register0x00000008;
  }
  puVar6 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000048,puVar2,uVar1);
  uVar7 = puVar6[1];
  uVar5 = *puVar6;
  *(undefined8 *)(unaff_x29 + -0x40) = puVar6[2];
  *(undefined8 *)(unaff_x29 + -0x48) = uVar7;
  *(undefined8 *)(unaff_x29 + -0x50) = uVar5;
  puVar6[1] = 0;
  puVar6[2] = 0;
  *puVar6 = 0;
  func_0x0003a638(unaff_x29 + -0x38,unaff_x29 + -0x50," bytes");
  func_0x0002703c(uVar4,unaff_x29 + -0x38);
  ___cxa_throw(uVar4,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5f0300);
  (*pcVar3)();
}

