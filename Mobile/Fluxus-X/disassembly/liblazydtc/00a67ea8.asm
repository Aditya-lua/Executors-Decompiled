; EVP_DigestSign @ 00a67ea8
00a67ea8	str x21,[sp, #-0x30]!
00a67eac	stp x20,x19,[sp, #0x10]
00a67eb0	stp x29,x30,[sp, #0x20]
00a67eb4	ldr x8,[x0, #0x28]
00a67eb8	mov x5,x4
00a67ebc	mov x4,x3
00a67ec0	mov x19,x2
00a67ec4	mov x21,x0
00a67ec8	mov x20,x1
00a67ecc	add x29,sp,#0x20
00a67ed0	cbz x8,0x00a67f04
00a67ed4	ldr w9,[x8]
00a67ed8	cmp w9,#0x80
00a67edc	b.ne 0x00a67f04
00a67ee0	ldr x0,[x8, #0x30]
00a67ee4	cbz x0,0x00a67f04
00a67ee8	ldr x9,[x8, #0x28]
00a67eec	cbz x9,0x00a67f04
00a67ef0	ldr x6,[x9, #0x80]
00a67ef4	cbz x6,0x00a67f38
00a67ef8	cbz x20,0x00a67f84
00a67efc	ldr x3,[x19]
00a67f00	b 0x00a67f88
00a67f04	ldr x8,[x8, #0x78]
00a67f08	cbz x8,0x00a67f38
00a67f0c	ldr x6,[x8, #0xd0]
00a67f10	cbz x6,0x00a67f38
00a67f14	mov x1,x20
00a67f18	mov x2,x19
00a67f1c	ldp x29,x30,[sp, #0x20]
00a67f20	ldp x20,x19,[sp, #0x10]
00a67f24	mov x0,x21
00a67f28	mov x3,x4
00a67f2c	mov x4,x5
00a67f30	ldr x21,[sp], #0x30
00a67f34	br x6
00a67f38	cbz x20,0x00a67f54
00a67f3c	mov x0,x21
00a67f40	mov x1,x4
00a67f44	mov x2,x5
00a67f48	bl 0x00a679f4
00a67f4c	cmp w0,#0x1
00a67f50	b.lt 0x00a67f70
00a67f54	mov x1,x20
00a67f58	mov x2,x19
00a67f5c	ldp x29,x30,[sp, #0x20]
00a67f60	ldp x20,x19,[sp, #0x10]
00a67f64	mov x0,x21
00a67f68	ldr x21,[sp], #0x30
00a67f6c	b 0x00a67bcc
00a67f70	ldp x29,x30,[sp, #0x20]
00a67f74	ldp x20,x19,[sp, #0x10]
00a67f78	mov w0,wzr
00a67f7c	ldr x21,[sp], #0x30
00a67f80	ret
00a67f84	mov x3,xzr
00a67f88	mov x1,x20
00a67f8c	mov x2,x19
00a67f90	ldp x29,x30,[sp, #0x20]
00a67f94	ldp x20,x19,[sp, #0x10]
00a67f98	ldr x21,[sp], #0x30
00a67f9c	br x6
