; ZSTD_freeDCtx @ 00bafc84
00bafc84	cbz x0,0x00bafd68
00bafc88	stp x29,x30,[sp, #-0x30]!
00bafc8c	stp x22,x21,[sp, #0x10]
00bafc90	stp x20,x19,[sp, #0x20]
00bafc94	mov x29,sp
00bafc98	ldr x8,[x0, #0x75d8]
00bafc9c	mov x19,x0
00bafca0	cbz x8,0x00bafcac
00bafca4	mov x0,#-0x40
00bafca8	b 0x00bafd5c
00bafcac	ldr x0,[x19, #0x75e8]
00bafcb0	ldr x22,[x19, #0x75b8]
00bafcb4	ldr x20,[x19, #0x75c0]
00bafcb8	bl 0x00c435b0
00bafcbc	movi v0.2D,#0x0
00bafcc0	mov w8,#0x7600
00bafcc4	ldr x1,[x19, #0x7620]
00bafcc8	str wzr,[x19, x8#0x0]
00bafccc	mov w8,#0x75e8
00bafcd0	str q0,[x19,x8]
00bafcd4	cbz x1,0x00bafcf0
00bafcd8	cbz x22,0x00bafce8
00bafcdc	mov x0,x20
00bafce0	blr x22
00bafce4	b 0x00bafcf0
00bafce8	mov x0,x1
00bafcec	bl 0x00c30960
00bafcf0	ldr x21,[x19, #0x7608]
00bafcf4	str xzr,[x19, #0x7620]
00bafcf8	cbz x21,0x00bafd3c
00bafcfc	ldr x1,[x21]
00bafd00	cbz x1,0x00bafd14
00bafd04	cbz x22,0x00bafd28
00bafd08	mov x0,x20
00bafd0c	blr x22
00bafd10	b 0x00bafd18
00bafd14	cbz x22,0x00bafd30
00bafd18	mov x0,x20
00bafd1c	mov x1,x21
00bafd20	blr x22
00bafd24	b 0x00bafd38
00bafd28	mov x0,x1
00bafd2c	bl 0x00c30960
00bafd30	mov x0,x21
00bafd34	bl 0x00c30960
00bafd38	str xzr,[x19, #0x7608]
00bafd3c	cbz x22,0x00bafd50
00bafd40	mov x0,x20
00bafd44	mov x1,x19
00bafd48	blr x22
00bafd4c	b 0x00bafd58
00bafd50	mov x0,x19
00bafd54	bl 0x00c30960
00bafd58	mov x0,xzr
00bafd5c	ldp x20,x19,[sp, #0x20]
00bafd60	ldp x22,x21,[sp, #0x10]
00bafd64	ldp x29,x30,[sp], #0x30
00bafd68	ret
