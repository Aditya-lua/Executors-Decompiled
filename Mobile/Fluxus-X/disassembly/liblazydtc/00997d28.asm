; ix::WebSocketTransport::closingDelayExceeded @ 00997d28
00997d28	stp x20,x19,[sp, #-0x20]!
00997d2c	stp x29,x30,[sp, #0x10]
00997d30	add x29,sp,#0x10
00997d34	add x20,x0,#0x244
00997d38	mov x19,x0
00997d3c	mov x0,x20
00997d40	bl 0x00c2ff10
00997d44	bl 0x00c31900
00997d48	ldr x8,[x19, #0x270]
00997d4c	mov w9,#0xa300
00997d50	movk w9,#0x11e1, LSL #16
00997d54	sub x8,x0,x8
00997d58	cmp x8,x9
00997d5c	mov x0,x20
00997d60	cset w19,gt
00997d64	bl 0x00c2ff20
00997d68	ldp x29,x30,[sp, #0x10]
00997d6c	mov w0,w19
00997d70	ldp x20,x19,[sp], #0x20
00997d74	ret
