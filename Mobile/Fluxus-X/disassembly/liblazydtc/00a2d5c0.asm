; BN_GF2m_mod_sqrt_arr @ 00a2d5c0
00a2d5c0	str x23,[sp, #-0x40]!
00a2d5c4	stp x22,x21,[sp, #0x10]
00a2d5c8	stp x20,x19,[sp, #0x20]
00a2d5cc	stp x29,x30,[sp, #0x30]
00a2d5d0	ldr w8,[x2]
00a2d5d4	mov x22,x0
00a2d5d8	add x29,sp,#0x30
00a2d5dc	cbz w8,0x00a2d634
00a2d5e0	mov x0,x3
00a2d5e4	mov x19,x3
00a2d5e8	mov x20,x2
00a2d5ec	mov x21,x1
00a2d5f0	bl 0x00c38a90
00a2d5f4	mov x0,x19
00a2d5f8	bl 0x00c38a40
00a2d5fc	cbz x0,0x00a2d644
00a2d600	ldr w8,[x20]
00a2d604	mov x23,x0
00a2d608	sub w1,w8,#0x1
00a2d60c	bl 0x00c38db0
00a2d610	cbz w0,0x00a2d644
00a2d614	mov x0,x22
00a2d618	mov x1,x21
00a2d61c	mov x2,x23
00a2d620	mov x3,x20
00a2d624	mov x4,x19
00a2d628	bl 0x00a2d2bc
00a2d62c	mov w20,w0
00a2d630	b 0x00a2d648
00a2d634	mov x0,x22
00a2d638	bl 0x00c38e00
00a2d63c	mov w20,#0x1
00a2d640	b 0x00a2d650
00a2d644	mov w20,wzr
00a2d648	mov x0,x19
00a2d64c	bl 0x00c38a20
00a2d650	mov w0,w20
00a2d654	ldp x29,x30,[sp, #0x30]
00a2d658	ldp x20,x19,[sp, #0x20]
00a2d65c	ldp x22,x21,[sp, #0x10]
00a2d660	ldr x23,[sp], #0x40
00a2d664	ret
