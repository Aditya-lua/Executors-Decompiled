/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00919af0
 */

/* WARNING: Type propagation algorithm not settling */

uint FUN_00919af0(long param_1)

{
  byte bVar1;
  bool bVar2;
  int iVar3;
  uint uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  
  iVar3 = *(int *)(param_1 + 0x124);
  uVar6 = 0xffffffffffffffbf;
  if (*(long *)(param_1 + 0x918) != 0) {
    uVar6 = 0xffffffffffffffff;
  }
  if (iVar3 - 100U < 100) {
    return 0;
  }
  if ((*(uint *)(param_1 + 0x131c) >> 5 & 1) != 0) {
    return (int)((uint)*(byte *)(param_1 + 0xa84) << 0x1c) >> 0x1f & 0x16;
  }
  lVar7 = *(long *)(param_1 + 0x20);
  bVar2 = false;
  if (*(long *)(param_1 + 0x12f0) == 0 && *(long *)(param_1 + 0x918) == 0) {
LAB_00919bf8:
    bVar1 = *(byte *)(lVar7 + 0x3a0);
joined_r0x00919bfc:
    if ((bVar1 >> 2 & 1) == 0) goto LAB_00919c00;
LAB_00919ce4:
    if ((*(int *)(param_1 + 0x124) != 0x197) &&
       ((299 < *(int *)(param_1 + 0x124) || ((*(uint *)(param_1 + 0x1b1) >> 0x10 & 1) == 0))))
    goto LAB_00919c00;
    uVar6 = *(ulong *)(param_1 + 0xd80) & *(ulong *)(param_1 + 0xd70);
    uVar4 = (uint)uVar6;
    if ((uVar4 >> 2 & 1) != 0) {
      uVar5 = 4;
LAB_00919d68:
      *(undefined8 *)(param_1 + 0xd78) = uVar5;
LAB_00919d6c:
      *(undefined8 *)(param_1 + 0xd80) = 0;
      goto LAB_00919d70;
    }
    if (((uVar4 & 0xffffffbf) >> 1 & 1) != 0) {
      uVar5 = 2;
      goto LAB_00919d68;
    }
    if (((uVar4 & 0xffffffbf) >> 3 & 1) != 0) {
      uVar5 = 8;
      goto LAB_00919d68;
    }
    if ((uVar6 & 1) != 0) {
      uVar5 = 1;
      goto LAB_00919d68;
    }
    if ((uVar4 >> 7 & 1) != 0) {
      *(undefined8 *)(param_1 + 0xd78) = 0x80;
      goto LAB_00919d6c;
    }
    *(undefined8 *)(param_1 + 0xd80) = 0;
    *(undefined8 *)(param_1 + 0xd78) = 0x40000000;
    *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x20;
    if (bVar2) goto LAB_00919d70;
LAB_00919c04:
    iVar3 = *(int *)(param_1 + 0x124);
    if (iVar3 < 300) {
      if (((((*(byte *)(param_1 + 0xd68) & 1) == 0) && ((*(byte *)(param_1 + 0x1b3) & 1) != 0)) &&
          (*(char *)(param_1 + 0x131a) != '\0')) && (*(char *)(param_1 + 0x131a) != '\x05')) {
        lVar7 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x11b8));
        *(long *)(param_1 + 0x198) = lVar7;
        if (lVar7 == 0) {
          return 0x1b;
        }
        *(byte *)(param_1 + 0xd68) = *(byte *)(param_1 + 0xd68) | 1;
      }
      goto LAB_00919db0;
    }
  }
  else {
    if (iVar3 == 0x191) {
LAB_00919b64:
      uVar6 = *(ulong *)(param_1 + 0xd60) & uVar6 & *(ulong *)(param_1 + 0xd50);
      uVar4 = (uint)uVar6;
      if ((uVar4 >> 2 & 1) != 0) {
        uVar5 = 4;
LAB_00919bec:
        *(undefined8 *)(param_1 + 0xd58) = uVar5;
LAB_00919bf0:
        *(undefined8 *)(param_1 + 0xd60) = 0;
        bVar2 = true;
        goto LAB_00919bf8;
      }
      if ((uVar4 >> 6 & 1) != 0) {
        uVar5 = 0x40;
        goto LAB_00919bec;
      }
      if ((uVar4 >> 1 & 1) != 0) {
        uVar5 = 2;
        goto LAB_00919bec;
      }
      if ((uVar4 >> 3 & 1) == 0) {
        if ((uVar6 & 1) != 0) {
          uVar5 = 1;
          goto LAB_00919bec;
        }
        if ((uVar4 >> 7 & 1) == 0) {
          *(undefined8 *)(param_1 + 0xd60) = 0;
          *(undefined8 *)(param_1 + 0xd58) = 0x40000000;
          *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x20;
          bVar1 = *(byte *)(lVar7 + 0x3a0);
          goto joined_r0x00919be0;
        }
        *(undefined8 *)(param_1 + 0xd58) = 0x80;
        goto LAB_00919bf0;
      }
      *(undefined8 *)(param_1 + 0xd60) = 0;
      *(undefined8 *)(param_1 + 0xd58) = 8;
      if (*(byte *)(lVar7 + 0x574) < 0xc) {
        bVar2 = true;
        bVar1 = *(byte *)(lVar7 + 0x3a0);
        goto joined_r0x00919be0;
      }
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Forcing HTTP/1.1 for NTLM");
      }
      bVar2 = true;
      FUN_00908c4c(lVar7,1);
      *(undefined1 *)(param_1 + 0x1318) = 2;
      bVar1 = *(byte *)(lVar7 + 0x3a0);
      goto joined_r0x00919bfc;
    }
    if (iVar3 < 300) {
      bVar2 = false;
      if ((*(uint *)(param_1 + 0x1b1) >> 0x10 & 1) == 0) goto LAB_00919bf8;
      goto LAB_00919b64;
    }
    bVar1 = *(byte *)(lVar7 + 0x3a0);
joined_r0x00919be0:
    bVar2 = false;
joined_r0x00919be0:
    if ((bVar1 >> 2 & 1) != 0) goto LAB_00919ce4;
LAB_00919c00:
    if (!bVar2) goto LAB_00919c04;
LAB_00919d70:
    FUN_00919e70(param_1,lVar7);
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x198));
    *(undefined8 *)(param_1 + 0x198) = 0;
    lVar7 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x11b8));
    *(long *)(param_1 + 0x198) = lVar7;
    if (lVar7 == 0) {
      return 0x1b;
    }
LAB_00919db0:
    iVar3 = *(int *)(param_1 + 0x124);
  }
  if (iVar3 < 400) {
    return 0;
  }
  if (((uint)*(undefined8 *)(param_1 + 0xa82) >> 0x13 & 1) == 0) {
    return 0;
  }
  if (((*(long *)(param_1 + 0x1118) != 0) && (iVar3 == 0x1a0)) &&
     (*(char *)(param_1 + 0x131a) == '\0')) {
    return 0;
  }
  if (iVar3 == 0x197) {
    if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x3a0) >> 2 & 1) == 0) goto LAB_00919e34;
  }
  else if ((iVar3 != 0x191) || (*(long *)(param_1 + 0x12f0) == 0)) goto LAB_00919e34;
  if ((*(byte *)(param_1 + 0x131c) >> 5 & 1) == 0) {
    return 0;
  }
LAB_00919e34:
  FUN_00904b80(param_1,"The requested URL returned error: %d");
  return 0x16;
}

