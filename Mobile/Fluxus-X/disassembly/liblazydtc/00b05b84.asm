; i2s_ASN1_ENUMERATED @ 00b05b84
00b05b84	stp x20,x19,[sp, #-0x20]!
00b05b88	stp x29,x30,[sp, #0x10]
00b05b8c	add x29,sp,#0x10
00b05b90	cbz x1,0x00b05bf8
00b05b94	mov x0,x1
00b05b98	mov x1,xzr
00b05b9c	bl 0x00c37550
00b05ba0	mov x19,x0
00b05ba4	cbz x0,0x00b05bb8
00b05ba8	mov x0,x19
00b05bac	bl 0x00b05c0c
00b05bb0	mov x20,x0
00b05bb4	cbnz x0,0x00b05bec
00b05bb8	bl 0x00c342a0
00b05bbc	adrp x0,0x2c2000
00b05bc0	adrp x2,0x2c8000
00b05bc4	add x0,x0,#0x5ca
00b05bc8	add x2,x2,#0x43d
00b05bcc	mov w1,#0xaf
00b05bd0	bl 0x00c342b0
00b05bd4	mov w1,#0x100
00b05bd8	mov w0,#0x22
00b05bdc	movk w1,#0xc, LSL #16
00b05be0	mov x2,xzr
00b05be4	bl 0x00c342c0
00b05be8	mov x20,xzr
00b05bec	mov x0,x19
00b05bf0	bl 0x00c36290
00b05bf4	b 0x00b05bfc
00b05bf8	mov x20,xzr
00b05bfc	ldp x29,x30,[sp, #0x10]
00b05c00	mov x0,x20
00b05c04	ldp x20,x19,[sp], #0x20
00b05c08	ret
