; EVP_MD_meth_dup @ 00a5f7a0
00a5f7a0	stp x22,x21,[sp, #-0x30]!
00a5f7a4	stp x20,x19,[sp, #0x10]
00a5f7a8	stp x29,x30,[sp, #0x20]
00a5f7ac	ldr x8,[x0, #0x70]
00a5f7b0	mov x19,xzr
00a5f7b4	add x29,sp,#0x20
00a5f7b8	cbnz x8,0x00a5f7f8
00a5f7bc	ldr x21,[x0]
00a5f7c0	mov x20,x0
00a5f7c4	bl 0x00c3c290
00a5f7c8	mov x19,x0
00a5f7cc	cbz x0,0x00a5f7f8
00a5f7d0	ldr x22,[x19, #0x80]
00a5f7d4	str x21,[x19]
00a5f7d8	mov w21,#0x2
00a5f7dc	orr w2,wzr,#0xf0
00a5f7e0	mov x0,x19
00a5f7e4	mov x1,x20
00a5f7e8	str w21,[x19, #0x18]
00a5f7ec	bl 0x00c2ffd0
00a5f7f0	str x22,[x19, #0x80]
00a5f7f4	str w21,[x19, #0x18]
00a5f7f8	mov x0,x19
00a5f7fc	ldp x29,x30,[sp, #0x20]
00a5f800	ldp x20,x19,[sp, #0x10]
00a5f804	ldp x22,x21,[sp], #0x30
00a5f808	ret
