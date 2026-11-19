; PEM_write_DSA_PUBKEY @ 00ab4e98
00ab4e98	sub sp,sp,#0x20
00ab4e9c	stp x29,x30,[sp, #0x10]
00ab4ea0	mov x2,x0
00ab4ea4	adrp x0,0xcb5000
00ab4ea8	ldr x0,[x0, #0x710]
00ab4eac	mov x3,x1
00ab4eb0	adrp x1,0x2da000
00ab4eb4	add x1,x1,#0x514
00ab4eb8	mov x4,xzr
00ab4ebc	mov x5,xzr
00ab4ec0	mov w6,wzr
00ab4ec4	mov x7,xzr
00ab4ec8	add x29,sp,#0x10
00ab4ecc	str xzr,[sp]
00ab4ed0	bl 0x00c36060
00ab4ed4	ldp x29,x30,[sp, #0x10]
00ab4ed8	add sp,sp,#0x20
00ab4edc	ret
