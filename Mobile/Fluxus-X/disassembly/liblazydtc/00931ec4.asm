; FUN_00931ec4 @ 00931ec4
00931ec4	str x21,[sp, #-0x30]!
00931ec8	stp x20,x19,[sp, #0x10]
00931ecc	stp x29,x30,[sp, #0x20]
00931ed0	add x29,sp,#0x20
00931ed4	ldr x8,[x0, #0x330]
00931ed8	mov x19,x2
00931edc	mov x20,x0
00931ee0	mov x21,x1
00931ee4	cbz x8,0x00931f14
00931ee8	ldr x2,[x20, #0xb88]
00931eec	ldr x3,[x20, #0xb90]
00931ef0	mov x0,x21
00931ef4	mov x1,x19
00931ef8	bl 0x00941d54
00931efc	cmp x0,#0xbb8
00931f00	b.lt 0x00931f14
00931f04	ldr x8,[x20, #0xac0]
00931f08	str x21,[x20, #0xb88]
00931f0c	str x19,[x20, #0xb90]
00931f10	str x8,[x20, #0xb98]
00931f14	ldr x8,[x20, #0x328]
00931f18	cbz x8,0x00931f48
00931f1c	ldr x2,[x20, #0xb70]
00931f20	ldr x3,[x20, #0xb78]
00931f24	mov x0,x21
00931f28	mov x1,x19
00931f2c	bl 0x00941d54
00931f30	cmp x0,#0xbb8
00931f34	b.lt 0x00931f48
00931f38	ldr x8,[x20, #0xac8]
00931f3c	str x21,[x20, #0xb70]
00931f40	str x19,[x20, #0xb78]
00931f44	str x8,[x20, #0xb80]
00931f48	ldp x29,x30,[sp, #0x20]
00931f4c	ldp x20,x19,[sp, #0x10]
00931f50	ldr x21,[sp], #0x30
00931f54	ret
