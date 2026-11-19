; tls12_get_psigalgs @ 009c209c
009c209c	ldr x8,[x0, #0x898]
009c20a0	ldr w9,[x8, #0x1c]
009c20a4	and w9,w9,#0x30000
009c20a8	cmp w9,#0x10, LSL #12
009c20ac	b.eq 0x009c20d4
009c20b0	cmp w9,#0x20, LSL #12
009c20b4	b.eq 0x009c20e0
009c20b8	cmp w9,#0x30, LSL #12
009c20bc	b.ne 0x009c20f8
009c20c0	adrp x8,0x74c000
009c20c4	add x8,x8,#0xd8c
009c20c8	mov w0,#0x2
009c20cc	str x8,[x2]
009c20d0	ret
009c20d4	adrp x8,0x74c000
009c20d8	add x8,x8,#0xd8c
009c20dc	b 0x009c20ec
009c20e0	adrp x8,0x74c000
009c20e4	add x8,x8,#0xd8c
009c20e8	add x8,x8,#0x2
009c20ec	mov w0,#0x1
009c20f0	str x8,[x2]
009c20f4	ret
009c20f8	ldr w9,[x0, #0x38]
009c20fc	cmp w9,w1
009c2100	b.ne 0x009c211c
009c2104	ldr x9,[x8, #0x1a8]
009c2108	cbz x9,0x009c211c
009c210c	str x9,[x2]
009c2110	ldr x8,[x0, #0x898]
009c2114	ldr x0,[x8, #0x1b0]
009c2118	ret
009c211c	ldr x8,[x8, #0x198]
009c2120	cbz x8,0x009c2134
009c2124	str x8,[x2]
009c2128	ldr x8,[x0, #0x898]
009c212c	ldr x0,[x8, #0x1a0]
009c2130	ret
009c2134	adrp x8,0x74c000
009c2138	add x8,x8,#0xd90
009c213c	orr w0,wzr,#0x1c
009c2140	str x8,[x2]
009c2144	ret
