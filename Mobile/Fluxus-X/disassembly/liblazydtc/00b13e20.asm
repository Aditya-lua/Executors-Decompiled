; X509_VERIFY_PARAM_inherit @ 00b13e20
00b13e20	stp x26,x25,[sp, #-0x50]!
00b13e24	stp x24,x23,[sp, #0x10]
00b13e28	stp x22,x21,[sp, #0x20]
00b13e2c	stp x20,x19,[sp, #0x30]
00b13e30	stp x29,x30,[sp, #0x40]
00b13e34	add x29,sp,#0x40
00b13e38	cbz x1,0x00b14084
00b13e3c	ldr w8,[x0, #0x10]
00b13e40	ldr w9,[x1, #0x10]
00b13e44	mov x20,x1
00b13e48	mov x19,x0
00b13e4c	orr w24,w9,w8
00b13e50	tbz w24,#0x4,0x00b13e58
00b13e54	str wzr,[x19, #0x10]
00b13e58	tbnz w24,#0x3,0x00b14084
00b13e5c	ldr w8,[x20, #0x20]
00b13e60	tbz w24,#0x1,0x00b13e80
00b13e64	str w8,[x19, #0x20]
00b13e68	ldur x8,[x20, #0x24]
00b13e6c	stur x8,[x19, #0x24]
00b13e70	ldr w9,[x20, #0x2c]
00b13e74	ldr x8,[x19, #0x18]
00b13e78	str w9,[x19, #0x2c]
00b13e7c	b 0x00b13ef4
00b13e80	cbz w8,0x00b13e94
00b13e84	tbnz w24,#0x0,0x00b13e90
00b13e88	ldr w9,[x19, #0x20]
00b13e8c	cbnz w9,0x00b13e94
00b13e90	str w8,[x19, #0x20]
00b13e94	ldr w8,[x20, #0x24]
00b13e98	cbz w8,0x00b13eac
00b13e9c	tbnz w24,#0x0,0x00b13ea8
00b13ea0	ldr w9,[x19, #0x24]
00b13ea4	cbnz w9,0x00b13eac
00b13ea8	str w8,[x19, #0x24]
00b13eac	ldr w8,[x20, #0x28]
00b13eb0	cmn w8,#0x1
00b13eb4	b.eq 0x00b13ecc
00b13eb8	tbnz w24,#0x0,0x00b13ec8
00b13ebc	ldr w9,[x19, #0x28]
00b13ec0	cmn w9,#0x1
00b13ec4	b.ne 0x00b13ecc
00b13ec8	str w8,[x19, #0x28]
00b13ecc	ldr w8,[x20, #0x2c]
00b13ed0	cmn w8,#0x1
00b13ed4	b.eq 0x00b13eec
00b13ed8	tbnz w24,#0x0,0x00b13ee8
00b13edc	ldr w9,[x19, #0x2c]
00b13ee0	cmn w9,#0x1
00b13ee4	b.ne 0x00b13eec
00b13ee8	str w8,[x19, #0x2c]
00b13eec	ldr x8,[x19, #0x18]
00b13ef0	tbnz w8,#0x1,0x00b13f04
00b13ef4	ldr x9,[x20, #0x8]
00b13ef8	and x8,x8,#-0x3
00b13efc	str x8,[x19, #0x18]
00b13f00	str x9,[x19, #0x8]
00b13f04	tbz w24,#0x2,0x00b13f10
00b13f08	mov x8,xzr
00b13f0c	str xzr,[x19, #0x18]
00b13f10	ldr x9,[x20, #0x18]
00b13f14	orr x8,x8,x9
00b13f18	str x8,[x19, #0x18]
00b13f1c	ldr x1,[x20, #0x30]
00b13f20	tbnz w24,#0x1,0x00b13f34
00b13f24	cbz x1,0x00b13f54
00b13f28	tbnz w24,#0x0,0x00b13f34
00b13f2c	ldr x8,[x19, #0x30]
00b13f30	cbnz x8,0x00b13f54
00b13f34	mov x0,x19
00b13f38	bl 0x00b140a0
00b13f3c	cbz w0,0x00b14088
00b13f40	tbz w24,#0x1,0x00b13f54
00b13f44	ldr w8,[x20, #0x40]
00b13f48	add x21,x20,#0x38
00b13f4c	str w8,[x19, #0x40]
00b13f50	b 0x00b13f84
00b13f54	ldr w8,[x20, #0x40]
00b13f58	cbz w8,0x00b13f6c
00b13f5c	tbnz w24,#0x0,0x00b13f68
00b13f60	ldr w9,[x19, #0x40]
00b13f64	cbnz w9,0x00b13f6c
00b13f68	str w8,[x19, #0x40]
00b13f6c	mov x21,x20
00b13f70	ldr x8,[x21, #0x38]!
00b13f74	cbz x8,0x00b13fdc
00b13f78	tbnz w24,#0x0,0x00b13f84
00b13f7c	ldr x8,[x19, #0x38]
00b13f80	cbnz x8,0x00b13fdc
00b13f84	ldr x0,[x19, #0x38]
00b13f88	adrp x1,0xb13000
00b13f8c	add x1,x1,#0xe10
00b13f90	bl 0x00c32600
00b13f94	str xzr,[x19, #0x38]
00b13f98	ldr x0,[x21]
00b13f9c	cbz x0,0x00b13fbc
00b13fa0	adrp x1,0xb14000
00b13fa4	adrp x2,0xb13000
00b13fa8	add x1,x1,#0x19c
00b13fac	add x2,x2,#0xe10
00b13fb0	bl 0x00c3ebf0
00b13fb4	str x0,[x19, #0x38]
00b13fb8	cbz x0,0x00b14088
00b13fbc	tbz w24,#0x1,0x00b13fdc
00b13fc0	ldr x21,[x20, #0x50]
00b13fc4	add x25,x19,#0x50
00b13fc8	add x26,x19,#0x58
00b13fcc	cbnz x21,0x00b13ff8
00b13fd0	mov x22,xzr
00b13fd4	mov x23,xzr
00b13fd8	b 0x00b14038
00b13fdc	ldr x21,[x20, #0x50]
00b13fe0	cbz x21,0x00b14060
00b13fe4	tbnz w24,#0x0,0x00b13ff0
00b13fe8	ldr x8,[x19, #0x50]
00b13fec	cbnz x8,0x00b14060
00b13ff0	add x25,x19,#0x50
00b13ff4	add x26,x19,#0x58
00b13ff8	ldr x22,[x20, #0x58]
00b13ffc	cbnz x22,0x00b1400c
00b14000	mov x0,x21
00b14004	bl 0x00c2ff50
00b14008	mov x22,x0
00b1400c	adrp x1,0x2d8000
00b14010	add x0,x22,#0x1
00b14014	add x1,x1,#0xa44
00b14018	mov w2,#0xf7
00b1401c	bl 0x00c32320
00b14020	cbz x0,0x00b14088
00b14024	mov x1,x21
00b14028	mov x2,x22
00b1402c	mov x23,x0
00b14030	bl 0x00c2ffd0
00b14034	strb wzr,[x23, x22]
00b14038	ldr x0,[x25]
00b1403c	adrp x1,0x2d8000
00b14040	add x1,x1,#0xa44
00b14044	mov w2,#0x100
00b14048	bl 0x00c32310
00b1404c	str x23,[x25]
00b14050	str x22,[x26]
00b14054	tbz w24,#0x1,0x00b14060
00b14058	ldr x1,[x20, #0x60]
00b1405c	b 0x00b14074
00b14060	ldr x1,[x20, #0x60]
00b14064	cbz x1,0x00b14084
00b14068	tbnz w24,#0x0,0x00b14074
00b1406c	ldr x8,[x19, #0x60]
00b14070	cbnz x8,0x00b14084
00b14074	ldr x2,[x20, #0x68]
00b14078	mov x0,x19
00b1407c	bl 0x00b14240
00b14080	cbz w0,0x00b14088
00b14084	mov w0,#0x1
00b14088	ldp x29,x30,[sp, #0x40]
00b1408c	ldp x20,x19,[sp, #0x30]
00b14090	ldp x22,x21,[sp, #0x20]
00b14094	ldp x24,x23,[sp, #0x10]
00b14098	ldp x26,x25,[sp], #0x50
00b1409c	ret
