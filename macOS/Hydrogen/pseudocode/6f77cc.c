
undefined8 FUN_006f77cc(ulong param_1)

{
  undefined1 in_ZR;
  bool bVar1;
  int iVar2;
  long lVar3;
  undefined1 *puVar4;
  undefined8 uVar5;
  ulong uVar6;
  byte *pbVar7;
  byte bVar8;
  byte *pbVar9;
  ulong unaff_x19;
  int unaff_w20;
  long unaff_x22;
  long unaff_x23;
  byte *unaff_x24;
  int iVar10;
  byte *unaff_x26;
  int unaff_w27;
  byte *unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  char in_stack_00000232;
  byte *in_stack_00000250;
  byte *in_stack_00000258;
  byte abStack_7ffffffe [2147483614];
  
  do {
    if ((bool)in_ZR) {
      if (in_stack_00000250 < in_stack_00000258) {
        bVar8 = 0x25;
      }
      else {
        func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
        bVar8 = *unaff_x26;
      }
      unaff_x24 = unaff_x24 + 2;
      *in_stack_00000250 = bVar8;
      iVar10 = unaff_w27;
      goto LAB_006f779c;
    }
    iVar10 = unaff_w27 + 1;
    if (unaff_w20 <= unaff_w27) {
LAB_006f7c74:
      func_0x006e644c(in_stack_00000018,"missing argument #%d");
LAB_006f7c88:
      func_0x006e644c(in_stack_00000018,"invalid format (repeated flags)");
LAB_006f7c98:
      func_0x006e644c(in_stack_00000018,"invalid format (width or precision too long)");
code_r0x006f7ca8:
      ___stack_chk_fail();
code_r0x006f7cac:
      func_0x006e644c(in_stack_00000018,"\'%%*\' does not take a form");
      goto LAB_006f7cbc;
    }
    pbVar9 = unaff_x26;
    if ((int)param_1 != 0) {
      do {
        if ((0x3f < (uint)param_1) || ((unaff_x23 << (param_1 & 0x3f) & unaff_x19) == 0)) break;
        pbVar9 = pbVar9 + 1;
        param_1 = (ulong)*pbVar9;
      } while (*pbVar9 != 0);
    }
    if (5 < (ulong)((long)pbVar9 - (long)unaff_x26)) goto LAB_006f7c88;
    pbVar9 = pbVar9 + ((ulong)(*(uint *)(in_stack_00000010 + (param_1 & 0xffffffff) * 4) >> 10) & 1)
             + ((ulong)(*(uint *)(in_stack_00000010 +
                                 (ulong)pbVar9[(ulong)(*(uint *)(in_stack_00000010 +
                                                                (param_1 & 0xffffffff) * 4) >> 10) &
                                               1] * 4) >> 10) & 1);
    bVar8 = *pbVar9;
    if (bVar8 == 0x2e) {
      bVar1 = (*(uint *)(unaff_x22 + 0x3c + (ulong)pbVar9[1] * 4) & 0x400) != 0;
      lVar3 = unaff_x23;
      if (bVar1) {
        lVar3 = unaff_x23 + 1;
      }
      pbVar7 = pbVar9 + 1;
      if (bVar1) {
        pbVar7 = pbVar9 + 2;
      }
      pbVar9 = pbVar7 + ((ulong)(*(uint *)(unaff_x22 + 0x3c + (ulong)pbVar9[lVar3] * 4) >> 10) & 1);
      bVar8 = *pbVar9;
    }
    if ((*(uint *)(unaff_x22 + (ulong)bVar8 * 4 + 0x3c) >> 10 & 1) != 0) goto LAB_006f7c98;
    pbVar7 = pbVar9 + (1 - (long)unaff_x26);
    lVar3 = _strncpy(in_stack_00000008,unaff_x26,pbVar7);
    pbVar7[lVar3] = 0;
    unaff_x24 = pbVar9 + 1;
    bVar8 = *pbVar9;
    switch(bVar8) {
    case 0x2a:
      goto code_r0x006f7cac;
    default:
LAB_006f7cbc:
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
      func_0x006e6a4c(in_stack_00000018,iVar10);
      break;
    case 0x58:
    case 0x6f:
    case 0x75:
    case 0x78:
      func_0x006e6a4c(in_stack_00000018,iVar10);
      abStack_7ffffffe[(long)(pbVar7 + 0x8000022e)] = 0x6c;
      pbVar9[(long)(abStack_7ffffffe + (0x80000230 - (long)unaff_x26))] = 0x6c;
      pbVar9[(long)(abStack_7ffffffe + (0x80000231 - (long)unaff_x26))] = bVar8;
      pbVar9[(long)(abStack_7ffffffe + (0x80000232 - (long)unaff_x26))] = 0;
      break;
    case 99:
      func_0x006e6a4c(in_stack_00000018,iVar10);
      iVar2 = _snprintf(&uStack0000000000000030,0x200,abStack_7ffffffe + 0x8000022e);
      uVar6 = (ulong)iVar2;
      puVar4 = &uStack0000000000000030;
code_r0x006f7c1c:
      func_0x006e7378(abStack_7ffffffe + 0x8000024e,puVar4,uVar6);
      goto code_r0x006f77a0;
    case 100:
    case 0x69:
      abStack_7ffffffe[(long)(pbVar7 + 0x8000022e)] = 0x6c;
      pbVar9[(long)(abStack_7ffffffe + (0x80000230 - (long)unaff_x26))] = 0x6c;
      pbVar9[(long)(abStack_7ffffffe + (0x80000231 - (long)unaff_x26))] = bVar8;
      pbVar9[(long)(abStack_7ffffffe + (0x80000232 - (long)unaff_x26))] = 0;
      func_0x006e6a4c(in_stack_00000018,iVar10);
      break;
    case 0x71:
      pbVar9 = (byte *)func_0x006e67c8(in_stack_00000018,iVar10,&uStack0000000000000028);
      func_0x006e7288(abStack_7ffffffe + 0x8000024e,uStack0000000000000028 + 2);
      if (in_stack_00000258 <= in_stack_00000250) {
        func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
      }
      pbVar7 = in_stack_00000250 + 1;
      *in_stack_00000250 = 0x22;
      while (bVar1 = uStack0000000000000028 != 0,
            uStack0000000000000028 = uStack0000000000000028 - 1, bVar1) {
        bVar8 = *pbVar9;
        switch(bVar8) {
        case 0:
          func_0x006e7378(abStack_7ffffffe + 0x8000024e,"\\000",4);
          break;
        case 10:
        case 0x22:
code_r0x006f7b40:
          if (in_stack_00000258 <= pbVar7) {
            func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
          }
          *pbVar7 = 0x5c;
          if (in_stack_00000258 <= pbVar7 + 1) {
            func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
          }
          bVar8 = *pbVar9;
          pbVar7 = pbVar7 + 1;
          goto code_r0x006f7ae4;
        case 0xd:
          func_0x006e7378(abStack_7ffffffe + 0x8000024e,"\\r",2);
          break;
        default:
          if (bVar8 == 0x5c) goto code_r0x006f7b40;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 0xb:
        case 0xc:
        case 0xe:
        case 0xf:
        case 0x10:
        case 0x11:
        case 0x12:
        case 0x13:
        case 0x14:
        case 0x15:
        case 0x16:
        case 0x17:
        case 0x18:
        case 0x19:
        case 0x1a:
        case 0x1b:
        case 0x1c:
        case 0x1d:
        case 0x1e:
        case 0x1f:
        case 0x20:
        case 0x21:
          if (in_stack_00000258 <= pbVar7) {
            func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
            bVar8 = *pbVar9;
          }
code_r0x006f7ae4:
          *pbVar7 = bVar8;
          pbVar7 = pbVar7 + 1;
        }
        pbVar9 = pbVar9 + 1;
      }
      if (in_stack_00000258 <= pbVar7) {
        func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
      }
      in_stack_00000250 = pbVar7 + 1;
      *pbVar7 = 0x22;
      goto code_r0x006f77a0;
    case 0x73:
      puVar4 = (undefined1 *)func_0x006e67c8(in_stack_00000018,iVar10,&uStack0000000000000028);
      uVar6 = uStack0000000000000028;
      if ((in_stack_00000232 == '\0') ||
         ((lVar3 = _strchr(abStack_7ffffffe + 0x8000022e,0x2e), lVar3 == 0 && (99 < uVar6))))
      goto code_r0x006f7c1c;
    }
    _snprintf(&uStack0000000000000030,0x200,abStack_7ffffffe + 0x8000022e);
    uVar5 = _strlen(&uStack0000000000000030);
    func_0x006e7378(abStack_7ffffffe + 0x8000024e,&uStack0000000000000030,uVar5);
code_r0x006f77a0:
    while( true ) {
      while( true ) {
        if (unaff_x28 <= unaff_x24) {
          func_0x006e79b0(abStack_7ffffffe + 0x8000024e);
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
            return 1;
          }
          goto code_r0x006f7ca8;
        }
        bVar8 = *unaff_x24;
        if (bVar8 == 0x25) break;
        if (in_stack_00000258 <= in_stack_00000250) {
          func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
          bVar8 = *unaff_x24;
        }
        unaff_x24 = unaff_x24 + 1;
        *in_stack_00000250 = bVar8;
LAB_006f779c:
        in_stack_00000250 = in_stack_00000250 + 1;
      }
      unaff_x26 = unaff_x24 + 1;
      bVar8 = *unaff_x26;
      param_1 = (ulong)bVar8;
      if (bVar8 != 0x2a) break;
      if (unaff_w20 <= iVar10) goto LAB_006f7c74;
      unaff_x24 = unaff_x24 + 2;
      func_0x006e75d8(abStack_7ffffffe + 0x8000024e,iVar10 + 1);
      iVar10 = iVar10 + 1;
    }
    in_ZR = bVar8 == 0x25;
    unaff_w27 = iVar10;
  } while( true );
}

