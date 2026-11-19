; UI_get_result_length @ 00aee870
00aee870	stp x20,x19,[sp, #-0x20]!
00aee874	stp x29,x30,[sp, #0x10]
00aee878	add x29,sp,#0x10
00aee87c	tbnz w1,#0x1f,0x00aee8bc
00aee880	mov x20,x0
00aee884	ldr x0,[x0, #0x8]
00aee888	mov w19,w1
00aee88c	bl 0x00c325e0
00aee890	cmp w0,w19
00aee894	b.le 0x00aee8e4
00aee898	ldr x0,[x20, #0x8]
00aee89c	mov w1,w19
00aee8a0	bl 0x00c32610
00aee8a4	ldr w8,[x0]
00aee8a8	sub w8,w8,#0x1
00aee8ac	cmp w8,#0x1
00aee8b0	b.hi 0x00aee910
00aee8b4	ldr w0,[x0, #0x20]
00aee8b8	b 0x00aee914
00aee8bc	bl 0x00c342a0
00aee8c0	adrp x0,0x2a0000
00aee8c4	adrp x2,0x2ca000
00aee8c8	add x0,x0,#0xc2f
00aee8cc	add x2,x2,#0x407
00aee8d0	mov w1,#0x1bf
00aee8d4	bl 0x00c342b0
00aee8d8	mov w0,#0x28
00aee8dc	mov w1,#0x67
00aee8e0	b 0x00aee908
00aee8e4	bl 0x00c342a0
00aee8e8	adrp x0,0x2a0000
00aee8ec	adrp x2,0x2ca000
00aee8f0	add x0,x0,#0xc2f
00aee8f4	add x2,x2,#0x407
00aee8f8	mov w1,#0x1c3
00aee8fc	bl 0x00c342b0
00aee900	mov w0,#0x28
00aee904	mov w1,#0x66
00aee908	mov x2,xzr
00aee90c	bl 0x00c342c0
00aee910	mov w0,#0xffffffff
00aee914	ldp x29,x30,[sp, #0x10]
00aee918	ldp x20,x19,[sp], #0x20
00aee91c	ret
