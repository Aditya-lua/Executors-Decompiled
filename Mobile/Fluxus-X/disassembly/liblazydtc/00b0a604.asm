; X509_STORE_free @ 00b0a604
00b0a604	str x23,[sp, #-0x40]!
00b0a608	stp x22,x21,[sp, #0x10]
00b0a60c	stp x20,x19,[sp, #0x20]
00b0a610	stp x29,x30,[sp, #0x30]
00b0a614	add x29,sp,#0x30
00b0a618	cbz x0,0x00b0a648
00b0a61c	mov x19,x0
00b0a620	add x9,x0,#0x90
00b0a624	ldxr w8,[x9]
00b0a628	subs w10,w8,#0x1
00b0a62c	stxr w11,w10,[x9]
00b0a630	cbnz w11,0x00b0a624
00b0a634	b.ne 0x00b0a640
00b0a638	dmb ISHLD
00b0a63c	b 0x00b0a65c
00b0a640	cmp w8,#0x1
00b0a644	b.le 0x00b0a65c
00b0a648	ldp x29,x30,[sp, #0x30]
00b0a64c	ldp x20,x19,[sp, #0x20]
00b0a650	ldp x22,x21,[sp, #0x10]
00b0a654	ldr x23,[sp], #0x40
00b0a658	ret
00b0a65c	ldr x20,[x19, #0x10]
00b0a660	mov x0,x20
00b0a664	bl 0x00c325e0
00b0a668	cmp w0,#0x1
00b0a66c	b.lt 0x00b0a6e4
00b0a670	adrp x22,0x2aa000
00b0a674	mov w21,wzr
00b0a678	add x22,x22,#0xba3
00b0a67c	mov x0,x20
00b0a680	mov w1,w21
00b0a684	bl 0x00c32610
00b0a688	ldr x8,[x0, #0x8]
00b0a68c	mov x23,x0
00b0a690	cbz x8,0x00b0a6a4
00b0a694	ldr x8,[x8, #0x20]
00b0a698	cbz x8,0x00b0a6a4
00b0a69c	mov x0,x23
00b0a6a0	blr x8
00b0a6a4	cbz x23,0x00b0a6d0
00b0a6a8	ldr x8,[x23, #0x8]
00b0a6ac	cbz x8,0x00b0a6c0
00b0a6b0	ldr x8,[x8, #0x10]
00b0a6b4	cbz x8,0x00b0a6c0
00b0a6b8	mov x0,x23
00b0a6bc	blr x8
00b0a6c0	mov w2,#0x29
00b0a6c4	mov x0,x23
00b0a6c8	mov x1,x22
00b0a6cc	bl 0x00c32310
00b0a6d0	mov x0,x20
00b0a6d4	add w21,w21,#0x1
00b0a6d8	bl 0x00c325e0
00b0a6dc	cmp w21,w0
00b0a6e0	b.lt 0x00b0a67c
00b0a6e4	mov x0,x20
00b0a6e8	bl 0x00c34770
00b0a6ec	adrp x1,0xcb5000
00b0a6f0	ldr x0,[x19, #0x8]
00b0a6f4	ldr x1,[x1, #0x860]
00b0a6f8	bl 0x00c32600
00b0a6fc	add x2,x19,#0x80
00b0a700	mov w0,#0x4
00b0a704	mov x1,x19
00b0a708	bl 0x00c356c0
00b0a70c	ldr x0,[x19, #0x18]
00b0a710	bl 0x00c35b90
00b0a714	ldr x0,[x19, #0x98]
00b0a718	bl 0x00c34d40
00b0a71c	mov x0,x19
00b0a720	ldp x29,x30,[sp, #0x30]
00b0a724	ldp x20,x19,[sp, #0x20]
00b0a728	ldp x22,x21,[sp, #0x10]
00b0a72c	adrp x1,0x2aa000
00b0a730	add x1,x1,#0xba3
00b0a734	mov w2,#0xf9
00b0a738	ldr x23,[sp], #0x40
00b0a73c	b 0x00c32310
