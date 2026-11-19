; FUN_009f9ea0 @ 009f9ea0
009f9ea0	stp x26,x25,[sp, #-0x50]!
009f9ea4	stp x24,x23,[sp, #0x10]
009f9ea8	stp x22,x21,[sp, #0x20]
009f9eac	stp x20,x19,[sp, #0x30]
009f9eb0	stp x29,x30,[sp, #0x40]
009f9eb4	add x29,sp,#0x40
009f9eb8	cbz x1,0x009f9f9c
009f9ebc	ldr x25,[x0, #0x40]
009f9ec0	mov x20,x0
009f9ec4	cbz x25,0x009f9f9c
009f9ec8	ldr x8,[x20, #0x48]
009f9ecc	cbz x8,0x009f9f9c
009f9ed0	mov x22,x1
009f9ed4	orr w1,wzr,#0xf
009f9ed8	mov x0,x20
009f9edc	mov w21,w2
009f9ee0	bl 0x00c32190
009f9ee4	ldr w23,[x25, #0x10]
009f9ee8	mov w19,wzr
009f9eec	cbz w23,0x009f9f44
009f9ef0	ldr x8,[x25, #0x8]
009f9ef4	ldrsw x9,[x25, #0x14]
009f9ef8	cmp w23,w21
009f9efc	csel w26,w21,w23,gt
009f9f00	sxtw x24,w26
009f9f04	add x1,x8,x9
009f9f08	mov x0,x22
009f9f0c	mov x2,x24
009f9f10	bl 0x00c2ffd0
009f9f14	ldp w9,w8,[x25, #0x10]
009f9f18	cmp w21,w23
009f9f1c	add w19,w26,w19
009f9f20	add w8,w8,w26
009f9f24	sub w9,w9,w26
009f9f28	stp w9,w8,[x25, #0x10]
009f9f2c	b.le 0x009f9fa0
009f9f30	sub w21,w21,w24
009f9f34	add x22,x22,x24
009f9f38	b 0x009f9f44
009f9f3c	stp w23,wzr,[x25, #0x10]
009f9f40	cbnz w23,0x009f9ef0
009f9f44	ldr w2,[x25]
009f9f48	ldr x0,[x20, #0x48]
009f9f4c	cmp w21,w2
009f9f50	b.gt 0x009f9f74
009f9f54	ldr x1,[x25, #0x8]
009f9f58	bl 0x00c34220
009f9f5c	mov w23,w0
009f9f60	cmp w0,#0x0
009f9f64	b.gt 0x009f9f3c
009f9f68	b 0x009f9fbc
009f9f6c	ldr x0,[x20, #0x48]
009f9f70	add x22,x22,w23, SXTW 
009f9f74	mov x1,x22
009f9f78	mov w2,w21
009f9f7c	bl 0x00c34220
009f9f80	mov w23,w0
009f9f84	cmp w0,#0x1
009f9f88	b.lt 0x009f9fbc
009f9f8c	subs w21,w21,w23
009f9f90	add w19,w23,w19
009f9f94	b.ne 0x009f9f6c
009f9f98	b 0x009f9fa0
009f9f9c	mov w19,wzr
009f9fa0	mov w0,w19
009f9fa4	ldp x29,x30,[sp, #0x40]
009f9fa8	ldp x20,x19,[sp, #0x30]
009f9fac	ldp x22,x21,[sp, #0x20]
009f9fb0	ldp x24,x23,[sp, #0x10]
009f9fb4	ldp x26,x25,[sp], #0x50
009f9fb8	ret
009f9fbc	mov x0,x20
009f9fc0	bl 0x00c38460
009f9fc4	tbz w23,#0x1f,0x009f9fa0
009f9fc8	cmp w19,#0x0
009f9fcc	csel w19,w19,w23,gt
009f9fd0	b 0x009f9fa0
