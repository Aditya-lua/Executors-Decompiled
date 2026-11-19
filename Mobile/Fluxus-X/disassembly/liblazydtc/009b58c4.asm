; SSL_CTX_callback_ctrl @ 009b58c4
009b58c4	cmp w1,#0xf
009b58c8	mov x8,x0
009b58cc	b.ne 0x009b58dc
009b58d0	mov w0,#0x1
009b58d4	str x2,[x8, #0x168]
009b58d8	ret
009b58dc	ldr x9,[x8, #0x8]
009b58e0	mov x0,x8
009b58e4	ldr x3,[x9, #0xd8]
009b58e8	br x3
