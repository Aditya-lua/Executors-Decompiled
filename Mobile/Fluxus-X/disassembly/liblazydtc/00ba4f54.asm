; mbedtls_ripemd160_update @ 00ba4f54
00ba4f54	str x25,[sp, #-0x50]!
00ba4f58	stp x24,x23,[sp, #0x10]
00ba4f5c	stp x22,x21,[sp, #0x20]
00ba4f60	stp x20,x19,[sp, #0x30]
00ba4f64	stp x29,x30,[sp, #0x40]
00ba4f68	add x29,sp,#0x40
00ba4f6c	mov x19,x2
00ba4f70	mov x21,x1
00ba4f74	mov x20,x0
00ba4f78	cbz x2,0x00ba5034
00ba4f7c	ldr w8,[x20]
00ba4f80	and w24,w8,#0x3f
00ba4f84	adds w8,w8,w19
00ba4f88	str w8,[x20]
00ba4f8c	b.cc 0x00ba4f9c
00ba4f90	ldr w8,[x20, #0x4]
00ba4f94	add w8,w8,#0x1
00ba4f98	str w8,[x20, #0x4]
00ba4f9c	cbz w24,0x00ba4fdc
00ba4fa0	mov w8,#0x40
00ba4fa4	sub w22,w8,w24
00ba4fa8	cmp x22,x19
00ba4fac	b.hi 0x00ba4fdc
00ba4fb0	add x23,x20,#0x1c
00ba4fb4	add x0,x23,x24
00ba4fb8	mov x1,x21
00ba4fbc	mov x2,x22
00ba4fc0	bl 0x00c2ffd0
00ba4fc4	mov x0,x20
00ba4fc8	mov x1,x23
00ba4fcc	bl 0x00c433f0
00ba4fd0	mov w24,wzr
00ba4fd4	add x21,x21,x22
00ba4fd8	sub x19,x19,x22
00ba4fdc	subs x23,x19,#0x40
00ba4fe0	b.cc 0x00ba5018
00ba4fe4	and x25,x23,#-0x40
00ba4fe8	add x8,x21,x25
00ba4fec	add x22,x8,#0x40
00ba4ff0	mov x0,x20
00ba4ff4	mov x1,x21
00ba4ff8	bl 0x00c433f0
00ba4ffc	sub x19,x19,#0x40
00ba5000	cmp x19,#0x3f
00ba5004	add x21,x21,#0x40
00ba5008	b.hi 0x00ba4ff0
00ba500c	sub x19,x23,x25
00ba5010	cbnz x19,0x00ba5020
00ba5014	b 0x00ba5034
00ba5018	mov x22,x21
00ba501c	cbz x19,0x00ba5034
00ba5020	add x8,x20,x24
00ba5024	add x0,x8,#0x1c
00ba5028	mov x1,x22
00ba502c	mov x2,x19
00ba5030	bl 0x00c2ffd0
00ba5034	ldp x29,x30,[sp, #0x40]
00ba5038	ldp x20,x19,[sp, #0x30]
00ba503c	ldp x22,x21,[sp, #0x20]
00ba5040	ldp x24,x23,[sp, #0x10]
00ba5044	mov w0,wzr
00ba5048	ldr x25,[sp], #0x50
00ba504c	ret
