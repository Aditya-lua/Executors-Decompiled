
ulong FUN_0078b30c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  long lVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  undefined8 uVar8;
  uint uVar9;
  undefined8 *unaff_x19;
  char *unaff_x20;
  char *pcVar10;
  byte *unaff_x21;
  ulong uVar11;
  byte *unaff_x23;
  char *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  long unaff_x29;
  undefined1 auVar12 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined1 uStack0000000000000080;
  undefined1 auStack_60 [32];
  
code_r0x0078b30c:
  iVar2 = _strcmp("/.",unaff_x21);
  uVar9 = (uint)param_4;
  if (iVar2 != 0) {
    param_3 = 3;
    iVar2 = _strncmp("/.?",unaff_x21,3);
    uVar9 = (uint)param_4;
    if (iVar2 != 0) {
      param_3 = 4;
      iVar2 = _strncmp("/../",unaff_x21,4);
      if (iVar2 == 0) {
        unaff_x21 = unaff_x21 + 3;
        do {
          if (unaff_x20 <= unaff_x24) goto LAB_0078b420;
          unaff_x20 = unaff_x20 + -1;
          if (*unaff_x20 == '/') goto LAB_0078b420;
        } while( true );
      }
      iVar2 = _strcmp("/..",unaff_x21);
      if (iVar2 != 0) {
        param_3 = 4;
        iVar2 = _strncmp("/..?",unaff_x21,4);
        pcVar10 = unaff_x20;
        if (iVar2 != 0) {
LAB_0078b404:
          do {
            unaff_x20 = pcVar10 + 1;
            *pcVar10 = (char)unaff_x27;
            unaff_x21 = unaff_x21 + 1;
            unaff_x27 = (ulong)*unaff_x21;
            pcVar10 = unaff_x20;
          } while (0x3f < *unaff_x21 || (unaff_x25 << (unaff_x27 & 0x3f) & unaff_x26) == 0);
LAB_0078b420:
          *unaff_x20 = '\0';
          do {
            while( true ) {
              uVar9 = (uint)param_4;
              if (unaff_x23 <= unaff_x21) goto LAB_0078b478;
              bVar1 = *unaff_x21;
              unaff_x27 = (ulong)bVar1;
              if (bVar1 == 0x2e) break;
              pcVar10 = unaff_x20;
              if (bVar1 != 0x2f) goto LAB_0078b404;
              param_3 = 3;
              iVar2 = _strncmp();
              if (iVar2 != 0) goto code_r0x0078b30c;
code_r0x0078b2d8:
              unaff_x21 = unaff_x21 + 2;
            }
            param_3 = 2;
            iVar2 = _strncmp();
            if (iVar2 == 0) goto code_r0x0078b2d8;
            param_3 = 3;
            iVar2 = _strncmp("../",unaff_x21,3);
            if (iVar2 != 0) goto code_r0x0078b3ac;
            unaff_x21 = unaff_x21 + 3;
          } while( true );
        }
      }
      goto LAB_0078b458;
    }
  }
  goto LAB_0078b460;
code_r0x0078b3ac:
  iVar2 = _strcmp(".",unaff_x21);
  uVar9 = (uint)param_4;
  if (iVar2 != 0) {
    iVar2 = _strcmp("..",unaff_x21);
    uVar9 = (uint)param_4;
    if (iVar2 != 0) {
      param_3 = 2;
      iVar2 = _strncmp(".?",unaff_x21,2);
      uVar9 = (uint)param_4;
      if (iVar2 != 0) {
        param_3 = 3;
        iVar2 = _strncmp("..?",unaff_x21,3);
        uVar9 = (uint)param_4;
        pcVar10 = unaff_x20;
        if (iVar2 != 0) goto LAB_0078b404;
      }
    }
  }
  *unaff_x24 = '\0';
  goto LAB_0078b478;
  while (unaff_x20 = unaff_x20 + -1, *unaff_x20 != '/') {
LAB_0078b458:
    uVar9 = (uint)param_4;
    if (unaff_x20 <= unaff_x24) break;
  }
LAB_0078b460:
  *unaff_x20 = '/';
  unaff_x20[1] = '\0';
LAB_0078b478:
  (*pcRam0000000000a2b5f0)(in_stack_00000038);
  uVar3 = func_0x00740a58(&uStack0000000000000080);
  (*pcRam0000000000a2b5f0)(*unaff_x19);
  (*pcRam0000000000a2b5f0)(unaff_x19[1]);
  (*pcRam0000000000a2b5f0)(unaff_x19[2]);
  (*pcRam0000000000a2b5f0)(unaff_x19[3]);
  (*pcRam0000000000a2b5f0)(unaff_x19[4]);
  (*pcRam0000000000a2b5f0)(unaff_x19[5]);
  (*pcRam0000000000a2b5f0)(unaff_x19[6]);
  (*pcRam0000000000a2b5f0)(unaff_x19[7]);
  (*pcRam0000000000a2b5f0)(unaff_x19[8]);
  (*pcRam0000000000a2b5f0)(unaff_x19[9]);
  unaff_x19[5] = in_stack_00000028;
  unaff_x19[4] = uVar3;
  unaff_x19[7] = unaff_x24;
  unaff_x19[6] = in_stack_00000030;
  unaff_x19[9] = in_stack_00000048;
  unaff_x19[8] = in_stack_00000040;
  unaff_x19[10] = in_stack_00000050;
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
  auVar12 = ___stack_chk_fail();
  pcVar10 = auVar12._8_8_;
  puVar4 = auVar12._0_8_;
  lVar5 = _strstr(puVar4,"//");
  puVar7 = puVar4;
  if (lVar5 != 0) {
    puVar7 = (undefined1 *)(lVar5 + 2);
  }
  if (*pcVar10 == '#') {
    puVar7 = (undefined1 *)_strchr(puVar7,0x23);
joined_r0x0078b5d8:
    if (puVar7 != (undefined1 *)0x0) {
      *puVar7 = 0;
    }
  }
  else {
    if (*pcVar10 == '/') {
      if (pcVar10[1] == '/') {
        uVar3 = 0;
        *puVar7 = 0;
        pcVar10 = pcVar10 + 2;
        goto LAB_0078b640;
      }
      puVar7 = (undefined1 *)_strchr(puVar7,0x2f);
      goto joined_r0x0078b5d8;
    }
    puVar6 = (undefined1 *)_strchr(puVar7,0x3f);
    if ((puVar6 != (undefined1 *)0x0) ||
       (puVar6 = (undefined1 *)_strchr(puVar7,0x23), puVar6 != (undefined1 *)0x0)) {
      *puVar6 = 0;
    }
    if ((*pcVar10 != '?') && (lVar5 = _strrchr(puVar7,0x2f), lVar5 != 0)) {
      *(undefined1 *)(lVar5 + 1) = 0;
    }
  }
  uVar3 = 1;
LAB_0078b640:
  func_0x0074066c(auStack_60,&UNK_007a1200);
  iVar2 = func_0x007408a0(auStack_60,puVar4);
  if (iVar2 == 0) {
    uVar8 = _strlen(pcVar10);
    uVar11 = func_0x00789f10(auStack_60,pcVar10,uVar8,uVar3,0);
    if ((int)uVar11 == 0) {
      uVar3 = func_0x00740a58(auStack_60);
      uVar11 = func_0x0078aa74(uVar3,param_3,uVar9 & 0xffffffef);
    }
    func_0x00740678(auStack_60);
  }
  else {
    uVar9 = 0x1f;
    if (iVar2 != 100) {
      uVar9 = 7;
    }
    uVar11 = (ulong)uVar9;
  }
  return uVar11;
}

