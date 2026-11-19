; TXT_DB_free @ 00aed5a4
00aed5a4	cbz x0,0x00aed724
00aed5a8	str x25,[sp, #-0x50]!
00aed5ac	stp x24,x23,[sp, #0x10]
00aed5b0	stp x22,x21,[sp, #0x20]
00aed5b4	stp x20,x19,[sp, #0x30]
00aed5b8	stp x29,x30,[sp, #0x40]
00aed5bc	mov x19,x0
00aed5c0	ldr x0,[x0, #0x10]
00aed5c4	add x29,sp,#0x40
00aed5c8	cbz x0,0x00aed608
00aed5cc	ldrsw x8,[x19]
00aed5d0	cmp w8,#0x1
00aed5d4	b.lt 0x00aed5f8
00aed5d8	sub x20,x8,#0x1
00aed5dc	ldr x0,[x0, x20, LSL #0x3]
00aed5e0	bl 0x00c34db0
00aed5e4	ldr x0,[x19, #0x10]
00aed5e8	add x8,x20,#0x1
00aed5ec	sub x20,x20,#0x1
00aed5f0	cmp x8,#0x1
00aed5f4	b.gt 0x00aed5dc
00aed5f8	adrp x1,0x2ce000
00aed5fc	add x1,x1,#0x3a1
00aed600	mov w2,#0x122
00aed604	bl 0x00c32310
00aed608	ldr x0,[x19, #0x18]
00aed60c	adrp x1,0x2ce000
00aed610	add x1,x1,#0x3a1
00aed614	mov w2,#0x124
00aed618	bl 0x00c32310
00aed61c	ldr x0,[x19, #0x8]
00aed620	cbz x0,0x00aed6fc
00aed624	bl 0x00c325e0
00aed628	ldr x8,[x19, #0x8]
00aed62c	cmp w0,#0x1
00aed630	b.lt 0x00aed6f4
00aed634	adrp x21,0x2ce000
00aed638	mov w20,w0
00aed63c	add x21,x21,#0x3a1
00aed640	mov w23,w20
00aed644	sub w20,w20,#0x1
00aed648	mov x0,x8
00aed64c	mov w1,w20
00aed650	bl 0x00c32610
00aed654	ldrsw x8,[x19]
00aed658	mov x22,x0
00aed65c	ldr x24,[x0, x8, LSL #0x3]
00aed660	cbz x24,0x00aed6a4
00aed664	cmp w8,#0x1
00aed668	b.lt 0x00aed6d0
00aed66c	mov x25,xzr
00aed670	ldr x0,[x22, x25, LSL #0x3]
00aed674	cmp x0,x22
00aed678	b.cc 0x00aed684
00aed67c	cmp x0,x24
00aed680	b.ls 0x00aed694
00aed684	mov w2,#0x133
00aed688	mov x1,x21
00aed68c	bl 0x00c32310
00aed690	ldr w8,[x19]
00aed694	add x25,x25,#0x1
00aed698	cmp x25,w8, SXTW 
00aed69c	b.lt 0x00aed670
00aed6a0	b 0x00aed6d0
00aed6a4	cmp w8,#0x1
00aed6a8	b.lt 0x00aed6d0
00aed6ac	mov x24,xzr
00aed6b0	ldr x0,[x22, x24, LSL #0x3]
00aed6b4	mov w2,#0x12f
00aed6b8	mov x1,x21
00aed6bc	bl 0x00c32310
00aed6c0	ldrsw x8,[x19]
00aed6c4	add x24,x24,#0x1
00aed6c8	cmp x24,x8
00aed6cc	b.lt 0x00aed6b0
00aed6d0	ldr x0,[x19, #0x8]
00aed6d4	mov w1,w20
00aed6d8	bl 0x00c32610
00aed6dc	mov w2,#0x136
00aed6e0	mov x1,x21
00aed6e4	bl 0x00c32310
00aed6e8	ldr x8,[x19, #0x8]
00aed6ec	cmp w23,#0x1
00aed6f0	b.gt 0x00aed640
00aed6f4	mov x0,x8
00aed6f8	bl 0x00c34770
00aed6fc	mov x0,x19
00aed700	ldp x29,x30,[sp, #0x40]
00aed704	ldp x20,x19,[sp, #0x30]
00aed708	ldp x22,x21,[sp, #0x20]
00aed70c	ldp x24,x23,[sp, #0x10]
00aed710	adrp x1,0x2ce000
00aed714	add x1,x1,#0x3a1
00aed718	mov w2,#0x13a
00aed71c	ldr x25,[sp], #0x50
00aed720	b 0x00c32310
00aed724	ret
