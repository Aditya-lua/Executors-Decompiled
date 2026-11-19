; UI_get0_result @ 00aee798
00aee798	stp x20,x19,[sp, #-0x20]!
00aee79c	stp x29,x30,[sp, #0x10]
00aee7a0	add x29,sp,#0x10
00aee7a4	tbnz w1,#0x1f,0x00aee7ec
00aee7a8	mov x20,x0
00aee7ac	ldr x0,[x0, #0x8]
00aee7b0	mov w19,w1
00aee7b4	bl 0x00c325e0
00aee7b8	cmp w0,w19
00aee7bc	b.le 0x00aee814
00aee7c0	ldr x0,[x20, #0x8]
00aee7c4	mov w1,w19
00aee7c8	bl 0x00c32610
00aee7cc	ldr w9,[x0]
00aee7d0	mov x8,x0
00aee7d4	mov x0,xzr
00aee7d8	sub w9,w9,#0x1
00aee7dc	cmp w9,#0x1
00aee7e0	b.hi 0x00aee844
00aee7e4	ldr x0,[x8, #0x18]
00aee7e8	b 0x00aee844
00aee7ec	bl 0x00c342a0
00aee7f0	adrp x0,0x2a0000
00aee7f4	adrp x2,0x2a4000
00aee7f8	add x0,x0,#0xc2f
00aee7fc	add x2,x2,#0x921
00aee800	mov w1,#0x1b2
00aee804	bl 0x00c342b0
00aee808	mov w0,#0x28
00aee80c	mov w1,#0x67
00aee810	b 0x00aee838
00aee814	bl 0x00c342a0
00aee818	adrp x0,0x2a0000
00aee81c	adrp x2,0x2a4000
00aee820	add x0,x0,#0xc2f
00aee824	add x2,x2,#0x921
00aee828	mov w1,#0x1b6
00aee82c	bl 0x00c342b0
00aee830	mov w0,#0x28
00aee834	mov w1,#0x66
00aee838	mov x2,xzr
00aee83c	bl 0x00c342c0
00aee840	mov x0,xzr
00aee844	ldp x29,x30,[sp, #0x10]
00aee848	ldp x20,x19,[sp], #0x20
00aee84c	ret
