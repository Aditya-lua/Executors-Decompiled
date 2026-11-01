
undefined8 FUN_0073d61c(void)

{
  int iVar1;
  char *pcVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  char *unaff_x25;
  undefined4 unaff_w26;
  undefined4 unaff_w27;
  long unaff_x28;
  undefined8 in_stack_00000000;
  
  do {
    iVar1 = func_0x0077e6f8(unaff_x25,"protocol");
    if (iVar1 != 0) {
      *(undefined4 *)((long)unaff_x19 + 0xc) = unaff_w27;
      *(undefined4 *)((long)unaff_x21 + 0xc) = unaff_w27;
      *(undefined4 *)(unaff_x28 + 0x570) = unaff_w27;
      *(undefined4 *)(unaff_x22 + 0x580) = unaff_w27;
      goto LAB_0073d5d8;
    }
    iVar1 = func_0x0077e6f8(unaff_x25,"network");
    if (iVar1 == 0) {
      iVar1 = func_0x0077e6f8(unaff_x25,"proxy");
      if (iVar1 == 0) {
        iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b278);
        puVar3 = (undefined8 *)0xa2b278;
        if (iVar1 == 0) {
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b2f0);
          puVar3 = (undefined8 *)0xa2b2f0;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b368);
          puVar3 = (undefined8 *)0xa2b368;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b3e0);
          puVar3 = (undefined8 *)0xa2b3e0;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b458);
          puVar3 = (undefined8 *)0xa2b458;
          if ((iVar1 != 0) ||
             (iVar1 = func_0x0077e6f8(unaff_x25,*unaff_x19), puVar3 = unaff_x19, iVar1 != 0))
          goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b7f0);
          puVar3 = (undefined8 *)0xa2b7f0;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b868);
          puVar3 = (undefined8 *)0xa2b868;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b110);
          puVar3 = (undefined8 *)0xa2b110;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b610);
          puVar3 = (undefined8 *)0xa2b610;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b188);
          puVar3 = (undefined8 *)0xa2b188;
          if (iVar1 != 0) goto LAB_0073d894;
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b688);
          puVar3 = (undefined8 *)0xa2b688;
          if ((iVar1 != 0) ||
             (iVar1 = func_0x0077e6f8(unaff_x25,*unaff_x21), puVar3 = unaff_x21, iVar1 != 0))
          goto LAB_0073d894;
        }
        else {
LAB_0073d894:
          *(undefined4 *)((long)puVar3 + 0xc) = unaff_w27;
        }
        iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b548);
        lVar4 = 0xa2b548;
        if (iVar1 == 0) {
          iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b558);
          lVar4 = 0xa2b558;
          if (iVar1 == 0) {
            iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b568);
            lVar4 = 0xa2b568;
            if (iVar1 == 0) {
              iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b5d8);
              lVar4 = 0xa2b5d8;
              if (iVar1 == 0) {
                iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b578);
                lVar4 = 0xa2b578;
                if (iVar1 == 0) {
                  iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b588);
                  lVar4 = 0xa2b588;
                  if (iVar1 == 0) {
                    iVar1 = func_0x0077e6f8(unaff_x25,uRam0000000000a2b598);
                    lVar4 = 0xa2b598;
                    if (iVar1 == 0) goto LAB_0073d5dc;
                  }
                }
              }
            }
          }
        }
        *(undefined4 *)(lVar4 + 8) = unaff_w27;
      }
      else {
        uRam0000000000a2b11c = unaff_w27;
        uRam0000000000a2b194 = unaff_w27;
        uRam0000000000a2b61c = unaff_w27;
        uRam0000000000a2b694 = unaff_w27;
        uRam0000000000a2b874 = unaff_w27;
      }
    }
    else {
      uRam0000000000a2b284 = unaff_w27;
      uRam0000000000a2b2fc = unaff_w27;
      uRam0000000000a2b374 = unaff_w27;
      uRam0000000000a2b3ec = unaff_w27;
      uRam0000000000a2b464 = unaff_w27;
      uRam0000000000a2b590 = unaff_w27;
      uRam0000000000a2b5e0 = unaff_w27;
      uRam0000000000a2b7fc = unaff_w27;
    }
LAB_0073d5dc:
    while( true ) {
      pcVar2 = (char *)_strtok_r(0);
      if (pcVar2 == (char *)0x0) {
        (*pcRam0000000000a2b5f0)(in_stack_00000000);
        return 0;
      }
      unaff_x25 = pcVar2;
      unaff_w27 = unaff_w26;
      if (*pcVar2 == '-') {
        unaff_w27 = 0;
        unaff_x25 = pcVar2 + 1;
      }
      if (*pcVar2 == '+') {
        unaff_x25 = pcVar2 + 1;
        unaff_w27 = unaff_w26;
      }
      else {
      }
      iVar1 = func_0x0077e6f8(unaff_x25);
      if (iVar1 == 0) break;
      uRam0000000000a2b284 = unaff_w27;
      uRam0000000000a2b2fc = unaff_w27;
      uRam0000000000a2b374 = unaff_w27;
      uRam0000000000a2b3ec = unaff_w27;
      uRam0000000000a2b464 = unaff_w27;
      *(undefined4 *)((long)unaff_x19 + 0xc) = unaff_w27;
      uRam0000000000a2b11c = unaff_w27;
      uRam0000000000a2b194 = unaff_w27;
      uRam0000000000a2b61c = unaff_w27;
      uRam0000000000a2b694 = unaff_w27;
      uRam0000000000a2b7fc = unaff_w27;
      uRam0000000000a2b874 = unaff_w27;
      *(undefined4 *)((long)unaff_x21 + 0xc) = unaff_w27;
      uRam0000000000a2b550 = unaff_w27;
      uRam0000000000a2b560 = unaff_w27;
      *(undefined4 *)(unaff_x28 + 0x570) = unaff_w27;
      uRam0000000000a2b5e0 = unaff_w27;
      *(undefined4 *)(unaff_x22 + 0x580) = unaff_w27;
      uRam0000000000a2b590 = unaff_w27;
LAB_0073d5d8:
      *(undefined4 *)(unaff_x23 + 0x5a0) = unaff_w27;
    }
  } while( true );
}

