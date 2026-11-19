; ossl_dh_generate_public_key @ 00a1e7a0
00a1e7a0	stp x24,x23,[sp, #-0x40]!
00a1e7a4	stp x22,x21,[sp, #0x10]
00a1e7a8	stp x20,x19,[sp, #0x20]
00a1e7ac	stp x29,x30,[sp, #0x30]
00a1e7b0	add x29,sp,#0x30
00a1e7b4	mov x21,x3
00a1e7b8	mov x23,x2
00a1e7bc	mov x22,x1
00a1e7c0	mov x20,x0
00a1e7c4	bl 0x00c37710
00a1e7c8	cbz x0,0x00a1e7e0
00a1e7cc	ldrb w8,[x22, #0x80]
00a1e7d0	mov x19,x0
00a1e7d4	tbnz w8,#0x0,0x00a1e7e8
00a1e7d8	mov x24,xzr
00a1e7dc	b 0x00a1e804
00a1e7e0	mov w20,wzr
00a1e7e4	b 0x00a1e854
00a1e7e8	ldr x1,[x22, #0xc0]
00a1e7ec	ldr x2,[x22, #0x8]
00a1e7f0	add x0,x22,#0x88
00a1e7f4	mov x3,x20
00a1e7f8	bl 0x00c38fa0
00a1e7fc	mov x24,x0
00a1e800	cbz x0,0x00a1e848
00a1e804	mov w2,#0x4
00a1e808	mov x0,x19
00a1e80c	mov x1,x23
00a1e810	bl 0x00c38df0
00a1e814	ldr x8,[x22, #0xb8]
00a1e818	ldr x2,[x22, #0x18]
00a1e81c	ldr x4,[x22, #0x8]
00a1e820	mov x0,x22
00a1e824	ldr x8,[x8, #0x18]
00a1e828	mov x1,x21
00a1e82c	mov x3,x19
00a1e830	mov x5,x20
00a1e834	mov x6,x24
00a1e838	blr x8
00a1e83c	cmp w0,#0x0
00a1e840	cset w20,ne
00a1e844	b 0x00a1e84c
00a1e848	mov w20,wzr
00a1e84c	mov x0,x19
00a1e850	bl 0x00c322e0
00a1e854	mov w0,w20
00a1e858	ldp x29,x30,[sp, #0x30]
00a1e85c	ldp x20,x19,[sp, #0x20]
00a1e860	ldp x22,x21,[sp, #0x10]
00a1e864	ldp x24,x23,[sp], #0x40
00a1e868	ret
