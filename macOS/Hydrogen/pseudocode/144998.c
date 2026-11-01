
undefined8 FUN_00144998(void)

{
  undefined2 *puVar1;
  undefined4 *puVar2;
  
  puVar1 = puRam0000000000a39178;
  uRam0000000000a39180 = 2;
  *puRam0000000000a39178 = 0x2a2f;
  *(undefined1 *)(puVar1 + 1) = 0;
  if (cRam0000000000a391a7 < '\0') {
    uRam0000000000a39198 = 2;
    puVar1 = (undefined2 *)
             CONCAT53(uRam0000000000a39193,CONCAT12(uRam0000000000a39192,uRam0000000000a39190));
    *puVar1 = 0x2f2a;
    *(undefined1 *)(puVar1 + 1) = 0;
  }
  else {
    cRam0000000000a391a7 = '\x02';
    uRam0000000000a39190 = 0x2f2a;
    uRam0000000000a39192 = 0;
  }
  if (cRam0000000000a391bf < '\0') {
    uRam0000000000a391b0 = 2;
    puVar1 = puRam0000000000a391a8;
  }
  else {
    cRam0000000000a391bf = '\x02';
    puVar1 = (undefined2 *)0xa391a8;
  }
  *puVar1 = 0x2f2f;
  *(undefined1 *)(puVar1 + 1) = 0;
  uRam0000000000a391e8 = 1;
  uRam0000000000a391c1 = 1;
  if (cRam0000000000a390ff < '\0') {
    uRam0000000000a390f0 = 3;
    puVar2 = puRam0000000000a390e8;
  }
  else {
    cRam0000000000a390ff = '\x03';
    puVar2 = (undefined4 *)0xa390e8;
  }
  *puVar2 = 0x2b2b43;
  uRam0000000000a390a8 = 1;
  return 0xa390e8;
}

