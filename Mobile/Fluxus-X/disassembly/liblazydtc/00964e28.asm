; FUN_00964e28 @ 00964e28
00964e28	stp x20,x19,[sp, #-0x20]!
00964e2c	stp x29,x30,[sp, #0x10]
00964e30	add x29,sp,#0x10
00964e34	adrp x20,0xcc4000
00964e38	add x20,x20,#0x678
00964e3c	mov x19,x0
00964e40	ldr x0,[x0]
00964e44	ldr x8,[x20]
00964e48	blr x8
00964e4c	str xzr,[x19]
00964e50	ldr x8,[x20]
00964e54	ldr x0,[x19, #0x8]
00964e58	blr x8
00964e5c	str xzr,[x19, #0x8]
00964e60	ldr x8,[x20]
00964e64	ldr x0,[x19, #0x10]
00964e68	blr x8
00964e6c	str xzr,[x19, #0x10]
00964e70	ldr x8,[x20]
00964e74	ldr x0,[x19, #0x18]
00964e78	blr x8
00964e7c	str xzr,[x19, #0x18]
00964e80	ldr x8,[x20]
00964e84	ldr x0,[x19, #0x20]
00964e88	blr x8
00964e8c	str xzr,[x19, #0x20]
00964e90	ldr x8,[x20]
00964e94	ldr x0,[x19, #0x28]
00964e98	blr x8
00964e9c	ldrb w8,[x19, #0x35]
00964ea0	str xzr,[x19, #0x28]
00964ea4	str wzr,[x19, #0x30]
00964ea8	strb wzr,[x19, #0x34]
00964eac	and w8,w8,#0xfc
00964eb0	strb w8,[x19, #0x35]
00964eb4	ldp x29,x30,[sp, #0x10]
00964eb8	ldp x20,x19,[sp], #0x20
00964ebc	ret
