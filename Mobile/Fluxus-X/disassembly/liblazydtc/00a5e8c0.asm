; EVP_CIPHER_CTX_get_iv_length @ 00a5e8c0
00a5e8c0	sub sp,sp,#0xb0
00a5e8c4	stp x20,x19,[sp, #0x90]
00a5e8c8	stp x29,x30,[sp, #0xa0]
00a5e8cc	mov x19,x0
00a5e8d0	ldr w0,[x0, #0x6c]
00a5e8d4	add x29,sp,#0xa0
00a5e8d8	tbz w0,#0x1f,0x00a5e9a0
00a5e8dc	ldr x20,[x19]
00a5e8e0	add x0,sp,#0x30
00a5e8e4	mov w2,#0x50
00a5e8e8	mov w1,wzr
00a5e8ec	ldrsw x8,[x20, #0xc]
00a5e8f0	stur w8,[x29, #-0x14]
00a5e8f4	stur x8,[x29, #-0x20]
00a5e8f8	bl 0x00c301c0
00a5e8fc	ldr x8,[x20, #0xd8]
00a5e900	cbz x8,0x00a5e964
00a5e904	adrp x0,0x2c3000
00a5e908	add x0,x0,#0x9bc
00a5e90c	add x8,sp,#0x8
00a5e910	sub x1,x29,#0x20
00a5e914	bl 0x00c36270
00a5e918	ldr x8,[sp, #0x28]
00a5e91c	ldur q0,[sp, #0x18]
00a5e920	ldur q1,[sp, #0x8]
00a5e924	add x2,sp,#0x30
00a5e928	str x8,[sp, #0x50]
00a5e92c	stp q1,q0,[sp, #0x30]
00a5e930	ldr x0,[x19]
00a5e934	ldr x1,[x19, #0xa8]
00a5e938	bl 0x00c3cd60
00a5e93c	cmp w0,#0x1
00a5e940	b.lt 0x00a5e994
00a5e944	add x0,sp,#0x30
00a5e948	bl 0x00c3d030
00a5e94c	cbz w0,0x00a5e988
00a5e950	add x0,sp,#0x30
00a5e954	sub x1,x29,#0x14
00a5e958	bl 0x00c36510
00a5e95c	cbnz w0,0x00a5e988
00a5e960	b 0x00a5e99c
00a5e964	ldrb w8,[x20, #0x11]
00a5e968	tbz w8,#0x3,0x00a5e988
00a5e96c	mov w1,#0x25
00a5e970	sub x3,x29,#0x14
00a5e974	mov x0,x19
00a5e978	mov w2,wzr
00a5e97c	bl 0x00c361b0
00a5e980	cmp w0,#0x1
00a5e984	b.lt 0x00a5e99c
00a5e988	ldur w0,[x29, #-0x14]
00a5e98c	str w0,[x19, #0x6c]
00a5e990	b 0x00a5e9a0
00a5e994	cmn w0,#0x1
00a5e998	b.eq 0x00a5e988
00a5e99c	mov w0,#0xffffffff
00a5e9a0	ldp x29,x30,[sp, #0xa0]
00a5e9a4	ldp x20,x19,[sp, #0x90]
00a5e9a8	add sp,sp,#0xb0
00a5e9ac	ret
