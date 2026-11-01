
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_0074f900(void)

{
  uint uVar1;
  undefined2 uVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  undefined8 *puVar9;
  char cVar10;
  ulong *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  ulong unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  
  while( true ) {
    func_0x0076bad4();
    uVar6 = (**(code **)(unaff_x20 + 0x9c0))
                      (*(undefined8 *)(unaff_x20 + 0xd38),0,*(undefined8 *)(unaff_x20 + 0x9c8));
    func_0x0076bad4();
    if ((int)uVar6 != 0) break;
    do {
      iVar5 = _inet_pton(2);
      if (iVar5 < 1) {
        iVar5 = _inet_pton(0x1e);
        uVar6 = (ulong)(0 < iVar5);
        cVar10 = *(char *)((long)unaff_x24 + 0x52b);
      }
      else {
        uVar6 = 1;
        cVar10 = *(char *)((long)unaff_x24 + 0x52b);
      }
      if (cVar10 == '\x02') {
        cVar10 = *(char *)(*(long *)(unaff_x20 + 0xd0) + 0x270);
        if (cVar10 == '\0') {
          iVar5 = _socket(0x1e,2,0);
          if (iVar5 == -1) {
            cVar10 = '\x01';
          }
          else {
            _close();
            cVar10 = '\x02';
          }
          *(char *)(*(long *)(unaff_x20 + 0xd0) + 0x270) = cVar10;
        }
        if (cVar10 != '\x02') goto LAB_0074f7e8;
      }
      iVar5 = func_0x0077e6f8();
      if ((((iVar5 == 0) && (iVar5 = func_0x0077e6f8(), iVar5 == 0)) &&
          (uVar7 = func_0x0074fc70(), (uVar7 & 1) == 0)) && (iVar5 = func_0x0074fc70(), iVar5 == 0))
      {
        if ((int)unaff_x25 == 0) {
code_r0x0074fc28:
          iVar5 = func_0x00750844();
          if (iVar5 == 0) goto LAB_0074f7e8;
          unaff_x24 = (undefined8 *)func_0x0074ef84();
        }
        else {
          iVar5 = (int)uVar6;
          if ((*(byte *)(unaff_x20 + 0xa20) & 8) == 0) {
            iVar5 = 1;
          }
          if (iVar5 != 0) goto code_r0x0074fc28;
          unaff_x24 = (undefined8 *)func_0x0073ebd4();
        }
        if (unaff_x24 == (undefined8 *)0x0) goto code_r0x0074fb34;
code_r0x0074fb60:
        if (*(long *)(unaff_x20 + 0xe0) != 0) {
          func_0x00779cfc();
        }
        uVar6 = func_0x0074f314();
        if (*(long *)(unaff_x20 + 0xe0) != 0) {
          func_0x00779d40();
        }
        in_stack_00000010 = uVar6;
        if (uVar6 == 0) {
          func_0x0073a4d8(unaff_x24);
        }
        else {
          func_0x0074fd54();
          unaff_x23 = 0;
        }
      }
      else {
        lVar8 = _strlen();
        iVar5 = _inet_pton(2,"127.0.0.1",(long)&uStack0000000000000018 + 4);
        uVar4 = uStack0000000000000018._4_4_;
        if (iVar5 < 1) {
          unaff_x24 = (undefined8 *)0x0;
        }
        else {
          unaff_x25 = (undefined8 *)0xa2b608;
          unaff_x24 = (undefined8 *)(*pcRam0000000000a2b608)(1,lVar8 + 0x41);
          uVar3 = _UNK_008cd500;
          if (unaff_x24 != (undefined8 *)0x0) {
            uVar1 = (unaff_w21 & 0xff00ff00) >> 8 | (unaff_w21 & 0xff00ff) << 8;
            uVar6 = (ulong)(uVar1 & 0xffff);
            unaff_x24[1] = _UNK_008cd508;
            *unaff_x24 = uVar3;
            *(undefined4 *)(unaff_x24 + 2) = 0x10;
            *(undefined2 *)(unaff_x24 + 6) = 0x200;
            uVar2 = (undefined2)uVar1;
            *(undefined2 *)((long)unaff_x24 + 0x32) = uVar2;
            *(undefined4 *)((long)unaff_x24 + 0x34) = uVar4;
            unaff_x24[7] = 0;
            unaff_x24[3] = unaff_x24 + 8;
            unaff_x24[4] = unaff_x24 + 6;
            _strcpy();
            lVar8 = _strlen();
            puVar9 = (undefined8 *)(*pcRam0000000000a2b608)(1,lVar8 + 0x4d);
            if (puVar9 != (undefined8 *)0x0) {
              _inet_pton(0x1e,"::1",&uStack0000000000000020);
              uVar3 = _UNK_008cd510;
              in_stack_00000038 = in_stack_00000028;
              in_stack_00000030 = uStack0000000000000020;
              puVar9[1] = _UNK_008cd518;
              *puVar9 = uVar3;
              *(undefined4 *)(puVar9 + 2) = 0x1c;
              *(undefined1 *)((long)puVar9 + 0x31) = 0x1e;
              *(undefined2 *)((long)puVar9 + 0x32) = uVar2;
              *(undefined4 *)((long)puVar9 + 0x34) = 0;
              puVar9[8] = in_stack_00000028;
              puVar9[7] = uStack0000000000000020;
              *(undefined4 *)(puVar9 + 9) = 0;
              puVar9[4] = puVar9 + 6;
              puVar9[5] = 0;
              puVar9[3] = (long)puVar9 + 0x4c;
              _strcpy();
              puVar9[5] = unaff_x24;
              unaff_x24 = puVar9;
              unaff_x25 = puVar9;
            }
          }
        }
        if (unaff_x24 != (undefined8 *)0x0) goto code_r0x0074fb60;
code_r0x0074fb34:
        if (in_stack_00000008._4_4_ == 0) {
          uVar6 = 0;
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
          uVar6 = in_stack_00000010;
        }
      }
      do {
        *unaff_x19 = uVar6;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
          return unaff_x23;
        }
code_r0x0074f8e0:
        ___stack_chk_fail();
        unaff_x23 = 0xffffffff;
        if (*(long *)(unaff_x20 + 0xe0) != 0) {
          func_0x00779d40();
        }
      } while (uVar6 != 0);
      in_stack_00000008._4_4_ = 0;
    } while (*(long *)(unaff_x20 + 0x9c0) == 0);
  }
LAB_0074f7e8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 != in_stack_00000048) goto code_r0x0074f8e0;
  return 0xffffffff;
}

