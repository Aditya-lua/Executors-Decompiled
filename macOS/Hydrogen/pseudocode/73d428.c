
undefined8 FUN_0073d428(void)

{
  ulong uVar1;
  char *pcVar2;
  char cVar3;
  char in_NG;
  char in_OV;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  char *pcVar7;
  uint in_w8;
  long lVar8;
  long unaff_x22;
  uint uVar9;
  long unaff_x29;
  undefined1 auStack_68 [8];
  
  if (in_NG == in_OV) {
    *(undefined1 *)(unaff_x22 + (ulong)(in_w8 - 1)) = 0x2e;
    uVar1 = (ulong)in_w8;
    *(undefined1 *)(unaff_x22 + uVar1) = 0x2e;
    in_w8 = in_w8 + 2;
    ((undefined1 *)(unaff_x22 + uVar1))[1] = 0x2e;
  }
  *(undefined2 *)(unaff_x22 + (int)in_w8) = 10;
  uVar5 = func_0x0073c8fc();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return uVar5;
  }
  lVar6 = ___stack_chk_fail();
  uVar5 = 0;
  if (lVar6 != 0) {
    lVar6 = (*pcRam0000000000a2b600)();
    if (lVar6 == 0) {
      uVar5 = 0x1b;
    }
    else {
      pcVar7 = (char *)_strtok_r(lVar6,", ",auStack_68);
      while (pcVar7 != (char *)0x0) {
        cVar3 = *pcVar7;
        pcVar2 = pcVar7;
        if (cVar3 == '-') {
          pcVar2 = pcVar7 + 1;
        }
        uVar9 = 1;
        if (cVar3 == '+') {
          pcVar2 = pcVar7 + 1;
        }
        else {
          uVar9 = (uint)(cVar3 != '-');
        }
        iVar4 = func_0x0077e6f8(pcVar2,"all");
        if (iVar4 == 0) {
          iVar4 = func_0x0077e6f8(pcVar2,"protocol");
          if (iVar4 != 0) {
            goto LAB_0073d5d8;
          }
          iVar4 = func_0x0077e6f8(pcVar2,"network");
          if (iVar4 == 0) {
            iVar4 = func_0x0077e6f8(pcVar2,"proxy");
            if (iVar4 == 0) {
              iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b278);
              lVar8 = 0xa2b278;
              if (iVar4 == 0) {
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b2f0);
                lVar8 = 0xa2b2f0;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b368);
                lVar8 = 0xa2b368;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b3e0);
                lVar8 = 0xa2b3e0;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b458);
                lVar8 = 0xa2b458;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b4d0);
                lVar8 = 0xa2b4d0;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b7f0);
                lVar8 = 0xa2b7f0;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b868);
                lVar8 = 0xa2b868;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b110);
                lVar8 = 0xa2b110;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b610);
                lVar8 = 0xa2b610;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b188);
                lVar8 = 0xa2b188;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b688);
                lVar8 = 0xa2b688;
                if (iVar4 != 0) goto LAB_0073d894;
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b200);
                lVar8 = 0xa2b200;
                if (iVar4 != 0) goto LAB_0073d894;
              }
              else {
LAB_0073d894:
                *(uint *)(lVar8 + 0xc) = uVar9;
              }
              iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b548);
              lVar8 = 0xa2b548;
              if (iVar4 == 0) {
                iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b558);
                lVar8 = 0xa2b558;
                if (iVar4 == 0) {
                  iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b568);
                  lVar8 = 0xa2b568;
                  if (iVar4 == 0) {
                    iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b5d8);
                    lVar8 = 0xa2b5d8;
                    if (iVar4 == 0) {
                      iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b578);
                      lVar8 = 0xa2b578;
                      if (iVar4 == 0) {
                        iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b588);
                        lVar8 = 0xa2b588;
                        if (iVar4 == 0) {
                          iVar4 = func_0x0077e6f8(pcVar2,uRam0000000000a2b598);
                          lVar8 = 0xa2b598;
                          if (iVar4 == 0) goto LAB_0073d5dc;
                        }
                      }
                    }
                  }
                }
              }
              *(uint *)(lVar8 + 8) = uVar9;
            }
            else {
              uRam0000000000a2b11c = uVar9;
              uRam0000000000a2b194 = uVar9;
              uRam0000000000a2b61c = uVar9;
              uRam0000000000a2b694 = uVar9;
              uRam0000000000a2b874 = uVar9;
            }
          }
          else {
            uRam0000000000a2b284 = uVar9;
            uRam0000000000a2b2fc = uVar9;
            uRam0000000000a2b374 = uVar9;
            uRam0000000000a2b3ec = uVar9;
            uRam0000000000a2b464 = uVar9;
            uRam0000000000a2b590 = uVar9;
            uRam0000000000a2b5e0 = uVar9;
            uRam0000000000a2b7fc = uVar9;
          }
        }
        else {
          uRam0000000000a2b11c = uVar9;
          uRam0000000000a2b194 = uVar9;
          uRam0000000000a2b284 = uVar9;
          uRam0000000000a2b2fc = uVar9;
          uRam0000000000a2b374 = uVar9;
          uRam0000000000a2b3ec = uVar9;
          uRam0000000000a2b464 = uVar9;
          uRam0000000000a2b550 = uVar9;
          uRam0000000000a2b560 = uVar9;
          uRam0000000000a2b590 = uVar9;
          uRam0000000000a2b5e0 = uVar9;
          uRam0000000000a2b61c = uVar9;
          uRam0000000000a2b694 = uVar9;
          uRam0000000000a2b7fc = uVar9;
          uRam0000000000a2b874 = uVar9;
LAB_0073d5d8:
          uRam0000000000a2b20c = uVar9;
          uRam0000000000a2b4dc = uVar9;
          uRam0000000000a2b570 = uVar9;
          uRam0000000000a2b580 = uVar9;
          uRam0000000000a2b5a0 = uVar9;
        }
LAB_0073d5dc:
        pcVar7 = (char *)_strtok_r(0,", ",auStack_68);
      }
      (*pcRam0000000000a2b5f0)(lVar6);
      uVar5 = 0;
    }
  }
  return uVar5;
}

