; EC_pre_comp_free @ 00a3032c
00a3032c	str x19,[sp, #-0x20]!
00a30330	stp x29,x30,[sp, #0x10]
00a30334	ldr w8,[x0, #0x98]
00a30338	mov x19,x0
00a3033c	add x29,sp,#0x10
00a30340	cmp w8,#0x5
00a30344	b.ne 0x00a30350
00a30348	ldr x0,[x19, #0xa0]
00a3034c	bl 0x00c3b090
00a30350	str xzr,[x19, #0xa0]
00a30354	ldp x29,x30,[sp, #0x10]
00a30358	ldr x19,[sp], #0x20
00a3035c	ret
