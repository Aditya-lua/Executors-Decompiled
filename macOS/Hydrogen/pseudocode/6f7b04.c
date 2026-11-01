
undefined8 FUN_006f7b04(void)

{
  byte *pbVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 *puVar6;
  ulong uVar7;
  byte bVar8;
  ulong unaff_x19;
  int unaff_w20;
  byte unaff_w21;
  long unaff_x22;
  long unaff_x23;
  byte *pbVar9;
  byte *unaff_x24;
  int iVar10;
  int unaff_w25;
  byte *pbVar11;
  byte *unaff_x26;
  undefined *unaff_x27;
  byte *unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  char in_stack_00000232;
  byte *pbVar12;
  byte *in_stack_00000250;
  byte *in_stack_00000258;
  byte abStack_7ffffffe [2147483614];
  
code_r0x006f7b04:
  bVar8 = *unaff_x26;
  if (bVar8 < 0x23) {
                    /* WARNING: Could not recover jumptable at 0x006f7b1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar5 = (*(code *)(&UNK_006f7b20 + (ulong)(byte)unaff_x27[(char)bVar8] * 4))();
    return uVar5;
  }
  if (bVar8 == 0x5c) {
    if (in_stack_00000258 <= in_stack_00000250) {
      func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
    }
    *in_stack_00000250 = unaff_w21;
    if (in_stack_00000258 <= in_stack_00000250 + 1) {
      func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
    }
    bVar8 = *unaff_x26;
    in_stack_00000250 = in_stack_00000250 + 1;
  }
  else if (in_stack_00000258 <= in_stack_00000250) {
    func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
    bVar8 = *unaff_x26;
  }
  *in_stack_00000250 = bVar8;
  unaff_x26 = unaff_x26 + 1;
  pbVar12 = in_stack_00000250;
joined_r0x006f7b00:
  bVar2 = uStack0000000000000028 == 0;
  uStack0000000000000028 = uStack0000000000000028 - 1;
  in_stack_00000250 = pbVar12 + 1;
  if (bVar2) {
    if (in_stack_00000258 <= in_stack_00000250) {
      func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
    }
    pbVar12 = pbVar12 + 2;
    *in_stack_00000250 = 0x22;
    iVar10 = unaff_w25;
code_r0x006f77a0:
    do {
      if (unaff_x28 <= unaff_x24) {
        func_0x006e79b0(abStack_7ffffffe + 0x8000024e);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return 1;
        }
code_r0x006f7ca8:
        ___stack_chk_fail();
code_r0x006f7cac:
        func_0x006e644c(in_stack_00000018,"\'%%*\' does not take a form");
        goto code_r0x006f7cbc;
      }
      bVar8 = *unaff_x24;
      if (bVar8 != 0x25) {
        if (in_stack_00000258 <= pbVar12) {
          func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
          bVar8 = *unaff_x24;
        }
        unaff_x24 = unaff_x24 + 1;
        *pbVar12 = bVar8;
code_r0x006f779c:
        pbVar12 = pbVar12 + 1;
        goto code_r0x006f77a0;
      }
      pbVar11 = unaff_x24 + 1;
      bVar8 = *pbVar11;
      if (bVar8 != 0x2a) {
        if (bVar8 == 0x25) {
          if (pbVar12 < in_stack_00000258) {
            bVar8 = 0x25;
          }
          else {
            func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
            bVar8 = *pbVar11;
          }
          unaff_x24 = unaff_x24 + 2;
          *pbVar12 = bVar8;
          goto code_r0x006f779c;
        }
        unaff_w25 = iVar10 + 1;
        pbVar9 = pbVar11;
        if (unaff_w20 <= iVar10) goto code_r0x006f7c74;
        while (((bVar8 != 0 && (bVar8 < 0x40)) &&
               ((unaff_x23 << ((ulong)bVar8 & 0x3f) & unaff_x19) != 0))) {
          bVar8 = pbVar9[1];
          pbVar9 = pbVar9 + 1;
        }
        if (5 < (ulong)((long)pbVar9 - (long)pbVar11)) goto code_r0x006f7c88;
        pbVar9 = pbVar9 + ((ulong)(*(uint *)(in_stack_00000010 + (ulong)bVar8 * 4) >> 10) & 1) +
                 ((ulong)(*(uint *)(in_stack_00000010 +
                                   (ulong)pbVar9[(ulong)(*(uint *)(in_stack_00000010 +
                                                                  (ulong)bVar8 * 4) >> 10) & 1] * 4)
                         >> 10) & 1);
        bVar8 = *pbVar9;
        if (bVar8 == 0x2e) {
          bVar2 = (*(uint *)(unaff_x22 + 0x3c + (ulong)pbVar9[1] * 4) & 0x400) != 0;
          lVar4 = unaff_x23;
          if (bVar2) {
            lVar4 = unaff_x23 + 1;
          }
          pbVar1 = pbVar9 + 1;
          if (bVar2) {
            pbVar1 = pbVar9 + 2;
          }
          pbVar9 = pbVar1 + ((ulong)(*(uint *)(unaff_x22 + 0x3c + (ulong)pbVar9[lVar4] * 4) >> 10) &
                            1);
          bVar8 = *pbVar9;
        }
        if ((*(uint *)(unaff_x22 + (ulong)bVar8 * 4 + 0x3c) >> 10 & 1) != 0) goto code_r0x006f7c98;
        pbVar1 = pbVar9 + (1 - (long)pbVar11);
        lVar4 = _strncpy(in_stack_00000008,pbVar11,pbVar1);
        pbVar1[lVar4] = 0;
        unaff_x24 = pbVar9 + 1;
        bVar8 = *pbVar9;
        iVar10 = unaff_w25;
        switch(bVar8) {
        case 0x2a:
          goto code_r0x006f7cac;
        default:
code_r0x006f7cbc:
          uVar5 = func_0x006e644c(in_stack_00000018,"invalid option \'%%%c\' to \'format\'");
          func_0x006e67c8(uVar5,1,0);
          func_0x006e67c8(uVar5,2,0);
          func_0x006e1d54(uVar5,2);
          func_0x006e3870(uVar5,0);
          func_0x006e3af8(uVar5,&DAT_006fa394,0,3,0);
          return 1;
        case 0x45:
        case 0x47:
        case 0x65:
        case 0x66:
        case 0x67:
          func_0x006e6a4c(in_stack_00000018,unaff_w25);
          break;
        case 0x58:
        case 0x6f:
        case 0x75:
        case 0x78:
          func_0x006e6a4c(in_stack_00000018,unaff_w25);
          abStack_7ffffffe[(long)(pbVar1 + 0x8000022e)] = 0x6c;
          pbVar9[(long)(abStack_7ffffffe + (0x80000230 - (long)pbVar11))] = 0x6c;
          pbVar9[(long)(abStack_7ffffffe + (0x80000231 - (long)pbVar11))] = bVar8;
          pbVar9[(long)(abStack_7ffffffe + (0x80000232 - (long)pbVar11))] = 0;
          break;
        case 99:
          func_0x006e6a4c(in_stack_00000018,unaff_w25);
          iVar3 = _snprintf(&uStack0000000000000030,0x200,abStack_7ffffffe + 0x8000022e);
          uVar7 = (ulong)iVar3;
          puVar6 = &uStack0000000000000030;
code_r0x006f7c1c:
          func_0x006e7378(abStack_7ffffffe + 0x8000024e,puVar6,uVar7);
          goto code_r0x006f77a0;
        case 100:
        case 0x69:
          abStack_7ffffffe[(long)(pbVar1 + 0x8000022e)] = 0x6c;
          pbVar9[(long)(abStack_7ffffffe + (0x80000230 - (long)pbVar11))] = 0x6c;
          pbVar9[(long)(abStack_7ffffffe + (0x80000231 - (long)pbVar11))] = bVar8;
          pbVar9[(long)(abStack_7ffffffe + (0x80000232 - (long)pbVar11))] = 0;
          func_0x006e6a4c(in_stack_00000018,unaff_w25);
          break;
        case 0x71:
          goto code_r0x006f7a38;
        case 0x73:
          puVar6 = (undefined1 *)
                   func_0x006e67c8(in_stack_00000018,unaff_w25,&uStack0000000000000028);
          uVar7 = uStack0000000000000028;
          if ((in_stack_00000232 == '\0') ||
             ((lVar4 = _strchr(abStack_7ffffffe + 0x8000022e,0x2e), lVar4 == 0 && (99 < uVar7))))
          goto code_r0x006f7c1c;
        }
        _snprintf(&uStack0000000000000030,0x200,abStack_7ffffffe + 0x8000022e);
        uVar5 = _strlen(&uStack0000000000000030);
        func_0x006e7378(abStack_7ffffffe + 0x8000024e,&uStack0000000000000030,uVar5);
        goto code_r0x006f77a0;
      }
      if (unaff_w20 <= iVar10) {
code_r0x006f7c74:
        func_0x006e644c(in_stack_00000018,"missing argument #%d");
code_r0x006f7c88:
        func_0x006e644c(in_stack_00000018,"invalid format (repeated flags)");
code_r0x006f7c98:
        func_0x006e644c(in_stack_00000018,"invalid format (width or precision too long)");
        goto code_r0x006f7ca8;
      }
      unaff_x24 = unaff_x24 + 2;
      func_0x006e75d8(abStack_7ffffffe + 0x8000024e,iVar10 + 1);
      iVar10 = iVar10 + 1;
    } while( true );
  }
  goto code_r0x006f7b04;
code_r0x006f7a38:
  unaff_x26 = (byte *)func_0x006e67c8(in_stack_00000018,unaff_w25,&uStack0000000000000028);
  func_0x006e7288(abStack_7ffffffe + 0x8000024e,uStack0000000000000028 + 2);
  if (in_stack_00000258 <= pbVar12) {
    func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
  }
  *pbVar12 = 0x22;
  unaff_w21 = 0x5c;
  unaff_x27 = &UNK_008c833f;
  goto joined_r0x006f7b00;
}

