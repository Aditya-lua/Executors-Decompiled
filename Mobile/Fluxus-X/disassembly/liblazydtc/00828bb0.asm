; FUN_00828bb0 @ 00828bb0
00828bb0	stp x29,x30,[sp, #-0x10]!
00828bb4	mov x29,sp
00828bb8	adrp x8,0xd1d000
00828bbc	add x8,x8,#0x120
00828bc0	ldarb w8,[x8]
00828bc4	tbz w8,#0x0,0x00828bd0
00828bc8	ldp x29,x30,[sp], #0x10
00828bcc	ret
00828bd0	adrp x0,0xd1d000
00828bd4	add x0,x0,#0x120
00828bd8	bl 0x00c2fe90
00828bdc	cbz w0,0x00828bc8
00828be0	adrp x8,0x29a000
00828be4	mov w9,#0x1
00828be8	adrp x1,0xd1d000
00828bec	add x1,x1,#0x110
00828bf0	ldr d0,[x8, #0x5c8]
00828bf4	nop
00828bf8	adr x0,0x828c50
00828bfc	adrp x2,0xc48000
00828c00	add x2,x2,#0x880
00828c04	strb w9,[x1, #0x8]
00828c08	str d0,[x1]
00828c0c	bl 0x00c2fe70
00828c10	adrp x0,0xd1d000
00828c14	add x0,x0,#0x120
00828c18	ldp x29,x30,[sp], #0x10
00828c1c	b 0x00c2fea0
