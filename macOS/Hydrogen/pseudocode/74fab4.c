
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_0074fab4(code *param_1,long param_2)

{
  uint uVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  undefined8 *puVar7;
  char cVar8;
  ulong *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  ulong unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  ulong unaff_x26;
  undefined8 in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  
code_r0x0074fab4:
  puVar7 = (undefined8 *)(*param_1)(1,param_2 + 0x4d);
  if (puVar7 != (undefined8 *)0x0) {
    _inet_pton(0x1e,"::1",&uStack0000000000000020);
    uVar2 = _UNK_008cd510;
    in_stack_00000038 = in_stack_00000028;
    in_stack_00000030 = uStack0000000000000020;
    puVar7[1] = _UNK_008cd518;
    *puVar7 = uVar2;
    *(undefined4 *)(puVar7 + 2) = 0x1c;
    *(undefined1 *)((long)puVar7 + 0x31) = 0x1e;
    *(short *)((long)puVar7 + 0x32) = (short)unaff_x26;
    *(undefined4 *)((long)puVar7 + 0x34) = 0;
    puVar7[8] = in_stack_00000028;
    puVar7[7] = uStack0000000000000020;
    *(undefined4 *)(puVar7 + 9) = 0;
    puVar7[4] = puVar7 + 6;
    puVar7[5] = 0;
    puVar7[3] = (long)puVar7 + 0x4c;
    _strcpy();
    puVar7[5] = unaff_x24;
    unaff_x24 = puVar7;
    unaff_x25 = puVar7;
  }
joined_r0x0074fb30:
  if (unaff_x24 == (undefined8 *)0x0) {
    if (in_stack_00000008._4_4_ == 0) {
      unaff_x26 = 0;
    }
    else {
      if ((*(byte *)(*(long *)(unaff_x20 + 0x18) + 0x39b) >> 1 & 1) == 0) {
        unaff_w21 = func_0x00728c18();
      }
      else {
        unaff_w21 = func_0x0073f68c();
      }
      if (in_stack_00000010 != 0) {
        func_0x0074fd54();
      }
      if (unaff_w21 != 0) goto LAB_0074f7e8;
      unaff_x23 = (ulong)(in_stack_00000010 == 0);
      unaff_x26 = in_stack_00000010;
    }
  }
  else {
    if (*(long *)(unaff_x20 + 0xe0) != 0) {
      func_0x00779cfc();
    }
    unaff_x26 = func_0x0074f314();
    if (*(long *)(unaff_x20 + 0xe0) != 0) {
      func_0x00779d40();
    }
    in_stack_00000010 = unaff_x26;
    if (unaff_x26 == 0) {
      func_0x0073a4d8(unaff_x24);
    }
    else {
      func_0x0074fd54();
      unaff_x23 = 0;
    }
  }
  do {
    *unaff_x19 = unaff_x26;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return unaff_x23;
    }
    while( true ) {
      ___stack_chk_fail();
      unaff_x23 = 0xffffffff;
      if (*(long *)(unaff_x20 + 0xe0) != 0) {
        func_0x00779d40();
      }
      if (unaff_x26 != 0) break;
      in_stack_00000008._4_4_ = 0;
      if (*(long *)(unaff_x20 + 0x9c0) == 0) {
code_r0x0074f934:
        iVar4 = _inet_pton(2);
        if (iVar4 < 1) {
          iVar4 = _inet_pton(0x1e);
          unaff_x26 = (ulong)(0 < iVar4);
          cVar8 = *(char *)((long)unaff_x24 + 0x52b);
        }
        else {
          unaff_x26 = 1;
          cVar8 = *(char *)((long)unaff_x24 + 0x52b);
        }
        if (cVar8 == '\x02') {
          cVar8 = *(char *)(*(long *)(unaff_x20 + 0xd0) + 0x270);
          if (cVar8 == '\0') {
            iVar4 = _socket(0x1e,2,0);
            if (iVar4 == -1) {
              cVar8 = '\x01';
            }
            else {
              _close();
              cVar8 = '\x02';
            }
            *(char *)(*(long *)(unaff_x20 + 0xd0) + 0x270) = cVar8;
          }
          if (cVar8 != '\x02') goto LAB_0074f7e8;
        }
        iVar4 = func_0x0077e6f8();
        if ((((iVar4 != 0) || (iVar4 = func_0x0077e6f8(), iVar4 != 0)) ||
            (uVar5 = func_0x0074fc70(), (uVar5 & 1) != 0)) ||
           (iVar4 = func_0x0074fc70(), iVar4 != 0)) {
          lVar6 = _strlen();
          iVar4 = _inet_pton(2,"127.0.0.1",(long)&uStack0000000000000018 + 4);
          uVar3 = uStack0000000000000018._4_4_;
          if (iVar4 < 1) {
            unaff_x24 = (undefined8 *)0x0;
            goto joined_r0x0074fb30;
          }
          unaff_x25 = (undefined8 *)0xa2b608;
          unaff_x24 = (undefined8 *)(*pcRam0000000000a2b608)(1,lVar6 + 0x41);
          uVar2 = _UNK_008cd500;
          if (unaff_x24 == (undefined8 *)0x0) goto joined_r0x0074fb30;
          uVar1 = (unaff_w21 & 0xff00ff00) >> 8 | (unaff_w21 & 0xff00ff) << 8;
          unaff_x26 = (ulong)(uVar1 & 0xffff);
          unaff_x24[1] = _UNK_008cd508;
          *unaff_x24 = uVar2;
          *(undefined4 *)(unaff_x24 + 2) = 0x10;
          *(undefined2 *)(unaff_x24 + 6) = 0x200;
          *(short *)((long)unaff_x24 + 0x32) = (short)uVar1;
          *(undefined4 *)((long)unaff_x24 + 0x34) = uVar3;
          unaff_x24[7] = 0;
          unaff_x24[3] = unaff_x24 + 8;
          unaff_x24[4] = unaff_x24 + 6;
          _strcpy();
          param_2 = _strlen();
          param_1 = pcRam0000000000a2b608;
          goto code_r0x0074fab4;
        }
        if ((int)unaff_x25 != 0) {
          iVar4 = (int)unaff_x26;
          if ((*(byte *)(unaff_x20 + 0xa20) & 8) == 0) {
            iVar4 = 1;
          }
          if (iVar4 == 0) {
            unaff_x24 = (undefined8 *)func_0x0073ebd4();
            goto joined_r0x0074fb30;
          }
        }
        iVar4 = func_0x00750844();
        if (iVar4 != 0) {
          unaff_x24 = (undefined8 *)func_0x0074ef84();
          goto joined_r0x0074fb30;
        }
      }
      else {
        func_0x0076bad4();
        unaff_x26 = (**(code **)(unaff_x20 + 0x9c0))
                              (*(undefined8 *)(unaff_x20 + 0xd38),0,
                               *(undefined8 *)(unaff_x20 + 0x9c8));
        func_0x0076bad4();
        if ((int)unaff_x26 == 0) goto code_r0x0074f934;
      }
LAB_0074f7e8:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
        return 0xffffffff;
      }
    }
  } while( true );
}

