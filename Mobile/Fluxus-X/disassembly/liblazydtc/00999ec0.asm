; ix::WebSocketTransport::wakeUpFromPoll @ 00999ec0
00999ec0	str x21,[sp, #-0x30]!
00999ec4	stp x20,x19,[sp, #0x10]
00999ec8	stp x29,x30,[sp, #0x20]
00999ecc	add x29,sp,#0x20
00999ed0	add x19,x0,#0xb8
00999ed4	mov x21,x0
00999ed8	mov x0,x19
00999edc	mov x20,x1
00999ee0	bl 0x00c2ff10
00999ee4	ldr x0,[x21, #0xb0]
00999ee8	mov x1,x20
00999eec	bl 0x00c33520
00999ef0	mov w20,w0
00999ef4	mov x0,x19
00999ef8	bl 0x00c2ff20
00999efc	and w0,w20,#0x1
00999f00	ldp x29,x30,[sp, #0x20]
00999f04	ldp x20,x19,[sp, #0x10]
00999f08	ldr x21,[sp], #0x30
00999f0c	ret
