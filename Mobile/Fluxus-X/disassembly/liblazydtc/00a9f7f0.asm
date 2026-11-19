; OSSL_PARAM_set_utf8_ptr @ 00a9f7f0
00a9f7f0	stp x20,x19,[sp, #-0x20]!
00a9f7f4	stp x29,x30,[sp, #0x10]
00a9f7f8	add x29,sp,#0x10
00a9f7fc	cbz x0,0x00a9f848
00a9f800	mov x19,x1
00a9f804	mov x20,x0
00a9f808	str xzr,[x0, #0x20]
00a9f80c	cbz x1,0x00a9f820
00a9f810	mov x0,x19
00a9f814	bl 0x00c2ff50
00a9f818	mov x8,x0
00a9f81c	b 0x00a9f824
00a9f820	mov x8,xzr
00a9f824	ldr w9,[x20, #0x8]
00a9f828	mov w0,wzr
00a9f82c	str x8,[x20, #0x20]
00a9f830	cmp w9,#0x6
00a9f834	b.ne 0x00a9f848
00a9f838	ldr x8,[x20, #0x10]
00a9f83c	cbz x8,0x00a9f844
00a9f840	str x19,[x8]
00a9f844	mov w0,#0x1
00a9f848	ldp x29,x30,[sp, #0x10]
00a9f84c	ldp x20,x19,[sp], #0x20
00a9f850	ret
