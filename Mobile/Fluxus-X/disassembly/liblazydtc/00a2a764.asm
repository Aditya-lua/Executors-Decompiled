; ossl_ec_GF2m_simple_is_on_curve @ 00a2a764
00a2a764	stp x26,x25,[sp, #-0x50]!
00a2a768	stp x24,x23,[sp, #0x10]
00a2a76c	stp x22,x21,[sp, #0x20]
00a2a770	stp x20,x19,[sp, #0x30]
00a2a774	stp x29,x30,[sp, #0x40]
00a2a778	add x29,sp,#0x40
00a2a77c	mov x19,x2
00a2a780	mov x22,x1
00a2a784	mov x21,x0
00a2a788	bl 0x00c3ae10
00a2a78c	cbz w0,0x00a2a798
00a2a790	mov w21,#0x1
00a2a794	b 0x00a2a8ac
00a2a798	ldr w8,[x22, #0x28]
00a2a79c	cbz w8,0x00a2a8a8
00a2a7a0	ldr x8,[x21]
00a2a7a4	mov x20,xzr
00a2a7a8	ldp x26,x25,[x8, #0xf8]
00a2a7ac	cbnz x19,0x00a2a7c0
00a2a7b0	bl 0x00c38a50
00a2a7b4	mov x19,x0
00a2a7b8	mov x20,x0
00a2a7bc	cbz x0,0x00a2a8a8
00a2a7c0	mov x0,x19
00a2a7c4	bl 0x00c38a90
00a2a7c8	mov x0,x19
00a2a7cc	bl 0x00c38a40
00a2a7d0	mov x24,x0
00a2a7d4	mov x0,x19
00a2a7d8	bl 0x00c38a40
00a2a7dc	cbz x0,0x00a2a890
00a2a7e0	ldr x1,[x22, #0x10]
00a2a7e4	ldr x2,[x21, #0x60]
00a2a7e8	mov x23,x0
00a2a7ec	bl 0x00c38b40
00a2a7f0	cbz w0,0x00a2a890
00a2a7f4	ldr x3,[x22, #0x10]
00a2a7f8	mov x0,x21
00a2a7fc	mov x1,x23
00a2a800	mov x2,x23
00a2a804	mov x4,x19
00a2a808	blr x26
00a2a80c	cbz w0,0x00a2a890
00a2a810	ldr x2,[x22, #0x18]
00a2a814	mov x0,x23
00a2a818	mov x1,x23
00a2a81c	bl 0x00c38b40
00a2a820	cbz w0,0x00a2a890
00a2a824	ldr x3,[x22, #0x10]
00a2a828	mov x0,x21
00a2a82c	mov x1,x23
00a2a830	mov x2,x23
00a2a834	mov x4,x19
00a2a838	blr x26
00a2a83c	cbz w0,0x00a2a890
00a2a840	ldr x2,[x21, #0x68]
00a2a844	mov x0,x23
00a2a848	mov x1,x23
00a2a84c	bl 0x00c38b40
00a2a850	cbz w0,0x00a2a890
00a2a854	ldr x2,[x22, #0x18]
00a2a858	mov x0,x21
00a2a85c	mov x1,x24
00a2a860	mov x3,x19
00a2a864	blr x25
00a2a868	cbz w0,0x00a2a890
00a2a86c	mov x0,x23
00a2a870	mov x1,x23
00a2a874	mov x2,x24
00a2a878	bl 0x00c38b40
00a2a87c	cbz w0,0x00a2a890
00a2a880	mov x0,x23
00a2a884	bl 0x00c369b0
00a2a888	mov w21,w0
00a2a88c	b 0x00a2a894
00a2a890	mov w21,#0xffffffff
00a2a894	mov x0,x19
00a2a898	bl 0x00c38a20
00a2a89c	mov x0,x20
00a2a8a0	bl 0x00c38a30
00a2a8a4	b 0x00a2a8ac
00a2a8a8	mov w21,#0xffffffff
00a2a8ac	mov w0,w21
00a2a8b0	ldp x29,x30,[sp, #0x40]
00a2a8b4	ldp x20,x19,[sp, #0x30]
00a2a8b8	ldp x22,x21,[sp, #0x20]
00a2a8bc	ldp x24,x23,[sp, #0x10]
00a2a8c0	ldp x26,x25,[sp], #0x50
00a2a8c4	ret
