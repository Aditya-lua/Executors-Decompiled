
long FUN_0003ab70(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  char *pcVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  undefined8 uVar12;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  char in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined1 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  uVar2 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar2 = func_0x00086db4(uVar2,"clone_proto_and_remove_code",0x1b);
  uVar2 = func_0x00086db4(uVar2," @ ",3);
  uVar2 = func_0x00086db4(uVar2,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  pcVar7 = (char *)((long)&MACH_HEADER.magic + 1);
  uVar2 = func_0x00086db4(uVar2,":");
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0x62);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000028,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000028,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000028);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  lVar5 = func_0x006ef5d0(param_1);
  *(undefined2 *)(lVar5 + 3) = *(undefined2 *)(param_2 + 3);
  *(undefined2 *)(lVar5 + 4) = *(undefined2 *)(param_2 + 4);
  *(undefined1 *)(lVar5 + 7) = *(undefined1 *)(param_2 + 7);
  if (-1 < (int)*(uint *)(param_2 + 0x98)) {
    pcVar7 = (char *)(ulong)*(byte *)(lVar5 + 2);
    lVar6 = func_0x006f3708(param_1,(ulong)*(uint *)(param_2 + 0x98) << 4);
    if (0 < *(int *)(param_2 + 0x98)) {
      lVar8 = 0;
      lVar10 = 0;
      do {
        puVar9 = (undefined8 *)(*(long *)(param_2 + 8) + lVar8);
        uVar2 = *puVar9;
        ((undefined8 *)(lVar6 + lVar8))[1] = puVar9[1];
        *(undefined8 *)(lVar6 + lVar8) = uVar2;
        lVar10 = lVar10 + 1;
        lVar8 = lVar8 + 0x10;
      } while (lVar10 < *(int *)(param_2 + 0x98));
    }
    *(long *)(lVar5 + 8) = lVar6;
    if (-1 < (int)*(uint *)(param_2 + 0x8c)) {
      uVar2 = func_0x006f3708(param_1,(ulong)*(uint *)(param_2 + 0x8c) << 3,
                              *(undefined1 *)(lVar5 + 2));
      *(undefined8 *)(lVar5 + 0x18) = uVar2;
      if (*(int *)(param_2 + 0x8c) != 0) {
        uVar11 = 0;
        do {
          uVar2 = func_0x0003ab60(param_1,*(undefined8 *)(*(long *)(param_2 + 0x18) + uVar11 * 8));
          *(undefined8 *)(*(long *)(lVar5 + 0x18) + uVar11 * 8) = uVar2;
          uVar11 = uVar11 + 1;
        } while (uVar11 < *(uint *)(param_2 + 0x8c));
      }
      in_stack_00000038._7_1_ = '\b';
      uStack0000000000000028 = 0x30206e7275746572;
      in_stack_00000030 = 0;
      uStack0000000000000008._0_1_ = 0;
      in_stack_00000020 = '\0';
      pcVar7 = (char *)&uStack0000000000000028;
      func_0x0003b060(0xa27db8,param_1,pcVar7,&uStack0000000000000008);
      if ((in_stack_00000020 != '\0') && (in_stack_00000018._7_1_ < '\0')) {
        __ZdlPv(CONCAT71(uStack0000000000000008._1_7_,(undefined1)uStack0000000000000008));
      }
      if (in_stack_00000038._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000028);
      }
      plVar3 = (long *)func_0x006e1710(param_1,0xffffffff);
      lVar6 = *(long *)(*plVar3 + 0x18);
      if (-1 < (int)*(uint *)(lVar6 + 0x88)) {
        pcVar7 = (char *)(ulong)*(byte *)(lVar5 + 2);
        lVar10 = func_0x006f3708(param_1,(ulong)*(uint *)(lVar6 + 0x88) << 2);
        *(long *)(lVar5 + 0x10) = lVar10;
        if (*(int *)(lVar6 + 0x88) != 0) {
          uVar11 = 0;
          lVar8 = *(long *)(lVar6 + 0x10);
          do {
            *(undefined4 *)(lVar10 + uVar11 * 4) = *(undefined4 *)(lVar8 + uVar11 * 4);
            uVar11 = uVar11 + 1;
          } while (uVar11 < *(uint *)(lVar6 + 0x88));
        }
        func_0x006e1d54(param_1,0xfffffffe);
        *(undefined8 *)(lVar5 + 0x20) = *(undefined8 *)(lVar5 + 0x10);
        *(undefined8 *)(lVar5 + 0x28) = 0;
        *(undefined8 *)(lVar5 + 0x30) = 0;
        *(long *)(lVar5 + 0x38) = lVar5 + 0x38;
        *(long *)(lVar5 + 0x40) = lVar5 + 0x40;
        if (-1 < (int)*(uint *)(param_2 + 0x90)) {
          lVar6 = func_0x006f3708(param_1,(ulong)*(uint *)(param_2 + 0x90) * 0x18,
                                  *(undefined1 *)(lVar5 + 2));
          if (0 < *(int *)(param_2 + 0x90)) {
            lVar8 = 0;
            lVar10 = 0;
            do {
              puVar9 = (undefined8 *)(*(long *)(param_2 + 0x48) + param_2 + 0x48 + lVar8);
              puVar1 = (undefined8 *)(lVar6 + lVar8);
              uVar12 = puVar9[1];
              uVar2 = *puVar9;
              puVar1[2] = puVar9[2];
              puVar1[1] = uVar12;
              *puVar1 = uVar2;
              lVar10 = lVar10 + 1;
              lVar8 = lVar8 + 0x18;
            } while (lVar10 < *(int *)(param_2 + 0x90));
          }
          *(long *)(lVar5 + 0x48) = lVar6 - (lVar5 + 0x48);
          lVar6 = func_0x006f3708(param_1,0,*(undefined1 *)(lVar5 + 2));
          *(long *)(lVar5 + 0x50) = (lVar5 + 0x50) - lVar6;
          lVar6 = *(long *)(param_2 + 0x58) - (param_2 + 0x58);
          if (lVar6 == 0) {
            lVar6 = 0;
          }
          else {
            lVar6 = lVar6 + 0x18;
            uVar2 = _strlen(lVar6);
            lVar6 = func_0x006f6ef8(param_1,lVar6,uVar2);
          }
          *(long *)(lVar5 + 0x58) = lVar6 + lVar5 + 0x58;
          lVar6 = *(long *)(param_2 + 0x60) + param_2 + 0x60;
          if (lVar6 == 0) {
            lVar6 = 0;
          }
          else {
            lVar6 = lVar6 + 0x18;
            uVar2 = _strlen(lVar6);
            lVar6 = func_0x006f6ef8(param_1,lVar6,uVar2);
          }
          *(long *)(lVar5 + 0x60) = lVar6 - (lVar5 + 0x60);
          *(long *)(lVar5 + 0x68) = lVar5 + 0x68;
          *(long *)(lVar5 + 0x70) = lVar5 + 0x70;
          *(long *)(lVar5 + 0x78) = ((lVar5 + 0x78) - (param_2 + 0x78)) + *(long *)(param_2 + 0x78);
          *(undefined8 *)(lVar5 + 0x80) = *(undefined8 *)(param_2 + 0x80);
          *(undefined8 *)(lVar5 + 0x88) = *(undefined8 *)(param_2 + 0x88);
          *(undefined4 *)(lVar5 + 0x90) = *(undefined4 *)(param_2 + 0x90);
          *(undefined4 *)(lVar5 + 0x94) = 0;
          uVar2 = *(undefined8 *)(param_2 + 0x98);
          *(undefined8 *)(lVar5 + 0xa0) = *(undefined8 *)(param_2 + 0xa0);
          *(undefined8 *)(lVar5 + 0x98) = uVar2;
          *(undefined4 *)(lVar5 + 0xa8) = *(undefined4 *)(param_2 + 0xa8);
          *(undefined4 *)(lVar5 + 0xac) = 0;
          return lVar5;
        }
      }
    }
  }
  uVar2 = func_0x006f36f4(param_1);
  if ((in_stack_00000020 != '\0') && (in_stack_00000018._7_1_ < '\0')) {
    __ZdlPv(CONCAT71(uStack0000000000000008._1_7_,(undefined1)uStack0000000000000008));
  }
  if (in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000028);
    uVar2 = __Unwind_Resume(uVar2);
    __ZNSt3__16localeD1Ev(&uStack0000000000000028);
  }
  plVar3 = (long *)__Unwind_Resume(uVar2);
  if ((((pcVar7 != (char *)0x0) &&
       ((pcVar7[1] & 0xbU) != ((*(byte *)(*(long *)(*plVar3 + 0x18) + 0x20) ^ 0xff) & 3))) &&
      (*pcVar7 == '\a')) && ((pcVar7[3] == '\0' && (plVar3[1] == *(long *)(pcVar7 + 0x18))))) {
    func_0x006e17a8(*plVar3,1);
    puVar9 = *(undefined8 **)(*plVar3 + 8);
    *puVar9 = pcVar7;
    *(undefined4 *)((long)puVar9 + 0xc) = 7;
    lVar5 = *plVar3;
    *(long *)(lVar5 + 8) = *(long *)(lVar5 + 8) + 0x10;
    *(int *)(plVar3 + 5) = (int)plVar3[5] + 1;
    func_0x006e4860(lVar5,0xfffffffe);
  }
  return 0;
}

