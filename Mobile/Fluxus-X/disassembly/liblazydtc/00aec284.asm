; OSSL_STORE_do_all_loaders @ 00aec284
00aec284	str x21,[sp, #-0x30]!
00aec288	adrp x21,0xd22000
00aec28c	ldr x8,[x21, #0x318]
00aec290	stp x20,x19,[sp, #0x10]
00aec294	mov x19,x1
00aec298	mov x20,x0
00aec29c	stp x29,x30,[sp, #0x20]
00aec2a0	add x29,sp,#0x20
00aec2a4	cbnz x8,0x00aec2c8
00aec2a8	adrp x0,0xaec000
00aec2ac	adrp x1,0xaec000
00aec2b0	add x0,x0,#0x2ec
00aec2b4	add x1,x1,#0x2f4
00aec2b8	bl 0x00c34dd0
00aec2bc	mov x8,x0
00aec2c0	str x0,[x21, #0x318]
00aec2c4	cbz x0,0x00aec2d8
00aec2c8	mov x0,x8
00aec2cc	mov x1,x20
00aec2d0	mov x2,x19
00aec2d4	bl 0x00c395c0
00aec2d8	ldp x29,x30,[sp, #0x20]
00aec2dc	ldp x20,x19,[sp, #0x10]
00aec2e0	mov w0,#0x1
00aec2e4	ldr x21,[sp], #0x30
00aec2e8	ret
