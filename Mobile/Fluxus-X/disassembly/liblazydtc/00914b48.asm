; FUN_00914b48 @ 00914b48
00914b48	str x21,[sp, #-0x30]!
00914b4c	stp x20,x19,[sp, #0x10]
00914b50	stp x29,x30,[sp, #0x20]
00914b54	add x29,sp,#0x20
00914b58	mov x19,x0
00914b5c	cbz x0,0x00914bbc
00914b60	adrp x20,0xcc4000
00914b64	add x20,x20,#0x678
00914b68	ldr x8,[x20]
00914b6c	ldr x0,[x19, #0x28]
00914b70	ldr x21,[x19]
00914b74	blr x8
00914b78	ldr x8,[x20]
00914b7c	ldr x0,[x19, #0x18]
00914b80	blr x8
00914b84	ldr x8,[x20]
00914b88	ldr x0,[x19, #0x20]
00914b8c	blr x8
00914b90	ldr x8,[x20]
00914b94	ldr x0,[x19, #0x8]
00914b98	blr x8
00914b9c	ldr x8,[x20]
00914ba0	ldr x0,[x19, #0x10]
00914ba4	blr x8
00914ba8	ldr x8,[x20]
00914bac	mov x0,x19
00914bb0	blr x8
00914bb4	mov x19,x21
00914bb8	cbnz x21,0x00914b68
00914bbc	ldp x29,x30,[sp, #0x20]
00914bc0	ldp x20,x19,[sp, #0x10]
00914bc4	ldr x21,[sp], #0x30
00914bc8	ret
