; EC_GROUP_new_curve_GFp @ 00a28864
00a28864	str x23,[sp, #-0x40]!
00a28868	stp x22,x21,[sp, #0x10]
00a2886c	stp x20,x19,[sp, #0x20]
00a28870	stp x29,x30,[sp, #0x30]
00a28874	add x29,sp,#0x30
00a28878	mov x19,x3
00a2887c	mov x20,x2
00a28880	mov x21,x1
00a28884	mov x22,x0
00a28888	bl 0x00c390f0
00a2888c	cbz x0,0x00a28898
00a28890	bl 0x00c3aed0
00a28894	b 0x00a2889c
00a28898	bl 0x00c3aec0
00a2889c	mov x23,x0
00a288a0	mov x0,x19
00a288a4	bl 0x00c38aa0
00a288a8	mov x1,xzr
00a288ac	mov x2,x23
00a288b0	bl 0x00c3ad00
00a288b4	mov x23,x0
00a288b8	cbz x0,0x00a288e4
00a288bc	mov x0,x23
00a288c0	mov x1,x22
00a288c4	mov x2,x21
00a288c8	mov x3,x20
00a288cc	mov x4,x19
00a288d0	bl 0x00c3aee0
00a288d4	cbnz w0,0x00a288e4
00a288d8	mov x0,x23
00a288dc	bl 0x00c3a770
00a288e0	mov x23,xzr
00a288e4	ldp x29,x30,[sp, #0x30]
00a288e8	ldp x20,x19,[sp, #0x20]
00a288ec	ldp x22,x21,[sp, #0x10]
00a288f0	mov x0,x23
00a288f4	ldr x23,[sp], #0x40
00a288f8	ret
