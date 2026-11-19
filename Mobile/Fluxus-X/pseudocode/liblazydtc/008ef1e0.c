/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef1e0
 */

/* cpr::Session::SetHttpVersion(cpr::HttpVersion const&) */

void __thiscall cpr::Session::SetHttpVersion(Session *this,HttpVersion *param_1)

{
  logic_error *this_00;
  undefined8 uVar1;
  undefined8 *puVar2;
  
  switch(*(undefined4 *)param_1) {
  case 0:
    puVar2 = *(undefined8 **)(this + 0x18);
    uVar1 = 0;
    break;
  case 1:
    puVar2 = *(undefined8 **)(this + 0x18);
    uVar1 = 1;
    break;
  case 2:
    puVar2 = *(undefined8 **)(this + 0x18);
    uVar1 = 2;
    break;
  case 3:
    puVar2 = *(undefined8 **)(this + 0x18);
    uVar1 = 3;
    break;
  case 4:
    puVar2 = *(undefined8 **)(this + 0x18);
    uVar1 = 4;
    break;
  case 5:
    puVar2 = *(undefined8 **)(this + 0x18);
    uVar1 = 5;
    break;
  case 6:
    puVar2 = *(undefined8 **)(this + 0x18);
    uVar1 = 0x1e;
    break;
  default:
    this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008ef294 to 008ef29f has its CatchHandler @ 008ef2c8 */
    std::logic_error::logic_error(this_00,"Invalid/Unknown HTTP version type.");
    *(undefined ***)this_00 = &PTR__domain_error_00cb05f0;
                    /* WARNING: Subroutine does not return */
    __cxa_throw(this_00,&std::invalid_argument::typeinfo,std::domain_error::~domain_error);
  }
  curl_easy_setopt(*puVar2,0x54,uVar1);
  return;
}

