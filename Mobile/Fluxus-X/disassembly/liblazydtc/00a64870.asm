; EVP_KDF_CTX_gettable_params @ 00a64870
00a64870	str x19,[sp, #-0x20]!
00a64874	stp x29,x30,[sp, #0x10]
00a64878	mov x19,x0
00a6487c	ldr x0,[x0]
00a64880	add x29,sp,#0x10
00a64884	ldr x8,[x0, #0x60]
00a64888	cbz x8,0x00a648b0
00a6488c	bl 0x00c3d260
00a64890	bl 0x00c3b680
00a64894	ldp x9,x8,[x19]
00a64898	ldp x29,x30,[sp, #0x10]
00a6489c	mov x1,x0
00a648a0	ldr x2,[x9, #0x60]
00a648a4	mov x0,x8
00a648a8	ldr x19,[sp], #0x20
00a648ac	br x2
00a648b0	ldp x29,x30,[sp, #0x10]
00a648b4	mov x0,xzr
00a648b8	ldr x19,[sp], #0x20
00a648bc	ret
