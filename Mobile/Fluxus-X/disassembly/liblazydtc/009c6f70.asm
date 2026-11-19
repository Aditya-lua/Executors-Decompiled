; tls13_setup_key_block @ 009c6f70
009c6f70	sub sp,sp,#0x30
009c6f74	stp x29,x30,[sp, #0x20]
009c6f78	ldr x8,[x0, #0x2e0]
009c6f7c	ldr x1,[x0, #0x918]
009c6f80	str x19,[sp, #0x10]
009c6f84	mov x19,x0
009c6f88	add x29,sp,#0x20
009c6f8c	str x8,[x1, #0x2f8]
009c6f90	ldr x0,[x0, #0x9a8]
009c6f94	sub x2,x29,#0x8
009c6f98	add x3,sp,#0x8
009c6f9c	mov x4,xzr
009c6fa0	mov x5,xzr
009c6fa4	mov x6,xzr
009c6fa8	mov w7,wzr
009c6fac	bl 0x00c34c90
009c6fb0	cbz w0,0x009c6fdc
009c6fb4	ldr x0,[x19, #0x320]
009c6fb8	bl 0x00c34970
009c6fbc	ldur x8,[x29, #-0x8]
009c6fc0	ldr x0,[x19, #0x328]
009c6fc4	str x8,[x19, #0x320]
009c6fc8	bl 0x00c34980
009c6fcc	ldr x8,[sp, #0x8]
009c6fd0	mov w0,#0x1
009c6fd4	str x8,[x19, #0x328]
009c6fd8	b 0x009c6fec
009c6fdc	mov w1,#0x50
009c6fe0	mov x0,x19
009c6fe4	bl 0x00c34c80
009c6fe8	mov w0,wzr
009c6fec	ldp x29,x30,[sp, #0x20]
009c6ff0	ldr x19,[sp, #0x10]
009c6ff4	add sp,sp,#0x30
009c6ff8	ret
