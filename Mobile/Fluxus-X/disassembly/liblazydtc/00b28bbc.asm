; FUN_00b28bbc @ 00b28bbc
00b28bbc	stp x20,x19,[sp, #-0x20]!
00b28bc0	stp x29,x30,[sp, #0x10]
00b28bc4	add x29,sp,#0x10
00b28bc8	mov x19,x0
00b28bcc	bl 0x00c41000
00b28bd0	cbz w0,0x00b28c10
00b28bd4	adrp x1,0x2ac000
00b28bd8	add x1,x1,#0xa10
00b28bdc	mov w0,#0x3d8
00b28be0	mov w2,#0x17
00b28be4	bl 0x00c34250
00b28be8	mov x20,x0
00b28bec	cbz x0,0x00b28c14
00b28bf0	mov w0,#0x80
00b28bf4	bl 0x00c41440
00b28bf8	mov x3,x0
00b28bfc	mov w2,#0x80
00b28c00	mov x0,x19
00b28c04	mov x1,x20
00b28c08	bl 0x00c41340
00b28c0c	b 0x00b28c14
00b28c10	mov x20,xzr
00b28c14	ldp x29,x30,[sp, #0x10]
00b28c18	mov x0,x20
00b28c1c	ldp x20,x19,[sp], #0x20
00b28c20	ret
