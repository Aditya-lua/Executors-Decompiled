; SSL_use_PrivateKey_ASN1 @ 009bbb2c
009bbb2c	sub sp,sp,#0x30
009bbb30	stp x20,x19,[sp, #0x10]
009bbb34	stp x29,x30,[sp, #0x20]
009bbb38	str x2,[sp, #0x8]
009bbb3c	ldr x8,[x1, #0x9a8]
009bbb40	mov x19,x1
009bbb44	add x2,sp,#0x8
009bbb48	mov x1,xzr
009bbb4c	ldr x4,[x8]
009bbb50	ldr x5,[x8, #0x440]
009bbb54	add x29,sp,#0x20
009bbb58	bl 0x00c35ff0
009bbb5c	cbz x0,0x009bbb80
009bbb60	mov x20,x0
009bbb64	ldr x0,[x19, #0x898]
009bbb68	mov x1,x20
009bbb6c	bl 0x009bb8c0
009bbb70	mov w19,w0
009bbb74	mov x0,x20
009bbb78	bl 0x00c32450
009bbb7c	b 0x009bbbb4
009bbb80	bl 0x00c342a0
009bbb84	adrp x0,0x2db000
009bbb88	adrp x2,0x2a1000
009bbb8c	add x0,x0,#0xaec
009bbb90	add x2,x2,#0xf86
009bbb94	mov w1,#0xca
009bbb98	bl 0x00c342b0
009bbb9c	mov w1,#0xd
009bbba0	mov w0,#0x14
009bbba4	movk w1,#0x8, LSL #16
009bbba8	mov x2,xzr
009bbbac	bl 0x00c342c0
009bbbb0	mov w19,wzr
009bbbb4	mov w0,w19
009bbbb8	ldp x29,x30,[sp, #0x20]
009bbbbc	ldp x20,x19,[sp, #0x10]
009bbbc0	add sp,sp,#0x30
009bbbc4	ret
