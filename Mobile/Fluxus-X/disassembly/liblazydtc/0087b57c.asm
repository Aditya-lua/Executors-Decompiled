; FUN_0087b57c @ 0087b57c
0087b57c	stp x29,x30,[sp, #-0x50]!
0087b580	stp x26,x25,[sp, #0x10]
0087b584	stp x24,x23,[sp, #0x20]
0087b588	stp x22,x21,[sp, #0x30]
0087b58c	stp x20,x19,[sp, #0x40]
0087b590	mov x29,sp
0087b594	ldp x8,x9,[x0, #0x8]
0087b598	mov x19,x0
0087b59c	sub x10,x9,x8
0087b5a0	cmp x1,x10, ASR #0x2
0087b5a4	b.ls 0x0087b608
0087b5a8	ldr x20,[x19]
0087b5ac	sub x22,x8,x20
0087b5b0	asr x23,x22,#0x2
0087b5b4	add x8,x23,x1
0087b5b8	lsr x10,x8,#0x3e
0087b5bc	cbnz x10,0x0087b730
0087b5c0	sub x21,x9,x20
0087b5c4	orr x10,xzr,#0x7ffffffffffffffc
0087b5c8	asr x9,x21,#0x1
0087b5cc	cmp x9,x8
0087b5d0	csel x8,x9,x8,hi
0087b5d4	cmp x21,x10
0087b5d8	mov x9,#0x3fffffffffffffff
0087b5dc	csel x24,x8,x9,cc
0087b5e0	cbz x24,0x0087b670
0087b5e4	lsr x8,x24,#0x3e
0087b5e8	cbnz x8,0x0087b734
0087b5ec	lsl x0,x24,#0x2
0087b5f0	mov x25,x2
0087b5f4	mov x26,x1
0087b5f8	bl 0x00c2fed0
0087b5fc	mov x1,x26
0087b600	mov x2,x25
0087b604	b 0x0087b674
0087b608	cbz x1,0x0087b668
0087b60c	sub x9,x1,#0x1
0087b610	ldr w10,[x2]
0087b614	and x11,x9,#0x3fffffffffffffff
0087b618	add x9,x8,x1, LSL #0x2
0087b61c	cmp x11,#0x7
0087b620	b.cc 0x0087b658
0087b624	add x11,x11,#0x1
0087b628	dup v0.4S,w10
0087b62c	and x12,x11,#0x7ffffffffffffff8
0087b630	add x13,x8,x12, LSL #0x2
0087b634	add x8,x8,#0x10
0087b638	mov x14,x12
0087b63c	subs x14,x14,#0x8
0087b640	stp q0,q0,[x8, #-0x10]
0087b644	add x8,x8,#0x20
0087b648	b.ne 0x0087b63c
0087b64c	cmp x11,x12
0087b650	mov x8,x13
0087b654	b.eq 0x0087b664
0087b658	str w10,[x8], #0x4
0087b65c	cmp x8,x9
0087b660	b.ne 0x0087b658
0087b664	mov x8,x9
0087b668	str x8,[x19, #0x8]
0087b66c	b 0x0087b718
0087b670	mov x0,xzr
0087b674	sub x9,x1,#0x1
0087b678	add x8,x0,x22
0087b67c	and x11,x9,#0x3fffffffffffffff
0087b680	add x25,x8,x1, LSL #0x2
0087b684	ldr w9,[x2]
0087b688	cmp x11,#0x7
0087b68c	mov x10,x8
0087b690	b.cc 0x0087b6c8
0087b694	add x11,x11,#0x1
0087b698	dup v0.4S,w9
0087b69c	add x13,x22,x0
0087b6a0	and x12,x11,#0x7ffffffffffffff8
0087b6a4	add x13,x13,#0x10
0087b6a8	add x10,x8,x12, LSL #0x2
0087b6ac	mov x14,x12
0087b6b0	subs x14,x14,#0x8
0087b6b4	stp q0,q0,[x13, #-0x10]
0087b6b8	add x13,x13,#0x20
0087b6bc	b.ne 0x0087b6b0
0087b6c0	cmp x11,x12
0087b6c4	b.eq 0x0087b6d4
0087b6c8	str w9,[x10], #0x4
0087b6cc	cmp x10,x25
0087b6d0	b.ne 0x0087b6c8
0087b6d4	sub x23,x8,x23, LSL #0x2
0087b6d8	add x24,x0,x24, LSL #0x2
0087b6dc	mov x1,x20
0087b6e0	mov x2,x22
0087b6e4	mov x0,x23
0087b6e8	bl 0x00c2ffd0
0087b6ec	stp x23,x25,[x19]
0087b6f0	str x24,[x19, #0x10]
0087b6f4	cbz x20,0x0087b718
0087b6f8	mov x0,x20
0087b6fc	mov x1,x21
0087b700	ldp x20,x19,[sp, #0x40]
0087b704	ldp x22,x21,[sp, #0x30]
0087b708	ldp x24,x23,[sp, #0x20]
0087b70c	ldp x26,x25,[sp, #0x10]
0087b710	ldp x29,x30,[sp], #0x50
0087b714	b 0x00c2fe80
0087b718	ldp x20,x19,[sp, #0x40]
0087b71c	ldp x22,x21,[sp, #0x30]
0087b720	ldp x24,x23,[sp, #0x20]
0087b724	ldp x26,x25,[sp, #0x10]
0087b728	ldp x29,x30,[sp], #0x50
0087b72c	ret
0087b730	bl 0x0086f7b4
0087b734	bl 0x007fe1b8
