
undefined8 FUN_00146d88(void)

{
  undefined2 *puVar1;
  char *pcVar2;
  long unaff_x22;
  
  if (cRam0000000000a396b7 < '\0') {
    uRam0000000000a396a8 = 2;
    puVar1 = (undefined2 *)
             CONCAT53(uRam0000000000a396a3,CONCAT12(uRam0000000000a396a2,uRam0000000000a396a0));
    *puVar1 = 0x2a2f;
    *(undefined1 *)(puVar1 + 1) = 0;
  }
  else {
    cRam0000000000a396b7 = '\x02';
    uRam0000000000a396a0 = 0x2a2f;
    uRam0000000000a396a2 = 0;
  }
  if (cRam0000000000a396cf < '\0') {
    uRam0000000000a396c0 = 2;
    puVar1 = (undefined2 *)
             CONCAT53(uRam0000000000a396bb,CONCAT12(uRam0000000000a396ba,uRam0000000000a396b8));
    *puVar1 = 0x2f2a;
    *(undefined1 *)(puVar1 + 1) = 0;
  }
  else {
    cRam0000000000a396cf = '\x02';
    uRam0000000000a396b8 = 0x2f2a;
    uRam0000000000a396ba = 0;
  }
  if (cRam0000000000a396e7 < '\0') {
    uRam0000000000a396d8 = 2;
    puVar1 = puRam0000000000a396d0;
  }
  else {
    puVar1 = (undefined2 *)0xa396d0;
    cRam0000000000a396e7 = '\x02';
  }
  *puVar1 = 0x2f2f;
  *(undefined1 *)(puVar1 + 1) = 0;
  uRam0000000000a39710 = 1;
  uRam0000000000a396e9 = 1;
  if (cRam0000000000a39627 < '\0') {
    uRam0000000000a39618 = 0xb;
    pcVar2 = pcRam0000000000a39610;
  }
  else {
    cRam0000000000a39627 = '\v';
    pcVar2 = (char *)0xa39610;
  }
  pcVar2[7] = 'r';
  pcVar2[8] = 'i';
  pcVar2[9] = 'p';
  pcVar2[10] = 't';
  *(undefined8 *)pcVar2 = s_AngelScript_008da2ba._0_8_;
  pcVar2[0xb] = '\0';
  *(undefined1 *)(unaff_x22 + 0xad) = 1;
  return 0xa39610;
}

