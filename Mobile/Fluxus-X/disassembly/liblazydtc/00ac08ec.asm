; FUN_00ac08ec @ 00ac08ec
00ac08ec	str x21,[sp, #-0x30]!
00ac08f0	mov x8,x1
00ac08f4	stp x20,x19,[sp, #0x10]
00ac08f8	mov x20,x0
00ac08fc	mov w1,#0x208
00ac0900	mov x0,x8
00ac0904	stp x29,x30,[sp, #0x20]
00ac0908	add x29,sp,#0x20
00ac090c	mov w19,w2
00ac0910	bl 0x00c355d0
00ac0914	cbz x0,0x00ac0960
00ac0918	mov x21,x0
00ac091c	orr w1,wzr,#0x78
00ac0920	mov x0,x21
00ac0924	mov x2,xzr
00ac0928	mov x3,x20
00ac092c	bl 0x00c321a0
00ac0930	ldr x0,[x20]
00ac0934	cbz x0,0x00ac0988
00ac0938	bl 0x00c34c00
00ac093c	bl 0x00c34c30
00ac0940	cmp w0,w19
00ac0944	b.eq 0x00ac09bc
00ac0948	mov x0,x21
00ac094c	bl 0x00c35620
00ac0950	mov w1,#0x208
00ac0954	bl 0x00c355d0
00ac0958	mov x21,x0
00ac095c	cbnz x0,0x00ac091c
00ac0960	bl 0x00c342a0
00ac0964	adrp x0,0x29e000
00ac0968	adrp x2,0x2d8000
00ac096c	add x0,x0,#0x913
00ac0970	add x2,x2,#0x680
00ac0974	mov w1,#0x2aa
00ac0978	bl 0x00c342b0
00ac097c	mov w0,#0x21
00ac0980	mov w1,#0x6c
00ac0984	b 0x00ac09b0
00ac0988	bl 0x00c342a0
00ac098c	adrp x0,0x29e000
00ac0990	adrp x2,0x2d8000
00ac0994	add x0,x0,#0x913
00ac0998	add x2,x2,#0x680
00ac099c	mov w1,#0x2af
00ac09a0	bl 0x00c342b0
00ac09a4	mov w1,#0x103
00ac09a8	mov w0,#0x21
00ac09ac	movk w1,#0xc, LSL #16
00ac09b0	mov x2,xzr
00ac09b4	bl 0x00c342c0
00ac09b8	mov x21,xzr
00ac09bc	ldp x29,x30,[sp, #0x20]
00ac09c0	ldp x20,x19,[sp, #0x10]
00ac09c4	mov x0,x21
00ac09c8	ldr x21,[sp], #0x30
00ac09cc	ret
