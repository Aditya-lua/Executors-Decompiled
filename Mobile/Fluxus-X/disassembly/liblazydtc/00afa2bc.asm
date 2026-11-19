; X509v3_asid_validate_path @ 00afa2bc
00afa2bc	str x19,[sp, #-0x20]!
00afa2c0	stp x29,x30,[sp, #0x10]
00afa2c4	mov x19,x0
00afa2c8	ldr x0,[x0, #0x98]
00afa2cc	add x29,sp,#0x10
00afa2d0	cbz x0,0x00afa2fc
00afa2d4	bl 0x00c325e0
00afa2d8	cbz w0,0x00afa2fc
00afa2dc	ldr x8,[x19, #0x38]
00afa2e0	cbz x8,0x00afa2fc
00afa2e4	ldr x1,[x19, #0x98]
00afa2e8	ldp x29,x30,[sp, #0x10]
00afa2ec	mov x0,x19
00afa2f0	mov x2,xzr
00afa2f4	ldr x19,[sp], #0x20
00afa2f8	b 0x00afa314
00afa2fc	mov w8,#0x1
00afa300	str w8,[x19, #0xb0]
00afa304	ldp x29,x30,[sp, #0x10]
00afa308	mov w0,wzr
00afa30c	ldr x19,[sp], #0x20
00afa310	ret
