
void FUN_00638b50(long param_1,uint *param_2)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  long lVar4;
  code *pcVar5;
  undefined1 in_ZR;
  long lVar6;
  long in_x9;
  uint *in_x10;
  uint *in_x11;
  long in_x12;
  ulong uVar7;
  ulong in_x13;
  ulong in_x14;
  long in_x15;
  long in_x16;
  long in_x17;
  undefined8 *unaff_x19;
  
  do {
    uVar7 = in_x13;
    if ((bool)in_ZR) goto LAB_00638b28;
    uVar3 = *param_2;
    if (uVar3 < *(uint *)(in_x17 + -4)) goto LAB_00638b28;
    param_2 = param_2 + 1;
    uVar7 = in_x14;
    if (*(uint *)(in_x17 + -4) < uVar3 || in_x17 == in_x16) {
      do {
        param_1 = in_x15 + 0x50;
        uVar7 = in_x14 + ~in_x13;
LAB_00638b28:
        if (uVar7 == 0) {
          if (param_1 == in_x9) {
            *unaff_x19 = &UNK_009f6678;
            unaff_x19[1] = 0;
            unaff_x19[2] = 0;
            unaff_x19[3] = 0;
            return;
          }
          unaff_x19[1] = 0;
          *unaff_x19 = &UNK_009f6678;
          unaff_x19[2] = 0;
          unaff_x19[3] = 0;
          lVar2 = *(long *)(param_1 + 8);
          lVar4 = *(long *)(param_1 + 0x10) - lVar2;
          if (lVar4 != 0) {
            if (lVar4 < 0) {
              func_0x00017f90(unaff_x19 + 1);
                    /* WARNING: Does not return */
              pcVar5 = (code *)SoftwareBreakpoint(1,0x638c18);
              (*pcVar5)();
            }
            lVar6 = __Znwm(lVar4);
            unaff_x19[1] = lVar6;
            lVar1 = lVar6 + (lVar4 >> 2) * 4;
            unaff_x19[3] = lVar1;
            _memcpy(lVar6,lVar2,lVar4);
            unaff_x19[2] = lVar1;
          }
          return;
        }
        in_x13 = uVar7 >> 1;
        in_x15 = param_1 + in_x13 * in_x12;
        in_x17 = *(long *)(in_x15 + 8);
        in_x16 = *(long *)(in_x15 + 0x10);
        in_x14 = uVar7;
      } while (in_x17 == in_x16);
      param_2 = in_x11;
    }
    in_x17 = in_x17 + 4;
    in_ZR = param_2 == in_x10;
    in_x14 = uVar7;
  } while( true );
}

