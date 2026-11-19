; ECDH_compute_key @ 00a2fee8
00a2fee8	sub sp,sp,#0x50
00a2feec	stp x22,x21,[sp, #0x20]
00a2fef0	stp x20,x19,[sp, #0x30]
00a2fef4	stp x29,x30,[sp, #0x40]
00a2fef8	stp xzr,x1,[sp, #0x10]
00a2fefc	ldr x8,[x3]
00a2ff00	add x29,sp,#0x40
00a2ff04	ldr x8,[x8, #0x48]
00a2ff08	cbz x8,0x00a2ff40
00a2ff0c	mov x20,x1
00a2ff10	lsr x9,x1,#0x1f
00a2ff14	cbz x9,0x00a2ff74
00a2ff18	bl 0x00c342a0
00a2ff1c	adrp x0,0x2cd000
00a2ff20	adrp x2,0x2b5000
00a2ff24	add x0,x0,#0x943
00a2ff28	add x2,x2,#0xba0
00a2ff2c	mov w1,#0xa6
00a2ff30	bl 0x00c342b0
00a2ff34	mov w0,#0x10
00a2ff38	mov w1,#0xa1
00a2ff3c	b 0x00a2ff64
00a2ff40	bl 0x00c342a0
00a2ff44	adrp x0,0x2cd000
00a2ff48	adrp x2,0x2b5000
00a2ff4c	add x0,x0,#0x943
00a2ff50	add x2,x2,#0xba0
00a2ff54	mov w1,#0xa2
00a2ff58	bl 0x00c342b0
00a2ff5c	mov w0,#0x10
00a2ff60	mov w1,#0x98
00a2ff64	mov x2,xzr
00a2ff68	bl 0x00c342c0
00a2ff6c	mov w0,wzr
00a2ff70	b 0x00a2ffec
00a2ff74	mov x19,x0
00a2ff78	add x0,sp,#0x10
00a2ff7c	add x1,sp,#0x8
00a2ff80	mov x21,x4
00a2ff84	blr x8
00a2ff88	cbz w0,0x00a2ffec
00a2ff8c	cbz x21,0x00a2ffa8
00a2ff90	ldp x1,x0,[sp, #0x8]
00a2ff94	add x3,sp,#0x18
00a2ff98	mov x2,x19
00a2ff9c	blr x21
00a2ffa0	ldp x21,x22,[sp, #0x8]
00a2ffa4	b 0x00a2ffd0
00a2ffa8	ldr x21,[sp, #0x8]
00a2ffac	cmp x21,x20
00a2ffb0	b.cs 0x00a2ffbc
00a2ffb4	mov x20,x21
00a2ffb8	str x21,[sp, #0x18]
00a2ffbc	ldr x22,[sp, #0x10]
00a2ffc0	mov x0,x19
00a2ffc4	mov x2,x20
00a2ffc8	mov x1,x22
00a2ffcc	bl 0x00c2ffd0
00a2ffd0	adrp x2,0x2cd000
00a2ffd4	add x2,x2,#0x943
00a2ffd8	mov w3,#0xb2
00a2ffdc	mov x0,x22
00a2ffe0	mov x1,x21
00a2ffe4	bl 0x00c345e0
00a2ffe8	ldr w0,[sp, #0x18]
00a2ffec	ldp x29,x30,[sp, #0x40]
00a2fff0	ldp x20,x19,[sp, #0x30]
00a2fff4	ldp x22,x21,[sp, #0x20]
00a2fff8	add sp,sp,#0x50
00a2fffc	ret
