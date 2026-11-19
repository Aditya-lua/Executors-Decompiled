; BN_mod_exp_mont_consttime_x2 @ 00a1d1ac
00a1d1ac	str x25,[sp, #-0x50]!
00a1d1b0	stp x29,x30,[sp, #0x40]
00a1d1b4	add x29,sp,#0x40
00a1d1b8	stp x24,x23,[sp, #0x10]
00a1d1bc	ldr x24,[x29, #0x20]
00a1d1c0	stp x22,x21,[sp, #0x20]
00a1d1c4	ldp x22,x23,[x29, #0x10]
00a1d1c8	mov x21,x5
00a1d1cc	mov x5,x4
00a1d1d0	mov x4,x24
00a1d1d4	stp x20,x19,[sp, #0x30]
00a1d1d8	mov x19,x7
00a1d1dc	mov x20,x6
00a1d1e0	bl 0x00a1c3f8
00a1d1e4	mov w25,w0
00a1d1e8	mov x0,x21
00a1d1ec	mov x1,x20
00a1d1f0	mov x2,x19
00a1d1f4	mov x3,x22
00a1d1f8	mov x4,x24
00a1d1fc	mov x5,x23
00a1d200	bl 0x00a1c3f8
00a1d204	ldp x29,x30,[sp, #0x40]
00a1d208	ldp x20,x19,[sp, #0x30]
00a1d20c	ldp x22,x21,[sp, #0x20]
00a1d210	ldp x24,x23,[sp, #0x10]
00a1d214	and w0,w0,w25
00a1d218	ldr x25,[sp], #0x50
00a1d21c	ret
