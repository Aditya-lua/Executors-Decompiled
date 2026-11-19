; PKCS12_SAFEBAG_get1_cert @ 00abc834
00abc834	str x19,[sp, #-0x20]!
00abc838	stp x29,x30,[sp, #0x10]
00abc83c	mov x19,x0
00abc840	ldr x0,[x0]
00abc844	add x29,sp,#0x10
00abc848	bl 0x00c37750
00abc84c	cmp w0,#0x98
00abc850	mov x0,xzr
00abc854	b.ne 0x00abc888
00abc858	ldr x8,[x19, #0x8]
00abc85c	ldr x0,[x8]
00abc860	bl 0x00c37750
00abc864	cmp w0,#0x9e
00abc868	mov x0,xzr
00abc86c	b.ne 0x00abc888
00abc870	ldr x8,[x19, #0x8]
00abc874	ldr x19,[x8, #0x8]
00abc878	bl 0x00c36190
00abc87c	mov x1,x0
00abc880	mov x0,x19
00abc884	bl 0x00c37aa0
00abc888	ldp x29,x30,[sp, #0x10]
00abc88c	ldr x19,[sp], #0x20
00abc890	ret
