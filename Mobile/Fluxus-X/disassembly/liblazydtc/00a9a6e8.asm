; CRYPTO_secure_free @ 00a9a6e8
00a9a6e8	stp x22,x21,[sp, #-0x30]!
00a9a6ec	stp x20,x19,[sp, #0x10]
00a9a6f0	stp x29,x30,[sp, #0x20]
00a9a6f4	add x29,sp,#0x20
00a9a6f8	cbz x0,0x00a9a794
00a9a6fc	adrp x8,0xd22000
00a9a700	ldrb w8,[x8, #0xf0]
00a9a704	mov x19,x0
00a9a708	cmp w8,#0x1
00a9a70c	b.ne 0x00a9a780
00a9a710	adrp x22,0xd22000
00a9a714	add x22,x22,#0x108
00a9a718	ldr x8,[x22, #0x10]
00a9a71c	cmp x8,x19
00a9a720	b.hi 0x00a9a780
00a9a724	ldr x9,[x22, #0x18]
00a9a728	add x8,x8,x9
00a9a72c	cmp x8,x19
00a9a730	b.ls 0x00a9a780
00a9a734	adrp x21,0xd22000
00a9a738	ldr x0,[x21, #0xf8]
00a9a73c	bl 0x00c356a0
00a9a740	cbz w0,0x00a9a794
00a9a744	ldr x8,[x22, #0x10]
00a9a748	cmp x8,x19
00a9a74c	b.hi 0x00a9a844
00a9a750	ldr x9,[x22, #0x18]
00a9a754	add x10,x8,x9
00a9a758	cmp x10,x19
00a9a75c	b.ls 0x00a9a844
00a9a760	ldp x11,x10,[x22, #0x28]
00a9a764	add x9,x19,x9
00a9a768	sub x8,x9,x8
00a9a76c	cmp x10,x8
00a9a770	sub x20,x11,#0x1
00a9a774	b.ls 0x00a9a7a4
00a9a778	ldr x2,[x22, #0x38]
00a9a77c	b 0x00a9a7d8
00a9a780	mov x0,x19
00a9a784	ldp x29,x30,[sp, #0x20]
00a9a788	ldp x20,x19,[sp, #0x10]
00a9a78c	ldp x22,x21,[sp], #0x30
00a9a790	b 0x00c32310
00a9a794	ldp x29,x30,[sp, #0x20]
00a9a798	ldp x20,x19,[sp, #0x10]
00a9a79c	ldp x22,x21,[sp], #0x30
00a9a7a0	ret
00a9a7a4	ldr x2,[x22, #0x38]
00a9a7a8	udiv x8,x8,x10
00a9a7ac	mov w9,#0x1
00a9a7b0	lsr x10,x8,#0x3
00a9a7b4	ldrb w10,[x2, x10]
00a9a7b8	and x11,x8,#0x7
00a9a7bc	lsl x11,x9,x11
00a9a7c0	tst x11,x10
00a9a7c4	b.ne 0x00a9a7d8
00a9a7c8	tbnz w8,#0x0,0x00a9a82c
00a9a7cc	lsr x8,x8,#0x1
00a9a7d0	sub x20,x20,#0x1
00a9a7d4	cbnz x8,0x00a9a7b0
00a9a7d8	mov x0,x19
00a9a7dc	mov w1,w20
00a9a7e0	bl 0x00a9b18c
00a9a7e4	cbz w0,0x00a9a85c
00a9a7e8	ldr x8,[x22, #0x18]
00a9a7ec	and x9,x20,#0xffffffff
00a9a7f0	mov x0,x19
00a9a7f4	lsr x20,x8,x9
00a9a7f8	mov x1,x20
00a9a7fc	bl 0x00c34750
00a9a800	adrp x8,0xd22000
00a9a804	ldr x9,[x8, #0x100]
00a9a808	mov x0,x19
00a9a80c	sub x9,x9,x20
00a9a810	str x9,[x8, #0x100]
00a9a814	bl 0x00a9a8b4
00a9a818	ldr x0,[x21, #0xf8]
00a9a81c	ldp x29,x30,[sp, #0x20]
00a9a820	ldp x20,x19,[sp, #0x10]
00a9a824	ldp x22,x21,[sp], #0x30
00a9a828	b 0x00c35690
00a9a82c	adrp x0,0x2a4000
00a9a830	adrp x1,0x2d6000
00a9a834	add x0,x0,#0x3f8
00a9a838	add x1,x1,#0xc
00a9a83c	mov w2,#0x14c
00a9a840	bl 0x00c3c240
00a9a844	adrp x0,0x29e000
00a9a848	adrp x1,0x2d6000
00a9a84c	add x0,x0,#0x41c
00a9a850	add x1,x1,#0xc
00a9a854	mov w2,#0x2d2
00a9a858	bl 0x00c3c240
00a9a85c	adrp x0,0x2ac000
00a9a860	adrp x1,0x2d6000
00a9a864	add x0,x0,#0x398
00a9a868	add x1,x1,#0xc
00a9a86c	mov w2,#0x2d6
00a9a870	bl 0x00c3c240
