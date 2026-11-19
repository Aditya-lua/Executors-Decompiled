; FUN_00a91e8c @ 00a91e8c
00a91e8c	sub sp,sp,#0x40
00a91e90	orr x8,x1,x2
00a91e94	stp x22,x21,[sp, #0x10]
00a91e98	stp x20,x19,[sp, #0x20]
00a91e9c	stp x29,x30,[sp, #0x30]
00a91ea0	add x29,sp,#0x30
00a91ea4	cbz x8,0x00a91f2c
00a91ea8	ldr x22,[x0, #0x78]
00a91eac	mov w19,w3
00a91eb0	mov x20,x1
00a91eb4	mov x21,x0
00a91eb8	mov x8,#-0x1
00a91ebc	stp xzr,xzr,[x22, #0xa8]
00a91ec0	str xzr,[x22, #0xb8]
00a91ec4	str x8,[x22, #0xc8]
00a91ec8	cbz x2,0x00a91f1c
00a91ecc	stp xzr,xzr,[sp]
00a91ed0	ldrsw x8,[x22, #0xc4]
00a91ed4	cmp w8,#0x10
00a91ed8	b.gt 0x00a91ef4
00a91edc	mov x9,sp
00a91ee0	sub x9,x9,x8
00a91ee4	add x0,x9,#0x10
00a91ee8	mov x1,x2
00a91eec	mov x2,x8
00a91ef0	bl 0x00c2ffd0
00a91ef4	mov x2,sp
00a91ef8	mov x0,x21
00a91efc	mov x1,x20
00a91f00	mov w3,w19
00a91f04	bl 0x00a91ab4
00a91f08	ldur x8,[x22, #0x24]
00a91f0c	ldr w9,[x22, #0x2c]
00a91f10	str x8,[x22, #0x78]
00a91f14	str w9,[x22, #0x80]
00a91f18	b 0x00a91f2c
00a91f1c	mov x0,x21
00a91f20	mov x1,x20
00a91f24	mov w3,w19
00a91f28	bl 0x00a91ab4
00a91f2c	ldp x29,x30,[sp, #0x30]
00a91f30	ldp x20,x19,[sp, #0x20]
00a91f34	ldp x22,x21,[sp, #0x10]
00a91f38	mov w0,#0x1
00a91f3c	add sp,sp,#0x40
00a91f40	ret
