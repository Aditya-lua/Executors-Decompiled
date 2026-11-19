; ossl_obj_cleanup_int @ 00aadb14
00aadb14	str x19,[sp, #-0x20]!
00aadb18	adrp x19,0xd22000
00aadb1c	ldr x0,[x19, #0x188]
00aadb20	stp x29,x30,[sp, #0x10]
00aadb24	add x29,sp,#0x10
00aadb28	cbz x0,0x00aadb70
00aadb2c	mov x1,xzr
00aadb30	bl 0x00c36030
00aadb34	ldr x0,[x19, #0x188]
00aadb38	adrp x1,0xaad000
00aadb3c	add x1,x1,#0xb7c
00aadb40	bl 0x00c395e0
00aadb44	ldr x0,[x19, #0x188]
00aadb48	adrp x1,0xaad000
00aadb4c	add x1,x1,#0xb98
00aadb50	bl 0x00c395e0
00aadb54	ldr x0,[x19, #0x188]
00aadb58	adrp x1,0xaad000
00aadb5c	add x1,x1,#0xbac
00aadb60	bl 0x00c395e0
00aadb64	ldr x0,[x19, #0x188]
00aadb68	bl 0x00c34db0
00aadb6c	str xzr,[x19, #0x188]
00aadb70	ldp x29,x30,[sp, #0x10]
00aadb74	ldr x19,[sp], #0x20
00aadb78	ret
