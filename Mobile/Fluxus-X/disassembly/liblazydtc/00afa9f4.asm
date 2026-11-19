; FUN_00afa9f4 @ 00afa9f4
00afa9f4	stp x26,x25,[sp, #-0x50]!
00afa9f8	adrp x0,0xc7e000
00afa9fc	add x0,x0,#0xe40
00afaa00	stp x24,x23,[sp, #0x10]
00afaa04	stp x22,x21,[sp, #0x20]
00afaa08	stp x20,x19,[sp, #0x30]
00afaa0c	stp x29,x30,[sp, #0x40]
00afaa10	add x29,sp,#0x40
00afaa14	mov x20,x2
00afaa18	bl 0x00c372e0
00afaa1c	mov x19,x0
00afaa20	cbz x0,0x00afaabc
00afaa24	mov x0,x20
00afaa28	bl 0x00c325e0
00afaa2c	cmp w0,#0x1
00afaa30	b.lt 0x00afab4c
00afaa34	adrp x23,0x2cd000
00afaa38	adrp x24,0x2c2000
00afaa3c	mov w21,wzr
00afaa40	add x22,x19,#0x8
00afaa44	add x23,x23,#0x6b0
00afaa48	add x24,x24,#0x4f1
00afaa4c	mov x0,x20
00afaa50	mov w1,w21
00afaa54	bl 0x00c32610
00afaa58	ldr x26,[x0, #0x8]
00afaa5c	mov x25,x0
00afaa60	mov x1,x23
00afaa64	mov x0,x26
00afaa68	bl 0x00c301f0
00afaa6c	cbz w0,0x00afaa94
00afaa70	mov x0,x26
00afaa74	mov x1,x24
00afaa78	bl 0x00c301f0
00afaa7c	cbnz w0,0x00afaaf0
00afaa80	mov x0,x25
00afaa84	mov x1,x22
00afaa88	bl 0x00c408f0
00afaa8c	cbnz w0,0x00afaaa4
00afaa90	b 0x00afab38
00afaa94	mov x0,x25
00afaa98	mov x1,x19
00afaa9c	bl 0x00c396c0
00afaaa0	cbz w0,0x00afab38
00afaaa4	mov x0,x20
00afaaa8	add w21,w21,#0x1
00afaaac	bl 0x00c325e0
00afaab0	cmp w21,w0
00afaab4	b.lt 0x00afaa4c
00afaab8	b 0x00afab4c
00afaabc	bl 0x00c342a0
00afaac0	adrp x0,0x2a0000
00afaac4	adrp x2,0x2b2000
00afaac8	add x0,x0,#0xd01
00afaacc	add x2,x2,#0xc66
00afaad0	mov w1,#0x40
00afaad4	bl 0x00c342b0
00afaad8	mov w1,#0x100
00afaadc	mov w0,#0x22
00afaae0	movk w1,#0xc, LSL #16
00afaae4	mov x2,xzr
00afaae8	bl 0x00c342c0
00afaaec	b 0x00afab4c
00afaaf0	bl 0x00c342a0
00afaaf4	adrp x0,0x2a0000
00afaaf8	adrp x2,0x2b2000
00afaafc	add x0,x0,#0xd01
00afab00	add x2,x2,#0xc66
00afab04	mov w1,#0x4c
00afab08	bl 0x00c342b0
00afab0c	mov w0,#0x22
00afab10	mov w1,#0x6a
00afab14	mov x2,xzr
00afab18	bl 0x00c342c0
00afab1c	ldp x2,x4,[x25, #0x8]
00afab20	adrp x1,0x2cc000
00afab24	adrp x3,0x2aa000
00afab28	add x1,x1,#0x165
00afab2c	add x3,x3,#0xa36
00afab30	mov w0,#0x4
00afab34	bl 0x00c37fb0
00afab38	adrp x1,0xc7e000
00afab3c	add x1,x1,#0xe40
00afab40	mov x0,x19
00afab44	bl 0x00c36160
00afab48	mov x19,xzr
00afab4c	mov x0,x19
00afab50	ldp x29,x30,[sp, #0x40]
00afab54	ldp x20,x19,[sp, #0x30]
00afab58	ldp x22,x21,[sp, #0x20]
00afab5c	ldp x24,x23,[sp, #0x10]
00afab60	ldp x26,x25,[sp], #0x50
00afab64	ret
