/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b6448
 */

void FUN_008b6448(undefined8 param_1,byte *param_2)

{
  byte bVar1;
  
  bVar1 = *param_2;
  if (bVar1 < 9) {
    if (bVar1 < 6) {
      if (bVar1 == 4) {
        FUN_008be438();
        return;
      }
      if (bVar1 == 5) {
        FUN_008ba3ec();
        return;
      }
    }
    else {
      if (bVar1 == 6) {
        FUN_008bb074();
        return;
      }
      if (bVar1 == 7) {
        FUN_008b519c();
        return;
      }
      if (bVar1 == 8) {
        FUN_008be320();
        return;
      }
    }
  }
  else if (bVar1 < 0xc) {
    if (bVar1 == 9) {
      FUN_008b9a9c();
      return;
    }
    if (bVar1 == 10) {
      FUN_008af3b4();
      return;
    }
    if (bVar1 == 0xb) {
      FUN_008b33d8();
      return;
    }
  }
  else {
    if (bVar1 == 0xc) {
      FUN_008b345c();
      return;
    }
    if (bVar1 == 0xf) {
      FUN_008b4f94();
      return;
    }
    if (bVar1 == 0xe) {
      FUN_008b504c();
      return;
    }
  }
  return;
}

