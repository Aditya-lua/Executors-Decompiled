; ossl_d2i_DHx_PUBKEY @ 00b1d804
00b1d804	sub sp,sp,#0x40
00b1d808	stp x22,x21,[sp, #0x10]
00b1d80c	stp x20,x19,[sp, #0x20]
00b1d810	stp x29,x30,[sp, #0x30]
00b1d814	ldr x8,[x1]
00b1d818	mov x20,x1
00b1d81c	mov x19,x0
00b1d820	add x1,sp,#0x8
00b1d824	mov w5,#0x1
00b1d828	mov x0,xzr
00b1d82c	mov x3,xzr
00b1d830	mov x4,xzr
00b1d834	add x29,sp,#0x30
00b1d838	str x8,[sp, #0x8]
00b1d83c	bl 0x00b1d214
00b1d840	cbz x0,0x00b1d890
00b1d844	mov x22,x0
00b1d848	bl 0x00c324b0
00b1d84c	cmp w0,#0x398
00b1d850	b.ne 0x00b1d888
00b1d854	mov x0,x22
00b1d858	bl 0x00c3d930
00b1d85c	mov x21,x0
00b1d860	mov x0,x22
00b1d864	bl 0x00c32450
00b1d868	cbz x21,0x00b1d894
00b1d86c	ldr x8,[sp, #0x8]
00b1d870	str x8,[x20]
00b1d874	cbz x19,0x00b1d894
00b1d878	ldr x0,[x19]
00b1d87c	bl 0x00c39ab0
00b1d880	str x21,[x19]
00b1d884	b 0x00b1d894
00b1d888	mov x0,x22
00b1d88c	bl 0x00c32450
00b1d890	mov x21,xzr
00b1d894	mov x0,x21
00b1d898	ldp x29,x30,[sp, #0x30]
00b1d89c	ldp x20,x19,[sp, #0x20]
00b1d8a0	ldp x22,x21,[sp, #0x10]
00b1d8a4	add sp,sp,#0x40
00b1d8a8	ret
