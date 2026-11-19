; EC_KEY_set_flags @ 00a2f5d0
00a2f5d0	ldr w8,[x0, #0x3c]
00a2f5d4	ldr x9,[x0, #0x68]
00a2f5d8	orr w8,w8,w1
00a2f5dc	add x9,x9,#0x1
00a2f5e0	str w8,[x0, #0x3c]
00a2f5e4	str x9,[x0, #0x68]
00a2f5e8	ret
