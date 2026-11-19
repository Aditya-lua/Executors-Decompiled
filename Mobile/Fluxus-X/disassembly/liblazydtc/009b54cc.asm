; SSL_callback_ctrl @ 009b54cc
009b54cc	cmp w1,#0xf
009b54d0	mov x8,x0
009b54d4	b.ne 0x009b54e4
009b54d8	mov w0,#0x1
009b54dc	str x2,[x8, #0x4c0]
009b54e0	ret
009b54e4	ldr x9,[x8, #0x8]
009b54e8	mov x0,x8
009b54ec	ldr x3,[x9, #0xd0]
009b54f0	br x3
