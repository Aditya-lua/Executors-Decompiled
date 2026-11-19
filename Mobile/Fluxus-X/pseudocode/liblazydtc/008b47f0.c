/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b47f0
 */

int FUN_008b47f0(long param_1,undefined8 param_2,undefined8 param_3,long param_4,long param_5)

{
  byte bVar1;
  undefined2 uVar2;
  undefined2 uVar3;
  ushort uVar4;
  ushort uVar5;
  int iVar6;
  char cVar7;
  int iVar8;
  int iVar9;
  char *pcVar10;
  undefined8 uVar11;
  int iVar12;
  code *pcVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  undefined8 *puVar17;
  
  uVar2 = *(undefined2 *)(param_1 + 0x28);
  uVar3 = *(undefined2 *)(param_1 + 0x2a);
  lVar14 = *(long *)(param_1 + 0x50);
  lVar16 = *(long *)(param_1 + 0x20);
  bVar1 = *(byte *)(param_1 + 6);
  iVar8 = FUN_008b3edc();
  if (iVar8 == 0) {
    return 0;
  }
  iVar6 = iVar8;
  if (param_5 != 0) {
    if (iVar8 != 2) {
      puVar17 = *(undefined8 **)(param_1 + 0x68);
      if (iVar8 == 3) {
        puVar17[1] = puVar17[-1];
        *puVar17 = puVar17[-2];
      }
      else {
        if (iVar8 == 5) {
          pcVar10 = "error in error handling";
          uVar11 = 0x17;
        }
        else {
          if (iVar8 != 4) goto LAB_008b48ac;
          pcVar10 = "not enough memory";
          uVar11 = 0x11;
        }
        uVar11 = FUN_008b9ff8(param_1,pcVar10,uVar11);
        *puVar17 = uVar11;
        *(undefined4 *)((long)puVar17 + 0xc) = 5;
      }
LAB_008b48ac:
      *(undefined8 **)(param_1 + 0x68) = puVar17 + 2;
    }
    iVar9 = FUN_008b3edc(param_1,FUN_008b4a70,*(long *)(param_1 + 0x58) + param_5);
    iVar12 = 4;
    if (iVar9 != 4 || iVar8 != 4) {
      iVar12 = 5;
    }
    iVar6 = 2;
    if (iVar9 != 0) {
      iVar6 = iVar12;
      iVar8 = iVar12;
    }
  }
  if ((bVar1 & 1) == 0) {
    *(undefined1 *)(param_1 + 6) = 0;
  }
  uVar4 = *(ushort *)(param_1 + 0x2a);
  *(undefined2 *)(param_1 + 0x2a) = uVar3;
  cVar7 = DAT_00d1f428;
  uVar5 = *(ushort *)(param_1 + 0x28);
  *(undefined2 *)(param_1 + 0x28) = uVar2;
  if (cVar7 == '\x01') {
    if (uVar5 == uVar4) {
LAB_008b4928:
      pcVar13 = *(code **)(*(long *)(param_1 + 0x60) + 0x6a0);
      if ((pcVar13 != (code *)0x0) && ((*pcVar13)(param_1), *(char *)(param_1 + 3) == '\x06')) {
        return 0;
      }
    }
  }
  else if (uVar5 <= uVar4) goto LAB_008b4928;
  uVar15 = lVar14 - lVar16;
  puVar17 = (undefined8 *)(*(long *)(param_1 + 0x58) + param_4);
  FUN_008b4fa4(param_1,puVar17);
  if (iVar6 - 2U < 2) {
    uVar11 = *(undefined8 *)(*(long *)(param_1 + 0x68) + -0x10);
    puVar17[1] = *(undefined8 *)(*(long *)(param_1 + 0x68) + -8);
    *puVar17 = uVar11;
  }
  else {
    if (iVar6 == 5) {
      pcVar10 = "error in error handling";
      uVar11 = 0x17;
    }
    else {
      if (iVar6 != 4) goto LAB_008b49c8;
      pcVar10 = "not enough memory";
      uVar11 = 0x11;
    }
    uVar11 = FUN_008b9ff8(param_1,pcVar10,uVar11);
    *puVar17 = uVar11;
    *(undefined4 *)((long)puVar17 + 0xc) = 5;
  }
LAB_008b49c8:
  lVar16 = *(long *)(param_1 + 0x20);
  lVar14 = lVar16 + uVar15;
  *(long *)(param_1 + 0x50) = lVar14;
  uVar11 = *(undefined8 *)(lVar14 + 0x10);
  *(undefined8 **)(param_1 + 0x68) = puVar17 + 2;
  *(undefined8 *)(param_1 + 0x70) = uVar11;
  if ((20000 < (int)*(uint *)(param_1 + 0x44)) && ((int)(uVar15 >> 4) * -0x55555555 < 19999)) {
    lVar14 = FUN_008b8498(param_1,lVar16,(ulong)*(uint *)(param_1 + 0x44) * 0x30,960000,
                          *(undefined1 *)(param_1 + 1));
    *(undefined4 *)(param_1 + 0x44) = 20000;
    *(long *)(param_1 + 0x50) = lVar14 + (*(long *)(param_1 + 0x50) - lVar16);
    *(long *)(param_1 + 0x18) = lVar14 + 0xea5d0;
    *(long *)(param_1 + 0x20) = lVar14;
  }
  return iVar8;
}

