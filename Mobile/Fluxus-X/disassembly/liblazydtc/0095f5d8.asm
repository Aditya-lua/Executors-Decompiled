; FUN_0095f5d8 @ 0095f5d8
0095f5d8	str x19,[sp, #-0x20]!
0095f5dc	stp x29,x30,[sp, #0x10]
0095f5e0	add x29,sp,#0x10
0095f5e4	ldr w8,[x0]
0095f5e8	mov x19,x0
0095f5ec	ldr x0,[x0, #0x10]
0095f5f0	mov x1,xzr
0095f5f4	cmp w8,#0x0
0095f5f8	cset w2,eq
0095f5fc	bl 0x009086d4
0095f600	mov x3,x0
0095f604	tbnz x0,#0x3f,0x0095f630
0095f608	cbz x3,0x0095f648
0095f60c	mov x9,#0xf7cf
0095f610	movk x9,#0xe353, LSL #16
0095f614	movk x9,#0x9ba5, LSL #32
0095f618	add x8,x3,#0x1f4
0095f61c	movk x9,#0x20c4, LSL #48
0095f620	smulh x8,x8,x9
0095f624	asr x9,x8,#0x7
0095f628	add x8,x9,x8, LSR #0x3f
0095f62c	b 0x0095f64c
0095f630	ldr x0,[x19, #0x10]
0095f634	adrp x1,0x2a5000
0095f638	add x1,x1,#0x313
0095f63c	bl 0x00904b80
0095f640	orr w0,wzr,#0x1c
0095f644	b 0x0095f6d8
0095f648	mov w8,#0xe10
0095f64c	mov w9,#0x6667
0095f650	movk w9,#0x6666, LSL #16
0095f654	smull x9,w8,w9
0095f658	lsr x10,x9,#0x20
0095f65c	lsr x9,x9,#0x3f
0095f660	cmp w8,#0xf
0095f664	add w9,w9,w10, ASR #0x1
0095f668	orr w10,wzr,#0x3
0095f66c	csel w9,w10,w9,lt
0095f670	mov w10,#0x32
0095f674	cmp w9,#0x32
0095f678	csel w5,w9,w10,lt
0095f67c	sxtw x9,w5
0095f680	ldr x0,[x19, #0x10]
0095f684	sdiv x8,x8,x9
0095f688	cmp w8,#0x1
0095f68c	csinc w4,w8,wzr,gt
0095f690	stp w4,w5,[x19, #0x20]
0095f694	cbz x0,0x0095f6c4
0095f698	ldrb w8,[x0, #0xa85]
0095f69c	tbz w8,#0x4,0x0095f6c4
0095f6a0	ldr x8,[x0, #0x12a0]
0095f6a4	cbz x8,0x0095f6b4
0095f6a8	ldr w8,[x8, #0x8]
0095f6ac	cmp w8,#0x1
0095f6b0	b.lt 0x0095f6c4
0095f6b4	ldr w2,[x19]
0095f6b8	adrp x1,0x2bb000
0095f6bc	add x1,x1,#0x30c
0095f6c0	bl 0x00904c98
0095f6c4	mov x0,xzr
0095f6c8	bl 0x00c30970
0095f6cc	mov x8,x0
0095f6d0	mov w0,wzr
0095f6d4	str x8,[x19, #0x28]
0095f6d8	ldp x29,x30,[sp, #0x10]
0095f6dc	ldr x19,[sp], #0x20
0095f6e0	ret
