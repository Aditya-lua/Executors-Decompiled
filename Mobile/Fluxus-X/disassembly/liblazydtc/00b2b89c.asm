; ossl_cipher_cbc_cts_mode_name2id @ 00b2b89c
00b2b89c	str x19,[sp, #-0x20]!
00b2b8a0	adrp x1,0x2a3000
00b2b8a4	add x1,x1,#0xa2
00b2b8a8	stp x29,x30,[sp, #0x10]
00b2b8ac	add x29,sp,#0x10
00b2b8b0	mov x19,x0
00b2b8b4	bl 0x00c35ee0
00b2b8b8	cbz w0,0x00b2b8ec
00b2b8bc	adrp x1,0x2ce000
00b2b8c0	add x1,x1,#0x7fb
00b2b8c4	mov x0,x19
00b2b8c8	bl 0x00c35ee0
00b2b8cc	cbz w0,0x00b2b8f4
00b2b8d0	adrp x1,0x2d6000
00b2b8d4	add x1,x1,#0xb26
00b2b8d8	mov x0,x19
00b2b8dc	bl 0x00c35ee0
00b2b8e0	cbz w0,0x00b2b8fc
00b2b8e4	mov w0,#0xffffffff
00b2b8e8	b 0x00b2b910
00b2b8ec	mov x8,xzr
00b2b8f0	b 0x00b2b900
00b2b8f4	mov w8,#0x1
00b2b8f8	b 0x00b2b900
00b2b8fc	mov w8,#0x2
00b2b900	adrp x9,0xc93000
00b2b904	lsl x8,x8,#0x4
00b2b908	add x9,x9,#0x988
00b2b90c	ldr w0,[x9, x8#0x0]
00b2b910	ldp x29,x30,[sp, #0x10]
00b2b914	ldr x19,[sp], #0x20
00b2b918	ret
