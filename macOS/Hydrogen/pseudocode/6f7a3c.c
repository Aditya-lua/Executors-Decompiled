
undefined8 FUN_006f7a3c(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  byte *pbVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  byte *pbVar5;
  undefined1 *puVar6;
  undefined8 uVar7;
  ulong uVar8;
  byte *pbVar9;
  byte bVar10;
  ulong unaff_x19;
  int unaff_w20;
  long unaff_x21;
  long unaff_x23;
  byte *unaff_x24;
  ulong unaff_x25;
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
  
code_r0x006f7a3c:
  pbVar5 = (byte *)func_0x006e67c8(in_stack_00000018,unaff_x25,param_3);
  func_0x006e7288(abStack_7ffffffe + 0x8000024e,uStack0000000000000028 + 2);
  if (in_stack_00000258 <= in_stack_00000250) {
    func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
  }
  pbVar9 = in_stack_00000250 + 1;
  *in_stack_00000250 = 0x22;
  while (bVar2 = uStack0000000000000028 != 0, uStack0000000000000028 = uStack0000000000000028 - 1,
        bVar2) {
    bVar10 = *pbVar5;
    switch(bVar10) {
    case 0:
      func_0x006e7378(abStack_7ffffffe + 0x8000024e,"\\000",4);
      break;
    case 10:
    case 0x22:
code_r0x006f7b40:
      if (in_stack_00000258 <= pbVar9) {
        func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
      }
      *pbVar9 = 0x5c;
      if (in_stack_00000258 <= pbVar9 + 1) {
        func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
      }
      bVar10 = *pbVar5;
      pbVar9 = pbVar9 + 1;
      goto code_r0x006f7ae4;
    case 0xd:
      func_0x006e7378(abStack_7ffffffe + 0x8000024e,"\\r",2);
      break;
    default:
      if (bVar10 == 0x5c) goto code_r0x006f7b40;
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
      if (in_stack_00000258 <= pbVar9) {
        func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
        bVar10 = *pbVar5;
      }
code_r0x006f7ae4:
      *pbVar9 = bVar10;
      pbVar9 = pbVar9 + 1;
    }
    pbVar5 = pbVar5 + 1;
  }
  if (in_stack_00000258 <= pbVar9) {
    func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
  }
  in_stack_00000250 = pbVar9 + 1;
  *pbVar9 = 0x22;
LAB_006f77a0:
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
    bVar10 = *unaff_x24;
    if (bVar10 != 0x25) {
      if (in_stack_00000258 <= in_stack_00000250) {
        func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
        bVar10 = *unaff_x24;
      }
      unaff_x24 = unaff_x24 + 1;
      *in_stack_00000250 = bVar10;
code_r0x006f779c:
      in_stack_00000250 = in_stack_00000250 + 1;
      goto LAB_006f77a0;
    }
    pbVar5 = unaff_x24 + 1;
    bVar10 = *pbVar5;
    iVar3 = (int)unaff_x25;
    if (bVar10 != 0x2a) {
      if (bVar10 == 0x25) {
        if (in_stack_00000250 < in_stack_00000258) {
          bVar10 = 0x25;
        }
        else {
          func_0x006e7288(abStack_7ffffffe + 0x8000024e,1);
          bVar10 = *pbVar5;
        }
        unaff_x24 = unaff_x24 + 2;
        *in_stack_00000250 = bVar10;
        goto code_r0x006f779c;
      }
      unaff_x25 = (ulong)(iVar3 + 1);
      pbVar9 = pbVar5;
      if (unaff_w20 <= iVar3) goto code_r0x006f7c74;
      while (((bVar10 != 0 && (bVar10 < 0x40)) &&
             ((unaff_x23 << ((ulong)bVar10 & 0x3f) & unaff_x19) != 0))) {
        bVar10 = pbVar9[1];
        pbVar9 = pbVar9 + 1;
      }
      if (5 < (ulong)((long)pbVar9 - (long)pbVar5)) goto code_r0x006f7c88;
      pbVar9 = pbVar9 + ((ulong)(*(uint *)(in_stack_00000010 + (ulong)bVar10 * 4) >> 10) & 1) +
               ((ulong)(*(uint *)(in_stack_00000010 +
                                 (ulong)pbVar9[(ulong)(*(uint *)(in_stack_00000010 +
                                                                (ulong)bVar10 * 4) >> 10) & 1] * 4)
                       >> 10) & 1);
      bVar10 = *pbVar9;
      if (bVar10 == 0x2e) {
        bVar2 = (*(uint *)(unaff_x21 + 0x3c + (ulong)pbVar9[1] * 4) & 0x400) != 0;
        lVar4 = unaff_x23;
        if (bVar2) {
          lVar4 = unaff_x23 + 1;
        }
        pbVar1 = pbVar9 + 1;
        if (bVar2) {
          pbVar1 = pbVar9 + 2;
        }
        pbVar9 = pbVar1 + ((ulong)(*(uint *)(unaff_x21 + 0x3c + (ulong)pbVar9[lVar4] * 4) >> 10) & 1
                          );
        bVar10 = *pbVar9;
      }
      if ((*(uint *)(unaff_x21 + (ulong)bVar10 * 4 + 0x3c) >> 10 & 1) != 0) goto code_r0x006f7c98;
      pbVar1 = pbVar9 + (1 - (long)pbVar5);
      lVar4 = _strncpy(in_stack_00000008,pbVar5,pbVar1);
      pbVar1[lVar4] = 0;
      unaff_x24 = pbVar9 + 1;
      bVar10 = *pbVar9;
      switch(bVar10) {
      case 0x2a:
        goto code_r0x006f7cac;
      default:
code_r0x006f7cbc:
        uVar7 = func_0x006e644c(in_stack_00000018,"invalid option \'%%%c\' to \'format\'");
        func_0x006e67c8(uVar7,1,0);
        func_0x006e67c8(uVar7,2,0);
        func_0x006e1d54(uVar7,2);
        func_0x006e3870(uVar7,0);
        func_0x006e3af8(uVar7,&DAT_006fa394,0,3,0);
        return 1;
      case 0x45:
      case 0x47:
      case 0x65:
      case 0x66:
      case 0x67:
        func_0x006e6a4c(in_stack_00000018,unaff_x25);
        break;
      case 0x58:
      case 0x6f:
      case 0x75:
      case 0x78:
        func_0x006e6a4c(in_stack_00000018,unaff_x25);
        abStack_7ffffffe[(long)(pbVar1 + 0x8000022e)] = 0x6c;
        pbVar9[(long)(abStack_7ffffffe + (0x80000230 - (long)pbVar5))] = 0x6c;
        pbVar9[(long)(abStack_7ffffffe + (0x80000231 - (long)pbVar5))] = bVar10;
        pbVar9[(long)(abStack_7ffffffe + (0x80000232 - (long)pbVar5))] = 0;
        break;
      case 99:
        func_0x006e6a4c(in_stack_00000018,unaff_x25);
        iVar3 = _snprintf(&uStack0000000000000030,0x200,abStack_7ffffffe + 0x8000022e);
        uVar8 = (ulong)iVar3;
        puVar6 = &uStack0000000000000030;
code_r0x006f7c1c:
        func_0x006e7378(abStack_7ffffffe + 0x8000024e,puVar6,uVar8);
        goto LAB_006f77a0;
      case 100:
      case 0x69:
        abStack_7ffffffe[(long)(pbVar1 + 0x8000022e)] = 0x6c;
        pbVar9[(long)(abStack_7ffffffe + (0x80000230 - (long)pbVar5))] = 0x6c;
        pbVar9[(long)(abStack_7ffffffe + (0x80000231 - (long)pbVar5))] = bVar10;
        pbVar9[(long)(abStack_7ffffffe + (0x80000232 - (long)pbVar5))] = 0;
        func_0x006e6a4c(in_stack_00000018,unaff_x25);
        break;
      case 0x71:
        goto code_r0x006f7a38;
      case 0x73:
        puVar6 = (undefined1 *)func_0x006e67c8(in_stack_00000018,unaff_x25,&uStack0000000000000028);
        uVar8 = uStack0000000000000028;
        if ((in_stack_00000232 == '\0') ||
           ((lVar4 = _strchr(abStack_7ffffffe + 0x8000022e,0x2e), lVar4 == 0 && (99 < uVar8))))
        goto code_r0x006f7c1c;
      }
      _snprintf(&uStack0000000000000030,0x200,abStack_7ffffffe + 0x8000022e);
      uVar7 = _strlen(&uStack0000000000000030);
      func_0x006e7378(abStack_7ffffffe + 0x8000024e,&uStack0000000000000030,uVar7);
      goto LAB_006f77a0;
    }
    unaff_x25 = (ulong)(iVar3 + 1);
    if (unaff_w20 <= iVar3) {
code_r0x006f7c74:
      func_0x006e644c(in_stack_00000018,"missing argument #%d");
code_r0x006f7c88:
      func_0x006e644c(in_stack_00000018,"invalid format (repeated flags)");
code_r0x006f7c98:
      func_0x006e644c(in_stack_00000018,"invalid format (width or precision too long)");
      goto code_r0x006f7ca8;
    }
    unaff_x24 = unaff_x24 + 2;
    func_0x006e75d8(abStack_7ffffffe + 0x8000024e,unaff_x25);
  } while( true );
code_r0x006f7a38:
  param_3 = &uStack0000000000000028;
  goto code_r0x006f7a3c;
}

