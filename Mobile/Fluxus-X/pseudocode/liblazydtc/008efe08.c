/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efe08
 */

/* cpr::Session::PrepareGet() */

void __thiscall cpr::Session::PrepareGet(Session *this)

{
  Session SVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined *puVar4;
  
  SVar1 = this[0x10];
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  uVar2 = **(undefined8 **)(this + 0x18);
  if (SVar1 == (Session)0x0) {
    curl_easy_setopt(uVar2,0x2734,0);
    uVar3 = 0x50;
    puVar4 = (undefined *)0x1;
    uVar2 = **(undefined8 **)(this + 0x18);
  }
  else {
    puVar4 = &DAT_002d7152;
    uVar3 = 0x2734;
  }
  curl_easy_setopt(uVar2,uVar3,puVar4);
  prepareCommon();
  return;
}

