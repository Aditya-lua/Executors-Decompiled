
long FUN_0073d390(long param_1,undefined8 param_2)

{
  uint uVar1;
  char *pcVar2;
  char cVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  char *pcVar8;
  uint uVar9;
  long unaff_x29;
  undefined1 uStack0000000000000013;
  undefined1 auStack_68 [8];
  
  if (*(char *)(param_1 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 param_1 + 0x18) == 0) {
      if ((int)uRam0000000000a2b5a0 < 1) goto LAB_0073d468;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_1 + 0x18) + 8) < 1 || (int)uRam0000000000a2b5a0 < 1)
    goto LAB_0073d468;
    iVar5 = func_0x00764560(&uStack0000000000000013,0x801,"[%s] ");
    iVar4 = func_0x00762a38(auStack_68 + (long)iVar5 + 0x7b,(long)(0x801 - iVar5),param_2,
                            unaff_x29 + 0x10);
    uVar1 = iVar4 + iVar5;
    uVar9 = uVar1;
    if (0x7ff < (int)uVar1) {
      auStack_68[(ulong)(uVar1 - 1) + 0x7b] = 0x2e;
      auStack_68[(ulong)uVar1 + 0x7b] = 0x2e;
      uVar9 = uVar1 + 2;
      auStack_68[(ulong)uVar1 + 0x7c] = 0x2e;
    }
    *(undefined2 *)(auStack_68 + (long)(int)uVar9 + 0x7b) = 10;
    param_1 = func_0x0073c8fc(param_1,0,&uStack0000000000000013,(long)(int)uVar9 + 1);
  }
LAB_0073d468:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return param_1;
  }
  lVar6 = ___stack_chk_fail();
  lVar7 = 0;
  if (lVar6 != 0) {
    lVar7 = (*pcRam0000000000a2b600)();
    if (lVar7 == 0) {
      lVar7 = 0x1b;
    }
    else {
      pcVar8 = (char *)_strtok_r(lVar7,", ",auStack_68);
      while (pcVar8 != (char *)0x0) {
        cVar3 = *pcVar8;
        pcVar2 = pcVar8;
        if (cVar3 == '-') {
          pcVar2 = pcVar8 + 1;
        }
        uVar9 = 1;
        if (cVar3 == '+') {
          pcVar2 = pcVar8 + 1;
        }
        else {
          uVar9 = (uint)(cVar3 != '-');
        }
        iVar5 = func_0x0077e6f8(pcVar2,"all");
        if (iVar5 == 0) {
          iVar5 = func_0x0077e6f8(pcVar2,"protocol");
          if (iVar5 != 0) {
            goto code_r0x0073d5d8;
          }
          iVar5 = func_0x0077e6f8(pcVar2,"network");
          if (iVar5 == 0) {
            iVar5 = func_0x0077e6f8(pcVar2,"proxy");
            if (iVar5 == 0) {
              iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b278);
              lVar6 = 0xa2b278;
              if (iVar5 == 0) {
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b2f0);
                lVar6 = 0xa2b2f0;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b368);
                lVar6 = 0xa2b368;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b3e0);
                lVar6 = 0xa2b3e0;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b458);
                lVar6 = 0xa2b458;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b4d0);
                lVar6 = 0xa2b4d0;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b7f0);
                lVar6 = 0xa2b7f0;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b868);
                lVar6 = 0xa2b868;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b110);
                lVar6 = 0xa2b110;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b610);
                lVar6 = 0xa2b610;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b188);
                lVar6 = 0xa2b188;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b688);
                lVar6 = 0xa2b688;
                if (iVar5 != 0) goto code_r0x0073d894;
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b200);
                lVar6 = 0xa2b200;
                if (iVar5 != 0) goto code_r0x0073d894;
              }
              else {
code_r0x0073d894:
                *(uint *)(lVar6 + 0xc) = uVar9;
              }
              iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b548);
              lVar6 = 0xa2b548;
              if (iVar5 == 0) {
                iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b558);
                lVar6 = 0xa2b558;
                if (iVar5 == 0) {
                  iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b568);
                  lVar6 = 0xa2b568;
                  if (iVar5 == 0) {
                    iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b5d8);
                    lVar6 = 0xa2b5d8;
                    if (iVar5 == 0) {
                      iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b578);
                      lVar6 = 0xa2b578;
                      if (iVar5 == 0) {
                        iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b588);
                        lVar6 = 0xa2b588;
                        if (iVar5 == 0) {
                          iVar5 = func_0x0077e6f8(pcVar2,uRam0000000000a2b598);
                          lVar6 = 0xa2b598;
                          if (iVar5 == 0) goto code_r0x0073d5dc;
                        }
                      }
                    }
                  }
                }
              }
              *(uint *)(lVar6 + 8) = uVar9;
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
code_r0x0073d5d8:
          uRam0000000000a2b20c = uVar9;
          uRam0000000000a2b4dc = uVar9;
          uRam0000000000a2b570 = uVar9;
          uRam0000000000a2b580 = uVar9;
          uRam0000000000a2b5a0 = uVar9;
        }
code_r0x0073d5dc:
        pcVar8 = (char *)_strtok_r(0,", ",auStack_68);
      }
      (*pcRam0000000000a2b5f0)(lVar7);
      lVar7 = 0;
    }
  }
  return lVar7;
}

