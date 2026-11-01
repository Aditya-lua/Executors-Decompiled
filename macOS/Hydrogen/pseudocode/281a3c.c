
/* WARNING: Removing unreachable block (ram,0x00281778) */

undefined8 FUN_00281a3c(void)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  long *unaff_x19;
  ulong unaff_x21;
  
LAB_00281a5c:
  iVar2 = func_0x0027e76c();
  if (iVar2 == 1) {
LAB_00281a80:
    bVar1 = true;
    iVar2 = func_0x0027e76c();
    if (iVar2 == 1) {
      do {
        unaff_x21 = unaff_x21 - 1;
        if (unaff_x21 < 2) {
          return 1;
        }
        uVar3 = *(ulong *)(*unaff_x19 + (ulong)((int)unaff_x21 - 2) * 8);
        if ((bVar1) || (uVar3 >> 0x3c != 0)) {
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x002817a4:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x002817e8:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x00281810:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x00281854:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x00281878:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x002818bc:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x002818e4:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x00281928:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x0028194c:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x00281990:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x002819b4:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x002819f8:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
code_r0x00281a1c:
          iVar2 = func_0x0027e76c();
          if (iVar2 != 1) {
            return 0;
          }
          goto LAB_00281a5c;
        }
        if (uVar3 >> 0x38 != 0) goto code_r0x002817a4;
        if ((uVar3 >> 0x34 & 0xf) != 0) goto code_r0x002817e8;
        if ((uVar3 >> 0x30 & 0xf) != 0) goto code_r0x00281810;
        if (((uVar3 >> 0x30 & 1) != 0) || ((uVar3 >> 0x2c & 0xf) != 0)) goto code_r0x00281854;
        if ((uVar3 >> 0x28 & 0xf) != 0) goto code_r0x00281878;
        if (((uVar3 >> 0x28 & 1) != 0) || ((uVar3 >> 0x24 & 0xf) != 0)) goto code_r0x002818bc;
        if ((uVar3 >> 0x20 & 0xf) != 0) goto code_r0x002818e4;
        if (((uVar3 >> 0x20 & 1) != 0) || ((uVar3 >> 0x1c & 0xf) != 0)) goto code_r0x00281928;
        if ((uVar3 >> 0x18 & 0xf) != 0) goto code_r0x0028194c;
        if (((uVar3 >> 0x18 & 1) != 0) || ((uVar3 >> 0x14 & 0xf) != 0)) goto code_r0x00281990;
        if ((uVar3 >> 0x10 & 0xf) != 0) goto code_r0x002819b4;
        if (((uVar3 >> 0x10 & 1) != 0) || ((uVar3 >> 0xc & 0xf) != 0)) goto code_r0x002819f8;
        if ((uVar3 >> 8 & 0xf) != 0) goto code_r0x00281a1c;
        if (((uVar3 >> 8 & 1) != 0) || ((uVar3 >> 4 & 0xf) != 0)) goto LAB_00281a5c;
        if ((uVar3 & 0xf) != 0) goto LAB_00281a80;
        bVar1 = false;
      } while( true );
    }
  }
  return 0;
}

