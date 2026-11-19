; evp_md_free_int @ 00a5f80c
00a5f80c	stp x20,x19,[sp, #-0x20]!
00a5f810	stp x29,x30,[sp, #0x10]
00a5f814	mov x19,x0
00a5f818	ldr x0,[x0, #0x60]
00a5f81c	adrp x20,0x2a0000
00a5f820	add x20,x20,#0x246
00a5f824	mov w2,#0x354
00a5f828	mov x1,x20
00a5f82c	add x29,sp,#0x10
00a5f830	bl 0x00c32310
00a5f834	ldr x0,[x19, #0x70]
00a5f838	bl 0x00c3b690
00a5f83c	ldr x0,[x19, #0x80]
00a5f840	bl 0x00c34d40
00a5f844	ldp x29,x30,[sp, #0x10]
00a5f848	mov w2,#0x357
00a5f84c	mov x0,x19
00a5f850	mov x1,x20
00a5f854	ldp x20,x19,[sp], #0x20
00a5f858	b 0x00c32310
