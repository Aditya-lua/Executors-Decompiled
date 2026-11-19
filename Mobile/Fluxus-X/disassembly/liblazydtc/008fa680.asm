; std::__ndk1::__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>>::push_front @ 008fa680
008fa680	str x25,[sp, #-0x50]!
008fa684	stp x24,x23,[sp, #0x10]
008fa688	stp x22,x21,[sp, #0x20]
008fa68c	stp x20,x19,[sp, #0x30]
008fa690	stp x29,x30,[sp, #0x40]
008fa694	add x29,sp,#0x40
008fa698	ldp x8,x24,[x0]
008fa69c	mov x20,x1
008fa6a0	mov x19,x0
008fa6a4	cmp x24,x8
008fa6a8	mov x21,x24
008fa6ac	b.eq 0x008fa6b8
008fa6b0	mov x22,x21
008fa6b4	b 0x008fa818
008fa6b8	ldp x23,x9,[x19, #0x10]
008fa6bc	cmp x23,x9
008fa6c0	b.cs 0x008fa708
008fa6c4	sub x8,x9,x23
008fa6c8	asr x8,x8,#0x3
008fa6cc	add x9,x8,#0x1
008fa6d0	add x10,x8,#0x2
008fa6d4	cmp x9,#0x0
008fa6d8	csinc x8,x10,x8,lt
008fa6dc	asr x25,x8,#0x1
008fa6e0	subs x2,x23,x24
008fa6e4	add x8,x23,x25, LSL #0x3
008fa6e8	b.eq 0x008fa72c
008fa6ec	sub x22,x8,x2
008fa6f0	mov x0,x22
008fa6f4	mov x1,x21
008fa6f8	bl 0x00c2ff60
008fa6fc	ldr x8,[x19, #0x10]
008fa700	add x8,x8,x25, LSL #0x3
008fa704	b 0x008fa730
008fa708	subs x8,x9,x8
008fa70c	asr x8,x8,#0x2
008fa710	csinc x25,x8,xzr,ne
008fa714	cbz x25,0x008fa738
008fa718	lsr x8,x25,#0x3d
008fa71c	cbnz x8,0x008fa844
008fa720	lsl x0,x25,#0x3
008fa724	bl 0x00c2fed0
008fa728	b 0x008fa73c
008fa72c	mov x22,x8
008fa730	stp x22,x8,[x19, #0x8]
008fa734	b 0x008fa818
008fa738	mov x0,xzr
008fa73c	add x8,x25,#0x3
008fa740	lsr x13,x8,#0x2
008fa744	cmp x24,x23
008fa748	add x22,x0,x13, LSL #0x3
008fa74c	add x8,x0,x25, LSL #0x3
008fa750	b.eq 0x008fa77c
008fa754	sub x9,x23,#0x8
008fa758	sub x9,x9,x24
008fa75c	lsr x12,x9,#0x3
008fa760	add x10,x12,x13
008fa764	add x11,x12,#0x1
008fa768	cmp x11,#0x4
008fa76c	add x9,x10,#0x1
008fa770	b.cs 0x008fa784
008fa774	mov x10,x22
008fa778	b 0x008fa7e8
008fa77c	mov x9,x22
008fa780	b 0x008fa800
008fa784	add x12,x24,x12, LSL #0x3
008fa788	add x12,x12,#0x8
008fa78c	cmp x22,x12
008fa790	b.cs 0x008fa7a8
008fa794	add x10,x0,x10, LSL #0x3
008fa798	add x10,x10,#0x8
008fa79c	cmp x24,x10
008fa7a0	mov x10,x22
008fa7a4	b.cc 0x008fa7e8
008fa7a8	and x12,x11,#0x3ffffffffffffffc
008fa7ac	add x13,x0,x13, LSL #0x3
008fa7b0	lsl x15,x12,#0x3
008fa7b4	add x14,x24,#0x10
008fa7b8	add x10,x22,x15
008fa7bc	add x21,x24,x15
008fa7c0	add x13,x13,#0x10
008fa7c4	mov x15,x12
008fa7c8	ldp q0,q1,[x14, #-0x10]
008fa7cc	add x14,x14,#0x20
008fa7d0	subs x15,x15,#0x4
008fa7d4	stp q0,q1,[x13, #-0x10]
008fa7d8	add x13,x13,#0x20
008fa7dc	b.ne 0x008fa7c8
008fa7e0	cmp x11,x12
008fa7e4	b.eq 0x008fa7f8
008fa7e8	ldr x11,[x21], #0x8
008fa7ec	cmp x23,x21
008fa7f0	str x11,[x10], #0x8
008fa7f4	b.ne 0x008fa7e8
008fa7f8	ldr x21,[x19]
008fa7fc	add x9,x0,x9, LSL #0x3
008fa800	stp x0,x22,[x19]
008fa804	stp x9,x8,[x19, #0x10]
008fa808	cbz x21,0x008fa818
008fa80c	mov x0,x21
008fa810	bl 0x00c301d0
008fa814	ldr x22,[x19, #0x8]
008fa818	ldr x8,[x20]
008fa81c	stur x8,[x22, #-0x8]
008fa820	ldr x8,[x19, #0x8]
008fa824	sub x8,x8,#0x8
008fa828	str x8,[x19, #0x8]
008fa82c	ldp x29,x30,[sp, #0x40]
008fa830	ldp x20,x19,[sp, #0x30]
008fa834	ldp x22,x21,[sp, #0x20]
008fa838	ldp x24,x23,[sp, #0x10]
008fa83c	ldr x25,[sp], #0x50
008fa840	ret
008fa844	mov w0,#0x10
008fa848	bl 0x00c30000
008fa84c	mov x19,x0
008fa850	adrp x1,0x2ad000
008fa854	add x1,x1,#0x51
008fa858	bl 0x00c30040
008fa85c	adrp x8,0xcb4000
008fa860	ldr x8,[x8, #0x980]
008fa864	adrp x1,0xcb4000
008fa868	adrp x2,0xcb4000
008fa86c	mov x0,x19
008fa870	add x8,x8,#0x10
008fa874	str x8,[x19]
008fa878	ldr x1,[x1, #0x970]
008fa87c	ldr x2,[x2, #0x978]
008fa880	bl 0x00c30020
