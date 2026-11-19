; FUN_00bf6b9c @ 00bf6b9c
00bf6b9c	paciasp
00bf6ba0	stp x29,x30,[sp, #-0x30]!
00bf6ba4	str x21,[sp, #0x10]
00bf6ba8	stp x20,x19,[sp, #0x20]
00bf6bac	mov x29,sp
00bf6bb0	adrp x8,0xcb5000
00bf6bb4	movi v0.2D,#0x0
00bf6bb8	sub x9,x2,#0x1
00bf6bbc	ldr x8,[x8, #0xdf0]
00bf6bc0	mov x21,x0
00bf6bc4	mov x19,x0
00bf6bc8	add x8,x8,#0x10
00bf6bcc	stp x8,x9,[x0]
00bf6bd0	str q0,[x21, #0x18]!
00bf6bd4	stur q0,[x0, #0x28]
00bf6bd8	stur q0,[x0, #0x38]
00bf6bdc	stur q0,[x0, #0x48]
00bf6be0	stur q0,[x0, #0x58]
00bf6be4	stur q0,[x0, #0x68]
00bf6be8	ldrb w8,[x1]
00bf6bec	ldr x9,[x1, #0x10]
00bf6bf0	tst w8,#0x1
00bf6bf4	csinc x1,x9,x1,ne
00bf6bf8	bl 0x00c44440
00bf6bfc	ldp x20,x19,[sp, #0x20]
00bf6c00	ldr x21,[sp, #0x10]
00bf6c04	ldp x29,x30,[sp], #0x30
00bf6c08	autiasp
00bf6c0c	ret
