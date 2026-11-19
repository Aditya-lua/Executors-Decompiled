; FUN_00849b8c @ 00849b8c
00849b8c	stp x29,x30,[sp, #-0x20]!
00849b90	str x19,[sp, #0x10]
00849b94	mov x29,sp
00849b98	adrp x8,0xcb4000
00849b9c	mov x19,x0
00849ba0	ldr x8,[x8, #0xb18]
00849ba4	ldr x0,[x0, #0x10]
00849ba8	add x8,x8,#0x10
00849bac	str x8,[x19]
00849bb0	cbz x0,0x00849bc0
00849bb4	ldr x8,[x0]
00849bb8	ldr x8,[x8, #0x8]
00849bbc	blr x8
00849bc0	adrp x8,0xcb4000
00849bc4	ldr x8,[x8, #0xaa0]
00849bc8	ldr x0,[x19, #0x8]
00849bcc	add x8,x8,#0x10
00849bd0	str x8,[x19]
00849bd4	cbz x0,0x00849be4
00849bd8	ldr x8,[x0]
00849bdc	ldr x8,[x8, #0x8]
00849be0	blr x8
00849be4	mov x0,x19
00849be8	mov w1,#0x38
00849bec	ldr x19,[sp, #0x10]
00849bf0	ldp x29,x30,[sp], #0x20
00849bf4	b 0x00c2fe80
