; SRP_Calc_A_param @ 009c8e70
009c8e70	sub sp,sp,#0x50
009c8e74	stp x29,x30,[sp, #0x40]
009c8e78	ldr x8,[x0, #0x9a8]
009c8e7c	str x19,[sp, #0x30]
009c8e80	mov x19,x0
009c8e84	mov x1,sp
009c8e88	ldr x0,[x8]
009c8e8c	orr w2,wzr,#0x30
009c8e90	mov w3,wzr
009c8e94	add x29,sp,#0x40
009c8e98	bl 0x00c358b0
009c8e9c	cmp w0,#0x1
009c8ea0	b.lt 0x009c8ee4
009c8ea4	ldr x2,[x19, #0xc20]
009c8ea8	mov x0,sp
009c8eac	orr w1,wzr,#0x30
009c8eb0	bl 0x00c36970
009c8eb4	str x0,[x19, #0xc20]
009c8eb8	mov x0,sp
009c8ebc	orr w1,wzr,#0x30
009c8ec0	bl 0x00c34750
009c8ec4	ldr x0,[x19, #0xc20]
009c8ec8	ldr x1,[x19, #0xbf8]
009c8ecc	ldr x2,[x19, #0xc00]
009c8ed0	bl 0x00c369d0
009c8ed4	cmp x0,#0x0
009c8ed8	str x0,[x19, #0xc18]
009c8edc	cset w0,ne
009c8ee0	b 0x009c8ee8
009c8ee4	mov w0,wzr
009c8ee8	ldp x29,x30,[sp, #0x40]
009c8eec	ldr x19,[sp, #0x30]
009c8ef0	add sp,sp,#0x50
009c8ef4	ret
