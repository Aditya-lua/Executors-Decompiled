
/* WARNING: Removing unreachable block (ram,0x0074087c) */

undefined8 FUN_00757f9c(void)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  long *unaff_x19;
  ulong uVar7;
  long lVar8;
  
  uVar4 = func_0x00741160();
  if ((int)uVar4 != 0) {
    return uVar4;
  }
  lVar8 = unaff_x19[1];
  uVar1 = lVar8 + 3;
  uVar6 = unaff_x19[3];
  if (uVar6 < uVar1) {
    (*pcRam0000000000a2b5f0)(*unaff_x19);
    *unaff_x19 = 0;
    unaff_x19[1] = 0;
    uVar4 = 100;
  }
  else {
    uVar5 = unaff_x19[2];
    if (uVar5 == 0) {
      if (uVar1 < 0x21) {
        uVar1 = 0x20;
      }
      uVar7 = uVar6;
      if (0x1f < uVar6) {
        uVar7 = uVar1;
      }
      lVar3 = *unaff_x19;
      if (uVar7 == 0) goto code_r0x00740800;
    }
    else {
      uVar2 = uVar5;
      do {
        uVar7 = uVar2;
        uVar2 = uVar7 << 1;
      } while (uVar7 < uVar1);
      if (uVar6 <= uVar7) {
        uVar7 = uVar6;
      }
      lVar3 = *unaff_x19;
      if (uVar7 == uVar5) goto code_r0x00740800;
    }
    lVar3 = (*pcRam0000000000a2b5f8)(lVar3,uVar7);
    if (lVar3 != 0) {
      *unaff_x19 = lVar3;
      unaff_x19[2] = uVar7;
code_r0x00740800:
      _memcpy(lVar3 + lVar8,"\r\n",2);
      unaff_x19[1] = lVar8 + 2;
      *(undefined1 *)(*unaff_x19 + lVar8 + 2) = 0;
      return 0;
    }
    (*pcRam0000000000a2b5f0)(*unaff_x19);
    *unaff_x19 = 0;
    unaff_x19[1] = 0;
    uVar4 = 0x1b;
  }
  unaff_x19[2] = 0;
  return uVar4;
}

