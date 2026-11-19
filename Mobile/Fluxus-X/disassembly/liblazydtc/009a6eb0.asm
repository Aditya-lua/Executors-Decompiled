; dtls1_stop_timer @ 009a6eb0
009a6eb0	str x19,[sp, #-0x20]!
009a6eb4	stp x29,x30,[sp, #0x10]
009a6eb8	ldr x8,[x0, #0x4b8]
009a6ebc	mov w9,#0x4240
009a6ec0	movk w9,#0xf, LSL #16
009a6ec4	add x29,sp,#0x10
009a6ec8	str wzr,[x8, #0x1e8]
009a6ecc	stp xzr,xzr,[x8, #0x1f0]
009a6ed0	ldr x8,[x0, #0x4b8]
009a6ed4	mov x19,x0
009a6ed8	str w9,[x8, #0x200]
009a6edc	bl 0x00c34300
009a6ee0	ldr x8,[x19, #0x4b8]
009a6ee4	mov w1,#0x2d
009a6ee8	mov x2,xzr
009a6eec	add x3,x8,#0x1f0
009a6ef0	bl 0x00c321a0
009a6ef4	ldp x29,x30,[sp, #0x10]
009a6ef8	mov x0,x19
009a6efc	ldr x19,[sp], #0x20
009a6f00	b 0x009a6778
