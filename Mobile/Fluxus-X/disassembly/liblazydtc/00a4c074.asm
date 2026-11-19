; ossl_curve448_scalar_add @ 00a4c074
00a4c074	ldr x8,[x1]
00a4c078	ldr x9,[x2]
00a4c07c	adds x8,x8,x9
00a4c080	str x8,[x0]
00a4c084	ldr x8,[x1, #0x8]
00a4c088	ldr x9,[x2, #0x8]
00a4c08c	adcs x10,xzr,xzr
00a4c090	adds x8,x10,x8
00a4c094	adcs x10,xzr,xzr
00a4c098	adds x8,x8,x9
00a4c09c	str x8,[x0, #0x8]
00a4c0a0	ldr x8,[x1, #0x10]
00a4c0a4	ldr x9,[x2, #0x10]
00a4c0a8	adcs x10,x10,xzr
00a4c0ac	adds x8,x10,x8
00a4c0b0	adcs x10,xzr,xzr
00a4c0b4	adds x8,x8,x9
00a4c0b8	str x8,[x0, #0x10]
00a4c0bc	ldr x8,[x1, #0x18]
00a4c0c0	ldr x9,[x2, #0x18]
00a4c0c4	adcs x10,x10,xzr
00a4c0c8	adds x8,x10,x8
00a4c0cc	adcs x10,xzr,xzr
00a4c0d0	adds x8,x8,x9
00a4c0d4	str x8,[x0, #0x18]
00a4c0d8	ldr x8,[x1, #0x20]
00a4c0dc	ldr x9,[x2, #0x20]
00a4c0e0	adcs x10,x10,xzr
00a4c0e4	adds x8,x10,x8
00a4c0e8	adcs x10,xzr,xzr
00a4c0ec	adds x8,x8,x9
00a4c0f0	str x8,[x0, #0x20]
00a4c0f4	ldr x8,[x1, #0x28]
00a4c0f8	ldr x9,[x2, #0x28]
00a4c0fc	adcs x10,x10,xzr
00a4c100	adds x8,x10,x8
00a4c104	adcs x10,xzr,xzr
00a4c108	adds x8,x8,x9
00a4c10c	str x8,[x0, #0x28]
00a4c110	ldr x8,[x1, #0x30]
00a4c114	ldr x9,[x2, #0x30]
00a4c118	adcs x10,x10,xzr
00a4c11c	adrp x2,0x765000
00a4c120	adds x8,x10,x8
00a4c124	adcs x10,xzr,xzr
00a4c128	adds x8,x8,x9
00a4c12c	adcs x3,x10,xzr
00a4c130	add x2,x2,#0xf28
00a4c134	mov x1,x0
00a4c138	str x8,[x0, #0x30]
00a4c13c	b 0x00a4bee0
