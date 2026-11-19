; ix::WebSocketTransport::configure @ 00995e9c
00995e9c	stp x22,x21,[sp, #-0x30]!
00995ea0	stp x20,x19,[sp, #0x10]
00995ea4	stp x29,x30,[sp, #0x20]
00995ea8	add x29,sp,#0x20
00995eac	ldrb w8,[x1, #0x4]
00995eb0	mov x22,x0
00995eb4	mov w19,w4
00995eb8	mov w20,w3
00995ebc	strb w8,[x0, #0x184]
00995ec0	ldr w8,[x1]
00995ec4	add x0,x0,#0x180
00995ec8	mov x21,x2
00995ecc	str w8,[x22, #0x180]
00995ed0	bl 0x00c33db0
00995ed4	and w8,w0,#0x1
00995ed8	add x9,x22,#0x185
00995edc	add x0,x22,#0x1b8
00995ee0	mov x1,x21
00995ee4	stlrb w8,[x9]
00995ee8	bl 0x00c33050
00995eec	and w8,w20,#0x1
00995ef0	add x9,x22,#0x278
00995ef4	stlrb w8,[x9]
00995ef8	str w19,[x22, #0x27c]
00995efc	ldp x29,x30,[sp, #0x20]
00995f00	ldp x20,x19,[sp, #0x10]
00995f04	ldp x22,x21,[sp], #0x30
00995f08	ret
