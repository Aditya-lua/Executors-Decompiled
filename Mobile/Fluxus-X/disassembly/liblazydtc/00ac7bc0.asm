; FUN_00ac7bc0 @ 00ac7bc0
00ac7bc0	stp x20,x19,[sp, #-0x20]!
00ac7bc4	stp x29,x30,[sp, #0x10]
00ac7bc8	add x29,sp,#0x10
00ac7bcc	bl 0x00c34d50
00ac7bd0	adrp x19,0xd22000
00ac7bd4	str x0,[x19, #0x200]
00ac7bd8	cbz x0,0x00ac7c04
00ac7bdc	bl 0x00c34d50
00ac7be0	adrp x20,0xd22000
00ac7be4	str x0,[x20, #0x208]
00ac7be8	cbz x0,0x00ac7c10
00ac7bec	bl 0x00c3f980
00ac7bf0	cbz w0,0x00ac7c0c
00ac7bf4	adrp x9,0xd22000
00ac7bf8	mov w8,#0x1
00ac7bfc	strb w8,[x9, #0x1f8]
00ac7c00	b 0x00ac7c28
00ac7c04	mov w8,wzr
00ac7c08	b 0x00ac7c28
00ac7c0c	ldr x0,[x20, #0x208]
00ac7c10	bl 0x00c34d40
00ac7c14	ldr x0,[x19, #0x200]
00ac7c18	str xzr,[x20, #0x208]
00ac7c1c	bl 0x00c34d40
00ac7c20	mov w8,wzr
00ac7c24	str xzr,[x19, #0x200]
00ac7c28	ldp x29,x30,[sp, #0x10]
00ac7c2c	adrp x9,0xd22000
00ac7c30	str w8,[x9, #0x214]
00ac7c34	ldp x20,x19,[sp], #0x20
00ac7c38	ret
