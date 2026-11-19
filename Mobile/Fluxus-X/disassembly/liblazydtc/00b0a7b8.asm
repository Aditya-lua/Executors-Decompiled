; X509_STORE_add_lookup @ 00b0a7b8
00b0a7b8	str x23,[sp, #-0x40]!
00b0a7bc	stp x22,x21,[sp, #0x10]
00b0a7c0	stp x20,x19,[sp, #0x20]
00b0a7c4	stp x29,x30,[sp, #0x30]
00b0a7c8	ldr x22,[x0, #0x10]
00b0a7cc	mov x20,x0
00b0a7d0	add x29,sp,#0x30
00b0a7d4	mov x21,x1
00b0a7d8	mov x0,x22
00b0a7dc	bl 0x00c325e0
00b0a7e0	cmp w0,#0x1
00b0a7e4	b.lt 0x00b0a818
00b0a7e8	mov w23,wzr
00b0a7ec	mov x0,x22
00b0a7f0	mov w1,w23
00b0a7f4	bl 0x00c32610
00b0a7f8	ldr x8,[x0, #0x8]
00b0a7fc	cmp x8,x21
00b0a800	b.eq 0x00b0a8a0
00b0a804	mov x0,x22
00b0a808	add w23,w23,#0x1
00b0a80c	bl 0x00c325e0
00b0a810	cmp w23,w0
00b0a814	b.lt 0x00b0a7ec
00b0a818	mov x0,x21
00b0a81c	bl 0x00b0a18c
00b0a820	mov x19,x0
00b0a824	cbz x0,0x00b0a8a8
00b0a828	str x20,[x19, #0x18]
00b0a82c	ldr x0,[x20, #0x10]
00b0a830	mov x1,x19
00b0a834	bl 0x00c347a0
00b0a838	cbnz w0,0x00b0a8d8
00b0a83c	bl 0x00c342a0
00b0a840	adrp x0,0x2aa000
00b0a844	adrp x2,0x2d4000
00b0a848	add x0,x0,#0xba3
00b0a84c	add x2,x2,#0x5ae
00b0a850	mov w1,#0x120
00b0a854	bl 0x00c342b0
00b0a858	mov w1,#0x100
00b0a85c	mov w0,#0xb
00b0a860	movk w1,#0xc, LSL #16
00b0a864	mov x2,xzr
00b0a868	bl 0x00c342c0
00b0a86c	ldr x8,[x19, #0x8]
00b0a870	cbz x8,0x00b0a884
00b0a874	ldr x8,[x8, #0x10]
00b0a878	cbz x8,0x00b0a884
00b0a87c	mov x0,x19
00b0a880	blr x8
00b0a884	adrp x1,0x2aa000
00b0a888	add x1,x1,#0xba3
00b0a88c	mov w2,#0x29
00b0a890	mov x0,x19
00b0a894	bl 0x00c32310
00b0a898	mov x19,xzr
00b0a89c	b 0x00b0a8d8
00b0a8a0	mov x19,x0
00b0a8a4	b 0x00b0a8d8
00b0a8a8	bl 0x00c342a0
00b0a8ac	adrp x0,0x2aa000
00b0a8b0	adrp x2,0x2d4000
00b0a8b4	add x0,x0,#0xba3
00b0a8b8	add x2,x2,#0x5ae
00b0a8bc	mov w1,#0x118
00b0a8c0	bl 0x00c342b0
00b0a8c4	mov w1,#0x100
00b0a8c8	mov w0,#0xb
00b0a8cc	movk w1,#0xc, LSL #16
00b0a8d0	mov x2,xzr
00b0a8d4	bl 0x00c342c0
00b0a8d8	mov x0,x19
00b0a8dc	ldp x29,x30,[sp, #0x30]
00b0a8e0	ldp x20,x19,[sp, #0x20]
00b0a8e4	ldp x22,x21,[sp, #0x10]
00b0a8e8	ldr x23,[sp], #0x40
00b0a8ec	ret
