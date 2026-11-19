; LZ4_loadDict @ 008d25b8
008d25b8	stp x29,x30,[sp, #-0x30]!
008d25bc	stp x22,x21,[sp, #0x10]
008d25c0	stp x20,x19,[sp, #0x20]
008d25c4	mov x29,sp
008d25c8	mov w21,w2
008d25cc	mov x20,x1
008d25d0	mov w1,wzr
008d25d4	mov w2,#0x4020
008d25d8	mov x19,x0
008d25dc	add x22,x0,#0x4, LSL #12
008d25e0	bl 0x00c301c0
008d25e4	ldr w8,[x22, #0x10]
008d25e8	mov w0,wzr
008d25ec	cmp w21,#0x8
008d25f0	add w10,w8,#0x10, LSL #12
008d25f4	str w10,[x22, #0x10]
008d25f8	b.lt 0x008d2658
008d25fc	add x11,x20,w21, UXTW 
008d2600	cmp w21,#0x10, LSL #12
008d2604	sub x8,x11,#0x10, LSL #12
008d2608	sub x9,x11,#0x8
008d260c	csel x8,x8,x20,hi
008d2610	sub w0,w11,w8
008d2614	mov w11,#0x2
008d2618	cmp x8,x9
008d261c	str x8,[x19, #0x4000]
008d2620	stp w11,w0,[x22, #0x14]
008d2624	b.hi 0x008d2658
008d2628	mov x11,#0xbb000000
008d262c	sub w10,w10,w0
008d2630	movk x11,#0xbcdc, LSL #32
008d2634	movk x11,#0xcf1b, LSL #48
008d2638	ldr x12,[x8], #0x3
008d263c	cmp x8,x9
008d2640	mul x12,x12,x11
008d2644	lsr x12,x12,#0x32
008d2648	and x12,x12,#0x3ffc
008d264c	str w10,[x19, x12#0x0]
008d2650	add w10,w10,#0x3
008d2654	b.ls 0x008d2638
008d2658	ldp x20,x19,[sp, #0x20]
008d265c	ldp x22,x21,[sp, #0x10]
008d2660	ldp x29,x30,[sp], #0x30
008d2664	ret
