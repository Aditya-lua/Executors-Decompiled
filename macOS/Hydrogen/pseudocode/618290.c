
ulong FUN_00618290(undefined8 param_1,undefined8 param_2,ulong param_3,undefined8 param_4,
                  undefined8 param_5)

{
  int iVar1;
  ulong uVar2;
  uint uVar3;
  long lVar4;
  long lVar5;
  int in_w8;
  ulong uVar6;
  int iVar7;
  int iVar8;
  long lVar9;
  uint unaff_w21;
  undefined1 auVar10 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  
  if (in_w8 < 0) {
    __ZdlPv(in_stack_00000030);
  }
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
  auVar10 = __Unwind_Resume();
  lVar4 = auVar10._0_8_;
  iVar7 = *(int *)(lVar4 + 0x28);
  if (iVar7 == 0) {
    uVar6 = 0;
    *(undefined8 *)(lVar4 + 0x20) = 0;
    goto code_r0x0061834c;
  }
  if (iVar7 == 2) {
LAB_006183f0:
    lVar5 = func_0x0066ad70(lVar4,2,*(undefined8 *)(lVar4 + 0x60),(long)*(int *)(lVar4 + 0x40),
                            param_4,param_5,&UNK_008ba5c8);
    if (lVar5 == 0) {
      *(undefined8 *)(lVar4 + 0x40) = 0;
      return 0;
    }
    iVar7 = *(int *)(lVar4 + 0x40);
  }
  else {
    if (iVar7 != 1) {
      return 0;
    }
    iVar7 = *(int *)(lVar4 + 0x3c);
LAB_006184b0:
    lVar5 = func_0x0066ad70(lVar4,1,*(undefined8 *)(lVar4 + 0x60),(long)iVar7,0,param_5,
                            &UNK_008ba5c8);
    if (lVar5 == 0) {
      *(undefined8 *)(lVar4 + 0x40) = 0;
      do {
        while( true ) {
          uVar6 = *(ulong *)(lVar4 + 0x20);
code_r0x0061834c:
          uVar2 = uVar6;
          if (uVar6 <= param_3) {
            uVar2 = param_3;
          }
          do {
            if (uVar2 == uVar6) {
              if ((int)param_4 == 0) {
                return 0;
              }
              goto LAB_006183f0;
            }
            *(ulong *)(lVar4 + 0x20) = uVar6 + 1;
            uVar3 = *(uint *)(*(long *)(lVar4 + 0x30) + (ulong)*(byte *)(auVar10._8_8_ + uVar6) * 4)
            ;
            uVar6 = uVar6 + 1;
          } while (0xff < uVar3);
          if ((*(int *)(lVar4 + 0x40) == 0) && (*(int *)(lVar4 + 0x44) == 0)) {
            _bzero(*(undefined8 *)(lVar4 + 0x60),(long)*(int *)(lVar4 + 0x3c));
          }
          lVar5 = (long)*(int *)(lVar4 + 0x40);
          iVar1 = *(int *)(lVar4 + 0x38) + *(int *)(lVar4 + 0x44);
          lVar9 = *(long *)(lVar4 + 0x60);
          if (iVar1 < 9) break;
          *(byte *)(lVar9 + lVar5) =
               *(byte *)(lVar9 + lVar5) | (byte)(uVar3 >> (ulong)(iVar1 - 8U & 0x1f));
          lVar5 = (long)*(int *)(lVar4 + 0x40) + *(long *)(lVar4 + 0x60);
          *(byte *)(lVar5 + 1) =
               *(byte *)(lVar5 + 1) | (byte)(uVar3 << (ulong)(0x10U - iVar1 & 0x1f));
          iVar7 = *(int *)(lVar4 + 0x40);
LAB_00618478:
          iVar8 = iVar1;
          if (0xe < iVar1) {
            iVar8 = 0xf;
          }
          uVar3 = (iVar1 - iVar8) + 7;
          iVar7 = iVar7 + (uVar3 >> 3) + 1;
          *(int *)(lVar4 + 0x40) = iVar7;
          *(uint *)(lVar4 + 0x44) = (iVar1 - (uVar3 & 0xfffffff8)) + -8;
          if (iVar7 == *(int *)(lVar4 + 0x3c)) goto LAB_006184b0;
        }
        *(byte *)(lVar9 + lVar5) =
             *(byte *)(lVar9 + lVar5) | (byte)(uVar3 << (ulong)(8U - iVar1 & 0x1f));
        *(int *)(lVar4 + 0x44) = iVar1;
        iVar7 = *(int *)(lVar4 + 0x40);
        if (iVar1 == 8) goto LAB_00618478;
      } while (iVar7 != *(int *)(lVar4 + 0x3c));
      goto LAB_006184b0;
    }
    iVar7 = *(int *)(lVar4 + 0x3c);
  }
  uVar6 = (long)iVar7 - *(long *)(lVar4 + 0x20);
  if (uVar6 < 2) {
    uVar6 = 1;
  }
  return uVar6;
}

