; std::__ndk1::__deque_base<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>::clear @ 008f354c
008f354c	stp x24,x23,[sp, #-0x40]!
008f3550	stp x22,x21,[sp, #0x10]
008f3554	stp x20,x19,[sp, #0x20]
008f3558	stp x29,x30,[sp, #0x30]
008f355c	add x29,sp,#0x30
008f3560	ldp x8,x9,[x0, #0x8]
008f3564	mov x19,x0
008f3568	cmp x9,x8
008f356c	b.eq 0x008f360c
008f3570	ldr x10,[x19, #0x20]
008f3574	mov x21,x19
008f3578	lsr x11,x10,#0x5
008f357c	and x11,x11,#0x7fffffffffffff8
008f3580	add x22,x8,x11
008f3584	ldr x11,[x22]
008f3588	ldr x12,[x21, #0x28]!
008f358c	add x24,x11,w10, UXTB  #0x4
008f3590	add x12,x12,x10
008f3594	lsr x13,x12,#0x5
008f3598	and x13,x13,#0x7fffffffffffff8
008f359c	ldr x13,[x8, x13#0x0]
008f35a0	add x23,x13,w12, UXTB  #0x4
008f35a4	cmp x23,x24
008f35a8	b.eq 0x008f3610
008f35ac	ldr x20,[x24, #0x8]
008f35b0	cbz x20,0x008f35e4
008f35b4	add x8,x20,#0x8
008f35b8	ldaxr x9,[x8]
008f35bc	sub x10,x9,#0x1
008f35c0	stlxr w11,x10,[x8]
008f35c4	cbnz w11,0x008f35b8
008f35c8	cbnz x9,0x008f35e4
008f35cc	ldr x8,[x20]
008f35d0	mov x0,x20
008f35d4	ldr x8,[x8, #0x10]
008f35d8	blr x8
008f35dc	mov x0,x20
008f35e0	bl 0x00c2ff00
008f35e4	ldr x8,[x22]
008f35e8	add x24,x24,#0x10
008f35ec	sub x8,x24,x8
008f35f0	cmp x8,#0x1, LSL #12
008f35f4	b.ne 0x008f35fc
008f35f8	ldr x24,[x22, #0x8]!
008f35fc	cmp x23,x24
008f3600	b.ne 0x008f35ac
008f3604	ldp x8,x9,[x19, #0x8]
008f3608	b 0x008f3610
008f360c	add x21,x19,#0x28
008f3610	sub x9,x9,x8
008f3614	asr x9,x9,#0x3
008f3618	cmp x9,#0x3
008f361c	str xzr,[x21]
008f3620	b.cc 0x008f3648
008f3624	ldr x0,[x8]
008f3628	bl 0x00c301d0
008f362c	ldp x8,x9,[x19, #0x8]
008f3630	add x8,x8,#0x8
008f3634	sub x9,x9,x8
008f3638	asr x9,x9,#0x3
008f363c	cmp x9,#0x2
008f3640	str x8,[x19, #0x8]
008f3644	b.hi 0x008f3624
008f3648	cmp x9,#0x1
008f364c	b.eq 0x008f3660
008f3650	cmp x9,#0x2
008f3654	b.ne 0x008f3668
008f3658	mov w8,#0x100
008f365c	b 0x008f3664
008f3660	mov w8,#0x80
008f3664	str x8,[x19, #0x20]
008f3668	ldp x29,x30,[sp, #0x30]
008f366c	ldp x20,x19,[sp, #0x20]
008f3670	ldp x22,x21,[sp, #0x10]
008f3674	ldp x24,x23,[sp], #0x40
008f3678	ret
