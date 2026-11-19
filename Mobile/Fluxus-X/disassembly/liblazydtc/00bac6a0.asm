; mbedtls_sha1_self_test @ 00bac6a0
00bac6a0	stp x28,x27,[sp, #-0x60]!
00bac6a4	stp x26,x25,[sp, #0x10]
00bac6a8	stp x24,x23,[sp, #0x20]
00bac6ac	stp x22,x21,[sp, #0x30]
00bac6b0	stp x20,x19,[sp, #0x40]
00bac6b4	stp x29,x30,[sp, #0x50]
00bac6b8	add x29,sp,#0x50
00bac6bc	sub sp,sp,#0x4b0
00bac6c0	mrs x8,tpidr_el0
00bac6c4	str x8,[sp, #0x8]
00bac6c8	ldr x8,[x8, #0x28]
00bac6cc	mov w19,w0
00bac6d0	add x0,sp,#0x30
00bac6d4	mov w2,#0x5c
00bac6d8	mov w1,wzr
00bac6dc	stur x8,[x29, #-0x60]
00bac6e0	add x20,sp,#0x30
00bac6e4	bl 0x00c301c0
00bac6e8	adrp x8,0x29c000
00bac6ec	ldr q0,[x8, #0x80]
00bac6f0	mov x26,xzr
00bac6f4	add x20,x20,#0x1c
00bac6f8	mov w22,#0x40
00bac6fc	str q0,[sp, #0x10]
00bac700	str w19,[sp, #0x2c]
00bac704	cbz w19,0x00bac718
00bac708	adrp x0,0x2c0000
00bac70c	add w1,w26,#0x1
00bac710	add x0,x0,#0xc41
00bac714	bl 0x00c41af0
00bac718	mov x8,#0xdcfe
00bac71c	movk x8,#0x98ba, LSL #16
00bac720	ldr q0,[sp, #0x10]
00bac724	movk x8,#0x5476, LSL #32
00bac728	movk x8,#0x1032, LSL #48
00bac72c	str x8,[sp, #0x40]
00bac730	mov w8,#0xe1f0
00bac734	cmp x26,#0x2
00bac738	movk w8,#0xc3d2, LSL #16
00bac73c	str q0,[sp, #0x30]
00bac740	str w8,[sp, #0x48]
00bac744	b.ne 0x00bac820
00bac748	add x0,sp,#0xa0
00bac74c	mov w1,#0x61
00bac750	mov w2,#0x3e8
00bac754	bl 0x00c301c0
00bac758	mov w9,wzr
00bac75c	mov w27,wzr
00bac760	b 0x00bac768
00bac764	ldr w9,[sp, #0x30]
00bac768	and w8,w9,#0x3f
00bac76c	add w10,w9,#0x3e8
00bac770	cmn w9,#0x3e8
00bac774	str w10,[sp, #0x30]
00bac778	b.cc 0x00bac788
00bac77c	ldr w9,[sp, #0x34]
00bac780	add w9,w9,#0x1
00bac784	str w9,[sp, #0x34]
00bac788	cbz w8,0x00bac7c8
00bac78c	add x9,sp,#0x30
00bac790	sub w23,w22,w8
00bac794	add x8,x9,x8
00bac798	add x0,x8,#0x1c
00bac79c	add x1,sp,#0xa0
00bac7a0	mov x2,x23
00bac7a4	bl 0x00c2ffd0
00bac7a8	add x0,sp,#0x30
00bac7ac	mov x1,x20
00bac7b0	bl 0x00c434e0
00bac7b4	add x8,sp,#0xa0
00bac7b8	add x28,x8,x23
00bac7bc	mov w8,#0x3e8
00bac7c0	sub x19,x8,x23
00bac7c4	b 0x00bac7d0
00bac7c8	add x28,sp,#0xa0
00bac7cc	mov w19,#0x3e8
00bac7d0	sub x24,x19,#0x40
00bac7d4	and x21,x24,#-0x40
00bac7d8	add x25,x21,#0x40
00bac7dc	mov x23,x28
00bac7e0	add x0,sp,#0x30
00bac7e4	mov x1,x23
00bac7e8	bl 0x00c434e0
00bac7ec	sub x19,x19,#0x40
00bac7f0	cmp x19,#0x3f
00bac7f4	add x23,x23,#0x40
00bac7f8	b.hi 0x00bac7e0
00bac7fc	subs x2,x24,x21
00bac800	b.eq 0x00bac810
00bac804	add x1,x28,x25
00bac808	mov x0,x20
00bac80c	bl 0x00c2ffd0
00bac810	add w27,w27,#0x1
00bac814	cmp w27,#0x3e8
00bac818	b.ne 0x00bac764
00bac81c	b 0x00bac848
00bac820	adrp x8,0x788000
00bac824	add x8,x8,#0x488
00bac828	ldr x2,[x8, x26, LSL #0x3]
00bac82c	adrp x9,0x788000
00bac830	mov w8,#0x39
00bac834	add x9,x9,#0x3d8
00bac838	madd x1,x26,x8,x9
00bac83c	mov x0,x20
00bac840	str w2,[sp, #0x30]
00bac844	bl 0x00c2ffd0
00bac848	add x0,sp,#0x30
00bac84c	add x1,sp,#0x8c
00bac850	bl 0x00c42a20
00bac854	adrp x9,0x788000
00bac858	mov w8,#0x14
00bac85c	add x9,x9,#0x4a0
00bac860	madd x1,x26,x8,x9
00bac864	add x0,sp,#0x8c
00bac868	mov w2,#0x14
00bac86c	bl 0x00c300b0
00bac870	cbnz w0,0x00bac8a8
00bac874	ldr w19,[sp, #0x2c]
00bac878	cbz w19,0x00bac888
00bac87c	adrp x0,0x77c000
00bac880	add x0,x0,#0x87c
00bac884	bl 0x00c30760
00bac888	add x26,x26,#0x1
00bac88c	cmp x26,#0x3
00bac890	b.cc 0x00bac704
00bac894	cbz w19,0x00bac8c0
00bac898	mov w0,#0xa
00bac89c	bl 0x00c42240
00bac8a0	mov w19,wzr
00bac8a4	b 0x00bac8c0
00bac8a8	ldr w8,[sp, #0x2c]
00bac8ac	cbz w8,0x00bac8bc
00bac8b0	adrp x0,0x77c000
00bac8b4	add x0,x0,#0x854
00bac8b8	bl 0x00c30760
00bac8bc	mov w19,#0x1
00bac8c0	add x0,sp,#0x30
00bac8c4	mov w1,#0x5c
00bac8c8	bl 0x00c42220
00bac8cc	ldr x8,[sp, #0x8]
00bac8d0	ldr x8,[x8, #0x28]
00bac8d4	ldur x9,[x29, #-0x60]
00bac8d8	cmp x8,x9
00bac8dc	b.ne 0x00bac904
00bac8e0	mov w0,w19
00bac8e4	add sp,sp,#0x4b0
00bac8e8	ldp x29,x30,[sp, #0x50]
00bac8ec	ldp x20,x19,[sp, #0x40]
00bac8f0	ldp x22,x21,[sp, #0x30]
00bac8f4	ldp x24,x23,[sp, #0x20]
00bac8f8	ldp x26,x25,[sp, #0x10]
00bac8fc	ldp x28,x27,[sp], #0x60
00bac900	ret
00bac904	bl 0x00c2fec0
