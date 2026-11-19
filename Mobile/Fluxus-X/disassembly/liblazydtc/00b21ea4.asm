; FUN_00b21ea4 @ 00b21ea4
00b21ea4	stp x20,x19,[sp, #-0x20]!
00b21ea8	stp x29,x30,[sp, #0x10]
00b21eac	add x29,sp,#0x10
00b21eb0	cbz x0,0x00b21f04
00b21eb4	adrp x8,0x29d000
00b21eb8	add x8,x8,#0xe2e
00b21ebc	mov x20,x0
00b21ec0	mov x0,x1
00b21ec4	mov x1,x8
00b21ec8	bl 0x00c3e8c0
00b21ecc	cbz x0,0x00b21f00
00b21ed0	mov x19,x0
00b21ed4	add x0,x20,#0x10
00b21ed8	bl 0x00c41160
00b21edc	cbz x0,0x00b21eec
00b21ee0	bl 0x00c36230
00b21ee4	mov x1,x0
00b21ee8	b 0x00b21ef4
00b21eec	adrp x1,0x2ab000
00b21ef0	add x1,x1,#0x32c
00b21ef4	mov x0,x19
00b21ef8	bl 0x00c3dad0
00b21efc	cbz w0,0x00b21f04
00b21f00	mov w0,#0x1
00b21f04	ldp x29,x30,[sp, #0x10]
00b21f08	ldp x20,x19,[sp], #0x20
00b21f0c	ret
