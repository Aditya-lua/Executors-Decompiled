; FUN_0080ceb4 @ 0080ceb4
0080ceb4	stp x29,x30,[sp, #-0x10]!
0080ceb8	mov x29,sp
0080cebc	adrp x8,0xd1b000
0080cec0	add x8,x8,#0x6d8
0080cec4	ldarb w8,[x8]
0080cec8	tbz w8,#0x0,0x0080ced4
0080cecc	ldp x29,x30,[sp], #0x10
0080ced0	ret
0080ced4	adrp x0,0xd1b000
0080ced8	add x0,x0,#0x6d8
0080cedc	bl 0x00c2fe90
0080cee0	cbz w0,0x0080cecc
0080cee4	adrp x1,0xd1b000
0080cee8	add x1,x1,#0x690
0080ceec	mov w8,#0x1
0080cef0	strb w8,[x1, #0x44]
0080cef4	adrp x8,0x32d000
0080cef8	add x8,x8,#0x437
0080cefc	ldp q0,q1,[x8]
0080cf00	mov w9,#0x987
0080cf04	movk w9,#0x1bdb, LSL #16
0080cf08	nop
0080cf0c	adr x0,0x80cf3c
0080cf10	adrp x2,0xc48000
0080cf14	add x2,x2,#0x880
0080cf18	str w9,[x1, #0x40]
0080cf1c	stp q0,q1,[x1]
0080cf20	ldp q2,q0,[x8, #0x20]
0080cf24	stp q2,q0,[x1, #0x20]
0080cf28	bl 0x00c2fe70
0080cf2c	adrp x0,0xd1b000
0080cf30	add x0,x0,#0x6d8
0080cf34	ldp x29,x30,[sp], #0x10
0080cf38	b 0x00c2fea0
