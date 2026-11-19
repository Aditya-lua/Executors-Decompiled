; FUN_00c0b578 @ 00c0b578
00c0b578	paciasp
00c0b57c	stp x29,x30,[sp, #-0x40]!
00c0b580	stp x24,x23,[sp, #0x10]
00c0b584	stp x22,x21,[sp, #0x20]
00c0b588	stp x20,x19,[sp, #0x30]
00c0b58c	mov x29,sp
00c0b590	ldr x9,[x0, #0x10]
00c0b594	ldr x22,[x0]
00c0b598	mov x21,x2
00c0b59c	mov x19,x0
00c0b5a0	mov x20,x1
00c0b5a4	sub x8,x9,x22
00c0b5a8	cmp x3,x8, ASR #0x3
00c0b5ac	b.ls 0x00c0b5dc
00c0b5b0	cbz x22,0x00c0b644
00c0b5b4	add x9,x19,#0x18
00c0b5b8	str x22,[x19, #0x8]
00c0b5bc	cmp x22,x9
00c0b5c0	b.eq 0x00c0b634
00c0b5c4	mov x0,x22
00c0b5c8	mov x1,x8
00c0b5cc	mov x22,x3
00c0b5d0	bl 0x00c2fe80
00c0b5d4	mov x3,x22
00c0b5d8	b 0x00c0b638
00c0b5dc	ldr x23,[x19, #0x8]
00c0b5e0	sub x24,x23,x22
00c0b5e4	cmp x3,x24, ASR #0x3
00c0b5e8	b.ls 0x00c0b628
00c0b5ec	cmp x23,x22
00c0b5f0	b.eq 0x00c0b608
00c0b5f4	mov x0,x22
00c0b5f8	mov x1,x20
00c0b5fc	mov x2,x24
00c0b600	bl 0x00c2ff60
00c0b604	ldr x23,[x19, #0x8]
00c0b608	add x1,x20,x24
00c0b60c	subs x20,x21,x1
00c0b610	b.eq 0x00c0b620
00c0b614	mov x0,x23
00c0b618	mov x2,x20
00c0b61c	bl 0x00c2ff60
00c0b620	add x8,x23,x20
00c0b624	b 0x00c0b6c4
00c0b628	subs x21,x21,x20
00c0b62c	b.ne 0x00c0b6b0
00c0b630	b 0x00c0b6c0
00c0b634	strb wzr,[x19, #0x108]
00c0b638	mov x9,xzr
00c0b63c	stp xzr,xzr,[x19]
00c0b640	str xzr,[x19, #0x10]
00c0b644	lsr x8,x3,#0x3d
00c0b648	cbnz x8,0x00c0b6e0
00c0b64c	asr x8,x9,#0x2
00c0b650	orr x10,xzr,#0x7ffffffffffffff8
00c0b654	cmp x8,x3
00c0b658	csel x8,x8,x3,hi
00c0b65c	cmp x9,x10
00c0b660	mov x9,#0x1fffffffffffffff
00c0b664	csel x23,x8,x9,cc
00c0b668	lsr x8,x23,#0x3d
00c0b66c	cbnz x8,0x00c0b6e0
00c0b670	cmp x23,#0x1e
00c0b674	b.hi 0x00c0b690
00c0b678	ldrb w8,[x19, #0x108]
00c0b67c	tbnz w8,#0x0,0x00c0b690
00c0b680	mov w8,#0x1
00c0b684	add x22,x19,#0x18
00c0b688	strb w8,[x19, #0x108]
00c0b68c	b 0x00c0b69c
00c0b690	lsl x0,x23,#0x3
00c0b694	bl 0x00c2fed0
00c0b698	mov x22,x0
00c0b69c	add x8,x22,x23, LSL #0x3
00c0b6a0	subs x21,x21,x20
00c0b6a4	stp x22,x22,[x19]
00c0b6a8	str x8,[x19, #0x10]
00c0b6ac	b.eq 0x00c0b6c0
00c0b6b0	mov x0,x22
00c0b6b4	mov x1,x20
00c0b6b8	mov x2,x21
00c0b6bc	bl 0x00c2ff60
00c0b6c0	add x8,x22,x21
00c0b6c4	str x8,[x19, #0x8]
00c0b6c8	ldp x20,x19,[sp, #0x30]
00c0b6cc	ldp x22,x21,[sp, #0x20]
00c0b6d0	ldp x24,x23,[sp, #0x10]
00c0b6d4	ldp x29,x30,[sp], #0x40
00c0b6d8	autiasp
00c0b6dc	ret
00c0b6e0	bl 0x00c0b52c
