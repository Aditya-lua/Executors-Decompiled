; ix::DNSLookup::resolveUnCancellable @ 00986eb0
00986eb0	stp x22,x21,[sp, #-0x30]!
00986eb4	stp x20,x19,[sp, #0x10]
00986eb8	stp x29,x30,[sp, #0x20]
00986ebc	add x29,sp,#0x20
00986ec0	mov x20,x1
00986ec4	adrp x1,0x2cb000
00986ec8	mov x22,x2
00986ecc	mov x21,x0
00986ed0	add x1,x1,#0x28f
00986ed4	mov w2,#0x8
00986ed8	mov x0,x20
00986edc	mov x19,x8
00986ee0	bl 0x00c31090
00986ee4	ldr x0,[x22, #0x20]
00986ee8	cbz x0,0x00986f44
00986eec	ldr x8,[x0]
00986ef0	ldr x8,[x8, #0x30]
00986ef4	blr x8
00986ef8	tbz w0,#0x0,0x00986f24
00986efc	adrp x1,0x2a9000
00986f00	add x1,x1,#0xa70
00986f04	mov w2,#0x16
00986f08	mov x0,x20
00986f0c	bl 0x00c31090
00986f10	stp xzr,xzr,[x19]
00986f14	ldp x29,x30,[sp, #0x20]
00986f18	ldp x20,x19,[sp, #0x10]
00986f1c	ldp x22,x21,[sp], #0x30
00986f20	ret
00986f24	ldr w2,[x21, #0x28]
00986f28	mov x8,x19
00986f2c	mov x3,x20
00986f30	ldp x29,x30,[sp, #0x20]
00986f34	ldp x20,x19,[sp, #0x10]
00986f38	add x1,x21,#0x10
00986f3c	ldp x22,x21,[sp], #0x30
00986f40	b 0x00c32ea0
00986f44	mov w0,#0x8
00986f48	bl 0x00c30000
00986f4c	adrp x8,0xcb4000
00986f50	ldr x8,[x8, #0xb50]
00986f54	adrp x1,0xcb4000
00986f58	adrp x2,0xcb4000
00986f5c	add x8,x8,#0x10
00986f60	str x8,[x0]
00986f64	ldr x1,[x1, #0xb58]
00986f68	ldr x2,[x2, #0xb38]
00986f6c	bl 0x00c30020
