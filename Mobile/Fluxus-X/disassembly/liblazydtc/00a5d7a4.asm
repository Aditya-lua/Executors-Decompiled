; evp_generic_fetch_from_prov @ 00a5d7a4
00a5d7a4	sub sp,sp,#0xa0
00a5d7a8	str x25,[sp, #0x50]
00a5d7ac	stp x24,x23,[sp, #0x60]
00a5d7b0	stp x22,x21,[sp, #0x70]
00a5d7b4	stp x20,x19,[sp, #0x80]
00a5d7b8	stp x29,x30,[sp, #0x90]
00a5d7bc	add x29,sp,#0x90
00a5d7c0	mov x19,x6
00a5d7c4	mov x20,x5
00a5d7c8	mov x21,x4
00a5d7cc	mov x22,x3
00a5d7d0	mov x23,x2
00a5d7d4	mov w24,w1
00a5d7d8	mov x25,x0
00a5d7dc	bl 0x00c3b2f0
00a5d7e0	stp x19,x0,[sp]
00a5d7e4	add x0,sp,#0x8
00a5d7e8	mov x1,x25
00a5d7ec	mov w2,w24
00a5d7f0	mov w3,wzr
00a5d7f4	mov x4,x23
00a5d7f8	mov x5,x22
00a5d7fc	mov x6,x21
00a5d800	mov x7,x20
00a5d804	str xzr,[sp, #0x28]
00a5d808	bl 0x00a5d3a4
00a5d80c	ldr x8,[sp, #0x28]
00a5d810	mov x19,x0
00a5d814	cbz x8,0x00a5d820
00a5d818	mov x0,x8
00a5d81c	bl 0x00c3b5c0
00a5d820	mov x0,x19
00a5d824	ldp x29,x30,[sp, #0x90]
00a5d828	ldp x20,x19,[sp, #0x80]
00a5d82c	ldp x22,x21,[sp, #0x70]
00a5d830	ldp x24,x23,[sp, #0x60]
00a5d834	ldr x25,[sp, #0x50]
00a5d838	add sp,sp,#0xa0
00a5d83c	ret
