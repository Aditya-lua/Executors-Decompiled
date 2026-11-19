; FUN_008ba594 @ 008ba594
008ba594	stp x29,x30,[sp, #-0x40]!
008ba598	str x23,[sp, #0x10]
008ba59c	stp x22,x21,[sp, #0x20]
008ba5a0	stp x20,x19,[sp, #0x30]
008ba5a4	mov x29,sp
008ba5a8	ldr w8,[x2, #0xc]
008ba5ac	mov x19,x2
008ba5b0	mov x20,x1
008ba5b4	cmp w8,#0x3
008ba5b8	b.eq 0x008ba5cc
008ba5bc	cbnz w8,0x008ba5f0
008ba5c0	ldr w9,[x20, #0x8]
008ba5c4	mov w8,#0xffffffff
008ba5c8	b 0x008ba670
008ba5cc	ldr d0,[x19]
008ba5d0	fcvtzs w10,d0
008ba5d4	scvtf d1,w10
008ba5d8	subs w8,w10,#0x1
008ba5dc	fccmp d0,d1,#0x0,ge
008ba5e0	b.ne 0x008ba5f0
008ba5e4	ldr w9,[x20, #0x8]
008ba5e8	cmp w9,w10
008ba5ec	b.ge 0x008ba670
008ba5f0	mov x21,x0
008ba5f4	mov x0,x20
008ba5f8	mov x1,x19
008ba5fc	bl 0x008bd784
008ba600	mov x22,x0
008ba604	add x23,x0,#0x10
008ba608	mov x0,x23
008ba60c	mov x1,x19
008ba610	bl 0x008b92ec
008ba614	cbnz w0,0x008ba65c
008ba618	ldr w8,[x22, #0x1c]
008ba61c	and w9,w8,#0xf
008ba620	cmp w9,#0xd
008ba624	b.ne 0x008ba644
008ba628	ldr w9,[x19, #0xc]
008ba62c	cmp w9,#0x5
008ba630	b.lt 0x008ba644
008ba634	ldr x9,[x23]
008ba638	ldr x10,[x19]
008ba63c	cmp x9,x10
008ba640	b.eq 0x008ba65c
008ba644	cmp w8,#0x10
008ba648	b.cc 0x008ba750
008ba64c	sbfx x8,x8,#0x4,#0x1c
008ba650	add x22,x22,x8, LSL #0x5
008ba654	add x23,x22,#0x10
008ba658	b 0x008ba608
008ba65c	ldr x8,[x20, #0x28]
008ba660	ldr w9,[x20, #0x8]
008ba664	sub x8,x22,x8
008ba668	lsr x8,x8,#0x5
008ba66c	add w8,w9,w8
008ba670	sxtw x11,w8
008ba674	sxtw x10,w9
008ba678	sub w12,w8,w9
008ba67c	sbfiz x9,x8,#0x4,#0x20
008ba680	add w8,w12,#0x1
008ba684	add x11,x11,#0x1
008ba688	cmp x11,x10
008ba68c	b.ge 0x008ba6c8
008ba690	ldr x12,[x20, #0x20]
008ba694	add w8,w8,#0x1
008ba698	add x11,x11,#0x1
008ba69c	add x12,x12,x9
008ba6a0	add x9,x9,#0x10
008ba6a4	ldr w12,[x12, #0x1c]
008ba6a8	cbz w12,0x008ba688
008ba6ac	scvtf d0,w11
008ba6b0	mov w10,#0x3
008ba6b4	str w10,[x19, #0xc]
008ba6b8	str d0,[x19]
008ba6bc	ldr x8,[x20, #0x20]
008ba6c0	add x8,x8,x9
008ba6c4	b 0x008ba730
008ba6c8	ldrb w9,[x20, #0x5]
008ba6cc	mov w10,#0x1
008ba6d0	lsl x9,x10,x9
008ba6d4	cmp w8,w9
008ba6d8	b.ge 0x008ba704
008ba6dc	ldr x10,[x20, #0x28]
008ba6e0	sxtw x11,w8
008ba6e4	sbfiz x8,x8,#0x5,#0x20
008ba6e8	add x12,x10,x8
008ba6ec	ldr w13,[x12, #0xc]
008ba6f0	cbnz w13,0x008ba70c
008ba6f4	add x11,x11,#0x1
008ba6f8	add x8,x8,#0x20
008ba6fc	cmp x11,x9
008ba700	b.lt 0x008ba6e8
008ba704	mov w0,wzr
008ba708	b 0x008ba73c
008ba70c	ldr x9,[x12, #0x10]
008ba710	str x9,[x19]
008ba714	ldr w9,[x12, #0x18]
008ba718	str w9,[x19, #0x8]
008ba71c	ldr w9,[x12, #0x1c]
008ba720	ldr x10,[x20, #0x28]
008ba724	and w9,w9,#0xf
008ba728	add x8,x10,x8
008ba72c	str w9,[x19, #0xc]
008ba730	ldr q0,[x8]
008ba734	mov w0,#0x1
008ba738	str q0,[x19, #0x10]
008ba73c	ldp x20,x19,[sp, #0x30]
008ba740	ldr x23,[sp, #0x10]
008ba744	ldp x22,x21,[sp, #0x20]
008ba748	ldp x29,x30,[sp], #0x40
008ba74c	ret
008ba750	adrp x1,0x2af000
008ba754	add x1,x1,#0x7e
008ba758	mov x0,x21
008ba75c	bl 0x008b39cc
