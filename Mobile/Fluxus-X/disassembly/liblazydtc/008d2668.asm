; LZ4_loadDictSlow @ 008d2668
008d2668	stp x29,x30,[sp, #-0x30]!
008d266c	stp x22,x21,[sp, #0x10]
008d2670	stp x20,x19,[sp, #0x20]
008d2674	mov x29,sp
008d2678	mov w21,w2
008d267c	mov x20,x1
008d2680	mov w1,wzr
008d2684	mov w2,#0x4020
008d2688	mov x19,x0
008d268c	add x22,x0,#0x4, LSL #12
008d2690	bl 0x00c301c0
008d2694	ldr w8,[x22, #0x10]
008d2698	mov w0,wzr
008d269c	cmp w21,#0x8
008d26a0	add w11,w8,#0x10, LSL #12
008d26a4	str w11,[x22, #0x10]
008d26a8	b.lt 0x008d26d8
008d26ac	add x12,x20,w21, UXTW 
008d26b0	cmp w21,#0x10, LSL #12
008d26b4	sub x9,x12,#0x10, LSL #12
008d26b8	sub x10,x12,#0x8
008d26bc	csel x9,x9,x20,hi
008d26c0	sub w0,w12,w9
008d26c4	mov w12,#0x2
008d26c8	cmp x9,x10
008d26cc	str x9,[x19, #0x4000]
008d26d0	stp w12,w0,[x22, #0x14]
008d26d4	b.ls 0x008d26e8
008d26d8	ldp x20,x19,[sp, #0x20]
008d26dc	ldp x22,x21,[sp, #0x10]
008d26e0	ldp x29,x30,[sp], #0x30
008d26e4	ret
008d26e8	mov x12,#0xbb000000
008d26ec	sub w11,w11,w0
008d26f0	mov x13,x9
008d26f4	movk x12,#0xbcdc, LSL #32
008d26f8	mov w14,w11
008d26fc	movk x12,#0xcf1b, LSL #48
008d2700	ldr x15,[x13], #0x3
008d2704	cmp x13,x10
008d2708	mul x15,x15,x12
008d270c	lsr x15,x15,#0x32
008d2710	and x15,x15,#0x3ffc
008d2714	str w14,[x19, x15#0x0]
008d2718	add w14,w14,#0x3
008d271c	b.ls 0x008d2700
008d2720	b 0x008d2734
008d2724	add x9,x9,#0x1
008d2728	add w11,w11,#0x1
008d272c	cmp x9,x10
008d2730	b.hi 0x008d26d8
008d2734	ldr x13,[x9]
008d2738	mul x13,x13,x12
008d273c	lsr x13,x13,#0x34
008d2740	ldr w14,[x19, x13, LSL #0x2]
008d2744	cmp w14,w8
008d2748	b.hi 0x008d2724
008d274c	str w11,[x19, x13, LSL #0x2]
008d2750	b 0x008d2724
