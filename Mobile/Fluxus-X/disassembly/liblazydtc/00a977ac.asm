; FUN_00a977ac @ 00a977ac
00a977ac	sub sp,sp,#0x80
00a977b0	stp x24,x23,[sp, #0x40]
00a977b4	stp x22,x21,[sp, #0x50]
00a977b8	stp x20,x19,[sp, #0x60]
00a977bc	mov x20,x3
00a977c0	mov x23,x2
00a977c4	mov x21,x1
00a977c8	lsr x8,x3,#0x1e
00a977cc	mov x19,x0
00a977d0	stp x28,x27,[sp, #0x20]
00a977d4	stp x26,x25,[sp, #0x30]
00a977d8	stp x29,x30,[sp, #0x70]
00a977dc	add x29,sp,#0x70
00a977e0	cbz x8,0x00a97868
00a977e4	orr x27,xzr,#-0x40000000
00a977e8	add x8,x20,x27
00a977ec	and x28,x8,#-0x40000000
00a977f0	mov w26,#0x40000000
00a977f4	add x22,x28,x26
00a977f8	add x24,x19,#0x28
00a977fc	str x8,[sp, #0x8]
00a97800	add x8,x23,x22
00a97804	mov x25,x21
00a97808	str x8,[sp, #0x10]
00a9780c	mov x0,x19
00a97810	bl 0x00c3ceb0
00a97814	str w0,[sp, #0x1c]
00a97818	mov x0,x19
00a9781c	bl 0x00c3cea0
00a97820	add x3,x0,#0x4
00a97824	mov w2,#0x40000000
00a97828	add x5,sp,#0x1c
00a9782c	mov x0,x23
00a97830	mov x1,x25
00a97834	mov x4,x24
00a97838	bl 0x00c3e500
00a9783c	ldr w1,[sp, #0x1c]
00a97840	mov x0,x19
00a97844	bl 0x00c3ced0
00a97848	add x20,x20,x27
00a9784c	add x23,x23,x26
00a97850	lsr x8,x20,#0x1e
00a97854	add x25,x25,x26
00a97858	cbnz x8,0x00a9780c
00a9785c	ldp x8,x23,[sp, #0x8]
00a97860	add x21,x21,x22
00a97864	sub x20,x8,x28
00a97868	cbz x20,0x00a978a8
00a9786c	mov x0,x19
00a97870	bl 0x00c3ceb0
00a97874	str w0,[sp, #0x18]
00a97878	mov x0,x19
00a9787c	bl 0x00c3cea0
00a97880	add x3,x0,#0x4
00a97884	add x4,x19,#0x28
00a97888	add x5,sp,#0x18
00a9788c	mov x0,x23
00a97890	mov x1,x21
00a97894	mov x2,x20
00a97898	bl 0x00c3e500
00a9789c	ldr w1,[sp, #0x18]
00a978a0	mov x0,x19
00a978a4	bl 0x00c3ced0
00a978a8	ldp x29,x30,[sp, #0x70]
00a978ac	ldp x20,x19,[sp, #0x60]
00a978b0	ldp x22,x21,[sp, #0x50]
00a978b4	ldp x24,x23,[sp, #0x40]
00a978b8	ldp x26,x25,[sp, #0x30]
00a978bc	ldp x28,x27,[sp, #0x20]
00a978c0	mov w0,#0x1
00a978c4	add sp,sp,#0x80
00a978c8	ret
