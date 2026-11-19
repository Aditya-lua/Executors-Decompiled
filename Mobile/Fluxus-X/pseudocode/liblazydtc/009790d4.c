/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009790d4
 */

/* std::__ndk1::deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> > >
   >::push_back(std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >&&) */

void __thiscall
std::__ndk1::
deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
::push_back(deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
            *this,pair *param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  pair *ppVar5;
  undefined8 uVar6;
  
  lVar3 = *(long *)(this + 8);
  uVar2 = 0;
  if (*(long *)(this + 0x10) - lVar3 != 0) {
    uVar2 = (*(long *)(this + 0x10) - lVar3) * 8 - 1;
  }
  uVar4 = *(long *)(this + 0x28) + *(long *)(this + 0x20);
  if (uVar2 == uVar4) {
    __add_back_capacity(this);
    lVar3 = *(long *)(this + 8);
    uVar4 = *(long *)(this + 0x20) + *(long *)(this + 0x28);
  }
  uVar6 = *(undefined8 *)param_1;
  puVar1 = (undefined8 *)
           (*(long *)(lVar3 + (uVar4 >> 3 & 0x1ffffffffffffff8)) + (uVar4 & 0x3f) * 0x40);
  puVar1[1] = *(undefined8 *)(param_1 + 8);
  *puVar1 = uVar6;
  ppVar5 = *(pair **)(param_1 + 0x30);
  *(undefined8 *)param_1 = 0;
  *(undefined8 *)(param_1 + 8) = 0;
  if (ppVar5 == (pair *)0x0) {
    puVar1[6] = 0;
  }
  else if (param_1 + 0x10 == ppVar5) {
    puVar1[6] = puVar1 + 2;
                    /* try { // try from 0097917c to 0097917f has its CatchHandler @ 00979198 */
    (**(code **)(**(long **)(param_1 + 0x30) + 0x18))();
  }
  else {
    puVar1[6] = ppVar5;
    *(undefined8 *)(param_1 + 0x30) = 0;
  }
  *(long *)(this + 0x28) = *(long *)(this + 0x28) + 1;
  return;
}

