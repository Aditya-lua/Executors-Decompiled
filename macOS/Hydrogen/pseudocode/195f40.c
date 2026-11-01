
void FUN_00195f40(long *param_1,undefined8 param_2,long param_3,long param_4,long param_5)

{
  code *pcVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  long lVar14;
  undefined *puVar15;
  undefined8 uVar16;
  undefined *puVar17;
  long unaff_x21;
  long unaff_x26;
  long unaff_x29;
  undefined8 uStack0000000000000028;
  long *in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  long in_stack_00000070;
  
  plVar2 = (long *)func_0x00187bd0(0x60,8);
  if (plVar2 == (long *)0x0) {
    func_0x007a1f18(8,0x60);
LAB_001963b4:
    puVar17 = &UNK_009c14e0;
    uVar16 = 0x12;
    puVar15 = &UNK_0081b8dc;
code_r0x001963e0:
    func_0x007a11c0(puVar15,uVar16,puVar17);
    goto code_r0x001964d8;
  }
  if ((*(long *)PTR__kSecClass_009b0340 == 0) || (lVar3 = _CFRetain(), lVar3 == 0)) {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
    goto code_r0x001964d8;
  }
  uStack0000000000000028 = lVar3;
  if ((*(long *)PTR__kSecClassInternetPassword_009b0350 == 0) || (lVar4 = _CFRetain(), lVar4 == 0))
  {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
    goto code_r0x001964d8;
  }
  in_stack_00000040 = lVar3;
  in_stack_00000048 = lVar4;
  if ((*(long *)PTR__kSecAttrServer_009b0320 == 0) || (lVar5 = _CFRetain(), lVar5 == 0)) {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
    goto code_r0x001964d8;
  }
  uStack0000000000000028 = lVar5;
  if (param_3 < 0) goto LAB_001963b4;
  lVar6 = _CFStringCreateWithBytes
                    (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,param_2,param_3,0x8000100,0);
  if (lVar6 == 0) {
    puVar17 = &UNK_009c14c8;
    uVar16 = 0x22;
    puVar15 = &UNK_0081b7f0;
    goto code_r0x001963e0;
  }
  in_stack_00000050 = lVar5;
  in_stack_00000058 = lVar6;
  if ((*(long *)PTR__kSecAttrPath_009b0300 == 0) || (lVar7 = _CFRetain(), lVar7 == 0)) {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
    goto code_r0x001964d8;
  }
  uStack0000000000000028 = lVar7;
  if (unaff_x21 < 0) {
    puVar17 = &UNK_009c14e0;
    uVar16 = 0x12;
    puVar15 = &UNK_0081b8dc;
  }
  else {
    lVar8 = _CFStringCreateWithBytes(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
    if (lVar8 != 0) {
      uStack0000000000000060 = lVar7;
      in_stack_00000068 = lVar8;
      if ((*(long *)PTR__kSecAttrAccount_009b02b0 == 0) || (lVar9 = _CFRetain(), lVar9 == 0)) {
        func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
        goto code_r0x001964d8;
      }
      uStack0000000000000028 = lVar9;
      if (unaff_x26 < 0) {
        puVar17 = &UNK_009c14e0;
        uVar16 = 0x12;
        puVar15 = &UNK_0081b8dc;
      }
      else {
        lVar10 = _CFStringCreateWithBytes(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
        if (lVar10 != 0) {
          *(long *)(unaff_x29 + -0x60) = lVar9;
          *(long *)(unaff_x29 + -0x58) = lVar10;
          if ((*(long *)PTR__kSecAttrProtocol_009b0310 == 0) || (lVar11 = _CFRetain(), lVar11 == 0))
          {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
            goto code_r0x001964d8;
          }
          uStack0000000000000028 =
               CONCAT44(uStack0000000000000028._4_4_,*(undefined4 *)(unaff_x29 + 0x14));
          in_stack_00000070 = lVar11;
          plVar12 = (long *)_CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                                            &uStack0000000000000028);
          if (plVar12 == (long *)0x0) {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1680);
            goto code_r0x001964d8;
          }
          uStack0000000000000028 = lVar11;
          in_stack_00000030 = plVar12;
          if ((*(long *)PTR__kSecAttrAuthenticationType_009b02c0 == 0) ||
             (lVar13 = _CFRetain(), lVar13 == 0)) {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
            goto code_r0x001964d8;
          }
          *(undefined4 *)(unaff_x29 + -100) = *(undefined4 *)(unaff_x29 + 0x18);
          in_stack_00000070 = lVar13;
          lVar14 = _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                                   unaff_x29 + -100);
          if (lVar14 == 0) {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1680);
            goto code_r0x001964d8;
          }
          *plVar2 = lVar3;
          plVar2[1] = lVar4;
          plVar2[2] = lVar5;
          plVar2[3] = lVar6;
          plVar2[4] = lVar7;
          plVar2[5] = lVar8;
          plVar2[6] = lVar9;
          plVar2[7] = lVar10;
          plVar2[8] = lVar11;
          plVar2[9] = (long)plVar12;
          plVar2[10] = lVar13;
          plVar2[0xb] = lVar14;
          uStack0000000000000028 = 6;
          in_stack_00000038 = 6;
          in_stack_00000030 = plVar2;
          if (param_4 == 0) {
code_r0x0019620c:
            if ((*(ushort *)(unaff_x29 + 0x10) & 1) == 0) {
code_r0x00196298:
              param_1[1] = (long)in_stack_00000030;
              *param_1 = uStack0000000000000028;
              param_1[2] = in_stack_00000038;
              return;
            }
            if ((*(long *)PTR__kSecAttrPort_009b0308 != 0) && (lVar3 = _CFRetain(), lVar3 != 0)) {
              *(long *)(unaff_x29 + -0x60) = lVar3;
              uStack0000000000000060 =
                   CONCAT44(uStack0000000000000060._4_4_,(uint)*(ushort *)(unaff_x29 + 0x12));
              lVar5 = _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                                      &uStack0000000000000060);
              lVar4 = in_stack_00000038;
              if (lVar5 == 0) {
                func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1680);
                goto code_r0x001964d8;
              }
              *(long *)(unaff_x29 + -0x60) = lVar3;
              *(long *)(unaff_x29 + -0x58) = lVar5;
              if (in_stack_00000038 == uStack0000000000000028) {
                func_0x0019275c(&uStack0000000000000028,&UNK_009c16b0);
              }
              in_stack_00000030[lVar4 * 2] = lVar3;
              (in_stack_00000030 + lVar4 * 2)[1] = lVar5;
              in_stack_00000038 = lVar4 + 1;
              goto code_r0x00196298;
            }
          }
          else if ((*(long *)PTR__kSecAttrSecurityDomain_009b0318 != 0) &&
                  (lVar3 = _CFRetain(), lVar3 != 0)) {
            *(long *)(unaff_x29 + -0x60) = lVar3;
            if (param_5 < 0) {
              puVar17 = &UNK_009c14e0;
              uVar16 = 0x12;
              puVar15 = &UNK_0081b8dc;
            }
            else {
              lVar5 = _CFStringCreateWithBytes
                                (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,param_4,param_5,
                                 0x8000100,0);
              lVar4 = in_stack_00000038;
              if (lVar5 != 0) {
                *(long *)(unaff_x29 + -0x60) = lVar3;
                *(long *)(unaff_x29 + -0x58) = lVar5;
                if (in_stack_00000038 == uStack0000000000000028) {
                  func_0x0019275c(&uStack0000000000000028,&UNK_009c1698);
                }
                in_stack_00000030[lVar4 * 2] = lVar3;
                (in_stack_00000030 + lVar4 * 2)[1] = lVar5;
                in_stack_00000038 = lVar4 + 1;
                goto code_r0x0019620c;
              }
              puVar17 = &UNK_009c14c8;
              uVar16 = 0x22;
              puVar15 = &UNK_0081b7f0;
            }
            func_0x007a11c0(puVar15,uVar16,puVar17);
            goto code_r0x001964d8;
          }
          func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
          goto code_r0x001964d8;
        }
        puVar17 = &UNK_009c14c8;
        uVar16 = 0x22;
        puVar15 = &UNK_0081b7f0;
      }
      func_0x007a11c0(puVar15,uVar16,puVar17);
      goto code_r0x001964d8;
    }
    puVar17 = &UNK_009c14c8;
    uVar16 = 0x22;
    puVar15 = &UNK_0081b7f0;
  }
  func_0x007a11c0(puVar15,uVar16,puVar17);
code_r0x001964d8:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1964dc);
  (*pcVar1)();
}

