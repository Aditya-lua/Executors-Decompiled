; EC_KEY_free @ 00a2e658
00a2e658	stp x20,x19,[sp, #-0x20]!
00a2e65c	stp x29,x30,[sp, #0x10]
00a2e660	add x29,sp,#0x10
00a2e664	cbz x0,0x00a2e694
00a2e668	mov x19,x0
00a2e66c	add x9,x0,#0x38
00a2e670	ldxr w8,[x9]
00a2e674	subs w10,w8,#0x1
00a2e678	stxr w11,w10,[x9]
00a2e67c	cbnz w11,0x00a2e670
00a2e680	b.ne 0x00a2e68c
00a2e684	dmb ISHLD
00a2e688	b 0x00a2e6a0
00a2e68c	cmp w8,#0x1
00a2e690	b.le 0x00a2e6a0
00a2e694	ldp x29,x30,[sp, #0x10]
00a2e698	ldp x20,x19,[sp], #0x20
00a2e69c	ret
00a2e6a0	ldr x8,[x19]
00a2e6a4	cbz x8,0x00a2e6b8
00a2e6a8	ldr x8,[x8, #0x18]
00a2e6ac	cbz x8,0x00a2e6b8
00a2e6b0	mov x0,x19
00a2e6b4	blr x8
00a2e6b8	ldr x0,[x19, #0x8]
00a2e6bc	bl 0x00c32360
00a2e6c0	ldr x8,[x19, #0x18]
00a2e6c4	cbz x8,0x00a2e6dc
00a2e6c8	ldr x8,[x8]
00a2e6cc	ldr x8,[x8, #0x168]
00a2e6d0	cbz x8,0x00a2e6dc
00a2e6d4	mov x0,x19
00a2e6d8	blr x8
00a2e6dc	add x2,x19,#0x40
00a2e6e0	mov w0,#0x8
00a2e6e4	mov x1,x19
00a2e6e8	bl 0x00c356c0
00a2e6ec	ldr x0,[x19, #0x50]
00a2e6f0	bl 0x00c34d40
00a2e6f4	ldr x0,[x19, #0x18]
00a2e6f8	bl 0x00c3a770
00a2e6fc	ldr x0,[x19, #0x20]
00a2e700	bl 0x00c3ab60
00a2e704	ldr x0,[x19, #0x28]
00a2e708	bl 0x00c322e0
00a2e70c	ldr x0,[x19, #0x60]
00a2e710	adrp x20,0x2b4000
00a2e714	add x20,x20,#0x15e
00a2e718	mov w2,#0x64
00a2e71c	mov x1,x20
00a2e720	bl 0x00c32310
00a2e724	ldp x29,x30,[sp, #0x10]
00a2e728	orr w1,wzr,#0x70
00a2e72c	mov w3,#0x66
00a2e730	mov x0,x19
00a2e734	mov x2,x20
00a2e738	ldp x20,x19,[sp], #0x20
00a2e73c	b 0x00c345e0
