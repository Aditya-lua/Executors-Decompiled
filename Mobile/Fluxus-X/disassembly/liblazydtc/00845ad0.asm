; FUN_00845ad0 @ 00845ad0
00845ad0	stp x29,x30,[sp, #-0x20]!
00845ad4	str x19,[sp, #0x10]
00845ad8	mov x29,sp
00845adc	adrp x8,0xcb4000
00845ae0	mov x19,x0
00845ae4	ldr x8,[x8, #0xad8]
00845ae8	add x8,x8,#0x10
00845aec	str x8,[x0], #0x10
00845af0	bl 0x00c30090
00845af4	adrp x8,0xcb4000
00845af8	ldr x8,[x8, #0xaa0]
00845afc	ldr x0,[x19, #0x8]
00845b00	add x8,x8,#0x10
00845b04	str x8,[x19]
00845b08	cbz x0,0x00845b18
00845b0c	ldr x8,[x0]
00845b10	ldr x8,[x8, #0x8]
00845b14	blr x8
00845b18	mov x0,x19
00845b1c	mov w1,#0x30
00845b20	ldr x19,[sp, #0x10]
00845b24	ldp x29,x30,[sp], #0x20
00845b28	b 0x00c2fe80
