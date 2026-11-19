/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc27bc
 */

/* std::__ndk1::__next_prime(unsigned long) */

ulong std::__ndk1::__next_prime(ulong param_1)

{
  uint *puVar1;
  uint *puVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  if (param_1 < 0xd4) {
    uVar3 = 0x30;
    puVar2 = &DAT_00789bec;
    do {
      uVar4 = uVar3 >> 1;
      puVar1 = puVar2 + uVar4 + 1;
      uVar3 = uVar3 + ~uVar4;
      if (param_1 <= puVar2[uVar4]) {
        puVar1 = puVar2;
        uVar3 = uVar4;
      }
      puVar2 = puVar1;
    } while (uVar3 != 0);
    return (ulong)*puVar1;
  }
  if (0xffffffffffffffc5 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc2edc("__next_prime overflow");
  }
  uVar4 = 0x30;
  uVar3 = param_1 / 0xd2;
  puVar2 = &DAT_00789cac;
  do {
    uVar7 = uVar4 >> 1;
    puVar1 = puVar2 + uVar7 + 1;
    uVar4 = uVar4 + ~uVar7;
    if (param_1 % 0xd2 <= (ulong)puVar2[uVar7]) {
      puVar1 = puVar2;
      uVar4 = uVar7;
    }
    puVar2 = puVar1;
  } while (uVar4 != 0);
  lVar5 = (long)(puVar1 + -0x1e272b) >> 2;
  do {
    uVar4 = uVar3 * 0xd2 + (ulong)(uint)(&DAT_00789cac)[lVar5];
    lVar6 = 0x14;
    do {
      uVar8 = (ulong)*(uint *)((long)&DAT_00789bec + lVar6);
      uVar7 = 0;
      if (uVar8 != 0) {
        uVar7 = uVar4 / uVar8;
      }
      if (uVar7 < uVar8) {
        return uVar4;
      }
      if (uVar4 == uVar7 * uVar8) goto LAB_00bc2eb8;
      lVar6 = lVar6 + 4;
    } while (lVar6 != 0xbc);
    uVar7 = 0x1a3;
    do {
      uVar9 = uVar7 - 0xd0;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar9) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xc6;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xc6) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xc4;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xc4) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xc0;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xc0) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xbe;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xbe) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xba;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xba) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xb4;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xb4) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xb2;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xb2) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xac;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xac) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xa8;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xa8) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xa6;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xa6) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xa2;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xa2) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x9c;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x9c) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x96;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x96) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x94;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x94) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x8e;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x8e) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x8a;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x8a) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x88;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x88) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x82;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x82) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x7e;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x7e) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x78;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x78) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x70;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x70) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x6c;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x6c) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x6a;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x6a) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x66;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x66) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 100;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 100) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x60;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x60) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x58;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x58) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x52;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x52) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x4e;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x4e) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x48;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x48) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x46;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x46) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x42;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x42) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x3c;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x3c) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x3a;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x3a) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x34;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x34) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x2e;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x2e) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x2a;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x2a) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x28;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x28) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x24;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x24) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x1e;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x1e) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x1c;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x1c) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x16;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x16) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x12;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x12) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0x10;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0x10) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 0xc;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 0xc) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar9 = uVar7 - 10;
      uVar8 = 0;
      if (uVar9 != 0) {
        uVar8 = uVar4 / uVar9;
      }
      if (uVar8 < uVar7 - 10) {
        return uVar4;
      }
      if (uVar4 == uVar8 * uVar9) break;
      uVar8 = 0;
      if (uVar7 != 0) {
        uVar8 = uVar4 / uVar7;
      }
      if (uVar8 < uVar7) {
        return uVar4;
      }
      uVar8 = uVar8 * uVar7;
      uVar7 = uVar7 + 0xd2;
    } while (uVar4 != uVar8);
LAB_00bc2eb8:
    if (lVar5 == 0x2f) {
      uVar3 = uVar3 + 1;
    }
    lVar6 = 0;
    if (lVar5 != 0x2f) {
      lVar6 = lVar5 + 1;
    }
    lVar5 = lVar6;
  } while( true );
}

