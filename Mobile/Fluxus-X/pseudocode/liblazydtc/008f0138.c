/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f0138
 */

/* cpr::Session::PreparePost() */

void __thiscall cpr::Session::PreparePost(Session *this)

{
  undefined1 *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  uVar2 = **(undefined8 **)(this + 0x18);
  if (this[0x10] == (Session)0x0) {
    puVar1 = &DAT_002ab32c;
    if (*(long *)(this + 0x110) != 0) {
      puVar1 = (undefined1 *)0x0;
    }
    curl_easy_setopt(uVar2,0x271f,puVar1);
    puVar3 = &DAT_002c8cc3;
    uVar2 = **(undefined8 **)(this + 0x18);
  }
  else {
    puVar3 = (undefined *)0x0;
  }
  curl_easy_setopt(uVar2,0x2734,puVar3);
  prepareCommon();
  return;
}

