; ix::WebSocketPerMessageDeflate::WebSocketPerMessageDeflate @ 009a2070
009a2070	str x21,[sp, #-0x30]!
009a2074	stp x20,x19,[sp, #0x10]
009a2078	stp x29,x30,[sp, #0x20]
009a207c	add x29,sp,#0x20
009a2080	mov x19,x0
009a2084	mov w0,#0x4078
009a2088	bl 0x00c2fed0
009a208c	mov x20,x0
009a2090	bl 0x00c33ce0
009a2094	str x20,[x19]
009a2098	mov w0,#0x4078
009a209c	bl 0x00c2fed0
009a20a0	mov x21,x0
009a20a4	bl 0x00c33d20
009a20a8	str x21,[x19, #0x8]
009a20ac	ldp x29,x30,[sp, #0x20]
009a20b0	ldp x20,x19,[sp, #0x10]
009a20b4	ldr x21,[sp], #0x30
009a20b8	ret
