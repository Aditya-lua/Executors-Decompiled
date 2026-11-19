; ix::ConnectionState::setTerminated @ 009811c0
009811c0	add x8,x0,#0x8
009811c4	mov w9,#0x1
009811c8	stlrb w9,[x8]
009811cc	ldr x0,[x0, #0x50]
009811d0	cbz x0,0x009811e0
009811d4	ldr x8,[x0]
009811d8	ldr x1,[x8, #0x30]
009811dc	br x1
009811e0	ret
