; ossl_ecdsa_verify @ 00a36780
00a36780	sub sp,sp,#0x60
00a36784	stp x24,x23,[sp, #0x20]
00a36788	stp x22,x21,[sp, #0x30]
00a3678c	stp x20,x19,[sp, #0x40]
00a36790	stp x29,x30,[sp, #0x50]
00a36794	add x29,sp,#0x50
00a36798	mov x19,x5
00a3679c	mov w23,w4
00a367a0	mov x22,x3
00a367a4	mov w20,w2
00a367a8	mov x21,x1
00a367ac	stp xzr,x3,[sp, #0x8]
00a367b0	bl 0x00c3aa00
00a367b4	str x0,[sp, #0x18]
00a367b8	cbz x0,0x00a36820
00a367bc	sxtw x24,w23
00a367c0	add x0,sp,#0x18
00a367c4	add x1,sp,#0x10
00a367c8	mov x2,x24
00a367cc	bl 0x00c3aba0
00a367d0	cbz x0,0x00a367fc
00a367d4	ldr x0,[sp, #0x18]
00a367d8	add x1,sp,#0x8
00a367dc	bl 0x00c3abc0
00a367e0	cmp w0,w23
00a367e4	b.ne 0x00a367fc
00a367e8	ldr x1,[sp, #0x8]
00a367ec	mov x0,x22
00a367f0	mov x2,x24
00a367f4	bl 0x00c300b0
00a367f8	cbz w0,0x00a36840
00a367fc	mov w19,#0xffffffff
00a36800	ldr x0,[sp, #0x8]
00a36804	adrp x1,0x2c9000
00a36808	add x1,x1,#0x7a8
00a3680c	mov w2,#0x175
00a36810	bl 0x00c32310
00a36814	ldr x0,[sp, #0x18]
00a36818	bl 0x00c3a9e0
00a3681c	b 0x00a36824
00a36820	mov w19,#0xffffffff
00a36824	mov w0,w19
00a36828	ldp x29,x30,[sp, #0x50]
00a3682c	ldp x20,x19,[sp, #0x40]
00a36830	ldp x22,x21,[sp, #0x30]
00a36834	ldp x24,x23,[sp, #0x20]
00a36838	add sp,sp,#0x60
00a3683c	ret
00a36840	ldr x2,[sp, #0x18]
00a36844	mov x0,x21
00a36848	mov w1,w20
00a3684c	mov x3,x19
00a36850	bl 0x00c3b190
00a36854	mov w19,w0
00a36858	b 0x00a36800
