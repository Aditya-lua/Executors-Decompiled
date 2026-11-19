; ERR_new @ 00a55618
00a55618	stp x20,x19,[sp, #-0x20]!
00a5561c	stp x29,x30,[sp, #0x10]
00a55620	add x29,sp,#0x10
00a55624	bl 0x00c3be80
00a55628	cbz x0,0x00a55704
00a5562c	ldr w8,[x0, #0x380]
00a55630	ldr w11,[x0, #0x384]
00a55634	add w9,w8,#0x1
00a55638	add w10,w8,#0x10
00a5563c	cmp w9,#0x0
00a55640	csinc w8,w10,w8,lt
00a55644	and w8,w8,#0xfffffff0
00a55648	sub w10,w9,w8
00a5564c	cmp w10,w11
00a55650	str w10,[x0, #0x380]
00a55654	b.ne 0x00a55674
00a55658	add w8,w10,#0x1
00a5565c	add w9,w10,#0x10
00a55660	cmp w8,#0x0
00a55664	csinc w9,w9,w10,lt
00a55668	and w9,w9,#0xfffffff0
00a5566c	sub w8,w8,w9
00a55670	str w8,[x0, #0x384]
00a55674	add x9,x0,w10, SXTW  #0x2
00a55678	ldrb w12,[x9, #0x200]
00a5567c	sxtw x8,w10
00a55680	add x10,x0,w10, SXTW  #0x3
00a55684	add x11,x10,#0x100
00a55688	tbnz w12,#0x0,0x00a556a0
00a5568c	mov w10,wzr
00a55690	str xzr,[x11]
00a55694	add x11,x0,x8, LSL #0x3
00a55698	str xzr,[x11, #0x180]
00a5569c	b 0x00a556b0
00a556a0	ldr x10,[x11]
00a556a4	cbz x10,0x00a556b8
00a556a8	strb wzr,[x10]
00a556ac	mov w10,#0x1
00a556b0	add x9,x9,#0x200
00a556b4	str w10,[x9]
00a556b8	add x9,x0,x8, LSL #0x2
00a556bc	add x20,x0,x8, LSL #0x3
00a556c0	mov w8,#0xffffffff
00a556c4	str wzr,[x9, #0x40]
00a556c8	str wzr,[x9]
00a556cc	str xzr,[x20, #0x80]
00a556d0	str w8,[x9, #0x2c0]
00a556d4	ldr x0,[x20, #0x240]
00a556d8	adrp x19,0x2d3000
00a556dc	add x19,x19,#0xaa2
00a556e0	mov w2,#0x56
00a556e4	mov x1,x19
00a556e8	bl 0x00c32310
00a556ec	ldr x0,[x20, #0x300]
00a556f0	mov w2,#0x58
00a556f4	mov x1,x19
00a556f8	str xzr,[x20, #0x240]
00a556fc	bl 0x00c32310
00a55700	str xzr,[x20, #0x300]
00a55704	ldp x29,x30,[sp, #0x10]
00a55708	ldp x20,x19,[sp], #0x20
00a5570c	ret
