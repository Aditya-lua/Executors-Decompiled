; EC_KEY_set_private_key @ 00a2f5f4
00a2f5f4	str x21,[sp, #-0x30]!
00a2f5f8	stp x20,x19,[sp, #0x10]
00a2f5fc	stp x29,x30,[sp, #0x20]
00a2f600	mov x19,x0
00a2f604	ldr x0,[x0, #0x18]
00a2f608	add x29,sp,#0x20
00a2f60c	cbz x0,0x00a2f6e8
00a2f610	ldr x8,[x0]
00a2f614	cbz x8,0x00a2f6e4
00a2f618	mov x21,x1
00a2f61c	bl 0x00c3aa40
00a2f620	cbz x0,0x00a2f6e8
00a2f624	mov x20,x0
00a2f628	bl 0x00c369b0
00a2f62c	mov w8,w0
00a2f630	mov w0,wzr
00a2f634	cbnz w8,0x00a2f6e8
00a2f638	ldr x8,[x19, #0x18]
00a2f63c	ldr x8,[x8]
00a2f640	ldr x8,[x8, #0x140]
00a2f644	cbz x8,0x00a2f658
00a2f648	mov x0,x19
00a2f64c	mov x1,x21
00a2f650	blr x8
00a2f654	cbz w0,0x00a2f6e8
00a2f658	ldr x8,[x19]
00a2f65c	ldr x8,[x8, #0x30]
00a2f660	cbz x8,0x00a2f674
00a2f664	mov x0,x19
00a2f668	mov x1,x21
00a2f66c	blr x8
00a2f670	cbz w0,0x00a2f6e8
00a2f674	cbz x21,0x00a2f6c8
00a2f678	mov x0,x21
00a2f67c	bl 0x00c369a0
00a2f680	cbz x0,0x00a2f6e8
00a2f684	mov w1,#0x4
00a2f688	mov x21,x0
00a2f68c	bl 0x00c38dc0
00a2f690	mov x0,x20
00a2f694	bl 0x00c38be0
00a2f698	add w1,w0,#0x2
00a2f69c	mov x0,x21
00a2f6a0	bl 0x00c38e80
00a2f6a4	cbz x0,0x00a2f6dc
00a2f6a8	ldr x0,[x19, #0x28]
00a2f6ac	bl 0x00c322e0
00a2f6b0	ldr x8,[x19, #0x68]
00a2f6b4	mov w0,#0x1
00a2f6b8	str x21,[x19, #0x28]
00a2f6bc	add x8,x8,#0x1
00a2f6c0	str x8,[x19, #0x68]
00a2f6c4	b 0x00a2f6e8
00a2f6c8	ldr x0,[x19, #0x28]
00a2f6cc	bl 0x00c322e0
00a2f6d0	mov w0,wzr
00a2f6d4	str xzr,[x19, #0x28]
00a2f6d8	b 0x00a2f6e8
00a2f6dc	mov x0,x21
00a2f6e0	bl 0x00c322e0
00a2f6e4	mov w0,wzr
00a2f6e8	ldp x29,x30,[sp, #0x20]
00a2f6ec	ldp x20,x19,[sp, #0x10]
00a2f6f0	ldr x21,[sp], #0x30
00a2f6f4	ret
