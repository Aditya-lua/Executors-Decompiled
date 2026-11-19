/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088506c
 */

void FUN_0088506c(undefined8 *param_1,long param_2)

{
  long lVar1;
  byte bVar2;
  undefined4 uVar3;
  int iVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  ulong uVar8;
  size_t sVar9;
  uint uVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  char *pcVar14;
  ulong uVar15;
  uint local_78 [2];
  undefined8 local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
  }
  if (((0 < *(int *)((long)param_1 + 0x14)) && (*(int *)(param_2 + 8) != DAT_00d1b0f0)) &&
     (*(int *)(param_2 + 8) != DAT_00d1b1e0)) {
    FUN_00875b54(*param_1,0x45,0,0,0);
  }
  bVar2 = DAT_00d1ec40;
  iVar4 = *(int *)(param_2 + 8);
  if ((param_2 == 0) || (iVar4 != DAT_00d1b0f0)) {
    if ((param_2 != 0) && (iVar4 == DAT_00d1b100)) {
      if (*(long *)(lVar1 + 0x28) == local_68) {
        FUN_00887400(param_1,param_2);
        return;
      }
      goto LAB_008859ec;
    }
    if ((param_2 != 0) && (iVar4 == DAT_00d1b110)) {
      if (*(long *)(lVar1 + 0x28) == local_68) {
        FUN_00887a70(param_1,param_2);
        return;
      }
      goto LAB_008859ec;
    }
    if ((param_2 != 0) && (iVar4 == DAT_00d1b120)) {
      if (*(long *)(lVar1 + 0x28) == local_68) {
        FUN_00887dd0(param_1,param_2);
        return;
      }
      goto LAB_008859ec;
    }
    if (iVar4 == DAT_00d1b130) {
      FUN_008860c8(param_1,*(undefined8 *)(param_1[0xfb] + -0x18));
      uVar13 = FUN_00875ec8(*param_1);
      FUN_00875cac(*param_1,0x17,0,0);
      local_78[0] = 0;
LAB_008853bc:
      local_70 = uVar13;
      FUN_00888244(param_1 + 0xf7,local_78);
    }
    else {
      if ((param_2 != 0) && (iVar4 == DAT_00d1b140)) {
        lVar11 = param_1[0xfb];
        if (*(long *)(lVar11 + -8) == 0) {
          *(long *)(lVar11 + -8) = param_2;
        }
        FUN_008860c8(param_1,*(undefined8 *)(lVar11 + -0x10));
        uVar13 = FUN_00875ec8(*param_1);
        FUN_00875cac(*param_1,0x17,0,0);
        local_78[0] = 1;
        goto LAB_008853bc;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b150)) {
        if ((*(int *)(param_1 + 1) < 2) || (param_1[0xfd] == param_1[0xfe])) {
          if (*(long *)(lVar1 + 0x28) == local_68) {
            FUN_008884a8(param_1,param_2);
            return;
          }
        }
        else if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_00888330(param_1,param_2,0);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b160)) {
        lVar11 = *(long *)(param_2 + 0x20);
        if ((lVar11 == 0) || (*(int *)(lVar11 + 8) != DAT_00d1b040)) {
          if (*(long *)(lVar1 + 0x28) == local_68) {
            FUN_00889800(param_1);
            return;
          }
        }
        else if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_0088888c(param_1,lVar11,*(undefined4 *)((long)param_1 + 0x64c),0,0,0);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b170)) {
        if ((DAT_00d1ec40 == 1) && (*(long *)(param_2 + 0x28) != 0)) {
          lVar11 = *(long *)(param_2 + 0x28) << 3;
          puVar12 = *(undefined8 **)(param_2 + 0x20);
          do {
            FUN_008899a8(param_1,*puVar12,param_2 + 0xc);
            lVar11 = lVar11 + -8;
            puVar12 = puVar12 + 1;
          } while (lVar11 != 0);
        }
        if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_008899f8(param_1,param_2);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b180)) {
        if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_0088a0a4(param_1,param_2);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b190)) {
        if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_0088a6c0(param_1,param_2);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b1a0)) {
        if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_0088ab24(param_1,param_2);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b1b0)) {
        if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_0088b128(param_1,param_2);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 != 0) && (iVar4 == DAT_00d1b1c0)) {
        if (*(long *)(lVar1 + 0x28) == local_68) {
          FUN_0088b6b8(param_1,param_2);
          return;
        }
        goto LAB_008859ec;
      }
      if ((param_2 == 0) || (iVar4 != DAT_00d1b1d0)) {
        if ((param_2 == 0) || (iVar4 != DAT_00d1b1e0)) {
          if (((iVar4 != DAT_00d1b1f0) && (DAT_00d1ec80 == '\x01')) && (iVar4 == DAT_00d1b220)) {
            if (*(long *)(lVar1 + 0x28) == local_68) {
              FUN_0088c63c(param_1,param_2);
              return;
            }
            goto LAB_008859ec;
          }
        }
        else if (((DAT_00d1f0c8 == '\x01') && (*(char *)(param_2 + 0x60) == '\x01')) &&
                ((param_1[0xcd] != 0 &&
                 ((*(long *)(param_1[0xcd] + 0x98) == 0 && param_1[0xce] == 0 &&
                  (param_1[0xfa] == param_1[0xfb])))))) {
          *(undefined1 *)((long)param_1 + 0xcfd) = 1;
        }
      }
      else if (((DAT_00d1ec40 == 1) && ((DAT_00d1f0a8 & 1) == 0)) &&
              (*(char *)(*(long *)(param_2 + 0x20) + 0x31) == '\x01')) {
        FUN_008899a8(param_1,*(long *)(param_2 + 0x20),param_2 + 0xc);
        FUN_0088b80c(param_1,param_2);
        uVar7 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 00885780 to 008857a7 has its CatchHandler @ 008859c0 */
        uVar3 = FUN_00884b30(param_1,param_2,1);
        FUN_0088b9a0(param_1,*(undefined8 *)(param_2 + 0x28),uVar3,0xff);
        uVar13 = *param_1;
        pcVar14 = (char *)**(undefined8 **)(param_2 + 0x20);
        sVar9 = strlen(pcVar14);
                    /* try { // try from 008857c0 to 008857cb has its CatchHandler @ 008859b8 */
        iVar4 = FUN_00875070(uVar13,pcVar14,sVar9);
        if (iVar4 < 0) {
          if (*(long *)(lVar1 + 0x28) == local_68) {
                    /* try { // try from 008859a8 to 008859b7 has its CatchHandler @ 008859b8 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(*(long *)(param_2 + 0x20) + 8,
                         "Exceeded constant limit; simplify the code to compile");
          }
          goto LAB_008859ec;
        }
                    /* try { // try from 008857d4 to 00885827 has its CatchHandler @ 008859c8 */
        uVar5 = FUN_0088c318(param_1,param_2);
        uVar13 = *param_1;
        pcVar14 = (char *)**(undefined8 **)(param_2 + 0x20);
        sVar9 = strlen(pcVar14);
        uVar6 = FUN_00877e08(pcVar14,sVar9);
        FUN_00875b54(uVar13,0x10,uVar3,uVar5,uVar6);
        FUN_00875d18(*param_1,iVar4);
        *(undefined4 *)((long)param_1 + 0x64c) = uVar7;
      }
      else {
        local_78[0] = CONCAT31(local_78[0]._1_3_,0xff);
        if ((DAT_00d1f0e8 == '\x01') &&
           (uVar15 = FUN_0088c464(param_1,*(undefined8 *)(param_2 + 0x20),local_78),
           (uVar15 & 1) != 0)) {
          uVar10 = local_78[0] & 0xff;
        }
        else {
          uVar10 = FUN_00884b30(param_1,param_2,1);
          local_78[0] = CONCAT31(local_78[0]._1_3_,(char)uVar10);
        }
        FUN_00884b7c(param_1,*(undefined8 *)(param_2 + 0x20),uVar10,0xffffffff);
        FUN_0088b9a0(param_1,*(undefined8 *)(param_2 + 0x28),(undefined1)local_78[0],0xff);
        lVar11 = FUN_00886aac(param_1 + 0x14,(undefined8 *)(param_2 + 0x20));
        uVar7 = FUN_008769d0(*param_1);
        *(undefined4 *)(lVar11 + 4) = uVar7;
      }
    }
  }
  else {
    lVar11 = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
    if (DAT_00d1ec40 == 1) {
      param_1[0xce] = param_1[0xce] + 1;
    }
    uVar7 = *(undefined4 *)((long)param_1 + 0x64c);
    if (*(long *)(param_2 + 0x28) == 0) {
      if (bVar2 != 0) {
        param_1[0xce] = param_1[0xce] + -1;
      }
LAB_0088527c:
                    /* try { // try from 0088527c to 00885293 has its CatchHandler @ 008859d0 */
      FUN_008860c8(param_1,lVar11);
    }
    else {
      uVar15 = 0;
      do {
        uVar13 = *(undefined8 *)(*(long *)(param_2 + 0x20) + uVar15 * 8);
        if (DAT_00d1f0e8 == '\x01') {
                    /* try { // try from 00885170 to 0088519b has its CatchHandler @ 008859d4 */
          FUN_00884cbc(param_1,param_2,uVar13,0);
        }
        FUN_0088506c(param_1,uVar13);
        uVar8 = FUN_0089acdc(param_1 + 0x29,uVar13);
      } while (((uVar8 & 1) == 0) && (uVar15 = uVar15 + 1, uVar15 < *(ulong *)(param_2 + 0x28)));
      if ((DAT_00d1ec40 & 1) != 0) {
        param_1[0xce] = param_1[0xce] + -1;
      }
      if ((uVar8 & 1) == 0) goto LAB_0088527c;
    }
    FUN_008862e0(param_1,lVar11);
    *(undefined4 *)((long)param_1 + 0x64c) = uVar7;
  }
  if (*(long *)(lVar1 + 0x28) == local_68) {
    return;
  }
LAB_008859ec:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

