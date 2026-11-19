; X509v3_asid_validate_resource_set @ 00afa754
00afa754	str x21,[sp, #-0x30]!
00afa758	stp x20,x19,[sp, #0x10]
00afa75c	stp x29,x30,[sp, #0x20]
00afa760	add x29,sp,#0x20
00afa764	cbz x1,0x00afa7a4
00afa768	mov x20,x0
00afa76c	cbz x0,0x00afa7cc
00afa770	mov x0,x20
00afa774	mov w21,w2
00afa778	mov x19,x1
00afa77c	bl 0x00c325e0
00afa780	cbz w0,0x00afa7d0
00afa784	cbz w21,0x00afa7ac
00afa788	mov x1,x20
00afa78c	mov x2,x19
00afa790	ldp x29,x30,[sp, #0x20]
00afa794	ldp x20,x19,[sp, #0x10]
00afa798	mov x0,xzr
00afa79c	ldr x21,[sp], #0x30
00afa7a0	b 0x00afa314
00afa7a4	mov w0,#0x1
00afa7a8	b 0x00afa7d0
00afa7ac	ldr x8,[x19]
00afa7b0	cbz x8,0x00afa7bc
00afa7b4	ldr w8,[x8]
00afa7b8	cbz w8,0x00afa7cc
00afa7bc	ldr x8,[x19, #0x8]
00afa7c0	cbz x8,0x00afa788
00afa7c4	ldr w8,[x8]
00afa7c8	cbnz w8,0x00afa788
00afa7cc	mov w0,wzr
00afa7d0	ldp x29,x30,[sp, #0x20]
00afa7d4	ldp x20,x19,[sp, #0x10]
00afa7d8	ldr x21,[sp], #0x30
00afa7dc	ret
