
/* WARNING: Type propagation algorithm not settling */

void FUN_0078f238(void)

{
  char cVar1;
  int iVar2;
  char *pcVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long *unaff_x19;
  byte unaff_w20;
  undefined8 *unaff_x23;
  long unaff_x25;
  undefined8 *unaff_x26;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined1 auStack_7ffffffe [2147483622];
  
code_r0x0078f238:
  if ((unaff_w20 & 1) != 0) {
    (*(code *)*unaff_x23)(unaff_x19[4]);
    lVar4 = (*(code *)*unaff_x26)("auth-int");
    unaff_x19[4] = lVar4;
    goto joined_r0x0078f25c;
  }
code_r0x0078efec:
  for (; (cVar1 = *uStack0000000000000018, cVar1 == '\t' || (cVar1 == ' '));
      uStack0000000000000018 = uStack0000000000000018 + 1) {
  }
  if (cVar1 == ',') {
    uStack0000000000000018 = uStack0000000000000018 + 1;
  }
  if (*uStack0000000000000018 == ' ' || *uStack0000000000000018 == '\t') {
    do {
      uStack0000000000000018 = uStack0000000000000018 + 1;
    } while (*uStack0000000000000018 == ' ' || *uStack0000000000000018 == '\t');
  }
  iVar2 = func_0x0078e1ac(uStack0000000000000018,auStack_7ffffffe + 0x8000041e,
                          &uStack0000000000000020,&uStack0000000000000018);
  if (iVar2 == 0) {
    if ((((unaff_x25 == 0) || ((*(byte *)((long)unaff_x19 + 0x35) & 1) != 0)) && (*unaff_x19 != 0))
       && ((unaff_x19[4] != 0 || ((*(byte *)((long)unaff_x19 + 0x34) & 1) == 0)))) {
      uVar5 = 0;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return;
      }
      goto LAB_0078f3d4;
    }
code_r0x0078f3b8:
    uVar5 = 0x3d;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return;
    }
    goto LAB_0078f3d4;
  }
  iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e);
  if (iVar2 != 0) {
    (*(code *)*unaff_x23)(*unaff_x19);
    lVar4 = (*(code *)*unaff_x26)(&uStack0000000000000020);
    *unaff_x19 = lVar4;
    goto joined_r0x0078f25c;
  }
  iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e);
  if (iVar2 != 0) {
    iVar2 = func_0x0077e6f8(&uStack0000000000000020,"true");
    if (iVar2 != 0) {
      *(byte *)((long)unaff_x19 + 0x35) = *(byte *)((long)unaff_x19 + 0x35) | 1;
      *(undefined4 *)(unaff_x19 + 6) = 1;
    }
    goto code_r0x0078efec;
  }
  iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"realm");
  if (iVar2 == 0) {
    iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"opaque");
    if (iVar2 != 0) {
      (*(code *)*unaff_x23)(unaff_x19[3]);
      lVar4 = (*(code *)*unaff_x26)(&uStack0000000000000020);
      unaff_x19[3] = lVar4;
      goto joined_r0x0078f25c;
    }
    iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"qop");
    if (iVar2 == 0) {
      iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"algorithm");
      if (iVar2 == 0) {
        iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"userhash");
        if ((iVar2 != 0) && (iVar2 = func_0x0077e6f8(&uStack0000000000000020,"true"), iVar2 != 0)) {
          *(byte *)((long)unaff_x19 + 0x35) = *(byte *)((long)unaff_x19 + 0x35) | 2;
        }
        goto code_r0x0078efec;
      }
      (*(code *)*unaff_x23)(unaff_x19[5]);
      lVar4 = (*(code *)*unaff_x26)(&uStack0000000000000020);
      unaff_x19[5] = lVar4;
      if (lVar4 != 0) {
        iVar2 = func_0x0077e6f8(&uStack0000000000000020,"MD5-sess");
        if (iVar2 == 0) {
          iVar2 = func_0x0077e6f8(&uStack0000000000000020,"MD5");
          if (iVar2 == 0) {
            iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-256");
            if (iVar2 == 0) {
              iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-256-SESS");
              if (iVar2 == 0) {
                iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-512-256");
                if (iVar2 == 0) {
                  iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-512-256-SESS");
                  if (iVar2 == 0) goto code_r0x0078f3b8;
                  *(undefined1 *)((long)unaff_x19 + 0x34) = 5;
                }
                else {
                  *(undefined1 *)((long)unaff_x19 + 0x34) = 4;
                }
              }
              else {
                *(undefined1 *)((long)unaff_x19 + 0x34) = 3;
              }
            }
            else {
              *(undefined1 *)((long)unaff_x19 + 0x34) = 2;
            }
          }
          else {
            *(undefined1 *)((long)unaff_x19 + 0x34) = 0;
          }
        }
        else {
          *(undefined1 *)((long)unaff_x19 + 0x34) = 1;
        }
        goto code_r0x0078efec;
      }
    }
    else {
      lVar4 = (*(code *)*unaff_x26)(&uStack0000000000000020);
      if (lVar4 != 0) {
        pcVar3 = (char *)_strtok_r();
        if (pcVar3 != (char *)0x0) {
          do {
            while( true ) {
              for (; *pcVar3 == ' ' || *pcVar3 == '\t'; pcVar3 = pcVar3 + 1) {
              }
              iVar2 = func_0x0077e6f8(pcVar3,"auth");
              if (iVar2 == 0) break;
              unaff_x28 = 1;
              pcVar3 = (char *)_strtok_r(0);
              if (pcVar3 == (char *)0x0) goto code_r0x0078f1a4;
            }
            iVar2 = func_0x0077e6f8(pcVar3,"auth-int");
            unaff_w20 = iVar2 != 0 | unaff_w20;
            pcVar3 = (char *)_strtok_r(0);
          } while (pcVar3 != (char *)0x0);
        }
code_r0x0078f1a4:
        (*(code *)*unaff_x23)(lVar4);
        if ((unaff_x28 & 1) != 0) {
          (*(code *)*unaff_x23)(unaff_x19[4]);
          lVar4 = (*(code *)*unaff_x26)("auth");
          unaff_x19[4] = lVar4;
          goto joined_r0x0078f25c;
        }
        goto code_r0x0078f238;
      }
    }
  }
  else {
    (*(code *)*unaff_x23)(unaff_x19[2]);
    lVar4 = (*(code *)*unaff_x26)(&uStack0000000000000020);
    unaff_x19[2] = lVar4;
joined_r0x0078f25c:
    if (lVar4 != 0) goto code_r0x0078efec;
  }
  uVar5 = 0x1b;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
LAB_0078f3d4:
  puVar6 = (undefined8 *)___stack_chk_fail(uVar5);
  (*pcRam0000000000a2b5f0)(*puVar6);
  *puVar6 = 0;
  (*pcRam0000000000a2b5f0)(puVar6[1]);
  puVar6[1] = 0;
  (*pcRam0000000000a2b5f0)(puVar6[2]);
  puVar6[2] = 0;
  (*pcRam0000000000a2b5f0)(puVar6[3]);
  puVar6[3] = 0;
  (*pcRam0000000000a2b5f0)(puVar6[4]);
  puVar6[4] = 0;
  (*pcRam0000000000a2b5f0)(puVar6[5]);
  puVar6[5] = 0;
  *(undefined4 *)(puVar6 + 6) = 0;
  *(undefined1 *)((long)puVar6 + 0x34) = 0;
  *(byte *)((long)puVar6 + 0x35) = *(byte *)((long)puVar6 + 0x35) & 0xfc;
  return;
}

