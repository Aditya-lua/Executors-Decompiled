
undefined4 FUN_0078a568(void)

{
  uint uVar1;
  byte bVar2;
  byte bVar3;
  bool bVar4;
  char cVar5;
  int iVar6;
  char *pcVar7;
  long lVar8;
  long lVar9;
  uint uVar10;
  undefined4 uVar11;
  long unaff_x19;
  uint unaff_w20;
  int unaff_w21;
  long lVar12;
  byte *unaff_x22;
  long *unaff_x24;
  uint unaff_w25;
  uint uVar13;
  uint unaff_w27;
  uint unaff_w28;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000040;
  
  if ((unaff_w27 != 0) && (*unaff_x22 != 0x2f)) {
    iVar6 = func_0x0074075c(&uStack0000000000000040,"/",1);
    uVar11 = 0x1f;
    if (iVar6 != 100) {
      uVar11 = 7;
    }
    if (iVar6 != 0) {
      return uVar11;
    }
  }
  if (unaff_w25 == 0) {
    iVar6 = func_0x007408a0(&uStack0000000000000040);
    if (iVar6 != 0) {
LAB_0078a72c:
      uVar11 = 0x1f;
      if (iVar6 != 100) {
        uVar11 = 7;
      }
      return uVar11;
    }
    pcVar7 = (char *)func_0x00740a58(&uStack0000000000000040);
    while( true ) {
      while (*pcVar7 == '%') {
        bVar2 = pcVar7[1];
        if (((bVar2 - 0x30 & 0xff) < 10) ||
           (uVar13 = bVar2 - 0x41,
           uVar13 < 0x26 && (1L << ((ulong)uVar13 & 0x3f) & 0x3f0000003fU) != 0)) {
          bVar3 = pcVar7[2];
          if (((bVar3 - 0x30 & 0xff) < 10) ||
             (uVar13 = bVar3 - 0x41,
             uVar13 < 0x26 && (1L << ((ulong)uVar13 & 0x3f) & 0x3f0000003fU) != 0)) {
            bVar4 = (byte)(bVar2 + 0xbf) < 0x1a;
            if ((!bVar4 && 0x18 < (byte)(bVar3 + 0xbf)) && (bVar4 || (byte)(bVar3 + 0xbf) != 0x19))
            {
              pcVar7 = pcVar7 + 1;
            }
            else {
              cVar5 = func_0x0077e6e4((int)(char)bVar2);
              pcVar7[1] = cVar5;
              cVar5 = func_0x0077e6e4((long)pcVar7[2]);
              pcVar7[2] = cVar5;
              pcVar7 = pcVar7 + 3;
            }
          }
          else {
            pcVar7 = pcVar7 + 1;
          }
        }
        else {
          pcVar7 = pcVar7 + 1;
        }
      }
      if (*pcVar7 == '\0') break;
      pcVar7 = pcVar7 + 1;
    }
  }
  else {
    bVar2 = *unaff_x22;
    if (bVar2 != 0) {
      uVar13 = in_stack_00000010._4_4_;
      do {
        uVar10 = (uint)bVar2;
        uVar1 = unaff_w28 ^ 1;
        if (uVar10 != 0x20) {
          uVar1 = 1;
        }
        if ((uVar1 & 1) == 0) {
          iVar6 = func_0x0074075c(&uStack0000000000000040,"+",1);
          if (iVar6 != 0) {
            return 7;
          }
        }
        else {
          if ((9 < uVar10 - 0x30) && (0x19 < (uVar10 & 0xdf) - 0x41)) {
            if (uVar10 < 0x5f) {
              if (1 < uVar10 - 0x2d) {
                uVar1 = unaff_w27;
                if (uVar10 != 0x2f) goto LAB_0078a6a4;
joined_r0x0078a6ac:
                if ((uVar1 & 1) == 0) goto LAB_0078a6d8;
              }
            }
            else if ((uVar10 != 0x5f) && (uVar10 != 0x7e)) {
LAB_0078a6a4:
              uVar1 = uVar13;
              if (uVar10 == 0x3d) goto joined_r0x0078a6ac;
LAB_0078a6d8:
              uStack0000000000000020._1_1_ = "0123456789abcdef"[bVar2 >> 4];
              uStack0000000000000020._0_1_ = 0x25;
              uStack0000000000000020._2_1_ = "0123456789abcdef"[(ulong)bVar2 & 0xf];
              iVar6 = func_0x0074075c(&uStack0000000000000040,&uStack0000000000000020,3);
              if (iVar6 == 0) goto LAB_0078a640;
              goto LAB_0078a72c;
            }
          }
          uVar1 = uVar13;
          if ((uVar13 & 1) != 0) {
            uVar1 = 0;
          }
          if (uVar10 != 0x3d) {
            uVar1 = uVar13;
          }
          iVar6 = func_0x0074075c(&uStack0000000000000040,unaff_x22,1);
          uVar13 = uVar1;
          if (iVar6 != 0) goto LAB_0078a72c;
        }
LAB_0078a640:
        unaff_x22 = unaff_x22 + 1;
        bVar2 = *unaff_x22;
      } while (bVar2 != 0);
    }
  }
  lVar8 = func_0x00740a58(&uStack0000000000000040);
  if ((in_stack_00000010._4_4_ == 0) || (lVar8 == 0)) {
    if ((unaff_w21 == 5) &&
       ((lVar12 = func_0x00156654(&uStack0000000000000040), (unaff_w20 >> 10 & 1) == 0 ||
        (lVar12 != 0)))) {
      if (lVar12 == 0) {
code_r0x0078a9e4:
        func_0x00740678(&uStack0000000000000040);
        return 0x15;
      }
      if ((unaff_w25 & 1) == 0) {
        uStack0000000000000018 = 0;
        iVar6 = func_0x00742734(lVar8,lVar12,&uStack0000000000000018,&uStack0000000000000020,3);
        if ((iVar6 != 0) || (iVar6 = func_0x0078b6d8(), iVar6 != 0)) {
          (*pcRam0000000000a2b5f0)(uStack0000000000000018);
          goto code_r0x0078a9e4;
        }
        (*pcRam0000000000a2b5f0)(uStack0000000000000018);
      }
      else {
        iVar6 = func_0x0078b6d8();
        if (iVar6 != 0) goto code_r0x0078a9e4;
      }
    }
  }
  else {
    lVar12 = *(long *)(unaff_x19 + 0x40);
    if ((lVar12 != 0) && (lVar9 = _strlen(lVar12), lVar9 != 0)) {
      cVar5 = *(char *)(lVar9 + lVar12 + -1);
      func_0x0074066c(&uStack0000000000000020,&UNK_007a1200);
      iVar6 = func_0x0074075c(&uStack0000000000000020,*(undefined8 *)(unaff_x19 + 0x40),lVar9);
      if ((iVar6 == 0) &&
         (((cVar5 == '&' || (iVar6 = func_0x0074075c(&uStack0000000000000020,"&",1), iVar6 == 0)) &&
          (iVar6 = func_0x007408a0(&uStack0000000000000020,lVar8), iVar6 == 0)))) {
        func_0x00740678(&uStack0000000000000040);
        (*pcRam0000000000a2b5f0)(*unaff_x24);
        lVar8 = func_0x00740a58(&uStack0000000000000020);
        *unaff_x24 = lVar8;
        return 0;
      }
      func_0x00740678(&uStack0000000000000040);
      return 7;
    }
  }
  (*pcRam0000000000a2b5f0)(*unaff_x24);
  *unaff_x24 = lVar8;
  return 0;
}

