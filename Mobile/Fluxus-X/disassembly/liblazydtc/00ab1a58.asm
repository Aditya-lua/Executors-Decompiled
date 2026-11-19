; FUN_00ab1a58 @ 00ab1a58
00ab1a58	str x23,[sp, #-0x40]!
00ab1a5c	stp x22,x21,[sp, #0x10]
00ab1a60	adrp x22,0x2ab000
00ab1a64	mov x21,x1
00ab1a68	adrp x1,0x2b6000
00ab1a6c	add x22,x22,#0x32c
00ab1a70	add x1,x1,#0x2b7
00ab1a74	mov x3,x22
00ab1a78	stp x20,x19,[sp, #0x20]
00ab1a7c	stp x29,x30,[sp, #0x30]
00ab1a80	add x29,sp,#0x30
00ab1a84	mov w20,w2
00ab1a88	mov x19,x0
00ab1a8c	bl 0x00c32250
00ab1a90	add w20,w20,#0x2
00ab1a94	adrp x1,0x2ce000
00ab1a98	add x1,x1,#0x12b
00ab1a9c	mov x0,x19
00ab1aa0	mov w2,w20
00ab1aa4	mov x3,x22
00ab1aa8	bl 0x00c32250
00ab1aac	mov x23,x21
00ab1ab0	ldr x1,[x23], #0x40
00ab1ab4	mov x0,x19
00ab1ab8	bl 0x00c32da0
00ab1abc	adrp x1,0x2b6000
00ab1ac0	add x1,x1,#0x2cb
00ab1ac4	mov x0,x19
00ab1ac8	mov w2,w20
00ab1acc	mov x3,x22
00ab1ad0	bl 0x00c32250
00ab1ad4	add x1,x21,#0x10
00ab1ad8	mov x0,x19
00ab1adc	mov w2,wzr
00ab1ae0	bl 0x00c37de0
00ab1ae4	adrp x1,0x2d6000
00ab1ae8	add x1,x1,#0x3ed
00ab1aec	mov x0,x19
00ab1af0	mov w2,w20
00ab1af4	mov x3,x22
00ab1af8	bl 0x00c32250
00ab1afc	add x1,x21,#0x28
00ab1b00	mov x0,x19
00ab1b04	mov w2,wzr
00ab1b08	bl 0x00c37de0
00ab1b0c	adrp x1,0x2aa000
00ab1b10	add x1,x1,#0x7fe
00ab1b14	mov x0,x19
00ab1b18	mov w2,w20
00ab1b1c	mov x3,x22
00ab1b20	bl 0x00c32250
00ab1b24	mov x0,x19
00ab1b28	mov x1,x23
00ab1b2c	bl 0x00c37dd0
00ab1b30	mov x0,x19
00ab1b34	ldp x29,x30,[sp, #0x30]
00ab1b38	ldp x20,x19,[sp, #0x20]
00ab1b3c	ldp x22,x21,[sp, #0x10]
00ab1b40	adrp x1,0x2c4000
00ab1b44	add x1,x1,#0xdae
00ab1b48	ldr x23,[sp], #0x40
00ab1b4c	b 0x00c32250
