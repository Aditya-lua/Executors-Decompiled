; OBJ_sigid_free @ 00aaf620
00aaf620	stp x20,x19,[sp, #-0x20]!
00aaf624	adrp x19,0xd22000
00aaf628	ldr x0,[x19, #0x190]
00aaf62c	adrp x1,0xaaf000
00aaf630	add x1,x1,#0x660
00aaf634	stp x29,x30,[sp, #0x10]
00aaf638	add x29,sp,#0x10
00aaf63c	bl 0x00c32600
00aaf640	adrp x20,0xd22000
00aaf644	ldr x0,[x20, #0x198]
00aaf648	str xzr,[x19, #0x190]
00aaf64c	bl 0x00c34770
00aaf650	ldp x29,x30,[sp, #0x10]
00aaf654	str xzr,[x20, #0x198]
00aaf658	ldp x20,x19,[sp], #0x20
00aaf65c	ret
