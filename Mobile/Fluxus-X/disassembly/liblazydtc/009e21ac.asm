; dtls1_set_message_header @ 009e21ac
009e21ac	ldr x8,[x0, #0x4b8]
009e21b0	cbz x3,0x009e21bc
009e21b4	ldrh w9,[x8, #0x10c]
009e21b8	b 0x009e21cc
009e21bc	ldrh w9,[x8, #0x10e]
009e21c0	add w10,w9,#0x1
009e21c4	strh w9,[x8, #0x10c]
009e21c8	strh w10,[x8, #0x10e]
009e21cc	strb w1,[x8, #0x138]
009e21d0	str x2,[x8, #0x140]
009e21d4	strh w9,[x8, #0x148]
009e21d8	stp x3,x4,[x8, #0x150]
009e21dc	ret
