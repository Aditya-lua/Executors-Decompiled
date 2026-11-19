; OSSL_PARAM_BLD_push_utf8_ptr @ 00a9d768
00a9d768	str x21,[sp, #-0x30]!
00a9d76c	stp x20,x19,[sp, #0x10]
00a9d770	mov x8,x3
00a9d774	mov x19,x2
00a9d778	mov x20,x1
00a9d77c	mov x21,x0
00a9d780	stp x29,x30,[sp, #0x20]
00a9d784	add x29,sp,#0x20
00a9d788	cbz x3,0x00a9d7c8
00a9d78c	lsr x9,x8,#0x1f
00a9d790	cbz x9,0x00a9d7dc
00a9d794	bl 0x00c342a0
00a9d798	adrp x0,0x29e000
00a9d79c	adrp x2,0x2da000
00a9d7a0	add x0,x0,#0x440
00a9d7a4	add x2,x2,#0x10c
00a9d7a8	mov w1,#0x108
00a9d7ac	bl 0x00c342b0
00a9d7b0	orr w0,wzr,#0xf
00a9d7b4	orr w1,wzr,#0x70
00a9d7b8	mov x2,xzr
00a9d7bc	bl 0x00c342c0
00a9d7c0	mov w0,wzr
00a9d7c4	b 0x00a9d804
00a9d7c8	mov x0,x19
00a9d7cc	bl 0x00c2ff50
00a9d7d0	mov x8,x0
00a9d7d4	lsr x9,x8,#0x1f
00a9d7d8	cbnz x9,0x00a9d794
00a9d7dc	mov w3,#0x8
00a9d7e0	orr w4,wzr,#0x6
00a9d7e4	mov x0,x21
00a9d7e8	mov x1,x20
00a9d7ec	mov w2,w8
00a9d7f0	mov w5,wzr
00a9d7f4	bl 0x00a9d5b4
00a9d7f8	cbz x0,0x00a9d804
00a9d7fc	str x19,[x0, #0x28]
00a9d800	mov w0,#0x1
00a9d804	ldp x29,x30,[sp, #0x20]
00a9d808	ldp x20,x19,[sp, #0x10]
00a9d80c	ldr x21,[sp], #0x30
00a9d810	ret
