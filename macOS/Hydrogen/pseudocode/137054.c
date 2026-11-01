
undefined8 FUN_00137054(void)

{
  int in_w8;
  undefined2 *puVar1;
  undefined4 *puVar2;
  long unaff_x22;
  
  if (in_w8 < 0) {
    uRam0000000000a39288 = 2;
    puVar1 = (undefined2 *)
             CONCAT53(uRam0000000000a39283,CONCAT12(uRam0000000000a39282,uRam0000000000a39280));
    *puVar1 = 0x2a2f;
    *(undefined1 *)(puVar1 + 1) = 0;
  }
  else {
    uRam0000000000a39297 = 2;
    uRam0000000000a39280 = 0x2a2f;
    uRam0000000000a39282 = 0;
  }
  if (cRam0000000000a392af < '\0') {
    uRam0000000000a392a0 = 2;
    puVar1 = (undefined2 *)
             CONCAT53(uRam0000000000a3929b,CONCAT12(uRam0000000000a3929a,uRam0000000000a39298));
    *puVar1 = 0x2f2a;
    *(undefined1 *)(puVar1 + 1) = 0;
  }
  else {
    cRam0000000000a392af = '\x02';
    uRam0000000000a39298 = 0x2f2a;
    uRam0000000000a3929a = 0;
  }
  if (cRam0000000000a392c7 < '\0') {
    uRam0000000000a392b8 = 2;
    puVar1 = puRam0000000000a392b0;
  }
  else {
    puVar1 = (undefined2 *)0xa392b0;
    cRam0000000000a392c7 = '\x02';
  }
  *puVar1 = 0x2f2f;
  *(undefined1 *)(puVar1 + 1) = 0;
  uRam0000000000a392f0 = 1;
  uRam0000000000a392c9 = 1;
  if (cRam0000000000a39207 < '\0') {
    uRam0000000000a391f8 = 4;
    puVar2 = puRam0000000000a391f0;
  }
  else {
    cRam0000000000a39207 = '\x04';
    puVar2 = (undefined4 *)0xa391f0;
  }
  *puVar2 = 0x4c534c48;
  *(undefined1 *)(puVar2 + 1) = 0;
  *(undefined1 *)(unaff_x22 + 0xa9) = 1;
  return 0xa391f0;
}

