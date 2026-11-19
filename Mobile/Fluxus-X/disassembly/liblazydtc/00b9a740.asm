; mbedtls_psa_ecp_generate_key @ 00b9a740
00b9a740	sub sp,sp,#0x160
00b9a744	str x28,[sp, #0x110]
00b9a748	stp x24,x23,[sp, #0x120]
00b9a74c	stp x22,x21,[sp, #0x130]
00b9a750	stp x20,x19,[sp, #0x140]
00b9a754	stp x29,x30,[sp, #0x150]
00b9a758	add x29,sp,#0x150
00b9a75c	mrs x24,tpidr_el0
00b9a760	ldr x8,[x24, #0x28]
00b9a764	mov x21,x1
00b9a768	mov w9,#0xcf00
00b9a76c	mov w10,#0x4100
00b9a770	stur x8,[x29, #-0x48]
00b9a774	ldrh w8,[x0]
00b9a778	ldrh w1,[x0, #0x2]
00b9a77c	mov x20,x3
00b9a780	mov x19,x2
00b9a784	and w9,w8,w9
00b9a788	cmp w9,w10
00b9a78c	csel w0,w8,wzr,eq
00b9a790	bl 0x00c432a0
00b9a794	mov w23,w0
00b9a798	bl 0x00c42640
00b9a79c	mov w22,#0xffffff7a
00b9a7a0	cbz w23,0x00b9a80c
00b9a7a4	cbz x0,0x00b9a80c
00b9a7a8	add x0,sp,#0x8
00b9a7ac	bl 0x00c426f0
00b9a7b0	adrp x2,0xcb5000
00b9a7b4	ldr x2,[x2, #0xac0]
00b9a7b8	add x1,sp,#0x8
00b9a7bc	mov w0,w23
00b9a7c0	mov x3,xzr
00b9a7c4	bl 0x00c42650
00b9a7c8	mov w22,w0
00b9a7cc	cbz w0,0x00b9a7e8
00b9a7d0	add x0,sp,#0x8
00b9a7d4	bl 0x00c426e0
00b9a7d8	mov w0,w22
00b9a7dc	bl 0x00c42bf0
00b9a7e0	mov w22,w0
00b9a7e4	b 0x00b9a80c
00b9a7e8	add x0,sp,#0x8
00b9a7ec	mov x1,x20
00b9a7f0	mov x2,x21
00b9a7f4	mov x3,x19
00b9a7f8	bl 0x00c427f0
00b9a7fc	bl 0x00c42bf0
00b9a800	mov w22,w0
00b9a804	add x0,sp,#0x8
00b9a808	bl 0x00c426e0
00b9a80c	ldr x8,[x24, #0x28]
00b9a810	ldur x9,[x29, #-0x48]
00b9a814	cmp x8,x9
00b9a818	b.ne 0x00b9a83c
00b9a81c	mov w0,w22
00b9a820	ldp x29,x30,[sp, #0x150]
00b9a824	ldp x20,x19,[sp, #0x140]
00b9a828	ldp x22,x21,[sp, #0x130]
00b9a82c	ldp x24,x23,[sp, #0x120]
00b9a830	ldr x28,[sp, #0x110]
00b9a834	add sp,sp,#0x160
00b9a838	ret
00b9a83c	bl 0x00c2fec0
