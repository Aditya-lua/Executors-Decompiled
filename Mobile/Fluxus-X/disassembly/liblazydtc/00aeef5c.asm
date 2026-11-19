; UI_set_result @ 00aeef5c
00aeef5c	str x21,[sp, #-0x30]!
00aeef60	mov x21,x0
00aeef64	mov x0,x2
00aeef68	stp x20,x19,[sp, #0x10]
00aeef6c	stp x29,x30,[sp, #0x20]
00aeef70	add x29,sp,#0x20
00aeef74	mov x19,x2
00aeef78	mov x20,x1
00aeef7c	bl 0x00c2ff50
00aeef80	mov x1,x20
00aeef84	mov x2,x19
00aeef88	ldp x29,x30,[sp, #0x20]
00aeef8c	ldp x20,x19,[sp, #0x10]
00aeef90	mov x3,x0
00aeef94	mov x0,x21
00aeef98	ldr x21,[sp], #0x30
00aeef9c	b 0x00aeefa0
