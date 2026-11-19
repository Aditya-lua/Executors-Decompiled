; CRYPTO_ocb128_cleanup @ 00aac4a0
00aac4a0	cbz x0,0x00aac4e4
00aac4a4	str x19,[sp, #-0x20]!
00aac4a8	stp x29,x30,[sp, #0x10]
00aac4ac	ldr x8,[x0, #0x30]
00aac4b0	mov x19,x0
00aac4b4	ldr x0,[x0, #0x58]
00aac4b8	adrp x2,0x2a6000
00aac4bc	lsl x1,x8,#0x4
00aac4c0	add x2,x2,#0x3f0
00aac4c4	mov w3,#0x22d
00aac4c8	add x29,sp,#0x10
00aac4cc	bl 0x00c345e0
00aac4d0	ldp x29,x30,[sp, #0x10]
00aac4d4	mov w1,#0xb0
00aac4d8	mov x0,x19
00aac4dc	ldr x19,[sp], #0x20
00aac4e0	b 0x00c34750
00aac4e4	ret
