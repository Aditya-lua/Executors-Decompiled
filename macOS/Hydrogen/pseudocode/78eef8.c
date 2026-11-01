
void FUN_0078eef8(void)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  char *pcVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  long *unaff_x19;
  undefined8 *unaff_x23;
  char *unaff_x24;
  long unaff_x25;
  bool bVar8;
  long unaff_x29;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined1 auStack_7ffffffe [2147483622];
  
  (*(code *)*unaff_x23)(unaff_x19[1]);
  unaff_x19[1] = 0;
  (*(code *)*unaff_x23)(unaff_x19[2]);
  unaff_x19[2] = 0;
  (*(code *)*unaff_x23)(unaff_x19[3]);
  unaff_x19[3] = 0;
  (*(code *)*unaff_x23)(unaff_x19[4]);
  unaff_x19[4] = 0;
  (*(code *)*unaff_x23)(unaff_x19[5]);
  bVar8 = false;
  bVar2 = false;
  unaff_x19[5] = 0;
  *(undefined4 *)(unaff_x19 + 6) = 0;
  *(undefined1 *)((long)unaff_x19 + 0x34) = 0;
  *(byte *)((long)unaff_x19 + 0x35) = *(byte *)((long)unaff_x19 + 0x35) & 0xfc;
  if (*unaff_x24 == ' ' || *unaff_x24 == '\t') goto LAB_0078f020;
  while( true ) {
    uStack0000000000000018 = unaff_x24;
    iVar3 = func_0x0078e1ac(unaff_x24,auStack_7ffffffe + 0x8000041e,&uStack0000000000000020,
                            &uStack0000000000000018);
    if (iVar3 == 0) break;
    iVar3 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"nonce");
    if (iVar3 != 0) {
      (*(code *)*unaff_x23)(*unaff_x19);
      lVar4 = (*pcRam0000000000a2b600)(&uStack0000000000000020);
      *unaff_x19 = lVar4;
      goto joined_r0x0078f1d8;
    }
    iVar3 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"stale");
    if (iVar3 != 0) {
      iVar3 = func_0x0077e6f8(&uStack0000000000000020,"true");
      if (iVar3 != 0) {
        *(byte *)((long)unaff_x19 + 0x35) = *(byte *)((long)unaff_x19 + 0x35) | 1;
        *(undefined4 *)(unaff_x19 + 6) = 1;
      }
      goto code_r0x0078efe0;
    }
    iVar3 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"realm");
    if (iVar3 == 0) {
      iVar3 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"opaque");
      if (iVar3 != 0) {
        (*(code *)*unaff_x23)(unaff_x19[3]);
        lVar4 = (*pcRam0000000000a2b600)(&uStack0000000000000020);
        unaff_x19[3] = lVar4;
        goto joined_r0x0078f0d8;
      }
      iVar3 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"qop");
      if (iVar3 != 0) {
        uStack0000000000000010 = 0;
        lVar4 = (*pcRam0000000000a2b600)(&uStack0000000000000020);
        if (lVar4 != 0) {
          pcVar5 = (char *)_strtok_r(lVar4,",",&uStack0000000000000010);
          if (pcVar5 != (char *)0x0) {
            do {
              while( true ) {
                for (; *pcVar5 == ' ' || *pcVar5 == '\t'; pcVar5 = pcVar5 + 1) {
                }
                iVar3 = func_0x0077e6f8(pcVar5,"auth");
                if (iVar3 == 0) break;
                bVar8 = true;
                pcVar5 = (char *)_strtok_r(0,",",&uStack0000000000000010);
                if (pcVar5 == (char *)0x0) goto code_r0x0078f1a4;
              }
              iVar3 = func_0x0077e6f8(pcVar5,"auth-int");
              bVar2 = (bool)(iVar3 != 0 | bVar2);
              pcVar5 = (char *)_strtok_r(0,",",&uStack0000000000000010);
            } while (pcVar5 != (char *)0x0);
          }
code_r0x0078f1a4:
          (*(code *)*unaff_x23)(lVar4);
          if (bVar8) {
            (*(code *)*unaff_x23)(unaff_x19[4]);
            lVar4 = (*pcRam0000000000a2b600)("auth");
            unaff_x19[4] = lVar4;
          }
          else {
            if (!bVar2) goto code_r0x0078efe0;
            (*(code *)*unaff_x23)(unaff_x19[4]);
            lVar4 = (*pcRam0000000000a2b600)("auth-int");
            unaff_x19[4] = lVar4;
          }
joined_r0x0078f1d8:
          if (lVar4 != 0) goto code_r0x0078efe0;
        }
        goto LAB_0078f37c;
      }
      iVar3 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"algorithm");
      if (iVar3 == 0) {
        iVar3 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"userhash");
        if ((iVar3 != 0) && (iVar3 = func_0x0077e6f8(&uStack0000000000000020,"true"), iVar3 != 0)) {
          *(byte *)((long)unaff_x19 + 0x35) = *(byte *)((long)unaff_x19 + 0x35) | 2;
        }
      }
      else {
        (*(code *)*unaff_x23)(unaff_x19[5]);
        lVar4 = (*pcRam0000000000a2b600)(&uStack0000000000000020);
        unaff_x19[5] = lVar4;
        if (lVar4 == 0) goto LAB_0078f37c;
        iVar3 = func_0x0077e6f8(&uStack0000000000000020,"MD5-sess");
        if (iVar3 == 0) {
          iVar3 = func_0x0077e6f8(&uStack0000000000000020,"MD5");
          if (iVar3 == 0) {
            iVar3 = func_0x0077e6f8(&uStack0000000000000020,"SHA-256");
            if (iVar3 == 0) {
              iVar3 = func_0x0077e6f8(&uStack0000000000000020,"SHA-256-SESS");
              if (iVar3 == 0) {
                iVar3 = func_0x0077e6f8(&uStack0000000000000020,"SHA-512-256");
                if (iVar3 == 0) {
                  iVar3 = func_0x0077e6f8(&uStack0000000000000020,"SHA-512-256-SESS");
                  if (iVar3 == 0) goto code_r0x0078f3b8;
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
      }
    }
    else {
      (*(code *)*unaff_x23)(unaff_x19[2]);
      lVar4 = (*pcRam0000000000a2b600)(&uStack0000000000000020);
      unaff_x19[2] = lVar4;
joined_r0x0078f0d8:
      if (lVar4 == 0) {
LAB_0078f37c:
        uVar6 = 0x1b;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return;
        }
        goto code_r0x0078f3d4;
      }
    }
code_r0x0078efe0:
    for (unaff_x24 = uStack0000000000000018; (cVar1 = *unaff_x24, cVar1 == '\t' || (cVar1 == ' '));
        unaff_x24 = unaff_x24 + 1) {
    }
    if (cVar1 == ',') {
      unaff_x24 = unaff_x24 + 1;
    }
    if (*unaff_x24 == ' ' || *unaff_x24 == '\t') {
LAB_0078f020:
      do {
        unaff_x24 = unaff_x24 + 1;
      } while (*unaff_x24 == ' ' || *unaff_x24 == '\t');
    }
  }
  if ((((unaff_x25 == 0) || ((*(byte *)((long)unaff_x19 + 0x35) & 1) != 0)) && (*unaff_x19 != 0)) &&
     ((unaff_x19[4] != 0 || ((*(byte *)((long)unaff_x19 + 0x34) & 1) == 0)))) {
    uVar6 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60))
    goto code_r0x0078f3d4;
  }
  else {
code_r0x0078f3b8:
    uVar6 = 0x3d;
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60)) {
code_r0x0078f3d4:
      puVar7 = (undefined8 *)___stack_chk_fail(uVar6);
      (*pcRam0000000000a2b5f0)(*puVar7);
      *puVar7 = 0;
      (*pcRam0000000000a2b5f0)(puVar7[1]);
      puVar7[1] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[2]);
      puVar7[2] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[3]);
      puVar7[3] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[4]);
      puVar7[4] = 0;
      (*pcRam0000000000a2b5f0)(puVar7[5]);
      puVar7[5] = 0;
      *(undefined4 *)(puVar7 + 6) = 0;
      *(undefined1 *)((long)puVar7 + 0x34) = 0;
      *(byte *)((long)puVar7 + 0x35) = *(byte *)((long)puVar7 + 0x35) & 0xfc;
      return;
    }
  }
  return;
}

