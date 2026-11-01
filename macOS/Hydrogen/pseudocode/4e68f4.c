
void FUN_004e68f4(long param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long lVar5;
  long unaff_x24;
  undefined8 uVar6;
  long lVar7;
  long unaff_x27;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  
  if (param_1 == 0) {
    func_0x007a1f00();
LAB_004e6a70:
    lVar7 = unaff_x24;
    uStack0000000000000000 = 0;
LAB_004e6a7c:
    func_0x007a1f00(uStack0000000000000000,lVar7,&UNK_009e7fe0);
  }
  else {
    _memcpy();
    puVar2 = (undefined8 *)func_0x00187bd0(0x60,8);
    if (puVar2 != (undefined8 *)0x0) {
      *puVar2 = unaff_x21;
      puVar2[1] = param_1;
      puVar2[2] = unaff_x21;
      uStack0000000000000000 = 1;
      uStack0000000000000008 = 4;
      lVar5 = 1;
      in_stack_00000010 = puVar2;
      do {
        do {
          lVar3 = unaff_x27;
          if (lVar3 == unaff_x20) {
            unaff_x19[1] = (long)in_stack_00000010;
            *unaff_x19 = uStack0000000000000008;
            unaff_x19[2] = lVar5;
            return;
          }
          unaff_x27 = lVar3 + 0x48;
        } while ((*(byte *)(lVar3 + 0x40) & 1) != 0);
        lVar7 = *(long *)(lVar3 + 0x38);
        in_stack_00000018 = lVar5;
        if (lVar7 < 0) goto LAB_004e6a70;
        if (lVar7 == 0) {
          unaff_x24 = 1;
        }
        else {
          uVar6 = *(undefined8 *)(lVar3 + 0x30);
          unaff_x24 = func_0x00187bd0(lVar7,1);
          if (unaff_x24 == 0) goto LAB_004e6a7c;
          _memcpy(unaff_x24,uVar6,lVar7);
        }
        if (lVar5 == uStack0000000000000008) {
          func_0x007a5594(&uStack0000000000000008,lVar5,1,8,0x18);
          puVar2 = in_stack_00000010;
        }
        plVar4 = puVar2 + lVar5 * 3;
        *plVar4 = lVar7;
        plVar4[1] = unaff_x24;
        plVar4[2] = lVar7;
        lVar5 = lVar5 + 1;
      } while( true );
    }
    func_0x007a1f00(8,0x60);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e6a94);
  (*pcVar1)();
}

