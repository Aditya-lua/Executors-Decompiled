
void FUN_0016cbb8(undefined8 param_1,long param_2)

{
  ushort uVar1;
  ushort uVar2;
  bool in_ZR;
  long lVar3;
  ushort *puVar4;
  ushort uVar5;
  ushort uVar6;
  undefined8 *unaff_x19;
  ushort *unaff_x20;
  long unaff_x25;
  
  if (in_ZR) {
    unaff_x25 = 0;
  }
  else {
    lVar3 = unaff_x25;
    puVar4 = (ushort *)(param_2 + 2);
    do {
      while( true ) {
        uVar2 = *unaff_x20;
        if (0x600 < uVar2) break;
        uVar5 = 5;
        if (uVar2 != 0x503) {
          uVar5 = 0xd;
        }
        uVar6 = 4;
        if (uVar2 != 0x501) {
          uVar6 = uVar5;
        }
        uVar5 = 3;
        if (uVar2 != 0x403) {
          uVar5 = uVar6;
        }
        uVar6 = 2;
        if (uVar2 != 0x401) {
          uVar6 = 0xd;
        }
        uVar1 = 1;
        if (uVar2 != 0x203) {
          uVar1 = uVar6;
        }
        uVar6 = 0;
        if (uVar2 != 0x201) {
          uVar6 = uVar1;
        }
        if (uVar2 < 0x403) {
          uVar5 = uVar6;
        }
        puVar4[-1] = uVar5;
        *puVar4 = uVar2;
        lVar3 = lVar3 + -1;
        puVar4 = puVar4 + 2;
        unaff_x20 = unaff_x20 + 1;
        if (lVar3 == 0) goto code_r0x0016cbc0;
      }
      uVar5 = 0xc;
      if (uVar2 != 0x808) {
        uVar5 = 0xd;
      }
      uVar6 = 0xb;
      if (uVar2 != 0x807) {
        uVar6 = uVar5;
      }
      uVar5 = 10;
      if (uVar2 != 0x806) {
        uVar5 = 0xd;
      }
      uVar1 = 9;
      if (uVar2 != 0x805) {
        uVar1 = uVar5;
      }
      if (uVar2 < 0x807) {
        uVar6 = uVar1;
      }
      uVar5 = 8;
      if (uVar2 != 0x804) {
        uVar5 = 0xd;
      }
      uVar1 = 7;
      if (uVar2 != 0x603) {
        uVar1 = uVar5;
      }
      uVar5 = 6;
      if (uVar2 != 0x601) {
        uVar5 = uVar1;
      }
      if (uVar2 < 0x805) {
        uVar6 = uVar5;
      }
      puVar4[-1] = uVar6;
      *puVar4 = uVar2;
      lVar3 = lVar3 + -1;
      puVar4 = puVar4 + 2;
      unaff_x20 = unaff_x20 + 1;
    } while (lVar3 != 0);
  }
code_r0x0016cbc0:
  *unaff_x19 = param_1;
  unaff_x19[1] = param_2;
  unaff_x19[2] = unaff_x25;
  return;
}

