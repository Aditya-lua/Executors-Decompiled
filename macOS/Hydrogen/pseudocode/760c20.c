
ulong FUN_00760c20(code *param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  char *pcVar4;
  undefined4 uVar5;
  ulong unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  long *plVar6;
  ulong unaff_x22;
  long unaff_x23;
  ulong uVar7;
  long lVar8;
  ulong unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  
code_r0x00760c20:
  uVar3 = (*param_1)(unaff_x27,unaff_x28,param_4);
  if (uVar3 != 0) {
    uVar7 = unaff_x26;
    if (uVar3 + 2 < 2) goto LAB_00760d2c;
    unaff_x26 = uVar3 + unaff_x26;
    unaff_x27 = unaff_x27 + uVar3;
    unaff_x28 = unaff_x28 - uVar3;
    goto LAB_00760c00;
  }
  if ((unaff_w21 & 1) != 0) goto LAB_00760d8c;
  uVar3 = *(ulong *)(unaff_x20 + 0xa0);
code_r0x00760c3c:
  uVar7 = *(ulong *)(unaff_x20 + 0xa8);
  if (uVar3 != 0) {
    uVar7 = uVar7 - uVar3;
    if (uVar7 != 0) {
      _memmove();
    }
    *(undefined8 *)(unaff_x20 + 0xa0) = 0;
    *(ulong *)(unaff_x20 + 0xa8) = uVar7;
  }
  if (0xff < uVar7) {
    if (unaff_x26 == 0) {
      unaff_x26 = 0xffffffffffffffff;
      uVar3 = unaff_x19;
LAB_00760df0:
      unaff_x19 = unaff_x26;
      if (uVar3 != 0) {
        unaff_x19 = uVar3;
      }
code_r0x00760df8:
      return unaff_x19;
    }
LAB_00760d8c:
    uVar3 = unaff_x19;
    if ((1 < unaff_x26 + 2) && (1 < unaff_x26 - 0x10000000)) {
      if (unaff_x26 != 0) {
LAB_00760ae4:
        do {
          unaff_x19 = unaff_x26 + unaff_x19;
          unaff_x23 = unaff_x23 + unaff_x26;
          unaff_x22 = unaff_x22 - unaff_x26;
          if (unaff_x22 == 0) {
            return unaff_x19;
          }
          unaff_x26 = 0;
        } while (8 < *(uint *)(unaff_x20 + 0x78));
        plVar6 = *(long **)(unaff_x20 + 0x80);
        switch(*(uint *)(unaff_x20 + 0x78)) {
        case 0:
          uVar5 = 4;
          if ((*(uint *)(unaff_x20 + 0x14) & 2) == 0) {
            uVar5 = 1;
          }
          *(undefined4 *)(unaff_x20 + 0x78) = uVar5;
          *(undefined8 *)(unaff_x20 + 0x80) = *(undefined8 *)(unaff_x20 + 0x48);
          goto code_r0x00760ae0;
        case 1:
          if (plVar6 == (long *)0x0) {
            lVar8 = *(long *)(unaff_x20 + 0x50);
code_r0x00760d44:
            *(undefined4 *)(unaff_x20 + 0x78) = 2;
            *(long *)(unaff_x20 + 0x80) = lVar8;
          }
          else {
            lVar8 = *plVar6;
code_r0x00760b64:
            uVar7 = _strlen(lVar8);
            uVar2 = func_0x00093e00(*(undefined8 *)(unaff_x20 + 0x88));
            uVar3 = uVar2 - uVar7;
            if (uVar2 < uVar7) {
              unaff_x26 = uVar7 - uVar2;
              pcVar4 = (char *)(lVar8 + uVar2);
code_r0x00760cec:
              if (unaff_x22 <= unaff_x26) {
                unaff_x26 = unaff_x22;
              }
              _memcpy(unaff_x23,pcVar4,unaff_x26);
              *(ulong *)(unaff_x20 + 0x88) = *(long *)(unaff_x20 + 0x88) + unaff_x26;
              if (unaff_x26 != 0) goto LAB_00760ae4;
            }
            else if (uVar3 < 2) {
              pcVar4 = "\r\n" + uVar3;
              unaff_x26 = 2 - uVar3;
              goto code_r0x00760cec;
            }
            *(long *)(unaff_x20 + 0x80) = plVar6[1];
          }
code_r0x00760ae0:
          unaff_x26 = 0;
          *(undefined8 *)(unaff_x20 + 0x88) = 0;
          goto LAB_00760ae4;
        case 2:
          if (plVar6 != (long *)0x0) {
            iVar1 = func_0x0077e76c(*plVar6,"Content-Type",0xc);
            lVar8 = *plVar6;
            if ((iVar1 != 0) && (*(char *)(lVar8 + 0xc) == ':')) {
              lVar8 = plVar6[1];
              goto code_r0x00760d44;
            }
            goto code_r0x00760b64;
          }
          uVar5 = 3;
          break;
        case 3:
          uVar3 = func_0x00093e00(*(undefined8 *)(unaff_x20 + 0x88));
          if (uVar3 < 2) {
            unaff_x26 = 2 - uVar3;
            if (unaff_x22 <= 2 - uVar3) {
              unaff_x26 = unaff_x22;
            }
            _memcpy(unaff_x23,"\r\n" + uVar3,unaff_x26);
            *(ulong *)(unaff_x20 + 0x88) = *(long *)(unaff_x20 + 0x88) + unaff_x26;
            goto LAB_00760ae4;
          }
          uVar5 = 4;
          break;
        case 4:
          *in_stack_00000008 = 0;
          in_stack_00000008[1] = 0;
          in_stack_00000008[2] = 0;
          uVar5 = 7;
          break;
        default:
          goto LAB_00760ae4;
        case 7:
          goto code_r0x00760be8;
        case 8:
          goto code_r0x00760df8;
        }
        unaff_x26 = 0;
        *(undefined4 *)(unaff_x20 + 0x78) = uVar5;
        *in_stack_00000010 = 0;
        in_stack_00000010[1] = 0;
        goto LAB_00760ae4;
      }
      *(undefined4 *)(unaff_x20 + 0x78) = 8;
      *in_stack_00000010 = 0;
      in_stack_00000010[1] = 0;
      if (*(int *)(unaff_x20 + 0x10) == 2) {
        if (*(long *)(unaff_x20 + 0x40) == 0) {
          unaff_x26 = 0;
        }
        else {
          _fclose();
          unaff_x26 = 0;
          *(undefined8 *)(unaff_x20 + 0x40) = 0;
        }
      }
    }
    goto LAB_00760df0;
  }
  uVar3 = func_0x00761eb0();
  uVar7 = unaff_x26;
  if (uVar3 + 2 < 2 || uVar3 - 0x10000000 < 2) {
LAB_00760d2c:
    unaff_x26 = uVar3;
    if (uVar7 != 0) {
      unaff_x26 = uVar7;
    }
    goto LAB_00760d8c;
  }
  if (uVar3 == 0) {
    unaff_w21 = 1;
  }
  else {
    *(ulong *)(unaff_x20 + 0xa8) = *(long *)(unaff_x20 + 0xa8) + uVar3;
  }
  goto LAB_00760c00;
code_r0x00760be8:
  if (*(long *)(unaff_x20 + 0x90) != 0) goto code_r0x00760bf0;
  unaff_x26 = func_0x00761eb0();
  goto LAB_00760d8c;
code_r0x00760bf0:
  unaff_x26 = 0;
  unaff_w21 = 0;
  unaff_x27 = unaff_x23;
  unaff_x28 = unaff_x22;
LAB_00760c00:
  uVar3 = *(ulong *)(unaff_x20 + 0xa0);
  if (uVar3 < *(ulong *)(unaff_x20 + 0xa8) || (unaff_w21 & 1) != 0) goto code_r0x00760c14;
  goto code_r0x00760c3c;
code_r0x00760c14:
  param_1 = *(code **)(*(long *)(unaff_x20 + 0x90) + 8);
  param_4 = (ulong)(unaff_w21 & 1);
  goto code_r0x00760c20;
}

