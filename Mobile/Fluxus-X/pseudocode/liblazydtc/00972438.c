/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00972438
 */

/* WARNING: Type propagation algorithm not settling */
/* ix::HttpClient::~HttpClient() */

void __thiscall ix::HttpClient::~HttpClient(HttpClient *this)

{
  undefined8 *puVar1;
  long lVar2;
  HttpClient HVar3;
  long *plVar4;
  void *pvVar5;
  thread *this_00;
  undefined8 *puVar7;
  undefined8 *puVar6;
  
  this_00 = (thread *)(this + 0x98);
  if (*(long *)this_00 != 0) {
    this[0x90] = (HttpClient)0x1;
    std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0x60));
                    /* try { // try from 00972470 to 00972477 has its CatchHandler @ 00972598 */
    std::__ndk1::thread::join(this_00);
  }
  if (((byte)this[0x138] & 1) == 0) {
    HVar3 = this[0x118];
  }
  else {
    operator_delete(*(void **)(this + 0x148));
    HVar3 = this[0x118];
  }
  if (((byte)HVar3 & 1) == 0) {
    HVar3 = this[0x100];
  }
  else {
    operator_delete(*(void **)(this + 0x128));
    HVar3 = this[0x100];
  }
  if (((byte)HVar3 & 1) == 0) {
    HVar3 = this[0xe8];
  }
  else {
    operator_delete(*(void **)(this + 0x110));
    HVar3 = this[0xe8];
  }
  if (((byte)HVar3 & 1) == 0) {
    HVar3 = this[0xd0];
  }
  else {
    operator_delete(*(void **)(this + 0xf8));
    HVar3 = this[0xd0];
  }
  if (((byte)HVar3 & 1) != 0) {
    operator_delete(*(void **)(this + 0xe0));
  }
  std::__ndk1::recursive_mutex::~recursive_mutex((recursive_mutex *)(this + 0xa8));
  plVar4 = *(long **)(this + 0xa0);
  *(undefined8 *)(this + 0xa0) = 0;
  if (plVar4 != (long *)0x0) {
    (**(code **)(*plVar4 + 8))();
  }
  std::__ndk1::thread::~thread(this_00);
  std::__ndk1::condition_variable::~condition_variable((condition_variable *)(this + 0x60));
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x38));
  std::__ndk1::
  __deque_base<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
  ::clear((__deque_base<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
           *)(this + 8));
  puVar1 = *(undefined8 **)(this + 0x18);
  puVar6 = *(undefined8 **)(this + 0x10);
  if (*(undefined8 **)(this + 0x10) != puVar1) {
    do {
      puVar7 = puVar6 + 1;
      operator_delete((void *)*puVar6);
      puVar6 = puVar7;
    } while (puVar1 != puVar7);
    lVar2 = *(long *)(this + 0x18);
    if (lVar2 != *(long *)(this + 0x10)) {
      *(ulong *)(this + 0x18) =
           lVar2 + (~((lVar2 + -8) - *(long *)(this + 0x10)) & 0xfffffffffffffff8U);
    }
  }
  pvVar5 = *(void **)(this + 8);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar5);
  return;
}

