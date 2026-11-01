
void FUN_0019602c(long param_1)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  undefined *puVar9;
  undefined8 uVar10;
  undefined *puVar11;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 unaff_x23;
  long *unaff_x24;
  undefined8 unaff_x25;
  long unaff_x26;
  undefined8 unaff_x28;
  long unaff_x29;
  long in_stack_00000000;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  undefined4 uStack000000000000002c;
  undefined8 *in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000060;
  
  _uStack0000000000000028 = param_1;
  if (unaff_x21 < 0) {
    puVar11 = &UNK_009c14e0;
    uVar10 = 0x12;
    puVar9 = &UNK_0081b8dc;
  }
  else {
    lVar2 = _CFStringCreateWithBytes(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
    if (lVar2 != 0) {
      uStack0000000000000060 = unaff_x20;
      if ((*(long *)PTR__kSecAttrAccount_009b02b0 == 0) || (lVar3 = _CFRetain(), lVar3 == 0)) {
        func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
        goto LAB_001964d8;
      }
      _uStack0000000000000028 = lVar3;
      if (unaff_x26 < 0) {
        puVar11 = &UNK_009c14e0;
        uVar10 = 0x12;
        puVar9 = &UNK_0081b8dc;
      }
      else {
        lVar4 = _CFStringCreateWithBytes(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
        if (lVar4 != 0) {
          *(long *)(unaff_x29 + -0x60) = lVar3;
          *(long *)(unaff_x29 + -0x58) = lVar4;
          if ((*(long *)PTR__kSecAttrProtocol_009b0310 == 0) || (lVar5 = _CFRetain(), lVar5 == 0)) {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
            goto LAB_001964d8;
          }
          _uStack0000000000000028 =
               CONCAT44(uStack000000000000002c,*(undefined4 *)(unaff_x29 + 0x14));
          puVar6 = (undefined8 *)
                   _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                                   &uStack0000000000000028);
          if (puVar6 == (undefined8 *)0x0) {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1680);
            goto LAB_001964d8;
          }
          _uStack0000000000000028 = lVar5;
          in_stack_00000030 = puVar6;
          if ((*(long *)PTR__kSecAttrAuthenticationType_009b02c0 == 0) ||
             (lVar7 = _CFRetain(), lVar7 == 0)) {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
            goto LAB_001964d8;
          }
          *(undefined4 *)(unaff_x29 + -100) = *(undefined4 *)(unaff_x29 + 0x18);
          lVar8 = _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                                  unaff_x29 + -100);
          if (lVar8 == 0) {
            func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1680);
            goto LAB_001964d8;
          }
          *unaff_x19 = unaff_x23;
          unaff_x19[1] = in_stack_00000018;
          unaff_x19[2] = unaff_x25;
          unaff_x19[3] = unaff_x28;
          unaff_x19[4] = unaff_x20;
          unaff_x19[5] = lVar2;
          unaff_x19[6] = lVar3;
          unaff_x19[7] = lVar4;
          unaff_x19[8] = lVar5;
          unaff_x19[9] = puVar6;
          unaff_x19[10] = lVar7;
          unaff_x19[0xb] = lVar8;
          _uStack0000000000000028 = 6;
          in_stack_00000038 = 6;
          in_stack_00000030 = unaff_x19;
          if (in_stack_00000020 == 0) {
LAB_0019620c:
            if ((*(ushort *)(unaff_x29 + 0x10) & 1) == 0) {
LAB_00196298:
              unaff_x24[1] = (long)in_stack_00000030;
              *unaff_x24 = _uStack0000000000000028;
              unaff_x24[2] = in_stack_00000038;
              return;
            }
            if ((*(long *)PTR__kSecAttrPort_009b0308 != 0) && (lVar2 = _CFRetain(), lVar2 != 0)) {
              *(long *)(unaff_x29 + -0x60) = lVar2;
              uStack0000000000000060 =
                   CONCAT44(uStack0000000000000060._4_4_,(uint)*(ushort *)(unaff_x29 + 0x12));
              lVar4 = _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                                      &uStack0000000000000060);
              lVar3 = in_stack_00000038;
              if (lVar4 == 0) {
                func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1680);
                goto LAB_001964d8;
              }
              *(long *)(unaff_x29 + -0x60) = lVar2;
              *(long *)(unaff_x29 + -0x58) = lVar4;
              if (in_stack_00000038 == _uStack0000000000000028) {
                func_0x0019275c(&uStack0000000000000028,&UNK_009c16b0);
              }
              in_stack_00000030[lVar3 * 2] = lVar2;
              (in_stack_00000030 + lVar3 * 2)[1] = lVar4;
              in_stack_00000038 = lVar3 + 1;
              goto LAB_00196298;
            }
          }
          else if ((*(long *)PTR__kSecAttrSecurityDomain_009b0318 != 0) &&
                  (lVar2 = _CFRetain(), lVar2 != 0)) {
            *(long *)(unaff_x29 + -0x60) = lVar2;
            if (in_stack_00000000 < 0) {
              puVar11 = &UNK_009c14e0;
              uVar10 = 0x12;
              puVar9 = &UNK_0081b8dc;
            }
            else {
              lVar4 = _CFStringCreateWithBytes
                                (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,in_stack_00000020,
                                 in_stack_00000000,0x8000100,0);
              lVar3 = in_stack_00000038;
              if (lVar4 != 0) {
                *(long *)(unaff_x29 + -0x60) = lVar2;
                *(long *)(unaff_x29 + -0x58) = lVar4;
                if (in_stack_00000038 == _uStack0000000000000028) {
                  func_0x0019275c(&uStack0000000000000028,&UNK_009c1698);
                }
                in_stack_00000030[lVar3 * 2] = lVar2;
                (in_stack_00000030 + lVar3 * 2)[1] = lVar4;
                in_stack_00000038 = lVar3 + 1;
                goto LAB_0019620c;
              }
              puVar11 = &UNK_009c14c8;
              uVar10 = 0x22;
              puVar9 = &UNK_0081b7f0;
            }
            func_0x007a11c0(puVar9,uVar10,puVar11);
            goto LAB_001964d8;
          }
          func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
          goto LAB_001964d8;
        }
        puVar11 = &UNK_009c14c8;
        uVar10 = 0x22;
        puVar9 = &UNK_0081b7f0;
      }
      func_0x007a11c0(puVar9,uVar10,puVar11);
      goto LAB_001964d8;
    }
    puVar11 = &UNK_009c14c8;
    uVar10 = 0x22;
    puVar9 = &UNK_0081b7f0;
  }
  func_0x007a11c0(puVar9,uVar10,puVar11);
LAB_001964d8:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1964dc);
  (*pcVar1)();
}

