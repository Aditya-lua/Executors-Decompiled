; FUN_00b20ba4 @ 00b20ba4
00b20ba4	stp x20,x19,[sp, #-0x20]!
00b20ba8	stp x29,x30,[sp, #0x10]
00b20bac	add x29,sp,#0x10
00b20bb0	mov x19,x0
00b20bb4	bl 0x00c41000
00b20bb8	cbz w0,0x00b20be8
00b20bbc	adrp x1,0x2ae000
00b20bc0	add x1,x1,#0x9e1
00b20bc4	mov w0,#0x40
00b20bc8	mov w2,#0x56
00b20bcc	bl 0x00c34250
00b20bd0	mov x20,x0
00b20bd4	cbz x0,0x00b20bec
00b20bd8	mov x0,x19
00b20bdc	bl 0x00c41210
00b20be0	str x0,[x20]
00b20be4	b 0x00b20bec
00b20be8	mov x20,xzr
00b20bec	ldp x29,x30,[sp, #0x10]
00b20bf0	mov x0,x20
00b20bf4	ldp x20,x19,[sp], #0x20
00b20bf8	ret
