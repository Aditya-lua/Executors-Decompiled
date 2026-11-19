; FUN_00870bb8 @ 00870bb8
00870bb8	stp x29,x30,[sp, #-0x10]!
00870bbc	mov x29,sp
00870bc0	mov w0,#0x8
00870bc4	bl 0x00c30000
00870bc8	adrp x8,0xcb4000
00870bcc	adrp x1,0xcb4000
00870bd0	adrp x2,0xcb4000
00870bd4	ldr x8,[x8, #0xb50]
00870bd8	add x8,x8,#0x10
00870bdc	str x8,[x0]
00870be0	ldr x1,[x1, #0xb58]
00870be4	ldr x2,[x2, #0xb60]
00870be8	bl 0x00c30020
