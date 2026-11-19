; _INIT_186 @ 009a5424
009a5424	stp x20,x19,[sp, #-0x20]!
009a5428	stp x29,x30,[sp, #0x10]
009a542c	add x29,sp,#0x10
009a5430	adrp x19,0xd21000
009a5434	add x19,x19,#0x870
009a5438	mov w0,#0x1d0
009a543c	stp xzr,xzr,[x19]
009a5440	str xzr,[x19, #0x10]
009a5444	bl 0x00c2fed0
009a5448	adrp x8,0x29c000
009a544c	ldr q0,[x8, #0x430]
009a5450	adrp x1,0x2b1000
009a5454	add x1,x1,#0x9db
009a5458	orr w2,wzr,#0x1c0
009a545c	mov x20,x0
009a5460	str x0,[x19, #0x10]
009a5464	str q0,[x19]
009a5468	bl 0x00c2ffd0
009a546c	strb wzr,[x20, #0x1c0]
009a5470	adrp x0,0xcb4000
009a5474	ldr x0,[x0, #0x9c0]
009a5478	adrp x20,0xc48000
009a547c	add x20,x20,#0x880
009a5480	mov x1,x19
009a5484	mov x2,x20
009a5488	bl 0x00c2fe70
009a548c	adrp x1,0xcb5000
009a5490	ldr x1,[x1, #0x108]
009a5494	adrp x0,0xcb5000
009a5498	ldr x0,[x0, #0x110]
009a549c	mov x2,x20
009a54a0	stp xzr,xzr,[x1, #0x8]
009a54a4	str xzr,[x1]
009a54a8	ldp x29,x30,[sp, #0x10]
009a54ac	ldp x20,x19,[sp], #0x20
009a54b0	b 0x00c2fe70
